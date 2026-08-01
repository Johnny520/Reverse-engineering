// Decompiled by JEB v5.42.0.202606242140

package t.ˈˊ;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build.VERSION;
import android.view.ContextThemeWrapper;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.animation.Animation;
import android.widget.TextView;
import t.ˆʿ.CLS61;

public final class CLS96 extends TextView {
    public final class CLS94 extends Drawable {
        public final Paint FLD711;
        public final CLS96 FLD712;
        public final Paint FLD713;

        public CLS94() {
            Paint paint0 = new Paint(1);
            this.FLD711 = paint0;
            Paint paint1 = new Paint(1);
            this.FLD713 = paint1;
            ﾞᐧ0.setLayerType(1, null);
            paint0.setStyle(Paint.Style.FILL);
            paint0.setColor(ﾞᐧ0.FLD717);
            paint1.setXfermode(CLS96.FLD723);
            if(!ﾞᐧ0.isInEditMode()) {
                paint0.setShadowLayer(((float)ﾞᐧ0.FLD718), ((float)ﾞᐧ0.FLD728), ((float)ﾞᐧ0.FLD725), ﾞᐧ0.FLD729);
            }
        }

        @Override  // android.graphics.drawable.Drawable
        public final void draw(Canvas canvas0) {
            RectF rectF0 = new RectF(((float)(Math.abs(CLS96.this.FLD728) + CLS96.this.FLD718)), ((float)(Math.abs(CLS96.this.FLD725) + CLS96.this.FLD718)), ((float)CLS96.this.FLD732), ((float)CLS96.this.FLD716));
            canvas0.drawRoundRect(rectF0, ((float)CLS96.this.FLD727), ((float)CLS96.this.FLD727), this.FLD711);
            canvas0.drawRoundRect(rectF0, ((float)CLS96.this.FLD727), ((float)CLS96.this.FLD727), this.FLD713);
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

    public final class CLS95 extends GestureDetector.SimpleOnGestureListener {
        public final CLS96 FLD714;

        @Override  // android.view.GestureDetector$SimpleOnGestureListener
        public final boolean onDown(MotionEvent motionEvent0) {
            CLS96.this.MTH1755();
            CLS86 ˆٴ0 = CLS96.this.FLD724;
            if(ˆٴ0 != null) {
                ˆٴ0.MTH1682();
            }
            return super.onDown(motionEvent0);
        }

        @Override  // android.view.GestureDetector$SimpleOnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent0) {
            CLS96.this.MTH1757();
            CLS86 ˆٴ0 = CLS96.this.FLD724;
            if(ˆٴ0 != null) {
                ˆٴ0.MTH1683();
            }
            return super.onSingleTapUp(motionEvent0);
        }
    }

    public int FLD715;
    public int FLD716;
    public int FLD717;
    public int FLD718;
    public int FLD719;
    public Animation FLD720;
    public Drawable FLD721;
    public boolean FLD722;
    public static final PorterDuffXfermode FLD723;
    public CLS86 FLD724;
    public int FLD725;
    public boolean FLD726;
    public int FLD727;
    public int FLD728;
    public int FLD729;
    public final GestureDetector FLD730;
    public Animation FLD731;
    public int FLD732;
    public boolean FLD733;

    static {
        CLS96.FLD723 = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
    }

    public CLS96(ContextThemeWrapper contextThemeWrapper0) {
        super(contextThemeWrapper0);
        this.FLD733 = true;
        this.FLD726 = true;
        this.FLD730 = new GestureDetector(this.getContext(), new CLS95(this));
    }

    @Override  // android.widget.TextView
    public final void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        if(this.FLD732 == 0) {
            this.FLD732 = this.getMeasuredWidth();
        }
        int v2 = this.getMeasuredWidth();
        int v3 = 0;
        int v4 = this.FLD733 ? Math.abs(this.FLD728) + this.FLD718 : 0;
        if(this.FLD716 == 0) {
            this.FLD716 = this.getMeasuredHeight();
        }
        int v5 = this.getMeasuredHeight();
        if(this.FLD733) {
            v3 = Math.abs(this.FLD725) + this.FLD718;
        }
        this.setMeasuredDimension(v4 + v2, v5 + v3);
    }

