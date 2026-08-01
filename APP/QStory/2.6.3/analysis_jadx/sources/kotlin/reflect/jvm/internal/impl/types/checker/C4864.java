package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.C5028;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4870;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4878;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4914;
import kotlin.reflect.jvm.internal.impl.types.C4874;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4873;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import p097.InterfaceC7223;
import p098.C7240;
import p101.InterfaceC7254;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.checker.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4864 extends AbstractC4878 implements InterfaceC7223 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C4874 f14151;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final AbstractC4914 f14152;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final boolean f14153;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final boolean f14154;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final CaptureStatus f14155;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C4862 f14156;

    /* JADX WARN: Illegal instructions before constructor call */
    public C4864(CaptureStatus captureStatus, C4862 c4862, AbstractC4914 abstractC4914, C4874 c4874, boolean z, int i) {
        if ((i & 8) != 0) {
            C4874.f14175.getClass();
            c4874 = C4874.f14176;
        }
        this(captureStatus, c4862, abstractC4914, c4874, (i & 16) != 0 ? false : z, false);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4882
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final InterfaceC4873 mo9722() {
        return this.f14156;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4882
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C4874 mo9723() {
        return this.f14151;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4882
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final InterfaceC7254 mo9724() {
        return C7240.m12472(ErrorScopeKind.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4882
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final boolean mo9725() {
        return this.f14153;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4882
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final List mo9726() {
        return EmptyList.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4878
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public final AbstractC4878 mo9770(C4874 c4874) {
        c4874.getClass();
        return new C4864(this.f14155, this.f14156, this.f14152, c4874, this.f14153, this.f14154);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4878
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public final AbstractC4878 mo9731(boolean z) {
        return new C4864(this.f14155, this.f14156, this.f14152, this.f14151, z, 32);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4914
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C4864 mo9721(AbstractC4861 abstractC4861) {
        abstractC4861.getClass();
        C4862 c4862 = this.f14156;
        c4862.getClass();
        AbstractC4870 abstractC4870Mo9739 = c4862.f14148.mo9739(abstractC4861);
        C5028 c5028 = c4862.f14146 != null ? new C5028(c4862, 12, abstractC4861) : null;
        C4862 c48622 = c4862.f14147;
        if (c48622 == null) {
            c48622 = c4862;
        }
        C4862 c48623 = new C4862(abstractC4870Mo9739, c5028, c48622, c4862.f14145);
        AbstractC4914 abstractC4914 = this.f14152;
        return new C4864(this.f14155, c48623, abstractC4914 != null ? abstractC4914 : null, this.f14151, this.f14153, 32);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4878, kotlin.reflect.jvm.internal.impl.types.AbstractC4914
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final AbstractC4914 mo9731(boolean z) {
        return new C4864(this.f14155, this.f14156, this.f14152, this.f14151, z, 32);
    }

    public C4864(CaptureStatus captureStatus, C4862 c4862, AbstractC4914 abstractC4914, C4874 c4874, boolean z, boolean z2) {
        captureStatus.getClass();
        c4862.getClass();
        c4874.getClass();
        this.f14155 = captureStatus;
        this.f14156 = c4862;
        this.f14152 = abstractC4914;
        this.f14151 = c4874;
        this.f14153 = z;
        this.f14154 = z2;
    }
}
