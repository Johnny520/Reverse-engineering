// Decompiled by JEB v5.42.0.202606242140

package t.ˈˊ;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View.BaseSavedState;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewOutlineProvider;
import android.view.animation.Animation;
import android.widget.ImageButton;
import t.ˆʿ.CLS33;
import t.ˆʿ.CLS61;
import t.ﾞٴ.CLS153;

public final class CLS86 extends ImageButton {
    public final class CLS81 extends Drawable {
        public final Paint FLD578;
        public float FLD579;
        public final Paint FLD580;
        public final CLS86 FLD581;

        public CLS81() {
            Paint paint0 = new Paint(1);
            this.FLD578 = paint0;
            Paint paint1 = new Paint(1);
            this.FLD580 = paint1;
            ˆٴ0.setLayerType(1, null);
            paint0.setStyle(Paint.Style.FILL);
            paint0.setColor(ˆٴ0.FLD646);
            paint1.setXfermode(CLS86.FLD605);
            if(!ˆٴ0.isInEditMode()) {
                paint0.setShadowLayer(((float)ˆٴ0.FLD639), ((float)ˆٴ0.FLD618), ((float)ˆٴ0.FLD647), ˆٴ0.FLD630);
            }
            int v = ˆٴ0.getCircleSize();
            this.FLD579 = (float)(v / 2);
            if(ˆٴ0.FLD638 && ˆٴ0.FLD634) {
                this.FLD579 = ((float)(v / 2)) + ((float)ˆٴ0.FLD625);
            }
        }

        @Override  // android.graphics.drawable.Drawable
        public final void draw(Canvas canvas0) {
            canvas0.drawCircle(((float)(CLS86.this.getMeasuredWidth() / 2)), ((float)(CLS86.this.getMeasuredHeight() / 2)), this.FLD579, this.FLD578);
            canvas0.drawCircle(((float)(CLS86.this.getMeasuredWidth() / 2)), ((float)(CLS86.this.getMeasuredHeight() / 2)), this.FLD579, this.FLD580);
        }

        @Override  // android.graphics.drawable.Drawable
        public final int getOpacity() {
            return 0;
        }

        @Override  // android.graphics.drawable.Drawable
        public final void setAlpha(int v) {
        }

        @Override  // android.graphics.drawable.Drawable
        public final void setColorFilter(ColorFilter colorFilter0) {
        }
    }

    public final class CLS82 extends ShapeDrawable {
        public final int FLD582;
        public final CLS86 FLD583;
        public final int FLD584;

        public CLS82(OvalShape ovalShape0) {
            super(ovalShape0);
            int v = 0;
            int v1 = ˆٴ0.MTH1695() ? Math.abs(ˆٴ0.FLD618) + ˆٴ0.FLD639 : 0;
            this.FLD582 = v1;
            if(ˆٴ0.MTH1695()) {
                v = Math.abs(ˆٴ0.FLD647) + ˆٴ0.FLD639;
            }
            this.FLD584 = v;
            if(ˆٴ0.FLD638) {
                this.FLD582 = v1 + ˆٴ0.FLD625;
                this.FLD584 = v + ˆٴ0.FLD625;
            }
        }

        @Override  // android.graphics.drawable.ShapeDrawable
        public final void draw(Canvas canvas0) {
            int v = CLS86.this.MTH1689();
            int v1 = CLS86.this.MTH1691();
            this.setBounds(this.FLD582, this.FLD584, v - this.FLD582, v1 - this.FLD584);
            super.draw(canvas0);
        }
    }

    public final class CLS83 extends GestureDetector.SimpleOnGestureListener {
        public final CLS86 FLD585;

        @Override  // android.view.GestureDetector$SimpleOnGestureListener
        public final boolean onDown(MotionEvent motionEvent0) {
            CLS86 ˆٴ0 = CLS86.this;
            CLS96 ﾞᐧ0 = (CLS96)ˆٴ0.getTag(0x7F02000C);
            if(ﾞᐧ0 != null) {
                ﾞᐧ0.MTH1755();
            }
            ˆٴ0.MTH1682();
            return super.onDown(motionEvent0);
        }

