package p218og;

import bsh.C0353j;
import java.util.Iterator;
import p114hg.InterfaceC1711a;

/* JADX INFO: renamed from: og.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3140d implements Iterator, InterfaceC1711a {

    /* JADX INFO: renamed from: g */
    public final CharSequence f10190g;

    /* JADX INFO: renamed from: h */
    public int f10191h;

    /* JADX INFO: renamed from: i */
    public int f10192i;

    /* JADX INFO: renamed from: j */
    public int f10193j;

    /* JADX INFO: renamed from: k */
    public int f10194k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3140d(CharSequence charSequence) {
        charSequence.getClass();
        this.f10190g = charSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i9;
        int i10;
        int i11 = this.f10191h;
        if (i11 != 0) {
            return i11 == 1;
        }
        if (this.f10194k < 0) {
            this.f10191h = 2;
            return false;
        }
        CharSequence charSequence = this.f10190g;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i12 = this.f10192i; i12 < length2; i12++) {
            char cCharAt = charSequence.charAt(i12);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i9 = (cCharAt == '\r' && (i10 = i12 + 1) < charSequence.length() && charSequence.charAt(i10) == '\n') ? 2 : 1;
                length = i12;
                this.f10191h = 1;
                this.f10194k = i9;
                this.f10193j = length;
                return true;
            }
        }
        i9 = -1;
        this.f10191h = 1;
        this.f10194k = i9;
        this.f10193j = length;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            C0353j.m1307e();
            return null;
        }
        this.f10191h = 0;
        int i9 = this.f10193j;
        int i10 = this.f10192i;
        this.f10192i = this.f10194k + i9;
        return this.f10190g.subSequence(i10, i9).toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
