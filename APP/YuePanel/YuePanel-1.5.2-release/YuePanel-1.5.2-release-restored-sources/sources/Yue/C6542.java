package Yue;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: renamed from: Yue.ۥۣۡۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6542 {
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public static final InterfaceC7472 m3009(@InterfaceC6399 File file) throws FileNotFoundException {
        return C6543.m3012(file);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public static final AbstractC4819 m3010(@InterfaceC6399 ClassLoader classLoader) {
        return C6543.m20851(classLoader);
    }

    @InterfaceC6399
    @InterfaceC5572(name = "blackhole")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final InterfaceC7472 m20829() {
        return C6544.m3013();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final InterfaceC3603 m20830(@InterfaceC6399 InterfaceC7472 interfaceC7472) {
        return C6544.m3014(interfaceC7472);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final InterfaceC3604 m20831(@InterfaceC6399 InterfaceC7506 interfaceC7506) {
        return C6544.m20870(interfaceC7506);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final C3818 m20832(@InterfaceC6399 InterfaceC7472 interfaceC7472, @InterfaceC6399 Cipher cipher) {
        return C6543.m20852(interfaceC7472, cipher);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final C3819 m20833(@InterfaceC6399 InterfaceC7506 interfaceC7506, @InterfaceC6399 Cipher cipher) {
        return C6543.m20853(interfaceC7506, cipher);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final C5253 m20834(@InterfaceC6399 InterfaceC7472 interfaceC7472, @InterfaceC6399 MessageDigest messageDigest) {
        return C6543.m20854(interfaceC7472, messageDigest);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final C5253 m20835(@InterfaceC6399 InterfaceC7472 interfaceC7472, @InterfaceC6399 Mac mac) {
        return C6543.m20855(interfaceC7472, mac);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final C5254 m20836(@InterfaceC6399 InterfaceC7506 interfaceC7506, @InterfaceC6399 MessageDigest messageDigest) {
        return C6543.m20856(interfaceC7506, messageDigest);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final C5254 m20837(@InterfaceC6399 InterfaceC7506 interfaceC7506, @InterfaceC6399 Mac mac) {
        return C6543.m20857(interfaceC7506, mac);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final boolean m20838(@InterfaceC6399 AssertionError assertionError) {
        return C6543.m20858(assertionError);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final AbstractC4819 m20839(@InterfaceC6399 AbstractC4819 abstractC4819, @InterfaceC6399 C6618 c6618) throws IOException {
        return C6543.m20859(abstractC4819, c6618);
    }

    @InterfaceC6399
    @InterfaceC5573
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final InterfaceC7472 m20840(@InterfaceC6399 File file) throws FileNotFoundException {
        return C6543.m20860(file);
    }

    @InterfaceC6399
    @InterfaceC5573
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final InterfaceC7472 m20841(@InterfaceC6399 File file, boolean z) throws FileNotFoundException {
        return C6543.m20861(file, z);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final InterfaceC7472 m20842(@InterfaceC6399 OutputStream outputStream) {
        return C6543.m20862(outputStream);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final InterfaceC7472 m20843(@InterfaceC6399 Socket socket) throws IOException {
        return C6543.m20863(socket);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final InterfaceC7472 m20844(@InterfaceC6399 Path path, @InterfaceC6399 OpenOption... openOptionArr) throws IOException {
        return C6543.m20864(path, openOptionArr);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final InterfaceC7506 m20846(@InterfaceC6399 File file) throws FileNotFoundException {
        return C6543.m20866(file);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final InterfaceC7506 m20847(@InterfaceC6399 InputStream inputStream) {
        return C6543.m20867(inputStream);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final InterfaceC7506 m20848(@InterfaceC6399 Socket socket) throws IOException {
        return C6543.m20868(socket);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final InterfaceC7506 m20849(@InterfaceC6399 Path path, @InterfaceC6399 OpenOption... openOptionArr) throws IOException {
        return C6543.m20869(path, openOptionArr);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final <T extends Closeable, R> R m20850(T t, @InterfaceC6399 InterfaceC5124<? super T, ? extends R> interfaceC5124) {
        return (R) C6544.m20871(t, interfaceC5124);
    }
}
