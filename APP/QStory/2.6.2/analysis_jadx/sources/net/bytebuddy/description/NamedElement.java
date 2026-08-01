package net.bytebuddy.description;

import net.bytebuddy.utility.nullability.AlwaysNull;
import net.bytebuddy.utility.nullability.MaybeNull;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public interface NamedElement {
    public static final String EMPTY_NAME = "";

    @AlwaysNull
    public static final String NO_NAME = null;

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public interface WithDescriptor extends NamedElement {

        @AlwaysNull
        public static final String NON_GENERIC_SIGNATURE = null;

        String getDescriptor();

        @MaybeNull
        String getGenericSignature();
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public interface WithGenericName extends WithRuntimeName {
        String toGenericString();
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public interface WithOptionalName extends NamedElement {
        boolean isNamed();
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public interface WithRuntimeName extends NamedElement {
        String getInternalName();

        String getName();
    }

    String getActualName();
}
