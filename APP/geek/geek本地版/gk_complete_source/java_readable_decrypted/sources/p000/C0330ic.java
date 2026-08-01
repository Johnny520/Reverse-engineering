package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: ic */
/* JADX INFO: loaded from: classes.dex */
public final class C0330ic {

    /* JADX INFO: renamed from: a */
    public final float f2410a;

    /* JADX INFO: renamed from: b */
    public final float f2411b;

    /* JADX INFO: renamed from: c */
    public final float f2412c;

    /* JADX INFO: renamed from: d */
    public final float f2413d;

    /* JADX INFO: renamed from: e */
    public final int f2414e;

    public C0330ic(Context context, XmlResourceParser xmlResourceParser) {
        this.f2410a = Float.NaN;
        this.f2411b = Float.NaN;
        this.f2412c = Float.NaN;
        this.f2413d = Float.NaN;
        this.f2414e = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC0688ry.f4357i);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f2414e);
                this.f2414e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new C0554oc().m2010b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f2413d = typedArrayObtainStyledAttributes.getDimension(index, this.f2413d);
            } else if (index == 2) {
                this.f2411b = typedArrayObtainStyledAttributes.getDimension(index, this.f2411b);
            } else if (index == 3) {
                this.f2412c = typedArrayObtainStyledAttributes.getDimension(index, this.f2412c);
            } else if (index == 4) {
                this.f2410a = typedArrayObtainStyledAttributes.getDimension(index, this.f2410a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
