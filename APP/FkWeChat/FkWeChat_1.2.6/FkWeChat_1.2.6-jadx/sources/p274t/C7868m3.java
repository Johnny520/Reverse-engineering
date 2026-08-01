package p274t;

import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1043k;
import p121i3.C3179i;
import p166l2.AbstractC4606z0;

/* JADX INFO: renamed from: t.m3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m16757d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001c"}, m16758d2 = {"Lt/m3;", "Ll2/z0;", "Lt/o3;", "Li3/i;", "minWidth", "minHeight", "<init>", "(FFLb9/k;)V", "m", "()Lt/o3;", "node", "Ll8/i0;", "n", "(Lt/o3;)V", _UrlKt.FRAGMENT_ENCODE_SET, "other", _UrlKt.FRAGMENT_ENCODE_SET, "equals", "(Ljava/lang/Object;)Z", _UrlKt.FRAGMENT_ENCODE_SET, "hashCode", "()I", "b", "F", "getMinWidth-D9Ej5fM", "()F", "c", "getMinHeight-D9Ej5fM", "foundation-layout"}, m16759k = 1, m16760mv = {2, 0, 0}, m16762xi = 48)
final class C7868m3 extends AbstractC4606z0 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final float minWidth;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final float minHeight;

    public C7868m3(float f10, float f11) {
        this.minWidth = f10;
        this.minHeight = f11;
    }

    public boolean equals(Object other) {
        if (!(other instanceof C7868m3)) {
            return false;
        }
        C7868m3 c7868m3 = (C7868m3) other;
        return C3179i.m12005m(this.minWidth, c7868m3.minWidth) && C3179i.m12005m(this.minHeight, c7868m3.minHeight);
    }

    public int hashCode() {
        return (C3179i.m12006n(this.minWidth) * 31) + C3179i.m12006n(this.minHeight);
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C7878o3 mo1191j() {
        return new C7878o3(this.minWidth, this.minHeight, null);
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo1192k(C7878o3 node) {
        node.m30463I2(this.minWidth);
        node.m30462H2(this.minHeight);
    }

    public /* synthetic */ C7868m3(float f10, float f11, AbstractC1043k abstractC1043k) {
        this(f10, f11);
    }
}
