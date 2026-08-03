package androidx.constraintlayout.widget;

import Yue.AbstractC4130;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.C8778;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.ۥ۟۟۟ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8790 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final String f29419 = "ConstraintLayoutStates";

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final boolean f29420 = false;

    /* JADX INFO: renamed from: ۥ۟ */
    public C8770 f3741;

    /* JADX INFO: renamed from: ۥ */
    public int f3740 = -1;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f29421 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f29422 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public SparseArray<C1651> f29423 = new SparseArray<>();

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public SparseArray<C8770> f29424 = new SparseArray<>();

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public AbstractC4130 f29425 = null;

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.ۥ۟۟۟ۦ$ۥ */
    public static class C1651 {

        /* JADX INFO: renamed from: ۥ */
        public int f3742;

        /* JADX INFO: renamed from: ۥ۟ */
        public ArrayList<C1652> f3743 = new ArrayList<>();

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f29426;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public boolean f29427;

        public C1651(Context context, XmlPullParser xmlPullParser) {
            this.f29426 = -1;
            this.f29427 = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C8778.C8789.f29298);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == C8778.C8789.f29299) {
                    this.f3742 = typedArrayObtainStyledAttributes.getResourceId(index, this.f3742);
                } else if (index == C8778.C8789.f29300) {
                    this.f29426 = typedArrayObtainStyledAttributes.getResourceId(index, this.f29426);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f29426);
                    context.getResources().getResourceName(this.f29426);
                    if ("layout".equals(resourceTypeName)) {
                        this.f29427 = true;
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        /* JADX INFO: renamed from: ۥ */
        public void m4734(C1652 c1652) {
            this.f3743.add(c1652);
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public int m4735(float f, float f2) {
            for (int i = 0; i < this.f3743.size(); i++) {
                if (this.f3743.get(i).m4736(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.ۥ۟۟۟ۦ$ۥ۟ */
    public static class C1652 {

        /* JADX INFO: renamed from: ۥ */
        public int f3744;

        /* JADX INFO: renamed from: ۥ۟ */
        public float f3745;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public float f29428;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public float f29429;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public float f29430;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public int f29431;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public boolean f29432;

        public C1652(Context context, XmlPullParser xmlPullParser) {
            this.f3745 = Float.NaN;
            this.f29428 = Float.NaN;
            this.f29429 = Float.NaN;
            this.f29430 = Float.NaN;
            this.f29431 = -1;
            this.f29432 = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C8778.C8789.f29399);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == C8778.C8789.f29400) {
                    this.f29431 = typedArrayObtainStyledAttributes.getResourceId(index, this.f29431);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f29431);
                    context.getResources().getResourceName(this.f29431);
                    if ("layout".equals(resourceTypeName)) {
                        this.f29432 = true;
                    }
                } else if (index == C8778.C8789.f29401) {
                    this.f29430 = typedArrayObtainStyledAttributes.getDimension(index, this.f29430);
                } else if (index == C8778.C8789.f29402) {
                    this.f29428 = typedArrayObtainStyledAttributes.getDimension(index, this.f29428);
                } else if (index == C8778.C8789.f29403) {
                    this.f29429 = typedArrayObtainStyledAttributes.getDimension(index, this.f29429);
                } else if (index == C8778.C8789.f29404) {
                    this.f3745 = typedArrayObtainStyledAttributes.getDimension(index, this.f3745);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        /* JADX INFO: renamed from: ۥ */
        public boolean m4736(float f, float f2) {
            if (!Float.isNaN(this.f3745) && f < this.f3745) {
                return false;
            }
            if (!Float.isNaN(this.f29428) && f2 < this.f29428) {
                return false;
            }
            if (Float.isNaN(this.f29429) || f <= this.f29429) {
                return Float.isNaN(this.f29430) || f2 <= this.f29430;
            }
            return false;
        }
    }

    public C8790(Context context, XmlPullParser xmlPullParser) {
        m4733(context, xmlPullParser);
    }

    /* JADX INFO: renamed from: ۥ */
    public int m4732(int i, int i2, float f, float f2) {
        C1651 c1651 = this.f29423.get(i2);
        if (c1651 == null) {
            return i2;
        }
        if (f == -1.0f || f2 == -1.0f) {
            if (c1651.f29426 == i) {
                return i;
            }
            Iterator<C1652> it = c1651.f3743.iterator();
            while (it.hasNext()) {
                if (i == it.next().f29431) {
                    return i;
                }
            }
            return c1651.f29426;
        }
        C1652 c1652 = null;
        for (C1652 c16522 : c1651.f3743) {
            if (c16522.m4736(f, f2)) {
                if (i == c16522.f29431) {
                    return i;
                }
                c1652 = c16522;
            }
        }
        return c1652 != null ? c1652.f29431 : c1651.f29426;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007f  */
    /* JADX INFO: renamed from: ۥ۟ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4733(Context context, XmlPullParser xmlPullParser) {
        byte b;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C8778.C8789.f29310);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == C8778.C8789.f29311) {
                this.f3740 = typedArrayObtainStyledAttributes.getResourceId(index, this.f3740);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        try {
            int eventType = xmlPullParser.getEventType();
            C1651 c1651 = null;
            while (eventType != 1) {
                if (eventType == 0) {
                    xmlPullParser.getName();
                } else if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    switch (name.hashCode()) {
                        case 80204913:
                            b = name.equals("State") ? (byte) 2 : (byte) -1;
                            break;
                        case 1301459538:
                            if (name.equals("LayoutDescription")) {
                                b = 0;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                b = 1;
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
                            c1651 = new C1651(context, xmlPullParser);
                            this.f29423.put(c1651.f3742, c1651);
                        } else if (b != 3) {
                            Log.v("ConstraintLayoutStates", "unknown tag " + name);
                        } else {
                            C1652 c1652 = new C1652(context, xmlPullParser);
                            if (c1651 != null) {
                                c1651.m4734(c1652);
                            }
                        }
                    }
                } else if (eventType != 3) {
                    continue;
                } else if ("StateSet".equals(xmlPullParser.getName())) {
                    return;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean m29481(int i, float f, float f2) {
        int i2 = this.f29421;
        if (i2 != i) {
            return true;
        }
        C1651 c1651ValueAt = i == -1 ? this.f29423.valueAt(0) : this.f29423.get(i2);
        int i3 = this.f29422;
        return (i3 == -1 || !c1651ValueAt.f3743.get(i3).m4736(f, f2)) && this.f29422 != c1651ValueAt.m4735(f, f2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m29482(AbstractC4130 abstractC4130) {
        this.f29425 = abstractC4130;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int m29483(int i, int i2, int i3) {
        return m29484(-1, i, i2, i3);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int m29484(int i, int i2, float f, float f2) {
        int iM4735;
        if (i == i2) {
            C1651 c1651ValueAt = i2 == -1 ? this.f29423.valueAt(0) : this.f29423.get(this.f29421);
            if (c1651ValueAt == null) {
                return -1;
            }
            return ((this.f29422 == -1 || !c1651ValueAt.f3743.get(i).m4736(f, f2)) && i != (iM4735 = c1651ValueAt.m4735(f, f2))) ? iM4735 == -1 ? c1651ValueAt.f29426 : c1651ValueAt.f3743.get(iM4735).f29431 : i;
        }
        C1651 c1651 = this.f29423.get(i2);
        if (c1651 == null) {
            return -1;
        }
        int iM47352 = c1651.m4735(f, f2);
        return iM47352 == -1 ? c1651.f29426 : c1651.f3743.get(iM47352).f29431;
    }
}
