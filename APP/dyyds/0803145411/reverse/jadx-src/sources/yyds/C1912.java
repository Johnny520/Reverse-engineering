package yyds;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: yyds.ᛸᲈᛷᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1912 extends AbstractC1982 {

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ Method f9657;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ Object f9658;

    public C1912(Object obj, Method method) {
        this.f9657 = method;
        this.f9658 = obj;
    }

    @Override // yyds.AbstractC1982
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final Object mo522(Class cls) {
        String strM4046 = C2133.m4046(cls);
        if (strM4046 != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strM4046));
        }
        return this.f9657.invoke(this.f9658, cls);
    }
}
