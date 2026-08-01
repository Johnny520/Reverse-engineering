package p217p0;

import java.util.Arrays;
import me.dartcv.nuke.BuildConfig;
import p029F0.C0363A;
import p117X2.AbstractC1665j;
import p211o0.AbstractC2767z;

/* JADX INFO: renamed from: p0.q */
/* JADX INFO: loaded from: classes.dex */
public final class C2886q extends AbstractC2872c {

    /* JADX INFO: renamed from: r */
    public static final C0363A f9122r = new C0363A(20);

    /* JADX INFO: renamed from: d */
    public final C2888s f9123d;

    /* JADX INFO: renamed from: e */
    public final float f9124e;

    /* JADX INFO: renamed from: f */
    public final float f9125f;

    /* JADX INFO: renamed from: g */
    public final C2887r f9126g;

    /* JADX INFO: renamed from: h */
    public final float[] f9127h;

    /* JADX INFO: renamed from: i */
    public final float[] f9128i;

    /* JADX INFO: renamed from: j */
    public final float[] f9129j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC2878i f9130k;

    /* JADX INFO: renamed from: l */
    public final C2885p f9131l;

    /* JADX INFO: renamed from: m */
    public final C2882m f9132m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC2878i f9133n;

    /* JADX INFO: renamed from: o */
    public final C2885p f9134o;

    /* JADX INFO: renamed from: p */
    public final C2882m f9135p;

