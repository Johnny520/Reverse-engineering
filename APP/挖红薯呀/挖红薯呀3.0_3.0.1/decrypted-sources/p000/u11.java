package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class u11 extends av0 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: f */
    public Object f6103f;

    /* JADX INFO: renamed from: g */
    public Iterator f6104g;

    /* JADX INFO: renamed from: h */
    public int f6105h;

    /* JADX INFO: renamed from: i */
    public int f6106i;

    /* JADX INFO: renamed from: j */
    public int f6107j;

    /* JADX INFO: renamed from: k */
    public /* synthetic */ Object f6108k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Iterator f6109l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u11(Iterator it, InterfaceC0322ik interfaceC0322ik) {
        super(interfaceC0322ik);
        this.f6109l = it;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: g */
    public final InterfaceC0322ik mo15g(Object obj, InterfaceC0322ik interfaceC0322ik) {
        u11 u11Var = new u11(this.f6109l, interfaceC0322ik);
        u11Var.f6108k = obj;
        return u11Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        return ((u11) mo15g((q01) obj, (InterfaceC0322ik) obj2)).mo16m(na1.f4229a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: m */
    public final Object mo16m(Object obj) {
        int i;
        int i2;
        int i3;
        ArrayList arrayList;
        Iterator it;
        int i4;
        int i5;
        int i6;
        pv0 pv0Var;
        q01 q01Var = (q01) this.f6108k;
        int i7 = this.f6107j;
        boolean z = true;
        EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
        if (i7 == 0) {
            i = 1;
            w60.m4891M(obj);
            i2 = 0;
            i3 = 0;
            arrayList = new ArrayList(5);
            it = this.f6109l;
            i4 = 5;
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 == 3) {
                        i5 = this.f6106i;
                        int i8 = this.f6105h;
                        Iterator it2 = this.f6104g;
                        pv0 pv0Var2 = (pv0) this.f6103f;
                        w60.m4891M(obj);
                        pv0Var2.m3160b();
                        while (true) {
                            int i9 = pv0Var2.f4973e;
                            Object[] objArr = pv0Var2.f4972d;
                            if (!it2.hasNext()) {
                                i6 = i8;
                                pv0Var = pv0Var2;
                                break;
                            }
                            Object next = it2.next();
                            if (pv0Var2.mo6a() == i9) {
                                C0921xc.m5134o("ring buffer is full");
                                return null;
                            }
                            int i10 = pv0Var2.f4974f;
                            boolean z2 = z;
                            int i11 = pv0Var2.f4975g;
                            objArr[(i10 + i11) % i9] = next;
                            pv0Var2.f4975g = i11 + 1;
                            if (pv0Var2.mo6a() == i9) {
                                if (pv0Var2.f4975g >= 5) {
                                    ArrayList arrayList2 = new ArrayList(pv0Var2);
                                    this.f6108k = q01Var;
                                    this.f6103f = pv0Var2;
                                    this.f6104g = it2;
                                    this.f6105h = i8;
                                    this.f6106i = i5;
                                    this.f6107j = 3;
                                    q01Var.m3184b(this, arrayList2);
                                    return enumC1007zk;
                                }
                                int i12 = i9 + (i9 >> 1) + 1;
                                if (i12 > 5) {
                                    i12 = 5;
                                }
                                pv0Var2 = new pv0(pv0Var2.f4975g, pv0Var2.f4974f == 0 ? Arrays.copyOf(objArr, i12) : pv0Var2.toArray(new Object[i12]));
                            }
                            z = z2;
                        }
                    } else if (i7 == 4) {
                        i5 = this.f6106i;
                        i6 = this.f6105h;
                        pv0Var = (pv0) this.f6103f;
                        w60.m4891M(obj);
                        pv0Var.m3160b();
                    } else {
                        if (i7 != 5) {
                            C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    if (pv0Var.f4975g > 5) {
                        ArrayList arrayList3 = new ArrayList(pv0Var);
                        this.f6108k = q01Var;
                        this.f6103f = pv0Var;
                        this.f6104g = null;
                        this.f6105h = i6;
                        this.f6106i = i5;
                        this.f6107j = 4;
                        q01Var.m3184b(this, arrayList3);
                        return enumC1007zk;
                    }
                    if (!pv0Var.isEmpty()) {
                        this.f6108k = null;
                        this.f6103f = null;
                        this.f6104g = null;
                        this.f6105h = i6;
                        this.f6106i = i5;
                        this.f6107j = 5;
                        q01Var.m3184b(this, pv0Var);
                        return enumC1007zk;
                    }
                    return na1.f4229a;
                }
                w60.m4891M(obj);
                return na1.f4229a;
            }
            i = 1;
            i2 = this.f6106i;
            int i13 = this.f6105h;
            Iterator it3 = this.f6104g;
            w60.m4891M(obj);
            arrayList = new ArrayList(5);
            it = it3;
            i4 = i13;
            i3 = i2;
        }
        while (it.hasNext()) {
            Object next2 = it.next();
            if (i2 > 0) {
                i2--;
            } else {
                arrayList.add(next2);
                if (arrayList.size() == 5) {
                    this.f6108k = q01Var;
                    this.f6103f = arrayList;
                    this.f6104g = it;
                    this.f6105h = i4;
                    this.f6106i = i3;
                    this.f6107j = i;
                    q01Var.m3184b(this, arrayList);
                    return enumC1007zk;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.f6108k = null;
            this.f6103f = null;
            this.f6104g = null;
            this.f6105h = i4;
            this.f6106i = i3;
            this.f6107j = 2;
            q01Var.m3184b(this, arrayList);
            return enumC1007zk;
        }
        return na1.f4229a;
    }
}
