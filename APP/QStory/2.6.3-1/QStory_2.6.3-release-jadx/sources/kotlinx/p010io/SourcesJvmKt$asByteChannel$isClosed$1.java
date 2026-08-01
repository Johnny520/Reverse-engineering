package kotlinx.p010io;

import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference0Impl;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final /* synthetic */ class SourcesJvmKt$asByteChannel$isClosed$1 extends MutablePropertyReference0Impl {
    public SourcesJvmKt$asByteChannel$isClosed$1(Object obj) {
        super(obj, C6304.class, "closed", "getClosed()Z", 0);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.jvm.internal.MutablePropertyReference0
    public Object get() {
        return Boolean.valueOf(((C6304) this.receiver).f15476);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.jvm.internal.MutablePropertyReference0
    public void set(Object obj) {
        ((C6304) this.receiver).f15476 = ((Boolean) obj).booleanValue();
    }
}
