package net.bytebuddy.matcher;

import net.bytebuddy.description.ModifierReviewable;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class ModifierMatcher<T extends net.bytebuddy.description.ModifierReviewable> extends net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues<T> {
    private final net.bytebuddy.matcher.ModifierMatcher.Mode mode;

    public enum Mode extends java.lang.Enum<net.bytebuddy.matcher.ModifierMatcher.Mode> {
        private static final /* synthetic */ net.bytebuddy.matcher.ModifierMatcher.Mode[] $VALUES = null;
        public static final net.bytebuddy.matcher.ModifierMatcher.Mode ABSTRACT = null;
        public static final net.bytebuddy.matcher.ModifierMatcher.Mode ANNOTATION = null;
        public static final net.bytebuddy.matcher.ModifierMatcher.Mode BRIDGE = null;
        public static final net.bytebuddy.matcher.ModifierMatcher.Mode ENUMERATION = null;
        public static final net.bytebuddy.matcher.ModifierMatcher.Mode FINAL = null;
        public static final net.bytebuddy.matcher.ModifierMatcher.Mode INTERFACE = null;
        public static final net.bytebuddy.matcher.ModifierMatcher.Mode MANDATED = null;
        public static final net.bytebuddy.matcher.ModifierMatcher.Mode NATIVE = null;
        public static final net.bytebuddy.matcher.ModifierMatcher.Mode PRIVATE = null;
        public static final net.bytebuddy.matcher.ModifierMatcher.Mode PROTECTED = null;
        public static final net.bytebuddy.matcher.ModifierMatcher.Mode PUBLIC = null;
        public static final net.bytebuddy.matcher.ModifierMatcher.Mode STATIC = null;
        public static final net.bytebuddy.matcher.ModifierMatcher.Mode STRICT = null;
        public static final net.bytebuddy.matcher.ModifierMatcher.Mode SYNCHRONIZED = null;
        public static final net.bytebuddy.matcher.ModifierMatcher.Mode SYNTHETIC = null;
        public static final net.bytebuddy.matcher.ModifierMatcher.Mode TRANSIENT = null;
        public static final net.bytebuddy.matcher.ModifierMatcher.Mode VAR_ARGS = null;
        public static final net.bytebuddy.matcher.ModifierMatcher.Mode VOLATILE = null;
        private final java.lang.String description;
        private final net.bytebuddy.matcher.ModifierMatcher<?> matcher;
        private final int modifiers;

        static {
                net.bytebuddy.matcher.ModifierMatcher$Mode r1 = new net.bytebuddy.matcher.ModifierMatcher$Mode
                r0 = r1
                java.lang.String r2 = "isPublic()"
                java.lang.String r3 = "PUBLIC"
                r4 = 0
                r5 = 1
                r1.<init>(r3, r4, r5, r2)
                net.bytebuddy.matcher.ModifierMatcher.Mode.PUBLIC = r1
                net.bytebuddy.matcher.ModifierMatcher$Mode r2 = new net.bytebuddy.matcher.ModifierMatcher$Mode
                r1 = r2
                java.lang.String r3 = "isProtected()"
                java.lang.String r4 = "PROTECTED"
                r6 = 4
                r2.<init>(r4, r5, r6, r3)
                net.bytebuddy.matcher.ModifierMatcher.Mode.PROTECTED = r2
                net.bytebuddy.matcher.ModifierMatcher$Mode r3 = new net.bytebuddy.matcher.ModifierMatcher$Mode
                r2 = r3
                r4 = 2
                java.lang.String r5 = "isPrivate()"
                java.lang.String r7 = "PRIVATE"
                r3.<init>(r7, r4, r4, r5)
                net.bytebuddy.matcher.ModifierMatcher.Mode.PRIVATE = r3
                net.bytebuddy.matcher.ModifierMatcher$Mode r4 = new net.bytebuddy.matcher.ModifierMatcher$Mode
                r3 = r4
                java.lang.String r5 = "isFinal()"
                java.lang.String r7 = "FINAL"
                r8 = 3
                r15 = 16
                r4.<init>(r7, r8, r15, r5)
                net.bytebuddy.matcher.ModifierMatcher.Mode.FINAL = r4
                net.bytebuddy.matcher.ModifierMatcher$Mode r5 = new net.bytebuddy.matcher.ModifierMatcher$Mode
                r4 = r5
                java.lang.String r7 = "isStatic()"
                java.lang.String r8 = "STATIC"
                r9 = 8
                r5.<init>(r8, r6, r9, r7)
                net.bytebuddy.matcher.ModifierMatcher.Mode.STATIC = r5
                net.bytebuddy.matcher.ModifierMatcher$Mode r6 = new net.bytebuddy.matcher.ModifierMatcher$Mode
                r5 = r6
                r7 = 32
                java.lang.String r8 = "isSynchronized()"
                java.lang.String r10 = "SYNCHRONIZED"
                r11 = 5
                r6.<init>(r10, r11, r7, r8)
                net.bytebuddy.matcher.ModifierMatcher.Mode.SYNCHRONIZED = r6
                net.bytebuddy.matcher.ModifierMatcher$Mode r7 = new net.bytebuddy.matcher.ModifierMatcher$Mode
                r6 = r7
                r8 = 256(0x100, float:3.59E-43)
                java.lang.String r10 = "isNative()"
                java.lang.String r11 = "NATIVE"
                r12 = 6
                r7.<init>(r11, r12, r8, r10)
                net.bytebuddy.matcher.ModifierMatcher.Mode.NATIVE = r7
                net.bytebuddy.matcher.ModifierMatcher$Mode r8 = new net.bytebuddy.matcher.ModifierMatcher$Mode
                r7 = r8
                r10 = 2048(0x800, float:2.87E-42)
                java.lang.String r11 = "isStrict()"
                java.lang.String r12 = "STRICT"
                r13 = 7
                r8.<init>(r12, r13, r10, r11)
                net.bytebuddy.matcher.ModifierMatcher.Mode.STRICT = r8
                net.bytebuddy.matcher.ModifierMatcher$Mode r10 = new net.bytebuddy.matcher.ModifierMatcher$Mode
                r8 = r10
                java.lang.String r11 = "isVarArgs()"
                java.lang.String r12 = "VAR_ARGS"
                r14 = 128(0x80, float:1.8E-43)
                r10.<init>(r12, r9, r14, r11)
                net.bytebuddy.matcher.ModifierMatcher.Mode.VAR_ARGS = r10
                net.bytebuddy.matcher.ModifierMatcher$Mode r10 = new net.bytebuddy.matcher.ModifierMatcher$Mode
                r9 = r10
                r11 = 4096(0x1000, float:5.74E-42)
                java.lang.String r12 = "isSynthetic()"
                java.lang.String r13 = "SYNTHETIC"
                r14 = 9
                r10.<init>(r13, r14, r11, r12)
                net.bytebuddy.matcher.ModifierMatcher.Mode.SYNTHETIC = r10
                net.bytebuddy.matcher.ModifierMatcher$Mode r11 = new net.bytebuddy.matcher.ModifierMatcher$Mode
                r10 = r11
                java.lang.String r12 = "isBridge()"
                java.lang.String r13 = "BRIDGE"
                r14 = 10
                r15 = 64
                r11.<init>(r13, r14, r15, r12)
                net.bytebuddy.matcher.ModifierMatcher.Mode.BRIDGE = r11
                net.bytebuddy.matcher.ModifierMatcher$Mode r12 = new net.bytebuddy.matcher.ModifierMatcher$Mode
                r11 = r12
                r13 = 1024(0x400, float:1.435E-42)
                java.lang.String r14 = "isAbstract()"
                java.lang.String r15 = "ABSTRACT"
                r19 = r0
                r0 = 11
                r12.<init>(r15, r0, r13, r14)
                net.bytebuddy.matcher.ModifierMatcher.Mode.ABSTRACT = r12
                net.bytebuddy.matcher.ModifierMatcher$Mode r0 = new net.bytebuddy.matcher.ModifierMatcher$Mode
                r12 = r0
                r13 = 512(0x200, float:7.17E-43)
                java.lang.String r14 = "isInterface()"
                java.lang.String r15 = "INTERFACE"
                r20 = r1
                r1 = 12
                r0.<init>(r15, r1, r13, r14)
                net.bytebuddy.matcher.ModifierMatcher.Mode.INTERFACE = r0
                net.bytebuddy.matcher.ModifierMatcher$Mode r0 = new net.bytebuddy.matcher.ModifierMatcher$Mode
                r13 = r0
                r1 = 8192(0x2000, float:1.148E-41)
                java.lang.String r14 = "isAnnotation()"
                java.lang.String r15 = "ANNOTATION"
                r21 = r2
                r2 = 13
                r0.<init>(r15, r2, r1, r14)
                net.bytebuddy.matcher.ModifierMatcher.Mode.ANNOTATION = r0
                net.bytebuddy.matcher.ModifierMatcher$Mode r0 = new net.bytebuddy.matcher.ModifierMatcher$Mode
                r1 = 128(0x80, float:1.8E-43)
                r14 = r0
                r2 = 14
                java.lang.String r15 = "isVolatile()"
                java.lang.String r1 = "VOLATILE"
                r22 = r3
                r3 = 64
                r0.<init>(r1, r2, r3, r15)
                net.bytebuddy.matcher.ModifierMatcher.Mode.VOLATILE = r0
                net.bytebuddy.matcher.ModifierMatcher$Mode r0 = new net.bytebuddy.matcher.ModifierMatcher$Mode
                r1 = 16
                r15 = r0
                r2 = 15
                java.lang.String r3 = "isTransient()"
                java.lang.String r1 = "TRANSIENT"
                r18 = r4
                r4 = 128(0x80, float:1.8E-43)
                r0.<init>(r1, r2, r4, r3)
                net.bytebuddy.matcher.ModifierMatcher.Mode.TRANSIENT = r0
                net.bytebuddy.matcher.ModifierMatcher$Mode r0 = new net.bytebuddy.matcher.ModifierMatcher$Mode
                r16 = r0
                r1 = 32768(0x8000, float:4.5918E-41)
                java.lang.String r2 = "isMandated()"
                java.lang.String r3 = "MANDATED"
                r4 = 16
                r0.<init>(r3, r4, r1, r2)
                net.bytebuddy.matcher.ModifierMatcher.Mode.MANDATED = r0
                net.bytebuddy.matcher.ModifierMatcher$Mode r0 = new net.bytebuddy.matcher.ModifierMatcher$Mode
                r17 = r0
                r1 = 16384(0x4000, float:2.2959E-41)
                java.lang.String r2 = "isEnum()"
                java.lang.String r3 = "ENUMERATION"
                r4 = 17
                r0.<init>(r3, r4, r1, r2)
                net.bytebuddy.matcher.ModifierMatcher.Mode.ENUMERATION = r0
                r4 = r18
                r0 = r19
                r1 = r20
                r2 = r21
                r3 = r22
                net.bytebuddy.matcher.ModifierMatcher$Mode[] r0 = new net.bytebuddy.matcher.ModifierMatcher.Mode[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17}
                net.bytebuddy.matcher.ModifierMatcher.Mode.$VALUES = r0
                return
        }

        Mode(java.lang.String r1, int r2, int r3, java.lang.String r4) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.modifiers = r3
                r0.description = r4
                net.bytebuddy.matcher.ModifierMatcher r1 = new net.bytebuddy.matcher.ModifierMatcher
                r1.<init>(r0)
                r0.matcher = r1
                return
        }

        public static net.bytebuddy.matcher.ModifierMatcher.Mode valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.matcher.ModifierMatcher$Mode> r0 = net.bytebuddy.matcher.ModifierMatcher.Mode.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.matcher.ModifierMatcher$Mode r1 = (net.bytebuddy.matcher.ModifierMatcher.Mode) r1
                return r1
        }

        public static net.bytebuddy.matcher.ModifierMatcher.Mode[] values() {
                net.bytebuddy.matcher.ModifierMatcher$Mode[] r0 = net.bytebuddy.matcher.ModifierMatcher.Mode.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.matcher.ModifierMatcher$Mode[] r0 = (net.bytebuddy.matcher.ModifierMatcher.Mode[]) r0
                return r0
        }

        public java.lang.String getDescription() {
                r1 = this;
                java.lang.String r0 = r1.description
                return r0
        }

        public net.bytebuddy.matcher.ModifierMatcher<?> getMatcher() {
                r1 = this;
                net.bytebuddy.matcher.ModifierMatcher<?> r0 = r1.matcher
                return r0
        }

        public int getModifiers() {
                r1 = this;
                int r0 = r1.modifiers
                return r0
        }
    }

    public ModifierMatcher(net.bytebuddy.matcher.ModifierMatcher.Mode r1) {
            r0 = this;
            r0.<init>()
            r0.mode = r1
            return
    }

    public static <T extends net.bytebuddy.description.ModifierReviewable> net.bytebuddy.matcher.ElementMatcher.Junction<T> of(net.bytebuddy.matcher.ModifierMatcher.Mode r0) {
            net.bytebuddy.matcher.ModifierMatcher r0 = r0.getMatcher()
            return r0
    }

    @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
    public /* bridge */ /* synthetic */ boolean doMatch(java.lang.Object r1) {
            r0 = this;
            net.bytebuddy.description.ModifierReviewable r1 = (net.bytebuddy.description.ModifierReviewable) r1
            boolean r1 = r0.doMatch(r1)
            return r1
    }

    public boolean doMatch(T r2) {
            r1 = this;
            net.bytebuddy.matcher.ModifierMatcher$Mode r0 = r1.mode
            int r0 = r0.getModifiers()
            int r2 = r2.getModifiers()
            r2 = r2 & r0
            if (r2 == 0) goto Lf
            r2 = 1
            goto L10
        Lf:
            r2 = 0
        L10:
            return r2
    }

    @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
    public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
            r4 = this;
            boolean r0 = super.equals(r5)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r0 = 1
            if (r4 != r5) goto Lc
            return r0
        Lc:
            if (r5 != 0) goto Lf
            return r1
        Lf:
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L1a
            return r1
        L1a:
            net.bytebuddy.matcher.ModifierMatcher$Mode r2 = r4.mode
            net.bytebuddy.matcher.ModifierMatcher r5 = (net.bytebuddy.matcher.ModifierMatcher) r5
            net.bytebuddy.matcher.ModifierMatcher$Mode r5 = r5.mode
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L27
            return r1
        L27:
            return r0
    }

    @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
    public int hashCode() {
            r2 = this;
            int r0 = super.hashCode()
            int r0 = r0 * 31
            net.bytebuddy.matcher.ModifierMatcher$Mode r1 = r2.mode
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            net.bytebuddy.matcher.ModifierMatcher$Mode r0 = r1.mode
            java.lang.String r0 = r0.getDescription()
            return r0
    }
}
