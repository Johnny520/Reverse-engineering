package Yue;

import Yue.AbstractC4565;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C4880 extends AbstractC4565<C4880> {

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public final C0520 f11227;

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۢۢ$ۥ */
    public static final class C0520 implements InterfaceC5061 {

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static final float f11228 = -4.2f;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static final float f11229 = 62.5f;

        /* JADX INFO: renamed from: ۥ۟ */
        public float f1208;

        /* JADX INFO: renamed from: ۥ */
        public float f1207 = -4.2f;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final AbstractC4565.C4579 f11230 = new AbstractC4565.C4579();

        @Override // Yue.InterfaceC5061
        /* JADX INFO: renamed from: ۥ */
        public boolean mo1790(float f, float f2) {
            return Math.abs(f2) < this.f1208;
        }

        @Override // Yue.InterfaceC5061
        /* JADX INFO: renamed from: ۥ۟ */
        public float mo1791(float f, float f2) {
            return f2 * this.f1207;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public float m15073() {
            return this.f1207 / (-4.2f);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void m15074(float f) {
            this.f1207 = f * (-4.2f);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public void m15075(float f) {
            this.f1208 = f * 62.5f;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public AbstractC4565.C4579 m15076(float f, float f2, long j) {
            float f3 = j;
            this.f11230.f980 = (float) (((double) f2) * Math.exp((f3 / 1000.0f) * this.f1207));
            AbstractC4565.C4579 c4579 = this.f11230;
            float f4 = this.f1207;
            c4579.f979 = (float) (((double) (f - (f2 / f4))) + (((double) (f2 / f4)) * Math.exp((f4 * f3) / 1000.0f)));
            AbstractC4565.C4579 c45792 = this.f11230;
            if (mo1790(c45792.f979, c45792.f980)) {
                this.f11230.f980 = 0.0f;
            }
            return this.f11230;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4880(C4887 c4887) {
        super(c4887);
        C0520 c0520 = new C0520();
        this.f11227 = c0520;
        c0520.m15075(m13616());
    }

    @Override // Yue.AbstractC4565
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public float mo13613(float f, float f2) {
        return this.f11227.mo1791(f, f2);
    }

    @Override // Yue.AbstractC4565
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public boolean mo13617(float f, float f2) {
        return f >= this.f9849 || f <= this.f9850 || this.f11227.mo1790(f, f2);
    }

    @Override // Yue.AbstractC4565
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ */
    public void mo13627(float f) {
        this.f11227.m15075(f);
    }

    @Override // Yue.AbstractC4565
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ */
    public boolean mo13630(long j) {
        AbstractC4565.C4579 c4579M15076 = this.f11227.m15076(this.f976, this.f975, j);
        float f = c4579M15076.f979;
        this.f976 = f;
        float f2 = c4579M15076.f980;
        this.f975 = f2;
        float f3 = this.f9850;
        if (f < f3) {
            this.f976 = f3;
            return true;
        }
        float f4 = this.f9849;
        if (f <= f4) {
            return mo13617(f, f2);
        }
        this.f976 = f4;
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public float m15068() {
        return this.f11227.m15073();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public C4880 m15069(@InterfaceC4885(from = 0.0d, fromInclusive = false) float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Friction must be positive");
        }
        this.f11227.m15074(f);
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟۠۟(F)LYue/ۥۣ۠۠ۤ; */
    @Override // Yue.AbstractC4565
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C4880 mo13621(float f) {
        super.mo13621(f);
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟۠۠(F)LYue/ۥۣ۠۠ۤ; */
    @Override // Yue.AbstractC4565
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C4880 mo13622(float f) {
        super.mo13622(f);
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟۠ۤ(F)LYue/ۥۣ۠۠ۤ; */
    @Override // Yue.AbstractC4565
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C4880 mo13626(float f) {
        super.mo13626(f);
        return this;
    }

    public <K> C4880(K k, AbstractC4884<K> abstractC4884) {
        super(k, abstractC4884);
        C0520 c0520 = new C0520();
        this.f11227 = c0520;
        c0520.m15075(m13616());
    }
}
