package p000a;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Base64;
import android.util.Xml;
import androidx.core.C1066R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: a.S6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0332S6 {

    /* JADX INFO: renamed from: a.S6$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static int m919a(TypedArray typedArray, int i) {
            return typedArray.getType(i);
        }
    }

    /* JADX INFO: renamed from: a.S6$b */
    public interface b {
    }

    /* JADX INFO: renamed from: a.S6$c */
    public static final class c implements b {

        /* JADX INFO: renamed from: a */
        public final d[] f1186a;

        public c(d[] dVarArr) {
            this.f1186a = dVarArr;
        }
    }

    /* JADX INFO: renamed from: a.S6$d */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public final String f1187a;

        /* JADX INFO: renamed from: b */
        public final int f1188b;

        /* JADX INFO: renamed from: c */
        public final boolean f1189c;

        /* JADX INFO: renamed from: d */
        public final String f1190d;

        /* JADX INFO: renamed from: e */
        public final int f1191e;

        /* JADX INFO: renamed from: f */
        public final int f1192f;

        public d(int i, int i2, int i3, String str, String str2, boolean z) {
            this.f1187a = str;
            this.f1188b = i;
            this.f1189c = z;
            this.f1190d = str2;
            this.f1191e = i2;
            this.f1192f = i3;
        }
    }

    /* JADX INFO: renamed from: a.S6$e */
    public static final class e implements b {

        /* JADX INFO: renamed from: a */
        public final C0225M6 f1193a;

        /* JADX INFO: renamed from: b */
        public final int f1194b;

        /* JADX INFO: renamed from: c */
        public final int f1195c;

        /* JADX INFO: renamed from: d */
        public final String f1196d;

        public e(C0225M6 c0225m6, int i, int i2, String str) {
            this.f1193a = c0225m6;
            this.f1195c = i;
            this.f1194b = i2;
            this.f1196d = str;
        }
    }

    /* JADX INFO: renamed from: a */
    public static b m916a(XmlResourceParser xmlResourceParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            m918c(xmlResourceParser);
            return null;
        }
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), C1066R.styleable.FontFamily);
        String string = typedArrayObtainAttributes.getString(C1066R.styleable.FontFamily_fontProviderAuthority);
        String string2 = typedArrayObtainAttributes.getString(C1066R.styleable.FontFamily_fontProviderPackage);
        String string3 = typedArrayObtainAttributes.getString(C1066R.styleable.FontFamily_fontProviderQuery);
        int resourceId = typedArrayObtainAttributes.getResourceId(C1066R.styleable.FontFamily_fontProviderCerts, 0);
        int integer = typedArrayObtainAttributes.getInteger(C1066R.styleable.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(C1066R.styleable.FontFamily_fontProviderFetchTimeout, 500);
        String string4 = typedArrayObtainAttributes.getString(C1066R.styleable.FontFamily_fontProviderSystemFontFamily);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlResourceParser.next() != 3) {
                m918c(xmlResourceParser);
            }
            return new e(new C0225M6(string, string2, string3, m917b(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlResourceParser.next() != 3) {
            if (xmlResourceParser.getEventType() == 2) {
                if (xmlResourceParser.getName().equals("font")) {
                    TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), C1066R.styleable.FontFamilyFont);
                    int i = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(C1066R.styleable.FontFamilyFont_fontWeight) ? C1066R.styleable.FontFamilyFont_fontWeight : C1066R.styleable.FontFamilyFont_android_fontWeight, 400);
                    boolean z = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(C1066R.styleable.FontFamilyFont_fontStyle) ? C1066R.styleable.FontFamilyFont_fontStyle : C1066R.styleable.FontFamilyFont_android_fontStyle, 0);
                    int i2 = typedArrayObtainAttributes2.hasValue(C1066R.styleable.FontFamilyFont_ttcIndex) ? C1066R.styleable.FontFamilyFont_ttcIndex : C1066R.styleable.FontFamilyFont_android_ttcIndex;
                    String string5 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(C1066R.styleable.FontFamilyFont_fontVariationSettings) ? C1066R.styleable.FontFamilyFont_fontVariationSettings : C1066R.styleable.FontFamilyFont_android_fontVariationSettings);
                    int i3 = typedArrayObtainAttributes2.getInt(i2, 0);
                    int i4 = typedArrayObtainAttributes2.hasValue(C1066R.styleable.FontFamilyFont_font) ? C1066R.styleable.FontFamilyFont_font : C1066R.styleable.FontFamilyFont_android_font;
                    int resourceId2 = typedArrayObtainAttributes2.getResourceId(i4, 0);
                    String string6 = typedArrayObtainAttributes2.getString(i4);
                    typedArrayObtainAttributes2.recycle();
                    while (xmlResourceParser.next() != 3) {
                        m918c(xmlResourceParser);
                    }
                    arrayList.add(new d(i, i3, resourceId2, string6, string5, z));
                } else {
                    m918c(xmlResourceParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new c((d[]) arrayList.toArray(new d[0]));
    }

    /* JADX INFO: renamed from: b */
    public static List<List<byte[]>> m917b(Resources resources, int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (a.m919a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m918c(XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }
}
