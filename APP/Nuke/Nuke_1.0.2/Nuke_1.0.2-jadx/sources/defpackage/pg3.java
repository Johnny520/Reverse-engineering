package defpackage;

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
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public FloatBuffer p;
    public boolean[] q;
    public int r;
    public int s;
    public int t;
    public long y;
    public final float[] a = new float[16];
    public final float[] b = new float[16];
    public final float[] c = new float[16];
    public final float[] d = new float[16];
    public final float[] e = new float[16];
    public final float[] f = new float[3];
    public float u = 1.0f;
    public float v = 1.0f;
    public float w = 1.0f;
    public float x = 0.3f;
    public float z = -0.25f;
    public float A = 0.2f;
    public float B = 0.72f;
    public float C = 0.56f;
    public float D = 18.0f;
    public float E = -28.0f;
    public float F = 6.0f;
    public float G = 195.0f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(dk dkVar, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13) {
        dkVar.d(f, f2, f3, 0.0f, 0.0f, 0.0f, f13);
        dkVar.d(f4, f5, f6, 0.0f, 0.0f, 0.0f, f13);
        dkVar.d(f7, f8, f9, 0.0f, 0.0f, 0.0f, f13);
        dkVar.d(f, f2, f3, 0.0f, 0.0f, 0.0f, f13);
        dkVar.d(f7, f8, f9, 0.0f, 0.0f, 0.0f, f13);
        dkVar.d(f10, f11, f12, 0.0f, 0.0f, 0.0f, f13);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int b(String str, int i) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] == 1) {
            return iGlCreateShader;
        }
        c80.h(vi0.i("OpenGL shader compilation failed: ", GLES20.glGetShaderInfoLog(iGlCreateShader)));
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean c(int i, int i2) {
        if (i < 0 || i >= 1024 || i2 < 0 || i2 >= 256) {
            return false;
        }
        boolean[] zArr = this.q;
        if (zArr != null) {
            return zArr[(i2 * 1024) + i];
        }
        t11.S("textMask");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        GLES20.glClear(16640);
        if (this.p == null || this.s == 0 || this.t == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        if (this.y != 0) {
            float fC = ci0.C((jNanoTime - r3) / 1.0E9f, 0.0f, 0.05f);
            float f = ((23.0f * fC) + this.D) % 360.0f;
            this.D = f;
            float f2 = ((31.0f * fC) + this.E) % 360.0f;
            this.E = f2;
            float f3 = ((9.0f * fC) + this.F) % 360.0f;
            this.F = f3;
            this.G = ((12.0f * fC) + this.G) % 360.0f;
            this.z = (this.B * fC) + this.z;
            this.A = (this.C * fC) + this.A;
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
            float fAbs = (Math.abs((fSin * fSin3) + (f5 * fCos3)) * 0.05f) + (Math.abs((f4 * fCos3) - (fCos * fSin3)) * this.x) + (Math.abs(fCos2 * fCos3) * this.w);
            float fAbs2 = (Math.abs((f5 * fSin3) - (fSin * fCos3)) * 0.05f) + (Math.abs((fCos * fCos3) + (f4 * fSin3)) * this.x) + (Math.abs(fCos2 * fSin3) * this.w);
            float f6 = this.u;
            float f7 = (-f6) + fAbs;
            float f8 = f6 - fAbs;
            float f9 = this.v;
            float f10 = (-f9) + fAbs2;
            float f11 = f9 - fAbs2;
            if (f7 >= f8) {
                this.z = 0.0f;
            } else {
                float f12 = this.z;
                if (f12 <= f7) {
                    this.z = f7;
                    this.B = Math.abs(this.B);
                } else if (f12 >= f8) {
                    this.z = f8;
                    this.B = -Math.abs(this.B);
                }
            }
            if (f10 >= f11) {
                this.A = 0.0f;
            } else {
                float f13 = this.A;
                if (f13 <= f10) {
                    this.A = f10;
                    this.C = Math.abs(this.C);
                } else if (f13 >= f11) {
                    this.A = f11;
                    this.C = -Math.abs(this.C);
                }
            }
        }
        this.y = jNanoTime;
        float[] fArr = this.c;
        Matrix.setIdentityM(fArr, 0);
        Matrix.translateM(fArr, 0, this.z, this.A, 0.0f);
        Matrix.rotateM(fArr, 0, this.F, 0.0f, 0.0f, 1.0f);
        Matrix.rotateM(fArr, 0, this.E, 0.0f, 1.0f, 0.0f);
        Matrix.rotateM(fArr, 0, this.D, 1.0f, 0.0f, 0.0f);
        float[] fArr2 = this.d;
        Matrix.multiplyMM(fArr2, 0, this.b, 0, fArr, 0);
        float[] fArr3 = this.e;
        Matrix.multiplyMM(fArr3, 0, this.a, 0, fArr2, 0);
        float f14 = ((this.G % 360.0f) + 360.0f) % 360.0f;
        float fAbs3 = (1.0f - Math.abs(((f14 / 60.0f) % 2.0f) - 1.0f)) * 0.86f;
        float[] fArr4 = f14 < 60.0f ? new float[]{0.86f, fAbs3, 0.0f} : f14 < 120.0f ? new float[]{fAbs3, 0.86f, 0.0f} : f14 < 180.0f ? new float[]{0.0f, 0.86f, fAbs3} : f14 < 240.0f ? new float[]{0.0f, fAbs3, 0.86f} : f14 < 300.0f ? new float[]{fAbs3, 0.0f, 0.86f} : new float[]{0.86f, 0.0f, fAbs3};
        float f15 = fArr4[0];
        float f16 = fArr4[1];
        float f17 = fArr4[2];
        float[] fArr5 = this.f;
        fArr5[0] = f15 + 0.13999999f;
        fArr5[1] = f16 + 0.13999999f;
        fArr5[2] = f17 + 0.13999999f;
        GLES20.glUseProgram(this.g);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.h);
        GLES20.glUniform1i(this.o, 0);
        GLES20.glUniformMatrix4fv(this.m, 1, false, fArr3, 0);
        GLES20.glUniform3fv(this.n, 1, fArr5, 0);
        FloatBuffer floatBuffer = this.p;
        if (floatBuffer == null) {
            t11.S("cubeVertices");
            throw null;
        }
        floatBuffer.position(0);
        GLES20.glEnableVertexAttribArray(this.i);
        GLES20.glEnableVertexAttribArray(this.j);
        GLES20.glEnableVertexAttribArray(this.k);
        GLES20.glEnableVertexAttribArray(this.l);
        int i = this.i;
        FloatBuffer floatBuffer2 = this.p;
        if (floatBuffer2 == null) {
            t11.S("cubeVertices");
            throw null;
        }
        GLES20.glVertexAttribPointer(i, 3, 5126, false, 28, (Buffer) floatBuffer2);
        FloatBuffer floatBuffer3 = this.p;
        if (floatBuffer3 == null) {
            t11.S("cubeVertices");
            throw null;
        }
        floatBuffer3.position(3);
        int i2 = this.j;
        FloatBuffer floatBuffer4 = this.p;
        if (floatBuffer4 == null) {
            t11.S("cubeVertices");
            throw null;
        }
        GLES20.glVertexAttribPointer(i2, 2, 5126, false, 28, (Buffer) floatBuffer4);
        FloatBuffer floatBuffer5 = this.p;
        if (floatBuffer5 == null) {
            t11.S("cubeVertices");
            throw null;
        }
        floatBuffer5.position(5);
        int i3 = this.k;
        FloatBuffer floatBuffer6 = this.p;
        if (floatBuffer6 == null) {
            t11.S("cubeVertices");
            throw null;
        }
        GLES20.glVertexAttribPointer(i3, 1, 5126, false, 28, (Buffer) floatBuffer6);
        FloatBuffer floatBuffer7 = this.p;
        if (floatBuffer7 == null) {
            t11.S("cubeVertices");
            throw null;
        }
        floatBuffer7.position(6);
        int i4 = this.l;
        FloatBuffer floatBuffer8 = this.p;
        if (floatBuffer8 == null) {
            t11.S("cubeVertices");
            throw null;
        }
        GLES20.glVertexAttribPointer(i4, 1, 5126, false, 28, (Buffer) floatBuffer8);
        GLES20.glDrawArrays(4, 0, this.r);
        GLES20.glDisableVertexAttribArray(this.i);
        GLES20.glDisableVertexAttribArray(this.j);
        GLES20.glDisableVertexAttribArray(this.k);
        GLES20.glDisableVertexAttribArray(this.l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        float f;
        float f2;
        float f3;
        float f4;
        int i3 = i2;
        this.s = i;
        this.t = i3;
        byte b = 0;
        GLES20.glViewport(0, 0, i, i3);
        float f5 = i;
        if (i3 < 1) {
            i3 = 1;
        }
        float f6 = f5 / i3;
        Matrix.perspectiveM(this.a, 0, 48.0f, f6, 0.1f, 20.0f);
        float fTan = ((float) Math.tan(Math.toRadians(24.0d))) * 5.0f;
        this.v = fTan;
        float f7 = fTan * f6;
        this.u = f7;
        if (this.s == 0 || this.t == 0 || this.q == null) {
            return;
        }
        float fMin = Math.min(f7 * 0.68f, 2.1f);
        this.w = fMin;
        float f8 = fMin / 4.0f;
        this.x = f8;
        float f9 = -fMin;
        float f10 = -f8;
        int i4 = 0;
        for (int i5 = 0; i5 < 256; i5++) {
            for (int i6 = 0; i6 < 1024; i6++) {
                if (c(i6, i5)) {
                    if (!c(i6 - 1, i5)) {
                        i4++;
                    }
                    if (!c(i6 + 1, i5)) {
                        i4++;
                    }
                    if (!c(i6, i5 - 1)) {
                        i4++;
                    }
                    if (!c(i6, i5 + 1)) {
                        i4++;
                    }
                }
            }
        }
        int i7 = ((i4 * 6) + 12) * 7;
        dk dkVar = new dk(b, 15);
        dkVar.j = new float[i7 >= 1 ? i7 : 1];
        dkVar.d(f9, f10, 0.05f, 0.0f, 1.0f, 1.0f, 1.0f);
        dk dkVar2 = dkVar;
        dkVar2.d(fMin, f10, 0.05f, 1.0f, 1.0f, 1.0f, 1.0f);
        dkVar2.d(fMin, f8, 0.05f, 1.0f, 0.0f, 1.0f, 1.0f);
        dkVar2.d(f9, f10, 0.05f, 0.0f, 1.0f, 1.0f, 1.0f);
        dkVar2.d(fMin, f8, 0.05f, 1.0f, 0.0f, 1.0f, 1.0f);
        dkVar2.d(f9, f8, 0.05f, 0.0f, 0.0f, 1.0f, 1.0f);
        float f11 = 0.05f;
        dkVar2.d(fMin, f10, -0.05f, 1.0f, 1.0f, 1.0f, 1.0f);
        dkVar2.d(f9, f10, -0.05f, 0.0f, 1.0f, 1.0f, 1.0f);
        dkVar2.d(f9, f8, -0.05f, 0.0f, 0.0f, 1.0f, 1.0f);
        dkVar2.d(fMin, f10, -0.05f, 1.0f, 1.0f, 1.0f, 1.0f);
        dkVar2.d(f9, f8, -0.05f, 0.0f, 0.0f, 1.0f, 1.0f);
        float f12 = -0.05f;
        dkVar2.d(fMin, f8, -0.05f, 1.0f, 0.0f, 1.0f, 1.0f);
        float f13 = (this.w * 2.0f) / 1024.0f;
        float f14 = (this.x * 2.0f) / 256.0f;
        for (int i8 = 0; i8 < 256; i8++) {
            float f15 = f8 - (i8 * f14);
            float f16 = f15 - f14;
            int i9 = 0;
            while (i9 < 1024) {
                if (c(i9, i8)) {
                    float f17 = (i9 * f13) + f9;
                    float f18 = f17 + f13;
                    if (c(i9 - 1, i8)) {
                        f = f12;
                    } else {
                        dk dkVar3 = dkVar2;
                        float f19 = f11;
                        float f20 = f12;
                        a(dkVar3, f17, f16, f20, f17, f16, f19, f17, f15, f11, f17, f15, f12, 0.46f);
                        f = f20;
                        f11 = f19;
                        dkVar2 = dkVar3;
                    }
                    if (c(i9 + 1, i8)) {
                        f3 = f18;
                    } else {
                        a(dkVar2, f18, f16, f11, f18, f16, f, f18, f15, f, f18, f15, f11, 0.46f);
                        f3 = f18;
                    }
                    float f21 = f16;
                    if (c(i9, i8 - 1)) {
                        f4 = f17;
                        f2 = f15;
                    } else {
                        float f22 = f;
                        float f23 = f15;
                        f4 = f17;
                        a(dkVar2, f4, f23, f11, f3, f15, f11, f3, f15, f22, f17, f23, f22, 0.58f);
                        f2 = f23;
                        f = f22;
                    }
                    if (c(i9, i8 + 1)) {
                        f16 = f21;
                    } else {
                        float f24 = f;
                        float f25 = f11;
                        f16 = f21;
                        a(dkVar2, f4, f16, f24, f3, f21, f, f3, f21, f25, f4, f21, f11, 0.58f);
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
        float[] fArrCopyOf = Arrays.copyOf((float[]) dkVar2.j, dkVar2.i);
        this.r = fArrCopyOf.length / 7;
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(fArrCopyOf.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArrCopyOf);
        floatBufferAsFloatBuffer.position(0);
        this.p = floatBufferAsFloatBuffer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glEnable(2884);
        GLES20.glCullFace(1029);
        GLES20.glEnable(2929);
        GLES20.glDepthFunc(515);
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        int iB = b("\n    attribute vec3 aPosition;\n    attribute vec2 aTextureCoordinate;\n    attribute float aCap;\n    attribute float aShade;\n    uniform mat4 uModelViewProjection;\n    varying vec2 vTextureCoordinate;\n    varying float vCap;\n    varying float vShade;\n\n    void main() {\n        vTextureCoordinate = aTextureCoordinate;\n        vCap = aCap;\n        vShade = aShade;\n        gl_Position = uModelViewProjection * vec4(aPosition, 1.0);\n    }\n", 35633);
        int iB2 = b("\n    precision mediump float;\n    uniform sampler2D uTexture;\n    uniform vec3 uColor;\n    varying vec2 vTextureCoordinate;\n    varying float vCap;\n    varying float vShade;\n\n    void main() {\n        float capAlpha = texture2D(uTexture, vTextureCoordinate).a;\n        float alpha = mix(1.0, capAlpha, vCap);\n        if (alpha < 0.04) discard;\n        gl_FragColor = vec4(uColor * vShade, smoothstep(0.04, 0.72, alpha));\n    }\n", 35632);
        int iGlCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(iGlCreateProgram, iB);
        GLES20.glAttachShader(iGlCreateProgram, iB2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            c80.h(vi0.i("OpenGL program link failed: ", GLES20.glGetProgramInfoLog(iGlCreateProgram)));
            return;
        }
        GLES20.glDeleteShader(iB);
        GLES20.glDeleteShader(iB2);
        this.g = iGlCreateProgram;
        this.i = GLES20.glGetAttribLocation(iGlCreateProgram, "aPosition");
        this.j = GLES20.glGetAttribLocation(this.g, "aTextureCoordinate");
        this.k = GLES20.glGetAttribLocation(this.g, "aCap");
        this.l = GLES20.glGetAttribLocation(this.g, "aShade");
        this.m = GLES20.glGetUniformLocation(this.g, "uModelViewProjection");
        this.n = GLES20.glGetUniformLocation(this.g, "uColor");
        this.o = GLES20.glGetUniformLocation(this.g, "uTexture");
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
        this.q = zArr;
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
        this.h = iArr3[0];
        Matrix.setLookAtM(this.b, 0, 0.0f, 0.0f, 5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
    }
}
