package bsh;

import bsh.AbstractC1273v4;
import bsh.C1281x0;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;
import java.util.Objects;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: renamed from: bsh.u2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C1265u2 implements InterfaceC1230o3, Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: q */
    public C1182g3 f3825q;

    /* JADX INFO: renamed from: r */
    public boolean f3826r;

    /* JADX INFO: renamed from: s */
    public int f3827s;

    /* JADX INFO: renamed from: t */
    public String f3828t;

    /* JADX INFO: renamed from: u */
    public Object f3829u;

    /* JADX INFO: renamed from: v */
    public AbstractC1241q2 f3830v;

    /* JADX INFO: renamed from: w */
    public Object f3831w;

    /* JADX INFO: renamed from: x */
    public int f3832x;

    /* JADX INFO: renamed from: y */
    public C1291y4 f3833y;

    public C1265u2(Object obj, AbstractC1241q2 abstractC1241q2) {
        if (obj == null) {
            C1259t2.m5095a("constructed empty LHS");
            throw null;
        }
        this.f3827s = 1;
        this.f3831w = obj;
        this.f3830v = abstractC1241q2;
        if (abstractC1241q2 != null) {
            this.f3828t = abstractC1241q2.getName();
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object obj = this.f3831w;
        if (obj == null) {
            return;
        }
        Class<?> cls = obj.getClass();
        Object obj2 = this.f3831w;
        if (obj2 instanceof Class) {
            cls = (Class) obj2;
        }
        this.f3830v = ((C1281x0.b) C1281x0.memberCache.m38264c(cls)).m5180e(this.f3828t);
    }

    private synchronized void writeObject(ObjectOutputStream objectOutputStream) {
        try {
            AbstractC1241q2 abstractC1241q2 = this.f3830v;
            if (abstractC1241q2 != null) {
                this.f3831w = abstractC1241q2.getDeclaringClass();
                this.f3828t = this.f3830v.getName();
                this.f3830v = null;
            }
            objectOutputStream.defaultWriteObject();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public Object m5098a(Object obj) {
        return m5099b(obj, false);
    }

    /* JADX INFO: renamed from: b */
    public Object m5099b(Object obj, boolean z10) {
        int i10 = this.f3827s;
        if (i10 == 0) {
            boolean z11 = this.f3826r;
            C1182g3 c1182g3 = this.f3825q;
            if (z11) {
                c1182g3.m4381l0(this.f3828t, obj, z10);
            } else {
                c1182g3.m4403w0(this.f3828t, obj, z10);
            }
            return m5102e();
        }
        if (i10 == 1) {
            try {
                AbstractC1241q2 abstractC1241q2 = this.f3830v;
                Objects.requireNonNull(abstractC1241q2, "assign value, field cannot be null");
                abstractC1241q2.mo4332q(this.f3831w, obj);
                return m5102e();
            } catch (ReflectiveOperationException e10) {
                throw new C1279w4("LHS (" + this.f3830v.getName() + ") can't access field: " + e10, e10);
            }
        }
        if (i10 == 2) {
            try {
                Object obj2 = this.f3829u;
                boolean z12 = obj2 instanceof String;
                Object obj3 = this.f3831w;
                return z12 ? AbstractC1143c4.m4206y0(obj3, (String) obj2, obj) : AbstractC1143c4.m4204x0(obj3, obj2, obj);
            } catch (C1165d4 e11) {
                RunnableC1205k2.m4462e("Assignment: " + e11.getMessage());
                throw new C1279w4("No such property: " + this.f3829u, e11);
            }
        }
        if (i10 != 3) {
            if (i10 != 5) {
                if (i10 != 6) {
                    throw new C1211l2("unknown lhs type");
                }
                Object obj4 = this.f3831w;
                return obj4 instanceof Map.Entry ? ((Map.Entry) obj4).setValue(obj) : new AbstractC1273v4.b(this.f3831w, obj);
            }
            C1283x2 c1283x2 = new C1283x2(3);
            c1283x2.m5193b("public");
            if (this.f3825q.f3571H) {
                c1283x2.m5202l();
            }
            this.f3825q.m4393r0(this.f3828t, AbstractC1273v4.m5141k(obj), obj, c1283x2);
            return obj;
        }
        try {
            if (this.f3831w.getClass().isArray() && obj != null) {
                try {
                    obj = AbstractC1273v4.m5138h(obj, AbstractC1273v4.m5133c(this.f3831w.getClass()), 1);
                } catch (Exception unused) {
                }
            }
            AbstractC1269v0.m5120l(this.f3831w, this.f3832x, obj);
            return obj;
        } catch (C1285x4 e12) {
            if (!IndexOutOfBoundsException.class.isAssignableFrom(e12.getCause().getClass())) {
                throw e12;
            }
            throw new C1279w4("Error array set index: " + e12.getMessage(), e12);
        } catch (Exception e13) {
            throw new C1279w4("Assignment: " + e13.getMessage(), e13);
        }
    }

    /* JADX INFO: renamed from: c */
    public Class m5100c() {
        AbstractC1241q2 abstractC1241q2 = this.f3830v;
        if (abstractC1241q2 != null) {
            return abstractC1241q2.mo4107n();
        }
        if (m5103f() != null) {
            return this.f3833y.m5223d();
        }
        try {
            return AbstractC1273v4.m5141k(m5102e());
        } catch (C1279w4 unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public Object m5101d() {
        if (this.f3827s == 1) {
            if (AbstractC1143c4.m4188p0(this.f3830v)) {
                RunnableC1205k2.f3637H.m37480d(this.f3830v.getDeclaringClass(), this.f3830v.getName());
            } else {
                RunnableC1205k2.f3637H.m37479c(this.f3831w, this.f3830v.getName());
            }
        }
        return m5102e();
    }

    /* JADX INFO: renamed from: e */
    public final Object m5102e() throws C1279w4 {
        int i10 = this.f3827s;
        if (i10 == 0) {
            return this.f3825q.m4356R(this.f3828t, null);
        }
        if (i10 == 1) {
            try {
                AbstractC1241q2 abstractC1241q2 = this.f3830v;
                Objects.requireNonNull(abstractC1241q2, "get value, field cannot be null");
                return abstractC1241q2.mo4332q(this.f3831w, new Object[0]);
            } catch (ReflectiveOperationException e10) {
                throw new C1279w4("Can't read field: " + this.f3830v, e10);
            }
        }
        if (i10 == 2) {
            try {
                return AbstractC1143c4.m4144N(this.f3831w, this.f3829u);
            } catch (C1165d4 e11) {
                RunnableC1205k2.m4462e(e11.getMessage());
                throw new C1279w4("No such property: " + this.f3829u, e11);
            }
        }
        if (i10 != 3) {
            if (i10 == 5) {
                return this.f3825q.m4352N(this.f3828t);
            }
            throw new C1211l2("LHS type");
        }
        try {
            return AbstractC1269v0.m5116h(this.f3831w, this.f3832x);
        } catch (Exception e12) {
            throw new C1279w4("Array access: " + e12, e12);
        }
    }

    /* JADX INFO: renamed from: f */
    public C1291y4 m5103f() {
        C1291y4 c1291y4 = this.f3833y;
        if (c1291y4 != null) {
            return c1291y4;
        }
        C1182g3 c1182g3 = this.f3825q;
        if (c1182g3 != null) {
            this.f3833y = AbstractC1143c4.m4150T(c1182g3, getName());
        } else if (m5105h()) {
            boolean zM4174i0 = AbstractC1143c4.m4174i0(this.f3830v.getDeclaringClass());
            AbstractC1241q2 abstractC1241q2 = this.f3830v;
            if (zM4174i0) {
                this.f3833y = AbstractC1143c4.m4151U(abstractC1241q2.getDeclaringClass(), getName());
            } else {
                this.f3833y = new C1291y4(abstractC1241q2.getName(), this.f3830v.mo4107n(), this);
            }
        } else if (AbstractC1143c4.m4174i0(this.f3831w.getClass())) {
            this.f3833y = AbstractC1143c4.m4152V(this.f3831w, getName());
        } else {
            AbstractC1241q2 abstractC1241q22 = this.f3830v;
            if (abstractC1241q22 != null) {
                this.f3833y = new C1291y4(abstractC1241q22.getName(), this.f3830v.mo4107n(), this);
            }
        }
        return this.f3833y;
    }

    /* JADX INFO: renamed from: g */
    public boolean m5104g() {
        if (m5103f() == null) {
            return false;
        }
        return this.f3833y.m5226h("final");
    }

    public String getName() {
        AbstractC1241q2 abstractC1241q2 = this.f3830v;
        if (abstractC1241q2 != null) {
            return abstractC1241q2.getName();
        }
        C1291y4 c1291y4 = this.f3833y;
        return c1291y4 != null ? c1291y4.getName() : this.f3828t;
    }

    /* JADX INFO: renamed from: h */
    public boolean m5105h() {
        AbstractC1241q2 abstractC1241q2 = this.f3830v;
        if (abstractC1241q2 != null) {
            return abstractC1241q2.mo4109v();
        }
        C1291y4 c1291y4 = this.f3833y;
        if (c1291y4 == null) {
            return false;
        }
        return c1291y4.m5226h("static");
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("LHS: ");
        AbstractC1241q2 abstractC1241q2 = this.f3830v;
        String str3 = _UrlKt.FRAGMENT_ENCODE_SET;
        if (abstractC1241q2 != null) {
            str = "field = " + this.f3830v.toString();
        } else {
            str = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        sb2.append(str);
        if (this.f3828t != null) {
            str2 = " varName = " + this.f3828t;
        } else {
            str2 = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        sb2.append(str2);
        if (this.f3825q != null) {
            str3 = " nameSpace = " + this.f3825q.toString();
        }
        sb2.append(str3);
        return sb2.toString();
    }

    public C1265u2(C1182g3 c1182g3, String str) {
        this.f3827s = 5;
        this.f3828t = str;
        this.f3825q = c1182g3;
    }

    public C1265u2(AbstractC1241q2 abstractC1241q2) {
        this.f3827s = 1;
        this.f3831w = abstractC1241q2.getDeclaringClass();
        this.f3830v = abstractC1241q2;
        this.f3828t = abstractC1241q2.getName();
    }

    public C1265u2(C1182g3 c1182g3, String str, boolean z10) {
        this.f3827s = 0;
        this.f3826r = z10;
        this.f3828t = str;
        this.f3825q = c1182g3;
    }

    public C1265u2(Object obj, Object obj2) {
        if (obj != null) {
            this.f3827s = 2;
            this.f3831w = obj;
            this.f3829u = obj2;
            return;
        }
        C1259t2.m5095a("constructed empty LHS");
        throw null;
    }

    public C1265u2(Object obj) {
        this.f3827s = 6;
        this.f3831w = obj;
    }

    public C1265u2(Object obj, int i10) {
        this.f3827s = 3;
        this.f3831w = obj;
        this.f3832x = i10;
    }
}
