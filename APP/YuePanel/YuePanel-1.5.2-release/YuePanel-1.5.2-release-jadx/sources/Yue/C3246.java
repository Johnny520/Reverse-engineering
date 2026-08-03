package Yue;

import Yue.C6625;
import Yue.InterfaceC7144;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: Yue.ۥ۟۠ۧ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public class C3246 {

    /* JADX INFO: renamed from: ۥ */
    public static final String f163 = "AnimatorInflater";

    /* JADX INFO: renamed from: ۥ۟ */
    public static final int f164 = 0;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f4996 = 100;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f4997 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f4998 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f4999 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int f5000 = 3;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int f5001 = 4;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final boolean f5002 = false;

    /* JADX INFO: renamed from: Yue.ۥ۟۠ۧ۠$ۥ */
    public static class C0096 implements TypeEvaluator<C6625.C1035[]> {

        /* JADX INFO: renamed from: ۥ */
        public C6625.C1035[] f165;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C0096() {
        }

        /* JADX DEBUG: Method merged with bridge method: evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public C6625.C1035[] evaluate(float f, C6625.C1035[] c1035Arr, C6625.C1035[] c1035Arr2) {
            if (!C6625.m3102(c1035Arr, c1035Arr2)) {
                throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
            }
            if (!C6625.m3102(this.f165, c1035Arr)) {
                this.f165 = C6625.m21068(c1035Arr);
            }
            for (int i = 0; i < c1035Arr.length; i++) {
                this.f165[i].m21084(c1035Arr[i], c1035Arr2[i], f);
            }
            return this.f165;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0096(C6625.C1035[] c1035Arr) {
            this.f165 = c1035Arr;
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public static Animator m326(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f) throws XmlPullParserException, IOException {
        return m327(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00dd, code lost:
    
        if (r23 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00df, code lost:
    
        if (r13 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e1, code lost:
    
        r1 = new android.animation.Animator[r13.size()];
        r2 = r13.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ef, code lost:
    
        if (r2.hasNext() == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f1, code lost:
    
        r1[r14] = (android.animation.Animator) r2.next();
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fd, code lost:
    
        if (r24 != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ff, code lost:
    
        r23.playTogether(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0103, code lost:
    
        r23.playSequentially(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0106, code lost:
    
        return r0;
     */
    /* JADX INFO: renamed from: ۥ۟ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Animator m327(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i, float f) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        Animator animatorM6640 = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            int i2 = 0;
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                break;
            }
            if (next == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("objectAnimator")) {
                    animatorM6640 = m6642(context, resources, theme, attributeSet, f, xmlPullParser);
                } else if (name.equals("animator")) {
                    animatorM6640 = m6640(context, resources, theme, attributeSet, null, f, xmlPullParser);
                } else {
                    if (name.equals("set")) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        TypedArray typedArrayM25330 = C8021.m25330(resources, theme, attributeSet, C3213.f4918);
                        m327(context, resources, theme, xmlPullParser, attributeSet, animatorSet2, C8021.m25322(typedArrayM25330, xmlPullParser, "ordering", 0, 0), f);
                        typedArrayM25330.recycle();
                        animatorM6640 = animatorSet2;
                    } else {
                        if (!name.equals("propertyValuesHolder")) {
                            throw new RuntimeException("Unknown animator name: " + xmlPullParser.getName());
                        }
                        PropertyValuesHolder[] propertyValuesHolderArrM6644 = m6644(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser));
                        if (propertyValuesHolderArrM6644 != null && (animatorM6640 instanceof ValueAnimator)) {
                            ((ValueAnimator) animatorM6640).setValues(propertyValuesHolderArrM6644);
                        }
                        i2 = 1;
                    }
                    if (animatorSet == null && i2 == 0) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(animatorM6640);
                    }
                }
                if (animatorSet == null) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static Keyframe m6630(Keyframe keyframe, float f) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f) : Keyframe.ofObject(f);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m6631(Keyframe[] keyframeArr, float f, int i, int i2) {
        float f2 = f / ((i2 - i) + 2);
        while (i <= i2) {
            keyframeArr[i].setFraction(keyframeArr[i - 1].getFraction() + f2);
            i++;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static void m6632(Object[] objArr, String str) {
        if (objArr == null || objArr.length == 0) {
            return;
        }
        Log.d(f163, str);
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            Keyframe keyframe = (Keyframe) objArr[i];
            StringBuilder sb = new StringBuilder();
            sb.append("Keyframe ");
            sb.append(i);
            sb.append(": fraction ");
            Object value = "null";
            sb.append(keyframe.getFraction() < 0.0f ? "null" : Float.valueOf(keyframe.getFraction()));
            sb.append(", , value : ");
            if (keyframe.hasValue()) {
                value = keyframe.getValue();
            }
            sb.append(value);
            Log.d(f163, sb.toString());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static PropertyValuesHolder m6633(TypedArray typedArray, int i, int i2, int i3, String str) {
        PropertyValuesHolder propertyValuesHolderOfFloat;
        PropertyValuesHolder propertyValuesHolderOfObject;
        TypedValue typedValuePeekValue = typedArray.peekValue(i2);
        boolean z = typedValuePeekValue != null;
        int i4 = z ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i3);
        boolean z2 = typedValuePeekValue2 != null;
        int i5 = z2 ? typedValuePeekValue2.type : 0;
        if (i == 4) {
            i = ((z && m6636(i4)) || (z2 && m6636(i5))) ? 3 : 0;
        }
        boolean z3 = i == 0;
        PropertyValuesHolder propertyValuesHolderOfInt = null;
        if (i != 2) {
            C3376 c3376M462 = i == 3 ? C3376.m462() : null;
            if (z3) {
                if (z) {
                    float dimension = i4 == 5 ? typedArray.getDimension(i2, 0.0f) : typedArray.getFloat(i2, 0.0f);
                    if (z2) {
                        propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
                    } else {
                        propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension);
                    }
                } else {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
                }
                propertyValuesHolderOfInt = propertyValuesHolderOfFloat;
            } else if (z) {
                int dimension2 = i4 == 5 ? (int) typedArray.getDimension(i2, 0.0f) : m6636(i4) ? typedArray.getColor(i2, 0) : typedArray.getInt(i2, 0);
                if (z2) {
                    propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, dimension2, i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : m6636(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0));
                } else {
                    propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, dimension2);
                }
            } else if (z2) {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : m6636(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0));
            }
            if (propertyValuesHolderOfInt == null || c3376M462 == null) {
                return propertyValuesHolderOfInt;
            }
            propertyValuesHolderOfInt.setEvaluator(c3376M462);
            return propertyValuesHolderOfInt;
        }
        String string = typedArray.getString(i2);
        String string2 = typedArray.getString(i3);
        C6625.C1035[] c1035ArrM21066 = C6625.m21066(string);
        C6625.C1035[] c1035ArrM210662 = C6625.m21066(string2);
        if (c1035ArrM21066 == null && c1035ArrM210662 == null) {
            return null;
        }
        if (c1035ArrM21066 == null) {
            if (c1035ArrM210662 != null) {
                return PropertyValuesHolder.ofObject(str, new C0096(), c1035ArrM210662);
            }
            return null;
        }
        C0096 c0096 = new C0096();
        if (c1035ArrM210662 == null) {
            propertyValuesHolderOfObject = PropertyValuesHolder.ofObject(str, c0096, c1035ArrM21066);
        } else {
            if (!C6625.m3102(c1035ArrM21066, c1035ArrM210662)) {
                throw new InflateException(" Can't morph from " + string + " to " + string2);
            }
            propertyValuesHolderOfObject = PropertyValuesHolder.ofObject(str, c0096, c1035ArrM21066, c1035ArrM210662);
        }
        return propertyValuesHolderOfObject;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static int m6634(TypedArray typedArray, int i, int i2) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        boolean z = typedValuePeekValue != null;
        int i3 = z ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i2);
        boolean z2 = typedValuePeekValue2 != null;
        return ((z && m6636(i3)) || (z2 && m6636(z2 ? typedValuePeekValue2.type : 0))) ? 3 : 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static int m6635(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray typedArrayM25330 = C8021.m25330(resources, theme, attributeSet, C3213.f4925);
        int i = 0;
        TypedValue typedValueM25331 = C8021.m25331(typedArrayM25330, xmlPullParser, "value", 0);
        if (typedValueM25331 != null && m6636(typedValueM25331.type)) {
            i = 3;
        }
        typedArrayM25330.recycle();
        return i;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static boolean m6636(int i) {
        return i >= 28 && i <= 31;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static Animator m6637(Context context, @InterfaceC3258 int i) throws Resources.NotFoundException {
        return AnimatorInflater.loadAnimator(context, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static Animator m6638(Context context, Resources resources, Resources.Theme theme, @InterfaceC3258 int i) throws Resources.NotFoundException {
        return m6639(context, resources, theme, i, 1.0f);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static Animator m6639(Context context, Resources resources, Resources.Theme theme, @InterfaceC3258 int i, float f) throws Resources.NotFoundException {
        XmlResourceParser animation = null;
        try {
            try {
                try {
                    animation = resources.getAnimation(i);
                    return m326(context, resources, theme, animation, f);
                } catch (IOException e) {
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                    notFoundException.initCause(e);
                    throw notFoundException;
                }
            } catch (XmlPullParserException e2) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                notFoundException2.initCause(e2);
                throw notFoundException2;
            }
        } finally {
            if (animation != null) {
                animation.close();
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static ValueAnimator m6640(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        TypedArray typedArrayM25330 = C8021.m25330(resources, theme, attributeSet, C3213.f4909);
        TypedArray typedArrayM253302 = C8021.m25330(resources, theme, attributeSet, C3213.f4930);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        m6645(valueAnimator, typedArrayM25330, typedArrayM253302, f, xmlPullParser);
        int iM25323 = C8021.m25323(typedArrayM25330, xmlPullParser, "interpolator", 0, 0);
        if (iM25323 > 0) {
            valueAnimator.setInterpolator(C3245.m325(context, iM25323));
        }
        typedArrayM25330.recycle();
        if (typedArrayM253302 != null) {
            typedArrayM253302.recycle();
        }
        return valueAnimator;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static Keyframe m6641(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        TypedArray typedArrayM25330 = C8021.m25330(resources, theme, attributeSet, C3213.f4925);
        float fM25321 = C8021.m25321(typedArrayM25330, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue typedValueM25331 = C8021.m25331(typedArrayM25330, xmlPullParser, "value", 0);
        boolean z = typedValueM25331 != null;
        if (i == 4) {
            i = (z && m6636(typedValueM25331.type)) ? 3 : 0;
        }
        Keyframe keyframeOfInt = z ? i != 0 ? (i == 1 || i == 3) ? Keyframe.ofInt(fM25321, C8021.m25322(typedArrayM25330, xmlPullParser, "value", 0, 0)) : null : Keyframe.ofFloat(fM25321, C8021.m25321(typedArrayM25330, xmlPullParser, "value", 0, 0.0f)) : i == 0 ? Keyframe.ofFloat(fM25321) : Keyframe.ofInt(fM25321);
        int iM25323 = C8021.m25323(typedArrayM25330, xmlPullParser, "interpolator", 1, 0);
        if (iM25323 > 0) {
            keyframeOfInt.setInterpolator(C3245.m325(context, iM25323));
        }
        typedArrayM25330.recycle();
        return keyframeOfInt;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static ObjectAnimator m6642(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        m6640(context, resources, theme, attributeSet, objectAnimator, f, xmlPullParser);
        return objectAnimator;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static PropertyValuesHolder m6643(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, String str, int i) throws XmlPullParserException, IOException {
        int size;
        PropertyValuesHolder propertyValuesHolderOfKeyframe = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                break;
            }
            if (xmlPullParser.getName().equals("keyframe")) {
                if (i == 4) {
                    i = m6635(resources, theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                }
                Keyframe keyframeM6641 = m6641(context, resources, theme, Xml.asAttributeSet(xmlPullParser), i, xmlPullParser);
                if (keyframeM6641 != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(keyframeM6641);
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null && (size = arrayList.size()) > 0) {
            Keyframe keyframe = (Keyframe) arrayList.get(0);
            Keyframe keyframe2 = (Keyframe) arrayList.get(size - 1);
            float fraction = keyframe2.getFraction();
            if (fraction < 1.0f) {
                if (fraction < 0.0f) {
                    keyframe2.setFraction(1.0f);
                } else {
                    arrayList.add(arrayList.size(), m6630(keyframe2, 1.0f));
                    size++;
                }
            }
            float fraction2 = keyframe.getFraction();
            if (fraction2 != 0.0f) {
                if (fraction2 < 0.0f) {
                    keyframe.setFraction(0.0f);
                } else {
                    arrayList.add(0, m6630(keyframe, 0.0f));
                    size++;
                }
            }
            Keyframe[] keyframeArr = new Keyframe[size];
            arrayList.toArray(keyframeArr);
            for (int i2 = 0; i2 < size; i2++) {
                Keyframe keyframe3 = keyframeArr[i2];
                if (keyframe3.getFraction() < 0.0f) {
                    if (i2 == 0) {
                        keyframe3.setFraction(0.0f);
                    } else {
                        int i3 = size - 1;
                        if (i2 == i3) {
                            keyframe3.setFraction(1.0f);
                        } else {
                            int i4 = i2;
                            for (int i5 = i2 + 1; i5 < i3 && keyframeArr[i5].getFraction() < 0.0f; i5++) {
                                i4 = i5;
                            }
                            m6631(keyframeArr, keyframeArr[i4 + 1].getFraction() - keyframeArr[i2 - 1].getFraction(), i2, i4);
                        }
                    }
                }
            }
            propertyValuesHolderOfKeyframe = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
            if (i == 3) {
                propertyValuesHolderOfKeyframe.setEvaluator(C3376.m462());
            }
        }
        return propertyValuesHolderOfKeyframe;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static PropertyValuesHolder[] m6644(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int i;
        PropertyValuesHolder[] propertyValuesHolderArr = null;
        ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            if (eventType == 3 || eventType == 1) {
                break;
            }
            if (eventType != 2) {
                xmlPullParser.next();
            } else {
                if (xmlPullParser.getName().equals("propertyValuesHolder")) {
                    TypedArray typedArrayM25330 = C8021.m25330(resources, theme, attributeSet, C3213.f4920);
                    String strM25324 = C8021.m25324(typedArrayM25330, xmlPullParser, "propertyName", 3);
                    int iM25322 = C8021.m25322(typedArrayM25330, xmlPullParser, "valueType", 2, 4);
                    PropertyValuesHolder propertyValuesHolderM6643 = m6643(context, resources, theme, xmlPullParser, strM25324, iM25322);
                    if (propertyValuesHolderM6643 == null) {
                        propertyValuesHolderM6643 = m6633(typedArrayM25330, iM25322, 0, 1, strM25324);
                    }
                    if (propertyValuesHolderM6643 != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(propertyValuesHolderM6643);
                    }
                    typedArrayM25330.recycle();
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            propertyValuesHolderArr = new PropertyValuesHolder[size];
            for (i = 0; i < size; i++) {
                propertyValuesHolderArr[i] = (PropertyValuesHolder) arrayList.get(i);
            }
        }
        return propertyValuesHolderArr;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static void m6645(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f, XmlPullParser xmlPullParser) {
        long jM25322 = C8021.m25322(typedArray, xmlPullParser, "duration", 1, 300);
        long jM253222 = C8021.m25322(typedArray, xmlPullParser, "startOffset", 2, 0);
        int iM25322 = C8021.m25322(typedArray, xmlPullParser, "valueType", 7, 4);
        if (C8021.m25329(xmlPullParser, "valueFrom") && C8021.m25329(xmlPullParser, "valueTo")) {
            if (iM25322 == 4) {
                iM25322 = m6634(typedArray, 5, 6);
            }
            PropertyValuesHolder propertyValuesHolderM6633 = m6633(typedArray, iM25322, 5, 6, "");
            if (propertyValuesHolderM6633 != null) {
                valueAnimator.setValues(propertyValuesHolderM6633);
            }
        }
        valueAnimator.setDuration(jM25322);
        valueAnimator.setStartDelay(jM253222);
        valueAnimator.setRepeatCount(C8021.m25322(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(C8021.m25322(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            m6646(valueAnimator, typedArray2, iM25322, f, xmlPullParser);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static void m6646(ValueAnimator valueAnimator, TypedArray typedArray, int i, float f, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String strM25324 = C8021.m25324(typedArray, xmlPullParser, "pathData", 1);
        if (strM25324 == null) {
            objectAnimator.setPropertyName(C8021.m25324(typedArray, xmlPullParser, "propertyName", 0));
            return;
        }
        String strM253242 = C8021.m25324(typedArray, xmlPullParser, "propertyXName", 2);
        String strM253243 = C8021.m25324(typedArray, xmlPullParser, "propertyYName", 3);
        if (i != 2) {
        }
        if (strM253242 != null || strM253243 != null) {
            m6647(C6625.m21067(strM25324), objectAnimator, f * 0.5f, strM253242, strM253243);
            return;
        }
        throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static void m6647(Path path, ObjectAnimator objectAnimator, float f, String str, String str2) {
        char c = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        float f2 = 0.0f;
        arrayList.add(Float.valueOf(0.0f));
        float length = 0.0f;
        do {
            length += pathMeasure.getLength();
            arrayList.add(Float.valueOf(length));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int iMin = Math.min(100, ((int) (length / f)) + 1);
        float[] fArr = new float[iMin];
        float[] fArr2 = new float[iMin];
        float[] fArr3 = new float[2];
        float f3 = length / (iMin - 1);
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= iMin) {
                break;
            }
            pathMeasure2.getPosTan(f2 - ((Float) arrayList.get(i2)).floatValue(), fArr3, null);
            fArr[i] = fArr3[c];
            fArr2[i] = fArr3[1];
            f2 += f3;
            int i3 = i2 + 1;
            if (i3 < arrayList.size() && f2 > ((Float) arrayList.get(i3)).floatValue()) {
                pathMeasure2.nextContour();
                i2 = i3;
            }
            i++;
            c = 0;
        }
        PropertyValuesHolder propertyValuesHolderOfFloat = str != null ? PropertyValuesHolder.ofFloat(str, fArr) : null;
        PropertyValuesHolder propertyValuesHolderOfFloat2 = str2 != null ? PropertyValuesHolder.ofFloat(str2, fArr2) : null;
        if (propertyValuesHolderOfFloat == null) {
            objectAnimator.setValues(propertyValuesHolderOfFloat2);
        } else if (propertyValuesHolderOfFloat2 == null) {
            objectAnimator.setValues(propertyValuesHolderOfFloat);
        } else {
            objectAnimator.setValues(propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2);
        }
    }
}
