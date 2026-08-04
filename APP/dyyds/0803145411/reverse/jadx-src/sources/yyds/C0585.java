package yyds;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: yyds.ᛳᛵᛳᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0585 implements InterfaceC0814 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f2791;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Object f2792;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Object f2793;

    public C0585(Context context) {
        this.f2791 = 3;
        this.f2793 = new C1530(0);
        this.f2792 = context.getApplicationContext();
    }

    @Override // yyds.InterfaceC0814
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final boolean mo427(Object obj, C0822 c0822) {
        String type;
        int i = this.f2791;
        Object obj2 = this.f2792;
        switch (i) {
            case 0:
                return ((InterfaceC0814) obj2).mo427(obj, c0822);
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

    @Override // yyds.InterfaceC0814
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final InterfaceC2162 mo428(Object obj, int i, int i2, C0822 c0822) {
        boolean z;
        C0839 c0839;
        C1716 c1716;
        switch (this.f2791) {
            case 0:
                InterfaceC2162 interfaceC2162Mo428 = ((InterfaceC0814) this.f2792).mo428(obj, i, i2, c0822);
                Resources resources = (Resources) this.f2793;
                if (interfaceC2162Mo428 == null) {
                    return null;
                }
                return new C0656(resources, interfaceC2162Mo428);
            case 1:
                InterfaceC2162 interfaceC2162M429 = ((C0064) this.f2792).m429((Uri) obj, c0822);
                if (interfaceC2162M429 == null) {
                    return null;
                }
                return AbstractC0797.m1827((InterfaceC2587) this.f2793, (Drawable) ((C1003) interfaceC2162M429).get(), i, i2);
            case 2:
                InputStream inputStream = (InputStream) obj;
                boolean z2 = false;
                if (inputStream instanceof C0839) {
                    c0839 = (C0839) inputStream;
                    z = false;
                } else {
                    z = true;
                    c0839 = new C0839(inputStream, (C2267) this.f2793);
                }
                ArrayDeque arrayDeque = C1716.f8697;
                synchronized (arrayDeque) {
                    c1716 = (C1716) arrayDeque.poll();
                    break;
                }
                if (c1716 == null) {
                    c1716 = new C1716();
                }
                C1716 c17162 = c1716;
                c17162.f8698 = c0839;
                C2747 c2747 = new C2747(c17162);
                C0119 c0119 = new C0119(12, c0839, c17162, z2);
                try {
                    C2707 c2707 = (C2707) this.f2792;
                    C0656 c0656M4817 = c2707.m4817(new C0644(c2747, c2707.f13289, c2707.f13288), i, i2, c0822, c0119);
                    c17162.f8699 = null;
                    c17162.f8698 = null;
                    synchronized (arrayDeque) {
                        arrayDeque.offer(c17162);
                        break;
                    }
                    if (z) {
                        c0839.m1921();
                    }
                    return c0656M4817;
                } catch (Throwable th) {
                    c17162.f8699 = null;
                    c17162.f8698 = null;
                    ArrayDeque arrayDeque2 = C1716.f8697;
                    synchronized (arrayDeque2) {
                        arrayDeque2.offer(c17162);
                        if (!z) {
                            throw th;
                        }
                        c0839.m1921();
                        throw th;
                    }
                }
            default:
                Uri uri = (Uri) obj;
                Context context = (Context) this.f2792;
                ImageDecoder.Source sourceCreateSource = ImageDecoder.createSource(context.getContentResolver(), uri);
                if (Log.isLoggable("UriBitmapDecoder", 2)) {
                    Log.v("UriBitmapDecoder", "decoding " + uri + ", mimeType: " + context.getContentResolver().getType(uri) + ", [" + i + ", " + i2 + "]");
                }
                return ((C1530) this.f2793).m3165(sourceCreateSource, i, i2, c0822);
        }
    }

    public /* synthetic */ C0585(Object obj, int i, Object obj2) {
        this.f2791 = i;
        this.f2792 = obj;
        this.f2793 = obj2;
    }

    public C0585(Resources resources, InterfaceC0814 interfaceC0814) {
        this.f2791 = 0;
        this.f2793 = resources;
        this.f2792 = interfaceC0814;
    }
}
