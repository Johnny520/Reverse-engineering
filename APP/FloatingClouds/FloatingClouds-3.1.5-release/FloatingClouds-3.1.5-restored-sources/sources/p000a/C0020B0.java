package p000a;

/* JADX INFO: renamed from: a.B0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0020B0 {

    /* JADX INFO: renamed from: a */
    public final Object f62a;

    /* JADX INFO: renamed from: b */
    public final EnumC0039C0 f63b;

    public C0020B0(Object obj, EnumC0039C0 enumC0039C0) {
        this.f62a = obj;
        this.f63b = enumC0039C0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int iOrdinal = this.f63b.ordinal();
        Object obj = this.f62a;
        switch (iOrdinal) {
            case 7:
                sb.append("\"");
                sb.append(obj);
                sb.append("\"");
                break;
            case 8:
                C0631i9.m1480c(obj, "null cannot be cast to non-null type org.luckypray.dexkit.result.ClassData");
                sb.append(((C0492b3) obj).m1195b());
                break;
            case 9:
                C0631i9.m1480c(obj, "null cannot be cast to non-null type org.luckypray.dexkit.result.MethodData");
                C0690lb c0690lb = (C0690lb) obj;
                sb.append(c0690lb.m1551b().f2129d);
                sb.append(" ");
                sb.append(c0690lb.m1551b().f2126a);
                sb.append(".");
                sb.append(c0690lb.m1551b().f2127b);
                sb.append("(");
                sb.append(C0834t3.m1952p0(c0690lb.m1551b().f2128c, ", ", null, 62));
                sb.append(")");
                break;
            case 10:
                C0631i9.m1480c(obj, "null cannot be cast to non-null type org.luckypray.dexkit.result.FieldData");
                C0799r6 c0799r6 = (C0799r6) obj;
                sb.append(c0799r6.m1856b().f1642c);
                sb.append(".");
                sb.append(c0799r6.m1856b().f1641b);
                break;
            case 11:
                sb.append("{");
                C0631i9.m1480c(obj, "null cannot be cast to non-null type org.luckypray.dexkit.result.AnnotationEncodeArrayData");
                sb.append(C0834t3.m1952p0(((C0001A0) obj).f21b, ", ", null, 62));
                sb.append("}");
                break;
            case 12:
                C0631i9.m1480c(obj, "null cannot be cast to non-null type org.luckypray.dexkit.result.AnnotationData");
                sb.append(((C0907x0) obj).toString());
                break;
            case 13:
                sb.append("null");
                break;
            default:
                sb.append(obj);
                break;
        }
        String string = sb.toString();
        C0631i9.m1481d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
