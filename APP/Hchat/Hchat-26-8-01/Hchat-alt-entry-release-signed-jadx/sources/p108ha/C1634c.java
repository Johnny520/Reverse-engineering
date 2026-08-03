package p108ha;

import android.content.SharedPreferences;
import ca.RunnableC0531r;
import gg.C1414j;
import gg.InterfaceC1412h;
import p002a1.RunnableC0006d;
import p010aa.C0035c;
import p020b5.C0184c;
import p068eh.AbstractC0921a;
import p126ia.C2007a0;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;

/* JADX INFO: renamed from: ha.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1634c implements InterfaceC1412h {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5348a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5349b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1634c(Object obj, int i9) {
        this.f5348a = i9;
        this.f5349b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // gg.InterfaceC1412h
    /* JADX INFO: renamed from: a */
    public final C1414j mo3822a() {
        switch (this.f5348a) {
            case 0:
                return new C1414j(1, (C1636d) this.f5349b, AbstractC0921a.m2246i(C1636d.class), "onPostStored", "onPostStored(Ljava/lang/Object;)V", 0, 0);
            case 1:
                return new C1414j(1, (C1644h) this.f5349b, AbstractC0921a.m2246i(C1644h.class), "onPostStored", "onPostStored(Ljava/lang/Object;)V", 0, 0);
            case 2:
                return new C1414j(1, (C1650k) this.f5349b, AbstractC0921a.m2246i(C1650k.class), "onPostStored", "onPostStored(Ljava/lang/Object;)V", 0, 0);
            case 3:
                return new C1414j(1, (C1633b0) this.f5349b, AbstractC0921a.m2246i(C1633b0.class), "onPostStored", "onPostStored(Ljava/lang/Object;)V", 0, 0);
            default:
                return new C1414j(1, (C2007a0) this.f5349b, AbstractC0921a.m2246i(C2007a0.class), "onPostStored", "onPostStored(Ljava/lang/Object;)V", 0, 0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m4159b(Object obj) {
        Object c3959f;
        boolean zContainsKey;
        switch (this.f5348a) {
            case 0:
                C1636d c1636d = (C1636d) this.f5349b;
                if (c1636d.f5359b.getBoolean("comment_enable", false)) {
                    try {
                        c1636d.f5360c.execute(new RunnableC0006d(c1636d, 11, obj));
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
                return;
            case 1:
                C1644h c1644h = (C1644h) this.f5349b;
                if (c1644h.f5396b.getBoolean("enable", false)) {
                    try {
                        c1644h.f5398d.execute(new RunnableC0531r(c1644h, obj, c1644h.f5405k, 2));
                        c3959f = C3967n.f12976a;
                        break;
                    } catch (Throwable th2) {
                        c3959f = new C3959f(th2);
                    }
                    Throwable thM8182b = C3960g.m8182b(c3959f);
                    if (thM8182b != null) {
                        c1644h.f5395a.invoke("提交朋友圈自动转发任务失败", thM8182b);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                C1650k c1650k = (C1650k) this.f5349b;
                if (c1650k.f5429b.getBoolean("enable", false)) {
                    try {
                        c1650k.f5430c.execute(new RunnableC0006d(c1650k, 13, obj));
                        return;
                    } catch (Throwable unused2) {
                        return;
                    }
                }
                return;
            case 3:
                C1633b0 c1633b0 = (C1633b0) this.f5349b;
                SharedPreferences sharedPreferences = c1633b0.f5340c;
                if (sharedPreferences.getBoolean("enable", false)) {
                    if (sharedPreferences.getBoolean("system_notification", true) || sharedPreferences.getBoolean("toast", true)) {
                        try {
                            c1633b0.f5342e.execute(new RunnableC0006d(c1633b0, 15, obj));
                            return;
                        } catch (Throwable unused3) {
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                C2007a0 c2007a0 = (C2007a0) this.f5349b;
                String strM4946q = C2007a0.m4946q(obj);
                if (strM4946q != null) {
                    C0184c c0184c = c2007a0.f6759b;
                    synchronized (c0184c) {
                        zContainsKey = c0184c.m792J().containsKey(strM4946q);
                    }
                    if (zContainsKey) {
                        c2007a0.m4952i(obj);
                        c2007a0.m4959r(new C0035c(c2007a0, 19, strM4946q));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        switch (this.f5348a) {
            case 0:
                if ((obj instanceof C1634c) && (obj instanceof InterfaceC1412h)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof C1634c) && (obj instanceof InterfaceC1412h)) {
                    break;
                }
                break;
            case 2:
                if ((obj instanceof C1634c) && (obj instanceof InterfaceC1412h)) {
                    break;
                }
                break;
            case 3:
                if ((obj instanceof C1634c) && (obj instanceof InterfaceC1412h)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof C1634c) && (obj instanceof InterfaceC1412h)) {
                    break;
                }
                break;
        }
        return mo3822a().equals(((InterfaceC1412h) obj).mo3822a());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        switch (this.f5348a) {
        }
        return mo3822a().hashCode();
    }
}
