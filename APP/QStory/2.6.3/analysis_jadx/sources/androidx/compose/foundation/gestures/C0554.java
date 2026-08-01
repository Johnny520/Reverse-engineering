package androidx.compose.foundation.gestures;

import androidx.appcompat.app.C0113;
import androidx.compose.ui.input.pointer.C1643;
import androidx.compose.ui.input.pointer.C1652;
import kotlin.collections.AbstractC4344;
import kotlin.sequences.C5128;
import kotlinx.coroutines.C5417;
import kotlinx.coroutines.channels.AbstractC5205;
import kotlinx.coroutines.channels.C5190;
import kotlinx.coroutines.channels.C5210;
import p052.InterfaceC6554;
import p053.AbstractC6561;
import p205.InterfaceC7896;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0554 extends AbstractC0556 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C0113 f1593;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C5417 f1594;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C5190 f1595;

    public C0554(C0502 c0502, C0113 c0113, InterfaceC6554 interfaceC6554, InterfaceC7896 interfaceC7896) {
        super(c0502, interfaceC6554, interfaceC7896);
        this.f1593 = c0113;
        this.f1595 = AbstractC5205.m10282(Integer.MAX_VALUE, 6, null);
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
    public static final java.lang.Object m1345(androidx.compose.foundation.gestures.C0554 r13, kotlin.jvm.internal.Ref$ObjectRef r14, kotlin.jvm.internal.Ref$FloatRef r15, androidx.compose.foundation.gestures.C0502 r16, kotlin.jvm.internal.Ref$ObjectRef r17, long r18, kotlin.coroutines.jvm.internal.ContinuationImpl r20) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.C0554.m1345(androidx.compose.foundation.gestures.飘花落叶言子苏哲世兰楪, kotlin.jvm.internal.Ref$ObjectRef, kotlin.jvm.internal.Ref$FloatRef, androidx.compose.foundation.gestures.飘花落叶言子哲兰楪世苏, kotlin.jvm.internal.Ref$ObjectRef, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
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
    public static final java.lang.Object m1346(androidx.compose.foundation.gestures.C0554 r21, androidx.compose.foundation.gestures.C0502 r22, androidx.compose.foundation.gestures.C0559 r23, float r24, float r25, kotlin.coroutines.jvm.internal.ContinuationImpl r26) {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.C0554.m1346(androidx.compose.foundation.gestures.飘花落叶言子苏哲世兰楪, androidx.compose.foundation.gestures.飘花落叶言子哲兰楪世苏, androidx.compose.foundation.gestures.飘花落叶言子苏哲楪兰世, float, float, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static C0559 m1347(C5190 c5190) {
        C0559 c0559 = null;
        C5128 c5128M12045 = AbstractC6561.m12045(new NonTouchScrollingLogicKt$untilNull$1(new C0558(c5190, 0), null));
        while (c5128M12045.hasNext()) {
            C0559 c0559M1352 = (C0559) c5128M12045.next();
            if (c0559 != null) {
                c0559M1352 = c0559.m1352(c0559M1352);
            }
            c0559 = c0559M1352;
        }
        return c0559;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean m1348(C1652 c1652, long j) {
        boolean zMo1287;
        C0113 c0113 = this.f1593;
        long jM444 = c0113.m444(c1652);
        C0502 c0502 = this.f1605;
        float fM1270 = c0502.m1270(c0502.m1263(jM444));
        if (fM1270 == 0.0f) {
            zMo1287 = false;
        } else {
            InterfaceC0513 interfaceC0513 = c0502.f1492;
            zMo1287 = fM1270 > 0.0f ? interfaceC0513.mo1287() : interfaceC0513.mo1288();
        }
        if (!zMo1287) {
            return this.f1602;
        }
        long j2 = ((C1643) AbstractC4344.m8820(c1652.f4852)).f4808;
        c0113.getClass();
        return !(this.f1595.mo8436(new C0559(jM444, j2, false)) instanceof C5210);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float m1349(InterfaceC0557 interfaceC0557, float f) {
        C0502 c0502 = this.f1605;
        long jM1268 = c0502.m1268(c0502.m1264(f));
        C0502 c05022 = ((C0515) interfaceC0557).f1514;
        return c0502.m1269(c0502.m1263(c05022.m1265(c05022.f1496, jM1268, 1)));
    }
}
