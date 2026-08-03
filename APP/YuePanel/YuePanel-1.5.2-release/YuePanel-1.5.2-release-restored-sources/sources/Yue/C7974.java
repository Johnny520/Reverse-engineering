package Yue;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.ViewGroup;
import java.io.IOException;
import java.lang.reflect.Constructor;
import org.simpleframework.xml.strategy.Name;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: Yue.ۥۢۢ۠ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7974 {

    /* JADX INFO: renamed from: ۥ۟ */
    public static final Class<?>[] f3153 = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final C3394<String, Constructor<?>> f23742 = new C3394<>();

    /* JADX INFO: renamed from: ۥ */
    public final Context f3154;

    public C7974(@InterfaceC6391 Context context) {
        this.f3154 = context;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static C7974 m25147(@InterfaceC6391 Context context) {
        return new C7974(context);
    }

    /* JADX INFO: renamed from: ۥ */
    public final Object m3992(AttributeSet attributeSet, Class<?> cls, String str) {
        Object objNewInstance;
        Class<? extends U> clsAsSubclass;
        String attributeValue = attributeSet.getAttributeValue(null, Name.LABEL);
        if (attributeValue == null) {
            throw new InflateException(str + " tag must have a 'class' attribute");
        }
        try {
            C3394<String, Constructor<?>> c3394 = f23742;
            synchronized (c3394) {
                try {
                    Constructor<?> constructor = c3394.get(attributeValue);
                    if (constructor == null && (clsAsSubclass = Class.forName(attributeValue, false, this.f3154.getClassLoader()).asSubclass(cls)) != 0) {
                        constructor = clsAsSubclass.getConstructor(f3153);
                        constructor.setAccessible(true);
                        c3394.put(attributeValue, constructor);
                    }
                    objNewInstance = constructor.newInstance(this.f3154, attributeSet);
                } finally {
                }
            }
            return objNewInstance;
        } catch (Exception e) {
            throw new InflateException("Could not instantiate " + cls + " class " + attributeValue, e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x017d, code lost:
    
        return r3;
     */
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC7956 m3993(XmlPullParser xmlPullParser, AttributeSet attributeSet, AbstractC7956 abstractC7956) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        C7991 c7991 = abstractC7956 instanceof C7991 ? (C7991) abstractC7956 : null;
        loop0: while (true) {
            AbstractC7956 c79912 = null;
            while (true) {
                int next = xmlPullParser.next();
                if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                    break loop0;
                }
                if (next == 2) {
                    String name = xmlPullParser.getName();
                    if ("fade".equals(name)) {
                        c79912 = new C4786(this.f3154, attributeSet);
                    } else if ("changeBounds".equals(name)) {
                        c79912 = new C3694(this.f3154, attributeSet);
                    } else if ("slide".equals(name)) {
                        c79912 = new C7478(this.f3154, attributeSet);
                    } else if ("explode".equals(name)) {
                        c79912 = new C4777(this.f3154, attributeSet);
                    } else if ("changeImageTransform".equals(name)) {
                        c79912 = new C3703(this.f3154, attributeSet);
                    } else if ("changeTransform".equals(name)) {
                        c79912 = new C3708(this.f3154, attributeSet);
                    } else if ("changeClipBounds".equals(name)) {
                        c79912 = new C3702(this.f3154, attributeSet);
                    } else if ("autoTransition".equals(name)) {
                        c79912 = new C3501(this.f3154, attributeSet);
                    } else if ("changeScroll".equals(name)) {
                        c79912 = new C3707(this.f3154, attributeSet);
                    } else if ("transitionSet".equals(name)) {
                        c79912 = new C7991(this.f3154, attributeSet);
                    } else if (C3229.f4952.equals(name)) {
                        c79912 = (AbstractC7956) m3992(attributeSet, AbstractC7956.class, C3229.f4952);
                    } else if ("targets".equals(name)) {
                        m25149(xmlPullParser, attributeSet, abstractC7956);
                    } else if ("arcMotion".equals(name)) {
                        if (abstractC7956 == null) {
                            throw new RuntimeException("Invalid use of arcMotion element");
                        }
                        abstractC7956.setPathMotion(new C3372(this.f3154, attributeSet));
                    } else if ("pathMotion".equals(name)) {
                        if (abstractC7956 == null) {
                            throw new RuntimeException("Invalid use of pathMotion element");
                        }
                        abstractC7956.setPathMotion((AbstractC6623) m3992(attributeSet, AbstractC6623.class, "pathMotion"));
                    } else {
                        if (!"patternPathMotion".equals(name)) {
                            throw new RuntimeException("Unknown scene name: " + xmlPullParser.getName());
                        }
                        if (abstractC7956 == null) {
                            throw new RuntimeException("Invalid use of patternPathMotion element");
                        }
                        abstractC7956.setPathMotion(new C6644(this.f3154, attributeSet));
                    }
                    if (c79912 == null) {
                        continue;
                    } else {
                        if (!xmlPullParser.isEmptyElementTag()) {
                            m3993(xmlPullParser, attributeSet, c79912);
                        }
                        if (c7991 != null) {
                            break;
                        }
                        if (abstractC7956 != null) {
                            throw new InflateException("Could not add transition to another transition.");
                        }
                    }
                }
            }
            c7991.m25181(c79912);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        return r1;
     */
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C7986 m25148(XmlPullParser xmlPullParser, AttributeSet attributeSet, @InterfaceC6391 ViewGroup viewGroup) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        C7986 c7986 = null;
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                break;
            }
            if (next == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("transitionManager")) {
                    c7986 = new C7986();
                } else {
                    if (!name.equals(C3229.f4952) || c7986 == null) {
                        break;
                    }
                    m25152(attributeSet, xmlPullParser, viewGroup, c7986);
                }
            }
        }
        throw new RuntimeException("Unknown scene name: " + xmlPullParser.getName());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m25149(XmlPullParser xmlPullParser, AttributeSet attributeSet, @InterfaceC6391 AbstractC7956 abstractC7956) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                if (!xmlPullParser.getName().equals("target")) {
                    throw new RuntimeException("Unknown scene name: " + xmlPullParser.getName());
                }
                TypedArray typedArrayObtainStyledAttributes = this.f3154.obtainStyledAttributes(attributeSet, C7652.f2982);
                int iM25323 = C8021.m25323(typedArrayObtainStyledAttributes, xmlPullParser, "targetId", 1, 0);
                if (iM25323 != 0) {
                    abstractC7956.addTarget(iM25323);
                } else {
                    int iM253232 = C8021.m25323(typedArrayObtainStyledAttributes, xmlPullParser, "excludeId", 2, 0);
                    if (iM253232 != 0) {
                        abstractC7956.excludeTarget(iM253232, true);
                    } else {
                        String strM25324 = C8021.m25324(typedArrayObtainStyledAttributes, xmlPullParser, "targetName", 4);
                        if (strM25324 != null) {
                            abstractC7956.addTarget(strM25324);
                        } else {
                            String strM253242 = C8021.m25324(typedArrayObtainStyledAttributes, xmlPullParser, "excludeName", 5);
                            if (strM253242 != null) {
                                abstractC7956.excludeTarget(strM253242, true);
                            } else {
                                String strM253243 = C8021.m25324(typedArrayObtainStyledAttributes, xmlPullParser, "excludeClass", 3);
                                if (strM253243 != null) {
                                    try {
                                        abstractC7956.excludeTarget(Class.forName(strM253243), true);
                                    } catch (ClassNotFoundException e) {
                                        typedArrayObtainStyledAttributes.recycle();
                                        throw new RuntimeException("Could not create " + strM253243, e);
                                    }
                                } else {
                                    String strM253244 = C8021.m25324(typedArrayObtainStyledAttributes, xmlPullParser, "targetClass", 0);
                                    if (strM253244 != null) {
                                        abstractC7956.addTarget(Class.forName(strM253244));
                                    }
                                }
                            }
                        }
                    }
                }
                typedArrayObtainStyledAttributes.recycle();
            }
        }
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public AbstractC7956 m25150(int i) {
        XmlResourceParser xml = this.f3154.getResources().getXml(i);
        try {
            try {
                return m3993(xml, Xml.asAttributeSet(xml), null);
            } catch (IOException e) {
                throw new InflateException(xml.getPositionDescription() + ": " + e.getMessage(), e);
            } catch (XmlPullParserException e2) {
                throw new InflateException(e2.getMessage(), e2);
            }
        } finally {
            xml.close();
        }
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public C7986 m25151(int i, @InterfaceC6391 ViewGroup viewGroup) {
        XmlResourceParser xml = this.f3154.getResources().getXml(i);
        try {
            try {
                return m25148(xml, Xml.asAttributeSet(xml), viewGroup);
            } catch (IOException e) {
                InflateException inflateException = new InflateException(xml.getPositionDescription() + ": " + e.getMessage());
                inflateException.initCause(e);
                throw inflateException;
            } catch (XmlPullParserException e2) {
                InflateException inflateException2 = new InflateException(e2.getMessage());
                inflateException2.initCause(e2);
                throw inflateException2;
            }
        } finally {
            xml.close();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m25152(AttributeSet attributeSet, XmlPullParser xmlPullParser, @InterfaceC6391 ViewGroup viewGroup, C7986 c7986) throws Resources.NotFoundException {
        AbstractC7956 abstractC7956M25150;
        TypedArray typedArrayObtainStyledAttributes = this.f3154.obtainStyledAttributes(attributeSet, C7652.f2983);
        int iM25323 = C8021.m25323(typedArrayObtainStyledAttributes, xmlPullParser, C3229.f4952, 2, -1);
        int iM253232 = C8021.m25323(typedArrayObtainStyledAttributes, xmlPullParser, "fromScene", 0, -1);
        C7238 c7238M22667 = iM253232 < 0 ? null : C7238.m22667(viewGroup, iM253232, this.f3154);
        int iM253233 = C8021.m25323(typedArrayObtainStyledAttributes, xmlPullParser, "toScene", 1, -1);
        C7238 c7238M226672 = iM253233 >= 0 ? C7238.m22667(viewGroup, iM253233, this.f3154) : null;
        if (iM25323 >= 0 && (abstractC7956M25150 = m25150(iM25323)) != null) {
            if (c7238M226672 == null) {
                throw new RuntimeException("No toScene for transition ID " + iM25323);
            }
            if (c7238M22667 == null) {
                c7986.m25174(c7238M226672, abstractC7956M25150);
            } else {
                c7986.m25173(c7238M22667, c7238M226672, abstractC7956M25150);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
