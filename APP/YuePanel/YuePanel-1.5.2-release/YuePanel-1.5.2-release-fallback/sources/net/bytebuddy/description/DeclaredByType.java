package net.bytebuddy.description;

/* JADX INFO: loaded from: classes2.dex */
public interface DeclaredByType {

    public interface WithMandatoryDeclaration extends net.bytebuddy.description.DeclaredByType {
        @Override // net.bytebuddy.description.DeclaredByType
        @javax.annotation.Nonnull
        net.bytebuddy.description.type.TypeDefinition getDeclaringType();
    }

    @net.bytebuddy.utility.nullability.MaybeNull
    net.bytebuddy.description.type.TypeDefinition getDeclaringType();
}
