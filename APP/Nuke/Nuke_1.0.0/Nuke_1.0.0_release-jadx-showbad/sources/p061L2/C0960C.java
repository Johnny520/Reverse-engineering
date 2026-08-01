package p061L2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1183h;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;
import p127Z2.AbstractC1784a;
import p143c3.C1906h;

/* JADX INFO: renamed from: L2.C */
/* JADX INFO: loaded from: classes.dex */
public final class C0960C extends AbstractC1183h implements InterfaceC1603e {

    /* JADX INFO: renamed from: f */
    public Object f3022f;

    /* JADX INFO: renamed from: g */
    public Iterator f3023g;

    /* JADX INFO: renamed from: h */
    public int f3024h;

    /* JADX INFO: renamed from: i */
    public int f3025i;

    /* JADX INFO: renamed from: j */
    public int f3026j;

    /* JADX INFO: renamed from: k */
    public /* synthetic */ Object f3027k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f3028l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ int f3029m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Iterator f3030n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0960C(int i5, int i6, Iterator it, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f3028l = i5;
        this.f3029m = i6;
        this.f3030n = it;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        return ((C0960C) mo7n((InterfaceC1046d) obj2, (C1906h) obj)).mo8p(C0891q.f2780a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        C0960C c0960c = new C0960C(this.f3028l, this.f3029m, this.f3030n, interfaceC1046d);
        c0960c.f3027k = obj;
        return c0960c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0141 A[SYNTHETIC] */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo8p(Object obj) {
        int i5;
        int i6;
        int i7;
        Iterator it;
        C0959B c0959b;
        ArrayList arrayList;
        int i8;
        Iterator it2;
        int i9;
        int i10;
        C0959B c0959b2;
        boolean z5;
        Object[] array;
        C1906h c1906h = (C1906h) this.f3027k;
        int i11 = this.f3026j;
        int i12 = this.f3029m;
        boolean z6 = true;
        int i13 = this.f3028l;
        EnumC1152a enumC1152a = EnumC1152a.f3788d;
        if (i11 == 0) {
            AbstractC1784a.m3205S(obj);
            int i14 = i13 <= 1024 ? i13 : 1024;
            i5 = i12 - i13;
            Iterator it3 = this.f3030n;
            if (i5 >= 0) {
                arrayList = new ArrayList(i14);
                i8 = i14;
                it2 = it3;
                i9 = 0;
                while (it2.hasNext()) {
                }
                if (!arrayList.isEmpty()) {
                }
            } else {
                C0959B c0959b3 = new C0959B(0, new Object[i14]);
                i6 = i14;
                i7 = i5;
                it = it3;
                c0959b = c0959b3;
                while (true) {
                    int i15 = c0959b.f3019e;
                    Object[] objArr = c0959b.f3018d;
                    if (it.hasNext()) {
                    }
                    z6 = z5;
                }
            }
        } else if (i11 != 1) {
            if (i11 == 2) {
            } else if (i11 == 3) {
                i7 = this.f3025i;
                i6 = this.f3024h;
                it = this.f3023g;
                c0959b = (C0959B) this.f3022f;
                AbstractC1784a.m3205S(obj);
                c0959b.m1975b(i12);
                while (true) {
                    int i152 = c0959b.f3019e;
                    Object[] objArr2 = c0959b.f3018d;
                    if (it.hasNext()) {
                        i10 = i6;
                        c0959b2 = c0959b;
                        break;
                    }
                    Object next = it.next();
                    z5 = z6;
                    if (c0959b.mo1974a() == i152) {
                        throw new IllegalStateException("ring buffer is full");
                    }
                    int i16 = c0959b.f3020f;
                    int i17 = c0959b.f3021g;
                    objArr2[(i16 + i17) % i152] = next;
                    c0959b.f3021g = i17 + 1;
                    if (c0959b.mo1974a() == i152) {
                        if (c0959b.f3021g >= i13) {
                            ArrayList arrayList2 = new ArrayList(c0959b);
                            this.f3027k = c1906h;
                            this.f3022f = c0959b;
                            this.f3023g = it;
                            this.f3024h = i6;
                            this.f3025i = i7;
                            this.f3026j = 3;
                            c1906h.m3391b(this, arrayList2);
                            return enumC1152a;
                        }
                        int i18 = i152 + (i152 >> 1) + 1;
                        if (i18 > i13) {
                            i18 = i13;
                        }
                        if (c0959b.f3020f == 0) {
                            array = Arrays.copyOf(objArr2, i18);
                            AbstractC1665j.m2984d(array, "copyOf(...)");
                        } else {
                            array = c0959b.toArray(new Object[i18]);
                        }
                        c0959b = new C0959B(c0959b.f3021g, array);
                    }
                    z6 = z5;
                }
            } else if (i11 == 4) {
                i7 = this.f3025i;
                i10 = this.f3024h;
                c0959b2 = (C0959B) this.f3022f;
                AbstractC1784a.m3205S(obj);
                c0959b2.m1975b(i12);
                if (c0959b2.f3021g > i12) {
                    ArrayList arrayList3 = new ArrayList(c0959b2);
                    this.f3027k = c1906h;
                    this.f3022f = c0959b2;
                    this.f3023g = null;
                    this.f3024h = i10;
                    this.f3025i = i7;
                    this.f3026j = 4;
                    c1906h.m3391b(this, arrayList3);
                    return enumC1152a;
                }
                if (!c0959b2.isEmpty()) {
                    this.f3027k = null;
                    this.f3022f = null;
                    this.f3023g = null;
                    this.f3024h = i10;
                    this.f3025i = i7;
                    this.f3026j = 5;
                    c1906h.m3391b(this, c0959b2);
                    return enumC1152a;
                }
            } else {
                if (i11 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            AbstractC1784a.m3205S(obj);
        } else {
            i9 = this.f3025i;
            i8 = this.f3024h;
            it2 = this.f3023g;
            AbstractC1784a.m3205S(obj);
            arrayList = new ArrayList(i13);
            i5 = i9;
            while (it2.hasNext()) {
                Object next2 = it2.next();
                if (i9 > 0) {
                    i9--;
                } else {
                    arrayList.add(next2);
                    if (arrayList.size() == i13) {
                        this.f3027k = c1906h;
                        this.f3022f = arrayList;
                        this.f3023g = it2;
                        this.f3024h = i8;
                        this.f3025i = i5;
                        this.f3026j = 1;
                        c1906h.m3391b(this, arrayList);
                        return enumC1152a;
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                this.f3027k = null;
                this.f3022f = null;
                this.f3023g = null;
                this.f3024h = i8;
                this.f3025i = i5;
                this.f3026j = 2;
                c1906h.m3391b(this, arrayList);
                return enumC1152a;
            }
        }
        return C0891q.f2780a;
    }
}
