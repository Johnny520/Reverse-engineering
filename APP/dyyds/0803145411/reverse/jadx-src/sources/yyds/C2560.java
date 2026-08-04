package yyds;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.android.NativeUtil;

/* JADX INFO: renamed from: yyds.ᲇᲈᛱᛴ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C2560 extends AbstractC0429 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ ImageView f12633;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final /* synthetic */ String f12634;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ C2503 f12635;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final /* synthetic */ C0172 f12636;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ long f12637;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ String f12638;

    static {
        NativeUtil.classesInit0(126);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2560(String str, C2503 c2503, ImageView imageView, String str2, long j, C0172 c0172) {
        super(64, 64);
        this.f12638 = str;
        this.f12635 = c2503;
        this.f12633 = imageView;
        this.f12634 = str2;
        this.f12637 = j;
        this.f12636 = c0172;
    }

    @Override // yyds.InterfaceC2156
    /* JADX INFO: renamed from: ᛱᲈᲁ */
    public final native void mo2328(Drawable drawable);

    @Override // yyds.InterfaceC2156
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final native void mo2329(Object obj);

    @Override // yyds.AbstractC0429, yyds.InterfaceC2156
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final native void mo1200(Drawable drawable);
}
