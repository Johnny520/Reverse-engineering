package p260x;

import java.util.Comparator;
import me.dartcv.nuke.BuildConfig;
import p049I2.AbstractC0797o;
import p049I2.C0793k;
import p255w.C3381l;

/* JADX INFO: renamed from: x.r */
/* JADX INFO: loaded from: classes.dex */
public final class C3435r implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10724a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0793k f10725b;

    public /* synthetic */ C3435r(C0793k c0793k, int i5) {
        this.f10724a = i5;
        this.f10725b = c0793k;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f10724a) {
            case 0:
                Object obj3 = ((C3381l) obj).f10541g;
                C0793k c0793k = this.f10725b;
                return AbstractC0797o.m1386k(Integer.valueOf(c0793k.m1343g(obj3)), Integer.valueOf(c0793k.m1343g(((C3381l) obj2).f10541g)));
            case BuildConfig.VERSION_CODE /* 1 */:
                Object obj4 = ((C3381l) obj).f10541g;
                C0793k c0793k2 = this.f10725b;
                return AbstractC0797o.m1386k(Integer.valueOf(c0793k2.m1343g(obj4)), Integer.valueOf(c0793k2.m1343g(((C3381l) obj2).f10541g)));
            case 2:
                Object obj5 = ((C3381l) obj2).f10541g;
                C0793k c0793k3 = this.f10725b;
                return AbstractC0797o.m1386k(Integer.valueOf(c0793k3.m1343g(obj5)), Integer.valueOf(c0793k3.m1343g(((C3381l) obj).f10541g)));
            default:
                Object obj6 = ((C3381l) obj2).f10541g;
                C0793k c0793k4 = this.f10725b;
                return AbstractC0797o.m1386k(Integer.valueOf(c0793k4.m1343g(obj6)), Integer.valueOf(c0793k4.m1343g(((C3381l) obj).f10541g)));
        }
    }
}
