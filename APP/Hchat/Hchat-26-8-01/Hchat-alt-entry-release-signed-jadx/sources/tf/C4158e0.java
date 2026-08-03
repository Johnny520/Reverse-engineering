package tf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import ng.AbstractC3014l;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p136j8.C2104o;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6043h;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: tf.e0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4158e0 extends AbstractC6043h implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public Object f13694g;

    /* JADX INFO: renamed from: h */
    public Iterator f13695h;

    /* JADX INFO: renamed from: i */
    public int f13696i;

    /* JADX INFO: renamed from: j */
    public int f13697j;

    /* JADX INFO: renamed from: k */
    public int f13698k;

    /* JADX INFO: renamed from: l */
    public /* synthetic */ Object f13699l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ int f13700m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int f13701n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Iterator f13702o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4158e0(int i9, int i10, Iterator it, InterfaceC5557c interfaceC5557c) {
        super(interfaceC5557c);
        this.f13700m = i9;
        this.f13701n = i10;
        this.f13702o = it;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        C4158e0 c4158e0 = new C4158e0(this.f13700m, this.f13701n, this.f13702o, interfaceC5557c);
        c4158e0.f13699l = obj;
        return c4158e0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        return ((C4158e0) create((AbstractC3014l) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0145 A[SYNTHETIC] */
    @Override // p370yf.AbstractC6036a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i9;
        int i10;
        int i11;
        Iterator it;
        C4154c0 c4154c0;
        ArrayList arrayList;
        int i12;
        Iterator it2;
        int i13;
        int i14;
        C4154c0 c4154c02;
        boolean z9;
        AbstractC3014l abstractC3014l = (AbstractC3014l) this.f13699l;
        int i15 = this.f13698k;
        int i16 = this.f13701n;
        boolean z10 = true;
        int i17 = this.f13700m;
        EnumC5799a enumC5799a = EnumC5799a.f23547g;
        if (i15 == 0) {
            AbstractC1089i.m2732I0(obj);
            int i18 = i17 <= 1024 ? i17 : 1024;
            i9 = i16 - i17;
            Iterator it3 = this.f13702o;
            if (i9 >= 0) {
                arrayList = new ArrayList(i18);
                i12 = i18;
                it2 = it3;
                i13 = 0;
                while (it2.hasNext()) {
                }
                if (!arrayList.isEmpty()) {
                }
            } else {
                C4154c0 c4154c03 = new C4154c0(0, new Object[i18]);
                i10 = i18;
                i11 = i9;
                it = it3;
                c4154c0 = c4154c03;
                while (true) {
                    int i19 = c4154c0.f13687h;
                    Object[] objArr = c4154c0.f13686g;
                    if (it.hasNext()) {
                    }
                    z10 = z9;
                }
            }
        } else if (i15 != 1) {
            if (i15 == 2) {
            } else if (i15 == 3) {
                i11 = this.f13697j;
                i10 = this.f13696i;
                it = this.f13695h;
                c4154c0 = (C4154c0) this.f13694g;
                AbstractC1089i.m2732I0(obj);
                c4154c0.m8349a(i16);
                while (true) {
                    int i192 = c4154c0.f13687h;
                    Object[] objArr2 = c4154c0.f13686g;
                    if (it.hasNext()) {
                        i14 = i10;
                        c4154c02 = c4154c0;
                        break;
                    }
                    Object next = it.next();
                    z9 = z10;
                    if (c4154c0.size() == i192) {
                        C2104o.m5276A("ring buffer is full");
                        return null;
                    }
                    objArr2[(c4154c0.size() + c4154c0.f13688i) % i192] = next;
                    c4154c0.f13689j = c4154c0.size() + 1;
                    if (c4154c0.size() == i192) {
                        if (c4154c0.size() >= i17) {
                            ArrayList arrayList2 = new ArrayList(c4154c0);
                            this.f13699l = abstractC3014l;
                            this.f13694g = c4154c0;
                            this.f13695h = it;
                            this.f13696i = i10;
                            this.f13697j = i11;
                            this.f13698k = 3;
                            abstractC3014l.mo6406a(arrayList2, this);
                            return enumC5799a;
                        }
                        int i20 = i192 + (i192 >> 1) + 1;
                        if (i20 > i17) {
                            i20 = i17;
                        }
                        c4154c0 = new C4154c0(c4154c0.size(), c4154c0.f13688i == 0 ? Arrays.copyOf(objArr2, i20) : c4154c0.toArray(new Object[i20]));
                    }
                    z10 = z9;
                }
            } else if (i15 == 4) {
                i11 = this.f13697j;
                i14 = this.f13696i;
                c4154c02 = (C4154c0) this.f13694g;
                AbstractC1089i.m2732I0(obj);
                c4154c02.m8349a(i16);
                if (c4154c02.size() > i16) {
                    ArrayList arrayList3 = new ArrayList(c4154c02);
                    this.f13699l = abstractC3014l;
                    this.f13694g = c4154c02;
                    this.f13695h = null;
                    this.f13696i = i14;
                    this.f13697j = i11;
                    this.f13698k = 4;
                    abstractC3014l.mo6406a(arrayList3, this);
                    return enumC5799a;
                }
                if (!c4154c02.isEmpty()) {
                    this.f13699l = null;
                    this.f13694g = null;
                    this.f13695h = null;
                    this.f13696i = i14;
                    this.f13697j = i11;
                    this.f13698k = 5;
                    abstractC3014l.mo6406a(c4154c02, this);
                    return enumC5799a;
                }
            } else {
                if (i15 != 5) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            AbstractC1089i.m2732I0(obj);
        } else {
            i13 = this.f13697j;
            i12 = this.f13696i;
            it2 = this.f13695h;
            AbstractC1089i.m2732I0(obj);
            arrayList = new ArrayList(i17);
            i9 = i13;
            while (it2.hasNext()) {
                Object next2 = it2.next();
                if (i13 > 0) {
                    i13--;
                } else {
                    arrayList.add(next2);
                    if (arrayList.size() == i17) {
                        this.f13699l = abstractC3014l;
                        this.f13694g = arrayList;
                        this.f13695h = it2;
                        this.f13696i = i12;
                        this.f13697j = i9;
                        this.f13698k = 1;
                        abstractC3014l.mo6406a(arrayList, this);
                        return enumC5799a;
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                this.f13699l = null;
                this.f13694g = null;
                this.f13695h = null;
                this.f13696i = i12;
                this.f13697j = i9;
                this.f13698k = 2;
                abstractC3014l.mo6406a(arrayList, this);
                return enumC5799a;
            }
        }
        return C3967n.f12976a;
    }
}
