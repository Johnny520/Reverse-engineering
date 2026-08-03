package p000;

/* JADX INFO: loaded from: classes.dex */
public final class a2 extends p000.o4 implements p000.g3<android.app.Activity, p000.vb> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final /* synthetic */ java.util.List<p000.j3> f86;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final /* synthetic */ android.widget.LinearLayout f87;

    public a2(java.util.List<p000.j3> r1, android.widget.LinearLayout r2) {
            r0 = this;
            r0.f86 = r1
            r0.f87 = r2
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
            r0 = {x005a: FILL_ARRAY_DATA , data: [59, -89} // fill-array
            r1 = 6
            byte[] r2 = new byte[r1]
            r2 = {x0060: FILL_ARRAY_DATA , data: [82, -45, -2, -126, -30, -126} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r2)
            p000.h4.m189(r0, r4)
            java.util.List<۟.j3> r4 = r3.f86
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L34
            int r4 = p000.o.f829
            r4 = 24
            byte[] r4 = new byte[r4]
            r4 = {x0068: FILL_ARRAY_DATA , data: [-49, 32, -27, -101, 114, 100, -63, 18, -10, -105, 121, 122, -52, 50, -49, -101, 97, 102, -51, 4, -13, -103, 71, 110} // fill-array
            byte[] r0 = new byte[r1]
            r0 = {x0078: FILL_ARRAY_DATA , data: [41, -68, 73, 126, -18, -44} // fill-array
            java.lang.String r4 = p000.oa.m332(r4, r0)
            r0 = 0
            p000.o.m318(r0, r4)
            goto L57
        L34:
            ۟.ac r4 = new ۟.ac
            android.widget.LinearLayout r0 = r3.f87
            android.content.Context r0 = r0.getContext()
            r2 = 15
            byte[] r2 = new byte[r2]
            r2 = {x0080: FILL_ARRAY_DATA , data: [18, 95, -74, 10, -120, 5, 1, 95, -70, 61, -49, 69, 91, 20, -21} // fill-array
            byte[] r1 = new byte[r1]
            r1 = {x008c: FILL_ARRAY_DATA , data: [117, 58, -62, 73, -25, 107} // fill-array
            java.lang.String r1 = p000.oa.m332(r2, r1)
            p000.h4.m188(r1, r0)
            java.util.List<۟.j3> r1 = r3.f86
            r4.<init>(r0, r1)
            r4.show()
        L57:
            ۟.vb r4 = p000.vb.f1114
            return r4
    }
}
