package yyds;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: yyds.ᲈᛷᛵᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2700 extends AbstractC1982 {

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ Method f13256;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f13257;

    public C2700(Method method, int i) {
        this.f13256 = method;
        this.f13257 = i;
    }

    @Override // yyds.AbstractC1982
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final Object mo522(Class cls) {
        String strM4046 = C2133.m4046(cls);
        if (strM4046 != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strM4046));
        }
        return this.f13256.invoke(null, cls, Integer.valueOf(this.f13257));
    }
}
