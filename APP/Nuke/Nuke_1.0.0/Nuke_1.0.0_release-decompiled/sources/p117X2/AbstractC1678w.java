package p117X2;

import java.util.Map;
import p056K2.InterfaceC0877c;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p112W2.InterfaceC1604f;
import p112W2.InterfaceC1605g;
import p112W2.InterfaceC1606h;
import p112W2.InterfaceC1607i;
import p122Y2.InterfaceC1766a;
import p122Y2.InterfaceC1768c;
import p136b0.InterfaceC1841c;

/* JADX INFO: renamed from: X2.w */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1678w {
    /* JADX INFO: renamed from: a */
    public static Map m2997a(Object obj) {
        if ((obj instanceof InterfaceC1766a) && !(obj instanceof InterfaceC1768c)) {
            m3000d(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e5) {
            AbstractC1665j.m2989i(e5, AbstractC1678w.class.getName());
            throw e5;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m2998b(int i5, Object obj) {
        if (obj == null || m2999c(i5, obj)) {
            return;
        }
        m3000d(obj, "kotlin.jvm.functions.Function" + i5);
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m2999c(int i5, Object obj) {
        int iMo2234b;
        if (obj instanceof InterfaceC0877c) {
            if (obj instanceof InterfaceC1662g) {
                iMo2234b = ((InterfaceC1662g) obj).mo2234b();
            } else if (obj instanceof InterfaceC1599a) {
                iMo2234b = 0;
            } else if (obj instanceof InterfaceC1601c) {
                iMo2234b = 1;
            } else if (obj instanceof InterfaceC1603e) {
                iMo2234b = 2;
            } else if (obj instanceof InterfaceC1604f) {
                iMo2234b = 3;
            } else if (obj instanceof InterfaceC1605g) {
                iMo2234b = 4;
            } else if (obj instanceof InterfaceC1606h) {
                iMo2234b = 5;
            } else {
                boolean z5 = obj instanceof InterfaceC1841c;
                iMo2234b = z5 ? 6 : z5 ? 7 : obj instanceof InterfaceC1607i ? 8 : z5 ? 9 : z5 ? 10 : z5 ? 11 : z5 ? 13 : z5 ? 14 : z5 ? 15 : z5 ? 16 : z5 ? 17 : z5 ? 18 : z5 ? 19 : z5 ? 20 : z5 ? 21 : -1;
            }
            if (iMo2234b == i5) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static void m3000d(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        AbstractC1665j.m2989i(classCastException, AbstractC1678w.class.getName());
        throw classCastException;
    }
}
