package p000A;

import android.view.InputDevice;
import android.view.KeyEvent;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import me.dartcv.nuke.BuildConfig;
import p002A1.C0115D;
import p025E2.AbstractC0284d;
import p025E2.C0281a;
import p025E2.C0283c;
import p031F2.C0452b;
import p047I0.C0761s0;
import p047I0.InterfaceC0686N0;
import p056K2.AbstractC0885k;
import p056K2.C0884j;
import p056K2.C0887m;
import p056K2.C0891q;
import p058L.C0920W;
import p061L2.AbstractC0972l;
import p061L2.C0979s;
import p061L2.C0981u;
import p068N1.C1013c;
import p092S0.C1287y;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1676u;
import p117X2.C1660e;
import p127Z2.AbstractC1784a;
import p143c3.AbstractC1907i;
import p143c3.C1904f;
import p158f0.AbstractC2082n;
import p158f0.C2070b;
import p158f0.C2080l;
import p160f3.C2135g;
import p198m0.C2584o;
import p198m0.InterfaceC2581l;
import p269y2.C3491a;
import p269y2.C3492b;
import p273z0.AbstractC3510c;
import p273z0.C3509b;
import p275z2.AbstractC3517c;
import p275z2.C3516b;
import p276z3.C3521d;

/* JADX INFO: renamed from: A.X */
/* JADX INFO: loaded from: classes.dex */
public final class C0045X implements InterfaceC1601c {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f192d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f193e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f194f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0045X(int i5, Object obj, Object obj2) {
        this.f192d = i5;
        this.f193e = obj;
        this.f194f = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        Object objM3229o;
        C1904f c1904f;
        Object objM3229o2;
        C1904f c1904f2;
        long j5;
        int i5 = 17;
        int i6 = 6;
        int i7 = 5;
        int i8 = 3;
        int i9 = 4;
        boolean z5 = false;
        zM4532g = false;
        zM4532g = false;
        zM4532g = false;
        zM4532g = false;
        zM4532g = false;
        boolean zM4532g = false;
        z5 = false;
        z5 = false;
        int i10 = 1;
        int i11 = 2;
        switch (this.f192d) {
            case 0:
                KeyEvent keyEvent = ((C3509b) obj).f10951a;
                if (((C0078o0) this.f193e).m120a() == EnumC0052b0.f212e && keyEvent.getKeyCode() == 4 && AbstractC3510c.m5765c(keyEvent) == 1) {
                    ((C0920W) this.f194f).m1932g(null);
                    z5 = true;
                }
                return Boolean.valueOf(z5);
            case BuildConfig.VERSION_CODE /* 1 */:
                KeyEvent keyEvent2 = ((C3509b) obj).f10951a;
                InterfaceC2581l interfaceC2581l = (InterfaceC2581l) this.f194f;
                InputDevice device = keyEvent2.getDevice();
                if (device != null && device.supportsSource(513) && ((!device.isVirtual() || keyEvent2.getSource() == 33554433) && AbstractC3510c.m5765c(keyEvent2) == 2 && keyEvent2.getSource() != 257)) {
                    if (AbstractC0070k0.m82i(19, keyEvent2)) {
                        zM4532g = ((C2584o) interfaceC2581l).m4532g(5, true);
                    } else if (AbstractC0070k0.m82i(20, keyEvent2)) {
                        zM4532g = ((C2584o) interfaceC2581l).m4532g(6, true);
                    } else if (AbstractC0070k0.m82i(21, keyEvent2)) {
                        zM4532g = ((C2584o) interfaceC2581l).m4532g(3, true);
                    } else if (AbstractC0070k0.m82i(22, keyEvent2)) {
                        zM4532g = ((C2584o) interfaceC2581l).m4532g(4, true);
                    } else if (AbstractC0070k0.m82i(23, keyEvent2)) {
                        InterfaceC0686N0 interfaceC0686N0 = ((C0078o0) this.f193e).f339c;
                        if (interfaceC0686N0 != null) {
                            ((C0761s0) interfaceC0686N0).m1274b();
                        }
                        zM4532g = true;
                    }
                }
                return Boolean.valueOf(zM4532g);
            case 2:
                Class cls = (Class) obj;
                C3492b c3492b = (C3492b) ((AbstractC3517c) this.f193e);
                C3516b c3516b = (C3516b) this.f194f;
                c3516b.getClass();
                C0115D c0115d = AbstractC0284d.f912a;
                try {
                    objM3229o = AbstractC0972l.m2007e0(cls.getDeclaredMethods());
                    break;
                } catch (Throwable th) {
                    objM3229o = AbstractC1784a.m3229o(th);
                }
                Throwable thM1902a = AbstractC0885k.m1902a(objM3229o);
                if (thM1902a != null) {
                    C0887m c0887m = C0452b.f1350a;
                    C0452b.m737a("Failed to get declared methods in " + c0115d + " because got an exception.", thM1902a);
                }
                if (objM3229o instanceof C0884j) {
                    objM3229o = null;
                }
                Object obj2 = (List) objM3229o;
                if (obj2 == null) {
                    obj2 = C0981u.f3047d;
                }
                int i12 = 7;
                int i13 = 13;
                int i14 = 14;
                C1904f c1904fM499m = AbstractC0284d.m499m(AbstractC0284d.m499m(AbstractC0284d.m499m(AbstractC0284d.m499m(AbstractC0284d.m499m(AbstractC0284d.m499m(AbstractC0284d.m499m(AbstractC0284d.m499m(AbstractC0284d.m499m(AbstractC0284d.m499m(AbstractC0284d.m499m(AbstractC0284d.m499m(AbstractC0284d.m499m(AbstractC0284d.m499m(AbstractC0284d.m487a(new C0979s(0, obj2), c3492b, c3516b), c3516b, "parameters", c3492b.f10870g, new C0281a(c3516b, z5 ? 1 : 0)), c3516b, "parametersNot", c3492b.f10871h, new C0281a(c3516b, i12)), c3516b, "parametersCondition", null, new C0027N0(10)), c3516b, "parameterCount", null, new C0027N0(11)), c3516b, "parameterCountCondition", null, new C0027N0(12)), c3516b, "typeParameters", c3492b.f10872i, new C0027N0(i13)), c3516b, "typeParametersNot", c3492b.f10873j, new C0027N0(i14)), c3516b, "exceptionTypes", c3492b.f10874k, new C0281a(c3516b, i13)), c3516b, "exceptionTypesNot", c3492b.f10875l, new C0281a(c3516b, i14)), c3516b, "genericExceptionTypes", c3492b.f10876m, new C0027N0(15)), c3516b, "genericExceptionTypesNot", c3492b.f10877n, new C0027N0(i9)), c3516b, "genericParameters", c3492b.f10878o, new C0027N0(i7)), c3516b, "genericParametersNot", c3492b.f10879p, new C0027N0(i6)), c3516b, "isVarArgs", null, new C0027N0(i12));
                int i15 = 8;
                int i16 = 9;
                C1904f c1904fM499m2 = AbstractC0284d.m499m(AbstractC0284d.m499m(AbstractC0284d.m499m(AbstractC0284d.m499m(AbstractC0284d.m499m(AbstractC0284d.m499m(AbstractC0284d.m499m(AbstractC0284d.m499m(AbstractC0284d.m499m(AbstractC0284d.m499m(AbstractC0284d.m499m(AbstractC0284d.m499m(AbstractC0284d.m499m(AbstractC0284d.m499m(AbstractC0284d.m499m(AbstractC0284d.m499m(AbstractC0284d.m499m(c1904fM499m, c3516b, "isVarArgsNot", null, new C0027N0(i15)), c3516b, "parameterAnnotations", c3492b.f10880q, new C0281a(c3516b, i10)), c3516b, "parameterAnnotationsNot", c3492b.f10881r, new C0281a(c3516b, 3)), c3516b, "annotatedReturnType", c3492b.f10882s, new C0281a(c3516b, i9)), c3516b, "annotatedReturnTypeNot", c3492b.f10883t, new C0281a(c3516b, i7)), c3516b, "annotatedReceiverType", c3492b.f10884u, new C0281a(c3516b, i6)), c3516b, "annotatedReceiverTypeNot", c3492b.f10885v, new C0281a(c3516b, i15)), c3516b, "annotatedParameterTypes", c3492b.f10886w, new C0281a(c3516b, i16)), c3516b, "annotatedParameterTypesNot", c3492b.f10887x, new C0281a(c3516b, 10)), c3516b, "annotatedExceptionTypes", c3492b.f10888y, new C0281a(c3516b, 11)), c3516b, "annotatedExceptionTypesNot", c3492b.f10889z, new C0281a(c3516b, 12)), c3516b, "returnType", c3492b.f10869A, new C0281a(c3516b, 2)), c3516b, "returnTypeCondition", null, new C0027N0(i16)), c3516b, "isBridge", null, new C0027N0(17)), c3516b, "isBridgeNot", null, new C0027N0(25)), c3516b, "isDefault", null, new C0027N0(26)), c3516b, "isDefaultNot", null, new C0027N0(27));
                C1660e c1660eM2995a = AbstractC1676u.m2995a(Method.class);
                if (c1660eM2995a.equals(AbstractC1676u.m2995a(Method.class))) {
                    c1904f = new C1904f(c1904fM499m2, new C0283c(c3516b, 3), 2);
                } else if (c1660eM2995a.equals(AbstractC1676u.m2995a(Constructor.class))) {
                    c1904f = new C1904f(c1904fM499m2, new C0283c(c3516b, 4), 2);
                } else {
                    if (!c1660eM2995a.equals(AbstractC1676u.m2995a(Field.class))) {
                        throw new IllegalStateException(("Unsupported member type: " + c1904fM499m2).toString());
                    }
                    c1904f = new C1904f(c1904fM499m2, new C0283c(c3516b, 5), 2);
                }
                return AbstractC1907i.m3392v(c1904f);
            case 3:
                Class cls2 = (Class) obj;
                C3491a c3491a = (C3491a) this.f193e;
                C3516b c3516b2 = (C3516b) this.f194f;
                c3516b2.getClass();
                C0115D c0115d2 = AbstractC0284d.f912a;
                try {
                    objM3229o2 = AbstractC0972l.m2007e0(cls2.getDeclaredFields());
                    break;
                } catch (Throwable th2) {
                    objM3229o2 = AbstractC1784a.m3229o(th2);
                }
                Throwable thM1902a2 = AbstractC0885k.m1902a(objM3229o2);
                if (thM1902a2 != null) {
                    C0887m c0887m2 = C0452b.f1350a;
                    C0452b.m737a("Failed to get declared fields in " + c0115d2 + " because got an exception.", thM1902a2);
                }
                if (objM3229o2 instanceof C0884j) {
                    objM3229o2 = null;
                }
                Object obj3 = (List) objM3229o2;
                if (obj3 == null) {
                    obj3 = C0981u.f3047d;
                }
                C1904f c1904fM499m3 = AbstractC0284d.m499m(AbstractC0284d.m499m(AbstractC0284d.m499m(AbstractC0284d.m499m(AbstractC0284d.m499m(AbstractC0284d.m499m(AbstractC0284d.m487a(new C0979s(0, obj3), c3491a, c3516b2), c3516b2, "isEnumConstant", null, new C0027N0(28)), c3516b2, "isEnumConstantNot", null, new C0027N0(29)), c3516b2, "type", c3491a.f10868g, new C0281a(c3516b2, i5)), c3516b2, "typeCondition", null, new C0027N0(i10)), c3516b2, "genericType", null, new C0027N0(i11)), c3516b2, "genericTypeCondition", null, new C0027N0(i8));
                C1660e c1660eM2995a2 = AbstractC1676u.m2995a(Field.class);
                if (c1660eM2995a2.equals(AbstractC1676u.m2995a(Method.class))) {
                    c1904f2 = new C1904f(c1904fM499m3, new C0283c(c3516b2, 0), 2);
                } else if (c1660eM2995a2.equals(AbstractC1676u.m2995a(Constructor.class))) {
                    c1904f2 = new C1904f(c1904fM499m3, new C0283c(c3516b2, 1), 2);
                } else {
                    if (!c1660eM2995a2.equals(AbstractC1676u.m2995a(Field.class))) {
                        throw new IllegalStateException(("Unsupported member type: " + c1904fM499m3).toString());
                    }
                    c1904f2 = new C1904f(c1904fM499m3, new C0283c(c3516b2, 2), 2);
                }
                return AbstractC1907i.m3392v(c1904f2);
            case 4:
                C1013c c1013c = (C1013c) this.f193e;
                Object obj4 = c1013c.f3129b;
                C2135g c2135g = (C2135g) this.f194f;
                synchronized (obj4) {
                    ((ArrayList) c1013c.f3130c).remove(c2135g);
                }
                return C0891q.f2780a;
            case 5:
                C2080l c2080l = (C2080l) obj;
                synchronized (AbstractC2082n.f6972c) {
                    j5 = AbstractC2082n.f6974e;
                    AbstractC2082n.f6974e = ((long) 1) + j5;
                }
                return new C2070b(j5, c2080l, (InterfaceC1601c) this.f193e, (InterfaceC1601c) this.f194f);
            case 6:
                int iIntValue = ((Number) obj).intValue();
                return ((C1287y) this.f193e).mo0g(Integer.valueOf(iIntValue), ((List) this.f194f).get(iIntValue));
            default:
                int iIntValue2 = ((Number) obj).intValue();
                return ((C3521d) this.f193e).mo0g(Integer.valueOf(iIntValue2), ((List) this.f194f).get(iIntValue2));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C0045X(InterfaceC2581l interfaceC2581l, C0078o0 c0078o0) {
        this.f192d = 1;
        this.f194f = interfaceC2581l;
        this.f193e = c0078o0;
    }
}
