package p353y4;

import bsh.AbstractC1143c4;
import bsh.Primitive;
import bsh.RunnableC1205k2;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: y4.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9564a {

    /* JADX INFO: renamed from: a */
    public final Set f32595a;

    /* JADX INFO: renamed from: y4.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class a implements InterfaceC9567d {
        public a() {
        }

        @Override // p353y4.InterfaceC9567d
        /* JADX INFO: renamed from: a */
        public boolean mo37491a(Class cls) {
            return cls != InterfaceC9567d.class;
        }

        @Override // p353y4.InterfaceC9567d
        /* JADX INFO: renamed from: b */
        public boolean mo37492b(Class cls, String str) {
            return (cls == RunnableC1205k2.class && str.equals("mainSecurityGuard")) ? false : true;
        }

        @Override // p353y4.InterfaceC9567d
        /* JADX INFO: renamed from: c */
        public boolean mo37493c(Object obj, String str, Object[] objArr) {
            return !(obj instanceof C9564a);
        }

        @Override // p353y4.InterfaceC9567d
        /* JADX INFO: renamed from: h */
        public boolean mo37494h(Class cls, Object[] objArr) {
            return (C9564a.class.isAssignableFrom(cls) || InterfaceC9567d.class.isAssignableFrom(cls)) ? false : true;
        }
    }

    public C9564a() {
        HashSet hashSet = new HashSet();
        this.f32595a = hashSet;
        hashSet.add(new a());
    }

    /* JADX INFO: renamed from: a */
    public void m37477a(Class cls, Object[] objArr) throws C9566c {
        Object[] objArrUnwrap = Primitive.unwrap(objArr);
        Iterator it = this.f32595a.iterator();
        while (it.hasNext()) {
            if (!((InterfaceC9567d) it.next()).mo37494h(cls, objArrUnwrap)) {
                throw C9566c.m37496e(cls, objArrUnwrap);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m37478b(Class cls) throws C9566c {
        Iterator it = this.f32595a.iterator();
        while (it.hasNext()) {
            if (!((InterfaceC9567d) it.next()).m37512g(cls)) {
                throw C9566c.m37497f(cls);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m37479c(Object obj, String str) {
        Iterator it = this.f32595a.iterator();
        while (it.hasNext()) {
            if (!((InterfaceC9567d) it.next()).m37509d(obj, str)) {
                throw C9566c.m37498g(obj, str);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m37480d(Class cls, String str) {
        Iterator it = this.f32595a.iterator();
        while (it.hasNext()) {
            if (!((InterfaceC9567d) it.next()).mo37492b(cls, str)) {
                throw C9566c.m37499h(cls, str);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m37481e(Class cls) throws C9566c {
        Iterator it = this.f32595a.iterator();
        while (it.hasNext()) {
            if (!((InterfaceC9567d) it.next()).mo37491a(cls)) {
                throw C9566c.m37500i(cls);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m37482f(String str, Object[] objArr) {
        Object[] objArrUnwrap = Primitive.unwrap(objArr);
        Iterator it = this.f32595a.iterator();
        while (it.hasNext()) {
            if (!((InterfaceC9567d) it.next()).m37510e(str, objArrUnwrap)) {
                throw C9566c.m37501j(str, objArrUnwrap);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void m37483g(Object obj, String str, Object[] objArr) {
        Object[] objArrUnwrap = Primitive.unwrap(objArr);
        m37484h(obj, str, objArrUnwrap);
        m37486j(obj, str, objArrUnwrap);
        m37485i(obj, str, objArrUnwrap);
        m37487k(obj, str, objArrUnwrap);
    }

    /* JADX INFO: renamed from: h */
    public final void m37484h(Object obj, String str, Object[] objArr) throws C9566c {
        Iterator it = this.f32595a.iterator();
        while (it.hasNext()) {
            if (!((InterfaceC9567d) it.next()).mo37493c(obj, str, objArr)) {
                throw C9566c.m37502k(obj, str, objArr);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m37485i(Object obj, String str, Object[] objArr) throws C9566c {
        if ((obj instanceof Class) && str.equals("newInstance")) {
            Class cls = (Class) obj;
            Object[] objArr2 = new Object[0];
            try {
                m37477a(cls, objArr2);
                return;
            } catch (C9566c unused) {
                throw C9566c.m37504m(cls, objArr2);
            }
        }
        if ((obj instanceof Constructor) && str.equals("newInstance")) {
            Class declaringClass = ((Constructor) obj).getDeclaringClass();
            if (objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof Object[]) {
                    objArr = (Object[]) obj2;
                }
            }
            try {
                m37477a(declaringClass, objArr);
            } catch (C9566c unused2) {
                throw C9566c.m37504m(declaringClass, objArr);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m37486j(Object obj, String str, Object[] objArr) throws C9566c {
        if (str.equals("get") && objArr.length == 1 && (obj instanceof Field)) {
            Field field = (Field) obj;
            String name = field.getName();
            if (AbstractC1143c4.m4188p0(field)) {
                Class<?> declaringClass = field.getDeclaringClass();
                try {
                    m37480d(declaringClass, name);
                } catch (C9566c unused) {
                    throw C9566c.m37506o(declaringClass, name);
                }
            } else {
                Object obj2 = objArr[0];
                try {
                    m37479c(obj2, name);
                } catch (C9566c unused2) {
                    throw C9566c.m37505n(obj2, name);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0024  */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m37487k(java.lang.Object r4, java.lang.String r5, java.lang.Object[] r6) throws p353y4.C9566c {
        /*
            r3 = this;
            java.lang.String r0 = "invoke"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L48
            int r5 = r6.length
            if (r5 == 0) goto L48
            boolean r5 = r4 instanceof java.lang.reflect.Method
            if (r5 != 0) goto L10
            goto L48
        L10:
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.String r5 = r4.getName()
            int r0 = r6.length
            r1 = 2
            r2 = 1
            if (r0 != r1) goto L24
            r0 = r6[r2]
            boolean r1 = r0 instanceof java.lang.Object[]
            if (r1 == 0) goto L24
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L29
        L24:
            int r0 = r6.length
            java.lang.Object[] r0 = java.util.Arrays.copyOfRange(r6, r2, r0)
        L29:
            boolean r1 = bsh.AbstractC1143c4.m4188p0(r4)
            if (r1 == 0) goto L3c
            java.lang.Class r4 = r4.getDeclaringClass()
            r3.m37488l(r4, r5, r0)     // Catch: p353y4.C9566c -> L37
            return
        L37:
            y4.c r4 = p353y4.C9566c.m37508q(r4, r5, r0)
            throw r4
        L3c:
            r4 = 0
            r4 = r6[r4]
            r3.m37483g(r4, r5, r0)     // Catch: p353y4.C9566c -> L43
            return
        L43:
            y4.c r4 = p353y4.C9566c.m37507p(r4, r5, r0)
            throw r4
        L48:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p353y4.C9564a.m37487k(java.lang.Object, java.lang.String, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: l */
    public void m37488l(Class cls, String str, Object[] objArr) {
        Object[] objArrUnwrap = Primitive.unwrap(objArr);
        m37489m(cls, str, objArrUnwrap);
        m37490n(cls, str, objArrUnwrap);
    }

    /* JADX INFO: renamed from: m */
    public final void m37489m(Class cls, String str, Object[] objArr) throws C9566c {
        Iterator it = this.f32595a.iterator();
        while (it.hasNext()) {
            if (!((InterfaceC9567d) it.next()).m37511f(cls, str, objArr)) {
                throw C9566c.m37503l(cls, str, objArr);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m37490n(Class cls, String str, Object[] objArr) throws C9566c {
        if (str.equals("getLength") && objArr.length == 1 && cls.isAssignableFrom(Array.class)) {
            Object obj = objArr[0];
            try {
                m37479c(obj, "length");
            } catch (C9566c unused) {
                throw C9566c.m37505n(obj, "length");
            }
        }
    }
}
