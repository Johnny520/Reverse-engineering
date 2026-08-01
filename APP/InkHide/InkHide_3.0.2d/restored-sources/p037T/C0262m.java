package p037T;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import p041V.C0315h;
import p042W.AbstractC0334f;
import p042W.AbstractC0352x;
import p042W.C0330b;
import p042W.C0333e;
import p042W.C0348t;
import p046Z.AbstractC0360c;
import p046Z.C0359b;

/* JADX INFO: renamed from: T.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0262m {

    /* JADX INFO: renamed from: a */
    public final C0315h f620a = C0315h.f695c;

    /* JADX INFO: renamed from: b */
    public final int f621b = 1;

    /* JADX INFO: renamed from: c */
    public final C0250a f622c = EnumC0257h.f606a;

    /* JADX INFO: renamed from: d */
    public final HashMap f623d = new HashMap();

    /* JADX INFO: renamed from: e */
    public final ArrayList f624e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final ArrayList f625f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public boolean f626g = false;

    /* JADX INFO: renamed from: h */
    public final int f627h = 2;

    /* JADX INFO: renamed from: i */
    public final int f628i = 2;

    /* JADX INFO: renamed from: j */
    public final boolean f629j = true;

    /* JADX INFO: renamed from: k */
    public boolean f630k = false;

    /* JADX INFO: renamed from: l */
    public final boolean f631l = true;

    /* JADX INFO: renamed from: m */
    public final C0269t f632m = EnumC0273x.f639a;

    /* JADX INFO: renamed from: n */
    public final C0270u f633n = EnumC0273x.f640b;

    /* JADX INFO: renamed from: o */
    public final LinkedList f634o = new LinkedList();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C0261l m486a() {
        int i2;
        C0348t c0348t;
        C0348t c0348t2;
        ArrayList arrayList = this.f624e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f625f;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size + 3);
        arrayList3.addAll(arrayList);
        Collections.reverse(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        Collections.reverse(arrayList4);
        arrayList3.addAll(arrayList4);
        boolean z2 = AbstractC0360c.f841a;
        C0333e c0333e = AbstractC0334f.f743b;
        int i3 = this.f627h;
        if (i3 != 2 && (i2 = this.f628i) != 2) {
            C0330b c0330b = new C0330b(c0333e, i3, i2);
            C0348t c0348t3 = AbstractC0352x.f800a;
            C0348t c0348t4 = new C0348t(Date.class, c0330b, 0);
            if (z2) {
                C0359b c0359b = AbstractC0360c.f843c;
                c0359b.getClass();
                c0348t = new C0348t(c0359b.f744a, new C0330b(c0359b, i3, i2), 0);
                C0359b c0359b2 = AbstractC0360c.f842b;
                c0359b2.getClass();
                c0348t2 = new C0348t(c0359b2.f744a, new C0330b(c0359b2, i3, i2), 0);
            } else {
                c0348t = null;
                c0348t2 = null;
            }
            arrayList3.add(c0348t4);
            if (z2) {
                arrayList3.add(c0348t);
                arrayList3.add(c0348t2);
            }
        }
        C0250a c0250a = this.f622c;
        HashMap map = new HashMap(this.f623d);
        boolean z3 = this.f626g;
        boolean z4 = this.f630k;
        int i4 = this.f621b;
        new ArrayList(arrayList);
        new ArrayList(arrayList2);
        return new C0261l(this.f620a, c0250a, map, z3, this.f629j, z4, this.f631l, i4, arrayList3, this.f632m, this.f633n, new ArrayList(this.f634o));
    }
}
