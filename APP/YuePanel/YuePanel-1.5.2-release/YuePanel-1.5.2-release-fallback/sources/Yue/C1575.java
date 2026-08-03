package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۧۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C1575 {
    public C1575() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static android.content.Context m7743(@Yue.InterfaceC4410 android.content.ContentProvider r1) {
            android.content.Context r1 = r1.getContext()
            if (r1 == 0) goto L7
            return r1
        L7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot find context from the provider."
            r1.<init>(r0)
            throw r1
    }
}
