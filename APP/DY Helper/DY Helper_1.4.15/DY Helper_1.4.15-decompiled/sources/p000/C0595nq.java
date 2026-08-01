package p000;

/* JADX INFO: renamed from: nq */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0595nq extends java.util.LinkedHashMap {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f7705;

    public /* synthetic */ C0595nq(int r1, float r2, boolean r3, int r4) {
            r0 = this;
            r0.f7705 = r4
            r0.<init>(r1, r2, r3)
            return
    }

    public C0595nq(p000.y21 r3) {
            r2 = this;
            r3 = 3
            r2.f7705 = r3
            r3 = 1061158912(0x3f400000, float:0.75)
            r0 = 1
            r1 = 500(0x1f4, float:7.0E-43)
            r2.<init>(r1, r3, r0)
            return
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public /* bridge */ boolean containsKey(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f7705
            switch(r0) {
                case 0: goto L24;
                case 1: goto L17;
                case 2: goto La;
                default: goto L5;
            }
        L5:
            boolean r1 = super.containsKey(r2)
            return r1
        La:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 != 0) goto L10
            r1 = 0
            goto L16
        L10:
            java.lang.String r2 = (java.lang.String) r2
            boolean r1 = super.containsKey(r2)
        L16:
            return r1
        L17:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 != 0) goto L1d
            r1 = 0
            goto L23
        L1d:
            java.lang.String r2 = (java.lang.String) r2
            boolean r1 = super.containsKey(r2)
        L23:
            return r1
        L24:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 != 0) goto L2a
            r1 = 0
            goto L30
        L2a:
            java.lang.String r2 = (java.lang.String) r2
            boolean r1 = super.containsKey(r2)
        L30:
            return r1
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public /* bridge */ boolean containsValue(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f7705
            switch(r0) {
                case 0: goto L24;
                case 1: goto L17;
                case 2: goto La;
                default: goto L5;
            }
        L5:
            boolean r1 = super.containsValue(r2)
            return r1
        La:
            boolean r0 = r2 instanceof android.graphics.Bitmap
            if (r0 != 0) goto L10
            r1 = 0
            goto L16
        L10:
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            boolean r1 = super.containsValue(r2)
        L16:
            return r1
        L17:
            boolean r0 = r2 instanceof android.graphics.Bitmap
            if (r0 != 0) goto L1d
            r1 = 0
            goto L23
        L1d:
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            boolean r1 = super.containsValue(r2)
        L23:
            return r1
        L24:
            boolean r0 = r2 instanceof p000.C0404iq
            if (r0 != 0) goto L2a
            r1 = 0
            goto L30
        L2a:
            iq r2 = (p000.C0404iq) r2
            boolean r1 = super.containsValue(r2)
        L30:
            return r1
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public /* bridge */ java.lang.Object get(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f7705
            switch(r0) {
                case 0: goto L28;
                case 1: goto L19;
                case 2: goto La;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = super.get(r2)
            return r1
        La:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 != 0) goto L10
            r1 = 0
            goto L18
        L10:
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = super.get(r2)
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
        L18:
            return r1
        L19:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 != 0) goto L1f
            r1 = 0
            goto L27
        L1f:
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = super.get(r2)
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
        L27:
            return r1
        L28:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 != 0) goto L2e
            r1 = 0
            goto L36
        L2e:
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = super.get(r2)
            iq r1 = (p000.C0404iq) r1
        L36:
            return r1
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
    public /* bridge */ java.lang.Object getOrDefault(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f7705
            switch(r0) {
                case 0: goto L2c;
                case 1: goto L1b;
                case 2: goto La;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = super.getOrDefault(r2, r3)
            return r1
        La:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 != 0) goto Lf
            goto L1a
        Lf:
            java.lang.String r2 = (java.lang.String) r2
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            java.lang.Object r1 = super.getOrDefault(r2, r3)
            r3 = r1
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
        L1a:
            return r3
        L1b:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 != 0) goto L20
            goto L2b
        L20:
            java.lang.String r2 = (java.lang.String) r2
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            java.lang.Object r1 = super.getOrDefault(r2, r3)
            r3 = r1
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
        L2b:
            return r3
        L2c:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 != 0) goto L31
            goto L3c
        L31:
            java.lang.String r2 = (java.lang.String) r2
            iq r3 = (p000.C0404iq) r3
            java.lang.Object r1 = super.getOrDefault(r2, r3)
            r3 = r1
            iq r3 = (p000.C0404iq) r3
        L3c:
            return r3
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public /* bridge */ java.lang.Object remove(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f7705
            switch(r0) {
                case 0: goto L28;
                case 1: goto L19;
                case 2: goto La;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = super.remove(r2)
            return r1
        La:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 != 0) goto L10
            r1 = 0
            goto L18
        L10:
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = super.remove(r2)
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
        L18:
            return r1
        L19:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 != 0) goto L1f
            r1 = 0
            goto L27
        L1f:
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = super.remove(r2)
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
        L27:
            return r1
        L28:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 != 0) goto L2e
            r1 = 0
            goto L36
        L2e:
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = super.remove(r2)
            iq r1 = (p000.C0404iq) r1
        L36:
            return r1
    }

    @Override // java.util.HashMap, java.util.Map
    public /* bridge */ boolean remove(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.f7705
            switch(r0) {
                case 0: goto L32;
                case 1: goto L1e;
                case 2: goto La;
                default: goto L5;
            }
        L5:
            boolean r2 = super.remove(r3, r4)
            return r2
        La:
            boolean r0 = r3 instanceof java.lang.String
            r1 = 0
            if (r0 != 0) goto L10
            goto L1d
        L10:
            boolean r0 = r4 instanceof android.graphics.Bitmap
            if (r0 != 0) goto L15
            goto L1d
        L15:
            java.lang.String r3 = (java.lang.String) r3
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            boolean r1 = super.remove(r3, r4)
        L1d:
            return r1
        L1e:
            boolean r0 = r3 instanceof java.lang.String
            r1 = 0
            if (r0 != 0) goto L24
            goto L31
        L24:
            boolean r0 = r4 instanceof android.graphics.Bitmap
            if (r0 != 0) goto L29
            goto L31
        L29:
            java.lang.String r3 = (java.lang.String) r3
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            boolean r1 = super.remove(r3, r4)
        L31:
            return r1
        L32:
            boolean r0 = r3 instanceof java.lang.String
            r1 = 0
            if (r0 != 0) goto L38
            goto L45
        L38:
            boolean r0 = r4 instanceof p000.C0404iq
            if (r0 != 0) goto L3d
            goto L45
        L3d:
            java.lang.String r3 = (java.lang.String) r3
            iq r4 = (p000.C0404iq) r4
            boolean r1 = super.remove(r3, r4)
        L45:
            return r1
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(java.util.Map.Entry r1) {
            r0 = this;
            int r1 = r0.f7705
            switch(r1) {
                case 0: goto L29;
                case 1: goto L1d;
                case 2: goto L11;
                default: goto L5;
            }
        L5:
            int r0 = super.size()
            r1 = 500(0x1f4, float:7.0E-43)
            if (r0 <= r1) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
        L11:
            int r0 = super.size()
            r1 = 50
            if (r0 <= r1) goto L1b
            r0 = 1
            goto L1c
        L1b:
            r0 = 0
        L1c:
            return r0
        L1d:
            int r0 = super.size()
            r1 = 60
            if (r0 <= r1) goto L27
            r0 = 1
            goto L28
        L27:
            r0 = 0
        L28:
            return r0
        L29:
            int r0 = super.size()
            r1 = 32
            if (r0 <= r1) goto L33
            r0 = 1
            goto L34
        L33:
            r0 = 0
        L34:
            return r0
    }
}
