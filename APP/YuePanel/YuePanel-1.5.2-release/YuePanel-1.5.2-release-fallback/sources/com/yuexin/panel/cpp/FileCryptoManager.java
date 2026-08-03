package com.yuexin.panel.cpp;

/* JADX INFO: loaded from: classes2.dex */
public final class FileCryptoManager {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.String f30584 = "YPNK2:";

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.lang.String f30585 = "YPNV2:";

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final boolean f30586 = false;

    static {
            r0 = 16
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            java.lang.String r0 = "miao"
            Yue.C4369.m17207(r0)     // Catch: java.lang.Throwable -> Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            com.yuexin.panel.cpp.FileCryptoManager.f30586 = r0
            return
    }

    public FileCryptoManager() {
            r0 = this;
            r0.<init>()
            return
    }

    private static native byte[] nativeDecrypt(byte[] r0);

    private static native byte[] nativeDecryptJavaString(long r0);

    private static native byte[] nativeDecryptReadFile(java.lang.String r0);

    private static native byte[] nativeEncrypt(byte[] r0);

    private static native boolean nativeEncryptWriteFile(java.lang.String r0, byte[] r1);

    private static native boolean nativeInstallCrashHandler(java.lang.String r0, java.lang.String r1, java.lang.String r2, long r3, java.lang.String r5, java.lang.String r6);

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static native byte[] m30659(long r0);

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static native java.lang.String m30660(java.lang.String r0);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native java.lang.String m30661(java.lang.String r0);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native java.lang.String m30662(java.lang.String r0, java.lang.String r1);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native java.lang.String m30663(java.lang.String r0);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static native java.lang.String m30664(java.lang.String r0);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static native java.lang.String m30665(java.lang.String r0, java.lang.String r1);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static native java.lang.String m30666(java.lang.String r0);

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static native boolean m30667(java.lang.String r0, java.lang.String r1);

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static native boolean m30668(java.lang.String r0, java.lang.String r1, java.lang.String r2, long r3, java.lang.String r5, java.lang.String r6);

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static native boolean m30669();

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static native boolean m30670(java.lang.String r0);

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static native boolean m30671(java.lang.String r0);
}
