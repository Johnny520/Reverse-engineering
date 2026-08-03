package Yue;

import Yue.InterfaceC7102;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.PasswordAuthentication;

/* JADX INFO: renamed from: Yue.ۥ۟ۢۡ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C3465 extends Authenticator {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f5647 = 5;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static InterfaceC0145 f5648;

    /* JADX INFO: renamed from: ۥ */
    public InterfaceC7102 f306;

    /* JADX INFO: renamed from: ۥ۟ */
    public int f307 = 0;

    /* JADX INFO: renamed from: Yue.ۥ۟ۢۡ۠$ۥ */
    public interface InterfaceC0145 {
        void remove();

        /* JADX INFO: renamed from: ۥ */
        C3465 mo540(C3465 c3465);

        /* JADX INFO: renamed from: ۥ۟ */
        void mo541(InterfaceC7102 interfaceC7102, HttpURLConnection httpURLConnection);
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۢۡ۠$ۥ۟ */
    public static class C0146 implements InterfaceC0145 {

        /* JADX INFO: renamed from: ۥ */
        public static ThreadLocal<C3465> f308 = new ThreadLocal<>();

        static {
            Authenticator.setDefault(new C3465());
        }

        @Override // Yue.C3465.InterfaceC0145
        public void remove() {
            f308.remove();
        }

        @Override // Yue.C3465.InterfaceC0145
        /* JADX INFO: renamed from: ۥ */
        public C3465 mo540(C3465 c3465) {
            return f308.get();
        }

        @Override // Yue.C3465.InterfaceC0145
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo541(InterfaceC7102 interfaceC7102, HttpURLConnection httpURLConnection) {
            f308.set(new C3465(interfaceC7102));
        }
    }

    static {
        try {
            f5648 = (InterfaceC0145) Class.forName("org.jsoup.helper.RequestAuthHandler").getConstructor(null).newInstance(null);
        } catch (ClassNotFoundException unused) {
            f5648 = new C0146();
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3465() {
    }

    @Override // java.net.Authenticator
    public final PasswordAuthentication getPasswordAuthentication() {
        C3465 c3465Mo540 = f5648.mo540(this);
        if (c3465Mo540 == null) {
            return null;
        }
        int i = c3465Mo540.f307 + 1;
        c3465Mo540.f307 = i;
        if (i > 5 || c3465Mo540.f306 == null) {
            return null;
        }
        return c3465Mo540.f306.m3394(new InterfaceC7102.C1166(getRequestingURL(), getRequestorType(), getRequestingPrompt()));
    }

    public C3465(InterfaceC7102 interfaceC7102) {
        this.f306 = interfaceC7102;
    }
}
