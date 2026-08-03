package p000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wa implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final /* synthetic */ int f1149;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final /* synthetic */ p000.ya f1150;

    public /* synthetic */ wa(p000.ya r1, int r2) {
            r0 = this;
            r0.f1149 = r2
            r0.f1150 = r1
            r0.<init>()
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r4) {
            r3 = this;
            int r4 = r3.f1149
            r0 = 6
            switch(r4) {
                case 0: goto L7;
                default: goto L6;
            }
        L6:
            goto L1e
        L7:
            ۟.ya r4 = r3.f1150
            byte[] r1 = new byte[r0]
            r1 = {x0058: FILL_ARRAY_DATA , data: [34, -44, -82, 13, 72, 113} // fill-array
            byte[] r0 = new byte[r0]
            r0 = {x0060: FILL_ARRAY_DATA , data: [86, -68, -57, 126, 108, 65} // fill-array
            java.lang.String r0 = p000.oa.m332(r1, r0)
            p000.h4.m189(r0, r4)
            r4.dismiss()
            return
        L1e:
            ۟.ya r4 = r3.f1150
            byte[] r1 = new byte[r0]
            r1 = {x0068: FILL_ARRAY_DATA , data: [-58, -79, -5, 28, 13, 125} // fill-array
            byte[] r2 = new byte[r0]
            r2 = {x0070: FILL_ARRAY_DATA , data: [-78, -39, -110, 111, 41, 77} // fill-array
            java.lang.String r1 = p000.oa.m332(r1, r2)
            p000.h4.m189(r1, r4)
            r1 = 11
            byte[] r1 = new byte[r1]
            r1 = {x0078: FILL_ARRAY_DATA , data: [17, 94, -108, 26, -56, -50, 16, 124, -105, 24, -50} // fill-array
            byte[] r0 = new byte[r0]
            r0 = {x0082: FILL_ARRAY_DATA , data: [124, 29, -11, 116, -85, -85} // fill-array
            java.lang.String r0 = p000.oa.m332(r1, r0)
            java.lang.Boolean r0 = p000.r3.m362(r4, r0)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = p000.h4.m185(r0, r1)
            if (r0 == 0) goto L50
            r4.dismiss()
        L50:
            return
    }
}
