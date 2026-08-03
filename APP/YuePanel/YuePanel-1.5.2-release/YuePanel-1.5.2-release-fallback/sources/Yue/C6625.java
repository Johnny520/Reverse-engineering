package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۣۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5840({"SMAP\nUri.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Uri.kt\nandroidx/core/net/UriKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,46:1\n1#2:47\n*E\n"})
public final class C6625 {
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.io.File m25464(@Yue.InterfaceC4418 android.net.Uri r2) {
            java.lang.String r0 = r2.getScheme()
            java.lang.String r1 = "file"
            boolean r0 = Yue.C3329.m13897(r0, r1)
            if (r0 == 0) goto L33
            java.lang.String r0 = r2.getPath()
            if (r0 == 0) goto L18
            java.io.File r2 = new java.io.File
            r2.<init>(r0)
            return r2
        L18:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Uri path is null: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L33:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Uri lacks 'file' scheme: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final android.net.Uri m25465(@Yue.InterfaceC4418 java.io.File r0) {
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final android.net.Uri m25466(@Yue.InterfaceC4418 java.lang.String r0) {
            android.net.Uri r0 = android.net.Uri.parse(r0)
            return r0
    }
}
