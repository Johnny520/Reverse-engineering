package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vs extends xs1 {
    public final r30 l;
    public final ArrayList m;
    public final HashMap n;
    public final ArrayList o;
    public final ArrayList p;
    public final ArrayList q;
    public x20 r;
    public byte[] s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public vs(r30 r30Var) {
        super(1, -1);
        if (r30Var == null) {
            um2.f("thisClass == null");
            throw null;
        }
        this.l = r30Var;
        this.m = new ArrayList(20);
        this.n = new HashMap(40);
        this.o = new ArrayList(20);
        this.p = new ArrayList(20);
        this.q = new ArrayList(20);
        this.r = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void l(z70 z70Var, yn ynVar, String str, ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return;
        }
        if (ynVar.d()) {
            ynVar.c("  " + str + ":", 0);
        }
        int iD = 0;
        for (int i = 0; i < size; i++) {
            iD = ((te0) arrayList.get(i)).d(z70Var, ynVar, iD, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void n(yn ynVar, String str, int i) {
        if (ynVar.d()) {
            ynVar.b(String.format("  %-21s %08x", str.concat("_size:"), Integer.valueOf(i)));
        }
        ynVar.m(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f21
    public final void a(z70 z70Var) {
        ArrayList<se0> arrayList = this.m;
        if (!arrayList.isEmpty()) {
            o();
            for (se0 se0Var : arrayList) {
                se0Var.getClass();
                ((ni0) z70Var.k).m(se0Var.i);
            }
        }
        ArrayList<se0> arrayList2 = this.o;
        if (!arrayList2.isEmpty()) {
            Collections.sort(arrayList2);
            for (se0 se0Var2 : arrayList2) {
                se0Var2.getClass();
                ((ni0) z70Var.k).m(se0Var2.i);
            }
        }
        ArrayList<ue0> arrayList3 = this.p;
        if (!arrayList3.isEmpty()) {
            Collections.sort(arrayList3);
            for (ue0 ue0Var : arrayList3) {
                ue0Var.getClass();
                xg1 xg1Var = (xg1) z70Var.l;
                eh1 eh1Var = (eh1) z70Var.b;
                xg1Var.m(ue0Var.i);
                yt ytVar = ue0Var.j;
                if (ytVar != null) {
                    eh1Var.k(ytVar);
                }
            }
        }
        ArrayList<ue0> arrayList4 = this.q;
        if (arrayList4.isEmpty()) {
            return;
        }
        Collections.sort(arrayList4);
        for (ue0 ue0Var2 : arrayList4) {
            ue0Var2.getClass();
            xg1 xg1Var2 = (xg1) z70Var.l;
            eh1 eh1Var2 = (eh1) z70Var.b;
            xg1Var2.m(ue0Var2.i);
            yt ytVar2 = ue0Var2.j;
            if (ytVar2 != null) {
                eh1Var2.k(ytVar2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f21
    public final g21 b() {
        return g21.TYPE_CLASS_DATA_ITEM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xs1
    public final void i(eh1 eh1Var, int i) {
        yn ynVar = new yn();
        m(eh1Var.b, ynVar);
        int i2 = ynVar.c;
        byte[] bArr = new byte[i2];
        System.arraycopy(ynVar.b, 0, bArr, 0, i2);
        this.s = bArr;
        j(i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xs1
    public final void k(z70 z70Var, yn ynVar) {
        if (ynVar.d()) {
            m(z70Var, ynVar);
        } else {
            ynVar.h(this.s);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void m(z70 z70Var, yn ynVar) {
        boolean zD = ynVar.d();
        if (zD) {
            ynVar.c(g() + " class data for " + this.l.h.b(), 0);
        }
        ArrayList arrayList = this.m;
        n(ynVar, "static_fields", arrayList.size());
        ArrayList arrayList2 = this.o;
        n(ynVar, "instance_fields", arrayList2.size());
        ArrayList arrayList3 = this.p;
        n(ynVar, "direct_methods", arrayList3.size());
        ArrayList arrayList4 = this.q;
        n(ynVar, "virtual_methods", arrayList4.size());
        l(z70Var, ynVar, "static_fields", arrayList);
        l(z70Var, ynVar, "instance_fields", arrayList2);
        l(z70Var, ynVar, "direct_methods", arrayList3);
        l(z70Var, ynVar, "virtual_methods", arrayList4);
        if (zD) {
            ynVar.e();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final x20 o() {
        HashMap map;
        x20 x20Var;
        dz dzVar;
        if (this.r == null) {
            ArrayList arrayList = this.m;
            if (arrayList.size() != 0) {
                Collections.sort(arrayList);
                int size = arrayList.size();
                while (true) {
                    map = this.n;
                    if (size <= 0) {
                        break;
                    }
                    dz dzVar2 = (dz) map.get((se0) arrayList.get(size - 1));
                    if (dzVar2 instanceof k30) {
                        if (((k30) dzVar2).i() != 0) {
                            break;
                        }
                        size--;
                    } else {
                        if (dzVar2 != null) {
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
                        dz dzVar3 = (dz) map.get(se0Var);
                        if (dzVar3 == null) {
                            o43 o43VarA = se0Var.i.a();
                            switch (o43VarA.i) {
                                case 1:
                                    dzVar = y20.i;
                                    break;
                                case 2:
                                    dzVar = z20.i;
                                    break;
                                case 3:
                                    dzVar = a30.i;
                                    break;
                                case 4:
                                    dzVar = b30.i;
                                    break;
                                case 5:
                                    dzVar = d30.i;
                                    break;
                                case AIChatConfig.DefaultContextRounds /* 6 */:
                                    dzVar = g30.j;
                                    break;
                                case 7:
                                    dzVar = l30.i;
                                    break;
                                case 8:
                                    dzVar = p30.i;
                                    break;
                                case 9:
                                    dzVar = h30.h;
                                    break;
                                default:
                                    throw new UnsupportedOperationException("no zero for type: " + o43VarA.b());
                            }
                            dzVar3 = dzVar;
                        }
                        w20Var.f(i, dzVar3);
                    }
                    w20Var.h = false;
                    x20Var = new x20(w20Var);
                }
                this.r = x20Var;
            }
        }
        return this.r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean p() {
        return this.m.isEmpty() && this.o.isEmpty() && this.p.isEmpty() && this.q.isEmpty();
    }
}
