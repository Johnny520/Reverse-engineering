package Yue;

import Yue.C6989;
import Yue.InterfaceC7144;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۦۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public class C5053 {

    /* JADX INFO: renamed from: ۥ */
    public static final int f1234 = 400;

    /* JADX INFO: renamed from: ۥ۟ */
    public static final int f1235 = 1;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f11971 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f11972 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f11973 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f11974 = 500;

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۦۡ$ۥ */
    @InterfaceC7113(21)
    public static class C0625 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static int m1870(TypedArray typedArray, int i) {
            return typedArray.getType(i);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۦۡ$ۥ۟ */
    public interface InterfaceC0626 {
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۦۡ$ۥ۟۟, reason: contains not printable characters */
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC5054 {
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۦۡ$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C5055 implements InterfaceC0626 {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6391
        public final C5056[] f1236;

        public C5055(@InterfaceC6391 C5056[] c5056Arr) {
            this.f1236 = c5056Arr;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ */
        public C5056[] m1871() {
            return this.f1236;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۦۡ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static final class C5056 {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6391
        public final String f1237;

        /* JADX INFO: renamed from: ۥ۟ */
        public final int f1238;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final boolean f11975;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final String f11976;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final int f11977;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final int f11978;

        public C5056(@InterfaceC6391 String str, int i, boolean z, @InterfaceC6490 String str2, int i2, int i3) {
            this.f1237 = str;
            this.f1238 = i;
            this.f11975 = z;
            this.f11976 = str2;
            this.f11977 = i2;
            this.f11978 = i3;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ */
        public String m1872() {
            return this.f1237;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public int m1873() {
            return this.f11978;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int m15570() {
            return this.f11977;
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public String m15571() {
            return this.f11976;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int m15572() {
            return this.f1238;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public boolean m15573() {
            return this.f11975;
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public static int m1868(TypedArray typedArray, int i) {
        return C0625.m1870(typedArray, i);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟ */
    public static InterfaceC0626 m1869(@InterfaceC6391 XmlPullParser xmlPullParser, @InterfaceC6391 Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m15565(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static List<List<byte[]>> m15564(@InterfaceC6391 Resources resources, @InterfaceC3397 int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (m1868(typedArrayObtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(m15569(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m15569(resources.getStringArray(i)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static InterfaceC0626 m15565(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return m15566(xmlPullParser, resources);
        }
        m15568(xmlPullParser);
        return null;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static InterfaceC0626 m15566(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C6989.C6997.f21106);
        String string = typedArrayObtainAttributes.getString(C6989.C6997.f21107);
        String string2 = typedArrayObtainAttributes.getString(C6989.C6997.f21111);
        String string3 = typedArrayObtainAttributes.getString(C6989.C6997.f21112);
        int resourceId = typedArrayObtainAttributes.getResourceId(C6989.C6997.f21108, 0);
        int integer = typedArrayObtainAttributes.getInteger(C6989.C6997.f21109, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(C6989.C6997.f21110, 500);
        String string4 = typedArrayObtainAttributes.getString(C6989.C6997.f21113);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                m15568(xmlPullParser);
            }
            return new C5057(new C5045(string, string2, string3, m15564(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(m15567(xmlPullParser, resources));
                } else {
                    m15568(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C5055((C5056[]) arrayList.toArray(new C5056[0]));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static C5056 m15567(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C6989.C6997.f21114);
        int i = typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(C6989.C6997.f21123) ? C6989.C6997.f21123 : C6989.C6997.f21116, 400);
        boolean z = 1 == typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(C6989.C6997.f21121) ? C6989.C6997.f21121 : C6989.C6997.f21117, 0);
        int i2 = typedArrayObtainAttributes.hasValue(C6989.C6997.f21124) ? C6989.C6997.f21124 : C6989.C6997.f21118;
        String string = typedArrayObtainAttributes.getString(typedArrayObtainAttributes.hasValue(C6989.C6997.f21122) ? C6989.C6997.f21122 : C6989.C6997.f21119);
        int i3 = typedArrayObtainAttributes.getInt(i2, 0);
        int i4 = typedArrayObtainAttributes.hasValue(C6989.C6997.f21120) ? C6989.C6997.f21120 : C6989.C6997.f21115;
        int resourceId = typedArrayObtainAttributes.getResourceId(i4, 0);
        String string2 = typedArrayObtainAttributes.getString(i4);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m15568(xmlPullParser);
        }
        return new C5056(string2, i, z, string, i3, resourceId);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static void m15568(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static List<byte[]> m15569(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۦۡ$ۥ۟۟۟۠, reason: contains not printable characters */
    public static final class C5057 implements InterfaceC0626 {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6391
        public final C5045 f1239;

        /* JADX INFO: renamed from: ۥ۟ */
        public final int f1240;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int f11979;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        @InterfaceC6490
        public final String f11980;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
        public C5057(@InterfaceC6391 C5045 c5045, int i, int i2, @InterfaceC6490 String str) {
            this.f1239 = c5045;
            this.f11979 = i;
            this.f1240 = i2;
            this.f11980 = str;
        }

        /* JADX INFO: renamed from: ۥ */
        public int m1874() {
            return this.f11979;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟ */
        public C5045 m1875() {
            return this.f1239;
        }

        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public String m15574() {
            return this.f11980;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int m15575() {
            return this.f1240;
        }

        public C5057(@InterfaceC6391 C5045 c5045, int i, int i2) {
            this(c5045, i, i2, null);
        }
    }
}
