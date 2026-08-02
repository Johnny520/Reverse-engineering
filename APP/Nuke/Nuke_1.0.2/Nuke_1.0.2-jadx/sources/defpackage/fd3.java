package defpackage;

import android.content.Context;
import java.lang.reflect.Field;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fd3 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean a(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b() {
        Class cls;
        Field field = up0.H("com.tencent.mm.process.KillProcessHelperActivity").getDeclaredFields()[0];
        field.getClass();
        ig1.a(field);
        sg1 sg1VarV = op0.y(field.get(null)).v();
        cls = Context.class;
        Class<Context> clsA = p40.A(d72.a(cls));
        cls = clsA != null ? clsA : Context.class;
        Class cls2 = Boolean.TYPE;
        cls2.getClass();
        sg1VarV.d(cls, cls2);
        zg1 zg1Var = (zg1) du.o0(sg1VarV.c());
        Context context = up0.i;
        if (context != null) {
            zg1Var.g0(context, Boolean.TRUE);
        } else {
            t11.S("hostContext");
            throw null;
        }
    }
}
