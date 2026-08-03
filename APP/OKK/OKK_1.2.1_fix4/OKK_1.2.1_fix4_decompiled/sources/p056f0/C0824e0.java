package p056f0;

import de.robv.android.xposed.AbstractC0761c;
import de.robv.android.xposed.C0760b;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: f0.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0824e0 extends AbstractC0761c {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f2988b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Class f2989c;

    public C0824e0(Class cls, ClassLoader classLoader, int i2) {
        this.f2988b = i2;
        C0826f0 c0826f0 = C0826f0.f2992a;
        this.f2989c = cls;
        switch (i2) {
        }
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: a */
    public void mo1385a(C0760b c0760b) {
        Class cls = this.f2989c;
        switch (this.f2988b) {
            case 0:
                if (cls.isInstance(c0760b.f2669b)) {
                    Object obj = c0760b.f2669b;
                    AbstractC0307g.m702d(obj, "thisObject");
                    C0826f0 c0826f0 = C0826f0.f2992a;
                    C0826f0.m2140f(obj);
                    break;
                }
                break;
            case 1:
                if (cls.isInstance(c0760b.f2669b)) {
                    Object obj2 = c0760b.f2669b;
                    AbstractC0307g.m702d(obj2, "thisObject");
                    C0826f0 c0826f02 = C0826f0.f2992a;
                    C0826f0.m2140f(obj2);
                    break;
                }
                break;
        }
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: b */
    public void mo1386b(C0760b c0760b) {
        Class cls = this.f2989c;
        switch (this.f2988b) {
            case 2:
                Object obj = c0760b.f2669b;
                AbstractC0307g.m702d(obj, "thisObject");
                Object objM2136b = C0826f0.m2136b(cls, obj);
                if (objM2136b != null) {
                    C0826f0 c0826f0 = C0826f0.f2992a;
                    C0826f0.m2140f(objM2136b);
                }
                break;
            case 3:
                Object obj2 = c0760b.f2669b;
                AbstractC0307g.m702d(obj2, "thisObject");
                Object objM2136b2 = C0826f0.m2136b(cls, obj2);
                if (objM2136b2 != null) {
                    C0826f0 c0826f02 = C0826f0.f2992a;
                    C0826f0.m2140f(objM2136b2);
                }
                break;
        }
    }
}
