package defpackage;

import com.dokar.quickjs.binding.JsObject;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import kotlin.UByteArray;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gw0 extends tw2 implements nn0 {
    public /* synthetic */ r92 l;
    public /* synthetic */ boolean m;
    public final /* synthetic */ jw0 n;
    public final /* synthetic */ tw0 o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gw0(jw0 jw0Var, tw0 tw0Var, t00 t00Var) {
        super(3, t00Var);
        this.n = jw0Var;
        this.o = tw0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nn0
    public final Object e(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        gw0 gw0Var = new gw0(this.n, this.o, (t00) obj3);
        gw0Var.l = (r92) obj;
        gw0Var.m = zBooleanValue;
        return gw0Var.r(a83.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @Override // defpackage.rj
    public final Object r(Object obj) throws IOException {
        r92 r92Var = this.l;
        boolean z = this.m;
        fg1.T(obj);
        long j = this.o.f;
        jw0 jw0Var = this.n;
        jw0Var.getClass();
        if (r92Var.n.c() > j) {
            c80.p("QUOTA_EXCEEDED", "HTTP response exceeds the size limit.", 0, null, null, 28);
            return null;
        }
        InputStream inputStreamB = r92Var.n.b();
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((int) Math.min(j, 8192L));
            byte[] bArr = new byte[8192];
            long jAddExact = 0;
            while (true) {
                int i = inputStreamB.read(bArr);
                boolean z2 = false;
                if (i < 0) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArray.getClass();
                    inputStreamB.close();
                    int i2 = r92Var.k;
                    String str = r92Var.j;
                    yw0 yw0Var = r92Var.h.a;
                    Set set = mw0.a;
                    xw0 xw0VarF = yw0Var.f();
                    xw0VarF.h = null;
                    String str2 = xw0VarF.b().i;
                    ArrayList arrayListB = jw0.b(jw0Var, r92Var.m);
                    str.getClass();
                    ow1 ow1Var = new ow1("status", Integer.valueOf(i2));
                    ow1 ow1Var2 = new ow1("statusText", str);
                    if (200 <= i2 && i2 < 300) {
                        z2 = true;
                    }
                    return new JsObject(we1.q0(ow1Var, ow1Var2, new ow1("ok", Boolean.valueOf(z2)), new ow1("url", str2), new ow1("redirected", Boolean.valueOf(z)), new ow1("headers", mw0.b(arrayListB)), new ow1("body", new UByteArray(Arrays.copyOf(byteArray, byteArray.length)))));
                }
                if (i != 0) {
                    jAddExact = Math.addExact(jAddExact, i);
                    if (jAddExact > j) {
                        throw new sd2("QUOTA_EXCEEDED", "HTTP response exceeds the size limit.", false, null, null, 28);
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                }
            }
        } finally {
        }
    }
}
