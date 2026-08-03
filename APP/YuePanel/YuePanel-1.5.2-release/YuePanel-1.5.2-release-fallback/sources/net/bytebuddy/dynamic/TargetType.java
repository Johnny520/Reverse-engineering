package net.bytebuddy.dynamic;

/* JADX INFO: loaded from: classes2.dex */
public final class TargetType {
    public static final net.bytebuddy.description.type.TypeDescription DESCRIPTION = null;

    static {
            java.lang.Class<net.bytebuddy.dynamic.TargetType> r0 = net.bytebuddy.dynamic.TargetType.class
            net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
            net.bytebuddy.dynamic.TargetType.DESCRIPTION = r0
            return
    }

    private TargetType() {
            r2 = this;
            r2.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "This class only serves as a marker type and should not be instantiated"
            r0.<init>(r1)
            throw r0
    }

    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
    public static net.bytebuddy.description.type.TypeDescription resolve(net.bytebuddy.description.type.TypeDescription r3, net.bytebuddy.description.type.TypeDescription r4) {
            r0 = 0
            r1 = r3
        L2:
            boolean r2 = r1.isArray()
            if (r2 == 0) goto Lf
            net.bytebuddy.description.type.TypeDescription r1 = r1.getComponentType()
            int r0 = r0 + 1
            goto L2
        Lf:
            java.lang.Class<net.bytebuddy.dynamic.TargetType> r2 = net.bytebuddy.dynamic.TargetType.class
            boolean r1 = r1.represents(r2)
            if (r1 == 0) goto L1b
            net.bytebuddy.description.type.TypeDescription r3 = net.bytebuddy.description.type.TypeDescription.ArrayProjection.of(r4, r0)
        L1b:
            return r3
    }
}
