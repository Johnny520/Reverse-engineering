package yyds;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: yyds.ᛳᛸᲀᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0658 extends AbstractC2242 implements Serializable {

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final C0658 f3147;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C0728 f3148;

    static {
        C0728 c0728 = C0728.f3395;
        f3147 = new C0658(C0728.f3395);
    }

    public C0658() {
        this(new C0728());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.f3148.m1671(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        this.f3148.m1672();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f3148.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f3148.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f3148.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C0728 c0728 = this.f3148;
        c0728.getClass();
        return new C0523(c0728, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C0728 c0728 = this.f3148;
        c0728.m1672();
        int iM1670 = c0728.m1670(obj);
        if (iM1670 < 0) {
            return false;
        }
        c0728.m1669(iM1670);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        this.f3148.m1672();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        this.f3148.m1672();
        return super.retainAll(collection);
    }

    @Override // yyds.AbstractC2242
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final int mo1576() {
        return this.f3148.f3403;
    }

    public C0658(C0728 c0728) {
        this.f3148 = c0728;
    }
}
