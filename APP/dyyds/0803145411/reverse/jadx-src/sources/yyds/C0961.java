package yyds;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᛴᲁᛷᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0961 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final String f4439;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Class f4440;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final List f4441;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final InterfaceC1826 f4442;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final InterfaceC0942 f4443;

    public C0961(Class cls, Class cls2, Class cls3, List list, InterfaceC1826 interfaceC1826, InterfaceC0942 interfaceC0942) {
        this.f4440 = cls;
        this.f4441 = list;
        this.f4442 = interfaceC1826;
        this.f4443 = interfaceC0942;
        this.f4439 = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.f4440 + ", decoders=" + this.f4441 + ", transcoder=" + this.f4442 + '}';
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c0  */
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC2162 m2097(int i, int i2, C1760 c1760, InterfaceC0740 interfaceC0740, C0822 c0822) {
        InterfaceC2162 interfaceC2162Mo1240;
        InterfaceC0556 interfaceC0556;
        int iMo444;
        InterfaceC0723 interfaceC0723M4071;
        boolean z;
        boolean z2;
        boolean z3;
        Object c0440;
        InterfaceC0942 interfaceC0942 = this.f4443;
        List list = (List) interfaceC0942.mo1548();
        AbstractC0319.m992(list, "Argument must not be null");
        try {
            InterfaceC2162 interfaceC2162M2098 = m2098(interfaceC0740, i, i2, c0822, list);
            interfaceC0942.mo1557(list);
            RunnableC1650 runnableC1650 = (RunnableC1650) c1760.f8839;
            int i3 = c1760.f8838;
            C1008 c1008 = runnableC1650.f8427;
            Class<?> cls = interfaceC2162M2098.get().getClass();
            if (i3 != 4) {
                InterfaceC0556 interfaceC0556M2185 = c1008.m2185(cls);
                interfaceC0556 = interfaceC0556M2185;
                interfaceC2162Mo1240 = interfaceC0556M2185.mo1240(runnableC1650.f8423, interfaceC2162M2098, runnableC1650.f8402, runnableC1650.f8410);
            } else {
                interfaceC2162Mo1240 = interfaceC2162M2098;
                interfaceC0556 = null;
            }
            if (!interfaceC2162M2098.equals(interfaceC2162Mo1240)) {
                interfaceC2162M2098.mo1177();
            }
            if (c1008.f4594.m4645().f8014.m4071(interfaceC2162Mo1240.mo1179()) != null) {
                interfaceC0723M4071 = c1008.f4594.m4645().f8014.m4071(interfaceC2162Mo1240.mo1179());
                if (interfaceC0723M4071 == null) {
                    throw new C2566(interfaceC2162Mo1240.mo1179());
                }
                iMo444 = interfaceC0723M4071.mo444(runnableC1650.f8414);
            } else {
                iMo444 = 3;
                interfaceC0723M4071 = null;
            }
            InterfaceC1410 interfaceC1410 = runnableC1650.f8433;
            ArrayList arrayListM2187 = c1008.m2187();
            int size = arrayListM2187.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    z = false;
                    break;
                }
                if (((C1199) arrayListM2187.get(i4)).f5472.equals(interfaceC1410)) {
                    z = true;
                    break;
                }
                i4++;
            }
            switch (runnableC1650.f8429.f11507) {
                case 0:
                    z2 = i3 != 4 && i3 != 5;
                    break;
                case 1:
                case 2:
                    break;
                default:
                    if (((z || i3 != 3) && i3 != 1) || iMo444 != 2) {
                    }
                    break;
            }
            if (z2) {
                if (interfaceC0723M4071 == null) {
                    throw new C2566(interfaceC2162Mo1240.get().getClass());
                }
                int iM4012 = AbstractC2104.m4012(iMo444);
                if (iM4012 == 0) {
                    z3 = false;
                    c0440 = new C0440(runnableC1650.f8433, runnableC1650.f8418);
                } else {
                    if (iM4012 != 1) {
                        C0188.m798("Unknown strategy: ".concat(iMo444 != 1 ? iMo444 != 2 ? iMo444 != 3 ? "null" : "NONE" : "TRANSFORMED" : "SOURCE"));
                        return null;
                    }
                    z3 = false;
                    c0440 = new C0800(c1008.f4594.f12664, runnableC1650.f8433, runnableC1650.f8418, runnableC1650.f8402, runnableC1650.f8410, interfaceC0556, cls, runnableC1650.f8414);
                }
                C1264 c1264 = (C1264) C1264.f5822.mo1548();
                c1264.f5825 = z3;
                c1264.f5823 = true;
                c1264.f5826 = interfaceC2162Mo1240;
                C0644 c0644 = runnableC1650.f8403;
                c0644.f3099 = c0440;
                c0644.f3102 = interfaceC0723M4071;
                c0644.f3101 = c1264;
                interfaceC2162Mo1240 = c1264;
            }
            return this.f4442.mo1277(interfaceC2162Mo1240, c0822);
        } catch (Throwable th) {
            interfaceC0942.mo1557(list);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final InterfaceC2162 m2098(InterfaceC0740 interfaceC0740, int i, int i2, C0822 c0822, List list) throws C0975 {
        List list2 = this.f4441;
        int size = list2.size();
        InterfaceC2162 interfaceC2162Mo428 = null;
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC0814 interfaceC0814 = (InterfaceC0814) list2.get(i3);
            try {
                if (interfaceC0814.mo427(interfaceC0740.mo245(), c0822)) {
                    interfaceC2162Mo428 = interfaceC0814.mo428(interfaceC0740.mo245(), i, i2, c0822);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + interfaceC0814, e);
                }
                list.add(e);
            }
            if (interfaceC2162Mo428 != null) {
                break;
            }
        }
        if (interfaceC2162Mo428 != null) {
            return interfaceC2162Mo428;
        }
        throw new C0975(this.f4439, new ArrayList(list));
    }
}
