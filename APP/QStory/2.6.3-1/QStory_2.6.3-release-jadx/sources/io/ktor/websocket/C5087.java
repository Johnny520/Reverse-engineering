package io.ktor.websocket;

import androidx.compose.foundation.lazy.C1589;
import io.ktor.util.cio.ChannelWriteException;
import io.ktor.utils.p007io.C5081;
import io.ktor.utils.p007io.InterfaceC5079;
import java.nio.ByteBuffer;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6234;
import kotlinx.coroutines.C6249;
import kotlinx.coroutines.C6285;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.InterfaceC6284;
import kotlinx.coroutines.channels.AbstractC6037;
import kotlinx.coroutines.channels.C6022;
import kotlinx.coroutines.channels.C6023;
import kotlinx.coroutines.channels.C6034;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.channels.InterfaceC6044;
import p073.InterfaceC7680;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.websocket.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5087 implements InterfaceC6233 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C6022 f13118;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC7680 f13119;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C1589 f13120;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C6249 f13121;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC5192 f13122;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean f13123;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC5079 f13124;

    public C5087(InterfaceC5079 interfaceC5079, InterfaceC5192 interfaceC5192, boolean z, InterfaceC7680 interfaceC7680) {
        interfaceC5079.getClass();
        interfaceC5192.getClass();
        this.f13124 = interfaceC5079;
        this.f13122 = interfaceC5192;
        this.f13123 = z;
        this.f13119 = interfaceC7680;
        this.f13118 = AbstractC6037.m10841(8, 6, null);
        C1589 c1589 = new C1589();
        c1589.f2500 = new ArrayBlockingQueue(1024);
        this.f13120 = c1589;
        this.f13121 = AbstractC6231.m11037(this, new C6234("ws-writer"), CoroutineStart.ATOMIC, new WebSocketWriter$writeLoopJob$1(this, null));
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
    */
    public static final Object m9265(C5087 c5087, ByteBuffer byteBuffer, ContinuationImpl continuationImpl) throws Throwable {
        WebSocketWriter$writeLoop$1 webSocketWriter$writeLoop$1;
        ?? r9;
        InterfaceC5079 interfaceC5079;
        C6022 c6022;
        Object objM10831;
        InterfaceC6044 interfaceC6044;
        InterfaceC6044 c6023;
        ?? r92;
        C6023 c60232;
        Object objM10823;
        InterfaceC6044 interfaceC60442;
        ?? r2;
        c5087.getClass();
        if (continuationImpl instanceof WebSocketWriter$writeLoop$1) {
            webSocketWriter$writeLoop$1 = (WebSocketWriter$writeLoop$1) continuationImpl;
            int i = webSocketWriter$writeLoop$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                webSocketWriter$writeLoop$1.label = i - Integer.MIN_VALUE;
            } else {
                webSocketWriter$writeLoop$1 = new WebSocketWriter$writeLoop$1(c5087, continuationImpl);
            }
        }
        Object objM9266 = webSocketWriter$writeLoop$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r22 = webSocketWriter$writeLoop$1.label;
        try {
            try {
            } catch (Throwable th) {
                r22.f13118.m10801(AbstractC6231.m11050("WebSocket closed.", null), false);
                InterfaceC5079 interfaceC50792 = r22.f13124;
                webSocketWriter$writeLoop$1.L$0 = th;
                webSocketWriter$writeLoop$1.L$1 = null;
                webSocketWriter$writeLoop$1.L$2 = null;
                webSocketWriter$writeLoop$1.label = 6;
                if (((C5081) interfaceC50792).m9263(webSocketWriter$writeLoop$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                throw th;
            }
        } catch (ChannelWriteException e) {
            e = e;
        } catch (Throwable th2) {
            th = th2;
        }
        switch (r22) {
            case 0:
                AbstractC6017.m10769(objM9266);
                byteBuffer.clear();
                try {
                    C6022 c60222 = c5087.f13118;
                    c60222.getClass();
                    c6023 = new C6023(c60222);
                    r92 = c5087;
                    webSocketWriter$writeLoop$1.L$0 = r92;
                    webSocketWriter$writeLoop$1.L$1 = byteBuffer;
                    webSocketWriter$writeLoop$1.L$2 = c6023;
                    webSocketWriter$writeLoop$1.label = 1;
                    c60232 = (C6023) c6023;
                    objM10823 = c60232.m10823(webSocketWriter$writeLoop$1);
                } catch (ChannelWriteException e2) {
                    r22 = c5087;
                    e = e2;
                    r22.f13118.m10801(AbstractC6231.m11050("Failed to write to WebSocket.", e), false);
                    r22.f13118.m10801(AbstractC6231.m11050("WebSocket closed.", null), false);
                    interfaceC5079 = r22.f13124;
                    webSocketWriter$writeLoop$1.L$0 = r22;
                    webSocketWriter$writeLoop$1.L$1 = null;
                    webSocketWriter$writeLoop$1.L$2 = null;
                    webSocketWriter$writeLoop$1.label = 4;
                    r22 = r22;
                    if (((C5081) interfaceC5079).m9263(webSocketWriter$writeLoop$1) == coroutineSingletons) {
                    }
                    r9 = r22;
                    break;
                } catch (Throwable th3) {
                    r22 = c5087;
                    th = th3;
                    r22.f13118.m10801(th, false);
                    r22.f13118.m10801(AbstractC6231.m11050("WebSocket closed.", null), false);
                    InterfaceC5079 interfaceC50793 = r22.f13124;
                    webSocketWriter$writeLoop$1.L$0 = r22;
                    webSocketWriter$writeLoop$1.L$1 = null;
                    webSocketWriter$writeLoop$1.L$2 = null;
                    webSocketWriter$writeLoop$1.label = 5;
                    r22 = r22;
                    if (((C5081) interfaceC50793).m9263(webSocketWriter$writeLoop$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    r9 = r22;
                    break;
                }
                if (objM10823 != coroutineSingletons) {
                    return coroutineSingletons;
                }
                r22 = r92;
                interfaceC6044 = c60232;
                objM9266 = objM10823;
                if (!((Boolean) objM9266).booleanValue()) {
                    C6023 c60233 = (C6023) interfaceC6044;
                    Object objM10821 = c60233.m10821();
                    if (objM10821 instanceof AbstractC5112) {
                        webSocketWriter$writeLoop$1.L$0 = r22;
                        webSocketWriter$writeLoop$1.L$1 = byteBuffer;
                        webSocketWriter$writeLoop$1.L$2 = c60233;
                        webSocketWriter$writeLoop$1.label = 2;
                        objM9266 = r22.m9266((AbstractC5112) objM10821, byteBuffer, webSocketWriter$writeLoop$1);
                        r2 = r22;
                        interfaceC60442 = c60233;
                        if (objM9266 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        ?? r8 = r2;
                        c6023 = interfaceC60442;
                        c5087 = r8;
                        r92 = c5087;
                        r9 = c5087;
                        break;
                    } else {
                        if (!(objM10821 instanceof C5088)) {
                            throw new IllegalArgumentException("unknown message " + objM10821);
                        }
                        ((C5088) objM10821).m9268();
                        ?? r82 = r22;
                        c6023 = c60233;
                        r92 = r82;
                        webSocketWriter$writeLoop$1.L$0 = r92;
                        webSocketWriter$writeLoop$1.L$1 = byteBuffer;
                        webSocketWriter$writeLoop$1.L$2 = c6023;
                        webSocketWriter$writeLoop$1.label = 1;
                        c60232 = (C6023) c6023;
                        objM10823 = c60232.m10823(webSocketWriter$writeLoop$1);
                        if (objM10823 != coroutineSingletons) {
                        }
                    }
                } else {
                    r9 = r22;
                    r9.f13118.m10801(AbstractC6231.m11050("WebSocket closed.", null), false);
                    InterfaceC5079 interfaceC50794 = r9.f13124;
                    webSocketWriter$writeLoop$1.L$0 = r9;
                    webSocketWriter$writeLoop$1.L$1 = null;
                    webSocketWriter$writeLoop$1.L$2 = null;
                    webSocketWriter$writeLoop$1.label = 3;
                    if (((C5081) interfaceC50794).m9263(webSocketWriter$writeLoop$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    c6022 = r9.f13118;
                    c6022.mo8994(null);
                    while (true) {
                        try {
                            objM10831 = C6034.m10831(c6022.mo10814());
                            if (objM10831 == null) {
                                if (!(objM10831 instanceof C5110) && !(objM10831 instanceof C5113) && !(objM10831 instanceof C5114)) {
                                    if (objM10831 instanceof C5088) {
                                        ((C5088) objM10831).m9268();
                                    } else if (!(objM10831 instanceof C5111) && !(objM10831 instanceof C5091)) {
                                        throw new IllegalArgumentException("unknown message " + objM10831);
                                    }
                                }
                            }
                        } catch (CancellationException unused) {
                        }
                    }
                    return C6008.f15084;
                }
                r22.f13118.m10801(AbstractC6231.m11050("Failed to write to WebSocket.", e), false);
                r22.f13118.m10801(AbstractC6231.m11050("WebSocket closed.", null), false);
                interfaceC5079 = r22.f13124;
                webSocketWriter$writeLoop$1.L$0 = r22;
                webSocketWriter$writeLoop$1.L$1 = null;
                webSocketWriter$writeLoop$1.L$2 = null;
                webSocketWriter$writeLoop$1.label = 4;
                r22 = r22;
                if (((C5081) interfaceC5079).m9263(webSocketWriter$writeLoop$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                r9 = r22;
                c6022 = r9.f13118;
                c6022.mo8994(null);
                while (true) {
                    objM10831 = C6034.m10831(c6022.mo10814());
                    if (objM10831 == null) {
                    }
                }
                return C6008.f15084;
            case 1:
                interfaceC6044 = (InterfaceC6044) webSocketWriter$writeLoop$1.L$2;
                byteBuffer = (ByteBuffer) webSocketWriter$writeLoop$1.L$1;
                C5087 c50872 = (C5087) webSocketWriter$writeLoop$1.L$0;
                AbstractC6017.m10769(objM9266);
                r22 = c50872;
                if (!((Boolean) objM9266).booleanValue()) {
                }
                r22.f13118.m10801(AbstractC6231.m11050("Failed to write to WebSocket.", e), false);
                r22.f13118.m10801(AbstractC6231.m11050("WebSocket closed.", null), false);
                interfaceC5079 = r22.f13124;
                webSocketWriter$writeLoop$1.L$0 = r22;
                webSocketWriter$writeLoop$1.L$1 = null;
                webSocketWriter$writeLoop$1.L$2 = null;
                webSocketWriter$writeLoop$1.label = 4;
                r22 = r22;
                if (((C5081) interfaceC5079).m9263(webSocketWriter$writeLoop$1) == coroutineSingletons) {
                }
                r9 = r22;
                c6022 = r9.f13118;
                c6022.mo8994(null);
                while (true) {
                    objM10831 = C6034.m10831(c6022.mo10814());
                    if (objM10831 == null) {
                    }
                }
                return C6008.f15084;
            case 2:
                InterfaceC6044 interfaceC60443 = (InterfaceC6044) webSocketWriter$writeLoop$1.L$2;
                byteBuffer = (ByteBuffer) webSocketWriter$writeLoop$1.L$1;
                C5087 c50873 = (C5087) webSocketWriter$writeLoop$1.L$0;
                AbstractC6017.m10769(objM9266);
                r2 = c50873;
                interfaceC60442 = interfaceC60443;
                ?? r83 = r2;
                c6023 = interfaceC60442;
                c5087 = r83;
                r92 = c5087;
                r9 = c5087;
                break;
            case 3:
            case 4:
            case 5:
                r9 = (C5087) webSocketWriter$writeLoop$1.L$0;
                AbstractC6017.m10769(objM9266);
                c6022 = r9.f13118;
                c6022.mo8994(null);
                while (true) {
                    objM10831 = C6034.m10831(c6022.mo10814());
                    if (objM10831 == null) {
                    }
                }
                return C6008.f15084;
            case 6:
                Throwable th4 = (Throwable) webSocketWriter$writeLoop$1.L$0;
                AbstractC6017.m10769(objM9266);
                throw th4;
            default:
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    @Override // kotlinx.coroutines.InterfaceC6233
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final InterfaceC5192 mo2990() {
        return this.f13122;
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
    */
    public final java.lang.Object m9266(io.ktor.websocket.AbstractC5112 r20, java.nio.ByteBuffer r21, kotlin.coroutines.jvm.internal.ContinuationImpl r22) {
        /*
            Method dump skipped, instruction units count: 737
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.C5087.m9266(io.ktor.websocket.飘花落叶言子楪苏兰哲世, java.nio.ByteBuffer, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m9267(ContinuationImpl continuationImpl) throws Throwable {
        WebSocketWriter$flush$1 webSocketWriter$flush$1;
        C5088 c5088;
        Throwable th;
        C5088 c50882;
        C5087 c5087;
        C5088 c50883;
        C6249 c6249;
        C5088 c50884;
        if (continuationImpl instanceof WebSocketWriter$flush$1) {
            webSocketWriter$flush$1 = (WebSocketWriter$flush$1) continuationImpl;
            int i = webSocketWriter$flush$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                webSocketWriter$flush$1.label = i - Integer.MIN_VALUE;
            } else {
                webSocketWriter$flush$1 = new WebSocketWriter$flush$1(this, continuationImpl);
            }
        }
        Object obj = webSocketWriter$flush$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = webSocketWriter$flush$1.label;
        C6008 c6008 = C6008.f15084;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            c5088 = new C5088((InterfaceC6284) this.f13122.get(C6285.f15450));
            try {
                C6022 c6022 = this.f13118;
                webSocketWriter$flush$1.L$0 = this;
                webSocketWriter$flush$1.L$1 = c5088;
                webSocketWriter$flush$1.L$2 = c5088;
                webSocketWriter$flush$1.label = 1;
                if (c6022.mo8992(c5088, webSocketWriter$flush$1) != coroutineSingletons) {
                    c50883 = c5088;
                }
            } catch (ClosedSendChannelException unused) {
                c5087 = this;
                c50882 = c5088;
                c50882.m9268();
                c6249 = c5087.f13121;
                webSocketWriter$flush$1.L$0 = c5088;
                webSocketWriter$flush$1.L$1 = null;
                webSocketWriter$flush$1.L$2 = null;
                webSocketWriter$flush$1.label = 2;
                if (c6249.mo11123(webSocketWriter$flush$1) != coroutineSingletons) {
                }
            } catch (Throwable th2) {
                th = th2;
                c50882 = c5088;
                c50882.m9268();
                throw th;
            }
        }
        if (i2 == 1) {
            c50882 = (C5088) webSocketWriter$flush$1.L$2;
            c50883 = (C5088) webSocketWriter$flush$1.L$1;
            c5087 = (C5087) webSocketWriter$flush$1.L$0;
            try {
                AbstractC6017.m10769(obj);
            } catch (ClosedSendChannelException unused2) {
                c5088 = c50883;
                c50882.m9268();
                c6249 = c5087.f13121;
                webSocketWriter$flush$1.L$0 = c5088;
                webSocketWriter$flush$1.L$1 = null;
                webSocketWriter$flush$1.L$2 = null;
                webSocketWriter$flush$1.label = 2;
                if (c6249.mo11123(webSocketWriter$flush$1) != coroutineSingletons) {
                    c50884 = c5088;
                    c50883 = c50884;
                }
            } catch (Throwable th3) {
                th = th3;
                c50882.m9268();
                throw th;
            }
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    AbstractC6017.m10769(obj);
                    return c6008;
                }
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c50884 = (C5088) webSocketWriter$flush$1.L$0;
            AbstractC6017.m10769(obj);
            c50883 = c50884;
        }
        webSocketWriter$flush$1.L$0 = null;
        webSocketWriter$flush$1.L$1 = null;
        webSocketWriter$flush$1.L$2 = null;
        webSocketWriter$flush$1.label = 3;
        Object objMo11123 = c50883.f13125.mo11123(webSocketWriter$flush$1);
        if (objMo11123 != CoroutineSingletons.COROUTINE_SUSPENDED) {
            objMo11123 = c6008;
        }
        return objMo11123 == coroutineSingletons ? coroutineSingletons : c6008;
    }
}
