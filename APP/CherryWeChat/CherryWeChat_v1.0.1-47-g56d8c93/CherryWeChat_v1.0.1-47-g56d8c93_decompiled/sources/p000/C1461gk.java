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

    public /* synthetic */ C1461gk(int i, Object obj) {
        this.f5179a = i;
        this.f5180b = obj;
    }

    /* JADX INFO: renamed from: a */
    public final void m2815a(Object obj) {
        switch (this.f5179a) {
            case 0:
                Drawable drawable = (Drawable) obj;
                AbstractC0295Gu.m625r(-73229192394805L);
                AbstractC0295Gu.m625r(-73267847100469L);
                AbstractC0295Gu.m625r(-73293616904245L);
                AbstractC0295Gu.m625r(-73323681675317L);
                if (drawable instanceof BitmapDrawable) {
                    BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                    if (bitmapDrawable.getBitmap() != null) {
                        C0357IC c0357ic = C0357IC.f1218a;
                        String str = ((C0185EC) this.f5180b).f554f;
                        Bitmap bitmap = bitmapDrawable.getBitmap();
                        AbstractC0295Gu.m625r(-73370926315573L);
                        c0357ic.getClass();
                        AbstractC0295Gu.m625r(-802140977100853L);
                        AbstractC0295Gu.m625r(-802158156970037L);
                        C0357IC.f1221d.put(str, bitmap);
                    }
                }
                break;
            case 1:
                ((ProgressBar) this.f5180b).setVisibility(8);
                break;
            default:
                ((C0441KA) this.f5180b).itemView.requestLayout();
                break;
        }
    }
}
