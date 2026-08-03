package Yue;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: renamed from: Yue.ۥۣۡۡ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6543 {

    /* JADX INFO: renamed from: ۥ */
    public static final Logger f2141 = Logger.getLogger("okio.Okio");

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public static final InterfaceC7472 m3012(@InterfaceC6399 File file) throws FileNotFoundException {
        C5499.m17103(file, "<this>");
        return C6542.m20842(new FileOutputStream(file, true));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final AbstractC4819 m20851(@InterfaceC6399 ClassLoader classLoader) {
        C5499.m17103(classLoader, "<this>");
        return new C7122(classLoader, true, null, 4, null);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final C3818 m20852(@InterfaceC6399 InterfaceC7472 interfaceC7472, @InterfaceC6399 Cipher cipher) {
        C5499.m17103(interfaceC7472, "<this>");
        C5499.m17103(cipher, "cipher");
        return new C3818(C6542.m20830(interfaceC7472), cipher);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final C3819 m20853(@InterfaceC6399 InterfaceC7506 interfaceC7506, @InterfaceC6399 Cipher cipher) {
        C5499.m17103(interfaceC7506, "<this>");
        C5499.m17103(cipher, "cipher");
        return new C3819(C6542.m20831(interfaceC7506), cipher);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final C5253 m20854(@InterfaceC6399 InterfaceC7472 interfaceC7472, @InterfaceC6399 MessageDigest messageDigest) {
        C5499.m17103(interfaceC7472, "<this>");
        C5499.m17103(messageDigest, "digest");
        return new C5253(interfaceC7472, messageDigest);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final C5253 m20855(@InterfaceC6399 InterfaceC7472 interfaceC7472, @InterfaceC6399 Mac mac) {
        C5499.m17103(interfaceC7472, "<this>");
        C5499.m17103(mac, "mac");
        return new C5253(interfaceC7472, mac);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final C5254 m20856(@InterfaceC6399 InterfaceC7506 interfaceC7506, @InterfaceC6399 MessageDigest messageDigest) {
        C5499.m17103(interfaceC7506, "<this>");
        C5499.m17103(messageDigest, "digest");
        return new C5254(interfaceC7506, messageDigest);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final C5254 m20857(@InterfaceC6399 InterfaceC7506 interfaceC7506, @InterfaceC6399 Mac mac) {
        C5499.m17103(interfaceC7506, "<this>");
        C5499.m17103(mac, "mac");
        return new C5254(interfaceC7506, mac);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final boolean m20858(@InterfaceC6399 AssertionError assertionError) {
        C5499.m17103(assertionError, "<this>");
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? C7628.m24035(message, "getsockname failed", false, 2, null) : false;
    }

    /* JADX DEBUG: Class process forced to load method for inline: Yue.ۥۢۦۣۨ.ۥ۟۟۟۟(Yue.ۥۣۡۧۧ, Yue.ۥ۠ۡۨۤ, Yue.ۥۣ۠ۡ۟, int, java.lang.Object):Yue.ۥۢۦۣۧ */
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final AbstractC4819 m20859(@InterfaceC6399 AbstractC4819 abstractC4819, @InterfaceC6399 C6618 c6618) throws IOException {
        C5499.m17103(abstractC4819, "<this>");
        C5499.m17103(c6618, "zipPath");
        return C8578.m28575(c6618, abstractC4819, null, 4, null);
    }

    @InterfaceC6399
    @InterfaceC5573
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final InterfaceC7472 m20860(@InterfaceC6399 File file) throws FileNotFoundException {
        C5499.m17103(file, "<this>");
        return m20865(file, false, 1, null);
    }

    @InterfaceC6399
    @InterfaceC5573
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final InterfaceC7472 m20861(@InterfaceC6399 File file, boolean z) throws FileNotFoundException {
        C5499.m17103(file, "<this>");
        return C6542.m20842(new FileOutputStream(file, z));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final InterfaceC7472 m20862(@InterfaceC6399 OutputStream outputStream) {
        C5499.m17103(outputStream, "<this>");
        return new C6586(outputStream, new C7827());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final InterfaceC7472 m20863(@InterfaceC6399 Socket socket) throws IOException {
        C5499.m17103(socket, "<this>");
        C7491 c7491 = new C7491(socket);
        OutputStream outputStream = socket.getOutputStream();
        C5499.m17102(outputStream, "getOutputStream(...)");
        return c7491.m9093(new C6586(outputStream, c7491));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final InterfaceC7472 m20864(@InterfaceC6399 Path path, @InterfaceC6399 OpenOption... openOptionArr) throws IOException {
        C5499.m17103(path, "<this>");
        C5499.m17103(openOptionArr, "options");
        OutputStream outputStreamNewOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        C5499.m17102(outputStreamNewOutputStream, "newOutputStream(...)");
        return C6542.m20842(outputStreamNewOutputStream);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static /* synthetic */ InterfaceC7472 m20865(File file, boolean z, int i, Object obj) throws FileNotFoundException {
        if ((i & 1) != 0) {
            z = false;
        }
        return C6542.m20841(file, z);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final InterfaceC7506 m20866(@InterfaceC6399 File file) throws FileNotFoundException {
        C5499.m17103(file, "<this>");
        return new C5449(new FileInputStream(file), C7827.f23434);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final InterfaceC7506 m20867(@InterfaceC6399 InputStream inputStream) {
        C5499.m17103(inputStream, "<this>");
        return new C5449(inputStream, new C7827());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final InterfaceC7506 m20868(@InterfaceC6399 Socket socket) throws IOException {
        C5499.m17103(socket, "<this>");
        C7491 c7491 = new C7491(socket);
        InputStream inputStream = socket.getInputStream();
        C5499.m17102(inputStream, "getInputStream(...)");
        return c7491.m9094(new C5449(inputStream, c7491));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final InterfaceC7506 m20869(@InterfaceC6399 Path path, @InterfaceC6399 OpenOption... openOptionArr) throws IOException {
        C5499.m17103(path, "<this>");
        C5499.m17103(openOptionArr, "options");
        InputStream inputStreamNewInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        C5499.m17102(inputStreamNewInputStream, "newInputStream(...)");
        return C6542.m20847(inputStreamNewInputStream);
    }
}
