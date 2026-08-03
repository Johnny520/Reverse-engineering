package p009E0;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p036T0.C0340c;
import p042W0.C0419d;

/* JADX INFO: renamed from: E0.z */
/* JADX INFO: loaded from: classes.dex */
public final class C0195z extends AbstractC0175f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f406a = 1;

    /* JADX INFO: renamed from: b */
    public final Object f407b;

    public C0195z(List list) {
        this.f407b = list;
    }

    @Override // p009E0.AbstractC0175f
    /* JADX INFO: renamed from: a */
    public final int mo516a() {
        switch (this.f406a) {
            case 0:
                return ((List) this.f407b).size();
            default:
                return ((C0419d) this.f407b).f932a.groupCount() + 1;
        }
    }

    @Override // p009E0.AbstractC0175f, java.util.List, java.util.Collection
    public /* bridge */ boolean contains(Object obj) {
        switch (this.f406a) {
            case 1:
                if (obj instanceof String) {
                    return super.contains((String) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i2) {
        switch (this.f406a) {
            case 0:
                if (i2 >= 0 && i2 <= AbstractC0182m.m555g0(this)) {
                    return ((List) this.f407b).get(AbstractC0182m.m555g0(this) - i2);
                }
                throw new IndexOutOfBoundsException("Element index " + i2 + " must be in range [" + new C0340c(0, AbstractC0182m.m555g0(this), 1) + "].");
            default:
                String strGroup = ((C0419d) this.f407b).f932a.group(i2);
                return strGroup == null ? "" : strGroup;
        }
    }

    @Override // p009E0.AbstractC0175f, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.f406a) {
            case 1:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // p009E0.AbstractC0175f, java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        switch (this.f406a) {
            case 0:
                return new C0194y(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // p009E0.AbstractC0175f, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.f406a) {
            case 1:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // p009E0.AbstractC0175f, java.util.List
    public ListIterator listIterator() {
        switch (this.f406a) {
            case 0:
                return new C0194y(this, 0);
            default:
                return super.listIterator();
        }
    }

    public C0195z(C0419d c0419d) {
        this.f407b = c0419d;
    }

    @Override // p009E0.AbstractC0175f, java.util.List
    public ListIterator listIterator(int i2) {
        switch (this.f406a) {
            case 0:
                return new C0194y(this, i2);
            default:
                return super.listIterator(i2);
        }
    }
}
