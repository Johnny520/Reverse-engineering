package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Arrays;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class pg3 implements GLSurfaceView.Renderer {

    /* JADX INFO: renamed from: g */
    public int f8325g;

    /* JADX INFO: renamed from: h */
    public int f8326h;

    /* JADX INFO: renamed from: i */
    public int f8327i;

    /* JADX INFO: renamed from: j */
    public int f8328j;

    /* JADX INFO: renamed from: k */
    public int f8329k;

    /* JADX INFO: renamed from: l */
    public int f8330l;

    /* JADX INFO: renamed from: m */
    public int f8331m;

    /* JADX INFO: renamed from: n */
    public int f8332n;

    /* JADX INFO: renamed from: o */
    public int f8333o;

    /* JADX INFO: renamed from: p */
    public FloatBuffer f8334p;

    /* JADX INFO: renamed from: q */
    public boolean[] f8335q;

    /* JADX INFO: renamed from: r */
    public int f8336r;

    /* JADX INFO: renamed from: s */
    public int f8337s;

    /* JADX INFO: renamed from: t */
    public int f8338t;

    /* JADX INFO: renamed from: y */
    public long f8343y;

    /* JADX INFO: renamed from: a */
    public final float[] f8319a = new float[16];

    /* JADX INFO: renamed from: b */
    public final float[] f8320b = new float[16];

    /* JADX INFO: renamed from: c */
    public final float[] f8321c = new float[16];

    /* JADX INFO: renamed from: d */
    public final float[] f8322d = new float[16];

    /* JADX INFO: renamed from: e */
    public final float[] f8323e = new float[16];

    /* JADX INFO: renamed from: f */
    public final float[] f8324f = new float[3];

    /* JADX INFO: renamed from: u */
    public float f8339u = 1.0f;

    /* JADX INFO: renamed from: v */
    public float f8340v = 1.0f;

    /* JADX INFO: renamed from: w */
    public float f8341w = 1.0f;

    /* JADX INFO: renamed from: x */
    public float f8342x = 0.3f;

    /* JADX INFO: renamed from: z */
    public float f8344z = -0.25f;

    /* JADX INFO: renamed from: A */
    public float f8312A = 0.2f;

    /* JADX INFO: renamed from: B */
    public float f8313B = 0.72f;

    /* JADX INFO: renamed from: C */
    public float f8314C = 0.56f;

    /* JADX INFO: renamed from: D */
    public float f8315D = 18.0f;

    /* JADX INFO: renamed from: E */
    public float f8316E = -28.0f;

    /* JADX INFO: renamed from: F */
    public float f8317F = 6.0f;

    /* JADX INFO: renamed from: G */
    public float f8318G = 195.0f;

    /* JADX INFO: renamed from: a */
    public static void m3863a(C0133dk c0133dk, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13) {
        c0133dk.m1033d(f, f2, f3, 0.0f, 0.0f, 0.0f, f13);
        c0133dk.m1033d(f4, f5, f6, 0.0f, 0.0f, 0.0f, f13);
        c0133dk.m1033d(f7, f8, f9, 0.0f, 0.0f, 0.0f, f13);
        c0133dk.m1033d(f, f2, f3, 0.0f, 0.0f, 0.0f, f13);
        c0133dk.m1033d(f7, f8, f9, 0.0f, 0.0f, 0.0f, f13);
        c0133dk.m1033d(f10, f11, f12, 0.0f, 0.0f, 0.0f, f13);
    }

    /* JADX INFO: renamed from: b */
    public static int m3864b(String str, int i) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] == 1) {
            return iGlCreateShader;
        }
        c80.m665h(vi0.m5690i("OpenGL shader compilation failed: ", GLES20.glGetShaderInfoLog(iGlCreateShader)));
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m3865c(int i, int i2) {
        if (i < 0 || i >= 1024 || i2 < 0 || i2 >= 256) {
            return false;
        }
        boolean[] zArr = this.f8335q;
        if (zArr != null) {
            return zArr[(i2 * 1024) + i];
        }
        t11.m5067S("textMask");
        throw null;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        GLES20.glClear(16640);
        if (this.f8334p == null || this.f8337s == 0 || this.f8338t == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        if (this.f8343y != 0) {
            float fM778C = ci0.m778C((jNanoTime - r3) / 1.0E9f, 0.0f, 0.05f);
            float f = ((23.0f * fM778C) + this.f8315D) % 360.0f;
            this.f8315D = f;
            float f2 = ((31.0f * fM778C) + this.f8316E) % 360.0f;
            this.f8316E = f2;
            float f3 = ((9.0f * fM778C) + this.f8317F) % 360.0f;
            this.f8317F = f3;
            this.f8318G = ((12.0f * fM778C) + this.f8318G) % 360.0f;
            this.f8344z = (this.f8313B * fM778C) + this.f8344z;
            this.f8312A = (this.f8314C * fM778C) + this.f8312A;
            double d = f;
            float fSin = (float) Math.sin(Math.toRadians(d));
            float fCos = (float) Math.cos(Math.toRadians(d));
            double d2 = f2;
            float fSin2 = (float) Math.sin(Math.toRadians(d2));
            float fCos2 = (float) Math.cos(Math.toRadians(d2));
            double d3 = f3;
            float fSin3 = (float) Math.sin(Math.toRadians(d3));
            float fCos3 = (float) Math.cos(Math.toRadians(d3));
            float f4 = fSin * fSin2;
            float f5 = fSin2 * fCos;
            float fAbs = (Math.abs((fSin * fSin3) + (f5 * fCos3)) * 0.05f) + (Math.abs((f4 * fCos3) - (fCos * fSin3)) * this.f8342x) + (Math.abs(fCos2 * fCos3) * this.f8341w);
            float fAbs2 = (Math.abs((f5 * fSin3) - (fSin * fCos3)) * 0.05f) + (Math.abs((fCos * fCos3) + (f4 * fSin3)) * this.f8342x) + (Math.abs(fCos2 * fSin3) * this.f8341w);
            float f6 = this.f8339u;
            float f7 = (-f6) + fAbs;
            float f8 = f6 - fAbs;
            float f9 = this.f8340v;
            float f10 = (-f9) + fAbs2;
            float f11 = f9 - fAbs2;
            if (f7 >= f8) {
                this.f8344z = 0.0f;
            } else {
                float f12 = this.f8344z;
                if (f12 <= f7) {
                    this.f8344z = f7;
                    this.f8313B = Math.abs(this.f8313B);
                } else if (f12 >= f8) {
                    this.f8344z = f8;
                    this.f8313B = -Math.abs(this.f8313B);
                }
            }
            if (f10 >= f11) {
                this.f8312A = 0.0f;
            } else {
                float f13 = this.f8312A;
                if (f13 <= f10) {
                    this.f8312A = f10;
                    this.f8314C = Math.abs(this.f8314C);
                } else if (f13 >= f11) {
                    this.f8312A = f11;
                    this.f8314C = -Math.abs(this.f8314C);
                }
            }
        }
        this.f8343y = jNanoTime;
        float[] fArr = this.f8321c;
        Matrix.setIdentityM(fArr, 0);
        Matrix.translateM(fArr, 0, this.f8344z, this.f8312A, 0.0f);
        Matrix.rotateM(fArr, 0, this.f8317F, 0.0f, 0.0f, 1.0f);
        Matrix.rotateM(fArr, 0, this.f8316E, 0.0f, 1.0f, 0.0f);
        Matrix.rotateM(fArr, 0, this.f8315D, 1.0f, 0.0f, 0.0f);
        float[] fArr2 = this.f8322d;
        Matrix.multiplyMM(fArr2, 0, this.f8320b, 0, fArr, 0);
        float[] fArr3 = this.f8323e;
        Matrix.multiplyMM(fArr3, 0, this.f8319a, 0, fArr2, 0);
        float f14 = ((this.f8318G % 360.0f) + 360.0f) % 360.0f;
        float fAbs3 = (1.0f - Math.abs(((f14 / 60.0f) % 2.0f) - 1.0f)) * 0.86f;
        float[] fArr4 = f14 < 60.0f ? new float[]{0.86f, fAbs3, 0.0f} : f14 < 120.0f ? new float[]{fAbs3, 0.86f, 0.0f} : f14 < 180.0f ? new float[]{0.0f, 0.86f, fAbs3} : f14 < 240.0f ? new float[]{0.0f, fAbs3, 0.86f} : f14 < 300.0f ? new float[]{fAbs3, 0.0f, 0.86f} : new float[]{0.86f, 0.0f, fAbs3};
        float f15 = fArr4[0];
        float f16 = fArr4[1];
        float f17 = fArr4[2];
        float[] fArr5 = this.f8324f;
        fArr5[0] = f15 + 0.13999999f;
        fArr5[1] = f16 + 0.13999999f;
        fArr5[2] = f17 + 0.13999999f;
        GLES20.glUseProgram(this.f8325g);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f8326h);
        GLES20.glUniform1i(this.f8333o, 0);
        GLES20.glUniformMatrix4fv(this.f8331m, 1, false, fArr3, 0);
        GLES20.glUniform3fv(this.f8332n, 1, fArr5, 0);
        FloatBuffer floatBuffer = this.f8334p;
        if (floatBuffer == null) {
            t11.m5067S("cubeVertices");
            throw null;
        }
        floatBuffer.position(0);
        GLES20.glEnableVertexAttribArray(this.f8327i);
        GLES20.glEnableVertexAttribArray(this.f8328j);
        GLES20.glEnableVertexAttribArray(this.f8329k);
        GLES20.glEnableVertexAttribArray(this.f8330l);
        int i = this.f8327i;
        FloatBuffer floatBuffer2 = this.f8334p;
        if (floatBuffer2 == null) {
            t11.m5067S("cubeVertices");
            throw null;
        }
        GLES20.glVertexAttribPointer(i, 3, 5126, false, 28, (Buffer) floatBuffer2);
        FloatBuffer floatBuffer3 = this.f8334p;
        if (floatBuffer3 == null) {
            t11.m5067S("cubeVertices");
            throw null;
        }
        floatBuffer3.position(3);
        int i2 = this.f8328j;
        FloatBuffer floatBuffer4 = this.f8334p;
        if (floatBuffer4 == null) {
            t11.m5067S("cubeVertices");
            throw null;
        }
        GLES20.glVertexAttribPointer(i2, 2, 5126, false, 28, (Buffer) floatBuffer4);
        FloatBuffer floatBuffer5 = this.f8334p;
        if (floatBuffer5 == null) {
            t11.m5067S("cubeVertices");
            throw null;
        }
        floatBuffer5.position(5);
        int i3 = this.f8329k;
        FloatBuffer floatBuffer6 = this.f8334p;
        if (floatBuffer6 == null) {
            t11.m5067S("cubeVertices");
            throw null;
        }
        GLES20.glVertexAttribPointer(i3, 1, 5126, false, 28, (Buffer) floatBuffer6);
        FloatBuffer floatBuffer7 = this.f8334p;
        if (floatBuffer7 == null) {
            t11.m5067S("cubeVertices");
            throw null;
        }
        floatBuffer7.position(6);
        int i4 = this.f8330l;
        FloatBuffer floatBuffer8 = this.f8334p;
        if (floatBuffer8 == null) {
            t11.m5067S("cubeVertices");
            throw null;
        }
        GLES20.glVertexAttribPointer(i4, 1, 5126, false, 28, (Buffer) floatBuffer8);
        GLES20.glDrawArrays(4, 0, this.f8336r);
        GLES20.glDisableVertexAttribArray(this.f8327i);
        GLES20.glDisableVertexAttribArray(this.f8328j);
        GLES20.glDisableVertexAttribArray(this.f8329k);
        GLES20.glDisableVertexAttribArray(this.f8330l);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        float f;
        float f2;
        float f3;
        float f4;
        int i3 = i2;
        this.f8337s = i;
        this.f8338t = i3;
        byte b = 0;
        GLES20.glViewport(0, 0, i, i3);
        float f5 = i;
        if (i3 < 1) {
            i3 = 1;
        }
        float f6 = f5 / i3;
        Matrix.perspectiveM(this.f8319a, 0, 48.0f, f6, 0.1f, 20.0f);
        float fTan = ((float) Math.tan(Math.toRadians(24.0d))) * 5.0f;
        this.f8340v = fTan;
        float f7 = fTan * f6;
        this.f8339u = f7;
        if (this.f8337s == 0 || this.f8338t == 0 || this.f8335q == null) {
            return;
        }
        float fMin = Math.min(f7 * 0.68f, 2.1f);
        this.f8341w = fMin;
        float f8 = fMin / 4.0f;
        this.f8342x = f8;
        float f9 = -fMin;
        float f10 = -f8;
        int i4 = 0;
        for (int i5 = 0; i5 < 256; i5++) {
            for (int i6 = 0; i6 < 1024; i6++) {
                if (m3865c(i6, i5)) {
                    if (!m3865c(i6 - 1, i5)) {
                        i4++;
                    }
                    if (!m3865c(i6 + 1, i5)) {
                        i4++;
                    }
                    if (!m3865c(i6, i5 - 1)) {
                        i4++;
                    }
                    if (!m3865c(i6, i5 + 1)) {
                        i4++;
                    }
                }
            }
        }
        int i7 = ((i4 * 6) + 12) * 7;
        C0133dk c0133dk = new C0133dk(b, 15);
        c0133dk.f2082j = new float[i7 >= 1 ? i7 : 1];
        c0133dk.m1033d(f9, f10, 0.05f, 0.0f, 1.0f, 1.0f, 1.0f);
        C0133dk c0133dk2 = c0133dk;
        c0133dk2.m1033d(fMin, f10, 0.05f, 1.0f, 1.0f, 1.0f, 1.0f);
        c0133dk2.m1033d(fMin, f8, 0.05f, 1.0f, 0.0f, 1.0f, 1.0f);
        c0133dk2.m1033d(f9, f10, 0.05f, 0.0f, 1.0f, 1.0f, 1.0f);
        c0133dk2.m1033d(fMin, f8, 0.05f, 1.0f, 0.0f, 1.0f, 1.0f);
        c0133dk2.m1033d(f9, f8, 0.05f, 0.0f, 0.0f, 1.0f, 1.0f);
        float f11 = 0.05f;
        c0133dk2.m1033d(fMin, f10, -0.05f, 1.0f, 1.0f, 1.0f, 1.0f);
        c0133dk2.m1033d(f9, f10, -0.05f, 0.0f, 1.0f, 1.0f, 1.0f);
        c0133dk2.m1033d(f9, f8, -0.05f, 0.0f, 0.0f, 1.0f, 1.0f);
        c0133dk2.m1033d(fMin, f10, -0.05f, 1.0f, 1.0f, 1.0f, 1.0f);
        c0133dk2.m1033d(f9, f8, -0.05f, 0.0f, 0.0f, 1.0f, 1.0f);
        float f12 = -0.05f;
        c0133dk2.m1033d(fMin, f8, -0.05f, 1.0f, 0.0f, 1.0f, 1.0f);
        float f13 = (this.f8341w * 2.0f) / 1024.0f;
        float f14 = (this.f8342x * 2.0f) / 256.0f;
        for (int i8 = 0; i8 < 256; i8++) {
            float f15 = f8 - (i8 * f14);
            float f16 = f15 - f14;
            int i9 = 0;
            while (i9 < 1024) {
                if (m3865c(i9, i8)) {
                    float f17 = (i9 * f13) + f9;
                    float f18 = f17 + f13;
                    if (m3865c(i9 - 1, i8)) {
                        f = f12;
                    } else {
                        C0133dk c0133dk3 = c0133dk2;
                        float f19 = f11;
                        float f20 = f12;
                        m3863a(c0133dk3, f17, f16, f20, f17, f16, f19, f17, f15, f11, f17, f15, f12, 0.46f);
                        f = f20;
                        f11 = f19;
                        c0133dk2 = c0133dk3;
                    }
                    if (m3865c(i9 + 1, i8)) {
                        f3 = f18;
                    } else {
                        m3863a(c0133dk2, f18, f16, f11, f18, f16, f, f18, f15, f, f18, f15, f11, 0.46f);
                        f3 = f18;
                    }
                    float f21 = f16;
                    if (m3865c(i9, i8 - 1)) {
                        f4 = f17;
                        f2 = f15;
                    } else {
                        float f22 = f;
                        float f23 = f15;
                        f4 = f17;
                        m3863a(c0133dk2, f4, f23, f11, f3, f15, f11, f3, f15, f22, f17, f23, f22, 0.58f);
                        f2 = f23;
                        f = f22;
                    }
                    if (m3865c(i9, i8 + 1)) {
                        f16 = f21;
                    } else {
                        float f24 = f;
                        float f25 = f11;
                        f16 = f21;
                        m3863a(c0133dk2, f4, f16, f24, f3, f21, f, f3, f21, f25, f4, f21, f11, 0.58f);
                        f = f24;
                        f11 = f25;
                    }
                } else {
                    f = f12;
                    f2 = f15;
                }
                i9++;
                f15 = f2;
                f12 = f;
            }
        }
        float[] fArrCopyOf = Arrays.copyOf((float[]) c0133dk2.f2082j, c0133dk2.f2081i);
        this.f8336r = fArrCopyOf.length / 7;
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(fArrCopyOf.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArrCopyOf);
        floatBufferAsFloatBuffer.position(0);
        this.f8334p = floatBufferAsFloatBuffer;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glEnable(2884);
        GLES20.glCullFace(1029);
        GLES20.glEnable(2929);
        GLES20.glDepthFunc(515);
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        int iM3864b = m3864b("\n    attribute vec3 aPosition;\n    attribute vec2 aTextureCoordinate;\n    attribute float aCap;\n    attribute float aShade;\n    uniform mat4 uModelViewProjection;\n    varying vec2 vTextureCoordinate;\n    varying float vCap;\n    varying float vShade;\n\n    void main() {\n        vTextureCoordinate = aTextureCoordinate;\n        vCap = aCap;\n        vShade = aShade;\n        gl_Position = uModelViewProjection * vec4(aPosition, 1.0);\n    }\n", 35633);
        int iM3864b2 = m3864b("\n    precision mediump float;\n    uniform sampler2D uTexture;\n    uniform vec3 uColor;\n    varying vec2 vTextureCoordinate;\n    varying float vCap;\n    varying float vShade;\n\n    void main() {\n        float capAlpha = texture2D(uTexture, vTextureCoordinate).a;\n        float alpha = mix(1.0, capAlpha, vCap);\n        if (alpha < 0.04) discard;\n        gl_FragColor = vec4(uColor * vShade, smoothstep(0.04, 0.72, alpha));\n    }\n", 35632);
        int iGlCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(iGlCreateProgram, iM3864b);
        GLES20.glAttachShader(iGlCreateProgram, iM3864b2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            c80.m665h(vi0.m5690i("OpenGL program link failed: ", GLES20.glGetProgramInfoLog(iGlCreateProgram)));
            return;
        }
        GLES20.glDeleteShader(iM3864b);
        GLES20.glDeleteShader(iM3864b2);
        this.f8325g = iGlCreateProgram;
        this.f8327i = GLES20.glGetAttribLocation(iGlCreateProgram, "aPosition");
        this.f8328j = GLES20.glGetAttribLocation(this.f8325g, "aTextureCoordinate");
        this.f8329k = GLES20.glGetAttribLocation(this.f8325g, "aCap");
        this.f8330l = GLES20.glGetAttribLocation(this.f8325g, "aShade");
        this.f8331m = GLES20.glGetUniformLocation(this.f8325g, "uModelViewProjection");
        this.f8332n = GLES20.glGetUniformLocation(this.f8325g, "uColor");
        this.f8333o = GLES20.glGetUniformLocation(this.f8325g, "uTexture");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1024, 256, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.getClass();
        Paint paint = new Paint(1);
        paint.setColor(-1);
        paint.setTextSize(180.0f);
        paint.setTypeface(Typeface.create(Typeface.SANS_SERIF, 1));
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(1.0f);
        float fMeasureText = paint.measureText("Hello World!");
        if (fMeasureText > 976.0f) {
            paint.setTextSize((976.0f / fMeasureText) * paint.getTextSize());
        }
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        canvas.drawText("Hello World!", bitmapCreateBitmap.getWidth() / 2.0f, (bitmapCreateBitmap.getHeight() / 2.0f) - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f), paint);
        int[] iArr2 = new int[262144];
        bitmapCreateBitmap.getPixels(iArr2, 0, 1024, 0, 0, 1024, 256);
        boolean[] zArr = new boolean[262144];
        for (int i = 0; i < 262144; i++) {
            zArr[i] = (iArr2[i] >>> 24) >= 96;
        }
        this.f8335q = zArr;
        int[] iArr3 = new int[1];
        GLES20.glGenTextures(1, iArr3, 0);
        GLES20.glBindTexture(3553, iArr3[0]);
        GLES20.glTexParameteri(3553, 10241, 9987);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLUtils.texImage2D(3553, 0, bitmapCreateBitmap, 0);
        GLES20.glGenerateMipmap(3553);
        bitmapCreateBitmap.recycle();
        this.f8326h = iArr3[0];
        Matrix.setLookAtM(this.f8320b, 0, 0.0f, 0.0f, 5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
    }
}
