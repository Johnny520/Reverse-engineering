package p213o2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import p224q2.C2913d;
import p230r2.AbstractC3127c0;
import p230r2.AbstractC3131g;
import p230r2.C3114S;
import p230r2.C3132h;
import p247u2.AbstractC3336f;
import p247u2.C3335e;

/* JADX INFO: renamed from: o2.o */
/* JADX INFO: loaded from: classes.dex */
public final class C2786o {

    /* JADX INFO: renamed from: a */
    public final C2913d f8802a = C2913d.f9207f;

    /* JADX INFO: renamed from: b */
    public final int f8803b = 1;

    /* JADX INFO: renamed from: c */
    public final C2772a f8804c = EnumC2779h.f8781d;

    /* JADX INFO: renamed from: d */
    public final HashMap f8805d = new HashMap();

    /* JADX INFO: renamed from: e */
    public final ArrayList f8806e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final ArrayList f8807f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public final int f8808g;

    /* JADX INFO: renamed from: h */
    public final int f8809h;

    /* JADX INFO: renamed from: i */
    public boolean f8810i;

    /* JADX INFO: renamed from: j */
    public final C2780i f8811j;

    /* JADX INFO: renamed from: k */
    public final boolean f8812k;

    /* JADX INFO: renamed from: l */
    public final C2793v f8813l;

    /* JADX INFO: renamed from: m */
    public final C2794w f8814m;

    /* JADX INFO: renamed from: n */
    public final ArrayDeque f8815n;

    public C2786o() {
        C2780i c2780i = C2785n.f8791h;
        this.f8808g = 2;
        this.f8809h = 2;
        this.f8810i = true;
        this.f8811j = C2785n.f8791h;
        this.f8812k = true;
        this.f8813l = C2785n.f8793j;
        this.f8814m = C2785n.f8794k;
        this.f8815n = new ArrayDeque();
    }

    /* JADX INFO: renamed from: a */
    public final C2785n m4976a() {
        C3114S c3114s;
        C3114S c3114s2;
        ArrayList arrayList = this.f8806e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f8807f;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size + 3);
        arrayList3.addAll(arrayList);
        Collections.reverse(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        Collections.reverse(arrayList4);
        arrayList3.addAll(arrayList4);
        boolean z5 = AbstractC3336f.f10376a;
        int i5 = this.f8808g;
        int i6 = this.f8809h;
        if (i5 != 2 || i6 != 2) {
            C3132h c3132h = new C3132h(AbstractC3131g.f9864b, i5, i6);
            C3114S c3114s3 = AbstractC3127c0.f9836a;
            C3114S c3114s4 = new C3114S(Date.class, c3132h, 0);
            if (z5) {
                C3335e c3335e = AbstractC3336f.f10378c;
                c3335e.getClass();
                c3114s = new C3114S(c3335e.f9865a, new C3132h(c3335e, i5, i6), 0);
                C3335e c3335e2 = AbstractC3336f.f10377b;
                c3335e2.getClass();
                c3114s2 = new C3114S(c3335e2.f9865a, new C3132h(c3335e2, i5, i6), 0);
            } else {
                c3114s = null;
                c3114s2 = null;
            }
            arrayList3.add(c3114s4);
            if (z5) {
                arrayList3.add(c3114s);
                arrayList3.add(c3114s2);
            }
        }
        HashMap map = new HashMap(this.f8805d);
        boolean z6 = this.f8810i;
        new ArrayList(arrayList);
        new ArrayList(arrayList2);
        return new C2785n(this.f8802a, this.f8804c, map, z6, this.f8811j, this.f8812k, this.f8803b, arrayList3, this.f8813l, this.f8814m, new ArrayList(this.f8815n));
    }
}
