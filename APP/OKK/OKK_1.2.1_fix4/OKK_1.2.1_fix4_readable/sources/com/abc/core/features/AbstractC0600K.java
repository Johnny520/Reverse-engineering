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
    public static final C0422g f1833a = new C0422g("<appmsg\\b[\\s\\S]*?<type>\\s*(\\d+)\\s*</type>", 0);

    /* JADX INFO: renamed from: b */
    public static final C0422g f1834b = new C0422g("&lt;appmsg\\b[\\s\\S]*?&lt;type&gt;\\s*(\\d+)\\s*&lt;/type&gt;", 0);

    /* JADX INFO: renamed from: a */
    public static boolean m1486a(String str, int i2) {
        String str2;
        AbstractC0307g.m703e(str, "content");
        if (i2 == 49 || (65535 & i2) == 49) {
            i2 = 49;
        }
        if (i2 == 1) {
            return true;
        }
        if (i2 == 49 && !AbstractC0425j.m1013R0(str)) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            AbstractC0307g.m702d(lowerCase, "toLowerCase(...)");
            if (AbstractC0425j.m1005J0(lowerCase, "<refermsg", false) || AbstractC0425j.m1005J0(lowerCase, "&lt;refermsg", false)) {
                C0422g c0422g = f1833a;
                c0422g.getClass();
                Matcher matcher = c0422g.f939a.matcher(str);
                AbstractC0307g.m702d(matcher, "matcher(...)");
                C0419d c0419dM875a = AbstractC0358S.m875a(matcher, 0, str);
                if (c0419dM875a == null || (str2 = (String) AbstractC0181l.m545q0(c0419dM875a.m1002a(), 1)) == null) {
                    C0422g c0422g2 = f1834b;
                    c0422g2.getClass();
                    Matcher matcher2 = c0422g2.f939a.matcher(str);
                    AbstractC0307g.m702d(matcher2, "matcher(...)");
                    C0419d c0419dM875a2 = AbstractC0358S.m875a(matcher2, 0, str);
                    str2 = c0419dM875a2 != null ? (String) AbstractC0181l.m545q0(c0419dM875a2.m1002a(), 1) : null;
                }
                return AbstractC0307g.m699a(str2, "57");
            }
        }
        return false;
    }
}
