package net.bytebuddy.description;

import net.bytebuddy.utility.nullability.AlwaysNull;
import net.bytebuddy.utility.nullability.MaybeNull;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public interface NamedElement {
    public static final String EMPTY_NAME = "";

    @AlwaysNull
    public static final String NO_NAME = null;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public interface WithDescriptor extends NamedElement {

        @AlwaysNull
        public static final String NON_GENERIC_SIGNATURE = null;

        String getDescriptor();

        @MaybeNull
        String getGenericSignature();
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public interface WithGenericName extends WithRuntimeName {
        String toGenericString();
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public interface WithOptionalName extends NamedElement {
        boolean isNamed();
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public interface WithRuntimeName extends NamedElement {
        String getInternalName();

        String getName();
    }

    String getActualName();
}
