package io.ktor.client.call;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.InterfaceC4360;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.text.AbstractC5144;
import kotlinx.coroutines.InterfaceC5401;
import p241.InterfaceC8141;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: io.ktor.client.call.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C3868 implements InterfaceC5401 {
    private volatile /* synthetic */ int received;

    static {
        AbstractC4396.f12975.mo8917(Object.class);
        try {
            AbstractC4396.m8912(Object.class);
        } catch (Throwable unused) {
        }
        if (AbstractC5144.m10172("CustomResponse")) {
            C5925.m11310("Name can't be blank");
        } else {
            AtomicIntegerFieldUpdater.newUpdater(C3868.class, "received");
        }
    }

    public final String toString() {
        m8251();
        throw null;
    }

    @Override // kotlinx.coroutines.InterfaceC5401
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final InterfaceC4360 mo2430() {
        m8250();
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m8250() {
        AbstractC4395.m8908("response");
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC8141 m8251() {
        AbstractC4395.m8908("request");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m8252(kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof io.ktor.client.call.HttpClientCall$bodyNullable$1
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.client.call.HttpClientCall$bodyNullable$1 r0 = (io.ktor.client.call.HttpClientCall$bodyNullable$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.call.HttpClientCall$bodyNullable$1 r0 = new io.ktor.client.call.HttpClientCall$bodyNullable$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r0.label
            r2 = 0
            if (r1 == 0) goto L7d
            r4 = 1
            if (r1 == r4) goto L68
            r4 = 2
            if (r1 != r4) goto L62
            java.lang.Object r4 = r0.L$1
            飘花落叶言世子楪苏哲兰.飘花落叶言子楪世苏哲兰 r4 = (p059.C6857) r4
            java.lang.Object r0 = r0.L$0
            io.ktor.client.call.飘花落叶言子楪世苏哲兰 r0 = (io.ktor.client.call.C3868) r0
            kotlin.AbstractC5185.m10210(r5)     // Catch: java.lang.Throwable -> L5f
            io.ktor.client.statement.飘花落叶言子楪世苏兰哲 r5 = (io.ktor.client.statement.C3945) r5     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r5 = r5.f12157     // Catch: java.lang.Throwable -> L5f
            io.ktor.http.content.飘花落叶言子楪苏世兰哲 r1 = io.ktor.http.content.C3992.f12247     // Catch: java.lang.Throwable -> L5f
            boolean r1 = kotlin.jvm.internal.AbstractC4395.m8907(r5, r1)     // Catch: java.lang.Throwable -> L5f
            if (r1 != 0) goto L3f
            goto L40
        L3f:
            r5 = r2
        L40:
            if (r5 == 0) goto L61
            kotlin.reflect.飘花落叶言子楪世哲兰苏 r4 = r4.f18298     // Catch: java.lang.Throwable -> L5f
            r4.getClass()     // Catch: java.lang.Throwable -> L5f
            java.lang.Class r4 = com.bumptech.glide.AbstractC3057.m6756(r4)     // Catch: java.lang.Throwable -> L5f
            boolean r4 = r4.isInstance(r5)     // Catch: java.lang.Throwable -> L5f
            if (r4 == 0) goto L52
            goto L61
        L52:
            java.lang.Class r4 = r5.getClass()     // Catch: java.lang.Throwable -> L5f
            kotlin.jvm.internal.飘花落叶言子楪苏兰哲世 r5 = kotlin.jvm.internal.AbstractC4396.f12975     // Catch: java.lang.Throwable -> L5f
            r5.mo8917(r4)     // Catch: java.lang.Throwable -> L5f
            r0.m8250()     // Catch: java.lang.Throwable -> L5f
            throw r2     // Catch: java.lang.Throwable -> L5f
        L5f:
            r4 = r0
            goto L84
        L61:
            return r5
        L62:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r4)
            return r2
        L68:
            java.lang.Object r4 = r0.L$1
            飘花落叶言世子楪苏哲兰.飘花落叶言子楪世苏哲兰 r4 = (p059.C6857) r4
            java.lang.Object r0 = r0.L$0
            io.ktor.client.call.飘花落叶言子楪世苏哲兰 r0 = (io.ktor.client.call.C3868) r0
            kotlin.AbstractC5185.m10210(r5)     // Catch: java.lang.Throwable -> L5f
            r4.getClass()     // Catch: java.lang.Throwable -> L5f
            r5.getClass()     // Catch: java.lang.Throwable -> L5f
            r0.getClass()     // Catch: java.lang.Throwable -> L5f
            throw r2     // Catch: java.lang.Throwable -> L5f
        L7d:
            kotlin.AbstractC5185.m10210(r5)
            r4.m8250()     // Catch: java.lang.Throwable -> L84
            throw r2     // Catch: java.lang.Throwable -> L84
        L84:
            r4.m8250()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.call.C3868.m8252(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
