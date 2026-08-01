package org.luckypray.dexkit.result;

import kotlin.collections.AbstractC5176;
import org.luckypray.dexkit.query.enums.AnnotationEncodeValueType;

/* JADX INFO: renamed from: org.luckypray.dexkit.result.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6555 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AnnotationEncodeValueType f16042;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f16043;

    public C6555(Object obj, AnnotationEncodeValueType annotationEncodeValueType) {
        this.f16043 = obj;
        this.f16042 = annotationEncodeValueType;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = AbstractC6548.f16025[this.f16042.ordinal()];
        Object obj = this.f16043;
        switch (i) {
            case 7:
                obj.getClass();
                sb.append(((C6554) obj).m11683().f16072);
                break;
            case 8:
                obj.getClass();
                C6558 c6558 = (C6558) obj;
                sb.append(c6558.m11686().f16064);
                sb.append(" ");
                sb.append(c6558.m11686().f16067);
                sb.append(".");
                sb.append(c6558.m11686().f16066);
                sb.append("(");
                sb.append(AbstractC5176.m9369(c6558.m11686().f16065, ", ", null, null, null, 62));
                sb.append(")");
                break;
            case 9:
                obj.getClass();
                C6557 c6557 = (C6557) obj;
                sb.append(c6557.m11684().f16069);
                sb.append(".");
                sb.append(c6557.m11684().f16070);
                break;
            case 10:
                sb.append("{");
                obj.getClass();
                sb.append(AbstractC5176.m9369(((C6550) obj).f16027, ", ", null, null, null, 62));
                sb.append("}");
                break;
            case 11:
                obj.getClass();
                sb.append(((C6553) obj).toString());
                break;
            case 12:
                sb.append("\"");
                sb.append(obj);
                sb.append("\"");
                break;
            case 13:
                sb.append("null");
                break;
            default:
                sb.append(obj);
                break;
        }
        return sb.toString();
    }
}
