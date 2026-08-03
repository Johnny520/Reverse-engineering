package p075p;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;
import p069m.AbstractC0988h;

/* JADX INFO: renamed from: p.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1036b {

    /* JADX INFO: renamed from: a */
    public int f3864a;

    /* JADX INFO: renamed from: b */
    public int f3865b;

    /* JADX INFO: renamed from: c */
    public float f3866c;

    /* JADX INFO: renamed from: d */
    public String f3867d;

    /* JADX INFO: renamed from: e */
    public boolean f3868e;

    /* JADX INFO: renamed from: f */
    public int f3869f;

    public C1036b(C1036b c1036b, Object obj) {
        c1036b.getClass();
        this.f3864a = c1036b.f3864a;
        m2512b(obj);
    }

    /* JADX INFO: renamed from: a */
    public static void m2511a(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC1052r.f4052c);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        int i2 = 0;
        Object string2 = null;
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i3);
            if (index == 0) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == 1) {
                string2 = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                i2 = 6;
            } else {
                int i4 = 3;
                if (index == 3) {
                    string2 = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else {
                    i4 = 4;
                    if (index == 2) {
                        string2 = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            string2 = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            string2 = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                        } else {
                            i4 = 5;
                            if (index == 5) {
                                string2 = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                                i2 = 2;
                            } else if (index == 6) {
                                string2 = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                                i2 = 1;
                            } else if (index == 8) {
                                string2 = typedArrayObtainStyledAttributes.getString(index);
                            }
                        }
                        i2 = 7;
                    }
                }
                i2 = i4;
            }
        }
        if (string != null && string2 != null) {
            C1036b c1036b = new C1036b();
            c1036b.f3864a = i2;
            c1036b.m2512b(string2);
            map.put(string, c1036b);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: b */
    public final void m2512b(Object obj) {
        switch (AbstractC0988h.m2372a(this.f3864a)) {
            case 0:
                this.f3865b = ((Integer) obj).intValue();
                break;
            case 1:
                this.f3866c = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.f3869f = ((Integer) obj).intValue();
                break;
            case 4:
                this.f3867d = (String) obj;
                break;
            case 5:
                this.f3868e = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.f3866c = ((Float) obj).floatValue();
                break;
        }
    }
}
