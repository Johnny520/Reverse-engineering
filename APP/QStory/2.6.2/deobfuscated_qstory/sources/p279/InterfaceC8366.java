package p279;

import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: renamed from: 飘花落叶言楪子世兰苏哲.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface InterfaceC8366 {
    String[] alternateNames() default {};

    Class arrayToMapDuplicateHandler() default Void.class;

    String arrayToMapKey() default "";

    Class contentAs() default Void.class;

    String defaultValue() default "";

    boolean deserialize() default true;

    JSONReader$Feature[] deserializeFeatures() default {};

    Class deserializeUsing() default Void.class;

    String format() default "";

    boolean jsonDirect() default false;

    String label() default "";

    String locale() default "";

    String name() default "";

    int ordinal() default 0;

    boolean required() default false;

    String schema() default "";

    boolean serialize() default true;

    JSONWriter$Feature[] serializeFeatures() default {};

    Class serializeUsing() default Void.class;

    boolean skipTransient() default true;

    boolean unwrapped() default false;

    boolean value() default false;

    Class writeUsing() default Void.class;
}
