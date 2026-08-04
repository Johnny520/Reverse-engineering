package yyds;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: yyds.ᲁᛱᛵᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2154 implements Iterator {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public int f10616;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f10617;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public C2580 f10618;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ C1583 f10619;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public C2580 f10620 = null;

    public C2154(C1583 c1583, int i) {
        this.f10617 = i;
        this.f10619 = c1583;
        this.f10618 = c1583.f8020.f12726;
        this.f10616 = c1583.f8023;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10618 != this.f10619.f8020;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.f10617) {
            case 1:
                return m4122().f12719;
            default:
                return m4121();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        C2580 c2580 = this.f10620;
        if (c2580 == null) {
            throw new IllegalStateException();
        }
        C1583 c1583 = this.f10619;
        c1583.m3248(c2580, true);
        this.f10620 = null;
        this.f10616 = c1583.f8023;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Object m4121() {
        return m4122();
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final C2580 m4122() {
        C2580 c2580 = this.f10618;
        C1583 c1583 = this.f10619;
        if (c2580 == c1583.f8020) {
            throw new NoSuchElementException();
        }
        if (c1583.f8023 != this.f10616) {
            throw new ConcurrentModificationException();
        }
        this.f10618 = c2580.f12726;
        this.f10620 = c2580;
        return c2580;
    }
}
