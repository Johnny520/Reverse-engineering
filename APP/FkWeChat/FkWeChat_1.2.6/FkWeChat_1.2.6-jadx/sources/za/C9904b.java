package za;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p185m8.AbstractC5068b1;
import p185m8.AbstractC5070c0;
import p185m8.AbstractC5106t;
import p185m8.AbstractC5114x;
import p213oa.C5695f;
import p229p9.InterfaceC5993d0;
import p229p9.InterfaceC6004h;
import p229p9.InterfaceC6007i;
import p230pb.AbstractC6059a;
import p244qb.C6379j;
import p342x9.InterfaceC9468b;
import za.InterfaceC9913k;

/* JADX INFO: renamed from: za.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9904b implements InterfaceC9913k {

    /* JADX INFO: renamed from: d */
    public static final a f33389d = new a(null);

    /* JADX INFO: renamed from: b */
    public final String f33390b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC9913k[] f33391c;

    public C9904b(String str, InterfaceC9913k[] interfaceC9913kArr) {
        this.f33390b = str;
        this.f33391c = interfaceC9913kArr;
    }

    @Override // za.InterfaceC9913k
    /* JADX INFO: renamed from: a */
    public Collection mo5513a(C5695f c5695f, InterfaceC9468b interfaceC9468b) {
        c5695f.getClass();
        interfaceC9468b.getClass();
        InterfaceC9913k[] interfaceC9913kArr = this.f33391c;
        int length = interfaceC9913kArr.length;
        if (length == 0) {
            return AbstractC5114x.m20800o();
        }
        if (length == 1) {
            return interfaceC9913kArr[0].mo5513a(c5695f, interfaceC9468b);
        }
        Collection collectionM24122a = null;
        for (InterfaceC9913k interfaceC9913k : interfaceC9913kArr) {
            collectionM24122a = AbstractC6059a.m24122a(collectionM24122a, interfaceC9913k.mo5513a(c5695f, interfaceC9468b));
        }
        return collectionM24122a == null ? AbstractC5068b1.m20483e() : collectionM24122a;
    }

    @Override // za.InterfaceC9913k
    /* JADX INFO: renamed from: b */
    public Set mo5514b() {
        InterfaceC9913k[] interfaceC9913kArr = this.f33391c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC9913k interfaceC9913k : interfaceC9913kArr) {
            AbstractC5070c0.m20492E(linkedHashSet, interfaceC9913k.mo5514b());
        }
        return linkedHashSet;
    }

    @Override // za.InterfaceC9913k
    /* JADX INFO: renamed from: c */
    public Collection mo5515c(C5695f c5695f, InterfaceC9468b interfaceC9468b) {
        c5695f.getClass();
        interfaceC9468b.getClass();
        InterfaceC9913k[] interfaceC9913kArr = this.f33391c;
        int length = interfaceC9913kArr.length;
        if (length == 0) {
            return AbstractC5114x.m20800o();
        }
        if (length == 1) {
            return interfaceC9913kArr[0].mo5515c(c5695f, interfaceC9468b);
        }
        Collection collectionM24122a = null;
        for (InterfaceC9913k interfaceC9913k : interfaceC9913kArr) {
            collectionM24122a = AbstractC6059a.m24122a(collectionM24122a, interfaceC9913k.mo5515c(c5695f, interfaceC9468b));
        }
        return collectionM24122a == null ? AbstractC5068b1.m20483e() : collectionM24122a;
    }

    @Override // za.InterfaceC9913k
    /* JADX INFO: renamed from: d */
    public Set mo5516d() {
        InterfaceC9913k[] interfaceC9913kArr = this.f33391c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC9913k interfaceC9913k : interfaceC9913kArr) {
            AbstractC5070c0.m20492E(linkedHashSet, interfaceC9913k.mo5516d());
        }
        return linkedHashSet;
    }

    @Override // za.InterfaceC9913k
    /* JADX INFO: renamed from: e */
    public Set mo5517e() {
        return AbstractC9915m.m38460a(AbstractC5106t.m20692L(this.f33391c));
    }

    @Override // za.InterfaceC9916n
    /* JADX INFO: renamed from: f */
    public InterfaceC6004h mo5518f(C5695f c5695f, InterfaceC9468b interfaceC9468b) {
        c5695f.getClass();
        interfaceC9468b.getClass();
        InterfaceC6004h interfaceC6004h = null;
        for (InterfaceC9913k interfaceC9913k : this.f33391c) {
            InterfaceC6004h interfaceC6004hMo5518f = interfaceC9913k.mo5518f(c5695f, interfaceC9468b);
            if (interfaceC6004hMo5518f != null) {
                if (!(interfaceC6004hMo5518f instanceof InterfaceC6007i) || !((InterfaceC5993d0) interfaceC6004hMo5518f).mo5576R()) {
                    return interfaceC6004hMo5518f;
                }
                if (interfaceC6004h == null) {
                    interfaceC6004h = interfaceC6004hMo5518f;
                }
            }
        }
        return interfaceC6004h;
    }

    @Override // za.InterfaceC9916n
    /* JADX INFO: renamed from: g */
    public Collection mo5519g(C9906d c9906d, InterfaceC0184l interfaceC0184l) {
        c9906d.getClass();
        interfaceC0184l.getClass();
        InterfaceC9913k[] interfaceC9913kArr = this.f33391c;
        int length = interfaceC9913kArr.length;
        if (length == 0) {
            return AbstractC5114x.m20800o();
        }
        if (length == 1) {
            return interfaceC9913kArr[0].mo5519g(c9906d, interfaceC0184l);
        }
        Collection collectionM24122a = null;
        for (InterfaceC9913k interfaceC9913k : interfaceC9913kArr) {
            collectionM24122a = AbstractC6059a.m24122a(collectionM24122a, interfaceC9913k.mo5519g(c9906d, interfaceC0184l));
        }
        return collectionM24122a == null ? AbstractC5068b1.m20483e() : collectionM24122a;
    }

    public String toString() {
        return this.f33390b;
    }

    /* JADX INFO: renamed from: za.b$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC9913k m38420a(String str, Iterable iterable) {
            str.getClass();
            iterable.getClass();
            C6379j c6379j = new C6379j();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                InterfaceC9913k interfaceC9913k = (InterfaceC9913k) it.next();
                if (interfaceC9913k != InterfaceC9913k.b.f33436b) {
                    if (interfaceC9913k instanceof C9904b) {
                        AbstractC5070c0.m20493F(c6379j, ((C9904b) interfaceC9913k).f33391c);
                    } else {
                        c6379j.add(interfaceC9913k);
                    }
                }
            }
            return m38421b(str, c6379j);
        }

        /* JADX INFO: renamed from: b */
        public final InterfaceC9913k m38421b(String str, List list) {
            str.getClass();
            list.getClass();
            int size = list.size();
            return size != 0 ? size != 1 ? new C9904b(str, (InterfaceC9913k[]) list.toArray(new InterfaceC9913k[0]), null) : (InterfaceC9913k) list.get(0) : InterfaceC9913k.b.f33436b;
        }

        public a() {
        }
    }

    public /* synthetic */ C9904b(String str, InterfaceC9913k[] interfaceC9913kArr, AbstractC1043k abstractC1043k) {
        this(str, interfaceC9913kArr);
    }
}
