package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1054h extends View {

    /* JADX INFO: renamed from: a */
    public int f4373a;

    /* JADX INFO: renamed from: b */
    public View f4374b;

    /* JADX INFO: renamed from: c */
    public int f4375c;

    public View getContent() {
        return this.f4374b;
    }

    public int getEmptyVisibility() {
        return this.f4375c;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int iHeight = rect.height();
            int iWidth = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((iWidth / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((rect.height() / 2.0f) + (iHeight / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i) {
        View viewFindViewById;
        if (this.f4373a == i) {
            return;
        }
        View view = this.f4374b;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.C1044a) this.f4374b.getLayoutParams()).f4185a0 = false;
            this.f4374b = null;
        }
        this.f4373a = i;
        if (i == -1 || (viewFindViewById = ((View) getParent()).findViewById(i)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i) {
        this.f4375c = i;
    }
}
