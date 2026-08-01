package io.ktor.http.content;

import io.ktor.utils.p007io.InterfaceC5079;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.text.AbstractC5964;
import kotlinx.coroutines.AbstractC6227;
import kotlinx.coroutines.AbstractC6231;
import p034.AbstractC7082;
import p068.InterfaceC7383;
import p111.C8036;
import p111.ExecutorC8037;
import p252.C8926;
import p252.C8954;

/* JADX INFO: renamed from: io.ktor.http.content.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4817 extends AbstractC4827 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8954 f12583;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC7383 f12584;

    public C4817(InterfaceC7383 interfaceC7383, C8954 c8954) {
        c8954.getClass();
        this.f12584 = interfaceC7383;
        this.f12583 = c8954;
    }

    @Override // io.ktor.http.content.AbstractC4819
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final C8926 mo8839() {
        return null;
    }

    @Override // io.ktor.http.content.AbstractC4819
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C8954 mo8842() {
        return this.f12583;
    }

    @Override // io.ktor.http.content.AbstractC4819
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Long mo8843() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    @Override // io.ktor.http.content.AbstractC4827
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo8941(InterfaceC5079 interfaceC5079, InterfaceC5189 interfaceC5189) throws Throwable {
        boolean zM9466;
        Object objInvoke;
        Charset charsetM12300 = AbstractC7082.m12300(this.f12583);
        if (charsetM12300 == null) {
            charsetM12300 = AbstractC5964.f15033;
        }
        WriterContent$writeTo$2 writerContent$writeTo$2 = new WriterContent$writeTo$2(interfaceC5079, charsetM12300, this, null);
        Method method = (Method) AbstractC4813.f12575.getValue();
        C6008 c6008 = C6008.f15084;
        if (method != null) {
            try {
                zM9466 = AbstractC5227.m9466(method.invoke(null, null), Boolean.TRUE);
            } catch (Throwable unused) {
                zM9466 = false;
            }
            if (zM9466) {
                objInvoke = writerContent$writeTo$2.invoke((Object) interfaceC5189);
                if (objInvoke != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    objInvoke = c6008;
                }
            } else {
                C8036 c8036 = AbstractC6227.f15375;
                objInvoke = AbstractC6231.m11029(ExecutorC8037.f19570, new BlockingBridgeKt$withBlockingAndRedispatch$2(writerContent$writeTo$2, null), interfaceC5189);
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (objInvoke != coroutineSingletons) {
                    objInvoke = c6008;
                }
                if (objInvoke != coroutineSingletons) {
                }
            }
        }
        return objInvoke == CoroutineSingletons.COROUTINE_SUSPENDED ? objInvoke : c6008;
    }
}
