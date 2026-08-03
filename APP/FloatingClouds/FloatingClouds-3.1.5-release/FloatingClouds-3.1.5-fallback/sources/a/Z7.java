package a;

/* JADX INFO: loaded from: classes.dex */
public final class Z7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f371a;
    public java.lang.Object b;

    public Z7(int r1, int r2) {
            r0 = this;
            r0.<init>()
            int[] r1 = new int[]{r1, r2}
            r0.f371a = r1
            r1 = 2
            float[] r1 = new float[r1]
            r1 = {x0012: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            r0.b = r1
            return
    }

    public Z7(int r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            int[] r1 = new int[]{r1, r2, r3}
            r0.f371a = r1
            r1 = 3
            float[] r1 = new float[r1]
            r1 = {x0012: FILL_ARRAY_DATA , data: [0, 1056964608, 1065353216} // fill-array
            r0.b = r1
            return
    }

    public Z7(java.util.ArrayList r5, java.util.ArrayList r6) {
            r4 = this;
            r4.<init>()
            int r0 = r5.size()
            int[] r1 = new int[r0]
            r4.f371a = r1
            float[] r1 = new float[r0]
            r4.b = r1
            r1 = 0
        L10:
            if (r1 >= r0) goto L35
            java.lang.Object r2 = r4.f371a
            int[] r2 = (int[]) r2
            java.lang.Object r3 = r5.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2[r1] = r3
            java.lang.Object r2 = r4.b
            float[] r2 = (float[]) r2
            java.lang.Object r3 = r6.get(r1)
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            r2[r1] = r3
            int r1 = r1 + 1
            goto L10
        L35:
            return
    }

    public Z7(java.util.regex.Matcher r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.f371a = r1
            a.ya r1 = new a.ya
            r1.<init>(r0)
            return
    }
}
