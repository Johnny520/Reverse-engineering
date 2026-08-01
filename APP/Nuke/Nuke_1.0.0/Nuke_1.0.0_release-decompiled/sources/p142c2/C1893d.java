package p142c2;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C1921c;
import java.security.MessageDigest;
import p078P1.InterfaceC1151m;
import p088R1.InterfaceC1194D;
import p121Y1.C1743d;
import p195l2.AbstractC2503g;

/* JADX INFO: renamed from: c2.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1893d implements InterfaceC1151m {

    /* JADX INFO: renamed from: b */
    public final InterfaceC1151m f6436b;

    public C1893d(InterfaceC1151m interfaceC1151m) {
        AbstractC2503g.m4445c(interfaceC1151m, "Argument must not be null");
        this.f6436b = interfaceC1151m;
    }

    @Override // p078P1.InterfaceC1151m
    /* JADX INFO: renamed from: a */
    public final InterfaceC1194D mo2204a(Context context, InterfaceC1194D interfaceC1194D, int i5, int i6) {
        C1892c c1892c = (C1892c) interfaceC1194D.get();
        InterfaceC1194D c1743d = new C1743d(ComponentCallbacks2C1921c.m3413a(context).f6514d, c1892c.f6426d.f6425a.f6455l);
        InterfaceC1151m interfaceC1151m = this.f6436b;
        InterfaceC1194D interfaceC1194DMo2204a = interfaceC1151m.mo2204a(context, c1743d, i5, i6);
        if (!c1743d.equals(interfaceC1194DMo2204a)) {
            c1743d.mo2256e();
        }
        c1892c.f6426d.f6425a.m3387c(interfaceC1151m, (Bitmap) interfaceC1194DMo2204a.get());
        return interfaceC1194D;
    }

    @Override // p078P1.InterfaceC1144f
    /* JADX INFO: renamed from: b */
    public final void mo2199b(MessageDigest messageDigest) {
        this.f6436b.mo2199b(messageDigest);
    }

    @Override // p078P1.InterfaceC1144f
    public final boolean equals(Object obj) {
        if (obj instanceof C1893d) {
            return this.f6436b.equals(((C1893d) obj).f6436b);
        }
        return false;
    }

    @Override // p078P1.InterfaceC1144f
    public final int hashCode() {
        return this.f6436b.hashCode();
    }
}
