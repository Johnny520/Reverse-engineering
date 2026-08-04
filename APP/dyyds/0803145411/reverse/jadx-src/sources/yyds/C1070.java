package yyds;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: yyds.ᛵᛴᛵᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1070 implements Iterator, InterfaceC0527 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public boolean f4916;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f4917;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public int f4918;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ int f4919;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public int f4920;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1070(C1505 c1505, int i) {
        this(c1505.f4500);
        this.f4919 = i;
        switch (i) {
            case 1:
                this.f4917 = c1505;
                this(c1505.f4500);
                break;
            default:
                this.f4917 = c1505;
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4920 < this.f4918;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objM2173;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f4920;
        int i2 = this.f4919;
        Object obj = this.f4917;
        switch (i2) {
            case 0:
                objM2173 = ((C1505) obj).m2173(i);
                break;
            case 1:
                objM2173 = ((C1505) obj).m2171(i);
                break;
            default:
                objM2173 = ((C1970) obj).f9888[i];
                break;
        }
        this.f4920++;
        this.f4916 = true;
        return objM2173;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f4916) {
            C0188.m800("Call next() before removing an element.");
            return;
        }
        int i = this.f4920 - 1;
        this.f4920 = i;
        int i2 = this.f4919;
        Object obj = this.f4917;
        switch (i2) {
            case 0:
                ((C1505) obj).mo1163(i);
                break;
            case 1:
                ((C1505) obj).mo1163(i);
                break;
            default:
                ((C1970) obj).m3802(i);
                break;
        }
        this.f4918--;
        this.f4916 = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1070(C1970 c1970) {
        this(c1970.f9886);
        this.f4919 = 2;
        this.f4917 = c1970;
    }

    public C1070(int i) {
        this.f4918 = i;
    }
}
