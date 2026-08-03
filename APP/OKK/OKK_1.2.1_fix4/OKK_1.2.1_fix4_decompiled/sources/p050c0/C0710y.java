package p050c0;

import java.util.List;
import p009E0.AbstractC0182m;
import p042W0.AbstractC0425j;

/* JADX INFO: renamed from: c0.y */
/* JADX INFO: loaded from: classes.dex */
public final class C0710y {

    /* JADX INFO: renamed from: a */
    public static final List f2234a;

    /* JADX INFO: renamed from: b */
    public static volatile long f2235b;

    /* JADX INFO: renamed from: c */
    public static volatile boolean f2236c;

    /* JADX INFO: renamed from: d */
    public static volatile boolean f2237d;

    /* JADX INFO: renamed from: e */
    public static volatile boolean f2238e;

    /* JADX INFO: renamed from: f */
    public static volatile boolean f2239f;

    /* JADX INFO: renamed from: g */
    public static volatile List f2240g;

    static {
        List listM556h0 = AbstractC0182m.m556h0("微信", "通讯录", "发现", "我");
        f2234a = listM556h0;
        f2238e = true;
        f2239f = true;
        f2240g = listM556h0;
    }

    /* JADX INFO: renamed from: a */
    public static void m1806a(long j2) {
        if (j2 - f2235b >= 800 || f2235b <= 0) {
            f2235b = j2;
            C0661h1 c0661h1 = C0661h1.f2048a;
            f2236c = C0661h1.m1661c("bottom_tab_hide_title", false);
            f2237d = C0661h1.m1661c("bottom_tab_floating", false);
            f2238e = C0661h1.m1661c("bottom_tab_floating_labels", true);
            f2239f = C0661h1.m1661c("bottom_tab_floating_badge", true);
            List list = f2234a;
            String strM1662d = C0661h1.m1662d("bottom_tab_title_chats", (String) list.get(0));
            if (AbstractC0425j.m1013R0(strM1662d)) {
                strM1662d = (String) list.get(0);
            }
            String strM1662d2 = C0661h1.m1662d("bottom_tab_title_contacts", (String) list.get(1));
            if (AbstractC0425j.m1013R0(strM1662d2)) {
                strM1662d2 = (String) list.get(1);
            }
            String strM1662d3 = C0661h1.m1662d("bottom_tab_title_discover", (String) list.get(2));
            if (AbstractC0425j.m1013R0(strM1662d3)) {
                strM1662d3 = (String) list.get(2);
            }
            String strM1662d4 = C0661h1.m1662d("bottom_tab_title_me", (String) list.get(3));
            if (AbstractC0425j.m1013R0(strM1662d4)) {
                strM1662d4 = (String) list.get(3);
            }
            f2240g = AbstractC0182m.m556h0(strM1662d, strM1662d2, strM1662d3, strM1662d4);
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1807b() {
        m1806a(System.currentTimeMillis());
        return f2237d;
    }

    /* JADX INFO: renamed from: c */
    public static List m1808c() {
        m1806a(System.currentTimeMillis());
        return f2240g;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m1809d() {
        m1806a(System.currentTimeMillis());
        if (f2237d) {
            return false;
        }
        return f2236c;
    }
}
