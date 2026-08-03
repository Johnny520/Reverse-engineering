package p000a;

import android.os.Handler;
import android.view.View;
import java.util.Arrays;
import p000a.C0186K3;
import p000a.C0518ca;

/* JADX INFO: renamed from: a.j2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0643j2 implements C0518ca.d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2361a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f2362b;

    public /* synthetic */ C0643j2(int i, Object obj) {
        this.f2361a = i;
        this.f2362b = obj;
    }

    @Override // p000a.C0518ca.d
    /* JADX INFO: renamed from: a */
    public final void mo1281a(C0518ca.a aVar) {
        ClassLoader classLoader;
        int i = 0;
        switch (this.f2361a) {
            case 0:
                C0738o2 c0738o2 = (C0738o2) this.f2362b;
                if (aVar instanceof C0518ca.a.b) {
                    try {
                        if (C0738o2.m1747e() && !((C0518ca.a.b) aVar).f1896b) {
                            c0738o2.f2916c.add(((C0518ca.a.b) aVar).f1895a);
                            if (!c0738o2.f2914a) {
                                c0738o2.m1750g();
                            }
                            c0738o2.m1752i();
                            break;
                        }
                    } catch (Throwable unused) {
                        return;
                    }
                }
                break;
            case 1:
                C0816s4 c0816s4 = (C0816s4) this.f2362b;
                if (aVar instanceof C0518ca.a.b) {
                    try {
                        C0186K3.f638a.getClass();
                        if (C0186K3.a.m511l() && C0186K3.a.m508i().f2444n) {
                            C0915x8 c0915x8 = C0915x8.f3530a;
                            if (!C0915x8.m2203a() && !((C0518ca.a.b) aVar).f1896b) {
                                String str = ((C0518ca.a.b) aVar).f1895a;
                                if (C0816s4.f3221J) {
                                    String str2 = "MSG-REHIDE deferred: dbWriteInProgress=true, talker=" + str;
                                    C0631i9.m1482e(str2, "msg");
                                    C0908x1.m2194b("[ConvRV] ".concat(str2));
                                    c0816s4.f3230B.add(str);
                                } else {
                                    C0631i9.m1482e(str, "wxid");
                                    boolean zM1413b = C0569f4.m1413b(str, true);
                                    C0122Gb.f389a.getClass();
                                    ((Handler) C0122Gb.f400l.m625a()).post(new RunnableC0104Fb(str, true));
                                    String str3 = "MSG-REHIDE talker=" + str + " ok=" + zM1413b;
                                    C0631i9.m1482e(str3, "msg");
                                    C0908x1.m2194b("[ConvRV] ".concat(str3));
                                    if (zM1413b && (classLoader = c0816s4.f3244k) != null) {
                                        c0816s4.f3239f.post(new RunnableC0273P0(classLoader, 3, str));
                                    }
                                }
                            }
                        }
                    } catch (Throwable unused2) {
                        return;
                    }
                    break;
                }
                break;
            case 2:
                C0874v5 c0874v5 = (C0874v5) this.f2362b;
                if (aVar instanceof C0518ca.a.b) {
                    try {
                        if (C0874v5.m2093f() && !((C0518ca.a.b) aVar).f1896b) {
                            c0874v5.f3421b.add(((C0518ca.a.b) aVar).f1895a);
                            if (!c0874v5.f3420a) {
                                c0874v5.f3420a = true;
                                View view = c0874v5.f3422c;
                                if (view != null) {
                                    view.post(new RunnableC0836t5(view, 0));
                                }
                            }
                            c0874v5.m2097i();
                            break;
                        }
                    } catch (Throwable unused3) {
                        return;
                    }
                }
                break;
            case 3:
                C0611h8 c0611h8 = (C0611h8) this.f2362b;
                if ((aVar instanceof C0518ca.a.C1335a) && c0611h8.f2259a != null) {
                    C0186K3.f638a.getClass();
                    if (C0186K3.a.m511l() && C0186K3.a.m508i().f2445o) {
                        C0518ca.a.C1335a c1335a = (C0518ca.a.C1335a) aVar;
                        C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideContactList: HideStateChanged " + c1335a.f1893b + " -> " + c1335a.f1892a + ", refresh contact list"}, 1));
                        c0611h8.m1464j();
                        break;
                    }
                }
                break;
            default:
                if (aVar instanceof C0518ca.a.C1335a) {
                    C0803ra c0803ra = (C0803ra) this.f2362b;
                    c0803ra.f3168a.runOnUiThread(new RunnableC0708ma(c0803ra, i));
                }
                break;
        }
    }
}
