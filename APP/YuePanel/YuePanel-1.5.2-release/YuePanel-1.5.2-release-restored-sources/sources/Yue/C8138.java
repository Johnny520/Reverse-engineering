package Yue;

import Yue.InterfaceC4103;
import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;

/* JADX INFO: renamed from: Yue.ۥۣۣۢۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C8138 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final /* synthetic */ boolean f24128 = false;

    /* JADX INFO: renamed from: ۥ */
    public URL f3241;

    /* JADX INFO: renamed from: ۥ۟ */
    public StringBuilder f3242;

    public C8138(URL url) {
        this.f3241 = url;
        if (url.getQuery() != null) {
            StringBuilder sbM3765 = C7615.m3765();
            sbM3765.append(this.f3241.getQuery());
            this.f3242 = sbM3765;
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static void m4162(String str, boolean z, StringBuilder sb) throws UnsupportedEncodingException {
        int i = 0;
        while (i < str.length()) {
            int iCodePointAt = str.codePointAt(i);
            if (iCodePointAt == 32) {
                sb.append(z ? Character.valueOf(SignatureVisitor.EXTENDS) : "%20");
            } else if (iCodePointAt > 127) {
                sb.append(URLEncoder.encode(new String(Character.toChars(iCodePointAt)), C4300.f801.name()));
                if (Character.charCount(iCodePointAt) == 2) {
                    i++;
                }
            } else {
                sb.append((char) iCodePointAt);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static String m26771(String str) {
        try {
            return URLDecoder.decode(str, C4300.f801.name());
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public void m4163(InterfaceC4103.InterfaceC0325 interfaceC0325) throws UnsupportedEncodingException {
        StringBuilder sb = this.f3242;
        if (sb == null) {
            this.f3242 = C7615.m3765();
        } else {
            sb.append(C8039.f23874);
        }
        StringBuilder sb2 = this.f3242;
        String strKey = interfaceC0325.key();
        Charset charset = C4300.f801;
        sb2.append(URLEncoder.encode(strKey, charset.name()));
        sb2.append(SignatureVisitor.INSTANCEOF);
        sb2.append(URLEncoder.encode(interfaceC0325.value(), charset.name()));
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public URL m26772() {
        try {
            URI uri = new URI(this.f3241.getProtocol(), this.f3241.getUserInfo(), IDN.toASCII(m26771(this.f3241.getHost())), this.f3241.getPort(), null, null, null);
            StringBuilder sbM3765 = C7615.m3765();
            sbM3765.append(uri.toASCIIString());
            m4162(this.f3241.getPath(), false, sbM3765);
            if (this.f3242 != null) {
                sbM3765.append('?');
                m4162(C7615.m23825(this.f3242), true, sbM3765);
            }
            if (this.f3241.getRef() != null) {
                sbM3765.append('#');
                m4162(this.f3241.getRef(), false, sbM3765);
            }
            URL url = new URL(C7615.m23825(sbM3765));
            this.f3241 = url;
            return url;
        } catch (UnsupportedEncodingException | MalformedURLException | URISyntaxException unused) {
            return this.f3241;
        }
    }
}
