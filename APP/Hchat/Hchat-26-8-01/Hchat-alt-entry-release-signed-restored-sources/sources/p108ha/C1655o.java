package p108ha;

import android.os.Handler;
import java.lang.reflect.Method;
import ke.C2399h;
import p010aa.C0039g;
import p011ab.C0042b;
import p068eh.AbstractC0921a;
import p077f8.C1085e;
import p085fg.InterfaceC1220a;
import p258r8.AbstractC3736a;
import p258r8.C3740e;
import p258r8.C3742g;
import p258r8.C3744i;
import p258r8.EnumC3738c;
import p276sf.C3959f;
import p276sf.C3960g;

/* JADX INFO: renamed from: ha.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1655o extends AbstractC3736a {

    /* JADX INFO: renamed from: e */
    public C1659s f5446e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    /* JADX INFO: renamed from: a */
    public final String mo297a() {
        return "moments_bottom_detail";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: f */
    public final void mo298f(C3742g c3742g) {
        c3742g.getClass();
        m7751h(new C0039g("moments_bottom_detail", "朋友圈底部详情", "自定义朋友圈底部时间和详情格式", "practical"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: g */
    public final void mo299g(C3742g c3742g) {
        c3742g.getClass();
        this.f5446e = new C1659s(c3742g, new C0042b(2, this, AbstractC0921a.m2246i(C1655o.class), "logFeatureError", "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V", 0, 0, 19));
        m4228k();
        m7752i(C1085e.class, new C2399h(this, 11));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m4228k() {
        Handler handler = C3740e.f12138a;
        final int i9 = 0;
        InterfaceC1220a interfaceC1220a = new InterfaceC1220a(this) { // from class: ha.n

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ C1655o f5445h;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f5445h = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p085fg.InterfaceC1220a
            public final Object invoke() {
                Object c3959f;
                boolean zBooleanValue;
                boolean zBooleanValue2;
                Class<?> declaringClass;
                Method methodM4239j;
                Object c3959f2;
                boolean zBooleanValue3;
                Object c3959f3;
                switch (i9) {
                    case 0:
                        C1659s c1659s = this.f5445h.f5446e;
                        boolean z9 = false;
                        if (c1659s != null) {
                            synchronized (c1659s) {
                                if (c1659s.f5457e) {
                                    zBooleanValue = true;
                                } else {
                                    Method methodM4242m = c1659s.m4242m();
                                    if (methodM4242m != null) {
                                        try {
                                            C3744i.f12154b.m7763b(methodM4242m, new C1658r(c1659s, 4));
                                            c1659s.f5457e = true;
                                            c3959f = Boolean.TRUE;
                                        } catch (Throwable th2) {
                                            c3959f = new C3959f(th2);
                                        }
                                        Throwable thM8182b = C3960g.m8182b(c3959f);
                                        if (thM8182b != null) {
                                            c1659s.f5454b.invoke("朋友圈底部详情时间 Hook 安装失败", thM8182b);
                                            c3959f = Boolean.FALSE;
                                        }
                                        zBooleanValue = ((Boolean) c3959f).booleanValue();
                                    } else {
                                        zBooleanValue = false;
                                    }
                                }
                                break;
                            }
                            if (zBooleanValue) {
                                z9 = true;
                            }
                        }
                        return Boolean.valueOf(z9);
                    case 1:
                        C1659s c1659s2 = this.f5445h.f5446e;
                        boolean z10 = false;
                        if (c1659s2 != null) {
                            synchronized (c1659s2) {
                                if (c1659s2.f5458f) {
                                    zBooleanValue2 = true;
                                } else {
                                    Method methodM4242m2 = c1659s2.m4242m();
                                    if (methodM4242m2 == null || (declaringClass = methodM4242m2.getDeclaringClass()) == null || (methodM4239j = c1659s2.m4239j(declaringClass)) == null) {
                                        zBooleanValue2 = false;
                                    } else {
                                        try {
                                            C3744i.f12154b.m7763b(methodM4239j, new C1658r(c1659s2, 0));
                                            c1659s2.f5458f = true;
                                            c3959f2 = Boolean.TRUE;
                                        } catch (Throwable th3) {
                                            c3959f2 = new C3959f(th3);
                                        }
                                        Throwable thM8182b2 = C3960g.m8182b(c3959f2);
                                        if (thM8182b2 != null) {
                                            c1659s2.f5454b.invoke("朋友圈底部详情可见范围 Hook 安装失败", thM8182b2);
                                            c3959f2 = Boolean.FALSE;
                                        }
                                        zBooleanValue2 = ((Boolean) c3959f2).booleanValue();
                                    }
                                }
                                break;
                            }
                            if (zBooleanValue2) {
                                z10 = true;
                            }
                        }
                        return Boolean.valueOf(z10);
                    default:
                        C1659s c1659s3 = this.f5445h.f5446e;
                        boolean z11 = false;
                        if (c1659s3 != null) {
                            synchronized (c1659s3) {
                                if (c1659s3.f5459g) {
                                    zBooleanValue3 = true;
                                } else {
                                    Method methodM4240k = c1659s3.m4240k();
                                    if (methodM4240k != null) {
                                        Class<?> declaringClass2 = methodM4240k.getDeclaringClass();
                                        declaringClass2.getClass();
                                        Method methodM4241l = c1659s3.m4241l(declaringClass2);
                                        if (methodM4241l != null) {
                                            try {
                                                C3744i c3744i = C3744i.f12154b;
                                                c3744i.m7763b(methodM4241l, new C1658r(c1659s3, 1));
                                                c3744i.m7763b(methodM4240k, new C1658r(c1659s3, 2));
                                                Method methodM4238i = c1659s3.m4238i();
                                                if (methodM4238i != null) {
                                                    c3744i.m7763b(methodM4238i, new C1658r(c1659s3, 3));
                                                }
                                                c1659s3.f5459g = true;
                                                c3959f3 = Boolean.TRUE;
                                            } catch (Throwable th4) {
                                                c3959f3 = new C3959f(th4);
                                            }
                                            Throwable thM8182b3 = C3960g.m8182b(c3959f3);
                                            if (thM8182b3 != null) {
                                                c1659s3.f5454b.invoke("朋友圈底部详情个人主页 Hook 安装失败", thM8182b3);
                                                c3959f3 = Boolean.FALSE;
                                            }
                                            zBooleanValue3 = ((Boolean) c3959f3).booleanValue();
                                            break;
                                        }
                                    }
                                    zBooleanValue3 = false;
                                }
                            }
                            if (zBooleanValue3) {
                                z11 = true;
                            }
                        }
                        return Boolean.valueOf(z11);
                }
            }
        };
        EnumC3738c enumC3738c = EnumC3738c.BRIDGE;
        C3740e.m7758e(-10, interfaceC1220a, "moments_bottom_detail:time", "朋友圈底部详情时间", enumC3738c);
        final int i10 = 1;
        C3740e.m7759f(8, new InterfaceC1220a(this) { // from class: ha.n

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ C1655o f5445h;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f5445h = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p085fg.InterfaceC1220a
            public final Object invoke() {
                Object c3959f;
                boolean zBooleanValue;
                boolean zBooleanValue2;
                Class<?> declaringClass;
                Method methodM4239j;
                Object c3959f2;
                boolean zBooleanValue3;
                Object c3959f3;
                switch (i10) {
                    case 0:
                        C1659s c1659s = this.f5445h.f5446e;
                        boolean z9 = false;
                        if (c1659s != null) {
                            synchronized (c1659s) {
                                if (c1659s.f5457e) {
                                    zBooleanValue = true;
                                } else {
                                    Method methodM4242m = c1659s.m4242m();
                                    if (methodM4242m != null) {
                                        try {
                                            C3744i.f12154b.m7763b(methodM4242m, new C1658r(c1659s, 4));
                                            c1659s.f5457e = true;
                                            c3959f = Boolean.TRUE;
                                        } catch (Throwable th2) {
                                            c3959f = new C3959f(th2);
                                        }
                                        Throwable thM8182b = C3960g.m8182b(c3959f);
                                        if (thM8182b != null) {
                                            c1659s.f5454b.invoke("朋友圈底部详情时间 Hook 安装失败", thM8182b);
                                            c3959f = Boolean.FALSE;
                                        }
                                        zBooleanValue = ((Boolean) c3959f).booleanValue();
                                    } else {
                                        zBooleanValue = false;
                                    }
                                }
                                break;
                            }
                            if (zBooleanValue) {
                                z9 = true;
                            }
                        }
                        return Boolean.valueOf(z9);
                    case 1:
                        C1659s c1659s2 = this.f5445h.f5446e;
                        boolean z10 = false;
                        if (c1659s2 != null) {
                            synchronized (c1659s2) {
                                if (c1659s2.f5458f) {
                                    zBooleanValue2 = true;
                                } else {
                                    Method methodM4242m2 = c1659s2.m4242m();
                                    if (methodM4242m2 == null || (declaringClass = methodM4242m2.getDeclaringClass()) == null || (methodM4239j = c1659s2.m4239j(declaringClass)) == null) {
                                        zBooleanValue2 = false;
                                    } else {
                                        try {
                                            C3744i.f12154b.m7763b(methodM4239j, new C1658r(c1659s2, 0));
                                            c1659s2.f5458f = true;
                                            c3959f2 = Boolean.TRUE;
                                        } catch (Throwable th3) {
                                            c3959f2 = new C3959f(th3);
                                        }
                                        Throwable thM8182b2 = C3960g.m8182b(c3959f2);
                                        if (thM8182b2 != null) {
                                            c1659s2.f5454b.invoke("朋友圈底部详情可见范围 Hook 安装失败", thM8182b2);
                                            c3959f2 = Boolean.FALSE;
                                        }
                                        zBooleanValue2 = ((Boolean) c3959f2).booleanValue();
                                    }
                                }
                                break;
                            }
                            if (zBooleanValue2) {
                                z10 = true;
                            }
                        }
                        return Boolean.valueOf(z10);
                    default:
                        C1659s c1659s3 = this.f5445h.f5446e;
                        boolean z11 = false;
                        if (c1659s3 != null) {
                            synchronized (c1659s3) {
                                if (c1659s3.f5459g) {
                                    zBooleanValue3 = true;
                                } else {
                                    Method methodM4240k = c1659s3.m4240k();
                                    if (methodM4240k != null) {
                                        Class<?> declaringClass2 = methodM4240k.getDeclaringClass();
                                        declaringClass2.getClass();
                                        Method methodM4241l = c1659s3.m4241l(declaringClass2);
                                        if (methodM4241l != null) {
                                            try {
                                                C3744i c3744i = C3744i.f12154b;
                                                c3744i.m7763b(methodM4241l, new C1658r(c1659s3, 1));
                                                c3744i.m7763b(methodM4240k, new C1658r(c1659s3, 2));
                                                Method methodM4238i = c1659s3.m4238i();
                                                if (methodM4238i != null) {
                                                    c3744i.m7763b(methodM4238i, new C1658r(c1659s3, 3));
                                                }
                                                c1659s3.f5459g = true;
                                                c3959f3 = Boolean.TRUE;
                                            } catch (Throwable th4) {
                                                c3959f3 = new C3959f(th4);
                                            }
                                            Throwable thM8182b3 = C3960g.m8182b(c3959f3);
                                            if (thM8182b3 != null) {
                                                c1659s3.f5454b.invoke("朋友圈底部详情个人主页 Hook 安装失败", thM8182b3);
                                                c3959f3 = Boolean.FALSE;
                                            }
                                            zBooleanValue3 = ((Boolean) c3959f3).booleanValue();
                                            break;
                                        }
                                    }
                                    zBooleanValue3 = false;
                                }
                            }
                            if (zBooleanValue3) {
                                z11 = true;
                            }
                        }
                        return Boolean.valueOf(z11);
                }
            }
        }, "moments_bottom_detail:group", "朋友圈底部详情可见范围", enumC3738c);
        final int i11 = 2;
        C3740e.m7758e(-9, new InterfaceC1220a(this) { // from class: ha.n

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ C1655o f5445h;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f5445h = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p085fg.InterfaceC1220a
            public final Object invoke() {
                Object c3959f;
                boolean zBooleanValue;
                boolean zBooleanValue2;
                Class<?> declaringClass;
                Method methodM4239j;
                Object c3959f2;
                boolean zBooleanValue3;
                Object c3959f3;
                switch (i11) {
                    case 0:
                        C1659s c1659s = this.f5445h.f5446e;
                        boolean z9 = false;
                        if (c1659s != null) {
                            synchronized (c1659s) {
                                if (c1659s.f5457e) {
                                    zBooleanValue = true;
                                } else {
                                    Method methodM4242m = c1659s.m4242m();
                                    if (methodM4242m != null) {
                                        try {
                                            C3744i.f12154b.m7763b(methodM4242m, new C1658r(c1659s, 4));
                                            c1659s.f5457e = true;
                                            c3959f = Boolean.TRUE;
                                        } catch (Throwable th2) {
                                            c3959f = new C3959f(th2);
                                        }
                                        Throwable thM8182b = C3960g.m8182b(c3959f);
                                        if (thM8182b != null) {
                                            c1659s.f5454b.invoke("朋友圈底部详情时间 Hook 安装失败", thM8182b);
                                            c3959f = Boolean.FALSE;
                                        }
                                        zBooleanValue = ((Boolean) c3959f).booleanValue();
                                    } else {
                                        zBooleanValue = false;
                                    }
                                }
                                break;
                            }
                            if (zBooleanValue) {
                                z9 = true;
                            }
                        }
                        return Boolean.valueOf(z9);
                    case 1:
                        C1659s c1659s2 = this.f5445h.f5446e;
                        boolean z10 = false;
                        if (c1659s2 != null) {
                            synchronized (c1659s2) {
                                if (c1659s2.f5458f) {
                                    zBooleanValue2 = true;
                                } else {
                                    Method methodM4242m2 = c1659s2.m4242m();
                                    if (methodM4242m2 == null || (declaringClass = methodM4242m2.getDeclaringClass()) == null || (methodM4239j = c1659s2.m4239j(declaringClass)) == null) {
                                        zBooleanValue2 = false;
                                    } else {
                                        try {
                                            C3744i.f12154b.m7763b(methodM4239j, new C1658r(c1659s2, 0));
                                            c1659s2.f5458f = true;
                                            c3959f2 = Boolean.TRUE;
                                        } catch (Throwable th3) {
                                            c3959f2 = new C3959f(th3);
                                        }
                                        Throwable thM8182b2 = C3960g.m8182b(c3959f2);
                                        if (thM8182b2 != null) {
                                            c1659s2.f5454b.invoke("朋友圈底部详情可见范围 Hook 安装失败", thM8182b2);
                                            c3959f2 = Boolean.FALSE;
                                        }
                                        zBooleanValue2 = ((Boolean) c3959f2).booleanValue();
                                    }
                                }
                                break;
                            }
                            if (zBooleanValue2) {
                                z10 = true;
                            }
                        }
                        return Boolean.valueOf(z10);
                    default:
                        C1659s c1659s3 = this.f5445h.f5446e;
                        boolean z11 = false;
                        if (c1659s3 != null) {
                            synchronized (c1659s3) {
                                if (c1659s3.f5459g) {
                                    zBooleanValue3 = true;
                                } else {
                                    Method methodM4240k = c1659s3.m4240k();
                                    if (methodM4240k != null) {
                                        Class<?> declaringClass2 = methodM4240k.getDeclaringClass();
                                        declaringClass2.getClass();
                                        Method methodM4241l = c1659s3.m4241l(declaringClass2);
                                        if (methodM4241l != null) {
                                            try {
                                                C3744i c3744i = C3744i.f12154b;
                                                c3744i.m7763b(methodM4241l, new C1658r(c1659s3, 1));
                                                c3744i.m7763b(methodM4240k, new C1658r(c1659s3, 2));
                                                Method methodM4238i = c1659s3.m4238i();
                                                if (methodM4238i != null) {
                                                    c3744i.m7763b(methodM4238i, new C1658r(c1659s3, 3));
                                                }
                                                c1659s3.f5459g = true;
                                                c3959f3 = Boolean.TRUE;
                                            } catch (Throwable th4) {
                                                c3959f3 = new C3959f(th4);
                                            }
                                            Throwable thM8182b3 = C3960g.m8182b(c3959f3);
                                            if (thM8182b3 != null) {
                                                c1659s3.f5454b.invoke("朋友圈底部详情个人主页 Hook 安装失败", thM8182b3);
                                                c3959f3 = Boolean.FALSE;
                                            }
                                            zBooleanValue3 = ((Boolean) c3959f3).booleanValue();
                                            break;
                                        }
                                    }
                                    zBooleanValue3 = false;
                                }
                            }
                            if (zBooleanValue3) {
                                z11 = true;
                            }
                        }
                        return Boolean.valueOf(z11);
                }
            }
        }, "moments_bottom_detail:profile", "朋友圈底部详情个人主页", enumC3738c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    public final String name() {
        return "朋友圈底部详情";
    }
}
