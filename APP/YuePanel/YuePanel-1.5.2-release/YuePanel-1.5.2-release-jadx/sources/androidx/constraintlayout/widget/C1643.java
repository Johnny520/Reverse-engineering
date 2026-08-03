package androidx.constraintlayout.widget;

import Yue.C4308;
import Yue.C8273;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.widget.C8778;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.ۥ۟ */
/* JADX INFO: loaded from: classes.dex */
public class C1643 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final String f26608 = "TransitionLayout";

    /* JADX INFO: renamed from: ۥ */
    public String f3691;

    /* JADX INFO: renamed from: ۥ۟ */
    public EnumC8766 f3692;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f26609;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public float f26610;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public String f26611;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean f26612;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int f26613;

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.ۥ۟$ۥ, reason: contains not printable characters */
    public static /* synthetic */ class C8765 {

        /* JADX INFO: renamed from: ۥ */
        public static final /* synthetic */ int[] f3693;

        static {
            int[] iArr = new int[EnumC8766.values().length];
            f3693 = iArr;
            try {
                iArr[EnumC8766.COLOR_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3693[EnumC8766.COLOR_DRAWABLE_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3693[EnumC8766.INT_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3693[EnumC8766.FLOAT_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3693[EnumC8766.STRING_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3693[EnumC8766.BOOLEAN_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3693[EnumC8766.DIMENSION_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.ۥ۟$ۥ۟, reason: contains not printable characters */
    public enum EnumC8766 {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1643(String str, EnumC8766 enumC8766) {
        this.f3691 = str;
        this.f3692 = enumC8766;
    }

    /* JADX INFO: renamed from: ۥ */
    public static int m4707(int i) {
        int i2 = (i & (~(i >> 31))) - 255;
        return (i2 & (i2 >> 31)) + 255;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static HashMap<String, C1643> m29267(HashMap<String, C1643> map, View view) {
        HashMap<String, C1643> map2 = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            C1643 c1643 = map.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    map2.put(str, new C1643(c1643, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    map2.put(str, new C1643(c1643, cls.getMethod("getMap" + str, null).invoke(view, null)));
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            }
        }
        return map2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static void m29268(Context context, XmlPullParser xmlPullParser, HashMap<String, C1643> map) {
        EnumC8766 enumC8766;
        Object string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C8778.C8789.f28923);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string2 = null;
        Object objValueOf = null;
        EnumC8766 enumC87662 = null;
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == C8778.C8789.f28924) {
                string2 = typedArrayObtainStyledAttributes.getString(index);
                if (string2 != null && string2.length() > 0) {
                    string2 = Character.toUpperCase(string2.charAt(0)) + string2.substring(1);
                }
            } else if (index == C8778.C8789.f28925) {
                objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                enumC87662 = EnumC8766.BOOLEAN_TYPE;
            } else {
                if (index == C8778.C8789.f28927) {
                    enumC8766 = EnumC8766.COLOR_TYPE;
                    string = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == C8778.C8789.f28926) {
                    enumC8766 = EnumC8766.COLOR_DRAWABLE_TYPE;
                    string = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == C8778.C8789.f28931) {
                    enumC8766 = EnumC8766.DIMENSION_TYPE;
                    string = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == C8778.C8789.f28928) {
                    enumC8766 = EnumC8766.DIMENSION_TYPE;
                    string = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == C8778.C8789.f28929) {
                    enumC8766 = EnumC8766.FLOAT_TYPE;
                    string = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == C8778.C8789.f28930) {
                    enumC8766 = EnumC8766.INT_TYPE;
                    string = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                } else if (index == C8778.C8789.f28932) {
                    enumC8766 = EnumC8766.STRING_TYPE;
                    string = typedArrayObtainStyledAttributes.getString(index);
                }
                Object obj = string;
                enumC87662 = enumC8766;
                objValueOf = obj;
            }
        }
        if (string2 != null && objValueOf != null) {
            map.put(string2, new C1643(string2, enumC87662, objValueOf));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static void m29269(View view, HashMap<String, C1643> map) {
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            C1643 c1643 = map.get(str);
            String str2 = "set" + str;
            try {
                switch (C8765.f3693[c1643.f3692.ordinal()]) {
                    case 1:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(c1643.f26613));
                        break;
                    case 2:
                        Method method = cls.getMethod(str2, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(c1643.f26613);
                        method.invoke(view, colorDrawable);
                        break;
                    case 3:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(c1643.f26609));
                        break;
                    case 4:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(c1643.f26610));
                        break;
                    case 5:
                        cls.getMethod(str2, CharSequence.class).invoke(view, c1643.f26611);
                        break;
                    case 6:
                        cls.getMethod(str2, Boolean.TYPE).invoke(view, Boolean.valueOf(c1643.f26612));
                        break;
                    case 7:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(c1643.f26610));
                        break;
                }
            } catch (IllegalAccessException e) {
                Log.e(f26608, " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                e.printStackTrace();
            } catch (NoSuchMethodException e2) {
                Log.e(f26608, e2.getMessage());
                Log.e(f26608, " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                StringBuilder sb = new StringBuilder();
                sb.append(cls.getName());
                sb.append(" must have a method ");
                sb.append(str2);
                Log.e(f26608, sb.toString());
            } catch (InvocationTargetException e3) {
                Log.e(f26608, " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                e3.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public boolean m4708(C1643 c1643) {
        EnumC8766 enumC8766;
        if (c1643 == null || (enumC8766 = this.f3692) != c1643.f3692) {
            return false;
        }
        switch (C8765.f3693[enumC8766.ordinal()]) {
            case 1:
            case 2:
                return this.f26613 == c1643.f26613;
            case 3:
                return this.f26609 == c1643.f26609;
            case 4:
                return this.f26610 == c1643.f26610;
            case 5:
                return this.f26609 == c1643.f26609;
            case 6:
                return this.f26612 == c1643.f26612;
            case 7:
                return this.f26610 == c1643.f26610;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public EnumC8766 m29270() {
        return this.f3692;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public float m29271() {
        switch (C8765.f3693[this.f3692.ordinal()]) {
            case 1:
            case 2:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 3:
                return this.f26609;
            case 4:
                return this.f26610;
            case 5:
                throw new RuntimeException("Cannot interpolate String");
            case 6:
                return this.f26612 ? 1.0f : 0.0f;
            case 7:
                return this.f26610;
            default:
                return Float.NaN;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m29272(float[] fArr) {
        switch (C8765.f3693[this.f3692.ordinal()]) {
            case 1:
            case 2:
                int i = (this.f26613 >> 24) & 255;
                float fPow = (float) Math.pow(((r0 >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((r0 >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((r0 & 255) / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = i / 255.0f;
                return;
            case 3:
                fArr[0] = this.f26609;
                return;
            case 4:
                fArr[0] = this.f26610;
                return;
            case 5:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 6:
                fArr[0] = this.f26612 ? 1.0f : 0.0f;
                return;
            case 7:
                fArr[0] = this.f26610;
                return;
            default:
                return;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int m29273() {
        int i = C8765.f3693[this.f3692.ordinal()];
        return (i == 1 || i == 2) ? 4 : 1;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m29274(int i) {
        this.f26613 = i;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m29275(float f) {
        this.f26610 = f;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m29276(int i) {
        this.f26609 = i;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m29277(View view, float[] fArr) {
        Class<?> cls = view.getClass();
        String str = "set" + this.f3691;
        try {
            boolean z = true;
            switch (C8765.f3693[this.f3692.ordinal()]) {
                case 1:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf((m4707((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (m4707((int) (fArr[3] * 255.0f)) << 24) | (m4707((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | m4707((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f))));
                    return;
                case 2:
                    Method method = cls.getMethod(str, Drawable.class);
                    int iM4707 = (m4707((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (m4707((int) (fArr[3] * 255.0f)) << 24) | (m4707((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | m4707((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(iM4707);
                    method.invoke(view, colorDrawable);
                    return;
                case 3:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf((int) fArr[0]));
                    return;
                case 4:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                    return;
                case 5:
                    throw new RuntimeException("unable to interpolate strings " + this.f3691);
                case 6:
                    Method method2 = cls.getMethod(str, Boolean.TYPE);
                    if (fArr[0] <= 0.5f) {
                        z = false;
                    }
                    method2.invoke(view, Boolean.valueOf(z));
                    return;
                case 7:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e) {
            Log.e(f26608, "cannot access method " + str + "on View \"" + C4308.m12437(view) + "\"");
            e.printStackTrace();
        } catch (NoSuchMethodException e2) {
            Log.e(f26608, "no method " + str + "on View \"" + C4308.m12437(view) + "\"");
            e2.printStackTrace();
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void m29278(String str) {
        this.f26611 = str;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m29279(Object obj) {
        switch (C8765.f3693[this.f3692.ordinal()]) {
            case 1:
            case 2:
                this.f26613 = ((Integer) obj).intValue();
                break;
            case 3:
                this.f26609 = ((Integer) obj).intValue();
                break;
            case 4:
                this.f26610 = ((Float) obj).floatValue();
                break;
            case 5:
                this.f26611 = (String) obj;
                break;
            case 6:
                this.f26612 = ((Boolean) obj).booleanValue();
                break;
            case 7:
                this.f26610 = ((Float) obj).floatValue();
                break;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m29280(float[] fArr) {
        switch (C8765.f3693[this.f3692.ordinal()]) {
            case 1:
            case 2:
                int iHSVToColor = Color.HSVToColor(fArr);
                this.f26613 = iHSVToColor;
                this.f26613 = (m4707((int) (fArr[3] * 255.0f)) << 24) | (iHSVToColor & C8273.f24691);
                return;
            case 3:
                this.f26609 = (int) fArr[0];
                return;
            case 4:
                this.f26610 = fArr[0];
                return;
            case 5:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 6:
                this.f26612 = ((double) fArr[0]) > 0.5d;
                return;
            case 7:
                this.f26610 = fArr[0];
                return;
            default:
                return;
        }
    }

    public C1643(String str, EnumC8766 enumC8766, Object obj) {
        this.f3691 = str;
        this.f3692 = enumC8766;
        m29279(obj);
    }

    public C1643(C1643 c1643, Object obj) {
        this.f3691 = c1643.f3691;
        this.f3692 = c1643.f3692;
        m29279(obj);
    }
}
