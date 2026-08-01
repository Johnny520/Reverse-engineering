package io.ktor.util;

import io.ktor.utils.io.C4226;
import io.ktor.utils.io.InterfaceC4252;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.util.EncodersJvmKt$inflate$1", f = "EncodersJvm.kt", l = {78, 95, 96, 106, 113, 119, 131}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;)V"}, k = 3, mv = {2, 0, 0})
final class EncodersJvmKt$inflate$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ boolean $gzip;
    final /* synthetic */ InterfaceC4252 $source;
    byte B$0;
    byte B$1;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    short S$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EncodersJvmKt$inflate$1(boolean z, InterfaceC4252 interfaceC4252, InterfaceC4357<? super EncodersJvmKt$inflate$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$gzip = z;
        this.$source = interfaceC4252;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        EncodersJvmKt$inflate$1 encodersJvmKt$inflate$1 = new EncodersJvmKt$inflate$1(this.$gzip, this.$source, interfaceC4357);
        encodersJvmKt$inflate$1.L$0 = obj;
        return encodersJvmKt$inflate$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(C4226 c4226, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((EncodersJvmKt$inflate$1) create(c4226, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x01fb, code lost:
    
        if (io.ktor.utils.io.AbstractC4244.m8685(r4, 2, r19) == r1) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x024f A[Catch: all -> 0x0039, TRY_ENTER, TryCatch #1 {all -> 0x0039, blocks: (B:7:0x0031, B:93:0x0307, B:87:0x02e2, B:89:0x02e8, B:94:0x031e, B:96:0x0322, B:98:0x0328, B:100:0x0348, B:103:0x034d, B:104:0x0371, B:105:0x0372, B:106:0x0379, B:107:0x037a, B:108:0x039d, B:109:0x039e, B:113:0x03b2, B:114:0x03b9, B:73:0x0282, B:75:0x0288, B:77:0x028e, B:83:0x02d1, B:64:0x0245, B:67:0x024f, B:70:0x0268, B:72:0x0270, B:84:0x02d6, B:86:0x02dc, B:115:0x03ba, B:17:0x0083), top: B:124:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0270 A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:7:0x0031, B:93:0x0307, B:87:0x02e2, B:89:0x02e8, B:94:0x031e, B:96:0x0322, B:98:0x0328, B:100:0x0348, B:103:0x034d, B:104:0x0371, B:105:0x0372, B:106:0x0379, B:107:0x037a, B:108:0x039d, B:109:0x039e, B:113:0x03b2, B:114:0x03b9, B:73:0x0282, B:75:0x0288, B:77:0x028e, B:83:0x02d1, B:64:0x0245, B:67:0x024f, B:70:0x0268, B:72:0x0270, B:84:0x02d6, B:86:0x02dc, B:115:0x03ba, B:17:0x0083), top: B:124:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0288 A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:7:0x0031, B:93:0x0307, B:87:0x02e2, B:89:0x02e8, B:94:0x031e, B:96:0x0322, B:98:0x0328, B:100:0x0348, B:103:0x034d, B:104:0x0371, B:105:0x0372, B:106:0x0379, B:107:0x037a, B:108:0x039d, B:109:0x039e, B:113:0x03b2, B:114:0x03b9, B:73:0x0282, B:75:0x0288, B:77:0x028e, B:83:0x02d1, B:64:0x0245, B:67:0x024f, B:70:0x0268, B:72:0x0270, B:84:0x02d6, B:86:0x02dc, B:115:0x03ba, B:17:0x0083), top: B:124:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02d6 A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:7:0x0031, B:93:0x0307, B:87:0x02e2, B:89:0x02e8, B:94:0x031e, B:96:0x0322, B:98:0x0328, B:100:0x0348, B:103:0x034d, B:104:0x0371, B:105:0x0372, B:106:0x0379, B:107:0x037a, B:108:0x039d, B:109:0x039e, B:113:0x03b2, B:114:0x03b9, B:73:0x0282, B:75:0x0288, B:77:0x028e, B:83:0x02d1, B:64:0x0245, B:67:0x024f, B:70:0x0268, B:72:0x0270, B:84:0x02d6, B:86:0x02dc, B:115:0x03ba, B:17:0x0083), top: B:124:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02e8 A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:7:0x0031, B:93:0x0307, B:87:0x02e2, B:89:0x02e8, B:94:0x031e, B:96:0x0322, B:98:0x0328, B:100:0x0348, B:103:0x034d, B:104:0x0371, B:105:0x0372, B:106:0x0379, B:107:0x037a, B:108:0x039d, B:109:0x039e, B:113:0x03b2, B:114:0x03b9, B:73:0x0282, B:75:0x0288, B:77:0x028e, B:83:0x02d1, B:64:0x0245, B:67:0x024f, B:70:0x0268, B:72:0x0270, B:84:0x02d6, B:86:0x02dc, B:115:0x03ba, B:17:0x0083), top: B:124:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x031e A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:7:0x0031, B:93:0x0307, B:87:0x02e2, B:89:0x02e8, B:94:0x031e, B:96:0x0322, B:98:0x0328, B:100:0x0348, B:103:0x034d, B:104:0x0371, B:105:0x0372, B:106:0x0379, B:107:0x037a, B:108:0x039d, B:109:0x039e, B:113:0x03b2, B:114:0x03b9, B:73:0x0282, B:75:0x0288, B:77:0x028e, B:83:0x02d1, B:64:0x0245, B:67:0x024f, B:70:0x0268, B:72:0x0270, B:84:0x02d6, B:86:0x02dc, B:115:0x03ba, B:17:0x0083), top: B:124:0x000a }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x026e -> B:64:0x0245). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x0270 -> B:73:0x0282). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x02ad -> B:81:0x02b5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x0306 -> B:93:0x0307). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 992
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.EncodersJvmKt$inflate$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
