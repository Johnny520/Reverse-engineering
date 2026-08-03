package Yue;

import Yue.InterfaceC4103;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.CookieManager;
import java.net.CookieStore;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: Yue.ۥ۠ۤۨ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C5375 implements InterfaceC4103 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final String f13179 = "Content-Encoding";

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final String f13180 = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/79.0.3945.130 Safari/537.36";

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final String f13181 = "User-Agent";

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final String f13182 = "Content-Type";

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final String f13183 = "multipart/form-data";

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final String f13184 = "application/x-www-form-urlencoded";

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f13185 = 307;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final String f13186 = "application/octet-stream";

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final Charset f13187 = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: ۥ */
    public C5377 f1457;

    /* JADX INFO: renamed from: ۥ۟ */
    public InterfaceC4103.InterfaceC4106 f1458;

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۨ۠$ۥ۟۟, reason: contains not printable characters */
    public static class C5376 implements InterfaceC4103.InterfaceC0325 {

        /* JADX INFO: renamed from: ۥ */
        public String f1461;

        /* JADX INFO: renamed from: ۥ۟ */
        public String f1462;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public InputStream f13191;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public String f13192;

        public C5376(String str, String str2) {
            C8159.m26909(str, C6659.f17103);
            C8159.m26912(str2, "value");
            this.f1461 = str;
            this.f1462 = str2;
        }

        /* JADX INFO: renamed from: ۥ */
        public static C5376 m2132(String str, String str2) {
            return new C5376(str, str2);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static C5376 m16697(String str, String str2, InputStream inputStream) {
            return new C5376(str, str2).mo11657(inputStream);
        }

        @Override // Yue.InterfaceC4103.InterfaceC0325
        public String key() {
            return this.f1461;
        }

        public String toString() {
            return this.f1461 + "=" + this.f1462;
        }

        @Override // Yue.InterfaceC4103.InterfaceC0325
        /* JADX INFO: renamed from: ۥ۟ */
        public String mo1061() {
            return this.f13192;
        }

        @Override // Yue.InterfaceC4103.InterfaceC0325
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public InterfaceC4103.InterfaceC0325 mo11658(String str) {
            C8159.m26907(str);
            this.f13192 = str;
            return this;
        }

        @Override // Yue.InterfaceC4103.InterfaceC0325
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public boolean mo11660() {
            return this.f13191 != null;
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟۟(Ljava/io/InputStream;)LYue/ۥ۟ۦۧۤ$ۥ۟; */
        @Override // Yue.InterfaceC4103.InterfaceC0325
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public C5376 mo11657(InputStream inputStream) {
            C8159.m26912(this.f1462, "inputStream");
            this.f13191 = inputStream;
            return this;
        }

        @Override // Yue.InterfaceC4103.InterfaceC0325
        /* JADX INFO: renamed from: ۥۣ۟۟۟ */
        public InputStream mo11661() {
            return this.f13191;
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟۟۟۟(Ljava/lang/String;)LYue/ۥ۟ۦۧۤ$ۥ۟; */
        @Override // Yue.InterfaceC4103.InterfaceC0325
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public C5376 mo11659(String str) {
            C8159.m26909(str, C6659.f17103);
            this.f1461 = str;
            return this;
        }

        /* JADX DEBUG: Method merged with bridge method: value(Ljava/lang/String;)LYue/ۥ۟ۦۧۤ$ۥ۟; */
        @Override // Yue.InterfaceC4103.InterfaceC0325
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public C5376 value(String str) {
            C8159.m26912(str, "value");
            this.f1462 = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // Yue.InterfaceC4103.InterfaceC0325
        public String value() {
            return this.f1462;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static InterfaceC4103 m16691(String str) {
        C5375 c5375 = new C5375();
        c5375.mo11622(str);
        return c5375;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static InterfaceC4103 m16692(URL url) {
        C5375 c5375 = new C5375();
        c5375.mo11618(url);
        return c5375;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static String m16693(String str) {
        return str.replace("\"", "%22");
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static boolean m16694(InterfaceC4103.InterfaceC4105 interfaceC4105) {
        Iterator<InterfaceC4103.InterfaceC0325> it = interfaceC4105.data().iterator();
        while (it.hasNext()) {
            if (it.next().mo11660()) {
                return true;
            }
        }
        return false;
    }

    @Override // Yue.InterfaceC4103
    public C4483 get() throws IOException {
        this.f1457.mo11640(InterfaceC4103.EnumC4104.GET);
        mo11614();
        C8159.m26910(this.f1458);
        return this.f1458.mo11691();
    }

    @Override // Yue.InterfaceC4103
    /* JADX INFO: renamed from: ۥ */
    public InterfaceC4103 mo1059(String str) {
        C8159.m26912(str, "userAgent");
        this.f1457.mo11639(f13181, str);
        return this;
    }

    @Override // Yue.InterfaceC4103
    /* JADX INFO: renamed from: ۥ۟ */
    public InterfaceC4103.InterfaceC4105 mo1060() {
        return this.f1457;
    }

    @Override // Yue.InterfaceC4103
    /* JADX INFO: renamed from: ۥ۟۟ */
    public InterfaceC4103 mo11602(C6617 c6617) {
        this.f1457.mo11663(c6617);
        return this;
    }

    @Override // Yue.InterfaceC4103
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public InterfaceC4103 mo11603(String str, String str2) {
        this.f1457.mo11639(str, str2);
        return this;
    }

    @Override // Yue.InterfaceC4103
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public InterfaceC4103 mo11604(boolean z) {
        this.f1457.mo11664(z);
        return this;
    }

    @Override // Yue.InterfaceC4103
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public InterfaceC4103 mo11605(InterfaceC4103.EnumC4104 enumC4104) {
        this.f1457.mo11640(enumC4104);
        return this;
    }

    @Override // Yue.InterfaceC4103
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public InterfaceC4103 mo11606(String str) {
        this.f1457.mo11665(str);
        return this;
    }

    @Override // Yue.InterfaceC4103
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public InterfaceC4103 mo11607(InterfaceC7102 interfaceC7102) {
        this.f1457.mo11666(interfaceC7102);
        return this;
    }

    @Override // Yue.InterfaceC4103
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public InterfaceC4103 mo11608(String str, int i) {
        this.f1457.mo11667(str, i);
        return this;
    }

    @Override // Yue.InterfaceC4103
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public InterfaceC4103 mo11609(String str, String str2) {
        this.f1457.mo11641(str, str2);
        return this;
    }

    @Override // Yue.InterfaceC4103
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public InterfaceC4103 mo11610(int i) {
        this.f1457.mo11668(i);
        return this;
    }

    @Override // Yue.InterfaceC4103
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public InterfaceC4103 mo11611(int i) {
        this.f1457.mo11669(i);
        return this;
    }

    @Override // Yue.InterfaceC4103
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public InterfaceC4103 mo11612(boolean z) {
        this.f1457.mo11670(z);
        return this;
    }

    @Override // Yue.InterfaceC4103
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public InterfaceC4103 mo11613(SSLSocketFactory sSLSocketFactory) {
        this.f1457.mo11671(sSLSocketFactory);
        return this;
    }

    @Override // Yue.InterfaceC4103
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public InterfaceC4103.InterfaceC4106 mo11614() throws IOException {
        C5378 c5378M16715 = C5378.m16715(this.f1457);
        this.f1458 = c5378M16715;
        return c5378M16715;
    }

    @Override // Yue.InterfaceC4103
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public InterfaceC4103 mo11615(String str) {
        this.f1457.mo11672(str);
        return this;
    }

    @Override // Yue.InterfaceC4103
    /* JADX INFO: renamed from: ۥ۟۟۠۠ */
    public InterfaceC4103 mo11616(Proxy proxy) {
        this.f1457.mo11673(proxy);
        return this;
    }

    @Override // Yue.InterfaceC4103
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public InterfaceC4103 mo11617(boolean z) {
        this.f1457.mo11674(z);
        return this;
    }

    @Override // Yue.InterfaceC4103
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
    public InterfaceC4103 mo11618(URL url) {
        this.f1457.mo11642(url);
        return this;
    }

    @Override // Yue.InterfaceC4103
    /* JADX INFO: renamed from: ۥۣ۟۟۠ */
    public InterfaceC4103 mo11619(Collection<InterfaceC4103.InterfaceC0325> collection) {
        C8159.m26912(collection, "data");
        Iterator<InterfaceC4103.InterfaceC0325> it = collection.iterator();
        while (it.hasNext()) {
            this.f1457.mo11680(it.next());
        }
        return this;
    }

    @Override // Yue.InterfaceC4103
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ */
    public InterfaceC4103 mo11620(Map<String, String> map) {
        C8159.m26912(map, "headers");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.f1457.mo11639(entry.getKey(), entry.getValue());
        }
        return this;
    }

    @Override // Yue.InterfaceC4103
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ */
    public InterfaceC4103 mo11621(String str, String str2, InputStream inputStream, String str3) {
        this.f1457.mo11680(C5376.m16697(str, str2, inputStream).mo11658(str3));
        return this;
    }

    @Override // Yue.InterfaceC4103
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ */
    public InterfaceC4103 mo11622(String str) {
        C8159.m26909(str, "url");
        try {
            this.f1457.mo11642(new URL(str));
            return this;
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(String.format("The supplied URL, '%s', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls", str), e);
        }
    }

    @Override // Yue.InterfaceC4103
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ */
    public InterfaceC4103 mo11623() {
        return new C5375(this.f1457);
    }

    @Override // Yue.InterfaceC4103
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ */
    public InterfaceC4103.InterfaceC4106 mo11624() {
        InterfaceC4103.InterfaceC4106 interfaceC4106 = this.f1458;
        if (interfaceC4106 != null) {
            return interfaceC4106;
        }
        throw new IllegalArgumentException("You must execute the request before getting a response.");
    }

    @Override // Yue.InterfaceC4103
    /* JADX INFO: renamed from: ۥ۟۟ۡ */
    public InterfaceC4103 mo11625(CookieStore cookieStore) {
        this.f1457.f13205 = new CookieManager(cookieStore, null);
        return this;
    }

    @Override // Yue.InterfaceC4103
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟ */
    public InterfaceC4103 mo11626(String str, String str2) {
        this.f1457.mo11680(C5376.m2132(str, str2));
        return this;
    }

    @Override // Yue.InterfaceC4103
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠ */
    public CookieStore mo11627() {
        return this.f1457.f13205.getCookieStore();
    }

    @Override // Yue.InterfaceC4103
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ */
    public InterfaceC4103 mo11628(String str) {
        C8159.m26912(str, "referrer");
        this.f1457.mo11639("Referer", str);
        return this;
    }

    @Override // Yue.InterfaceC4103
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ */
    public InterfaceC4103 mo11629(Map<String, String> map) {
        C8159.m26912(map, "cookies");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.f1457.mo11641(entry.getKey(), entry.getValue());
        }
        return this;
    }

    @Override // Yue.InterfaceC4103
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ */
    public InterfaceC4103 mo11630(String str, String str2, InputStream inputStream) {
        this.f1457.mo11680(C5376.m16697(str, str2, inputStream));
        return this;
    }

    @Override // Yue.InterfaceC4103
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ */
    public C4483 mo11631() throws IOException {
        this.f1457.mo11640(InterfaceC4103.EnumC4104.POST);
        mo11614();
        C8159.m26910(this.f1458);
        return this.f1458.mo11691();
    }

    @Override // Yue.InterfaceC4103
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ */
    public InterfaceC4103 mo11632(String... strArr) {
        C8159.m26912(strArr, "keyvals");
        C8159.m26904(strArr.length % 2 == 0, "Must supply an even number of key value pairs");
        for (int i = 0; i < strArr.length; i += 2) {
            String str = strArr[i];
            String str2 = strArr[i + 1];
            C8159.m26908(str, "Data key must not be empty");
            C8159.m26911(str2, "Data value must not be null");
            this.f1457.mo11680(C5376.m2132(str, str2));
        }
        return this;
    }

    @Override // Yue.InterfaceC4103
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ */
    public InterfaceC4103 mo11634(InterfaceC4103.InterfaceC4106 interfaceC4106) {
        this.f1458 = interfaceC4106;
        return this;
    }

    @Override // Yue.InterfaceC4103
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ */
    public InterfaceC4103.InterfaceC0325 mo11635(String str) {
        C8159.m26909(str, C6659.f17103);
        for (InterfaceC4103.InterfaceC0325 interfaceC0325 : mo1060().data()) {
            if (interfaceC0325.key().equals(str)) {
                return interfaceC0325;
            }
        }
        return null;
    }

    @Override // Yue.InterfaceC4103
    /* JADX INFO: renamed from: ۥ۟۟ۢ */
    public InterfaceC4103 mo11636(Map<String, String> map) {
        C8159.m26912(map, "data");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.f1457.mo11680(C5376.m2132(entry.getKey(), entry.getValue()));
        }
        return this;
    }

    @Override // Yue.InterfaceC4103
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟ */
    public InterfaceC4103 mo11637(InterfaceC4103.InterfaceC4105 interfaceC4105) {
        this.f1457 = (C5377) interfaceC4105;
        return this;
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۨ۠$ۥ۟ */
    public static abstract class AbstractC0732<T extends InterfaceC4103.InterfaceC0324<T>> implements InterfaceC4103.InterfaceC0324<T> {

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static final URL f13188;

        /* JADX INFO: renamed from: ۥ */
        public URL f1459;

        /* JADX INFO: renamed from: ۥ۟ */
        public InterfaceC4103.EnumC4104 f1460;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public Map<String, List<String>> f13189;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public Map<String, String> f13190;

        static {
            try {
                f13188 = new URL("http://undefined/");
            } catch (MalformedURLException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // Yue.InterfaceC4103.InterfaceC0324
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public T mo11639(String str, String str2) {
            C8159.m26909(str, "name");
            mo11654(str);
            mo11652(str, str2);
            return this;
        }

        @Override // Yue.InterfaceC4103.InterfaceC0324
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public T mo11640(InterfaceC4103.EnumC4104 enumC4104) {
            C8159.m26912(enumC4104, "method");
            this.f1460 = enumC4104;
            return this;
        }

        @Override // Yue.InterfaceC4103.InterfaceC0324
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
        public T mo11641(String str, String str2) {
            C8159.m26909(str, "name");
            C8159.m26912(str2, "value");
            this.f13190.put(str, str2);
            return this;
        }

        @Override // Yue.InterfaceC4103.InterfaceC0324
        /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
        public T mo11642(URL url) {
            C8159.m26912(url, "url");
            this.f1459 = new C8138(url).m26772();
            return this;
        }

        @Override // Yue.InterfaceC4103.InterfaceC0324
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ */
        public boolean mo11643(String str) {
            C8159.m26909(str, "name");
            return !m16695(str).isEmpty();
        }

        @Override // Yue.InterfaceC4103.InterfaceC0324
        /* JADX INFO: renamed from: ۥ۟۟ۡ */
        public URL mo11644() {
            URL url = this.f1459;
            if (url != f13188) {
                return url;
            }
            throw new IllegalArgumentException("URL not set. Make sure to call #url(...) before executing the request.");
        }

        @Override // Yue.InterfaceC4103.InterfaceC0324
        /* JADX INFO: renamed from: ۥ۟۟ۡ۟ */
        public boolean mo11645(String str, String str2) {
            C8159.m26907(str);
            C8159.m26907(str2);
            Iterator<String> it = mo11648(str).iterator();
            while (it.hasNext()) {
                if (str2.equalsIgnoreCase(it.next())) {
                    return true;
                }
            }
            return false;
        }

        @Override // Yue.InterfaceC4103.InterfaceC0324
        /* JADX INFO: renamed from: ۥ۟۟ۡ۠ */
        public InterfaceC4103.EnumC4104 mo11646() {
            return this.f1460;
        }

        @Override // Yue.InterfaceC4103.InterfaceC0324
        /* JADX INFO: renamed from: ۥ۟۟ۡۢ */
        public T mo11647(String str) {
            C8159.m26909(str, "name");
            this.f13190.remove(str);
            return this;
        }

        @Override // Yue.InterfaceC4103.InterfaceC0324
        /* JADX INFO: renamed from: ۥ۟۟ۡۥ */
        public List<String> mo11648(String str) {
            C8159.m26909(str, "name");
            return m16695(str);
        }

        @Override // Yue.InterfaceC4103.InterfaceC0324
        /* JADX INFO: renamed from: ۥ۟۟ۡۦ */
        public Map<String, List<String>> mo11649() {
            return this.f13189;
        }

        @Override // Yue.InterfaceC4103.InterfaceC0324
        /* JADX INFO: renamed from: ۥ۟۟ۡۧ */
        public Map<String, String> mo11650() {
            return this.f13190;
        }

        @Override // Yue.InterfaceC4103.InterfaceC0324
        /* JADX INFO: renamed from: ۥ۟۟ۢ */
        public String mo11651(String str) {
            C8159.m26909(str, "name");
            return this.f13190.get(str);
        }

        @Override // Yue.InterfaceC4103.InterfaceC0324
        /* JADX INFO: renamed from: ۥۣ۟۟ۢ */
        public T mo11652(String str, String str2) {
            C8159.m26909(str, "name");
            if (str2 == null) {
                str2 = "";
            }
            List<String> listMo11648 = mo11648(str);
            if (listMo11648.isEmpty()) {
                listMo11648 = new ArrayList<>();
                this.f13189.put(str, listMo11648);
            }
            listMo11648.add(str2);
            return this;
        }

        @Override // Yue.InterfaceC4103.InterfaceC0324
        /* JADX INFO: renamed from: ۥ۟۟ۢۤ */
        public boolean mo11653(String str) {
            C8159.m26909(str, "name");
            return this.f13190.containsKey(str);
        }

        @Override // Yue.InterfaceC4103.InterfaceC0324
        /* JADX INFO: renamed from: ۥ۟۟ۢۥ */
        public T mo11654(String str) {
            C8159.m26909(str, "name");
            Map.Entry<String, List<String>> entryM16696 = m16696(str);
            if (entryM16696 != null) {
                this.f13189.remove(entryM16696.getKey());
            }
            return this;
        }

        @Override // Yue.InterfaceC4103.InterfaceC0324
        /* JADX INFO: renamed from: ۥ۟۟ۢۦ */
        public String mo11655(String str) {
            C8159.m26912(str, "name");
            List<String> listM16695 = m16695(str);
            if (listM16695.size() > 0) {
                return C7615.m23819(listM16695, ", ");
            }
            return null;
        }

        @Override // Yue.InterfaceC4103.InterfaceC0324
        /* JADX INFO: renamed from: ۥ۟۟ۢۧ */
        public Map<String, String> mo11656() {
            LinkedHashMap linkedHashMap = new LinkedHashMap(this.f13189.size());
            for (Map.Entry<String, List<String>> entry : this.f13189.entrySet()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                if (value.size() > 0) {
                    linkedHashMap.put(key, value.get(0));
                }
            }
            return linkedHashMap;
        }

        /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
        public final List<String> m16695(String str) {
            C8159.m26910(str);
            for (Map.Entry<String, List<String>> entry : this.f13189.entrySet()) {
                if (str.equalsIgnoreCase(entry.getKey())) {
                    return entry.getValue();
                }
            }
            return Collections.emptyList();
        }

        /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
        public final Map.Entry<String, List<String>> m16696(String str) {
            String strM2839 = C6396.m2839(str);
            for (Map.Entry<String, List<String>> entry : this.f13189.entrySet()) {
                if (C6396.m2839(entry.getKey()).equals(strM2839)) {
                    return entry;
                }
            }
            return null;
        }

        public AbstractC0732() {
            this.f1459 = f13188;
            this.f1460 = InterfaceC4103.EnumC4104.GET;
            this.f13189 = new LinkedHashMap();
            this.f13190 = new LinkedHashMap();
        }

        public AbstractC0732(AbstractC0732<T> abstractC0732) {
            this.f1459 = f13188;
            this.f1460 = InterfaceC4103.EnumC4104.GET;
            this.f1459 = abstractC0732.f1459;
            this.f1460 = abstractC0732.f1460;
            this.f13189 = new LinkedHashMap();
            for (Map.Entry<String, List<String>> entry : abstractC0732.f13189.entrySet()) {
                this.f13189.put(entry.getKey(), new ArrayList(entry.getValue()));
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.f13190 = linkedHashMap;
            linkedHashMap.putAll(abstractC0732.f13190);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C5375() {
        this.f1457 = new C5377();
    }

    public C5375(C5377 c5377) {
        this.f1457 = new C5377(c5377);
    }

    public C5375(C5377 c5377, C5378 c5378) {
        this.f1457 = c5377;
        this.f1458 = c5378;
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۨ۠$ۥ۟۟۟۟, reason: contains not printable characters */
    public static class C5378 extends AbstractC0732<InterfaceC4103.InterfaceC4106> implements InterfaceC4103.InterfaceC4106 {

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public static final int f13208 = 20;

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public static final String f13209 = "Location";

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public static final Pattern f13210 = Pattern.compile("(\\w+)/\\w*\\+?xml.*");

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final int f13211;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final String f13212;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public ByteBuffer f13213;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public C4215 f13214;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public HttpURLConnection f13215;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public String f13216;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public final String f13217;

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public boolean f13218;

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public boolean f13219;

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public int f13220;

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public final C5377 f13221;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C5378() {
            super();
            this.f13218 = false;
            this.f13219 = false;
            this.f13220 = 0;
            this.f13211 = 400;
            this.f13212 = "Request not made";
            this.f13221 = new C5377();
            this.f13217 = null;
        }

        /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
        public static HttpURLConnection m16713(C5377 c5377) throws IOException {
            Proxy proxyMo11679 = c5377.mo11679();
            HttpURLConnection httpURLConnection = (HttpURLConnection) (proxyMo11679 == null ? c5377.mo11644().openConnection() : c5377.mo11644().openConnection(proxyMo11679));
            httpURLConnection.setRequestMethod(c5377.mo11646().name());
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setConnectTimeout(c5377.mo1063());
            httpURLConnection.setReadTimeout(c5377.mo1063() / 2);
            if (c5377.mo11678() != null && (httpURLConnection instanceof HttpsURLConnection)) {
                ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(c5377.mo11678());
            }
            if (c5377.f13206 != null) {
                C3465.f5648.mo541(c5377.f13206, httpURLConnection);
            }
            if (c5377.mo11646().m11662()) {
                httpURLConnection.setDoOutput(true);
            }
            C4219.m1182(c5377, httpURLConnection);
            for (Map.Entry entry : c5377.mo11649().entrySet()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) it.next());
                }
            }
            return httpURLConnection;
        }

        /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
        public static LinkedHashMap<String, List<String>> m16714(HttpURLConnection httpURLConnection) {
            LinkedHashMap<String, List<String>> linkedHashMap = new LinkedHashMap<>();
            int i = 0;
            while (true) {
                String headerFieldKey = httpURLConnection.getHeaderFieldKey(i);
                String headerField = httpURLConnection.getHeaderField(i);
                if (headerFieldKey == null && headerField == null) {
                    return linkedHashMap;
                }
                i++;
                if (headerFieldKey != null && headerField != null) {
                    if (linkedHashMap.containsKey(headerFieldKey)) {
                        linkedHashMap.get(headerFieldKey).add(headerField);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(headerField);
                        linkedHashMap.put(headerFieldKey, arrayList);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
        public static C5378 m16715(C5377 c5377) throws IOException {
            return m16716(c5377, null);
        }

        /* JADX DEBUG: Another duplicated slice has different insns count: {[INVOKE, INVOKE]}, finally: {[INVOKE, INVOKE, SGET, INVOKE, IF] complete} */
        /* JADX WARN: Can't wrap try/catch for region: R(5:(15:(9:(1:24)|26|125|27|(4:29|121|30|31)|44|126|45|(2:64|(2:109|110)(9:70|(2:79|80)|(1:86)|87|(1:103)(6:91|(1:93)(1:94)|95|(1:97)(3:99|(1:101)|102)|98|102)|104|(1:106)|107|108))(8:49|(1:51)|54|(1:58)|59|60|(1:62)|63))(1:22)|126|45|(1:47)|64|(4:66|68|109|110)(3:68|109|110)|70|(5:72|74|76|79|80)|(3:82|84|86)|87|(2:89|103)(0)|104|(0)|107|108)|125|27|(0)|44) */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00a0, code lost:
        
            r9 = e;
         */
        /* JADX WARN: Removed duplicated region for block: B:103:0x01dd A[Catch: all -> 0x009d, IOException -> 0x00de, TRY_LEAVE, TryCatch #4 {IOException -> 0x00de, blocks: (B:45:0x00b7, B:47:0x00bf, B:51:0x00c9, B:54:0x00e2, B:56:0x00f3, B:58:0x00fc, B:59:0x0100, B:70:0x012f, B:72:0x0135, B:74:0x013b, B:76:0x0143, B:79:0x0150, B:80:0x015f, B:82:0x0162, B:84:0x016e, B:86:0x0174, B:87:0x017b, B:89:0x0189, B:91:0x0191, B:93:0x0197, B:95:0x01a0, B:97:0x01aa, B:102:0x01c6, B:99:0x01b1, B:101:0x01bb, B:94:0x019c, B:103:0x01dd, B:68:0x0129, B:109:0x01f4, B:110:0x0203), top: B:126:0x00b7 }] */
        /* JADX WARN: Removed duplicated region for block: B:106:0x01ec  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0092 A[Catch: all -> 0x009d, IOException -> 0x00a0, TRY_LEAVE, TryCatch #3 {IOException -> 0x00a0, blocks: (B:27:0x0089, B:29:0x0092, B:31:0x0099, B:42:0x00aa, B:43:0x00ad, B:44:0x00ae), top: B:125:0x0089 }] */
        /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static C5378 m16716(C5377 c5377, C5378 c5378) throws IOException {
            String strM16720;
            HttpURLConnection httpURLConnectionM16713;
            int responseCode;
            C5378 c53782;
            String strMo1064;
            InputStream inflaterInputStream;
            synchronized (c5377) {
                C8159.m26902(c5377.f13207, "Multiple threads were detected trying to execute the same request concurrently. Make sure to use Connection#newRequest() and do not share an executing request between threads.");
                c5377.f13207 = true;
            }
            C8159.m26912(c5377, "req");
            URL urlMo11644 = c5377.mo11644();
            C8159.m26911(urlMo11644, "URL must be specified to connect");
            String protocol = urlMo11644.getProtocol();
            if (!protocol.equals("http") && !protocol.equals("https")) {
                throw new MalformedURLException("Only http & https protocols supported");
            }
            boolean zM11662 = c5377.mo11646().m11662();
            boolean z = c5377.mo11683() != null;
            if (!zM11662) {
                C8159.m26902(z, "Cannot set a request body for HTTP method " + c5377.mo11646());
            }
            C5378 c53783 = null;
            try {
                try {
                    if (c5377.data().size() <= 0 || (zM11662 && !z)) {
                        if (zM11662) {
                            strM16720 = m16720(c5377);
                        }
                        long jNanoTime = System.nanoTime();
                        httpURLConnectionM16713 = m16713(c5377);
                        httpURLConnectionM16713.connect();
                        if (httpURLConnectionM16713.getDoOutput()) {
                            OutputStream outputStream = httpURLConnectionM16713.getOutputStream();
                            try {
                                try {
                                    m16721(c5377, outputStream, strM16720);
                                } catch (IOException e) {
                                    httpURLConnectionM16713.disconnect();
                                    throw e;
                                }
                            } finally {
                                outputStream.close();
                            }
                        }
                        responseCode = httpURLConnectionM16713.getResponseCode();
                        c53782 = new C5378(httpURLConnectionM16713, c5377, c5378);
                        if (!c53782.mo11643(f13209) && c5377.mo11682()) {
                            if (responseCode != 307) {
                                c5377.mo11640(InterfaceC4103.EnumC4104.GET);
                                c5377.data().clear();
                                c5377.mo11665(null);
                                c5377.mo11654(C5375.f13182);
                            }
                            String strMo11655 = c53782.mo11655(f13209);
                            C8159.m26910(strMo11655);
                            if (strMo11655.startsWith("http:/") && strMo11655.charAt(6) != '/') {
                                strMo11655 = strMo11655.substring(6);
                            }
                            c5377.mo11642(C7615.m23827(c5377.mo11644(), strMo11655));
                            c5377.f13207 = false;
                            return m16716(c5377, c53782);
                        }
                        if ((responseCode >= 200 || responseCode >= 400) && !c5377.mo11675()) {
                            throw new C5384("HTTP error fetching URL", responseCode, c5377.mo11644().toString());
                        }
                        strMo1064 = c53782.mo1064();
                        if (strMo1064 != null && !c5377.mo11677() && !strMo1064.startsWith("text/") && !f13210.matcher(strMo1064).matches()) {
                            throw new C8114("Unhandled content type. Must be text/*, */xml, or */*+xml", strMo1064, c5377.mo11644().toString());
                        }
                        if (strMo1064 != null && f13210.matcher(strMo1064).matches() && !c5377.f13202) {
                            c5377.mo11663(C6617.m21002());
                        }
                        c53782.f13216 = C4300.m12420(c53782.f13217);
                        if (httpURLConnectionM16713.getContentLength() != 0 || c5377.mo11646() == InterfaceC4103.EnumC4104.HEAD) {
                            c53782.f13213 = C4300.m12419();
                        } else {
                            InputStream errorStream = httpURLConnectionM16713.getErrorStream() != null ? httpURLConnectionM16713.getErrorStream() : httpURLConnectionM16713.getInputStream();
                            if (c53782.mo11645(C5375.f13179, "gzip")) {
                                inflaterInputStream = new GZIPInputStream(errorStream);
                            } else {
                                if (c53782.mo11645(C5375.f13179, "deflate")) {
                                    inflaterInputStream = new InflaterInputStream(errorStream, new Inflater(true));
                                }
                                c53782.f13214 = C4215.m12109(errorStream, 32768, c5377.mo11684()).m12111(jNanoTime, c5377.mo1063());
                            }
                            errorStream = inflaterInputStream;
                            c53782.f13214 = C4215.m12109(errorStream, 32768, c5377.mo11684()).m12111(jNanoTime, c5377.mo1063());
                        }
                        c5377.f13207 = false;
                        if (c5377.f13206 != null) {
                            C3465.f5648.remove();
                        }
                        c53782.f13218 = true;
                        return c53782;
                    }
                    m16719(c5377);
                    if (!c53782.mo11643(f13209)) {
                    }
                    if (responseCode >= 200) {
                        throw new C5384("HTTP error fetching URL", responseCode, c5377.mo11644().toString());
                    }
                    throw new C5384("HTTP error fetching URL", responseCode, c5377.mo11644().toString());
                    strMo1064 = c53782.mo1064();
                    if (strMo1064 != null) {
                        throw new C8114("Unhandled content type. Must be text/*, */xml, or */*+xml", strMo1064, c5377.mo11644().toString());
                    }
                    if (strMo1064 != null) {
                        c5377.mo11663(C6617.m21002());
                    }
                    c53782.f13216 = C4300.m12420(c53782.f13217);
                    if (httpURLConnectionM16713.getContentLength() != 0) {
                        c53782.f13213 = C4300.m12419();
                    }
                    c5377.f13207 = false;
                    if (c5377.f13206 != null) {
                    }
                    c53782.f13218 = true;
                    return c53782;
                } catch (IOException e2) {
                    e = e2;
                    c53783 = c53782;
                    if (c53783 != null) {
                        c53783.m16725();
                    }
                    throw e;
                }
                httpURLConnectionM16713.connect();
                if (httpURLConnectionM16713.getDoOutput()) {
                }
                responseCode = httpURLConnectionM16713.getResponseCode();
                c53782 = new C5378(httpURLConnectionM16713, c5377, c5378);
            } finally {
                c5377.f13207 = false;
                if (c5377.f13206 != null) {
                    C3465.f5648.remove();
                }
            }
            strM16720 = null;
            long jNanoTime2 = System.nanoTime();
            httpURLConnectionM16713 = m16713(c5377);
        }

        /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
        public static String m16717(String str) {
            if (str == null) {
                return str;
            }
            byte[] bytes = str.getBytes(C5375.f13187);
            return m16718(bytes) ? new String(bytes, C4300.f801) : str;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
        public static boolean m16718(byte[] bArr) {
            int i;
            int i2 = (bArr.length >= 3 && (bArr[0] & 255) == 239 && (bArr[1] & 255) == 187 && (bArr[2] & 255) == 191) ? 3 : 0;
            int length = bArr.length;
            boolean z = false;
            while (i2 < length) {
                byte b = bArr[i2];
                if ((b & C3626.f423) != 0) {
                    if ((b & 224) == 192) {
                        i = i2 + 1;
                    } else if ((b & 240) == 224) {
                        i = i2 + 2;
                    } else {
                        if ((b & 248) != 240) {
                            return false;
                        }
                        i = i2 + 3;
                    }
                    if (i >= bArr.length) {
                        return false;
                    }
                    while (i2 < i) {
                        i2++;
                        if ((bArr[i2] & C4750.f10617) != 128) {
                            return false;
                        }
                    }
                    z = true;
                }
                i2++;
            }
            return z;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
        public static void m16719(InterfaceC4103.InterfaceC4105 interfaceC4105) throws IOException {
            C8138 c8138 = new C8138(interfaceC4105.mo11644());
            for (InterfaceC4103.InterfaceC0325 interfaceC0325 : interfaceC4105.data()) {
                C8159.m26902(interfaceC0325.mo11660(), "InputStream data not supported in URL query string.");
                c8138.m4163(interfaceC0325);
            }
            interfaceC4105.mo11642(c8138.m26772());
            interfaceC4105.data().clear();
        }

        /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
        public static String m16720(InterfaceC4103.InterfaceC4105 interfaceC4105) {
            String strMo11655 = interfaceC4105.mo11655(C5375.f13182);
            if (strMo11655 != null) {
                if (strMo11655.contains(C5375.f13183) && !strMo11655.contains("boundary")) {
                    String strM12425 = C4300.m12425();
                    interfaceC4105.mo11639(C5375.f13182, "multipart/form-data; boundary=" + strM12425);
                    return strM12425;
                }
            } else {
                if (C5375.m16694(interfaceC4105)) {
                    String strM124252 = C4300.m12425();
                    interfaceC4105.mo11639(C5375.f13182, "multipart/form-data; boundary=" + strM124252);
                    return strM124252;
                }
                interfaceC4105.mo11639(C5375.f13182, "application/x-www-form-urlencoded; charset=" + interfaceC4105.mo11676());
            }
            return null;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
        public static void m16721(InterfaceC4103.InterfaceC4105 interfaceC4105, OutputStream outputStream, String str) throws IOException {
            Collection<InterfaceC4103.InterfaceC0325> collectionData = interfaceC4105.data();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, Charset.forName(interfaceC4105.mo11676())));
            if (str != null) {
                for (InterfaceC4103.InterfaceC0325 interfaceC0325 : collectionData) {
                    bufferedWriter.write("--");
                    bufferedWriter.write(str);
                    bufferedWriter.write("\r\n");
                    bufferedWriter.write("Content-Disposition: form-data; name=\"");
                    bufferedWriter.write(C5375.m16693(interfaceC0325.key()));
                    bufferedWriter.write("\"");
                    InputStream inputStreamMo11661 = interfaceC0325.mo11661();
                    if (inputStreamMo11661 != null) {
                        bufferedWriter.write("; filename=\"");
                        bufferedWriter.write(C5375.m16693(interfaceC0325.value()));
                        bufferedWriter.write("\"\r\nContent-Type: ");
                        String strMo1061 = interfaceC0325.mo1061();
                        if (strMo1061 == null) {
                            strMo1061 = C5375.f13186;
                        }
                        bufferedWriter.write(strMo1061);
                        bufferedWriter.write("\r\n\r\n");
                        bufferedWriter.flush();
                        C4300.m1253(inputStreamMo11661, outputStream);
                        outputStream.flush();
                    } else {
                        bufferedWriter.write("\r\n\r\n");
                        bufferedWriter.write(interfaceC0325.value());
                    }
                    bufferedWriter.write("\r\n");
                }
                bufferedWriter.write("--");
                bufferedWriter.write(str);
                bufferedWriter.write("--");
            } else {
                String strMo11683 = interfaceC4105.mo11683();
                if (strMo11683 != null) {
                    bufferedWriter.write(strMo11683);
                } else {
                    boolean z = true;
                    for (InterfaceC4103.InterfaceC0325 interfaceC03252 : collectionData) {
                        if (z) {
                            z = false;
                        } else {
                            bufferedWriter.append(C8039.f23874);
                        }
                        bufferedWriter.write(URLEncoder.encode(interfaceC03252.key(), interfaceC4105.mo11676()));
                        bufferedWriter.write(61);
                        bufferedWriter.write(URLEncoder.encode(interfaceC03252.value(), interfaceC4105.mo11676()));
                    }
                }
            }
            bufferedWriter.close();
        }

        @Override // Yue.InterfaceC4103.InterfaceC4106
        /* JADX INFO: renamed from: ۥ۟ */
        public String mo1064() {
            return this.f13217;
        }

        @Override // Yue.C5375.AbstractC0732, Yue.InterfaceC4103.InterfaceC0324
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public /* bridge */ /* synthetic */ InterfaceC4103.InterfaceC0324 mo11639(String str, String str2) {
            return super.mo11639(str, str2);
        }

        @Override // Yue.C5375.AbstractC0732, Yue.InterfaceC4103.InterfaceC0324
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public /* bridge */ /* synthetic */ InterfaceC4103.InterfaceC0324 mo11640(InterfaceC4103.EnumC4104 enumC4104) {
            return super.mo11640(enumC4104);
        }

        @Override // Yue.C5375.AbstractC0732, Yue.InterfaceC4103.InterfaceC0324
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
        public /* bridge */ /* synthetic */ InterfaceC4103.InterfaceC0324 mo11641(String str, String str2) {
            return super.mo11641(str, str2);
        }

        @Override // Yue.InterfaceC4103.InterfaceC4106
        /* JADX INFO: renamed from: ۥ۟۟۠ */
        public String mo11686() {
            m16723();
            C8159.m26910(this.f13213);
            String str = this.f13216;
            String string = (str == null ? C4300.f801 : Charset.forName(str)).decode(this.f13213).toString();
            this.f13213.rewind();
            return string;
        }

        @Override // Yue.C5375.AbstractC0732, Yue.InterfaceC4103.InterfaceC0324
        /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
        public /* bridge */ /* synthetic */ InterfaceC4103.InterfaceC0324 mo11642(URL url) {
            return super.mo11642(url);
        }

        @Override // Yue.InterfaceC4103.InterfaceC4106
        /* JADX INFO: renamed from: ۥ۟۟۠ۥ */
        public BufferedInputStream mo11687() {
            C8159.m26904(this.f13218, "Request must be executed (with .execute(), .get(), or .post() before getting response body");
            if (this.f13213 != null) {
                return new BufferedInputStream(new ByteArrayInputStream(this.f13213.array()), 32768);
            }
            C8159.m26902(this.f13219, "Request has already been read");
            C8159.m26910(this.f13214);
            this.f13219 = true;
            return this.f13214.m12110();
        }

        @Override // Yue.C5375.AbstractC0732, Yue.InterfaceC4103.InterfaceC0324
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ */
        public /* bridge */ /* synthetic */ boolean mo11643(String str) {
            return super.mo11643(str);
        }

        @Override // Yue.InterfaceC4103.InterfaceC4106
        /* JADX INFO: renamed from: ۥ۟۟۠ۧ */
        public String mo11688() {
            return this.f13216;
        }

        @Override // Yue.C5375.AbstractC0732, Yue.InterfaceC4103.InterfaceC0324
        /* JADX INFO: renamed from: ۥ۟۟ۡ */
        public /* bridge */ /* synthetic */ URL mo11644() {
            return super.mo11644();
        }

        @Override // Yue.C5375.AbstractC0732, Yue.InterfaceC4103.InterfaceC0324
        /* JADX INFO: renamed from: ۥ۟۟ۡ۟ */
        public /* bridge */ /* synthetic */ boolean mo11645(String str, String str2) {
            return super.mo11645(str, str2);
        }

        @Override // Yue.C5375.AbstractC0732, Yue.InterfaceC4103.InterfaceC0324
        /* JADX INFO: renamed from: ۥ۟۟ۡ۠ */
        public /* bridge */ /* synthetic */ InterfaceC4103.EnumC4104 mo11646() {
            return super.mo11646();
        }

        @Override // Yue.C5375.AbstractC0732, Yue.InterfaceC4103.InterfaceC0324
        /* JADX INFO: renamed from: ۥ۟۟ۡۢ */
        public /* bridge */ /* synthetic */ InterfaceC4103.InterfaceC0324 mo11647(String str) {
            return super.mo11647(str);
        }

        @Override // Yue.C5375.AbstractC0732, Yue.InterfaceC4103.InterfaceC0324
        /* JADX INFO: renamed from: ۥ۟۟ۡۥ */
        public /* bridge */ /* synthetic */ List mo11648(String str) {
            return super.mo11648(str);
        }

        @Override // Yue.C5375.AbstractC0732, Yue.InterfaceC4103.InterfaceC0324
        /* JADX INFO: renamed from: ۥ۟۟ۡۦ */
        public /* bridge */ /* synthetic */ Map mo11649() {
            return super.mo11649();
        }

        @Override // Yue.C5375.AbstractC0732, Yue.InterfaceC4103.InterfaceC0324
        /* JADX INFO: renamed from: ۥ۟۟ۡۧ */
        public /* bridge */ /* synthetic */ Map mo11650() {
            return super.mo11650();
        }

        @Override // Yue.C5375.AbstractC0732, Yue.InterfaceC4103.InterfaceC0324
        /* JADX INFO: renamed from: ۥ۟۟ۢ */
        public /* bridge */ /* synthetic */ String mo11651(String str) {
            return super.mo11651(str);
        }

        @Override // Yue.InterfaceC4103.InterfaceC4106
        /* JADX INFO: renamed from: ۥ۟۟ۢ۟ */
        public InterfaceC4103.InterfaceC4106 mo11690() {
            m16723();
            return this;
        }

        @Override // Yue.InterfaceC4103.InterfaceC4106
        /* JADX INFO: renamed from: ۥ۟۟ۢۢ */
        public C4483 mo11691() throws IOException {
            C8159.m26904(this.f13218, "Request must be executed (with .execute(), .get(), or .post() before parsing response");
            InputStream byteArrayInputStream = this.f13214;
            if (this.f13213 != null) {
                byteArrayInputStream = new ByteArrayInputStream(this.f13213.array());
                this.f13219 = false;
            }
            C8159.m26902(this.f13219, "Input stream already read and parsed, cannot re-read.");
            C4483 c4483M12426 = C4300.m12426(byteArrayInputStream, this.f13216, this.f1459.toExternalForm(), this.f13221.mo11685());
            c4483M12426.m12992(new C5375(this.f13221, this));
            this.f13216 = c4483M12426.m13001().m13014().name();
            this.f13219 = true;
            m16725();
            return c4483M12426;
        }

        @Override // Yue.C5375.AbstractC0732, Yue.InterfaceC4103.InterfaceC0324
        /* JADX INFO: renamed from: ۥۣ۟۟ۢ */
        public /* bridge */ /* synthetic */ InterfaceC4103.InterfaceC0324 mo11652(String str, String str2) {
            return super.mo11652(str, str2);
        }

        @Override // Yue.C5375.AbstractC0732, Yue.InterfaceC4103.InterfaceC0324
        /* JADX INFO: renamed from: ۥ۟۟ۢۤ */
        public /* bridge */ /* synthetic */ boolean mo11653(String str) {
            return super.mo11653(str);
        }

        @Override // Yue.C5375.AbstractC0732, Yue.InterfaceC4103.InterfaceC0324
        /* JADX INFO: renamed from: ۥ۟۟ۢۥ */
        public /* bridge */ /* synthetic */ InterfaceC4103.InterfaceC0324 mo11654(String str) {
            return super.mo11654(str);
        }

        @Override // Yue.C5375.AbstractC0732, Yue.InterfaceC4103.InterfaceC0324
        /* JADX INFO: renamed from: ۥ۟۟ۢۦ */
        public /* bridge */ /* synthetic */ String mo11655(String str) {
            return super.mo11655(str);
        }

        @Override // Yue.C5375.AbstractC0732, Yue.InterfaceC4103.InterfaceC0324
        /* JADX INFO: renamed from: ۥ۟۟ۢۧ */
        public /* bridge */ /* synthetic */ Map mo11656() {
            return super.mo11656();
        }

        @Override // Yue.InterfaceC4103.InterfaceC4106
        /* JADX INFO: renamed from: ۥ۟۟ۢۨ */
        public int mo11692() {
            return this.f13211;
        }

        @Override // Yue.InterfaceC4103.InterfaceC4106
        /* JADX INFO: renamed from: ۥۣ۟۟۠ */
        public String mo11693() {
            return this.f13212;
        }

        @Override // Yue.InterfaceC4103.InterfaceC4106
        /* JADX INFO: renamed from: ۥۣ۟۟ۡ */
        public byte[] mo11694() {
            m16723();
            C8159.m26910(this.f13213);
            return this.f13213.array();
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟۟ۡۤ(Ljava/lang/String;)LYue/ۥ۟ۦۧۤ$ۥ۟۟۟۟; */
        @Override // Yue.InterfaceC4103.InterfaceC4106
        /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public C5378 mo11689(String str) {
            this.f13216 = str;
            return this;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
        public final void m16723() {
            C8159.m26904(this.f13218, "Request must be executed (with .execute(), .get(), or .post() before getting response body");
            if (this.f13214 == null || this.f13213 != null) {
                return;
            }
            C8159.m26902(this.f13219, "Request has already been read (with .parse())");
            try {
                try {
                    this.f13213 = C4300.m12427(this.f13214, this.f13221.mo11684());
                } catch (IOException e) {
                    throw new C8098(e);
                }
            } finally {
                this.f13219 = true;
                m16725();
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
        public void m16724(Map<String, List<String>> map) {
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key != null) {
                    List<String> value = entry.getValue();
                    if (key.equalsIgnoreCase("Set-Cookie")) {
                        for (String str : value) {
                            if (str != null) {
                                C7863 c7863 = new C7863(str);
                                String strTrim = c7863.m24978("=").trim();
                                String strTrim2 = c7863.m24985(";").trim();
                                if (strTrim.length() > 0 && !this.f13190.containsKey(strTrim)) {
                                    mo11641(strTrim, strTrim2);
                                }
                            }
                        }
                    }
                    Iterator<String> it = value.iterator();
                    while (it.hasNext()) {
                        mo11652(key, m16717(it.next()));
                    }
                }
            }
        }

        /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
        public final void m16725() {
            C4215 c4215 = this.f13214;
            if (c4215 != null) {
                try {
                    c4215.close();
                } catch (IOException unused) {
                } catch (Throwable th) {
                    this.f13214 = null;
                    throw th;
                }
                this.f13214 = null;
            }
            HttpURLConnection httpURLConnection = this.f13215;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
                this.f13215 = null;
            }
        }

        public C5378(HttpURLConnection httpURLConnection, C5377 c5377, C5378 c5378) throws IOException {
            super();
            this.f13218 = false;
            this.f13219 = false;
            this.f13220 = 0;
            this.f13215 = httpURLConnection;
            this.f13221 = c5377;
            this.f1460 = InterfaceC4103.EnumC4104.valueOf(httpURLConnection.getRequestMethod());
            this.f1459 = httpURLConnection.getURL();
            this.f13211 = httpURLConnection.getResponseCode();
            this.f13212 = httpURLConnection.getResponseMessage();
            this.f13217 = httpURLConnection.getContentType();
            LinkedHashMap<String, List<String>> linkedHashMapM16714 = m16714(httpURLConnection);
            m16724(linkedHashMapM16714);
            C4219.m12154(c5377, this.f1459, linkedHashMapM16714);
            if (c5378 != null) {
                for (Map.Entry entry : c5378.mo11650().entrySet()) {
                    if (!mo11653((String) entry.getKey())) {
                        mo11641((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                c5378.m16725();
                int i = c5378.f13220 + 1;
                this.f13220 = i;
                if (i >= 20) {
                    throw new IOException(String.format("Too many redirects occurred trying to load URL %s", c5378.mo11644()));
                }
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۨ۠$ۥ۟۟۟, reason: contains not printable characters */
    public static class C5377 extends AbstractC0732<InterfaceC4103.InterfaceC4105> implements InterfaceC4103.InterfaceC4105 {

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public Proxy f13193;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public int f13194;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public int f13195;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public boolean f13196;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final Collection<InterfaceC4103.InterfaceC0325> f13197;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public String f13198;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public boolean f13199;

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public boolean f13200;

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public C6617 f13201;

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public boolean f13202;

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public String f13203;

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public SSLSocketFactory f13204;

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public CookieManager f13205;

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public InterfaceC7102 f13206;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public volatile boolean f13207;

        static {
            System.setProperty("sun.net.http.allowRestrictedHeaders", "true");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C5377() {
            super();
            this.f13198 = null;
            this.f13199 = false;
            this.f13200 = false;
            this.f13202 = false;
            this.f13203 = C4300.f8818;
            this.f13207 = false;
            this.f13194 = 30000;
            this.f13195 = 2097152;
            this.f13196 = true;
            this.f13197 = new ArrayList();
            this.f1460 = InterfaceC4103.EnumC4104.GET;
            mo11652("Accept-Encoding", "gzip");
            mo11652(C5375.f13181, C5375.f13180);
            this.f13201 = C6617.m20995();
            this.f13205 = new CookieManager();
        }

        @Override // Yue.InterfaceC4103.InterfaceC4105
        public Collection<InterfaceC4103.InterfaceC0325> data() {
            return this.f13197;
        }

        @Override // Yue.InterfaceC4103.InterfaceC4105
        /* JADX INFO: renamed from: ۥ */
        public int mo1063() {
            return this.f13194;
        }

        @Override // Yue.C5375.AbstractC0732, Yue.InterfaceC4103.InterfaceC0324
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public /* bridge */ /* synthetic */ InterfaceC4103.InterfaceC0324 mo11639(String str, String str2) {
            return super.mo11639(str, str2);
        }

        @Override // Yue.InterfaceC4103.InterfaceC4105
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public InterfaceC4103.InterfaceC4105 mo11664(boolean z) {
            this.f13196 = z;
            return this;
        }

        @Override // Yue.C5375.AbstractC0732, Yue.InterfaceC4103.InterfaceC0324
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public /* bridge */ /* synthetic */ InterfaceC4103.InterfaceC0324 mo11640(InterfaceC4103.EnumC4104 enumC4104) {
            return super.mo11640(enumC4104);
        }

        @Override // Yue.InterfaceC4103.InterfaceC4105
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public InterfaceC4103.InterfaceC4105 mo11665(String str) {
            this.f13198 = str;
            return this;
        }

        @Override // Yue.InterfaceC4103.InterfaceC4105
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
        public InterfaceC4103.InterfaceC4105 mo11666(InterfaceC7102 interfaceC7102) {
            this.f13206 = interfaceC7102;
            return this;
        }

        @Override // Yue.C5375.AbstractC0732, Yue.InterfaceC4103.InterfaceC0324
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
        public /* bridge */ /* synthetic */ InterfaceC4103.InterfaceC0324 mo11641(String str, String str2) {
            return super.mo11641(str, str2);
        }

        @Override // Yue.InterfaceC4103.InterfaceC4105
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        public InterfaceC4103.InterfaceC4105 mo11669(int i) {
            C8159.m26904(i >= 0, "maxSize must be 0 (unlimited) or larger");
            this.f13195 = i;
            return this;
        }

        @Override // Yue.InterfaceC4103.InterfaceC4105
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public InterfaceC4103.InterfaceC4105 mo11670(boolean z) {
            this.f13199 = z;
            return this;
        }

        @Override // Yue.InterfaceC4103.InterfaceC4105
        /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
        public void mo11671(SSLSocketFactory sSLSocketFactory) {
            this.f13204 = sSLSocketFactory;
        }

        @Override // Yue.InterfaceC4103.InterfaceC4105
        /* JADX INFO: renamed from: ۥ۟۟۠۟ */
        public InterfaceC4103.InterfaceC4105 mo11672(String str) {
            C8159.m26912(str, "charset");
            if (!Charset.isSupported(str)) {
                throw new IllegalCharsetNameException(str);
            }
            this.f13203 = str;
            return this;
        }

        @Override // Yue.InterfaceC4103.InterfaceC4105
        /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
        public InterfaceC4103.InterfaceC4105 mo11674(boolean z) {
            this.f13200 = z;
            return this;
        }

        @Override // Yue.C5375.AbstractC0732, Yue.InterfaceC4103.InterfaceC0324
        /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
        public /* bridge */ /* synthetic */ InterfaceC4103.InterfaceC0324 mo11642(URL url) {
            return super.mo11642(url);
        }

        @Override // Yue.InterfaceC4103.InterfaceC4105
        /* JADX INFO: renamed from: ۥۣ۟۟۠ */
        public boolean mo11675() {
            return this.f13199;
        }

        @Override // Yue.InterfaceC4103.InterfaceC4105
        /* JADX INFO: renamed from: ۥ۟۟۠ۤ */
        public String mo11676() {
            return this.f13203;
        }

        @Override // Yue.C5375.AbstractC0732, Yue.InterfaceC4103.InterfaceC0324
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ */
        public /* bridge */ /* synthetic */ boolean mo11643(String str) {
            return super.mo11643(str);
        }

        @Override // Yue.InterfaceC4103.InterfaceC4105
        /* JADX INFO: renamed from: ۥ۟۟۠ۨ */
        public boolean mo11677() {
            return this.f13200;
        }

        @Override // Yue.C5375.AbstractC0732, Yue.InterfaceC4103.InterfaceC0324
        /* JADX INFO: renamed from: ۥ۟۟ۡ */
        public /* bridge */ /* synthetic */ URL mo11644() {
            return super.mo11644();
        }

        @Override // Yue.C5375.AbstractC0732, Yue.InterfaceC4103.InterfaceC0324
        /* JADX INFO: renamed from: ۥ۟۟ۡ۟ */
        public /* bridge */ /* synthetic */ boolean mo11645(String str, String str2) {
            return super.mo11645(str, str2);
        }

        @Override // Yue.C5375.AbstractC0732, Yue.InterfaceC4103.InterfaceC0324
        /* JADX INFO: renamed from: ۥ۟۟ۡ۠ */
        public /* bridge */ /* synthetic */ InterfaceC4103.EnumC4104 mo11646() {
            return super.mo11646();
        }

        @Override // Yue.InterfaceC4103.InterfaceC4105
        /* JADX INFO: renamed from: ۥ۟۟ۡۡ */
        public SSLSocketFactory mo11678() {
            return this.f13204;
        }

        @Override // Yue.C5375.AbstractC0732, Yue.InterfaceC4103.InterfaceC0324
        /* JADX INFO: renamed from: ۥ۟۟ۡۢ */
        public /* bridge */ /* synthetic */ InterfaceC4103.InterfaceC0324 mo11647(String str) {
            return super.mo11647(str);
        }

        @Override // Yue.InterfaceC4103.InterfaceC4105
        /* JADX INFO: renamed from: ۥۣ۟۟ۡ */
        public Proxy mo11679() {
            return this.f13193;
        }

        @Override // Yue.C5375.AbstractC0732, Yue.InterfaceC4103.InterfaceC0324
        /* JADX INFO: renamed from: ۥ۟۟ۡۥ */
        public /* bridge */ /* synthetic */ List mo11648(String str) {
            return super.mo11648(str);
        }

        @Override // Yue.C5375.AbstractC0732, Yue.InterfaceC4103.InterfaceC0324
        /* JADX INFO: renamed from: ۥ۟۟ۡۦ */
        public /* bridge */ /* synthetic */ Map mo11649() {
            return super.mo11649();
        }

        @Override // Yue.C5375.AbstractC0732, Yue.InterfaceC4103.InterfaceC0324
        /* JADX INFO: renamed from: ۥ۟۟ۡۧ */
        public /* bridge */ /* synthetic */ Map mo11650() {
            return super.mo11650();
        }

        @Override // Yue.C5375.AbstractC0732, Yue.InterfaceC4103.InterfaceC0324
        /* JADX INFO: renamed from: ۥ۟۟ۢ */
        public /* bridge */ /* synthetic */ String mo11651(String str) {
            return super.mo11651(str);
        }

        @Override // Yue.InterfaceC4103.InterfaceC4105
        /* JADX INFO: renamed from: ۥ۟۟ۢ۠ */
        public InterfaceC7102 mo11681() {
            return this.f13206;
        }

        @Override // Yue.InterfaceC4103.InterfaceC4105
        /* JADX INFO: renamed from: ۥ۟۟ۢۡ */
        public boolean mo11682() {
            return this.f13196;
        }

        @Override // Yue.C5375.AbstractC0732, Yue.InterfaceC4103.InterfaceC0324
        /* JADX INFO: renamed from: ۥۣ۟۟ۢ */
        public /* bridge */ /* synthetic */ InterfaceC4103.InterfaceC0324 mo11652(String str, String str2) {
            return super.mo11652(str, str2);
        }

        @Override // Yue.C5375.AbstractC0732, Yue.InterfaceC4103.InterfaceC0324
        /* JADX INFO: renamed from: ۥ۟۟ۢۤ */
        public /* bridge */ /* synthetic */ boolean mo11653(String str) {
            return super.mo11653(str);
        }

        @Override // Yue.C5375.AbstractC0732, Yue.InterfaceC4103.InterfaceC0324
        /* JADX INFO: renamed from: ۥ۟۟ۢۥ */
        public /* bridge */ /* synthetic */ InterfaceC4103.InterfaceC0324 mo11654(String str) {
            return super.mo11654(str);
        }

        @Override // Yue.C5375.AbstractC0732, Yue.InterfaceC4103.InterfaceC0324
        /* JADX INFO: renamed from: ۥ۟۟ۢۦ */
        public /* bridge */ /* synthetic */ String mo11655(String str) {
            return super.mo11655(str);
        }

        @Override // Yue.C5375.AbstractC0732, Yue.InterfaceC4103.InterfaceC0324
        /* JADX INFO: renamed from: ۥ۟۟ۢۧ */
        public /* bridge */ /* synthetic */ Map mo11656() {
            return super.mo11656();
        }

        @Override // Yue.InterfaceC4103.InterfaceC4105
        /* JADX INFO: renamed from: ۥۣ۟۟ */
        public String mo11683() {
            return this.f13198;
        }

        @Override // Yue.InterfaceC4103.InterfaceC4105
        /* JADX INFO: renamed from: ۥۣ۟۟۟ */
        public int mo11684() {
            return this.f13195;
        }

        @Override // Yue.InterfaceC4103.InterfaceC4105
        /* JADX INFO: renamed from: ۥۣ۟۟ۢ */
        public C6617 mo11685() {
            return this.f13201;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
        public CookieManager m16707() {
            return this.f13205;
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟۟ۡۨ(LYue/ۥ۟ۦۧۤ$ۥ۟;)LYue/ۥ۟ۦۧۤ$ۥ۟۟۟; */
        @Override // Yue.InterfaceC4103.InterfaceC4105
        /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public C5377 mo11680(InterfaceC4103.InterfaceC0325 interfaceC0325) {
            C8159.m26912(interfaceC0325, "keyval");
            this.f13197.add(interfaceC0325);
            return this;
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟۟(LYue/ۥۣۡۧۦ;)LYue/ۥ۟ۦۧۤ$ۥ۟۟۟; */
        @Override // Yue.InterfaceC4103.InterfaceC4105
        /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public C5377 mo11663(C6617 c6617) {
            this.f13201 = c6617;
            this.f13202 = true;
            return this;
        }

        /* JADX DEBUG: Method merged with bridge method: ۥۣ۟۟۟(Ljava/lang/String;I)LYue/ۥ۟ۦۧۤ$ۥ۟۟۟; */
        @Override // Yue.InterfaceC4103.InterfaceC4105
        /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public C5377 mo11667(String str, int i) {
            this.f13193 = new Proxy(Proxy.Type.HTTP, InetSocketAddress.createUnresolved(str, i));
            return this;
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟۟۠۠(Ljava/net/Proxy;)LYue/ۥ۟ۦۧۤ$ۥ۟۟۟; */
        @Override // Yue.InterfaceC4103.InterfaceC4105
        /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public C5377 mo11673(Proxy proxy) {
            this.f13193 = proxy;
            return this;
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟۟۟ۥ(I)LYue/ۥ۟ۦۧۤ$ۥ۟۟۟; */
        @Override // Yue.InterfaceC4103.InterfaceC4105
        /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public C5377 mo11668(int i) {
            C8159.m26904(i >= 0, "Timeout milliseconds must be 0 (infinite) or greater");
            this.f13194 = i;
            return this;
        }

        public C5377(C5377 c5377) {
            super(c5377);
            this.f13198 = null;
            this.f13199 = false;
            this.f13200 = false;
            this.f13202 = false;
            this.f13203 = C4300.f8818;
            this.f13207 = false;
            this.f13193 = c5377.f13193;
            this.f13203 = c5377.f13203;
            this.f13194 = c5377.f13194;
            this.f13195 = c5377.f13195;
            this.f13196 = c5377.f13196;
            this.f13197 = new ArrayList();
            this.f13199 = c5377.f13199;
            this.f13200 = c5377.f13200;
            this.f13201 = c5377.f13201.m21007();
            this.f13202 = c5377.f13202;
            this.f13204 = c5377.f13204;
            this.f13205 = c5377.f13205;
            this.f13206 = c5377.f13206;
            this.f13207 = false;
        }
    }
}
