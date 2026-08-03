package io.sentry.protocol;

import io.sentry.C1559A0;
import io.sentry.EnumC1657a2;
import io.sentry.ILogger;
import io.sentry.InterfaceC1978q0;
import io.sentry.config.AbstractC1856a;
import io.sentry.rrweb.C1985a;
import io.sentry.rrweb.C1991g;
import io.sentry.rrweb.C1992h;
import io.sentry.rrweb.C1993i;
import io.sentry.rrweb.C1994j;
import io.sentry.rrweb.C1996l;
import io.sentry.rrweb.C1997m;
import io.sentry.rrweb.EnumC1987c;
import io.sentry.rrweb.EnumC1988d;
import io.sentry.rrweb.EnumC1990f;
import io.sentry.vendor.gson.stream.EnumC2050b;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: io.sentry.protocol.D */
/* JADX INFO: loaded from: classes.dex */
public final class C1947D implements InterfaceC1978q0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6848a;

    public /* synthetic */ C1947D(int i) {
        this.f6848a = i;
    }

    /* JADX INFO: renamed from: b */
    public static C1985a m4146b(C1559A0 c1559a0, ILogger iLogger) throws IOException {
        String strM3581y;
        c1559a0.m3567f();
        C1985a c1985a = new C1985a();
        HashMap map = null;
        while (c1559a0.m3564F() == EnumC2050b.NAME) {
            String strM3581y2 = c1559a0.m3581y();
            strM3581y2.getClass();
            int i = 4;
            if (strM3581y2.equals("data")) {
                c1559a0.m3567f();
                ConcurrentHashMap concurrentHashMap = null;
                while (c1559a0.m3564F() == EnumC2050b.NAME) {
                    String strM3581y3 = c1559a0.m3581y();
                    strM3581y3.getClass();
                    if (strM3581y3.equals("payload")) {
                        c1559a0.m3567f();
                        ConcurrentHashMap concurrentHashMap2 = null;
                        while (c1559a0.m3564F() == EnumC2050b.NAME) {
                            strM3581y = c1559a0.m3581y();
                            strM3581y.getClass();
                            switch (strM3581y) {
                                case "data":
                                    ConcurrentHashMap concurrentHashMapM4045A = AbstractC1856a.m4045A((Map) c1559a0.m3582z());
                                    if (concurrentHashMapM4045A == null) {
                                        break;
                                    } else {
                                        c1985a.f7111i = concurrentHashMapM4045A;
                                        break;
                                    }
                                    break;
                                case "type":
                                    c1985a.f7107e = c1559a0.m3561C();
                                    break;
                                case "category":
                                    c1985a.f7108f = c1559a0.m3561C();
                                    break;
                                case "timestamp":
                                    c1985a.f7106d = c1559a0.m3571o();
                                    break;
                                case "level":
                                    try {
                                        c1985a.f7110h = EnumC1657a2.valueOf(c1559a0.m3560B().toUpperCase(Locale.ROOT));
                                        break;
                                    } catch (Exception e) {
                                        iLogger.mo3682n(EnumC1657a2.DEBUG, e, "Error when deserializing SentryLevel", new Object[0]);
                                        break;
                                    }
                                    break;
                                case "message":
                                    c1985a.f7109g = c1559a0.m3561C();
                                    break;
                                default:
                                    if (concurrentHashMap2 == null) {
                                        concurrentHashMap2 = new ConcurrentHashMap();
                                    }
                                    c1559a0.m3562D(iLogger, concurrentHashMap2, strM3581y);
                                    break;
                            }
                        }
                        c1985a.f7113k = concurrentHashMap2;
                        c1559a0.m3568i();
                    } else if (strM3581y3.equals("tag")) {
                        String strM3561C = c1559a0.m3561C();
                        if (strM3561C == null) {
                            strM3561C = "";
                        }
                        c1985a.f7105c = strM3561C;
                    } else {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c1559a0.m3562D(iLogger, concurrentHashMap, strM3581y3);
                    }
                }
                c1985a.f7114l = concurrentHashMap;
                c1559a0.m3568i();
            } else if (strM3581y2.equals("type")) {
                EnumC1987c enumC1987c = (EnumC1987c) c1559a0.m3559A(iLogger, new C1947D(i));
                AbstractC1856a.m4048D("", enumC1987c);
                c1985a.f7115a = enumC1987c;
            } else if (strM3581y2.equals("timestamp")) {
                c1985a.f7116b = c1559a0.m3578v();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                c1559a0.m3562D(iLogger, map, strM3581y2);
            }
        }
        c1985a.f7112j = map;
        c1559a0.m3568i();
        return c1985a;
    }

    /* JADX INFO: renamed from: c */
    public static C1991g m4147c(C1559A0 c1559a0, ILogger iLogger) throws IOException {
        String strM3581y;
        int i;
        c1559a0.m3567f();
        C1991g c1991g = new C1991g();
        HashMap map = null;
        while (c1559a0.m3564F() == EnumC2050b.NAME) {
            String strM3581y2 = c1559a0.m3581y();
            strM3581y2.getClass();
            int i2 = 4;
            if (strM3581y2.equals("data")) {
                c1559a0.m3567f();
                HashMap map2 = null;
                while (c1559a0.m3564F() == EnumC2050b.NAME) {
                    strM3581y = c1559a0.m3581y();
                    strM3581y.getClass();
                    i = 5;
                    switch (strM3581y) {
                        case "x":
                            c1991g.f7120f = c1559a0.m3573q();
                            break;
                        case "y":
                            c1991g.f7121g = c1559a0.m3573q();
                            break;
                        case "id":
                            c1991g.f7119e = c1559a0.m3575s();
                            break;
                        case "type":
                            c1991g.f7118d = (EnumC1990f) c1559a0.m3559A(iLogger, new C1947D(7));
                            break;
                        case "pointerType":
                            c1991g.f7122h = c1559a0.m3575s();
                            break;
                        case "pointerId":
                            c1991g.f7123i = c1559a0.m3575s();
                            break;
                        default:
                            if (!strM3581y.equals("source")) {
                                if (map2 == null) {
                                    map2 = new HashMap();
                                }
                                c1559a0.m3562D(iLogger, map2, strM3581y);
                                break;
                            } else {
                                EnumC1988d enumC1988d = (EnumC1988d) c1559a0.m3559A(iLogger, new C1947D(i));
                                AbstractC1856a.m4048D("", enumC1988d);
                                c1991g.f7117c = enumC1988d;
                                break;
                            }
                            break;
                    }
                }
                c1991g.f7125k = map2;
                c1559a0.m3568i();
            } else if (strM3581y2.equals("type")) {
                EnumC1987c enumC1987c = (EnumC1987c) c1559a0.m3559A(iLogger, new C1947D(i2));
                AbstractC1856a.m4048D("", enumC1987c);
                c1991g.f7115a = enumC1987c;
            } else if (strM3581y2.equals("timestamp")) {
                c1991g.f7116b = c1559a0.m3578v();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                c1559a0.m3562D(iLogger, map, strM3581y2);
            }
        }
        c1991g.f7124j = map;
        c1559a0.m3568i();
        return c1991g;
    }

    /* JADX INFO: renamed from: d */
    public static C1993i m4148d(C1559A0 c1559a0, ILogger iLogger) throws IOException {
        c1559a0.m3567f();
        C1993i c1993i = new C1993i();
        HashMap map = null;
        while (c1559a0.m3564F() == EnumC2050b.NAME) {
            String strM3581y = c1559a0.m3581y();
            strM3581y.getClass();
            if (strM3581y.equals("data")) {
                c1559a0.m3567f();
                HashMap map2 = null;
                while (c1559a0.m3564F() == EnumC2050b.NAME) {
                    String strM3581y2 = c1559a0.m3581y();
                    strM3581y2.getClass();
                    if (strM3581y2.equals("pointerId")) {
                        c1993i.f7131d = c1559a0.m3575s();
                    } else if (strM3581y2.equals("positions")) {
                        c1993i.f7132e = c1559a0.m3577u(iLogger, new C1947D(9));
                    } else if (strM3581y2.equals("source")) {
                        EnumC1988d enumC1988d = (EnumC1988d) c1559a0.m3559A(iLogger, new C1947D(5));
                        AbstractC1856a.m4048D("", enumC1988d);
                        c1993i.f7117c = enumC1988d;
                    } else {
                        if (map2 == null) {
                            map2 = new HashMap();
                        }
                        c1559a0.m3562D(iLogger, map2, strM3581y2);
                    }
                }
                c1993i.f7134g = map2;
                c1559a0.m3568i();
            } else if (strM3581y.equals("type")) {
                EnumC1987c enumC1987c = (EnumC1987c) c1559a0.m3559A(iLogger, new C1947D(4));
                AbstractC1856a.m4048D("", enumC1987c);
                c1993i.f7115a = enumC1987c;
            } else if (strM3581y.equals("timestamp")) {
                c1993i.f7116b = c1559a0.m3578v();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                c1559a0.m3562D(iLogger, map, strM3581y);
            }
        }
        c1993i.f7133f = map;
        c1559a0.m3568i();
        return c1993i;
    }

    /* JADX INFO: renamed from: e */
    public static C1994j m4149e(C1559A0 c1559a0, ILogger iLogger) throws IOException {
        String strM3581y;
        c1559a0.m3567f();
        C1994j c1994j = new C1994j();
        HashMap map = null;
        while (c1559a0.m3564F() == EnumC2050b.NAME) {
            String strM3581y2 = c1559a0.m3581y();
            strM3581y2.getClass();
            if (strM3581y2.equals("data")) {
                c1559a0.m3567f();
                AbstractMap concurrentHashMap = null;
                while (c1559a0.m3564F() == EnumC2050b.NAME) {
                    strM3581y = c1559a0.m3581y();
                    strM3581y.getClass();
                    switch (strM3581y) {
                        case "height":
                            Integer numM3576t = c1559a0.m3576t();
                            c1994j.f7136d = numM3576t != null ? numM3576t.intValue() : 0;
                            break;
                        case "href":
                            String strM3561C = c1559a0.m3561C();
                            if (strM3561C == null) {
                                strM3561C = "";
                            }
                            c1994j.f7135c = strM3561C;
                            break;
                        case "width":
                            Integer numM3576t2 = c1559a0.m3576t();
                            c1994j.f7137e = numM3576t2 != null ? numM3576t2.intValue() : 0;
                            break;
                        default:
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            c1559a0.m3562D(iLogger, concurrentHashMap, strM3581y);
                            break;
                    }
                }
                c1559a0.m3568i();
            } else if (strM3581y2.equals("type")) {
                EnumC1987c enumC1987c = (EnumC1987c) c1559a0.m3559A(iLogger, new C1947D(4));
                AbstractC1856a.m4048D("", enumC1987c);
                c1994j.f7115a = enumC1987c;
            } else if (strM3581y2.equals("timestamp")) {
                c1994j.f7116b = c1559a0.m3578v();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                c1559a0.m3562D(iLogger, map, strM3581y2);
            }
        }
        c1994j.f7138f = map;
        c1559a0.m3568i();
        return c1994j;
    }

    /* JADX INFO: renamed from: f */
    public static C1996l m4150f(C1559A0 c1559a0, ILogger iLogger) throws IOException {
        String strM3581y;
        c1559a0.m3567f();
        C1996l c1996l = new C1996l();
        HashMap map = null;
        while (c1559a0.m3564F() == EnumC2050b.NAME) {
            String strM3581y2 = c1559a0.m3581y();
            strM3581y2.getClass();
            int i = 4;
            if (strM3581y2.equals("data")) {
                c1559a0.m3567f();
                ConcurrentHashMap concurrentHashMap = null;
                while (c1559a0.m3564F() == EnumC2050b.NAME) {
                    String strM3581y3 = c1559a0.m3581y();
                    strM3581y3.getClass();
                    if (strM3581y3.equals("payload")) {
                        c1559a0.m3567f();
                        ConcurrentHashMap concurrentHashMap2 = null;
                        while (c1559a0.m3564F() == EnumC2050b.NAME) {
                            strM3581y = c1559a0.m3581y();
                            strM3581y.getClass();
                            switch (strM3581y) {
                                case "description":
                                    c1996l.f7143e = c1559a0.m3561C();
                                    break;
                                case "endTimestamp":
                                    c1996l.f7145g = c1559a0.m3571o();
                                    break;
                                case "startTimestamp":
                                    c1996l.f7144f = c1559a0.m3571o();
                                    break;
                                case "op":
                                    c1996l.f7142d = c1559a0.m3561C();
                                    break;
                                case "data":
                                    ConcurrentHashMap concurrentHashMapM4045A = AbstractC1856a.m4045A((Map) c1559a0.m3582z());
                                    if (concurrentHashMapM4045A == null) {
                                        break;
                                    } else {
                                        c1996l.f7146h = concurrentHashMapM4045A;
                                        break;
                                    }
                                    break;
                                default:
                                    if (concurrentHashMap2 == null) {
                                        concurrentHashMap2 = new ConcurrentHashMap();
                                    }
                                    c1559a0.m3562D(iLogger, concurrentHashMap2, strM3581y);
                                    break;
                            }
                        }
                        c1996l.f7148j = concurrentHashMap2;
                        c1559a0.m3568i();
                    } else if (strM3581y3.equals("tag")) {
                        String strM3561C = c1559a0.m3561C();
                        if (strM3561C == null) {
                            strM3561C = "";
                        }
                        c1996l.f7141c = strM3561C;
                    } else {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c1559a0.m3562D(iLogger, concurrentHashMap, strM3581y3);
                    }
                }
                c1996l.f7149k = concurrentHashMap;
                c1559a0.m3568i();
            } else if (strM3581y2.equals("type")) {
                EnumC1987c enumC1987c = (EnumC1987c) c1559a0.m3559A(iLogger, new C1947D(i));
                AbstractC1856a.m4048D("", enumC1987c);
                c1996l.f7115a = enumC1987c;
            } else if (strM3581y2.equals("timestamp")) {
                c1996l.f7116b = c1559a0.m3578v();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                c1559a0.m3562D(iLogger, map, strM3581y2);
            }
        }
        c1996l.f7147i = map;
        c1559a0.m3568i();
        return c1996l;
    }

    /* JADX INFO: renamed from: g */
    public static C1997m m4151g(C1559A0 c1559a0, ILogger iLogger) throws IOException {
        String strM3581y;
        c1559a0.m3567f();
        C1997m c1997m = new C1997m();
        HashMap map = null;
        while (c1559a0.m3564F() == EnumC2050b.NAME) {
            String strM3581y2 = c1559a0.m3581y();
            strM3581y2.getClass();
            int i = 4;
            if (strM3581y2.equals("data")) {
                c1559a0.m3567f();
                ConcurrentHashMap concurrentHashMap = null;
                while (c1559a0.m3564F() == EnumC2050b.NAME) {
                    String strM3581y3 = c1559a0.m3581y();
                    strM3581y3.getClass();
                    if (strM3581y3.equals("payload")) {
                        c1559a0.m3567f();
                        ConcurrentHashMap concurrentHashMap2 = null;
                        while (c1559a0.m3564F() == EnumC2050b.NAME) {
                            strM3581y = c1559a0.m3581y();
                            strM3581y.getClass();
                            switch (strM3581y) {
                                case "duration":
                                    c1997m.f7153f = c1559a0.m3578v();
                                    break;
                                case "segmentId":
                                    c1997m.f7151d = c1559a0.m3575s();
                                    break;
                                case "height":
                                    Integer numM3576t = c1559a0.m3576t();
                                    c1997m.f7156i = numM3576t != null ? numM3576t.intValue() : 0;
                                    break;
                                case "container":
                                    String strM3561C = c1559a0.m3561C();
                                    if (strM3561C == null) {
                                        strM3561C = "";
                                    }
                                    c1997m.f7155h = strM3561C;
                                    break;
                                case "frameCount":
                                    Integer numM3576t2 = c1559a0.m3576t();
                                    c1997m.f7158k = numM3576t2 != null ? numM3576t2.intValue() : 0;
                                    break;
                                case "top":
                                    Integer numM3576t3 = c1559a0.m3576t();
                                    c1997m.f7162o = numM3576t3 != null ? numM3576t3.intValue() : 0;
                                    break;
                                case "left":
                                    Integer numM3576t4 = c1559a0.m3576t();
                                    c1997m.f7161n = numM3576t4 != null ? numM3576t4.intValue() : 0;
                                    break;
                                case "size":
                                    Long lM3579w = c1559a0.m3579w();
                                    c1997m.f7152e = lM3579w == null ? 0L : lM3579w.longValue();
                                    break;
                                case "width":
                                    Integer numM3576t5 = c1559a0.m3576t();
                                    c1997m.f7157j = numM3576t5 != null ? numM3576t5.intValue() : 0;
                                    break;
                                case "frameRate":
                                    Integer numM3576t6 = c1559a0.m3576t();
                                    c1997m.f7160m = numM3576t6 != null ? numM3576t6.intValue() : 0;
                                    break;
                                case "encoding":
                                    String strM3561C2 = c1559a0.m3561C();
                                    if (strM3561C2 == null) {
                                        strM3561C2 = "";
                                    }
                                    c1997m.f7154g = strM3561C2;
                                    break;
                                case "frameRateType":
                                    String strM3561C3 = c1559a0.m3561C();
                                    if (strM3561C3 == null) {
                                        strM3561C3 = "";
                                    }
                                    c1997m.f7159l = strM3561C3;
                                    break;
                                default:
                                    if (concurrentHashMap2 == null) {
                                        concurrentHashMap2 = new ConcurrentHashMap();
                                    }
                                    c1559a0.m3562D(iLogger, concurrentHashMap2, strM3581y);
                                    break;
                            }
                        }
                        c1997m.f7164q = concurrentHashMap2;
                        c1559a0.m3568i();
                    } else if (strM3581y3.equals("tag")) {
                        String strM3561C4 = c1559a0.m3561C();
                        if (strM3561C4 == null) {
                            strM3561C4 = "";
                        }
                        c1997m.f7150c = strM3561C4;
                    } else {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c1559a0.m3562D(iLogger, concurrentHashMap, strM3581y3);
                    }
                }
                c1997m.f7165r = concurrentHashMap;
                c1559a0.m3568i();
            } else if (strM3581y2.equals("type")) {
                EnumC1987c enumC1987c = (EnumC1987c) c1559a0.m3559A(iLogger, new C1947D(i));
                AbstractC1856a.m4048D("", enumC1987c);
                c1997m.f7115a = enumC1987c;
            } else if (strM3581y2.equals("timestamp")) {
                c1997m.f7116b = c1559a0.m3578v();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                c1559a0.m3562D(iLogger, map, strM3581y2);
            }
        }
        c1997m.f7163p = map;
        c1559a0.m3568i();
        return c1997m;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // io.sentry.InterfaceC1978q0
    /* JADX INFO: renamed from: a */
    public final Object mo4039a(C1559A0 c1559a0, ILogger iLogger) throws IOException {
        int i;
        String strM3581y;
        String strM3581y2;
        String strM3581y3;
        String strM3561C = null;
        HashMap map = null;
        HashMap map2 = null;
        int i2 = 2;
        switch (this.f6848a) {
            case 0:
                c1559a0.m3567f();
                C1948E c1948e = new C1948E();
                ConcurrentHashMap concurrentHashMap = null;
                while (c1559a0.m3564F() == EnumC2050b.NAME) {
                    String strM3581y4 = c1559a0.m3581y();
                    strM3581y4.getClass();
                    switch (strM3581y4.hashCode()) {
                        case -265713450:
                            i = !strM3581y4.equals("username") ? -1 : 0;
                            break;
                        case 3355:
                            i = !strM3581y4.equals("id") ? -1 : 1;
                            break;
                        case 102225:
                            i = !strM3581y4.equals("geo") ? -1 : i2;
                            break;
                        case 3076010:
                            i = !strM3581y4.equals("data") ? -1 : 3;
                            break;
                        case 3373707:
                            i = !strM3581y4.equals("name") ? -1 : 4;
                            break;
                        case 96619420:
                            i = !strM3581y4.equals("email") ? -1 : 5;
                            break;
                        case 1480014044:
                            i = !strM3581y4.equals("ip_address") ? -1 : 6;
                            break;
                        default:
                            i = -1;
                            break;
                    }
                    switch (i) {
                        case 0:
                            c1948e.f6851c = c1559a0.m3561C();
                            break;
                        case 1:
                            c1948e.f6850b = c1559a0.m3561C();
                            break;
                        case 2:
                            c1559a0.m3567f();
                            C1958h c1958h = new C1958h();
                            ConcurrentHashMap concurrentHashMap2 = null;
                            while (c1559a0.m3564F() == EnumC2050b.NAME) {
                                strM3581y = c1559a0.m3581y();
                                strM3581y.getClass();
                                switch (strM3581y) {
                                    case "region":
                                        c1958h.f6938c = c1559a0.m3561C();
                                        break;
                                    case "city":
                                        c1958h.f6936a = c1559a0.m3561C();
                                        break;
                                    case "country_code":
                                        c1958h.f6937b = c1559a0.m3561C();
                                        break;
                                    default:
                                        if (concurrentHashMap2 == null) {
                                            concurrentHashMap2 = new ConcurrentHashMap();
                                        }
                                        c1559a0.m3562D(iLogger, concurrentHashMap2, strM3581y);
                                        break;
                                }
                            }
                            c1958h.f6939d = concurrentHashMap2;
                            c1559a0.m3568i();
                            c1948e.f6854f = c1958h;
                            break;
                        case 3:
                            c1948e.f6855g = AbstractC1856a.m4045A((Map) c1559a0.m3582z());
                            break;
                        case 4:
                            c1948e.f6853e = c1559a0.m3561C();
                            break;
                        case 5:
                            c1948e.f6849a = c1559a0.m3561C();
                            break;
                        case 6:
                            c1948e.f6852d = c1559a0.m3561C();
                            break;
                        default:
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            c1559a0.m3562D(iLogger, concurrentHashMap, strM3581y4);
                            break;
                    }
                    i2 = 2;
                }
                c1948e.f6856h = concurrentHashMap;
                c1559a0.m3568i();
                return c1948e;
            case 1:
                c1559a0.m3567f();
                ArrayList arrayListM3577u = null;
                HashMap map3 = null;
                while (c1559a0.m3564F() == EnumC2050b.NAME) {
                    String strM3581y5 = c1559a0.m3581y();
                    strM3581y5.getClass();
                    if (strM3581y5.equals("rendering_system")) {
                        strM3561C = c1559a0.m3561C();
                    } else if (strM3581y5.equals("windows")) {
                        arrayListM3577u = c1559a0.m3577u(iLogger, new C1947D(i2));
                    } else {
                        if (map3 == null) {
                            map3 = new HashMap();
                        }
                        c1559a0.m3562D(iLogger, map3, strM3581y5);
                    }
                }
                c1559a0.m3568i();
                C1949F c1949f = new C1949F(strM3561C, arrayListM3577u);
                c1949f.f6859c = map3;
                return c1949f;
            case 2:
                C1950G c1950g = new C1950G();
                c1559a0.m3567f();
                while (c1559a0.m3564F() == EnumC2050b.NAME) {
                    strM3581y2 = c1559a0.m3581y();
                    strM3581y2.getClass();
                    switch (strM3581y2) {
                        case "rendering_system":
                            c1950g.f6860a = c1559a0.m3561C();
                            break;
                        case "identifier":
                            c1950g.f6862c = c1559a0.m3561C();
                            break;
                        case "height":
                            c1950g.f6865f = c1559a0.m3572p();
                            break;
                        case "x":
                            c1950g.f6866g = c1559a0.m3572p();
                            break;
                        case "y":
                            c1950g.f6867h = c1559a0.m3572p();
                            break;
                        case "tag":
                            c1950g.f6863d = c1559a0.m3561C();
                            break;
                        case "type":
                            c1950g.f6861b = c1559a0.m3561C();
                            break;
                        case "alpha":
                            c1950g.f6869j = c1559a0.m3572p();
                            break;
                        case "width":
                            c1950g.f6864e = c1559a0.m3572p();
                            break;
                        case "children":
                            c1950g.f6870k = c1559a0.m3577u(iLogger, this);
                            break;
                        case "visibility":
                            c1950g.f6868i = c1559a0.m3561C();
                            break;
                        default:
                            if (map2 == null) {
                                map2 = new HashMap();
                            }
                            c1559a0.m3562D(iLogger, map2, strM3581y2);
                            break;
                    }
                }
                c1559a0.m3568i();
                c1950g.f6871l = map2;
                return c1950g;
            case 3:
                return m4146b(c1559a0, iLogger);
            case 4:
                return EnumC1987c.values()[c1559a0.m3575s()];
            case 5:
                return EnumC1988d.values()[c1559a0.m3575s()];
            case 6:
                return m4147c(c1559a0, iLogger);
            case 7:
                return EnumC1990f.values()[c1559a0.m3575s()];
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                return m4148d(c1559a0, iLogger);
            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                c1559a0.m3567f();
                C1992h c1992h = new C1992h();
                while (c1559a0.m3564F() == EnumC2050b.NAME) {
                    strM3581y3 = c1559a0.m3581y();
                    strM3581y3.getClass();
                    switch (strM3581y3) {
                        case "x":
                            c1992h.f7127b = c1559a0.m3573q();
                            break;
                        case "y":
                            c1992h.f7128c = c1559a0.m3573q();
                            break;
                        case "id":
                            c1992h.f7126a = c1559a0.m3575s();
                            break;
                        case "timeOffset":
                            c1992h.f7129d = c1559a0.m3578v();
                            break;
                        default:
                            if (map == null) {
                                map = new HashMap();
                            }
                            c1559a0.m3562D(iLogger, map, strM3581y3);
                            break;
                    }
                }
                c1992h.f7130e = map;
                c1559a0.m3568i();
                return c1992h;
            case 10:
                return m4149e(c1559a0, iLogger);
            case 11:
                return m4150f(c1559a0, iLogger);
            default:
                return m4151g(c1559a0, iLogger);
        }
    }
}
