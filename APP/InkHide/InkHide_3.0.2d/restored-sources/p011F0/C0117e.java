package p011F0;

import java.util.RandomAccess;

/* JADX INFO: renamed from: F0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0117e extends AbstractC0118f implements RandomAccess {

    /* JADX INFO: renamed from: a */
    public final AbstractC0118f f416a;

    /* JADX INFO: renamed from: b */
    public final int f417b;

    /* JADX INFO: renamed from: c */
    public final int f418c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0117e(AbstractC0118f abstractC0118f, int i2, int i3) {
        this.f416a = abstractC0118f;
        this.f417b = i2;
        int iMo250a = abstractC0118f.mo250a();
        if (i2 < 0 || i3 > iMo250a) {
            throw new IndexOutOfBoundsException("fromIndex: " + i2 + ", toIndex: " + i3 + ", size: " + iMo250a);
        }
        if (i2 <= i3) {
            this.f418c = i3 - i2;
            return;
        }
        throw new IllegalArgumentException("fromIndex: " + i2 + " > toIndex: " + i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p011F0.AbstractC0118f
    /* JADX INFO: renamed from: a */
    public final int mo250a() {
        return this.f418c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object get(int i2) {
        int i3 = this.f418c;
        if (i2 >= 0 && i2 < i3) {
            return this.f416a.get(this.f417b + i2);
        }
        throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
    }
}
