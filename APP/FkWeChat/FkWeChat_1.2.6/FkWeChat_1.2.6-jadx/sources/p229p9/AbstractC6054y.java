package p229p9;

import java.util.List;
import p024b9.C1038h0;
import p185m8.AbstractC5081g0;
import p213oa.C5691b;
import p213oa.C5695f;
import p342x9.EnumC9470d;
import sa.AbstractC7270t;
import sb.AbstractC7291q;
import sb.AbstractC7294t;

/* JADX INFO: renamed from: p9.y */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6054y {
    /* JADX INFO: renamed from: b */
    public static final InterfaceC5995e m24112b(InterfaceC6005h0 interfaceC6005h0, C5691b c5691b) {
        interfaceC6005h0.getClass();
        c5691b.getClass();
        InterfaceC6004h interfaceC6004hM24113c = m24113c(interfaceC6005h0, c5691b);
        if (interfaceC6004hM24113c instanceof InterfaceC5995e) {
            return (InterfaceC5995e) interfaceC6004hM24113c;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC6004h m24113c(InterfaceC6005h0 interfaceC6005h0, C5691b c5691b) {
        interfaceC6005h0.getClass();
        c5691b.getClass();
        InterfaceC6005h0 interfaceC6005h0M28850a = AbstractC7270t.m28850a(interfaceC6005h0);
        if (interfaceC6005h0M28850a == null) {
            InterfaceC6044u0 interfaceC6044u0Mo12666e0 = interfaceC6005h0.mo12666e0(c5691b.m22986f());
            List listM22998e = c5691b.m22987g().m22998e();
            InterfaceC6004h interfaceC6004hMo5518f = interfaceC6044u0Mo12666e0.mo24098v().mo5518f((C5695f) AbstractC5081g0.m20576j0(listM22998e), EnumC9470d.f32165H);
            if (interfaceC6004hMo5518f == null) {
                return null;
            }
            for (C5695f c5695f : listM22998e.subList(1, listM22998e.size())) {
                if (!(interfaceC6004hMo5518f instanceof InterfaceC5995e)) {
                    return null;
                }
                InterfaceC6004h interfaceC6004hMo5518f2 = ((InterfaceC5995e) interfaceC6004hMo5518f).mo5567C0().mo5518f(c5695f, EnumC9470d.f32165H);
                interfaceC6004hMo5518f = interfaceC6004hMo5518f2 instanceof InterfaceC5995e ? (InterfaceC5995e) interfaceC6004hMo5518f2 : null;
                if (interfaceC6004hMo5518f == null) {
                    return null;
                }
            }
            return interfaceC6004hMo5518f;
        }
        InterfaceC6044u0 interfaceC6044u0Mo12666e02 = interfaceC6005h0M28850a.mo12666e0(c5691b.m22986f());
        List listM22998e2 = c5691b.m22987g().m22998e();
        InterfaceC6004h interfaceC6004hMo5518f3 = interfaceC6044u0Mo12666e02.mo24098v().mo5518f((C5695f) AbstractC5081g0.m20576j0(listM22998e2), EnumC9470d.f32165H);
        if (interfaceC6004hMo5518f3 == null) {
            interfaceC6004hMo5518f3 = null;
            break;
        }
        for (C5695f c5695f2 : listM22998e2.subList(1, listM22998e2.size())) {
            if (interfaceC6004hMo5518f3 instanceof InterfaceC5995e) {
                InterfaceC6004h interfaceC6004hMo5518f4 = ((InterfaceC5995e) interfaceC6004hMo5518f3).mo5567C0().mo5518f(c5695f2, EnumC9470d.f32165H);
                interfaceC6004hMo5518f3 = interfaceC6004hMo5518f4 instanceof InterfaceC5995e ? (InterfaceC5995e) interfaceC6004hMo5518f4 : null;
                if (interfaceC6004hMo5518f3 != null) {
                }
            }
            interfaceC6004hMo5518f3 = null;
        }
        if (interfaceC6004hMo5518f3 != null) {
            return interfaceC6004hMo5518f3;
        }
        InterfaceC6044u0 interfaceC6044u0Mo12666e03 = interfaceC6005h0.mo12666e0(c5691b.m22986f());
        List listM22998e3 = c5691b.m22987g().m22998e();
        InterfaceC6004h interfaceC6004hMo5518f5 = interfaceC6044u0Mo12666e03.mo24098v().mo5518f((C5695f) AbstractC5081g0.m20576j0(listM22998e3), EnumC9470d.f32165H);
        if (interfaceC6004hMo5518f5 == null) {
            return null;
        }
        for (C5695f c5695f3 : listM22998e3.subList(1, listM22998e3.size())) {
            if (!(interfaceC6004hMo5518f5 instanceof InterfaceC5995e)) {
                return null;
            }
            InterfaceC6004h interfaceC6004hMo5518f6 = ((InterfaceC5995e) interfaceC6004hMo5518f5).mo5567C0().mo5518f(c5695f3, EnumC9470d.f32165H);
            interfaceC6004hMo5518f5 = interfaceC6004hMo5518f6 instanceof InterfaceC5995e ? (InterfaceC5995e) interfaceC6004hMo5518f6 : null;
            if (interfaceC6004hMo5518f5 == null) {
                return null;
            }
        }
        return interfaceC6004hMo5518f5;
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC5995e m24114d(InterfaceC6005h0 interfaceC6005h0, C5691b c5691b, C6020m0 c6020m0) {
        interfaceC6005h0.getClass();
        c5691b.getClass();
        c6020m0.getClass();
        InterfaceC5995e interfaceC5995eM24112b = m24112b(interfaceC6005h0, c5691b);
        return interfaceC5995eM24112b != null ? interfaceC5995eM24112b : c6020m0.m24025d(c5691b, AbstractC7294t.m28908P(AbstractC7294t.m28901I(AbstractC7291q.m28888p(c5691b, new C1038h0() { // from class: p9.y.a
            @Override // p024b9.C1038h0, p098g9.InterfaceC2559m
            public Object get(Object obj) {
                return ((C5691b) obj).m22985e();
            }
        }), C6052x.f19017q)));
    }

    /* JADX INFO: renamed from: e */
    public static final int m24115e(C5691b c5691b) {
        c5691b.getClass();
        return 0;
    }

    /* JADX INFO: renamed from: f */
    public static final InterfaceC6015k1 m24116f(InterfaceC6005h0 interfaceC6005h0, C5691b c5691b) {
        interfaceC6005h0.getClass();
        c5691b.getClass();
        InterfaceC6004h interfaceC6004hM24113c = m24113c(interfaceC6005h0, c5691b);
        if (interfaceC6004hM24113c instanceof InterfaceC6015k1) {
            return (InterfaceC6015k1) interfaceC6004hM24113c;
        }
        return null;
    }
}
