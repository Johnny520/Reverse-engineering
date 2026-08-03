package p075p;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
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

    public C1042h(Context context, XmlResourceParser xmlResourceParser) {
        this.f3950a = Float.NaN;
        this.f3951b = Float.NaN;
        this.f3952c = Float.NaN;
        this.f3953d = Float.NaN;
        this.f3954e = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC1052r.f4058i);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            if (index == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f3954e);
                this.f3954e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new C1048n().m2529b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f3953d = typedArrayObtainStyledAttributes.getDimension(index, this.f3953d);
            } else if (index == 2) {
                this.f3951b = typedArrayObtainStyledAttributes.getDimension(index, this.f3951b);
            } else if (index == 3) {
                this.f3952c = typedArrayObtainStyledAttributes.getDimension(index, this.f3952c);
            } else if (index == 4) {
                this.f3950a = typedArrayObtainStyledAttributes.getDimension(index, this.f3950a);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
