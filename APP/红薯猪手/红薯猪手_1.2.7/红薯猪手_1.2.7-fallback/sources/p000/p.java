package p000;

/* JADX INFO: loaded from: classes.dex */
public final class p extends p000.o4 implements p000.g3<android.app.Activity, p000.vb> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.String f862;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final /* synthetic */ int f863;

    public p(java.lang.String r1, int r2) {
            r0 = this;
            r0.f862 = r1
            r0.f863 = r2
            r0.<init>()
            return
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // p000.g3
    /* JADX INFO: renamed from: ۥ۟۟ */
    public final p000.vb mo12(android.app.Activity r4) {
            r3 = this;
            android.app.Activity r4 = (android.app.Activity) r4
            r0 = 2
            byte[] r0 = new byte[r0]
            r0 = {x003c: FILL_ARRAY_DATA , data: [-14, -17} // fill-array
            r1 = 6
            byte[] r2 = new byte[r1]
            r2 = {x0042: FILL_ARRAY_DATA , data: [-101, -101, 25, -44, -117, 33} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r2)
            p000.h4.m189(r0, r4)
            android.content.Context r4 = p000.l3.f736
            if (r4 == 0) goto L27
            java.lang.String r0 = r3.f862
            int r1 = r3.f863
            android.widget.Toast r4 = android.widget.Toast.makeText(r4, r0, r1)
            r4.show()
            ۟.vb r4 = p000.vb.f1114
            return r4
        L27:
            r4 = 7
            byte[] r4 = new byte[r4]
            r4 = {x004a: FILL_ARRAY_DATA , data: [-121, -105, 15, -3, -9, 78, -112} // fill-array
            byte[] r0 = new byte[r1]
            r0 = {x0052: FILL_ARRAY_DATA , data: [-28, -8, 97, -119, -110, 54} // fill-array
            java.lang.String r4 = p000.oa.m332(r4, r0)
            p000.h4.m191(r4)
            r4 = 0
            throw r4
    }
}
