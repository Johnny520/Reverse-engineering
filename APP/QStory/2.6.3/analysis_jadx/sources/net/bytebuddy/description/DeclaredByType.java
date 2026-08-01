package net.bytebuddy.description;

import javax.annotation.Nonnull;
import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.utility.nullability.MaybeNull;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public interface DeclaredByType {

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public interface WithMandatoryDeclaration extends DeclaredByType {
        @Override // net.bytebuddy.description.DeclaredByType
        @Nonnull
        TypeDefinition getDeclaringType();
    }

    @MaybeNull
    TypeDefinition getDeclaringType();
}
