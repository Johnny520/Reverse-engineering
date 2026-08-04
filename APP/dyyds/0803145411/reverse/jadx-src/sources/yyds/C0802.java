package yyds;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: yyds.ᛴᛲᛶᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0802 extends AbstractC2441 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public Object f3681;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public InterfaceC1549 f3682;

    @Override // yyds.AbstractC2441
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final List mo736() {
        C0903 c0903 = this.f12002;
        if (c0903 != null) {
            return AbstractC0384.m1096(this, c0903, c0903.f4115, new C1713(this, c0903, 1));
        }
        C0188.m798("You must provide a configuration to resolve the member use build(configuration).");
        return null;
    }

    @Override // yyds.AbstractC2441
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Map mo1846() {
        Map mapMo1846 = super.mo1846();
        Map mapM4385 = AbstractC2366.m4385(new Pair("isEnumConstant", null), new Pair("isEnumConstantNot", null), new Pair("type", this.f3681), new Pair("typeCondition", this.f3682), new Pair("genericType", null), new Pair("genericTypeCondition", null));
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapMo1846);
        linkedHashMap.putAll(mapM4385);
        return linkedHashMap;
    }
}
