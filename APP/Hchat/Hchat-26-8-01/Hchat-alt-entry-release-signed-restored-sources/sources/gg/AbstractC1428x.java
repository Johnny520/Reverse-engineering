package gg;

import java.util.List;
import java.util.Map;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1221b;
import p085fg.InterfaceC1222c;
import p085fg.InterfaceC1224e;
import p085fg.InterfaceC1225f;
import p085fg.InterfaceC1226g;
import p085fg.InterfaceC1227h;
import p085fg.InterfaceC1228i;
import p085fg.InterfaceC1229j;
import p085fg.InterfaceC1230k;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1232m;
import p085fg.InterfaceC1233n;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p085fg.InterfaceC1237r;
import p085fg.InterfaceC1238s;
import p085fg.InterfaceC1239t;
import p085fg.InterfaceC1240u;
import p085fg.InterfaceC1241v;
import p085fg.InterfaceC1242w;
import p114hg.InterfaceC1711a;
import p114hg.InterfaceC1713c;
import p114hg.InterfaceC1714d;
import p276sf.InterfaceC3955b;
import p332wb.AbstractC4855en;

/* JADX INFO: renamed from: gg.x */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1428x {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static List m3836a(Object obj) {
        if ((obj instanceof InterfaceC1711a) && !(obj instanceof InterfaceC1713c)) {
            m3841f(obj, "kotlin.collections.MutableList");
            throw null;
        }
        try {
            return (List) obj;
        } catch (ClassCastException e6) {
            AbstractC1416l.m3829e(e6, AbstractC1428x.class.getName());
            throw e6;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static Map m3837b(Object obj) {
        if ((obj instanceof InterfaceC1711a) && !(obj instanceof InterfaceC1714d)) {
            m3841f(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e6) {
            AbstractC1416l.m3829e(e6, AbstractC1428x.class.getName());
            throw e6;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m3838c(int i9, Object obj) {
        if (obj == null || m3839d(i9, obj)) {
            return;
        }
        m3841f(obj, "kotlin.jvm.functions.Function" + i9);
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static boolean m3839d(int i9, Object obj) {
        if (obj instanceof InterfaceC3955b) {
            if ((obj instanceof InterfaceC1413i ? ((InterfaceC1413i) obj).getArity() : obj instanceof InterfaceC1220a ? 0 : obj instanceof InterfaceC1231l ? 1 : obj instanceof InterfaceC1235p ? 2 : obj instanceof InterfaceC1236q ? 3 : obj instanceof InterfaceC1237r ? 4 : obj instanceof InterfaceC1238s ? 5 : obj instanceof InterfaceC1239t ? 6 : obj instanceof InterfaceC1240u ? 7 : obj instanceof InterfaceC1241v ? 8 : obj instanceof InterfaceC1242w ? 9 : obj instanceof InterfaceC1221b ? 10 : obj instanceof InterfaceC1222c ? 11 : obj instanceof InterfaceC1224e ? 13 : obj instanceof InterfaceC1225f ? 14 : obj instanceof InterfaceC1226g ? 15 : obj instanceof InterfaceC1227h ? 16 : obj instanceof InterfaceC1228i ? 17 : obj instanceof InterfaceC1229j ? 18 : obj instanceof InterfaceC1230k ? 19 : obj instanceof InterfaceC1232m ? 20 : obj instanceof InterfaceC1233n ? 21 : -1) == i9) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static boolean m3840e(Object obj) {
        if (obj instanceof List) {
            return !(obj instanceof InterfaceC1711a) || (obj instanceof InterfaceC1713c);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static void m3841f(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(AbstractC4855en.m9264h(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        AbstractC1416l.m3829e(classCastException, AbstractC1428x.class.getName());
        throw classCastException;
    }
}
