package io.ktor.server.application;

import io.ktor.util.pipeline.AbstractC5026;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import net.bytebuddy.description.method.MethodDescription;
import p068.InterfaceC7383;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final /* synthetic */ class PluginBuilder$onCall$1 extends FunctionReferenceImpl implements InterfaceC7383 {
    public static final PluginBuilder$onCall$1 INSTANCE = new PluginBuilder$onCall$1();

    public PluginBuilder$onCall$1() {
        super(2, C4902.class, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "<init>(Ljava/lang/Object;Lio/ktor/util/pipeline/PipelineContext;)V", 0);
    }

    @Override // p068.InterfaceC7383
    public final C4902 invoke(Object obj, AbstractC5026 abstractC5026) {
        obj.getClass();
        abstractC5026.getClass();
        return new C4902(obj, abstractC5026);
    }
}
