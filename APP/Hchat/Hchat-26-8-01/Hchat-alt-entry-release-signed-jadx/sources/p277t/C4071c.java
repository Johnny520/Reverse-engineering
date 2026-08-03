package p277t;

import p057e1.C0808c;
import p077f8.AbstractC1089i;
import p116i.C1746e0;
import p131j0.C2046b;
import p136j8.C2104o;
import p219oh.AbstractC3165h;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6038c;

/* JADX INFO: renamed from: t.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4071c {

    /* JADX INFO: renamed from: a */
    public final C2046b f13501a = new C2046b(new C4073e[16]);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0062 -> B:19:0x0065). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8260a(C0808c c0808c, AbstractC6038c abstractC6038c) {
        C4070b c4070b;
        C0808c c0808c2;
        int i9;
        Object[] objArr;
        int i10;
        if (abstractC6038c instanceof C4070b) {
            c4070b = (C4070b) abstractC6038c;
            int i11 = c4070b.f13500m;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c4070b.f13500m = i11 - Integer.MIN_VALUE;
            } else {
                c4070b = new C4070b(this, abstractC6038c);
            }
        }
        Object obj = c4070b.f13498k;
        int i12 = c4070b.f13500m;
        if (i12 == 0) {
            AbstractC1089i.m2732I0(obj);
            C2046b c2046b = this.f13501a;
            Object[] objArr2 = c2046b.f6891g;
            int i13 = c2046b.f6893i;
            c0808c2 = c0808c;
            i9 = i13;
            objArr = objArr2;
            i10 = 0;
            if (i10 < i9) {
            }
        } else {
            if (i12 != 1) {
                C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i9 = c4070b.f13497j;
            i10 = c4070b.f13496i;
            objArr = c4070b.f13495h;
            C0808c c0808c3 = c4070b.f13494g;
            AbstractC1089i.m2732I0(obj);
            c0808c2 = c0808c3;
            i10++;
            if (i10 < i9) {
                C4073e c4073e = (C4073e) objArr[i10];
                C1746e0 c1746e0 = new C1746e0(c0808c2, 23);
                c4070b.f13494g = c0808c2;
                c4070b.f13495h = objArr;
                c4070b.f13496i = i10;
                c4070b.f13497j = i9;
                c4070b.f13500m = 1;
                Object objM6784k = AbstractC3165h.m6784k(c4073e, c1746e0, c4070b);
                EnumC5799a enumC5799a = EnumC5799a.f23547g;
                if (objM6784k == enumC5799a) {
                    return enumC5799a;
                }
                i10++;
                if (i10 < i9) {
                    return C3967n.f12976a;
                }
            }
        }
    }
}
