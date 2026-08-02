package p000;

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

    /* JADX INFO: renamed from: l */
    public /* synthetic */ r92 f3716l;

    /* JADX INFO: renamed from: m */
    public /* synthetic */ boolean f3717m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ jw0 f3718n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ tw0 f3719o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gw0(jw0 jw0Var, tw0 tw0Var, t00 t00Var) {
        super(3, t00Var);
        this.f3718n = jw0Var;
        this.f3719o = tw0Var;
    }

    @Override // p000.nn0
    /* JADX INFO: renamed from: e */
    public final Object mo489e(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        gw0 gw0Var = new gw0(this.f3718n, this.f3719o, (t00) obj3);
        gw0Var.f3716l = (r92) obj;
        gw0Var.f3717m = zBooleanValue;
        return gw0Var.mo7r(a83.f116a);
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) throws IOException {
        r92 r92Var = this.f3716l;
        boolean z = this.f3717m;
        fg1.m1627T(obj);
        long j = this.f3719o.f10981f;
        jw0 jw0Var = this.f3718n;
        jw0Var.getClass();
        if (r92Var.f9462n.mo273c() > j) {
            c80.m672p("QUOTA_EXCEEDED", "HTTP response exceeds the size limit.", 0, null, null, 28);
            return null;
        }
        InputStream inputStreamM5476b = r92Var.f9462n.m5476b();
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((int) Math.min(j, 8192L));
            byte[] bArr = new byte[8192];
            long jAddExact = 0;
            while (true) {
                int i = inputStreamM5476b.read(bArr);
                boolean z2 = false;
                if (i < 0) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArray.getClass();
                    inputStreamM5476b.close();
                    int i2 = r92Var.f9459k;
                    String str = r92Var.f9458j;
                    yw0 yw0Var = r92Var.f9456h.f5390a;
                    Set set = mw0.f6903a;
                    xw0 xw0VarM6360f = yw0Var.m6360f();
                    xw0VarM6360f.f13207h = null;
                    String str2 = xw0VarM6360f.m6193b().f13649i;
                    ArrayList arrayListM2583b = jw0.m2583b(jw0Var, r92Var.f9461m);
                    str.getClass();
                    ow1 ow1Var = new ow1("status", Integer.valueOf(i2));
                    ow1 ow1Var2 = new ow1("statusText", str);
                    if (200 <= i2 && i2 < 300) {
                        z2 = true;
                    }
                    return new JsObject(we1.m5876q0(ow1Var, ow1Var2, new ow1("ok", Boolean.valueOf(z2)), new ow1("url", str2), new ow1("redirected", Boolean.valueOf(z)), new ow1("headers", mw0.m3215b(arrayListM2583b)), new ow1("body", new UByteArray(Arrays.copyOf(byteArray, byteArray.length)))));
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
