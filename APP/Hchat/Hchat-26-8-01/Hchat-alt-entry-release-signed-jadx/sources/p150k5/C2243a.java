package p150k5;

import androidx.lifecycle.C0119x;
import java.util.AbstractSet;
import java.util.Iterator;
import p207o5.C3052g;

/* JADX INFO: renamed from: k5.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2243a extends AbstractSet {

    /* JADX INFO: renamed from: g */
    public final C0119x f7435g;

    /* JADX INFO: renamed from: h */
    public final int f7436h;

    /* JADX INFO: renamed from: i */
    public final int f7437i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f7438j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Comparable f7439k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2243a(Comparable comparable, C0119x c0119x, int i9, int i10, int i11) {
        this.f7438j = i11;
        this.f7439k = comparable;
        this.f7435g = c0119x;
        this.f7436h = i9;
        this.f7437i = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C3052g(this, this.f7435g, this.f7436h, this.f7437i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f7437i;
    }
}
