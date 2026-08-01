package p374zb;

import java.util.Arrays;
import java.util.ListIterator;
import p024b9.AbstractC1043k;
import p052dc.AbstractC1943a;
import p052dc.C1946d;
import p185m8.AbstractC5106t;
import p360yb.InterfaceC9660c;
import p360yb.InterfaceC9663f;

/* JADX INFO: renamed from: zb.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9932f extends AbstractC9928b implements InterfaceC9660c {

    /* JADX INFO: renamed from: s */
    public static final a f33466s = new a(null);

    /* JADX INFO: renamed from: t */
    public static final C9932f f33467t = new C9932f(new Object[0]);

    /* JADX INFO: renamed from: r */
    public final Object[] f33468r;

    public C9932f(Object[] objArr) {
        objArr.getClass();
        this.f33468r = objArr;
        AbstractC1943a.m7049a(objArr.length <= 32);
    }

    @Override // java.util.Collection, java.util.List, p360yb.InterfaceC9663f
    public InterfaceC9663f add(Object obj) {
        if (size() >= 32) {
            return new C9930d(this.f33468r, AbstractC9934h.m38503c(obj), size() + 1, 0);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f33468r, size() + 1);
        objArrCopyOf[size()] = obj;
        return new C9932f(objArrCopyOf);
    }

    @Override // p185m8.AbstractC5066b
    /* JADX INFO: renamed from: c */
    public int mo31c() {
        return this.f33468r.length;
    }

    @Override // p185m8.AbstractC5078f, java.util.List
    public Object get(int i10) {
        C1946d.m7053a(i10, size());
        return this.f33468r[i10];
    }

    @Override // p185m8.AbstractC5078f, java.util.List
    public int indexOf(Object obj) {
        return AbstractC5106t.m20746m0(this.f33468r, obj);
    }

    @Override // p185m8.AbstractC5078f, java.util.List
    public int lastIndexOf(Object obj) {
        return AbstractC5106t.m20757x0(this.f33468r, obj);
    }

    @Override // p185m8.AbstractC5078f, java.util.List
    public ListIterator listIterator(int i10) {
        C1946d.m7054b(i10, size());
        return new C9929c(this.f33468r, i10, size());
    }

    /* JADX INFO: renamed from: zb.f$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C9932f m38497a() {
            return C9932f.f33467t;
        }

        public a() {
        }
    }
}
