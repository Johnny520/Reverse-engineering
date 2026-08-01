package androidx.compose.animation;

import androidx.compose.p001ui.graphics.AbstractC2416;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.AbstractC2225;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2208;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p068.InterfaceC7383;

/* JADX INFO: renamed from: androidx.compose.animation.LookaheadAnimationVisualDebugHelperKt$LookaheadAnimationVisualDebugging$1 */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final class C0015x760bb9fd extends Lambda implements InterfaceC7383 {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ InterfaceC7383 $content;
    final /* synthetic */ boolean $isEnabled;
    final /* synthetic */ boolean $isShowKeyLabelEnabled;
    final /* synthetic */ long $multipleMatchesColor;
    final /* synthetic */ long $overlayColor;
    final /* synthetic */ long $unmatchedElementColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0015x760bb9fd(boolean z, long j, long j2, long j3, boolean z2, InterfaceC7383 interfaceC7383, int i, int i2) {
        super(2);
        this.$isEnabled = z;
        this.$overlayColor = j;
        this.$multipleMatchesColor = j2;
        this.$unmatchedElementColor = j3;
        this.$isShowKeyLabelEnabled = z2;
        this.$content = interfaceC7383;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(InterfaceC2208 interfaceC2208, int i) {
        int i2;
        int i3;
        int i4;
        long j;
        long j2;
        boolean z;
        boolean z2;
        boolean z3 = this.$isEnabled;
        long jM3440 = this.$overlayColor;
        long jM34402 = this.$multipleMatchesColor;
        long jM34403 = this.$unmatchedElementColor;
        boolean z4 = this.$isShowKeyLabelEnabled;
        InterfaceC7383 interfaceC7383 = this.$content;
        int iM3031 = AbstractC2202.m3031(this.$$changed | 1);
        int i5 = this.$$default;
        int i6 = AbstractC1223.f1631;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(1722790302);
        int i7 = i5 & 1;
        if (i7 != 0) {
            i2 = iM3031 | 6;
        } else if ((iM3031 & 6) == 0) {
            i2 = (c2159.m2939(z3) ? 4 : 2) | iM3031;
        } else {
            i2 = iM3031;
        }
        int i8 = i5 & 2;
        if (i8 != 0) {
            i2 |= 48;
        } else if ((iM3031 & 48) == 0) {
            i2 |= c2159.m2921(jM3440) ? 32 : 16;
        }
        int i9 = i5 & 4;
        if (i9 != 0) {
            i2 |= 384;
        } else if ((iM3031 & 384) == 0) {
            i2 |= c2159.m2921(jM34402) ? 256 : 128;
        }
        int i10 = i5 & 8;
        if (i10 != 0) {
            i2 |= 3072;
            i3 = i5;
        } else {
            i3 = i5;
            if ((iM3031 & 3072) == 0) {
                i2 |= c2159.m2921(jM34403) ? 2048 : 1024;
            }
        }
        int i11 = i3 & 16;
        if (i11 != 0) {
            i2 |= 24576;
            i4 = i11;
        } else {
            i4 = i11;
            if ((iM3031 & 24576) == 0) {
                i2 |= c2159.m2939(z4) ? 16384 : 8192;
            }
        }
        if ((196608 & iM3031) == 0) {
            i2 |= c2159.m2938(interfaceC7383) ? 131072 : 65536;
        }
        if (c2159.m2903(i2 & 1, (74899 & i2) != 74898)) {
            boolean z5 = i7 != 0 ? true : z3;
            if (i8 != 0) {
                jM3440 = AbstractC2416.m3440(2150934611L);
            }
            long j3 = jM3440;
            if (i9 != 0) {
                jM34402 = AbstractC2416.m3440(4293542709L);
            }
            long j4 = jM34402;
            if (i10 != 0) {
                jM34403 = AbstractC2416.m3440(4288323750L);
            }
            long j5 = jM34403;
            boolean z6 = i4 != 0 ? false : z4;
            AbstractC2202.m3047(((AbstractC2225) AbstractC1256.f1704.getValue()).mo2988(new C1228(z5, j3, j4, j5, z6)), interfaceC7383, c2159, ((i2 >> 12) & 112) | 8);
            z = z5;
            jM3440 = j3;
            j = j4;
            j2 = j5;
            z2 = z6;
        } else {
            c2159.m2899();
            j = jM34402;
            j2 = jM34403;
            z = z3;
            z2 = z4;
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new C0015x760bb9fd(z, jM3440, j, j2, z2, interfaceC7383, iM3031, i3);
        }
    }

    @Override // p068.InterfaceC7383
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC2208) obj, ((Number) obj2).intValue());
        return C6008.f15084;
    }
}
