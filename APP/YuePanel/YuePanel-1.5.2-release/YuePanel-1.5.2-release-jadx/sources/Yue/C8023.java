package Yue;

import Yue.C5053;
import Yue.C5058;
import Yue.C7130;
import Yue.InterfaceC7144;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.appcompat.widget.C1629;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;

/* JADX INFO: renamed from: Yue.ۥۣۢۢۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8023 {

    /* JADX INFO: renamed from: ۥ */
    public static final C8029 f3199;

    /* JADX INFO: renamed from: ۥ۟ */
    public static final C5891<String, Typeface> f3200;

    /* JADX INFO: renamed from: Yue.ۥۣۢۢۨ$ۥ */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    public static class C1408 extends C5058.C5060 {

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        @InterfaceC6490
        public C7130.AbstractC7134 f23828;

        public C1408(@InterfaceC6490 C7130.AbstractC7134 abstractC7134) {
            this.f23828 = abstractC7134;
        }

        @Override // Yue.C5058.C5060
        /* JADX INFO: renamed from: ۥ */
        public void mo1882(int i) {
            C7130.AbstractC7134 abstractC7134 = this.f23828;
            if (abstractC7134 != null) {
                abstractC7134.m22286(i);
            }
        }

        @Override // Yue.C5058.C5060
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo1883(@InterfaceC6391 Typeface typeface) {
            C7130.AbstractC7134 abstractC7134 = this.f23828;
            if (abstractC7134 != null) {
                abstractC7134.m22287(typeface);
            }
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f3199 = new C8028();
        } else if (i >= 28) {
            f3199 = new C8027();
        } else {
            f3199 = new C8026();
        }
        f3200 = new C5891<>(16);
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @InterfaceC8392
    /* JADX INFO: renamed from: ۥ */
    public static void m4042() {
        f3200.m18254();
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟ */
    public static Typeface m4043(@InterfaceC6391 Context context, @InterfaceC6490 Typeface typeface, int i) {
        if (context != null) {
            return Typeface.create(typeface, i);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static Typeface m25336(@InterfaceC6391 Context context, @InterfaceC6490 Typeface typeface, @InterfaceC5459(from = 1, m2228to = 1000) int i, boolean z) {
        if (context == null) {
            throw new IllegalArgumentException("Context cannot be null");
        }
        C6740.m21410(i, 1, 1000, C1629.f26363);
        if (typeface == null) {
            typeface = Typeface.DEFAULT;
        }
        return f3199.mo25352(context, typeface, i, z);
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static Typeface m25337(@InterfaceC6391 Context context, @InterfaceC6490 CancellationSignal cancellationSignal, @InterfaceC6391 C5058.C5059[] c5059Arr, int i) {
        return f3199.mo25351(context, cancellationSignal, c5059Arr, i);
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @InterfaceC6490
    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static Typeface m25338(@InterfaceC6391 Context context, @InterfaceC6391 C5053.InterfaceC0626 interfaceC0626, @InterfaceC6391 Resources resources, int i, int i2, @InterfaceC6490 C7130.AbstractC7134 abstractC7134, @InterfaceC6490 Handler handler, boolean z) {
        return m25339(context, interfaceC0626, resources, i, null, 0, i2, abstractC7134, handler, z);
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static Typeface m25339(@InterfaceC6391 Context context, @InterfaceC6391 C5053.InterfaceC0626 interfaceC0626, @InterfaceC6391 Resources resources, int i, @InterfaceC6490 String str, int i2, int i3, @InterfaceC6490 C7130.AbstractC7134 abstractC7134, @InterfaceC6490 Handler handler, boolean z) {
        Typeface typefaceMo4044;
        if (interfaceC0626 instanceof C5053.C5057) {
            C5053.C5057 c5057 = (C5053.C5057) interfaceC0626;
            Typeface typefaceM25346 = m25346(c5057.m15574());
            if (typefaceM25346 != null) {
                if (abstractC7134 != null) {
                    abstractC7134.callbackSuccessAsync(typefaceM25346, handler);
                }
                return typefaceM25346;
            }
            typefaceMo4044 = C5058.m15579(context, c5057.m1875(), i3, !z ? abstractC7134 != null : c5057.m1874() != 0, z ? c5057.m15575() : -1, C7130.AbstractC7134.getHandler(handler), new C1408(abstractC7134));
        } else {
            typefaceMo4044 = f3199.mo4044(context, (C5053.C5055) interfaceC0626, resources, i3);
            if (abstractC7134 != null) {
                if (typefaceMo4044 != null) {
                    abstractC7134.callbackSuccessAsync(typefaceMo4044, handler);
                } else {
                    abstractC7134.callbackFailAsync(-3, handler);
                }
            }
        }
        if (typefaceMo4044 != null) {
            f3200.m18260(m25342(resources, i, str, i2, i3), typefaceMo4044);
        }
        return typefaceMo4044;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @InterfaceC6490
    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static Typeface m25340(@InterfaceC6391 Context context, @InterfaceC6391 Resources resources, int i, String str, int i2) {
        return m25341(context, resources, i, str, 0, i2);
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static Typeface m25341(@InterfaceC6391 Context context, @InterfaceC6391 Resources resources, int i, String str, int i2, int i3) {
        Typeface typefaceMo25358 = f3199.mo25358(context, resources, i, str, i3);
        if (typefaceMo25358 != null) {
            f3200.m18260(m25342(resources, i, str, i2, i3), typefaceMo25358);
        }
        return typefaceMo25358;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static String m25342(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + SignatureVisitor.SUPER + str + SignatureVisitor.SUPER + i2 + SignatureVisitor.SUPER + i + SignatureVisitor.SUPER + i3;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @InterfaceC6490
    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static Typeface m25343(@InterfaceC6391 Resources resources, int i, int i2) {
        return m25344(resources, i, null, 0, i2);
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static Typeface m25344(@InterfaceC6391 Resources resources, int i, @InterfaceC6490 String str, int i2, int i3) {
        return f3200.m18256(m25342(resources, i, str, i2, i3));
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static Typeface m25345(Context context, Typeface typeface, int i) {
        C8029 c8029 = f3199;
        C5053.C5055 c5055M25383 = c8029.m25383(typeface);
        if (c5055M25383 == null) {
            return null;
        }
        return c8029.mo4044(context, c5055M25383, context.getResources(), i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static Typeface m25346(@InterfaceC6490 String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface typefaceCreate = Typeface.create(str, 0);
        Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
        if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
            return null;
        }
        return typefaceCreate;
    }
}
