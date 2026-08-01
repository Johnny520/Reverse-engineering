package top.suzhelan.qstory.hook.item.mcp.config;

import androidx.activity.AbstractC0053;
import com.bumptech.glide.AbstractC3055;
import com.bumptech.glide.AbstractC3056;
import io.ktor.server.engine.AbstractC4092;
import io.ktor.server.engine.C4101;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.C5175;
import kotlin.Result;
import kotlin.collections.AbstractC4343;
import kotlinx.coroutines.AbstractC5394;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.C5421;
import kotlinx.coroutines.channels.InterfaceC5206;
import kotlinx.coroutines.internal.C5350;
import kotlinx.coroutines.sync.C5379;
import p052.InterfaceC6557;
import p095.C7206;
import p095.ExecutorC7207;
import p253.AbstractC8189;
import p325.AbstractC8750;
import p325.C8756;
import p325.C8763;
import p325.C8764;
import p325.C8767;
import p325.C8768;
import p325.InterfaceC8761;
import p391.C9114;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.mcp.config.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5866 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C5868 f16023;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C5379 f16024;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C5350 f16025;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final ArrayList f16026;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static C5866 f16027;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C9114 f16028;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final CopyOnWriteArrayList f16029;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C4101 f16030;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC6557 f16031;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f16032;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f16033;

    static {
        "McpServerConfig";
        "tool_order";
        "tool_enabled_";
        "/mcp";
        f16023 = new C5868();
        C5421 c5421M10483 = AbstractC5398.m10483();
        C7206 c7206 = AbstractC5394.f15030;
        f16025 = AbstractC5398.m10485(AbstractC3055.m6636(ExecutorC7207.f19230, c5421M10483));
        f16024 = new C5379();
        f16028 = new C9114("McpServerConfig", 0);
        ArrayList arrayListM8825 = AbstractC4343.m8825(AbstractC8750.f24658, AbstractC8189.m13659(C8763.f24686, C8767.f24698, C8764.f24691, C8768.f24703, C8756.f24675));
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListM8825) {
            if (hashSet.add(((InterfaceC8761) obj).getId())) {
                arrayList.add(obj);
            }
        }
        f16026 = arrayList;
    }

    public C5866(InterfaceC6557 interfaceC6557, int i) {
        String strM6668 = "QStoryMCP";
        "serverName";
        "onLog";
        this.f16033 = i;
        this.f16032 = strM6668;
        this.f16031 = interfaceC6557;
        this.f16029 = new CopyOnWriteArrayList();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m11205(C5866 c5866) {
        Object objM162;
        CopyOnWriteArrayList<InterfaceC5206> copyOnWriteArrayList = c5866.f16029;
        InterfaceC6557 interfaceC6557 = c5866.f16031;
        try {
            interfaceC6557.invoke("MCP \u670d\u52a1 \u6b63\u5728\u505c\u6b62");
            C4101 c4101 = c5866.f16030;
            if (c4101 != null) {
                c4101.m8518(1000L, 2000L);
            }
            for (InterfaceC5206 interfaceC5206 : copyOnWriteArrayList) {
                interfaceC5206.getClass();
                interfaceC5206.mo8446(null);
            }
            copyOnWriteArrayList.clear();
            interfaceC6557.invoke("MCP \u670d\u52a1 \u505c\u6b62\u6210\u529f");
            objM162 = Result.m8755constructorimpl(C5175.f14739);
        } catch (Throwable th) {
            objM162 = AbstractC0053.m162(th);
        }
        Throwable thM8758exceptionOrNullimpl = Result.m8758exceptionOrNullimpl(objM162);
        if (thM8758exceptionOrNullimpl != null) {
            interfaceC6557.invoke("MCP \u670d\u52a1 \u505c\u6b62\u5931\u8d25: " + thM8758exceptionOrNullimpl);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m11206(C5866 c5866) {
        Object objM162;
        int i = c5866.f16033;
        InterfaceC6557 interfaceC6557 = c5866.f16031;
        try {
            c5866.f16030 = AbstractC4092.m8502(i, new C5870(c5866, 2));
            interfaceC6557.invoke("MCP \u670d\u52a1 \u6b63\u5728\u542f\u52a8");
            C4101 c4101 = c5866.f16030;
            if (c4101 != null) {
                c4101.m8513();
            }
            interfaceC6557.invoke("MCP \u670d\u52a1 \u542f\u52a8\u6210\u529f: " + i);
            objM162 = Result.m8755constructorimpl(C5175.f14739);
        } catch (Throwable th) {
            objM162 = AbstractC0053.m162(th);
        }
        Throwable thM8758exceptionOrNullimpl = Result.m8758exceptionOrNullimpl(objM162);
        if (thM8758exceptionOrNullimpl != null) {
            interfaceC6557.invoke("MCP \u670d\u52a1 \u542f\u52a8\u5931\u8d25: " + thM8758exceptionOrNullimpl);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:104:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010f A[Catch: BadContentTypeFormatException -> 0x011a, TryCatch #3 {BadContentTypeFormatException -> 0x011a, blocks: (B:25:0x00f2, B:27:0x0107, B:30:0x0111, B:32:0x0117, B:29:0x010f), top: B:146:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m11207(top.suzhelan.qstory.hook.item.mcp.config.C5866 r34, io.ktor.server.routing.C4162 r35, java.lang.String r36, kotlin.coroutines.jvm.internal.ContinuationImpl r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: top.suzhelan.qstory.hook.item.mcp.config.C5866.m11207(top.suzhelan.qstory.hook.item.mcp.config.飘花落叶言子楪世兰苏哲, io.ktor.server.routing.飘花落叶言子楪哲兰苏世, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m11208(java.lang.String r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof top.suzhelan.qstory.hook.item.mcp.config.McpServerManager$broadcastMessage$1
            if (r0 == 0) goto L13
            r0 = r9
            top.suzhelan.qstory.hook.item.mcp.config.McpServerManager$broadcastMessage$1 r0 = (top.suzhelan.qstory.hook.item.mcp.config.McpServerManager$broadcastMessage$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            top.suzhelan.qstory.hook.item.mcp.config.McpServerManager$broadcastMessage$1 r0 = new top.suzhelan.qstory.hook.item.mcp.config.McpServerManager$broadcastMessage$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            java.util.concurrent.CopyOnWriteArrayList r4 = r7.f16029
            if (r2 == 0) goto L47
            if (r2 != r3) goto L39
            java.lang.Object r8 = r0.L$3
            kotlinx.coroutines.channels.飘花落叶言子楪苏世兰哲 r8 = (kotlinx.coroutines.channels.InterfaceC5206) r8
            java.lang.Object r2 = r0.L$2
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r5 = r0.L$1
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r6 = r0.L$0
            java.lang.String r6 = (java.lang.String) r6
            kotlin.AbstractC5184.m10206(r9)     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L7e
            goto L81
        L39:
            r7 = -3937693499584152999(0xc95a809ffaebfa59, double:-2.3640967447586732E45)
            java.lang.String r7 = com.bumptech.glide.AbstractC3056.m6668(r7)
            top.suzhelan.qstory.hook.item.C5919.m11250(r7)
            r7 = 0
            return r7
        L47:
            kotlin.AbstractC5184.m10206(r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r2 = r4.iterator()
            r5 = -3937693916195980711(0xc95a803efaebfa59, double:-2.363964715200308E45)
            com.bumptech.glide.AbstractC3056.m6668(r5)
            r2.getClass()
            r5 = r9
        L5f:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L83
            java.lang.Object r9 = r2.next()
            kotlinx.coroutines.channels.飘花落叶言子楪苏世兰哲 r9 = (kotlinx.coroutines.channels.InterfaceC5206) r9
            r0.L$0 = r8     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L7c
            r0.L$1 = r5     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L7c
            r0.L$2 = r2     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L7c
            r0.L$3 = r9     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L7c
            r0.label = r3     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L7c
            java.lang.Object r9 = r9.mo8443(r8, r0)     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L7c
            if (r9 != r1) goto L5f
            return r1
        L7c:
            r6 = r8
            r8 = r9
        L7e:
            r5.add(r8)
        L81:
            r8 = r6
            goto L5f
        L83:
            java.util.Set r8 = kotlin.collections.AbstractC4343.m8800(r5)
            java.util.Collection r8 = (java.util.Collection) r8
            r4.removeAll(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r0 = -3937806384209593767(0xc95a19f4faebfa59, double:-2.328322178959541E45)
            java.lang.String r9 = com.bumptech.glide.AbstractC3056.m6668(r0)
            r8.append(r9)
            int r9 = r4.size()
            r8.append(r9)
            r0 = -3937806276835411367(0xc95a1a0dfaebfa59, double:-2.3283562071962332E45)
            java.lang.String r9 = com.bumptech.glide.AbstractC3056.m6668(r0)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世 r7 = r7.f16031
            r7.invoke(r8)
            kotlin.飘花落叶言子楪兰苏哲世 r7 = kotlin.C5175.f14739
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: top.suzhelan.qstory.hook.item.mcp.config.C5866.m11208(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
