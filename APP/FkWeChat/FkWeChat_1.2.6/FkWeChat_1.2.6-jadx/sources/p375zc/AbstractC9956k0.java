package p375zc;

import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1043k;
import p300uc.InterfaceC8647b;
import p300uc.InterfaceC8660n;

/* JADX INFO: renamed from: zc.k0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8660n(with = C9958l0.class)
@Metadata(m16757d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \r2\u00020\u0001:\u0001\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0006\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, m16758d2 = {"Lzc/k0;", "Lzc/l;", "<init>", "()V", _UrlKt.FRAGMENT_ENCODE_SET, "toString", "()Ljava/lang/String;", _UrlKt.FRAGMENT_ENCODE_SET, "c", "()Z", "isString", "a", "content", "Companion", "Lzc/a0;", "Lzc/e0;", "kotlinx-serialization-json"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public abstract class AbstractC9956k0 extends AbstractC9957l {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public AbstractC9956k0() {
        super(null);
    }

    /* JADX INFO: renamed from: a */
    public abstract String mo38506a();

    /* JADX INFO: renamed from: c */
    public abstract boolean mo38507c();

    public String toString() {
        return mo38506a();
    }

    /* JADX INFO: renamed from: zc.k0$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class Companion {
        public Companion() {
        }

        public final InterfaceC8647b serializer() {
            return C9958l0.f33543a;
        }

        public /* synthetic */ Companion(AbstractC1043k abstractC1043k) {
            this();
        }
    }

    public /* synthetic */ AbstractC9956k0(AbstractC1043k abstractC1043k) {
        this();
    }
}
