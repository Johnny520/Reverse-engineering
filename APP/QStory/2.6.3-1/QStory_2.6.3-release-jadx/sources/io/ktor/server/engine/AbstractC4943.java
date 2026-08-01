package io.ktor.server.engine;

import com.bumptech.glide.AbstractC3888;
import io.ktor.utils.p007io.AbstractC5076;
import io.ktor.utils.p007io.InterfaceC5084;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import kotlin.AbstractC6017;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.text.AbstractC5964;
import kotlinx.p010io.AbstractC6310;
import kotlinx.p010io.InterfaceC6313;
import p414.AbstractC9968;
import p414.InterfaceC9970;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.server.engine.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4943 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC9970 f12835;

    static {
        InterfaceC9970 interfaceC9970M15262 = AbstractC9968.m15262("io.ktor.server.engine.DefaultTransform");
        interfaceC9970M15262.getClass();
        f12835 = interfaceC9970M15262;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9072(InterfaceC5084 interfaceC5084, Charset charset, ContinuationImpl continuationImpl) throws Exception {
        DefaultTransformKt$readText$1 defaultTransformKt$readText$1;
        String strM11189;
        if (continuationImpl instanceof DefaultTransformKt$readText$1) {
            defaultTransformKt$readText$1 = (DefaultTransformKt$readText$1) continuationImpl;
            int i = defaultTransformKt$readText$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                defaultTransformKt$readText$1.label = i - Integer.MIN_VALUE;
            } else {
                defaultTransformKt$readText$1 = new DefaultTransformKt$readText$1(continuationImpl);
            }
        }
        Object objM9228 = defaultTransformKt$readText$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = defaultTransformKt$readText$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(objM9228);
            defaultTransformKt$readText$1.L$0 = charset;
            defaultTransformKt$readText$1.label = 1;
            objM9228 = AbstractC5076.m9228(interfaceC5084, Long.MAX_VALUE, defaultTransformKt$readText$1);
            if (objM9228 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            charset = (Charset) defaultTransformKt$readText$1.L$0;
            AbstractC6017.m10769(objM9228);
        }
        InterfaceC6313 interfaceC6313 = (InterfaceC6313) objM9228;
        if (interfaceC6313.mo11163()) {
            return "";
        }
        try {
            if (AbstractC5227.m9466(charset, AbstractC5964.f15033) || AbstractC5227.m9466(charset, AbstractC5964.f15030)) {
                strM11189 = AbstractC6310.m11189(interfaceC6313);
            } else {
                charset.getClass();
                strM11189 = AbstractC3888.m7242(new InputStreamReader(AbstractC6310.m11181(interfaceC6313), charset));
            }
            interfaceC6313.close();
            return strM11189;
        } catch (Throwable th) {
            interfaceC6313.close();
            throw th;
        }
    }
}
