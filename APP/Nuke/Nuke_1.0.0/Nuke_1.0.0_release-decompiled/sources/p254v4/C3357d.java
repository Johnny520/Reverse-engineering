package p254v4;

import p042H1.AbstractC0636d;
import p061L2.AbstractC0973m;
import p117X2.AbstractC1665j;
import p277z4.C3523a;

/* JADX INFO: renamed from: v4.d */
/* JADX INFO: loaded from: classes.dex */
public final class C3357d {

    /* JADX INFO: renamed from: a */
    public final Object f10426a;

    /* JADX INFO: renamed from: b */
    public final int f10427b;

    public C3357d(int i5, Object obj) {
        this.f10426a = obj;
        this.f10427b = i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int iM1088a = AbstractC0636d.m1088a(this.f10427b);
        Object obj = this.f10426a;
        switch (iM1088a) {
            case 7:
                sb.append("\"");
                sb.append(obj);
                sb.append("\"");
                break;
            case 8:
                AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type org.luckypray.dexkit.result.ClassData");
                sb.append(((C3523a) ((C3362i) obj).f10443k.getValue()).f10980a);
                break;
            case 9:
                AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type org.luckypray.dexkit.result.MethodData");
                C3368o c3368o = (C3368o) obj;
                sb.append(c3368o.m5606f().f10989d);
                sb.append(" ");
                sb.append(c3368o.m5606f().f10986a);
                sb.append(".");
                sb.append(c3368o.m5606f().f10987b);
                sb.append("(");
                sb.append(AbstractC0973m.m2016W(c3368o.m5606f().f10988c, ", ", null, null, null, 62));
                sb.append(")");
                break;
            case 10:
                AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type org.luckypray.dexkit.result.FieldData");
                C3365l c3365l = (C3365l) obj;
                sb.append(c3365l.m5605f().f10983c);
                sb.append(".");
                sb.append(c3365l.m5605f().f10982b);
                break;
            case 11:
                sb.append("{");
                AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type org.luckypray.dexkit.result.AnnotationEncodeArrayData");
                sb.append(AbstractC0973m.m2016W(((C3356c) obj).f10425e, ", ", null, null, null, 62));
                sb.append("}");
                break;
            case 12:
                AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type org.luckypray.dexkit.result.AnnotationData");
                sb.append(((C3354a) obj).toString());
                break;
            case 13:
                sb.append("null");
                break;
            default:
                sb.append(obj);
                break;
        }
        String string = sb.toString();
        AbstractC1665j.m2984d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
