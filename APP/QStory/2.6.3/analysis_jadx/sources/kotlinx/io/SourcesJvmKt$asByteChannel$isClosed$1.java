package kotlinx.io;

import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference0Impl;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class SourcesJvmKt$asByteChannel$isClosed$1 extends MutablePropertyReference0Impl {
    public SourcesJvmKt$asByteChannel$isClosed$1(Object obj) {
        super(obj, C5472.class, "closed", "getClosed()Z", 0);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.jvm.internal.MutablePropertyReference0
    public Object get() {
        return Boolean.valueOf(((C5472) this.receiver).f15131);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.jvm.internal.MutablePropertyReference0
    public void set(Object obj) {
        ((C5472) this.receiver).f15131 = ((Boolean) obj).booleanValue();
    }
}