        @Override  // android.view.GestureDetector$SimpleOnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent0) {
            CLS86 ˆٴ0 = CLS86.this;
            CLS96 ﾞᐧ0 = (CLS96)ˆٴ0.getTag(0x7F02000C);
            if(ﾞᐧ0 != null) {
                ﾞᐧ0.MTH1757();
            }
            ˆٴ0.MTH1683();
            return super.onSingleTapUp(motionEvent0);
        }
    }

    public static final class CLS85 extends View.BaseSavedState {
        public final class CLS84 implements Parcelable.Creator {
            public CLS84() {
                super();
            }

            @Override  // android.os.Parcelable$Creator
            public final Object createFromParcel(Parcel parcel0) {
                return new CLS85(parcel0);
            }

            @Override  // android.os.Parcelable$Creator
            public final Object[] newArray(int v) {
                return new CLS85[v];
            }
        }

        public static final Parcelable.Creator CREATOR;
        public final boolean FLD587;
        public final boolean FLD588;
        public final boolean FLD589;
        public float FLD590;
        public boolean FLD591;
        public int FLD592;
        public boolean FLD593;
        public float FLD594;
        public boolean FLD595;
        public float FLD596;
        public int FLD597;
        public boolean FLD598;
        public int FLD599;
        public int FLD600;

        static {
            CLS85.CREATOR = new CLS84();
        }

        public CLS85(Parcel parcel0) {
            super(parcel0);
            this.FLD590 = parcel0.readFloat();
            this.FLD596 = parcel0.readFloat();
            boolean z = true;
            this.FLD588 = parcel0.readInt() != 0;
            this.FLD594 = parcel0.readFloat();
            this.FLD597 = parcel0.readInt();
            this.FLD592 = parcel0.readInt();
            this.FLD600 = parcel0.readInt();
            this.FLD599 = parcel0.readInt();
            this.FLD589 = parcel0.readInt() != 0;
            this.FLD587 = parcel0.readInt() != 0;
            this.FLD591 = parcel0.readInt() != 0;
            this.FLD595 = parcel0.readInt() != 0;
            this.FLD593 = parcel0.readInt() != 0;
            if(parcel0.readInt() == 0) {
                z = false;
            }
            this.FLD598 = z;
        }

        public CLS85(Parcelable parcelable0) {
            super(parcelable0);
        }

        @Override  // android.view.View$BaseSavedState
        public final void writeToParcel(Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            parcel0.writeFloat(this.FLD590);
            parcel0.writeFloat(this.FLD596);
            parcel0.writeInt(((int)this.FLD588));
            parcel0.writeFloat(this.FLD594);
            parcel0.writeInt(this.FLD597);
            parcel0.writeInt(this.FLD592);
            parcel0.writeInt(this.FLD600);
            parcel0.writeInt(this.FLD599);
            parcel0.writeInt(((int)this.FLD589));
            parcel0.writeInt(((int)this.FLD587));
            parcel0.writeInt(((int)this.FLD591));
            parcel0.writeInt(((int)this.FLD595));
            parcel0.writeInt(((int)this.FLD593));
            parcel0.writeInt(((int)this.FLD598));
        }
    }

    public boolean FLD601;
    public int FLD602;
    public final Paint FLD603;
    public double FLD604;
    public static final PorterDuffXfermode FLD605;
    public float FLD606;
    public float FLD607;
    public int FLD608;
    public int FLD609;
    public int FLD610;
    public Drawable FLD611;
    public String FLD612;
    public float FLD613;
    public RectF FLD614;
    public float FLD615;
    public boolean FLD616;
    public float FLD617;
    public int FLD618;
    public int FLD619;
    public boolean FLD620;
    public final Paint FLD621;
    public View.OnClickListener FLD622;
    public final GestureDetector FLD623;
    public boolean FLD624;
    public int FLD625;
    public Animation FLD626;
    public boolean FLD627;
    public int FLD628;
    public int FLD629;
    public int FLD630;
    public Drawable FLD631;
    public int FLD632;
    public final int FLD633;
    public boolean FLD634;
    public boolean FLD635;
    public long FLD636;
    public boolean FLD637;
    public boolean FLD638;
    public int FLD639;
    public int FLD640;
    public boolean FLD641;
    public boolean FLD642;
    public long FLD643;
    public boolean FLD644;
    public Animation FLD645;
    public int FLD646;
    public int FLD647;
    public float FLD648;

    static {
        CLS86.FLD605 = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
    }

    public CLS86(Context context0) {
        super(context0, null, 0);
        this.FLD639 = CLS92.MTH1727(this.getContext(), 4.0f);
        this.FLD618 = CLS92.MTH1727(this.getContext(), 1.0f);
        this.FLD647 = CLS92.MTH1727(this.getContext(), 3.0f);
        this.FLD633 = CLS92.MTH1727(this.getContext(), 24.0f);
        this.FLD625 = CLS92.MTH1727(this.getContext(), 6.0f);
        this.FLD606 = -1.0f;
        this.FLD648 = -1.0f;
        this.FLD614 = new RectF();
        this.FLD603 = new Paint(1);
        this.FLD621 = new Paint(1);
        this.FLD607 = 195.0f;
        this.FLD636 = 0L;
        this.FLD641 = true;
        this.FLD628 = 100;
        this.FLD619 = -1;
        this.FLD623 = new GestureDetector(this.getContext(), new CLS83(this));
        TypedArray typedArray0 = context0.obtainStyledAttributes(null, CLS33.FLD455, 0, 0);
        this.FLD646 = typedArray0.getColor(1, 0xFFDA4336);
        this.FLD608 = typedArray0.getColor(2, 0xFFE75043);
        this.FLD609 = typedArray0.getColor(0, -5592406);
        this.FLD602 = typedArray0.getColor(3, 0x99FFFFFF);
        this.FLD635 = typedArray0.getBoolean(18, true);
        this.FLD630 = typedArray0.getColor(13, 0x66000000);
        this.FLD639 = typedArray0.getDimensionPixelSize(14, this.FLD639);
        this.FLD618 = typedArray0.getDimensionPixelSize(15, this.FLD618);
        this.FLD647 = typedArray0.getDimensionPixelSize(16, this.FLD647);
        this.FLD610 = typedArray0.getInt(19, 0);
        this.FLD612 = typedArray0.getString(6);
        this.FLD644 = typedArray0.getBoolean(10, false);
        this.FLD640 = typedArray0.getColor(9, 0xFF009688);
        this.FLD632 = typedArray0.getColor(8, 0x4D000000);
        this.FLD628 = typedArray0.getInt(11, this.FLD628);
        this.FLD634 = typedArray0.getBoolean(12, true);
        if(typedArray0.hasValue(7)) {
            this.FLD629 = typedArray0.getInt(7, 0);
            this.FLD637 = true;
        }
        if(typedArray0.hasValue(4)) {
            float f = (float)typedArray0.getDimensionPixelOffset(4, 0);
            if(this.isInEditMode()) {
                this.setElevation(f);
            }
            else {
                this.setElevationCompat(f);
            }
        }
        this.FLD626 = CLS92.MTH1728("fab_scale_up");
        this.FLD645 = CLS92.MTH1728("fab_scale_down");
        typedArray0.recycle();
        if(this.isInEditMode()) {
            if(this.FLD644) {
                this.setIndeterminate(true);
            }
            else if(this.FLD637) {
                this.MTH1681();
                this.MTH1690(this.FLD629, false);
            }
        }
        this.setClickable(true);
    }

    public int getButtonSize() {
        return this.FLD610;
    }

    private int getCircleSize() {
        Context context0 = this.getContext();
        return this.FLD610 == 0 ? CLS92.MTH1727(context0, 56.0f) : CLS92.MTH1727(context0, 45.0f);
    }

    public int getColorDisabled() {
        return this.FLD609;
    }

    public int getColorNormal() {
        return this.FLD646;
    }

    public int getColorPressed() {
        return this.FLD608;
    }

    public int getColorRipple() {
        return this.FLD602;
    }

    public Animation getHideAnimation() {
        return this.FLD645;
    }

    public Drawable getIconDrawable() {
        Drawable drawable0 = this.FLD611;
        return drawable0 != null ? drawable0 : new ColorDrawable(0);
    }

    public String getLabelText() {
        return this.FLD612;
    }

    public int getLabelTextColor() {
        return this.FLD619;
    }

    public CLS96 getLabelView() {
        return (CLS96)this.getTag(0x7F02000C);
    }

    public int getLabelVisibility() {
        CLS96 ﾞᐧ0 = this.getLabelView();
        return ﾞᐧ0 == null ? -1 : ﾞᐧ0.getVisibility();
    }

    public int getMax() {
        synchronized(this) {
        }
        return this.FLD628;
    }

    public View.OnClickListener getOnClickListener() {
        return this.FLD622;
    }

    public int getProgress() {
        synchronized(this) {
        }
        return this.FLD601 ? 0 : this.FLD629;
    }

    public int getShadowColor() {
        return this.FLD630;
    }

    public int getShadowRadius() {
        return this.FLD639;
    }

    private int getShadowX() {
        return Math.abs(this.FLD618) + this.FLD639;
    }

    public int getShadowXOffset() {
        return this.FLD618;
    }

    private int getShadowY() {
        return Math.abs(this.FLD647) + this.FLD639;
    }

    public int getShadowYOffset() {
        return this.FLD647;
    }

    public Animation getShowAnimation() {
        return this.FLD626;
    }

    @Override  // android.widget.ImageView
    public final void onDraw(Canvas canvas0) {
        RectF rectF0;
        float f8;
        float f7;
        super.onDraw(canvas0);
        if(this.FLD638) {
            if(this.FLD634) {
                canvas0.drawArc(this.FLD614, 360.0f, 360.0f, false, this.FLD603);
            }
            Paint paint0 = this.FLD621;
            boolean z = true;
            if(this.FLD601) {
                long v = SystemClock.uptimeMillis() - this.FLD643;
                float f = ((float)v) * this.FLD607 / 1000.0f;
                long v1 = this.FLD636;
                if(v1 >= 200L) {
                    double f1 = this.FLD604 + ((double)v);
                    this.FLD604 = f1;
                    if(f1 > 500.0) {
                        this.FLD604 = f1 - 500.0;
                        this.FLD636 = 0L;
                        this.FLD641 = !this.FLD641;
                    }
                    float f2 = ((float)Math.cos((this.FLD604 / 500.0 + 1.0) * 3.141593)) / 2.0f + 0.5f;
                    if(this.FLD641) {
                        this.FLD613 = f2 * 254.0f;
                    }
                    else {
                        float f3 = (1.0f - f2) * 254.0f;
                        this.FLD615 = this.FLD613 - f3 + this.FLD615;
                        this.FLD613 = f3;
                    }
                }
                else {
                    this.FLD636 = v1 + v;
                }
                float f4 = this.FLD615 + f;
                this.FLD615 = f4;
                if(f4 > 360.0f) {
                    this.FLD615 = f4 - 360.0f;
                }
                this.FLD643 = SystemClock.uptimeMillis();
                float f5 = this.FLD615 - 90.0f;
                float f6 = this.FLD613 + 16.0f;
                if(this.isInEditMode()) {
                    f7 = 0.0f;
                    f8 = 135.0f;
                }
                else {
                    f7 = f5;
                    f8 = f6;
                }
                rectF0 = this.FLD614;
            }
            else {
                if(this.FLD615 == this.FLD617) {
                    z = false;
                }
                else {
                    float f9 = ((float)(SystemClock.uptimeMillis() - this.FLD643)) / 1000.0f * this.FLD607;
                    this.FLD615 = this.FLD615 > this.FLD617 ? Math.max(this.FLD615 - f9, this.FLD617) : Math.min(this.FLD615 + f9, this.FLD617);
                    this.FLD643 = SystemClock.uptimeMillis();
                }
                rectF0 = this.FLD614;
                f7 = -90.0f;
                f8 = this.FLD615;
            }
            canvas0.drawArc(rectF0, f7, f8, false, paint0);
            if(z) {
                this.invalidate();
            }
        }
    }

    @Override  // android.widget.ImageView
    public final void onMeasure(int v, int v1) {
        this.setMeasuredDimension(this.MTH1689(), this.MTH1691());
    }

    @Override  // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof CLS85)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((CLS85)parcelable0).getSuperState());
        this.FLD615 = ((CLS85)parcelable0).FLD590;
        this.FLD617 = ((CLS85)parcelable0).FLD596;
        this.FLD607 = ((CLS85)parcelable0).FLD594;
        this.FLD625 = ((CLS85)parcelable0).FLD592;
        this.FLD640 = ((CLS85)parcelable0).FLD600;
        this.FLD632 = ((CLS85)parcelable0).FLD599;
        this.FLD644 = ((CLS85)parcelable0).FLD591;
        this.FLD637 = ((CLS85)parcelable0).FLD595;
        this.FLD629 = ((CLS85)parcelable0).FLD597;
        this.FLD620 = ((CLS85)parcelable0).FLD593;
        this.FLD634 = ((CLS85)parcelable0).FLD598;
        this.FLD643 = SystemClock.uptimeMillis();
    }

    @Override  // android.view.View
    public final Parcelable onSaveInstanceState() {
        CLS85 ˆٴ$ⁱʾ0 = new CLS85(super.onSaveInstanceState());
        ˆٴ$ⁱʾ0.FLD590 = this.FLD615;
        ˆٴ$ⁱʾ0.FLD596 = this.FLD617;
        ˆٴ$ⁱʾ0.FLD594 = this.FLD607;
        ˆٴ$ⁱʾ0.FLD592 = this.FLD625;
        ˆٴ$ⁱʾ0.FLD600 = this.FLD640;
        ˆٴ$ⁱʾ0.FLD599 = this.FLD632;
        ˆٴ$ⁱʾ0.FLD591 = this.FLD601;
        ˆٴ$ⁱʾ0.FLD595 = this.FLD638 && this.FLD629 > 0 && !this.FLD601;
        ˆٴ$ⁱʾ0.FLD597 = this.FLD629;
        ˆٴ$ⁱʾ0.FLD593 = this.FLD620;
        ˆٴ$ⁱʾ0.FLD598 = this.FLD634;
        return ˆٴ$ⁱʾ0;
    }

    @Override  // android.view.View
    public final void onSizeChanged(int v, int v1, int v2, int v3) {
        float f1;
        float f;
        this.MTH1681();
        if(this.FLD644) {
            this.setIndeterminate(true);
            this.FLD644 = false;
        }
        else if(this.FLD637) {
            this.MTH1690(this.FLD629, this.FLD620);
            this.FLD637 = false;
        }
        else if(this.FLD616) {
            if(this.FLD638) {
                f = this.FLD606 > this.getX() ? this.getX() + ((float)this.FLD625) : this.getX() - ((float)this.FLD625);
                f1 = this.FLD648 > this.getY() ? this.getY() + ((float)this.FLD625) : this.getY() - ((float)this.FLD625);
            }
            else {
                f = this.FLD606;
                f1 = this.FLD648;
            }
            this.setX(f);
            this.setY(f1);
            this.FLD616 = false;
        }
        super.onSizeChanged(v, v1, v2, v3);
        this.MTH1688();
        this.FLD603.setColor(this.FLD632);
        this.FLD603.setStyle(Paint.Style.STROKE);
        this.FLD603.setStrokeWidth(((float)this.FLD625));
        this.FLD621.setColor(this.FLD640);
        this.FLD621.setStyle(Paint.Style.STROKE);
        this.FLD621.setStrokeWidth(((float)this.FLD625));
        this.MTH1686();
    }

    @Override  // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent0) {
        if(this.FLD622 != null && this.isEnabled()) {
            CLS96 ﾞᐧ0 = (CLS96)this.getTag(0x7F02000C);
            if(ﾞᐧ0 == null) {
                return super.onTouchEvent(motionEvent0);
            }
            switch(motionEvent0.getAction()) {
                case 1: 
                case 3: {
                    ﾞᐧ0.MTH1757();
                    this.MTH1683();
                }
            }
            this.FLD623.onTouchEvent(motionEvent0);
        }
        return super.onTouchEvent(motionEvent0);
    }

    private void setBackgroundCompat(Drawable drawable0) {
        if(Build.VERSION.SDK_INT >= 16) {
            this.setBackground(drawable0);
            return;
        }
        this.setBackgroundDrawable(drawable0);
    }

    public void setButtonSize(int v) {
        if(v != 0 && v != 1) {
            throw new IllegalArgumentException("Use @FabSize constants only!");
        }
        if(this.FLD610 != v) {
            this.FLD610 = v;
            this.MTH1686();
        }
    }

    public void setColorDisabled(int v) {
        if(v != this.FLD609) {
            this.FLD609 = v;
            this.MTH1686();
        }
    }

    public void setColorNormal(int v) {
        if(this.FLD646 != v) {
            this.FLD646 = v;
            this.MTH1686();
        }
    }

    public void setColorPressed(int v) {
        if(v != this.FLD608) {
            this.FLD608 = v;
            this.MTH1686();
        }
    }

    public void setColorRipple(int v) {
        if(v != this.FLD602) {
            this.FLD602 = v;
            this.MTH1686();
        }
    }

    @Override  // android.view.View
    public void setElevation(float f) {
        if(CLS92.MTH1729() && f > 0.0f) {
            super.setElevation(f);
            if(!this.isInEditMode()) {
                this.FLD642 = true;
                this.FLD635 = false;
            }
            this.MTH1686();
        }
    }

    public void setElevationCompat(float f) {
        this.FLD630 = 0x26000000;
        float f1 = f / 2.0f;
        this.FLD639 = Math.round(f1);
        this.FLD618 = 0;
        if(this.FLD610 == 0) {
            f1 = f;
        }
        this.FLD647 = Math.round(f1);
        if(CLS92.MTH1729()) {
            super.setElevation(f);
            this.FLD624 = true;
            this.FLD635 = false;
            this.MTH1686();
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.getLayoutParams();
            if(viewGroup$LayoutParams0 != null) {
                this.setLayoutParams(viewGroup$LayoutParams0);
            }
        }
        else {
            this.FLD635 = true;
            this.MTH1686();
        }
    }

    @Override  // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        CLS96 ﾞᐧ0 = (CLS96)this.getTag(0x7F02000C);
        if(ﾞᐧ0 != null) {
            ﾞᐧ0.setEnabled(z);
        }
    }

    public void setHideAnimation(Animation animation0) {
        this.FLD645 = animation0;
    }

    @Override  // android.widget.ImageView
    public void setImageDrawable(Drawable drawable0) {
        if(this.FLD611 != drawable0) {
            this.FLD611 = drawable0;
            this.MTH1686();
        }
    }

    @Override  // android.widget.ImageView
    public void setImageResource(int v) {
    }

    public void setIndeterminate(boolean z) {
        synchronized(this) {
            if(!z) {
                this.FLD615 = 0.0f;
            }
            this.FLD638 = z;
            this.FLD616 = true;
            this.FLD601 = z;
            this.FLD643 = SystemClock.uptimeMillis();
            this.MTH1688();
            this.MTH1686();
        }
    }

    public void setLabelText(String s) {
        this.FLD612 = s;
        CLS96 ﾞᐧ0 = this.getLabelView();
        if(ﾞᐧ0 != null) {
            ﾞᐧ0.setText(s);
        }
    }

    public void setLabelTextColor(int v) {
        this.FLD619 = v;
        CLS96 ﾞᐧ0 = this.getLabelView();
        if(ﾞᐧ0 != null) {
            ﾞᐧ0.setTextColor(v);
        }
    }

    public void setLabelTextColor(ColorStateList colorStateList0) {
        this.getLabelView().setTextColor(colorStateList0);
    }

    public void setLabelVisibility(int v) {
        CLS96 ﾞᐧ0 = this.getLabelView();
        if(ﾞᐧ0 != null) {
            ﾞᐧ0.setVisibility(v);
            ﾞᐧ0.setHandleVisibilityChanges(v == 0);
        }
    }

    @Override  // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if(viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams && this.FLD624) {
            ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).leftMargin += this.getShadowX();
            ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).topMargin += this.getShadowY();
            ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).rightMargin += this.getShadowX();
            ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).bottomMargin += this.getShadowY();
        }
        super.setLayoutParams(viewGroup$LayoutParams0);
    }

    public void setMax(int v) {
        synchronized(this) {
            this.FLD628 = v;
        }
    }

    @Override  // android.view.View
    public void setOnClickListener(View.OnClickListener view$OnClickListener0) {
        super.setOnClickListener(view$OnClickListener0);
        this.FLD622 = view$OnClickListener0;
        View view0 = (View)this.getTag(0x7F02000C);
        if(view0 != null) {
            view0.setOnClickListener(new CLS153(this, 3));
        }
    }

    public void setShadowColor(int v) {
        if(this.FLD630 != v) {
            this.FLD630 = v;
            this.MTH1686();
        }
    }

    public void setShadowRadius(float f) {
        this.FLD639 = CLS92.MTH1727(this.getContext(), f);
        this.requestLayout();
        this.MTH1686();
    }

    public void setShadowXOffset(float f) {
        this.FLD618 = CLS92.MTH1727(this.getContext(), f);
        this.requestLayout();
        this.MTH1686();
    }

    public void setShadowYOffset(float f) {
        this.FLD647 = CLS92.MTH1727(this.getContext(), f);
        this.requestLayout();
        this.MTH1686();
    }

    public void setShowAnimation(Animation animation0) {
        this.FLD626 = animation0;
    }

    public void setShowProgressBackground(boolean z) {
        synchronized(this) {
            this.FLD634 = z;
        }
    }

    public void setShowShadow(boolean z) {
        if(this.FLD635 != z) {
            this.FLD635 = z;
            this.MTH1686();
        }
    }

    @Override  // android.widget.ImageView
    public void setVisibility(int v) {
        super.setVisibility(v);
        CLS96 ﾞᐧ0 = (CLS96)this.getTag(0x7F02000C);
        if(ﾞᐧ0 != null) {
            ﾞᐧ0.setVisibility(v);
        }
    }

    public final void MTH1681() {
        if(!this.FLD627) {
            if(this.FLD606 == -1.0f) {
                this.FLD606 = this.getX();
            }
            if(this.FLD648 == -1.0f) {
                this.FLD648 = this.getY();
            }
            this.FLD627 = true;
        }
    }

    public final void MTH1682() {
        Drawable drawable0 = this.FLD631;
        if(drawable0 instanceof StateListDrawable) {
            ((StateListDrawable)drawable0).setState(new int[]{0x101009E, 0x10100A7});
            return;
        }
        if(CLS92.MTH1729()) {
            RippleDrawable rippleDrawable0 = (RippleDrawable)this.FLD631;
            rippleDrawable0.setState(new int[]{0x101009E, 0x10100A7});
            rippleDrawable0.setHotspot(((float)(this.getMeasuredWidth() / 2)), ((float)(this.getMeasuredHeight() / 2)));
            CLS61.MTH1508(rippleDrawable0);
        }
    }

    public final void MTH1683() {
        Drawable drawable0 = this.FLD631;
        if(drawable0 instanceof StateListDrawable) {
            ((StateListDrawable)drawable0).setState(new int[]{0x101009E});
            return;
        }
        if(CLS92.MTH1729()) {
            RippleDrawable rippleDrawable0 = (RippleDrawable)this.FLD631;
            rippleDrawable0.setState(new int[]{0x101009E});
            rippleDrawable0.setHotspot(((float)(this.getMeasuredWidth() / 2)), ((float)(this.getMeasuredHeight() / 2)));
            CLS61.MTH1508(rippleDrawable0);
        }
    }

    public final void MTH1685(int v, int v1, int v2) {
        CLS96 ﾞᐧ0 = this.getLabelView();
        if(ﾞᐧ0 == null) {
            return;
        }
        int v3 = ﾞᐧ0.getPaddingLeft();
        int v4 = ﾞᐧ0.getPaddingTop();
        int v5 = ﾞᐧ0.getPaddingRight();
        int v6 = ﾞᐧ0.getPaddingBottom();
        ﾞᐧ0.FLD717 = v;
        ﾞᐧ0.FLD715 = v1;
        ﾞᐧ0.FLD719 = v2;
        ﾞᐧ0.MTH1754();
        ﾞᐧ0.setPadding(v3, v4, v5, v6);
    }

    public final void MTH1686() {
        int v = 0;
        LayerDrawable layerDrawable0 = this.MTH1695() ? new LayerDrawable(new Drawable[]{new CLS81(this), this.MTH1687(), this.getIconDrawable()}) : new LayerDrawable(new Drawable[]{this.MTH1687(), this.getIconDrawable()});
        int v1 = this.getIconDrawable() == null ? -1 : Math.max(this.getIconDrawable().getIntrinsicWidth(), this.getIconDrawable().getIntrinsicHeight());
        int v2 = this.getCircleSize();
        if(v1 <= 0) {
            v1 = this.FLD633;
        }
        int v3 = (v2 - v1) / 2;
        int v4 = this.MTH1695() ? Math.abs(this.FLD618) + this.FLD639 : 0;
        if(this.MTH1695()) {
            v = this.FLD639 + Math.abs(this.FLD647);
        }
        if(this.FLD638) {
            v4 += this.FLD625;
            v += this.FLD625;
        }
        layerDrawable0.setLayerInset((this.MTH1695() ? 2 : 1), v4 + v3, v + v3, v4 + v3, v + v3);
        this.setBackgroundCompat(layerDrawable0);
    }

    public final Drawable MTH1687() {
        public final class CLS80 extends ViewOutlineProvider {
            public CLS80() {
                super();
            }

            @Override  // android.view.ViewOutlineProvider
            public final void getOutline(View view0, Outline outline0) {
                CLS61.MTH1507(outline0, view0.getWidth(), view0.getHeight());
            }
        }

        StateListDrawable stateListDrawable0 = new StateListDrawable();
        stateListDrawable0.addState(new int[]{0xFEFEFF62}, this.MTH1692(this.FLD609));
        stateListDrawable0.addState(new int[]{0x10100A7}, this.MTH1692(this.FLD608));
        CLS82 ˆٴ$ٴـ0 = this.MTH1692(this.FLD646);
        stateListDrawable0.addState(new int[0], ˆٴ$ٴـ0);
        if(CLS92.MTH1729()) {
            RippleDrawable rippleDrawable0 = new RippleDrawable(new ColorStateList(new int[][]{new int[0]}, new int[]{this.FLD602}), stateListDrawable0, null);
            this.setOutlineProvider(new CLS80());
            this.setClipToOutline(true);
            this.FLD631 = rippleDrawable0;
            return rippleDrawable0;
        }
        this.FLD631 = stateListDrawable0;
        return stateListDrawable0;
    }

    public final void MTH1688() {
        int v = 0;
        int v1 = this.MTH1695() ? this.getShadowX() : 0;
        if(this.MTH1695()) {
            v = this.getShadowY();
        }
        this.FLD614 = new RectF(((float)(this.FLD625 / 2 + v1)), ((float)(this.FLD625 / 2 + v)), ((float)(this.MTH1689() - v1 - this.FLD625 / 2)), ((float)(this.MTH1691() - v - this.FLD625 / 2)));
    }

    // 去混淆评级： 低(20)
    public final int MTH1689() {
        int v = this.getCircleSize() + (this.MTH1695() ? this.getShadowX() * 2 : 0);
        return this.FLD638 ? v + this.FLD625 * 2 : v;
    }

    public final void MTH1690(int v, boolean z) {
        synchronized(this) {
            if(this.FLD601) {
                return;
            }
            this.FLD629 = v;
            this.FLD620 = z;
            if(!this.FLD627) {
                this.FLD637 = true;
                return;
            }
            this.FLD638 = true;
            this.FLD616 = true;
            this.MTH1688();
            this.MTH1681();
            this.MTH1686();
            if(v < 0) {
                v = 0;
            }
            else {
                int v2 = this.FLD628;
                if(v > v2) {
                    v = v2;
                }
            }
            if(((float)v) == this.FLD617) {
                return;
            }
            this.FLD617 = this.FLD628 <= 0 ? 0.0f : ((float)v) / ((float)this.FLD628) * 360.0f;
            this.FLD643 = SystemClock.uptimeMillis();
            if(!z) {
                this.FLD615 = this.FLD617;
            }
            this.invalidate();
        }
    }

    // 去混淆评级： 低(20)
    public final int MTH1691() {
        int v = this.getCircleSize() + (this.MTH1695() ? this.getShadowY() * 2 : 0);
        return this.FLD638 ? v + this.FLD625 * 2 : v;
    }

    public final CLS82 MTH1692(int v) {
        CLS82 ˆٴ$ٴـ0 = new CLS82(this, new OvalShape());
        ˆٴ$ٴـ0.getPaint().setColor(v);
        return ˆٴ$ٴـ0;
    }

    public final void MTH1693(boolean z) {
        if(this.getVisibility() == 4) {
            if(z) {
                Animation animation0 = this.FLD645;
                if(animation0 != null) {
                    animation0.cancel();
                }
                Animation animation1 = this.FLD626;
                if(animation1 != null) {
                    this.startAnimation(animation1);
                }
            }
            super.setVisibility(0);
        }
    }

    public final void MTH1694(boolean z) {
        if(this.getVisibility() != 4) {
            if(z) {
                Animation animation0 = this.FLD626;
                if(animation0 != null) {
                    animation0.cancel();
                }
                Animation animation1 = this.FLD645;
                if(animation1 != null) {
                    this.startAnimation(animation1);
                }
            }
            super.setVisibility(4);
        }
    }

    // 去混淆评级： 低(20)
    public final boolean MTH1695() {
        return !this.FLD642 && this.FLD635;
    }
}

