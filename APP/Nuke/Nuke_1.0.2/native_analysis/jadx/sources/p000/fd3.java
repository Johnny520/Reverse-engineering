package p000;

import android.content.Context;
import java.lang.reflect.Field;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fd3 {
    /* JADX INFO: renamed from: a */
    public static boolean m1598a(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* JADX INFO: renamed from: b */
    public static void m1599b() {
        Class cls;
        Field field = up0.m5529H("com.tencent.mm.process.KillProcessHelperActivity").getDeclaredFields()[0];
        field.getClass();
        ig1.m2344a(field);
        sg1 sg1VarM3244v = op0.m3602y(field.get(null)).m3244v();
        cls = Context.class;
        Class<Context> clsM3691A = p40.m3691A(d72.m967a(cls));
        cls = clsM3691A != null ? clsM3691A : Context.class;
        Class cls2 = Boolean.TYPE;
        cls2.getClass();
        sg1VarM3244v.m4864d(cls, cls2);
        zg1 zg1Var = (zg1) AbstractC0142du.m1159o0(sg1VarM3244v.m4863c());
        Context context = up0.f11401i;
        if (context != null) {
            zg1Var.m6415g0(context, Boolean.TRUE);
        } else {
            t11.m5067S("hostContext");
            throw null;
        }
    }
}
