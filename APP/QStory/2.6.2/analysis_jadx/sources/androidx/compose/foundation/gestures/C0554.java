package androidx.compose.foundation.gestures;

import androidx.appcompat.app.C0113;
import androidx.compose.ui.input.pointer.C1643;
import androidx.compose.ui.input.pointer.C1652;
import com.alibaba.fastjson2.AbstractC2904;
import kotlin.collections.AbstractC4343;
import kotlin.sequences.C5127;
import kotlinx.coroutines.C5416;
import kotlinx.coroutines.channels.AbstractC5204;
import kotlinx.coroutines.channels.C5189;
import kotlinx.coroutines.channels.C5209;
import p052.InterfaceC6553;
import p205.InterfaceC7895;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0554 extends AbstractC0556 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C0113 f1592;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C5416 f1593;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C5189 f1594;

    public C0554(C0502 c0502, C0113 c0113, InterfaceC6553 interfaceC6553, InterfaceC7895 interfaceC7895) {
        super(c0502, interfaceC6553, interfaceC7895);
        this.f1592 = c0113;
        this.f1594 = AbstractC5204.m10278(Integer.MAX_VALUE, 6, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, androidx.compose.animation.core.飘花落叶言子楪苏哲兰世] */
    /* JADX WARN: Type inference failed for: r4v3, types: [T, androidx.compose.foundation.gestures.飘花落叶言子苏哲楪兰世] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m1335(androidx.compose.foundation.gestures.C0554 r13, kotlin.jvm.internal.Ref$ObjectRef r14, kotlin.jvm.internal.Ref$FloatRef r15, androidx.compose.foundation.gestures.C0502 r16, kotlin.jvm.internal.Ref$ObjectRef r17, long r18, kotlin.coroutines.jvm.internal.ContinuationImpl r20) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.C0554.m1335(androidx.compose.foundation.gestures.飘花落叶言子苏哲世兰楪, kotlin.jvm.internal.Ref$ObjectRef, kotlin.jvm.internal.Ref$FloatRef, androidx.compose.foundation.gestures.飘花落叶言子哲兰楪世苏, kotlin.jvm.internal.Ref$ObjectRef, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r0v12, types: [T, androidx.compose.animation.core.飘花落叶言子楪苏哲兰世] */
    /* JADX WARN: Type inference failed for: r0v16, types: [T, androidx.compose.foundation.gestures.飘花落叶言子苏哲楪兰世] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m1336(androidx.compose.foundation.gestures.C0554 r21, androidx.compose.foundation.gestures.C0502 r22, androidx.compose.foundation.gestures.C0559 r23, float r24, float r25, kotlin.coroutines.jvm.internal.ContinuationImpl r26) {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.C0554.m1336(androidx.compose.foundation.gestures.飘花落叶言子苏哲世兰楪, androidx.compose.foundation.gestures.飘花落叶言子哲兰楪世苏, androidx.compose.foundation.gestures.飘花落叶言子苏哲楪兰世, float, float, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static C0559 m1337(C5189 c5189) {
        C0559 c0559 = null;
        C5127 c5127M6249 = AbstractC2904.m6249(new NonTouchScrollingLogicKt$untilNull$1(new C0558(c5189, 0), null));
        while (c5127M6249.hasNext()) {
            C0559 c0559M1342 = (C0559) c5127M6249.next();
            if (c0559 != null) {
                c0559M1342 = c0559.m1342(c0559M1342);
            }
            c0559 = c0559M1342;
        }
        return c0559;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean m1338(C1652 c1652, long j) {
        boolean zMo1277;
        C0113 c0113 = this.f1592;
        long jM443 = c0113.m443(c1652);
        C0502 c0502 = this.f1604;
        float fM1260 = c0502.m1260(c0502.m1253(jM443));
        if (fM1260 == 0.0f) {
            zMo1277 = false;
        } else {
            InterfaceC0513 interfaceC0513 = c0502.f1491;
            zMo1277 = fM1260 > 0.0f ? interfaceC0513.mo1277() : interfaceC0513.mo1278();
        }
        if (!zMo1277) {
            return this.f1601;
        }
        long j2 = ((C1643) AbstractC4343.m8827(c1652.f4851)).f4807;
        c0113.getClass();
        return !(this.f1594.mo8445(new C0559(jM443, j2, false)) instanceof C5209);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float m1339(InterfaceC0557 interfaceC0557, float f) {
        C0502 c0502 = this.f1604;
        long jM1258 = c0502.m1258(c0502.m1254(f));
        C0502 c05022 = ((C0515) interfaceC0557).f1513;
        return c0502.m1259(c0502.m1253(c05022.m1255(c05022.f1495, jM1258, 1)));
    }
}
