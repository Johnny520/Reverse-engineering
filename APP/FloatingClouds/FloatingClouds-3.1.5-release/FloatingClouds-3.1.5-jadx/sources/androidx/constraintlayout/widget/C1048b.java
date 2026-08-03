package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1048b {

    /* JADX INFO: renamed from: a */
    public a f4235a;

    /* JADX INFO: renamed from: b */
    public int f4236b;

    /* JADX INFO: renamed from: c */
    public float f4237c;

    /* JADX INFO: renamed from: d */
    public String f4238d;

    /* JADX INFO: renamed from: e */
    public boolean f4239e;

    /* JADX INFO: renamed from: f */
    public int f4240f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: androidx.constraintlayout.widget.b$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final a f4241a;

        /* JADX INFO: renamed from: b */
        public static final a f4242b;

        /* JADX INFO: renamed from: c */
        public static final a f4243c;

        /* JADX INFO: renamed from: d */
        public static final a f4244d;

        /* JADX INFO: renamed from: e */
        public static final a f4245e;

        /* JADX INFO: renamed from: f */
        public static final a f4246f;

        /* JADX INFO: renamed from: g */
        public static final a f4247g;

        /* JADX INFO: renamed from: h */
        public static final /* synthetic */ a[] f4248h;

        static {
            a aVar = new a("INT_TYPE", 0);
            f4241a = aVar;
            a aVar2 = new a("FLOAT_TYPE", 1);
            f4242b = aVar2;
            a aVar3 = new a("COLOR_TYPE", 2);
            f4243c = aVar3;
            a aVar4 = new a("COLOR_DRAWABLE_TYPE", 3);
            f4244d = aVar4;
            a aVar5 = new a("STRING_TYPE", 4);
            f4245e = aVar5;
            a aVar6 = new a("BOOLEAN_TYPE", 5);
            f4246f = aVar6;
            a aVar7 = new a("DIMENSION_TYPE", 6);
            f4247g = aVar7;
            f4248h = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f4248h.clone();
        }
    }

    public C1048b(C1048b c1048b, Object obj) {
        c1048b.getClass();
        this.f4235a = c1048b.f4235a;
        m2416b(obj);
    }

    /* JADX INFO: renamed from: a */
    public static void m2415a(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
        a aVar;
        Object string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C1046R.styleable.CustomAttribute);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string2 = null;
        Object objValueOf = null;
        a aVar2 = null;
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == C1046R.styleable.CustomAttribute_attributeName) {
                string2 = typedArrayObtainStyledAttributes.getString(index);
                if (string2 != null && string2.length() > 0) {
                    string2 = Character.toUpperCase(string2.charAt(0)) + string2.substring(1);
                }
            } else if (index == C1046R.styleable.CustomAttribute_customBoolean) {
                objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                aVar2 = a.f4246f;
            } else {
                if (index == C1046R.styleable.CustomAttribute_customColorValue) {
                    aVar = a.f4243c;
                    string = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == C1046R.styleable.CustomAttribute_customColorDrawableValue) {
                    aVar = a.f4244d;
                    string = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else {
                    int i2 = C1046R.styleable.CustomAttribute_customPixelDimension;
                    a aVar3 = a.f4247g;
                    if (index == i2) {
                        objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                    } else if (index == C1046R.styleable.CustomAttribute_customDimension) {
                        objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                    } else if (index == C1046R.styleable.CustomAttribute_customFloatValue) {
                        aVar = a.f4242b;
                        string = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                    } else if (index == C1046R.styleable.CustomAttribute_customIntegerValue) {
                        aVar = a.f4241a;
                        string = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                    } else if (index == C1046R.styleable.CustomAttribute_customStringValue) {
                        aVar = a.f4245e;
                        string = typedArrayObtainStyledAttributes.getString(index);
                    }
                    aVar2 = aVar3;
                }
                Object obj = string;
                aVar2 = aVar;
                objValueOf = obj;
            }
        }
        if (string2 != null && objValueOf != null) {
            C1048b c1048b = new C1048b();
            c1048b.f4235a = aVar2;
            c1048b.m2416b(objValueOf);
            map.put(string2, c1048b);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: b */
    public final void m2416b(Object obj) {
        switch (this.f4235a.ordinal()) {
            case 0:
                this.f4236b = ((Integer) obj).intValue();
                break;
            case 1:
                this.f4237c = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.f4240f = ((Integer) obj).intValue();
                break;
            case 4:
                this.f4238d = (String) obj;
                break;
            case 5:
                this.f4239e = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.f4237c = ((Float) obj).floatValue();
                break;
        }
    }
}
