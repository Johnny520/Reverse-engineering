package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import io.sentry.android.core.internal.threaddump.C1711a;
import java.util.ArrayList;

/* JADX INFO: renamed from: ib */
/* JADX INFO: loaded from: classes.dex */
public final class C1540ib {

    /* JADX INFO: renamed from: a */
    public final ArrayList f5435a;

    /* JADX INFO: renamed from: b */
    public final int f5436b;

    /* JADX INFO: renamed from: c */
    public int f5437c;

    public C1540ib(ArrayList r1) {
        this.f5435a = r1;
        this.f5436b = r1.size();
    }

    /* JADX INFO: renamed from: a */
    public C1711a m2955a() {
        int r0 = this.f5437c;
        if (r0 >= 0) goto L5;
        return null;
    L5:
        if (r0 >= this.f5436b) goto L10;
        this.f5437c = r0 + 1;
        return (C1711a) this.f5435a.get(r0);
    L10:
        return null;
    }

    public C1540ib(Context r7, XmlResourceParser r8) {
        this.f5435a = new ArrayList();
        this.f5437c = -1;
        TypedArray r82 = r7.obtainStyledAttributes(Xml.asAttributeSet(r8), AbstractC0639Ou.f2042i);
        int r0 = r82.getIndexCount();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L13;
        int r2 = r82.getIndex(r1);
        if (r2 != 0) goto L8;
        this.f5436b = r82.getResourceId(r2, this.f5436b);
    L12:
        r1 = r1 + 1;
        goto L3
    L8:
        if (r2 != 1) goto L12;
        int r22 = r82.getResourceId(r2, this.f5437c);
        this.f5437c = r22;
        String r3 = r7.getResources().getResourceTypeName(r22);
        r7.getResources().getResourceName(r22);
        if ("layout".equals(r3) == false) goto L12;
        new C2411qb().m4854b((ConstraintLayout) LayoutInflater.from(r7).inflate(r22, null));
        goto L12
    L13:
        r82.recycle();
    }
}
