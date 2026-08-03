package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: jb */
/* JADX INFO: loaded from: classes.dex */
public final class C2097jb {

    /* JADX INFO: renamed from: a */
    public final float f7380a;

    /* JADX INFO: renamed from: b */
    public final float f7381b;

    /* JADX INFO: renamed from: c */
    public final float f7382c;

    /* JADX INFO: renamed from: d */
    public final float f7383d;

    /* JADX INFO: renamed from: e */
    public final int f7384e;

    public C2097jb(Context r7, XmlResourceParser r8) {
        this.f7380a = Float.NaN;
        this.f7381b = Float.NaN;
        this.f7382c = Float.NaN;
        this.f7383d = Float.NaN;
        this.f7384e = -1;
        TypedArray r82 = r7.obtainStyledAttributes(Xml.asAttributeSet(r8), AbstractC0639Ou.f2044k);
        int r0 = r82.getIndexCount();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L22;
        int r2 = r82.getIndex(r1);
        if (r2 != 0) goto L10;
        int r22 = r82.getResourceId(r2, this.f7384e);
        this.f7384e = r22;
        String r3 = r7.getResources().getResourceTypeName(r22);
        r7.getResources().getResourceName(r22);
        if ("layout".equals(r3) == false) goto L21;
        new C2411qb().m4854b((ConstraintLayout) LayoutInflater.from(r7).inflate(r22, null));
    L21:
        r1 = r1 + 1;
        goto L3
    L10:
        if (r2 != 1) goto L13;
        this.f7383d = r82.getDimension(r2, this.f7383d);
        goto L21
    L13:
        if (r2 != 2) goto L16;
        this.f7381b = r82.getDimension(r2, this.f7381b);
        goto L21
    L16:
        if (r2 != 3) goto L19;
        this.f7382c = r82.getDimension(r2, this.f7382c);
        goto L21
    L19:
        if (r2 != 4) goto L21;
        this.f7380a = r82.getDimension(r2, this.f7380a);
        goto L21
    L22:
        r82.recycle();
    }
}
