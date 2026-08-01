package io.ktor.server.engine;

import com.alibaba.fastjson2.AbstractC3738;
import io.ktor.http.BadContentTypeFormatException;
import io.ktor.http.cio.C4791;
import io.ktor.http.content.AbstractC4825;
import io.ktor.http.content.InterfaceC4809;
import io.ktor.server.application.AbstractC4898;
import io.ktor.server.application.InterfaceC4897;
import io.ktor.server.plugins.BadRequestException;
import io.ktor.server.request.InterfaceC4959;
import io.ktor.util.pipeline.AbstractC5026;
import io.ktor.utils.p007io.AbstractC5076;
import io.ktor.utils.p007io.InterfaceC5084;
import io.ktor.utils.p007io.jvm.javaio.C5056;
import java.io.InputStream;
import java.nio.charset.Charset;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.jvm.internal.C5229;
import kotlin.reflect.InterfaceC5925;
import kotlin.text.AbstractC5964;
import p034.AbstractC7082;
import p068.InterfaceC7380;
import p079.InterfaceC7691;
import p191.AbstractC8568;
import p252.AbstractC8936;
import p252.AbstractC8938;
import p252.AbstractC8944;
import p252.C8934;
import p252.C8942;
import p252.C8954;
import p252.InterfaceC8923;
import p252.InterfaceC8924;
import p252.InterfaceC8941;
import p414.InterfaceC9970;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.server.engine.DefaultTransformKt$installDefaultTransformations$2", m556f = "DefaultTransform.kt", m557l = {42, 47, 53, 69, 73}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m151d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "", "Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;", "body", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class DefaultTransformKt$installDefaultTransformations$2 extends SuspendLambda implements InterfaceC7380 {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;

    public DefaultTransformKt$installDefaultTransformations$2(InterfaceC5189<? super DefaultTransformKt$installDefaultTransformations$2> interfaceC5189) {
        super(3, interfaceC5189);
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(AbstractC5026 abstractC5026, Object obj, InterfaceC5189<? super C6008> interfaceC5189) {
        DefaultTransformKt$installDefaultTransformations$2 defaultTransformKt$installDefaultTransformations$2 = new DefaultTransformKt$installDefaultTransformations$2(interfaceC5189);
        defaultTransformKt$installDefaultTransformations$2.L$0 = abstractC5026;
        defaultTransformKt$installDefaultTransformations$2.L$1 = obj;
        return defaultTransformKt$installDefaultTransformations$2.invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00fe, code lost:
    
        if (r1 == r2) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a1 A[PHI: r1 r3 r11
  0x01a1: PHI (r1v29 java.lang.Object) = 
  (r1v6 java.lang.Object)
  (r1v24 java.lang.Object)
  (r1v25 java.lang.Object)
  (r1v28 java.lang.Object)
  (r1v33 java.lang.Object)
  (r1v35 java.lang.Object)
 binds: [B:74:0x019e, B:28:0x0099, B:24:0x0080, B:51:0x0102, B:58:0x0137, B:13:0x0026] A[DONT_GENERATE, DONT_INLINE]
  0x01a1: PHI (r3v8 io.ktor.util.pipeline.飘花落叶言子楪世哲兰苏) = 
  (r3v2 io.ktor.util.pipeline.飘花落叶言子楪世哲兰苏)
  (r3v2 io.ktor.util.pipeline.飘花落叶言子楪世哲兰苏)
  (r3v2 io.ktor.util.pipeline.飘花落叶言子楪世哲兰苏)
  (r3v7 io.ktor.util.pipeline.飘花落叶言子楪世哲兰苏)
  (r3v10 io.ktor.util.pipeline.飘花落叶言子楪世哲兰苏)
  (r3v12 io.ktor.util.pipeline.飘花落叶言子楪世哲兰苏)
 binds: [B:74:0x019e, B:28:0x0099, B:24:0x0080, B:51:0x0102, B:58:0x0137, B:13:0x0026] A[DONT_GENERATE, DONT_INLINE]
  0x01a1: PHI (r11v2 java.lang.Object) = 
  (r11v0 java.lang.Object)
  (r11v0 java.lang.Object)
  (r11v0 java.lang.Object)
  (r11v1 java.lang.Object)
  (r11v3 java.lang.Object)
  (r11v4 java.lang.Object)
 binds: [B:74:0x019e, B:28:0x0099, B:24:0x0080, B:51:0x0102, B:58:0x0137, B:13:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f5  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Exception {
        AbstractC5026 abstractC5026;
        Object obj2;
        Object objM9056;
        C8954 c8954M14141;
        InterfaceC8923 c8934;
        AbstractC5026 abstractC50262;
        Object obj3;
        C8954 c8954M141412;
        Object objM9072;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C6008 c6008 = C6008.f15084;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            abstractC5026 = (AbstractC5026) this.L$0;
            obj2 = this.L$1;
            boolean z = obj2 instanceof InterfaceC5084;
            InterfaceC5084 interfaceC5084 = z ? (InterfaceC5084) obj2 : null;
            if (interfaceC5084 != null) {
                Object obj4 = abstractC5026.f13009;
                InterfaceC5925 interfaceC5925 = AbstractC4898.m9029((InterfaceC4897) obj4).f18643;
                C5229 c5229 = AbstractC5228.f13320;
                if (!AbstractC5227.m9466(interfaceC5925, c5229.mo9476(InterfaceC5084.class))) {
                    if (AbstractC5227.m9466(interfaceC5925, c5229.mo9476(byte[].class))) {
                        this.L$0 = abstractC5026;
                        this.L$1 = obj2;
                        this.label = 1;
                        objM9056 = AbstractC5076.m9217(interfaceC5084, this);
                        if (objM9056 != coroutineSingletons) {
                            if (objM9056 != null) {
                            }
                        }
                    }
                    if (AbstractC5227.m9466(interfaceC5925, c5229.mo9476(InterfaceC8924.class))) {
                        InterfaceC4897 interfaceC4897 = (InterfaceC4897) obj4;
                        try {
                            InterfaceC4959 interfaceC4959Mo9018 = ((InterfaceC4897) obj4).mo9018();
                            interfaceC4959Mo9018.getClass();
                            String[] strArr = AbstractC8944.f22758;
                            String strMo8915 = interfaceC4959Mo9018.mo944().mo8915("Content-Type");
                            if (strMo8915 != null) {
                                C8954 c8954 = C8954.f22769;
                                c8954M14141 = C8942.m14141(strMo8915);
                                if (c8954M14141 == null) {
                                }
                                if (!c8954M14141.m14148(AbstractC8938.f22747)) {
                                    InterfaceC4959 interfaceC4959Mo90182 = interfaceC4897.mo9018();
                                    interfaceC4959Mo90182.getClass();
                                    String strMo89152 = interfaceC4959Mo90182.mo944().mo8915("Content-Type");
                                    if (strMo89152 == null || (c8954M141412 = C8942.m14141(strMo89152)) == null) {
                                        c8954M141412 = C8954.f22769;
                                    }
                                    Charset charsetM12300 = AbstractC7082.m12300(c8954M141412);
                                    if (charsetM12300 == null) {
                                        charsetM12300 = AbstractC5964.f15033;
                                    }
                                    this.L$0 = abstractC5026;
                                    this.L$1 = obj2;
                                    this.label = 2;
                                    objM9072 = AbstractC4943.m9072(interfaceC5084, charsetM12300, this);
                                } else if (c8954M14141.m14148(AbstractC8936.f22737)) {
                                    C8942 c8942 = InterfaceC8924.f22683;
                                    c8934 = new C8934(2);
                                    C4791 c4791M9056 = AbstractC4925.m9056(abstractC5026, interfaceC5084);
                                    C0371xf89fee43 c0371xf89fee43 = new C0371xf89fee43(c8934, null);
                                    this.L$0 = abstractC5026;
                                    this.L$1 = obj2;
                                    this.L$2 = c8934;
                                    this.label = 3;
                                    if (AbstractC4825.m8942(c4791M9056, c0371xf89fee43, this) != coroutineSingletons) {
                                        abstractC50262 = abstractC5026;
                                        obj3 = obj2;
                                        objM9056 = c8934.build();
                                        obj2 = obj3;
                                        abstractC5026 = abstractC50262;
                                        if (objM9056 != null) {
                                        }
                                    }
                                }
                            }
                            c8954M14141 = C8954.f22769;
                            if (!c8954M14141.m14148(AbstractC8938.f22747)) {
                            }
                        } catch (BadContentTypeFormatException e) {
                            InterfaceC8941 interfaceC8941Mo944 = interfaceC4897.mo9018().mo944();
                            String[] strArr2 = AbstractC8944.f22758;
                            throw new BadRequestException("Illegal Content-Type header format: " + interfaceC8941Mo944.mo8915("Content-Type"), e);
                        }
                    } else {
                        this.L$0 = abstractC5026;
                        this.L$1 = obj2;
                        this.label = 4;
                        InterfaceC5084 interfaceC50842 = z ? (InterfaceC5084) obj2 : null;
                        if (interfaceC50842 != null) {
                            InterfaceC5925 interfaceC59252 = AbstractC4898.m9029((InterfaceC4897) obj4).f18643;
                            if (AbstractC5227.m9466(interfaceC59252, c5229.mo9476(InputStream.class))) {
                                objM9056 = new C5056(interfaceC50842);
                            } else if (AbstractC5227.m9466(interfaceC59252, c5229.mo9476(InterfaceC4809.class))) {
                                objM9056 = AbstractC4925.m9056(abstractC5026, interfaceC50842);
                            }
                            if (objM9056 != coroutineSingletons) {
                            }
                        }
                        objM9056 = null;
                        if (objM9056 != coroutineSingletons) {
                        }
                    }
                }
                objM9056 = null;
                if (objM9056 != null) {
                }
            }
        }
        if (i != 1) {
            if (i == 2) {
                Object obj5 = this.L$1;
                abstractC5026 = (AbstractC5026) this.L$0;
                AbstractC6017.m10769(obj);
                obj2 = obj5;
                objM9072 = obj;
                objM9056 = AbstractC8568.m13620(0, 14, (String) objM9072);
                if (objM9056 != null) {
                }
            } else {
                if (i == 3) {
                    c8934 = (InterfaceC8923) this.L$2;
                    obj3 = this.L$1;
                    abstractC50262 = (AbstractC5026) this.L$0;
                    AbstractC6017.m10769(obj);
                    objM9056 = c8934.build();
                    obj2 = obj3;
                    abstractC5026 = abstractC50262;
                    if (objM9056 != null) {
                        AbstractC4943.f12835.trace("No Default Transformations found for " + AbstractC5228.f13320.mo9476(obj2.getClass()) + " and expected type " + AbstractC4898.m9029((InterfaceC4897) abstractC5026.f13009) + " for call " + AbstractC3738.m6855(((InterfaceC4897) abstractC5026.f13009).mo9018()));
                        return c6008;
                    }
                    InterfaceC9970 interfaceC9970 = AbstractC4943.f12835;
                    StringBuilder sb = new StringBuilder("Transformed ");
                    Class<?> cls = obj2.getClass();
                    C5229 c52292 = AbstractC5228.f13320;
                    sb.append(c52292.mo9476(cls));
                    sb.append(" to ");
                    sb.append(c52292.mo9476(objM9056.getClass()));
                    sb.append(" for ");
                    sb.append(AbstractC3738.m6855(((InterfaceC4897) abstractC5026.f13009).mo9018()));
                    interfaceC9970.trace(sb.toString());
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 5;
                    return abstractC5026.mo9129(objM9056, this) == coroutineSingletons ? coroutineSingletons : c6008;
                }
                if (i != 4) {
                    if (i == 5) {
                        AbstractC6017.m10769(obj);
                        return c6008;
                    }
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
        }
        Object obj6 = this.L$1;
        abstractC5026 = (AbstractC5026) this.L$0;
        AbstractC6017.m10769(obj);
        obj2 = obj6;
        objM9056 = obj;
        if (objM9056 != null) {
        }
    }
}
