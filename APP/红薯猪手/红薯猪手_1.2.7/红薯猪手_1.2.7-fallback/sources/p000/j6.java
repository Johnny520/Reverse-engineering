package p000;

/* JADX INFO: loaded from: classes.dex */
public final class j6 extends p000.o4 implements p000.g3<org.json.JSONObject, java.lang.Object> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final p000.j6 f520 = null;

    static {
            ۟.j6 r0 = new ۟.j6
            r0.<init>()
            p000.j6.f520 = r0
            return
    }

    public j6() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // p000.g3
    /* JADX INFO: renamed from: ۥ۟۟ */
    public final java.lang.Object mo12(org.json.JSONObject r4) {
            r3 = this;
            org.json.JSONObject r4 = (org.json.JSONObject) r4
            r0 = 2
            byte[] r0 = new byte[r0]
            r0 = {x0046: FILL_ARRAY_DATA , data: [67, 47} // fill-array
            r1 = 6
            byte[] r2 = new byte[r1]
            r2 = {x004c: FILL_ARRAY_DATA , data: [42, 91, -123, 72, 41, -84} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r2)
            p000.h4.m189(r0, r4)
            r0 = 4
            byte[] r0 = new byte[r0]
            r0 = {x0054: FILL_ARRAY_DATA , data: [28, 117, -52, -50} // fill-array
            byte[] r2 = new byte[r1]
            r2 = {x005a: FILL_ARRAY_DATA , data: [120, 20, -72, -81, 54, 28} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r2)
            org.json.JSONObject r0 = r4.optJSONObject(r0)
            if (r0 == 0) goto L3f
            r2 = 8
            byte[] r2 = new byte[r2]
            r2 = {x0062: FILL_ARRAY_DATA , data: [108, -42, 94, 53, 39, 25, 123, -54} // fill-array
            byte[] r1 = new byte[r1]
            r1 = {x006a: FILL_ARRAY_DATA , data: [15, -71, 51, 88, 66, 119} // fill-array
            java.lang.String r1 = p000.oa.m332(r2, r1)
            org.json.JSONArray r0 = r0.optJSONArray(r1)
            goto L40
        L3f:
            r0 = 0
        L40:
            boolean r1 = p000.y2.f1188
            ۟.y2.a.m467(r0)
            return r4
    }
}
