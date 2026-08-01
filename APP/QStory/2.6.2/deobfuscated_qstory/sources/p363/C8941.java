package p363;

import androidx.activity.AbstractC0053;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import org.luckypray.dexkit.query.enums.AnnotationEncodeValueType;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言苏子兰世哲楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8941 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static AnnotationEncodeValueType m14536(byte b) {
        if (b == 1) {
            return AnnotationEncodeValueType.ByteValue;
        }
        if (b == 2) {
            return AnnotationEncodeValueType.ShortValue;
        }
        if (b == 3) {
            return AnnotationEncodeValueType.CharValue;
        }
        if (b == 4) {
            return AnnotationEncodeValueType.IntValue;
        }
        if (b == 5) {
            return AnnotationEncodeValueType.LongValue;
        }
        if (b == 6) {
            return AnnotationEncodeValueType.FloatValue;
        }
        if (b == 7) {
            return AnnotationEncodeValueType.DoubleValue;
        }
        if (b == 8) {
            return AnnotationEncodeValueType.StringValue;
        }
        if (b == 9) {
            return AnnotationEncodeValueType.TypeValue;
        }
        if (b == 10) {
            return AnnotationEncodeValueType.MethodValue;
        }
        if (b == 11) {
            return AnnotationEncodeValueType.EnumValue;
        }
        if (b == 12) {
            return AnnotationEncodeValueType.ArrayValue;
        }
        if (b == 13) {
            return AnnotationEncodeValueType.AnnotationValue;
        }
        if (b == 14) {
            return AnnotationEncodeValueType.NullValue;
        }
        if (b == 15) {
            return AnnotationEncodeValueType.BoolValue;
        }
        C5919.m11249(AbstractC0053.m152("Unknown AnnotationEncodeValueType: ", String.valueOf(b & DefaultClassResolver.NAME)));
        return null;
    }
}
