package io.ktor.client.call;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.InterfaceC4359;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.text.AbstractC5143;
import kotlinx.coroutines.InterfaceC5400;
import p241.InterfaceC8140;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: io.ktor.client.call.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C3867 implements InterfaceC5400 {
    private volatile /* synthetic */ int received;

    static {
        AbstractC4395.f12971.mo8927(Object.class);
        try {
            AbstractC4395.m8922(Object.class);
        } catch (Throwable unused) {
        }
        if (AbstractC5143.m10164("CustomResponse")) {
            C5919.m11249("Name can't be blank");
        } else {
            AtomicIntegerFieldUpdater.newUpdater(C3867.class, "received");
        }
    }

    public final String toString() {
        m8264();
        throw null;
    }

    @Override // kotlinx.coroutines.InterfaceC5400
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final InterfaceC4359 mo2420() {
        m8263();
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m8263() {
        AbstractC4394.m8918("response");
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC8140 m8264() {
        AbstractC4394.m8918("request");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m8265(kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
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
            飘花落叶言世子楪苏哲兰.飘花落叶言子楪世苏哲兰 r4 = (p059.C6856) r4
            java.lang.Object r0 = r0.L$0
            io.ktor.client.call.飘花落叶言子楪世苏哲兰 r0 = (io.ktor.client.call.C3867) r0
            kotlin.AbstractC5184.m10206(r5)     // Catch: java.lang.Throwable -> L5f
            io.ktor.client.statement.飘花落叶言子楪世苏兰哲 r5 = (io.ktor.client.statement.C3944) r5     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r5 = r5.f12153     // Catch: java.lang.Throwable -> L5f
            io.ktor.http.content.飘花落叶言子楪苏世兰哲 r1 = io.ktor.http.content.C3991.f12243     // Catch: java.lang.Throwable -> L5f
            boolean r1 = kotlin.jvm.internal.AbstractC4394.m8917(r5, r1)     // Catch: java.lang.Throwable -> L5f
            if (r1 != 0) goto L3f
            goto L40
        L3f:
            r5 = r2
        L40:
            if (r5 == 0) goto L61
            kotlin.reflect.飘花落叶言子楪世哲兰苏 r4 = r4.f18303     // Catch: java.lang.Throwable -> L5f
            r4.getClass()     // Catch: java.lang.Throwable -> L5f
            java.lang.Class r4 = p053.AbstractC6560.m12029(r4)     // Catch: java.lang.Throwable -> L5f
            boolean r4 = r4.isInstance(r5)     // Catch: java.lang.Throwable -> L5f
            if (r4 == 0) goto L52
            goto L61
        L52:
            java.lang.Class r4 = r5.getClass()     // Catch: java.lang.Throwable -> L5f
            kotlin.jvm.internal.飘花落叶言子楪苏兰哲世 r5 = kotlin.jvm.internal.AbstractC4395.f12971     // Catch: java.lang.Throwable -> L5f
            r5.mo8927(r4)     // Catch: java.lang.Throwable -> L5f
            r0.m8263()     // Catch: java.lang.Throwable -> L5f
            throw r2     // Catch: java.lang.Throwable -> L5f
        L5f:
            r4 = r0
            goto L84
        L61:
            return r5
        L62:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r4)
            return r2
        L68:
            java.lang.Object r4 = r0.L$1
            飘花落叶言世子楪苏哲兰.飘花落叶言子楪世苏哲兰 r4 = (p059.C6856) r4
            java.lang.Object r0 = r0.L$0
            io.ktor.client.call.飘花落叶言子楪世苏哲兰 r0 = (io.ktor.client.call.C3867) r0
            kotlin.AbstractC5184.m10206(r5)     // Catch: java.lang.Throwable -> L5f
            r4.getClass()     // Catch: java.lang.Throwable -> L5f
            r5.getClass()     // Catch: java.lang.Throwable -> L5f
            r0.getClass()     // Catch: java.lang.Throwable -> L5f
            throw r2     // Catch: java.lang.Throwable -> L5f
        L7d:
            kotlin.AbstractC5184.m10206(r5)
            r4.m8263()     // Catch: java.lang.Throwable -> L84
            throw r2     // Catch: java.lang.Throwable -> L84
        L84:
            r4.m8263()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.call.C3867.m8265(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
