package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠۟ۧۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1952 {

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.lang.String f6115 = "DocumentFile";

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4544
    public final Yue.AbstractC1952 f6116;

    public AbstractC1952(@Yue.InterfaceC4544 Yue.AbstractC1952 r1) {
            r0 = this;
            r0.<init>()
            r0.f6116 = r1
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static Yue.AbstractC1952 m8986(@Yue.InterfaceC4410 java.io.File r2) {
            Yue.ۥۡۦ۟۟ r0 = new Yue.ۥۡۦ۟۟
            r1 = 0
            r0.<init>(r1, r2)
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static Yue.AbstractC1952 m8987(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4410 android.net.Uri r3) {
            Yue.ۥۢ۟ۡۢ r0 = new Yue.ۥۢ۟ۡۢ
            r1 = 0
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static Yue.AbstractC1952 m8988(@Yue.InterfaceC4410 android.content.Context r3, @Yue.InterfaceC4410 android.net.Uri r4) {
            java.lang.String r0 = android.provider.DocumentsContract.getTreeDocumentId(r4)
            boolean r1 = android.provider.DocumentsContract.isDocumentUri(r3, r4)
            if (r1 == 0) goto Le
            java.lang.String r0 = android.provider.DocumentsContract.getDocumentId(r4)
        Le:
            Yue.ۥۢۢۡۨ r1 = new Yue.ۥۢۢۡۨ
            r2 = 0
            android.net.Uri r4 = android.provider.DocumentsContract.buildDocumentUriUsingTree(r4, r0)
            r1.<init>(r2, r3, r4)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static boolean m8989(@Yue.InterfaceC4410 android.content.Context r0, @Yue.InterfaceC4544 android.net.Uri r1) {
            boolean r0 = android.provider.DocumentsContract.isDocumentUri(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public abstract boolean mo8990();

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public abstract boolean mo8991();

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public abstract Yue.AbstractC1952 mo8992(@Yue.InterfaceC4410 java.lang.String r1);

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public abstract Yue.AbstractC1952 mo8993(@Yue.InterfaceC4410 java.lang.String r1, @Yue.InterfaceC4410 java.lang.String r2);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public abstract boolean mo8994();

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public abstract boolean mo8995();

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public Yue.AbstractC1952 m8996(@Yue.InterfaceC4410 java.lang.String r6) {
            r5 = this;
            Yue.ۥ۠۟ۧۦ[] r0 = r5.mo9006()
            int r1 = r0.length
            r2 = 0
        L6:
            if (r2 >= r1) goto L18
            r3 = r0[r2]
            java.lang.String r4 = r3.mo8997()
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L15
            return r3
        L15:
            int r2 = r2 + 1
            goto L6
        L18:
            r6 = 0
            return r6
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public abstract java.lang.String mo8997();

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public Yue.AbstractC1952 m8998() {
            r1 = this;
            Yue.ۥ۠۟ۧۦ r0 = r1.f6116
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public abstract java.lang.String mo8999();

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public abstract android.net.Uri mo9000();

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public abstract boolean mo9001();

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public abstract boolean mo9002();

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public abstract boolean mo9003();

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public abstract long mo9004();

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public abstract long mo9005();

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public abstract Yue.AbstractC1952[] mo9006();

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public abstract boolean mo9007(@Yue.InterfaceC4410 java.lang.String r1);
}
