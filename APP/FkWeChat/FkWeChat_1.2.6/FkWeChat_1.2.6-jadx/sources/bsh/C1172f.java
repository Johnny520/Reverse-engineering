package bsh;

import bsh.AbstractC1273v4;
import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: bsh.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C1172f extends AbstractC1195i4 {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: y */
    public boolean f3545y;

    /* JADX INFO: renamed from: z */
    public Deque f3546z;

    public C1172f(int i10) {
        super(i10);
        this.f3545y = false;
        this.f3546z = new ArrayDeque();
    }

    /* JADX INFO: renamed from: A */
    public final boolean m4297A(C1172f c1172f) {
        return c1172f.f3545y;
    }

    /* JADX INFO: renamed from: B */
    public final Object m4298B(Object obj, Class cls, int i10, C1174f1 c1174f1) throws C1169e2 {
        if (i10 != 1 && obj == Primitive.NULL) {
            return Primitive.unwrap(obj);
        }
        try {
            return Primitive.unwrap(AbstractC1273v4.m5138h(obj, cls, 0));
        } catch (C1279w4 e10) {
            throw e10.m5169c("Error in array initializer", this, c1174f1);
        }
    }

    /* JADX INFO: renamed from: C */
    public void m4299C(boolean z10) {
        this.f3545y = z10;
    }

    /* JADX INFO: renamed from: D */
    public final void m4300D(Class cls, Object obj, int i10, C1174f1 c1174f1) throws C1169e2 {
        throw new C1169e2("Incompatible type: " + AbstractC1225n4.m4982u(obj) + " in initializer of array type: " + cls.getSimpleName() + " at position: " + i10, this, c1174f1);
    }

    /* JADX INFO: renamed from: E */
    public final Object m4301E(Object obj, Class cls, C1174f1 c1174f1) {
        Class<?> cls2 = obj.getClass();
        Class clsM5133c = AbstractC1273v4.m5133c(cls2);
        if (AbstractC1273v4.m5146p(cls) && (!cls2.isArray() || (!Map.class.isAssignableFrom(clsM5133c) && !Collection.class.isAssignableFrom(clsM5133c)))) {
            try {
                return AbstractC1273v4.m5138h(obj, cls, 0);
            } catch (C1279w4 e10) {
                e10.mo5167a(this, c1174f1);
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: k */
    public final Object m4302k(int i10, Class cls, C1174f1 c1174f1, RunnableC1205k2 runnableC1205k2) throws C1169e2 {
        Object objMo4048p;
        int[] iArr = new int[i10];
        iArr[0] = mo4050r();
        Object objNewInstance = Array.newInstance((Class<?>) cls, iArr);
        Class<?> componentType = objNewInstance.getClass().getComponentType();
        for (int i11 = 0; i11 < mo4050r(); i11++) {
            InterfaceC1188h3 interfaceC1188h3Mo4051s = mo4051s(i11);
            if (!(interfaceC1188h3Mo4051s instanceof C1172f)) {
                objMo4048p = interfaceC1188h3Mo4051s.mo4048p(c1174f1, runnableC1205k2);
            } else if (i10 < 2) {
                C1172f c1172f = (C1172f) interfaceC1188h3Mo4051s;
                if (!m4297A(c1172f)) {
                    throw new C1169e2("Invalid Intializer for " + cls + ", at position: " + i11, this, c1174f1);
                }
                objMo4048p = c1172f.m4305v(AbstractC1273v4.b.class, 1, c1174f1, runnableC1205k2);
            } else {
                objMo4048p = ((C1172f) interfaceC1188h3Mo4051s).m4305v(cls, i10 - 1, c1174f1, runnableC1205k2);
            }
            if (objMo4048p == Primitive.VOID) {
                throw new C1169e2("Void in array initializer, position " + i11, this, c1174f1);
            }
            try {
                Array.set(objNewInstance, i11, m4298B(objMo4048p, componentType, i10, c1174f1));
            } catch (IllegalArgumentException e10) {
                RunnableC1205k2.m4462e("illegal arg", e10);
                m4300D(cls, objMo4048p, i11, c1174f1);
            }
        }
        return objNewInstance;
    }

    /* JADX INFO: renamed from: l */
    public final Object m4303l(Class cls, C1174f1 c1174f1, RunnableC1205k2 runnableC1205k2) {
        c1174f1.m4317f(new C1182g3(c1174f1.m4319h(), cls.getName()));
        c1174f1.m4319h().m4377j0(cls);
        c1174f1.m4319h().mo4351M(runnableC1205k2);
        try {
            Object objNewInstance = cls.getConstructor(null).newInstance(null);
            c1174f1.m4319h().m4373h0(objNewInstance);
            for (int i10 = 0; i10 < mo4050r(); i10++) {
                C1178g c1178g = (C1178g) mo4051s(i10);
                C1133b0 c1133b0 = (C1133b0) c1178g.mo4051s(0);
                c1133b0.f3461A = false;
                c1133b0.f3463z = false;
                c1178g.mo4048p(c1174f1, runnableC1205k2);
            }
            return objNewInstance;
        } finally {
        }
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: m */
    public void mo4046m(InterfaceC1188h3 interfaceC1188h3) {
        this.f3617t = interfaceC1188h3;
        InterfaceC1188h3[] interfaceC1188h3Arr = this.f3618u;
        if (interfaceC1188h3Arr != null) {
            for (InterfaceC1188h3 interfaceC1188h32 : interfaceC1188h3Arr) {
                if (interfaceC1188h32.mo4050r() > 0 && (interfaceC1188h32.mo4051s(0) instanceof C1133b0)) {
                    this.f3546z.push((C1133b0) interfaceC1188h32.mo4051s(0));
                    ((C1133b0) this.f3546z.peek()).m4104o(this);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m4304o() {
        Iterator it = this.f3546z.iterator();
        while (it.hasNext()) {
            ((C1133b0) it.next()).m4102k();
        }
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: p */
    public Object mo4048p(C1174f1 c1174f1, RunnableC1205k2 runnableC1205k2) throws C1163d2 {
        throw new C1163d2("Array initializer has no base type.", this, c1174f1);
    }

    @Override // bsh.AbstractC1195i4
    public String toString() {
        return super.toString() + ": " + this.f3545y;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0070  */
    /* JADX INFO: renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m4305v(java.lang.Class r10, int r11, bsh.C1174f1 r12, bsh.RunnableC1205k2 r13) throws bsh.C1169e2 {
        /*
            r9 = this;
            int r0 = r9.mo4050r()
            r1 = 0
            if (r0 != 0) goto L8
            r11 = r1
        L8:
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.Class r2 = java.lang.Void.TYPE
            if (r11 != 0) goto L21
            if (r10 == r2) goto L18
            boolean r11 = bsh.AbstractC1273v4.m5146p(r10)
            if (r11 == 0) goto L17
            goto L18
        L17:
            r0 = r10
        L18:
            java.lang.Object r11 = java.lang.reflect.Array.newInstance(r0, r1)
            java.lang.Object r10 = r9.m4301E(r11, r10, r12)
            return r10
        L21:
            r1 = -1
            if (r1 != r11) goto L53
            boolean r11 = r13.m4499v()
            if (r11 != 0) goto L49
            boolean r11 = r9.m4308z(r10)
            if (r11 == 0) goto L35
            java.lang.Object r10 = r9.m4303l(r10, r12, r13)
            return r10
        L35:
            r4 = 1
            r5 = 0
            r6 = r9
            r3 = r9
            r7 = r12
            r8 = r13
            int r11 = r3.m4307y(r4, r5, r6, r7, r8)
            boolean r12 = bsh.AbstractC1273v4.m5146p(r10)
            if (r12 == 0) goto L47
            r12 = r2
            goto L57
        L47:
            r12 = r10
            goto L57
        L49:
            r3 = r9
            r7 = r12
            bsh.e2 r10 = new bsh.e2
            java.lang.String r11 = "No declared array type or dimensions."
            r10.<init>(r11, r9, r7)
            throw r10
        L53:
            r3 = r9
            r7 = r12
            r8 = r13
            goto L47
        L57:
            if (r12 != r2) goto L5e
            r12 = 0
            java.lang.Class r12 = r9.m4306x(r12, r9, r7, r8)
        L5e:
            r13 = 2
            if (r11 >= r13) goto L6b
            java.lang.Class<bsh.v4$b> r13 = bsh.AbstractC1273v4.b.class
            if (r13 != r12) goto L67
            if (r2 == r10) goto L69
        L67:
            if (r13 != r10) goto L6b
        L69:
            java.lang.Class<java.util.Map> r10 = java.util.Map.class
        L6b:
            if (r12 != 0) goto L70
            int r11 = r11 + 1
            goto L71
        L70:
            r0 = r12
        L71:
            java.lang.Object r11 = r9.m4302k(r11, r0, r7, r8)
            r9.m4304o()
            java.lang.Object r10 = r9.m4301E(r11, r10, r7)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.C1172f.m4305v(java.lang.Class, int, bsh.f1, bsh.k2):java.lang.Object");
    }

    /* JADX INFO: renamed from: x */
    public final Class m4306x(Class cls, InterfaceC1188h3 interfaceC1188h3, C1174f1 c1174f1, RunnableC1205k2 runnableC1205k2) {
        if (Object.class != cls && AbstractC1273v4.b.class != cls) {
            if (interfaceC1188h3 instanceof C1178g) {
                return AbstractC1273v4.m5140j(cls, AbstractC1273v4.m5133c(AbstractC1273v4.m5142l(interfaceC1188h3.mo4048p(c1174f1, runnableC1205k2), Primitive.isWrapperType(cls))));
            }
            if ((interfaceC1188h3 instanceof C1172f) && m4297A((C1172f) interfaceC1188h3)) {
                return AbstractC1273v4.m5140j(cls, Map.class);
            }
            for (InterfaceC1188h3 interfaceC1188h32 : interfaceC1188h3.mo4049q()) {
                cls = m4306x(cls, interfaceC1188h32, c1174f1, runnableC1205k2);
            }
        }
        return cls;
    }

    /* JADX INFO: renamed from: y */
    public final int m4307y(int i10, int i11, InterfaceC1188h3 interfaceC1188h3, C1174f1 c1174f1, RunnableC1205k2 runnableC1205k2) {
        int i12 = i10;
        while (interfaceC1188h3.mo4050r() > i11) {
            interfaceC1188h3 = interfaceC1188h3.mo4051s(i11);
            if (!(interfaceC1188h3 instanceof C1172f) || m4297A((C1172f) interfaceC1188h3) || interfaceC1188h3.mo4050r() <= 0) {
                break;
            }
            i12++;
            i11 = 0;
        }
        if (interfaceC1188h3 instanceof C1172f) {
            return interfaceC1188h3.mo4050r() == 0 ? m4307y(i12, i11 + 1, interfaceC1188h3.mo4054w(), c1174f1, runnableC1205k2) : i12;
        }
        Object objMo4048p = interfaceC1188h3.mo4048p(c1174f1, runnableC1205k2);
        return objMo4048p == Primitive.NULL ? m4307y(i12, i11 + 1, interfaceC1188h3.mo4054w(), c1174f1, runnableC1205k2) : i12 + AbstractC1273v4.m5132b(AbstractC1273v4.m5141k(objMo4048p));
    }

    /* JADX INFO: renamed from: z */
    public final boolean m4308z(Class cls) {
        return Void.TYPE != cls && !AbstractC1273v4.m5146p(cls) && (mo4051s(0) instanceof C1178g) && (mo4051s(0).mo4051s(0) instanceof C1133b0) && ((C1133b0) mo4051s(0).mo4051s(0)).f3461A && (mo4051s(0).mo4051s(0).mo4051s(0) instanceof C1138c);
    }
}
