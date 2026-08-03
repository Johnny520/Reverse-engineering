package net.bytebuddy.description;

/* JADX INFO: loaded from: classes2.dex */
public interface NamedElement {
    public static final java.lang.String EMPTY_NAME = "";

    @net.bytebuddy.utility.nullability.AlwaysNull
    public static final java.lang.String NO_NAME = null;

    public interface WithDescriptor extends net.bytebuddy.description.NamedElement {

        @net.bytebuddy.utility.nullability.AlwaysNull
        public static final java.lang.String NON_GENERIC_SIGNATURE = null;

        static {
                return
        }

        java.lang.String getDescriptor();

        @net.bytebuddy.utility.nullability.MaybeNull
        java.lang.String getGenericSignature();
    }

    public interface WithGenericName extends net.bytebuddy.description.NamedElement.WithRuntimeName {
        java.lang.String toGenericString();
    }

    public interface WithOptionalName extends net.bytebuddy.description.NamedElement {
        boolean isNamed();
    }

    public interface WithRuntimeName extends net.bytebuddy.description.NamedElement {
        java.lang.String getInternalName();

        java.lang.String getName();
    }

    static {
            return
    }

    java.lang.String getActualName();
}
