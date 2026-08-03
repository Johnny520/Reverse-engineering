package io.sentry.android.replay;

import io.sentry.C1871f;
import io.sentry.EnumC1657a2;
import io.sentry.InterfaceC1912j1;
import io.sentry.rrweb.AbstractC1986b;
import io.sentry.rrweb.C1985a;
import io.sentry.rrweb.C1996l;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import p000.AbstractC0085Bz;
import p000.AbstractC0148Dc;
import p000.AbstractC0585Nj;
import p000.AbstractC0828TB;
import p000.AbstractC1406fG;
import p000.AbstractC2564tz;
import p000.C0554Mv;
import p000.C2813zq;

/* JADX INFO: renamed from: io.sentry.android.replay.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1761b implements InterfaceC1912j1 {

    /* JADX INFO: renamed from: b */
    public static final Object f6410b = null;

    /* JADX INFO: renamed from: c */
    public static final HashSet f6411c = null;

    /* JADX INFO: renamed from: a */
    public String f6412a;

    static {
        f6410b = AbstractC0148Dc.m280n(3, C1760a.f6398c);
        HashSet r0 = new HashSet();
        r0.add("status_code");
        r0.add("method");
        r0.add("response_content_length");
        r0.add("request_content_length");
        r0.add("http.response_content_length");
        r0.add("http.request_content_length");
        f6411c = r0;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [Dn, java.lang.Object] */
    @Override // io.sentry.InterfaceC1912j1
    /* JADX INFO: renamed from: j */
    public final AbstractC1986b mo3697j(C1871f r12) {
        LinkedHashMap r0 = new LinkedHashMap();
        if (AbstractC0585Nj.m1134a(r12.f6714g, "http") == false) goto L48;
        Object r02 = r12.f6713f.get("url");
        if ((r02 instanceof String) == false) goto L7;
        String r03 = (String) r02;
    L8:
        if (r03 != null) goto L10;
        return null;
    L10:
        if (r03.length() != 0) goto L13;
        return null;
    L13:
        if (r12.f6713f.containsKey("http.start_timestamp") == true) goto L15;
        return null;
    L15:
        if (r12.f6713f.containsKey("http.end_timestamp") == false) goto L157;
        Object r04 = r12.f6713f.get("http.start_timestamp");
        Object r4 = r12.f6713f.get("http.end_timestamp");
        C1996l r5 = new C1996l();
        r5.f7116b = r12.m4092a().getTime();
        r5.f7142d = "resource.http";
        r5.f7143e = (String) r12.f6713f.get("url");
        if ((r04 instanceof Double) == false) goto L20;
        double r05 = ((Number) r04).doubleValue();
    L21:
        r5.f7144f = r05 / 1000.0d;
        if ((r4 instanceof Double) == false) goto L25;
        double r06 = ((Number) r4).doubleValue();
    L26:
        r5.f7145g = r06 / 1000.0d;
        LinkedHashMap r07 = new LinkedHashMap();
        Iterator r122 = r12.f6713f.entrySet().iterator();
    L28:
        if (r122.hasNext() == false) goto L46;
        Map.Entry r1 = (Map.Entry) r122.next();
        String r2 = (String) r1.getKey();
        Object r13 = r1.getValue();
        if (f6411c.contains(r2) == false) goto L28;
        String r22 = AbstractC2564tz.m5067b0(AbstractC0085Bz.m133K(r2, "content_length", "body_size"), ".");
        C0554Mv r3 = (C0554Mv) f6410b.getValue();
        r3.getClass();
        int r42 = 0;
        C2813zq r32 = AbstractC1406fG.m2680E(r3.f1822a.matcher(r22), 0, r22);
        if (r32 != null) goto L34;
        String r23 = r22.toString();
    L43:
        r07.put(r23, r13);
        goto L28
    L34:
        int r6 = r22.length();
        StringBuilder r7 = new StringBuilder(r6);
    L35:
        Matcher r8 = r32.f9532a;
        r7.append(r22, r42, AbstractC0828TB.m1632J(r8.start(), r8.end()).f432a);
        String r43 = r8.group();
        if (r43.length() == 0) goto L45;
        r7.append(String.valueOf(r43.charAt(AbstractC2564tz.m5053N(r43))).toUpperCase(Locale.ROOT));
        r42 = AbstractC0828TB.m1632J(r8.start(), r8.end()).f433b + 1;
        r32 = r32.m5447b();
        if (r42 >= r6) goto L40;
        if (r32 != null) goto L35;
    L40:
        if (r42 >= r6) goto L42;
        r7.append(r22, r42, r6);
    L42:
        r23 = r7.toString();
        goto L43
    L45:
        throw new NoSuchElementException("Char sequence is empty.");
    L46:
        r5.f7146h = new ConcurrentHashMap(r07);
        return r5;
    L25:
        r06 = ((Long) r4).longValue();
        goto L26
    L20:
        r05 = ((Long) r04).longValue();
        goto L21
    L157:
        return null;
    L7:
        r03 = null;
        goto L8
    L48:
        String r52 = "navigation";
        if (AbstractC0585Nj.m1134a(r12.f6712e, "navigation") == false) goto L55;
        if (AbstractC0585Nj.m1134a(r12.f6714g, "app.lifecycle") == false) goto L55;
        r52 = "app." + r12.f6713f.get("state");
    L53:
        String r14 = null;
        EnumC1657a2 r62 = null;
    L134:
        if (r52 != null) goto L136;
        return null;
    L136:
        if (r52.length() == 0) goto L167;
        C1985a r44 = new C1985a();
        r44.f7116b = r12.m4092a().getTime();
        r44.f7106d = r12.m4092a().getTime() / 1000.0d;
        r44.f7107e = "default";
        r44.f7108f = r52;
        r44.f7109g = r14;
        r44.f7110h = r62;
        r44.f7111i = new ConcurrentHashMap(r0);
        return r44;
    L167:
        return null;
    L55:
        if (AbstractC0585Nj.m1134a(r12.f6712e, "navigation") == false) goto L64;
        if (AbstractC0585Nj.m1134a(r12.f6714g, "device.orientation") == false) goto L64;
        r52 = r12.f6714g;
        Object r15 = r12.f6713f.get("position");
        if (AbstractC0585Nj.m1134a(r15, "landscape") == false) goto L61;
    L62:
        r0.put("position", r15);
        goto L53
    L61:
        if (AbstractC0585Nj.m1134a(r15, "portrait") == true) goto L62;
        return null;
    L64:
        if (AbstractC0585Nj.m1134a(r12.f6712e, "navigation") == false) goto L83;
        if (AbstractC0585Nj.m1134a(r12.f6713f.get("state"), "resumed") == false) goto L75;
        Object r16 = r12.f6713f.get("screen");
        if ((r16 instanceof String) == false) goto L70;
        String r17 = (String) r16;
    L71:
        if (r17 == null) goto L73;
        String r18 = AbstractC2564tz.m5068c0(r17, '.');
    L79:
        if (r18 == null) goto L163;
        r0.put("to", r18);
        goto L53
    L163:
        return null;
    L73:
        r18 = null;
        goto L79
    L70:
        r17 = null;
        goto L71
    L75:
        if (r12.f6713f.containsKey("to") == false) goto L73;
        Object r19 = r12.f6713f.get("to");
        if ((r19 instanceof String) == false) goto L73;
        r18 = (String) r19;
        goto L79
    L83:
        if (AbstractC0585Nj.m1134a(r12.f6714g, "ui.click") == false) goto L97;
        Object r110 = r12.f6713f.get("view.id");
        if (r110 != null) goto L90;
        r110 = r12.f6713f.get("view.tag");
        if (r110 != null) goto L90;
        r110 = r12.f6713f.get("view.class");
    L90:
        if ((r110 instanceof String) == false) goto L92;
        r14 = (String) r110;
    L93:
        if (r14 == null) goto L164;
        r0.putAll(r12.f6713f);
        r52 = "ui.tap";
        r62 = null;
        goto L134
    L164:
        return null;
    L92:
        r14 = null;
        goto L93
    L97:
        if (AbstractC0585Nj.m1134a(r12.f6712e, "system") == false) goto L123;
        if (AbstractC0585Nj.m1134a(r12.f6714g, "network.event") == false) goto L123;
        if (AbstractC0585Nj.m1134a(r12.f6713f.get("action"), "NETWORK_LOST") == false) goto L104;
        Object r111 = "offline";
    L114:
        r0.put("state", r111);
        if (AbstractC0585Nj.m1134a(this.f6412a, r0.get("state")) == true) goto L166;
        Object r112 = r0.get("state");
        if ((r112 instanceof String) == false) goto L120;
        String r113 = (String) r112;
    L121:
        this.f6412a = r113;
        r52 = "device.connectivity";
        goto L53
    L120:
        r113 = null;
        goto L121
    L166:
        return null;
    L104:
        if (r12.f6713f.containsKey("network_type") == false) goto L159;
        Object r114 = r12.f6713f.get("network_type");
        if ((r114 instanceof String) == false) goto L108;
        String r115 = (String) r114;
    L109:
        if (r115 != null) goto L111;
        return null;
    L111:
        if (r115.length() == 0) goto L165;
        r111 = r12.f6713f.get("network_type");
        goto L114
    L165:
        return null;
    L108:
        r115 = null;
        goto L109
    L159:
        return null;
    L123:
        if (AbstractC0585Nj.m1134a(r12.f6713f.get("action"), "BATTERY_CHANGED") == false) goto L133;
        ConcurrentHashMap r116 = r12.f6713f;
        LinkedHashMap r53 = new LinkedHashMap();
        Iterator r117 = r116.entrySet().iterator();
    L126:
        if (r117.hasNext() == false) goto L132;
        Map.Entry r63 = (Map.Entry) r117.next();
        String r72 = (String) r63.getKey();
        if (AbstractC0585Nj.m1134a(r72, "level") == true) goto L131;
        if (AbstractC0585Nj.m1134a(r72, "charging") == false) goto L126;
    L131:
        r53.put(r63.getKey(), r63.getValue());
        goto L126
    L132:
        r0.putAll(r53);
        r52 = "device.battery";
        goto L53
    L133:
        r52 = r12.f6714g;
        r14 = r12.f6711d;
        r62 = r12.f6716i;
        r0.putAll(r12.f6713f);
        goto L134
    }
}
