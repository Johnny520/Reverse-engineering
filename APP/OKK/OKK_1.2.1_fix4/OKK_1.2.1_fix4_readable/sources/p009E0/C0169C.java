package p009E0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import p001A0.AbstractC0040p;
import p007D0.C0146l;
import p014H0.InterfaceC0202a;
import p016I0.EnumC0209a;
import p018J0.AbstractC0237g;
import p029P0.InterfaceC0290p;
import p031Q0.AbstractC0307g;
import p040V0.C0406i;

/* JADX INFO: renamed from: E0.C */
/* JADX INFO: loaded from: classes.dex */
public final class C0169C extends AbstractC0237g implements InterfaceC0290p {

    /* JADX INFO: renamed from: c */
    public Object f370c;

    /* JADX INFO: renamed from: d */
    public Iterator f371d;

    /* JADX INFO: renamed from: e */
    public int f372e;

    /* JADX INFO: renamed from: f */
    public int f373f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f374g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f375h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f376i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Iterator f377j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ boolean f378k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ boolean f379l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0169C(int i2, int i3, Iterator it, boolean z2, boolean z3, InterfaceC0202a interfaceC0202a) {
        super(interfaceC0202a);
        this.f375h = i2;
        this.f376i = i3;
        this.f377j = it;
        this.f378k = z2;
        this.f379l = z3;
    }

    @Override // p029P0.InterfaceC0290p
    /* JADX INFO: renamed from: b */
    public final Object mo518b(Object obj, Object obj2) {
        return ((C0169C) mo519d((C0406i) obj, (InterfaceC0202a) obj2)).mo520f(C0146l.f339a);
    }

    @Override // p018J0.AbstractC0231a
    /* JADX INFO: renamed from: d */
    public final InterfaceC0202a mo519d(Object obj, InterfaceC0202a interfaceC0202a) {
        C0169C c0169c = new C0169C(this.f375h, this.f376i, this.f377j, this.f378k, this.f379l, interfaceC0202a);
        c0169c.f374g = obj;
        return c0169c;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015d  */
    @Override // p018J0.AbstractC0231a
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo520f(Object obj) throws Throwable {
        int i2;
        C0168B c0168b;
        C0406i c0406i;
        Iterator it;
        ArrayList arrayList;
        C0406i c0406i2;
        int i3;
        Iterator it2;
        C0168B c0168b2;
        C0406i c0406i3;
        Object[] array;
        EnumC0209a enumC0209a = EnumC0209a.f425a;
        int i4 = this.f373f;
        boolean z2 = this.f379l;
        boolean z3 = this.f378k;
        int i5 = this.f376i;
        int i6 = this.f375h;
        if (i4 == 0) {
            AbstractC0040p.m97b0(obj);
            C0406i c0406i4 = (C0406i) this.f374g;
            int i7 = i6 <= 1024 ? i6 : 1024;
            i2 = i5 - i6;
            Iterator it3 = this.f377j;
            if (i2 >= 0) {
                arrayList = new ArrayList(i7);
                c0406i2 = c0406i4;
                i3 = 0;
                it2 = it3;
                while (it2.hasNext()) {
                }
                if (!arrayList.isEmpty()) {
                    this.f374g = null;
                    this.f370c = null;
                    this.f371d = null;
                    this.f373f = 2;
                    c0406i2.m991d(arrayList, this);
                    return enumC0209a;
                }
            } else {
                c0168b = new C0168B(0, new Object[i7]);
                c0406i = c0406i4;
                it = it3;
                while (it.hasNext()) {
                }
                if (z2) {
                }
            }
        } else if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3) {
                    it = this.f371d;
                    c0168b = (C0168B) this.f370c;
                    c0406i = (C0406i) this.f374g;
                    AbstractC0040p.m97b0(obj);
                    c0168b.m517b(i5);
                    while (it.hasNext()) {
                        Object next = it.next();
                        int iMo516a = c0168b.mo516a();
                        int i8 = c0168b.f367b;
                        if (iMo516a == i8) {
                            throw new IllegalStateException("ring buffer is full");
                        }
                        int i9 = c0168b.f368c;
                        int i10 = c0168b.f369d;
                        Object[] objArr = c0168b.f366a;
                        objArr[(i9 + i10) % i8] = next;
                        c0168b.f369d = i10 + 1;
                        if (c0168b.mo516a() == i8) {
                            if (c0168b.f369d >= i6) {
                                Object arrayList2 = z3 ? c0168b : new ArrayList(c0168b);
                                this.f374g = c0406i;
                                this.f370c = c0168b;
                                this.f371d = it;
                                this.f373f = 3;
                                c0406i.m991d(arrayList2, this);
                                return enumC0209a;
                            }
                            int i11 = i8 + (i8 >> 1) + 1;
                            if (i11 > i6) {
                                i11 = i6;
                            }
                            if (c0168b.f368c == 0) {
                                array = Arrays.copyOf(objArr, i11);
                                AbstractC0307g.m702d(array, "copyOf(...)");
                            } else {
                                array = c0168b.toArray(new Object[i11]);
                            }
                            c0168b = new C0168B(c0168b.f369d, array);
                        }
                    }
                    if (z2) {
                        c0168b2 = c0168b;
                        c0406i3 = c0406i;
                        if (c0168b2.f369d <= i5) {
                        }
                    }
                } else if (i4 == 4) {
                    c0168b2 = (C0168B) this.f370c;
                    c0406i3 = (C0406i) this.f374g;
                    AbstractC0040p.m97b0(obj);
                    c0168b2.m517b(i5);
                    if (c0168b2.f369d <= i5) {
                        Object arrayList3 = z3 ? c0168b2 : new ArrayList(c0168b2);
                        this.f374g = c0406i3;
                        this.f370c = c0168b2;
                        this.f371d = null;
                        this.f373f = 4;
                        c0406i3.m991d(arrayList3, this);
                        return enumC0209a;
                    }
                    if (true ^ c0168b2.isEmpty()) {
                        this.f374g = null;
                        this.f370c = null;
                        this.f371d = null;
                        this.f373f = 5;
                        c0406i3.m991d(c0168b2, this);
                        return enumC0209a;
                    }
                } else if (i4 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            AbstractC0040p.m97b0(obj);
        } else {
            i3 = this.f372e;
            it2 = this.f371d;
            arrayList = (ArrayList) this.f370c;
            c0406i2 = (C0406i) this.f374g;
            AbstractC0040p.m97b0(obj);
            if (z3) {
                arrayList.clear();
            } else {
                arrayList = new ArrayList(i6);
            }
            i2 = i3;
            while (it2.hasNext()) {
                Object next2 = it2.next();
                if (i3 > 0) {
                    i3--;
                } else {
                    arrayList.add(next2);
                    if (arrayList.size() == i6) {
                        this.f374g = c0406i2;
                        this.f370c = arrayList;
                        this.f371d = it2;
                        this.f372e = i2;
                        this.f373f = 1;
                        c0406i2.m991d(arrayList, this);
                        return enumC0209a;
                    }
                }
            }
            if ((!arrayList.isEmpty()) && (z2 || arrayList.size() == i6)) {
                this.f374g = null;
                this.f370c = null;
                this.f371d = null;
                this.f373f = 2;
                c0406i2.m991d(arrayList, this);
                return enumC0209a;
            }
        }
        return C0146l.f339a;
    }
}
