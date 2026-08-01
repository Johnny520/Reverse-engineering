package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
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
            r0 = this;
            java.util.Map r0 = r0.map
            r0.clear()
            return
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object r1) {
            r0 = this;
            java.util.Map r0 = r0.map
            boolean r0 = r0.containsKey(r1)
            return r0
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object r1) {
            r0 = this;
            java.util.Map r0 = r0.map
            boolean r0 = r0.containsValue(r1)
            return r0
    }

    @Override // java.util.Map
    public java.util.Set entrySet() {
            r0 = this;
            java.util.Map r0 = r0.map
            java.util.Set r0 = r0.entrySet()
            return r0
    }

    @Override // java.util.Map
    public java.lang.Object get(java.lang.Object r1) {
            r0 = this;
            java.util.Map r0 = r0.map
            java.lang.Object r0 = r0.get(r1)
            return r0
    }

    public java.util.Map getMap() {
            r0 = this;
            java.util.Map r0 = r0.map
            return r0
    }

    @Override // java.util.Map
    public boolean isEmpty() {
            r0 = this;
            java.util.Map r0 = r0.map
            boolean r0 = r0.isEmpty()
            return r0
    }

    public boolean isStrict() {
            r0 = this;
            boolean r0 = r0.strict
            return r0
    }

    @Override // java.util.Map
    public java.util.Set keySet() {
            r0 = this;
            java.util.Map r0 = r0.map
            java.util.Set r0 = r0.keySet()
            return r0
    }

    @Override // java.util.Map
    public java.lang.Object put(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.util.Map r0 = r0.map
            java.lang.Object r0 = r0.put(r1, r2)
            return r0
    }

    @Override // java.util.Map
    public void putAll(java.util.Map r1) {
            r0 = this;
            java.util.Map r0 = r0.map
            r0.putAll(r1)
            return
    }

    @Override // java.util.Map
    public java.lang.Object remove(java.lang.Object r1) {
            r0 = this;
            java.util.Map r0 = r0.map
            java.lang.Object r0 = r0.remove(r1)
            return r0
    }

    @Override // java.util.Map
    public int size() {
            r0 = this;
            java.util.Map r0 = r0.map
            int r0 = r0.size()
            return r0
    }

    @Override // java.util.Map
    public java.util.Collection values() {
            r0 = this;
            java.util.Map r0 = r0.map
            java.util.Collection r0 = r0.values()
            return r0
    }
}
