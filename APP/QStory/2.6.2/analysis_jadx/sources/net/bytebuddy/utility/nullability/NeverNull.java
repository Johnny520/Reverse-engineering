package net.bytebuddy.utility.nullability;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.annotation.Nonnull;
import javax.annotation.meta.TypeQualifierDefault;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Nonnull
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface NeverNull {

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Target({ElementType.PACKAGE})
    @TypeQualifierDefault({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
    @Nonnull
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface ByDefault {
    }
}
