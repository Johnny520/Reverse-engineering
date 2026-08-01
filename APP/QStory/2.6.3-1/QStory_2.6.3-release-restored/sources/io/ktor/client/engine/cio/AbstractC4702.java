package io.ktor.client.engine.cio;

import androidx.compose.foundation.layout.C1481;
import io.ktor.client.call.UnsupportedContentTypeException;
import io.ktor.client.engine.AbstractC4708;
import io.ktor.client.plugins.sse.C4736;
import io.ktor.http.cio.AbstractC4789;
import io.ktor.http.cio.C4799;
import io.ktor.http.content.AbstractC4819;
import io.ktor.http.content.AbstractC4826;
import io.ktor.http.content.AbstractC4827;
import io.ktor.http.content.AbstractC4828;
import io.ktor.http.content.AbstractC4829;
import io.ktor.server.websocket.C5008;
import io.ktor.util.C5043;
import io.ktor.utils.p007io.AbstractC5076;
import io.ktor.utils.p007io.AbstractC5078;
import io.ktor.utils.p007io.C5062;
import io.ktor.utils.p007io.C5077;
import io.ktor.utils.p007io.C5081;
import io.ktor.utils.p007io.InterfaceC5079;
import java.util.List;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC5227;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6234;
import kotlinx.p010io.C6309;
import p074.AbstractC7684;
import p252.AbstractC8944;
import p252.C8922;
import p252.C8927;
import p252.C8928;
import p252.C8930;
import p252.C8946;
import p257.C8968;
import p267.AbstractC9004;
import p269.AbstractC9019;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.client.engine.cio.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4702 {
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0202, code lost:
    
        if (((io.ktor.utils.p007io.C5081) r1).m9263(r4) == r5) goto L114;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0059: MOVE (r3 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r1 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) (LINE:90), block:B:24:0x0058 */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v33, types: [io.ktor.utils.io.飘花落叶言子楪哲苏世兰, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v6, types: [io.ktor.http.cio.飘花落叶言子楪哲兰苏世] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [io.ktor.http.cio.飘花落叶言子楪哲兰苏世, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [int] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m8812(C8968 c8968, InterfaceC5079 interfaceC5079, boolean z, boolean z2, ContinuationImpl continuationImpl) throws Throwable {
        UtilsKt$writeHeaders$1 utilsKt$writeHeaders$1;
        ?? c4799;
        boolean z3;
        boolean z4;
        ?? r1;
        ?? r12;
        Throwable th;
        ?? r3;
        UtilsKt$writeHeaders$1 utilsKt$writeHeaders$12;
        C8930 c8930;
        C8922 c8922M14132;
        if (continuationImpl instanceof UtilsKt$writeHeaders$1) {
            utilsKt$writeHeaders$1 = (UtilsKt$writeHeaders$1) continuationImpl;
            int i = utilsKt$writeHeaders$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                utilsKt$writeHeaders$1.label = i - Integer.MIN_VALUE;
            } else {
                utilsKt$writeHeaders$1 = new UtilsKt$writeHeaders$1(continuationImpl);
            }
        }
        Object obj = utilsKt$writeHeaders$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r6 = utilsKt$writeHeaders$1.label;
        String string = null;
        if (r6 != 0) {
            try {
            } catch (Throwable th2) {
                th = th2;
                c4799 = "Host";
                z4 = z3;
                r1 = r6;
                if (z4) {
                }
                r12 = c4799;
                throw th;
            }
            if (r6 != 1) {
                if (r6 == 2) {
                    boolean z5 = utilsKt$writeHeaders$1.Z$0;
                    C4799 c47992 = (C4799) utilsKt$writeHeaders$1.L$1;
                    AbstractC6017.m10769(obj);
                    r3 = c47992;
                    r3.getClass();
                    return C6008.f15084;
                }
                if (r6 != 3) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                th = (Throwable) utilsKt$writeHeaders$1.L$1;
                r12 = (C4799) utilsKt$writeHeaders$1.L$0;
                try {
                    AbstractC6017.m10769(obj);
                    r12 = r12;
                    throw th;
                } catch (Throwable th3) {
                    th = th3;
                    r12.getClass();
                    throw th;
                }
            }
            boolean z6 = utilsKt$writeHeaders$1.Z$0;
            C4799 c47993 = (C4799) utilsKt$writeHeaders$1.L$1;
            InterfaceC5079 interfaceC50792 = (InterfaceC5079) utilsKt$writeHeaders$1.L$0;
            AbstractC6017.m10769(obj);
            c4799 = c47993;
            z4 = z6;
            r1 = interfaceC50792;
            try {
                utilsKt$writeHeaders$1.L$0 = r1;
                utilsKt$writeHeaders$1.L$1 = c4799;
                utilsKt$writeHeaders$1.Z$0 = z4;
                utilsKt$writeHeaders$1.label = 2;
                if (((C5081) r1).m9259(utilsKt$writeHeaders$1) != coroutineSingletons) {
                    r3 = c4799;
                    r3.getClass();
                    return C6008.f15084;
                }
            } catch (Throwable th4) {
                th = th4;
                if (z4) {
                }
                r12 = c4799;
                throw th;
            }
            return coroutineSingletons;
        }
        AbstractC6017.m10769(obj);
        c4799 = new C4799();
        C6309 c6309 = c4799.f12550;
        C8928 c8928 = c8968.f22798;
        C8922 c8922 = c8968.f22799;
        String str = c8922.f22674;
        C8946 c8946 = c8968.f22797;
        AbstractC4819 abstractC4819 = c8968.f22796;
        String[] strArr = AbstractC8944.f22758;
        String strMo8915 = c8946.mo8915("Content-Length");
        if (strMo8915 == null) {
            Long lMo8843 = abstractC4819.mo8843();
            if (lMo8843 != null) {
                string = lMo8843.toString();
            }
        } else {
            string = strMo8915;
        }
        String strMo89152 = c8946.mo8915("Transfer-Encoding");
        String strMo89153 = abstractC4819.mo8841().mo8915("Transfer-Encoding");
        boolean z7 = string == null || AbstractC5227.m9466(strMo89153, "chunked") || AbstractC5227.m9466(strMo89152, "chunked");
        String strMo89154 = c8946.mo8915("Expect");
        try {
            if (c8922.f22678.isEmpty()) {
                try {
                    c8930 = new C8930();
                    AbstractC9019.m14238(c8930, c8922);
                    utilsKt$writeHeaders$12 = utilsKt$writeHeaders$1;
                } catch (Throwable th5) {
                    th = th5;
                    utilsKt$writeHeaders$12 = utilsKt$writeHeaders$1;
                    r1 = interfaceC5079;
                    z4 = z2;
                    coroutineSingletons = coroutineSingletons;
                    utilsKt$writeHeaders$1 = utilsKt$writeHeaders$12;
                    if (z4) {
                        try {
                            utilsKt$writeHeaders$1.L$0 = c4799;
                            utilsKt$writeHeaders$1.L$1 = th;
                            utilsKt$writeHeaders$1.label = 3;
                        } catch (Throwable th6) {
                            th = th6;
                            r12 = c4799;
                            r12.getClass();
                            throw th;
                        }
                    }
                    r12 = c4799;
                    throw th;
                }
                try {
                    AbstractC9004.m14186(c8930, "/");
                    c8922M14132 = c8930.m14132();
                } catch (Throwable th7) {
                    th = th7;
                    r1 = interfaceC5079;
                    z4 = z2;
                    coroutineSingletons = coroutineSingletons;
                    utilsKt$writeHeaders$1 = utilsKt$writeHeaders$12;
                    if (z4) {
                    }
                    r12 = c4799;
                    throw th;
                }
            } else {
                utilsKt$writeHeaders$12 = utilsKt$writeHeaders$1;
                c8922M14132 = c8922;
            }
            String strM14256 = z ? c8922M14132.f22669 : AbstractC9019.m14256(c8922M14132);
            String string2 = C8927.f22706.toString();
            c8928.getClass();
            strM14256.getClass();
            AbstractC7684.m12645(c6309, c8928.f22719, 0, 14);
            c6309.m11173((byte) 32);
            AbstractC7684.m12645(c6309, strM14256, 0, 14);
            c6309.m11173((byte) 32);
            AbstractC7684.m12645(c6309, string2, 0, 14);
            c6309.m11173((byte) 13);
            c6309.m11173((byte) 10);
            if (!(((List) c8946.f13048.get("Host")) != null)) {
                if (c8922.f22681.f22666 != c8922.m14126()) {
                    str = str + ':' + c8922.m14126();
                }
                c4799.m8918("Host", str);
            }
            if (string != null && ((!c8928.equals(C8928.f22715) && !c8928.equals(C8928.f22717)) || !(abstractC4819 instanceof AbstractC4829))) {
                c4799.m8918("Content-Length", string);
            }
            AbstractC4708.m8817(c8946, abstractC4819, new C1481(c4799, 6));
            if (z7 && strMo89152 == null && strMo89153 == null && !(abstractC4819 instanceof AbstractC4829)) {
                c4799.m8918("Transfer-Encoding", "chunked");
            }
            if ((strMo89154 == null || (abstractC4819 instanceof AbstractC4829)) ? false : true) {
                strMo89154.getClass();
                c4799.m8918("Expect", strMo89154);
            }
            c4799.m8919();
            r1 = interfaceC5079;
            utilsKt$writeHeaders$1 = utilsKt$writeHeaders$12;
            try {
                utilsKt$writeHeaders$1.L$0 = r1;
                utilsKt$writeHeaders$1.L$1 = c4799;
                z4 = z2;
                try {
                    utilsKt$writeHeaders$1.Z$0 = z4;
                    utilsKt$writeHeaders$1.label = 1;
                    Object objM9246 = AbstractC5078.m9246(r1, c6309, utilsKt$writeHeaders$1);
                    coroutineSingletons = coroutineSingletons;
                    r1 = r1;
                    c4799 = c4799;
                    if (objM9246 != coroutineSingletons) {
                        utilsKt$writeHeaders$1.L$0 = r1;
                        utilsKt$writeHeaders$1.L$1 = c4799;
                        utilsKt$writeHeaders$1.Z$0 = z4;
                        utilsKt$writeHeaders$1.label = 2;
                        if (((C5081) r1).m9259(utilsKt$writeHeaders$1) != coroutineSingletons) {
                        }
                    }
                } catch (Throwable th8) {
                    th = th8;
                    coroutineSingletons = coroutineSingletons;
                    if (z4) {
                    }
                    r12 = c4799;
                    throw th;
                }
            } catch (Throwable th9) {
                th = th9;
                z4 = z2;
                coroutineSingletons = coroutineSingletons;
                if (z4) {
                }
                r12 = c4799;
                throw th;
            }
        } catch (Throwable th10) {
            th = th10;
            r1 = interfaceC5079;
        }
        return coroutineSingletons;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m8813(C8968 c8968, InterfaceC5079 interfaceC5079, InterfaceC5192 interfaceC5192) {
        AbstractC4819 abstractC4819 = c8968.f22796;
        C8946 c8946 = c8968.f22797;
        AbstractC4819 abstractC4819M8815 = m8815(abstractC4819);
        if (abstractC4819M8815 instanceof AbstractC4829) {
            AbstractC5076.m9225(interfaceC5079);
            return;
        }
        if (abstractC4819M8815 instanceof C5008) {
            throw new UnsupportedContentTypeException(abstractC4819M8815);
        }
        String[] strArr = AbstractC8944.f22758;
        String strMo8915 = c8946.mo8915("Content-Length");
        if (strMo8915 == null) {
            Long lMo8843 = abstractC4819M8815.mo8843();
            strMo8915 = lMo8843 != null ? lMo8843.toString() : null;
        }
        C5062 c5062M8902 = (strMo8915 == null || AbstractC5227.m9466(abstractC4819M8815.mo8841().mo8915("Transfer-Encoding"), "chunked") || AbstractC5227.m9466(c8946.mo8915("Transfer-Encoding"), "chunked")) ? AbstractC4789.m8902(interfaceC5079, interfaceC5192) : null;
        AbstractC6231.m11036(AbstractC6231.m11048(interfaceC5192.plus(new C6234("Request body writer"))), null, null, new UtilsKt$writeBody$2(c8968, abstractC4819M8815, c5062M8902 != null ? c5062M8902.f13078 : interfaceC5079, c5062M8902, interfaceC5079, true, null), 3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Object m8814(AbstractC4819 abstractC4819, InterfaceC5079 interfaceC5079, InterfaceC5189 interfaceC5189) throws Throwable {
        if (abstractC4819 instanceof AbstractC4828) {
            byte[] bArrMo8846 = ((AbstractC4828) abstractC4819).mo8846();
            C5077 c5077 = AbstractC5078.f13099;
            Object objM9248 = AbstractC5078.m9248(interfaceC5079, bArrMo8846, 0, bArrMo8846.length, (ContinuationImpl) interfaceC5189);
            if (objM9248 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objM9248;
            }
        } else if (abstractC4819 instanceof AbstractC4826) {
            Object objM9224 = AbstractC5076.m9224(((AbstractC4826) abstractC4819).mo8845(), interfaceC5079, (ContinuationImpl) interfaceC5189);
            if (objM9224 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objM9224;
            }
        } else if (abstractC4819 instanceof AbstractC4827) {
            Object objMo8941 = ((AbstractC4827) abstractC4819).mo8941(interfaceC5079, interfaceC5189);
            if (objMo8941 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objMo8941;
            }
        } else {
            if (!(abstractC4819 instanceof C4736)) {
                if (abstractC4819 instanceof C5008) {
                    C6755.m11870("unreachable code");
                    return null;
                }
                if (abstractC4819 instanceof AbstractC4829) {
                    C6755.m11870("unreachable code");
                    return null;
                }
                C5043.m9170();
                return null;
            }
            Object objM8814 = m8814(((C4736) abstractC4819).f12453, interfaceC5079, interfaceC5189);
            if (objM8814 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objM8814;
            }
        }
        return C6008.f15084;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final AbstractC4819 m8815(AbstractC4819 abstractC4819) {
        return abstractC4819 instanceof C4736 ? m8815(((C4736) abstractC4819).f12453) : abstractC4819;
    }
}
