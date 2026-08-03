package fb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 extends java.util.LinkedHashMap {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3609g;

    public /* synthetic */ k1(int r1, float r2, boolean r3, int r4) {
            r0 = this;
            r0.f3609g = r4
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f3609g
            switch(r0) {
                case 0: goto L12;
                default: goto L5;
            }
        L5:
            boolean r0 = r2 instanceof java.lang.Long
            if (r0 != 0) goto Lb
            r2 = 0
            goto L11
        Lb:
            java.lang.Long r2 = (java.lang.Long) r2
            boolean r2 = super.containsKey(r2)
        L11:
            return r2
        L12:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 != 0) goto L18
            r2 = 0
            goto L1e
        L18:
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = super.containsKey(r2)
        L1e:
            return r2
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public /* bridge */ boolean containsValue(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f3609g
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            boolean r2 = super.containsValue(r2)
            return r2
        La:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 != 0) goto L10
            r2 = 0
            goto L16
        L10:
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = super.containsValue(r2)
        L16:
            return r2
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.lang.Object get(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f3609g
            switch(r0) {
                case 0: goto L12;
                default: goto L5;
            }
        L5:
            boolean r0 = r2 instanceof java.lang.Long
            if (r0 != 0) goto Lb
            r2 = 0
            goto L11
        Lb:
            java.lang.Long r2 = (java.lang.Long) r2
            java.lang.Object r2 = super.get(r2)
        L11:
            return r2
        L12:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 != 0) goto L18
            r2 = 0
            goto L20
        L18:
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = super.get(r2)
            java.lang.String r2 = (java.lang.String) r2
        L20:
            return r2
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
    public final /* bridge */ java.lang.Object getOrDefault(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f3609g
            switch(r0) {
                case 0: goto L11;
                default: goto L5;
            }
        L5:
            boolean r0 = r2 instanceof java.lang.Long
            if (r0 != 0) goto La
            goto L10
        La:
            java.lang.Long r2 = (java.lang.Long) r2
            java.lang.Object r3 = super.getOrDefault(r2, r3)
        L10:
            return r3
        L11:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 != 0) goto L16
            goto L21
        L16:
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = super.getOrDefault(r2, r3)
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
        L21:
            return r3
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.lang.Object remove(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f3609g
            switch(r0) {
                case 0: goto L12;
                default: goto L5;
            }
        L5:
            boolean r0 = r2 instanceof java.lang.Long
            if (r0 != 0) goto Lb
            r2 = 0
            goto L11
        Lb:
            java.lang.Long r2 = (java.lang.Long) r2
            java.lang.Object r2 = super.remove(r2)
        L11:
            return r2
        L12:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 != 0) goto L18
            r2 = 0
            goto L20
        L18:
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = super.remove(r2)
            java.lang.String r2 = (java.lang.String) r2
        L20:
            return r2
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.f3609g
            switch(r0) {
                case 0: goto L15;
                default: goto L5;
            }
        L5:
            boolean r0 = r3 instanceof java.lang.Long
            r1 = 0
            if (r0 != 0) goto Lb
            goto L14
        Lb:
            if (r4 != 0) goto Le
            goto L14
        Le:
            java.lang.Long r3 = (java.lang.Long) r3
            boolean r1 = super.remove(r3, r4)
        L14:
            return r1
        L15:
            boolean r0 = r3 instanceof java.lang.String
            r1 = 0
            if (r0 != 0) goto L1b
            goto L28
        L1b:
            boolean r0 = r4 instanceof java.lang.String
            if (r0 != 0) goto L20
            goto L28
        L20:
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = (java.lang.String) r4
            boolean r1 = super.remove(r3, r4)
        L28:
            return r1
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(java.util.Map.Entry r2) {
            r1 = this;
            int r2 = r1.f3609g
            switch(r2) {
                case 0: goto L11;
                default: goto L5;
            }
        L5:
            int r2 = super.size()
            r0 = 80
            if (r2 <= r0) goto Lf
            r2 = 1
            goto L10
        Lf:
            r2 = 0
        L10:
            return r2
        L11:
            int r2 = super.size()
            r0 = 2048(0x800, float:2.87E-42)
            if (r2 <= r0) goto L1b
            r2 = 1
            goto L1c
        L1b:
            r2 = 0
        L1c:
            return r2
    }
}
