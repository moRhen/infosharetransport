package dataStructure;

import com.fasterxml.jackson.annotation.JsonAnySetter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WholeFile {

    private List<Map<String, Block>> data = new ArrayList<>();

    @JsonAnySetter
    private void setDynamicProperty(String name, Block block) {
        Map<String, Block> map = new HashMap<>();
        map.put(name, block);
        data.add(map);
    }

    public List<Map<String, Block>> getData() {
        return data;
    }

    private void setData(List<Map<String, Block>> data) {
        this.data = data;
    }
}