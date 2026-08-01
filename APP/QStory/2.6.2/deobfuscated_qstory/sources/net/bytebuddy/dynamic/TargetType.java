package net.bytebuddy.dynamic;

import net.bytebuddy.description.type.TypeDescription;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class TargetType {
    public static final TypeDescription DESCRIPTION = TypeDescription.ForLoadedType.of(TargetType.class);

    private TargetType() {
        throw new UnsupportedOperationException("This class only serves as a marker type and should not be instantiated");
    }

    public static TypeDescription resolve(TypeDescription typeDescription, TypeDescription typeDescription2) {
        int i = 0;
        TypeDescription componentType = typeDescription;
        while (componentType.isArray()) {
            componentType = componentType.getComponentType();
            i++;
        }
        return componentType.represents(TargetType.class) ? TypeDescription.ArrayProjection.of(typeDescription2, i) : typeDescription;
    }
}
