package org.luckypray.dexkit.result;

import kotlin.collections.AbstractC4344;
import org.luckypray.dexkit.query.enums.AnnotationEncodeValueType;

/* JADX INFO: renamed from: org.luckypray.dexkit.result.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5725 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AnnotationEncodeValueType f15697;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f15698;

    public C5725(Object obj, AnnotationEncodeValueType annotationEncodeValueType) {
        this.f15698 = obj;
        this.f15697 = annotationEncodeValueType;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = AbstractC5718.f15680[this.f15697.ordinal()];
        Object obj = this.f15698;
        switch (i) {
            case 7:
                obj.getClass();
                sb.append(((C5724) obj).m11124().f15727);
                break;
            case 8:
                obj.getClass();
                C5728 c5728 = (C5728) obj;
                sb.append(c5728.m11127().f15719);
                sb.append(" ");
                sb.append(c5728.m11127().f15722);
                sb.append(".");
                sb.append(c5728.m11127().f15721);
                sb.append("(");
                sb.append(AbstractC4344.m8810(c5728.m11127().f15720, ", ", null, null, null, 62));
                sb.append(")");
                break;
            case 9:
                obj.getClass();
                C5727 c5727 = (C5727) obj;
                sb.append(c5727.m11125().f15724);
                sb.append(".");
                sb.append(c5727.m11125().f15725);
                break;
            case 10:
                sb.append("{");
                obj.getClass();
                sb.append(AbstractC4344.m8810(((C5720) obj).f15682, ", ", null, null, null, 62));
                sb.append("}");
                break;
            case 11:
                obj.getClass();
                sb.append(((C5723) obj).toString());
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
