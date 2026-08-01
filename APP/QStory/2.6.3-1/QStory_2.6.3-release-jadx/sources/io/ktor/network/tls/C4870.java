package io.ktor.network.tls;

import io.ktor.network.sockets.AbstractC4855;
import io.ktor.network.sockets.InterfaceC4854;
import io.ktor.network.util.AbstractC4880;
import io.ktor.utils.p007io.AbstractC5076;
import io.ktor.utils.p007io.AbstractC5078;
import io.ktor.utils.p007io.C5059;
import io.ktor.utils.p007io.C5062;
import io.ktor.utils.p007io.C5081;
import io.ktor.utils.p007io.InterfaceC5079;
import io.ktor.utils.p007io.InterfaceC5084;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C6234;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.InterfaceC6284;
import kotlinx.coroutines.channels.AbstractC6037;
import kotlinx.coroutines.channels.C6023;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.channels.InterfaceC6031;
import kotlinx.coroutines.channels.InterfaceC6032;
import kotlinx.coroutines.channels.InterfaceC6044;
import kotlinx.p010io.AbstractC6310;
import kotlinx.p010io.C6309;
import kotlinx.p010io.InterfaceC6313;
import p073.InterfaceC7680;
import p074.AbstractC7684;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.network.tls.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4870 implements InterfaceC6233, InterfaceC4854 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC5192 f12660;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC6032 f12661;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC4854 f12662;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC6031 f12663;

    public C4870(InterfaceC6031 interfaceC6031, InterfaceC6032 interfaceC6032, InterfaceC4854 interfaceC4854, InterfaceC5192 interfaceC5192) {
        interfaceC6031.getClass();
        interfaceC6032.getClass();
        interfaceC4854.getClass();
        interfaceC5192.getClass();
        this.f12663 = interfaceC6031;
        this.f12661 = interfaceC6032;
        this.f12662 = interfaceC4854;
        this.f12660 = interfaceC5192;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ba, code lost:
    
        if (r14.mo8992(r10, r0) == r1) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096 A[Catch: all -> 0x0045, ClosedSendChannelException -> 0x00bd, TRY_LEAVE, TryCatch #6 {ClosedSendChannelException -> 0x00bd, all -> 0x0045, blocks: (B:13:0x003c, B:28:0x008d, B:30:0x0096, B:20:0x0060), top: B:47:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Type inference failed for: r13v0, types: [io.ktor.utils.io.飘花落叶言子楪苏兰哲世] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v4, types: [io.ktor.utils.io.飘花落叶言子楪苏兰哲世, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [飘花落叶言世子楪哲兰苏.飘花落叶言子楪世哲兰苏] */
    /* JADX WARN: Type inference failed for: r14v5, types: [飘花落叶言世子楪哲兰苏.飘花落叶言子楪世哲苏兰, 飘花落叶言世子楪哲兰苏.飘花落叶言子楪世苏兰哲] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [飘花落叶言世子楪哲兰苏.飘花落叶言子楪世哲兰苏] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00ba -> B:14:0x003f). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9001(C4870 c4870, InterfaceC5084 interfaceC5084, ContinuationImpl continuationImpl) throws Throwable {
        TLSSocket$appDataOutputLoop$1 tLSSocket$appDataOutputLoop$1;
        ?? r14;
        ?? Mo8894;
        C4870 c48702;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        ?? r6;
        ?? r142;
        ?? r13;
        ?? r2;
        Object objM9235;
        c4870.getClass();
        if (continuationImpl instanceof TLSSocket$appDataOutputLoop$1) {
            tLSSocket$appDataOutputLoop$1 = (TLSSocket$appDataOutputLoop$1) continuationImpl;
            int i = tLSSocket$appDataOutputLoop$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tLSSocket$appDataOutputLoop$1.label = i - Integer.MIN_VALUE;
            } else {
                tLSSocket$appDataOutputLoop$1 = new TLSSocket$appDataOutputLoop$1(c4870, continuationImpl);
            }
        }
        Object obj = tLSSocket$appDataOutputLoop$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r22 = tLSSocket$appDataOutputLoop$1.label;
        try {
            try {
            } catch (Throwable th) {
                th = th;
                r14 = r22;
                Mo8894 = interfaceC5084;
            }
        } catch (ClosedSendChannelException unused) {
        } catch (Throwable th2) {
            th = th2;
        }
        if (r22 == 0) {
            AbstractC6017.m10769(obj);
            r14 = AbstractC4880.f12672;
            Mo8894 = r14.mo8894();
            try {
                byteBuffer = (ByteBuffer) Mo8894;
                r2 = Mo8894;
                r13 = interfaceC5084;
                r142 = r14;
                byteBuffer.clear();
                tLSSocket$appDataOutputLoop$1.L$0 = c4870;
                tLSSocket$appDataOutputLoop$1.L$1 = r13;
                tLSSocket$appDataOutputLoop$1.L$2 = r142;
                tLSSocket$appDataOutputLoop$1.L$3 = r2;
                tLSSocket$appDataOutputLoop$1.L$4 = byteBuffer;
                tLSSocket$appDataOutputLoop$1.label = 1;
                objM9235 = AbstractC5076.m9235(r13, byteBuffer, tLSSocket$appDataOutputLoop$1);
                if (objM9235 != coroutineSingletons) {
                }
                return coroutineSingletons;
            } catch (Throwable th3) {
                th = th3;
                r14.mo8893(Mo8894);
                throw th;
            }
        }
        if (r22 == 1) {
            byteBuffer2 = (ByteBuffer) tLSSocket$appDataOutputLoop$1.L$4;
            Object obj2 = tLSSocket$appDataOutputLoop$1.L$3;
            InterfaceC7680 interfaceC7680 = (InterfaceC7680) tLSSocket$appDataOutputLoop$1.L$2;
            InterfaceC5084 interfaceC50842 = (InterfaceC5084) tLSSocket$appDataOutputLoop$1.L$1;
            c48702 = (C4870) tLSSocket$appDataOutputLoop$1.L$0;
            AbstractC6017.m10769(obj);
            r22 = interfaceC7680;
            r6 = interfaceC50842;
            interfaceC5084 = obj2;
            if (((Number) obj).intValue() != -1) {
            }
            c48702.f12661.mo8994(null);
            r22.mo8893(interfaceC5084);
            return C6008.f15084;
        }
        if (r22 != 2) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        byteBuffer2 = (ByteBuffer) tLSSocket$appDataOutputLoop$1.L$4;
        Object obj3 = tLSSocket$appDataOutputLoop$1.L$3;
        InterfaceC7680 interfaceC76802 = (InterfaceC7680) tLSSocket$appDataOutputLoop$1.L$2;
        InterfaceC5084 interfaceC50843 = (InterfaceC5084) tLSSocket$appDataOutputLoop$1.L$1;
        c48702 = (C4870) tLSSocket$appDataOutputLoop$1.L$0;
        AbstractC6017.m10769(obj);
        ?? r23 = interfaceC76802;
        ?? r62 = interfaceC50843;
        ?? r132 = obj3;
        r142 = r23;
        r2 = r132;
        r13 = r62;
        byteBuffer = byteBuffer2;
        c4870 = c48702;
        try {
            byteBuffer.clear();
            tLSSocket$appDataOutputLoop$1.L$0 = c4870;
            tLSSocket$appDataOutputLoop$1.L$1 = r13;
            tLSSocket$appDataOutputLoop$1.L$2 = r142;
            tLSSocket$appDataOutputLoop$1.L$3 = r2;
            tLSSocket$appDataOutputLoop$1.L$4 = byteBuffer;
            tLSSocket$appDataOutputLoop$1.label = 1;
            objM9235 = AbstractC5076.m9235(r13, byteBuffer, tLSSocket$appDataOutputLoop$1);
        } catch (ClosedSendChannelException unused2) {
            c48702 = c4870;
            interfaceC5084 = r2;
            r22 = r142;
        } catch (Throwable th4) {
            c48702 = c4870;
            th = th4;
            c48702.f12661.mo8994(null);
            throw th;
        }
        if (objM9235 != coroutineSingletons) {
            c48702 = c4870;
            byteBuffer2 = byteBuffer;
            r6 = r13;
            interfaceC5084 = r2;
            r22 = r142;
            obj = objM9235;
            if (((Number) obj).intValue() != -1) {
                byteBuffer2.flip();
                InterfaceC6032 interfaceC6032 = c48702.f12661;
                TLSRecordType tLSRecordType = TLSRecordType.ApplicationData;
                C6309 c6309 = new C6309();
                AbstractC6310.m11184(c6309, byteBuffer2);
                C4875 c4875 = new C4875(tLSRecordType, c6309);
                tLSSocket$appDataOutputLoop$1.L$0 = c48702;
                tLSSocket$appDataOutputLoop$1.L$1 = r6;
                tLSSocket$appDataOutputLoop$1.L$2 = r22;
                tLSSocket$appDataOutputLoop$1.L$3 = interfaceC5084;
                tLSSocket$appDataOutputLoop$1.L$4 = byteBuffer2;
                tLSSocket$appDataOutputLoop$1.label = 2;
                r23 = r22;
                r62 = r6;
                r132 = interfaceC5084;
            }
            c48702.f12661.mo8994(null);
            r22.mo8893(interfaceC5084);
            return C6008.f15084;
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0099 A[Catch: all -> 0x004c, TryCatch #5 {all -> 0x004c, blocks: (B:16:0x0045, B:33:0x0091, B:35:0x0099, B:37:0x00b4, B:47:0x00e2, B:48:0x0105, B:21:0x005b, B:24:0x006d), top: B:75:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0106 A[Catch: all -> 0x011b, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x011b, blocks: (B:59:0x0125, B:60:0x0128, B:49:0x0106, B:57:0x0123), top: B:75:0x0023, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v5, types: [kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲] */
    /* JADX WARN: Type inference failed for: r12v0, types: [io.ktor.utils.io.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18, types: [java.lang.Object, kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲] */
    /* JADX WARN: Type inference failed for: r12v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v5, types: [kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲] */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v14, types: [io.ktor.utils.io.飘花落叶言子楪哲苏世兰, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00da -> B:17:0x0048). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9002(C4870 c4870, InterfaceC5079 interfaceC5079, ContinuationImpl continuationImpl) throws Throwable {
        TLSSocket$appDataInputLoop$1 tLSSocket$appDataInputLoop$1;
        ?? r11;
        InterfaceC6044 interfaceC6044;
        ?? r12;
        InterfaceC6044 interfaceC60442;
        ?? r2;
        ?? r13;
        ?? r122;
        C5081 c5081;
        ?? r123;
        InterfaceC6044 interfaceC60443;
        C6023 c6023;
        Object objM10823;
        InterfaceC6044 interfaceC60444;
        InterfaceC5079 interfaceC50792;
        c4870.getClass();
        if (continuationImpl instanceof TLSSocket$appDataInputLoop$1) {
            tLSSocket$appDataInputLoop$1 = (TLSSocket$appDataInputLoop$1) continuationImpl;
            int i = tLSSocket$appDataInputLoop$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tLSSocket$appDataInputLoop$1.label = i - Integer.MIN_VALUE;
            } else {
                tLSSocket$appDataInputLoop$1 = new TLSSocket$appDataInputLoop$1(c4870, continuationImpl);
            }
        }
        Object obj = tLSSocket$appDataInputLoop$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r22 = tLSSocket$appDataInputLoop$1.label;
        try {
            try {
            } catch (Throwable unused) {
                interfaceC5079 = r22;
                tLSSocket$appDataInputLoop$1.L$0 = null;
                tLSSocket$appDataInputLoop$1.L$1 = null;
                tLSSocket$appDataInputLoop$1.L$2 = null;
                tLSSocket$appDataInputLoop$1.label = 5;
                if (((C5081) interfaceC5079).m9263(tLSSocket$appDataInputLoop$1) == coroutineSingletons) {
                }
                return C6008.f15084;
            }
        } catch (Throwable th) {
            th = th;
        }
        switch (r22) {
            case 0:
                AbstractC6017.m10769(obj);
                try {
                    r11 = c4870.f12663;
                    try {
                        InterfaceC6044 it = r11.iterator();
                        r11 = r11;
                        interfaceC5079 = interfaceC5079;
                        interfaceC60443 = it;
                        tLSSocket$appDataInputLoop$1.L$0 = interfaceC5079;
                        tLSSocket$appDataInputLoop$1.L$1 = r11;
                        tLSSocket$appDataInputLoop$1.L$2 = interfaceC60443;
                        tLSSocket$appDataInputLoop$1.label = 1;
                        c6023 = (C6023) interfaceC60443;
                        objM10823 = c6023.m10823(tLSSocket$appDataInputLoop$1);
                    } catch (Throwable th2) {
                        r22 = interfaceC5079;
                        interfaceC5079 = r11;
                        th = th2;
                    }
                } catch (Throwable unused2) {
                    tLSSocket$appDataInputLoop$1.L$0 = null;
                    tLSSocket$appDataInputLoop$1.L$1 = null;
                    tLSSocket$appDataInputLoop$1.L$2 = null;
                    tLSSocket$appDataInputLoop$1.label = 5;
                    if (((C5081) interfaceC5079).m9263(tLSSocket$appDataInputLoop$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                if (objM10823 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                ?? r10 = interfaceC5079;
                interfaceC5079 = r11;
                interfaceC6044 = c6023;
                obj = objM10823;
                r22 = r10;
                if (((Boolean) obj).booleanValue()) {
                    interfaceC5079.mo10815(null);
                    tLSSocket$appDataInputLoop$1.L$0 = null;
                    tLSSocket$appDataInputLoop$1.L$1 = null;
                    tLSSocket$appDataInputLoop$1.L$2 = null;
                    tLSSocket$appDataInputLoop$1.label = 4;
                    if (((C5081) r22).m9263(tLSSocket$appDataInputLoop$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return C6008.f15084;
                }
                C6023 c60232 = (C6023) interfaceC6044;
                C4875 c4875 = (C4875) c60232.m10821();
                InterfaceC6313 interfaceC6313 = c4875.f12666;
                TLSRecordType tLSRecordType = c4875.f12668;
                long jM12638 = AbstractC7684.m12638(interfaceC6313);
                if (AbstractC4871.f12664[tLSRecordType.ordinal()] != 1) {
                    throw new TLSException("Unexpected record " + tLSRecordType + " (" + jM12638 + " bytes)", null, 2, null);
                }
                try {
                    InterfaceC6313 interfaceC63132 = c4875.f12666;
                    tLSSocket$appDataInputLoop$1.L$0 = r22;
                    tLSSocket$appDataInputLoop$1.L$1 = interfaceC5079;
                    tLSSocket$appDataInputLoop$1.L$2 = c60232;
                    tLSSocket$appDataInputLoop$1.label = 2;
                    Object objM9246 = AbstractC5078.m9246(r22, interfaceC63132, tLSSocket$appDataInputLoop$1);
                    r2 = r22;
                    interfaceC60442 = c60232;
                    r12 = interfaceC5079;
                    if (objM9246 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    tLSSocket$appDataInputLoop$1.L$0 = r122;
                    tLSSocket$appDataInputLoop$1.L$1 = r13;
                    tLSSocket$appDataInputLoop$1.L$2 = interfaceC60442;
                    tLSSocket$appDataInputLoop$1.label = 3;
                    c5081 = (C5081) r122;
                    if (c5081.m9259(tLSSocket$appDataInputLoop$1) != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    r123 = r13;
                    interfaceC50792 = c5081;
                    interfaceC60444 = interfaceC60442;
                    interfaceC60443 = interfaceC60444;
                    r11 = r123;
                    interfaceC5079 = interfaceC50792;
                    tLSSocket$appDataInputLoop$1.L$0 = interfaceC5079;
                    tLSSocket$appDataInputLoop$1.L$1 = r11;
                    tLSSocket$appDataInputLoop$1.L$2 = interfaceC60443;
                    tLSSocket$appDataInputLoop$1.label = 1;
                    c6023 = (C6023) interfaceC60443;
                    objM10823 = c6023.m10823(tLSSocket$appDataInputLoop$1);
                    if (objM10823 == coroutineSingletons) {
                    }
                } catch (Throwable th3) {
                    th = th3;
                    r22 = r122;
                    interfaceC5079 = r13;
                    throw th;
                }
                r13 = r12;
                r122 = r2;
                try {
                    throw th;
                } catch (Throwable th4) {
                    AbstractC6037.m10837(interfaceC5079, th);
                    throw th4;
                }
                break;
            case 1:
                interfaceC6044 = (InterfaceC6044) tLSSocket$appDataInputLoop$1.L$2;
                InterfaceC6031 interfaceC6031 = (InterfaceC6031) tLSSocket$appDataInputLoop$1.L$1;
                InterfaceC5079 interfaceC50793 = (InterfaceC5079) tLSSocket$appDataInputLoop$1.L$0;
                AbstractC6017.m10769(obj);
                r22 = interfaceC50793;
                interfaceC5079 = interfaceC6031;
                if (((Boolean) obj).booleanValue()) {
                }
                throw th;
            case 2:
                InterfaceC6044 interfaceC60445 = (InterfaceC6044) tLSSocket$appDataInputLoop$1.L$2;
                InterfaceC6031 interfaceC60312 = (InterfaceC6031) tLSSocket$appDataInputLoop$1.L$1;
                InterfaceC5079 interfaceC50794 = (InterfaceC5079) tLSSocket$appDataInputLoop$1.L$0;
                AbstractC6017.m10769(obj);
                r2 = interfaceC50794;
                interfaceC60442 = interfaceC60445;
                r12 = interfaceC60312;
                r13 = r12;
                r122 = r2;
                tLSSocket$appDataInputLoop$1.L$0 = r122;
                tLSSocket$appDataInputLoop$1.L$1 = r13;
                tLSSocket$appDataInputLoop$1.L$2 = interfaceC60442;
                tLSSocket$appDataInputLoop$1.label = 3;
                c5081 = (C5081) r122;
                if (c5081.m9259(tLSSocket$appDataInputLoop$1) != coroutineSingletons) {
                }
                break;
            case 3:
                InterfaceC6044 interfaceC60446 = (InterfaceC6044) tLSSocket$appDataInputLoop$1.L$2;
                InterfaceC6031 interfaceC60313 = (InterfaceC6031) tLSSocket$appDataInputLoop$1.L$1;
                InterfaceC5079 interfaceC50795 = (InterfaceC5079) tLSSocket$appDataInputLoop$1.L$0;
                AbstractC6017.m10769(obj);
                interfaceC50792 = interfaceC50795;
                interfaceC60444 = interfaceC60446;
                r123 = interfaceC60313;
                interfaceC60443 = interfaceC60444;
                r11 = r123;
                interfaceC5079 = interfaceC50792;
                tLSSocket$appDataInputLoop$1.L$0 = interfaceC5079;
                tLSSocket$appDataInputLoop$1.L$1 = r11;
                tLSSocket$appDataInputLoop$1.L$2 = interfaceC60443;
                tLSSocket$appDataInputLoop$1.label = 1;
                c6023 = (C6023) interfaceC60443;
                objM10823 = c6023.m10823(tLSSocket$appDataInputLoop$1);
                if (objM10823 == coroutineSingletons) {
                }
                break;
            case 4:
            case 5:
                AbstractC6017.m10769(obj);
                return C6008.f15084;
            case 6:
                Throwable th5 = (Throwable) tLSSocket$appDataInputLoop$1.L$0;
                AbstractC6017.m10769(obj);
                throw th5;
            default:
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f12662.close();
    }

    @Override // io.ktor.network.sockets.InterfaceC4844, kotlinx.coroutines.InterfaceC6230
    public final void dispose() {
        this.f12662.dispose();
    }

    @Override // io.ktor.network.sockets.InterfaceC4847
    public final AbstractC4855 getLocalAddress() {
        return this.f12662.getLocalAddress();
    }

    @Override // io.ktor.network.sockets.InterfaceC4844
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪 */
    public final InterfaceC6284 mo8982() {
        return this.f12662.mo8982();
    }

    @Override // kotlinx.coroutines.InterfaceC6233
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final InterfaceC5192 mo2990() {
        return this.f12660;
    }

    @Override // io.ktor.network.sockets.InterfaceC4845
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final C5059 mo8983(C5081 c5081) {
        return AbstractC5078.m9255(this, this.f12660.plus(new C6234("cio-tls-input-loop")), c5081, new TLSSocket$attachForReading$1(this, null));
    }

    @Override // io.ktor.network.sockets.InterfaceC4846
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final AbstractC4855 mo8984() {
        return this.f12662.mo8984();
    }

    @Override // io.ktor.network.sockets.InterfaceC4843
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final C5062 mo8981(C5081 c5081) {
        return AbstractC5076.m9219(this, this.f12660.plus(new C6234("cio-tls-output-loop")), c5081, new TLSSocket$attachForWriting$1(this, null));
    }
}
