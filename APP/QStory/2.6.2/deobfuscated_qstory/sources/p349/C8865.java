package p349;

import androidx.compose.animation.core.C0325;
import com.alibaba.fastjson2.AbstractC2904;
import com.bumptech.glide.AbstractC3056;
import com.google.gson.C3251;
import com.google.gson.C3252;
import java.util.ArrayList;
import java.util.Locale;
import p015.C6200;
import p015.C6216;
import p015.InterfaceC6228;
import p016.C6231;
import p021.C6258;
import p035.AbstractC6340;
import p253.AbstractC8189;
import p348.InterfaceC8859;
import p348.InterfaceC8860;
import p348.InterfaceC8863;
import p348.InterfaceC8864;
import p355.C8893;
import p355.C8894;
import p398.C9152;

/* JADX INFO: renamed from: 飘花落叶言苏哲子兰楪世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8865 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static String f24975;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C8865 f24976;

    static {
        "https://qstory.suzhelan.top";
        f24976 = new C8865();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final InterfaceC8859 m14507() {
        C0325 c0325 = new C0325(19);
        c0325.m971("https://qstory.suzhelan.top");
        f24976.getClass();
        c0325.f1095 = m14511(true);
        ((ArrayList) c0325.f1094).add(new C8893());
        Object objM547 = c0325.m970().m547(InterfaceC8859.class);
        "create(...)";
        objM547.getClass();
        return (InterfaceC8859) objM547;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final InterfaceC8860 m14508() {
        C0325 c0325 = new C0325(19);
        c0325.m971("https://qstory.suzhelan.top");
        f24976.getClass();
        c0325.f1095 = m14511(false);
        ((ArrayList) c0325.f1094).add(new C8893());
        Object objM547 = c0325.m970().m547(InterfaceC8860.class);
        "create(...)";
        objM547.getClass();
        return (InterfaceC8860) objM547;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final InterfaceC8863 m14509() {
        C0325 c0325 = new C0325(19);
        c0325.m971("https://qstory.suzhelan.top");
        f24976.getClass();
        c0325.f1095 = m14511(false);
        ((ArrayList) c0325.f1094).add(new C8893());
        Object objM547 = c0325.m970().m547(InterfaceC8863.class);
        "create(...)";
        objM547.getClass();
        return (InterfaceC8863) objM547;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final InterfaceC8864 m14510() {
        C3251 c3251 = new C3251();
        c3251.m7347();
        C3252 c3252M7348 = c3251.m7348();
        C0325 c0325 = new C0325(19);
        c0325.m971("https://qstory.suzhelan.top");
        f24976.getClass();
        c0325.f1095 = m14511(false);
        ((ArrayList) c0325.f1094).add(new C9152(c3252M7348));
        Object objM547 = c0325.m970().m547(InterfaceC8864.class);
        "create(...)";
        objM547.getClass();
        return (InterfaceC8864) objM547;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C6200 m14511(boolean z) {
        int i = 1;
        int i2 = 2;
        C8894 c8894 = new C8894(AbstractC8189.m13659(AbstractC2904.m6270("https://doh.pub/dns-query", AbstractC8189.m13659("1.12.12.12", "120.53.53.53")), AbstractC2904.m6270("https://dns.google/dns-query", AbstractC8189.m13659("8.8.8.8", "8.8.4.4")), AbstractC2904.m6270("https://cloudflare-dns.com/dns-query", AbstractC8189.m13659("1.1.1.1", "1.0.0.1")), InterfaceC6228.f17161));
        String upperCase = f24975;
        if (upperCase == null) {
            try {
                String strM6690 = AbstractC3056.m6690(AbstractC6340.f17463);
                "getApkSignatureMD5(...)";
                Locale locale = Locale.getDefault();
                "getDefault(...)";
                locale.getClass();
                upperCase = strM6690.toUpperCase(locale);
                "toUpperCase(...)";
                upperCase.getClass();
                f24975 = upperCase;
            } catch (Exception unused) {
                upperCase = null;
            }
        }
        C6258 c6258 = new C6258(upperCase);
        C6216 c6216M11646 = new C6200().m11646();
        ArrayList arrayList = c6216M11646.f17076;
        if (c8894 != c6216M11646.f17094) {
            c6216M11646.f17068 = null;
        }
        c6216M11646.f17094 = c8894;
        arrayList.add(new C6231(i));
        arrayList.add(new C6231(i2));
        if (z) {
            arrayList.add(c6258);
        }
        return new C6200(c6216M11646);
    }
}
