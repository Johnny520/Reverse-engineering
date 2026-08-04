package yyds;

import android.os.Build;
import android.view.View;
import android.view.Window;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.lang.annotation.Annotation;
import java.math.BigDecimal;
import java.util.ConcurrentModificationException;
import javax.xml.parsers.ParserConfigurationException;
import org.simpleframework.xml.stream.InputNode;
import org.w3c.dom.Element;

/* JADX INFO: renamed from: yyds.ᛳᛴᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0578 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final C1300 f2769 = new C1300(12);

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final C1586 f2770 = new C1586();

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final C0135 f2771 = new C0135(24);

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final C0805 f2772 = new C0805(23);

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static BigDecimal m1448(String str) {
        m1451(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < 10000) {
            return bigDecimal;
        }
        throw new NumberFormatException("Number has unsupported scale: ".concat(str));
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static Element m1449(InputNode inputNode) {
        String reference = inputNode.getReference();
        String name = inputNode.getName();
        String prefix = inputNode.getPrefix();
        if (name == null) {
            C0188.m798("Local part not allowed to be null");
            return null;
        }
        if (reference == null) {
            reference = "";
        }
        if (prefix == null) {
            prefix = "";
        }
        try {
            Element elementCreateElementNS = AbstractC2515.f12416.newDocumentBuilder().newDocument().createElementNS(reference, prefix + ":" + name);
            elementCreateElementNS.setTextContent(inputNode.getValue());
            return elementCreateElementNS;
        } catch (ParserConfigurationException e) {
            C1693.m3442(e.getMessage(), e);
            return null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final Class m1450(C2234 c2234) {
        Class clsMo3993 = c2234.mo3993();
        if (clsMo3993.isPrimitive()) {
            return clsMo3993;
        }
        String name = clsMo3993.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static void m1451(String str) {
        if (str.length() <= 10000) {
            return;
        }
        throw new NumberFormatException("Number string too large: " + str.substring(0, 30) + "...");
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static int m1452(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static final int m1453(C1970 c1970, Object obj, int i) {
        int i2 = c1970.f9886;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iM3298 = AbstractC0024.m3298(i2, i, c1970.f9887);
            if (iM3298 < 0 || AbstractC1544.m3188(obj, c1970.f9888[iM3298])) {
                return iM3298;
            }
            int i3 = iM3298 + 1;
            while (i3 < i2 && c1970.f9887[i3] == i) {
                if (AbstractC1544.m3188(obj, c1970.f9888[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iM3298 - 1; i4 >= 0 && c1970.f9887[i4] == i; i4--) {
                if (AbstractC1544.m3188(obj, c1970.f9888[i4])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public static void m1454(Window window, boolean z) {
        if (Build.VERSION.SDK_INT >= 35) {
            window.setDecorFitsSystemWindows(z);
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & (-257) : systemUiVisibility | 256);
        window.setDecorFitsSystemWindows(z);
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static final String m1455(Reader reader) throws IOException {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int i = reader.read(cArr);
        while (i >= 0) {
            stringWriter.write(cArr, 0, i);
            i = reader.read(cArr);
        }
        return stringWriter.toString();
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final C2234 m1456(Annotation annotation) {
        return AbstractC1700.m3448(annotation.annotationType());
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final int m1457(InterfaceC0124 interfaceC0124) throws Exception {
        InterfaceC1212 interfaceC1212Mo575 = interfaceC0124.mo575("SELECT changes()");
        try {
            interfaceC1212Mo575.mo433();
            int i = (int) interfaceC1212Mo575.getLong(0);
            AbstractC0797.m1819(interfaceC1212Mo575, null);
            return i;
        } finally {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final Class m1458(C2234 c2234) {
        Class clsMo3993 = c2234.mo3993();
        if (clsMo3993.isPrimitive()) {
            String name = clsMo3993.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsMo3993;
    }
}
