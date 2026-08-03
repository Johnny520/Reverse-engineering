package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۦۥۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3486 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public java.util.HashMap<java.lang.Object, java.util.HashMap<java.lang.String, float[]>> f10979;

    public C3486() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f10979 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public float m14319(java.lang.Object r3, java.lang.String r4, int r5) {
            r2 = this;
            java.util.HashMap<java.lang.Object, java.util.HashMap<java.lang.String, float[]>> r0 = r2.f10979
            boolean r0 = r0.containsKey(r3)
            r1 = 2143289344(0x7fc00000, float:NaN)
            if (r0 != 0) goto Lb
            return r1
        Lb:
            java.util.HashMap<java.lang.Object, java.util.HashMap<java.lang.String, float[]>> r0 = r2.f10979
            java.lang.Object r3 = r0.get(r3)
            java.util.HashMap r3 = (java.util.HashMap) r3
            boolean r0 = r3.containsKey(r4)
            if (r0 != 0) goto L1a
            return r1
        L1a:
            java.lang.Object r3 = r3.get(r4)
            float[] r3 = (float[]) r3
            int r4 = r3.length
            if (r4 <= r5) goto L26
            r3 = r3[r5]
            return r3
        L26:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void m14320(java.lang.Object r3, java.lang.String r4, int r5, float r6) {
            r2 = this;
            java.util.HashMap<java.lang.Object, java.util.HashMap<java.lang.String, float[]>> r0 = r2.f10979
            boolean r0 = r0.containsKey(r3)
            if (r0 != 0) goto L1c
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r1 = r5 + 1
            float[] r1 = new float[r1]
            r1[r5] = r6
            r0.put(r4, r1)
            java.util.HashMap<java.lang.Object, java.util.HashMap<java.lang.String, float[]>> r4 = r2.f10979
            r4.put(r3, r0)
            goto L4d
        L1c:
            java.util.HashMap<java.lang.Object, java.util.HashMap<java.lang.String, float[]>> r0 = r2.f10979
            java.lang.Object r0 = r0.get(r3)
            java.util.HashMap r0 = (java.util.HashMap) r0
            boolean r1 = r0.containsKey(r4)
            if (r1 != 0) goto L39
            int r1 = r5 + 1
            float[] r1 = new float[r1]
            r1[r5] = r6
            r0.put(r4, r1)
            java.util.HashMap<java.lang.Object, java.util.HashMap<java.lang.String, float[]>> r4 = r2.f10979
            r4.put(r3, r0)
            goto L4d
        L39:
            java.lang.Object r3 = r0.get(r4)
            float[] r3 = (float[]) r3
            int r1 = r3.length
            if (r1 > r5) goto L48
            int r1 = r5 + 1
            float[] r3 = java.util.Arrays.copyOf(r3, r1)
        L48:
            r3[r5] = r6
            r0.put(r4, r3)
        L4d:
            return
    }
}
