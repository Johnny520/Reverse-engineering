package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;

/* JADX INFO: renamed from: db */
/* JADX INFO: loaded from: classes.dex */
public final class C1321db {

    /* JADX INFO: renamed from: a */
    public boolean f4783a = false;

    /* JADX INFO: renamed from: b */
    public int f4784b;

    /* JADX INFO: renamed from: c */
    public int f4785c;

    /* JADX INFO: renamed from: d */
    public float f4786d;

    /* JADX INFO: renamed from: e */
    public String f4787e;

    /* JADX INFO: renamed from: f */
    public boolean f4788f;

    /* JADX INFO: renamed from: g */
    public int f4789g;

    public C1321db(C1321db c1321db, Object obj) {
        c1321db.getClass();
        this.f4784b = c1321db.f4784b;
        m2571b(obj);
    }

    /* JADX INFO: renamed from: a */
    public static void m2570a(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC0639Ou.f2037d);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        int i = 0;
        boolean z = false;
        Object objValueOf = null;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            int i3 = 1;
            if (index == 0) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == 10) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z = true;
            } else if (index == 1) {
                objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                i = 6;
            } else {
                int i4 = 3;
                if (index == 3) {
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else {
                    i4 = 4;
                    if (index == 2) {
                        objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                        } else {
                            i4 = 5;
                            if (index == 5) {
                                objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                                i = 2;
                            } else {
                                if (index == 6) {
                                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                                } else if (index == 9) {
                                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                                } else {
                                    i3 = 8;
                                    if (index == 8) {
                                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                        if (resourceId == -1) {
                                            resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                                        }
                                        objValueOf = Integer.valueOf(resourceId);
                                    }
                                }
                                i = i3;
                            }
                        }
                        i = 7;
                    }
                }
                i = i4;
            }
        }
        if (string != null && objValueOf != null) {
            C1321db c1321db = new C1321db();
            c1321db.f4784b = i;
            c1321db.f4783a = z;
            c1321db.m2571b(objValueOf);
            map.put(string, c1321db);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: b */
    public final void m2571b(Object obj) {
        switch (AbstractC0213Ey.m424v(this.f4784b)) {
            case 0:
            case 7:
                this.f4785c = ((Integer) obj).intValue();
                break;
            case 1:
                this.f4786d = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.f4789g = ((Integer) obj).intValue();
                break;
            case 4:
                this.f4787e = (String) obj;
                break;
            case 5:
                this.f4788f = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.f4786d = ((Float) obj).floatValue();
                break;
        }
    }
}
