package p199;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintAttribute$AttributeType;
import java.util.HashMap;

/* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7854 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f21492;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public String f21493;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public float f21494;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f21495;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public ConstraintAttribute$AttributeType f21496;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean f21497 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f21498;

    public C7854(C7854 c7854, Object obj) {
        c7854.getClass();
        this.f21496 = c7854.f21496;
        m13184(obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m13183(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
        ConstraintAttribute$AttributeType constraintAttribute$AttributeType;
        Object objValueOf;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC7861.f21524);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        Object objValueOf2 = null;
        ConstraintAttribute$AttributeType constraintAttribute$AttributeType2 = null;
        boolean z = false;
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == 10) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z = true;
            } else if (index == 1) {
                objValueOf2 = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                constraintAttribute$AttributeType2 = ConstraintAttribute$AttributeType.BOOLEAN_TYPE;
            } else {
                if (index == 3) {
                    constraintAttribute$AttributeType = ConstraintAttribute$AttributeType.COLOR_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == 2) {
                    constraintAttribute$AttributeType = ConstraintAttribute$AttributeType.COLOR_DRAWABLE_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == 7) {
                    constraintAttribute$AttributeType = ConstraintAttribute$AttributeType.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == 4) {
                    constraintAttribute$AttributeType = ConstraintAttribute$AttributeType.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == 5) {
                    constraintAttribute$AttributeType = ConstraintAttribute$AttributeType.FLOAT_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == 6) {
                    constraintAttribute$AttributeType = ConstraintAttribute$AttributeType.INT_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                } else if (index == 9) {
                    constraintAttribute$AttributeType = ConstraintAttribute$AttributeType.STRING_TYPE;
                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == 8) {
                    constraintAttribute$AttributeType = ConstraintAttribute$AttributeType.REFERENCE_TYPE;
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    objValueOf = Integer.valueOf(resourceId);
                }
                Object obj = objValueOf;
                constraintAttribute$AttributeType2 = constraintAttribute$AttributeType;
                objValueOf2 = obj;
            }
        }
        if (string != null && objValueOf2 != null) {
            C7854 c7854 = new C7854();
            c7854.f21496 = constraintAttribute$AttributeType2;
            c7854.f21497 = z;
            c7854.m13184(objValueOf2);
            map.put(string, c7854);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m13184(Object obj) {
        switch (this.f21496) {
            case INT_TYPE:
            case REFERENCE_TYPE:
                this.f21495 = ((Integer) obj).intValue();
                break;
            case FLOAT_TYPE:
                this.f21494 = ((Float) obj).floatValue();
                break;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                this.f21498 = ((Integer) obj).intValue();
                break;
            case STRING_TYPE:
                this.f21493 = (String) obj;
                break;
            case BOOLEAN_TYPE:
                this.f21492 = ((Boolean) obj).booleanValue();
                break;
            case DIMENSION_TYPE:
                this.f21494 = ((Float) obj).floatValue();
                break;
        }
    }
}
