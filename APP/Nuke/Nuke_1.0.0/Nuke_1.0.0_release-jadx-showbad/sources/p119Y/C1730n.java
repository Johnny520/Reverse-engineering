package p119Y;

import me.dartcv.nuke.BuildConfig;

/* JADX INFO: renamed from: Y.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1730n extends AbstractC1729m {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f5984g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f5984g) {
            case 0:
                int i5 = this.f5983f;
                this.f5983f = i5 + 2;
                Object[] objArr = this.f5981d;
                return new C1717a(0, objArr[i5], objArr[i5 + 1]);
            case BuildConfig.VERSION_CODE /* 1 */:
                int i6 = this.f5983f;
                this.f5983f = i6 + 2;
                return this.f5981d[i6];
            default:
                int i7 = this.f5983f;
                this.f5983f = i7 + 2;
                return this.f5981d[i7 + 1];
        }
    }
}
