package org.luckypray.dexkit.query.matchers;

import kotlin.C6008;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import org.luckypray.dexkit.query.enums.StringMatchType;
import p068.InterfaceC7387;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪世苏哲兰;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "invoke", "(Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪世苏哲兰;)V", "<anonymous>"}, m152k = 3, m153mv = {1, 5, 1})
final class AnnotationElementMatcher$classValue$2$1$1 extends Lambda implements InterfaceC7387 {
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

    public final void invoke(C6539 c6539) {
        c6539.getClass();
        c6539.m11680(this.$className, this.$matchType, this.$ignoreCase);
    }

    @Override // p068.InterfaceC7387
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C6539) obj);
        return C6008.f15084;
    }
}
