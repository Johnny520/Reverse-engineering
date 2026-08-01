package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.C5027;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4869;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4877;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4913;
import kotlin.reflect.jvm.internal.impl.types.C4873;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4872;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import p097.InterfaceC7222;
import p098.C7239;
import p101.InterfaceC7253;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.checker.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4863 extends AbstractC4877 implements InterfaceC7222 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C4873 f14147;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final AbstractC4913 f14148;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final boolean f14149;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final boolean f14150;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final CaptureStatus f14151;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C4861 f14152;

    /* JADX WARN: Illegal instructions before constructor call */
    public C4863(CaptureStatus captureStatus, C4861 c4861, AbstractC4913 abstractC4913, C4873 c4873, boolean z, int i) {
        if ((i & 8) != 0) {
            C4873.f14171.getClass();
            c4873 = C4873.f14172;
        }
        this(captureStatus, c4861, abstractC4913, c4873, (i & 16) != 0 ? false : z, false);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4881
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final InterfaceC4872 mo9732() {
        return this.f14152;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4881
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C4873 mo9733() {
        return this.f14147;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4881
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final InterfaceC7253 mo9734() {
        return C7239.m12445(ErrorScopeKind.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4881
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final boolean mo9735() {
        return this.f14149;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4881
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final List mo9736() {
        return EmptyList.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4877
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public final AbstractC4877 mo9776(C4873 c4873) {
        c4873.getClass();
        return new C4863(this.f14151, this.f14152, this.f14148, c4873, this.f14149, this.f14150);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4877
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public final AbstractC4877 mo9741(boolean z) {
        return new C4863(this.f14151, this.f14152, this.f14148, this.f14147, z, 32);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4913
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C4863 mo9731(AbstractC4860 abstractC4860) {
        abstractC4860.getClass();
        C4861 c4861 = this.f14152;
        c4861.getClass();
        AbstractC4869 abstractC4869Mo9749 = c4861.f14144.mo9749(abstractC4860);
        C5027 c5027 = c4861.f14142 != null ? new C5027(c4861, 12, abstractC4860) : null;
        C4861 c48612 = c4861.f14143;
        if (c48612 == null) {
            c48612 = c4861;
        }
        C4861 c48613 = new C4861(abstractC4869Mo9749, c5027, c48612, c4861.f14141);
        AbstractC4913 abstractC4913 = this.f14148;
        return new C4863(this.f14151, c48613, abstractC4913 != null ? abstractC4913 : null, this.f14147, this.f14149, 32);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4877, kotlin.reflect.jvm.internal.impl.types.AbstractC4913
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final AbstractC4913 mo9741(boolean z) {
        return new C4863(this.f14151, this.f14152, this.f14148, this.f14147, z, 32);
    }

    public C4863(CaptureStatus captureStatus, C4861 c4861, AbstractC4913 abstractC4913, C4873 c4873, boolean z, boolean z2) {
        captureStatus.getClass();
        c4861.getClass();
        c4873.getClass();
        this.f14151 = captureStatus;
        this.f14152 = c4861;
        this.f14148 = abstractC4913;
        this.f14147 = c4873;
        this.f14149 = z;
        this.f14150 = z2;
    }
}
