package io.ktor.client.plugins.sse;

import io.ktor.utils.io.InterfaceC4252;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC4360;
import kotlin.time.C5157;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C5302;

/* JADX INFO: renamed from: io.ktor.client.plugins.sse.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3906 implements InterfaceC5401 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final boolean f12110;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean f12111;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC4360 f12112;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public String f12113;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC4252 f12114;

    public C3906(C3904 c3904, InterfaceC4252 interfaceC4252, InterfaceC4360 interfaceC4360) {
        interfaceC4252.getClass();
        interfaceC4360.getClass();
        this.f12114 = interfaceC4252;
        this.f12112 = interfaceC4360;
        C5157.m10189(c3904.f12107);
        this.f12111 = c3904.f12106;
        this.f12110 = c3904.f12105;
        new C5302(new DefaultClientSSESession$_incoming$1(this, null), EmptyCoroutineContext.INSTANCE, -2, BufferOverflow.SUSPEND);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e9, code lost:
    
        if (r2 == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f1, code lost:
    
        if (kotlin.text.AbstractC5144.m10172(r2) == false) goto L33;
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
        r2 = io.ktor.utils.io.AbstractC4244.m8671(r14, Integer.MAX_VALUE, r3);
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
    public static final java.lang.Object m8285(io.ktor.client.plugins.sse.C3906 r17, io.ktor.utils.io.InterfaceC4252 r18, kotlin.coroutines.jvm.internal.ContinuationImpl r19) {
        /*
            Method dump skipped, instruction units count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.sse.C3906.m8285(io.ktor.client.plugins.sse.飘花落叶言子楪世苏兰哲, io.ktor.utils.io.飘花落叶言子楪苏兰哲世, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // kotlinx.coroutines.InterfaceC5401
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final InterfaceC4360 mo2430() {
        return this.f12112;
    }
}
