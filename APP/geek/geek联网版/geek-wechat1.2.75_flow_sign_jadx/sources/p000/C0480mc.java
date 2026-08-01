package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import com.github.megatronking.stringfog.Base64;
import java.util.HashMap;

/* JADX INFO: renamed from: mc */
/* JADX INFO: loaded from: classes.dex */
public final class C0480mc {

    /* JADX INFO: renamed from: a */
    public int f3119a;

    /* JADX INFO: renamed from: b */
    public int f3120b;

    /* JADX INFO: renamed from: c */
    public float f3121c;

    /* JADX INFO: renamed from: d */
    public String f3122d;

    /* JADX INFO: renamed from: e */
    public boolean f3123e;

    /* JADX INFO: renamed from: f */
    public int f3124f;

    public C0480mc(C0480mc c0480mc, Object obj) {
        c0480mc.getClass();
        this.f3119a = c0480mc.f3119a;
        m1821b(obj);
    }

    /* JADX INFO: renamed from: a */
    public static void m1820a(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC0947yy.f5511c);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        int i = 0;
        Object string2 = null;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            if (index == 0) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == 1) {
                string2 = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                i = 6;
            } else {
                int i3 = 3;
                if (index == 3) {
                    string2 = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else {
                    i3 = 4;
                    if (index == 2) {
                        string2 = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            string2 = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            string2 = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                        } else {
                            i3 = 5;
                            if (index == 5) {
                                string2 = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                                i = 2;
                            } else if (index == 6) {
                                string2 = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                                i = 1;
                            } else if (index == 8) {
                                string2 = typedArrayObtainStyledAttributes.getString(index);
                            }
                        }
                        i = 7;
                    }
                }
                i = i3;
            }
        }
        if (string != null && string2 != null) {
            C0480mc c0480mc = new C0480mc();
            c0480mc.f3119a = i;
            c0480mc.m1821b(string2);
            map.put(string, c0480mc);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: b */
    public final void m1821b(Object obj) {
        switch (g40.m1158u(this.f3119a)) {
            case Base64.DEFAULT /* 0 */:
                this.f3120b = ((Integer) obj).intValue();
                break;
            case Base64.NO_PADDING /* 1 */:
                this.f3121c = ((Float) obj).floatValue();
                break;
            case Base64.NO_WRAP /* 2 */:
            case 3:
                this.f3124f = ((Integer) obj).intValue();
                break;
            case 4:
                this.f3122d = (String) obj;
                break;
            case 5:
                this.f3123e = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.f3121c = ((Float) obj).floatValue();
                break;
        }
    }
}
