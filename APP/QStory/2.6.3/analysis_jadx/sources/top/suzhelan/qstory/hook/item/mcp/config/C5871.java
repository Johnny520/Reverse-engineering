package top.suzhelan.qstory.hook.item.mcp.config;

import androidx.activity.AbstractC0053;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import io.ktor.server.engine.AbstractC4093;
import io.ktor.server.engine.C4102;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.C5176;
import kotlin.Result;
import kotlin.collections.AbstractC4344;
import kotlinx.coroutines.AbstractC5395;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.C5422;
import kotlinx.coroutines.channels.InterfaceC5207;
import kotlinx.coroutines.internal.C5351;
import kotlinx.coroutines.sync.C5380;
import p034.AbstractC6347;
import p052.InterfaceC6558;
import p095.C7207;
import p095.ExecutorC7208;
import p287.AbstractC8405;
import p329.AbstractC8758;
import p329.C8764;
import p329.C8771;
import p329.C8772;
import p329.C8775;
import p329.C8776;
import p329.InterfaceC8769;
import p391.C9095;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.mcp.config.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5871 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C5873 f16030;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C5380 f16031;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C5351 f16032;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final ArrayList f16033;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static C5871 f16034;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C9095 f16035;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final CopyOnWriteArrayList f16036;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C4102 f16037;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC6558 f16038;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f16039;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f16040;

    static {
        AbstractC8405.m13972(2342);
        AbstractC8405.m13972(2298);
        AbstractC8405.m13972(2299);
        AbstractC8405.m13973(AbstractC8405.m13972(2343));
        f16030 = new C5873();
        C5422 c5422M10487 = AbstractC5399.m10487();
        C7207 c7207 = AbstractC5395.f15030;
        f16032 = AbstractC5399.m10489(AbstractC0455.m1154(ExecutorC7208.f19225, c5422M10487));
        f16031 = new C5380();
        f16035 = new C9095(AbstractC8405.m13972(2342), 0);
        ArrayList arrayListM8793 = AbstractC4344.m8793(AbstractC8758.f24683, AbstractC6347.m11931(C8771.f24711, C8775.f24723, C8772.f24716, C8776.f24728, C8764.f24700));
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListM8793) {
            if (hashSet.add(((InterfaceC8769) obj).getId())) {
                arrayList.add(obj);
            }
        }
        f16033 = arrayList;
    }

    public C5871(InterfaceC6558 interfaceC6558, int i) {
        String strM13972 = AbstractC8405.m13972(2309);
        AbstractC8405.m13972(2308);
        AbstractC8405.m13973("喵喵喵呜呜呜喵喵~喵喵喵呜呜喵呜呜~喵喵呜呜喵呜呜喵~喵喵喵喵喵呜呜呜~喵喵喵喵喵喵呜喵");
        this.f16040 = i;
        this.f16039 = strM13972;
        this.f16038 = interfaceC6558;
        this.f16036 = new CopyOnWriteArrayList();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m11267(C5871 c5871) {
        Object objM163;
        CopyOnWriteArrayList<InterfaceC5207> copyOnWriteArrayList = c5871.f16036;
        InterfaceC6558 interfaceC6558 = c5871.f16038;
        try {
            interfaceC6558.invoke(AbstractC8405.m13972(2313));
            C4102 c4102 = c5871.f16037;
            if (c4102 != null) {
                c4102.m8508(1000L, 2000L);
            }
            for (InterfaceC5207 interfaceC5207 : copyOnWriteArrayList) {
                interfaceC5207.getClass();
                interfaceC5207.mo8435(null);
            }
            copyOnWriteArrayList.clear();
            interfaceC6558.invoke(AbstractC8405.m13972(2314));
            objM163 = Result.m8745constructorimpl(C5176.f14739);
        } catch (Throwable th) {
            objM163 = AbstractC0053.m163(th);
        }
        Throwable thM8748exceptionOrNullimpl = Result.m8748exceptionOrNullimpl(objM163);
        if (thM8748exceptionOrNullimpl != null) {
            interfaceC6558.invoke(AbstractC8405.m13972(2315) + thM8748exceptionOrNullimpl);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m11268(C5871 c5871) {
        Object objM163;
        int i = c5871.f16040;
        InterfaceC6558 interfaceC6558 = c5871.f16038;
        try {
            c5871.f16037 = AbstractC4093.m8492(i, new C5875(c5871, 2));
            interfaceC6558.invoke(AbstractC8405.m13972(2310));
            C4102 c4102 = c5871.f16037;
            if (c4102 != null) {
                c4102.m8503();
            }
            interfaceC6558.invoke(AbstractC8405.m13972(2311) + i);
            objM163 = Result.m8745constructorimpl(C5176.f14739);
        } catch (Throwable th) {
            objM163 = AbstractC0053.m163(th);
        }
        Throwable thM8748exceptionOrNullimpl = Result.m8748exceptionOrNullimpl(objM163);
        if (thM8748exceptionOrNullimpl != null) {
            interfaceC6558.invoke(AbstractC8405.m13972(2312) + thM8748exceptionOrNullimpl);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010d A[Catch: BadContentTypeFormatException -> 0x0118, TryCatch #1 {BadContentTypeFormatException -> 0x0118, blocks: (B:25:0x00f0, B:27:0x0105, B:30:0x010f, B:32:0x0115, B:29:0x010d), top: B:145:0x00f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m11269(top.suzhelan.qstory.hook.item.mcp.config.C5871 r24, io.ktor.server.routing.C4163 r25, java.lang.String r26, kotlin.coroutines.jvm.internal.ContinuationImpl r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: top.suzhelan.qstory.hook.item.mcp.config.C5871.m11269(top.suzhelan.qstory.hook.item.mcp.config.飘花落叶言子楪世兰苏哲, io.ktor.server.routing.飘花落叶言子楪哲兰苏世, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m11270(java.lang.String r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
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
            java.util.concurrent.CopyOnWriteArrayList r4 = r7.f16036
            if (r2 == 0) goto L44
            if (r2 != r3) goto L39
            java.lang.Object r8 = r0.L$3
            kotlinx.coroutines.channels.飘花落叶言子楪苏世兰哲 r8 = (kotlinx.coroutines.channels.InterfaceC5207) r8
            java.lang.Object r2 = r0.L$2
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r5 = r0.L$1
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r6 = r0.L$0
            java.lang.String r6 = (java.lang.String) r6
            kotlin.AbstractC5185.m10210(r9)     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L78
            goto L7b
        L39:
            r7 = 1261(0x4ed, float:1.767E-42)
            java.lang.String r7 = p287.AbstractC8405.m13972(r7)
            top.suzhelan.qstory.hook.item.C5925.m11311(r7)
            r7 = 0
            return r7
        L44:
            kotlin.AbstractC5185.m10210(r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r2 = r4.iterator()
            r5 = 1253(0x4e5, float:1.756E-42)
            p287.AbstractC8405.m13972(r5)
            r2.getClass()
            r5 = r9
        L59:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L7d
            java.lang.Object r9 = r2.next()
            kotlinx.coroutines.channels.飘花落叶言子楪苏世兰哲 r9 = (kotlinx.coroutines.channels.InterfaceC5207) r9
            r0.L$0 = r8     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L76
            r0.L$1 = r5     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L76
            r0.L$2 = r2     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L76
            r0.L$3 = r9     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L76
            r0.label = r3     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L76
            java.lang.Object r9 = r9.mo8433(r8, r0)     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L76
            if (r9 != r1) goto L59
            return r1
        L76:
            r6 = r8
            r8 = r9
        L78:
            r5.add(r8)
        L7b:
            r8 = r6
            goto L59
        L7d:
            java.util.Set r8 = kotlin.collections.AbstractC4344.m8788(r5)
            java.util.Collection r8 = (java.util.Collection) r8
            r4.removeAll(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r9 = 2327(0x917, float:3.261E-42)
            java.lang.String r9 = p287.AbstractC8405.m13972(r9)
            r8.append(r9)
            int r9 = r4.size()
            r8.append(r9)
            r9 = 2328(0x918, float:3.262E-42)
            java.lang.String r9 = p287.AbstractC8405.m13972(r9)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世 r7 = r7.f16038
            r7.invoke(r8)
            kotlin.飘花落叶言子楪兰苏哲世 r7 = kotlin.C5176.f14739
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: top.suzhelan.qstory.hook.item.mcp.config.C5871.m11270(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
