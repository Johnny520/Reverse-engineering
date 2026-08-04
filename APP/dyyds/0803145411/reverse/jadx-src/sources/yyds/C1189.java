package yyds;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: yyds.ᛵᲀᲀᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1189 extends AbstractC2197 {

    /* JADX INFO: renamed from: ᛱᛳᛶᛳ, reason: contains not printable characters */
    public Object f5455;

    /* JADX INFO: renamed from: ᛸᛸᛷᛱ, reason: contains not printable characters */
    public C0514 f5456;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final void m2391(EnumC2298... enumC2298Arr) {
        AbstractC1432.m2927(this.f12007, (EnumC2298[]) Arrays.copyOf(enumC2298Arr, enumC2298Arr.length));
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final void m2392(Object... objArr) {
        m4189(Arrays.copyOf(objArr, objArr.length));
    }

    @Override // yyds.AbstractC2441
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final List mo736() {
        C0903 c0903 = this.f12002;
        if (c0903 != null) {
            return AbstractC0384.m1096(this, c0903, c0903.f4115, new C1713(this, c0903, 0));
        }
        C0188.m798("You must provide a configuration to resolve the member use build(configuration).");
        return null;
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final void m2393() {
        this.f10790 = 0;
    }

    @Override // yyds.AbstractC2197, yyds.AbstractC2441
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final Map mo1846() {
        Map mapMo1846 = super.mo1846();
        Map mapM4385 = AbstractC2366.m4385(new Pair("returnType", this.f5455), new Pair("returnTypeCondition", this.f5456), new Pair("isBridge", null), new Pair("isBridgeNot", null), new Pair("isDefault", null), new Pair("isDefaultNot", null));
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapMo1846);
        linkedHashMap.putAll(mapM4385);
        return linkedHashMap;
    }
}
