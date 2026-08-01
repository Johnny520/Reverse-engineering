package net.bytebuddy.matcher;

import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.ModifierReviewable;
import net.bytebuddy.matcher.ElementMatcher;
import net.bytebuddy.utility.nullability.MaybeNull;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@HashCodeAndEqualsPlugin.Enhance
public class ModifierMatcher<T extends ModifierReviewable> extends ElementMatcher.Junction.ForNonNullValues<T> {
    private final Mode mode;

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public enum Mode {
        PUBLIC(1, "isPublic()"),
        PROTECTED(4, "isProtected()"),
        PRIVATE(2, "isPrivate()"),
        FINAL(16, "isFinal()"),
        STATIC(8, "isStatic()"),
        SYNCHRONIZED(32, "isSynchronized()"),
        NATIVE(256, "isNative()"),
        STRICT(2048, "isStrict()"),
        VAR_ARGS(128, "isVarArgs()"),
        SYNTHETIC(4096, "isSynthetic()"),
        BRIDGE(64, "isBridge()"),
        ABSTRACT(1024, "isAbstract()"),
        INTERFACE(512, "isInterface()"),
        ANNOTATION(8192, "isAnnotation()"),
        VOLATILE(64, "isVolatile()"),
        TRANSIENT(128, "isTransient()"),
        MANDATED(32768, "isMandated()"),
        ENUMERATION(16384, "isEnum()");

        private final String description;
        private final ModifierMatcher<?> matcher = new ModifierMatcher<>(this);
        private final int modifiers;

        Mode(int i, String str) {
            this.modifiers = i;
            this.description = str;
        }

        public String getDescription() {
            return this.description;
        }

        public ModifierMatcher<?> getMatcher() {
            return this.matcher;
        }

        public int getModifiers() {
            return this.modifiers;
        }
    }

    public ModifierMatcher(Mode mode) {
        this.mode = mode;
    }

    public static <T extends ModifierReviewable> ElementMatcher.Junction<T> of(Mode mode) {
        return mode.getMatcher();
    }

    @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
    public boolean doMatch(T t) {
        return (this.mode.getModifiers() & t.getModifiers()) != 0;
    }

    @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
    public boolean equals(@MaybeNull Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.mode.equals(((ModifierMatcher) obj).mode);
    }

    @Override // net.bytebuddy.matcher.ElementMatcher.Junction.ForNonNullValues
    public int hashCode() {
        return this.mode.hashCode() + (super.hashCode() * 31);
    }

    public String toString() {
        return this.mode.getDescription();
    }
}
