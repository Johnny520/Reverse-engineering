package p000;

import java.lang.annotation.Annotation;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class dv2 implements ve0, InterfaceC0863wx {

    /* JADX INFO: renamed from: a */
    public final C0559ox f2237a;

    /* JADX INFO: renamed from: b */
    public final u21 f2238b;

    /* JADX INFO: renamed from: c */
    public final fg3 f2239c;

    /* JADX INFO: renamed from: d */
    public final dv2[] f2240d;

    /* JADX INFO: renamed from: e */
    public final f31 f2241e;

    /* JADX INFO: renamed from: f */
    public boolean f2242f;

    /* JADX INFO: renamed from: g */
    public String f2243g;

    /* JADX INFO: renamed from: h */
    public String f2244h;

    public dv2(C0559ox c0559ox, u21 u21Var, fg3 fg3Var, dv2[] dv2VarArr) {
        c0559ox.getClass();
        this.f2237a = c0559ox;
        this.f2238b = u21Var;
        this.f2239c = fg3Var;
        this.f2240d = dv2VarArr;
        this.f2241e = u21Var.f11072a;
        int iOrdinal = fg3Var.ordinal();
        if (dv2VarArr != null) {
            dv2 dv2Var = dv2VarArr[iOrdinal];
            if (dv2Var == null && dv2Var == this) {
                return;
            }
            dv2VarArr[iOrdinal] = this;
        }
    }

    @Override // p000.InterfaceC0863wx
    /* JADX INFO: renamed from: a */
    public final void mo1176a(yo2 yo2Var) {
        yo2Var.getClass();
        C0559ox c0559ox = this.f2237a;
        c0559ox.mo3659m();
        c0559ox.mo3649c();
        c0559ox.m3651e(this.f2239c.f2997i);
    }

    @Override // p000.ve0
    /* JADX INFO: renamed from: b */
    public final InterfaceC0863wx mo1177b(yo2 yo2Var) {
        dv2 dv2Var;
        yo2Var.getClass();
        u21 u21Var = this.f2238b;
        fg3 fg3VarM1915f = gg3.m1915f(u21Var, yo2Var);
        char c = fg3VarM1915f.f2996h;
        C0559ox c0559ox = this.f2237a;
        c0559ox.m3651e(c);
        c0559ox.mo3647a();
        String str = this.f2243g;
        if (str != null) {
            String strMo250b = this.f2244h;
            if (strMo250b == null) {
                strMo250b = yo2Var.mo250b();
            }
            c0559ox.mo3648b();
            c0559ox.mo3655i(str);
            c0559ox.m3651e(':');
            c0559ox.mo3657k();
            mo1191p(strMo250b);
            this.f2243g = null;
            this.f2244h = null;
        }
        if (this.f2239c == fg3VarM1915f) {
            return this;
        }
        dv2[] dv2VarArr = this.f2240d;
        return (dv2VarArr == null || (dv2Var = dv2VarArr[fg3VarM1915f.ordinal()]) == null) ? new dv2(c0559ox, u21Var, fg3VarM1915f, dv2VarArr) : dv2Var;
    }

    @Override // p000.ve0
    /* JADX INFO: renamed from: c */
    public final void mo1178c() {
        C0559ox c0559ox = this.f2237a;
        c0559ox.getClass();
        ((C0133dk) c0559ox.f7866i).m1045w("null");
    }

    @Override // p000.InterfaceC0863wx
    /* JADX INFO: renamed from: d */
    public final boolean mo1179d(yo2 yo2Var) {
        yo2Var.getClass();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    @Override // p000.ve0
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1180e(w41 w41Var, Object obj) {
        String strDiscriminator;
        String str;
        w41Var.getClass();
        u21 u21Var = this.f2238b;
        f31 f31Var = u21Var.f11072a;
        boolean z = w41Var instanceof AbstractC0152e3;
        EnumC0973zs enumC0973zs = f31Var.f2760g;
        if (!z) {
            int iOrdinal = enumC0973zs.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    s11 s11VarMo251c = w41Var.mo168e().mo251c();
                    if (t11.m5086l(s11VarMo251c, yv2.f13632g) || t11.m5086l(s11VarMo251c, yv2.f13635j)) {
                    }
                } else if (iOrdinal != 2) {
                    c80.m675s();
                    return;
                }
            }
            strDiscriminator = null;
        } else if (enumC0973zs != EnumC0973zs.f14080h) {
            yo2 yo2VarMo168e = w41Var.mo168e();
            yo2VarMo168e.getClass();
            Iterator it = yo2VarMo168e.getAnnotations().iterator();
            while (true) {
                if (!it.hasNext()) {
                    strDiscriminator = f31Var.f2758e;
                    break;
                }
                Annotation annotation = (Annotation) it.next();
                if (annotation instanceof e31) {
                    strDiscriminator = ((e31) annotation).discriminator();
                    break;
                }
            }
        } else {
            strDiscriminator = null;
        }
        if (z) {
            vi0.m5701t(w41Var);
            obj.getClass();
            throw null;
        }
        if (strDiscriminator != null) {
            yo2 yo2VarMo168e2 = w41Var.mo168e();
            yo2VarMo168e2.getClass();
            sp0.m4915N(u21Var, yo2VarMo168e2);
            if (AbstractC0738tl.m5314m(yo2VarMo168e2).contains(strDiscriminator)) {
                String strMo250b = w41Var.mo168e().mo250b();
                String strMo250b2 = w41Var.mo168e().mo250b();
                if (f31Var.f2760g == EnumC0973zs.f14081i && t11.m5086l(strMo250b, strMo250b2)) {
                    str = "in ALL_JSON_OBJECTS class discriminator mode";
                } else {
                    str = "as base class '" + strMo250b + '\'';
                }
                throw new r31(hk1.m2211j(vi0.m5696o("Class '", strMo250b2, "' cannot be serialized ", str, " because it has property name that conflicts with JSON class discriminator '"), strDiscriminator, "'."), "You can either change class discriminator in JsonConfiguration, or rename property with @SerialName annotation.");
            }
            s11 s11VarMo251c2 = w41Var.mo168e().mo251c();
            s11VarMo251c2.getClass();
            if (s11VarMo251c2 instanceof cp2) {
                C0676s.m4653l("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
                return;
            }
            if (s11VarMo251c2 instanceof f32) {
                C0676s.m4653l("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
                return;
            } else if (s11VarMo251c2 instanceof x12) {
                C0676s.m4653l("Actual serializer for polymorphic cannot be polymorphic itself");
                return;
            } else {
                String strMo250b3 = w41Var.mo168e().mo250b();
                this.f2243g = strDiscriminator;
                this.f2244h = strMo250b3;
            }
        }
        w41Var.mo167d(this, obj);
    }

    @Override // p000.ve0
    /* JADX INFO: renamed from: f */
    public final void mo1181f(double d) {
        if (this.f2242f) {
            mo1191p(String.valueOf(d));
        } else {
            ((C0133dk) this.f2237a.f7866i).m1045w(String.valueOf(d));
        }
        if (Math.abs(d) > Double.MAX_VALUE) {
            throw new r31(AbstractC0570p7.m3750F(Double.valueOf(d), null), "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
        }
    }

    @Override // p000.ve0
    /* JADX INFO: renamed from: g */
    public final void mo1182g(short s) {
        if (this.f2242f) {
            mo1191p(String.valueOf((int) s));
        } else {
            this.f2237a.mo3654h(s);
        }
    }

    @Override // p000.InterfaceC0863wx
    /* JADX INFO: renamed from: h */
    public final void mo1183h(yo2 yo2Var, int i, Object obj) {
        nv2 nv2Var = nv2.f7346a;
        yo2Var.getClass();
        if (obj != null || this.f2241e.f2756c) {
            nv2 nv2Var2 = nv2.f7346a;
            yo2Var.getClass();
            m1194s(yo2Var, i);
            nv2.f7347b.getClass();
            if (obj == null) {
                mo1178c();
            } else {
                mo1180e(nv2Var2, obj);
            }
        }
    }

    @Override // p000.ve0
    /* JADX INFO: renamed from: i */
    public final void mo1184i(byte b) {
        if (this.f2242f) {
            mo1191p(String.valueOf((int) b));
        } else {
            this.f2237a.mo3650d(b);
        }
    }

    @Override // p000.ve0
    /* JADX INFO: renamed from: j */
    public final void mo1185j(boolean z) {
        if (this.f2242f) {
            mo1191p(String.valueOf(z));
        } else {
            ((C0133dk) this.f2237a.f7866i).m1045w(String.valueOf(z));
        }
    }

    @Override // p000.ve0
    /* JADX INFO: renamed from: k */
    public final ve0 mo1186k(yo2 yo2Var) {
        yo2Var.getClass();
        boolean zM1479a = ev2.m1479a(yo2Var);
        fg3 fg3Var = this.f2239c;
        u21 u21Var = this.f2238b;
        C0559ox c0673rx = this.f2237a;
        if (zM1479a) {
            if (!(c0673rx instanceof C0711sx)) {
                c0673rx = new C0711sx((C0133dk) c0673rx.f7866i, this.f2242f);
            }
            return new dv2(c0673rx, u21Var, fg3Var, null);
        }
        if (yo2Var.mo362f() && yo2Var.equals(l31.f5905a)) {
            if (!(c0673rx instanceof C0673rx)) {
                c0673rx = new C0673rx((C0133dk) c0673rx.f7866i, this.f2242f);
            }
            return new dv2(c0673rx, u21Var, fg3Var, null);
        }
        if (this.f2243g != null) {
            this.f2244h = yo2Var.mo250b();
        }
        return this;
    }

    @Override // p000.ve0
    /* JADX INFO: renamed from: l */
    public final void mo1187l(int i) {
        if (this.f2242f) {
            mo1191p(String.valueOf(i));
        } else {
            this.f2237a.mo3652f(i);
        }
    }

    @Override // p000.ve0
    /* JADX INFO: renamed from: m */
    public final void mo1188m(float f) {
        if (this.f2242f) {
            mo1191p(String.valueOf(f));
        } else {
            ((C0133dk) this.f2237a.f7866i).m1045w(String.valueOf(f));
        }
        if (Math.abs(f) > Float.MAX_VALUE) {
            throw new r31(AbstractC0570p7.m3750F(Float.valueOf(f), null), "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
        }
    }

    @Override // p000.ve0
    /* JADX INFO: renamed from: n */
    public final void mo1189n(long j) {
        if (this.f2242f) {
            mo1191p(String.valueOf(j));
        } else {
            this.f2237a.mo3653g(j);
        }
    }

    @Override // p000.ve0
    /* JADX INFO: renamed from: o */
    public final void mo1190o(char c) {
        mo1191p(String.valueOf(c));
    }

    @Override // p000.ve0
    /* JADX INFO: renamed from: p */
    public final void mo1191p(String str) {
        str.getClass();
        this.f2237a.mo3655i(str);
    }

    @Override // p000.ve0
    /* JADX INFO: renamed from: q */
    public final void mo1192q(yo2 yo2Var, int i) {
        yo2Var.getClass();
        mo1191p(yo2Var.mo253e(i));
    }

    /* JADX INFO: renamed from: r */
    public final void m1193r(yo2 yo2Var, int i, boolean z) {
        yo2Var.getClass();
        m1194s(yo2Var, i);
        mo1185j(z);
    }

    /* JADX INFO: renamed from: s */
    public final void m1194s(yo2 yo2Var, int i) {
        yo2Var.getClass();
        int iOrdinal = this.f2239c.ordinal();
        C0559ox c0559ox = this.f2237a;
        boolean z = true;
        if (iOrdinal == 1) {
            if (!c0559ox.f7865h) {
                c0559ox.m3651e(',');
            }
            c0559ox.mo3648b();
            return;
        }
        if (iOrdinal == 2) {
            if (c0559ox.f7865h) {
                this.f2242f = true;
                c0559ox.mo3648b();
                return;
            }
            if (i % 2 == 0) {
                c0559ox.m3651e(',');
                c0559ox.mo3648b();
            } else {
                c0559ox.m3651e(':');
                c0559ox.mo3657k();
                z = false;
            }
            this.f2242f = z;
            return;
        }
        if (iOrdinal != 3) {
            if (!c0559ox.f7865h) {
                c0559ox.m3651e(',');
            }
            c0559ox.mo3648b();
            sp0.m4915N(this.f2238b, yo2Var);
            mo1191p(yo2Var.mo253e(i));
            c0559ox.m3651e(':');
            c0559ox.mo3657k();
            return;
        }
        if (i == 0) {
            this.f2242f = true;
        }
        if (i == 1) {
            c0559ox.m3651e(',');
            c0559ox.mo3657k();
            this.f2242f = false;
        }
    }

    /* JADX INFO: renamed from: t */
    public final ve0 m1195t(d32 d32Var, int i) {
        d32Var.getClass();
        m1194s(d32Var, i);
        return mo1186k(d32Var.mo256j(i));
    }

    /* JADX INFO: renamed from: u */
    public final void m1196u(int i, int i2, yo2 yo2Var) {
        yo2Var.getClass();
        m1194s(yo2Var, i);
        mo1187l(i2);
    }

    /* JADX INFO: renamed from: v */
    public final void m1197v(yo2 yo2Var, int i, long j) {
        yo2Var.getClass();
        m1194s(yo2Var, i);
        mo1189n(j);
    }

    /* JADX INFO: renamed from: w */
    public final void m1198w(yo2 yo2Var, int i, w41 w41Var, Object obj) {
        yo2Var.getClass();
        w41Var.getClass();
        m1194s(yo2Var, i);
        mo1180e(w41Var, obj);
    }

    /* JADX INFO: renamed from: x */
    public final void m1199x(yo2 yo2Var, int i, String str) {
        yo2Var.getClass();
        str.getClass();
        m1194s(yo2Var, i);
        mo1191p(str);
    }
}
