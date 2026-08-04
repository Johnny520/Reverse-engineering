package yyds;

import android.app.AlertDialog;
import android.content.Context;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.android.NativeUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᛱᛲᛴᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0074 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public Object f638;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public Object f639;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public Object f640;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f641;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public int f642;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public Object f643;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public Object f644;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public Object f645;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public Object f646;

    public C0074(Context context, AlertDialog alertDialog, C1213 c1213, LinearLayout linearLayout, ImageView imageView, TextView textView) {
        final int i = 1;
        this.f641 = 1;
        this.f644 = context;
        this.f646 = alertDialog;
        this.f640 = c1213;
        this.f645 = linearLayout;
        this.f642 = -1;
        final int i2 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: yyds.ᲈᛲᲈᛱ

            /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
            public final /* synthetic */ C0074 f12855;

            static {
                NativeUtil.classesInit0(198);
            }

            {
                this.f12855 = this;
            }

            @Override // android.view.View.OnClickListener
            public final native void onClick(View view);
        });
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: yyds.ᲈᛲᲈᛱ

            /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
            public final /* synthetic */ C0074 f12855;

            static {
                NativeUtil.classesInit0(198);
            }

            {
                this.f12855 = this;
            }

            @Override // android.view.View.OnClickListener
            public final native void onClick(View view);
        });
        m464();
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static ArrayList m460(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iM1290 = AbstractC0473.m1290(str, '&', i, 4);
            if (iM1290 == -1) {
                iM1290 = str.length();
            }
            int iM12902 = AbstractC0473.m1290(str, '=', i, 4);
            if (iM12902 == -1 || iM12902 > iM1290) {
                arrayList.add(str.substring(i, iM1290));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, iM12902));
                arrayList.add(str.substring(iM12902 + 1, iM1290));
            }
            i = iM1290 + 1;
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        switch (this.f641) {
            case 0:
                StringBuilder sb = new StringBuilder();
                String str = (String) this.f644;
                if (str != null) {
                    sb.append(str);
                    sb.append("://");
                } else {
                    sb.append("//");
                }
                if (((String) this.f646).length() > 0 || ((String) this.f640).length() > 0) {
                    sb.append((String) this.f646);
                    if (((String) this.f640).length() > 0) {
                        sb.append(':');
                        sb.append((String) this.f640);
                    }
                    sb.append('@');
                }
                String str2 = (String) this.f645;
                if (str2 != null) {
                    if (AbstractC0473.m1295(str2, ':')) {
                        sb.append('[');
                        sb.append((String) this.f645);
                        sb.append(']');
                    } else {
                        sb.append((String) this.f645);
                    }
                }
                int i = -1;
                if (this.f642 != -1 || ((String) this.f644) != null) {
                    int iM463 = m463();
                    String str3 = (String) this.f644;
                    if (str3 == null) {
                        sb.append(':');
                        sb.append(iM463);
                    } else {
                        if (str3.equals("http")) {
                            i = 80;
                        } else if (str3.equals("https")) {
                            i = 443;
                        }
                        if (iM463 != i) {
                        }
                    }
                }
                ArrayList arrayList = (ArrayList) this.f638;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    sb.append('/');
                    sb.append((String) arrayList.get(i2));
                }
                if (((ArrayList) this.f639) != null) {
                    sb.append('?');
                    ArrayList arrayList2 = (ArrayList) this.f639;
                    C2536 c2536M1484 = AbstractC0598.m1484(AbstractC0598.m1485(0, arrayList2.size()), 2);
                    int i3 = c2536M1484.f12492;
                    int i4 = c2536M1484.f12493;
                    int i5 = c2536M1484.f12491;
                    if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                        while (true) {
                            String str4 = (String) arrayList2.get(i3);
                            String str5 = (String) arrayList2.get(i3 + 1);
                            if (i3 > 0) {
                                sb.append('&');
                            }
                            sb.append(str4);
                            if (str5 != null) {
                                sb.append('=');
                                sb.append(str5);
                            }
                            if (i3 != i4) {
                                i3 += i5;
                            }
                        }
                    }
                }
                if (((String) this.f643) != null) {
                    sb.append('#');
                    sb.append((String) this.f643);
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public void m461() {
        MediaPlayer mediaPlayer = (MediaPlayer) this.f643;
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
            }
            mediaPlayer.release();
        }
        this.f643 = null;
        this.f642 = -1;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public C0082 m462() {
        ArrayList arrayList;
        String str = (String) this.f644;
        if (str == null) {
            C0188.m800("scheme == null");
            return null;
        }
        String strM1967 = AbstractC0879.m1967(0, 0, 7, (String) this.f646);
        String strM19672 = AbstractC0879.m1967(0, 0, 7, (String) this.f640);
        String str2 = (String) this.f645;
        if (str2 == null) {
            C0188.m800("host == null");
            return null;
        }
        int iM463 = m463();
        ArrayList arrayList2 = (ArrayList) this.f638;
        ArrayList arrayList3 = new ArrayList(AbstractC0055.m419(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(AbstractC0879.m1967(0, 0, 7, (String) it.next()));
        }
        ArrayList<String> arrayList4 = (ArrayList) this.f639;
        if (arrayList4 != null) {
            arrayList = new ArrayList(AbstractC0055.m419(arrayList4, 10));
            for (String str3 : arrayList4) {
                arrayList.add(str3 != null ? AbstractC0879.m1967(0, 0, 3, str3) : null);
            }
        } else {
            arrayList = null;
        }
        String str4 = (String) this.f643;
        return new C0082(str, strM1967, strM19672, str2, iM463, arrayList, str4 != null ? AbstractC0879.m1967(0, 0, 7, str4) : null, toString());
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public int m463() {
        int i = this.f642;
        if (i != -1) {
            return i;
        }
        String str = (String) this.f644;
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [yyds.ᲈᛸᛳ] */
    /* JADX WARN: Type inference failed for: r5v2, types: [yyds.ᲈᛸᛳ] */
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public void m464() {
        LinearLayout linearLayout = (LinearLayout) this.f645;
        C0907.f4128.getClass();
        List listM2022 = C0907.m2022();
        boolean zIsEmpty = listM2022.isEmpty();
        C1213 c1213 = (C1213) this.f640;
        final int i = 0;
        if (zIsEmpty) {
            c1213.setVisibility(8);
            linearLayout.setVisibility(0);
            return;
        }
        c1213.setVisibility(0);
        linearLayout.setVisibility(8);
        final int i2 = 1;
        C0433 c0433 = new C0433(new ArrayList(listM2022), new C1565(4, this), new InterfaceC1549(this) { // from class: yyds.ᲈᛸᛳ

            /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
            public final /* synthetic */ C0074 f13343;

            static {
                NativeUtil.classesInit0(95);
            }

            {
                this.f13343 = this;
            }

            @Override // yyds.InterfaceC1549
            /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
            public final native Object mo371(Object obj);
        }, new InterfaceC1549(this) { // from class: yyds.ᲈᛸᛳ

            /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
            public final /* synthetic */ C0074 f13343;

            static {
                NativeUtil.classesInit0(95);
            }

            {
                this.f13343 = this;
            }

            @Override // yyds.InterfaceC1549
            /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
            public final native Object mo371(Object obj);
        });
        this.f638 = c0433;
        c1213.setAdapter(c0433);
        c1213.setLayoutManager(new LinearLayoutManager(1));
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x002a  */
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m465(C0082 c0082, String str) {
        int i;
        Object obj;
        Object obj2;
        int i2;
        int i3;
        int iM2923;
        int i4;
        char cCharAt;
        String str2 = str;
        ArrayList arrayList = (ArrayList) this.f638;
        byte[] bArr = AbstractC1429.f6782;
        int iM2919 = AbstractC1429.m2919(str2, 0, str2.length());
        int iM2913 = AbstractC1429.m2913(str2, iM2919, str2.length());
        byte b = -1;
        if (iM2913 - iM2919 < 2) {
            i = -1;
        } else {
            char cCharAt2 = str2.charAt(iM2919);
            char c = 'a';
            if ((AbstractC1544.m3197(cCharAt2, 97) >= 0 && AbstractC1544.m3197(cCharAt2, 122) <= 0) || (AbstractC1544.m3197(cCharAt2, 65) >= 0 && AbstractC1544.m3197(cCharAt2, 90) <= 0)) {
                i = iM2919 + 1;
                while (true) {
                    if (i >= iM2913) {
                        break;
                    }
                    char cCharAt3 = str2.charAt(i);
                    if ((c <= cCharAt3 && cCharAt3 < '{') || (('A' <= cCharAt3 && cCharAt3 < '[') || (('0' <= cCharAt3 && cCharAt3 < ':') || cCharAt3 == '+' || cCharAt3 == '-' || cCharAt3 == '.'))) {
                        i++;
                        c = 'a';
                    } else if (cCharAt3 != ':') {
                        break;
                    }
                }
                i = -1;
            }
        }
        if (i != -1) {
            int i5 = i;
            i2 = 1;
            obj2 = "https";
            obj = "http";
            if (str2.regionMatches(true, iM2919, "https:", 0, 6)) {
                this.f644 = obj2;
                iM2919 += 6;
                str2 = str;
            } else {
                str2 = str;
                if (!str2.regionMatches(true, iM2919, "http:", 0, 5)) {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str2.substring(0, i5) + '\'');
                }
                this.f644 = obj;
                iM2919 += 5;
            }
        } else {
            obj = "http";
            obj2 = "https";
            i2 = 1;
            if (c0082 == null) {
                C0188.m798("Expected URL scheme 'http' or 'https' but no scheme was found for ".concat(str2.length() > 6 ? AbstractC0473.m1292(6, str2).concat("...") : str2));
                return;
            }
            this.f644 = c0082.f665;
        }
        int i6 = iM2919;
        int i7 = 0;
        while (true) {
            i3 = i2;
            if (i6 >= iM2913 || !((cCharAt = str2.charAt(i6)) == '/' || cCharAt == '\\')) {
                break;
            }
            i7++;
            i6++;
            i2 = i3;
        }
        byte b2 = 35;
        if (i7 >= 2 || c0082 == null || !AbstractC1544.m3188(c0082.f665, (String) this.f644)) {
            int i8 = iM2919 + i7;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                iM2923 = AbstractC1429.m2923(i8, iM2913, str2, "@/\\?#");
                byte bCharAt = iM2923 != iM2913 ? str2.charAt(iM2923) : b;
                if (bCharAt == b || bCharAt == b2 || bCharAt == 47 || bCharAt == 92 || bCharAt == 63) {
                    break;
                }
                if (bCharAt == 64) {
                    if (i9 == 0) {
                        int iM2925 = AbstractC1429.m2925(str2, ':', i8, iM2923);
                        String strM1971 = AbstractC0879.m1971(i8, iM2925, 112, str2, " \"':;<=>@[]^`{}|/\\?#");
                        if (i10 != 0) {
                            strM1971 = AbstractC2104.m4015(new StringBuilder((String) this.f646), "%40", strM1971);
                        }
                        this.f646 = strM1971;
                        if (iM2925 != iM2923) {
                            this.f640 = AbstractC0879.m1971(iM2925 + 1, iM2923, 112, str2, " \"':;<=>@[]^`{}|/\\?#");
                            i9 = i3;
                        }
                        i10 = i3;
                    } else {
                        this.f640 = ((String) this.f640) + "%40" + AbstractC0879.m1971(i8, iM2923, 112, str2, " \"':;<=>@[]^`{}|/\\?#");
                    }
                    i8 = iM2923 + 1;
                    b2 = 35;
                    b = -1;
                }
            }
            int i11 = i8;
            while (true) {
                if (i11 < iM2923) {
                    char cCharAt4 = str2.charAt(i11);
                    if (cCharAt4 == ':') {
                        break;
                    }
                    if (cCharAt4 == '[') {
                        do {
                            i11++;
                            if (i11 < iM2923) {
                            }
                        } while (str2.charAt(i11) != ']');
                    }
                    i11++;
                } else {
                    i11 = iM2923;
                    break;
                }
            }
            int i12 = i11 + 1;
            if (i12 < iM2923) {
                this.f645 = AbstractC0425.m1185(AbstractC0879.m1967(i8, i11, 4, str2));
                try {
                    i4 = Integer.parseInt(AbstractC0879.m1971(i12, iM2923, 120, str2, ""));
                } catch (NumberFormatException unused) {
                }
                if (i3 > i4 || i4 >= 65536) {
                    i4 = -1;
                }
                this.f642 = i4;
                if (i4 == -1) {
                    throw new IllegalArgumentException(("Invalid URL port: \"" + str2.substring(i12, iM2923) + '\"').toString());
                }
            } else {
                int i13 = -1;
                this.f645 = AbstractC0425.m1185(AbstractC0879.m1967(i8, i11, 4, str2));
                String str3 = (String) this.f644;
                if (str3.equals(obj)) {
                    i13 = 80;
                } else if (str3.equals(obj2)) {
                    i13 = 443;
                }
                this.f642 = i13;
            }
            if (((String) this.f645) == null) {
                throw new IllegalArgumentException(("Invalid URL host: \"" + str2.substring(i8, i11) + '\"').toString());
            }
            iM2919 = iM2923;
        } else {
            this.f646 = c0082.m476();
            this.f640 = c0082.m477();
            this.f645 = c0082.f670;
            this.f642 = c0082.f664;
            arrayList.clear();
            arrayList.addAll(c0082.m480());
            if (iM2919 == iM2913 || str2.charAt(iM2919) == '#') {
                String strM482 = c0082.m482();
                this.f639 = strM482 != null ? m460(AbstractC0879.m1971(0, 0, 83, strM482, " \"'<>#")) : null;
            }
        }
        int iM29232 = AbstractC1429.m2923(iM2919, iM2913, str2, "?#");
        if (iM2919 != iM29232) {
            char cCharAt5 = str2.charAt(iM2919);
            if (cCharAt5 == '/' || cCharAt5 == '\\') {
                arrayList.clear();
                arrayList.add("");
                iM2919++;
            } else {
                arrayList.set(arrayList.size() - 1, "");
            }
            while (iM2919 < iM29232) {
                int iM29233 = AbstractC1429.m2923(iM2919, iM29232, str2, "/\\");
                boolean z = iM29233 < iM29232;
                String strM19712 = AbstractC0879.m1971(iM2919, iM29233, 112, str2, " \"<>^`{}|/\\?#");
                if (!strM19712.equals(".") && !strM19712.equalsIgnoreCase("%2e")) {
                    if (!strM19712.equals("..") && !strM19712.equalsIgnoreCase("%2e.") && !strM19712.equalsIgnoreCase(".%2e") && !strM19712.equalsIgnoreCase("%2e%2e")) {
                        if (((CharSequence) arrayList.get(arrayList.size() - 1)).length() == 0) {
                            arrayList.set(arrayList.size() - 1, strM19712);
                        } else {
                            arrayList.add(strM19712);
                        }
                        if (z) {
                            arrayList.add("");
                        }
                    } else if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                        arrayList.add("");
                    } else {
                        arrayList.set(arrayList.size() - 1, "");
                    }
                }
                iM2919 = z ? iM29233 + 1 : iM29233;
            }
        }
        if (iM29232 < iM2913 && str2.charAt(iM29232) == '?') {
            int iM29252 = AbstractC1429.m2925(str2, '#', iM29232, iM2913);
            this.f639 = m460(AbstractC0879.m1971(iM29232 + 1, iM29252, 80, str2, " \"'<>#"));
            iM29232 = iM29252;
        }
        if (iM29232 >= iM2913 || str2.charAt(iM29232) != '#') {
            return;
        }
        this.f643 = AbstractC0879.m1971(iM29232 + 1, iM2913, 48, str2, "");
    }

    public C0074() {
        this.f641 = 0;
        this.f646 = "";
        this.f640 = "";
        this.f642 = -1;
        this.f638 = new ArrayList(new C2420(new String[]{""}, true));
    }
}
