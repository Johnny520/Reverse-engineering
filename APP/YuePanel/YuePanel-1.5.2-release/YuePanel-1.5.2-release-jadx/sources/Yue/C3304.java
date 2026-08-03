package Yue;

import Yue.C6898;
import Yue.C7124;
import Yue.InterfaceC7144;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۡۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public final class C3304 {

    /* JADX INFO: renamed from: ۥ۟ */
    public static final String f201 = "AppCompatDrawableManag";

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final boolean f5189 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final PorterDuff.Mode f5190 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static C3304 f5191;

    /* JADX INFO: renamed from: ۥ */
    public C7124 f202;

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۡۡ$ۥ */
    public class C0101 implements C7124.InterfaceC7128 {

        /* JADX INFO: renamed from: ۥ */
        public final int[] f203 = {C6898.C6902.f18874, C6898.C6902.f18872, C6898.C6902.f2446};

        /* JADX INFO: renamed from: ۥ۟ */
        public final int[] f204 = {C6898.C6902.f18822, C6898.C6902.f18857, C6898.C6902.f18829, C6898.C6902.f18824, C6898.C6902.f18825, C6898.C6902.f18828, C6898.C6902.f18827};

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int[] f5192 = {C6898.C6902.f18871, C6898.C6902.f18873, C6898.C6902.f18815, C6898.C6902.f18867, C6898.C6902.f18868, C6898.C6902.f18869, C6898.C6902.f18870};

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final int[] f5193 = {C6898.C6902.f18847, C6898.C6902.f18813, C6898.C6902.f18846};

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final int[] f5194 = {C6898.C6902.f18865, C6898.C6902.f18875};

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final int[] f5195 = {C6898.C6902.f18801, C6898.C6902.f18807, C6898.C6902.f18802, C6898.C6902.f18808};

        /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0066 A[RETURN] */
        @Override // Yue.C7124.InterfaceC7128
        /* JADX INFO: renamed from: ۥ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean mo369(@InterfaceC6391 Context context, int i, @InterfaceC6391 Drawable drawable) {
            PorterDuff.Mode mode;
            int i2;
            boolean z;
            int iRound;
            PorterDuff.Mode mode2 = C3304.f5190;
            if (m6754(this.f203, i)) {
                i2 = C6898.C1110.f18435;
            } else if (m6754(this.f5192, i)) {
                i2 = C6898.C1110.f18433;
            } else {
                if (m6754(this.f5193, i)) {
                    mode2 = PorterDuff.Mode.MULTIPLY;
                } else {
                    if (i == C6898.C6902.f18835) {
                        z = true;
                        iRound = Math.round(40.8f);
                        i2 = 16842800;
                        mode = mode2;
                        if (z) {
                            return false;
                        }
                        Drawable drawableMutate = drawable.mutate();
                        drawableMutate.setColorFilter(C3304.m6742(C7772.m24707(context, i2), mode));
                        if (iRound != -1) {
                            drawableMutate.setAlpha(iRound);
                        }
                        return true;
                    }
                    if (i != C6898.C6902.f18817) {
                        mode = mode2;
                        i2 = 0;
                        z = false;
                        iRound = -1;
                        if (z) {
                        }
                    }
                }
                mode = mode2;
                iRound = -1;
                i2 = 16842801;
                z = true;
                if (z) {
                }
            }
            mode = mode2;
            z = true;
            iRound = -1;
            if (z) {
            }
        }

        @Override // Yue.C7124.InterfaceC7128
        /* JADX INFO: renamed from: ۥ۟ */
        public PorterDuff.Mode mo370(int i) {
            if (i == C6898.C6902.f18863) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // Yue.C7124.InterfaceC7128
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public ColorStateList mo6751(@InterfaceC6391 Context context, int i) {
            if (i == C6898.C6902.f18818) {
                return C3323.m395(context, C6898.C6900.f18642);
            }
            if (i == C6898.C6902.f18864) {
                return C3323.m395(context, C6898.C6900.f18645);
            }
            if (i == C6898.C6902.f18863) {
                return m6759(context);
            }
            if (i == C6898.C6902.f18806) {
                return m6758(context);
            }
            if (i == C6898.C6902.f18800) {
                return m6755(context);
            }
            if (i == C6898.C6902.f18805) {
                return m6757(context);
            }
            if (i == C6898.C6902.f18859 || i == C6898.C6902.f18860) {
                return C3323.m395(context, C6898.C6900.f18644);
            }
            if (m6754(this.f204, i)) {
                return C7772.m24709(context, C6898.C1110.f18435);
            }
            if (m6754(this.f5194, i)) {
                return C3323.m395(context, C6898.C6900.f18641);
            }
            if (m6754(this.f5195, i)) {
                return C3323.m395(context, C6898.C6900.f18640);
            }
            if (i == C6898.C6902.f18856) {
                return C3323.m395(context, C6898.C6900.f18643);
            }
            return null;
        }

        @Override // Yue.C7124.InterfaceC7128
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public boolean mo6752(@InterfaceC6391 Context context, int i, @InterfaceC6391 Drawable drawable) {
            if (i == C6898.C6902.f18858) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                m6761(layerDrawable.findDrawableByLayerId(R.id.background), C7772.m24707(context, C6898.C1110.f18435), C3304.f5190);
                m6761(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), C7772.m24707(context, C6898.C1110.f18435), C3304.f5190);
                m6761(layerDrawable.findDrawableByLayerId(R.id.progress), C7772.m24707(context, C6898.C1110.f18433), C3304.f5190);
                return true;
            }
            if (i != C6898.C6902.f18849 && i != C6898.C6902.f18848 && i != C6898.C6902.f18850) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            m6761(layerDrawable2.findDrawableByLayerId(R.id.background), C7772.m24706(context, C6898.C1110.f18435), C3304.f5190);
            m6761(layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress), C7772.m24707(context, C6898.C1110.f18433), C3304.f5190);
            m6761(layerDrawable2.findDrawableByLayerId(R.id.progress), C7772.m24707(context, C6898.C1110.f18433), C3304.f5190);
            return true;
        }

        @Override // Yue.C7124.InterfaceC7128
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public Drawable mo6753(@InterfaceC6391 C7124 c7124, @InterfaceC6391 Context context, int i) {
            if (i == C6898.C6902.f18814) {
                return new LayerDrawable(new Drawable[]{c7124.m22257(context, C6898.C6902.f18813), c7124.m22257(context, C6898.C6902.f18815)});
            }
            if (i == C6898.C6902.f18849) {
                return m6760(c7124, context, C6898.C6901.f18761);
            }
            if (i == C6898.C6902.f18848) {
                return m6760(c7124, context, C6898.C6901.f18762);
            }
            if (i == C6898.C6902.f18850) {
                return m6760(c7124, context, C6898.C6901.f18763);
            }
            return null;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final boolean m6754(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final ColorStateList m6755(@InterfaceC6391 Context context) {
            return m6756(context, 0);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final ColorStateList m6756(@InterfaceC6391 Context context, @InterfaceC3897 int i) {
            int iM24707 = C7772.m24707(context, C6898.C1110.f18434);
            return new ColorStateList(new int[][]{C7772.f23305, C7772.f23308, C7772.f23306, C7772.f23312}, new int[]{C7772.m24706(context, C6898.C1110.f18432), C3913.m11165(iM24707, i), C3913.m11165(iM24707, i), i});
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final ColorStateList m6757(@InterfaceC6391 Context context) {
            return m6756(context, C7772.m24707(context, C6898.C1110.f18430));
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final ColorStateList m6758(@InterfaceC6391 Context context) {
            return m6756(context, C7772.m24707(context, C6898.C1110.f18432));
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public final ColorStateList m6759(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList colorStateListM24709 = C7772.m24709(context, C6898.C1110.f18439);
            if (colorStateListM24709 == null || !colorStateListM24709.isStateful()) {
                iArr[0] = C7772.f23305;
                iArr2[0] = C7772.m24706(context, C6898.C1110.f18439);
                iArr[1] = C7772.f23309;
                iArr2[1] = C7772.m24707(context, C6898.C1110.f18433);
                iArr[2] = C7772.f23312;
                iArr2[2] = C7772.m24707(context, C6898.C1110.f18439);
            } else {
                int[] iArr3 = C7772.f23305;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListM24709.getColorForState(iArr3, 0);
                iArr[1] = C7772.f23309;
                iArr2[1] = C7772.m24707(context, C6898.C1110.f18433);
                iArr[2] = C7772.f23312;
                iArr2[2] = colorStateListM24709.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public final LayerDrawable m6760(@InterfaceC6391 C7124 c7124, @InterfaceC6391 Context context, @InterfaceC4398 int i) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
            Drawable drawableM22257 = c7124.m22257(context, C6898.C6902.f18861);
            Drawable drawableM222572 = c7124.m22257(context, C6898.C6902.f18862);
            if ((drawableM22257 instanceof BitmapDrawable) && drawableM22257.getIntrinsicWidth() == dimensionPixelSize && drawableM22257.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawableM22257;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableM22257.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableM22257.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawableM222572 instanceof BitmapDrawable) && drawableM222572.getIntrinsicWidth() == dimensionPixelSize && drawableM222572.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawableM222572;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawableM222572.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableM222572.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public final void m6761(Drawable drawable, int i, PorterDuff.Mode mode) {
            Drawable drawableMutate = drawable.mutate();
            if (mode == null) {
                mode = C3304.f5190;
            }
            drawableMutate.setColorFilter(C3304.m6742(i, mode));
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static synchronized C3304 m368() {
        try {
            if (f5191 == null) {
                m6743();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f5191;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static synchronized PorterDuffColorFilter m6742(int i, PorterDuff.Mode mode) {
        return C7124.m22249(i, mode);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static synchronized void m6743() {
        if (f5191 == null) {
            C3304 c3304 = new C3304();
            f5191 = c3304;
            c3304.f202 = C7124.m22248();
            f5191.f202.m22265(new C0101());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static void m6744(Drawable drawable, C7835 c7835, int[] iArr) {
        C7124.m22252(drawable, c7835, iArr);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public synchronized Drawable m6745(@InterfaceC6391 Context context, @InterfaceC4525 int i) {
        return this.f202.m22257(context, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public synchronized Drawable m6746(@InterfaceC6391 Context context, @InterfaceC4525 int i, boolean z) {
        return this.f202.m22258(context, i, z);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public synchronized ColorStateList m6747(@InterfaceC6391 Context context, @InterfaceC4525 int i) {
        return this.f202.m22259(context, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public synchronized void m6748(@InterfaceC6391 Context context) {
        this.f202.m22263(context);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public synchronized Drawable m6749(@InterfaceC6391 Context context, @InterfaceC6391 C8170 c8170, @InterfaceC4525 int i) {
        return this.f202.m22264(context, c8170, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public boolean m6750(@InterfaceC6391 Context context, @InterfaceC4525 int i, @InterfaceC6391 Drawable drawable) {
        return this.f202.m22267(context, i, drawable);
    }
}
