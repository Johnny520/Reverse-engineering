package p000;

/* JADX INFO: loaded from: classes.dex */
public final class v1 extends p000.o4 implements p000.g3<android.app.Activity, p000.vb> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.String f1090;

    public v1(java.lang.String r1) {
            r0 = this;
            r0.f1090 = r1
            r0.<init>()
            return
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // p000.g3
    /* JADX INFO: renamed from: ۥ۟۟ */
    public final p000.vb mo12(android.app.Activity r5) {
            r4 = this;
            android.app.Activity r5 = (android.app.Activity) r5
            r0 = 2
            byte[] r0 = new byte[r0]
            r0 = {x0050: FILL_ARRAY_DATA , data: [-15, -115} // fill-array
            r1 = 6
            byte[] r2 = new byte[r1]
            r2 = {x0056: FILL_ARRAY_DATA , data: [-104, -7, -59, 90, -19, -77} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r2)
            p000.h4.m189(r0, r5)
            int r5 = p000.o.f829
            java.lang.String r5 = r4.f1090
            r0 = 4
            byte[] r0 = new byte[r0]
            r0 = {x005e: FILL_ARRAY_DATA , data: [-22, 112, 67, -33} // fill-array
            byte[] r2 = new byte[r1]
            r2 = {x0064: FILL_ARRAY_DATA , data: [-102, 17, 55, -73, -14, -17} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r2)
            p000.h4.m189(r0, r5)
            android.content.Context r0 = p000.l3.f736
            r2 = 0
            if (r0 == 0) goto L3c
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]
            r3 = 0
            r1[r3] = r5
            android.media.MediaScannerConnection.scanFile(r0, r1, r2, r2)
            ۟.vb r5 = p000.vb.f1114
            return r5
        L3c:
            r5 = 7
            byte[] r5 = new byte[r5]
            r5 = {x006c: FILL_ARRAY_DATA , data: [-121, -105, 15, -3, -9, 78, -112} // fill-array
            byte[] r0 = new byte[r1]
            r0 = {x0074: FILL_ARRAY_DATA , data: [-28, -8, 97, -119, -110, 54} // fill-array
            java.lang.String r5 = p000.oa.m332(r5, r0)
            p000.h4.m191(r5)
            throw r2
    }
}
