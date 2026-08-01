package p279;

import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.PropertyNamingStrategy;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: renamed from: 飘花落叶言楪子世兰苏哲.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface InterfaceC8365 {
    boolean alphabetic() default true;

    String format() default "";

    String[] ignores() default {};

    String[] includes() default {};

    String locale() default "";

    PropertyNamingStrategy naming() default PropertyNamingStrategy.NeverUseThisValueExceptDefaultValue;

    String[] orders() default {};

    String rootName() default "";

    Class[] seeAlso() default {};

    JSONWriter$Feature[] serializeFeatures() default {};

    Class[] serializeFilters() default {};

    Class serializer() default Void.class;

    boolean skipTransient() default true;

    String typeKey() default "";

    String typeName() default "";

    boolean writeEnumAsJavaBean() default false;
}
