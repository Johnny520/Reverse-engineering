package com.example.dyhelper.hook.panel;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class BaseIconView extends android.view.View {

    /* JADX INFO: renamed from: ε */
    public final android.graphics.Paint f2394;

    /* JADX INFO: renamed from: ζ */
    public final android.graphics.Path f2395;

    /* JADX INFO: renamed from: η */
    public int f2396;

    public BaseIconView(android.content.Context r2) {
            r1 = this;
            r2.getClass()
            r1.<init>(r2)
            android.graphics.Paint r2 = new android.graphics.Paint
            r0 = 1
            r2.<init>(r0)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            r2.setStyle(r0)
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.ROUND
            r2.setStrokeCap(r0)
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.ROUND
            r2.setStrokeJoin(r0)
            r1.f2394 = r2
            android.graphics.Path r2 = new android.graphics.Path
            r2.<init>()
            r1.f2395 = r2
            r2 = -15329245(0xffffffffff161823, float:-1.9950952E38)
            r1.f2396 = r2
            return
    }

    public final int getIconColor() {
            r0 = this;
            int r0 = r0.f2396
            return r0
    }

    public final android.graphics.Paint getPaint() {
            r0 = this;
            android.graphics.Paint r0 = r0.f2394
            return r0
    }

    public final android.graphics.Path getPath() {
            r0 = this;
            android.graphics.Path r0 = r0.f2395
            return r0
    }

    public final void setIconColor(int r1) {
            r0 = this;
            r0.f2396 = r1
            r0.invalidate()
            return
    }
}
