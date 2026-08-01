package io.modelcontextprotocol.kotlin.sdk.shared;

import androidx.activity.compose.C0002;
import androidx.activity.compose.C0004;
import io.ktor.util.C4206;
import io.ktor.util.C4210;
import io.modelcontextprotocol.kotlin.sdk.McpError;
import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import io.modelcontextprotocol.kotlin.sdk.server.C4298;
import java.util.LinkedHashMap;
import kotlin.C5175;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC4387;
import kotlin.jvm.internal.AbstractC4395;
import kotlinx.coroutines.C5437;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p056.C6673;
import p056.C6678;
import p056.C6747;
import p056.InterfaceC6835;
import p088.AbstractC7158;
import p316.C8675;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4306 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC4308 f12878;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4298 f12879;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final LinkedHashMap f12877 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final LinkedHashMap f12876 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final LinkedHashMap f12875 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final LinkedHashMap f12874 = new LinkedHashMap();

    public AbstractC4306(C4298 c4298) {
        this.f12879 = c4298;
        m8748(Method$Defined.NotificationsProgress, new C4300(this, 0));
        m8747(AbstractC4395.m8922(C6747.class), Method$Defined.Ping, new Protocol$2(null));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m8744(AbstractC4306 abstractC4306, C6678 c6678, C6673 c6673) {
        LinkedHashMap linkedHashMap = abstractC4306.f12875;
        InterfaceC6835 interfaceC6835 = c6678 != null ? c6678.f18094 : null;
        InterfaceC6553 interfaceC6553 = (InterfaceC6553) linkedHashMap.get(interfaceC6835);
        if (interfaceC6553 == null) {
            AbstractC7158 abstractC7158M8753 = AbstractC4310.m8753();
            abstractC7158M8753.getClass();
            new Error("Received a response for an unknown message ID: ".concat(abstractC7158M8753.m12397(C8675.m14355(C6678.Companion.serializer()), c6678)));
            return;
        }
        AbstractC4387.m8900(linkedHashMap).remove(interfaceC6835);
        AbstractC4387.m8900(abstractC4306.f12874).remove(interfaceC6835);
        if (c6678 != null) {
            interfaceC6553.invoke(c6678, null);
        } else if (c6673 != null) {
            interfaceC6553.invoke(null, new McpError(c6673.f18081.getCode(), c6673.f18080, c6673.f18079));
        } else {
            C5919.m11250("Check failed.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00e7 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #2 {all -> 0x0055, blocks: (B:22:0x0051, B:27:0x005c, B:48:0x00d6, B:50:0x00e7, B:45:0x00c6), top: B:69:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8745(io.modelcontextprotocol.kotlin.sdk.shared.AbstractC4306 r16, p056.C6677 r17, kotlin.coroutines.jvm.internal.ContinuationImpl r18) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.modelcontextprotocol.kotlin.sdk.shared.AbstractC4306.m8745(io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪苏世兰哲, 飘花落叶言世子楪兰苏哲.飘花落叶言子哲苏世楪兰, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8746(io.modelcontextprotocol.kotlin.sdk.shared.AbstractC4306 r7, final p056.C6659 r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
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
            kotlin.飘花落叶言子楪兰苏哲世 r4 = kotlin.C5175.f14739
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 != r5) goto L34
            java.lang.Object r7 = r0.L$0
            r8 = r7
            飘花落叶言世子楪兰苏哲.飘花落叶言子哲世兰苏楪 r8 = (p056.C6659) r8
            kotlin.AbstractC5184.m10206(r9)     // Catch: java.lang.Throwable -> L32
            return r4
        L32:
            r7 = move-exception
            goto L6d
        L34:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r7)
            return r3
        L3a:
            kotlin.AbstractC5184.m10206(r9)
            飘花落叶言楪兰子哲苏世.飘花落叶言子楪世苏哲兰 r9 = io.modelcontextprotocol.kotlin.sdk.shared.AbstractC4310.f12887
            io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪世哲苏兰 r2 = new io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪世哲苏兰
            r6 = 0
            r2.<init>()
            r9.mo9057(r2)
            java.util.LinkedHashMap r7 = r7.f12876
            java.lang.String r2 = r8.f18065
            java.lang.Object r7 = r7.get(r2)
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世 r7 = (p052.InterfaceC6553) r7
            if (r7 != 0) goto L55
            goto L56
        L55:
            r3 = r7
        L56:
            if (r3 != 0) goto L61
            io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪世哲苏兰 r7 = new io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪世哲苏兰
            r7.<init>()
            r9.mo9057(r7)
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
            飘花落叶言楪兰子哲苏世.飘花落叶言子楪世苏哲兰 r9 = io.modelcontextprotocol.kotlin.sdk.shared.AbstractC4310.f12887
            io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪世哲苏兰 r0 = new io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪世哲苏兰
            r1 = 2
            r0.<init>()
            r9.mo9065(r7, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.modelcontextprotocol.kotlin.sdk.shared.AbstractC4306.m8746(io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪苏世兰哲, 飘花落叶言世子楪兰苏哲.飘花落叶言子哲世兰苏楪, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
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
    public final void m8747(kotlin.reflect.InterfaceC5086 r5, io.modelcontextprotocol.kotlin.sdk.Method$Defined r6, p052.InterfaceC6550 r7) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.modelcontextprotocol.kotlin.sdk.shared.AbstractC4306.m8747(kotlin.reflect.飘花落叶言子世楪苏兰哲, io.modelcontextprotocol.kotlin.sdk.Method$Defined, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲兰世苏):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m8748(Method$Defined method$Defined, InterfaceC6557 interfaceC6557) {
        method$Defined.getClass();
        this.f12876.put(method$Defined.getValue(), new Protocol$setNotificationHandler$1(interfaceC6557, null));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Object m8749(InterfaceC4308 interfaceC4308, InterfaceC4356 interfaceC4356) {
        InterfaceC6553 abstractTransport$onMessage$old$1;
        this.f12878 = interfaceC4308;
        C4307 c4307 = new C4307(this, 4);
        AbstractC4305 abstractC4305 = (AbstractC4305) interfaceC4308;
        abstractC4305.getClass();
        abstractC4305.f12873 = new C0004(abstractC4305.f12873, c4307);
        AbstractC4305 abstractC43052 = (AbstractC4305) interfaceC4308;
        abstractC43052.f12872 = new C0002(abstractC43052.f12872, 21, new C4206(this, 2));
        Protocol$connect$4 protocol$connect$4 = new Protocol$connect$4(this, null);
        C5437 c5437 = abstractC43052.f12871;
        boolean zMo10560 = c5437.mo10560();
        if (zMo10560) {
            abstractTransport$onMessage$old$1 = abstractC43052.f12870;
        } else {
            if (zMo10560) {
                C4210.m8621();
                return null;
            }
            abstractTransport$onMessage$old$1 = new AbstractTransport$onMessage$old$1(null);
        }
        abstractC43052.f12870 = new AbstractTransport$onMessage$1(abstractTransport$onMessage$old$1, protocol$connect$4, null);
        C5175 c5175 = C5175.f14739;
        c5437.m10585(c5175);
        Object objM8750 = AbstractC4309.m8750((AbstractC4309) interfaceC4308, (ContinuationImpl) interfaceC4356);
        return objM8750 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM8750 : c5175;
    }
}
