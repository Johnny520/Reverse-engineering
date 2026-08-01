package p361;

import androidx.compose.animation.core.C1171;
import java.util.ArrayList;
import java.util.Locale;
import p023.C6956;
import p023.C6972;
import p023.InterfaceC6984;
import p028.C7049;
import p032.C7066;
import p050.AbstractC7173;
import p050.AbstractC7176;
import p052.AbstractC7187;
import p191.AbstractC8568;
import p363.C9668;
import p363.C9669;
import p364.InterfaceC9670;
import p364.InterfaceC9671;
import p364.InterfaceC9674;

/* JADX INFO: renamed from: 飘花落叶言苏哲子世兰楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9663 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static String f25280;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C9663 f25281;

    static {
        "https://qstory.suzhelan.top";
        f25281 = new C9663();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final InterfaceC9670 m15047() {
        C1171 c1171 = new C1171(19);
        c1171.m1531("https://qstory.suzhelan.top");
        f25281.getClass();
        c1171.f1440 = m15050(true);
        ((ArrayList) c1171.f1439).add(new C9668());
        Object objM1108 = c1171.m1530().m1108(InterfaceC9670.class);
        "create(...)";
        objM1108.getClass();
        return (InterfaceC9670) objM1108;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final InterfaceC9671 m15048() {
        C1171 c1171 = new C1171(19);
        c1171.m1531("https://qstory.suzhelan.top");
        f25281.getClass();
        c1171.f1440 = m15050(false);
        ((ArrayList) c1171.f1439).add(new C9668());
        Object objM1108 = c1171.m1530().m1108(InterfaceC9671.class);
        "create(...)";
        objM1108.getClass();
        return (InterfaceC9671) objM1108;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final InterfaceC9674 m15049() {
        C1171 c1171 = new C1171(19);
        c1171.m1531("https://qstory.suzhelan.top");
        f25281.getClass();
        c1171.f1440 = m15050(false);
        ((ArrayList) c1171.f1439).add(new C9668());
        Object objM1108 = c1171.m1530().m1108(InterfaceC9674.class);
        "create(...)";
        objM1108.getClass();
        return (InterfaceC9674) objM1108;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C6956 m15050(boolean z) {
        int i = 1;
        int i2 = 2;
        C9669 c9669 = new C9669(AbstractC7176.m12490(AbstractC8568.m13638("https://doh.pub/dns-query", AbstractC7176.m12490("1.12.12.12", "120.53.53.53")), AbstractC8568.m13638("https://dns.google/dns-query", AbstractC7176.m12490("8.8.8.8", "8.8.4.4")), AbstractC8568.m13638("https://cloudflare-dns.com/dns-query", AbstractC7176.m12490("1.1.1.1", "1.0.0.1")), InterfaceC6984.f17267));
        String upperCase = f25280;
        if (upperCase == null) {
            try {
                String strM12445 = AbstractC7173.m12445(AbstractC7187.f17855);
                "getApkSignatureMD5(...)";
                Locale locale = Locale.getDefault();
                "getDefault(...)";
                locale.getClass();
                upperCase = strM12445.toUpperCase(locale);
                "toUpperCase(...)";
                upperCase.getClass();
                f25280 = upperCase;
            } catch (Exception unused) {
                upperCase = null;
            }
        }
        C7049 c7049 = new C7049(upperCase);
        C6972 c6972M12076 = new C6956().m12076();
        ArrayList arrayList = c6972M12076.f17182;
        if (c9669 != c6972M12076.f17200) {
            c6972M12076.f17174 = null;
        }
        c6972M12076.f17200 = c9669;
        arrayList.add(new C7066(i));
        arrayList.add(new C7066(i2));
        if (z) {
            arrayList.add(c7049);
        }
        return new C6956(c6972M12076);
    }
}
