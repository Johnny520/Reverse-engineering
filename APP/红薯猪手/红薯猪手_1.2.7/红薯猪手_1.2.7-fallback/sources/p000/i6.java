package p000;

/* JADX INFO: loaded from: classes.dex */
public final class i6 extends p000.o4 implements p000.g3<org.json.JSONObject, java.lang.Object> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final /* synthetic */ p000.f6 f493;

    public i6(p000.f6 r1) {
            r0 = this;
            r0.f493 = r1
            r0.<init>()
            return
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // p000.g3
    /* JADX INFO: renamed from: ۥ۟۟ */
    public final java.lang.Object mo12(org.json.JSONObject r7) {
            r6 = this;
            org.json.JSONObject r7 = (org.json.JSONObject) r7
            r0 = 2
            byte[] r0 = new byte[r0]
            r0 = {x0088: FILL_ARRAY_DATA , data: [94, 123} // fill-array
            r1 = 6
            byte[] r2 = new byte[r1]
            r2 = {x008e: FILL_ARRAY_DATA , data: [55, 15, -113, 79, 119, -5} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r2)
            p000.h4.m189(r0, r7)
            r0 = 4
            byte[] r0 = new byte[r0]
            r0 = {x0096: FILL_ARRAY_DATA , data: [-116, -11, -41, 79} // fill-array
            byte[] r2 = new byte[r1]
            r2 = {x009c: FILL_ARRAY_DATA , data: [-24, -108, -93, 46, -15, 77} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r2)
            org.json.JSONObject r0 = r7.optJSONObject(r0)
            if (r0 == 0) goto L87
            ۟.f6 r2 = r6.f493
            boolean r3 = r2.f356
            r4 = 7
            if (r3 == 0) goto L55
            r3 = 8
            byte[] r3 = new byte[r3]
            r3 = {x00a4: FILL_ARRAY_DATA , data: [-25, -61, 35, 118, -87, 47, -21, -56} // fill-array
            byte[] r5 = new byte[r1]
            r5 = {x00ac: FILL_ARRAY_DATA , data: [-123, -81, 76, 21, -62, 70} // fill-array
            java.lang.String r3 = p000.oa.m332(r3, r5)
            r0.remove(r3)
            byte[] r3 = new byte[r4]
            r3 = {x00b4: FILL_ARRAY_DATA , data: [-50, -33, 94, 82, -79, 37, -56} // fill-array
            byte[] r5 = new byte[r1]
            r5 = {x00bc: FILL_ARRAY_DATA , data: [-84, -77, 49, 49, -38, 64} // fill-array
            java.lang.String r3 = p000.oa.m332(r3, r5)
            r0.remove(r3)
        L55:
            boolean r2 = r2.f357
            if (r2 == 0) goto L87
            byte[] r2 = new byte[r1]
            r2 = {x00c4: FILL_ARRAY_DATA , data: [-75, 82, 100, 111, 56, -55} // fill-array
            byte[] r1 = new byte[r1]
            r1 = {x00cc: FILL_ARRAY_DATA , data: [-64, 33, 1, 29, 81, -83} // fill-array
            java.lang.String r1 = p000.oa.m332(r2, r1)
            java.lang.String r1 = r0.optString(r1)
            p000.h4.m186(r1)
            int r2 = r1.length()
            if (r2 <= 0) goto L76
            r2 = 1
            goto L77
        L76:
            r2 = 0
        L77:
            if (r2 == 0) goto L87
            ۟.kb r2 = p000.q.f899
            java.util.concurrent.ExecutorService r2 = ۟.q.c.m346()
            ۟.ib r3 = new ۟.ib
            r3.<init>(r1, r0, r4)
            r2.execute(r3)
        L87:
            return r7
    }
}
