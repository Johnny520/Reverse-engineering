package net.bytebuddy.build;

import net.bytebuddy.description.type.TypeDescription;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public interface AndroidDescriptor {

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public enum Trivial implements AndroidDescriptor {
        LOCAL(TypeScope.LOCAL),
        EXTERNAL(TypeScope.EXTERNAL);

        private final TypeScope typeScope;

        Trivial(TypeScope typeScope) {
            this.typeScope = typeScope;
        }

        @Override // net.bytebuddy.build.AndroidDescriptor
        public TypeScope getTypeScope(TypeDescription typeDescription) {
            return this.typeScope;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public enum TypeScope {
        LOCAL,
        EXTERNAL
    }

    TypeScope getTypeScope(TypeDescription typeDescription);
}
