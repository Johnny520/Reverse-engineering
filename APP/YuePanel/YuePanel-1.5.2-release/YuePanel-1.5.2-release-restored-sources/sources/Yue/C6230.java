package Yue;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.C8778;

/* JADX INFO: renamed from: Yue.ۥۡۡۢ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6230 extends View {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public Paint f15386;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public Paint f15387;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public Paint f15388;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public boolean f15389;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public boolean f15390;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public String f15391;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public Rect f15392;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public int f15393;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public int f15394;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public int f15395;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public int f15396;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6230(Context context) {
        super(context);
        this.f15386 = new Paint();
        this.f15387 = new Paint();
        this.f15388 = new Paint();
        this.f15389 = true;
        this.f15390 = true;
        this.f15391 = null;
        this.f15392 = new Rect();
        this.f15393 = Color.argb(255, 0, 0, 0);
        this.f15394 = Color.argb(255, 200, 200, 200);
        this.f15395 = Color.argb(255, 50, 50, 50);
        this.f15396 = 4;
        m2724(context, null);
    }

    /* JADX INFO: renamed from: ۥ */
    private void m2724(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8778.C8789.f29200);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == C8778.C8789.f29202) {
                    this.f15391 = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == C8778.C8789.f29205) {
                    this.f15389 = typedArrayObtainStyledAttributes.getBoolean(index, this.f15389);
                } else if (index == C8778.C8789.f29201) {
                    this.f15393 = typedArrayObtainStyledAttributes.getColor(index, this.f15393);
                } else if (index == C8778.C8789.f29203) {
                    this.f15395 = typedArrayObtainStyledAttributes.getColor(index, this.f15395);
                } else if (index == C8778.C8789.f29204) {
                    this.f15394 = typedArrayObtainStyledAttributes.getColor(index, this.f15394);
                } else if (index == C8778.C8789.f29206) {
                    this.f15390 = typedArrayObtainStyledAttributes.getBoolean(index, this.f15390);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.f15391 == null) {
            try {
                this.f15391 = context.getResources().getResourceEntryName(getId());
            } catch (Exception unused) {
            }
        }
        this.f15386.setColor(this.f15393);
        this.f15386.setAntiAlias(true);
        this.f15387.setColor(this.f15394);
        this.f15387.setAntiAlias(true);
        this.f15388.setColor(this.f15395);
        this.f15396 = Math.round(this.f15396 * (getResources().getDisplayMetrics().xdpi / 160.0f));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f15389) {
            width--;
            height--;
            float f = width;
            float f2 = height;
            canvas.drawLine(0.0f, 0.0f, f, f2, this.f15386);
            canvas.drawLine(0.0f, f2, f, 0.0f, this.f15386);
            canvas.drawLine(0.0f, 0.0f, f, 0.0f, this.f15386);
            canvas.drawLine(f, 0.0f, f, f2, this.f15386);
            canvas.drawLine(f, f2, 0.0f, f2, this.f15386);
            canvas.drawLine(0.0f, f2, 0.0f, 0.0f, this.f15386);
        }
        String str = this.f15391;
        if (str == null || !this.f15390) {
            return;
        }
        this.f15387.getTextBounds(str, 0, str.length(), this.f15392);
        float fWidth = (width - this.f15392.width()) / 2.0f;
        float fHeight = ((height - this.f15392.height()) / 2.0f) + this.f15392.height();
        this.f15392.offset((int) fWidth, (int) fHeight);
        Rect rect = this.f15392;
        int i = rect.left;
        int i2 = this.f15396;
        rect.set(i - i2, rect.top - i2, rect.right + i2, rect.bottom + i2);
        canvas.drawRect(this.f15392, this.f15388);
        canvas.drawText(this.f15391, fWidth, fHeight, this.f15387);
    }

    public C6230(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15386 = new Paint();
        this.f15387 = new Paint();
        this.f15388 = new Paint();
        this.f15389 = true;
        this.f15390 = true;
        this.f15391 = null;
        this.f15392 = new Rect();
        this.f15393 = Color.argb(255, 0, 0, 0);
        this.f15394 = Color.argb(255, 200, 200, 200);
        this.f15395 = Color.argb(255, 50, 50, 50);
        this.f15396 = 4;
        m2724(context, attributeSet);
    }

    public C6230(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f15386 = new Paint();
        this.f15387 = new Paint();
        this.f15388 = new Paint();
        this.f15389 = true;
        this.f15390 = true;
        this.f15391 = null;
        this.f15392 = new Rect();
        this.f15393 = Color.argb(255, 0, 0, 0);
        this.f15394 = Color.argb(255, 200, 200, 200);
        this.f15395 = Color.argb(255, 50, 50, 50);
        this.f15396 = 4;
        m2724(context, attributeSet);
    }
}
