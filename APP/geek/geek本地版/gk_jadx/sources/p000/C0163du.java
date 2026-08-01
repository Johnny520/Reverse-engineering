package p000;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: du */
/* JADX INFO: loaded from: classes.dex */
public class C0163du extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public f30 f1633a;

    /* JADX INFO: renamed from: b */
    public C0893xh f1634b;

    /* JADX INFO: renamed from: c */
    public ColorStateList f1635c;

    /* JADX INFO: renamed from: d */
    public ColorStateList f1636d;

    /* JADX INFO: renamed from: e */
    public ColorStateList f1637e;

    /* JADX INFO: renamed from: f */
    public PorterDuff.Mode f1638f;

    /* JADX INFO: renamed from: g */
    public Rect f1639g;

    /* JADX INFO: renamed from: h */
    public final float f1640h;

    /* JADX INFO: renamed from: i */
    public float f1641i;

    /* JADX INFO: renamed from: j */
    public float f1642j;

    /* JADX INFO: renamed from: k */
    public int f1643k;

    /* JADX INFO: renamed from: l */
    public float f1644l;

    /* JADX INFO: renamed from: m */
    public float f1645m;

    /* JADX INFO: renamed from: n */
    public int f1646n;

    /* JADX INFO: renamed from: o */
    public int f1647o;

    /* JADX INFO: renamed from: p */
    public final Paint.Style f1648p;

    public C0163du(f30 f30Var) {
        this.f1635c = null;
        this.f1636d = null;
        this.f1637e = null;
        this.f1638f = PorterDuff.Mode.SRC_IN;
        this.f1639g = null;
        this.f1640h = 1.0f;
        this.f1641i = 1.0f;
        this.f1643k = 255;
        this.f1644l = 0.0f;
        this.f1645m = 0.0f;
        this.f1646n = 0;
        this.f1647o = 0;
        this.f1648p = Paint.Style.FILL_AND_STROKE;
        this.f1633a = f30Var;
        this.f1634b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        C0200eu c0200eu = new C0200eu(this);
        c0200eu.f1846e = true;
        return c0200eu;
    }

    public C0163du(C0163du c0163du) {
        this.f1635c = null;
        this.f1636d = null;
        this.f1637e = null;
        this.f1638f = PorterDuff.Mode.SRC_IN;
        this.f1639g = null;
        this.f1640h = 1.0f;
        this.f1641i = 1.0f;
        this.f1643k = 255;
        this.f1644l = 0.0f;
        this.f1645m = 0.0f;
        this.f1646n = 0;
        this.f1647o = 0;
        this.f1648p = Paint.Style.FILL_AND_STROKE;
        this.f1633a = c0163du.f1633a;
        this.f1634b = c0163du.f1634b;
        this.f1642j = c0163du.f1642j;
        this.f1635c = c0163du.f1635c;
        this.f1636d = c0163du.f1636d;
        this.f1638f = c0163du.f1638f;
        this.f1637e = c0163du.f1637e;
        this.f1643k = c0163du.f1643k;
        this.f1640h = c0163du.f1640h;
        this.f1647o = c0163du.f1647o;
        this.f1641i = c0163du.f1641i;
        this.f1644l = c0163du.f1644l;
        this.f1645m = c0163du.f1645m;
        this.f1646n = c0163du.f1646n;
        this.f1648p = c0163du.f1648p;
        if (c0163du.f1639g != null) {
            this.f1639g = new Rect(c0163du.f1639g);
        }
    }
}
