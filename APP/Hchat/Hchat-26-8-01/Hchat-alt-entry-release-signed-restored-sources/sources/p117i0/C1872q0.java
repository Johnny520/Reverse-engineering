package p117i0;

import android.view.InputDevice;
import android.view.KeyEvent;
import gg.AbstractC1426v;
import gg.C1410f;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import ng.AbstractC3015m;
import ng.C3022t;
import okio.C3193a;
import p041d1.C0670p;
import p041d1.InterfaceC0666l;
import p054dg.C0795n;
import p085fg.InterfaceC1231l;
import p100h0.C1511d1;
import p101h1.InterfaceC1567d;
import p136j8.C2095f;
import p236q1.AbstractC3424d;
import p236q1.C3422b;
import p240q6.C3442b;
import p240q6.C3443c;
import p249qg.C3564g;
import p256r6.AbstractC3710d;
import p256r6.C3709c;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p293u2.InterfaceC4233c;
import p321w.AbstractC4634s;
import p321w.C4629q0;
import p321w.EnumC4602h0;
import p322w0.AbstractC4662m;
import p322w0.C4651b;
import p322w0.C4659j;
import p332wb.C5094m0;
import p332wb.C5319sr;
import p343x6.C5697a;
import p343x6.C5699c;
import p343x6.C5701e;
import p343x6.C5702f;
import p343x6.C5703g;
import p357y1.C5892i1;
import p357y1.InterfaceC5885g2;
import p362y6.AbstractC5998b;
import tf.AbstractC4165l;
import tf.C4173t;
import th.C4217i;

