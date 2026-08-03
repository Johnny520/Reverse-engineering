package p075p;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* JADX INFO: renamed from: p.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1041g {

    /* JADX INFO: renamed from: a */
    public final int f3947a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f3948b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final int f3949c;

    public C1041g(Context context, XmlResourceParser xmlResourceParser) {
        this.f3949c = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC1052r.f4056g);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            if (index == 0) {
                this.f3947a = typedArrayObtainStyledAttributes.getResourceId(index, this.f3947a);
            } else if (index == 1) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f3949c);
                this.f3949c = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new C1048n().m2529b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
