package p000A;

import java.util.ArrayList;
import java.util.List;
import me.dartcv.nuke.BuildConfig;
import p029F0.AbstractC0389a0;
import p029F0.AbstractC0391b0;
import p029F0.InterfaceC0379Q;
import p056K2.C0891q;
import p076P.AbstractC1096i;
import p095T.C1311F;
import p112W2.InterfaceC1601c;
import p115X0.C1624B;
import p117X2.AbstractC1665j;
import p136b0.C1844f;
import p153e1.EnumC2017m;
import p158f0.InterfaceC2090v;
import p179i4.AbstractC2352g;
import p186k.C2444z;
import p227r.EnumC2983d0;
import p244u.AbstractC3273i;
import p244u.C3254X;
import p244u.C3256Z;
import p244u.C3291x;

/* JADX INFO: renamed from: A.d0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0056d0 implements InterfaceC1601c {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f225d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f226e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f227f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f228g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f229h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0056d0(Object obj, Object obj2, Object obj3, int i5, int i6) {
        this.f225d = i6;
        this.f228g = obj;
        this.f226e = obj2;
        this.f229h = obj3;
        this.f227f = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        switch (this.f225d) {
            case 0:
                C0058e0 c0058e0 = (C0058e0) this.f228g;
                InterfaceC0379Q interfaceC0379Q = (InterfaceC0379Q) this.f226e;
                AbstractC0391b0 abstractC0391b0 = (AbstractC0391b0) this.f229h;
                AbstractC0389a0 abstractC0389a0 = (AbstractC0389a0) obj;
                int i5 = c0058e0.f232b;
                C0029O0 c0029o0 = c0058e0.f231a;
                C1624B c1624b = c0058e0.f233c;
                C0036S0 c0036s0 = (C0036S0) c0058e0.f234d.mo6a();
                c0029o0.m18a(EnumC2983d0.f9448e, AbstractC0070k0.m81h(abstractC0389a0, i5, c1624b, c0036s0 != null ? c0036s0.f161a : null, interfaceC0379Q.getLayoutDirection() == EnumC2017m.f6743e, abstractC0391b0.f1206d), this.f227f, abstractC0391b0.f1206d);
                AbstractC0389a0.m660k(abstractC0389a0, abstractC0391b0, Math.round(-c0029o0.f142a.m2507g()), 0);
                return C0891q.f2780a;
            case BuildConfig.VERSION_CODE /* 1 */:
                ArrayList arrayList = (ArrayList) this.f228g;
                InterfaceC0379Q interfaceC0379Q2 = (InterfaceC0379Q) this.f226e;
                float f2 = AbstractC1096i.f3519c;
                ArrayList arrayList2 = (ArrayList) this.f229h;
                AbstractC0389a0 abstractC0389a02 = (AbstractC0389a0) obj;
                int size = arrayList.size();
                for (int i6 = 0; i6 < size; i6++) {
                    List list = (List) arrayList.get(i6);
                    int size2 = list.size();
                    int[] iArr = new int[size2];
                    int i7 = 0;
                    while (i7 < size2) {
                        iArr[i7] = ((AbstractC0391b0) list.get(i7)).f1206d + (i7 < AbstractC2352g.m4208u(list) ? interfaceC0379Q2.mo270S(f2) : 0);
                        i7++;
                    }
                    int[] iArr2 = new int[size2];
                    AbstractC3273i.f10111b.mo5511b(interfaceC0379Q2, this.f227f, iArr, interfaceC0379Q2.getLayoutDirection(), iArr2);
                    int size3 = list.size();
                    for (int i8 = 0; i8 < size3; i8++) {
                        AbstractC0389a0.m658i(abstractC0389a02, (AbstractC0391b0) list.get(i8), iArr2[i8], ((Number) arrayList2.get(i6)).intValue());
                    }
                }
                return C0891q.f2780a;
            case 2:
                C1311F c1311f = (C1311F) this.f228g;
                C1844f c1844f = (C1844f) this.f226e;
                C2444z c2444z = (C2444z) this.f229h;
                if (obj == c1311f) {
                    throw new IllegalStateException("A derived state calculation cannot read itself");
                }
                if (obj instanceof InterfaceC2090v) {
                    int i9 = c1844f.f6246a - this.f227f;
                    int iM4364d = c2444z.m4364d(obj);
                    c2444z.m4367g(Math.min(i9, iM4364d >= 0 ? c2444z.f7900c[iM4364d] : Integer.MAX_VALUE), obj);
                }
                return C0891q.f2780a;
            default:
                AbstractC0391b0[] abstractC0391b0Arr = (AbstractC0391b0[]) this.f228g;
                C3256Z c3256z = (C3256Z) this.f226e;
                int[] iArr3 = (int[]) this.f229h;
                AbstractC0389a0 abstractC0389a03 = (AbstractC0389a0) obj;
                int length = abstractC0391b0Arr.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    AbstractC0391b0 abstractC0391b02 = abstractC0391b0Arr[i10];
                    int i12 = i11 + 1;
                    AbstractC1665j.m2982b(abstractC0391b02);
                    Object objMo650l = abstractC0391b02.mo650l();
                    C3254X c3254x = objMo650l instanceof C3254X ? (C3254X) objMo650l : null;
                    C3291x c3291x = c3254x != null ? c3254x.f10070c : null;
                    AbstractC0389a0.m658i(abstractC0389a03, abstractC0391b02, iArr3[i11], c3291x != null ? c3291x.f10174a.m4018a(abstractC0391b02.f1207e, this.f227f, EnumC2017m.f6742d) : Math.round((1 + c3256z.f10073b.f7177a) * ((r8 - abstractC0391b02.f1207e) / 2.0f)));
                    i10++;
                    i11 = i12;
                }
                return C0891q.f2780a;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ C0056d0(ArrayList arrayList, InterfaceC0379Q interfaceC0379Q, int i5, ArrayList arrayList2) {
        this.f225d = 1;
        float f2 = AbstractC1096i.f3517a;
        this.f228g = arrayList;
        this.f226e = interfaceC0379Q;
        this.f227f = i5;
        this.f229h = arrayList2;
    }

    public /* synthetic */ C0056d0(AbstractC0391b0[] abstractC0391b0Arr, C3256Z c3256z, int i5, int[] iArr) {
        this.f225d = 3;
        this.f228g = abstractC0391b0Arr;
        this.f226e = c3256z;
        this.f227f = i5;
        this.f229h = iArr;
    }
}
