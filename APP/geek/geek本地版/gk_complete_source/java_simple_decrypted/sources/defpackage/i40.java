package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class i40 {
    public double a;
    public double b;
    public boolean c;
    public double d;
    public double e;
    public double f;
    public double g;
    public double h;
    public double i;
    public final rh j;

    public i40() {
        this.a = Math.sqrt(1500.0d);
        this.b = 0.5d;
        this.c = false;
        this.i = Double.MAX_VALUE;
        this.j = new rh();
    }

    public final void a(float r3) {
        if (r3 < 0.0f) goto L7;
        this.b = r3;
        this.c = false;
        return;
    L7:
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    public final void b(float r3) {
        if (r3 <= 0.0f) goto L7;
        this.a = Math.sqrt(r3);
        this.c = false;
        return;
    L7:
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    public final rh c(double r17, double r19, long r21) {
        if (this.c == false) goto L6;
    L16:
        double r4 = r21 / 1000.0d;
        double r6 = r17 - this.i;
        double r8 = this.b;
        if (r8 <= 1.0d) goto L19;
        double r1 = this.g;
        double r82 = ((r1 * r6) - r19) / (r1 - this.f);
        double r62 = r6 - r82;
        double r12 = (Math.pow(2.718281828459045d, this.f * r4) * r82) + (Math.pow(2.718281828459045d, r1 * r4) * r62);
        double r13 = this.g;
        double r14 = Math.pow(2.718281828459045d, r13 * r4) * (r62 * r13);
        double r63 = this.f;
        double r3 = (Math.pow(2.718281828459045d, r63 * r4) * (r82 * r63)) + r14;
    L22:
        float r15 = (float) (r12 + this.i);
        rh r2 = this.j;
        r2.a = r15;
        r2.b = (float) r3;
        return r2;
    L19:
        if (r8 != 1.0d) goto L21;
        double r16 = this.a;
        double r83 = (r16 * r6) + r19;
        double r122 = (r83 * r4) + r6;
        double r18 = Math.pow(2.718281828459045d, (-r16) * r4) * r122;
        double r64 = Math.pow(2.718281828459045d, (-this.a) * r4) * r122;
        double r123 = -this.a;
        r3 = (Math.pow(2.718281828459045d, r123 * r4) * r83) + (r64 * r123);
        r12 = r18;
        goto L22
    L21:
        double r22 = 1.0d / this.h;
        double r124 = this.a;
        double r142 = (((r8 * r124) * r6) + r19) * r22;
        r12 = ((Math.sin(this.h * r4) * r142) + (Math.cos(this.h * r4) * r6)) * Math.pow(2.718281828459045d, ((-r8) * r124) * r4);
        double r110 = this.a;
        double r10 = this.b;
        double r84 = ((-r110) * r12) * r10;
        double r111 = Math.pow(2.718281828459045d, ((-r10) * r110) * r4);
        double r102 = this.h;
        double r65 = Math.sin(r102 * r4) * ((-r102) * r6);
        double r112 = this.h;
        r3 = (((Math.cos(r112 * r4) * (r142 * r112)) + r65) * r111) + r84;
        goto L22
    L6:
        if (this.i == Double.MAX_VALUE) goto L25;
        double r42 = this.b;
        if (r42 <= 1.0d) goto L11;
        double r85 = this.a;
        this.f = (Math.sqrt((r42 * r42) - 1.0d) * r85) + ((-r42) * r85);
        double r43 = this.b;
        double r86 = this.a;
        this.g = ((-r43) * r86) - (Math.sqrt((r43 * r43) - 1.0d) * r86);
    L15:
        this.c = true;
        goto L16
    L11:
        if (r42 < 0.0d) goto L15;
        if (r42 >= 1.0d) goto L15;
        this.h = Math.sqrt(1.0d - (r42 * r42)) * this.a;
        goto L15
    L25:
        throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
    }

    public i40(float r3) {
        this.a = Math.sqrt(1500.0d);
        this.b = 0.5d;
        this.c = false;
        this.j = new rh();
        this.i = r3;
    }
}
