package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: renamed from: vs */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0821vs extends xs1 {

    /* JADX INFO: renamed from: l */
    public final r30 f12150l;

    /* JADX INFO: renamed from: m */
    public final ArrayList f12151m;

    /* JADX INFO: renamed from: n */
    public final HashMap f12152n;

    /* JADX INFO: renamed from: o */
    public final ArrayList f12153o;

    /* JADX INFO: renamed from: p */
    public final ArrayList f12154p;

    /* JADX INFO: renamed from: q */
    public final ArrayList f12155q;

    /* JADX INFO: renamed from: r */
    public x20 f12156r;

    /* JADX INFO: renamed from: s */
    public byte[] f12157s;

    public C0821vs(r30 r30Var) {
        super(1, -1);
        if (r30Var == null) {
            um2.m5516f("thisClass == null");
            throw null;
        }
        this.f12150l = r30Var;
        this.f12151m = new ArrayList(20);
        this.f12152n = new HashMap(40);
        this.f12153o = new ArrayList(20);
        this.f12154p = new ArrayList(20);
        this.f12155q = new ArrayList(20);
        this.f12156r = null;
    }

    /* JADX INFO: renamed from: l */
    public static void m5790l(z70 z70Var, C0929yn c0929yn, String str, ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return;
        }
        if (c0929yn.m6293d()) {
            c0929yn.m6292c("  " + str + ":", 0);
        }
        int iMo4856d = 0;
        for (int i = 0; i < size; i++) {
            iMo4856d = ((te0) arrayList.get(i)).mo4856d(z70Var, c0929yn, iMo4856d, i);
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m5791n(C0929yn c0929yn, String str, int i) {
        if (c0929yn.m6293d()) {
            c0929yn.m6291b(String.format("  %-21s %08x", str.concat("_size:"), Integer.valueOf(i)));
        }
        c0929yn.m6301m(i);
    }

    @Override // p000.f21
    /* JADX INFO: renamed from: a */
    public final void mo68a(z70 z70Var) {
        ArrayList<se0> arrayList = this.f12151m;
        if (!arrayList.isEmpty()) {
            m5793o();
            for (se0 se0Var : arrayList) {
                se0Var.getClass();
                ((ni0) z70Var.f13760k).m3310m(se0Var.f10075i);
            }
        }
        ArrayList<se0> arrayList2 = this.f12153o;
        if (!arrayList2.isEmpty()) {
            Collections.sort(arrayList2);
            for (se0 se0Var2 : arrayList2) {
                se0Var2.getClass();
                ((ni0) z70Var.f13760k).m3310m(se0Var2.f10075i);
            }
        }
        ArrayList<ue0> arrayList3 = this.f12154p;
        if (!arrayList3.isEmpty()) {
            Collections.sort(arrayList3);
            for (ue0 ue0Var : arrayList3) {
                ue0Var.getClass();
                xg1 xg1Var = (xg1) z70Var.f13761l;
                eh1 eh1Var = (eh1) z70Var.f13751b;
                xg1Var.m6151m(ue0Var.f11254i);
                C0935yt c0935yt = ue0Var.f11255j;
                if (c0935yt != null) {
                    eh1Var.m1353k(c0935yt);
                }
            }
        }
        ArrayList<ue0> arrayList4 = this.f12155q;
        if (arrayList4.isEmpty()) {
            return;
        }
        Collections.sort(arrayList4);
        for (ue0 ue0Var2 : arrayList4) {
            ue0Var2.getClass();
            xg1 xg1Var2 = (xg1) z70Var.f13761l;
            eh1 eh1Var2 = (eh1) z70Var.f13751b;
            xg1Var2.m6151m(ue0Var2.f11254i);
            C0935yt c0935yt2 = ue0Var2.f11255j;
            if (c0935yt2 != null) {
                eh1Var2.m1353k(c0935yt2);
            }
        }
    }

    @Override // p000.f21
    /* JADX INFO: renamed from: b */
    public final g21 mo69b() {
        return g21.TYPE_CLASS_DATA_ITEM;
    }

    @Override // p000.xs1
    /* JADX INFO: renamed from: i */
    public final void mo4438i(eh1 eh1Var, int i) {
        C0929yn c0929yn = new C0929yn();
        m5792m(eh1Var.f5108b, c0929yn);
        int i2 = c0929yn.f13526c;
        byte[] bArr = new byte[i2];
        System.arraycopy(c0929yn.f13525b, 0, bArr, 0, i2);
        this.f12157s = bArr;
        m6180j(i2);
    }

    @Override // p000.xs1
    /* JADX INFO: renamed from: k */
    public final void mo1532k(z70 z70Var, C0929yn c0929yn) {
        if (c0929yn.m6293d()) {
            m5792m(z70Var, c0929yn);
        } else {
            c0929yn.m6296h(this.f12157s);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m5792m(z70 z70Var, C0929yn c0929yn) {
        boolean zM6293d = c0929yn.m6293d();
        if (zM6293d) {
            c0929yn.m6292c(m6178g() + " class data for " + this.f12150l.f9342h.mo23b(), 0);
        }
        ArrayList arrayList = this.f12151m;
        m5791n(c0929yn, "static_fields", arrayList.size());
        ArrayList arrayList2 = this.f12153o;
        m5791n(c0929yn, "instance_fields", arrayList2.size());
        ArrayList arrayList3 = this.f12154p;
        m5791n(c0929yn, "direct_methods", arrayList3.size());
        ArrayList arrayList4 = this.f12155q;
        m5791n(c0929yn, "virtual_methods", arrayList4.size());
        m5790l(z70Var, c0929yn, "static_fields", arrayList);
        m5790l(z70Var, c0929yn, "instance_fields", arrayList2);
        m5790l(z70Var, c0929yn, "direct_methods", arrayList3);
        m5790l(z70Var, c0929yn, "virtual_methods", arrayList4);
        if (zM6293d) {
            c0929yn.m6294e();
        }
    }

    /* JADX INFO: renamed from: o */
    public final x20 m5793o() {
        HashMap map;
        x20 x20Var;
        AbstractC0147dz abstractC0147dz;
        if (this.f12156r == null) {
            ArrayList arrayList = this.f12151m;
            if (arrayList.size() != 0) {
                Collections.sort(arrayList);
                int size = arrayList.size();
                while (true) {
                    map = this.f12152n;
                    if (size <= 0) {
                        break;
                    }
                    AbstractC0147dz abstractC0147dz2 = (AbstractC0147dz) map.get((se0) arrayList.get(size - 1));
                    if (abstractC0147dz2 instanceof k30) {
                        if (((k30) abstractC0147dz2).mo2048i() != 0) {
                            break;
                        }
                        size--;
                    } else {
                        if (abstractC0147dz2 != null) {
                            break;
                        }
                        size--;
                    }
                }
                if (size == 0) {
                    x20Var = null;
                } else {
                    w20 w20Var = new w20(size);
                    for (int i = 0; i < size; i++) {
                        se0 se0Var = (se0) arrayList.get(i);
                        AbstractC0147dz abstractC0147dz3 = (AbstractC0147dz) map.get(se0Var);
                        if (abstractC0147dz3 == null) {
                            o43 o43VarMo22a = se0Var.f10075i.mo22a();
                            switch (o43VarMo22a.f7522i) {
                                case 1:
                                    abstractC0147dz = y20.f13282i;
                                    break;
                                case 2:
                                    abstractC0147dz = z20.f13708i;
                                    break;
                                case 3:
                                    abstractC0147dz = a30.f42i;
                                    break;
                                case 4:
                                    abstractC0147dz = b30.f544i;
                                    break;
                                case 5:
                                    abstractC0147dz = d30.f1846i;
                                    break;
                                case AIChatConfig.DefaultContextRounds /* 6 */:
                                    abstractC0147dz = g30.f3294j;
                                    break;
                                case 7:
                                    abstractC0147dz = l30.f5904i;
                                    break;
                                case 8:
                                    abstractC0147dz = p30.f7958i;
                                    break;
                                case 9:
                                    abstractC0147dz = h30.f3810h;
                                    break;
                                default:
                                    throw new UnsupportedOperationException("no zero for type: " + o43VarMo22a.mo23b());
                            }
                            abstractC0147dz3 = abstractC0147dz;
                        }
                        w20Var.m2694f(i, abstractC0147dz3);
                    }
                    w20Var.f11990h = false;
                    x20Var = new x20(w20Var);
                }
                this.f12156r = x20Var;
            }
        }
        return this.f12156r;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m5794p() {
        return this.f12151m.isEmpty() && this.f12153o.isEmpty() && this.f12154p.isEmpty() && this.f12155q.isEmpty();
    }
}
