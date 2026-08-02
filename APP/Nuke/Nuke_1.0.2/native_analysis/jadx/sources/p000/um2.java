package p000;

import java.io.FileNotFoundException;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class um2 implements vm2, wb3 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f11373h;

    public /* synthetic */ um2(int i) {
        this.f11373h = i;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m5513b() {
        throw new NoSuchElementException();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m5514d(int i, int i2, Object obj, String str) {
        throw new IndexOutOfBoundsException(str + i + obj + i2 + ((Object) ")."));
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m5515e(Object obj, Object obj2, Object obj3, Throwable th) {
        throw new t31("Failed parsing '" + obj + obj2 + obj3, th);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m5516f(String str) {
        throw new NullPointerException(str);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m5517g(String str, Object obj) throws FileNotFoundException {
        throw new FileNotFoundException(str + obj);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m5518h(String str, Object obj, Object obj2, Object obj3) {
        throw new t31(str + obj + obj2 + obj3);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m5519i(String str) {
        throw new NoSuchElementException(str);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m5520j(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    @Override // p000.wb3
    /* JADX INFO: renamed from: a */
    public q33 mo5445a(C0690sd c0690sd) {
        return new q33(c0690sd, ts1.f10946a);
    }

    @Override // p000.vm2
    /* JADX INFO: renamed from: c */
    public tm2 mo685c(er2 er2Var) {
        sm2 sm2VarM5306e;
        sm2 sm2Var;
        sm2 sm2Var2;
        tm2 tm2Var = (tm2) er2Var.f2577j;
        bo0 bo0Var = (bo0) er2Var.f2578k;
        if (tm2Var == null) {
            return AbstractC0738tl.m5302c(er2Var, C0700sn.f10215S);
        }
        sm2 sm2Var3 = tm2Var.f10850b;
        sm2 sm2Var4 = tm2Var.f10849a;
        if (er2Var.f2576i) {
            sm2VarM5306e = AbstractC0738tl.m5306e(er2Var, bo0Var, sm2Var4);
            sm2Var2 = sm2Var3;
            sm2Var3 = sm2Var4;
            sm2Var = sm2VarM5306e;
        } else {
            sm2VarM5306e = AbstractC0738tl.m5306e(er2Var, bo0Var, sm2Var3);
            sm2Var = sm2Var4;
            sm2Var2 = sm2VarM5306e;
        }
        if (t11.m5086l(sm2VarM5306e, sm2Var3)) {
            return tm2Var;
        }
        return AbstractC0738tl.m5323v(new tm2(sm2Var, sm2Var2, er2Var.m1412b() == u20.f11067h || (er2Var.m1412b() == u20.f11069j && sm2Var.f10195b > sm2Var2.f10195b)), er2Var);
    }
}
