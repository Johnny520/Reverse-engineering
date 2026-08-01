package androidx.core.graphics;

/* JADX INFO: compiled from: Picture.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a6\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0086\b¨\u0006\n"}, m115d2 = {"record", "Landroid/graphics/Picture;", "width", "", "height", "block", "Lkotlin/Function1;", "Landroid/graphics/Canvas;", "", "Lkotlin/ExtensionFunctionType;", "core-ktx_release"}, m116k = 2, m117mv = {1, 8, 0}, m119xi = 48)
public final class PictureKt {
    public static final android.graphics.Picture record(android.graphics.Picture r4, int r5, int r6, kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.Unit> r7) {
            r0 = 0
            android.graphics.Canvas r1 = r4.beginRecording(r5, r6)
            r2 = 1
            r7.invoke(r1)     // Catch: java.lang.Throwable -> L15
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            r4.endRecording()
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            return r4
        L15:
            r3 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            r4.endRecording()
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            throw r3
    }
}
