package Yue;

import Yue.InterfaceC7144;
import android.os.Build;
import android.window.BackEvent;
import com.google.android.material.color.utilities.Contrast;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: Yue.ۥ۟ۢۤۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C3505 {

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0161 f5870 = new C0161(null);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f5871 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int f5872 = 1;

    /* JADX INFO: renamed from: ۥ */
    public final float f342;

    /* JADX INFO: renamed from: ۥ۟ */
    public final float f343;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final float f5873;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final int f5874;

    /* JADX INFO: renamed from: Yue.ۥ۟ۢۤۥ$ۥ */
    public static final class C0161 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥ۟ۢۤۥ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0161(C4335 c4335) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0161() {
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۢۤۥ$ۥ۟ */
    @Target({ElementType.TYPE_USE})
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @InterfaceC7157(EnumC3259.f5011)
    @Retention(RetentionPolicy.SOURCE)
    @InterfaceC7722(allowedTargets = {EnumC3260.f5027})
    public @interface InterfaceC0162 {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC8392
    public C3505(float f, float f2, @InterfaceC4885(from = 0.0d, m1796to = Contrast.RATIO_MIN) float f3, int i) {
        this.f342 = f;
        this.f343 = f2;
        this.f5873 = f3;
        this.f5874 = i;
    }

    @InterfaceC6399
    public String toString() {
        return "BackEventCompat{touchX=" + this.f342 + ", touchY=" + this.f343 + ", progress=" + this.f5873 + ", swipeEdge=" + this.f5874 + C6193.f1885;
    }

    /* JADX INFO: renamed from: ۥ */
    public final float m565() {
        return this.f5873;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final int m566() {
        return this.f5874;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final float m9337() {
        return this.f342;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final float m9338() {
        return this.f343;
    }

    @InterfaceC6399
    @InterfaceC7113(34)
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final BackEvent m9339() {
        if (Build.VERSION.SDK_INT >= 34) {
            return C3263.f174.m333(this.f342, this.f343, this.f5873, this.f5874);
        }
        throw new UnsupportedOperationException("This method is only supported on API level 34+");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @InterfaceC7113(34)
    public C3505(@InterfaceC6399 BackEvent backEvent) {
        C5499.m17103(backEvent, "backEvent");
        C3263 c3263 = C3263.f174;
        this(c3263.m6665(backEvent), c3263.m6666(backEvent), c3263.m334(backEvent), c3263.m6664(backEvent));
    }
}
