package io.ktor.server.application;

import io.ktor.util.pipeline.AbstractC4194;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import net.bytebuddy.description.method.MethodDescription;
import p052.InterfaceC6554;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class PluginBuilder$onCallReceive$1 extends FunctionReferenceImpl implements InterfaceC6554 {
    public static final PluginBuilder$onCallReceive$1 INSTANCE = new PluginBuilder$onCallReceive$1();

    public PluginBuilder$onCallReceive$1() {
        super(2, C4062.class, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "<init>(Ljava/lang/Object;Lio/ktor/util/pipeline/PipelineContext;)V", 0);
    }

    @Override // p052.InterfaceC6554
    public final C4062 invoke(Object obj, AbstractC4194 abstractC4194) {
        obj.getClass();
        abstractC4194.getClass();
        return new C4062(obj, abstractC4194);
    }
}
