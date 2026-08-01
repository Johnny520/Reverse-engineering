package io.ktor.server.engine;

import androidx.appcompat.app.C0076;
import androidx.compose.foundation.text.C0981;
import androidx.window.area.C2558;
import com.bumptech.glide.AbstractC3064;
import io.ktor.http.content.AbstractC3986;
import io.ktor.http.content.AbstractC3996;
import io.ktor.server.application.C4057;
import io.ktor.server.application.InterfaceC4056;
import io.ktor.server.cio.C4082;
import io.ktor.server.cio.C4084;
import io.ktor.server.response.C4132;
import io.ktor.server.response.C4134;
import io.ktor.server.response.InterfaceC4133;
import io.ktor.server.websocket.C4175;
import io.ktor.util.C4208;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.reflect.InterfaceC5086;
import kotlin.reflect.InterfaceC5092;
import p059.C6856;
import p236.AbstractC8114;
import p236.C8096;
import p236.C8124;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: io.ktor.server.engine.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4107 implements InterfaceC4133 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final C4208 f12474;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f12475;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC5183 f12476 = AbstractC5186.m10210(new C2558(this));

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C4134 f12477;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C8096 f12478;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f12479;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C4082 f12480;

    static {
        InterfaceC5086 interfaceC5086M8922;
        InterfaceC5092 interfaceC5092Mo8927 = AbstractC4395.f12971.mo8927(AbstractC4107.class);
        try {
            interfaceC5086M8922 = AbstractC4395.m8922(AbstractC4107.class);
        } catch (Throwable unused) {
            interfaceC5086M8922 = null;
        }
        f12474 = new C4208("EngineResponse", new C6856(interfaceC5092Mo8927, interfaceC5086M8922));
    }

    public AbstractC4107(C4082 c4082) {
        this.f12480 = c4082;
        C4057 c4057 = c4082.f12400;
        C4134 c4134 = new C4134(c4057.f12336);
        C4134 c41342 = c4057.f12335;
        c41342.getClass();
        c4134.f12663.clear();
        if (c4134.f12664 != 0) {
            C5919.m11250("Check failed.");
            throw null;
        }
        c4134.m8583(c41342);
        this.f12477 = c4134;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bd A[Catch: all -> 0x00f8, TRY_LEAVE, TryCatch #1 {all -> 0x00f8, blocks: (B:37:0x00b5, B:39:0x00bd), top: B:62:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f2 A[Catch: all -> 0x003d, TryCatch #2 {all -> 0x003d, blocks: (B:14:0x0038, B:43:0x00d6, B:47:0x00ec, B:48:0x00f1, B:49:0x00f2, B:50:0x00f7, B:21:0x0057, B:29:0x007f, B:31:0x008e, B:33:0x0099), top: B:64:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [io.ktor.utils.io.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m8519(io.ktor.server.engine.AbstractC4107 r10, io.ktor.utils.io.InterfaceC4251 r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.engine.AbstractC4107.m8519(io.ktor.server.engine.飘花落叶言子楪苏世哲兰, io.ktor.utils.io.飘花落叶言子楪苏兰哲世, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        if (r5.mo8494((io.ktor.server.websocket.C4175) r6, r0) == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0071, code lost:
    
        if (r5.mo8493(r7, r0) == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0086, code lost:
    
        if (m8521(r5, (io.ktor.http.content.AbstractC3994) r6, r0) == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c2, code lost:
    
        if (r5.mo8498(r0) == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d6, code lost:
    
        if (r5.mo8499(r6, r0) == r1) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m8520(io.ktor.server.engine.AbstractC4107 r5, io.ktor.http.content.AbstractC3986 r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.engine.AbstractC4107.m8520(io.ktor.server.engine.飘花落叶言子楪苏世哲兰, io.ktor.http.content.飘花落叶言子楪哲世苏兰, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        if (kotlinx.coroutines.AbstractC5398.m10466(r8, r2, r0) == r1) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v0, types: [io.ktor.server.engine.飘花落叶言子楪苏世哲兰] */
    /* JADX WARN: Type inference failed for: r6v1, types: [io.ktor.utils.io.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, kotlin.飘花落叶言子楪兰苏哲世] */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m8521(io.ktor.server.engine.AbstractC4107 r6, io.ktor.http.content.AbstractC3994 r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            boolean r0 = r8 instanceof io.ktor.server.engine.BaseApplicationResponse$respondWriteChannelContent$1
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.server.engine.BaseApplicationResponse$respondWriteChannelContent$1 r0 = (io.ktor.server.engine.BaseApplicationResponse$respondWriteChannelContent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.server.engine.BaseApplicationResponse$respondWriteChannelContent$1 r0 = new io.ktor.server.engine.BaseApplicationResponse$respondWriteChannelContent$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L42
            if (r2 == r5) goto L39
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.L$0
            io.ktor.utils.io.飘花落叶言子楪哲苏世兰 r6 = (io.ktor.utils.io.InterfaceC4246) r6
            kotlin.AbstractC5184.m10206(r8)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L31
            goto L67
        L2f:
            r7 = move-exception
            goto L73
        L31:
            r7 = move-exception
            goto L6d
        L33:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r6)
            return r4
        L39:
            java.lang.Object r6 = r0.L$0
            r7 = r6
            io.ktor.http.content.飘花落叶言子楪苏兰哲世 r7 = (io.ktor.http.content.AbstractC3994) r7
            kotlin.AbstractC5184.m10206(r8)
            goto L50
        L42:
            kotlin.AbstractC5184.m10206(r8)
            r0.L$0 = r7
            r0.label = r5
            java.lang.Object r8 = r6.mo8497(r0)
            if (r8 != r1) goto L50
            goto L66
        L50:
            r6 = r8
            io.ktor.utils.io.飘花落叶言子楪哲苏世兰 r6 = (io.ktor.utils.io.InterfaceC4246) r6
            飘花落叶言世苏哲楪子兰.飘花落叶言子楪世兰苏哲 r8 = kotlinx.coroutines.AbstractC5394.f15030     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L31
            飘花落叶言世苏哲楪子兰.飘花落叶言子楪世哲兰苏 r8 = p095.ExecutorC7207.f19230     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L31
            io.ktor.server.engine.BaseApplicationResponse$respondWriteChannelContent$2$1 r2 = new io.ktor.server.engine.BaseApplicationResponse$respondWriteChannelContent$2$1     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L31
            r2.<init>(r7, r6, r4)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L31
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L31
            r0.label = r3     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L31
            java.lang.Object r7 = kotlinx.coroutines.AbstractC5398.m10466(r8, r2, r0)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L31
            if (r7 != r1) goto L67
        L66:
            return r1
        L67:
            io.ktor.utils.io.AbstractC4243.m8676(r6)
            kotlin.飘花落叶言子楪兰苏哲世 r6 = kotlin.C5175.f14739
            return r6
        L6d:
            io.ktor.util.cio.ChannelWriteException r8 = new io.ktor.util.cio.ChannelWriteException     // Catch: java.lang.Throwable -> L2f
            r8.<init>(r4, r7, r5, r4)     // Catch: java.lang.Throwable -> L2f
            throw r8     // Catch: java.lang.Throwable -> L2f
        L73:
            io.ktor.utils.io.AbstractC4245.m8702(r6, r7)     // Catch: java.lang.Throwable -> L77
            throw r7     // Catch: java.lang.Throwable -> L77
        L77:
            r7 = move-exception
            io.ktor.utils.io.AbstractC4243.m8676(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.engine.AbstractC4107.m8521(io.ktor.server.engine.飘花落叶言子楪苏世哲兰, io.ktor.http.content.飘花落叶言子楪苏兰哲世, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // io.ktor.server.response.InterfaceC4135
    /* JADX INFO: renamed from: getCookies */
    public final C4132 mo403getCookies() {
        return (C4132) this.f12476.getValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public abstract Object mo8493(byte[] bArr, ContinuationImpl continuationImpl);

    @Override // io.ktor.server.response.InterfaceC4133
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C4134 mo379() {
        return this.f12477;
    }

    @Override // io.ktor.server.response.InterfaceC4135
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final /* bridge */ /* synthetic */ InterfaceC4056 mo380() {
        return this.f12480;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m8522(AbstractC3986 abstractC3986) {
        C8124 c8124Mo8293;
        abstractC3986.getClass();
        if (this.f12475) {
            throw new IllegalStateException() { // from class: io.ktor.server.engine.BaseApplicationResponse$ResponseAlreadySentException
            };
        }
        int i = 1;
        this.f12475 = true;
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        C8096 c8096Mo8290 = abstractC3986.mo8290();
        if (c8096Mo8290 != null) {
            mo396(c8096Mo8290);
        } else if (this.f12478 == null) {
            c8096Mo8290 = C8096.f22353;
            mo396(c8096Mo8290);
        }
        abstractC3986.mo8292().mo8365(new C0981(ref$BooleanRef, abstractC3986, this, i));
        Long lMo8294 = abstractC3986.mo8294();
        if (lMo8294 != null) {
            C4084 c4084 = (C4084) this;
            String[] strArr = AbstractC8114.f22415;
            long jLongValue = lMo8294.longValue();
            String[] strArr2 = AbstractC4103.f12468;
            c4084.f12411.m288("Content-Length", (0 > jLongValue || jLongValue >= 1024) ? String.valueOf(jLongValue) : AbstractC4103.f12468[(int) jLongValue], false);
        } else if (!ref$BooleanRef.element && !(abstractC3986 instanceof C4175)) {
            if (abstractC3986 instanceof AbstractC3996) {
                String[] strArr3 = AbstractC8114.f22415;
                ((C4084) this).f12411.m288("Content-Length", "0", false);
            } else {
                String[] strArr4 = AbstractC8114.f22415;
                ((C4084) this).f12411.m288("Transfer-Encoding", "chunked", false);
            }
        }
        String[] strArr5 = AbstractC8114.f22415;
        C0076 c0076 = ((C4084) this).f12411;
        if (c0076.m260("Content-Type") == null && (c8124Mo8293 = abstractC3986.mo8293()) != null) {
            c0076.m288("Content-Type", c8124Mo8293.toString(), false);
        }
        C4082 c4082 = this.f12480;
        String strMo8366 = c4082.f12397.mo383().mo8366("Connection");
        if (strMo8366 == null || c4082.f12396.f12411.m260("Connection") != null) {
            return;
        }
        if (strMo8366.equalsIgnoreCase("close")) {
            AbstractC3064.m6780(this, "Connection", "close");
        } else if (strMo8366.equalsIgnoreCase("keep-alive")) {
            AbstractC3064.m6780(this, "Connection", "keep-alive");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public abstract Object mo8494(C4175 c4175, ContinuationImpl continuationImpl);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public abstract Object mo8497(ContinuationImpl continuationImpl);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public abstract Object mo8498(ContinuationImpl continuationImpl);

    @Override // io.ktor.server.response.InterfaceC4135
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo395() {
        return this.f12479;
    }

    @Override // io.ktor.server.response.InterfaceC4135
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo396(C8096 c8096) {
        c8096.getClass();
        this.f12478 = c8096;
        ((C4084) this).f12408 = c8096;
    }

    @Override // io.ktor.server.response.InterfaceC4135
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final boolean mo397() {
        return this.f12475;
    }

    @Override // io.ktor.server.response.InterfaceC4135
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final C8096 mo398() {
        return this.f12478;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public abstract Object mo8499(AbstractC3986 abstractC3986, ContinuationImpl continuationImpl);
}
