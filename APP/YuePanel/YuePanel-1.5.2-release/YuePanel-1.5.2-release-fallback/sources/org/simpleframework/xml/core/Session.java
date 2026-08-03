package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
final class Session implements java.util.Map {
    private final java.util.Map map;
    private final boolean strict;

    public Session() {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            return
    }

    public Session(boolean r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.map = r0
            r1.strict = r2
            return
    }

    @Override // java.util.Map
    public void clear() {
            r1 = this;
            java.util.Map r0 = r1.map
            r0.clear()
            return
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object r2) {
            r1 = this;
            java.util.Map r0 = r1.map
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object r2) {
            r1 = this;
            java.util.Map r0 = r1.map
            boolean r2 = r0.containsValue(r2)
            return r2
    }

    @Override // java.util.Map
    public java.util.Set entrySet() {
            r1 = this;
            java.util.Map r0 = r1.map
            java.util.Set r0 = r0.entrySet()
            return r0
    }

    @Override // java.util.Map
    public java.lang.Object get(java.lang.Object r2) {
            r1 = this;
            java.util.Map r0 = r1.map
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    public java.util.Map getMap() {
            r1 = this;
            java.util.Map r0 = r1.map
            return r0
    }

    @Override // java.util.Map
    public boolean isEmpty() {
            r1 = this;
            java.util.Map r0 = r1.map
            boolean r0 = r0.isEmpty()
            return r0
    }

    public boolean isStrict() {
            r1 = this;
            boolean r0 = r1.strict
            return r0
    }

    @Override // java.util.Map
    public java.util.Set keySet() {
            r1 = this;
            java.util.Map r0 = r1.map
            java.util.Set r0 = r0.keySet()
            return r0
    }

    @Override // java.util.Map
    public java.lang.Object put(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            java.util.Map r0 = r1.map
            java.lang.Object r2 = r0.put(r2, r3)
            return r2
    }

    @Override // java.util.Map
    public void putAll(java.util.Map r2) {
            r1 = this;
            java.util.Map r0 = r1.map
            r0.putAll(r2)
            return
    }

    @Override // java.util.Map
    public java.lang.Object remove(java.lang.Object r2) {
            r1 = this;
            java.util.Map r0 = r1.map
            java.lang.Object r2 = r0.remove(r2)
            return r2
    }

    @Override // java.util.Map
    public int size() {
            r1 = this;
            java.util.Map r0 = r1.map
            int r0 = r0.size()
            return r0
    }

    @Override // java.util.Map
    public java.util.Collection values() {
            r1 = this;
            java.util.Map r0 = r1.map
            java.util.Collection r0 = r0.values()
            return r0
    }
}
