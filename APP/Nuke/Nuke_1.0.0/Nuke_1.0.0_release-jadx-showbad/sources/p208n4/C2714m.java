package p208n4;

import java.util.RandomAccess;
import p061L2.AbstractC0965e;

/* JADX INFO: renamed from: n4.m */
/* JADX INFO: loaded from: classes.dex */
public final class C2714m extends AbstractC0965e implements RandomAccess {

    /* JADX INFO: renamed from: d */
    public final C2709h[] f8645d;

    /* JADX INFO: renamed from: e */
    public final int[] f8646e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2714m(C2709h[] c2709hArr, int[] iArr) {
        this.f8645d = c2709hArr;
        this.f8646e = iArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p061L2.AbstractC0961a
    /* JADX INFO: renamed from: a */
    public final int mo1974a() {
        return this.f8645d.length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p061L2.AbstractC0961a, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C2709h) {
            return super.contains((C2709h) obj);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object get(int i5) {
        return this.f8645d[i5];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p061L2.AbstractC0965e, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C2709h) {
            return super.indexOf((C2709h) obj);
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p061L2.AbstractC0965e, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C2709h) {
            return super.lastIndexOf((C2709h) obj);
        }
        return -1;
    }
}
