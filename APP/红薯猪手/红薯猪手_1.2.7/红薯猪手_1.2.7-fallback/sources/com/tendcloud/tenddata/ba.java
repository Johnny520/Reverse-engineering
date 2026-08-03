package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class ba {
    private int a;
    private long b;
    private java.util.List<com.tendcloud.tenddata.ax> c;
    private java.util.Map<java.lang.String, com.tendcloud.tenddata.ax> d;

    public ba() {
            r0 = this;
            r0.<init>()
            return
    }

    public int a() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    public java.util.Map<java.lang.String, com.tendcloud.tenddata.ax> a(boolean r4) {
            r3 = this;
            java.util.Map<java.lang.String, com.tendcloud.tenddata.ax> r0 = r3.d
            if (r0 == 0) goto L6
            if (r4 == 0) goto L29
        L6:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r3.d = r4
            java.util.List<com.tendcloud.tenddata.ax> r4 = r3.c
            java.util.Iterator r4 = r4.iterator()
        L13:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L29
            java.lang.Object r0 = r4.next()
            com.tendcloud.tenddata.ax r0 = (com.tendcloud.tenddata.ax) r0
            java.util.Map<java.lang.String, com.tendcloud.tenddata.ax> r1 = r3.d
            java.lang.String r2 = r0.b()
            r1.put(r2, r0)
            goto L13
        L29:
            java.util.Map<java.lang.String, com.tendcloud.tenddata.ax> r4 = r3.d
            return r4
    }

    public long b() {
            r2 = this;
            long r0 = r2.b
            return r0
    }

    public java.util.List<com.tendcloud.tenddata.ax> c() {
            r1 = this;
            java.util.List<com.tendcloud.tenddata.ax> r0 = r1.c
            return r0
    }

    public com.tendcloud.tenddata.ba d() {
            r4 = this;
            com.tendcloud.tenddata.ba r0 = new com.tendcloud.tenddata.ba
            r0.<init>()
            int r1 = r4.a
            r0.setTimestamp(r1)
            long r1 = r4.b
            r0.setPoiId(r1)
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            java.util.List<com.tendcloud.tenddata.ax> r2 = r4.c
            java.util.Iterator r2 = r2.iterator()
        L1a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2e
            java.lang.Object r3 = r2.next()
            com.tendcloud.tenddata.ax r3 = (com.tendcloud.tenddata.ax) r3
            com.tendcloud.tenddata.ax r3 = r3.f()
            r1.add(r3)
            goto L1a
        L2e:
            r0.setBsslist(r1)
            return r0
    }

    public void setBsslist(java.util.List<com.tendcloud.tenddata.ax> r1) {
            r0 = this;
            r0.c = r1
            return
    }

    public void setPoiId(long r1) {
            r0 = this;
            r0.b = r1
            return
    }

    public void setTimestamp(int r1) {
            r0 = this;
            r0.a = r1
            return
    }
}
