package p363;

import androidx.activity.AbstractC0053;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import org.luckypray.dexkit.query.enums.AnnotationEncodeValueType;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言苏子兰世楪哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8931 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static AnnotationEncodeValueType m14550(byte b) {
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
        C5925.m11310(AbstractC0053.m157("Unknown AnnotationEncodeValueType: ", String.valueOf(b & DefaultClassResolver.NAME)));
        return null;
    }
}
