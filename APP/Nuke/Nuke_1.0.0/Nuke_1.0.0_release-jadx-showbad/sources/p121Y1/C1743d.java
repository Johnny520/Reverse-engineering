package p121Y1;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import p088R1.InterfaceC1194D;
import p088R1.InterfaceC1225z;
import p093S1.InterfaceC1289a;
import p195l2.AbstractC2503g;
import p195l2.AbstractC2511o;

/* JADX INFO: renamed from: Y1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1743d implements InterfaceC1194D, InterfaceC1225z {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f6015d = 0;

    /* JADX INFO: renamed from: e */
    public final Object f6016e;

    /* JADX INFO: renamed from: f */
    public final Object f6017f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1743d(InterfaceC1289a interfaceC1289a, Bitmap bitmap) {
        AbstractC2503g.m4445c(bitmap, "Bitmap must not be null");
        this.f6016e = bitmap;
        AbstractC2503g.m4445c(interfaceC1289a, "BitmapPool must not be null");
        this.f6017f = interfaceC1289a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static C1743d m3099b(InterfaceC1289a interfaceC1289a, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return new C1743d(interfaceC1289a, bitmap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p088R1.InterfaceC1225z
    /* JADX INFO: renamed from: a */
    public final void mo2310a() {
        switch (this.f6015d) {
            case 0:
                ((Bitmap) this.f6016e).prepareToDraw();
                break;
            default:
                InterfaceC1194D interfaceC1194D = (InterfaceC1194D) this.f6017f;
                if (interfaceC1194D instanceof InterfaceC1225z) {
                    ((InterfaceC1225z) interfaceC1194D).mo2310a();
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p088R1.InterfaceC1194D
    /* JADX INFO: renamed from: c */
    public final int mo2254c() {
        switch (this.f6015d) {
            case 0:
                return AbstractC2511o.m4454c((Bitmap) this.f6016e);
            default:
                return ((InterfaceC1194D) this.f6017f).mo2254c();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p088R1.InterfaceC1194D
    /* JADX INFO: renamed from: d */
    public final Class mo2255d() {
        switch (this.f6015d) {
            case 0:
                return Bitmap.class;
            default:
                return BitmapDrawable.class;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p088R1.InterfaceC1194D
    /* JADX INFO: renamed from: e */
    public final void mo2256e() {
        switch (this.f6015d) {
            case 0:
                ((InterfaceC1289a) this.f6017f).mo154e((Bitmap) this.f6016e);
                break;
            default:
                ((InterfaceC1194D) this.f6017f).mo2256e();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p088R1.InterfaceC1194D
    public final Object get() {
        switch (this.f6015d) {
            case 0:
                return (Bitmap) this.f6016e;
            default:
                return new BitmapDrawable((Resources) this.f6016e, (Bitmap) ((InterfaceC1194D) this.f6017f).get());
        }
    }

    public C1743d(Resources resources, InterfaceC1194D interfaceC1194D) {
        AbstractC2503g.m4445c(resources, "Argument must not be null");
        this.f6016e = resources;
        AbstractC2503g.m4445c(interfaceC1194D, "Argument must not be null");
        this.f6017f = interfaceC1194D;
    }
}
