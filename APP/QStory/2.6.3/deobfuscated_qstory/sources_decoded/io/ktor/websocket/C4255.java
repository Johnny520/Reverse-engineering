package io.ktor.websocket;

import androidx.compose.foundation.lazy.C0748;
import io.ktor.utils.io.InterfaceC4247;
import java.util.concurrent.ArrayBlockingQueue;
import kotlin.coroutines.InterfaceC4360;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.C5402;
import kotlinx.coroutines.C5417;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.channels.AbstractC5205;
import kotlinx.coroutines.channels.C5190;
import p057.InterfaceC6851;

/* JADX INFO: renamed from: io.ktor.websocket.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4255 implements InterfaceC5401 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C5190 f12773;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC6851 f12774;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C0748 f12775;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C5417 f12776;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC4360 f12777;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean f12778;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC4247 f12779;

    public C4255(InterfaceC4247 interfaceC4247, InterfaceC4360 interfaceC4360, boolean z, InterfaceC6851 interfaceC6851) {
        interfaceC4247.getClass();
        interfaceC4360.getClass();
        this.f12779 = interfaceC4247;
        this.f12777 = interfaceC4360;
        this.f12778 = z;
        this.f12774 = interfaceC6851;
        this.f12773 = AbstractC5205.m10282(8, 6, null);
        C0748 c0748 = new C0748();
        c0748.f2155 = new ArrayBlockingQueue(1024);
        this.f12775 = c0748;
        this.f12776 = AbstractC5399.m10478(this, new C5402("ws-writer"), CoroutineStart.ATOMIC, new WebSocketWriter$writeLoopJob$1(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00be, code lost:
    
        if (((java.lang.Boolean) r11).booleanValue() == false) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009b A[Catch: all -> 0x0055, ChannelWriteException -> 0x0058, TryCatch #6 {ChannelWriteException -> 0x0058, all -> 0x0055, blocks: (B:15:0x004e, B:30:0x0093, B:32:0x009b, B:34:0x00a5, B:44:0x00ca, B:46:0x00ce, B:47:0x00d7, B:48:0x00eb, B:22:0x0067), top: B:92:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016b A[Catch: CancellationException -> 0x01a0, TryCatch #3 {CancellationException -> 0x01a0, blocks: (B:65:0x0160, B:68:0x016b, B:70:0x016f, B:72:0x0173, B:75:0x0178, B:77:0x017c, B:78:0x0182, B:80:0x0186, B:83:0x018b, B:84:0x019f), top: B:94:0x0160 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x016a A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [io.ktor.websocket.飘花落叶言子世楪哲兰苏, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v3, types: [io.ktor.websocket.飘花落叶言子世楪哲兰苏] */
    /* JADX WARN: Type inference failed for: r2v4, types: [io.ktor.websocket.飘花落叶言子世楪哲兰苏, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [io.ktor.websocket.飘花落叶言子世楪哲兰苏, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r9v0, types: [io.ktor.websocket.飘花落叶言子世楪哲兰苏, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v16, types: [io.ktor.websocket.飘花落叶言子世楪哲兰苏] */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v25, types: [io.ktor.websocket.飘花落叶言子世楪哲兰苏, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v34 */
    /* JADX WARN: Type inference failed for: r9v38, types: [io.ktor.websocket.飘花落叶言子世楪哲兰苏] */
    /* JADX WARN: Type inference failed for: r9v43 */
    /* JADX WARN: Type inference failed for: r9v44 */
    /* JADX WARN: Type inference failed for: r9v45 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00b4 -> B:16:0x0051). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00ce -> B:26:0x007b). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8706(io.ktor.websocket.C4255 r9, java.nio.ByteBuffer r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.C4255.m8706(io.ktor.websocket.飘花落叶言子世楪哲兰苏, java.nio.ByteBuffer, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // kotlinx.coroutines.InterfaceC5401
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final InterfaceC4360 mo2430() {
        return this.f12777;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:166:0x02cf, B:165:0x02cd], limit reached: 178 */
    /* JADX WARN: Path cross not found for [B:67:0x0151, B:64:0x0146], limit reached: 178 */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r12v13, types: [T, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:158:0x02b8 -> B:160:0x02bb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:162:0x02c6 -> B:161:0x02c1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:20:0x0090
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m8707(io.ktor.websocket.AbstractC4280 r20, java.nio.ByteBuffer r21, kotlin.coroutines.jvm.internal.ContinuationImpl r22) {
        /*
            Method dump skipped, instruction units count: 737
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.C4255.m8707(io.ktor.websocket.飘花落叶言子楪苏兰哲世, java.nio.ByteBuffer, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m8708(kotlin.coroutines.jvm.internal.ContinuationImpl r11) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r11 instanceof io.ktor.websocket.WebSocketWriter$flush$1
            if (r0 == 0) goto L13
            r0 = r11
            io.ktor.websocket.WebSocketWriter$flush$1 r0 = (io.ktor.websocket.WebSocketWriter$flush$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.websocket.WebSocketWriter$flush$1 r0 = new io.ktor.websocket.WebSocketWriter$flush$1
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            kotlin.飘花落叶言子楪兰苏哲世 r3 = kotlin.C5176.f14739
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L52
            if (r2 == r6) goto L3e
            if (r2 == r5) goto L36
            if (r2 != r4) goto L30
            kotlin.AbstractC5185.m10210(r11)
            return r3
        L30:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r10)
            return r7
        L36:
            java.lang.Object r10 = r0.L$0
            io.ktor.websocket.飘花落叶言子世楪哲苏兰 r10 = (io.ktor.websocket.C4256) r10
            kotlin.AbstractC5185.m10210(r11)
            goto L98
        L3e:
            java.lang.Object r10 = r0.L$2
            io.ktor.websocket.飘花落叶言子世楪哲苏兰 r10 = (io.ktor.websocket.C4256) r10
            java.lang.Object r2 = r0.L$1
            io.ktor.websocket.飘花落叶言子世楪哲苏兰 r2 = (io.ktor.websocket.C4256) r2
            java.lang.Object r6 = r0.L$0
            io.ktor.websocket.飘花落叶言子世楪哲兰苏 r6 = (io.ktor.websocket.C4255) r6
            kotlin.AbstractC5185.m10210(r11)     // Catch: java.lang.Throwable -> L4e kotlinx.coroutines.channels.ClosedSendChannelException -> L50
            goto L99
        L4e:
            r11 = move-exception
            goto L7f
        L50:
            r11 = r2
            goto L83
        L52:
            kotlin.AbstractC5185.m10210(r11)
            io.ktor.websocket.飘花落叶言子世楪哲苏兰 r11 = new io.ktor.websocket.飘花落叶言子世楪哲苏兰
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r2 = r10.f12777
            kotlinx.coroutines.飘花落叶言子苏世楪哲兰 r8 = kotlinx.coroutines.C5453.f15105
            kotlin.coroutines.飘花落叶言子楪世兰哲苏 r2 = r2.get(r8)
            kotlinx.coroutines.飘花落叶言子苏世楪兰哲 r2 = (kotlinx.coroutines.InterfaceC5452) r2
            r11.<init>(r2)
            kotlinx.coroutines.channels.飘花落叶言子楪世兰苏哲 r2 = r10.f12773     // Catch: java.lang.Throwable -> L77 kotlinx.coroutines.channels.ClosedSendChannelException -> L7c
            r0.L$0 = r10     // Catch: java.lang.Throwable -> L77 kotlinx.coroutines.channels.ClosedSendChannelException -> L7c
            r0.L$1 = r11     // Catch: java.lang.Throwable -> L77 kotlinx.coroutines.channels.ClosedSendChannelException -> L7c
            r0.L$2 = r11     // Catch: java.lang.Throwable -> L77 kotlinx.coroutines.channels.ClosedSendChannelException -> L7c
            r0.label = r6     // Catch: java.lang.Throwable -> L77 kotlinx.coroutines.channels.ClosedSendChannelException -> L7c
            java.lang.Object r10 = r2.mo8433(r11, r0)     // Catch: java.lang.Throwable -> L77 kotlinx.coroutines.channels.ClosedSendChannelException -> L7c
            if (r10 != r1) goto L75
            goto Laf
        L75:
            r2 = r11
            goto L99
        L77:
            r10 = move-exception
            r9 = r11
            r11 = r10
            r10 = r9
            goto L7f
        L7c:
            r6 = r10
            r10 = r11
            goto L83
        L7f:
            r10.m8709()
            throw r11
        L83:
            r10.m8709()
            kotlinx.coroutines.飘花落叶言子哲楪世兰苏 r10 = r6.f12776
            r0.L$0 = r11
            r0.L$1 = r7
            r0.L$2 = r7
            r0.label = r5
            java.lang.Object r10 = r10.mo10564(r0)
            if (r10 != r1) goto L97
            goto Laf
        L97:
            r10 = r11
        L98:
            r2 = r10
        L99:
            r0.L$0 = r7
            r0.L$1 = r7
            r0.L$2 = r7
            r0.label = r4
            kotlinx.coroutines.飘花落叶言子苏世哲楪兰 r10 = r2.f12780
            java.lang.Object r10 = r10.mo10564(r0)
            kotlin.coroutines.intrinsics.CoroutineSingletons r11 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r10 != r11) goto Lac
            goto Lad
        Lac:
            r10 = r3
        Lad:
            if (r10 != r1) goto Lb0
        Laf:
            return r1
        Lb0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.C4255.m8708(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
