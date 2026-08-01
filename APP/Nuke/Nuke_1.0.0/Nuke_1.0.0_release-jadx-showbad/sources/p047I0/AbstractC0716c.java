package p047I0;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.Serializable;
import p107V1.C1524w;
import p107V1.InterfaceC1518q;
import p107V1.InterfaceC1519r;
import p111W1.C1598d;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: I0.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0716c implements InterfaceC1519r {

    /* JADX INFO: renamed from: d */
    public Object f2265d;

    /* JADX INFO: renamed from: e */
    public final Serializable f2266e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v1, types: [int[], java.io.Serializable] */
    public AbstractC0716c() {
        this.f2266e = new int[2];
    }

    /* JADX INFO: renamed from: a */
    public abstract int[] mo1217a(int i5);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public int[] m1218b(int i5, int i6) {
        if (i5 < 0 || i6 < 0 || i5 == i6) {
            return null;
        }
        int[] iArr = (int[]) this.f2266e;
        iArr[0] = i5;
        iArr[1] = i6;
        return iArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public String m1219c() {
        String str = (String) this.f2265d;
        if (str != null) {
            return str;
        }
        AbstractC1665j.m2991k("text");
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public abstract int[] mo1220d(int i5);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p107V1.InterfaceC1519r
    /* JADX INFO: renamed from: g */
    public InterfaceC1518q mo68g(C1524w c1524w) {
        Context context = (Context) this.f2265d;
        Class cls = (Class) this.f2266e;
        return new C1598d(context, c1524w.m2789a(File.class, cls), c1524w.m2789a(Uri.class, cls), cls);
    }

    public AbstractC0716c(Context context, Class cls) {
        this.f2265d = context;
        this.f2266e = cls;
    }
}
