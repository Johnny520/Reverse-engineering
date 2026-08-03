package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
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

    public C2097jb(Context context, XmlResourceParser xmlResourceParser) {
        this.f7380a = Float.NaN;
        this.f7381b = Float.NaN;
        this.f7382c = Float.NaN;
        this.f7383d = Float.NaN;
        this.f7384e = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC0639Ou.f2044k);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f7384e);
                this.f7384e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new C2411qb().m4854b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f7383d = typedArrayObtainStyledAttributes.getDimension(index, this.f7383d);
            } else if (index == 2) {
                this.f7381b = typedArrayObtainStyledAttributes.getDimension(index, this.f7381b);
            } else if (index == 3) {
                this.f7382c = typedArrayObtainStyledAttributes.getDimension(index, this.f7382c);
            } else if (index == 4) {
                this.f7380a = typedArrayObtainStyledAttributes.getDimension(index, this.f7380a);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
