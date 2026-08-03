package net.bytebuddy.utility.nullability;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.annotation.Nonnull;
import javax.annotation.meta.TypeQualifierNickname;
import javax.annotation.meta.When;

/* JADX INFO: loaded from: classes2.dex */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Nonnull(when = When.MAYBE)
@TypeQualifierNickname
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface MaybeNull {
}
