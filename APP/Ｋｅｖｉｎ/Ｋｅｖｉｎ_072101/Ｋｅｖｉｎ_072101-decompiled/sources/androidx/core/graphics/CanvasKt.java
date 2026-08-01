package androidx.core.graphics;

/* JADX INFO: compiled from: Canvas.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a.\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\b\u001a.\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\b\u001a.\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\b\u001a\u00020\n2\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\b\u001aF\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\b\u001aF\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00102\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\b\u001a0\u0010\u0011\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\b\u001aD\u0010\u0014\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\f2\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\b\u001a&\u0010\u0018\u001a\u00020\u0001*\u00020\u00022\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\b\u001aN\u0010\u0019\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\f2\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\b\u001a:\u0010\u001c\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\f2\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\b\u001a:\u0010\u001d\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\f2\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\b¨\u0006\u001e"}, m115d2 = {"withClip", "", "Landroid/graphics/Canvas;", "clipPath", "Landroid/graphics/Path;", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "clipRect", "Landroid/graphics/Rect;", "Landroid/graphics/RectF;", "left", "", "top", "right", "bottom", "", "withMatrix", "matrix", "Landroid/graphics/Matrix;", "withRotation", "degrees", "pivotX", "pivotY", "withSave", "withScale", "x", "y", "withSkew", "withTranslation", "core-ktx_release"}, m116k = 2, m117mv = {1, 8, 0}, m119xi = 48)
public final class CanvasKt {
    public static final void withClip(android.graphics.Canvas r4, float r5, float r6, float r7, float r8, kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> r9) {
            r0 = 0
            int r1 = r4.save()
            r4.clipRect(r5, r6, r7, r8)
            r2 = 1
            r9.invoke(r4)     // Catch: java.lang.Throwable -> L18
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            r4.restoreToCount(r1)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            return
        L18:
            r3 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            r4.restoreToCount(r1)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            throw r3
    }

    public static final void withClip(android.graphics.Canvas r4, int r5, int r6, int r7, int r8, kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> r9) {
            r0 = 0
            int r1 = r4.save()
            r4.clipRect(r5, r6, r7, r8)
            r2 = 1
            r9.invoke(r4)     // Catch: java.lang.Throwable -> L18
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            r4.restoreToCount(r1)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            return
        L18:
            r3 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            r4.restoreToCount(r1)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            throw r3
    }

    public static final void withClip(android.graphics.Canvas r4, android.graphics.Path r5, kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> r6) {
            r0 = 0
            int r1 = r4.save()
            r4.clipPath(r5)
            r2 = 1
            r6.invoke(r4)     // Catch: java.lang.Throwable -> L18
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            r4.restoreToCount(r1)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            return
        L18:
            r3 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            r4.restoreToCount(r1)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            throw r3
    }

    public static final void withClip(android.graphics.Canvas r4, android.graphics.Rect r5, kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> r6) {
            r0 = 0
            int r1 = r4.save()
            r4.clipRect(r5)
            r2 = 1
            r6.invoke(r4)     // Catch: java.lang.Throwable -> L18
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            r4.restoreToCount(r1)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            return
        L18:
            r3 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            r4.restoreToCount(r1)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            throw r3
    }

    public static final void withClip(android.graphics.Canvas r4, android.graphics.RectF r5, kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> r6) {
            r0 = 0
            int r1 = r4.save()
            r4.clipRect(r5)
            r2 = 1
            r6.invoke(r4)     // Catch: java.lang.Throwable -> L18
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            r4.restoreToCount(r1)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            return
        L18:
            r3 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            r4.restoreToCount(r1)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            throw r3
    }

    public static final void withMatrix(android.graphics.Canvas r4, android.graphics.Matrix r5, kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> r6) {
            r0 = 0
            int r1 = r4.save()
            r4.concat(r5)
            r2 = 1
            r6.invoke(r4)     // Catch: java.lang.Throwable -> L18
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            r4.restoreToCount(r1)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            return
        L18:
            r3 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            r4.restoreToCount(r1)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            throw r3
    }

    public static /* synthetic */ void withMatrix$default(android.graphics.Canvas r2, android.graphics.Matrix r3, kotlin.jvm.functions.Function1 r4, int r5, java.lang.Object r6) {
            r6 = 1
            r5 = r5 & r6
            if (r5 == 0) goto La
            android.graphics.Matrix r5 = new android.graphics.Matrix
            r5.<init>()
            r3 = r5
        La:
            r5 = 0
            int r0 = r2.save()
            r2.concat(r3)
            r4.invoke(r2)     // Catch: java.lang.Throwable -> L21
            kotlin.jvm.internal.InlineMarker.finallyStart(r6)
            r2.restoreToCount(r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r6)
            return
        L21:
            r1 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r6)
            r2.restoreToCount(r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r6)
            throw r1
    }

    public static final void withRotation(android.graphics.Canvas r4, float r5, float r6, float r7, kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> r8) {
            r0 = 0
            int r1 = r4.save()
            r4.rotate(r5, r6, r7)
            r2 = 1
            r8.invoke(r4)     // Catch: java.lang.Throwable -> L18
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            r4.restoreToCount(r1)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            return
        L18:
            r3 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            r4.restoreToCount(r1)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            throw r3
    }

    public static /* synthetic */ void withRotation$default(android.graphics.Canvas r2, float r3, float r4, float r5, kotlin.jvm.functions.Function1 r6, int r7, java.lang.Object r8) {
            r8 = r7 & 1
            if (r8 == 0) goto L5
            r3 = 0
        L5:
            r8 = r7 & 2
            if (r8 == 0) goto La
            r4 = 0
        La:
            r7 = r7 & 4
            if (r7 == 0) goto Lf
            r5 = 0
        Lf:
            r7 = 0
            int r8 = r2.save()
            r2.rotate(r3, r4, r5)
            r0 = 1
            r6.invoke(r2)     // Catch: java.lang.Throwable -> L27
            kotlin.jvm.internal.InlineMarker.finallyStart(r0)
            r2.restoreToCount(r8)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r0)
            return
        L27:
            r1 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r0)
            r2.restoreToCount(r8)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r0)
            throw r1
    }

    public static final void withSave(android.graphics.Canvas r4, kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> r5) {
            r0 = 0
            int r1 = r4.save()
            r2 = 1
            r5.invoke(r4)     // Catch: java.lang.Throwable -> L15
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            r4.restoreToCount(r1)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            return
        L15:
            r3 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            r4.restoreToCount(r1)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            throw r3
    }

    public static final void withScale(android.graphics.Canvas r4, float r5, float r6, float r7, float r8, kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> r9) {
            r0 = 0
            int r1 = r4.save()
            r4.scale(r5, r6, r7, r8)
            r2 = 1
            r9.invoke(r4)     // Catch: java.lang.Throwable -> L18
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            r4.restoreToCount(r1)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            return
        L18:
            r3 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            r4.restoreToCount(r1)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            throw r3
    }

    public static /* synthetic */ void withScale$default(android.graphics.Canvas r2, float r3, float r4, float r5, float r6, kotlin.jvm.functions.Function1 r7, int r8, java.lang.Object r9) {
            r9 = r8 & 1
            if (r9 == 0) goto L6
            r3 = 1065353216(0x3f800000, float:1.0)
        L6:
            r9 = r8 & 2
            if (r9 == 0) goto Lc
            r4 = 1065353216(0x3f800000, float:1.0)
        Lc:
            r9 = r8 & 4
            if (r9 == 0) goto L11
            r5 = 0
        L11:
            r8 = r8 & 8
            if (r8 == 0) goto L16
            r6 = 0
        L16:
            r8 = 0
            int r9 = r2.save()
            r2.scale(r3, r4, r5, r6)
            r0 = 1
            r7.invoke(r2)     // Catch: java.lang.Throwable -> L2e
            kotlin.jvm.internal.InlineMarker.finallyStart(r0)
            r2.restoreToCount(r9)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r0)
            return
        L2e:
            r1 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r0)
            r2.restoreToCount(r9)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r0)
            throw r1
    }

    public static final void withSkew(android.graphics.Canvas r4, float r5, float r6, kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> r7) {
            r0 = 0
            int r1 = r4.save()
            r4.skew(r5, r6)
            r2 = 1
            r7.invoke(r4)     // Catch: java.lang.Throwable -> L18
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            r4.restoreToCount(r1)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            return
        L18:
            r3 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            r4.restoreToCount(r1)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            throw r3
    }

    public static /* synthetic */ void withSkew$default(android.graphics.Canvas r2, float r3, float r4, kotlin.jvm.functions.Function1 r5, int r6, java.lang.Object r7) {
            r7 = r6 & 1
            if (r7 == 0) goto L5
            r3 = 0
        L5:
            r6 = r6 & 2
            if (r6 == 0) goto La
            r4 = 0
        La:
            r6 = 0
            int r7 = r2.save()
            r2.skew(r3, r4)
            r0 = 1
            r5.invoke(r2)     // Catch: java.lang.Throwable -> L22
            kotlin.jvm.internal.InlineMarker.finallyStart(r0)
            r2.restoreToCount(r7)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r0)
            return
        L22:
            r1 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r0)
            r2.restoreToCount(r7)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r0)
            throw r1
    }

    public static final void withTranslation(android.graphics.Canvas r4, float r5, float r6, kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> r7) {
            r0 = 0
            int r1 = r4.save()
            r4.translate(r5, r6)
            r2 = 1
            r7.invoke(r4)     // Catch: java.lang.Throwable -> L18
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            r4.restoreToCount(r1)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            return
        L18:
            r3 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            r4.restoreToCount(r1)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            throw r3
    }

    public static /* synthetic */ void withTranslation$default(android.graphics.Canvas r2, float r3, float r4, kotlin.jvm.functions.Function1 r5, int r6, java.lang.Object r7) {
            r7 = r6 & 1
            if (r7 == 0) goto L5
            r3 = 0
        L5:
            r6 = r6 & 2
            if (r6 == 0) goto La
            r4 = 0
        La:
            r6 = 0
            int r7 = r2.save()
            r2.translate(r3, r4)
            r0 = 1
            r5.invoke(r2)     // Catch: java.lang.Throwable -> L22
            kotlin.jvm.internal.InlineMarker.finallyStart(r0)
            r2.restoreToCount(r7)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r0)
            return
        L22:
            r1 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r0)
            r2.restoreToCount(r7)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r0)
            throw r1
    }
}
