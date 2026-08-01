package p186m9;

import gb.AbstractC2706r0;
import gb.C2678j1;
import gb.C2704q1;
import gb.C2715u0;
import java.util.List;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1052o0;
import p024b9.C1038h0;
import p098g9.InterfaceC2557k;
import p172l8.AbstractC4706m;
import p172l8.EnumC4708o;
import p172l8.InterfaceC4705l;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5112w;
import p186m9.C5135p;
import p213oa.C5691b;
import p213oa.C5695f;
import p214ob.AbstractC5701a;
import p229p9.AbstractC6054y;
import p229p9.C6020m0;
import p229p9.InterfaceC5995e;
import p229p9.InterfaceC6004h;
import p229p9.InterfaceC6005h0;
import p229p9.InterfaceC6018l1;
import p342x9.EnumC9470d;
import za.InterfaceC9913k;

/* JADX INFO: renamed from: m9.o */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5134o {

    /* JADX INFO: renamed from: a */
    public final C6020m0 f15477a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4705l f15478b;

    /* JADX INFO: renamed from: c */
    public final a f15479c;

    /* JADX INFO: renamed from: d */
    public final a f15480d;

    /* JADX INFO: renamed from: e */
    public final a f15481e;

    /* JADX INFO: renamed from: f */
    public final a f15482f;

    /* JADX INFO: renamed from: g */
    public final a f15483g;

    /* JADX INFO: renamed from: h */
    public final a f15484h;

    /* JADX INFO: renamed from: i */
    public final a f15485i;

    /* JADX INFO: renamed from: j */
    public final a f15486j;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ InterfaceC2557k[] f15476l = {AbstractC1052o0.m3814i(new C1038h0(C5134o.class, "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), AbstractC1052o0.m3814i(new C1038h0(C5134o.class, "kProperty", "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), AbstractC1052o0.m3814i(new C1038h0(C5134o.class, "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), AbstractC1052o0.m3814i(new C1038h0(C5134o.class, "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), AbstractC1052o0.m3814i(new C1038h0(C5134o.class, "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), AbstractC1052o0.m3814i(new C1038h0(C5134o.class, "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), AbstractC1052o0.m3814i(new C1038h0(C5134o.class, "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), AbstractC1052o0.m3814i(new C1038h0(C5134o.class, "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0))};

    /* JADX INFO: renamed from: k */
    public static final b f15475k = new b(null);

    /* JADX INFO: renamed from: m9.o$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final int f15487a;

        public a(int i10) {
            this.f15487a = i10;
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC5995e m20959a(C5134o c5134o, InterfaceC2557k interfaceC2557k) {
            c5134o.getClass();
            interfaceC2557k.getClass();
            return c5134o.m20956c(AbstractC5701a.m23073a(interfaceC2557k.getName()), this.f15487a);
        }
    }

    public C5134o(InterfaceC6005h0 interfaceC6005h0, C6020m0 c6020m0) {
        interfaceC6005h0.getClass();
        c6020m0.getClass();
        this.f15477a = c6020m0;
        this.f15478b = AbstractC4706m.m18788b(EnumC4708o.f13922r, new C5133n(interfaceC6005h0));
        this.f15479c = new a(1);
        this.f15480d = new a(1);
        this.f15481e = new a(1);
        this.f15482f = new a(2);
        this.f15483g = new a(3);
        this.f15484h = new a(1);
        this.f15485i = new a(2);
        this.f15486j = new a(3);
    }

    /* JADX INFO: renamed from: f */
    public static final InterfaceC9913k m20955f(InterfaceC6005h0 interfaceC6005h0) {
        return interfaceC6005h0.mo12666e0(C5135p.f15521x).mo24098v();
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC5995e m20956c(String str, int i10) {
        C5695f c5695fM23027j = C5695f.m23027j(str);
        c5695fM23027j.getClass();
        InterfaceC6004h interfaceC6004hMo5518f = m20958e().mo5518f(c5695fM23027j, EnumC9470d.f32180x);
        InterfaceC5995e interfaceC5995e = interfaceC6004hMo5518f instanceof InterfaceC5995e ? (InterfaceC5995e) interfaceC6004hMo5518f : null;
        return interfaceC5995e == null ? this.f15477a.m24025d(new C5691b(C5135p.f15521x, c5695fM23027j), AbstractC5112w.m20789e(Integer.valueOf(i10))) : interfaceC5995e;
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC5995e m20957d() {
        return this.f15479c.m20959a(this, f15476l[0]);
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC9913k m20958e() {
        return (InterfaceC9913k) this.f15478b.getValue();
    }

    /* JADX INFO: renamed from: m9.o$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b {
        public /* synthetic */ b(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final AbstractC2706r0 m20960a(InterfaceC6005h0 interfaceC6005h0) {
            interfaceC6005h0.getClass();
            InterfaceC5995e interfaceC5995eM24112b = AbstractC6054y.m24112b(interfaceC6005h0, C5135p.a.f15617w0);
            if (interfaceC5995eM24112b == null) {
                return null;
            }
            C2704q1 c2704q1M9585k = C2704q1.f7069r.m9585k();
            List listMo5600d = interfaceC5995eM24112b.mo5591o().mo5600d();
            listMo5600d.getClass();
            Object objM20537I0 = AbstractC5081g0.m20537I0(listMo5600d);
            objM20537I0.getClass();
            return C2715u0.m9626h(c2704q1M9585k, interfaceC5995eM24112b, AbstractC5112w.m20789e(new C2678j1((InterfaceC6018l1) objM20537I0)));
        }

        public b() {
        }
    }
}
