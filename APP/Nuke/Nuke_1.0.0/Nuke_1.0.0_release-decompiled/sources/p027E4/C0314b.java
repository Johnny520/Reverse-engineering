package p027E4;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import me.dartcv.nuke.BuildConfig;
import p056K2.C0891q;
import p118X3.AbstractC1682D;
import p118X3.AbstractC1687I;
import p118X3.C1686H;
import p118X3.C1711u;
import p208n4.C2706e;

/* JADX INFO: renamed from: E4.b */
/* JADX INFO: loaded from: classes.dex */
public class C0314b implements InterfaceC0327n {

    /* JADX INFO: renamed from: e */
    public static final C0314b f1031e = new C0314b(0);

    /* JADX INFO: renamed from: f */
    public static final C0314b f1032f = new C0314b(1);

    /* JADX INFO: renamed from: g */
    public static final C0314b f1033g = new C0314b(2);

    /* JADX INFO: renamed from: h */
    public static final C0314b f1034h = new C0314b(3);

    /* JADX INFO: renamed from: i */
    public static final C0314b f1035i = new C0314b(4);

    /* JADX INFO: renamed from: j */
    public static final C0314b f1036j = new C0314b(5);

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1037d;

    public /* synthetic */ C0314b(int i5) {
        this.f1037d = i5;
    }

    /* JADX WARN: Finally extract failed */
    @Override // p027E4.InterfaceC0327n
    /* JADX INFO: renamed from: a */
    public Object mo63a(Object obj) {
        switch (this.f1037d) {
            case 0:
                return obj.toString();
            case BuildConfig.VERSION_CODE /* 1 */:
                AbstractC1687I abstractC1687I = (AbstractC1687I) obj;
                try {
                    C2706e c2706e = new C2706e();
                    abstractC1687I.mo507f().mo4723q(c2706e);
                    C1711u c1711uMo506d = abstractC1687I.mo506d();
                    long jMo505c = abstractC1687I.mo505c();
                    C1686H c1686h = AbstractC1687I.f5761e;
                    C1686H c1686h2 = new C1686H(c1711uMo506d, jMo505c, c2706e);
                    abstractC1687I.close();
                    return c1686h2;
                } catch (Throwable th) {
                    abstractC1687I.close();
                    throw th;
                }
            case 2:
                return (AbstractC1682D) obj;
            case 3:
                return (AbstractC1687I) obj;
            case 4:
                ((AbstractC1687I) obj).close();
                return C0891q.f2780a;
            default:
                ((AbstractC1687I) obj).close();
                return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public List mo529b(Executor executor) {
        return Collections.singletonList(new C0329p(executor));
    }

    /* JADX INFO: renamed from: c */
    public List mo530c() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: d */
    public String mo516d(Method method, int i5) {
        return "parameter #" + (i5 + 1);
    }

    /* JADX INFO: renamed from: e */
    public Object mo517e(Method method, Class cls, Object obj, Object[] objArr) {
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: f */
    public boolean mo518f(Method method) {
        return false;
    }
}
