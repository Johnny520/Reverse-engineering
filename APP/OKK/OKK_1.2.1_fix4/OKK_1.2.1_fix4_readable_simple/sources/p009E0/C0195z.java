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
    public final /* synthetic */ int f406a;

    /* JADX INFO: renamed from: b */
    public final Object f407b;

    public C0195z(List r2) {
        this.f406a = 0;
        this.f407b = r2;
    }

    @Override // p009E0.AbstractC0175f
    /* JADX INFO: renamed from: a */
    public final int mo516a() {
        switch(this.f406a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return ((C0419d) this.f407b).f932a.groupCount() + 1;
    L7:
        return ((List) this.f407b).size();
    }

    @Override // p009E0.AbstractC0175f, java.util.List, java.util.Collection
    public /* bridge */ boolean contains(Object r2) {
        switch(this.f406a) {
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return super.contains(r2);
    L7:
        if ((r2 instanceof String) == true) goto L10;
        return false;
    L10:
        return super.contains((String) r2);
    }

    @Override // java.util.List
    public final Object get(int r6) {
        switch(this.f406a) {
            case 0: goto L8;
            default: goto L4;
        };
    L4:
        String r62 = ((C0419d) this.f407b).f932a.group(r6);
        if (r62 != null) goto L15;
        return "";
    L15:
        return r62;
    L8:
        if (r6 < 0) goto L14;
        if (r6 > AbstractC0182m.m555g0(this)) goto L14;
        return ((List) this.f407b).get(AbstractC0182m.m555g0(this) - r6);
    L14:
        throw new IndexOutOfBoundsException("Element index " + r6 + " must be in range [" + new C0340c(0, AbstractC0182m.m555g0(this), 1) + "].");
    }

    @Override // p009E0.AbstractC0175f, java.util.List
    public /* bridge */ int indexOf(Object r2) {
        switch(this.f406a) {
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return super.indexOf(r2);
    L7:
        if ((r2 instanceof String) == true) goto L10;
        return -1;
    L10:
        return super.indexOf((String) r2);
    }

    @Override // p009E0.AbstractC0175f, java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        switch(this.f406a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return super.iterator();
    L7:
        return new C0194y(this, 0);
    }

    @Override // p009E0.AbstractC0175f, java.util.List
    public /* bridge */ int lastIndexOf(Object r2) {
        switch(this.f406a) {
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return super.lastIndexOf(r2);
    L7:
        if ((r2 instanceof String) == true) goto L10;
        return -1;
    L10:
        return super.lastIndexOf((String) r2);
    }

    @Override // p009E0.AbstractC0175f, java.util.List
    public ListIterator listIterator() {
        switch(this.f406a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return super.listIterator();
    L7:
        return new C0194y(this, 0);
    }

    public C0195z(C0419d r2) {
        this.f406a = 1;
        this.f407b = r2;
    }

    @Override // p009E0.AbstractC0175f, java.util.List
    public ListIterator listIterator(int r2) {
        switch(this.f406a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return super.listIterator(r2);
    L7:
        return new C0194y(this, r2);
    }
}