    /* JADX INFO: renamed from: q */
    public final boolean f9136q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2886q(String str, float[] fArr, C2888s c2888s, final C2887r c2887r, int i5) {
        InterfaceC2878i interfaceC2878i;
        InterfaceC2878i interfaceC2878i2;
        double d5 = c2887r.f9137a;
        boolean z5 = d5 == -3.0d;
        double d6 = c2887r.f9143g;
        double d7 = c2887r.f9142f;
        if (z5) {
            final int i6 = 4;
            interfaceC2878i = new InterfaceC2878i() { // from class: p0.o
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p217p0.InterfaceC2878i
                /* JADX INFO: renamed from: b */
                public final double mo601b(double d8) {
                    int i7 = i6;
                    C2887r c2887r2 = c2887r;
                    switch (i7) {
                        case 0:
                            float[] fArr2 = C2873d.f9071a;
                            return C2873d.m5076a(c2887r2, d8);
                        case BuildConfig.VERSION_CODE /* 1 */:
                            float[] fArr3 = C2873d.f9071a;
                            return C2873d.m5078c(c2887r2, d8);
                        case 2:
                            double d9 = c2887r2.f9138b;
                            return d8 >= c2887r2.f9141e ? Math.pow((d9 * d8) + c2887r2.f9139c, c2887r2.f9137a) : d8 * c2887r2.f9140d;
                        case 3:
                            double d10 = c2887r2.f9138b;
                            double d11 = c2887r2.f9139c;
                            double d12 = c2887r2.f9140d;
                            return d8 >= c2887r2.f9141e ? Math.pow((d10 * d8) + d11, c2887r2.f9137a) + c2887r2.f9142f : (d12 * d8) + c2887r2.f9143g;
                        case 4:
                            float[] fArr4 = C2873d.f9071a;
                            return C2873d.m5077b(c2887r2, d8);
                        case 5:
                            float[] fArr5 = C2873d.f9071a;
                            return C2873d.m5079d(c2887r2, d8);
                        case 6:
                            double d13 = c2887r2.f9138b;
                            double d14 = c2887r2.f9139c;
                            double d15 = c2887r2.f9140d;
                            return d8 >= c2887r2.f9141e * d15 ? (Math.pow(d8, 1.0d / c2887r2.f9137a) - d14) / d13 : d8 / d15;
                        default:
                            double d16 = c2887r2.f9138b;
                            double d17 = c2887r2.f9139c;
                            double d18 = c2887r2.f9140d;
                            return d8 >= c2887r2.f9141e * d18 ? (Math.pow(d8 - c2887r2.f9142f, 1.0d / c2887r2.f9137a) - d17) / d16 : (d8 - c2887r2.f9143g) / d18;
                    }
                }
            };
        } else if (d5 == -2.0d) {
            final int i7 = 5;
            interfaceC2878i = new InterfaceC2878i() { // from class: p0.o
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p217p0.InterfaceC2878i
                /* JADX INFO: renamed from: b */
                public final double mo601b(double d8) {
                    int i72 = i7;
                    C2887r c2887r2 = c2887r;
                    switch (i72) {
                        case 0:
                            float[] fArr2 = C2873d.f9071a;
                            return C2873d.m5076a(c2887r2, d8);
                        case BuildConfig.VERSION_CODE /* 1 */:
                            float[] fArr3 = C2873d.f9071a;
                            return C2873d.m5078c(c2887r2, d8);
                        case 2:
                            double d9 = c2887r2.f9138b;
                            return d8 >= c2887r2.f9141e ? Math.pow((d9 * d8) + c2887r2.f9139c, c2887r2.f9137a) : d8 * c2887r2.f9140d;
                        case 3:
                            double d10 = c2887r2.f9138b;
                            double d11 = c2887r2.f9139c;
                            double d12 = c2887r2.f9140d;
                            return d8 >= c2887r2.f9141e ? Math.pow((d10 * d8) + d11, c2887r2.f9137a) + c2887r2.f9142f : (d12 * d8) + c2887r2.f9143g;
                        case 4:
                            float[] fArr4 = C2873d.f9071a;
                            return C2873d.m5077b(c2887r2, d8);
                        case 5:
                            float[] fArr5 = C2873d.f9071a;
                            return C2873d.m5079d(c2887r2, d8);
                        case 6:
                            double d13 = c2887r2.f9138b;
                            double d14 = c2887r2.f9139c;
                            double d15 = c2887r2.f9140d;
                            return d8 >= c2887r2.f9141e * d15 ? (Math.pow(d8, 1.0d / c2887r2.f9137a) - d14) / d13 : d8 / d15;
                        default:
                            double d16 = c2887r2.f9138b;
                            double d17 = c2887r2.f9139c;
                            double d18 = c2887r2.f9140d;
                            return d8 >= c2887r2.f9141e * d18 ? (Math.pow(d8 - c2887r2.f9142f, 1.0d / c2887r2.f9137a) - d17) / d16 : (d8 - c2887r2.f9143g) / d18;
                    }
                }
            };
        } else if (d7 == 0.0d && d6 == 0.0d) {
            final int i8 = 6;
            interfaceC2878i = new InterfaceC2878i() { // from class: p0.o
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p217p0.InterfaceC2878i
                /* JADX INFO: renamed from: b */
                public final double mo601b(double d8) {
                    int i72 = i8;
                    C2887r c2887r2 = c2887r;
                    switch (i72) {
                        case 0:
                            float[] fArr2 = C2873d.f9071a;
                            return C2873d.m5076a(c2887r2, d8);
                        case BuildConfig.VERSION_CODE /* 1 */:
                            float[] fArr3 = C2873d.f9071a;
                            return C2873d.m5078c(c2887r2, d8);
                        case 2:
                            double d9 = c2887r2.f9138b;
                            return d8 >= c2887r2.f9141e ? Math.pow((d9 * d8) + c2887r2.f9139c, c2887r2.f9137a) : d8 * c2887r2.f9140d;
                        case 3:
                            double d10 = c2887r2.f9138b;
                            double d11 = c2887r2.f9139c;
                            double d12 = c2887r2.f9140d;
                            return d8 >= c2887r2.f9141e ? Math.pow((d10 * d8) + d11, c2887r2.f9137a) + c2887r2.f9142f : (d12 * d8) + c2887r2.f9143g;
                        case 4:
                            float[] fArr4 = C2873d.f9071a;
                            return C2873d.m5077b(c2887r2, d8);
                        case 5:
                            float[] fArr5 = C2873d.f9071a;
                            return C2873d.m5079d(c2887r2, d8);
                        case 6:
                            double d13 = c2887r2.f9138b;
                            double d14 = c2887r2.f9139c;
                            double d15 = c2887r2.f9140d;
                            return d8 >= c2887r2.f9141e * d15 ? (Math.pow(d8, 1.0d / c2887r2.f9137a) - d14) / d13 : d8 / d15;
                        default:
                            double d16 = c2887r2.f9138b;
                            double d17 = c2887r2.f9139c;
                            double d18 = c2887r2.f9140d;
                            return d8 >= c2887r2.f9141e * d18 ? (Math.pow(d8 - c2887r2.f9142f, 1.0d / c2887r2.f9137a) - d17) / d16 : (d8 - c2887r2.f9143g) / d18;
                    }
                }
            };
        } else {
            final int i9 = 7;
            interfaceC2878i = new InterfaceC2878i() { // from class: p0.o
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p217p0.InterfaceC2878i
                /* JADX INFO: renamed from: b */
                public final double mo601b(double d8) {
                    int i72 = i9;
                    C2887r c2887r2 = c2887r;
                    switch (i72) {
                        case 0:
                            float[] fArr2 = C2873d.f9071a;
                            return C2873d.m5076a(c2887r2, d8);
                        case BuildConfig.VERSION_CODE /* 1 */:
                            float[] fArr3 = C2873d.f9071a;
                            return C2873d.m5078c(c2887r2, d8);
                        case 2:
                            double d9 = c2887r2.f9138b;
                            return d8 >= c2887r2.f9141e ? Math.pow((d9 * d8) + c2887r2.f9139c, c2887r2.f9137a) : d8 * c2887r2.f9140d;
                        case 3:
                            double d10 = c2887r2.f9138b;
                            double d11 = c2887r2.f9139c;
                            double d12 = c2887r2.f9140d;
                            return d8 >= c2887r2.f9141e ? Math.pow((d10 * d8) + d11, c2887r2.f9137a) + c2887r2.f9142f : (d12 * d8) + c2887r2.f9143g;
                        case 4:
                            float[] fArr4 = C2873d.f9071a;
                            return C2873d.m5077b(c2887r2, d8);
                        case 5:
                            float[] fArr5 = C2873d.f9071a;
                            return C2873d.m5079d(c2887r2, d8);
                        case 6:
                            double d13 = c2887r2.f9138b;
                            double d14 = c2887r2.f9139c;
                            double d15 = c2887r2.f9140d;
                            return d8 >= c2887r2.f9141e * d15 ? (Math.pow(d8, 1.0d / c2887r2.f9137a) - d14) / d13 : d8 / d15;
                        default:
                            double d16 = c2887r2.f9138b;
                            double d17 = c2887r2.f9139c;
                            double d18 = c2887r2.f9140d;
                            return d8 >= c2887r2.f9141e * d18 ? (Math.pow(d8 - c2887r2.f9142f, 1.0d / c2887r2.f9137a) - d17) / d16 : (d8 - c2887r2.f9143g) / d18;
                    }
                }
            };
        }
        if (d5 == -3.0d) {
            final int i10 = 0;
            interfaceC2878i2 = new InterfaceC2878i() { // from class: p0.o
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p217p0.InterfaceC2878i
                /* JADX INFO: renamed from: b */
                public final double mo601b(double d8) {
                    int i72 = i10;
                    C2887r c2887r2 = c2887r;
                    switch (i72) {
                        case 0:
                            float[] fArr2 = C2873d.f9071a;
                            return C2873d.m5076a(c2887r2, d8);
                        case BuildConfig.VERSION_CODE /* 1 */:
                            float[] fArr3 = C2873d.f9071a;
                            return C2873d.m5078c(c2887r2, d8);
                        case 2:
                            double d9 = c2887r2.f9138b;
                            return d8 >= c2887r2.f9141e ? Math.pow((d9 * d8) + c2887r2.f9139c, c2887r2.f9137a) : d8 * c2887r2.f9140d;
                        case 3:
                            double d10 = c2887r2.f9138b;
                            double d11 = c2887r2.f9139c;
                            double d12 = c2887r2.f9140d;
                            return d8 >= c2887r2.f9141e ? Math.pow((d10 * d8) + d11, c2887r2.f9137a) + c2887r2.f9142f : (d12 * d8) + c2887r2.f9143g;
                        case 4:
                            float[] fArr4 = C2873d.f9071a;
                            return C2873d.m5077b(c2887r2, d8);
                        case 5:
                            float[] fArr5 = C2873d.f9071a;
                            return C2873d.m5079d(c2887r2, d8);
                        case 6:
                            double d13 = c2887r2.f9138b;
                            double d14 = c2887r2.f9139c;
                            double d15 = c2887r2.f9140d;
                            return d8 >= c2887r2.f9141e * d15 ? (Math.pow(d8, 1.0d / c2887r2.f9137a) - d14) / d13 : d8 / d15;
                        default:
                            double d16 = c2887r2.f9138b;
                            double d17 = c2887r2.f9139c;
                            double d18 = c2887r2.f9140d;
                            return d8 >= c2887r2.f9141e * d18 ? (Math.pow(d8 - c2887r2.f9142f, 1.0d / c2887r2.f9137a) - d17) / d16 : (d8 - c2887r2.f9143g) / d18;
                    }
                }
            };
        } else if (d5 == -2.0d) {
            final int i11 = 1;
            interfaceC2878i2 = new InterfaceC2878i() { // from class: p0.o
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p217p0.InterfaceC2878i
                /* JADX INFO: renamed from: b */
                public final double mo601b(double d8) {
                    int i72 = i11;
                    C2887r c2887r2 = c2887r;
                    switch (i72) {
                        case 0:
                            float[] fArr2 = C2873d.f9071a;
                            return C2873d.m5076a(c2887r2, d8);
                        case BuildConfig.VERSION_CODE /* 1 */:
                            float[] fArr3 = C2873d.f9071a;
                            return C2873d.m5078c(c2887r2, d8);
                        case 2:
                            double d9 = c2887r2.f9138b;
                            return d8 >= c2887r2.f9141e ? Math.pow((d9 * d8) + c2887r2.f9139c, c2887r2.f9137a) : d8 * c2887r2.f9140d;
                        case 3:
                            double d10 = c2887r2.f9138b;
                            double d11 = c2887r2.f9139c;
                            double d12 = c2887r2.f9140d;
                            return d8 >= c2887r2.f9141e ? Math.pow((d10 * d8) + d11, c2887r2.f9137a) + c2887r2.f9142f : (d12 * d8) + c2887r2.f9143g;
                        case 4:
                            float[] fArr4 = C2873d.f9071a;
                            return C2873d.m5077b(c2887r2, d8);
                        case 5:
                            float[] fArr5 = C2873d.f9071a;
                            return C2873d.m5079d(c2887r2, d8);
                        case 6:
                            double d13 = c2887r2.f9138b;
                            double d14 = c2887r2.f9139c;
                            double d15 = c2887r2.f9140d;
                            return d8 >= c2887r2.f9141e * d15 ? (Math.pow(d8, 1.0d / c2887r2.f9137a) - d14) / d13 : d8 / d15;
                        default:
                            double d16 = c2887r2.f9138b;
                            double d17 = c2887r2.f9139c;
                            double d18 = c2887r2.f9140d;
                            return d8 >= c2887r2.f9141e * d18 ? (Math.pow(d8 - c2887r2.f9142f, 1.0d / c2887r2.f9137a) - d17) / d16 : (d8 - c2887r2.f9143g) / d18;
                    }
                }
            };
        } else if (d7 == 0.0d && d6 == 0.0d) {
            final int i12 = 2;
            interfaceC2878i2 = new InterfaceC2878i() { // from class: p0.o
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p217p0.InterfaceC2878i
                /* JADX INFO: renamed from: b */
                public final double mo601b(double d8) {
                    int i72 = i12;
                    C2887r c2887r2 = c2887r;
                    switch (i72) {
                        case 0:
                            float[] fArr2 = C2873d.f9071a;
                            return C2873d.m5076a(c2887r2, d8);
                        case BuildConfig.VERSION_CODE /* 1 */:
                            float[] fArr3 = C2873d.f9071a;
                            return C2873d.m5078c(c2887r2, d8);
                        case 2:
                            double d9 = c2887r2.f9138b;
                            return d8 >= c2887r2.f9141e ? Math.pow((d9 * d8) + c2887r2.f9139c, c2887r2.f9137a) : d8 * c2887r2.f9140d;
                        case 3:
                            double d10 = c2887r2.f9138b;
                            double d11 = c2887r2.f9139c;
                            double d12 = c2887r2.f9140d;
                            return d8 >= c2887r2.f9141e ? Math.pow((d10 * d8) + d11, c2887r2.f9137a) + c2887r2.f9142f : (d12 * d8) + c2887r2.f9143g;
                        case 4:
                            float[] fArr4 = C2873d.f9071a;
                            return C2873d.m5077b(c2887r2, d8);
                        case 5:
                            float[] fArr5 = C2873d.f9071a;
                            return C2873d.m5079d(c2887r2, d8);
                        case 6:
                            double d13 = c2887r2.f9138b;
                            double d14 = c2887r2.f9139c;
                            double d15 = c2887r2.f9140d;
                            return d8 >= c2887r2.f9141e * d15 ? (Math.pow(d8, 1.0d / c2887r2.f9137a) - d14) / d13 : d8 / d15;
                        default:
                            double d16 = c2887r2.f9138b;
                            double d17 = c2887r2.f9139c;
                            double d18 = c2887r2.f9140d;
                            return d8 >= c2887r2.f9141e * d18 ? (Math.pow(d8 - c2887r2.f9142f, 1.0d / c2887r2.f9137a) - d17) / d16 : (d8 - c2887r2.f9143g) / d18;
                    }
                }
            };
        } else {
            final int i13 = 3;
            interfaceC2878i2 = new InterfaceC2878i() { // from class: p0.o
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p217p0.InterfaceC2878i
                /* JADX INFO: renamed from: b */
                public final double mo601b(double d8) {
                    int i72 = i13;
                    C2887r c2887r2 = c2887r;
                    switch (i72) {
                        case 0:
                            float[] fArr2 = C2873d.f9071a;
                            return C2873d.m5076a(c2887r2, d8);
                        case BuildConfig.VERSION_CODE /* 1 */:
                            float[] fArr3 = C2873d.f9071a;
                            return C2873d.m5078c(c2887r2, d8);
                        case 2:
                            double d9 = c2887r2.f9138b;
                            return d8 >= c2887r2.f9141e ? Math.pow((d9 * d8) + c2887r2.f9139c, c2887r2.f9137a) : d8 * c2887r2.f9140d;
                        case 3:
                            double d10 = c2887r2.f9138b;
                            double d11 = c2887r2.f9139c;
                            double d12 = c2887r2.f9140d;
                            return d8 >= c2887r2.f9141e ? Math.pow((d10 * d8) + d11, c2887r2.f9137a) + c2887r2.f9142f : (d12 * d8) + c2887r2.f9143g;
                        case 4:
                            float[] fArr4 = C2873d.f9071a;
                            return C2873d.m5077b(c2887r2, d8);
                        case 5:
                            float[] fArr5 = C2873d.f9071a;
                            return C2873d.m5079d(c2887r2, d8);
                        case 6:
                            double d13 = c2887r2.f9138b;
                            double d14 = c2887r2.f9139c;
                            double d15 = c2887r2.f9140d;
                            return d8 >= c2887r2.f9141e * d15 ? (Math.pow(d8, 1.0d / c2887r2.f9137a) - d14) / d13 : d8 / d15;
                        default:
                            double d16 = c2887r2.f9138b;
                            double d17 = c2887r2.f9139c;
                            double d18 = c2887r2.f9140d;
                            return d8 >= c2887r2.f9141e * d18 ? (Math.pow(d8 - c2887r2.f9142f, 1.0d / c2887r2.f9137a) - d17) / d16 : (d8 - c2887r2.f9143g) / d18;
                    }
                }
            };
        }
        this(str, fArr, c2888s, null, interfaceC2878i, interfaceC2878i2, 0.0f, 1.0f, c2887r, i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p217p0.AbstractC2872c
    /* JADX INFO: renamed from: a */
    public final float mo5070a(int i5) {
        return this.f9125f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p217p0.AbstractC2872c
    /* JADX INFO: renamed from: b */
    public final float mo5071b(int i5) {
        return this.f9124e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p217p0.AbstractC2872c
    /* JADX INFO: renamed from: c */
    public final boolean mo5072c() {
        return this.f9136q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p217p0.AbstractC2872c
    /* JADX INFO: renamed from: d */
    public final long mo5073d(float f2, float f5, float f6) {
        double d5 = f2;
        C2882m c2882m = this.f9135p;
        float fMo601b = (float) c2882m.mo601b(d5);
        float fMo601b2 = (float) c2882m.mo601b(f5);
        float fMo601b3 = (float) c2882m.mo601b(f6);
        float[] fArr = this.f9128i;
        if (fArr.length < 9) {
            return 0L;
        }
        float f7 = (fArr[6] * fMo601b3) + (fArr[3] * fMo601b2) + (fArr[0] * fMo601b);
        return (((long) Float.floatToRawIntBits((fArr[7] * fMo601b3) + (fArr[4] * fMo601b2) + (fArr[1] * fMo601b))) & 4294967295L) | (Float.floatToRawIntBits(f7) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p217p0.AbstractC2872c
    /* JADX INFO: renamed from: e */
    public final float mo5074e(float f2, float f5, float f6) {
        double d5 = f2;
        C2882m c2882m = this.f9135p;
        float fMo601b = (float) c2882m.mo601b(d5);
        float fMo601b2 = (float) c2882m.mo601b(f5);
        float fMo601b3 = (float) c2882m.mo601b(f6);
        float[] fArr = this.f9128i;
        return (fArr[8] * fMo601b3) + (fArr[5] * fMo601b2) + (fArr[2] * fMo601b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p217p0.AbstractC2872c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2886q.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C2886q c2886q = (C2886q) obj;
        C2887r c2887r = c2886q.f9126g;
        if (Float.compare(c2886q.f9124e, this.f9124e) != 0 || Float.compare(c2886q.f9125f, this.f9125f) != 0 || !AbstractC1665j.m2981a(this.f9123d, c2886q.f9123d) || !Arrays.equals(this.f9127h, c2886q.f9127h)) {
            return false;
        }
        C2887r c2887r2 = this.f9126g;
        if (c2887r2 != null) {
            return AbstractC1665j.m2981a(c2887r2, c2887r);
        }
        if (c2887r == null) {
            return true;
        }
        if (AbstractC1665j.m2981a(this.f9130k, c2886q.f9130k)) {
            return AbstractC1665j.m2981a(this.f9133n, c2886q.f9133n);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p217p0.AbstractC2872c
    /* JADX INFO: renamed from: f */
    public final long mo5075f(float f2, float f5, float f6, float f7, AbstractC2872c abstractC2872c) {
        float[] fArr = this.f9129j;
        float f8 = (fArr[6] * f6) + (fArr[3] * f5) + (fArr[0] * f2);
        float f9 = (fArr[7] * f6) + (fArr[4] * f5) + (fArr[1] * f2);
        float f10 = (fArr[8] * f6) + (fArr[5] * f5) + (fArr[2] * f2);
        C2882m c2882m = this.f9132m;
        return AbstractC2767z.m4932b((float) c2882m.mo601b(f8), (float) c2882m.mo601b(f9), (float) c2882m.mo601b(f10), f7, abstractC2872c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p217p0.AbstractC2872c
    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.f9127h) + ((this.f9123d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f2 = this.f9124e;
        int iFloatToIntBits = (iHashCode + (f2 == 0.0f ? 0 : Float.floatToIntBits(f2))) * 31;
        float f5 = this.f9125f;
        int iFloatToIntBits2 = (iFloatToIntBits + (f5 == 0.0f ? 0 : Float.floatToIntBits(f5))) * 31;
        C2887r c2887r = this.f9126g;
        int iHashCode2 = iFloatToIntBits2 + (c2887r != null ? c2887r.hashCode() : 0);
        if (c2887r == null) {
            return this.f9133n.hashCode() + ((this.f9130k.hashCode() + (iHashCode2 * 31)) * 31);
        }
        return iHashCode2;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:40:0x01e9 */
    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r10v1, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r10v2, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r10v3, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0263 A[EDGE_INSN: B:68:0x0263->B:69:0x0265 BREAK  A[LOOP:1: B:61:0x022b->B:67:0x025c], EDGE_INSN: B:75:0x0263->B:68:0x0263 BREAK  A[LOOP:0: B:46:0x01f4->B:52:0x0211]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2886q(String str, float[] fArr, C2888s c2888s, float[] fArr2, InterfaceC2878i interfaceC2878i, InterfaceC2878i interfaceC2878i2, float f2, float f5, C2887r c2887r, int i5) {
        int i6;
        float f6;
        float f7;
        double d5;
        super(str, AbstractC2871b.f9063a, i5);
        this.f9123d = c2888s;
        this.f9124e = f2;
        this.f9125f = f5;
        this.f9126g = c2887r;
        this.f9130k = interfaceC2878i;
        boolean z5 = 1;
        z5 = 1;
        this.f9131l = new C2885p(this, z5 ? 1 : 0);
        int i7 = 0;
        this.f9132m = new C2882m(this, i7);
        this.f9133n = interfaceC2878i2;
        this.f9134o = new C2885p(this, i7);
        this.f9135p = new C2882m(this, z5 ? 1 : 0);
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f2 < f5) {
            float[] fArr3 = new float[6];
            if (fArr.length == 9) {
                float f8 = fArr[0];
                float f9 = fArr[1];
                float f10 = f8 + f9 + fArr[2];
                fArr3[0] = f8 / f10;
                fArr3[1] = f9 / f10;
                float f11 = fArr[3];
                float f12 = fArr[4];
                float f13 = f11 + f12 + fArr[5];
                fArr3[2] = f11 / f13;
                fArr3[3] = f12 / f13;
                float f14 = fArr[6];
                float f15 = fArr[7];
                float f16 = f14 + f15 + fArr[8];
                fArr3[4] = f14 / f16;
                fArr3[5] = f15 / f16;
            } else {
                System.arraycopy(fArr, 0, fArr3, 0, 6);
            }
            this.f9127h = fArr3;
            if (fArr2 == null) {
                float f17 = fArr3[0];
                float f18 = fArr3[1];
                float f19 = fArr3[2];
                float f20 = fArr3[3];
                float f21 = fArr3[4];
                float f22 = fArr3[5];
                f6 = 1.0f;
                float f23 = c2888s.f9144a;
                i6 = 0;
                float f24 = c2888s.f9145b;
                float f25 = 1;
                float f26 = (f25 - f17) / f18;
                float f27 = (f25 - f19) / f20;
                float f28 = (f25 - f21) / f22;
                float f29 = (f25 - f23) / f24;
                float f30 = f17 / f18;
                float f31 = (f19 / f20) - f30;
                float f32 = (f23 / f24) - f30;
                float f33 = f27 - f26;
                float f34 = (f21 / f22) - f30;
                float f35 = (((f29 - f26) * f31) - (f32 * f33)) / (((f28 - f26) * f31) - (f33 * f34));
                float f36 = (f32 - (f34 * f35)) / f31;
                float f37 = (1.0f - f36) - f35;
                float f38 = f37 / f18;
                float f39 = f36 / f20;
                float f40 = f35 / f22;
                this.f9128i = new float[]{f38 * f17, f37, ((1.0f - f17) - f18) * f38, f39 * f19, f36, ((1.0f - f19) - f20) * f39, f40 * f21, f35, ((1.0f - f21) - f22) * f40};
            } else {
                i6 = 0;
                f6 = 1.0f;
                if (fArr2.length == 9) {
                    this.f9128i = fArr2;
                } else {
                    throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
                }
            }
            this.f9129j = AbstractC2879j.m5086f(this.f9128i);
            float fM5082b = AbstractC2879j.m5082b(fArr3);
            float[] fArr4 = C2873d.f9071a;
            if (fM5082b / AbstractC2879j.m5082b(C2873d.f9072b) > 0.9f) {
                float[] fArr5 = C2873d.f9071a;
                float f41 = fArr3[i6];
                float f42 = fArr5[i6];
                float f43 = fArr3[1];
                float f44 = fArr5[1];
                float f45 = fArr3[2];
                float f46 = fArr5[2];
                float f47 = fArr3[3];
                float f48 = fArr5[3];
                float f49 = fArr3[4];
                float f50 = fArr5[4];
                float f51 = fArr3[5];
                float f52 = fArr5[5];
                f7 = 0.0f;
                float[] fArr6 = new float[6];
                fArr6[i6] = f41 - f42;
                fArr6[1] = f43 - f44;
                fArr6[2] = f45 - f46;
                fArr6[3] = f47 - f48;
                fArr6[4] = f49 - f50;
                fArr6[5] = f51 - f52;
                float f53 = fArr6[i6];
                float f54 = fArr6[1];
                if (((f44 - f52) * f53) - ((f42 - f50) * f54) >= 0.0f && ((f42 - f46) * f54) - ((f44 - f48) * f53) >= 0.0f) {
                    float f55 = fArr6[2];
                    float f56 = fArr6[3];
                    if (((f48 - f44) * f55) - ((f46 - f42) * f56) >= 0.0f && ((f46 - f50) * f56) - ((f48 - f52) * f55) >= 0.0f) {
                        float f57 = fArr6[4];
                        float f58 = fArr6[5];
                        if (((f52 - f48) * f57) - ((f50 - f46) * f58) < 0.0f || ((f50 - f42) * f58) - ((f52 - f44) * f57) < 0.0f) {
                        }
                    }
                }
                if (i5 != 0) {
                    float[] fArr7 = C2873d.f9071a;
                    if (fArr3 == fArr7) {
                        if (!AbstractC2879j.m5084d(c2888s, AbstractC2879j.f9107d) || f2 != f7 || f5 != f6) {
                            z5 = i6;
                            break;
                        }
                        float[] fArr8 = C2873d.f9071a;
                        C2886q c2886q = C2873d.f9075e;
                        for (d5 = 0.0d; d5 <= 1.0d; d5 += 0.00392156862745098d) {
                            if (Math.abs(interfaceC2878i.mo601b(d5) - c2886q.f9130k.mo601b(d5)) > 0.001d || Math.abs(interfaceC2878i2.mo601b(d5) - c2886q.f9133n.mo601b(d5)) > 0.001d) {
                                z5 = i6;
                                break;
                            }
                        }
                    } else {
                        for (int i8 = i6; i8 < 6; i8++) {
                            if (Float.compare(fArr3[i8], fArr7[i8]) != 0 && Math.abs(fArr3[i8] - fArr7[i8]) > 0.001f) {
                                break;
                            }
                        }
                        if (!AbstractC2879j.m5084d(c2888s, AbstractC2879j.f9107d)) {
                            float[] fArr82 = C2873d.f9071a;
                            C2886q c2886q2 = C2873d.f9075e;
                            while (d5 <= 1.0d) {
                            }
                        }
                    }
                }
                this.f9136q = z5;
                return;
            }
            f7 = 0.0f;
            int i9 = (f2 > f7 ? 1 : (f2 == f7 ? 0 : -1));
            if (i5 != 0) {
            }
            this.f9136q = z5;
            return;
        }
        throw new IllegalArgumentException("Invalid range: min=" + f2 + ", max=" + f5 + "; min must be strictly < max");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C2886q(String str, float[] fArr, C2888s c2888s, final double d5, float f2, float f5, int i5) {
        InterfaceC2878i interfaceC2878i;
        InterfaceC2878i interfaceC2878i2 = f9122r;
        if (d5 == 1.0d) {
            interfaceC2878i = interfaceC2878i2;
        } else {
            final int i6 = 0;
            interfaceC2878i = new InterfaceC2878i() { // from class: p0.n
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p217p0.InterfaceC2878i
                /* JADX INFO: renamed from: b */
                public final double mo601b(double d6) {
                    switch (i6) {
                        case 0:
                            if (d6 < 0.0d) {
                                d6 = 0.0d;
                            }
                            return Math.pow(d6, 1.0d / d5);
                        default:
                            if (d6 < 0.0d) {
                                d6 = 0.0d;
                            }
                            return Math.pow(d6, d5);
                    }
                }
            };
        }
        if (d5 != 1.0d) {
            final int i7 = 1;
            interfaceC2878i2 = new InterfaceC2878i() { // from class: p0.n
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p217p0.InterfaceC2878i
                /* JADX INFO: renamed from: b */
                public final double mo601b(double d6) {
                    switch (i7) {
                        case 0:
                            if (d6 < 0.0d) {
                                d6 = 0.0d;
                            }
                            return Math.pow(d6, 1.0d / d5);
                        default:
                            if (d6 < 0.0d) {
                                d6 = 0.0d;
                            }
                            return Math.pow(d6, d5);
                    }
                }
            };
        }
        this(str, fArr, c2888s, null, interfaceC2878i, interfaceC2878i2, f2, f5, new C2887r(d5, 1.0d, 0.0d, 0.0d, 0.0d), i5);
    }
}
