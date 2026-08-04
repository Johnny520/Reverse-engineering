package yyds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: yyds.ᲁᲀᛷᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2316 extends AbstractC0171 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public int f11355;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public /* synthetic */ Object f11356;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public Iterator f11357;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public int f11358;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Iterator f11359;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public int f11360;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public Object f11361;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2316(Iterator it, InterfaceC0274 interfaceC0274) {
        super(interfaceC0274);
        this.f11359 = it;
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    public final Object mo474(Object obj) throws Throwable {
        int i;
        int i2;
        int i3;
        ArrayList arrayList;
        Iterator it;
        int i4;
        int i5;
        int i6;
        C0603 c0603;
        C1728 c1728 = (C1728) this.f11356;
        int i7 = this.f11355;
        boolean z = true;
        EnumC1765 enumC1765 = EnumC1765.f8858;
        if (i7 == 0) {
            i = 1;
            AbstractC1544.m3189(obj);
            i2 = 0;
            i3 = 0;
            arrayList = new ArrayList(2);
            it = this.f11359;
            i4 = 2;
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 == 3) {
                        i5 = this.f11358;
                        int i8 = this.f11360;
                        Iterator it2 = this.f11357;
                        C0603 c06032 = (C0603) this.f11361;
                        AbstractC1544.m3189(obj);
                        c06032.m1491();
                        while (true) {
                            int i9 = c06032.f2866;
                            Object[] objArr = c06032.f2864;
                            if (!it2.hasNext()) {
                                i6 = i8;
                                c0603 = c06032;
                                break;
                            }
                            Object next = it2.next();
                            boolean z2 = z;
                            if (c06032.mo927() == i9) {
                                C0188.m800("ring buffer is full");
                                return null;
                            }
                            int i10 = c06032.f2863;
                            int i11 = c06032.f2865;
                            objArr[(i10 + i11) % i9] = next;
                            c06032.f2865 = i11 + 1;
                            if (c06032.mo927() == i9) {
                                if (c06032.f2865 >= 2) {
                                    ArrayList arrayList2 = new ArrayList(c06032);
                                    this.f11356 = c1728;
                                    this.f11361 = c06032;
                                    this.f11357 = it2;
                                    this.f11360 = i8;
                                    this.f11358 = i5;
                                    this.f11355 = 3;
                                    c1728.m3459(arrayList2, this);
                                    return enumC1765;
                                }
                                int i12 = i9 + (i9 >> 1) + 1;
                                if (i12 > 2) {
                                    i12 = 2;
                                }
                                c06032 = new C0603(c06032.f2865, c06032.f2863 == 0 ? Arrays.copyOf(objArr, i12) : c06032.toArray(new Object[i12]));
                            }
                            z = z2;
                        }
                    } else if (i7 == 4) {
                        i5 = this.f11358;
                        i6 = this.f11360;
                        c0603 = (C0603) this.f11361;
                        AbstractC1544.m3189(obj);
                        c0603.m1491();
                    } else {
                        if (i7 != 5) {
                            C0188.m800("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    if (c0603.f2865 > 2) {
                        ArrayList arrayList3 = new ArrayList(c0603);
                        this.f11356 = c1728;
                        this.f11361 = c0603;
                        this.f11357 = null;
                        this.f11360 = i6;
                        this.f11358 = i5;
                        this.f11355 = 4;
                        c1728.m3459(arrayList3, this);
                        return enumC1765;
                    }
                    if (!c0603.isEmpty()) {
                        this.f11356 = null;
                        this.f11361 = null;
                        this.f11357 = null;
                        this.f11360 = i6;
                        this.f11358 = i5;
                        this.f11355 = 5;
                        c1728.m3459(c0603, this);
                        return enumC1765;
                    }
                    return C2746.f13459;
                }
                AbstractC1544.m3189(obj);
                return C2746.f13459;
            }
            i = 1;
            i2 = this.f11358;
            int i13 = this.f11360;
            Iterator it3 = this.f11357;
            AbstractC1544.m3189(obj);
            arrayList = new ArrayList(2);
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
                if (arrayList.size() == 2) {
                    this.f11356 = c1728;
                    this.f11361 = arrayList;
                    this.f11357 = it;
                    this.f11360 = i4;
                    this.f11358 = i3;
                    this.f11355 = i;
                    c1728.m3459(arrayList, this);
                    return enumC1765;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.f11356 = null;
            this.f11361 = null;
            this.f11357 = null;
            this.f11360 = i4;
            this.f11358 = i3;
            this.f11355 = 2;
            c1728.m3459(arrayList, this);
            return enumC1765;
        }
        return C2746.f13459;
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final InterfaceC0274 mo630(Object obj, InterfaceC0274 interfaceC0274) {
        C2316 c2316 = new C2316(this.f11359, interfaceC0274);
        c2316.f11356 = obj;
        return c2316;
    }

    @Override // yyds.InterfaceC0477
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final Object mo511(Object obj, Object obj2) {
        return ((C2316) mo630((C1728) obj, (InterfaceC0274) obj2)).mo474(C2746.f13459);
    }
}