/* JADX INFO: renamed from: i0.q0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1872q0 implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f6222g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f6223h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f6224i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1872q0(Object obj, int i9, Object obj2) {
        this.f6222g = i9;
        this.f6223h = obj;
        this.f6224i = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:110:0x031b  */
    @Override // p085fg.InterfaceC1231l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z9;
        long j3;
        Object c3959f;
        C3022t c3022tM6413W;
        Object c3959f2;
        C3022t c3022tM6413W2;
        switch (this.f6222g) {
            case 0:
                C2095f c2095f = (C2095f) this.f6223h;
                Object obj2 = c2095f.f7001b;
                C3564g c3564g = (C3564g) this.f6224i;
                synchronized (obj2) {
                    ((ArrayList) c2095f.f7002c).remove(c3564g);
                }
                return C3967n.f12976a;
            case 1:
                InterfaceC1567d interfaceC1567d = (InterfaceC1567d) obj;
                interfaceC1567d.getClass();
                InterfaceC4233c interfaceC4233cM822s = interfaceC1567d.mo4081z0().m822s();
                interfaceC1567d.mo4081z0().m800R((InterfaceC4233c) this.f6223h);
                try {
                    C4217i c4217i = (C4217i) this.f6224i;
                    c4217i.m8488p1(interfaceC1567d, c4217i.f13867E);
                    interfaceC1567d.mo4081z0().m800R(interfaceC4233cM822s);
                    return C3967n.f12976a;
                } catch (Throwable th2) {
                    interfaceC1567d.mo4081z0().m800R(interfaceC4233cM822s);
                    throw th2;
                }
            case 2:
                KeyEvent keyEvent = ((C3422b) obj).f11091a;
                if (((C4629q0) this.f6223h).m9048a() == EnumC4602h0.f15181h && keyEvent.getKeyCode() == 4) {
                    z9 = true;
                    if (AbstractC3424d.m7199c(keyEvent) == 1) {
                        ((C1511d1) this.f6224i).m4021g(null);
                    }
                } else {
                    z9 = false;
                }
                return Boolean.valueOf(z9);
            case 3:
                KeyEvent keyEvent2 = ((C3422b) obj).f11091a;
                InterfaceC0666l interfaceC0666l = (InterfaceC0666l) this.f6223h;
                InputDevice device = keyEvent2.getDevice();
                boolean zM1849g = false;
                if (device != null && device.supportsSource(513) && ((!device.isVirtual() || keyEvent2.getSource() == 33554433) && AbstractC3424d.m7199c(keyEvent2) == 2 && keyEvent2.getSource() != 257)) {
                    if (AbstractC4634s.m9069l(19, keyEvent2)) {
                        zM1849g = ((C0670p) interfaceC0666l).m1849g(5, true);
                    } else if (AbstractC4634s.m9069l(20, keyEvent2)) {
                        zM1849g = ((C0670p) interfaceC0666l).m1849g(6, true);
                    } else if (AbstractC4634s.m9069l(21, keyEvent2)) {
                        zM1849g = ((C0670p) interfaceC0666l).m1849g(3, true);
                    } else if (AbstractC4634s.m9069l(22, keyEvent2)) {
                        zM1849g = ((C0670p) interfaceC0666l).m1849g(4, true);
                    } else if (AbstractC4634s.m9069l(23, keyEvent2)) {
                        InterfaceC5885g2 interfaceC5885g2 = ((C4629q0) this.f6224i).f15328c;
                        if (interfaceC5885g2 != null) {
                            ((C5892i1) interfaceC5885g2).m10613b();
                        }
                        zM1849g = true;
                    }
                }
                return Boolean.valueOf(zM1849g);
            case 4:
                C4659j c4659j = (C4659j) obj;
                synchronized (AbstractC4662m.f15512c) {
                    j3 = AbstractC4662m.f15514e;
                    AbstractC4662m.f15514e = ((long) 1) + j3;
                }
                return new C4651b(j3, c4659j, (InterfaceC1231l) this.f6223h, (InterfaceC1231l) this.f6224i);
            case 5:
                return ((C5319sr) this.f6223h).invoke(((ArrayList) this.f6224i).get(((Number) obj).intValue()));
            case 6:
                Class cls = (Class) obj;
                C3443c c3443c = (C3443c) ((AbstractC3710d) this.f6223h);
                C3709c c3709c = (C3709c) this.f6224i;
                c3709c.getClass();
                try {
                    c3959f = AbstractC4165l.m8375L0(cls.getDeclaredMethods());
                    break;
                } catch (Throwable th3) {
                    c3959f = new C3959f(th3);
                }
                if (C3960g.m8182b(c3959f) != null) {
                    AbstractC5998b.f24364a.ordinal();
                }
                if (c3959f instanceof C3959f) {
                    c3959f = null;
                }
                Object obj3 = (List) c3959f;
                if (obj3 == null) {
                    obj3 = C4173t.f13710g;
                }
                C3022t c3022tM6413W3 = AbstractC3015m.m6413W(C5703g.m10307h(C5703g.m10307h(C5703g.m10307h(C5703g.m10307h(C5703g.m10307h(C5703g.m10307h(C5703g.m10307h(C5703g.m10307h(C5703g.m10307h(C5703g.m10307h(AbstractC3015m.m6413W(C5703g.m10306g(C5703g.m10301b(new C0795n(obj3, 6), c3443c, c3709c), c3443c, c3709c), C5702f.f23174j), c3709c, "returnType", null, new C5697a(c3709c, 2)), c3709c, "returnTypeCondition", null, new C5094m0(22)), c3709c, "genericReturnType", null, new C5094m0(28)), c3709c, "genericReturnTypeCondition", null, new C5699c(5)), c3709c, "isBridge", null, new C5699c(9)), c3709c, "isBridgeNot", null, new C5699c(10)), c3709c, "isDefault", null, new C5699c(11)), c3709c, "isDefaultNot", null, new C5699c(12)), c3709c, "defaultValue", null, new C5699c(13)), c3709c, "defaultValueCondition", null, new C5094m0(11)), new C5319sr(17));
                C1410f c1410fM3834a = AbstractC1426v.m3834a(Method.class);
                if (c1410fM3834a.equals(AbstractC1426v.m3834a(Method.class))) {
                    c3022tM6413W = AbstractC3015m.m6413W(c3022tM6413W3, new C5701e(c3709c, 6));
                } else if (c1410fM3834a.equals(AbstractC1426v.m3834a(Constructor.class))) {
                    c3022tM6413W = AbstractC3015m.m6413W(c3022tM6413W3, new C5701e(c3709c, 7));
                } else {
                    if (!c1410fM3834a.equals(AbstractC1426v.m3834a(Field.class))) {
                        C3193a.m6826p(c3022tM6413W3, "Unsupported member type: ");
                        return null;
                    }
                    c3022tM6413W = AbstractC3015m.m6413W(c3022tM6413W3, new C5701e(c3709c, 8));
                }
                return AbstractC3015m.m6418b0(c3022tM6413W);
            default:
                Class cls2 = (Class) obj;
                C3442b c3442b = (C3442b) this.f6223h;
                C3709c c3709c2 = (C3709c) this.f6224i;
                c3709c2.getClass();
                try {
                    c3959f2 = AbstractC4165l.m8375L0(cls2.getDeclaredFields());
                    break;
                } catch (Throwable th4) {
                    c3959f2 = new C3959f(th4);
                }
                if (C3960g.m8182b(c3959f2) != null) {
                    AbstractC5998b.f24364a.ordinal();
                }
                if (c3959f2 instanceof C3959f) {
                    c3959f2 = null;
                }
                Object obj4 = (List) c3959f2;
                if (obj4 == null) {
                    obj4 = C4173t.f13710g;
                }
                C3022t c3022tM6413W4 = AbstractC3015m.m6413W(C5703g.m10307h(C5703g.m10307h(C5703g.m10307h(C5703g.m10307h(C5703g.m10307h(C5703g.m10307h(AbstractC3015m.m6413W(C5703g.m10301b(new C0795n(obj4, 6), c3442b, c3709c2), C5702f.f23173i), c3709c2, "isEnumConstant", null, new C5094m0(12)), c3709c2, "isEnumConstantNot", null, new C5094m0(13)), c3709c2, "type", null, new C5697a(c3709c2, 0)), c3709c2, "typeCondition", null, new C5094m0(14)), c3709c2, "genericType", null, new C5094m0(15)), c3709c2, "genericTypeCondition", null, new C5094m0(16)), new C5319sr(17));
                C1410f c1410fM3834a2 = AbstractC1426v.m3834a(Field.class);
                if (c1410fM3834a2.equals(AbstractC1426v.m3834a(Method.class))) {
                    c3022tM6413W2 = AbstractC3015m.m6413W(c3022tM6413W4, new C5701e(c3709c2, 3));
                } else if (c1410fM3834a2.equals(AbstractC1426v.m3834a(Constructor.class))) {
                    c3022tM6413W2 = AbstractC3015m.m6413W(c3022tM6413W4, new C5701e(c3709c2, 4));
                } else {
                    if (!c1410fM3834a2.equals(AbstractC1426v.m3834a(Field.class))) {
                        C3193a.m6826p(c3022tM6413W4, "Unsupported member type: ");
                        return null;
                    }
                    c3022tM6413W2 = AbstractC3015m.m6413W(c3022tM6413W4, new C5701e(c3709c2, 5));
                }
                return AbstractC3015m.m6418b0(c3022tM6413W2);
        }
    }
}
