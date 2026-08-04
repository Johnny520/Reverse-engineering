package org.simpleframework.xml.strategy;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
class Allocate implements Value {
    private String key;
    private Map map;
    private Value value;

    public Allocate(Value value, Map map, String str) {
        this.value = value;
        this.map = map;
        this.key = str;
    }

    @Override // org.simpleframework.xml.strategy.Value
    public int getLength() {
        return this.value.getLength();
    }

    @Override // org.simpleframework.xml.strategy.Value
    public Class getType() {
        return this.value.getType();
    }

    @Override // org.simpleframework.xml.strategy.Value
    public Object getValue() {
        return this.map.get(this.key);
    }

    @Override // org.simpleframework.xml.strategy.Value
    public boolean isReference() {
        return false;
    }

    @Override // org.simpleframework.xml.strategy.Value
    public void setValue(Object obj) {
        String str = this.key;
        if (str != null) {
            this.map.put(str, obj);
        }
        this.value.setValue(obj);
    }
}
