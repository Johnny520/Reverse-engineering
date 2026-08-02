package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ve2 implements InterfaceC0772ug {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11919a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jw0 f11920b;

    public /* synthetic */ ve2(jw0 jw0Var, int i) {
        this.f11919a = i;
        this.f11920b = jw0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // p000.InterfaceC0772ug
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo2148a(Object[] objArr, t00 t00Var) {
        ue2 ue2Var;
        we2 we2Var;
        int i = this.f11919a;
        jw0 jw0Var = this.f11920b;
        k20 k20Var = k20.f5323h;
        switch (i) {
            case 0:
                if (t00Var instanceof ue2) {
                    ue2Var = (ue2) t00Var;
                    int i2 = ue2Var.f11262m;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        ue2Var.f11262m = i2 - Integer.MIN_VALUE;
                    } else {
                        ue2Var = new ue2(this, (u00) t00Var);
                    }
                }
                Object objM2587f = ue2Var.f11260k;
                int i3 = ue2Var.f11262m;
                try {
                    if (i3 == 0) {
                        fg1.m1627T(objM2587f);
                        sp0.m4929a0(2, objArr);
                        String strM4941g0 = sp0.m4941g0("url", objArr[0]);
                        Object obj = objArr[1];
                        ue2Var.f11262m = 1;
                        objM2587f = jw0Var.m2587f(strM4941g0, obj, ue2Var);
                        if (objM2587f == k20Var) {
                            return k20Var;
                        }
                    } else {
                        if (i3 != 1) {
                            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.m1627T(objM2587f);
                    }
                    return AbstractC0179eu.m1472v(objM2587f);
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th) {
                    return AbstractC0179eu.m1471u(th);
                }
            default:
                if (t00Var instanceof we2) {
                    we2Var = (we2) t00Var;
                    int i4 = we2Var.f12477m;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        we2Var.f12477m = i4 - Integer.MIN_VALUE;
                    } else {
                        we2Var = new we2(this, (u00) t00Var);
                    }
                }
                Object objM2585d = we2Var.f12475k;
                int i5 = we2Var.f12477m;
                try {
                    if (i5 == 0) {
                        fg1.m1627T(objM2585d);
                        sp0.m4929a0(3, objArr);
                        String strM4941g02 = sp0.m4941g0("url", objArr[0]);
                        hg2 hg2VarM2274y = i51.m2274y("destination", objArr[1]);
                        Object obj2 = objArr[2];
                        we2Var.f12477m = 1;
                        objM2585d = jw0Var.m2585d(strM4941g02, hg2VarM2274y, obj2, we2Var);
                        if (objM2585d == k20Var) {
                            return k20Var;
                        }
                    } else {
                        if (i5 != 1) {
                            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.m1627T(objM2585d);
                    }
                    return AbstractC0179eu.m1472v(objM2585d);
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th2) {
                    return AbstractC0179eu.m1471u(th2);
                }
        }
    }
}
