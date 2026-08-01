package org.luckypray.dexkit.query.matchers;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class AnnotationElementMatcher$classValue$2$1$1 extends p000.bp0 implements p000.a80 {
    final /* synthetic */ java.lang.String $className;
    final /* synthetic */ boolean $ignoreCase;
    final /* synthetic */ org.luckypray.dexkit.query.enums.StringMatchType $matchType;

    public AnnotationElementMatcher$classValue$2$1$1(java.lang.String r1, org.luckypray.dexkit.query.enums.StringMatchType r2, boolean r3) {
            r0 = this;
            r0.$className = r1
            r0.$matchType = r2
            r0.$ignoreCase = r3
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // p000.a80
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
            r0 = this;
            org.luckypray.dexkit.query.matchers.ClassMatcher r1 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r1
            r0.invoke(r1)
            s62 r0 = p000.s62.f9751
            return r0
    }

    public final void invoke(org.luckypray.dexkit.query.matchers.ClassMatcher r3) {
            r2 = this;
            r3.getClass()
            java.lang.String r0 = r2.$className
            org.luckypray.dexkit.query.enums.StringMatchType r1 = r2.$matchType
            boolean r2 = r2.$ignoreCase
            r3.className(r0, r1, r2)
            return
    }
}
