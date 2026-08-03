package bb;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.HttpUrl;
import p011ab.C0042b;
import p024b9.C0220f;
import p080fb.AbstractC1184v0;
import p096g8.C1360a;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p210o8.C3086j;
import p218og.AbstractC3156t;
import p218og.C3147k;
import p276sf.C3958e;
import p332wb.AbstractC4855en;

/* JADX INFO: renamed from: bb.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0249k {

    /* JADX INFO: renamed from: a */
    public final C0250l f675a;

    /* JADX INFO: renamed from: b */
    public final C0220f f676b;

    /* JADX INFO: renamed from: c */
    public final C0042b f677c;

    /* JADX INFO: renamed from: d */
    public final C0241c f678d;

    /* JADX INFO: renamed from: e */
    public final Object f679e = new Object();

    /* JADX INFO: renamed from: f */
    public final ArrayDeque f680f = new ArrayDeque();

    /* JADX INFO: renamed from: g */
    public final HashSet f681g = new HashSet();

    /* JADX INFO: renamed from: h */
    public final ConcurrentHashMap.KeySetView f682h = ConcurrentHashMap.newKeySet();

    /* JADX INFO: renamed from: i */
    public final ConcurrentHashMap f683i = new ConcurrentHashMap();

    /* JADX INFO: renamed from: j */
    public final ConcurrentHashMap f684j = new ConcurrentHashMap();

    /* JADX INFO: renamed from: k */
    public final ConcurrentHashMap f685k = new ConcurrentHashMap();

    /* JADX INFO: renamed from: l */
    public final ConcurrentHashMap f686l = new ConcurrentHashMap();

    /* JADX INFO: renamed from: m */
    public final ConcurrentHashMap f687m = new ConcurrentHashMap();

    /* JADX INFO: renamed from: n */
    public final ConcurrentHashMap f688n = new ConcurrentHashMap();

    /* JADX INFO: renamed from: o */
    public volatile boolean f689o;

    /* JADX INFO: renamed from: p */
    public volatile boolean f690p;

    /* JADX INFO: renamed from: q */
    public volatile long f691q;

    /* JADX INFO: renamed from: r */
    public volatile long f692r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0249k(C0250l c0250l, C0220f c0220f, C0042b c0042b, C0241c c0241c) {
        this.f675a = c0250l;
        this.f676b = c0220f;
        this.f677c = c0042b;
        this.f678d = c0241c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static boolean m987g(String str) {
        return AbstractC3156t.m6733W(str, "@chatroom", false) || AbstractC3156t.m6733W(str, "@im.chatroom", false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static boolean m988h(String str) {
        C1360a c1360aAccount = WeChatApis.account();
        String strM3652c = c1360aAccount != null ? c1360aAccount.m3652c() : null;
        if (strM3652c == null) {
            strM3652c = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return strM3652c.length() > 0 && strM3652c.equals(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static String m989n(String str, String str2) {
        return AbstractC4855en.m9264h(str, "|", str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m990a() {
        synchronized (this.f679e) {
            if (this.f690p) {
                return false;
            }
            this.f690p = true;
            this.f691q = System.currentTimeMillis();
            return true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m991b(long j3, String str) {
        ConcurrentHashMap concurrentHashMap = this.f688n;
        Long l10 = (Long) concurrentHashMap.get(str);
        if (l10 != null && l10.longValue() == j3) {
            concurrentHashMap.remove(str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m992c(String str, String str2) {
        if (m987g(str)) {
            C3147k c3147k = C0250l.f693c;
            if (!AbstractC1184v0.m3174A(str2) || this.f675a.m1005e(str2) || this.f682h.contains(str2) || m994e(str, str2)) {
                return;
            }
            String strM989n = m989n(str, str2);
            synchronized (this.f679e) {
                if (this.f681g.contains(strM989n)) {
                    return;
                }
                this.f680f.addLast(new C3958e(str, str2));
                this.f681g.add(strM989n);
                m993d();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m993d() {
        m996i();
        synchronized (this.f679e) {
            if (this.f689o) {
                return;
            }
            this.f689o = true;
            C3086j c3086jTasks = WeChatApis.tasks();
            if (c3086jTasks != null) {
                c3086jTasks.m6553d(new RunnableC0247i(this, 0));
            } else {
                new Thread(new RunnableC0247i(this, 1)).start();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final boolean m994e(String str, String str2) {
        Long l10 = (Long) this.f684j.get(m989n(str, str2));
        return (l10 != null ? l10.longValue() : 0L) > System.currentTimeMillis();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final boolean m995f(long j3, String str) {
        Long l10 = (Long) this.f688n.get(str);
        return l10 != null && l10.longValue() == j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m996i() {
        synchronized (this.f679e) {
            if (this.f690p) {
                long j3 = this.f691q;
                if (j3 > 0 && System.currentTimeMillis() - j3 >= 15000) {
                    this.f690p = false;
                    this.f691q = 0L;
                    this.f682h.clear();
                    this.f688n.clear();
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m997j() {
        C3086j c3086jTasks = WeChatApis.tasks();
        if (c3086jTasks != null) {
            c3086jTasks.m6555f("real_tail_resume", ((long) (Math.random() * 700)) + 800, new RunnableC0247i(this, 2));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0103 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m998k() {
        Object obj;
        C3958e c3958e;
        while (this.f675a.f694a.getBoolean("enable", false)) {
            try {
                m996i();
            } catch (Throwable th2) {
                try {
                    this.f677c.invoke("实名尾字队列异常", th2);
                    obj = this.f679e;
                    synchronized (obj) {
                    }
                } catch (Throwable th3) {
                    synchronized (this.f679e) {
                        if (!this.f690p && this.f680f.isEmpty()) {
                            this.f689o = false;
                        }
                        throw th3;
                    }
                }
            }
            synchronized (this.f679e) {
                if (this.f690p) {
                    this.f689o = false;
                    synchronized (this.f679e) {
                        if (!this.f690p && this.f680f.isEmpty()) {
                            this.f689o = false;
                        }
                    }
                    return;
                }
                synchronized (this.f679e) {
                    if (this.f680f.isEmpty()) {
                        c3958e = null;
                    } else {
                        Object objRemoveFirst = this.f680f.removeFirst();
                        C3958e c3958e2 = (C3958e) objRemoveFirst;
                        this.f681g.remove(m989n((String) c3958e2.f12961g, (String) c3958e2.f12962h));
                        c3958e = (C3958e) objRemoveFirst;
                    }
                }
                if (c3958e == null) {
                    synchronized (this.f679e) {
                        this.f689o = false;
                    }
                    synchronized (this.f679e) {
                        if (!this.f690p && this.f680f.isEmpty()) {
                            this.f689o = false;
                        }
                    }
                    return;
                }
                String str = (String) c3958e.f12961g;
                String str2 = (String) c3958e.f12962h;
                if (!this.f675a.m1005e(str2) && !this.f682h.contains(str2) && !m994e(str, str2)) {
                    if (!this.f676b.m911c()) {
                        m992c(str, str2);
                        try {
                            Thread.sleep(800L);
                        } catch (Throwable unused) {
                        }
                    } else {
                        if (m990a()) {
                            m1000m(str, str2, false);
                            synchronized (this.f679e) {
                                this.f689o = false;
                            }
                            synchronized (this.f679e) {
                                if (!this.f690p && this.f680f.isEmpty()) {
                                    this.f689o = false;
                                }
                            }
                            return;
                        }
                        m992c(str, str2);
                    }
                }
                this.f677c.invoke("实名尾字队列异常", th2);
                obj = this.f679e;
                synchronized (obj) {
                    if (!this.f690p && this.f680f.isEmpty()) {
                        this.f689o = false;
                    }
                }
            }
        }
        obj = this.f679e;
        synchronized (obj) {
            if (!this.f690p && this.f680f.isEmpty()) {
                this.f689o = false;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final void m999l() {
        synchronized (this.f679e) {
            this.f690p = false;
            this.f691q = 0L;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m1000m(String str, String str2, boolean z9) {
        long j3;
        String strM989n = m989n(str, str2);
        this.f682h.add(str2);
        synchronized (this.f679e) {
            this.f692r++;
            this.f688n.put(strM989n, Long.valueOf(this.f692r));
            j3 = this.f692r;
        }
        new Thread(new RunnableC0246h(this, str, str2, j3, 1)).start();
        C3086j c3086jTasks = WeChatApis.tasks();
        RunnableC0246h runnableC0246h = new RunnableC0246h(this, str2, str, j3, 0);
        if (z9) {
            if (c3086jTasks != null) {
                c3086jTasks.m6554e(runnableC0246h);
                return;
            } else {
                runnableC0246h.run();
                return;
            }
        }
        if (c3086jTasks != null) {
            c3086jTasks.m6554e(runnableC0246h);
        } else {
            runnableC0246h.run();
        }
    }
}
