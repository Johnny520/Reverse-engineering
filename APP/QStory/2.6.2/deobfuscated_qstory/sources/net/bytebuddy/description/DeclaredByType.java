package net.bytebuddy.description;

import javax.annotation.Nonnull;
import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.utility.nullability.MaybeNull;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public interface DeclaredByType {

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public interface WithMandatoryDeclaration extends DeclaredByType {
        @Override // net.bytebuddy.description.DeclaredByType
        @Nonnull
        TypeDefinition getDeclaringType();
    }

    @MaybeNull
    TypeDefinition getDeclaringType();
}
