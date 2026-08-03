package Yue;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: renamed from: Yue.ۥ۟ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C3676 {
    /* JADX INFO: renamed from: ۥ */
    public static final void m743(@InterfaceC6399 Canvas canvas, float f, float f2, float f3, float f4, @InterfaceC6399 InterfaceC5124<? super Canvas, C8107> interfaceC5124) {
        int iSave = canvas.save();
        canvas.clipRect(f, f2, f3, f4);
        try {
            interfaceC5124.invoke(canvas);
        } finally {
            C5437.m16930(1);
            canvas.restoreToCount(iSave);
            C5437.m16929(1);
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static final void m744(@InterfaceC6399 Canvas canvas, int i, int i2, int i3, int i4, @InterfaceC6399 InterfaceC5124<? super Canvas, C8107> interfaceC5124) {
        int iSave = canvas.save();
        canvas.clipRect(i, i2, i3, i4);
        try {
            interfaceC5124.invoke(canvas);
        } finally {
            C5437.m16930(1);
            canvas.restoreToCount(iSave);
            C5437.m16929(1);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final void m10070(@InterfaceC6399 Canvas canvas, @InterfaceC6399 Path path, @InterfaceC6399 InterfaceC5124<? super Canvas, C8107> interfaceC5124) {
        int iSave = canvas.save();
        canvas.clipPath(path);
        try {
            interfaceC5124.invoke(canvas);
        } finally {
            C5437.m16930(1);
            canvas.restoreToCount(iSave);
            C5437.m16929(1);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final void m10071(@InterfaceC6399 Canvas canvas, @InterfaceC6399 Rect rect, @InterfaceC6399 InterfaceC5124<? super Canvas, C8107> interfaceC5124) {
        int iSave = canvas.save();
        canvas.clipRect(rect);
        try {
            interfaceC5124.invoke(canvas);
        } finally {
            C5437.m16930(1);
            canvas.restoreToCount(iSave);
            C5437.m16929(1);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final void m10072(@InterfaceC6399 Canvas canvas, @InterfaceC6399 RectF rectF, @InterfaceC6399 InterfaceC5124<? super Canvas, C8107> interfaceC5124) {
        int iSave = canvas.save();
        canvas.clipRect(rectF);
        try {
            interfaceC5124.invoke(canvas);
        } finally {
            C5437.m16930(1);
            canvas.restoreToCount(iSave);
            C5437.m16929(1);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final void m10073(@InterfaceC6399 Canvas canvas, @InterfaceC6399 Matrix matrix, @InterfaceC6399 InterfaceC5124<? super Canvas, C8107> interfaceC5124) {
        int iSave = canvas.save();
        canvas.concat(matrix);
        try {
            interfaceC5124.invoke(canvas);
        } finally {
            C5437.m16930(1);
            canvas.restoreToCount(iSave);
            C5437.m16929(1);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ void m10074(Canvas canvas, Matrix matrix, InterfaceC5124 interfaceC5124, int i, Object obj) {
        if ((i & 1) != 0) {
            matrix = new Matrix();
        }
        int iSave = canvas.save();
        canvas.concat(matrix);
        try {
            interfaceC5124.invoke(canvas);
        } finally {
            C5437.m16930(1);
            canvas.restoreToCount(iSave);
            C5437.m16929(1);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final void m10075(@InterfaceC6399 Canvas canvas, float f, float f2, float f3, @InterfaceC6399 InterfaceC5124<? super Canvas, C8107> interfaceC5124) {
        int iSave = canvas.save();
        canvas.rotate(f, f2, f3);
        try {
            interfaceC5124.invoke(canvas);
        } finally {
            C5437.m16930(1);
            canvas.restoreToCount(iSave);
            C5437.m16929(1);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m10076(Canvas canvas, float f, float f2, float f3, InterfaceC5124 interfaceC5124, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        int iSave = canvas.save();
        canvas.rotate(f, f2, f3);
        try {
            interfaceC5124.invoke(canvas);
        } finally {
            C5437.m16930(1);
            canvas.restoreToCount(iSave);
            C5437.m16929(1);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final void m10077(@InterfaceC6399 Canvas canvas, @InterfaceC6399 InterfaceC5124<? super Canvas, C8107> interfaceC5124) {
        int iSave = canvas.save();
        try {
            interfaceC5124.invoke(canvas);
        } finally {
            C5437.m16930(1);
            canvas.restoreToCount(iSave);
            C5437.m16929(1);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final void m10078(@InterfaceC6399 Canvas canvas, float f, float f2, float f3, float f4, @InterfaceC6399 InterfaceC5124<? super Canvas, C8107> interfaceC5124) {
        int iSave = canvas.save();
        canvas.scale(f, f2, f3, f4);
        try {
            interfaceC5124.invoke(canvas);
        } finally {
            C5437.m16930(1);
            canvas.restoreToCount(iSave);
            C5437.m16929(1);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static /* synthetic */ void m10079(Canvas canvas, float f, float f2, float f3, float f4, InterfaceC5124 interfaceC5124, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        int iSave = canvas.save();
        canvas.scale(f, f2, f3, f4);
        try {
            interfaceC5124.invoke(canvas);
        } finally {
            C5437.m16930(1);
            canvas.restoreToCount(iSave);
            C5437.m16929(1);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final void m10080(@InterfaceC6399 Canvas canvas, float f, float f2, @InterfaceC6399 InterfaceC5124<? super Canvas, C8107> interfaceC5124) {
        int iSave = canvas.save();
        canvas.skew(f, f2);
        try {
            interfaceC5124.invoke(canvas);
        } finally {
            C5437.m16930(1);
            canvas.restoreToCount(iSave);
            C5437.m16929(1);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static /* synthetic */ void m10081(Canvas canvas, float f, float f2, InterfaceC5124 interfaceC5124, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        int iSave = canvas.save();
        canvas.skew(f, f2);
        try {
            interfaceC5124.invoke(canvas);
        } finally {
            C5437.m16930(1);
            canvas.restoreToCount(iSave);
            C5437.m16929(1);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final void m10082(@InterfaceC6399 Canvas canvas, float f, float f2, @InterfaceC6399 InterfaceC5124<? super Canvas, C8107> interfaceC5124) {
        int iSave = canvas.save();
        canvas.translate(f, f2);
        try {
            interfaceC5124.invoke(canvas);
        } finally {
            C5437.m16930(1);
            canvas.restoreToCount(iSave);
            C5437.m16929(1);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static /* synthetic */ void m10083(Canvas canvas, float f, float f2, InterfaceC5124 interfaceC5124, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        int iSave = canvas.save();
        canvas.translate(f, f2);
        try {
            interfaceC5124.invoke(canvas);
        } finally {
            C5437.m16930(1);
            canvas.restoreToCount(iSave);
            C5437.m16929(1);
        }
    }
}
