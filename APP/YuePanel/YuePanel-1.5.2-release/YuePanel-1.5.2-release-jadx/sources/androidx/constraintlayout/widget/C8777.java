package androidx.constraintlayout.widget;

import Yue.C4128;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.C8778;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.android.p001dx.p004io.Opcodes;
import net.bytebuddy.description.type.TypeDescription;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.ۥ۟۟۟ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8777 extends View {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public int f26943;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public View f26944;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public int f26945;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C8777(Context context) {
        super(context);
        this.f26943 = -1;
        this.f26944 = null;
        this.f26945 = 4;
        m4730(null);
    }

    public View getContent() {
        return this.f26944;
    }

    public int getEmptyVisibility() {
        return this.f26945;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(Opcodes.XOR_INT_LIT8, Opcodes.XOR_INT_LIT8, Opcodes.XOR_INT_LIT8);
            Paint paint = new Paint();
            paint.setARGB(255, Opcodes.MUL_INT_LIT16, Opcodes.MUL_INT_LIT16, Opcodes.MUL_INT_LIT16);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int iHeight = rect.height();
            int iWidth = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds(TypeDescription.Generic.OfWildcardType.SYMBOL, 0, 1, rect);
            canvas.drawText(TypeDescription.Generic.OfWildcardType.SYMBOL, ((iWidth / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((iHeight / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i) {
        View viewFindViewById;
        if (this.f26943 == i) {
            return;
        }
        View view = this.f26944;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.C1641) this.f26944.getLayoutParams()).f26528 = false;
            this.f26944 = null;
        }
        this.f26943 = i;
        if (i == -1 || (viewFindViewById = ((View) getParent()).findViewById(i)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i) {
        this.f26945 = i;
    }

    /* JADX INFO: renamed from: ۥ */
    public final void m4730(AttributeSet attributeSet) {
        super.setVisibility(this.f26945);
        this.f26943 = -1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C8778.C8789.f28807);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == C8778.C8789.f28808) {
                    this.f26943 = typedArrayObtainStyledAttributes.getResourceId(index, this.f26943);
                } else if (index == C8778.C8789.f28809) {
                    this.f26945 = typedArrayObtainStyledAttributes.getInt(index, this.f26945);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m4731(ConstraintLayout constraintLayout) {
        if (this.f26944 == null) {
            return;
        }
        ConstraintLayout.C1641 c1641 = (ConstraintLayout.C1641) getLayoutParams();
        ConstraintLayout.C1641 c16412 = (ConstraintLayout.C1641) this.f26944.getLayoutParams();
        c16412.f26540.m11964(0);
        C4128.EnumC0339 enumC0339M11863 = c1641.f26540.m11863();
        C4128.EnumC0339 enumC0339 = C4128.EnumC0339.FIXED;
        if (enumC0339M11863 != enumC0339) {
            c1641.f26540.m11965(c16412.f26540.m11891());
        }
        if (c1641.f26540.m11888() != enumC0339) {
            c1641.f26540.m11935(c16412.f26540.m11859());
        }
        c16412.f26540.m11964(8);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m29480(ConstraintLayout constraintLayout) {
        if (this.f26943 == -1 && !isInEditMode()) {
            setVisibility(this.f26945);
        }
        View viewFindViewById = constraintLayout.findViewById(this.f26943);
        this.f26944 = viewFindViewById;
        if (viewFindViewById != null) {
            ((ConstraintLayout.C1641) viewFindViewById.getLayoutParams()).f26528 = true;
            this.f26944.setVisibility(0);
            setVisibility(0);
        }
    }

    public C8777(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26943 = -1;
        this.f26944 = null;
        this.f26945 = 4;
        m4730(attributeSet);
    }

    public C8777(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26943 = -1;
        this.f26944 = null;
        this.f26945 = 4;
        m4730(attributeSet);
    }

    public C8777(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.f26943 = -1;
        this.f26944 = null;
        this.f26945 = 4;
        m4730(attributeSet);
    }
}
