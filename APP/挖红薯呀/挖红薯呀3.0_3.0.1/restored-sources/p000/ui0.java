package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ui0 {

    /* JADX INFO: renamed from: a */
    public final z31 f6228a = pf1.m3048d(vi0.f6722f);

    /* JADX INFO: renamed from: b */
    public final z31 f6229b;

    /* JADX INFO: renamed from: c */
    public final gt0 f6230c;

    /* JADX INFO: renamed from: d */
    public final C0917x8 f6231d;

    /* JADX INFO: renamed from: e */
    public final C0917x8 f6232e;

    /* JADX INFO: renamed from: f */
    public vk0 f6233f;

    /* JADX INFO: renamed from: g */
    public int f6234g;

    /* JADX INFO: renamed from: h */
    public ti0 f6235h;

    /* JADX INFO: renamed from: i */
    public final LinkedHashSet f6236i;

    /* JADX INFO: renamed from: j */
    public final LinkedHashSet f6237j;

    /* JADX INFO: renamed from: k */
    public final LinkedHashSet f6238k;

    /* JADX INFO: renamed from: l */
    public boolean f6239l;

    /* JADX INFO: renamed from: m */
    public boolean f6240m;

    /* JADX INFO: renamed from: n */
    public boolean f6241n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ui0() {
        z31 z31VarM3048d = pf1.m3048d(new si0());
        this.f6229b = z31VarM3048d;
        this.f6230c = new gt0(z31VarM3048d);
        this.f6231d = new C0917x8();
        this.f6232e = new C0917x8();
        this.f6236i = new LinkedHashSet();
        this.f6237j = new LinkedHashSet();
        this.f6238k = new LinkedHashSet();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m4331a(ri0 ri0Var, ti0 ti0Var, int i) {
        ri0Var.getClass();
        if (ti0Var.f6004a == null) {
            (i != 0 ? i != 1 ? this.f6236i : this.f6237j : this.f6238k).add(ti0Var);
            ti0Var.f6004a = ri0Var;
            ((si0) this.f6230c.f2048d.getValue()).getClass();
            ti0Var.mo4084b(i != 0 ? i != 1 ? this.f6241n : this.f6239l : this.f6240m);
            return;
        }
        StringBuilder sb = new StringBuilder("Input '");
        sb.append(ti0Var);
        ri0 ri0Var2 = ti0Var.f6004a;
        sb.append("' is already added to dispatcher ");
        sb.append(ri0Var2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m4332b() {
        boolean z;
        boolean z2;
        si0 si0Var;
        C0917x8 c0917x8 = this.f6231d;
        if (c0917x8 == null || !c0917x8.isEmpty()) {
            Iterator it = c0917x8.iterator();
            while (it.hasNext()) {
                if (((vk0) it.next()).f6738b) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        C0917x8 c0917x82 = this.f6232e;
        if (c0917x82 == null || !c0917x82.isEmpty()) {
            Iterator it2 = c0917x82.iterator();
            while (it2.hasNext()) {
                if (((vk0) it2.next()).f6738b) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        } else {
            z2 = false;
        }
        boolean z3 = z || z2;
        boolean z4 = this.f6240m != z;
        boolean z5 = this.f6239l != z2;
        boolean z6 = this.f6241n != z3;
        LinkedHashSet linkedHashSet = this.f6238k;
        if (z4) {
            Iterator it3 = linkedHashSet.iterator();
            while (it3.hasNext()) {
                ((ti0) it3.next()).mo4084b(z);
            }
        }
        LinkedHashSet linkedHashSet2 = this.f6237j;
        if (z5) {
            Iterator it4 = linkedHashSet2.iterator();
            while (it4.hasNext()) {
                ((ti0) it4.next()).mo4084b(z2);
            }
        }
        LinkedHashSet linkedHashSet3 = this.f6236i;
        if (z6) {
            Iterator it5 = linkedHashSet3.iterator();
            while (it5.hasNext()) {
                ((ti0) it5.next()).mo4084b(z3);
            }
        }
        this.f6240m = z;
        this.f6239l = z2;
        this.f6241n = z3;
        vk0 vk0VarM4333c = this.f6233f;
        if (vk0VarM4333c == null) {
            vk0VarM4333c = m4333c(0);
        }
        vk0 vk0VarM4333c2 = this.f6233f;
        if (vk0VarM4333c2 == null) {
            vk0VarM4333c2 = m4333c(0);
        }
        if (p30.m3002l(vk0VarM4333c2, vk0VarM4333c)) {
            if (vk0VarM4333c2 == null) {
                si0Var = new si0();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<E> it6 = c0917x8.iterator();
                while (it6.hasNext()) {
                    ((vk0) it6.next()).getClass();
                }
                Iterator<E> it7 = c0917x82.iterator();
                while (it7.hasNext()) {
                    ((vk0) it7.next()).getClass();
                }
                wk0 wk0Var = vk0VarM4333c2.f6737a;
                wa0 wa0Var = new wa0(10);
                AbstractC0170ef.m928G(wa0Var, arrayList);
                wa0Var.add(wk0Var);
                AbstractC0170ef.m928G(wa0Var, C0294hs.f2354d);
                si0Var = new si0(arrayList.size(), o30.m2772l(wa0Var));
            }
            z31 z31Var = this.f6229b;
            if (p30.m3002l((si0) z31Var.getValue(), si0Var)) {
                return;
            }
            z31Var.m5413j(null, si0Var);
            Iterator it8 = linkedHashSet.iterator();
            while (it8.hasNext()) {
                ((ti0) it8.next()).getClass();
            }
            Iterator it9 = linkedHashSet2.iterator();
            while (it9.hasNext()) {
                ((ti0) it9.next()).getClass();
            }
            Iterator it10 = linkedHashSet3.iterator();
            while (it10.hasNext()) {
                ((ti0) it10.next()).getClass();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final vk0 m4333c(int i) {
        Object next;
        Object next2;
        C0917x8 c0917x8 = this.f6232e;
        C0917x8 c0917x82 = this.f6231d;
        Object obj = null;
        if (i == -1) {
            Iterator it = c0917x82.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((vk0) next).f6738b) {
                    break;
                }
            }
            vk0 vk0Var = (vk0) next;
            if (vk0Var != null) {
                return vk0Var;
            }
            Iterator it2 = c0917x8.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next3 = it2.next();
                if (((vk0) next3).f6738b) {
                    obj = next3;
                    break;
                }
            }
            return (vk0) obj;
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException(("Unsupported direction: '" + i + "'.").toString());
            }
            Iterator it3 = c0917x82.iterator();
            while (it3.hasNext()) {
                ((vk0) it3.next()).getClass();
            }
            Iterator it4 = c0917x8.iterator();
            while (it4.hasNext()) {
                ((vk0) it4.next()).getClass();
            }
            return null;
        }
        Iterator it5 = c0917x82.iterator();
        while (true) {
            if (!it5.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it5.next();
            if (((vk0) next2).f6738b) {
                break;
            }
        }
        vk0 vk0Var2 = (vk0) next2;
        if (vk0Var2 != null) {
            return vk0Var2;
        }
        Iterator it6 = c0917x8.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            Object next4 = it6.next();
            if (((vk0) next4).f6738b) {
                obj = next4;
                break;
            }
        }
        return (vk0) obj;
    }
}
