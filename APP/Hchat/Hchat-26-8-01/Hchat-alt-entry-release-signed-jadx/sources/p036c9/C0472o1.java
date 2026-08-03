package p036c9;

import android.content.Context;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutorService;
import lb.RunnableC2539a;
import p065eb.C0872i;
import p085fg.InterfaceC1231l;
import p115hh.C1730o;
import p258r8.C3742g;
import p276sf.C3959f;
import p276sf.C3967n;
import p345x8.C5724q;
import p345x8.C5725r;

/* JADX INFO: renamed from: c9.o1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0472o1 implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1394g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C3742g f1395h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0472o1(C3742g c3742g) {
        this.f1394g = 3;
        this.f1395h = c3742g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        Object c3959f;
        Object c3959f2;
        Object c3959f3;
        Object c3959f4;
        int i9 = this.f1394g;
        C3742g c3742g = this.f1395h;
        switch (i9) {
            case 0:
                C1730o c1730o = (C1730o) obj;
                c1730o.getClass();
                try {
                    c3959f = c1730o.m4350r(c3742g.f12145c);
                    break;
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                return (Method) (c3959f instanceof C3959f ? null : c3959f);
            case 1:
                C1730o c1730o2 = (C1730o) obj;
                c1730o2.getClass();
                try {
                    c3959f2 = c1730o2.m4350r(c3742g.f12145c);
                    break;
                } catch (Throwable th3) {
                    c3959f2 = new C3959f(th3);
                }
                return (Method) (c3959f2 instanceof C3959f ? null : c3959f2);
            case 2:
                C1730o c1730o3 = (C1730o) obj;
                c1730o3.getClass();
                try {
                    c3959f3 = c1730o3.m4350r(c3742g.f12145c);
                    break;
                } catch (Throwable th4) {
                    c3959f3 = new C3959f(th4);
                }
                return (Method) (c3959f3 instanceof C3959f ? null : c3959f3);
            case 3:
                C0872i c0872i = (C0872i) obj;
                c0872i.getClass();
                ExecutorService executorService = C5724q.f23297a;
                Context context = c3742g.f12143a;
                String str = c0872i.f2676a;
                String str2 = c0872i.f2678c;
                int i10 = c0872i.f2679d;
                str2.getClass();
                C5725r c5725r = new C5725r(context);
                if (c5725r.m10385e("auto_accept_enable")) {
                    C5724q.f23297a.execute(new RunnableC2539a(str, str2, i10, c5725r, context));
                }
                return C3967n.f12976a;
            default:
                C1730o c1730o4 = (C1730o) obj;
                c1730o4.getClass();
                try {
                    c3959f4 = c1730o4.m4350r(c3742g.f12145c);
                    break;
                } catch (Throwable th5) {
                    c3959f4 = new C3959f(th5);
                }
                return (Method) (c3959f4 instanceof C3959f ? null : c3959f4);
        }
    }

    public /* synthetic */ C0472o1(Object obj, C3742g c3742g, int i9) {
        this.f1394g = i9;
        this.f1395h = c3742g;
    }
}
