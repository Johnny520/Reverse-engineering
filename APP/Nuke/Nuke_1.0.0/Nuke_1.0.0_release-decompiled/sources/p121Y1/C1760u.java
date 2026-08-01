package p121Y1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.ComponentCallbacks2C1921c;
import java.security.MessageDigest;
import p078P1.InterfaceC1151m;
import p088R1.InterfaceC1194D;
import p093S1.InterfaceC1289a;

/* JADX INFO: renamed from: Y1.u */
/* JADX INFO: loaded from: classes.dex */
public final class C1760u implements InterfaceC1151m {

    /* JADX INFO: renamed from: b */
    public final InterfaceC1151m f6053b;

    /* JADX INFO: renamed from: c */
    public final boolean f6054c;

    public C1760u(InterfaceC1151m interfaceC1151m, boolean z5) {
        this.f6053b = interfaceC1151m;
        this.f6054c = z5;
    }

    @Override // p078P1.InterfaceC1151m
    /* JADX INFO: renamed from: a */
    public final InterfaceC1194D mo2204a(Context context, InterfaceC1194D interfaceC1194D, int i5, int i6) {
        InterfaceC1289a interfaceC1289a = ComponentCallbacks2C1921c.m3413a(context).f6514d;
        Drawable drawable = (Drawable) interfaceC1194D.get();
        C1743d c1743dM3134a = AbstractC1759t.m3134a(interfaceC1289a, drawable, i5, i6);
        if (c1743dM3134a != null) {
            InterfaceC1194D interfaceC1194DMo2204a = this.f6053b.mo2204a(context, c1743dM3134a, i5, i6);
            if (!interfaceC1194DMo2204a.equals(c1743dM3134a)) {
                return new C1743d(context.getResources(), interfaceC1194DMo2204a);
            }
            interfaceC1194DMo2204a.mo2256e();
            return interfaceC1194D;
        }
        if (!this.f6054c) {
            return interfaceC1194D;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // p078P1.InterfaceC1144f
    /* JADX INFO: renamed from: b */
    public final void mo2199b(MessageDigest messageDigest) {
        this.f6053b.mo2199b(messageDigest);
    }

    @Override // p078P1.InterfaceC1144f
    public final boolean equals(Object obj) {
        if (obj instanceof C1760u) {
            return this.f6053b.equals(((C1760u) obj).f6053b);
        }
        return false;
    }

    @Override // p078P1.InterfaceC1144f
    public final int hashCode() {
        return this.f6053b.hashCode();
    }
}
