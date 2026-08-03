package net.bytebuddy.description.modifier;

/* JADX INFO: loaded from: classes2.dex */
public enum Visibility extends java.lang.Enum<net.bytebuddy.description.modifier.Visibility> implements net.bytebuddy.description.modifier.ModifierContributor.ForType, net.bytebuddy.description.modifier.ModifierContributor.ForMethod, net.bytebuddy.description.modifier.ModifierContributor.ForField {
    private static final /* synthetic */ net.bytebuddy.description.modifier.Visibility[] $VALUES = null;
    public static final net.bytebuddy.description.modifier.Visibility PACKAGE_PRIVATE = null;
    public static final net.bytebuddy.description.modifier.Visibility PRIVATE = null;
    public static final net.bytebuddy.description.modifier.Visibility PROTECTED = null;
    public static final net.bytebuddy.description.modifier.Visibility PUBLIC = null;
    private final int mask;

    /* JADX INFO: renamed from: net.bytebuddy.description.modifier.Visibility$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$net$bytebuddy$description$modifier$Visibility = null;

        static {
                net.bytebuddy.description.modifier.Visibility[] r0 = net.bytebuddy.description.modifier.Visibility.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                net.bytebuddy.description.modifier.Visibility.AnonymousClass1.$SwitchMap$net$bytebuddy$description$modifier$Visibility = r0
                net.bytebuddy.description.modifier.Visibility r1 = net.bytebuddy.description.modifier.Visibility.PUBLIC     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = net.bytebuddy.description.modifier.Visibility.AnonymousClass1.$SwitchMap$net$bytebuddy$description$modifier$Visibility     // Catch: java.lang.NoSuchFieldError -> L1d
                net.bytebuddy.description.modifier.Visibility r1 = net.bytebuddy.description.modifier.Visibility.PROTECTED     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = net.bytebuddy.description.modifier.Visibility.AnonymousClass1.$SwitchMap$net$bytebuddy$description$modifier$Visibility     // Catch: java.lang.NoSuchFieldError -> L28
                net.bytebuddy.description.modifier.Visibility r1 = net.bytebuddy.description.modifier.Visibility.PACKAGE_PRIVATE     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = net.bytebuddy.description.modifier.Visibility.AnonymousClass1.$SwitchMap$net$bytebuddy$description$modifier$Visibility     // Catch: java.lang.NoSuchFieldError -> L33
                net.bytebuddy.description.modifier.Visibility r1 = net.bytebuddy.description.modifier.Visibility.PRIVATE     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }
    }

    static {
            net.bytebuddy.description.modifier.Visibility r0 = new net.bytebuddy.description.modifier.Visibility
            java.lang.String r1 = "PUBLIC"
            r2 = 0
            r3 = 1
            r0.<init>(r1, r2, r3)
            net.bytebuddy.description.modifier.Visibility.PUBLIC = r0
            net.bytebuddy.description.modifier.Visibility r1 = new net.bytebuddy.description.modifier.Visibility
            java.lang.String r4 = "PACKAGE_PRIVATE"
            r1.<init>(r4, r3, r2)
            net.bytebuddy.description.modifier.Visibility.PACKAGE_PRIVATE = r1
            net.bytebuddy.description.modifier.Visibility r2 = new net.bytebuddy.description.modifier.Visibility
            r3 = 4
            java.lang.String r4 = "PROTECTED"
            r5 = 2
            r2.<init>(r4, r5, r3)
            net.bytebuddy.description.modifier.Visibility.PROTECTED = r2
            net.bytebuddy.description.modifier.Visibility r3 = new net.bytebuddy.description.modifier.Visibility
            java.lang.String r4 = "PRIVATE"
            r6 = 3
            r3.<init>(r4, r6, r5)
            net.bytebuddy.description.modifier.Visibility.PRIVATE = r3
            net.bytebuddy.description.modifier.Visibility[] r0 = new net.bytebuddy.description.modifier.Visibility[]{r0, r1, r2, r3}
            net.bytebuddy.description.modifier.Visibility.$VALUES = r0
            return
    }

    Visibility(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.mask = r3
            return
    }

    public static net.bytebuddy.description.modifier.Visibility valueOf(java.lang.String r1) {
            java.lang.Class<net.bytebuddy.description.modifier.Visibility> r0 = net.bytebuddy.description.modifier.Visibility.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            net.bytebuddy.description.modifier.Visibility r1 = (net.bytebuddy.description.modifier.Visibility) r1
            return r1
    }

    public static net.bytebuddy.description.modifier.Visibility[] values() {
            net.bytebuddy.description.modifier.Visibility[] r0 = net.bytebuddy.description.modifier.Visibility.$VALUES
            java.lang.Object r0 = r0.clone()
            net.bytebuddy.description.modifier.Visibility[] r0 = (net.bytebuddy.description.modifier.Visibility[]) r0
            return r0
    }

    public net.bytebuddy.description.modifier.Visibility expandTo(net.bytebuddy.description.modifier.Visibility r4) {
            r3 = this;
            int[] r0 = net.bytebuddy.description.modifier.Visibility.AnonymousClass1.$SwitchMap$net$bytebuddy$description$modifier$Visibility
            int r1 = r4.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L3b
            r1 = 2
            if (r0 == r1) goto L35
            r1 = 3
            if (r0 == r1) goto L2c
            r1 = 4
            if (r0 != r1) goto L15
            return r3
        L15:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected visibility: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L2c:
            net.bytebuddy.description.modifier.Visibility r4 = net.bytebuddy.description.modifier.Visibility.PRIVATE
            if (r3 != r4) goto L33
            net.bytebuddy.description.modifier.Visibility r4 = net.bytebuddy.description.modifier.Visibility.PACKAGE_PRIVATE
            goto L34
        L33:
            r4 = r3
        L34:
            return r4
        L35:
            net.bytebuddy.description.modifier.Visibility r0 = net.bytebuddy.description.modifier.Visibility.PUBLIC
            if (r3 != r0) goto L3a
            r4 = r0
        L3a:
            return r4
        L3b:
            net.bytebuddy.description.modifier.Visibility r4 = net.bytebuddy.description.modifier.Visibility.PUBLIC
            return r4
    }

    @Override // net.bytebuddy.description.modifier.ModifierContributor
    public int getMask() {
            r1 = this;
            int r0 = r1.mask
            return r0
    }

    @Override // net.bytebuddy.description.modifier.ModifierContributor
    public int getRange() {
            r1 = this;
            r0 = 7
            return r0
    }

    @Override // net.bytebuddy.description.modifier.ModifierContributor
    public boolean isDefault() {
            r1 = this;
            net.bytebuddy.description.modifier.Visibility r0 = net.bytebuddy.description.modifier.Visibility.PACKAGE_PRIVATE
            if (r1 != r0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public boolean isPackagePrivate() {
            r1 = this;
            boolean r0 = r1.isPublic()
            if (r0 != 0) goto L14
            boolean r0 = r1.isPrivate()
            if (r0 != 0) goto L14
            boolean r0 = r1.isProtected()
            if (r0 != 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            return r0
    }

    public boolean isPrivate() {
            r1 = this;
            int r0 = r1.mask
            r0 = r0 & 2
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean isProtected() {
            r1 = this;
            int r0 = r1.mask
            r0 = r0 & 4
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean isPublic() {
            r2 = this;
            int r0 = r2.mask
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto L7
            goto L8
        L7:
            r1 = 0
        L8:
            return r1
    }
}
