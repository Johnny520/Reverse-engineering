package yyds;

import android.graphics.Bitmap;
import android.graphics.Color;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: renamed from: yyds.ᛲᲁᛲᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0449 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final LinkedHashMap f2281 = new LinkedHashMap();

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static void m1235() {
        LinkedHashMap linkedHashMap = f2281;
        Set setEntrySet = linkedHashMap.entrySet();
        AbstractC2328.m4341(-522100092339054L);
        Iterator it = setEntrySet.iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            AbstractC2328.m4341(-522692797825902L);
            entry.getValue();
            AbstractC2328.m4341(-522740042466158L);
            throw new ClassCastException();
        }
        Collection collectionValues = linkedHashMap.values();
        AbstractC2328.m4341(-521825214432110L);
        Iterator it2 = collectionValues.iterator();
        if (it2.hasNext()) {
            it2.next().getClass();
            C0188.m794();
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static Pair m1236(int i, InterfaceC1549 interfaceC1549) {
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 1; i4 < i; i4++) {
            if (m1239(((Number) interfaceC1549.mo371(Integer.valueOf(i4))).intValue())) {
                if (i2 == -1) {
                    i2 = i4 - 1;
                }
                i3 = i4;
            }
        }
        if (i2 < 0 || i3 < 0) {
            return null;
        }
        return new Pair(Integer.valueOf(i2), Integer.valueOf(i3));
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static Pair m1237(Bitmap bitmap, boolean z) {
        int width = (z ? bitmap.getWidth() : bitmap.getHeight()) - 1;
        int i = -1;
        int i2 = -1;
        for (int i3 = 1; i3 < width; i3++) {
            if (m1239(z ? bitmap.getPixel(i3, 0) : bitmap.getPixel(0, i3))) {
                if (i == -1) {
                    i = i3 - 1;
                }
                i2 = i3;
            }
        }
        if (i < 0 || i2 < 0) {
            return null;
        }
        return new Pair(Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static String m1238(boolean z) {
        if (z) {
            C1509.f7142.getClass();
            return (String) C1509.f7218.m1579(C1509.f7179[173]);
        }
        C1509.f7142.getClass();
        return (String) C1509.f7266.m1579(C1509.f7179[174]);
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static boolean m1239(int i) {
        return Color.alpha(i) == 255 && Color.red(i) == 0 && Color.green(i) == 0 && Color.blue(i) == 0;
    }
}
