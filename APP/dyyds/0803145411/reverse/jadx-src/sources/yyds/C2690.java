package yyds;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;

/* JADX INFO: renamed from: yyds.ᲈᛶᲇᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2690 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final int f13224;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final float f13225;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final float f13226;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final float f13227;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final float f13228;

    public C2690(Context context, XmlResourceParser xmlResourceParser) {
        this.f13225 = Float.NaN;
        this.f13226 = Float.NaN;
        this.f13227 = Float.NaN;
        this.f13228 = Float.NaN;
        this.f13224 = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC1164.f5357);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f13224);
                this.f13224 = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new C0595().m1475(context, resourceId);
                }
            } else if (index == 1) {
                this.f13228 = typedArrayObtainStyledAttributes.getDimension(index, this.f13228);
            } else if (index == 2) {
                this.f13226 = typedArrayObtainStyledAttributes.getDimension(index, this.f13226);
            } else if (index == 3) {
                this.f13227 = typedArrayObtainStyledAttributes.getDimension(index, this.f13227);
            } else if (index == 4) {
                this.f13225 = typedArrayObtainStyledAttributes.getDimension(index, this.f13225);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
