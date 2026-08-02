package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xd {
    public final Object a;
    public final int b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public xd(int i, Object obj) {
        this.a = obj;
        this.b = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int iU = vi0.u(this.b);
        Object obj = this.a;
        switch (iU) {
            case 7:
                sb.append("\"");
                sb.append(obj);
                sb.append("\"");
                break;
            case 8:
                obj.getClass();
                sb.append(((us) obj).k().a);
                break;
            case 9:
                obj.getClass();
                ug1 ug1Var = (ug1) obj;
                sb.append(ug1Var.k().d);
                sb.append(" ");
                sb.append(ug1Var.k().a);
                sb.append(".");
                sb.append(ug1Var.k().b);
                sb.append("(");
                sb.append(du.u0(ug1Var.k().c, ", ", null, null, null, 62));
                sb.append(")");
                break;
            case 10:
                obj.getClass();
                ji0 ji0Var = (ji0) obj;
                sb.append(ji0Var.k().c);
                sb.append(".");
                sb.append(ji0Var.k().b);
                break;
            case 11:
                sb.append("{");
                obj.getClass();
                sb.append(du.u0(((wd) obj).i, ", ", null, null, null, 62));
                sb.append("}");
                break;
            case 12:
                obj.getClass();
                sb.append(((ud) obj).toString());
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
