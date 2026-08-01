package io.ktor.server.http.content;

import io.ktor.server.application.AbstractC4059;
import io.ktor.util.C4208;
import java.io.File;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.InterfaceC5086;
import kotlin.reflect.InterfaceC5092;
import kotlin.text.AbstractC5143;
import p059.C6856;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: io.ktor.server.http.content.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4121 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4208 f12509;

    static {
        InterfaceC5086 interfaceC5086M8922;
        InterfaceC5092 interfaceC5092Mo8927 = AbstractC4395.f12971.mo8927(String.class);
        try {
            interfaceC5086M8922 = AbstractC4395.m8922(String.class);
        } catch (Throwable unused) {
            interfaceC5086M8922 = null;
        }
        f12509 = new C4208("StaticFileLocation", new C6856(interfaceC5092Mo8927, interfaceC5086M8922));
        AbstractC4395.f12971.mo8927(File.class);
        try {
            AbstractC4395.m8922(File.class);
        } catch (Throwable unused2) {
        }
        if (AbstractC5143.m10164("BaseFolder")) {
            C5919.m11249("Name can't be blank");
            return;
        }
        AbstractC4395.f12971.mo8927(AbstractC4059.class);
        try {
            AbstractC4395.m8922(AbstractC4059.class);
        } catch (Throwable unused3) {
        }
        if (AbstractC5143.m10164("StaticContentAutoHead")) {
            C5919.m11249("Name can't be blank");
            return;
        }
        AbstractC4395.f12971.mo8927(String.class);
        try {
            AbstractC4395.m8922(String.class);
        } catch (Throwable unused4) {
        }
        if (AbstractC5143.m10164("BasePackage")) {
            C5919.m11249("Name can't be blank");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8525(p052.InterfaceC6557 r5, io.ktor.server.application.InterfaceC4056 r6, java.nio.file.Path r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            boolean r0 = r8 instanceof io.ktor.server.http.content.StaticContentKt$respondStaticPath$checkExclude$1
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.server.http.content.StaticContentKt$respondStaticPath$checkExclude$1 r0 = (io.ktor.server.http.content.StaticContentKt$respondStaticPath$checkExclude$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.server.http.content.StaticContentKt$respondStaticPath$checkExclude$1 r0 = new io.ktor.server.http.content.StaticContentKt$respondStaticPath$checkExclude$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            kotlin.AbstractC5184.m10206(r8)
            goto L5c
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r5)
            return r3
        L2e:
            kotlin.AbstractC5184.m10206(r8)
            java.lang.Object r5 = r5.invoke(r7)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L40
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L40:
            飘花落叶言楪兰世哲子苏.飘花落叶言子世楪哲苏兰 r5 = p236.C8096.f22356
            kotlin.jvm.internal.飘花落叶言子楪苏兰哲世 r7 = kotlin.jvm.internal.AbstractC4395.f12971
            java.lang.Class<飘花落叶言楪兰世哲子苏.飘花落叶言子世楪哲苏兰> r8 = p236.C8096.class
            kotlin.reflect.飘花落叶言子楪世哲兰苏 r7 = r7.mo8927(r8)
            kotlin.reflect.飘花落叶言子世楪苏兰哲 r3 = kotlin.jvm.internal.AbstractC4395.m8922(r8)     // Catch: java.lang.Throwable -> L4e
        L4e:
            飘花落叶言世子楪苏哲兰.飘花落叶言子楪世苏哲兰 r8 = new 飘花落叶言世子楪苏哲兰.飘花落叶言子楪世苏哲兰
            r8.<init>(r7, r3)
            r0.label = r4
            java.lang.Object r5 = r6.mo8472(r5, r8, r0)
            if (r5 != r1) goto L5c
            return r1
        L5c:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.http.content.AbstractC4121.m8525(飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世, io.ktor.server.application.飘花落叶言子楪世苏兰哲, java.nio.file.Path, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8526(p052.InterfaceC6557 r5, io.ktor.server.application.InterfaceC4056 r6, java.io.File r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            boolean r0 = r8 instanceof io.ktor.server.http.content.StaticContentKt$respondStaticFile$checkExclude$1
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.server.http.content.StaticContentKt$respondStaticFile$checkExclude$1 r0 = (io.ktor.server.http.content.StaticContentKt$respondStaticFile$checkExclude$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.server.http.content.StaticContentKt$respondStaticFile$checkExclude$1 r0 = new io.ktor.server.http.content.StaticContentKt$respondStaticFile$checkExclude$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            kotlin.AbstractC5184.m10206(r8)
            goto L5c
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r5)
            return r3
        L2e:
            kotlin.AbstractC5184.m10206(r8)
            java.lang.Object r5 = r5.invoke(r7)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L40
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L40:
            飘花落叶言楪兰世哲子苏.飘花落叶言子世楪哲苏兰 r5 = p236.C8096.f22356
            kotlin.jvm.internal.飘花落叶言子楪苏兰哲世 r7 = kotlin.jvm.internal.AbstractC4395.f12971
            java.lang.Class<飘花落叶言楪兰世哲子苏.飘花落叶言子世楪哲苏兰> r8 = p236.C8096.class
            kotlin.reflect.飘花落叶言子楪世哲兰苏 r7 = r7.mo8927(r8)
            kotlin.reflect.飘花落叶言子世楪苏兰哲 r3 = kotlin.jvm.internal.AbstractC4395.m8922(r8)     // Catch: java.lang.Throwable -> L4e
        L4e:
            飘花落叶言世子楪苏哲兰.飘花落叶言子楪世苏哲兰 r8 = new 飘花落叶言世子楪苏哲兰.飘花落叶言子楪世苏哲兰
            r8.<init>(r7, r3)
            r0.label = r4
            java.lang.Object r5 = r6.mo8472(r5, r8, r0)
            if (r5 != r1) goto L5c
            return r1
        L5c:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.http.content.AbstractC4121.m8526(飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世, io.ktor.server.application.飘花落叶言子楪世苏兰哲, java.io.File, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x017b, code lost:
    
        if (r0 == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0183, code lost:
    
        if (io.ktor.server.application.AbstractC4065.m8479(r15) != false) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01df A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x017b -> B:21:0x0090). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8527(io.ktor.server.application.InterfaceC4056 r16, java.lang.String r17, java.lang.String r18, java.util.List r19, p052.InterfaceC6557 r20, p052.InterfaceC6557 r21, p052.InterfaceC6550 r22, p052.InterfaceC6557 r23, java.util.List r24, java.lang.String r25, kotlin.coroutines.jvm.internal.ContinuationImpl r26) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.http.content.AbstractC4121.m8527(io.ktor.server.application.飘花落叶言子楪世苏兰哲, java.lang.String, java.lang.String, java.util.List, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲兰世苏, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世, java.util.List, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x013f, code lost:
    
        if (io.ktor.server.http.content.AbstractC4124.m8533(r14, r3, r12, r11, r10, r9, r1) == r2) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0218 A[PHI: r6 r7 r9 r10 r11 r12 r15
  0x0218: PHI (r6v9 java.lang.String) = (r6v1 java.lang.String), (r6v12 java.lang.String) binds: [B:63:0x020f, B:43:0x0159] A[DONT_GENERATE, DONT_INLINE]
  0x0218: PHI (r7v10 java.util.List) = (r7v1 java.util.List), (r7v13 java.util.List) binds: [B:63:0x020f, B:43:0x0159] A[DONT_GENERATE, DONT_INLINE]
  0x0218: PHI (r9v9 io.ktor.server.http.content.飘花落叶言子楪世哲苏兰) = (r9v0 io.ktor.server.http.content.飘花落叶言子楪世哲苏兰), (r9v11 io.ktor.server.http.content.飘花落叶言子楪世哲苏兰) binds: [B:63:0x020f, B:43:0x0159] A[DONT_GENERATE, DONT_INLINE]
  0x0218: PHI (r10v10 飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲兰世苏) = (r10v1 飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲兰世苏), (r10v12 飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲兰世苏) binds: [B:63:0x020f, B:43:0x0159] A[DONT_GENERATE, DONT_INLINE]
  0x0218: PHI (r11v10 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世) = (r11v1 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世), (r11v12 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世) binds: [B:63:0x020f, B:43:0x0159] A[DONT_GENERATE, DONT_INLINE]
  0x0218: PHI (r12v10 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世) = (r12v1 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世), (r12v12 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世) binds: [B:63:0x020f, B:43:0x0159] A[DONT_GENERATE, DONT_INLINE]
  0x0218: PHI (r15v6 io.ktor.server.application.飘花落叶言子楪世苏兰哲) = (r15v1 io.ktor.server.application.飘花落叶言子楪世苏兰哲), (r15v8 io.ktor.server.application.飘花落叶言子楪世苏兰哲) binds: [B:63:0x020f, B:43:0x0159] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x01d6 -> B:17:0x0067). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8528(io.ktor.server.application.InterfaceC4056 r17, java.lang.String r18, java.lang.String r19, java.util.List r20, p052.InterfaceC6557 r21, p052.InterfaceC6557 r22, p052.InterfaceC6550 r23, p052.InterfaceC6557 r24, java.util.List r25, java.lang.String r26, kotlin.coroutines.jvm.internal.ContinuationImpl r27) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.http.content.AbstractC4121.m8528(io.ktor.server.application.飘花落叶言子楪世苏兰哲, java.lang.String, java.lang.String, java.util.List, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲兰世苏, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世, java.util.List, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0295 -> B:58:0x029f). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8529(io.ktor.server.application.InterfaceC4056 r22, java.lang.String r23, java.io.File r24, java.util.List r25, p052.InterfaceC6557 r26, p052.InterfaceC6557 r27, p052.InterfaceC6550 r28, p052.InterfaceC6557 r29, java.util.List r30, java.lang.String r31, kotlin.coroutines.jvm.internal.ContinuationImpl r32) {
        /*
            Method dump skipped, instruction units count: 778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.http.content.AbstractC4121.m8529(io.ktor.server.application.飘花落叶言子楪世苏兰哲, java.lang.String, java.io.File, java.util.List, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲兰世苏, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世, java.util.List, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
