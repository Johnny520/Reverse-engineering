package io.ktor.server.engine;

import com.materialkolor.dynamiccolor.C3806;
import io.ktor.server.application.AbstractC4059;
import io.ktor.util.C4208;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.InterfaceC5086;
import kotlin.reflect.InterfaceC5092;
import p059.C6856;

/* JADX INFO: renamed from: io.ktor.server.engine.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4096 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3806 f12437;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f12438;

    static {
        InterfaceC5086 interfaceC5086M8922;
        ShutDownUrl$Companion$ApplicationCallPlugin$1.INSTANCE.getClass();
        InterfaceC5092 interfaceC5092Mo8927 = AbstractC4395.f12971.mo8927(AbstractC4059.class);
        try {
            interfaceC5086M8922 = AbstractC4395.m8922(AbstractC4059.class);
        } catch (Throwable unused) {
            interfaceC5086M8922 = null;
        }
        new C4208("shutdown.url", new C6856(interfaceC5092Mo8927, interfaceC5086M8922));
    }

    public C4096(String str, C3806 c3806) {
        this.f12438 = str;
        this.f12437 = c3806;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m8509(io.ktor.server.application.InterfaceC4056 r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) throws java.lang.Throwable {
        /*
            r12 = this;
            java.lang.Class<飘花落叶言楪兰世哲子苏.飘花落叶言子世楪哲苏兰> r0 = p236.C8096.class
            boolean r1 = r14 instanceof io.ktor.server.engine.ShutDownUrl$doShutdown$1
            if (r1 == 0) goto L15
            r1 = r14
            io.ktor.server.engine.ShutDownUrl$doShutdown$1 r1 = (io.ktor.server.engine.ShutDownUrl$doShutdown$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            io.ktor.server.engine.ShutDownUrl$doShutdown$1 r1 = new io.ktor.server.engine.ShutDownUrl$doShutdown$1
            r1.<init>(r12, r14)
        L1a:
            java.lang.Object r14 = r1.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r1.label
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L38
            if (r3 != r4) goto L32
            java.lang.Object r12 = r1.L$0
            kotlinx.coroutines.飘花落叶言子楪哲苏兰世 r12 = (kotlinx.coroutines.InterfaceC5440) r12
            kotlin.AbstractC5184.m10206(r14)     // Catch: java.lang.Throwable -> L2e
            goto L92
        L2e:
            r0 = move-exception
            r13 = r0
            goto La2
        L32:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r12)
            return r5
        L38:
            kotlin.AbstractC5184.m10206(r14)
            io.ktor.server.application.飘花落叶言子楪世苏哲兰 r14 = r13.mo8470()
            r14.getClass()
            io.ktor.server.application.飘花落叶言子楪世哲兰苏 r14 = r14.f12337
            io.ktor.server.engine.飘花落叶言子楪世哲苏兰 r14 = (io.ktor.server.engine.C4091) r14
            飘花落叶言苏楪子哲兰世.飘花落叶言子楪世苏兰哲 r14 = r14.f12433
            java.lang.String r3 = "Shutdown URL was called: server is going down"
            r14.warn(r3)
            io.ktor.server.application.飘花落叶言子楪世苏哲兰 r8 = r13.mo8470()
            io.ktor.server.application.飘花落叶言子楪世哲兰苏 r9 = r8.f12337
            com.materialkolor.dynamiccolor.飘花落叶言子楪兰苏世哲 r12 = r12.f12437
            r12.invoke(r13)
            r12 = 0
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            int r10 = r12.intValue()
            kotlinx.coroutines.飘花落叶言子楪哲兰世苏 r7 = kotlinx.coroutines.AbstractC5398.m10486()
            io.ktor.server.application.飘花落叶言子楪世苏哲兰 r12 = r13.mo8470()
            io.ktor.server.engine.ShutDownUrl$doShutdown$2 r6 = new io.ktor.server.engine.ShutDownUrl$doShutdown$2
            r11 = 0
            r6.<init>(r7, r8, r9, r10, r11)
            r14 = 3
            kotlinx.coroutines.AbstractC5398.m10473(r12, r5, r5, r6, r14)
            飘花落叶言楪兰世哲子苏.飘花落叶言子世楪哲苏兰 r12 = p236.C8096.f22344     // Catch: java.lang.Throwable -> L9a
            kotlin.jvm.internal.飘花落叶言子楪苏兰哲世 r14 = kotlin.jvm.internal.AbstractC4395.f12971     // Catch: java.lang.Throwable -> L9e
            kotlin.reflect.飘花落叶言子楪世哲兰苏 r14 = r14.mo8927(r0)     // Catch: java.lang.Throwable -> L9e
            kotlin.reflect.飘花落叶言子世楪苏兰哲 r0 = kotlin.jvm.internal.AbstractC4395.m8922(r0)     // Catch: java.lang.Throwable -> L80
            goto L81
        L80:
            r0 = r5
        L81:
            飘花落叶言世子楪苏哲兰.飘花落叶言子楪世苏哲兰 r3 = new 飘花落叶言世子楪苏哲兰.飘花落叶言子楪世苏哲兰     // Catch: java.lang.Throwable -> L9a
            r3.<init>(r14, r0)     // Catch: java.lang.Throwable -> L9a
            r1.L$0 = r7     // Catch: java.lang.Throwable -> L9a
            r1.label = r4     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r12 = r13.mo8472(r12, r3, r1)     // Catch: java.lang.Throwable -> L9a
            if (r12 != r2) goto L91
            return r2
        L91:
            r12 = r7
        L92:
            kotlinx.coroutines.飘花落叶言子苏哲世兰楪 r12 = (kotlinx.coroutines.C5459) r12
            r12.mo10252(r5)
            kotlin.飘花落叶言子楪兰苏哲世 r12 = kotlin.C5175.f14739
            return r12
        L9a:
            r0 = move-exception
            r13 = r0
        L9c:
            r12 = r7
            goto La2
        L9e:
            r0 = move-exception
            r12 = r0
            r13 = r12
            goto L9c
        La2:
            kotlinx.coroutines.飘花落叶言子苏哲世兰楪 r12 = (kotlinx.coroutines.C5459) r12
            r12.mo10252(r5)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.engine.C4096.m8509(io.ktor.server.application.飘花落叶言子楪世苏兰哲, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
