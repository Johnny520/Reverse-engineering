package p108ha;

import android.os.Handler;
import java.lang.reflect.Method;
import ke.C2399h;
import p010aa.C0039g;
import p011ab.C0042b;
import p068eh.AbstractC0921a;
import p077f8.C1085e;
import p085fg.InterfaceC1220a;
import p099h.Hchat.utils.KavaReflector;
import p210o8.C3087k;
import p258r8.AbstractC3736a;
import p258r8.C3740e;
import p258r8.C3742g;
import p258r8.C3744i;
import p258r8.EnumC3738c;
import p276sf.C3959f;
import p276sf.C3960g;

/* JADX INFO: renamed from: ha.v */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1662v extends AbstractC3736a {

    /* JADX INFO: renamed from: e */
    public C1666z f5470e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    /* JADX INFO: renamed from: a */
    public final String mo297a() {
        return "moments_keyword_block";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: f */
    public final void mo298f(C3742g c3742g) {
        c3742g.getClass();
        m7751h(new C0039g("moments_keyword_block", "朋友圈关键词屏蔽", "隐藏正文命中关键词的朋友圈", "practical"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: g */
    public final void mo299g(C3742g c3742g) {
        c3742g.getClass();
        this.f5470e = new C1666z(c3742g, new C0042b(2, this, AbstractC0921a.m2246i(C1662v.class), "logFeatureError", "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V", 0, 0, 20));
        m4244k();
        m7752i(C1085e.class, new C2399h(this, 12));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m4244k() {
        Handler handler = C3740e.f12138a;
        final int i9 = 0;
        InterfaceC1220a interfaceC1220a = new InterfaceC1220a(this) { // from class: ha.u

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ C1662v f5469h;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f5469h = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p085fg.InterfaceC1220a
            public final Object invoke() {
                Object c3959f;
                boolean zBooleanValue;
                Object c3959f2;
                boolean zBooleanValue2;
                Object c3959f3;
                boolean zBooleanValue3;
                Object c3959f4;
                boolean zBooleanValue4;
                switch (i9) {
                    case 0:
                        C1666z c1666z = this.f5469h.f5470e;
                        boolean z9 = false;
                        if (c1666z != null) {
                            synchronized (c1666z) {
                                if (!c1666z.f5488m) {
                                    Method methodM4257m = c1666z.m4257m();
                                    if (methodM4257m == null) {
                                        c1666z.f5488m = true;
                                    } else {
                                        try {
                                            C3744i c3744i = C3744i.f12154b;
                                            Method methodAccessible = KavaReflector.accessible(methodM4257m);
                                            if (methodAccessible == null) {
                                                methodAccessible = methodM4257m;
                                            }
                                            c3744i.m7763b(methodAccessible, new C1665y(c1666z, 1));
                                            c1666z.f5488m = true;
                                            c3959f = Boolean.TRUE;
                                        } catch (Throwable th2) {
                                            c3959f = new C3959f(th2);
                                        }
                                        Throwable thM8182b = C3960g.m8182b(c3959f);
                                        if (thM8182b != null) {
                                            c1666z.f5477b.invoke("朋友圈关键词屏蔽旧版时间线 Hook 安装失败: " + methodM4257m.toGenericString(), thM8182b);
                                            c3959f = Boolean.FALSE;
                                        }
                                        zBooleanValue = ((Boolean) c3959f).booleanValue();
                                    }
                                    break;
                                }
                                zBooleanValue = true;
                            }
                            if (zBooleanValue) {
                                z9 = true;
                            }
                        }
                        return Boolean.valueOf(z9);
                    case 1:
                        C1666z c1666z2 = this.f5469h.f5470e;
                        boolean z10 = false;
                        if (c1666z2 != null) {
                            synchronized (c1666z2) {
                                if (c1666z2.f5489n) {
                                    zBooleanValue2 = true;
                                } else {
                                    Method methodM4256l = c1666z2.m4256l();
                                    if (methodM4256l != null) {
                                        try {
                                            C3744i c3744i2 = C3744i.f12154b;
                                            Method methodAccessible2 = KavaReflector.accessible(methodM4256l);
                                            if (methodAccessible2 == null) {
                                                methodAccessible2 = methodM4256l;
                                            }
                                            c3744i2.m7763b(methodAccessible2, new C1665y(c1666z2, 0));
                                            c1666z2.f5489n = true;
                                            c3959f2 = Boolean.TRUE;
                                        } catch (Throwable th3) {
                                            c3959f2 = new C3959f(th3);
                                        }
                                        Throwable thM8182b2 = C3960g.m8182b(c3959f2);
                                        if (thM8182b2 != null) {
                                            c1666z2.f5477b.invoke("朋友圈关键词屏蔽新版时间线 Hook 安装失败: " + methodM4256l.toGenericString(), thM8182b2);
                                            c3959f2 = Boolean.FALSE;
                                        }
                                        zBooleanValue2 = ((Boolean) c3959f2).booleanValue();
                                    } else {
                                        zBooleanValue2 = false;
                                    }
                                }
                                break;
                            }
                            if (zBooleanValue2) {
                                z10 = true;
                            }
                        }
                        return Boolean.valueOf(z10);
                    case 2:
                        C1666z c1666z3 = this.f5469h.f5470e;
                        boolean z11 = false;
                        if (c1666z3 != null) {
                            synchronized (c1666z3) {
                                if (c1666z3.f5490o) {
                                    zBooleanValue3 = true;
                                } else {
                                    Method methodM4258n = c1666z3.m4258n();
                                    if (methodM4258n != null) {
                                        try {
                                            C3744i c3744i3 = C3744i.f12154b;
                                            Method methodAccessible3 = KavaReflector.accessible(methodM4258n);
                                            if (methodAccessible3 == null) {
                                                methodAccessible3 = methodM4258n;
                                            }
                                            c3744i3.m7763b(methodAccessible3, new C1665y(c1666z3, 2));
                                            c1666z3.f5490o = true;
                                            c3959f3 = Boolean.TRUE;
                                        } catch (Throwable th4) {
                                            c3959f3 = new C3959f(th4);
                                        }
                                        Throwable thM8182b3 = C3960g.m8182b(c3959f3);
                                        if (thM8182b3 != null) {
                                            c1666z3.f5477b.invoke("朋友圈关键词屏蔽个人主页列表 Hook 安装失败: " + methodM4258n.toGenericString(), thM8182b3);
                                            c3959f3 = Boolean.FALSE;
                                        }
                                        zBooleanValue3 = ((Boolean) c3959f3).booleanValue();
                                    } else {
                                        zBooleanValue3 = false;
                                    }
                                }
                                break;
                            }
                            if (zBooleanValue3) {
                                z11 = true;
                            }
                        }
                        return Boolean.valueOf(z11);
                    default:
                        C1666z c1666z4 = this.f5469h.f5470e;
                        boolean z12 = false;
                        if (c1666z4 != null) {
                            synchronized (c1666z4) {
                                if (!c1666z4.f5491p) {
                                    C3742g c3742g = c1666z4.f5476a;
                                    long j3 = C3087k.m6557a(c3742g.f12143a, c3742g.f12145c).f8195a;
                                    if (j3 != 0 && j3 < 3020) {
                                        c1666z4.f5491p = true;
                                    }
                                    Method methodM4255k = c1666z4.m4255k();
                                    if (methodM4255k != null) {
                                        try {
                                            C3744i c3744i4 = C3744i.f12154b;
                                            Method methodAccessible4 = KavaReflector.accessible(methodM4255k);
                                            if (methodAccessible4 == null) {
                                                methodAccessible4 = methodM4255k;
                                            }
                                            c3744i4.m7763b(methodAccessible4, new C1665y(c1666z4, 3));
                                            c1666z4.f5491p = true;
                                            c3959f4 = Boolean.TRUE;
                                        } catch (Throwable th5) {
                                            c3959f4 = new C3959f(th5);
                                        }
                                        Throwable thM8182b4 = C3960g.m8182b(c3959f4);
                                        if (thM8182b4 != null) {
                                            c1666z4.f5477b.invoke("朋友圈关键词屏蔽个人主页 Hook 安装失败: " + methodM4255k.toGenericString(), thM8182b4);
                                            c3959f4 = Boolean.FALSE;
                                        }
                                        zBooleanValue4 = ((Boolean) c3959f4).booleanValue();
                                    } else {
                                        zBooleanValue4 = false;
                                    }
                                    break;
                                }
                                zBooleanValue4 = true;
                            }
                            if (zBooleanValue4) {
                                z12 = true;
                            }
                        }
                        return Boolean.valueOf(z12);
                }
            }
        };
        EnumC3738c enumC3738c = EnumC3738c.BRIDGE;
        C3740e.m7759f(8, interfaceC1220a, "moments_keyword_block:timeline_legacy", "朋友圈关键词屏蔽旧版时间线", enumC3738c);
        final int i10 = 1;
        C3740e.m7759f(8, new InterfaceC1220a(this) { // from class: ha.u

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ C1662v f5469h;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f5469h = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p085fg.InterfaceC1220a
            public final Object invoke() {
                Object c3959f;
                boolean zBooleanValue;
                Object c3959f2;
                boolean zBooleanValue2;
                Object c3959f3;
                boolean zBooleanValue3;
                Object c3959f4;
                boolean zBooleanValue4;
                switch (i10) {
                    case 0:
                        C1666z c1666z = this.f5469h.f5470e;
                        boolean z9 = false;
                        if (c1666z != null) {
                            synchronized (c1666z) {
                                if (!c1666z.f5488m) {
                                    Method methodM4257m = c1666z.m4257m();
                                    if (methodM4257m == null) {
                                        c1666z.f5488m = true;
                                    } else {
                                        try {
                                            C3744i c3744i = C3744i.f12154b;
                                            Method methodAccessible = KavaReflector.accessible(methodM4257m);
                                            if (methodAccessible == null) {
                                                methodAccessible = methodM4257m;
                                            }
                                            c3744i.m7763b(methodAccessible, new C1665y(c1666z, 1));
                                            c1666z.f5488m = true;
                                            c3959f = Boolean.TRUE;
                                        } catch (Throwable th2) {
                                            c3959f = new C3959f(th2);
                                        }
                                        Throwable thM8182b = C3960g.m8182b(c3959f);
                                        if (thM8182b != null) {
                                            c1666z.f5477b.invoke("朋友圈关键词屏蔽旧版时间线 Hook 安装失败: " + methodM4257m.toGenericString(), thM8182b);
                                            c3959f = Boolean.FALSE;
                                        }
                                        zBooleanValue = ((Boolean) c3959f).booleanValue();
                                    }
                                    break;
                                }
                                zBooleanValue = true;
                            }
                            if (zBooleanValue) {
                                z9 = true;
                            }
                        }
                        return Boolean.valueOf(z9);
                    case 1:
                        C1666z c1666z2 = this.f5469h.f5470e;
                        boolean z10 = false;
                        if (c1666z2 != null) {
                            synchronized (c1666z2) {
                                if (c1666z2.f5489n) {
                                    zBooleanValue2 = true;
                                } else {
                                    Method methodM4256l = c1666z2.m4256l();
                                    if (methodM4256l != null) {
                                        try {
                                            C3744i c3744i2 = C3744i.f12154b;
                                            Method methodAccessible2 = KavaReflector.accessible(methodM4256l);
                                            if (methodAccessible2 == null) {
                                                methodAccessible2 = methodM4256l;
                                            }
                                            c3744i2.m7763b(methodAccessible2, new C1665y(c1666z2, 0));
                                            c1666z2.f5489n = true;
                                            c3959f2 = Boolean.TRUE;
                                        } catch (Throwable th3) {
                                            c3959f2 = new C3959f(th3);
                                        }
                                        Throwable thM8182b2 = C3960g.m8182b(c3959f2);
                                        if (thM8182b2 != null) {
                                            c1666z2.f5477b.invoke("朋友圈关键词屏蔽新版时间线 Hook 安装失败: " + methodM4256l.toGenericString(), thM8182b2);
                                            c3959f2 = Boolean.FALSE;
                                        }
                                        zBooleanValue2 = ((Boolean) c3959f2).booleanValue();
                                    } else {
                                        zBooleanValue2 = false;
                                    }
                                }
                                break;
                            }
                            if (zBooleanValue2) {
                                z10 = true;
                            }
                        }
                        return Boolean.valueOf(z10);
                    case 2:
                        C1666z c1666z3 = this.f5469h.f5470e;
                        boolean z11 = false;
                        if (c1666z3 != null) {
                            synchronized (c1666z3) {
                                if (c1666z3.f5490o) {
                                    zBooleanValue3 = true;
                                } else {
                                    Method methodM4258n = c1666z3.m4258n();
                                    if (methodM4258n != null) {
                                        try {
                                            C3744i c3744i3 = C3744i.f12154b;
                                            Method methodAccessible3 = KavaReflector.accessible(methodM4258n);
                                            if (methodAccessible3 == null) {
                                                methodAccessible3 = methodM4258n;
                                            }
                                            c3744i3.m7763b(methodAccessible3, new C1665y(c1666z3, 2));
                                            c1666z3.f5490o = true;
                                            c3959f3 = Boolean.TRUE;
                                        } catch (Throwable th4) {
                                            c3959f3 = new C3959f(th4);
                                        }
                                        Throwable thM8182b3 = C3960g.m8182b(c3959f3);
                                        if (thM8182b3 != null) {
                                            c1666z3.f5477b.invoke("朋友圈关键词屏蔽个人主页列表 Hook 安装失败: " + methodM4258n.toGenericString(), thM8182b3);
                                            c3959f3 = Boolean.FALSE;
                                        }
                                        zBooleanValue3 = ((Boolean) c3959f3).booleanValue();
                                    } else {
                                        zBooleanValue3 = false;
                                    }
                                }
                                break;
                            }
                            if (zBooleanValue3) {
                                z11 = true;
                            }
                        }
                        return Boolean.valueOf(z11);
                    default:
                        C1666z c1666z4 = this.f5469h.f5470e;
                        boolean z12 = false;
                        if (c1666z4 != null) {
                            synchronized (c1666z4) {
                                if (!c1666z4.f5491p) {
                                    C3742g c3742g = c1666z4.f5476a;
                                    long j3 = C3087k.m6557a(c3742g.f12143a, c3742g.f12145c).f8195a;
                                    if (j3 != 0 && j3 < 3020) {
                                        c1666z4.f5491p = true;
                                    }
                                    Method methodM4255k = c1666z4.m4255k();
                                    if (methodM4255k != null) {
                                        try {
                                            C3744i c3744i4 = C3744i.f12154b;
                                            Method methodAccessible4 = KavaReflector.accessible(methodM4255k);
                                            if (methodAccessible4 == null) {
                                                methodAccessible4 = methodM4255k;
                                            }
                                            c3744i4.m7763b(methodAccessible4, new C1665y(c1666z4, 3));
                                            c1666z4.f5491p = true;
                                            c3959f4 = Boolean.TRUE;
                                        } catch (Throwable th5) {
                                            c3959f4 = new C3959f(th5);
                                        }
                                        Throwable thM8182b4 = C3960g.m8182b(c3959f4);
                                        if (thM8182b4 != null) {
                                            c1666z4.f5477b.invoke("朋友圈关键词屏蔽个人主页 Hook 安装失败: " + methodM4255k.toGenericString(), thM8182b4);
                                            c3959f4 = Boolean.FALSE;
                                        }
                                        zBooleanValue4 = ((Boolean) c3959f4).booleanValue();
                                    } else {
                                        zBooleanValue4 = false;
                                    }
                                    break;
                                }
                                zBooleanValue4 = true;
                            }
                            if (zBooleanValue4) {
                                z12 = true;
                            }
                        }
                        return Boolean.valueOf(z12);
                }
            }
        }, "moments_keyword_block:timeline_improve", "朋友圈关键词屏蔽新版时间线", enumC3738c);
        final int i11 = 2;
        C3740e.m7759f(8, new InterfaceC1220a(this) { // from class: ha.u

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ C1662v f5469h;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f5469h = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p085fg.InterfaceC1220a
            public final Object invoke() {
                Object c3959f;
                boolean zBooleanValue;
                Object c3959f2;
                boolean zBooleanValue2;
                Object c3959f3;
                boolean zBooleanValue3;
                Object c3959f4;
                boolean zBooleanValue4;
                switch (i11) {
                    case 0:
                        C1666z c1666z = this.f5469h.f5470e;
                        boolean z9 = false;
                        if (c1666z != null) {
                            synchronized (c1666z) {
                                if (!c1666z.f5488m) {
                                    Method methodM4257m = c1666z.m4257m();
                                    if (methodM4257m == null) {
                                        c1666z.f5488m = true;
                                    } else {
                                        try {
                                            C3744i c3744i = C3744i.f12154b;
                                            Method methodAccessible = KavaReflector.accessible(methodM4257m);
                                            if (methodAccessible == null) {
                                                methodAccessible = methodM4257m;
                                            }
                                            c3744i.m7763b(methodAccessible, new C1665y(c1666z, 1));
                                            c1666z.f5488m = true;
                                            c3959f = Boolean.TRUE;
                                        } catch (Throwable th2) {
                                            c3959f = new C3959f(th2);
                                        }
                                        Throwable thM8182b = C3960g.m8182b(c3959f);
                                        if (thM8182b != null) {
                                            c1666z.f5477b.invoke("朋友圈关键词屏蔽旧版时间线 Hook 安装失败: " + methodM4257m.toGenericString(), thM8182b);
                                            c3959f = Boolean.FALSE;
                                        }
                                        zBooleanValue = ((Boolean) c3959f).booleanValue();
                                    }
                                    break;
                                }
                                zBooleanValue = true;
                            }
                            if (zBooleanValue) {
                                z9 = true;
                            }
                        }
                        return Boolean.valueOf(z9);
                    case 1:
                        C1666z c1666z2 = this.f5469h.f5470e;
                        boolean z10 = false;
                        if (c1666z2 != null) {
                            synchronized (c1666z2) {
                                if (c1666z2.f5489n) {
                                    zBooleanValue2 = true;
                                } else {
                                    Method methodM4256l = c1666z2.m4256l();
                                    if (methodM4256l != null) {
                                        try {
                                            C3744i c3744i2 = C3744i.f12154b;
                                            Method methodAccessible2 = KavaReflector.accessible(methodM4256l);
                                            if (methodAccessible2 == null) {
                                                methodAccessible2 = methodM4256l;
                                            }
                                            c3744i2.m7763b(methodAccessible2, new C1665y(c1666z2, 0));
                                            c1666z2.f5489n = true;
                                            c3959f2 = Boolean.TRUE;
                                        } catch (Throwable th3) {
                                            c3959f2 = new C3959f(th3);
                                        }
                                        Throwable thM8182b2 = C3960g.m8182b(c3959f2);
                                        if (thM8182b2 != null) {
                                            c1666z2.f5477b.invoke("朋友圈关键词屏蔽新版时间线 Hook 安装失败: " + methodM4256l.toGenericString(), thM8182b2);
                                            c3959f2 = Boolean.FALSE;
                                        }
                                        zBooleanValue2 = ((Boolean) c3959f2).booleanValue();
                                    } else {
                                        zBooleanValue2 = false;
                                    }
                                }
                                break;
                            }
                            if (zBooleanValue2) {
                                z10 = true;
                            }
                        }
                        return Boolean.valueOf(z10);
                    case 2:
                        C1666z c1666z3 = this.f5469h.f5470e;
                        boolean z11 = false;
                        if (c1666z3 != null) {
                            synchronized (c1666z3) {
                                if (c1666z3.f5490o) {
                                    zBooleanValue3 = true;
                                } else {
                                    Method methodM4258n = c1666z3.m4258n();
                                    if (methodM4258n != null) {
                                        try {
                                            C3744i c3744i3 = C3744i.f12154b;
                                            Method methodAccessible3 = KavaReflector.accessible(methodM4258n);
                                            if (methodAccessible3 == null) {
                                                methodAccessible3 = methodM4258n;
                                            }
                                            c3744i3.m7763b(methodAccessible3, new C1665y(c1666z3, 2));
                                            c1666z3.f5490o = true;
                                            c3959f3 = Boolean.TRUE;
                                        } catch (Throwable th4) {
                                            c3959f3 = new C3959f(th4);
                                        }
                                        Throwable thM8182b3 = C3960g.m8182b(c3959f3);
                                        if (thM8182b3 != null) {
                                            c1666z3.f5477b.invoke("朋友圈关键词屏蔽个人主页列表 Hook 安装失败: " + methodM4258n.toGenericString(), thM8182b3);
                                            c3959f3 = Boolean.FALSE;
                                        }
                                        zBooleanValue3 = ((Boolean) c3959f3).booleanValue();
                                    } else {
                                        zBooleanValue3 = false;
                                    }
                                }
                                break;
                            }
                            if (zBooleanValue3) {
                                z11 = true;
                            }
                        }
                        return Boolean.valueOf(z11);
                    default:
                        C1666z c1666z4 = this.f5469h.f5470e;
                        boolean z12 = false;
                        if (c1666z4 != null) {
                            synchronized (c1666z4) {
                                if (!c1666z4.f5491p) {
                                    C3742g c3742g = c1666z4.f5476a;
                                    long j3 = C3087k.m6557a(c3742g.f12143a, c3742g.f12145c).f8195a;
                                    if (j3 != 0 && j3 < 3020) {
                                        c1666z4.f5491p = true;
                                    }
                                    Method methodM4255k = c1666z4.m4255k();
                                    if (methodM4255k != null) {
                                        try {
                                            C3744i c3744i4 = C3744i.f12154b;
                                            Method methodAccessible4 = KavaReflector.accessible(methodM4255k);
                                            if (methodAccessible4 == null) {
                                                methodAccessible4 = methodM4255k;
                                            }
                                            c3744i4.m7763b(methodAccessible4, new C1665y(c1666z4, 3));
                                            c1666z4.f5491p = true;
                                            c3959f4 = Boolean.TRUE;
                                        } catch (Throwable th5) {
                                            c3959f4 = new C3959f(th5);
                                        }
                                        Throwable thM8182b4 = C3960g.m8182b(c3959f4);
                                        if (thM8182b4 != null) {
                                            c1666z4.f5477b.invoke("朋友圈关键词屏蔽个人主页 Hook 安装失败: " + methodM4255k.toGenericString(), thM8182b4);
                                            c3959f4 = Boolean.FALSE;
                                        }
                                        zBooleanValue4 = ((Boolean) c3959f4).booleanValue();
                                    } else {
                                        zBooleanValue4 = false;
                                    }
                                    break;
                                }
                                zBooleanValue4 = true;
                            }
                            if (zBooleanValue4) {
                                z12 = true;
                            }
                        }
                        return Boolean.valueOf(z12);
                }
            }
        }, "moments_keyword_block:profile_list", "朋友圈关键词屏蔽个人主页列表", enumC3738c);
        final int i12 = 3;
        C3740e.m7759f(8, new InterfaceC1220a(this) { // from class: ha.u

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ C1662v f5469h;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f5469h = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p085fg.InterfaceC1220a
            public final Object invoke() {
                Object c3959f;
                boolean zBooleanValue;
                Object c3959f2;
                boolean zBooleanValue2;
                Object c3959f3;
                boolean zBooleanValue3;
                Object c3959f4;
                boolean zBooleanValue4;
                switch (i12) {
                    case 0:
                        C1666z c1666z = this.f5469h.f5470e;
                        boolean z9 = false;
                        if (c1666z != null) {
                            synchronized (c1666z) {
                                if (!c1666z.f5488m) {
                                    Method methodM4257m = c1666z.m4257m();
                                    if (methodM4257m == null) {
                                        c1666z.f5488m = true;
                                    } else {
                                        try {
                                            C3744i c3744i = C3744i.f12154b;
                                            Method methodAccessible = KavaReflector.accessible(methodM4257m);
                                            if (methodAccessible == null) {
                                                methodAccessible = methodM4257m;
                                            }
                                            c3744i.m7763b(methodAccessible, new C1665y(c1666z, 1));
                                            c1666z.f5488m = true;
                                            c3959f = Boolean.TRUE;
                                        } catch (Throwable th2) {
                                            c3959f = new C3959f(th2);
                                        }
                                        Throwable thM8182b = C3960g.m8182b(c3959f);
                                        if (thM8182b != null) {
                                            c1666z.f5477b.invoke("朋友圈关键词屏蔽旧版时间线 Hook 安装失败: " + methodM4257m.toGenericString(), thM8182b);
                                            c3959f = Boolean.FALSE;
                                        }
                                        zBooleanValue = ((Boolean) c3959f).booleanValue();
                                    }
                                    break;
                                }
                                zBooleanValue = true;
                            }
                            if (zBooleanValue) {
                                z9 = true;
                            }
                        }
                        return Boolean.valueOf(z9);
                    case 1:
                        C1666z c1666z2 = this.f5469h.f5470e;
                        boolean z10 = false;
                        if (c1666z2 != null) {
                            synchronized (c1666z2) {
                                if (c1666z2.f5489n) {
                                    zBooleanValue2 = true;
                                } else {
                                    Method methodM4256l = c1666z2.m4256l();
                                    if (methodM4256l != null) {
                                        try {
                                            C3744i c3744i2 = C3744i.f12154b;
                                            Method methodAccessible2 = KavaReflector.accessible(methodM4256l);
                                            if (methodAccessible2 == null) {
                                                methodAccessible2 = methodM4256l;
                                            }
                                            c3744i2.m7763b(methodAccessible2, new C1665y(c1666z2, 0));
                                            c1666z2.f5489n = true;
                                            c3959f2 = Boolean.TRUE;
                                        } catch (Throwable th3) {
                                            c3959f2 = new C3959f(th3);
                                        }
                                        Throwable thM8182b2 = C3960g.m8182b(c3959f2);
                                        if (thM8182b2 != null) {
                                            c1666z2.f5477b.invoke("朋友圈关键词屏蔽新版时间线 Hook 安装失败: " + methodM4256l.toGenericString(), thM8182b2);
                                            c3959f2 = Boolean.FALSE;
                                        }
                                        zBooleanValue2 = ((Boolean) c3959f2).booleanValue();
                                    } else {
                                        zBooleanValue2 = false;
                                    }
                                }
                                break;
                            }
                            if (zBooleanValue2) {
                                z10 = true;
                            }
                        }
                        return Boolean.valueOf(z10);
                    case 2:
                        C1666z c1666z3 = this.f5469h.f5470e;
                        boolean z11 = false;
                        if (c1666z3 != null) {
                            synchronized (c1666z3) {
                                if (c1666z3.f5490o) {
                                    zBooleanValue3 = true;
                                } else {
                                    Method methodM4258n = c1666z3.m4258n();
                                    if (methodM4258n != null) {
                                        try {
                                            C3744i c3744i3 = C3744i.f12154b;
                                            Method methodAccessible3 = KavaReflector.accessible(methodM4258n);
                                            if (methodAccessible3 == null) {
                                                methodAccessible3 = methodM4258n;
                                            }
                                            c3744i3.m7763b(methodAccessible3, new C1665y(c1666z3, 2));
                                            c1666z3.f5490o = true;
                                            c3959f3 = Boolean.TRUE;
                                        } catch (Throwable th4) {
                                            c3959f3 = new C3959f(th4);
                                        }
                                        Throwable thM8182b3 = C3960g.m8182b(c3959f3);
                                        if (thM8182b3 != null) {
                                            c1666z3.f5477b.invoke("朋友圈关键词屏蔽个人主页列表 Hook 安装失败: " + methodM4258n.toGenericString(), thM8182b3);
                                            c3959f3 = Boolean.FALSE;
                                        }
                                        zBooleanValue3 = ((Boolean) c3959f3).booleanValue();
                                    } else {
                                        zBooleanValue3 = false;
                                    }
                                }
                                break;
                            }
                            if (zBooleanValue3) {
                                z11 = true;
                            }
                        }
                        return Boolean.valueOf(z11);
                    default:
                        C1666z c1666z4 = this.f5469h.f5470e;
                        boolean z12 = false;
                        if (c1666z4 != null) {
                            synchronized (c1666z4) {
                                if (!c1666z4.f5491p) {
                                    C3742g c3742g = c1666z4.f5476a;
                                    long j3 = C3087k.m6557a(c3742g.f12143a, c3742g.f12145c).f8195a;
                                    if (j3 != 0 && j3 < 3020) {
                                        c1666z4.f5491p = true;
                                    }
                                    Method methodM4255k = c1666z4.m4255k();
                                    if (methodM4255k != null) {
                                        try {
                                            C3744i c3744i4 = C3744i.f12154b;
                                            Method methodAccessible4 = KavaReflector.accessible(methodM4255k);
                                            if (methodAccessible4 == null) {
                                                methodAccessible4 = methodM4255k;
                                            }
                                            c3744i4.m7763b(methodAccessible4, new C1665y(c1666z4, 3));
                                            c1666z4.f5491p = true;
                                            c3959f4 = Boolean.TRUE;
                                        } catch (Throwable th5) {
                                            c3959f4 = new C3959f(th5);
                                        }
                                        Throwable thM8182b4 = C3960g.m8182b(c3959f4);
                                        if (thM8182b4 != null) {
                                            c1666z4.f5477b.invoke("朋友圈关键词屏蔽个人主页 Hook 安装失败: " + methodM4255k.toGenericString(), thM8182b4);
                                            c3959f4 = Boolean.FALSE;
                                        }
                                        zBooleanValue4 = ((Boolean) c3959f4).booleanValue();
                                    } else {
                                        zBooleanValue4 = false;
                                    }
                                    break;
                                }
                                zBooleanValue4 = true;
                            }
                            if (zBooleanValue4) {
                                z12 = true;
                            }
                        }
                        return Boolean.valueOf(z12);
                }
            }
        }, "moments_keyword_block:profile_switch", "朋友圈关键词屏蔽个人主页入口", enumC3738c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    public final String name() {
        return "朋友圈关键词屏蔽";
    }
}
