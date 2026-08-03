package Yue;

import android.content.Context;
import android.util.Log;
import android.util.Xml;
import androidx.constraintlayout.widget.C1643;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: Yue.ۥ۠ۦۥۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5638 {

    /* JADX INFO: renamed from: ۥ۟ */
    public static final int f1586 = -1;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static HashMap<String, Constructor<? extends AbstractC5616>> f13708 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final String f13709 = "KeyFrames";

    /* JADX INFO: renamed from: ۥ */
    public HashMap<Integer, ArrayList<AbstractC5616>> f1587 = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends AbstractC5616>> map = new HashMap<>();
        f13708 = map;
        try {
            map.put("KeyAttribute", C5617.class.getConstructor(null));
            f13708.put("KeyPosition", C5639.class.getConstructor(null));
            f13708.put("KeyCycle", C5619.class.getConstructor(null));
            f13708.put("KeyTimeCycle", C5641.class.getConstructor(null));
            f13708.put("KeyTrigger", C5642.class.getConstructor(null));
        } catch (NoSuchMethodException e) {
            Log.e(f13709, "unable to load", e);
        }
    }

    public C5638(Context context, XmlPullParser xmlPullParser) {
        Exception e;
        AbstractC5616 abstractC5616NewInstance;
        HashMap<String, C1643> map;
        try {
            int eventType = xmlPullParser.getEventType();
            AbstractC5616 abstractC5616 = null;
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (f13708.containsKey(name)) {
                        try {
                            abstractC5616NewInstance = f13708.get(name).newInstance(null);
                        } catch (Exception e2) {
                            AbstractC5616 abstractC56162 = abstractC5616;
                            e = e2;
                            abstractC5616NewInstance = abstractC56162;
                        }
                        try {
                            abstractC5616NewInstance.mo17406(context, Xml.asAttributeSet(xmlPullParser));
                            m2344(abstractC5616NewInstance);
                        } catch (Exception e3) {
                            e = e3;
                            Log.e(f13709, "unable to create ", e);
                        }
                        abstractC5616 = abstractC5616NewInstance;
                    } else if (name.equalsIgnoreCase("CustomAttribute") && abstractC5616 != null && (map = abstractC5616.f13604) != null) {
                        C1643.m29268(context, xmlPullParser, map);
                    }
                } else if (eventType == 3 && "KeyFrameSet".equals(xmlPullParser.getName())) {
                    return;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e4) {
            e4.printStackTrace();
        } catch (XmlPullParserException e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static String m17500(int i, Context context) {
        return context.getResources().getResourceEntryName(i);
    }

    /* JADX INFO: renamed from: ۥ */
    public void m2343(C6269 c6269) {
        ArrayList<AbstractC5616> arrayList = this.f1587.get(Integer.valueOf(c6269.f1957));
        if (arrayList != null) {
            c6269.m2737(arrayList);
        }
        ArrayList<AbstractC5616> arrayList2 = this.f1587.get(-1);
        if (arrayList2 != null) {
            for (AbstractC5616 abstractC5616 : arrayList2) {
                if (abstractC5616.m17407(((ConstraintLayout.C1641) c6269.f1956.getLayoutParams()).f26522)) {
                    c6269.m2736(abstractC5616);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final void m2344(AbstractC5616 abstractC5616) {
        if (!this.f1587.containsKey(Integer.valueOf(abstractC5616.f1572))) {
            this.f1587.put(Integer.valueOf(abstractC5616.f1572), new ArrayList<>());
        }
        this.f1587.get(Integer.valueOf(abstractC5616.f1572)).add(abstractC5616);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public ArrayList<AbstractC5616> m17501(int i) {
        return this.f1587.get(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public Set<Integer> m17502() {
        return this.f1587.keySet();
    }
}
