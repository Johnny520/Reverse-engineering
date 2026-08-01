package p281t6;

import java.util.List;
import p024b9.AbstractC1043k;
import p185m8.AbstractC5114x;
import p299ub.AbstractC8611a0;

/* JADX INFO: renamed from: t6.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8160n {

    /* JADX INFO: renamed from: c */
    public static final a f27291c = new a(null);

    /* JADX INFO: renamed from: a */
    public final String f27292a;

    /* JADX INFO: renamed from: b */
    public final List f27293b;

    public AbstractC8160n(String str, List list) {
        str.getClass();
        list.getClass();
        this.f27292a = str;
        this.f27293b = list;
    }

    /* JADX INFO: renamed from: a */
    public final String m31645a() {
        return this.f27292a;
    }

    /* JADX INFO: renamed from: b */
    public final List m31646b() {
        return this.f27293b;
    }

    /* JADX INFO: renamed from: c */
    public final String m31647c(String str) {
        str.getClass();
        int iM20802q = AbstractC5114x.m20802q(this.f27293b);
        if (iM20802q < 0) {
            return null;
        }
        int i10 = 0;
        while (true) {
            C8158m c8158m = (C8158m) this.f27293b.get(i10);
            if (AbstractC8611a0.m33061F(c8158m.m31639c(), str, true)) {
                return c8158m.m31640d();
            }
            if (i10 == iM20802q) {
                return null;
            }
            i10++;
        }
    }

    public String toString() {
        boolean zIsEmpty = this.f27293b.isEmpty();
        String str = this.f27292a;
        if (zIsEmpty) {
            return str;
        }
        int length = str.length();
        int i10 = 0;
        int length2 = 0;
        for (C8158m c8158m : this.f27293b) {
            length2 += c8158m.m31639c().length() + c8158m.m31640d().length() + 3;
        }
        StringBuilder sb2 = new StringBuilder(length + length2);
        sb2.append(this.f27292a);
        int iM20802q = AbstractC5114x.m20802q(this.f27293b);
        if (iM20802q >= 0) {
            while (true) {
                C8158m c8158m2 = (C8158m) this.f27293b.get(i10);
                sb2.append("; ");
                sb2.append(c8158m2.m31639c());
                sb2.append("=");
                String strM31640d = c8158m2.m31640d();
                if (AbstractC8162o.m31650c(strM31640d)) {
                    sb2.append(AbstractC8162o.m31651d(strM31640d));
                } else {
                    sb2.append(strM31640d);
                }
                if (i10 == iM20802q) {
                    break;
                }
                i10++;
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: t6.n$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }
}
