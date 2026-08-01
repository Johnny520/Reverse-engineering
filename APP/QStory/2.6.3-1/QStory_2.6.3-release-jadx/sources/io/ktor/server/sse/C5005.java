package io.ktor.server.sse;

import com.alibaba.fastjson2.AbstractC3738;
import io.ktor.http.content.AbstractC4827;
import io.ktor.server.routing.C4995;
import io.ktor.utils.p007io.InterfaceC5079;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.AbstractC6231;
import p068.InterfaceC7383;
import p252.AbstractC8935;
import p252.C8954;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.server.sse.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5005 extends AbstractC4827 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8954 f12976;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC7383 f12977;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4995 f12978;

    public C5005(C4995 c4995, InterfaceC7383 interfaceC7383) {
        interfaceC7383.getClass();
        this.f12978 = c4995;
        this.f12977 = interfaceC7383;
        this.f12976 = AbstractC8935.f22734;
    }

    public final String toString() {
        return "SSEServerContent";
    }

    @Override // io.ktor.http.content.AbstractC4819
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C8954 mo8842() {
        return this.f12976;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0093, code lost:
    
        if (((io.ktor.server.sse.C5007) r9).m9099(r0) == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.http.content.AbstractC4827
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo8941(InterfaceC5079 interfaceC5079, InterfaceC5189 interfaceC5189) throws Throwable {
        SSEServerContent$writeTo$1 sSEServerContent$writeTo$1;
        Ref$ObjectRef ref$ObjectRef;
        Ref$ObjectRef ref$ObjectRef2;
        InterfaceC5004 interfaceC5004;
        if (interfaceC5189 instanceof SSEServerContent$writeTo$1) {
            sSEServerContent$writeTo$1 = (SSEServerContent$writeTo$1) interfaceC5189;
            int i = sSEServerContent$writeTo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sSEServerContent$writeTo$1.label = i - Integer.MIN_VALUE;
            } else {
                sSEServerContent$writeTo$1 = new SSEServerContent$writeTo$1(this, interfaceC5189);
            }
        }
        Object obj = sSEServerContent$writeTo$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = sSEServerContent$writeTo$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            AbstractC5006.f12979.trace("Starting sse session for " + AbstractC3738.m6855(this.f12978.mo9018()));
            ref$ObjectRef = new Ref$ObjectRef();
            try {
                SSEServerContent$writeTo$2 sSEServerContent$writeTo$2 = new SSEServerContent$writeTo$2(ref$ObjectRef, interfaceC5079, this, null);
                sSEServerContent$writeTo$1.L$0 = ref$ObjectRef;
                sSEServerContent$writeTo$1.label = 1;
                Object objM11066 = AbstractC6231.m11066(sSEServerContent$writeTo$2, sSEServerContent$writeTo$1);
                if (objM11066 != coroutineSingletons) {
                    obj = objM11066;
                    ref$ObjectRef2 = ref$ObjectRef;
                }
            } catch (Throwable th) {
                th = th;
                interfaceC5004 = (InterfaceC5004) ref$ObjectRef.element;
                if (interfaceC5004 != null) {
                }
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC6017.m10769(obj);
                return C6008.f15084;
            }
            if (i2 != 3) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Throwable th2 = (Throwable) sSEServerContent$writeTo$1.L$0;
            AbstractC6017.m10769(obj);
            throw th2;
        }
        ref$ObjectRef2 = (Ref$ObjectRef) sSEServerContent$writeTo$1.L$0;
        try {
            AbstractC6017.m10769(obj);
        } catch (Throwable th3) {
            ref$ObjectRef = ref$ObjectRef2;
            th = th3;
            interfaceC5004 = (InterfaceC5004) ref$ObjectRef.element;
            if (interfaceC5004 != null) {
                throw th;
            }
            sSEServerContent$writeTo$1.L$0 = th;
            sSEServerContent$writeTo$1.label = 3;
            if (((C5007) interfaceC5004).m9099(sSEServerContent$writeTo$1) != coroutineSingletons) {
                throw th;
            }
        }
        InterfaceC5004 interfaceC50042 = (InterfaceC5004) ref$ObjectRef2.element;
        if (interfaceC50042 != null) {
            sSEServerContent$writeTo$1.L$0 = null;
            sSEServerContent$writeTo$1.label = 2;
        }
        return C6008.f15084;
    }
}
