package p343xa;

import ba.C1082j;
import ca.C1415d0;
import p081fa.EnumC2376d0;
import p081fa.InterfaceC2379g;
import p185m8.AbstractC5081g0;
import p213oa.C5692c;
import p229p9.InterfaceC5995e;
import p229p9.InterfaceC6004h;
import p342x9.EnumC9470d;
import p373z9.InterfaceC9897j;
import za.InterfaceC9913k;

/* JADX INFO: renamed from: xa.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9473c {

    /* JADX INFO: renamed from: a */
    public final C1082j f32184a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC9897j f32185b;

    public C9473c(C1082j c1082j, InterfaceC9897j interfaceC9897j) {
        c1082j.getClass();
        interfaceC9897j.getClass();
        this.f32184a = c1082j;
        this.f32185b = interfaceC9897j;
    }

    /* JADX INFO: renamed from: a */
    public final C1082j m36900a() {
        return this.f32184a;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC5995e m36901b(InterfaceC2379g interfaceC2379g) {
        C1415d0 c1415d0;
        interfaceC2379g.getClass();
        C5692c c5692cMo8616d = interfaceC2379g.mo8616d();
        if (c5692cMo8616d != null && interfaceC2379g.mo8612L() == EnumC2376d0.f6507q) {
            return this.f32185b.mo38400d(c5692cMo8616d);
        }
        InterfaceC2379g interfaceC2379gMo8619o = interfaceC2379g.mo8619o();
        if (interfaceC2379gMo8619o == null) {
            if (c5692cMo8616d == null || (c1415d0 = (C1415d0) AbstractC5081g0.m20578l0(this.f32184a.mo3933c(c5692cMo8616d.m22997d()))) == null) {
                return null;
            }
            return c1415d0.m5506T0(interfaceC2379g);
        }
        InterfaceC5995e interfaceC5995eM36901b = m36901b(interfaceC2379gMo8619o);
        InterfaceC9913k interfaceC9913kMo5567C0 = interfaceC5995eM36901b != null ? interfaceC5995eM36901b.mo5567C0() : null;
        InterfaceC6004h interfaceC6004hMo5518f = interfaceC9913kMo5567C0 != null ? interfaceC9913kMo5567C0.mo5518f(interfaceC2379g.getName(), EnumC9470d.f32166I) : null;
        if (interfaceC6004hMo5518f instanceof InterfaceC5995e) {
            return (InterfaceC5995e) interfaceC6004hMo5518f;
        }
        return null;
    }
}
