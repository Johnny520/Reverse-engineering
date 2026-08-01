package androidx.compose.animation;

import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.AbstractC1390;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.ui.graphics.AbstractC1581;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6554;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class LookaheadAnimationVisualDebugHelperKt$LookaheadAnimationVisualDebugging$1 extends Lambda implements InterfaceC6554 {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ InterfaceC6554 $content;
    final /* synthetic */ boolean $isEnabled;
    final /* synthetic */ boolean $isShowKeyLabelEnabled;
    final /* synthetic */ long $multipleMatchesColor;
    final /* synthetic */ long $overlayColor;
    final /* synthetic */ long $unmatchedElementColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LookaheadAnimationVisualDebugHelperKt$LookaheadAnimationVisualDebugging$1(boolean z, long j, long j2, long j3, boolean z2, InterfaceC6554 interfaceC6554, int i, int i2) {
        super(2);
        this.$isEnabled = z;
        this.$overlayColor = j;
        this.$multipleMatchesColor = j2;
        this.$unmatchedElementColor = j3;
        this.$isShowKeyLabelEnabled = z2;
        this.$content = interfaceC6554;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(InterfaceC1373 interfaceC1373, int i) {
        int i2;
        int i3;
        int i4;
        long j;
        long j2;
        boolean z;
        boolean z2;
        boolean z3 = this.$isEnabled;
        long jM2880 = this.$overlayColor;
        long jM28802 = this.$multipleMatchesColor;
        long jM28803 = this.$unmatchedElementColor;
        boolean z4 = this.$isShowKeyLabelEnabled;
        InterfaceC6554 interfaceC6554 = this.$content;
        int iM2471 = AbstractC1367.m2471(this.$$changed | 1);
        int i5 = this.$$default;
        int i6 = AbstractC0377.f1286;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(1722790302);
        int i7 = i5 & 1;
        if (i7 != 0) {
            i2 = iM2471 | 6;
        } else if ((iM2471 & 6) == 0) {
            i2 = (c1324.m2379(z3) ? 4 : 2) | iM2471;
        } else {
            i2 = iM2471;
        }
        int i8 = i5 & 2;
        if (i8 != 0) {
            i2 |= 48;
        } else if ((iM2471 & 48) == 0) {
            i2 |= c1324.m2361(jM2880) ? 32 : 16;
        }
        int i9 = i5 & 4;
        if (i9 != 0) {
            i2 |= 384;
        } else if ((iM2471 & 384) == 0) {
            i2 |= c1324.m2361(jM28802) ? 256 : 128;
        }
        int i10 = i5 & 8;
        if (i10 != 0) {
            i2 |= 3072;
            i3 = i5;
        } else {
            i3 = i5;
            if ((iM2471 & 3072) == 0) {
                i2 |= c1324.m2361(jM28803) ? 2048 : 1024;
            }
        }
        int i11 = i3 & 16;
        if (i11 != 0) {
            i2 |= 24576;
            i4 = i11;
        } else {
            i4 = i11;
            if ((iM2471 & 24576) == 0) {
                i2 |= c1324.m2379(z4) ? 16384 : 8192;
            }
        }
        if ((196608 & iM2471) == 0) {
            i2 |= c1324.m2378(interfaceC6554) ? 131072 : 65536;
        }
        if (c1324.m2343(i2 & 1, (74899 & i2) != 74898)) {
            boolean z5 = i7 != 0 ? true : z3;
            if (i8 != 0) {
                jM2880 = AbstractC1581.m2880(2150934611L);
            }
            long j3 = jM2880;
            if (i9 != 0) {
                jM28802 = AbstractC1581.m2880(4293542709L);
            }
            long j4 = jM28802;
            if (i10 != 0) {
                jM28803 = AbstractC1581.m2880(4288323750L);
            }
            long j5 = jM28803;
            boolean z6 = i4 != 0 ? false : z4;
            AbstractC1367.m2487(((AbstractC1390) AbstractC0410.f1359.getValue()).mo2428(new C0382(z5, j3, j4, j5, z6)), interfaceC6554, c1324, ((i2 >> 12) & 112) | 8);
            z = z5;
            jM2880 = j3;
            j = j4;
            j2 = j5;
            z2 = z6;
        } else {
            c1324.m2339();
            j = jM28802;
            j2 = jM28803;
            z = z3;
            z2 = z4;
        }
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new LookaheadAnimationVisualDebugHelperKt$LookaheadAnimationVisualDebugging$1(z, jM2880, j, j2, z2, interfaceC6554, iM2471, i3);
        }
    }

    @Override // p052.InterfaceC6554
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC1373) obj, ((Number) obj2).intValue());
        return C5176.f14739;
    }
}
