package p050c0;

import de.robv.android.xposed.AbstractC0761c;
import de.robv.android.xposed.C0760b;
import java.lang.reflect.Method;
import p007D0.C0143i;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: c0.M1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0608M1 extends AbstractC0761c {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f1867b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Method f1868c;

    public C0608M1(boolean r1, Method r2) {
        this.f1867b = r1;
        this.f1868c = r2;
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: b */
    public final void mo1386b(C0760b r7) {
        C0605L1 r02 = C0605L1.f1854a;
        if (((Boolean) C0605L1.m1490e(r02).f334a).booleanValue() == true) goto L5;
        return;
    L5:
        C0143i r03 = C0605L1.m1490e(r02);
        boolean r1 = ((Boolean) r03.f334a).booleanValue();
        double r2 = ((Number) r03.f335b).doubleValue();
        double r4 = ((Number) r03.f336c).doubleValue();
        if (r1 == true) goto L9;
        return;
    L9:
        if (this.f1867b == true) goto L12;
        r2 = r4;
    L12:
        Class<?> r04 = this.f1868c.getReturnType();
        if (AbstractC0307g.m699a(r04, Float.TYPE) == false) goto L15;
    L18:
        Object r05 = Float.valueOf((float) r2);
    L19:
        r7.m1946c(r05);
        return;
    L15:
        if (AbstractC0307g.m699a(r04, Float.class) == true) goto L18;
        r05 = Double.valueOf(r2);
        goto L19
    }
}