    @Override  // android.widget.TextView
    public final boolean onTouchEvent(MotionEvent motionEvent0) {
        if(this.FLD724 != null && this.FLD724.getOnClickListener() != null && this.FLD724.isEnabled()) {
            switch(motionEvent0.getAction()) {
                case 1: 
                case 3: {
                    this.MTH1757();
                    this.FLD724.MTH1683();
                }
            }
            this.FLD730.onTouchEvent(motionEvent0);
            return super.onTouchEvent(motionEvent0);
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

    public void setCornerRadius(int v) {
        this.FLD727 = v;
    }

    public void setFab(CLS86 ˆٴ0) {
        this.FLD724 = ˆٴ0;
        this.setShadow(ˆٴ0);
    }

    public void setHandleVisibilityChanges(boolean z) {
        this.FLD726 = z;
    }

    public void setHideAnimation(Animation animation0) {
        this.FLD720 = animation0;
    }

    private void setShadow(CLS86 ˆٴ0) {
        this.FLD729 = ˆٴ0.getShadowColor();
        this.FLD718 = ˆٴ0.getShadowRadius();
        this.FLD728 = ˆٴ0.getShadowXOffset();
        this.FLD725 = ˆٴ0.getShadowYOffset();
        this.FLD733 = ˆٴ0.MTH1695();
    }

    public void setShowAnimation(Animation animation0) {
        this.FLD731 = animation0;
    }

    public void setShowShadow(boolean z) {
        this.FLD733 = z;
    }

    public void setUsingStyle(boolean z) {
        this.FLD722 = z;
    }

    public final Drawable MTH1753() {
        public final class CLS93 extends ViewOutlineProvider {
            public CLS93() {
                super();
            }

            @Override  // android.view.ViewOutlineProvider
            public final void getOutline(View view0, Outline outline0) {
                CLS61.MTH1507(outline0, view0.getWidth(), view0.getHeight());
            }
        }

        StateListDrawable stateListDrawable0 = new StateListDrawable();
        stateListDrawable0.addState(new int[]{0x10100A7}, this.MTH1756(this.FLD715));
        ShapeDrawable shapeDrawable0 = this.MTH1756(this.FLD717);
        stateListDrawable0.addState(new int[0], shapeDrawable0);
        if(CLS92.MTH1729()) {
            RippleDrawable rippleDrawable0 = new RippleDrawable(new ColorStateList(new int[][]{new int[0]}, new int[]{this.FLD719}), stateListDrawable0, null);
            this.setOutlineProvider(new CLS93());
            this.setClipToOutline(true);
            this.FLD721 = rippleDrawable0;
            return rippleDrawable0;
        }
        this.FLD721 = stateListDrawable0;
        return stateListDrawable0;
    }

    public final void MTH1754() {
        LayerDrawable layerDrawable0;
        if(this.FLD733) {
            layerDrawable0 = new LayerDrawable(new Drawable[]{new CLS94(this), this.MTH1753()});
            layerDrawable0.setLayerInset(1, Math.abs(this.FLD728) + this.FLD718, Math.abs(this.FLD725) + this.FLD718, Math.abs(this.FLD728) + this.FLD718, Math.abs(this.FLD725) + this.FLD718);
        }
        else {
            layerDrawable0 = new LayerDrawable(new Drawable[]{this.MTH1753()});
        }
        this.setBackgroundCompat(layerDrawable0);
    }

    public final void MTH1755() {
        if(this.FLD722) {
            this.FLD721 = this.getBackground();
        }
        Drawable drawable0 = this.FLD721;
        if(drawable0 instanceof StateListDrawable) {
            ((StateListDrawable)drawable0).setState(new int[]{0x10100A7});
            return;
        }
        if(CLS92.MTH1729()) {
            Drawable drawable1 = this.FLD721;
            if(drawable1 instanceof RippleDrawable) {
                ((RippleDrawable)drawable1).setState(new int[]{0x101009E, 0x10100A7});
                ((RippleDrawable)drawable1).setHotspot(((float)(this.getMeasuredWidth() / 2)), ((float)(this.getMeasuredHeight() / 2)));
                CLS61.MTH1508(((RippleDrawable)drawable1));
            }
        }
    }

    public final ShapeDrawable MTH1756(int v) {
        ShapeDrawable shapeDrawable0 = new ShapeDrawable(new RoundRectShape(new float[]{((float)this.FLD727), ((float)this.FLD727), ((float)this.FLD727), ((float)this.FLD727), ((float)this.FLD727), ((float)this.FLD727), ((float)this.FLD727), ((float)this.FLD727)}, null, null));
        shapeDrawable0.getPaint().setColor(v);
        return shapeDrawable0;
    }

    public final void MTH1757() {
        if(this.FLD722) {
            this.FLD721 = this.getBackground();
        }
        Drawable drawable0 = this.FLD721;
        if(drawable0 instanceof StateListDrawable) {
            ((StateListDrawable)drawable0).setState(new int[0]);
            return;
        }
        if(CLS92.MTH1729()) {
            Drawable drawable1 = this.FLD721;
            if(drawable1 instanceof RippleDrawable) {
                ((RippleDrawable)drawable1).setState(new int[0]);
                ((RippleDrawable)drawable1).setHotspot(((float)(this.getMeasuredWidth() / 2)), ((float)(this.getMeasuredHeight() / 2)));
                CLS61.MTH1508(((RippleDrawable)drawable1));
            }
        }
    }
}

