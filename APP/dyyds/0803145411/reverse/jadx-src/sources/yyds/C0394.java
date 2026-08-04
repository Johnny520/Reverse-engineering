package yyds;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import java.util.ArrayList;

/* JADX INFO: renamed from: yyds.ᛲᛷᛴᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0394 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f2029;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public int f2030;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public int f2031;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Object f2032;

    public C0394(Context context, XmlResourceParser xmlResourceParser) {
        this.f2029 = 2;
        this.f2032 = new ArrayList();
        this.f2031 = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC1164.f5351);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f2030 = typedArrayObtainStyledAttributes.getResourceId(index, this.f2030);
            } else if (index == 1) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f2031);
                this.f2031 = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new C0595().m1475(context, resourceId);
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public String toString() {
        switch (this.f2029) {
            case 1:
                return ((CharSequence) this.f2032).toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public boolean m1113(char c, int i) {
        CharSequence charSequence = (CharSequence) this.f2032;
        int i2 = i + 1;
        while (!m1125(i2) && charSequence.charAt(i2) == ' ') {
            i2++;
        }
        return !m1125(i2) && charSequence.charAt(i2) == c;
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public int m1114(char c, int i) {
        CharSequence charSequence = (CharSequence) this.f2032;
        do {
            i++;
            if (m1125(i)) {
                break;
            }
        } while (charSequence.charAt(i) == ' ');
        if (charSequence.charAt(i) == c) {
            return i;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public char m1115(int i) {
        CharSequence charSequence = (CharSequence) this.f2032;
        do {
            i++;
            if (m1125(i)) {
                break;
            }
        } while (charSequence.charAt(i) == ' ');
        if (m1125(i)) {
            return ' ';
        }
        return charSequence.charAt(i);
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public int m1116(int i) {
        do {
            i--;
            if (m1125(i)) {
                break;
            }
        } while (((CharSequence) this.f2032).charAt(i) == ' ');
        if (m1125(i)) {
            return -1;
        }
        return i;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public boolean m1117(int i) {
        return i >= 0 && i <= this.f2031;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public char m1118() {
        return ((CharSequence) this.f2032).charAt(this.f2030);
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public void m1119(char c) {
        m1127();
        if (m1118() != c) {
            throw new C2569(String.format("Expected character: %c", Character.valueOf(c)));
        }
        m1128(1);
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public boolean m1120(char c) {
        return ((CharSequence) this.f2032).charAt(this.f2030) == c;
    }

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public void m1121() {
        m1127();
        while (m1117(this.f2030) && this.f2030 < this.f2031 && m1123(' ')) {
            this.f2031--;
        }
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public int m1122(int i, char c, char c2, boolean z) {
        CharSequence charSequence = (CharSequence) this.f2032;
        if (charSequence.charAt(i) != c) {
            throw new C2569("Expected " + c + " but found " + charSequence.charAt(i));
        }
        int i2 = 1;
        int i3 = i + 1;
        while (m1117(i3)) {
            char cCharAt = charSequence.charAt(i3);
            if (cCharAt == '\'' || cCharAt == '\"') {
                int iM1124 = m1124(cCharAt, i3);
                if (iM1124 == -1) {
                    throw new C2569("Could not find matching close quote for " + cCharAt + " when parsing : " + ((Object) charSequence));
                }
                i3 = iM1124 + 1;
            }
            if (z && charSequence.charAt(i3) == '/') {
                int iM11242 = m1124('/', i3);
                if (iM11242 == -1) {
                    C0188.m805(charSequence, "Could not find matching close for / when parsing regex in : ");
                    return 0;
                }
                i3 = iM11242 + 1;
            }
            if (charSequence.charAt(i3) == c) {
                i2++;
            }
            if (charSequence.charAt(i3) == c2 && i2 - 1 == 0) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public boolean m1123(char c) {
        return ((CharSequence) this.f2032).charAt(this.f2031) == c;
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public int m1124(char c, int i) {
        CharSequence charSequence = (CharSequence) this.f2032;
        boolean z = false;
        for (int i2 = i + 1; !m1125(i2); i2++) {
            if (z) {
                z = false;
            } else if ('\\' == charSequence.charAt(i2)) {
                z = true;
            } else if (c == charSequence.charAt(i2)) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public boolean m1125(int i) {
        return !m1117(i);
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public boolean m1126() {
        return this.f2030 >= this.f2031;
    }

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public void m1127() {
        while (m1117(this.f2030) && this.f2030 < this.f2031 && m1118() == ' ') {
            m1128(1);
        }
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public void m1128(int i) {
        this.f2030 += i;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public boolean m1129(String str) {
        m1127();
        if (!m1117((str.length() + this.f2030) - 1)) {
            return false;
        }
        int i = this.f2030;
        if (!((CharSequence) this.f2032).subSequence(i, str.length() + i).equals(str)) {
            return false;
        }
        m1128(str.length());
        return true;
    }

    public C0394(String str) {
        this.f2029 = 1;
        this.f2032 = str;
        this.f2030 = 0;
        this.f2031 = str.length() - 1;
    }

    public C0394(byte[] bArr, int i, int i2) {
        this.f2029 = 0;
        this.f2032 = bArr;
        this.f2030 = i;
        this.f2031 = i2;
    }

    public C0394() {
        this.f2029 = 3;
        this.f2032 = new C0394[256];
        this.f2030 = 0;
        this.f2031 = 0;
    }

    public C0394(int i, int i2) {
        this.f2029 = 3;
        this.f2032 = null;
        this.f2030 = i;
        int i3 = i2 & 7;
        this.f2031 = i3 == 0 ? 8 : i3;
    }
}
