package bsh;

import java.lang.reflect.Array;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: renamed from: bsh.q */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C1238q extends AbstractC1195i4 {

    /* JADX INFO: renamed from: D */
    public static final Class f3766D = null;

    /* JADX INFO: renamed from: A */
    public boolean f3767A;

    /* JADX INFO: renamed from: B */
    public boolean f3768B;

    /* JADX INFO: renamed from: C */
    public int f3769C;

    /* JADX INFO: renamed from: y */
    public String f3770y;

    /* JADX INFO: renamed from: z */
    public Class f3771z;

    public C1238q(int i10) {
        super(i10);
        this.f3767A = false;
        this.f3768B = false;
        this.f3769C = 0;
    }

    /* JADX INFO: renamed from: k */
    public String m5046k(C1174f1 c1174f1, RunnableC1205k2 runnableC1205k2, String str) {
        int iMo4050r = mo4050r();
        boolean z10 = this.f3768B;
        String str2 = _UrlKt.FRAGMENT_ENCODE_SET;
        if (iMo4050r <= 0) {
            if (z10) {
                str2 = "[";
            }
            return str2.concat("Ljava/lang/Object;");
        }
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            str2 = "[";
        }
        sb2.append(str2);
        sb2.append(((C1221n0) mo4051s(0)).m4928x(c1174f1, runnableC1205k2, str));
        return sb2.toString();
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: p */
    public Object mo4048p(C1174f1 c1174f1, RunnableC1205k2 runnableC1205k2) throws C1163d2 {
        if (mo4050r() > 0) {
            Class clsM4927v = ((C1221n0) mo4051s(0)).m4927v(c1174f1, runnableC1205k2);
            this.f3771z = clsM4927v;
            if (this.f3769C > 0) {
                if (clsM4927v.isArray()) {
                    throw new C1163d2("Array dimensions not allowed on both type and name: " + this.f3770y, this, null);
                }
                this.f3771z = Array.newInstance((Class<?>) this.f3771z, new int[this.f3769C]).getClass();
            }
        } else {
            this.f3771z = f3766D;
        }
        if (this.f3768B) {
            this.f3771z = Array.newInstance((Class<?>) this.f3771z, 0).getClass();
        }
        return this.f3771z;
    }

    @Override // bsh.AbstractC1195i4
    public String toString() {
        return super.toString() + ": " + this.f3770y + ", final=" + this.f3767A + ", varargs=" + this.f3768B;
    }
}
