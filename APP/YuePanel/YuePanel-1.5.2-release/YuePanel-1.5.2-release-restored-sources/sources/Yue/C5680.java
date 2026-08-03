package Yue;

import android.util.AttributeSet;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Deque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: Yue.ۥ۠ۦۨۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5680 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6391
    public final Deque<WeakReference<XmlPullParser>> f1613 = new ArrayDeque();

    /* JADX INFO: renamed from: ۥ۟ */
    public static boolean m2366(@InterfaceC6490 XmlPullParser xmlPullParser) {
        if (xmlPullParser == null) {
            return true;
        }
        try {
            if (xmlPullParser.getEventType() != 3) {
                return xmlPullParser.getEventType() == 1;
            }
            return true;
        } catch (XmlPullParserException unused) {
            return true;
        }
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static XmlPullParser m17585(@InterfaceC6391 Deque<WeakReference<XmlPullParser>> deque) {
        while (!deque.isEmpty()) {
            XmlPullParser xmlPullParser = deque.peek().get();
            if (!m2366(xmlPullParser)) {
                return xmlPullParser;
            }
            deque.pop();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static boolean m17586(@InterfaceC6391 XmlPullParser xmlPullParser, @InterfaceC6490 XmlPullParser xmlPullParser2) {
        if (xmlPullParser2 == null || xmlPullParser == xmlPullParser2) {
            return false;
        }
        try {
            if (xmlPullParser2.getEventType() == 2) {
                return "include".equals(xmlPullParser2.getName());
            }
            return false;
        } catch (XmlPullParserException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public boolean m2367(@InterfaceC6391 AttributeSet attributeSet) {
        if (!(attributeSet instanceof XmlPullParser)) {
            return false;
        }
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        if (xmlPullParser.getDepth() != 1) {
            return false;
        }
        XmlPullParser xmlPullParserM17585 = m17585(this.f1613);
        this.f1613.push(new WeakReference<>(xmlPullParser));
        return m17586(xmlPullParser, xmlPullParserM17585);
    }
}
