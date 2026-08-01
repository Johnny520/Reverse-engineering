package defpackage;

/* JADX INFO: renamed from: ᛴᲁᲇᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC0773 implements java.util.concurrent.ThreadFactory {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f3607;

    public /* synthetic */ ThreadFactoryC0773(int r1) {
            r0 = this;
            r0.f3607 = r1
            r0.<init>()
            return
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable r3) {
            r2 = this;
            int r2 = r2.f3607
            switch(r2) {
                case 0: goto L13;
                case 1: goto Ld;
                default: goto L5;
            }
        L5:
            ᛳᛲᲇᛸ r2 = new ᛳᛲᲇᛸ
            java.lang.String r0 = "fonts-androidx"
            r2.<init>(r3, r0)
            return r2
        Ld:
            ᛳᛲᲇᛸ r2 = new ᛳᛲᲇᛸ
            r2.<init>(r3)
            return r2
        L13:
            java.lang.Thread r2 = new java.lang.Thread
            ᛳᛳᛵᛲ r0 = new ᛳᛳᛵᛲ
            r1 = 0
            r0.<init>(r1, r3)
            java.lang.String r3 = "glide-active-resources"
            r2.<init>(r0, r3)
            return r2
    }
}
