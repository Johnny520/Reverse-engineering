package androidx.constraintlayout.widget;

import Yue.AbstractC4130;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.C8778;
import java.io.IOException;
import java.util.ArrayList;
import org.simpleframework.xml.strategy.Name;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.ۥ۟۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8768 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final String f26631 = "ConstraintLayoutStates";

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final boolean f26632 = false;

    /* JADX INFO: renamed from: ۥ */
    public final ConstraintLayout f3694;

    /* JADX INFO: renamed from: ۥ۟ */
    public C8770 f3695;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f26633 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f26634 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public SparseArray<C1644> f26635 = new SparseArray<>();

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public SparseArray<C8770> f26636 = new SparseArray<>();

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public AbstractC4130 f26637 = null;

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.ۥ۟۟۟$ۥ */
    public static class C1644 {

        /* JADX INFO: renamed from: ۥ */
        public int f3696;

        /* JADX INFO: renamed from: ۥ۟ */
        public ArrayList<C1645> f3697 = new ArrayList<>();

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f26638;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public C8770 f26639;

        public C1644(Context context, XmlPullParser xmlPullParser) {
            this.f26638 = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C8778.C8789.f29298);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == C8778.C8789.f29299) {
                    this.f3696 = typedArrayObtainStyledAttributes.getResourceId(index, this.f3696);
                } else if (index == C8778.C8789.f29300) {
                    this.f26638 = typedArrayObtainStyledAttributes.getResourceId(index, this.f26638);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f26638);
                    context.getResources().getResourceName(this.f26638);
                    if ("layout".equals(resourceTypeName)) {
                        C8770 c8770 = new C8770();
                        this.f26639 = c8770;
                        c8770.m29371(context, this.f26638);
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        /* JADX INFO: renamed from: ۥ */
        public void m4711(C1645 c1645) {
            this.f3697.add(c1645);
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public int m4712(float f, float f2) {
            for (int i = 0; i < this.f3697.size(); i++) {
                if (this.f3697.get(i).m4713(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.ۥ۟۟۟$ۥ۟ */
    public static class C1645 {

        /* JADX INFO: renamed from: ۥ */
        public int f3698;

        /* JADX INFO: renamed from: ۥ۟ */
        public float f3699;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public float f26640;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public float f26641;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public float f26642;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public int f26643;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public C8770 f26644;

        public C1645(Context context, XmlPullParser xmlPullParser) {
            this.f3699 = Float.NaN;
            this.f26640 = Float.NaN;
            this.f26641 = Float.NaN;
            this.f26642 = Float.NaN;
            this.f26643 = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C8778.C8789.f29399);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == C8778.C8789.f29400) {
                    this.f26643 = typedArrayObtainStyledAttributes.getResourceId(index, this.f26643);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f26643);
                    context.getResources().getResourceName(this.f26643);
                    if ("layout".equals(resourceTypeName)) {
                        C8770 c8770 = new C8770();
                        this.f26644 = c8770;
                        c8770.m29371(context, this.f26643);
                    }
                } else if (index == C8778.C8789.f29401) {
                    this.f26642 = typedArrayObtainStyledAttributes.getDimension(index, this.f26642);
                } else if (index == C8778.C8789.f29402) {
                    this.f26640 = typedArrayObtainStyledAttributes.getDimension(index, this.f26640);
                } else if (index == C8778.C8789.f29403) {
                    this.f26641 = typedArrayObtainStyledAttributes.getDimension(index, this.f26641);
                } else if (index == C8778.C8789.f29404) {
                    this.f3699 = typedArrayObtainStyledAttributes.getDimension(index, this.f3699);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        /* JADX INFO: renamed from: ۥ */
        public boolean m4713(float f, float f2) {
            if (!Float.isNaN(this.f3699) && f < this.f3699) {
                return false;
            }
            if (!Float.isNaN(this.f26640) && f2 < this.f26640) {
                return false;
            }
            if (Float.isNaN(this.f26641) || f <= this.f26641) {
                return Float.isNaN(this.f26642) || f2 <= this.f26642;
            }
            return false;
        }
    }

    public C8768(Context context, ConstraintLayout constraintLayout, int i) {
        this.f3694 = constraintLayout;
        m4709(context, i);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /* JADX INFO: renamed from: ۥ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4709(Context context, int i) {
        byte b;
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            C1644 c1644 = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            b = name.equals(C8770.f26658) ? (byte) 4 : (byte) -1;
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                b = 2;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                b = 1;
                                break;
                            }
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                b = 0;
                                break;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                b = 3;
                                break;
                            }
                            break;
                        default:
                            break;
                    }
                    if (b != 0 && b != 1) {
                        if (b == 2) {
                            c1644 = new C1644(context, xml);
                            this.f26635.put(c1644.f3696, c1644);
                        } else if (b == 3) {
                            C1645 c1645 = new C1645(context, xml);
                            if (c1644 != null) {
                                c1644.m4711(c1645);
                            }
                        } else if (b != 4) {
                            Log.v("ConstraintLayoutStates", "unknown tag " + name);
                        } else {
                            m29297(context, xml);
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public boolean m4710(int i, float f, float f2) {
        int i2 = this.f26633;
        if (i2 != i) {
            return true;
        }
        C1644 c1644ValueAt = i == -1 ? this.f26635.valueAt(0) : this.f26635.get(i2);
        int i3 = this.f26634;
        return (i3 == -1 || !c1644ValueAt.f3697.get(i3).m4713(f, f2)) && this.f26634 != c1644ValueAt.m4712(f, f2);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m29297(Context context, XmlPullParser xmlPullParser) {
        C8770 c8770 = new C8770();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (Name.MARK.equals(xmlPullParser.getAttributeName(i))) {
                String attributeValue = xmlPullParser.getAttributeValue(i);
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), Name.MARK, context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                c8770.m29412(context, xmlPullParser);
                this.f26636.put(identifier, c8770);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m29298(AbstractC4130 abstractC4130) {
        this.f26637 = abstractC4130;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m29299(int i, float f, float f2) {
        int iM4712;
        int i2 = this.f26633;
        if (i2 == i) {
            C1644 c1644ValueAt = i == -1 ? this.f26635.valueAt(0) : this.f26635.get(i2);
            int i3 = this.f26634;
            if ((i3 == -1 || !c1644ValueAt.f3697.get(i3).m4713(f, f2)) && this.f26634 != (iM4712 = c1644ValueAt.m4712(f, f2))) {
                C8770 c8770 = iM4712 == -1 ? this.f3695 : c1644ValueAt.f3697.get(iM4712).f26644;
                int i4 = iM4712 == -1 ? c1644ValueAt.f26638 : c1644ValueAt.f3697.get(iM4712).f26643;
                if (c8770 == null) {
                    return;
                }
                this.f26634 = iM4712;
                AbstractC4130 abstractC4130 = this.f26637;
                if (abstractC4130 != null) {
                    abstractC4130.m1098(-1, i4);
                }
                c8770.m29357(this.f3694);
                AbstractC4130 abstractC41302 = this.f26637;
                if (abstractC41302 != null) {
                    abstractC41302.m1097(-1, i4);
                    return;
                }
                return;
            }
            return;
        }
        this.f26633 = i;
        C1644 c1644 = this.f26635.get(i);
        int iM47122 = c1644.m4712(f, f2);
        C8770 c87702 = iM47122 == -1 ? c1644.f26639 : c1644.f3697.get(iM47122).f26644;
        int i5 = iM47122 == -1 ? c1644.f26638 : c1644.f3697.get(iM47122).f26643;
        if (c87702 == null) {
            Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i + ", dim =" + f + ", " + f2);
            return;
        }
        this.f26634 = iM47122;
        AbstractC4130 abstractC41303 = this.f26637;
        if (abstractC41303 != null) {
            abstractC41303.m1098(i, i5);
        }
        c87702.m29357(this.f3694);
        AbstractC4130 abstractC41304 = this.f26637;
        if (abstractC41304 != null) {
            abstractC41304.m1097(i, i5);
        }
    }
}
