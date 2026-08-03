package com.abc.core.features;

import java.util.List;
import p009E0.AbstractC0182m;
import p042W0.AbstractC0425j;

/* JADX INFO: renamed from: c0.y */
/* JADX INFO: loaded from: classes.dex */
public final class BottomTabConfig {

    /* JADX INFO: renamed from: a */
    public static final List f2234a = null;

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
        List r02 = AbstractC0182m.m556h0(new String[]{"微信", "通讯录", "发现", "我"});
        f2234a = r02;
        f2238e = true;
        f2239f = true;
        f2240g = r02;
    }

    /* JADX INFO: renamed from: a */
    public static void m1806a(long r5) {
        if ((r5 - f2235b) < 800) goto L5;
    L7:
        f2235b = r5;
        ConfigStore r52 = ConfigStore.f2048a;
        f2236c = ConfigStore.m1661c("bottom_tab_hide_title", false);
        f2237d = ConfigStore.m1661c("bottom_tab_floating", false);
        f2238e = ConfigStore.m1661c("bottom_tab_floating_labels", true);
        f2239f = ConfigStore.m1661c("bottom_tab_floating_badge", true);
        List r53 = f2234a;
        String r1 = ConfigStore.m1662d("bottom_tab_title_chats", (String) r53.get(0));
        if (AbstractC0425j.m1013R0(r1) == false) goto L10;
        r1 = (String) r53.get(0);
    L10:
        String r6 = ConfigStore.m1662d("bottom_tab_title_contacts", (String) r53.get(1));
        if (AbstractC0425j.m1013R0(r6) == false) goto L13;
        r6 = (String) r53.get(1);
    L13:
        String r2 = ConfigStore.m1662d("bottom_tab_title_discover", (String) r53.get(2));
        if (AbstractC0425j.m1013R0(r2) == false) goto L16;
        r2 = (String) r53.get(2);
    L16:
        String r3 = ConfigStore.m1662d("bottom_tab_title_me", (String) r53.get(3));
        if (AbstractC0425j.m1013R0(r3) == false) goto L19;
        r3 = (String) r53.get(3);
    L19:
        f2240g = AbstractC0182m.m556h0(new String[]{r1, r6, r2, r3});
        return;
    L5:
        if (f2235b <= 0) goto L7;
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
        if (f2237d == false) goto L6;
        return false;
    L6:
        return f2236c;
    }
}
