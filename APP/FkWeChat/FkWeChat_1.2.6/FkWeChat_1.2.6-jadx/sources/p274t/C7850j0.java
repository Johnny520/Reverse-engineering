package p274t;

import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1043k;
import p166l2.AbstractC4606z0;

/* JADX INFO: renamed from: t.j0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m16757d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!"}, m16758d2 = {"Lt/j0;", "Ll2/z0;", "Lt/l0;", "Lt/h0;", "direction", _UrlKt.FRAGMENT_ENCODE_SET, "fraction", _UrlKt.FRAGMENT_ENCODE_SET, "inspectorName", "<init>", "(Lt/h0;FLjava/lang/String;)V", "m", "()Lt/l0;", "node", "Ll8/i0;", "n", "(Lt/l0;)V", _UrlKt.FRAGMENT_ENCODE_SET, "other", _UrlKt.FRAGMENT_ENCODE_SET, "equals", "(Ljava/lang/Object;)Z", _UrlKt.FRAGMENT_ENCODE_SET, "hashCode", "()I", "b", "Lt/h0;", "c", "F", "d", "Ljava/lang/String;", "e", "a", "foundation-layout"}, m16759k = 1, m16760mv = {2, 0, 0}, m16762xi = 48)
final class C7850j0 extends AbstractC4606z0 {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final EnumC7840h0 direction;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final float fraction;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final String inspectorName;

    public C7850j0(EnumC7840h0 enumC7840h0, float f10, String str) {
        this.direction = enumC7840h0;
        this.fraction = f10;
        this.inspectorName = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C7850j0)) {
            return false;
        }
        C7850j0 c7850j0 = (C7850j0) other;
        return this.direction == c7850j0.direction && this.fraction == c7850j0.fraction;
    }

    public int hashCode() {
        return (this.direction.hashCode() * 31) + Float.hashCode(this.fraction);
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C7860l0 mo1191j() {
        return new C7860l0(this.direction, this.fraction);
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo1192k(C7860l0 node) {
        node.m30411H2(this.direction);
        node.m30412I2(this.fraction);
    }

    /* JADX INFO: renamed from: t.j0$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C7850j0 m30399a(float f10) {
            return new C7850j0(EnumC7840h0.f26150q, f10, "fillMaxHeight");
        }

        /* JADX INFO: renamed from: b */
        public final C7850j0 m30400b(float f10) {
            return new C7850j0(EnumC7840h0.f26152s, f10, "fillMaxSize");
        }

        /* JADX INFO: renamed from: c */
        public final C7850j0 m30401c(float f10) {
            return new C7850j0(EnumC7840h0.f26151r, f10, "fillMaxWidth");
        }

        public Companion() {
        }
    }
}
