package kotlinx.io;

import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference0Impl;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class SourcesJvmKt$asByteChannel$isClosed$1 extends MutablePropertyReference0Impl {
    public SourcesJvmKt$asByteChannel$isClosed$1(Object obj) {
        super(obj, C5471.class, "closed", "getClosed()Z", 0);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.jvm.internal.MutablePropertyReference0
    public Object get() {
        return Boolean.valueOf(((C5471) this.receiver).f15131);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.jvm.internal.MutablePropertyReference0
    public void set(Object obj) {
        ((C5471) this.receiver).f15131 = ((Boolean) obj).booleanValue();
    }
}
