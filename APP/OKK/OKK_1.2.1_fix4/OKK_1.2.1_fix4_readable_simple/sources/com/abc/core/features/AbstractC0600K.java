package com.abc.core.features;

import java.util.Locale;
import java.util.regex.Matcher;
import p009E0.AbstractC0181l;
import p031Q0.AbstractC0307g;
import p037U.AbstractC0358S;
import p042W0.AbstractC0425j;
import p042W0.C0419d;
import p042W0.C0422g;

/* JADX INFO: renamed from: c0.K */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0600K {

    /* JADX INFO: renamed from: a */
    public static final C0422g f1833a = null;

    /* JADX INFO: renamed from: b */
    public static final C0422g f1834b = null;

    static {
        f1833a = new C0422g("<appmsg\\b[\\s\\S]*?<type>\\s*(\\d+)\\s*</type>", 0);
        f1834b = new C0422g("&lt;appmsg\\b[\\s\\S]*?&lt;type&gt;\\s*(\\d+)\\s*&lt;/type&gt;", 0);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1486a(String r3, int r4) {
        AbstractC0307g.m703e(r3, "content");
        if (r4 != 49) goto L6;
    L4:
        r4 = 49;
    L9:
        if (r4 != 1) goto L11;
        return true;
    L11:
        if (r4 == 49) goto L14;
    L31:
        return false;
    L14:
        if (AbstractC0425j.m1013R0(r3) == true) goto L31;
        String r42 = r3.toLowerCase(Locale.ROOT);
        AbstractC0307g.m702d(r42, "toLowerCase(...)");
        if (AbstractC0425j.m1005J0(r42, "<refermsg", false) == false) goto L19;
    L20:
        C0422g r43 = f1833a;
        r43.getClass();
        Matcher r44 = r43.f939a.matcher(r3);
        AbstractC0307g.m702d(r44, "matcher(...)");
        C0419d r45 = AbstractC0358S.m875a(r44, 0, r3);
        if (r45 == null) goto L24;
        String r46 = (String) AbstractC0181l.m545q0(r45.m1002a(), 1);
        if (r46 == null) goto L24;
    L29:
        return AbstractC0307g.m699a(r46, "57");
    L24:
        C0422g r47 = f1834b;
        r47.getClass();
        Matcher r48 = r47.f939a.matcher(r3);
        AbstractC0307g.m702d(r48, "matcher(...)");
        C0419d r32 = AbstractC0358S.m875a(r48, 0, r3);
        if (r32 == null) goto L27;
        r46 = (String) AbstractC0181l.m545q0(r32.m1002a(), 1);
        goto L29
    L27:
        r46 = null;
        goto L29
    L19:
        if (AbstractC0425j.m1005J0(r42, "&lt;refermsg", false) == false) goto L31;
    L6:
        if ((65535 & r4) != 49) goto L9;
        goto L4
    }
}
