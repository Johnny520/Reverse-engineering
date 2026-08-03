package org.luckypray.dexkit.query.matchers;

import Yue.AbstractC5673;
import Yue.C5499;
import Yue.C8107;
import Yue.InterfaceC5124;
import Yue.InterfaceC6399;
import kotlin.Metadata;
import org.luckypray.dexkit.query.enums.StringMatchType;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "LYue/ۥۣۢ۠ۤ;", "invoke", "(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
public final class AnnotationEncodeArrayMatcher$addClass$2$1$1 extends AbstractC5673 implements InterfaceC5124<ClassMatcher, C8107> {
    final /* synthetic */ String $className;
    final /* synthetic */ boolean $ignoreCase;
    final /* synthetic */ StringMatchType $matchType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnotationEncodeArrayMatcher$addClass$2$1$1(String str, StringMatchType stringMatchType, boolean z) {
        super(1);
        this.$className = str;
        this.$matchType = stringMatchType;
        this.$ignoreCase = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // Yue.InterfaceC5124
    public /* bridge */ /* synthetic */ C8107 invoke(ClassMatcher classMatcher) {
        invoke2(classMatcher);
        return C8107.f3222;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@InterfaceC6399 ClassMatcher classMatcher) {
        C5499.m17103(classMatcher, "$this$classValue");
        classMatcher.className(this.$className, this.$matchType, this.$ignoreCase);
    }
}
