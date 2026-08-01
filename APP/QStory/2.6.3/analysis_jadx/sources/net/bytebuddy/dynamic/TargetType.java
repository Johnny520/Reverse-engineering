package net.bytebuddy.dynamic;

import net.bytebuddy.description.type.TypeDescription;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
