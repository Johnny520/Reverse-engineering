package Yue;

import Yue.AbstractC4565;
import android.os.Looper;
import android.util.AndroidRuntimeException;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۧۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C7560 extends AbstractC4565<C7560> {

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final float f22836 = Float.MAX_VALUE;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public C7561 f22837;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public float f22838;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public boolean f22839;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C7560(C4887 c4887) {
        super(c4887);
        this.f22837 = null;
        this.f22838 = Float.MAX_VALUE;
        this.f22839 = false;
    }

    @Override // Yue.AbstractC4565
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public float mo13613(float f, float f2) {
        return this.f22837.mo1791(f, f2);
    }

    @Override // Yue.AbstractC4565
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public boolean mo13617(float f, float f2) {
        return this.f22837.mo1790(f, f2);
    }

    @Override // Yue.AbstractC4565
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ */
    public void mo13627(float f) {
    }

    @Override // Yue.AbstractC4565
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ */
    public void mo13628() {
        m23662();
        this.f22837.m23672(m13616());
        super.mo13628();
    }

    @Override // Yue.AbstractC4565
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ */
    public boolean mo13630(long j) {
        if (this.f22839) {
            float f = this.f22838;
            if (f != Float.MAX_VALUE) {
                this.f22837.m23670(f);
                this.f22838 = Float.MAX_VALUE;
            }
            this.f976 = this.f22837.m23666();
            this.f975 = 0.0f;
            this.f22839 = false;
            return true;
        }
        if (this.f22838 != Float.MAX_VALUE) {
            this.f22837.m23666();
            long j2 = j / 2;
            AbstractC4565.C4579 c4579M23673 = this.f22837.m23673(this.f976, this.f975, j2);
            this.f22837.m23670(this.f22838);
            this.f22838 = Float.MAX_VALUE;
            AbstractC4565.C4579 c4579M236732 = this.f22837.m23673(c4579M23673.f979, c4579M23673.f980, j2);
            this.f976 = c4579M236732.f979;
            this.f975 = c4579M236732.f980;
        } else {
            AbstractC4565.C4579 c4579M236733 = this.f22837.m23673(this.f976, this.f975, j);
            this.f976 = c4579M236733.f979;
            this.f975 = c4579M236733.f980;
        }
        float fMax = Math.max(this.f976, this.f9850);
        this.f976 = fMax;
        float fMin = Math.min(fMax, this.f9849);
        this.f976 = fMin;
        if (!mo13617(fMin, this.f975)) {
            return false;
        }
        this.f976 = this.f22837.m23666();
        this.f975 = 0.0f;
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public void m23659(float f) {
        if (m13618()) {
            this.f22838 = f;
            return;
        }
        if (this.f22837 == null) {
            this.f22837 = new C7561(f);
        }
        this.f22837.m23670(f);
        mo13628();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public boolean m23660() {
        return this.f22837.f2945 > 0.0d;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public C7561 m23661() {
        return this.f22837;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final void m23662() {
        C7561 c7561 = this.f22837;
        if (c7561 == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double dM23666 = c7561.m23666();
        if (dM23666 > this.f9849) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (dM23666 < this.f9850) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public C7560 m23663(C7561 c7561) {
        this.f22837 = c7561;
        return this;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public void m23664() {
        if (!m23660()) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f9848) {
            this.f22839 = true;
        }
    }

    public <K> C7560(K k, AbstractC4884<K> abstractC4884) {
        super(k, abstractC4884);
        this.f22837 = null;
        this.f22838 = Float.MAX_VALUE;
        this.f22839 = false;
    }

    public <K> C7560(K k, AbstractC4884<K> abstractC4884, float f) {
        super(k, abstractC4884);
        this.f22837 = null;
        this.f22838 = Float.MAX_VALUE;
        this.f22839 = false;
        this.f22837 = new C7561(f);
    }
}
