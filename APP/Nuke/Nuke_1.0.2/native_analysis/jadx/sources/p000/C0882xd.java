package p000;

/* JADX INFO: renamed from: xd */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0882xd {

    /* JADX INFO: renamed from: a */
    public final Object f12968a;

    /* JADX INFO: renamed from: b */
    public final int f12969b;

    public C0882xd(int i, Object obj) {
        this.f12968a = obj;
        this.f12969b = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int iM5702u = vi0.m5702u(this.f12969b);
        Object obj = this.f12968a;
        switch (iM5702u) {
            case 7:
                sb.append("\"");
                sb.append(obj);
                sb.append("\"");
                break;
            case 8:
                obj.getClass();
                sb.append(((C0784us) obj).m5573k().f11124a);
                break;
            case 9:
                obj.getClass();
                ug1 ug1Var = (ug1) obj;
                sb.append(ug1Var.m5492k().f3349d);
                sb.append(" ");
                sb.append(ug1Var.m5492k().f3346a);
                sb.append(".");
                sb.append(ug1Var.m5492k().f3347b);
                sb.append("(");
                sb.append(AbstractC0142du.m1165u0(ug1Var.m5492k().f3348c, ", ", null, null, null, 62));
                sb.append(")");
                break;
            case 10:
                obj.getClass();
                ji0 ji0Var = (ji0) obj;
                sb.append(ji0Var.m2501k().f13329c);
                sb.append(".");
                sb.append(ji0Var.m2501k().f13328b);
                break;
            case 11:
                sb.append("{");
                obj.getClass();
                sb.append(AbstractC0142du.m1165u0(((C0843wd) obj).f12464i, ", ", null, null, null, 62));
                sb.append("}");
                break;
            case 12:
                obj.getClass();
                sb.append(((C0769ud) obj).toString());
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
