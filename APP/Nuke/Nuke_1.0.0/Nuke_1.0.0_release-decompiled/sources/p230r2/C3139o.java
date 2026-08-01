package p230r2;

import java.util.Calendar;
import java.util.GregorianCalendar;
import me.dartcv.nuke.BuildConfig;
import p213o2.AbstractC2770B;
import p213o2.C2785n;
import p213o2.EnumC2797z;
import p213o2.InterfaceC2771C;
import p252v2.C3352a;

/* JADX INFO: renamed from: r2.o */
/* JADX INFO: loaded from: classes.dex */
public final class C3139o implements InterfaceC2771C {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f9881d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f9882e;

    public /* synthetic */ C3139o(int i5, Object obj) {
        this.f9881d = i5;
        this.f9882e = obj;
    }

    @Override // p213o2.InterfaceC2771C
    /* JADX INFO: renamed from: a */
    public final AbstractC2770B mo4967a(C2785n c2785n, C3352a c3352a) {
        switch (this.f9881d) {
            case 0:
                if (c3352a.f10417a == Number.class) {
                    return (C3140p) this.f9882e;
                }
                return null;
            case BuildConfig.VERSION_CODE /* 1 */:
                if (c3352a.f10417a == Object.class) {
                    return new C3141q(c2785n, (EnumC2797z) this.f9882e);
                }
                return null;
            default:
                Class cls = c3352a.f10417a;
                if (cls == Calendar.class || cls == GregorianCalendar.class) {
                    return (C3112P) this.f9882e;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f9881d) {
            case 2:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((C3112P) this.f9882e) + "]";
            default:
                return super.toString();
        }
    }
}
