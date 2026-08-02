package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: tk */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0737tk implements g92 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10802a;

    /* JADX INFO: renamed from: b */
    public final Object f10803b;

    /* JADX INFO: renamed from: c */
    public final Object f10804c;

    public C0737tk(Context context) {
        this.f10802a = 3;
        this.f10804c = new C0850wk(0);
        this.f10803b = context.getApplicationContext();
    }

    @Override // p000.g92
    /* JADX INFO: renamed from: a */
    public final d92 mo866a(Object obj, int i, int i2, ov1 ov1Var) {
        boolean z;
        r62 r62Var;
        rg0 rg0Var;
        switch (this.f10802a) {
            case 0:
                d92 d92VarMo866a = ((g92) this.f10803b).mo866a(obj, i, i2, ov1Var);
                Resources resources = (Resources) this.f10804c;
                if (d92VarMo866a == null) {
                    return null;
                }
                return new C0022al(resources, d92VarMo866a);
            case 1:
                d92 d92VarM2306c = ((i92) this.f10803b).m2306c((Uri) obj, ov1Var);
                if (d92VarM2306c == null) {
                    return null;
                }
                return rp0.m4537W((InterfaceC0965zk) this.f10804c, (Drawable) ((zo0) d92VarM2306c).get(), i, i2);
            case 2:
                InputStream inputStream = (InputStream) obj;
                if (inputStream instanceof r62) {
                    r62Var = (r62) inputStream;
                    z = false;
                } else {
                    z = true;
                    r62Var = new r62(inputStream, (td1) this.f10804c);
                }
                ArrayDeque arrayDeque = rg0.f9549j;
                synchronized (arrayDeque) {
                    rg0Var = (rg0) arrayDeque.poll();
                    break;
                }
                if (rg0Var == null) {
                    rg0Var = new rg0();
                }
                rg0 rg0Var2 = rg0Var;
                rg0Var2.f9550h = r62Var;
                ye1 ye1Var = new ye1(rg0Var2);
                dq1 dq1Var = new dq1(15, r62Var, rg0Var2);
                try {
                    xa0 xa0Var = (xa0) this.f10803b;
                    C0022al c0022alM6078a = xa0Var.m6078a(new C0043b5(ye1Var, xa0Var.f12927d, xa0Var.f12926c), i, i2, ov1Var, dq1Var);
                    rg0Var2.f9551i = null;
                    rg0Var2.f9550h = null;
                    synchronized (arrayDeque) {
                        arrayDeque.offer(rg0Var2);
                        break;
                    }
                    if (z) {
                        r62Var.m4397c();
                    }
                    return c0022alM6078a;
                } catch (Throwable th) {
                    rg0Var2.f9551i = null;
                    rg0Var2.f9550h = null;
                    ArrayDeque arrayDeque2 = rg0.f9549j;
                    synchronized (arrayDeque2) {
                        arrayDeque2.offer(rg0Var2);
                        if (!z) {
                            throw th;
                        }
                        r62Var.m4397c();
                        throw th;
                    }
                }
            default:
                Uri uri = (Uri) obj;
                Context context = (Context) this.f10803b;
                ImageDecoder.Source sourceCreateSource = ImageDecoder.createSource(context.getContentResolver(), uri);
                if (Log.isLoggable("UriBitmapDecoder", 2)) {
                    Log.v("UriBitmapDecoder", "decoding " + uri + ", mimeType: " + context.getContentResolver().getType(uri) + ", [" + i + ", " + i2 + "]");
                }
                return ((C0850wk) this.f10804c).m5939c(sourceCreateSource, i, i2, ov1Var);
        }
    }

    @Override // p000.g92
    /* JADX INFO: renamed from: b */
    public final boolean mo867b(Object obj, ov1 ov1Var) {
        String type;
        int i = this.f10802a;
        Object obj2 = this.f10803b;
        switch (i) {
            case 0:
                return ((g92) obj2).mo867b(obj, ov1Var);
            case 1:
                return "android.resource".equals(((Uri) obj).getScheme());
            case 2:
                return true;
            default:
                Uri uri = (Uri) obj;
                String scheme = uri.getScheme();
                return ("content".equals(scheme) || "file".equals(scheme) || "android.resource".equals(scheme)) && ((type = ((Context) obj2).getContentResolver().getType(uri)) == null || !type.equals("image/gif"));
        }
    }

    public /* synthetic */ C0737tk(int i, Object obj, Object obj2) {
        this.f10802a = i;
        this.f10803b = obj;
        this.f10804c = obj2;
    }

    public C0737tk(Resources resources, g92 g92Var) {
        this.f10802a = 0;
        this.f10804c = resources;
        this.f10803b = g92Var;
    }
}
