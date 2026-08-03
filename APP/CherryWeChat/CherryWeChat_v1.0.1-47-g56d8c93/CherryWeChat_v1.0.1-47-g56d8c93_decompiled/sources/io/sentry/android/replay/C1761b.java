package io.sentry.android.replay;

import io.sentry.C1871f;
import io.sentry.EnumC1657a2;
import io.sentry.InterfaceC1912j1;
import io.sentry.rrweb.AbstractC1986b;
import io.sentry.rrweb.C1985a;
import io.sentry.rrweb.C1996l;
import java.util.HashSet;
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
    public static final Object f6410b = AbstractC0148Dc.m280n(3, C1760a.f6398c);

    /* JADX INFO: renamed from: c */
    public static final HashSet f6411c;

    /* JADX INFO: renamed from: a */
    public String f6412a;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("status_code");
        hashSet.add("method");
        hashSet.add("response_content_length");
        hashSet.add("request_content_length");
        hashSet.add("http.response_content_length");
        hashSet.add("http.request_content_length");
        f6411c = hashSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:161:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x020a  */
    /* JADX WARN: Type inference failed for: r3v4, types: [Dn, java.lang.Object] */
    @Override // io.sentry.InterfaceC1912j1
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC1986b mo3697j(C1871f c1871f) {
        String str;
        EnumC1657a2 enumC1657a2;
        Object obj;
        String strM5068c0;
        String string;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (AbstractC0585Nj.m1134a(c1871f.f6714g, "http")) {
            Object obj2 = c1871f.f6713f.get("url");
            String str2 = obj2 instanceof String ? (String) obj2 : null;
            if (str2 == null || str2.length() == 0 || !c1871f.f6713f.containsKey("http.start_timestamp") || !c1871f.f6713f.containsKey("http.end_timestamp")) {
                return null;
            }
            Object obj3 = c1871f.f6713f.get("http.start_timestamp");
            Object obj4 = c1871f.f6713f.get("http.end_timestamp");
            C1996l c1996l = new C1996l();
            c1996l.f7116b = c1871f.m4092a().getTime();
            c1996l.f7142d = "resource.http";
            c1996l.f7143e = (String) c1871f.f6713f.get("url");
            c1996l.f7144f = (obj3 instanceof Double ? ((Number) obj3).doubleValue() : ((Long) obj3).longValue()) / 1000.0d;
            c1996l.f7145g = (obj4 instanceof Double ? ((Number) obj4).doubleValue() : ((Long) obj4).longValue()) / 1000.0d;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : c1871f.f6713f.entrySet()) {
                String str3 = (String) entry.getKey();
                Object value = entry.getValue();
                if (f6411c.contains(str3)) {
                    String strM5067b0 = AbstractC2564tz.m5067b0(AbstractC0085Bz.m133K(str3, "content_length", "body_size"), ".");
                    C0554Mv c0554Mv = (C0554Mv) f6410b.getValue();
                    c0554Mv.getClass();
                    int i = 0;
                    C2813zq c2813zqM2680E = AbstractC1406fG.m2680E(c0554Mv.f1822a.matcher(strM5067b0), 0, strM5067b0);
                    if (c2813zqM2680E == null) {
                        string = strM5067b0.toString();
                    } else {
                        int length = strM5067b0.length();
                        StringBuilder sb = new StringBuilder(length);
                        do {
                            Matcher matcher = c2813zqM2680E.f9532a;
                            sb.append((CharSequence) strM5067b0, i, AbstractC0828TB.m1632J(matcher.start(), matcher.end()).f432a);
                            String strGroup = matcher.group();
                            if (strGroup.length() == 0) {
                                throw new NoSuchElementException("Char sequence is empty.");
                            }
                            sb.append((CharSequence) String.valueOf(strGroup.charAt(AbstractC2564tz.m5053N(strGroup))).toUpperCase(Locale.ROOT));
                            i = AbstractC0828TB.m1632J(matcher.start(), matcher.end()).f433b + 1;
                            c2813zqM2680E = c2813zqM2680E.m5447b();
                            if (i >= length) {
                                break;
                            }
                        } while (c2813zqM2680E != null);
                        if (i < length) {
                            sb.append((CharSequence) strM5067b0, i, length);
                        }
                        string = sb.toString();
                    }
                    linkedHashMap2.put(string, value);
                }
            }
            c1996l.f7146h = new ConcurrentHashMap(linkedHashMap2);
            return c1996l;
        }
        String str4 = "navigation";
        if (AbstractC0585Nj.m1134a(c1871f.f6712e, "navigation") && AbstractC0585Nj.m1134a(c1871f.f6714g, "app.lifecycle")) {
            str4 = "app." + c1871f.f6713f.get("state");
        } else {
            if (!AbstractC0585Nj.m1134a(c1871f.f6712e, "navigation") || !AbstractC0585Nj.m1134a(c1871f.f6714g, "device.orientation")) {
                if (AbstractC0585Nj.m1134a(c1871f.f6712e, "navigation")) {
                    if (AbstractC0585Nj.m1134a(c1871f.f6713f.get("state"), "resumed")) {
                        Object obj5 = c1871f.f6713f.get("screen");
                        String str5 = obj5 instanceof String ? (String) obj5 : null;
                        strM5068c0 = str5 != null ? AbstractC2564tz.m5068c0(str5, '.') : null;
                        if (strM5068c0 != null) {
                            return null;
                        }
                        linkedHashMap.put("to", strM5068c0);
                    } else if (c1871f.f6713f.containsKey("to")) {
                        Object obj6 = c1871f.f6713f.get("to");
                        if (obj6 instanceof String) {
                            strM5068c0 = (String) obj6;
                        }
                        if (strM5068c0 != null) {
                        }
                    }
                    if (str4 != null && str4.length() != 0) {
                        C1985a c1985a = new C1985a();
                        c1985a.f7116b = c1871f.m4092a().getTime();
                        c1985a.f7106d = c1871f.m4092a().getTime() / 1000.0d;
                        c1985a.f7107e = "default";
                        c1985a.f7108f = str4;
                        c1985a.f7109g = str;
                        c1985a.f7110h = enumC1657a2;
                        c1985a.f7111i = new ConcurrentHashMap(linkedHashMap);
                        return c1985a;
                    }
                }
                if (AbstractC0585Nj.m1134a(c1871f.f6714g, "ui.click")) {
                    Object obj7 = c1871f.f6713f.get("view.id");
                    if (obj7 == null && (obj7 = c1871f.f6713f.get("view.tag")) == null) {
                        obj7 = c1871f.f6713f.get("view.class");
                    }
                    str = obj7 instanceof String ? (String) obj7 : null;
                    if (str == null) {
                        return null;
                    }
                    linkedHashMap.putAll(c1871f.f6713f);
                    str4 = "ui.tap";
                    enumC1657a2 = null;
                } else if (AbstractC0585Nj.m1134a(c1871f.f6712e, "system") && AbstractC0585Nj.m1134a(c1871f.f6714g, "network.event")) {
                    if (AbstractC0585Nj.m1134a(c1871f.f6713f.get("action"), "NETWORK_LOST")) {
                        obj = "offline";
                    } else {
                        if (!c1871f.f6713f.containsKey("network_type")) {
                            return null;
                        }
                        Object obj8 = c1871f.f6713f.get("network_type");
                        String str6 = obj8 instanceof String ? (String) obj8 : null;
                        if (str6 == null || str6.length() == 0) {
                            return null;
                        }
                        obj = c1871f.f6713f.get("network_type");
                    }
                    linkedHashMap.put("state", obj);
                    if (AbstractC0585Nj.m1134a(this.f6412a, linkedHashMap.get("state"))) {
                        return null;
                    }
                    Object obj9 = linkedHashMap.get("state");
                    this.f6412a = obj9 instanceof String ? (String) obj9 : null;
                    str4 = "device.connectivity";
                } else if (AbstractC0585Nj.m1134a(c1871f.f6713f.get("action"), "BATTERY_CHANGED")) {
                    ConcurrentHashMap concurrentHashMap = c1871f.f6713f;
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                        String str7 = (String) entry2.getKey();
                        if (AbstractC0585Nj.m1134a(str7, "level") || AbstractC0585Nj.m1134a(str7, "charging")) {
                            linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                    linkedHashMap.putAll(linkedHashMap3);
                    str4 = "device.battery";
                } else {
                    str4 = c1871f.f6714g;
                    str = c1871f.f6711d;
                    enumC1657a2 = c1871f.f6716i;
                    linkedHashMap.putAll(c1871f.f6713f);
                }
                return str4 != null ? null : null;
            }
            str4 = c1871f.f6714g;
            Object obj10 = c1871f.f6713f.get("position");
            if (!AbstractC0585Nj.m1134a(obj10, "landscape") && !AbstractC0585Nj.m1134a(obj10, "portrait")) {
                return null;
            }
            linkedHashMap.put("position", obj10);
        }
        str = null;
        enumC1657a2 = null;
        if (str4 != null) {
        }
    }
}
