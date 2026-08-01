package io.ktor.server.engine;

import io.ktor.http.BadContentTypeFormatException;
import io.ktor.server.application.AbstractC4898;
import io.ktor.server.application.InterfaceC4897;
import io.ktor.server.plugins.BadRequestException;
import io.ktor.server.request.InterfaceC4959;
import io.ktor.util.pipeline.AbstractC5026;
import io.ktor.utils.p007io.InterfaceC5084;
import java.nio.charset.Charset;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.text.AbstractC5964;
import p034.AbstractC7082;
import p068.InterfaceC7380;
import p079.InterfaceC7691;
import p252.AbstractC8944;
import p252.C8942;
import p252.C8954;
import p252.InterfaceC8941;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.server.engine.DefaultTransformKt$installDefaultTransformations$3", m556f = "DefaultTransform.kt", m557l = {87, 88}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m151d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "", "Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;", "body", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class DefaultTransformKt$installDefaultTransformations$3 extends SuspendLambda implements InterfaceC7380 {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public DefaultTransformKt$installDefaultTransformations$3(InterfaceC5189<? super DefaultTransformKt$installDefaultTransformations$3> interfaceC5189) {
        super(3, interfaceC5189);
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(AbstractC5026 abstractC5026, Object obj, InterfaceC5189<? super C6008> interfaceC5189) {
        DefaultTransformKt$installDefaultTransformations$3 defaultTransformKt$installDefaultTransformations$3 = new DefaultTransformKt$installDefaultTransformations$3(interfaceC5189);
        defaultTransformKt$installDefaultTransformations$3.L$0 = abstractC5026;
        defaultTransformKt$installDefaultTransformations$3.L$1 = obj;
        return defaultTransformKt$installDefaultTransformations$3.invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Exception {
        C8954 c8954M14141;
        Charset charsetM12300;
        Object objM9072;
        AbstractC5026 abstractC5026;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C6008 c6008 = C6008.f15084;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            AbstractC5026 abstractC50262 = (AbstractC5026) this.L$0;
            Object obj2 = this.L$1;
            InterfaceC5084 interfaceC5084 = obj2 instanceof InterfaceC5084 ? (InterfaceC5084) obj2 : null;
            if (interfaceC5084 != null && AbstractC5227.m9466(AbstractC4898.m9029((InterfaceC4897) abstractC50262.f13009).f18643, AbstractC5228.f13320.mo9476(String.class))) {
                Object obj3 = abstractC50262.f13009;
                InterfaceC4897 interfaceC4897 = (InterfaceC4897) obj3;
                try {
                    InterfaceC4959 interfaceC4959Mo9018 = ((InterfaceC4897) obj3).mo9018();
                    interfaceC4959Mo9018.getClass();
                    String[] strArr = AbstractC8944.f22758;
                    String strMo8915 = interfaceC4959Mo9018.mo944().mo8915("Content-Type");
                    if (strMo8915 != null) {
                        C8954 c8954 = C8954.f22769;
                        c8954M14141 = C8942.m14141(strMo8915);
                        if (c8954M14141 == null) {
                        }
                        charsetM12300 = AbstractC7082.m12300(c8954M14141);
                        if (charsetM12300 == null) {
                            charsetM12300 = AbstractC5964.f15033;
                        }
                        this.L$0 = abstractC50262;
                        this.label = 1;
                        objM9072 = AbstractC4943.m9072(interfaceC5084, charsetM12300, this);
                        if (objM9072 != coroutineSingletons) {
                            abstractC5026 = abstractC50262;
                            obj = objM9072;
                        }
                    }
                    c8954M14141 = C8954.f22769;
                    charsetM12300 = AbstractC7082.m12300(c8954M14141);
                    if (charsetM12300 == null) {
                    }
                    this.L$0 = abstractC50262;
                    this.label = 1;
                    objM9072 = AbstractC4943.m9072(interfaceC5084, charsetM12300, this);
                    if (objM9072 != coroutineSingletons) {
                    }
                } catch (BadContentTypeFormatException e) {
                    InterfaceC8941 interfaceC8941Mo944 = interfaceC4897.mo9018().mo944();
                    String[] strArr2 = AbstractC8944.f22758;
                    throw new BadRequestException("Illegal Content-Type header format: " + interfaceC8941Mo944.mo8915("Content-Type"), e);
                }
            }
        }
        if (i != 1) {
            if (i == 2) {
                AbstractC6017.m10769(obj);
                return c6008;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        abstractC5026 = (AbstractC5026) this.L$0;
        AbstractC6017.m10769(obj);
        this.L$0 = null;
        this.label = 2;
        return abstractC5026.mo9129((String) obj, this) == coroutineSingletons ? coroutineSingletons : c6008;
    }
}
