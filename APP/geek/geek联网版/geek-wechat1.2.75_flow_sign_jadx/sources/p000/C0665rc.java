package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: rc */
/* JADX INFO: loaded from: classes.dex */
public final class C0665rc {

    /* JADX INFO: renamed from: a */
    public final float f4116a;

    /* JADX INFO: renamed from: b */
    public final float f4117b;

    /* JADX INFO: renamed from: c */
    public final float f4118c;

    /* JADX INFO: renamed from: d */
    public final float f4119d;

    /* JADX INFO: renamed from: e */
    public final int f4120e;

    public C0665rc(Context context, XmlResourceParser xmlResourceParser) {
        this.f4116a = Float.NaN;
        this.f4117b = Float.NaN;
        this.f4118c = Float.NaN;
        this.f4119d = Float.NaN;
        this.f4120e = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC0947yy.f5517i);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f4120e);
                this.f4120e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new C0888xc().m2679b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f4119d = typedArrayObtainStyledAttributes.getDimension(index, this.f4119d);
            } else if (index == 2) {
                this.f4117b = typedArrayObtainStyledAttributes.getDimension(index, this.f4117b);
            } else if (index == 3) {
                this.f4118c = typedArrayObtainStyledAttributes.getDimension(index, this.f4118c);
            } else if (index == 4) {
                this.f4116a = typedArrayObtainStyledAttributes.getDimension(index, this.f4116a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
