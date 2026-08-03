package io.sentry;

import android.app.Activity;
import android.os.SystemClock;
import androidx.core.app.FrameMetricsAggregator;
import androidx.lifecycle.ProcessLifecycleOwner;
import io.sentry.android.core.C1661D;
import io.sentry.android.core.C1662E;
import io.sentry.android.core.C1683a;
import io.sentry.android.core.C1696g;
import io.sentry.android.core.C1734p;
import io.sentry.android.core.SystemEventsBreadcrumbsIntegration;
import io.sentry.android.replay.C1780d;
import io.sentry.android.replay.C1782f;
import io.sentry.android.replay.C1789j;
import io.sentry.android.replay.C1790k;
import io.sentry.android.replay.C1792m;
import io.sentry.android.replay.C1797r;
import io.sentry.android.replay.C1798s;
import io.sentry.android.replay.C1821w;
import io.sentry.android.replay.C1824z;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.capture.AbstractC1775m;
import io.sentry.android.replay.capture.C1772j;
import io.sentry.android.replay.capture.C1773k;
import io.sentry.cache.C1841f;
import io.sentry.cache.tape.AbstractC1846e;
import io.sentry.config.AbstractC1856a;
import io.sentry.internal.modules.C1909f;
import io.sentry.logger.C1923b;
import io.sentry.protocol.C1970t;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p000.AbstractC0042Az;
import p000.AbstractC0585Nj;
import p000.AbstractC0714Qj;
import p000.AbstractC2453ra;
import p000.AbstractC2564tz;
import p000.AbstractC2659w7;
import p000.C0252Fu;
import p000.C0452Kf;
import p000.C0584Ni;
import p000.C1216bb;
import p000.C2381po;
import p000.C2438r1;
import p000.RunnableC2531t8;
import p000.WindowOnFrameMetricsAvailableListenerC0541Mi;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: io.sentry.S1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1631S1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5857a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5858b;

    public /* synthetic */ RunnableC1631S1(int i, Object obj) {
        this.f5857a = i;
        this.f5858b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02fd  */
    /* JADX WARN: Type inference failed for: r2v27, types: [Dn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v29, types: [Dn, java.lang.Object] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() throws IOException {
        File file;
        Date dateM4068n;
        EnumC2055w2 enumC2055w2ValueOf;
        C2046v2 c2046v2;
        File file2;
        C2046v2 c2046v22;
        C1780d c1780d;
        Field field;
        switch (this.f5857a) {
            case 0:
                C1638U1 c1638u1 = (C1638U1) this.f5858b;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) c1638u1.f5871a;
                for (int i = 0; i < 40; i++) {
                    try {
                        scheduledThreadPoolExecutor.schedule((RunnableC2531t8) c1638u1.f5873c, 365L, TimeUnit.DAYS).cancel(true);
                    } catch (RejectedExecutionException unused) {
                        return;
                    }
                }
                scheduledThreadPoolExecutor.purge();
                return;
            case 1:
                C1683a c1683a = (C1683a) this.f5858b;
                c1683a.f6078h = SystemClock.uptimeMillis();
                c1683a.f6079i.set(false);
                return;
            case 2:
                C0584Ni c0584Ni = ((FrameMetricsAggregator) ((C0252Fu) this.f5858b).f819a).f3910a;
                ArrayList arrayList = (ArrayList) c0584Ni.f1894c;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference weakReference = (WeakReference) arrayList.get(size);
                    Activity activity = (Activity) weakReference.get();
                    if (weakReference.get() != null) {
                        activity.getWindow().removeOnFrameMetricsAvailableListener((WindowOnFrameMetricsAvailableListenerC0541Mi) c0584Ni.f1895d);
                        arrayList.remove(size);
                    }
                }
                return;
            case 3:
                ((C1696g) this.f5858b).m3876e(true);
                return;
            case 4:
                ((C1734p) this.f5858b).m3910a(null, true);
                return;
            case 5:
                C1661D c1661d = (C1661D) this.f5858b;
                if (c1661d != null) {
                    ProcessLifecycleOwner.f3964i.f3970f.mo1556b(c1661d);
                    return;
                }
                return;
            case 6:
                ((SystemEventsBreadcrumbsIntegration) this.f5858b).m3856l();
                return;
            case 7:
                ((C1909f) this.f5858b).mo4116a();
                return;
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                ReplayIntegration replayIntegration = (ReplayIntegration) this.f5858b;
                C2046v2 c2046v23 = replayIntegration.f6384c;
                if (c2046v23 == null) {
                    c2046v23 = null;
                }
                C1841f c1841fFindPersistingScopeObserver = c2046v23.findPersistingScopeObserver();
                if (c1841fFindPersistingScopeObserver != null) {
                    C2046v2 c2046v24 = replayIntegration.f6384c;
                    if (c2046v24 == null) {
                        c2046v24 = null;
                    }
                    String str = (String) c1841fFindPersistingScopeObserver.m4015g(c2046v24, "replay.json", String.class);
                    if (str != null) {
                        C1970t c1970t = new C1970t(str);
                        if (c1970t.equals(C1970t.f7011b)) {
                            replayIntegration.m3945q("");
                            return;
                        }
                        C2046v2 c2046v25 = replayIntegration.f6384c;
                        if (c2046v25 == null) {
                            c2046v25 = null;
                        }
                        String cacheDirPath = c2046v25.getCacheDirPath();
                        if (cacheDirPath == null || cacheDirPath.length() == 0) {
                            c2046v25.getLogger().mo3680e(EnumC1657a2.WARNING, "SentryOptions.cacheDirPath is not set, session replay is no-op", new Object[0]);
                            file = null;
                        } else {
                            file = new File(c2046v25.getCacheDirPath(), "replay_" + c1970t);
                            file.mkdirs();
                        }
                        File file3 = new File(file, ".ongoing_segment");
                        if (file3.exists()) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file3), AbstractC2659w7.f9201a), 8192);
                            try {
                                Iterator it = new C1216bb(new C2381po(0, bufferedReader)).iterator();
                                while (it.hasNext()) {
                                    List listM5065Z = AbstractC2564tz.m5065Z((String) it.next(), new String[]{"="}, 2);
                                    linkedHashMap.put((String) listM5065Z.get(0), (String) listM5065Z.get(1));
                                    break;
                                }
                                bufferedReader.close();
                                String str2 = (String) linkedHashMap.get("config.height");
                                Integer numM61H = str2 != null ? AbstractC0042Az.m61H(str2) : null;
                                String str3 = (String) linkedHashMap.get("config.width");
                                Integer numM61H2 = str3 != null ? AbstractC0042Az.m61H(str3) : null;
                                String str4 = (String) linkedHashMap.get("config.frame-rate");
                                Integer numM61H3 = str4 != null ? AbstractC0042Az.m61H(str4) : null;
                                String str5 = (String) linkedHashMap.get("config.bit-rate");
                                Integer numM61H4 = str5 != null ? AbstractC0042Az.m61H(str5) : null;
                                String str6 = (String) linkedHashMap.get("segment.id");
                                Integer numM61H5 = str6 != null ? AbstractC0042Az.m61H(str6) : null;
                                try {
                                    String str7 = (String) linkedHashMap.get("segment.timestamp");
                                    if (str7 == null) {
                                        str7 = "";
                                    }
                                    dateM4068n = AbstractC1856a.m4069o(str7);
                                } catch (Throwable unused2) {
                                    dateM4068n = null;
                                }
                                try {
                                    String str8 = (String) linkedHashMap.get("replay.type");
                                    if (str8 == null) {
                                        str8 = "";
                                    }
                                    enumC2055w2ValueOf = EnumC2055w2.valueOf(str8);
                                } catch (Throwable unused3) {
                                    enumC2055w2ValueOf = null;
                                }
                                if (numM61H == null || numM61H2 == null || numM61H3 == null || numM61H4 == null || numM61H5 == null) {
                                    c2046v2 = c2046v25;
                                    file2 = file;
                                } else {
                                    Integer num = numM61H;
                                    file2 = file;
                                    if (numM61H5.intValue() == -1 || dateM4068n == null || enumC2055w2ValueOf == null) {
                                        c2046v2 = c2046v25;
                                    } else {
                                        C1821w c1821w = new C1821w(numM61H2.intValue(), num.intValue(), 1.0f, 1.0f, numM61H3.intValue(), numM61H4.intValue());
                                        C1789j c1789j = new C1789j(c2046v25, c1970t);
                                        ArrayList arrayList2 = c1789j.f6505h;
                                        File fileM3972f = c1789j.m3972f();
                                        if (fileM3972f != null) {
                                            c2046v22 = c2046v25;
                                            fileM3972f.listFiles(new C2025u(1, c1789j));
                                        } else {
                                            c2046v22 = c2046v25;
                                        }
                                        if (!arrayList2.isEmpty()) {
                                            if (arrayList2.size() > 1) {
                                                C1782f c1782f = new C1782f(0);
                                                if (arrayList2.size() > 1) {
                                                    Collections.sort(arrayList2, c1782f);
                                                }
                                            }
                                            EnumC2055w2 enumC2055w2 = EnumC2055w2.SESSION;
                                            int iIntValue = enumC2055w2ValueOf == enumC2055w2 ? numM61H5.intValue() : 0;
                                            if (enumC2055w2ValueOf != enumC2055w2) {
                                                dateM4068n = AbstractC1856a.m4068n(((C1790k) AbstractC2453ra.m4898h0(arrayList2)).f6509b);
                                            }
                                            Date date = dateM4068n;
                                            long time = (((C1790k) AbstractC2453ra.m4902l0(arrayList2)).f6509b - date.getTime()) + ((long) (1000 / numM61H3.intValue()));
                                            String str9 = (String) linkedHashMap.get("replay.recording");
                                            if (str9 != null) {
                                                C1927m1 c1927m1 = (C1927m1) c2046v22.getSerializer().mo3607a(new StringReader(str9), C1927m1.class);
                                                List linkedList = (c1927m1 != null ? c1927m1.f6818b : null) != null ? new LinkedList(c1927m1.f6818b) : null;
                                                if (linkedList == null) {
                                                    linkedList = C0452Kf.f1484a;
                                                }
                                                c1780d = new C1780d(c1821w, c1789j, date, iIntValue, time, enumC2055w2ValueOf, (String) linkedHashMap.get("replay.screen-at-start"), AbstractC2453ra.m4904n0(linkedList, new C1782f(1)));
                                            }
                                            if (c1780d != null) {
                                                replayIntegration.m3945q("");
                                                return;
                                            }
                                            C2046v2 c2046v26 = replayIntegration.f6384c;
                                            if (c2046v26 == null) {
                                                c2046v26 = null;
                                            }
                                            Object objM4015g = c1841fFindPersistingScopeObserver.m4015g(c2046v26, "breadcrumbs.json", List.class);
                                            List list = objM4015g instanceof List ? (List) objM4015g : null;
                                            C2054w1 c2054w1 = replayIntegration.f6385d;
                                            C2046v2 c2046v27 = replayIntegration.f6384c;
                                            C2046v2 c2046v28 = c2046v27 == null ? null : c2046v27;
                                            long j = c1780d.f6475e;
                                            Date date2 = c1780d.f6473c;
                                            int i2 = c1780d.f6474d;
                                            C1821w c1821w2 = c1780d.f6471a;
                                            AbstractC1775m abstractC1775mM3965a = C1772j.m3965a(c2054w1, c2046v28, j, date2, c1970t, i2, c1821w2.f6590b, c1821w2.f6589a, c1780d.f6476f, c1780d.f6472b, c1821w2.f6593e, c1821w2.f6594f, c1780d.f6477g, list, new LinkedList(c1780d.f6478h));
                                            if (abstractC1775mM3965a instanceof C1773k) {
                                                C1586H c1586hM4059e = AbstractC1856a.m4059e(new C1792m());
                                                C1773k c1773k = (C1773k) abstractC1775mM3965a;
                                                C2054w1 c2054w12 = replayIntegration.f6385d;
                                                if (c2054w12 != null) {
                                                    C2059x2 c2059x2 = c1773k.f6459a;
                                                    c1586hM4059e.f5735g = c1773k.f6460b;
                                                    c2054w12.mo3721p(c2059x2, c1586hM4059e);
                                                }
                                            }
                                            replayIntegration.m3945q(str);
                                            return;
                                        }
                                        c2046v22.getLogger().mo3680e(EnumC1657a2.DEBUG, "No frames found for replay: %s, deleting the replay", c1970t);
                                        AbstractC1856a.m4060f(file2);
                                    }
                                }
                                c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "Incorrect segment values found for replay: %s, deleting the replay", c1970t);
                                AbstractC1856a.m4060f(file2);
                                break;
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    AbstractC0585Nj.m1138f(bufferedReader, th);
                                    throw th2;
                                }
                            }
                        } else {
                            c2046v25.getLogger().mo3680e(EnumC1657a2.DEBUG, "No ongoing segment found for replay: %s", c1970t);
                            AbstractC1856a.m4060f(file);
                        }
                        c1780d = null;
                        if (c1780d != null) {
                        }
                    }
                }
                replayIntegration.m3945q("");
                return;
            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                C1798s c1798s = (C1798s) this.f5858b;
                if (c1798s.f6519a.get()) {
                    return;
                }
                try {
                    Object value = C1824z.f6598b.getValue();
                    if (value == null || (field = (Field) C1824z.f6599c.getValue()) == null) {
                        return;
                    }
                    ArrayList arrayList3 = (ArrayList) field.get(value);
                    C1981r c1981rM4173a = c1798s.f6520b.m4173a();
                    try {
                        C1797r c1797r = c1798s.f6522d;
                        c1797r.addAll(arrayList3);
                        AbstractC0714Qj.m1489k(c1981rM4173a, null);
                        field.set(value, c1797r);
                        return;
                    } finally {
                    }
                } catch (Throwable unused4) {
                    return;
                }
            case 10:
                C1841f c1841f = (C1841f) this.f5858b;
                try {
                    ((AbstractC1846e) c1841f.f6645b.m4175a()).clear();
                    return;
                } catch (IOException e) {
                    c1841f.f6644a.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to clear breadcrumbs from file queue", e);
                    return;
                }
            default:
                C1923b c1923b = (C1923b) this.f5858b;
                c1923b.f6814d.mo3695g(c1923b.f6811a.getShutdownTimeoutMillis());
                return;
        }
    }

    public /* synthetic */ RunnableC1631S1(C1683a c1683a, C2438r1 c2438r1) {
        this.f5857a = 1;
        this.f5858b = c1683a;
    }

    public /* synthetic */ RunnableC1631S1(C1662E c1662e, C1661D c1661d) {
        this.f5857a = 5;
        this.f5858b = c1661d;
    }
}
