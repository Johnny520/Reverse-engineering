package org.luckypray.dexkit.result;

import kotlin.collections.AbstractC4343;
import org.luckypray.dexkit.query.enums.AnnotationEncodeValueType;

/* JADX INFO: renamed from: org.luckypray.dexkit.result.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5724 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AnnotationEncodeValueType f15697;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f15698;

    public C5724(Object obj, AnnotationEncodeValueType annotationEncodeValueType) {
        this.f15698 = obj;
        this.f15697 = annotationEncodeValueType;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = AbstractC5717.f15680[this.f15697.ordinal()];
        Object obj = this.f15698;
        switch (i) {
            case 7:
                obj.getClass();
                sb.append(((C5723) obj).m11067().f15727);
                break;
            case 8:
                obj.getClass();
                C5727 c5727 = (C5727) obj;
                sb.append(c5727.m11070().f15719);
                sb.append(" ");
                sb.append(c5727.m11070().f15722);
                sb.append(".");
                sb.append(c5727.m11070().f15721);
                sb.append("(");
                sb.append(AbstractC4343.m8813(c5727.m11070().f15720, ", ", null, null, null, 62));
                sb.append(")");
                break;
            case 9:
                obj.getClass();
                C5726 c5726 = (C5726) obj;
                sb.append(c5726.m11068().f15724);
                sb.append(".");
                sb.append(c5726.m11068().f15725);
                break;
            case 10:
                sb.append("{");
                obj.getClass();
                sb.append(AbstractC4343.m8813(((C5719) obj).f15682, ", ", null, null, null, 62));
                sb.append("}");
                break;
            case 11:
                obj.getClass();
                sb.append(((C5722) obj).toString());
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
