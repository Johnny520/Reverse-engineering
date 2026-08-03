package p115hh;

import p281t3.AbstractC4106c;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: hh.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1719d {

    /* JADX INFO: renamed from: a */
    public final Object f5711a;

    /* JADX INFO: renamed from: b */
    public final int f5712b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1719d(Object obj, int i9) {
        this.f5711a = obj;
        this.f5712b = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int iM8279b = AbstractC4106c.m8279b(this.f5712b);
        Object obj = this.f5711a;
        switch (iM8279b) {
            case 7:
                sb2.append("\"");
                sb2.append(obj);
                sb2.append("\"");
                break;
            case 8:
                obj.getClass();
                sb2.append(((C1724i) obj).m4345p().f8327g);
                break;
            case 9:
                obj.getClass();
                C1730o c1730o = (C1730o) obj;
                sb2.append(c1730o.m4348p().f8336j);
                sb2.append(" ");
                sb2.append(c1730o.m4348p().f8333g);
                sb2.append(".");
                sb2.append(c1730o.m4348p().f8334h);
                sb2.append("(");
                sb2.append(AbstractC4166m.m8392A1(c1730o.m4348p().f8335i, ", ", null, null, null, 62));
                sb2.append(")");
                break;
            case 10:
                obj.getClass();
                C1727l c1727l = (C1727l) obj;
                sb2.append(c1727l.m4347p().f8330i);
                sb2.append(".");
                sb2.append(c1727l.m4347p().f8329h);
                break;
            case 11:
                sb2.append("{");
                obj.getClass();
                sb2.append(AbstractC4166m.m8392A1(((C1718c) obj).f5710h, ", ", null, null, null, 62));
                sb2.append("}");
                break;
            case 12:
                obj.getClass();
                sb2.append(((C1716a) obj).toString());
                break;
            case 13:
                sb2.append("null");
                break;
            default:
                sb2.append(obj);
                break;
        }
        return sb2.toString();
    }
}
