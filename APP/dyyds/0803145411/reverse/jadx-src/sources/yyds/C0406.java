package yyds;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: yyds.ᛲᛷᲇᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class C0406 implements InterfaceC0652 {
    @Override // yyds.InterfaceC0652
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final AbstractC2720 mo976(C0114 c0114, C2805 c2805) {
        Type type = c2805.f13683;
        boolean z = type instanceof GenericArrayType;
        if (!z && (!(type instanceof Class) || !((Class) type).isArray())) {
            return null;
        }
        Type genericComponentType = z ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
        return new C1425(c0114, c0114.m521(new C2805(genericComponentType)), AbstractC1917.m3698(genericComponentType));
    }
}
