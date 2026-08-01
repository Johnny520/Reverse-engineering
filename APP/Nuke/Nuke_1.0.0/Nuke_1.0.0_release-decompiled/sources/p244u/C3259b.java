package p244u;

import android.view.View;
import java.util.WeakHashMap;
import me.dartcv.nuke.BuildConfig;
import p153e1.EnumC2017m;
import p153e1.InterfaceC2007c;

/* JADX INFO: renamed from: u.b */
/* JADX INFO: loaded from: classes.dex */
public final class C3259b implements InterfaceC3267f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10079a;

    public /* synthetic */ C3259b(int i5) {
        this.f10079a = i5;
    }

    /* JADX INFO: renamed from: c */
    public static final C3257a m5508c(String str, int i5) {
        WeakHashMap weakHashMap = C3278k0.f10118v;
        return new C3257a(str, i5);
    }

    /* JADX INFO: renamed from: d */
    public static final C3274i0 m5509d(String str, int i5) {
        WeakHashMap weakHashMap = C3278k0.f10118v;
        return new C3274i0(new C3240I(0, 0, 0, 0), str);
    }

    /* JADX INFO: renamed from: e */
    public static C3278k0 m5510e(View view) {
        C3278k0 c3278k0;
        WeakHashMap weakHashMap = C3278k0.f10118v;
        synchronized (weakHashMap) {
            try {
                Object c3278k02 = weakHashMap.get(view);
                if (c3278k02 == null) {
                    c3278k02 = new C3278k0(view);
                    weakHashMap.put(view, c3278k02);
                }
                c3278k0 = (C3278k0) c3278k02;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3278k0;
    }

    @Override // p244u.InterfaceC3267f
    /* JADX INFO: renamed from: b */
    public void mo5511b(InterfaceC2007c interfaceC2007c, int i5, int[] iArr, EnumC2017m enumC2017m, int[] iArr2) {
        switch (this.f10079a) {
            case 0:
                AbstractC3273i.m5544b(iArr, iArr2, false);
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                AbstractC3273i.m5545c(i5, iArr, iArr2, false);
                break;
            case 2:
                if (enumC2017m != EnumC2017m.f6742d) {
                    AbstractC3273i.m5544b(iArr, iArr2, true);
                } else {
                    AbstractC3273i.m5545c(i5, iArr, iArr2, false);
                }
                break;
            default:
                if (enumC2017m != EnumC2017m.f6742d) {
                    AbstractC3273i.m5545c(i5, iArr, iArr2, true);
                } else {
                    AbstractC3273i.m5544b(iArr, iArr2, false);
                }
                break;
        }
    }

    public String toString() {
        switch (this.f10079a) {
            case 0:
                return "AbsoluteArrangement#Left";
            case BuildConfig.VERSION_CODE /* 1 */:
                return "AbsoluteArrangement#Right";
            case 2:
                return "Arrangement#End";
            case 3:
                return "Arrangement#Start";
            default:
                return super.toString();
        }
    }
}
