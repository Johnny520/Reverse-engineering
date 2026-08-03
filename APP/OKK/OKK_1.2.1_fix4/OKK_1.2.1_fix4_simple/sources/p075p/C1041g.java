package p075p;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* JADX INFO: renamed from: p.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1041g {

    /* JADX INFO: renamed from: a */
    public final int f3947a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f3948b;

    /* JADX INFO: renamed from: c */
    public final int f3949c;

    public C1041g(Context r7, XmlResourceParser r8) {
        this.f3948b = new ArrayList();
        this.f3949c = -1;
        TypedArray r82 = r7.obtainStyledAttributes(Xml.asAttributeSet(r8), AbstractC1052r.f4056g);
        int r02 = r82.getIndexCount();
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L13;
        int r2 = r82.getIndex(r1);
        if (r2 != 0) goto L8;
        this.f3947a = r82.getResourceId(r2, this.f3947a);
    L12:
        r1 = r1 + 1;
        goto L3
    L8:
        if (r2 != 1) goto L12;
        int r22 = r82.getResourceId(r2, this.f3949c);
        this.f3949c = r22;
        String r3 = r7.getResources().getResourceTypeName(r22);
        r7.getResources().getResourceName(r22);
        if ("layout".equals(r3) == false) goto L12;
        new C1048n().m2529b((ConstraintLayout) LayoutInflater.from(r7).inflate(r22, null));
        goto L12
    L13:
        r82.recycle();
    }
}
