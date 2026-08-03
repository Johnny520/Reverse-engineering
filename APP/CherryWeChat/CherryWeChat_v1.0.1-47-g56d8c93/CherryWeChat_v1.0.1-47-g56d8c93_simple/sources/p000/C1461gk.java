package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ProgressBar;

/* JADX INFO: renamed from: gk */
/* JADX INFO: loaded from: classes.dex */
public final class C1461gk {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5179a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5180b;

    public /* synthetic */ C1461gk(int r1, Object r2) {
        this.f5179a = r1;
        this.f5180b = r2;
    }

    /* JADX INFO: renamed from: a */
    public final void m2815a(Object r5) {
        switch(this.f5179a) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        Drawable r52 = (Drawable) r5;
        ((C0441KA) this.f5180b).itemView.requestLayout();
        return;
    L6:
        Drawable r53 = (Drawable) r5;
        ((ProgressBar) this.f5180b).setVisibility(8);
        return;
    L8:
        Drawable r54 = (Drawable) r5;
        AbstractC0295Gu.m625r(-73229192394805L);
        AbstractC0295Gu.m625r(-73267847100469L);
        AbstractC0295Gu.m625r(-73293616904245L);
        AbstractC0295Gu.m625r(-73323681675317L);
        if ((r54 instanceof BitmapDrawable) == false) goto L14;
        BitmapDrawable r55 = (BitmapDrawable) r54;
        if (r55.getBitmap() == null) goto L15;
        C0357IC r0 = C0357IC.f1218a;
        String r1 = ((C0185EC) this.f5180b).f554f;
        Bitmap r56 = r55.getBitmap();
        AbstractC0295Gu.m625r(-73370926315573L);
        r0.getClass();
        AbstractC0295Gu.m625r(-802140977100853L);
        AbstractC0295Gu.m625r(-802158156970037L);
        C0357IC.f1221d.put(r1, r56);
        return;
    L15:
        return;
    }
}
