package p358y9;

import p186m9.AbstractC5124e;
import p186m9.C5123d;
import p229p9.InterfaceC5986b;
import p229p9.InterfaceC5995e;
import p229p9.InterfaceC6019m;
import p229p9.InterfaceC6049w;
import p229p9.InterfaceC6055y0;
import sa.AbstractC7259i;

/* JADX INFO: renamed from: y9.o */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9637o {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m37693a(int i10) {
        Object[] objArr = new Object[3];
        if (i10 == 1 || i10 == 2) {
            objArr[0] = "companionObject";
        } else if (i10 != 3) {
            objArr[0] = "propertyDescriptor";
        } else {
            objArr[0] = "memberDescriptor";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil";
        if (i10 == 1) {
            objArr[2] = "isClassCompanionObjectWithBackingFieldsInOuter";
        } else if (i10 == 2) {
            objArr[2] = "isMappedIntrinsicCompanionObject";
        } else if (i10 != 3) {
            objArr[2] = "isPropertyWithBackingFieldInOuterClass";
        } else {
            objArr[2] = "hasJvmFieldAnnotation";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX INFO: renamed from: b */
    public static boolean m37694b(InterfaceC5986b interfaceC5986b) {
        InterfaceC6049w interfaceC6049wMo12684u0;
        if (interfaceC5986b == null) {
            m37693a(3);
        }
        if ((interfaceC5986b instanceof InterfaceC6055y0) && (interfaceC6049wMo12684u0 = ((InterfaceC6055y0) interfaceC5986b).mo12684u0()) != null && interfaceC6049wMo12684u0.getAnnotations().mo3927i(C9624h0.f32757b)) {
            return true;
        }
        return interfaceC5986b.getAnnotations().mo3927i(C9624h0.f32757b);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m37695c(InterfaceC6019m interfaceC6019m) {
        if (interfaceC6019m == null) {
            m37693a(1);
        }
        return AbstractC7259i.m28771x(interfaceC6019m) && AbstractC7259i.m28770w(interfaceC6019m.mo7443b()) && !m37696d((InterfaceC5995e) interfaceC6019m);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m37696d(InterfaceC5995e interfaceC5995e) {
        if (interfaceC5995e == null) {
            m37693a(2);
        }
        return AbstractC5124e.m20828a(C5123d.f15436a, interfaceC5995e);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m37697e(InterfaceC6055y0 interfaceC6055y0) {
        if (interfaceC6055y0 == null) {
            m37693a(0);
        }
        if (interfaceC6055y0.mo12678j() == InterfaceC5986b.a.FAKE_OVERRIDE) {
            return false;
        }
        if (m37695c(interfaceC6055y0.mo7443b())) {
            return true;
        }
        return AbstractC7259i.m28771x(interfaceC6055y0.mo7443b()) && m37694b(interfaceC6055y0);
    }
}
