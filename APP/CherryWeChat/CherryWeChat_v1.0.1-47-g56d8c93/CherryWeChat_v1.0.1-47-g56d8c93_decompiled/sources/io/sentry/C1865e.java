package io.sentry;

import com.youth.banner.BuildConfig;
import io.sentry.clientreport.C1850a;
import io.sentry.config.AbstractC1856a;
import io.sentry.protocol.C1947D;
import io.sentry.protocol.C1954d;
import io.sentry.protocol.C1960j;
import io.sentry.protocol.C1962l;
import io.sentry.protocol.C1968r;
import io.sentry.protocol.C1970t;
import io.sentry.rrweb.EnumC1987c;
import io.sentry.rrweb.EnumC1988d;
import io.sentry.util.AbstractC2038j;
import io.sentry.vendor.gson.stream.C2049a;
import io.sentry.vendor.gson.stream.EnumC2050b;
import java.io.File;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p000.AbstractC2374ph;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: io.sentry.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1865e implements InterfaceC1978q0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6690a;

    public /* synthetic */ C1865e(int i) {
        this.f6690a = i;
    }

    /* JADX INFO: renamed from: b */
    public static C1589H2 m4088b(C1559A0 c1559a0, ILogger iLogger) throws IOException {
        String strM3581y;
        c1559a0.m3567f();
        C1970t c1970t = null;
        C1601K2 c1601k2 = null;
        String strM3560B = null;
        ConcurrentHashMap concurrentHashMap = null;
        C1601K2 c1601k22 = null;
        String strM3560B2 = null;
        EnumC1605L2 enumC1605L2 = null;
        String strM3560B3 = null;
        ConcurrentHashMap concurrentHashMapM4045A = null;
        Map map = null;
        while (c1559a0.m3564F() == EnumC2050b.NAME) {
            strM3581y = c1559a0.m3581y();
            strM3581y.getClass();
            switch (strM3581y) {
                case "span_id":
                    c1601k2 = new C1601K2(c1559a0.m3560B());
                    break;
                case "parent_span_id":
                    c1601k22 = (C1601K2) c1559a0.m3559A(iLogger, new C1865e(21));
                    break;
                case "description":
                    strM3560B2 = c1559a0.m3560B();
                    break;
                case "origin":
                    strM3560B3 = c1559a0.m3560B();
                    break;
                case "status":
                    enumC1605L2 = (EnumC1605L2) c1559a0.m3559A(iLogger, new C1865e(22));
                    break;
                case "op":
                    strM3560B = c1559a0.m3560B();
                    break;
                case "data":
                    map = (Map) c1559a0.m3582z();
                    break;
                case "tags":
                    concurrentHashMapM4045A = AbstractC1856a.m4045A((Map) c1559a0.m3582z());
                    break;
                case "trace_id":
                    c1970t = new C1970t(c1559a0.m3560B());
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    c1559a0.m3562D(iLogger, concurrentHashMap, strM3581y);
                    break;
            }
        }
        if (c1970t == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"trace_id\"");
            iLogger.mo3683r(EnumC1657a2.ERROR, "Missing required field \"trace_id\"", illegalStateException);
            throw illegalStateException;
        }
        if (c1601k2 == null) {
            IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"span_id\"");
            iLogger.mo3683r(EnumC1657a2.ERROR, "Missing required field \"span_id\"", illegalStateException2);
            throw illegalStateException2;
        }
        if (strM3560B == null) {
            strM3560B = "";
        }
        C1589H2 c1589h2 = new C1589H2(c1970t, c1601k2, strM3560B, c1601k22);
        c1589h2.f5743f = strM3560B2;
        c1589h2.f5744g = enumC1605L2;
        c1589h2.f5746i = strM3560B3;
        if (concurrentHashMapM4045A != null) {
            c1589h2.f5745h = concurrentHashMapM4045A;
        }
        if (map != null) {
            c1589h2.f5747j = map;
        }
        c1589h2.f5748k = concurrentHashMap;
        c1559a0.m3568i();
        return c1589h2;
    }

    /* JADX INFO: renamed from: c */
    private final Object m4089c(C1559A0 c1559a0, ILogger iLogger) throws IOException {
        String strM3581y;
        c1559a0.m3567f();
        Date dateM4067m = AbstractC1856a.m4067m();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        String strM3561C = null;
        String strM3561C2 = null;
        String strM3561C3 = null;
        String strM3561C4 = null;
        EnumC1657a2 enumC1657a2ValueOf = null;
        ConcurrentHashMap concurrentHashMap2 = null;
        while (c1559a0.m3564F() == EnumC2050b.NAME) {
            strM3581y = c1559a0.m3581y();
            strM3581y.getClass();
            switch (strM3581y) {
                case "origin":
                    strM3561C4 = c1559a0.m3561C();
                    break;
                case "data":
                    ConcurrentHashMap concurrentHashMapM4045A = AbstractC1856a.m4045A((Map) c1559a0.m3582z());
                    if (concurrentHashMapM4045A == null) {
                        break;
                    } else {
                        concurrentHashMap = concurrentHashMapM4045A;
                        break;
                    }
                    break;
                case "type":
                    strM3561C2 = c1559a0.m3561C();
                    break;
                case "category":
                    strM3561C3 = c1559a0.m3561C();
                    break;
                case "timestamp":
                    Date dateM3570m = c1559a0.m3570m(iLogger);
                    if (dateM3570m == null) {
                        break;
                    } else {
                        dateM4067m = dateM3570m;
                        break;
                    }
                    break;
                case "level":
                    try {
                        enumC1657a2ValueOf = EnumC1657a2.valueOf(c1559a0.m3560B().toUpperCase(Locale.ROOT));
                        break;
                    } catch (Exception e) {
                        iLogger.mo3682n(EnumC1657a2.ERROR, e, "Error when deserializing SentryLevel", new Object[0]);
                        break;
                    }
                    break;
                case "message":
                    strM3561C = c1559a0.m3561C();
                    break;
                default:
                    if (concurrentHashMap2 == null) {
                        concurrentHashMap2 = new ConcurrentHashMap();
                    }
                    c1559a0.m3562D(iLogger, concurrentHashMap2, strM3581y);
                    break;
            }
        }
        C1871f c1871f = new C1871f(dateM4067m);
        c1871f.f6711d = strM3561C;
        c1871f.f6712e = strM3561C2;
        c1871f.f6713f = concurrentHashMap;
        c1871f.f6714g = strM3561C3;
        c1871f.f6715h = strM3561C4;
        c1871f.f6716i = enumC1657a2ValueOf;
        c1871f.f6717j = concurrentHashMap2;
        c1559a0.m3568i();
        return c1871f;
    }

    /* JADX INFO: renamed from: d */
    public static IllegalStateException m4090d(String str, ILogger iLogger) {
        String strM4814k = AbstractC2374ph.m4814k("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strM4814k);
        iLogger.mo3683r(EnumC1657a2.ERROR, strM4814k, illegalStateException);
        return illegalStateException;
    }

    /* JADX INFO: renamed from: e */
    public static IllegalStateException m4091e(String str, ILogger iLogger) {
        String strM4814k = AbstractC2374ph.m4814k("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strM4814k);
        iLogger.mo3683r(EnumC1657a2.ERROR, strM4814k, illegalStateException);
        return illegalStateException;
    }

    /* JADX WARN: Code restructure failed: missing block: B:262:0x03c0, code lost:
    
        r9.m4202i();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:260:0x03b7. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:1257:0x03dc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x03ed A[LOOP:4: B:197:0x0313->B:270:0x03ed, LOOP_END] */
    @Override // io.sentry.InterfaceC1978q0
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo4039a(C1559A0 c1559a0, ILogger iLogger) throws IOException {
        String strM3581y;
        String strM3581y2;
        String strM3581y3;
        ArrayList arrayList;
        String strM3581y4;
        String strM3581y5;
        String strM3581y6;
        String strM3581y7;
        String strM3581y8;
        String strM3581y9;
        String strM3581y10;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String strM3581y11;
        String strM3581y12;
        int i6 = 14;
        int i7 = 10;
        switch (this.f6690a) {
            case 0:
                return m4089c(c1559a0, iLogger);
            case 1:
                c1559a0.m3567f();
                C1970t c1970t = C1970t.f7011b;
                C1867e1 c1867e1 = new C1867e1(c1970t, c1970t, new File("dummy"), new HashMap(), Double.valueOf(0.0d), C2046v2.empty());
                ConcurrentHashMap concurrentHashMap = null;
                while (c1559a0.m3564F() == EnumC2050b.NAME) {
                    strM3581y = c1559a0.m3581y();
                    strM3581y.getClass();
                    switch (strM3581y) {
                        case "debug_meta":
                            C1954d c1954d = (C1954d) c1559a0.m3559A(iLogger, new C1850a(8));
                            if (c1954d == null) {
                                break;
                            } else {
                                c1867e1.f6691a = c1954d;
                                break;
                            }
                            break;
                        case "measurements":
                            HashMap mapM3580x = c1559a0.m3580x(iLogger, new C1850a(2));
                            if (mapM3580x != null) {
                                c1867e1.f6695e.putAll(mapM3580x);
                            }
                            break;
                        case "environment":
                            String strM3561C = c1559a0.m3561C();
                            if (strM3561C != null) {
                                c1867e1.f6698h = strM3561C;
                            }
                            break;
                        case "timestamp":
                            Double dM3572p = c1559a0.m3572p();
                            if (dM3572p != null) {
                                c1867e1.f6700j = dM3572p.doubleValue();
                            }
                            break;
                        case "profiler_id":
                            C1970t c1970t2 = (C1970t) c1559a0.m3559A(iLogger, new C1850a(22));
                            if (c1970t2 != null) {
                                c1867e1.f6692b = c1970t2;
                            }
                            break;
                        case "version":
                            String strM3561C2 = c1559a0.m3561C();
                            if (strM3561C2 != null) {
                                c1867e1.f6699i = strM3561C2;
                            }
                            break;
                        case "release":
                            String strM3561C3 = c1559a0.m3561C();
                            if (strM3561C3 != null) {
                                c1867e1.f6697g = strM3561C3;
                            }
                            break;
                        case "client_sdk":
                            C1968r c1968r = (C1968r) c1559a0.m3559A(iLogger, new C1850a(20));
                            if (c1968r != null) {
                                c1867e1.f6694d = c1968r;
                            }
                            break;
                        case "platform":
                            String strM3561C4 = c1559a0.m3561C();
                            if (strM3561C4 != null) {
                                c1867e1.f6696f = strM3561C4;
                            }
                            break;
                        case "sampled_profile":
                            String strM3561C5 = c1559a0.m3561C();
                            if (strM3561C5 != null) {
                                c1867e1.f6702l = strM3561C5;
                            }
                            break;
                        case "chunk_id":
                            C1970t c1970t3 = (C1970t) c1559a0.m3559A(iLogger, new C1850a(22));
                            if (c1970t3 != null) {
                                c1867e1.f6693c = c1970t3;
                            }
                            break;
                        default:
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            c1559a0.m3562D(iLogger, concurrentHashMap, strM3581y);
                            break;
                    }
                }
                c1867e1.f6703m = concurrentHashMap;
                c1559a0.m3568i();
                return c1867e1;
            case 2:
                c1559a0.m3567f();
                C1873f1 c1873f1 = new C1873f1(C1970t.f7011b);
                ConcurrentHashMap concurrentHashMap2 = null;
                while (c1559a0.m3564F() == EnumC2050b.NAME) {
                    String strM3581y13 = c1559a0.m3581y();
                    strM3581y13.getClass();
                    if (strM3581y13.equals("profiler_id")) {
                        C1970t c1970t4 = (C1970t) c1559a0.m3559A(iLogger, new C1850a(22));
                        if (c1970t4 != null) {
                            c1873f1.f6718a = c1970t4;
                        }
                    } else {
                        if (concurrentHashMap2 == null) {
                            concurrentHashMap2 = new ConcurrentHashMap();
                        }
                        c1559a0.m3562D(iLogger, concurrentHashMap2, strM3581y13);
                    }
                }
                c1873f1.f6719b = concurrentHashMap2;
                c1559a0.m3568i();
                return c1873f1;
            case 3:
                c1559a0.m3567f();
                File file = new File("dummy");
                Date dateM4067m = AbstractC1856a.m4067m();
                ArrayList arrayList2 = new ArrayList();
                C1970t c1970t5 = C1970t.f7011b;
                C1881h1 c1881h1 = new C1881h1(file, dateM4067m, arrayList2, "", c1970t5.toString(), new C1589H2(c1970t5, C1601K2.f5780b, "op", null).f5738a.toString(), "0", 0, "", new CallableC1590I(2), null, null, null, null, null, null, null, null, "normal", new HashMap());
                ConcurrentHashMap concurrentHashMap3 = null;
                while (c1559a0.m3564F() == EnumC2050b.NAME) {
                    strM3581y2 = c1559a0.m3581y();
                    strM3581y2.getClass();
                    switch (strM3581y2) {
                        case "device_manufacturer":
                            String strM3561C6 = c1559a0.m3561C();
                            if (strM3561C6 == null) {
                                break;
                            } else {
                                c1881h1.f6739e = strM3561C6;
                                break;
                            }
                            break;
                        case "android_api_level":
                            Integer numM3576t = c1559a0.m3576t();
                            if (numM3576t == null) {
                                break;
                            } else {
                                c1881h1.f6737c = numM3576t.intValue();
                                break;
                            }
                            break;
                        case "build_id":
                            String strM3561C7 = c1559a0.m3561C();
                            if (strM3561C7 == null) {
                                break;
                            } else {
                                c1881h1.f6749o = strM3561C7;
                                break;
                            }
                            break;
                        case "device_locale":
                            String strM3561C8 = c1559a0.m3561C();
                            if (strM3561C8 == null) {
                                break;
                            } else {
                                c1881h1.f6738d = strM3561C8;
                                break;
                            }
                            break;
                        case "profile_id":
                            String strM3561C9 = c1559a0.m3561C();
                            if (strM3561C9 == null) {
                                break;
                            } else {
                                c1881h1.f6757w = strM3561C9;
                                break;
                            }
                            break;
                        case "device_os_build_number":
                            String strM3561C10 = c1559a0.m3561C();
                            if (strM3561C10 == null) {
                                break;
                            } else {
                                c1881h1.f6741g = strM3561C10;
                                break;
                            }
                            break;
                        case "device_model":
                            String strM3561C11 = c1559a0.m3561C();
                            if (strM3561C11 == null) {
                                break;
                            } else {
                                c1881h1.f6740f = strM3561C11;
                                break;
                            }
                            break;
                        case "device_is_emulator":
                            Boolean boolM3569l = c1559a0.m3569l();
                            if (boolM3569l == null) {
                                break;
                            } else {
                                c1881h1.f6744j = boolM3569l.booleanValue();
                                break;
                            }
                            break;
                        case "duration_ns":
                            String strM3561C12 = c1559a0.m3561C();
                            if (strM3561C12 == null) {
                                break;
                            } else {
                                c1881h1.f6752r = strM3561C12;
                                break;
                            }
                            break;
                        case "measurements":
                            HashMap mapM3580x2 = c1559a0.m3580x(iLogger, new C1850a(2));
                            if (mapM3580x2 == null) {
                                break;
                            } else {
                                c1881h1.f6732A.putAll(mapM3580x2);
                                break;
                            }
                            break;
                        case "device_physical_memory_bytes":
                            String strM3561C13 = c1559a0.m3561C();
                            if (strM3561C13 == null) {
                                break;
                            } else {
                                c1881h1.f6747m = strM3561C13;
                                break;
                            }
                            break;
                        case "device_cpu_frequencies":
                            List list = (List) c1559a0.m3582z();
                            if (list == null) {
                                break;
                            } else {
                                c1881h1.f6746l = list;
                                break;
                            }
                            break;
                        case "version_code":
                            String strM3561C14 = c1559a0.m3561C();
                            if (strM3561C14 == null) {
                                break;
                            } else {
                                c1881h1.f6753s = strM3561C14;
                                break;
                            }
                            break;
                        case "version_name":
                            String strM3561C15 = c1559a0.m3561C();
                            if (strM3561C15 == null) {
                                break;
                            } else {
                                c1881h1.f6754t = strM3561C15;
                                break;
                            }
                            break;
                        case "environment":
                            String strM3561C16 = c1559a0.m3561C();
                            if (strM3561C16 == null) {
                                break;
                            } else {
                                c1881h1.f6758x = strM3561C16;
                                break;
                            }
                            break;
                        case "timestamp":
                            Date dateM3570m = c1559a0.m3570m(iLogger);
                            if (dateM3570m == null) {
                                break;
                            } else {
                                c1881h1.f6760z = dateM3570m;
                                break;
                            }
                            break;
                        case "transaction_name":
                            String strM3561C17 = c1559a0.m3561C();
                            if (strM3561C17 == null) {
                                break;
                            } else {
                                c1881h1.f6751q = strM3561C17;
                                break;
                            }
                            break;
                        case "device_os_name":
                            String strM3561C18 = c1559a0.m3561C();
                            if (strM3561C18 == null) {
                                break;
                            } else {
                                c1881h1.f6742h = strM3561C18;
                                break;
                            }
                            break;
                        case "architecture":
                            String strM3561C19 = c1559a0.m3561C();
                            if (strM3561C19 == null) {
                                break;
                            } else {
                                c1881h1.f6745k = strM3561C19;
                                break;
                            }
                            break;
                        case "transaction_id":
                            String strM3561C20 = c1559a0.m3561C();
                            if (strM3561C20 == null) {
                                break;
                            } else {
                                c1881h1.f6755u = strM3561C20;
                                break;
                            }
                            break;
                        case "device_os_version":
                            String strM3561C21 = c1559a0.m3561C();
                            if (strM3561C21 == null) {
                                break;
                            } else {
                                c1881h1.f6743i = strM3561C21;
                                break;
                            }
                            break;
                        case "truncation_reason":
                            String strM3561C22 = c1559a0.m3561C();
                            if (strM3561C22 == null) {
                                break;
                            } else {
                                c1881h1.f6759y = strM3561C22;
                                break;
                            }
                            break;
                        case "trace_id":
                            String strM3561C23 = c1559a0.m3561C();
                            if (strM3561C23 == null) {
                                break;
                            } else {
                                c1881h1.f6756v = strM3561C23;
                                break;
                            }
                            break;
                        case "platform":
                            String strM3561C24 = c1559a0.m3561C();
                            if (strM3561C24 == null) {
                                break;
                            } else {
                                c1881h1.f6748n = strM3561C24;
                                break;
                            }
                            break;
                        case "sampled_profile":
                            String strM3561C25 = c1559a0.m3561C();
                            if (strM3561C25 == null) {
                                break;
                            } else {
                                c1881h1.f6733B = strM3561C25;
                                break;
                            }
                            break;
                        case "transactions":
                            ArrayList arrayListM3577u = c1559a0.m3577u(iLogger, new C1865e(4));
                            if (arrayListM3577u == null) {
                                break;
                            } else {
                                c1881h1.f6750p.addAll(arrayListM3577u);
                                break;
                            }
                            break;
                        default:
                            if (concurrentHashMap3 == null) {
                                concurrentHashMap3 = new ConcurrentHashMap();
                            }
                            c1559a0.m3562D(iLogger, concurrentHashMap3, strM3581y2);
                            break;
                    }
                }
                c1881h1.f6734C = concurrentHashMap3;
                c1559a0.m3568i();
                return c1881h1;
            case 4:
                c1559a0.m3567f();
                C1896i1 c1896i1 = new C1896i1(C1643W0.f5888a, 0L, 0L);
                ConcurrentHashMap concurrentHashMap4 = null;
                while (c1559a0.m3564F() == EnumC2050b.NAME) {
                    strM3581y3 = c1559a0.m3581y();
                    strM3581y3.getClass();
                    switch (strM3581y3) {
                        case "relative_start_ns":
                            Long lM3579w = c1559a0.m3579w();
                            if (lM3579w == null) {
                                break;
                            } else {
                                c1896i1.f6768d = lM3579w;
                                break;
                            }
                            break;
                        case "relative_end_ns":
                            Long lM3579w2 = c1559a0.m3579w();
                            if (lM3579w2 == null) {
                                break;
                            } else {
                                c1896i1.f6769e = lM3579w2;
                                break;
                            }
                            break;
                        case "id":
                            String strM3561C26 = c1559a0.m3561C();
                            if (strM3561C26 == null) {
                                break;
                            } else {
                                c1896i1.f6765a = strM3561C26;
                                break;
                            }
                            break;
                        case "name":
                            String strM3561C27 = c1559a0.m3561C();
                            if (strM3561C27 == null) {
                                break;
                            } else {
                                c1896i1.f6767c = strM3561C27;
                                break;
                            }
                            break;
                        case "trace_id":
                            String strM3561C28 = c1559a0.m3561C();
                            if (strM3561C28 == null) {
                                break;
                            } else {
                                c1896i1.f6766b = strM3561C28;
                                break;
                            }
                            break;
                        case "relative_cpu_end_ms":
                            Long lM3579w3 = c1559a0.m3579w();
                            if (lM3579w3 == null) {
                                break;
                            } else {
                                c1896i1.f6771g = lM3579w3;
                                break;
                            }
                            break;
                        case "relative_cpu_start_ms":
                            Long lM3579w4 = c1559a0.m3579w();
                            if (lM3579w4 == null) {
                                break;
                            } else {
                                c1896i1.f6770f = lM3579w4;
                                break;
                            }
                            break;
                        default:
                            if (concurrentHashMap4 == null) {
                                concurrentHashMap4 = new ConcurrentHashMap();
                            }
                            c1559a0.m3562D(iLogger, concurrentHashMap4, strM3581y3);
                            break;
                    }
                }
                c1896i1.f6772h = concurrentHashMap4;
                c1559a0.m3568i();
                return c1896i1;
            case 5:
                C1927m1 c1927m1 = new C1927m1();
                c1559a0.m3567f();
                Integer numM3576t2 = null;
                HashMap map = null;
                while (c1559a0.m3564F() == EnumC2050b.NAME) {
                    String strM3581y14 = c1559a0.m3581y();
                    strM3581y14.getClass();
                    if (strM3581y14.equals("segment_id")) {
                        numM3576t2 = c1559a0.m3576t();
                    } else {
                        if (map == null) {
                            map = new HashMap();
                        }
                        c1559a0.m3562D(iLogger, map, strM3581y14);
                    }
                }
                c1559a0.m3568i();
                c1559a0.m3565G(true);
                List list2 = (List) c1559a0.m3582z();
                c1559a0.m3565G(false);
                if (list2 != null) {
                    arrayList = new ArrayList(list2.size());
                    for (Object obj : list2) {
                        if (obj instanceof Map) {
                            Map map2 = (Map) obj;
                            C1559A0 c1559a02 = new C1559A0(map2);
                            for (Map.Entry entry : map2.entrySet()) {
                                String str = (String) entry.getKey();
                                Object value = entry.getValue();
                                if (str.equals("type")) {
                                    EnumC1987c enumC1987c = EnumC1987c.values()[((Integer) value).intValue()];
                                    int i8 = AbstractC1920l1.f6809b[enumC1987c.ordinal()];
                                    if (i8 == 1) {
                                        Map map3 = (Map) map2.get("data");
                                        if (map3 == null) {
                                            map3 = Collections.EMPTY_MAP;
                                        }
                                        Integer num = (Integer) map3.get("source");
                                        if (num != null) {
                                            EnumC1988d enumC1988d = EnumC1988d.values()[num.intValue()];
                                            int i9 = AbstractC1920l1.f6808a[enumC1988d.ordinal()];
                                            if (i9 == 1) {
                                                arrayList.add(C1947D.m4147c(c1559a02, iLogger));
                                            } else if (i9 != 2) {
                                                iLogger.mo3680e(EnumC1657a2.DEBUG, "Unsupported rrweb incremental snapshot type %s", enumC1988d);
                                            } else {
                                                arrayList.add(C1947D.m4148d(c1559a02, iLogger));
                                            }
                                        }
                                    } else if (i8 == 2) {
                                        arrayList.add(C1947D.m4149e(c1559a02, iLogger));
                                    } else if (i8 == 3) {
                                        Map map4 = (Map) map2.get("data");
                                        if (map4 == null) {
                                            map4 = Collections.EMPTY_MAP;
                                        }
                                        String str2 = (String) map4.get("tag");
                                        if (str2 != null) {
                                            switch (str2) {
                                                case "performanceSpan":
                                                    arrayList.add(C1947D.m4150f(c1559a02, iLogger));
                                                    break;
                                                case "video":
                                                    arrayList.add(C1947D.m4151g(c1559a02, iLogger));
                                                    break;
                                                case "breadcrumb":
                                                    arrayList.add(C1947D.m4146b(c1559a02, iLogger));
                                                    break;
                                                default:
                                                    iLogger.mo3680e(EnumC1657a2.DEBUG, "Unsupported rrweb event type %s", enumC1987c);
                                                    break;
                                            }
                                        }
                                    } else {
                                        iLogger.mo3680e(EnumC1657a2.DEBUG, "Unsupported rrweb event type %s", enumC1987c);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    arrayList = null;
                }
                c1927m1.f6817a = numM3576t2;
                c1927m1.f6818b = arrayList;
                c1927m1.f6819c = map;
                return c1927m1;
            case 6:
                c1559a0.m3567f();
                C1560A1 c1560a1 = new C1560A1();
                c1560a1.f5584c = false;
                c1560a1.f5585d = null;
                c1560a1.f5582a = false;
                c1560a1.f5583b = null;
                c1560a1.f5590i = false;
                c1560a1.f5586e = null;
                c1560a1.f5587f = false;
                c1560a1.f5588g = false;
                c1560a1.f5593l = EnumC1877g1.MANUAL;
                c1560a1.f5589h = 0;
                c1560a1.f5591j = true;
                c1560a1.f5592k = false;
                ConcurrentHashMap concurrentHashMap5 = null;
                while (c1559a0.m3564F() == EnumC2050b.NAME) {
                    strM3581y4 = c1559a0.m3581y();
                    strM3581y4.getClass();
                    switch (strM3581y4) {
                        case "is_enable_app_start_profiling":
                            Boolean boolM3569l2 = c1559a0.m3569l();
                            if (boolM3569l2 == null) {
                                break;
                            } else {
                                c1560a1.f5591j = boolM3569l2.booleanValue();
                                break;
                            }
                            break;
                        case "trace_sampled":
                            Boolean boolM3569l3 = c1559a0.m3569l();
                            if (boolM3569l3 == null) {
                                break;
                            } else {
                                c1560a1.f5584c = boolM3569l3.booleanValue();
                                break;
                            }
                            break;
                        case "profiling_traces_dir_path":
                            String strM3561C29 = c1559a0.m3561C();
                            if (strM3561C29 == null) {
                                break;
                            } else {
                                c1560a1.f5586e = strM3561C29;
                                break;
                            }
                            break;
                        case "is_continuous_profiling_enabled":
                            Boolean boolM3569l4 = c1559a0.m3569l();
                            if (boolM3569l4 == null) {
                                break;
                            } else {
                                c1560a1.f5588g = boolM3569l4.booleanValue();
                                break;
                            }
                            break;
                        case "is_profiling_enabled":
                            Boolean boolM3569l5 = c1559a0.m3569l();
                            if (boolM3569l5 == null) {
                                break;
                            } else {
                                c1560a1.f5587f = boolM3569l5.booleanValue();
                                break;
                            }
                            break;
                        case "is_start_profiler_on_app_start":
                            Boolean boolM3569l6 = c1559a0.m3569l();
                            if (boolM3569l6 == null) {
                                break;
                            } else {
                                c1560a1.f5592k = boolM3569l6.booleanValue();
                                break;
                            }
                            break;
                        case "profile_sampled":
                            Boolean boolM3569l7 = c1559a0.m3569l();
                            if (boolM3569l7 == null) {
                                break;
                            } else {
                                c1560a1.f5582a = boolM3569l7.booleanValue();
                                break;
                            }
                            break;
                        case "profile_lifecycle":
                            String strM3561C30 = c1559a0.m3561C();
                            if (strM3561C30 == null) {
                                break;
                            } else {
                                try {
                                    c1560a1.f5593l = EnumC1877g1.valueOf(strM3561C30);
                                } catch (IllegalArgumentException unused) {
                                    iLogger.mo3680e(EnumC1657a2.ERROR, "Error when deserializing ProfileLifecycle: ".concat(strM3561C30), new Object[0]);
                                }
                                break;
                            }
                            break;
                        case "continuous_profile_sampled":
                            Boolean boolM3569l8 = c1559a0.m3569l();
                            if (boolM3569l8 == null) {
                                break;
                            } else {
                                c1560a1.f5590i = boolM3569l8.booleanValue();
                                break;
                            }
                            break;
                        case "profiling_traces_hz":
                            Integer numM3576t3 = c1559a0.m3576t();
                            if (numM3576t3 == null) {
                                break;
                            } else {
                                c1560a1.f5589h = numM3576t3.intValue();
                                break;
                            }
                            break;
                        case "trace_sample_rate":
                            Double dM3572p2 = c1559a0.m3572p();
                            if (dM3572p2 == null) {
                                break;
                            } else {
                                c1560a1.f5585d = dM3572p2;
                                break;
                            }
                            break;
                        case "profile_sample_rate":
                            Double dM3572p3 = c1559a0.m3572p();
                            if (dM3572p3 == null) {
                                break;
                            } else {
                                c1560a1.f5583b = dM3572p3;
                                break;
                            }
                            break;
                        default:
                            if (concurrentHashMap5 == null) {
                                concurrentHashMap5 = new ConcurrentHashMap();
                            }
                            c1559a0.m3562D(iLogger, concurrentHashMap5, strM3581y4);
                            break;
                    }
                }
                c1560a1.f5594m = concurrentHashMap5;
                c1559a0.m3568i();
                return c1560a1;
            case 7:
                c1559a0.m3567f();
                C1968r c1968r2 = null;
                C1613N2 c1613n2 = null;
                Date dateM3570m2 = null;
                C1970t c1970t6 = null;
                HashMap map5 = null;
                while (c1559a0.m3564F() == EnumC2050b.NAME) {
                    strM3581y5 = c1559a0.m3581y();
                    strM3581y5.getClass();
                    switch (strM3581y5) {
                        case "sdk":
                            c1968r2 = (C1968r) c1559a0.m3559A(iLogger, new C1850a(20));
                            break;
                        case "trace":
                            c1613n2 = (C1613N2) c1559a0.m3559A(iLogger, new C1865e(23));
                            break;
                        case "event_id":
                            c1970t6 = (C1970t) c1559a0.m3559A(iLogger, new C1850a(22));
                            break;
                        case "sent_at":
                            dateM3570m2 = c1559a0.m3570m(iLogger);
                            break;
                        default:
                            if (map5 == null) {
                                map5 = new HashMap();
                            }
                            c1559a0.m3562D(iLogger, map5, strM3581y5);
                            break;
                    }
                }
                C1596J1 c1596j1 = new C1596J1(c1970t6, c1968r2, c1613n2);
                c1596j1.f5758d = dateM3570m2;
                c1596j1.f5759e = map5;
                c1559a0.m3568i();
                return c1596j1;
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                c1559a0.m3567f();
                HashMap map6 = null;
                EnumC1653Z1 enumC1653Z1 = null;
                int iM3575s = 0;
                String strM3561C31 = null;
                String strM3561C32 = null;
                String strM3561C33 = null;
                String strM3561C34 = null;
                Integer numM3576t4 = null;
                while (c1559a0.m3564F() == EnumC2050b.NAME) {
                    strM3581y6 = c1559a0.m3581y();
                    strM3581y6.getClass();
                    switch (strM3581y6) {
                        case "item_count":
                            numM3576t4 = c1559a0.m3576t();
                            break;
                        case "length":
                            iM3575s = c1559a0.m3575s();
                            break;
                        case "filename":
                            strM3561C32 = c1559a0.m3561C();
                            break;
                        case "attachment_type":
                            strM3561C33 = c1559a0.m3561C();
                            break;
                        case "type":
                            enumC1653Z1 = (EnumC1653Z1) c1559a0.m3559A(iLogger, new C1865e(i7));
                            break;
                        case "content_type":
                            strM3561C31 = c1559a0.m3561C();
                            break;
                        case "platform":
                            strM3561C34 = c1559a0.m3561C();
                            break;
                        default:
                            if (map6 == null) {
                                map6 = new HashMap();
                            }
                            c1559a0.m3562D(iLogger, map6, strM3581y6);
                            break;
                    }
                }
                if (enumC1653Z1 == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"type\"");
                    iLogger.mo3683r(EnumC1657a2.ERROR, "Missing required field \"type\"", illegalStateException);
                    throw illegalStateException;
                }
                C1624Q1 c1624q1 = new C1624Q1(enumC1653Z1, iM3575s, strM3561C31, strM3561C32, strM3561C33, strM3561C34, numM3576t4);
                c1624q1.f5838i = map6;
                c1559a0.m3568i();
                return c1624q1;
            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                c1559a0.m3567f();
                C1627R1 c1627r1 = new C1627R1();
                ConcurrentHashMap concurrentHashMap6 = null;
                while (c1559a0.m3564F() == EnumC2050b.NAME) {
                    strM3581y7 = c1559a0.m3581y();
                    strM3581y7.getClass();
                    switch (strM3581y7) {
                        case "fingerprint":
                            List list3 = (List) c1559a0.m3582z();
                            if (list3 != null) {
                                c1627r1.f5852w = list3;
                            } else {
                                continue;
                            }
                            break;
                        case "threads":
                            c1559a0.m3567f();
                            c1559a0.m3581y();
                            c1627r1.f5848s = new C2065z0(c1559a0.m3577u(iLogger, new C1850a(28)));
                            c1559a0.m3568i();
                            continue;
                            break;
                        case "logger":
                            c1627r1.f5847r = c1559a0.m3561C();
                            continue;
                            break;
                        case "timestamp":
                            Date dateM3570m3 = c1559a0.m3570m(iLogger);
                            if (dateM3570m3 != null) {
                                c1627r1.f5845p = dateM3570m3;
                            } else {
                                continue;
                            }
                            break;
                        case "level":
                            c1627r1.f5850u = (EnumC1657a2) c1559a0.m3559A(iLogger, new C1865e(11));
                            continue;
                            break;
                        case "message":
                            c1627r1.f5846q = (C1962l) c1559a0.m3559A(iLogger, new C1850a(16));
                            continue;
                            break;
                        case "modules":
                            c1627r1.f5854y = AbstractC1856a.m4045A((Map) c1559a0.m3582z());
                            break;
                        case "exception":
                            c1559a0.m3567f();
                            c1559a0.m3581y();
                            c1627r1.f5849t = new C2065z0(c1559a0.m3577u(iLogger, new C1850a(21)));
                            c1559a0.m3568i();
                            break;
                        case "transaction":
                            c1627r1.f5851v = c1559a0.m3561C();
                            break;
                        default:
                            if (!AbstractC1856a.m4061g(c1627r1, strM3581y7, c1559a0, iLogger)) {
                                if (concurrentHashMap6 == null) {
                                    concurrentHashMap6 = new ConcurrentHashMap();
                                }
                                c1559a0.m3562D(iLogger, concurrentHashMap6, strM3581y7);
                                break;
                            }
                            break;
                    }
                }
                c1627r1.f5853x = concurrentHashMap6;
                c1559a0.m3568i();
                return c1627r1;
            case 10:
                return EnumC1653Z1.valueOfLabel(c1559a0.m3560B().toLowerCase(Locale.ROOT));
            case 11:
                return EnumC1657a2.valueOf(c1559a0.m3560B().toUpperCase(Locale.ROOT));
            case 12:
                C1828b2 c1828b2 = new C1828b2();
                c1559a0.m3567f();
                ConcurrentHashMap concurrentHashMap7 = null;
                while (c1559a0.m3564F() == EnumC2050b.NAME) {
                    strM3581y8 = c1559a0.m3581y();
                    strM3581y8.getClass();
                    switch (strM3581y8) {
                        case "package_name":
                            c1828b2.f6607c = c1559a0.m3561C();
                            break;
                        case "thread_id":
                            c1828b2.f6609e = c1559a0.m3579w();
                            break;
                        case "address":
                            c1828b2.f6606b = c1559a0.m3561C();
                            break;
                        case "class_name":
                            c1828b2.f6608d = c1559a0.m3561C();
                            break;
                        case "type":
                            c1828b2.f6605a = c1559a0.m3575s();
                            break;
                        default:
                            if (concurrentHashMap7 == null) {
                                concurrentHashMap7 = new ConcurrentHashMap();
                            }
                            c1559a0.m3562D(iLogger, concurrentHashMap7, strM3581y8);
                            break;
                    }
                }
                c1828b2.f6610f = concurrentHashMap7;
                c1559a0.m3568i();
                return c1828b2;
            case 13:
                c1559a0.m3567f();
                Double dM3572p4 = null;
                String strM3561C35 = null;
                C1970t c1970t7 = null;
                HashMap map7 = null;
                EnumC1868e2 enumC1868e2 = null;
                HashMap mapM3580x3 = null;
                Integer numM3576t5 = null;
                while (c1559a0.m3564F() == EnumC2050b.NAME) {
                    strM3581y9 = c1559a0.m3581y();
                    strM3581y9.getClass();
                    switch (strM3581y9) {
                        case "severity_number":
                            numM3576t5 = c1559a0.m3576t();
                            break;
                        case "body":
                            strM3561C35 = c1559a0.m3561C();
                            break;
                        case "timestamp":
                            dM3572p4 = c1559a0.m3572p();
                            break;
                        case "level":
                            enumC1868e2 = (EnumC1868e2) c1559a0.m3559A(iLogger, new C1865e(16));
                            break;
                        case "attributes":
                            mapM3580x3 = c1559a0.m3580x(iLogger, new C1865e(i6));
                            break;
                        case "trace_id":
                            c1970t7 = (C1970t) c1559a0.m3559A(iLogger, new C1850a(22));
                            break;
                        default:
                            if (map7 == null) {
                                map7 = new HashMap();
                            }
                            c1559a0.m3562D(iLogger, map7, strM3581y9);
                            break;
                    }
                }
                c1559a0.m3568i();
                if (c1970t7 == null) {
                    IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"trace_id\"");
                    iLogger.mo3683r(EnumC1657a2.ERROR, "Missing required field \"trace_id\"", illegalStateException2);
                    throw illegalStateException2;
                }
                if (dM3572p4 == null) {
                    IllegalStateException illegalStateException3 = new IllegalStateException("Missing required field \"timestamp\"");
                    iLogger.mo3683r(EnumC1657a2.ERROR, "Missing required field \"timestamp\"", illegalStateException3);
                    throw illegalStateException3;
                }
                if (strM3561C35 == null) {
                    IllegalStateException illegalStateException4 = new IllegalStateException("Missing required field \"body\"");
                    iLogger.mo3683r(EnumC1657a2.ERROR, "Missing required field \"body\"", illegalStateException4);
                    throw illegalStateException4;
                }
                if (enumC1868e2 == null) {
                    IllegalStateException illegalStateException5 = new IllegalStateException("Missing required field \"level\"");
                    iLogger.mo3683r(EnumC1657a2.ERROR, "Missing required field \"level\"", illegalStateException5);
                    throw illegalStateException5;
                }
                C1835c2 c1835c2 = new C1835c2();
                c1835c2.f6625a = c1970t7;
                c1835c2.f6626b = dM3572p4;
                c1835c2.f6627c = strM3561C35;
                c1835c2.f6628d = enumC1868e2;
                c1835c2.f6630f = mapM3580x3;
                c1835c2.f6629e = numM3576t5;
                c1835c2.f6631g = map7;
                return c1835c2;
            case 14:
                c1559a0.m3567f();
                Object objM3582z = null;
                AbstractMap map8 = null;
                String strM3561C36 = null;
                while (c1559a0.m3564F() == EnumC2050b.NAME) {
                    String strM3581y15 = c1559a0.m3581y();
                    strM3581y15.getClass();
                    if (strM3581y15.equals("type")) {
                        strM3561C36 = c1559a0.m3561C();
                    } else if (strM3581y15.equals("value")) {
                        objM3582z = c1559a0.m3582z();
                    } else {
                        if (map8 == null) {
                            map8 = new HashMap();
                        }
                        c1559a0.m3562D(iLogger, map8, strM3581y15);
                    }
                }
                c1559a0.m3568i();
                if (strM3561C36 == null) {
                    IllegalStateException illegalStateException6 = new IllegalStateException("Missing required field \"type\"");
                    iLogger.mo3683r(EnumC1657a2.ERROR, "Missing required field \"type\"", illegalStateException6);
                    throw illegalStateException6;
                }
                C1960j c1960j = new C1960j();
                c1960j.f6951b = strM3561C36;
                if (objM3582z == null || !strM3561C36.equals("string")) {
                    c1960j.f6952c = objM3582z;
                } else {
                    c1960j.f6952c = objM3582z.toString();
                }
                c1960j.f6953d = map8;
                return c1960j;
            case 15:
                c1559a0.m3567f();
                AbstractMap map9 = null;
                ArrayList arrayListM3577u2 = null;
                while (c1559a0.m3564F() == EnumC2050b.NAME) {
                    String strM3581y16 = c1559a0.m3581y();
                    strM3581y16.getClass();
                    if (strM3581y16.equals("items")) {
                        arrayListM3577u2 = c1559a0.m3577u(iLogger, new C1865e(13));
                    } else {
                        if (map9 == null) {
                            map9 = new HashMap();
                        }
                        c1559a0.m3562D(iLogger, map9, strM3581y16);
                    }
                }
                c1559a0.m3568i();
                if (arrayListM3577u2 != null) {
                    C1864d2 c1864d2 = new C1864d2(0, arrayListM3577u2);
                    c1864d2.f6689c = map9;
                    return c1864d2;
                }
                IllegalStateException illegalStateException7 = new IllegalStateException("Missing required field \"items\"");
                iLogger.mo3683r(EnumC1657a2.ERROR, "Missing required field \"items\"", illegalStateException7);
                throw illegalStateException7;
            case 16:
                return EnumC1868e2.valueOf(c1559a0.m3560B().toUpperCase(Locale.ROOT));
            case 17:
                C2059x2 c2059x2 = new C2059x2();
                c1559a0.m3567f();
                EnumC2055w2 enumC2055w2 = null;
                String strM3561C37 = null;
                Date dateM3570m4 = null;
                HashMap map10 = null;
                C1970t c1970t8 = null;
                Date dateM3570m5 = null;
                List list4 = null;
                List list5 = null;
                List list6 = null;
                Integer numM3576t6 = null;
                while (c1559a0.m3564F() == EnumC2050b.NAME) {
                    strM3581y10 = c1559a0.m3581y();
                    strM3581y10.getClass();
                    switch (strM3581y10) {
                        case "replay_id":
                            c1970t8 = (C1970t) c1559a0.m3559A(iLogger, new C1850a(22));
                            break;
                        case "replay_start_timestamp":
                            dateM3570m5 = c1559a0.m3570m(iLogger);
                            break;
                        case "type":
                            strM3561C37 = c1559a0.m3561C();
                            break;
                        case "urls":
                            list4 = (List) c1559a0.m3582z();
                            break;
                        case "timestamp":
                            dateM3570m4 = c1559a0.m3570m(iLogger);
                            break;
                        case "error_ids":
                            list5 = (List) c1559a0.m3582z();
                            break;
                        case "trace_ids":
                            list6 = (List) c1559a0.m3582z();
                            break;
                        case "replay_type":
                            enumC2055w2 = (EnumC2055w2) c1559a0.m3559A(iLogger, new C1865e(18));
                            break;
                        case "segment_id":
                            numM3576t6 = c1559a0.m3576t();
                            break;
                        default:
                            if (!AbstractC1856a.m4061g(c2059x2, strM3581y10, c1559a0, iLogger)) {
                                if (map10 == null) {
                                    map10 = new HashMap();
                                }
                                c1559a0.m3562D(iLogger, map10, strM3581y10);
                                break;
                            } else {
                                break;
                            }
                            break;
                    }
                }
                c1559a0.m3568i();
                if (strM3561C37 != null) {
                    c2059x2.f7281q = strM3561C37;
                }
                if (enumC2055w2 != null) {
                    c2059x2.f7282r = enumC2055w2;
                }
                if (numM3576t6 != null) {
                    c2059x2.f7284t = numM3576t6.intValue();
                }
                if (dateM3570m4 != null) {
                    c2059x2.f7285u = dateM3570m4;
                }
                c2059x2.f7283s = c1970t8;
                c2059x2.f7286v = dateM3570m5;
                c2059x2.f7287w = list4;
                c2059x2.f7288x = list5;
                c2059x2.f7289y = list6;
                c2059x2.f7290z = map10;
                return c2059x2;
            case 18:
                return EnumC2055w2.valueOf(c1559a0.m3560B().toUpperCase(Locale.ROOT));
            case 19:
                int i10 = 3;
                c1559a0.m3567f();
                Integer numM3576t7 = null;
                ConcurrentHashMap concurrentHashMap8 = null;
                EnumC1577E2 enumC1577E2ValueOf = null;
                Date dateM3570m6 = null;
                Date dateM3570m7 = null;
                String strM3561C38 = null;
                String str3 = null;
                Boolean boolM3569l9 = null;
                Long lM3579w5 = null;
                Double dM3572p5 = null;
                String strM3561C39 = null;
                String strM3561C40 = null;
                String strM3561C41 = null;
                String strM3561C42 = null;
                String strM3561C43 = null;
                while (c1559a0.m3564F() == EnumC2050b.NAME) {
                    String strM3581y17 = c1559a0.m3581y();
                    strM3581y17.getClass();
                    switch (strM3581y17.hashCode()) {
                        case -1992012396:
                            i = strM3581y17.equals("duration") ? 0 : -1;
                            break;
                        case -1897185151:
                            i = strM3581y17.equals("started") ? 1 : -1;
                            break;
                        case -1294635157:
                            i = strM3581y17.equals("errors") ? 2 : -1;
                            break;
                        case -892481550:
                            i = strM3581y17.equals("status") ? i10 : -1;
                            break;
                        case 99455:
                            i = strM3581y17.equals("did") ? 4 : -1;
                            break;
                        case 113759:
                            i = strM3581y17.equals("seq") ? 5 : -1;
                            break;
                        case 113870:
                            i = strM3581y17.equals("sid") ? 6 : -1;
                            break;
                        case 3237136:
                            i = strM3581y17.equals("init") ? 7 : -1;
                            break;
                        case 55126294:
                            i = strM3581y17.equals("timestamp") ? 8 : -1;
                            break;
                        case 93152418:
                            i = strM3581y17.equals("attrs") ? 9 : -1;
                            break;
                        case 213717026:
                            i = strM3581y17.equals("abnormal_mechanism") ? 10 : -1;
                            break;
                        default:
                            i = -1;
                            break;
                    }
                    switch (i) {
                        case 0:
                            dM3572p5 = c1559a0.m3572p();
                            continue;
                            i10 = 3;
                            break;
                        case 1:
                            dateM3570m6 = c1559a0.m3570m(iLogger);
                            continue;
                            i10 = 3;
                            break;
                        case 2:
                            numM3576t7 = c1559a0.m3576t();
                            continue;
                            i10 = 3;
                            break;
                        case 3:
                            String strM4182a = AbstractC2038j.m4182a(c1559a0.m3561C());
                            if (strM4182a != null) {
                                enumC1577E2ValueOf = EnumC1577E2.valueOf(strM4182a);
                            } else {
                                continue;
                            }
                            i10 = 3;
                            break;
                        case 4:
                            strM3561C38 = c1559a0.m3561C();
                            continue;
                            i10 = 3;
                            break;
                        case 5:
                            lM3579w5 = c1559a0.m3579w();
                            continue;
                            i10 = 3;
                            break;
                        case 6:
                            String strM3561C44 = c1559a0.m3561C();
                            if (strM3561C44 == null || !(strM3561C44.length() == 36 || strM3561C44.length() == 32)) {
                                iLogger.mo3680e(EnumC1657a2.ERROR, "%s sid is not valid.", strM3561C44);
                            } else {
                                str3 = strM3561C44;
                                continue;
                            }
                            i10 = 3;
                            break;
                        case 7:
                            boolM3569l9 = c1559a0.m3569l();
                            continue;
                            i10 = 3;
                            break;
                        case LuaJitConsts.LUA_TTHREAD /* 8 */:
                            dateM3570m7 = c1559a0.m3570m(iLogger);
                            continue;
                            i10 = 3;
                            break;
                        case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                            c1559a0.m3567f();
                            while (c1559a0.m3564F() == EnumC2050b.NAME) {
                                String strM3581y18 = c1559a0.m3581y();
                                strM3581y18.getClass();
                                switch (strM3581y18.hashCode()) {
                                    case -85904877:
                                        i2 = strM3581y18.equals("environment") ? 0 : -1;
                                        break;
                                    case 1090594823:
                                        i2 = strM3581y18.equals(BuildConfig.BUILD_TYPE) ? 1 : -1;
                                        break;
                                    case 1480014044:
                                        i2 = strM3581y18.equals("ip_address") ? 2 : -1;
                                        break;
                                    case 1917799825:
                                        i2 = strM3581y18.equals("user_agent") ? i10 : -1;
                                        break;
                                    default:
                                        i2 = -1;
                                        break;
                                }
                                switch (i2) {
                                    case 0:
                                        strM3561C41 = c1559a0.m3561C();
                                        break;
                                    case 1:
                                        strM3561C42 = c1559a0.m3561C();
                                        break;
                                    case 2:
                                        strM3561C39 = c1559a0.m3561C();
                                        break;
                                    case 3:
                                        strM3561C40 = c1559a0.m3561C();
                                        break;
                                    default:
                                        switch (c1559a0.f5580a) {
                                            case 0:
                                                C2049a c2049a = (C2049a) c1559a0.f5581b;
                                                int i11 = 0;
                                                while (true) {
                                                    int iM4203l = c2049a.f7254h;
                                                    if (iM4203l == 0) {
                                                        iM4203l = c2049a.m4203l();
                                                    }
                                                    if (iM4203l == i10) {
                                                        i3 = 1;
                                                        c2049a.m4195D(1);
                                                    } else {
                                                        i3 = 1;
                                                        if (iM4203l == 1) {
                                                            c2049a.m4195D(i10);
                                                        } else if (iM4203l == 4) {
                                                            c2049a.f7259m--;
                                                            i11--;
                                                            i5 = 0;
                                                            c2049a.f7254h = i5;
                                                            if (i11 != 0) {
                                                                int[] iArr = c2049a.f7261o;
                                                                int i12 = c2049a.f7259m - i3;
                                                                iArr[i12] = iArr[i12] + i3;
                                                                c2049a.f7260n[i12] = "null";
                                                            } else {
                                                                i10 = 3;
                                                            }
                                                            break;
                                                        } else if (iM4203l == 2) {
                                                            c2049a.f7259m--;
                                                            i11--;
                                                            i5 = 0;
                                                            i3 = 1;
                                                            c2049a.f7254h = i5;
                                                            if (i11 != 0) {
                                                            }
                                                        } else {
                                                            char c = '\f';
                                                            if (iM4203l == 14 || iM4203l == 10) {
                                                                while (true) {
                                                                    i4 = 0;
                                                                    while (true) {
                                                                        int i13 = c2049a.f7250d + i4;
                                                                        if (i13 < c2049a.f7251e) {
                                                                            char c2 = c2049a.f7249c[i13];
                                                                            if (c2 != '\t' && c2 != '\n' && c2 != c && c2 != '\r' && c2 != ' ') {
                                                                                if (c2 == '#') {
                                                                                    break;
                                                                                } else if (c2 != ',') {
                                                                                    if (c2 == '/' || c2 == '=') {
                                                                                        break;
                                                                                    } else if (c2 != '{' && c2 != '}' && c2 != ':') {
                                                                                        if (c2 == ';') {
                                                                                            break;
                                                                                        } else {
                                                                                            switch (c2) {
                                                                                                case '[':
                                                                                                case ']':
                                                                                                    break;
                                                                                                case '\\':
                                                                                                    break;
                                                                                                default:
                                                                                                    i4++;
                                                                                                    c = '\f';
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            c2049a.f7250d = i13;
                                                                            i3 = 1;
                                                                            if (c2049a.m4206p(1)) {
                                                                                c = '\f';
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                c2049a.f7250d += i4;
                                                                i3 = 1;
                                                            } else {
                                                                if (iM4203l == 8 || iM4203l == 12) {
                                                                    c2049a.m4197F('\'');
                                                                } else if (iM4203l == 9 || iM4203l == 13) {
                                                                    c2049a.m4197F('\"');
                                                                } else if (iM4203l == 16) {
                                                                    c2049a.f7250d += c2049a.f7256j;
                                                                }
                                                                i3 = 1;
                                                            }
                                                            i5 = 0;
                                                            c2049a.f7254h = i5;
                                                            if (i11 != 0) {
                                                            }
                                                        }
                                                    }
                                                    i11++;
                                                    i5 = 0;
                                                    c2049a.f7254h = i5;
                                                    if (i11 != 0) {
                                                    }
                                                }
                                                break;
                                        }
                                        break;
                                }
                                i10 = 3;
                            }
                            c1559a0.m3568i();
                            continue;
                            i10 = 3;
                            break;
                        case 10:
                            strM3561C43 = c1559a0.m3561C();
                            break;
                        default:
                            if (concurrentHashMap8 == null) {
                                concurrentHashMap8 = new ConcurrentHashMap();
                            }
                            c1559a0.m3562D(iLogger, concurrentHashMap8, strM3581y17);
                            break;
                    }
                    i10 = 3;
                }
                if (enumC1577E2ValueOf == null) {
                    throw m4090d("status", iLogger);
                }
                if (dateM3570m6 == null) {
                    throw m4090d("started", iLogger);
                }
                if (numM3576t7 == null) {
                    throw m4090d("errors", iLogger);
                }
                if (strM3561C42 == null) {
                    throw m4090d(BuildConfig.BUILD_TYPE, iLogger);
                }
                C1581F2 c1581f2 = new C1581F2(enumC1577E2ValueOf, dateM3570m6, dateM3570m7, numM3576t7.intValue(), strM3561C38, str3, boolM3569l9, lM3579w5, dM3572p5, strM3561C39, strM3561C40, strM3561C41, strM3561C42, strM3561C43);
                c1581f2.f5711p = concurrentHashMap8;
                c1559a0.m3568i();
                return c1581f2;
            case LuaJitConsts.LUA_MINSTACK /* 20 */:
                return m4088b(c1559a0, iLogger);
            case 21:
                return new C1601K2(c1559a0.m3560B());
            case 22:
                return EnumC1605L2.valueOf(c1559a0.m3560B().toUpperCase(Locale.ROOT));
            case 23:
                c1559a0.m3567f();
                ConcurrentHashMap concurrentHashMap9 = null;
                String strM3561C45 = null;
                C1970t c1970t9 = null;
                String strM3561C46 = null;
                String strM3561C47 = null;
                String strM3561C48 = null;
                C1970t c1970t10 = null;
                String strM3561C49 = null;
                String strM3561C50 = null;
                String strM3561C51 = null;
                String strM3560B = null;
                while (c1559a0.m3564F() == EnumC2050b.NAME) {
                    strM3581y11 = c1559a0.m3581y();
                    strM3581y11.getClass();
                    switch (strM3581y11) {
                        case "replay_id":
                            c1970t10 = new C1970t(c1559a0.m3560B());
                            break;
                        case "user_id":
                            strM3561C51 = c1559a0.m3561C();
                            break;
                        case "environment":
                            strM3561C46 = c1559a0.m3561C();
                            break;
                        case "sample_rand":
                            strM3561C49 = c1559a0.m3561C();
                            break;
                        case "sample_rate":
                            strM3561C47 = c1559a0.m3561C();
                            break;
                        case "release":
                            strM3561C45 = c1559a0.m3561C();
                            break;
                        case "trace_id":
                            c1970t9 = new C1970t(c1559a0.m3560B());
                            break;
                        case "sampled":
                            strM3561C48 = c1559a0.m3561C();
                            break;
                        case "public_key":
                            strM3560B = c1559a0.m3560B();
                            break;
                        case "transaction":
                            strM3561C50 = c1559a0.m3561C();
                            break;
                        default:
                            if (concurrentHashMap9 == null) {
                                concurrentHashMap9 = new ConcurrentHashMap();
                            }
                            c1559a0.m3562D(iLogger, concurrentHashMap9, strM3581y11);
                            break;
                    }
                }
                if (c1970t9 == null) {
                    throw m4091e("trace_id", iLogger);
                }
                if (strM3560B == null) {
                    throw m4091e("public_key", iLogger);
                }
                C1613N2 c1613n22 = new C1613N2(c1970t9, strM3560B, strM3561C45, strM3561C46, strM3561C51, strM3561C50, strM3561C47, strM3561C48, c1970t10, strM3561C49);
                c1613n22.f5811k = concurrentHashMap9;
                c1559a0.m3568i();
                return c1613n22;
            default:
                c1559a0.m3567f();
                C1970t c1970t11 = null;
                String strM3561C52 = null;
                String strM3561C53 = null;
                String strM3561C54 = null;
                HashMap map11 = null;
                while (c1559a0.m3564F() == EnumC2050b.NAME) {
                    strM3581y12 = c1559a0.m3581y();
                    strM3581y12.getClass();
                    switch (strM3581y12) {
                        case "comments":
                            strM3561C54 = c1559a0.m3561C();
                            break;
                        case "name":
                            strM3561C52 = c1559a0.m3561C();
                            break;
                        case "email":
                            strM3561C53 = c1559a0.m3561C();
                            break;
                        case "event_id":
                            c1970t11 = new C1970t(c1559a0.m3560B());
                            break;
                        default:
                            if (map11 == null) {
                                map11 = new HashMap();
                            }
                            c1559a0.m3562D(iLogger, map11, strM3581y12);
                            break;
                    }
                }
                c1559a0.m3568i();
                if (c1970t11 != null) {
                    C1632S2 c1632s2 = new C1632S2(c1970t11, strM3561C52, strM3561C53, strM3561C54);
                    c1632s2.f5863e = map11;
                    return c1632s2;
                }
                IllegalStateException illegalStateException8 = new IllegalStateException("Missing required field \"event_id\"");
                iLogger.mo3683r(EnumC1657a2.ERROR, "Missing required field \"event_id\"", illegalStateException8);
                throw illegalStateException8;
        }
    }
}
