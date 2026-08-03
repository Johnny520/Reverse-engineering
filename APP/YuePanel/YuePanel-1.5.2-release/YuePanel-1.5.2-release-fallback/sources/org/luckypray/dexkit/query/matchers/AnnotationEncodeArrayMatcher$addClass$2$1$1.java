package org.luckypray.dexkit.query.matchers;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lorg/luckypray/dexkit/query/matchers/ClassMatcher;", "LYue/ۥۣۢ۠ۤ;", "invoke", "(Lorg/luckypray/dexkit/query/matchers/ClassMatcher;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
public final class AnnotationEncodeArrayMatcher$addClass$2$1$1 extends Yue.AbstractC3560 implements Yue.InterfaceC2825<org.luckypray.dexkit.query.matchers.ClassMatcher, Yue.C6593> {
    final /* synthetic */ java.lang.String $className;
    final /* synthetic */ boolean $ignoreCase;
    final /* synthetic */ org.luckypray.dexkit.query.enums.StringMatchType $matchType;

    public AnnotationEncodeArrayMatcher$addClass$2$1$1(java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3) {
            r0 = this;
            r0.$className = r1
            r0.$matchType = r2
            r0.$ignoreCase = r3
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // Yue.InterfaceC2825
    public /* bridge */ /* synthetic */ Yue.C6593 invoke(org.luckypray.dexkit.query.matchers.ClassMatcher r1) {
            r0 = this;
            org.luckypray.dexkit.query.matchers.ClassMatcher r1 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r1
            r0.invoke2(r1)
            Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016
            return r1
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@Yue.InterfaceC4418 org.luckypray.dexkit.query.matchers.ClassMatcher r4) {
            r3 = this;
            java.lang.String r0 = "$this$classValue"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = r3.$className
            org.luckypray.dexkit.query.enums.StringMatchType r1 = r3.$matchType
            boolean r2 = r3.$ignoreCase
            r4.className(r0, r1, r2)
            return
    }
}
