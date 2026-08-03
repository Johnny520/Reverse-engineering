package p001;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.view.View;

/* JADX INFO: renamed from: ۟.h8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0241h8 extends View {

    /* JADX INFO: renamed from: ۥ */
    public boolean f835;

    /* JADX INFO: renamed from: ۥ۟ */
    public int f836;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f1499;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public float f1500;

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public Paint f1501;

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public float f1502;

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public boolean f1503;

    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public int f1504;

    /* JADX INFO: renamed from: ۥ۟ۥ, reason: contains not printable characters */
    public int f1505;

    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    public int f1506;

    /* JADX INFO: renamed from: ۥ۟ۧ, reason: contains not printable characters */
    public int f1507;

    /* JADX INFO: renamed from: ۥ۟ۨ, reason: contains not printable characters */
    public PorterDuffXfermode f1508;

    /* JADX INFO: renamed from: ۥ۠ */
    public float f837;

    /* JADX INFO: renamed from: ۥ۠۟, reason: contains not printable characters */
    public a f1509;

    /* JADX INFO: renamed from: ۥ۠۠, reason: contains not printable characters */
    public d f1510;

    /* JADX INFO: renamed from: ۟.h8$a */
    public class a {
        public a() {
        }

        /* JADX INFO: renamed from: ۥ */
        public void mo868(Canvas canvas) {
            Paint paint;
            int i;
            C0241h8 c0241h8 = C0241h8.this;
            if (c0241h8.f1503) {
                paint = c0241h8.f1501;
                i = c0241h8.f1504;
            } else {
                paint = c0241h8.f1501;
                i = c0241h8.f1505;
            }
            paint.setColor(i);
            C0241h8 c0241h82 = C0241h8.this;
            canvas.drawCircle(0.0f, 0.0f, c0241h82.f1500, c0241h82.f1501);
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public void mo869(Canvas canvas) {
            Paint paint;
            int i;
            C0241h8 c0241h8 = C0241h8.this;
            if (c0241h8.f1503) {
                paint = c0241h8.f1501;
                i = c0241h8.f1506;
            } else {
                paint = c0241h8.f1501;
                i = c0241h8.f1507;
            }
            paint.setColor(i);
            C0241h8.this.f1501.setStyle(Paint.Style.STROKE);
            canvas.save();
            float f = C0241h8.this.f1500;
            canvas.translate(-(f / 8.0f), f / 3.0f);
            canvas.rotate(-45.0f);
            Path path = new Path();
            path.reset();
            path.moveTo(0.0f, 0.0f);
            path.lineTo(C0241h8.this.f1502, 0.0f);
            path.moveTo(0.0f, 0.0f);
            path.lineTo(0.0f, (-C0241h8.this.f1502) / 2.0f);
            canvas.drawPath(path, C0241h8.this.f1501);
            canvas.restore();
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void mo1093(Canvas canvas) {
            Paint paint;
            int i;
            C0241h8 c0241h8 = C0241h8.this;
            if (c0241h8.f1503) {
                paint = c0241h8.f1501;
                i = c0241h8.f1504;
            } else {
                paint = c0241h8.f1501;
                i = c0241h8.f1505;
            }
            paint.setColor(i);
            C0241h8 c0241h82 = C0241h8.this;
            float f = c0241h82.f1500;
            canvas.drawRect(-f, -f, f, f, c0241h82.f1501);
        }
    }

    /* JADX INFO: renamed from: ۟.h8$b */
    public class b extends a {
        public b() {
            super();
        }

        @Override // p001.C0241h8.a
        /* JADX INFO: renamed from: ۥ */
        public final void mo868(Canvas canvas) {
            C0241h8 c0241h8 = C0241h8.this;
            c0241h8.f1501.setStyle(c0241h8.f1503 ? Paint.Style.FILL : Paint.Style.STROKE);
            super.mo868(canvas);
        }

        @Override // p001.C0241h8.a
        /* JADX INFO: renamed from: ۥ۟ */
        public final void mo869(Canvas canvas) {
            C0241h8 c0241h8 = C0241h8.this;
            if (c0241h8.f1503) {
                c0241h8.f1501.setXfermode(c0241h8.f1508);
                super.mo869(canvas);
                C0241h8.this.f1501.setXfermode(null);
            }
        }

        @Override // p001.C0241h8.a
        /* JADX INFO: renamed from: ۥ۟۟ */
        public final void mo1093(Canvas canvas) {
            C0241h8 c0241h8 = C0241h8.this;
            c0241h8.f1501.setStyle(c0241h8.f1503 ? Paint.Style.FILL : Paint.Style.STROKE);
            super.mo1093(canvas);
        }
    }

    /* JADX INFO: renamed from: ۟.h8$c */
    public class c extends a {
        public c() {
            super();
        }

        @Override // p001.C0241h8.a
        /* JADX INFO: renamed from: ۥ */
        public final void mo868(Canvas canvas) {
            C0241h8.this.f1501.setStyle(Paint.Style.FILL);
            super.mo868(canvas);
        }
    }

    /* JADX INFO: renamed from: ۟.h8$d */
    public interface d {
        /* JADX INFO: renamed from: ۥ */
        void mo870(boolean z);
    }

    /* JADX INFO: renamed from: ۟.h8$e */
    public class e implements View.OnClickListener {

        /* JADX INFO: renamed from: ۥ */
        public View.OnClickListener f841;

        public e(View.OnClickListener onClickListener) {
            this.f841 = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C0241h8 c0241h8 = C0241h8.this;
            c0241h8.f1503 = !c0241h8.f1503;
            c0241h8.invalidate();
            C0241h8 c0241h82 = C0241h8.this;
            d dVar = c0241h82.f1510;
            if (dVar != null) {
                dVar.mo870(c0241h82.f1503);
            }
            View.OnClickListener onClickListener = this.f841;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0241h8(Context context) {
        super(context, null, 0);
        int i = AbstractAlertDialogC0471ya.f1882;
        int iArgb = Color.argb(255, 234, 234, 234);
        int iArgb2 = Color.argb(255, 53, 40, 33);
        int iArgb3 = Color.argb(255, 255, 255, 255);
        float f = (int) ((context.getResources().getDisplayMetrics().density * 2.0f) + 0.5f);
        this.f1504 = i;
        this.f1505 = iArgb;
        this.f1506 = iArgb2;
        this.f1507 = iArgb3;
        this.f835 = true;
        this.f837 = f;
        this.f1503 = false;
        this.f1509 = new b();
        Paint paint = new Paint();
        this.f1501 = paint;
        paint.setAntiAlias(true);
        this.f1501.setStyle(Paint.Style.FILL);
        this.f1501.setColor(this.f1505);
        this.f1501.setStrokeWidth(this.f837);
        this.f1501.setStrokeJoin(Paint.Join.ROUND);
        this.f1501.setStrokeCap(Paint.Cap.ROUND);
        setLayerType(1, null);
        this.f1508 = new PorterDuffXfermode(PorterDuff.Mode.XOR);
        setOnClickListener(new ViewOnClickListenerC0227g8());
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int iSaveLayer = canvas.saveLayer((-this.f836) / 2.0f, (-this.f1499) / 2.0f, getWidth(), getHeight(), null, 31);
        canvas.translate(this.f836 / 2.0f, this.f1499 / 2.0f);
        if (this.f835) {
            this.f1509.mo868(canvas);
        } else {
            this.f1509.mo1093(canvas);
        }
        this.f1509.mo869(canvas);
        canvas.restoreToCount(iSaveLayer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int iMin = 80;
        if (mode != 1073741824) {
            size = mode == Integer.MIN_VALUE ? Math.min(80, size) : 80;
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            iMin = size2;
        } else if (mode2 == Integer.MIN_VALUE) {
            iMin = Math.min(80, size2);
        }
        setMeasuredDimension(size, iMin);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f836 = i;
        this.f1499 = i2;
        this.f1500 = (Math.min(i, i2) / 2.0f) * 0.9f;
        this.f1502 = (Math.min(this.f836, this.f1499) / 2.0f) * 0.8f;
    }

    public void setCircle(boolean z) {
        this.f835 = z;
    }

    public void setOnCheckedChangeListener(d dVar) {
        this.f1510 = dVar;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(new e(onClickListener));
    }

    public void setStyle(int i) {
        a cVar;
        if (i == 2) {
            cVar = new b();
        } else if (i != 1) {
            return;
        } else {
            cVar = new c();
        }
        this.f1509 = cVar;
    }

    /* JADX INFO: renamed from: ۥ */
    public final void m867(boolean z) {
        this.f1503 = z;
        d dVar = this.f1510;
        if (dVar != null) {
            dVar.mo870(z);
        }
        postInvalidate();
    }
}
