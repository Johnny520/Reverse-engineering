package org.luckypray.dexkit.query.matchers;

import org.luckypray.dexkit.query.enums.StringMatchType;
import p000.InterfaceC0742sw;
import p000.c50;
import p000.na1;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class AnnotationElementMatcher$classValue$2$1$1 extends c50 implements InterfaceC0742sw {
    final /* synthetic */ String $className;
    final /* synthetic */ boolean $ignoreCase;
    final /* synthetic */ StringMatchType $matchType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnotationElementMatcher$classValue$2$1$1(String str, StringMatchType stringMatchType, boolean z) {
        super(1);
        this.$className = str;
        this.$matchType = stringMatchType;
        this.$ignoreCase = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void invoke(ClassMatcher classMatcher) {
        classMatcher.getClass();
        classMatcher.className(this.$className, this.$matchType, this.$ignoreCase);
    }

    @Override // p000.InterfaceC0742sw
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ClassMatcher) obj);
        return na1.f4229a;
    }
}
