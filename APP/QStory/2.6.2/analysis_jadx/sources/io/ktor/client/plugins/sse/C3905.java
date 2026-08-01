package io.ktor.client.plugins.sse;

import io.ktor.utils.io.InterfaceC4251;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC4359;
import kotlin.time.C5156;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C5301;

/* JADX INFO: renamed from: io.ktor.client.plugins.sse.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3905 implements InterfaceC5400 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final boolean f12105;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean f12106;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC4359 f12107;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public String f12108;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC4251 f12109;

    public C3905(C3903 c3903, InterfaceC4251 interfaceC4251, InterfaceC4359 interfaceC4359) {
        interfaceC4251.getClass();
        interfaceC4359.getClass();
        this.f12109 = interfaceC4251;
        this.f12107 = interfaceC4359;
        C5156.m10185(c3903.f12102);
        this.f12106 = c3903.f12101;
        this.f12105 = c3903.f12100;
        new C5301(new DefaultClientSSESession$_incoming$1(this, null), EmptyCoroutineContext.INSTANCE, -2, BufferOverflow.SUSPEND);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e9, code lost:
    
        if (r2 == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f1, code lost:
    
        if (kotlin.text.AbstractC5143.m10164(r2) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f3, code lost:
    
        r3.L$0 = r15;
        r3.L$1 = r14;
        r3.L$2 = r13;
        r3.L$3 = r12;
        r3.L$4 = r11;
        r3.L$5 = r5;
        r3.I$0 = r1;
        r3.I$1 = r0;
        r3.label = 2;
        r2 = io.ktor.utils.io.AbstractC4243.m8681(r14, Integer.MAX_VALUE, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0109, code lost:
    
        if (r2 != r4) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x010f, code lost:
    
        if (r2 == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0113, code lost:
    
        r8 = r14;
        r14 = r5;
        r5 = r15;
        r15 = r8;
        r8 = r11;
        r11 = r13;
        r13 = r12;
        r12 = r19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0233  */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, java.lang.Long] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0109 -> B:30:0x010d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x0229 -> B:92:0x022d). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8295(io.ktor.client.plugins.sse.C3905 r17, io.ktor.utils.io.InterfaceC4251 r18, kotlin.coroutines.jvm.internal.ContinuationImpl r19) {
        /*
            Method dump skipped, instruction units count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.sse.C3905.m8295(io.ktor.client.plugins.sse.飘花落叶言子楪世苏兰哲, io.ktor.utils.io.飘花落叶言子楪苏兰哲世, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // kotlinx.coroutines.InterfaceC5400
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final InterfaceC4359 mo2420() {
        return this.f12107;
    }
}
