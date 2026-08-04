package yyds;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import com.p000ss.android.ugc.awemes.WardDatabase;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.RejectedExecutionException;
import java.util.zip.GZIPInputStream;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: yyds.ᛱᛳᛳᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0090 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final byte[] f685 = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static boolean f686;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static final LinearLayout m488(Context context, String str, boolean z, InterfaceC1549 interfaceC1549) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setPadding(AbstractC1426.m2904(20), AbstractC1426.m2904(12), AbstractC1426.m2904(20), AbstractC1426.m2904(12));
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextSize(16.0f);
        textView.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        final Switch r7 = new Switch(context);
        r7.setChecked(z);
        r7.setOnCheckedChangeListener(new C1703(3, interfaceC1549));
        linearLayout.addView(textView);
        linearLayout.addView(r7);
        final int i = 5;
        linearLayout.setOnClickListener(new View.OnClickListener(r7, i) { // from class: yyds.ᛶᛶᛸᲁ

            /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
            public final /* synthetic */ int f6353;

            /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
            public final /* synthetic */ Switch f6354;

            @Override // android.view.View.OnClickListener
            public final native void onClick(View view);
        });
        return linearLayout;
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static void m489(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
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

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static String m490(float f) {
        float fM1483 = AbstractC0598.m1483(f, 0.0f, 1.0f) * 100.0f;
        if (fM1483 >= 99.95f) {
            return AbstractC2328.m4341(-190610221466478L);
        }
        String str = String.format(Locale.getDefault(), AbstractC2328.m4341(-190631696302958L), Arrays.copyOf(new Object[]{Float.valueOf(fM1483)}, 1));
        AbstractC2328.m4341(-190661761074030L);
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final Object m491(WardDatabase wardDatabase, InterfaceC1549 interfaceC1549, InterfaceC0274 interfaceC0274) {
        if (wardDatabase.m345() && wardDatabase.m352() && wardDatabase.m347()) {
            return interfaceC1549.mo371(interfaceC0274);
        }
        if (interfaceC0274.mo733().mo423(C0463.f2314) == null) {
            return interfaceC1549.mo371(interfaceC0274);
        }
        ExecutorC2250 executorC2250 = null;
        C0219 c0219 = new C0219(interfaceC1549, 0 == true ? 1 : 0, 11);
        C0058 c0058 = (C0058) interfaceC0274.mo733().mo423(C0058.f575);
        AbstractC0974 abstractC0974 = c0058 != null ? c0058.f576 : null;
        if (abstractC0974 != null) {
            return AbstractC2071.m3955(abstractC0974, c0219, interfaceC0274);
        }
        C1853 c1853 = new C1853(1, AbstractC1367.m2783(interfaceC0274));
        c1853.m3625();
        try {
            ExecutorC2250 executorC22502 = wardDatabase.f504;
            if (executorC22502 != null) {
                executorC2250 = executorC22502;
            }
            executorC2250.execute(new RunnableC0057(c1853, wardDatabase, c0219, 3));
        } catch (RejectedExecutionException e) {
            c1853.m3626(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e));
        }
        return c1853.m3629();
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static String m492(String str, String str2, String str3, String str4) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IOException, InvalidAlgorithmParameterException {
        AbstractC2328.m4341(-786274940781422L);
        AbstractC2328.m4341(-786322185421678L);
        AbstractC2328.m4341(-786360840127342L);
        AbstractC2328.m4341(-786399494833006L);
        byte[] bArrDecode = Base64.getDecoder().decode(str);
        byte[] bArrM3946 = AbstractC2070.m3946(bArrDecode, 0, 16);
        byte[] bArrM39462 = AbstractC2070.m3946(bArrDecode, 16, 32);
        byte[] bArrM39463 = AbstractC2070.m3946(bArrDecode, 32, bArrDecode.length);
        char[] charArray = AbstractC2104.m4014(str2, str3, str4).toCharArray();
        AbstractC2328.m4341(-786438149538670L);
        byte[] encoded = SecretKeyFactory.getInstance(AbstractC2328.m4341(-786511163982702L)).generateSecret(new PBEKeySpec(charArray, bArrM3946, 10000, 256)).getEncoded();
        if (bArrM39463.length != 0) {
            byte[] bArr = new byte[bArrM39463.length];
            int length = bArrM39463.length - 1;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    bArr[length - i] = bArrM39463[i];
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
            bArrM39463 = bArr;
        }
        byte[] bArr2 = new byte[bArrM39463.length];
        int length2 = bArrM39463.length;
        for (int i2 = 0; i2 < length2; i2++) {
            bArr2[i2] = (byte) (bArrM39463[i2] ^ encoded[i2 % encoded.length]);
        }
        Cipher cipher = Cipher.getInstance(AbstractC2328.m4341(-786601358295918L));
        cipher.init(2, new SecretKeySpec(encoded, AbstractC2328.m4341(-786691552609134L)), new IvParameterSpec(bArrM39462));
        GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(cipher.doFinal(bArr2)));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, gZIPInputStream.available()));
        byte[] bArr3 = new byte[8192];
        for (int i3 = gZIPInputStream.read(bArr3); i3 >= 0; i3 = gZIPInputStream.read(bArr3)) {
            byteArrayOutputStream.write(bArr3, 0, i3);
        }
        return new String(byteArrayOutputStream.toByteArray(), AbstractC0347.f1806);
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static List m493(Resources resources, int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(android.util.Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(android.util.Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static final C0837 m494(C0837 c0837) {
        C2294 c2294M1918 = c0837.m1918();
        AbstractC0379 abstractC0379 = c0837.f3849;
        c2294M1918.f11267 = new C1834(abstractC0379.mo910(), abstractC0379.mo909());
        return c2294M1918.m4297();
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bd A[EDGE_INSN: B:308:0x00bd->B:48:0x00bd BREAK  A[LOOP:10: B:35:0x0074->B:309:?]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f8  */
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static EnumC0847 m495(byte[] bArr) {
        int i;
        byte b;
        byte b2;
        byte b3;
        EnumC0847 enumC0847;
        byte b4;
        AbstractC2328.m4341(-627571604226926L);
        if (bArr.length < 4) {
            return EnumC0847.f3900;
        }
        EnumC0847 enumC08472 = (bArr.length >= 3 && bArr[0] == -1 && bArr[1] == -40 && bArr[2] == -1) ? EnumC0847.f3905 : null;
        if (enumC08472 == null) {
            if (bArr.length >= 8 && bArr.length >= 8) {
                for (int i2 = 0; i2 < 8; i2++) {
                    if (bArr[i2] != f685[i2]) {
                        enumC08472 = null;
                        break;
                    }
                }
                if (bArr.length > 40) {
                    String strM4341 = AbstractC2328.m4341(-627636028736366L);
                    if (bArr.length < 12) {
                        enumC08472 = EnumC0847.f3889;
                        if (enumC08472 == null) {
                            if (bArr.length < 6) {
                                i = 0;
                            } else {
                                i = 0;
                                if (bArr[0] == 71 && bArr[1] == 73 && bArr[2] == 70 && bArr[3] == 56 && (((b = bArr[4]) == 55 || b == 57) && bArr[5] == 97)) {
                                    enumC08472 = EnumC0847.f3891;
                                }
                                if (enumC08472 == null) {
                                    if (bArr.length < 12) {
                                        enumC08472 = null;
                                        b2 = 13;
                                    } else {
                                        b2 = 13;
                                        enumC08472 = (bArr[i] == 82 && bArr[1] == 73 && bArr[2] == 70 && bArr[3] == 70 && bArr[8] == 87 && bArr[9] == 69 && bArr[10] == 66 && bArr[11] == 80) ? (bArr.length >= 21 && bArr[12] == 86 && bArr[13] == 80 && bArr[14] == 56 && bArr[15] == 88 && (bArr[20] & 2) != 0) ? EnumC0847.f3902 : EnumC0847.f3901 : null;
                                    }
                                    if (enumC08472 == null) {
                                        if (bArr.length >= 12 && bArr[4] == 102 && bArr[5] == 116 && bArr[6] == 121 && bArr[7] == 112) {
                                            int i3 = ((bArr[i] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                                            long j = -628005395923822L;
                                            String strM43412 = 12 > bArr.length ? AbstractC2328.m4341(-628005395923822L) : new String(bArr, 8, 4, AbstractC0347.f1811);
                                            LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC2366.m4382(1));
                                            linkedHashSet.add(new String[]{strM43412}[i]);
                                            int iMin = Math.min(i3, bArr.length);
                                            int i4 = 16;
                                            while (true) {
                                                int i5 = i4 + 4;
                                                if (i5 > iMin) {
                                                    break;
                                                }
                                                long j2 = j;
                                                String strM43413 = i5 > bArr.length ? AbstractC2328.m4341(j2) : new String(bArr, i4, 4, AbstractC0347.f1811);
                                                if (!AbstractC0473.m1313(strM43413)) {
                                                    int i6 = i;
                                                    while (true) {
                                                        if (i6 >= strM43413.length()) {
                                                            linkedHashSet.add(strM43413);
                                                            break;
                                                        }
                                                        if (!Character.isLetterOrDigit(strM43413.charAt(i6))) {
                                                            break;
                                                        }
                                                        i6++;
                                                    }
                                                }
                                                i4 = i5;
                                                j = j2;
                                            }
                                            Set setM441 = AbstractC0068.m441(AbstractC2328.m4341(-627657503572846L), AbstractC2328.m4341(-627678978409326L));
                                            Set setSingleton = Collections.singleton(AbstractC2328.m4341(-627700453245806L));
                                            if (linkedHashSet.isEmpty()) {
                                                Set setM4412 = AbstractC0068.m441(AbstractC2328.m4341(-627721928082286L), AbstractC2328.m4341(-627743402918766L), AbstractC2328.m4341(-627764877755246L), AbstractC2328.m4341(-627786352591726L));
                                                Set setM4413 = AbstractC0068.m441(AbstractC2328.m4341(-627807827428206L), AbstractC2328.m4341(-627829302264686L), AbstractC2328.m4341(-627850777101166L), AbstractC2328.m4341(-627872251937646L));
                                                if (linkedHashSet.isEmpty()) {
                                                    Iterator it = linkedHashSet.iterator();
                                                    while (it.hasNext()) {
                                                        if (setM4412.contains((String) it.next())) {
                                                            enumC08472 = EnumC0847.f3893;
                                                            break;
                                                        }
                                                    }
                                                    if (linkedHashSet.isEmpty()) {
                                                    }
                                                } else if (linkedHashSet.isEmpty()) {
                                                    Iterator it2 = linkedHashSet.iterator();
                                                    while (it2.hasNext()) {
                                                        if (setM4413.contains((String) it2.next())) {
                                                            enumC08472 = EnumC0847.f3906;
                                                            break;
                                                        }
                                                    }
                                                    Set setSingleton2 = Collections.singleton(AbstractC2328.m4341(-627893726774126L));
                                                    Set setSingleton3 = Collections.singleton(AbstractC2328.m4341(-627915201610606L));
                                                    if (linkedHashSet.isEmpty()) {
                                                    }
                                                } else {
                                                    Set setSingleton22 = Collections.singleton(AbstractC2328.m4341(-627893726774126L));
                                                    Set setSingleton32 = Collections.singleton(AbstractC2328.m4341(-627915201610606L));
                                                    if (linkedHashSet.isEmpty()) {
                                                        Iterator it3 = linkedHashSet.iterator();
                                                        while (it3.hasNext()) {
                                                            if (setSingleton32.contains((String) it3.next())) {
                                                                enumC08472 = EnumC0847.f3890;
                                                                break;
                                                            }
                                                        }
                                                        if (linkedHashSet.isEmpty()) {
                                                        }
                                                    } else if (linkedHashSet.isEmpty()) {
                                                        Iterator it4 = linkedHashSet.iterator();
                                                        while (it4.hasNext()) {
                                                            if (setSingleton22.contains((String) it4.next())) {
                                                                enumC08472 = EnumC0847.f3898;
                                                                break;
                                                            }
                                                        }
                                                        enumC08472 = null;
                                                        if (enumC08472 == null) {
                                                        }
                                                    } else {
                                                        enumC08472 = null;
                                                        if (enumC08472 == null) {
                                                            enumC08472 = (bArr.length >= 2 && bArr[i] == 66 && bArr[1] == 77) ? EnumC0847.f3897 : null;
                                                            if (enumC08472 == null) {
                                                                enumC08472 = (bArr.length >= 4 && (((b3 = bArr[i]) == 73 && bArr[1] == 73 && bArr[2] == 42 && bArr[3] == 0) || (b3 == 77 && bArr[1] == 77 && bArr[2] == 0 && bArr[3] == 42))) ? EnumC0847.f3896 : null;
                                                                if (enumC08472 == null) {
                                                                    enumC08472 = (bArr.length >= 4 && bArr[i] == 0 && bArr[1] == 0 && bArr[2] == 1 && bArr[3] == 0) ? EnumC0847.f3904 : null;
                                                                    if (enumC08472 == null) {
                                                                        if (bArr.length >= 5) {
                                                                            int i7 = (bArr.length >= 3 && bArr[i] == -17 && bArr[1] == -69 && bArr[2] == -65) ? 3 : i;
                                                                            while (i7 < bArr.length) {
                                                                                byte b5 = bArr[i7];
                                                                                if (b5 != 32 && b5 != 9 && b5 != 10) {
                                                                                    b4 = b2;
                                                                                    if (b5 != b4) {
                                                                                        break;
                                                                                    }
                                                                                } else {
                                                                                    b4 = b2;
                                                                                }
                                                                                i7++;
                                                                                b2 = b4;
                                                                            }
                                                                            int length = bArr.length - i7;
                                                                            if (length < 4) {
                                                                                enumC0847 = null;
                                                                            } else {
                                                                                String str = new String(bArr, i7, Math.min(length, 256), AbstractC0347.f1806);
                                                                                if (str.startsWith(AbstractC2328.m4341(-627936676447086L)) || str.startsWith(AbstractC2328.m4341(-627962446250862L)) || AbstractC0473.m1301(str, AbstractC2328.m4341(-627983921087342L), true)) {
                                                                                    enumC0847 = EnumC0847.f3894;
                                                                                }
                                                                            }
                                                                        }
                                                                        return enumC0847 == null ? EnumC0847.f3900 : enumC0847;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                Iterator it5 = linkedHashSet.iterator();
                                                while (it5.hasNext()) {
                                                    if (setM441.contains((String) it5.next())) {
                                                        if (linkedHashSet.isEmpty()) {
                                                            enumC08472 = EnumC0847.f3892;
                                                            if (enumC08472 == null) {
                                                            }
                                                        } else {
                                                            Iterator it6 = linkedHashSet.iterator();
                                                            while (it6.hasNext()) {
                                                                if (setSingleton.contains((String) it6.next())) {
                                                                    enumC08472 = EnumC0847.f3903;
                                                                    break;
                                                                }
                                                            }
                                                            enumC08472 = EnumC0847.f3892;
                                                            if (enumC08472 == null) {
                                                            }
                                                        }
                                                    }
                                                }
                                                Set setM44122 = AbstractC0068.m441(AbstractC2328.m4341(-627721928082286L), AbstractC2328.m4341(-627743402918766L), AbstractC2328.m4341(-627764877755246L), AbstractC2328.m4341(-627786352591726L));
                                                Set setM44132 = AbstractC0068.m441(AbstractC2328.m4341(-627807827428206L), AbstractC2328.m4341(-627829302264686L), AbstractC2328.m4341(-627850777101166L), AbstractC2328.m4341(-627872251937646L));
                                                if (linkedHashSet.isEmpty()) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            enumC08472 = null;
                            if (enumC08472 == null) {
                            }
                        }
                    } else {
                        byte[] bytes = strM4341.getBytes(AbstractC0347.f1811);
                        AbstractC2328.m4341(-628009690891118L);
                        int iMin2 = Math.min(bArr.length, 1048576);
                        int i8 = 8;
                        while (i8 + 8 <= iMin2) {
                            int i9 = ((bArr[i8] & 255) << 24) | ((bArr[i8 + 1] & 255) << 16) | ((bArr[i8 + 2] & 255) << 8) | (bArr[i8 + 3] & 255);
                            if (bArr[i8 + 4] == bytes[0] && bArr[i8 + 5] == bytes[1] && bArr[i8 + 6] == bytes[2] && bArr[i8 + 7] == bytes[3]) {
                                enumC08472 = EnumC0847.f3895;
                                break;
                            }
                            i8 += i9 + 12;
                            if (i9 < 0) {
                                break;
                            }
                        }
                        enumC08472 = EnumC0847.f3889;
                        if (enumC08472 == null) {
                        }
                    }
                }
            } else {
                enumC08472 = null;
                if (enumC08472 == null) {
                }
            }
        }
        return enumC08472;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static InterfaceC0285 m496(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        int i;
        int i2;
        int i3;
        TypedArray typedArray;
        do {
            next = xmlResourceParser.next();
            i = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            m489(xmlResourceParser);
            return null;
        }
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC1030.f4685);
        int i4 = 0;
        String string = typedArrayObtainAttributes.getString(0);
        String string2 = typedArrayObtainAttributes.getString(5);
        String string3 = typedArrayObtainAttributes.getString(6);
        String string4 = typedArrayObtainAttributes.getString(2);
        int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
        int i5 = 3;
        int integer = typedArrayObtainAttributes.getInteger(3, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(4, 500);
        String string5 = typedArrayObtainAttributes.getString(7);
        typedArrayObtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC1030.f4686);
                        int i6 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i7 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                        String string6 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                        int i8 = typedArrayObtainAttributes2.getInt(i7, 0);
                        int i9 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = typedArrayObtainAttributes2.getResourceId(i9, 0);
                        typedArrayObtainAttributes2.getString(i9);
                        typedArrayObtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            m489(xmlResourceParser);
                        }
                        arrayList.add(new C1238(i6, z, string6, i8, resourceId2));
                    } else {
                        m489(xmlResourceParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new C0984((C1238[]) arrayList.toArray(new C1238[0]));
        }
        List listM493 = m493(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlResourceParser.next() != i5) {
            if (xmlResourceParser.getEventType() == i) {
                if (xmlResourceParser.getName().equals("fallback")) {
                    TypedArray typedArrayObtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC1030.f4687);
                    try {
                        String string7 = typedArrayObtainAttributes3.getString(i4);
                        String string8 = typedArrayObtainAttributes3.getString(1);
                        i3 = integer;
                        String string9 = typedArrayObtainAttributes3.getString(i);
                        if (string7 == null) {
                            typedArray = typedArrayObtainAttributes3;
                            throw new XmlPullParserException("query attribute must be set in fallback element");
                        }
                        while (xmlResourceParser.next() != i5) {
                            m489(xmlResourceParser);
                        }
                        try {
                            typedArray = typedArrayObtainAttributes3;
                            i2 = i5;
                            try {
                                C1396 c1396 = new C1396(string, string2, string7, listM493, string8, string9);
                                typedArray.recycle();
                                arrayList2.add(c1396);
                            } catch (Throwable th) {
                                th = th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            typedArray = typedArrayObtainAttributes3;
                        }
                        th = th;
                    } catch (Throwable th3) {
                        th = th3;
                        typedArray = typedArrayObtainAttributes3;
                    }
                    typedArray.recycle();
                    throw th;
                }
                i2 = i5;
                i3 = integer;
                m489(xmlResourceParser);
                i5 = i2;
                integer = i3;
                i = 2;
                i4 = 0;
            }
        }
        int i10 = integer;
        if (!arrayList2.isEmpty()) {
            return new C1331(arrayList2, i10, integer2, string5);
        }
        if (string3 == null) {
            C0188.m798("The provider font XML requires query attribute or fallback children.");
            return null;
        }
        arrayList2.add(new C1396(string, string2, string3, listM493, null, null));
        if (string4 != null) {
            arrayList2.add(new C1396(string, string2, string4, listM493, null, null));
        }
        return new C1331(arrayList2, i10, integer2, string5);
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static String m497(long j) {
        if (j <= 0) {
            return AbstractC2328.m4341(-190713300681582L);
        }
        String[] strArr = {AbstractC2328.m4341(-190730480550766L), AbstractC2328.m4341(-190739070485358L), AbstractC2328.m4341(-190751955387246L), AbstractC2328.m4341(-190764840289134L), AbstractC2328.m4341(-190777725191022L)};
        double d = j;
        int i = 0;
        while (d >= 1024.0d && i < 4) {
            d /= 1024.0d;
            i++;
        }
        if (i != 0) {
            String str = String.format(Locale.getDefault(), AbstractC2328.m4341(-190803494994798L), Arrays.copyOf(new Object[]{Double.valueOf(d), strArr[i]}, 2));
            AbstractC2328.m4341(-190837854733166L);
            return str;
        }
        return j + AbstractC2328.m4341(-190790610092910L);
    }
}
