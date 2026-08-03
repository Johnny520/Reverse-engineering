package Yue;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.CookieStore;
import java.net.Proxy;
import java.net.URL;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۧۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC4103 {

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۧۤ$ۥ */
    public interface InterfaceC0324<T extends InterfaceC0324<T>> {
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        T mo11639(String str, String str2);

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        T mo11640(EnumC4104 enumC4104);

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        T mo11641(String str, String str2);

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        T mo11642(URL url);

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        boolean mo11643(String str);

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        URL mo11644();

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        boolean mo11645(String str, String str2);

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        EnumC4104 mo11646();

        /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
        T mo11647(String str);

        /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
        List<String> mo11648(String str);

        /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
        Map<String, List<String>> mo11649();

        /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
        Map<String, String> mo11650();

        /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
        String mo11651(String str);

        /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
        T mo11652(String str, String str2);

        /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
        boolean mo11653(String str);

        /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
        T mo11654(String str);

        /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
        String mo11655(String str);

        /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
        Map<String, String> mo11656();
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۧۤ$ۥ۟ */
    public interface InterfaceC0325 {
        String key();

        InterfaceC0325 value(String str);

        String value();

        /* JADX INFO: renamed from: ۥ۟ */
        String mo1061();

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        InterfaceC0325 mo11657(InputStream inputStream);

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        InterfaceC0325 mo11658(String str);

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        InterfaceC0325 mo11659(String str);

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        boolean mo11660();

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        InputStream mo11661();
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۧۤ$ۥ۟۟, reason: contains not printable characters */
    public enum EnumC4104 {
        GET(false),
        POST(true),
        PUT(true),
        DELETE(true),
        PATCH(true),
        HEAD(false),
        OPTIONS(false),
        TRACE(false);


        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final boolean f8199;

        EnumC4104(boolean z) {
            this.f8199 = z;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final boolean m11662() {
            return this.f8199;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۧۤ$ۥ۟۟۟, reason: contains not printable characters */
    public interface InterfaceC4105 extends InterfaceC0324<InterfaceC4105> {
        Collection<InterfaceC0325> data();

        /* JADX INFO: renamed from: ۥ */
        int mo1063();

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        InterfaceC4105 mo11663(C6617 c6617);

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        InterfaceC4105 mo11664(boolean z);

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        InterfaceC4105 mo11665(String str);

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        default InterfaceC4105 mo11666(InterfaceC7102 interfaceC7102) {
            throw new UnsupportedOperationException();
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        InterfaceC4105 mo11667(String str, int i);

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        InterfaceC4105 mo11668(int i);

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        InterfaceC4105 mo11669(int i);

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        InterfaceC4105 mo11670(boolean z);

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        void mo11671(SSLSocketFactory sSLSocketFactory);

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        InterfaceC4105 mo11672(String str);

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        InterfaceC4105 mo11673(Proxy proxy);

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        InterfaceC4105 mo11674(boolean z);

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        boolean mo11675();

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        String mo11676();

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        boolean mo11677();

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        SSLSocketFactory mo11678();

        /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
        Proxy mo11679();

        /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
        InterfaceC4105 mo11680(InterfaceC0325 interfaceC0325);

        /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
        default InterfaceC7102 mo11681() {
            throw new UnsupportedOperationException();
        }

        /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
        boolean mo11682();

        /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
        String mo11683();

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        int mo11684();

        /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
        C6617 mo11685();
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۧۤ$ۥ۟۟۟۟, reason: contains not printable characters */
    public interface InterfaceC4106 extends InterfaceC0324<InterfaceC4106> {
        /* JADX INFO: renamed from: ۥ۟ */
        String mo1064();

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        String mo11686();

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        BufferedInputStream mo11687();

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        String mo11688();

        /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
        InterfaceC4106 mo11689(String str);

        /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
        InterfaceC4106 mo11690();

        /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
        C4483 mo11691() throws IOException;

        /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
        int mo11692();

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        String mo11693();

        /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
        byte[] mo11694();
    }

    C4483 get() throws IOException;

    /* JADX INFO: renamed from: ۥ */
    InterfaceC4103 mo1059(String str);

    /* JADX INFO: renamed from: ۥ۟ */
    InterfaceC4105 mo1060();

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    InterfaceC4103 mo11602(C6617 c6617);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    InterfaceC4103 mo11603(String str, String str2);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    InterfaceC4103 mo11604(boolean z);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    InterfaceC4103 mo11605(EnumC4104 enumC4104);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    InterfaceC4103 mo11606(String str);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    default InterfaceC4103 mo11607(InterfaceC7102 interfaceC7102) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    InterfaceC4103 mo11608(String str, int i);

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    InterfaceC4103 mo11609(String str, String str2);

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    InterfaceC4103 mo11610(int i);

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    InterfaceC4103 mo11611(int i);

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    InterfaceC4103 mo11612(boolean z);

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    InterfaceC4103 mo11613(SSLSocketFactory sSLSocketFactory);

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    InterfaceC4106 mo11614() throws IOException;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    InterfaceC4103 mo11615(String str);

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    InterfaceC4103 mo11616(Proxy proxy);

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    InterfaceC4103 mo11617(boolean z);

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    InterfaceC4103 mo11618(URL url);

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    InterfaceC4103 mo11619(Collection<InterfaceC0325> collection);

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    InterfaceC4103 mo11620(Map<String, String> map);

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    InterfaceC4103 mo11621(String str, String str2, InputStream inputStream, String str3);

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    InterfaceC4103 mo11622(String str);

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    InterfaceC4103 mo11623();

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    InterfaceC4106 mo11624();

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    InterfaceC4103 mo11625(CookieStore cookieStore);

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    InterfaceC4103 mo11626(String str, String str2);

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    CookieStore mo11627();

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    InterfaceC4103 mo11628(String str);

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    InterfaceC4103 mo11629(Map<String, String> map);

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    InterfaceC4103 mo11630(String str, String str2, InputStream inputStream);

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    C4483 mo11631() throws IOException;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    InterfaceC4103 mo11632(String... strArr);

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    default InterfaceC4103 m11633(String str) {
        return mo11623().mo11622(str);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    InterfaceC4103 mo11634(InterfaceC4106 interfaceC4106);

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    InterfaceC0325 mo11635(String str);

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    InterfaceC4103 mo11636(Map<String, String> map);

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    InterfaceC4103 mo11637(InterfaceC4105 interfaceC4105);

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    default InterfaceC4103 m11638(URL url) {
        return mo11623().mo11618(url);
    }
}
