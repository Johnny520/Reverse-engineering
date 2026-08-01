package io.ktor.server.application;

import io.ktor.util.pipeline.AbstractC4193;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import net.bytebuddy.description.method.MethodDescription;
import p052.InterfaceC6553;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class PluginBuilder$onCall$1 extends FunctionReferenceImpl implements InterfaceC6553 {
    public static final PluginBuilder$onCall$1 INSTANCE = new PluginBuilder$onCall$1();

    public PluginBuilder$onCall$1() {
        super(2, C4069.class, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "<init>(Ljava/lang/Object;Lio/ktor/util/pipeline/PipelineContext;)V", 0);
    }

    @Override // p052.InterfaceC6553
    public final C4069 invoke(Object obj, AbstractC4193 abstractC4193) {
        obj.getClass();
        abstractC4193.getClass();
        return new C4069(obj, abstractC4193);
    }
}
