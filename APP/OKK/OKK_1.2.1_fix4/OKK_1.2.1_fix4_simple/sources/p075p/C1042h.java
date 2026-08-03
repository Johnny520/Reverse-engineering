package p075p;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: p.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1042h {

    /* JADX INFO: renamed from: a */
    public final float f3950a;

    /* JADX INFO: renamed from: b */
    public final float f3951b;

    /* JADX INFO: renamed from: c */
    public final float f3952c;

    /* JADX INFO: renamed from: d */
    public final float f3953d;

    /* JADX INFO: renamed from: e */
    public final int f3954e;

    public C1042h(Context r7, XmlResourceParser r8) {
        this.f3950a = Float.NaN;
        this.f3951b = Float.NaN;
        this.f3952c = Float.NaN;
        this.f3953d = Float.NaN;
        this.f3954e = -1;
        TypedArray r82 = r7.obtainStyledAttributes(Xml.asAttributeSet(r8), AbstractC1052r.f4058i);
        int r02 = r82.getIndexCount();
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L22;
        int r2 = r82.getIndex(r1);
        if (r2 != 0) goto L10;
        int r22 = r82.getResourceId(r2, this.f3954e);
        this.f3954e = r22;
        String r3 = r7.getResources().getResourceTypeName(r22);
        r7.getResources().getResourceName(r22);
        if ("layout".equals(r3) == false) goto L21;
        new C1048n().m2529b((ConstraintLayout) LayoutInflater.from(r7).inflate(r22, null));
    L21:
        r1 = r1 + 1;
        goto L3
    L10:
        if (r2 != 1) goto L13;
        this.f3953d = r82.getDimension(r2, this.f3953d);
        goto L21
    L13:
        if (r2 != 2) goto L16;
        this.f3951b = r82.getDimension(r2, this.f3951b);
        goto L21
    L16:
        if (r2 != 3) goto L19;
        this.f3952c = r82.getDimension(r2, this.f3952c);
        goto L21
    L19:
        if (r2 != 4) goto L21;
        this.f3950a = r82.getDimension(r2, this.f3950a);
        goto L21
    L22:
        r82.recycle();
    }
}
