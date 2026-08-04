package yyds;

import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.view.View;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: yyds.ᛳᛵᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0598 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final InterfaceC0274[] f2824 = new InterfaceC0274[0];

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final C0415 f2825 = new C0415("NO_OWNER", 1);

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static View f2826;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static GradientDrawable f2827;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static final boolean m1479(String str) {
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static String m1480(X509Certificate x509Certificate) throws NoSuchAlgorithmException {
        StringBuilder sb = new StringBuilder("sha256/");
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        int length = encoded.length;
        AbstractC2217.m4201(encoded.length, 0L, length);
        byte[] bArrM3946 = AbstractC2070.m3946(encoded, 0, length);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(bArrM3946, 0, bArrM3946.length);
        sb.append(new C2534(messageDigest.digest()).mo4260());
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static boolean m1481(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static void m1482(StringBuilder sb, Object obj, InterfaceC1549 interfaceC1549) {
        if (interfaceC1549 != null) {
            sb.append((CharSequence) interfaceC1549.mo371(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static float m1483(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public static C2536 m1484(C2807 c2807, int i) {
        boolean z = i > 0;
        Integer numValueOf = Integer.valueOf(i);
        if (!z) {
            throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
        }
        int i2 = c2807.f12492;
        int i3 = c2807.f12493;
        if (c2807.f12491 <= 0) {
            i = -i;
        }
        return new C2536(i2, i3, i);
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public static C2807 m1485(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new C2807(i, i2 - 1, 1);
        }
        C2807 c2807 = C2807.f13686;
        return C2807.f13686;
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static int m1486(C2807 c2807) {
        C1510 c1510 = AbstractC2497.f12305;
        try {
            if (c2807.isEmpty()) {
                throw new IllegalArgumentException("Cannot get random in empty range: " + c2807);
            }
            int i = c2807.f12493;
            int i2 = c2807.f12492;
            if (i < Integer.MAX_VALUE) {
                return AbstractC2497.f12306.mo3133(i2, i + 1);
            }
            if (i2 <= Integer.MIN_VALUE) {
                return AbstractC2497.f12306.mo1530();
            }
            return AbstractC2497.f12306.mo3133(i2 - 1, i) + 1;
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static int m1487(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static long m1488(long j, long j2, long j3) {
        if (j2 <= j3) {
            return j < j2 ? j2 : j > j3 ? j3 : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum " + j2 + '.');
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public abstract void mo1489();

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public abstract void mo1490();
}
