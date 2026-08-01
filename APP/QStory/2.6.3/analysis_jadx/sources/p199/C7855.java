package p199;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintAttribute$AttributeType;
import java.util.HashMap;

/* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7855 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f21489;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public String f21490;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public float f21491;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f21492;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public ConstraintAttribute$AttributeType f21493;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean f21494 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f21495;

    public C7855(C7855 c7855, Object obj) {
        c7855.getClass();
        this.f21493 = c7855.f21493;
        m13212(obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m13211(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
        ConstraintAttribute$AttributeType constraintAttribute$AttributeType;
        Object objValueOf;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC7862.f21521);
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
            C7855 c7855 = new C7855();
            c7855.f21493 = constraintAttribute$AttributeType2;
            c7855.f21494 = z;
            c7855.m13212(objValueOf2);
            map.put(string, c7855);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m13212(Object obj) {
        switch (this.f21493) {
            case INT_TYPE:
            case REFERENCE_TYPE:
                this.f21492 = ((Integer) obj).intValue();
                break;
            case FLOAT_TYPE:
                this.f21491 = ((Float) obj).floatValue();
                break;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                this.f21495 = ((Integer) obj).intValue();
                break;
            case STRING_TYPE:
                this.f21490 = (String) obj;
                break;
            case BOOLEAN_TYPE:
                this.f21489 = ((Boolean) obj).booleanValue();
                break;
            case DIMENSION_TYPE:
                this.f21491 = ((Float) obj).floatValue();
                break;
        }
    }
}
