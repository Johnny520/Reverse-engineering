package yyds;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: yyds.ᛲᛸᛶᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0418 implements InterfaceC2162 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f2153;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Object f2154;

    public C0418(byte[] bArr) {
        this.f2153 = 1;
        AbstractC0319.m992(bArr, "Argument must not be null");
        this.f2154 = bArr;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    private final void m1174() {
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    private final void m1175() {
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    private final void m1176() {
    }

    @Override // yyds.InterfaceC2162
    public final Object get() {
        int i = this.f2153;
        Object obj = this.f2154;
        switch (i) {
            case 0:
                return (AnimatedImageDrawable) obj;
            case 1:
                return (byte[]) obj;
            case 2:
                return obj;
            default:
                return (Bitmap) obj;
        }
    }

    @Override // yyds.InterfaceC2162
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final void mo1177() {
        switch (this.f2153) {
            case 0:
                AnimatedImageDrawable animatedImageDrawable = (AnimatedImageDrawable) this.f2154;
                animatedImageDrawable.stop();
                animatedImageDrawable.clearAnimationCallbacks();
                break;
        }
    }

    @Override // yyds.InterfaceC2162
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final int mo1178() {
        int i = this.f2153;
        Object obj = this.f2154;
        switch (i) {
            case 0:
                AnimatedImageDrawable animatedImageDrawable = (AnimatedImageDrawable) obj;
                return AbstractC0181.m749(Bitmap.Config.ARGB_8888) * animatedImageDrawable.getIntrinsicHeight() * animatedImageDrawable.getIntrinsicWidth() * 2;
            case 1:
                return ((byte[]) obj).length;
            case 2:
                return 1;
            default:
                return AbstractC0181.m756((Bitmap) obj);
        }
    }

    @Override // yyds.InterfaceC2162
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Class mo1179() {
        switch (this.f2153) {
            case 0:
                return Drawable.class;
            case 1:
                return byte[].class;
            case 2:
                return this.f2154.getClass();
            default:
                return Bitmap.class;
        }
    }

    public /* synthetic */ C0418(int i, Object obj) {
        this.f2153 = i;
        this.f2154 = obj;
    }

    public C0418(Object obj) {
        this.f2153 = 2;
        AbstractC0319.m992(obj, "Argument must not be null");
        this.f2154 = obj;
    }
}
