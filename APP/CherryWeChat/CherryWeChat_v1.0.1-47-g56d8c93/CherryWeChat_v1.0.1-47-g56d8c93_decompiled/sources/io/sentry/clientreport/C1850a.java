package io.sentry.clientreport;

import io.sentry.C1559A0;
import io.sentry.C1865e;
import io.sentry.C1873f1;
import io.sentry.EnumC1657a2;
import io.sentry.ILogger;
import io.sentry.InterfaceC1978q0;
import io.sentry.config.AbstractC1856a;
import io.sentry.protocol.C1945B;
import io.sentry.protocol.C1951a;
import io.sentry.protocol.C1952b;
import io.sentry.protocol.C1953c;
import io.sentry.protocol.C1956f;
import io.sentry.protocol.C1957g;
import io.sentry.protocol.C1959i;
import io.sentry.protocol.C1963m;
import io.sentry.protocol.C1966p;
import io.sentry.protocol.C1970t;
import io.sentry.protocol.C1972v;
import io.sentry.protocol.EnumC1955e;
import io.sentry.vendor.gson.stream.C2049a;
import io.sentry.vendor.gson.stream.EnumC2050b;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import p000.AbstractC2374ph;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: io.sentry.clientreport.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1850a implements InterfaceC1978q0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6669a;

    public /* synthetic */ C1850a(int i) {
        this.f6669a = i;
    }

    /* JADX INFO: renamed from: b */
    public static C1951a m4030b(C1559A0 c1559a0, ILogger iLogger) throws IOException {
        String strM3581y;
        c1559a0.m3567f();
        C1951a c1951a = new C1951a();
        ConcurrentHashMap concurrentHashMap = null;
        while (c1559a0.m3564F() == EnumC2050b.NAME) {
            strM3581y = c1559a0.m3581y();
            strM3581y.getClass();
            switch (strM3581y) {
                case "split_names":
                    List list = (List) c1559a0.m3582z();
                    if (list == null) {
                        break;
                    } else {
                        c1951a.f6884m = list;
                        break;
                    }
                    break;
                case "device_app_hash":
                    c1951a.f6874c = c1559a0.m3561C();
                    break;
                case "start_type":
                    c1951a.f6881j = c1559a0.m3561C();
                    break;
                case "view_names":
                    List list2 = (List) c1559a0.m3582z();
                    if (list2 == null) {
                        break;
                    } else {
                        c1951a.f6880i = list2;
                        break;
                    }
                    break;
                case "app_version":
                    c1951a.f6877f = c1559a0.m3561C();
                    break;
                case "in_foreground":
                    c1951a.f6882k = c1559a0.m3569l();
                    break;
                case "build_type":
                    c1951a.f6875d = c1559a0.m3561C();
                    break;
                case "app_identifier":
                    c1951a.f6872a = c1559a0.m3561C();
                    break;
                case "app_start_time":
                    c1951a.f6873b = c1559a0.m3570m(iLogger);
                    break;
                case "permissions":
                    c1951a.f6879h = AbstractC1856a.m4045A((Map) c1559a0.m3582z());
                    break;
                case "app_name":
                    c1951a.f6876e = c1559a0.m3561C();
                    break;
                case "app_build":
                    c1951a.f6878g = c1559a0.m3561C();
                    break;
                case "is_split_apks":
                    c1951a.f6883l = c1559a0.m3569l();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    c1559a0.m3562D(iLogger, concurrentHashMap, strM3581y);
                    break;
            }
        }
        c1951a.f6885n = concurrentHashMap;
        c1559a0.m3568i();
        return c1951a;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: c */
    public static C1953c m4031c(C1559A0 c1559a0, ILogger iLogger) {
        byte b;
        String strM3581y;
        String strM3581y2;
        C1953c c1953c = new C1953c();
        c1559a0.m3567f();
        while (c1559a0.m3564F() == EnumC2050b.NAME) {
            String strM3581y3 = c1559a0.m3581y();
            strM3581y3.getClass();
            switch (strM3581y3.hashCode()) {
                case -1335157162:
                    b = !strM3581y3.equals("device") ? (byte) -1 : (byte) 0;
                    break;
                case -895679987:
                    b = !strM3581y3.equals("spring") ? (byte) -1 : (byte) 1;
                    break;
                case -340323263:
                    b = !strM3581y3.equals("response") ? (byte) -1 : (byte) 2;
                    break;
                case -309425751:
                    b = !strM3581y3.equals("profile") ? (byte) -1 : (byte) 3;
                    break;
                case -191501435:
                    b = !strM3581y3.equals("feedback") ? (byte) -1 : (byte) 4;
                    break;
                case 3556:
                    b = !strM3581y3.equals("os") ? (byte) -1 : (byte) 5;
                    break;
                case 96801:
                    b = !strM3581y3.equals("app") ? (byte) -1 : (byte) 6;
                    break;
                case 102572:
                    b = !strM3581y3.equals("gpu") ? (byte) -1 : (byte) 7;
                    break;
                case 110620997:
                    b = !strM3581y3.equals("trace") ? (byte) -1 : (byte) 8;
                    break;
                case 150940456:
                    b = !strM3581y3.equals("browser") ? (byte) -1 : (byte) 9;
                    break;
                case 1550962648:
                    b = !strM3581y3.equals("runtime") ? (byte) -1 : (byte) 10;
                    break;
                default:
                    b = -1;
                    break;
            }
            ConcurrentHashMap concurrentHashMap = null;
            switch (b) {
                case 0:
                    c1953c.mo4132n(m4032d(c1559a0, iLogger));
                    break;
                case 1:
                    c1559a0.m3567f();
                    C1945B c1945b = new C1945B();
                    while (c1559a0.m3564F() == EnumC2050b.NAME) {
                        String strM3581y4 = c1559a0.m3581y();
                        strM3581y4.getClass();
                        if (strM3581y4.equals("active_profiles")) {
                            List list = (List) c1559a0.m3582z();
                            if (list != null) {
                                String[] strArr = new String[list.size()];
                                list.toArray(strArr);
                                c1945b.f6846a = strArr;
                            }
                        } else {
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            c1559a0.m3562D(iLogger, concurrentHashMap, strM3581y4);
                        }
                    }
                    c1945b.f6847b = concurrentHashMap;
                    c1559a0.m3568i();
                    c1953c.mo4137s(c1945b);
                    break;
                case 2:
                    c1559a0.m3567f();
                    C1966p c1966p = new C1966p();
                    while (c1559a0.m3564F() == EnumC2050b.NAME) {
                        strM3581y = c1559a0.m3581y();
                        strM3581y.getClass();
                        switch (strM3581y) {
                            case "status_code":
                                c1966p.f6990c = c1559a0.m3576t();
                                break;
                            case "data":
                                c1966p.f6992e = c1559a0.m3582z();
                                break;
                            case "headers":
                                Map map = (Map) c1559a0.m3582z();
                                if (map != null) {
                                    c1966p.f6989b = AbstractC1856a.m4045A(map);
                                    break;
                                } else {
                                    break;
                                }
                                break;
                            case "cookies":
                                c1966p.f6988a = c1559a0.m3561C();
                                break;
                            case "body_size":
                                c1966p.f6991d = c1559a0.m3579w();
                                break;
                            default:
                                if (concurrentHashMap == null) {
                                    concurrentHashMap = new ConcurrentHashMap();
                                }
                                c1559a0.m3562D(iLogger, concurrentHashMap, strM3581y);
                                break;
                        }
                    }
                    c1966p.f6993f = concurrentHashMap;
                    c1559a0.m3568i();
                    c1953c.mo4135q(c1966p);
                    break;
                case 3:
                    c1559a0.m3567f();
                    C1873f1 c1873f1 = new C1873f1(C1970t.f7011b);
                    while (c1559a0.m3564F() == EnumC2050b.NAME) {
                        String strM3581y5 = c1559a0.m3581y();
                        strM3581y5.getClass();
                        if (strM3581y5.equals("profiler_id")) {
                            C1970t c1970t = (C1970t) c1559a0.m3559A(iLogger, new C1850a(22));
                            if (c1970t != null) {
                                c1873f1.f6718a = c1970t;
                            }
                        } else {
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            c1559a0.m3562D(iLogger, concurrentHashMap, strM3581y5);
                        }
                    }
                    c1873f1.f6719b = concurrentHashMap;
                    c1559a0.m3568i();
                    c1953c.mo4128j("profile", c1873f1);
                    break;
                case 4:
                    c1953c.mo4128j("feedback", m4033e(c1559a0, iLogger));
                    break;
                case 5:
                    c1953c.mo4134p(m4035g(c1559a0, iLogger));
                    break;
                case 6:
                    c1953c.mo4130l(m4030b(c1559a0, iLogger));
                    break;
                case 7:
                    c1953c.mo4133o(m4034f(c1559a0, iLogger));
                    break;
                case LuaJitConsts.LUA_TTHREAD /* 8 */:
                    c1953c.mo4138t(C1865e.m4088b(c1559a0, iLogger));
                    break;
                case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                    c1559a0.m3567f();
                    C1952b c1952b = new C1952b();
                    while (c1559a0.m3564F() == EnumC2050b.NAME) {
                        String strM3581y6 = c1559a0.m3581y();
                        strM3581y6.getClass();
                        if (strM3581y6.equals("name")) {
                            c1952b.f6886a = c1559a0.m3561C();
                        } else if (strM3581y6.equals("version")) {
                            c1952b.f6887b = c1559a0.m3561C();
                        } else {
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            c1559a0.m3562D(iLogger, concurrentHashMap, strM3581y6);
                        }
                    }
                    c1952b.f6888c = concurrentHashMap;
                    c1559a0.m3568i();
                    c1953c.mo4131m(c1952b);
                    break;
                case 10:
                    c1559a0.m3567f();
                    C1972v c1972v = new C1972v();
                    while (c1559a0.m3564F() == EnumC2050b.NAME) {
                        strM3581y2 = c1559a0.m3581y();
                        strM3581y2.getClass();
                        switch (strM3581y2) {
                            case "raw_description":
                                c1972v.f7018c = c1559a0.m3561C();
                                break;
                            case "name":
                                c1972v.f7016a = c1559a0.m3561C();
                                break;
                            case "version":
                                c1972v.f7017b = c1559a0.m3561C();
                                break;
                            default:
                                if (concurrentHashMap == null) {
                                    concurrentHashMap = new ConcurrentHashMap();
                                }
                                c1559a0.m3562D(iLogger, concurrentHashMap, strM3581y2);
                                break;
                        }
                    }
                    c1972v.f7019d = concurrentHashMap;
                    c1559a0.m3568i();
                    c1953c.mo4136r(c1972v);
                    break;
                default:
                    Object objM3582z = c1559a0.m3582z();
                    if (objM3582z != null) {
                        c1953c.mo4128j(strM3581y3, objM3582z);
                    }
                    break;
            }
        }
        c1559a0.m3568i();
        return c1953c;
    }

    /* JADX INFO: renamed from: d */
    public static C1956f m4032d(C1559A0 c1559a0, ILogger iLogger) throws IOException {
        String strM3581y;
        int i;
        TimeZone timeZone;
        c1559a0.m3567f();
        C1956f c1956f = new C1956f();
        ConcurrentHashMap concurrentHashMap = null;
        while (c1559a0.m3564F() == EnumC2050b.NAME) {
            strM3581y = c1559a0.m3581y();
            strM3581y.getClass();
            i = 10;
            switch (strM3581y) {
                case "timezone":
                    switch (c1559a0.f5580a) {
                        case 0:
                            C2049a c2049a = (C2049a) c1559a0.f5581b;
                            if (c2049a.m4194C() != EnumC2050b.NULL) {
                                try {
                                    timeZone = TimeZone.getTimeZone(c2049a.m4192A());
                                } catch (Exception e) {
                                    iLogger.mo3683r(EnumC1657a2.ERROR, "Error when deserializing TimeZone", e);
                                }
                            } else {
                                c2049a.m4215y();
                            }
                            break;
                        default:
                            String str = (String) c1559a0.m3563E();
                            timeZone = str == null ? null : TimeZone.getTimeZone(str);
                            break;
                    }
                    c1956f.f6928z = timeZone;
                    break;
                case "boot_time":
                    if (c1559a0.m3564F() == EnumC2050b.STRING) {
                        c1956f.f6927y = c1559a0.m3570m(iLogger);
                        break;
                    } else {
                        break;
                    }
                    break;
                case "simulator":
                    c1956f.f6914l = c1559a0.m3569l();
                    break;
                case "manufacturer":
                    c1956f.f6904b = c1559a0.m3561C();
                    break;
                case "processor_count":
                    c1956f.f6898E = c1559a0.m3576t();
                    break;
                case "orientation":
                    c1956f.f6913k = (EnumC1955e) c1559a0.m3559A(iLogger, new C1850a(i));
                    break;
                case "battery_temperature":
                    c1956f.f6897D = c1559a0.m3574r();
                    break;
                case "family":
                    c1956f.f6906d = c1559a0.m3561C();
                    break;
                case "locale":
                    c1956f.f6895B = c1559a0.m3561C();
                    break;
                case "online":
                    c1956f.f6912j = c1559a0.m3569l();
                    break;
                case "battery_level":
                    c1956f.f6910h = c1559a0.m3574r();
                    break;
                case "model_id":
                    c1956f.f6908f = c1559a0.m3561C();
                    break;
                case "screen_density":
                    c1956f.f6925w = c1559a0.m3574r();
                    break;
                case "screen_dpi":
                    c1956f.f6926x = c1559a0.m3576t();
                    break;
                case "free_memory":
                    c1956f.f6916n = c1559a0.m3579w();
                    break;
                case "id":
                    c1956f.f6894A = c1559a0.m3561C();
                    break;
                case "name":
                    c1956f.f6903a = c1559a0.m3561C();
                    break;
                case "low_memory":
                    c1956f.f6918p = c1559a0.m3569l();
                    break;
                case "archs":
                    List list = (List) c1559a0.m3582z();
                    if (list != null) {
                        String[] strArr = new String[list.size()];
                        list.toArray(strArr);
                        c1956f.f6909g = strArr;
                        break;
                    } else {
                        break;
                    }
                    break;
                case "brand":
                    c1956f.f6905c = c1559a0.m3561C();
                    break;
                case "model":
                    c1956f.f6907e = c1559a0.m3561C();
                    break;
                case "cpu_description":
                    c1956f.f6900G = c1559a0.m3561C();
                    break;
                case "processor_frequency":
                    c1956f.f6899F = c1559a0.m3572p();
                    break;
                case "connection_type":
                    c1956f.f6896C = c1559a0.m3561C();
                    break;
                case "chipset":
                    c1956f.f6901H = c1559a0.m3561C();
                    break;
                case "screen_width_pixels":
                    c1956f.f6923u = c1559a0.m3576t();
                    break;
                case "external_storage_size":
                    c1956f.f6921s = c1559a0.m3579w();
                    break;
                case "storage_size":
                    c1956f.f6919q = c1559a0.m3579w();
                    break;
                case "usable_memory":
                    c1956f.f6917o = c1559a0.m3579w();
                    break;
                case "memory_size":
                    c1956f.f6915m = c1559a0.m3579w();
                    break;
                case "charging":
                    c1956f.f6911i = c1559a0.m3569l();
                    break;
                case "external_free_storage":
                    c1956f.f6922t = c1559a0.m3579w();
                    break;
                case "free_storage":
                    c1956f.f6920r = c1559a0.m3579w();
                    break;
                case "screen_height_pixels":
                    c1956f.f6924v = c1559a0.m3576t();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    c1559a0.m3562D(iLogger, concurrentHashMap, strM3581y);
                    break;
            }
        }
        c1956f.f6902I = concurrentHashMap;
        c1559a0.m3568i();
        return c1956f;
    }

    /* JADX INFO: renamed from: e */
    public static C1957g m4033e(C1559A0 c1559a0, ILogger iLogger) throws IOException {
        String strM3581y;
        c1559a0.m3567f();
        String strM3561C = null;
        String strM3561C2 = null;
        String strM3561C3 = null;
        C1970t c1970t = null;
        C1970t c1970t2 = null;
        String strM3561C4 = null;
        HashMap map = null;
        while (true) {
            if (c1559a0.m3564F() != EnumC2050b.NAME) {
                c1559a0.m3568i();
                if (strM3561C == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"message\"");
                    iLogger.mo3683r(EnumC1657a2.ERROR, "Missing required field \"message\"", illegalStateException);
                    throw illegalStateException;
                }
                C1957g c1957g = new C1957g();
                if (strM3561C.length() > 4096) {
                    c1957g.f6929a = strM3561C.substring(0, 4096);
                } else {
                    c1957g.f6929a = strM3561C;
                }
                c1957g.f6930b = strM3561C2;
                c1957g.f6931c = strM3561C3;
                c1957g.f6932d = c1970t;
                c1957g.f6933e = c1970t2;
                c1957g.f6934f = strM3561C4;
                c1957g.f6935g = map;
                return c1957g;
            }
            strM3581y = c1559a0.m3581y();
            strM3581y.getClass();
            switch (strM3581y) {
                case "associated_event_id":
                    c1970t = new C1970t(c1559a0.m3560B());
                    break;
                case "replay_id":
                    c1970t2 = new C1970t(c1559a0.m3560B());
                    break;
                case "url":
                    strM3561C4 = c1559a0.m3561C();
                    break;
                case "name":
                    strM3561C3 = c1559a0.m3561C();
                    break;
                case "contact_email":
                    strM3561C2 = c1559a0.m3561C();
                    break;
                case "message":
                    strM3561C = c1559a0.m3561C();
                    break;
                default:
                    if (map == null) {
                        map = new HashMap();
                    }
                    c1559a0.m3562D(iLogger, map, strM3581y);
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static C1959i m4034f(C1559A0 c1559a0, ILogger iLogger) throws IOException {
        String strM3581y;
        c1559a0.m3567f();
        C1959i c1959i = new C1959i();
        ConcurrentHashMap concurrentHashMap = null;
        while (c1559a0.m3564F() == EnumC2050b.NAME) {
            strM3581y = c1559a0.m3581y();
            strM3581y.getClass();
            switch (strM3581y) {
                case "npot_support":
                    c1959i.f6948i = c1559a0.m3561C();
                    break;
                case "vendor_id":
                    c1959i.f6942c = c1559a0.m3561C();
                    break;
                case "multi_threaded_rendering":
                    c1959i.f6946g = c1559a0.m3569l();
                    break;
                case "id":
                    c1959i.f6941b = c1559a0.m3576t();
                    break;
                case "name":
                    c1959i.f6940a = c1559a0.m3561C();
                    break;
                case "vendor_name":
                    c1959i.f6943d = c1559a0.m3561C();
                    break;
                case "version":
                    c1959i.f6947h = c1559a0.m3561C();
                    break;
                case "api_type":
                    c1959i.f6945f = c1559a0.m3561C();
                    break;
                case "memory_size":
                    c1959i.f6944e = c1559a0.m3576t();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    c1559a0.m3562D(iLogger, concurrentHashMap, strM3581y);
                    break;
            }
        }
        c1959i.f6949j = concurrentHashMap;
        c1559a0.m3568i();
        return c1959i;
    }

    /* JADX INFO: renamed from: g */
    public static C1963m m4035g(C1559A0 c1559a0, ILogger iLogger) throws IOException {
        String strM3581y;
        c1559a0.m3567f();
        C1963m c1963m = new C1963m();
        ConcurrentHashMap concurrentHashMap = null;
        while (c1559a0.m3564F() == EnumC2050b.NAME) {
            strM3581y = c1559a0.m3581y();
            strM3581y.getClass();
            switch (strM3581y) {
                case "rooted":
                    c1963m.f6974f = c1559a0.m3569l();
                    break;
                case "raw_description":
                    c1963m.f6971c = c1559a0.m3561C();
                    break;
                case "name":
                    c1963m.f6969a = c1559a0.m3561C();
                    break;
                case "build":
                    c1963m.f6972d = c1559a0.m3561C();
                    break;
                case "version":
                    c1963m.f6970b = c1559a0.m3561C();
                    break;
                case "kernel_version":
                    c1963m.f6973e = c1559a0.m3561C();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    c1559a0.m3562D(iLogger, concurrentHashMap, strM3581y);
                    break;
            }
        }
        c1963m.f6975g = concurrentHashMap;
        c1559a0.m3568i();
        return c1963m;
    }

    /* JADX INFO: renamed from: h */
    public static IllegalStateException m4036h(String str, ILogger iLogger) {
        String strM4814k = AbstractC2374ph.m4814k("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strM4814k);
        iLogger.mo3683r(EnumC1657a2.ERROR, strM4814k, illegalStateException);
        return illegalStateException;
    }

    /* JADX INFO: renamed from: i */
    public static IllegalStateException m4037i(String str, ILogger iLogger) {
        String strM4814k = AbstractC2374ph.m4814k("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strM4814k);
        iLogger.mo3683r(EnumC1657a2.ERROR, strM4814k, illegalStateException);
        return illegalStateException;
    }

    /* JADX INFO: renamed from: j */
    public static IllegalStateException m4038j(String str, ILogger iLogger) {
        String strM4814k = AbstractC2374ph.m4814k("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strM4814k);
        iLogger.mo3683r(EnumC1657a2.ERROR, strM4814k, illegalStateException);
        return illegalStateException;
    }

    /*  JADX ERROR: NullPointerException in pass: SwitchBreakVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:506)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:509)
        */
    @Override // io.sentry.InterfaceC1978q0
    /* JADX INFO: renamed from: a */
    public final java.lang.Object mo4039a(io.sentry.C1559A0 r38, io.sentry.ILogger r39) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 5044
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.clientreport.C1850a.mo4039a(io.sentry.A0, io.sentry.ILogger):java.lang.Object");
    }
}
