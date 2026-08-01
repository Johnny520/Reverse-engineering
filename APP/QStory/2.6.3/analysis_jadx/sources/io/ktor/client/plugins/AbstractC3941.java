package io.ktor.client.plugins;

import com.materialkolor.dynamiccolor.C3807;
import io.ktor.util.C4209;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5093;
import p059.C6857;
import p175.AbstractC7739;
import p398.AbstractC9139;
import p398.InterfaceC9141;

/* JADX INFO: renamed from: io.ktor.client.plugins.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3941 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C4209 f12155;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC9141 f12156;

    static {
        InterfaceC5087 interfaceC5087M8912;
        InterfaceC9141 interfaceC9141M14703 = AbstractC9139.m14703("io.ktor.client.plugins.HttpCallValidator");
        interfaceC9141M14703.getClass();
        f12156 = interfaceC9141M14703;
        AbstractC7739.m13085("HttpResponseValidator", HttpCallValidatorKt$HttpCallValidator$1.INSTANCE, new C3807(2));
        InterfaceC5093 interfaceC5093Mo8917 = AbstractC4396.f12975.mo8917(Boolean.class);
        try {
            interfaceC5087M8912 = AbstractC4396.m8912(Boolean.TYPE);
        } catch (Throwable unused) {
            interfaceC5087M8912 = null;
        }
        f12155 = new C4209("ExpectSuccessAttributeKey", new C6857(interfaceC5093Mo8917, interfaceC5087M8912));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8325(kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            boolean r0 = r6 instanceof io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$validateResponse$1
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$validateResponse$1 r0 = (io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$validateResponse$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$validateResponse$1 r0 = new io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$validateResponse$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            if (r2 == 0) goto L55
            r4 = 1
            if (r2 != r4) goto L4f
            java.lang.Object r2 = r0.L$1
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r5 = r0.L$0
            if (r5 != 0) goto L4b
            kotlin.AbstractC5185.m10210(r6)
        L2f:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L48
            java.lang.Object r6 = r2.next()
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世 r6 = (p052.InterfaceC6554) r6
            r0.L$0 = r3
            r0.L$1 = r2
            r0.label = r4
            java.lang.Object r6 = r6.invoke(r3, r0)
            if (r6 != r1) goto L2f
            return r1
        L48:
            kotlin.飘花落叶言子楪兰苏哲世 r6 = kotlin.C5176.f14739
            return r6
        L4b:
            com.alibaba.fastjson2.C2942.m6394()
            return r3
        L4f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r6)
            return r3
        L55:
            kotlin.AbstractC5185.m10210(r6)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.AbstractC3941.m8325(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m8326(java.util.List r4, java.lang.Throwable r5, p241.InterfaceC8141 r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            boolean r0 = r7 instanceof io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$processException$1
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$processException$1 r0 = (io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$processException$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$processException$1 r0 = new io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$processException$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r0.label
            if (r1 == 0) goto L3c
            r4 = 1
            if (r1 == r4) goto L26
            r4 = 2
            if (r1 != r4) goto L36
        L26:
            java.lang.Object r4 = r0.L$2
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r5 = r0.L$1
            飘花落叶言楪兰世苏子哲.飘花落叶言子楪世苏哲兰 r5 = (p241.InterfaceC8141) r5
            java.lang.Object r5 = r0.L$0
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            kotlin.AbstractC5185.m10210(r7)
            goto L62
        L36:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r4)
            return
        L3c:
            kotlin.AbstractC5185.m10210(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Processing exception "
            r7.<init>(r0)
            r7.append(r5)
            java.lang.String r5 = " for request "
            r7.append(r5)
            io.ktor.client.plugins.飘花落叶言子楪苏哲世兰 r6 = (io.ktor.client.plugins.C3940) r6
            飘花落叶言楪兰世哲子苏.飘花落叶言子世哲苏楪兰 r5 = r6.f12154
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            飘花落叶言苏楪子哲世兰.飘花落叶言子楪世苏兰哲 r6 = io.ktor.client.plugins.AbstractC3941.f12156
            r6.trace(r5)
            java.util.Iterator r4 = r4.iterator()
        L62:
            boolean r5 = r4.hasNext()
            if (r5 != 0) goto L69
            return
        L69:
            java.lang.Object r4 = r4.next()
            if (r4 != 0) goto L73
            io.ktor.util.C4211.m8611()
            return
        L73:
            com.alibaba.fastjson2.C2942.m6394()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.AbstractC3941.m8326(java.util.List, java.lang.Throwable, 飘花落叶言楪兰世苏子哲.飘花落叶言子楪世苏哲兰, kotlin.coroutines.jvm.internal.ContinuationImpl):void");
    }
}
