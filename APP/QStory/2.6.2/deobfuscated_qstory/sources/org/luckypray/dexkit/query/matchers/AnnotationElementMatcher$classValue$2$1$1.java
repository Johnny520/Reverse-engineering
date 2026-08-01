package org.luckypray.dexkit.query.matchers;

import kotlin.C5175;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import org.luckypray.dexkit.query.enums.StringMatchType;
import p052.InterfaceC6557;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪世苏哲兰;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "invoke", "(Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪世苏哲兰;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
final class AnnotationElementMatcher$classValue$2$1$1 extends Lambda implements InterfaceC6557 {
    final /* synthetic */ String $className;
    final /* synthetic */ boolean $ignoreCase;
    final /* synthetic */ StringMatchType $matchType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnotationElementMatcher$classValue$2$1$1(String str, StringMatchType stringMatchType, boolean z) {
        super(1);
        this.$className = str;
        this.$matchType = stringMatchType;
        this.$ignoreCase = z;
    }

    public final void invoke(C5708 c5708) {
        c5708.getClass();
        c5708.m11064(this.$className, this.$matchType, this.$ignoreCase);
    }

    @Override // p052.InterfaceC6557
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C5708) obj);
        return C5175.f14739;
    }
}
