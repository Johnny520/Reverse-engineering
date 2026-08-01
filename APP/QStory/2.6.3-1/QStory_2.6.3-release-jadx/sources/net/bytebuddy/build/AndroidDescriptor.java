package net.bytebuddy.build;

import net.bytebuddy.description.type.TypeDescription;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public interface AndroidDescriptor {

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum TypeScope {
        LOCAL,
        EXTERNAL
    }

    TypeScope getTypeScope(TypeDescription typeDescription);
}
