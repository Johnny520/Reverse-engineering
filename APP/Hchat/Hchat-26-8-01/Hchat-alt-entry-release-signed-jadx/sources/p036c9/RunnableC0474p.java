package p036c9;

import android.app.Activity;
import android.os.Handler;
import bi.C0315c;
import ca.C0517e0;
import ca.C0525l;
import ca.RunnableC0523j;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1231l;
import p109hb.C1684i0;
import p109hb.C1689l;
import p109hb.C1690m;
import p109hb.C1701x;
import p276sf.C3959f;
import p276sf.C3960g;
import p332wb.C5491y2;
import p332wb.InterfaceC5059kv;

/* JADX INFO: renamed from: c9.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0474p implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1397g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f1398h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ AtomicBoolean f1399i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Activity f1400j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f1401k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f1402l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f1403m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f1404n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0474p(AtomicBoolean atomicBoolean, Activity activity, Object obj, InterfaceC1231l interfaceC1231l, String str, String str2, boolean z9) {
        this.f1397g = 0;
        this.f1399i = atomicBoolean;
        this.f1400j = activity;
        this.f1401k = obj;
        this.f1402l = interfaceC1231l;
        this.f1403m = str;
        this.f1404n = str2;
        this.f1398h = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        Object c3959f;
        Object c3959f2;
        switch (this.f1397g) {
            case 0:
                AtomicBoolean atomicBoolean = this.f1399i;
                Activity activity = this.f1400j;
                Object obj = this.f1401k;
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f1402l;
                String str = (String) this.f1403m;
                String str2 = (String) this.f1404n;
                boolean z9 = this.f1398h;
                Handler handler = C0419b0.f1202a;
                if (!atomicBoolean.get() && !activity.isFinishing() && !activity.isDestroyed()) {
                    if (!(obj instanceof C3959f)) {
                        List list = (List) obj;
                        if (list.isEmpty()) {
                            C0419b0.m1410h(activity, "没有可选择的会话");
                        } else {
                            C5491y2.m9807U1(activity, list, interfaceC1231l, new C0315c(6), str, str2, true, null, null, z9, 2944);
                        }
                    }
                    Throwable thM8182b = C3960g.m8182b(obj);
                    if (thM8182b != null) {
                        AbstractC0921a.m2260w("[Hchat:ConversationGroup] ", str, " 读取会话失败: ", thM8182b.getMessage(), thM8182b);
                        C0419b0.m1410h(activity, "读取会话失败");
                    }
                    break;
                }
                break;
            case 1:
                C0517e0 c0517e0 = (C0517e0) this.f1401k;
                boolean z10 = this.f1398h;
                AtomicBoolean atomicBoolean2 = this.f1399i;
                AtomicBoolean atomicBoolean3 = (AtomicBoolean) this.f1402l;
                InterfaceC5059kv interfaceC5059kv = (InterfaceC5059kv) this.f1403m;
                Activity activity2 = this.f1400j;
                C0525l c0525l = (C0525l) this.f1404n;
                try {
                    C1689l c1689l = C1690m.f5615a;
                    c3959f = C1690m.m4309c(z10);
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                c0517e0.f1582d.post(new RunnableC0523j(atomicBoolean2, atomicBoolean3, interfaceC5059kv, activity2, c3959f, c0525l, c0517e0));
                break;
            default:
                C1684i0 c1684i0 = (C1684i0) this.f1401k;
                boolean z11 = this.f1398h;
                AtomicBoolean atomicBoolean4 = this.f1399i;
                AtomicBoolean atomicBoolean5 = (AtomicBoolean) this.f1402l;
                InterfaceC5059kv interfaceC5059kv2 = (InterfaceC5059kv) this.f1403m;
                Activity activity3 = this.f1400j;
                C1701x c1701x = (C1701x) this.f1404n;
                try {
                    C1689l c1689l2 = C1690m.f5615a;
                    c3959f2 = C1690m.m4309c(z11);
                } catch (Throwable th3) {
                    c3959f2 = new C3959f(th3);
                }
                c1684i0.f5584c.post(new RunnableC0523j(atomicBoolean4, atomicBoolean5, interfaceC5059kv2, activity3, c3959f2, c1701x, c1684i0));
                break;
        }
    }

    public /* synthetic */ RunnableC0474p(Object obj, boolean z9, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, InterfaceC5059kv interfaceC5059kv, Activity activity, InterfaceC1231l interfaceC1231l, int i9) {
        this.f1397g = i9;
        this.f1401k = obj;
        this.f1398h = z9;
        this.f1399i = atomicBoolean;
        this.f1402l = atomicBoolean2;
        this.f1403m = interfaceC5059kv;
        this.f1400j = activity;
        this.f1404n = interfaceC1231l;
    }
}
