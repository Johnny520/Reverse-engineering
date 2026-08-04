package yyds;

import android.view.View;
import android.view.ViewGroup;
import com.thegrizzlylabs.sardineandroid.model.Multistatus;
import java.io.IOException;
import org.json.JSONObject;
import org.xml.sax.SAXException;

/* JADX INFO: renamed from: yyds.ᛷᛸ */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0024 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final int[] f8167 = new int[0];

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final Object[] f8168 = new Object[0];

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final byte[] f8170 = {48, 49, 53, 0};

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final byte[] f8172 = {48, 49, 48, 0};

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final byte[] f8166 = {48, 48, 57, 0};

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final byte[] f8171 = {48, 48, 53, 0};

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static final byte[] f8169 = {48, 48, 49, 0};

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static final byte[] f8164 = {48, 48, 49, 0};

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static final byte[] f8165 = {48, 48, 50, 0};

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static C2770 m3293(JSONObject jSONObject) {
        AbstractC2328.m4341(-1494819990569838L);
        String strOptString = jSONObject.optString(AbstractC2328.m4341(-1494841465406318L), AbstractC2328.m4341(-1494858645275502L));
        String strOptString2 = jSONObject.optString(AbstractC2328.m4341(-1494862940242798L), AbstractC2328.m4341(-1494884415079278L));
        if (strOptString2.length() == 0) {
            String strOptString3 = jSONObject.optString(AbstractC2328.m4341(-1494888710046574L), AbstractC2328.m4341(-1494923069784942L));
            AbstractC2328.m4341(-1494927364752238L);
            strOptString2 = (AbstractC1544.m3188(strOptString, AbstractC2328.m4341(-1495704753832814L)) && strOptString3.equals(AbstractC2328.m4341(-1495717638734702L))) ? AbstractC2328.m4341(-1495730523636590L) : AbstractC1544.m3188(strOptString, AbstractC2328.m4341(-1495751998473070L)) ? AbstractC2328.m4341(-1495764883374958L) : AbstractC2328.m4341(-1495790653178734L);
        }
        String str = strOptString2;
        String strOptString4 = jSONObject.optString(AbstractC2328.m4341(-1494991789261678L), AbstractC2328.m4341(-1495004674163566L));
        AbstractC2328.m4341(-1495008969130862L);
        String strOptString5 = jSONObject.optString(AbstractC2328.m4341(-1495073393640302L), AbstractC2328.m4341(-1495112048345966L));
        AbstractC2328.m4341(-1495116343313262L);
        String strOptString6 = jSONObject.optString(AbstractC2328.m4341(-1495180767822702L), AbstractC2328.m4341(-1495210832593774L));
        AbstractC2328.m4341(-1495215127561070L);
        String strOptString7 = jSONObject.optString(AbstractC2328.m4341(-1495279552070510L), AbstractC2328.m4341(-1495313911808878L));
        AbstractC2328.m4341(-1495318206776174L);
        String strOptString8 = jSONObject.optString(AbstractC2328.m4341(-1495382631285614L), AbstractC2328.m4341(-1495404106122094L));
        AbstractC2328.m4341(-1495408401089390L);
        return new C2770(strOptString4, strOptString5, strOptString6, strOptString7, strOptString, strOptString8, jSONObject.optLong(AbstractC2328.m4341(-1495472825598830L), 0L), jSONObject.optLong(AbstractC2328.m4341(-1495520070239086L), 0L), m3300(jSONObject, AbstractC2328.m4341(-1495558724944750L)), m3300(jSONObject, AbstractC2328.m4341(-1495605969585006L)), m3300(jSONObject, AbstractC2328.m4341(-1495661804159854L)), str);
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public static void m3294(C0837 c0837) throws C1185 {
        if (c0837.f3852) {
            return;
        }
        throw new C1185("Error contacting " + c0837.f3858.f10389, c0837.f3860, c0837.f3850);
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static Multistatus m3295(C0837 c0837) throws IOException {
        m3294(c0837);
        AbstractC0379 abstractC0379 = c0837.f3849;
        if (abstractC0379 == null) {
            throw new C1185("No entity found in response", c0837.f3860, c0837.f3850);
        }
        try {
            return (Multistatus) AbstractC2515.m4559().read(Multistatus.class, abstractC0379.m1079());
        } catch (SAXException e) {
            C1693.m3442(e.getMessage(), e);
            return null;
        } catch (Exception e2) {
            throw new IOException("Not a valid DAV response", e2);
        }
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static C2578 m3296() {
        return new C2578(10);
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static C1455 m3297() {
        return new C1455(null);
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final int m3298(int i, int i2, int[] iArr) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0011  */
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static View m3299(int i) {
        ViewGroup viewGroup;
        if (i == -1 || i == 0) {
            C2336.f11496.m4354(AbstractC2328.m4341(-228019386614638L) + i);
            return null;
        }
        C2615.f12860.getClass();
        Object objM4713 = C2615.m4713();
        if (objM4713 == null) {
            viewGroup = null;
        } else {
            int i2 = AbstractC2293.f11258;
            C0802 c0802M3893 = AbstractC0476.m1327(objM4713).m3893();
            c0802M3893.f3681 = AbstractC2328.m4341(-227731623805806L);
            c0802M3893.m4478();
            C1558 c1558 = (C1558) AbstractC1595.m3281(c0802M3893.mo736());
            View view = c1558 != null ? (View) c1558.m3210() : null;
            if (view instanceof ViewGroup) {
                viewGroup = (ViewGroup) view;
            }
        }
        if (viewGroup == null) {
            viewGroup = null;
        } else {
            ViewGroup viewGroupM2902 = AbstractC1426.m2902(viewGroup);
            if (viewGroupM2902 != null) {
                viewGroup = viewGroupM2902;
            }
        }
        if (viewGroup == null) {
            return null;
        }
        return viewGroup.findViewById(i);
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public static String m3300(JSONObject jSONObject, String str) {
        if (!jSONObject.has(str) || jSONObject.isNull(str)) {
            return null;
        }
        String strOptString = jSONObject.optString(str);
        if (strOptString.length() > 0) {
            return strOptString;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public static final void m3301(String str) {
        throw new IllegalArgumentException(str);
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static final InterfaceC0970 m3302(InterfaceC2798 interfaceC2798, boolean z, AbstractC0931 abstractC0931) {
        return interfaceC2798 instanceof AbstractC0986 ? ((AbstractC0986) interfaceC2798).m2146(z, abstractC0931) : interfaceC2798.mo2094(abstractC0931.mo926(), z, new C2635(1, abstractC0931, AbstractC0931.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 9));
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final int m3303(long[] jArr, int i, long j) {
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else {
                if (j2 <= j) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final void m3304(InterfaceC2213 interfaceC2213) {
        InterfaceC2798 interfaceC2798 = (InterfaceC2798) interfaceC2213.mo423(C1586.f8041);
        if (interfaceC2798 != null && !interfaceC2798.mo2091()) {
            throw interfaceC2798.mo2092();
        }
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static C2578 m3305(C2578 c2578) {
        c2578.m4653();
        c2578.f12709 = true;
        return c2578.f12711 > 0 ? c2578 : C2578.f12708;
    }
}
