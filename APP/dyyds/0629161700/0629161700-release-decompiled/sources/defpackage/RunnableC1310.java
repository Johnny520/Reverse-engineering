package defpackage;

/* JADX INFO: renamed from: ᛷᛷᛲᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1310 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f5781;

    public /* synthetic */ RunnableC1310(int r1) {
            r0 = this;
            r0.f5781 = r1
            r0.<init>()
            return
    }

    public /* synthetic */ RunnableC1310(defpackage.C0394 r1) {
            r0 = this;
            r1 = 3
            r0.f5781 = r1
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    private final void m2438() {
            r0 = this;
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            int r2 = r2.f5781
            switch(r2) {
                case 0: goto L20;
                case 1: goto L13;
                case 2: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            r0 = -140634693738030(0xffff8017ef0961d2, double:NaN)
            java.lang.String r2 = "读取图片失败"
            defpackage.AbstractC0209.m764(r2)
            return
        L13:
            r0 = -103418802118190(0xffffa1f0ef0961d2, double:NaN)
            java.lang.String r2 = "读取文件失败"
            defpackage.AbstractC0209.m764(r2)
            return
        L20:
            ᛴᲇᛸᛶ r2 = defpackage.C1654.f7360
            if (r2 == 0) goto L27
            r2.mo1032()
        L27:
            r0 = -103384442379822(0xffffa1f8ef0961d2, double:NaN)
            java.lang.String r2 = "气泡文件已更新"
            defpackage.AbstractC0209.m764(r2)
            return
    }
}
