package org.luckypray.dexkit.query.matchers;

import org.luckypray.dexkit.query.enums.StringMatchType;
import p000.AbstractC0184d9;
import p000.C0022b5;
import p000.InterfaceC0482u5;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class AnnotationEncodeArrayMatcher$addClass$2$1$1 extends AbstractC0184d9 implements InterfaceC0482u5 {
    final /* synthetic */ String $className;
    final /* synthetic */ boolean $ignoreCase;
    final /* synthetic */ StringMatchType $matchType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnotationEncodeArrayMatcher$addClass$2$1$1(String str, StringMatchType stringMatchType, boolean z) {
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

    @Override // p000.InterfaceC0482u5
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ClassMatcher) obj);
        return C0022b5.f60d;
    }
}
