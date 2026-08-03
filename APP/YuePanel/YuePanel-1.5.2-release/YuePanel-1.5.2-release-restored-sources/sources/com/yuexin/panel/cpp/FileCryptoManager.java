package com.yuexin.panel.cpp;

import Yue.C6352;
import com.nmmedit.protect.NativeUtil;

/* JADX INFO: loaded from: classes2.dex */
public final class FileCryptoManager {

    /* JADX INFO: renamed from: ۥ */
    public static final String f4195 = "YPNK2:";

    /* JADX INFO: renamed from: ۥ۟ */
    public static final String f4196 = "YPNV2:";

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final boolean f30773;

    static {
        boolean z;
        NativeUtil.classesInit0(16);
        try {
            C6352.m19853("miao");
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        f30773 = z;
    }

    private static native byte[] nativeDecrypt(byte[] bArr);

    private static native byte[] nativeDecryptJavaString(long j);

    private static native byte[] nativeDecryptReadFile(String str);

    private static native byte[] nativeEncrypt(byte[] bArr);

    private static native boolean nativeEncryptWriteFile(String str, byte[] bArr);

    private static native boolean nativeInstallCrashHandler(String str, String str2, String str3, long j, String str4, String str5);

    /* JADX INFO: renamed from: ۥ */
    public static native byte[] m5095(long j);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native String m5096(String str);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native String m31045(String str);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native String m31046(String str, String str2);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native String m31047(String str);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static native String m31048(String str);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static native String m31049(String str, String str2);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static native String m31050(String str);

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static native boolean m31051(String str, String str2);

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static native boolean m31052(String str, String str2, String str3, long j, String str4, String str5);

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static native boolean m31053();

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static native boolean m31054(String str);

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static native boolean m31055(String str);
}
