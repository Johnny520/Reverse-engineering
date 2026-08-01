package io.modelcontextprotocol.kotlin.sdk.shared;

import androidx.activity.compose.C0002;
import androidx.activity.compose.C0004;
import io.ktor.client.plugins.AbstractC3933;
import io.ktor.util.C4207;
import io.ktor.util.C4211;
import io.modelcontextprotocol.kotlin.sdk.McpError;
import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import io.modelcontextprotocol.kotlin.sdk.server.C4299;
import java.util.LinkedHashMap;
import kotlin.C5176;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC4388;
import kotlin.jvm.internal.AbstractC4396;
import kotlinx.coroutines.C5438;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p056.C6674;
import p056.C6679;
import p056.C6748;
import p056.InterfaceC6836;
import p088.AbstractC7159;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4307 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC4309 f12882;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4299 f12883;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final LinkedHashMap f12881 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final LinkedHashMap f12880 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final LinkedHashMap f12879 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final LinkedHashMap f12878 = new LinkedHashMap();

    public AbstractC4307(C4299 c4299) {
        this.f12883 = c4299;
        m8738(Method$Defined.NotificationsProgress, new C4301(this, 0));
        m8737(AbstractC4396.m8912(C6748.class), Method$Defined.Ping, new Protocol$2(null));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m8734(AbstractC4307 abstractC4307, C6679 c6679, C6674 c6674) {
        LinkedHashMap linkedHashMap = abstractC4307.f12879;
        InterfaceC6836 interfaceC6836 = c6679 != null ? c6679.f18089 : null;
        InterfaceC6554 interfaceC6554 = (InterfaceC6554) linkedHashMap.get(interfaceC6836);
        if (interfaceC6554 == null) {
            AbstractC7159 abstractC7159M8743 = AbstractC4311.m8743();
            abstractC7159M8743.getClass();
            new Error("Received a response for an unknown message ID: ".concat(abstractC7159M8743.m12424(AbstractC3933.m8313(C6679.Companion.serializer()), c6679)));
            return;
        }
        AbstractC4388.m8890(linkedHashMap).remove(interfaceC6836);
        AbstractC4388.m8890(abstractC4307.f12878).remove(interfaceC6836);
        if (c6679 != null) {
            interfaceC6554.invoke(c6679, null);
        } else if (c6674 != null) {
            interfaceC6554.invoke(null, new McpError(c6674.f18076.getCode(), c6674.f18075, c6674.f18074));
        } else {
            C5925.m11311("Check failed.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00e7 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #2 {all -> 0x0055, blocks: (B:22:0x0051, B:27:0x005c, B:48:0x00d6, B:50:0x00e7, B:45:0x00c6), top: B:69:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8735(io.modelcontextprotocol.kotlin.sdk.shared.AbstractC4307 r16, p056.C6678 r17, kotlin.coroutines.jvm.internal.ContinuationImpl r18) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.modelcontextprotocol.kotlin.sdk.shared.AbstractC4307.m8735(io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪苏世兰哲, 飘花落叶言世子楪兰苏哲.飘花落叶言子哲苏世楪兰, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8736(io.modelcontextprotocol.kotlin.sdk.shared.AbstractC4307 r7, final p056.C6660 r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r7.getClass()
            boolean r0 = r9 instanceof io.modelcontextprotocol.kotlin.sdk.shared.Protocol$onNotification$1
            if (r0 == 0) goto L16
            r0 = r9
            io.modelcontextprotocol.kotlin.sdk.shared.Protocol$onNotification$1 r0 = (io.modelcontextprotocol.kotlin.sdk.shared.Protocol$onNotification$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.label = r1
            goto L1b
        L16:
            io.modelcontextprotocol.kotlin.sdk.shared.Protocol$onNotification$1 r0 = new io.modelcontextprotocol.kotlin.sdk.shared.Protocol$onNotification$1
            r0.<init>(r7, r9)
        L1b:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            kotlin.飘花落叶言子楪兰苏哲世 r4 = kotlin.C5176.f14739
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 != r5) goto L34
            java.lang.Object r7 = r0.L$0
            r8 = r7
            飘花落叶言世子楪兰苏哲.飘花落叶言子哲世兰苏楪 r8 = (p056.C6660) r8
            kotlin.AbstractC5185.m10210(r9)     // Catch: java.lang.Throwable -> L32
            return r4
        L32:
            r7 = move-exception
            goto L6d
        L34:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r7)
            return r3
        L3a:
            kotlin.AbstractC5185.m10210(r9)
            飘花落叶言楪兰子哲苏世.飘花落叶言子楪世苏哲兰 r9 = io.modelcontextprotocol.kotlin.sdk.shared.AbstractC4311.f12891
            io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪世哲苏兰 r2 = new io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪世哲苏兰
            r6 = 0
            r2.<init>()
            r9.mo9047(r2)
            java.util.LinkedHashMap r7 = r7.f12880
            java.lang.String r2 = r8.f18060
            java.lang.Object r7 = r7.get(r2)
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世 r7 = (p052.InterfaceC6554) r7
            if (r7 != 0) goto L55
            goto L56
        L55:
            r3 = r7
        L56:
            if (r3 != 0) goto L61
            io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪世哲苏兰 r7 = new io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪世哲苏兰
            r7.<init>()
            r9.mo9047(r7)
            return r4
        L61:
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L32
            r0.label = r5     // Catch: java.lang.Throwable -> L32
            java.lang.Object r7 = r3.invoke(r8, r0)     // Catch: java.lang.Throwable -> L32
            if (r7 != r1) goto L6c
            return r1
        L6c:
            return r4
        L6d:
            飘花落叶言楪兰子哲苏世.飘花落叶言子楪世苏哲兰 r9 = io.modelcontextprotocol.kotlin.sdk.shared.AbstractC4311.f12891
            io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪世哲苏兰 r0 = new io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪世哲苏兰
            r1 = 2
            r0.<init>()
            r9.mo9055(r7, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.modelcontextprotocol.kotlin.sdk.shared.AbstractC4307.m8736(io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪苏世兰哲, 飘花落叶言世子楪兰苏哲.飘花落叶言子哲世兰苏楪, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b9  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m8737(kotlin.reflect.InterfaceC5087 r5, io.modelcontextprotocol.kotlin.sdk.Method$Defined r6, p052.InterfaceC6551 r7) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.modelcontextprotocol.kotlin.sdk.shared.AbstractC4307.m8737(kotlin.reflect.飘花落叶言子世楪苏兰哲, io.modelcontextprotocol.kotlin.sdk.Method$Defined, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲兰世苏):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m8738(Method$Defined method$Defined, InterfaceC6558 interfaceC6558) {
        method$Defined.getClass();
        this.f12880.put(method$Defined.getValue(), new Protocol$setNotificationHandler$1(interfaceC6558, null));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Object m8739(InterfaceC4309 interfaceC4309, InterfaceC4357 interfaceC4357) {
        InterfaceC6554 abstractTransport$onMessage$old$1;
        this.f12882 = interfaceC4309;
        C4308 c4308 = new C4308(this, 4);
        AbstractC4306 abstractC4306 = (AbstractC4306) interfaceC4309;
        abstractC4306.getClass();
        abstractC4306.f12877 = new C0004(abstractC4306.f12877, c4308);
        AbstractC4306 abstractC43062 = (AbstractC4306) interfaceC4309;
        abstractC43062.f12876 = new C0002(abstractC43062.f12876, 21, new C4207(this, 2));
        Protocol$connect$4 protocol$connect$4 = new Protocol$connect$4(this, null);
        C5438 c5438 = abstractC43062.f12875;
        boolean zMo10558 = c5438.mo10558();
        if (zMo10558) {
            abstractTransport$onMessage$old$1 = abstractC43062.f12874;
        } else {
            if (zMo10558) {
                C4211.m8611();
                return null;
            }
            abstractTransport$onMessage$old$1 = new AbstractTransport$onMessage$old$1(null);
        }
        abstractC43062.f12874 = new AbstractTransport$onMessage$1(abstractTransport$onMessage$old$1, protocol$connect$4, null);
        C5176 c5176 = C5176.f14739;
        c5438.m10588(c5176);
        Object objM8740 = AbstractC4310.m8740((AbstractC4310) interfaceC4309, (ContinuationImpl) interfaceC4357);
        return objM8740 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM8740 : c5176;
    }
}
