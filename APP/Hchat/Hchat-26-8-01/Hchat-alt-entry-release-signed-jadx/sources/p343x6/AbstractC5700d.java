package p343x6;

import ac.AbstractC0063p;
import af.C0083f;
import af.C0084g;
import ai.C0089b;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.Size;
import android.util.SizeF;
import android.view.DragEvent;
import android.view.View;
import androidx.lifecycle.C0119x;
import androidx.lifecycle.InterfaceC0112q;
import be.AbstractC0283h;
import be.C0305w;
import bsh.org.objectweb.asm.Opcodes;
import gg.AbstractC1416l;
import java.io.File;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ke.InterfaceC2395d;
import ke.InterfaceC2396e;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Settings;
import okio.C3193a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000a.AbstractC0000a;
import p002a1.C0010h;
import p012ah.C0086a;
import p015b0.C0153s;
import p036c9.C0416a1;
import p068eh.AbstractC0921a;
import p071f1.AbstractC0996c0;
import p071f1.C1034w;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p094g6.C1354b;
import p099h.Hchat.R;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.model.WeChatMessage;
import p099h.Hchat.hooks.api.model.WeChatSnsPost;
import p099h.Hchat.utils.KavaReflector;
import p100h0.C1545q0;
import p100h0.C1548s;
import p100h0.C1552u;
import p100h0.C1554v;
import p100h0.C1556w;
import p100h0.EnumC1521h;
import p109hb.C1697t;
import p117i0.AbstractC1874r;
import p117i0.C1823e;
import p117i0.C1828f0;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.C1876r1;
import p117i0.InterfaceC1809a1;
import p119i2.AbstractC1923e0;
import p119i2.C1935k0;
import p119i2.C1939m0;
import p119i2.C1942o;
import p121i4.C1960b0;
import p121i4.C1973n;
import p121i4.C1980u;
import p126ia.C2031y;
import p133j2.AbstractC2062l;
import p136j8.AbstractC2091b;
import p136j8.AbstractC2094e;
import p136j8.C2104o;
import p136j8.C2105p;
import p136j8.C2114y;
import p144k.C2209s1;
import p147k2.InterfaceC2237d;
import p153k8.C2355s;
import p153k8.C2356t;
import p161l2.AbstractC2439d;
import p167l8.C2529d;
import p197n9.C2912a;
import p198nb.C2924a;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p222p.AbstractC3199a;
import p243q9.C3471g;
import p243q9.C3472h;
import p254r3.C3656c;
import p259r9.AbstractC3754e0;
import p266s0.C3874d;
import p266s0.C3878h;
import p269s3.AbstractC3924b;
import p269s3.C3923a;
import p269s3.C3925c;
import p269s3.C3927e;
import p276sf.C3958e;
import p276sf.C3959f;
import p276sf.C3967n;
import p276sf.EnumC3957d;
import p276sf.InterfaceC3956c;
import p293u2.C4245o;
import p293u2.C4246p;
import p293u2.EnumC4243m;
import p293u2.InterfaceC4233c;
import p294u3.InterfaceC4250c;
import p300ub.AbstractC4302b;
import p302ud.C4322r;
import p302ud.InterfaceC4312h;
import p302ud.InterfaceC4314j;
import p302ud.InterfaceC4318n;
import p304uf.C4329c;
import p304uf.C4335i;
import p305uh.C4354c;
import p305uh.C4355d;
import p307v0.AbstractC4371k;
import p308v1.InterfaceC4412n0;
import p321w.AbstractC4634s;
import p326w4.C4683c;
import p326w4.InterfaceC4684d;
import p339x1.C5601f;
import p339x1.C5660y;
import p339x1.InterfaceC5605g;
import p343x6.AbstractC5700d;
import p356y0.AbstractC5839a;
import p356y0.InterfaceC5853o;
import p357y1.AbstractC5888h1;
import p357y1.AbstractC5891i0;
import p357y1.AbstractC5940u1;
import p357y1.C5884g1;
import p358y2.C5962a;
import p358y2.C5964b;
import p358y2.C5968d;
import p358y2.C5970e;
import p358y2.C5971f;
import p358y2.C5985t;
import p358y2.C5986u;
import p358y2.DialogC5987v;
import sh.C4054v;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.C4173t;
import tf.C4175v;

/* JADX INFO: renamed from: x6.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5700d implements InterfaceC2237d {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static final float m10245A(Layout layout, int i9, Paint paint) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i9);
        ThreadLocal threadLocal = AbstractC2062l.f6932a;
        if (layout.getEllipsisCount(i9) <= 0 || layout.getParagraphDirection(i9) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i9) + layout.getLineStart(i9)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i9);
        if ((paragraphAlignment == null ? -1 : AbstractC2439d.f8025a[paragraphAlignment.ordinal()]) == 1) {
            fAbs = Math.abs(lineLeft);
            width = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - fMeasureText;
        }
        return width + fAbs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static final float m10246B(Layout layout, int i9, Paint paint) {
        float width;
        float width2;
        ThreadLocal threadLocal = AbstractC2062l.f6932a;
        if (layout.getEllipsisCount(i9) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i9) != -1 || layout.getWidth() >= layout.getLineRight(i9)) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getLineRight(i9) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i9) + layout.getLineStart(i9)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i9);
        if ((paragraphAlignment != null ? AbstractC2439d.f8025a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i9);
            width2 = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i9);
            width2 = layout.getWidth() - fMeasureText;
        }
        return width - width2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public static final long m10247C(C0119x c0119x) {
        DragEvent dragEvent = (DragEvent) c0119x.f310h;
        float x4 = dragEvent.getX();
        float y10 = dragEvent.getY();
        return (((long) Float.floatToRawIntBits(x4)) << 32) | (((long) Float.floatToRawIntBits(y10)) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public static final long m10248D(int i9) {
        return m10260R(4294967296L, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public static String m10249E(String str, String str2) {
        str2.getClass();
        return str + "_" + str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public static boolean m10250F(Class cls, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        while (cls != null && cls != Object.class) {
            try {
                Iterator<Field> it = KavaReflector.declaredFields(cls).iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next().getName())) {
                        return true;
                    }
                }
                cls = cls.getSuperclass();
            } catch (Throwable unused) {
                return false;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public static void m10251H(View view, InterfaceC0112q interfaceC0112q, InterfaceC4250c interfaceC4250c, C0416a1 c0416a1, C0416a1 c0416a12) {
        view.getClass();
        view.setTag(R.id.view_tree_lifecycle_owner, interfaceC0112q);
        view.setTag(R.id.view_tree_saved_state_registry_owner, interfaceC4250c);
        view.setTag(R.id.view_tree_view_model_store_owner, c0416a1);
        view.setTag(R.id.view_tree_navigation_event_dispatcher_owner, c0416a12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public static boolean m10252I(InterfaceC4684d interfaceC4684d, InterfaceC4684d interfaceC4684d2) {
        C4683c type = interfaceC4684d.getType();
        C4683c type2 = interfaceC4684d2.getType();
        if (type.equals(type2)) {
            return true;
        }
        int i9 = type.f15649h;
        int i10 = type2.f15649h;
        if (i9 == 10) {
            type = C4683c.f15613E;
            i9 = 9;
        }
        if (i10 == 10) {
            type2 = C4683c.f15613E;
            i10 = 9;
        }
        if (i9 != 9 || i10 != 9) {
            return type.m9195s() && type2.m9195s();
        }
        C4683c c4683c = C4683c.f15645x;
        if (type == c4683c) {
            return false;
        }
        if (type2 == c4683c || type == C4683c.f15613E) {
            return true;
        }
        if (!type.m9192p()) {
            return !type2.m9192p() || type == C4683c.f15614F || type == C4683c.f15609A;
        }
        if (!type2.m9192p()) {
            return false;
        }
        do {
            type = type.m9190k();
            type2 = type2.m9190k();
            if (!type.m9192p()) {
                break;
            }
        } while (type2.m9192p());
        return m10252I(type, type2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public static List m10253J(String str) {
        String strReplace = AbstractC3156t.m6737a0(str, "\r\n", "\n", false).replace('\r', '\n');
        strReplace.getClass();
        return strReplace.length() == 0 ? C4173t.f13710g : AbstractC3149m.m6713l0(strReplace, '\n') ? AbstractC3149m.m6691F0(AbstractC3149m.m6712k0(1, strReplace), new char[]{'\n'}, 6) : AbstractC3149m.m6691F0(strReplace, new char[]{'\n'}, 6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public static final List m10254K(Context context) {
        Object c3959f;
        context.getClass();
        SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(context, "Hchat_group_chat_labels");
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        String string = sharedPreferencesM8640c.getString("labels", HttpUrl.FRAGMENT_ENCODE_SET);
        if (string != null) {
            str = string;
        }
        boolean zM6721t0 = AbstractC3149m.m6721t0(str);
        C4173t c4173t = C4173t.f13710g;
        if (zM6721t0) {
            return c4173t;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            C4329c c4329cM7E = AbstractC0000a.m7E();
            int length = jSONArray.length();
            for (int i9 = 0; i9 < length; i9++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i9);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("id");
                    strOptString.getClass();
                    String string2 = AbstractC3149m.m6703R0(strOptString).toString();
                    String strOptString2 = jSONObjectOptJSONObject.optString("name");
                    strOptString2.getClass();
                    String string3 = AbstractC3149m.m6703R0(strOptString2).toString();
                    if (!AbstractC3149m.m6721t0(string2) && !AbstractC3149m.m6721t0(string3)) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("groups");
                        if (jSONArrayOptJSONArray == null) {
                            jSONArrayOptJSONArray = new JSONArray();
                        }
                        int length2 = jSONArrayOptJSONArray.length();
                        for (int i10 = 0; i10 < length2; i10++) {
                            String strOptString3 = jSONArrayOptJSONArray.optString(i10);
                            strOptString3.getClass();
                            String string4 = AbstractC3149m.m6703R0(strOptString3).toString();
                            if (AbstractC3149m.m6721t0(string4)) {
                                string4 = null;
                            }
                            if (string4 != null) {
                                linkedHashSet.add(string4);
                            }
                        }
                        c4329cM7E.add(new C2912a(string2, string3, linkedHashSet));
                    }
                }
            }
            c3959f = AbstractC0000a.m90t(c4329cM7E);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Object obj = c4173t;
        if (!(c3959f instanceof C3959f)) {
            obj = c3959f;
        }
        return (List) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public static int[] m10255L(int i9) {
        return new int[(i9 + 31) >> 5];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public static C1980u m10256M(C1980u c1980u, C1980u c1980u2) {
        InterfaceC4684d[] interfaceC4684dArr = c1980u.f6708h;
        if (c1980u != c1980u2) {
            int length = interfaceC4684dArr.length;
            if (c1980u2.f6708h.length != length) {
                throw new C1960b0("mismatched maxLocals values", null);
            }
            C1980u c1980u3 = null;
            for (int i9 = 0; i9 < length; i9++) {
                InterfaceC4684d interfaceC4684d = interfaceC4684dArr[i9];
                InterfaceC4684d interfaceC4684dM10258O = m10258O(interfaceC4684d, c1980u2.f6708h[i9]);
                if (interfaceC4684dM10258O != interfaceC4684d) {
                    if (c1980u3 == null) {
                        c1980u3 = new C1980u(interfaceC4684dArr.length);
                        System.arraycopy(interfaceC4684dArr, 0, c1980u3.f6708h, 0, interfaceC4684dArr.length);
                    }
                    if (interfaceC4684dM10258O == null) {
                        c1980u3.m10855j();
                        c1980u3.f6708h[i9] = null;
                    } else {
                        c1980u3.mo4899s(i9, interfaceC4684dM10258O);
                    }
                }
            }
            if (c1980u3 != null) {
                c1980u3.f24613g = false;
                return c1980u3;
            }
        }
        return c1980u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public static C1973n m10257N(C1973n c1973n, C1973n c1973n2) {
        if (c1973n == c1973n2) {
            return c1973n;
        }
        int i9 = c1973n.f6693i;
        if (c1973n2.f6693i != i9) {
            throw new C1960b0("mismatched stack depths", null);
        }
        C1973n c1973nM4885n = null;
        for (int i10 = 0; i10 < i9; i10++) {
            InterfaceC4684d interfaceC4684dM4886o = c1973n.m4886o(i10);
            InterfaceC4684d interfaceC4684dM4886o2 = c1973n2.m4886o(i10);
            InterfaceC4684d interfaceC4684dM10258O = m10258O(interfaceC4684dM4886o, interfaceC4684dM4886o2);
            if (interfaceC4684dM10258O != interfaceC4684dM4886o) {
                if (c1973nM4885n == null) {
                    c1973nM4885n = c1973n.m4885n();
                }
                if (interfaceC4684dM10258O == null) {
                    throw new C1960b0("incompatible: " + interfaceC4684dM4886o + ", " + interfaceC4684dM4886o2, null);
                }
                try {
                    c1973nM4885n.m4884m(i10, interfaceC4684dM10258O);
                } catch (C1960b0 e6) {
                    e6.m2687a("...while merging stack[" + AbstractC0000a.m46X0(i10) + "]");
                    throw e6;
                }
                e6.m2687a("...while merging stack[" + AbstractC0000a.m46X0(i10) + "]");
                throw e6;
            }
        }
        if (c1973nM4885n == null) {
            return c1973n;
        }
        c1973nM4885n.f24613g = false;
        return c1973nM4885n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public static InterfaceC4684d m10258O(InterfaceC4684d interfaceC4684d, InterfaceC4684d interfaceC4684d2) {
        if (interfaceC4684d == null || interfaceC4684d.equals(interfaceC4684d2)) {
            return interfaceC4684d;
        }
        if (interfaceC4684d2 == null) {
            return null;
        }
        C4683c type = interfaceC4684d.getType();
        C4683c type2 = interfaceC4684d2.getType();
        if (type == type2) {
            return type;
        }
        if (!type.m9196t() || !type2.m9196t()) {
            if (type.m9195s() && type2.m9195s()) {
                return C4683c.f15641t;
            }
            return null;
        }
        C4683c c4683c = C4683c.f15645x;
        if (type == c4683c) {
            return type2;
        }
        if (type2 == c4683c) {
            return type;
        }
        if (!type.m9192p() || !type2.m9192p()) {
            return C4683c.f15613E;
        }
        InterfaceC4684d interfaceC4684dM10258O = m10258O(type.m9190k(), type2.m9190k());
        return interfaceC4684dM10258O == null ? C4683c.f15613E : ((C4683c) interfaceC4684dM10258O).m9187e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    public static String m10259Q(String str) {
        int iHashCode = str.hashCode();
        return (iHashCode == 3029889 ? str.equals("both") : iHashCode == 3046160 ? str.equals(WeChatSnsPost.TYPE_CARD) : iHashCode == 3556653 && str.equals(WeChatSnsPost.TYPE_TEXT)) ? str : WeChatSnsPost.TYPE_TEXT;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public static final long m10260R(long j3, float f3) {
        long jFloatToRawIntBits = j3 | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
        C4246p[] c4246pArr = C4245o.f13923b;
        return jFloatToRawIntBits;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S */
    public static List m10261S(String str) {
        Object c3959f;
        boolean zM6721t0 = AbstractC3149m.m6721t0(str);
        C4173t c4173t = C4173t.f13710g;
        if (zM6721t0) {
            return c4173t;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            C4329c c4329cM7E = AbstractC0000a.m7E();
            int length = jSONArray.length();
            for (int i9 = 0; i9 < length; i9++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i9);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("groupId");
                    strOptString.getClass();
                    String string = AbstractC3149m.m6703R0(strOptString).toString();
                    String strOptString2 = jSONObjectOptJSONObject.optString("templateId");
                    strOptString2.getClass();
                    String string2 = AbstractC3149m.m6703R0(strOptString2).toString();
                    if (string.length() > 0 && string2.length() > 0) {
                        String strOptString3 = jSONObjectOptJSONObject.optString("label");
                        strOptString3.getClass();
                        c4329cM7E.add(new C3472h(string, AbstractC3149m.m6703R0(strOptString3).toString(), string2));
                    }
                }
            }
            c3959f = AbstractC0000a.m90t(c4329cM7E);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Object obj = c4173t;
        if (!(c3959f instanceof C3959f)) {
            obj = c3959f;
        }
        return (List) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T */
    public static Set m10262T(String str) {
        Object c3959f;
        boolean zM6721t0 = AbstractC3149m.m6721t0(str);
        C4175v c4175v = C4175v.f13712g;
        if (zM6721t0) {
            return c4175v;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            C4335i c4335i = new C4335i();
            int length = jSONArray.length();
            for (int i9 = 0; i9 < length; i9++) {
                String strOptString = jSONArray.optString(i9);
                strOptString.getClass();
                String string = AbstractC3149m.m6703R0(strOptString).toString();
                if (string.length() > 0) {
                    c4335i.add(string);
                }
            }
            c3959f = AbstractC0063p.m415h(c4335i);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Object obj = c4175v;
        if (!(c3959f instanceof C3959f)) {
            obj = c3959f;
        }
        return (Set) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    public static List m10263U(String str) {
        Object c3959f;
        String str2;
        String str3 = "text_first";
        boolean zM6721t0 = AbstractC3149m.m6721t0(str);
        C4173t c4173t = C4173t.f13710g;
        if (zM6721t0) {
            return c4173t;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            C4329c c4329cM7E = AbstractC0000a.m7E();
            int length = jSONArray.length();
            int i9 = 0;
            int i10 = 0;
            while (i10 < length) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("id");
                    if (AbstractC3149m.m6721t0(strOptString)) {
                        strOptString = "rename_" + System.currentTimeMillis() + "_" + i10;
                    }
                    String strOptString2 = jSONObjectOptJSONObject.optString("name");
                    if (AbstractC3149m.m6721t0(strOptString2)) {
                        strOptString2 = "模板 " + (i10 + 1);
                    }
                    boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("enabled", true);
                    int iM7909r = AbstractC3754e0.m7909r(jSONObjectOptJSONObject.optInt("delaySeconds", i9), i9, 600);
                    String strOptString3 = jSONObjectOptJSONObject.optString("promptType", WeChatSnsPost.TYPE_TEXT);
                    strOptString3.getClass();
                    String strM10259Q = m10259Q(strOptString3);
                    String strOptString4 = jSONObjectOptJSONObject.optString("bothOrder", str3);
                    strOptString4.getClass();
                    String str4 = strOptString4.equals("card_first") ? "card_first" : str3;
                    String strOptString5 = jSONObjectOptJSONObject.optString(WeChatSnsPost.TYPE_TEXT, "%userName% 将群内昵称从“%oldGroupNickname%”修改为“%newGroupNickname%”");
                    strOptString5.getClass();
                    str2 = str3;
                    String strOptString6 = jSONObjectOptJSONObject.optString("cardTitle", "%userName% 修改了群内昵称");
                    strOptString6.getClass();
                    String strOptString7 = jSONObjectOptJSONObject.optString("cardDesc", "旧昵称：%oldGroupNickname%\n新昵称：%newGroupNickname%\n时间：%time%");
                    strOptString7.getClass();
                    c4329cM7E.add(new C3471g(strOptString, strOptString2, zOptBoolean, iM7909r, strM10259Q, str4, strOptString5, strOptString6, strOptString7));
                } else {
                    str2 = str3;
                }
                i10++;
                str3 = str2;
                i9 = 0;
            }
            c3959f = AbstractC0000a.m90t(c4329cM7E);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Object obj = c4173t;
        if (!(c3959f instanceof C3959f)) {
            obj = c3959f;
        }
        return (List) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W */
    public static String m10264W(int i9, int i10) {
        if (i10 == 0) {
            int i11 = i9 - 1;
            if (i11 < 0) {
                i11 = 0;
            }
            return AbstractC3199a.m6836i(i11, ",0");
        }
        return i9 + "," + i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: X */
    public static Long m10265X(Object obj, String str) {
        try {
            String strM10269a0 = m10269a0(obj, str);
            if (!TextUtils.isEmpty(strM10269a0) && strM10269a0.matches("^\\d+$")) {
                return Long.valueOf(Long.parseLong(strM10269a0));
            }
        } catch (Throwable unused) {
        }
        try {
            Matcher matcher = Pattern.compile("\"" + Pattern.quote(str) + "\"\\s*:\\s*(\"?)(\\d+)\\1").matcher(String.valueOf(obj));
            if (matcher.find()) {
                return Long.valueOf(Long.parseLong(matcher.group(2)));
            }
            return null;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    public static int m10266Y(Object obj, String str, String str2, String str3) {
        Object objM10277f0 = m10277f0(obj, str, str2, str3);
        Number number = objM10277f0 instanceof Number ? (Number) objM10277f0 : null;
        if (number != null) {
            return number.intValue();
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z */
    public static int m10267Z(Object obj, String str, int i9) {
        if (obj != null && !TextUtils.isEmpty(str)) {
            try {
                Object objInvoke = KavaReflector.invoke(KavaReflector.findMethod(obj.getClass(), "optInt", String.class, Integer.TYPE), obj, str, Integer.valueOf(i9));
                if (objInvoke instanceof Number) {
                    return ((Number) objInvoke).intValue();
                }
            } catch (Throwable unused) {
            }
            try {
                String strM10269a0 = m10269a0(obj, str);
                if (!TextUtils.isEmpty(strM10269a0)) {
                    return Integer.parseInt(strM10269a0);
                }
            } catch (Throwable unused2) {
            }
        }
        return i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m10268a(InterfaceC1220a interfaceC1220a, C5986u c5986u, C3874d c3874d, C1836h0 c1836h0, int i9) {
        c1836h0.m4527b0(826668973);
        int i10 = i9 | (c1836h0.m4538h(interfaceC1220a) ? 4 : 2) | (c1836h0.m4534f(c5986u) ? 32 : 16);
        if (c1836h0.m4516S(i10 & 1, (i10 & 147) != 146)) {
            View view = (View) c1836h0.m4542j(AbstractC5891i0.f23950f);
            InterfaceC4233c interfaceC4233c = (InterfaceC4233c) c1836h0.m4542j(AbstractC5888h1.f23926h);
            EnumC4243m enumC4243m = (EnumC4243m) c1836h0.m4542j(AbstractC5888h1.f23932n);
            C1828f0 c1828f0M4642x = AbstractC1874r.m4642x(c1836h0);
            InterfaceC1809a1 interfaceC1809a1M4643y = AbstractC1874r.m4643y(c3874d, c1836h0);
            Object[] objArr = new Object[0];
            Object objM4514P = c1836h0.m4514P();
            Object obj = C1851l.f6155a;
            if (objM4514P == obj) {
                objM4514P = C5968d.f24256h;
                c1836h0.m4545k0(objM4514P);
            }
            UUID uuid = (UUID) AbstractC4371k.m8805c(objArr, (InterfaceC1220a) objM4514P, c1836h0, 48);
            boolean zM4530d = c1836h0.m4530d(2) | c1836h0.m4534f(view) | c1836h0.m4534f(interfaceC4233c) | c1836h0.m4534f(null);
            Object objM4514P2 = c1836h0.m4514P();
            if (zM4530d || objM4514P2 == obj) {
                DialogC5987v dialogC5987v = new DialogC5987v(interfaceC1220a, c5986u, view, enumC4243m, interfaceC4233c, uuid);
                C3874d c3874d2 = new C3874d(-1338939603, new C0010h(interfaceC1809a1M4643y, 5), true);
                C5985t c5985t = dialogC5987v.f24316m;
                c5985t.setParentCompositionContext(c1828f0M4642x);
                c5985t.f24302q.setValue(c3874d2);
                c5985t.f24306u = true;
                c5985t.m10554e();
                c1836h0.m4545k0(dialogC5987v);
                objM4514P2 = dialogC5987v;
            }
            DialogC5987v dialogC5987v2 = (DialogC5987v) objM4514P2;
            boolean zM4538h = c1836h0.m4538h(dialogC5987v2);
            Object objM4514P3 = c1836h0.m4514P();
            if (zM4538h || objM4514P3 == obj) {
                objM4514P3 = new C5962a(dialogC5987v2, 0);
                c1836h0.m4545k0(objM4514P3);
            }
            AbstractC1874r.m4621c(dialogC5987v2, (InterfaceC1231l) objM4514P3, c1836h0);
            boolean zM4538h2 = c1836h0.m4538h(dialogC5987v2) | ((i10 & 14) == 4) | ((i10 & 112) == 32) | c1836h0.m4530d(enumC4243m.ordinal());
            Object objM4514P4 = c1836h0.m4514P();
            if (zM4538h2 || objM4514P4 == obj) {
                objM4514P4 = new C5964b(dialogC5987v2, interfaceC1220a, c5986u, enumC4243m);
                c1836h0.m4545k0(objM4514P4);
            }
            AbstractC1874r.m4628j((InterfaceC1220a) objM4514P4, c1836h0);
        } else {
            c1836h0.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C5884g1(interfaceC1220a, c5986u, c3874d, i9, 2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a0 */
    public static String m10269a0(Object obj, String str) {
        if (obj == null || TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Object objInvoke = KavaReflector.invoke(KavaReflector.findMethod(obj.getClass(), "getString", String.class), obj, str);
            if (objInvoke != null) {
                return String.valueOf(objInvoke);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b0 */
    public static long m10270b0(Object obj, String str, String str2, String str3) {
        Object objM10277f0 = m10277f0(obj, str, str2, str3);
        Number number = objM10277f0 instanceof Number ? (Number) objM10277f0 : null;
        if (number != null) {
            return number.longValue();
        }
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c0 */
    public static String m10271c0(Object obj, String str) {
        Object field = null;
        Object field2 = TextUtils.isEmpty(str) ? null : KavaReflector.readField(obj, str);
        if (field2 == null) {
            return null;
        }
        try {
            if (!TextUtils.isEmpty("d")) {
                field = KavaReflector.readField(field2, "d");
            }
            if (field != null) {
                return String.valueOf(field);
            }
        } catch (Throwable unused) {
        }
        return String.valueOf(field2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final void m10272d(C3927e c3927e, boolean z9, InterfaceC1220a interfaceC1220a, InterfaceC1220a interfaceC1220a2, C1836h0 c1836h0, int i9, int i10) {
        int i11;
        InterfaceC1220a interfaceC1220a3;
        InterfaceC1220a interfaceC1220a4;
        c1836h0.m4527b0(1220469155);
        if ((i9 & 6) == 0) {
            i11 = (c1836h0.m4534f(c3927e) ? 4 : 2) | i9;
        } else {
            i11 = i9;
        }
        if ((i9 & 48) == 0) {
            i11 |= c1836h0.m4536g(z9) ? 32 : 16;
        }
        int i12 = i10 & 4;
        if (i12 != 0) {
            i11 |= 384;
        } else if ((i9 & 384) == 0) {
            i11 |= c1836h0.m4538h(interfaceC1220a) ? Opcodes.ACC_NATIVE : 128;
        }
        if ((i9 & 3072) == 0) {
            i11 |= c1836h0.m4538h(interfaceC1220a2) ? Opcodes.ACC_STRICT : 1024;
        }
        if (c1836h0.m4516S(i11 & 1, (i11 & 1171) != 1170)) {
            C1823e c1823e = C1851l.f6155a;
            if (i12 != 0) {
                Object objM4514P = c1836h0.m4514P();
                if (objM4514P == c1823e) {
                    objM4514P = new C2209s1(7);
                    c1836h0.m4545k0(objM4514P);
                }
                interfaceC1220a4 = (InterfaceC1220a) objM4514P;
            } else {
                interfaceC1220a4 = interfaceC1220a;
            }
            Object objM4514P2 = c1836h0.m4514P();
            if (objM4514P2 == c1823e) {
                objM4514P2 = new C2209s1(7);
                c1836h0.m4545k0(objM4514P2);
            }
            InterfaceC1220a interfaceC1220a5 = (InterfaceC1220a) objM4514P2;
            Object objM4514P3 = c1836h0.m4514P();
            if (objM4514P3 == c1823e) {
                objM4514P3 = new C2209s1(7);
                c1836h0.m4545k0(objM4514P3);
            }
            int i13 = (i11 & 14) | 3504;
            int i14 = i11 << 9;
            int i15 = (i14 & 3670016) | i13 | (57344 & i14) | (458752 & i14);
            InterfaceC1220a interfaceC1220a6 = interfaceC1220a4;
            m10274e(c3927e, false, interfaceC1220a5, (InterfaceC1220a) objM4514P3, z9, interfaceC1220a6, interfaceC1220a2, c1836h0, i15);
            interfaceC1220a3 = interfaceC1220a6;
        } else {
            c1836h0.m4519V();
            interfaceC1220a3 = interfaceC1220a;
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C3925c(c3927e, z9, interfaceC1220a3, interfaceC1220a2, i9, i10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d0 */
    public static String m10273d0(Object obj, String str, String str2, String str3) {
        Object objM10277f0 = m10277f0(obj, str, str2, str3);
        String string = objM10277f0 != null ? objM10277f0.toString() : null;
        return string == null ? HttpUrl.FRAGMENT_ENCODE_SET : string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final void m10274e(C3927e c3927e, final boolean z9, final InterfaceC1220a interfaceC1220a, final InterfaceC1220a interfaceC1220a2, final boolean z10, final InterfaceC1220a interfaceC1220a3, final InterfaceC1220a interfaceC1220a4, C1836h0 c1836h0, final int i9) {
        int i10;
        final boolean z11;
        InterfaceC1220a interfaceC1220a5;
        InterfaceC1220a interfaceC1220a6;
        boolean z12;
        InterfaceC1220a interfaceC1220a7;
        InterfaceC1220a interfaceC1220a8;
        Object obj;
        boolean z13;
        final C3927e c3927e2 = c3927e;
        c1836h0.m4527b0(898330592);
        if ((i9 & 6) == 0) {
            i10 = (c1836h0.m4534f(c3927e2) ? 4 : 2) | i9;
        } else {
            i10 = i9;
        }
        if ((i9 & 48) == 0) {
            z11 = z9;
            i10 |= c1836h0.m4536g(z11) ? 32 : 16;
        } else {
            z11 = z9;
        }
        if ((i9 & 384) == 0) {
            interfaceC1220a5 = interfaceC1220a;
            i10 |= c1836h0.m4538h(interfaceC1220a5) ? 256 : 128;
        } else {
            interfaceC1220a5 = interfaceC1220a;
        }
        if ((i9 & 3072) == 0) {
            interfaceC1220a6 = interfaceC1220a2;
            i10 |= c1836h0.m4538h(interfaceC1220a6) ? Opcodes.ACC_STRICT : 1024;
        } else {
            interfaceC1220a6 = interfaceC1220a2;
        }
        if ((i9 & 24576) == 0) {
            z12 = z10;
            i10 |= c1836h0.m4536g(z12) ? 16384 : 8192;
        } else {
            z12 = z10;
        }
        if ((196608 & i9) == 0) {
            interfaceC1220a7 = interfaceC1220a3;
            i10 |= c1836h0.m4538h(interfaceC1220a7) ? Opcodes.ACC_DEPRECATED : 65536;
        } else {
            interfaceC1220a7 = interfaceC1220a3;
        }
        if ((1572864 & i9) == 0) {
            interfaceC1220a8 = interfaceC1220a4;
            i10 |= c1836h0.m4538h(interfaceC1220a8) ? 1048576 : 524288;
        } else {
            interfaceC1220a8 = interfaceC1220a4;
        }
        if (!c1836h0.m4516S(i10 & 1, (i10 & 599187) != 599186)) {
            c1836h0.m4519V();
        } else {
            if (((Boolean) c1836h0.m4542j(AbstractC5940u1.f24156a)).booleanValue()) {
                C1876r1 c1876r1M4557t = c1836h0.m4557t();
                if (c1876r1M4557t != null) {
                    final int i11 = 0;
                    final InterfaceC1220a interfaceC1220a9 = interfaceC1220a5;
                    final InterfaceC1220a interfaceC1220a10 = interfaceC1220a6;
                    final boolean z14 = z12;
                    final InterfaceC1220a interfaceC1220a11 = interfaceC1220a7;
                    final InterfaceC1220a interfaceC1220a12 = interfaceC1220a8;
                    c1876r1M4557t.f6241d = new InterfaceC1235p() { // from class: s3.d
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj2, Object obj3) {
                            switch (i11) {
                                case 0:
                                    ((Integer) obj3).getClass();
                                    AbstractC5700d.m10274e(c3927e2, z11, interfaceC1220a9, interfaceC1220a10, z14, interfaceC1220a11, interfaceC1220a12, (C1836h0) obj2, AbstractC1874r.m4617C(i9 | 1));
                                    break;
                                default:
                                    ((Integer) obj3).getClass();
                                    AbstractC5700d.m10274e(c3927e2, z11, interfaceC1220a9, interfaceC1220a10, z14, interfaceC1220a11, interfaceC1220a12, (C1836h0) obj2, AbstractC1874r.m4617C(i9 | 1));
                                    break;
                            }
                            return C3967n.f12976a;
                        }
                    };
                    return;
                }
                return;
            }
            C0416a1 c0416a1 = (C0416a1) c1836h0.m4542j(AbstractC3924b.f12884a);
            if (c0416a1 == null) {
                c1836h0.m4525a0(950836184);
                View view = (View) c1836h0.m4542j(AbstractC5891i0.f23950f);
                view.getClass();
                while (true) {
                    if (view == null) {
                        c0416a1 = null;
                        break;
                    }
                    Object tag = view.getTag(R.id.view_tree_navigation_event_dispatcher_owner);
                    C0416a1 c0416a12 = tag instanceof C0416a1 ? (C0416a1) tag : null;
                    if (c0416a12 != null) {
                        c0416a1 = c0416a12;
                        break;
                    } else {
                        Object objM3210t = AbstractC1184v0.m3210t(view);
                        view = objM3210t instanceof View ? (View) objM3210t : null;
                    }
                }
                c1836h0.m4553p(false);
            } else {
                c1836h0.m4525a0(950834231);
                c1836h0.m4553p(false);
            }
            if (c0416a1 == null) {
                C2104o.m5276A("No NavigationEventDispatcher was provided via LocalNavigationEventDispatcherOwner");
                return;
            }
            switch (c0416a1.f1193g) {
                case 0:
                    obj = c0416a1.f1197k;
                    break;
                case 1:
                    obj = c0416a1.f1197k;
                    break;
                case 2:
                    obj = c0416a1.f1197k;
                    break;
                case 3:
                    obj = c0416a1.f1197k;
                    break;
                case 4:
                    obj = c0416a1.f1197k;
                    break;
                default:
                    obj = c0416a1.f1197k;
                    break;
            }
            Object obj2 = obj;
            int i12 = i10 & 14;
            boolean z15 = i12 == 4;
            Object objM4514P = c1836h0.m4514P();
            Object obj3 = C1851l.f6155a;
            Object obj4 = objM4514P;
            if (z15 || objM4514P == obj3) {
                C3656c c3656c = (C3656c) c3927e2.f12903c.getValue();
                new C2924a(c3927e2, 9);
                c3656c.getClass();
                C3923a c3923a = new C3923a();
                c3923a.f12878a = c3656c;
                C4173t c4173t = C4173t.f13710g;
                c3923a.f12879b = c4173t;
                c3923a.f12880c = c4173t;
                c3923a.f12881d = false;
                c3923a.f12882e = false;
                c1836h0.m4545k0(c3923a);
                obj4 = c3923a;
            }
            C3923a c3923a2 = (C3923a) obj4;
            boolean zM4538h = ((i10 & 3670016) == 1048576) | c1836h0.m4538h(c3923a2) | ((i10 & 112) == 32) | ((i10 & 896) == 256) | ((i10 & 7168) == 2048) | ((57344 & i10) == 16384) | ((458752 & i10) == 131072) | (i12 == 4);
            Object objM4514P2 = c1836h0.m4514P();
            if (zM4538h || objM4514P2 == obj3) {
                z13 = false;
                Object c2031y = new C2031y(c3923a2, z9, interfaceC1220a, interfaceC1220a2, z10, interfaceC1220a3, interfaceC1220a4, c3927e2);
                c3923a2 = c3923a2;
                c3927e2 = c3927e2;
                c1836h0.m4545k0(c2031y);
                objM4514P2 = c2031y;
            } else {
                z13 = false;
            }
            AbstractC1874r.m4628j((InterfaceC1220a) objM4514P2, c1836h0);
            boolean zM4538h2 = c1836h0.m4538h(c3923a2) | (i12 == 4 ? true : z13) | c1836h0.m4538h(obj2);
            Object objM4514P3 = c1836h0.m4514P();
            if (zM4538h2 || objM4514P3 == obj3) {
                objM4514P3 = new C0153s(c3927e2, c3923a2, obj2, 17);
                c1836h0.m4545k0(objM4514P3);
            }
            AbstractC1874r.m4621c(c3927e2, (InterfaceC1231l) objM4514P3, c1836h0);
        }
        C1876r1 c1876r1M4557t2 = c1836h0.m4557t();
        if (c1876r1M4557t2 != null) {
            final int i13 = 1;
            c1876r1M4557t2.f6241d = new InterfaceC1235p() { // from class: s3.d
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p085fg.InterfaceC1235p
                public final Object invoke(Object obj22, Object obj32) {
                    switch (i13) {
                        case 0:
                            ((Integer) obj32).getClass();
                            AbstractC5700d.m10274e(c3927e2, z9, interfaceC1220a, interfaceC1220a2, z10, interfaceC1220a3, interfaceC1220a4, (C1836h0) obj22, AbstractC1874r.m4617C(i9 | 1));
                            break;
                        default:
                            ((Integer) obj32).getClass();
                            AbstractC5700d.m10274e(c3927e2, z9, interfaceC1220a, interfaceC1220a2, z10, interfaceC1220a3, interfaceC1220a4, (C1836h0) obj22, AbstractC1874r.m4617C(i9 | 1));
                            break;
                    }
                    return C3967n.f12976a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e0 */
    public static int m10275e0(byte[] bArr, int i9) {
        byte b10 = bArr[i9];
        byte b11 = bArr[i9 + 1];
        return ((bArr[i9 + 3] & 255) << 24) | ((bArr[i9 + 2] & 255) << 16) | ((b11 & 255) << 8) | (b10 & 255);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final void m10276f(InterfaceC5853o interfaceC5853o, InterfaceC1235p interfaceC1235p, C1836h0 c1836h0, int i9) {
        int i10;
        c1836h0.m4527b0(1090521195);
        if ((i9 & 6) == 0) {
            i10 = (c1836h0.m4534f(interfaceC5853o) ? 4 : 2) | i9;
        } else {
            i10 = i9;
        }
        if ((i9 & 48) == 0) {
            i10 |= c1836h0.m4538h(interfaceC1235p) ? 32 : 16;
        }
        if (c1836h0.m4516S(i10 & 1, (i10 & 19) != 18)) {
            Object objM4514P = c1836h0.m4514P();
            if (objM4514P == C1851l.f6155a) {
                objM4514P = C5970e.f24264b;
                c1836h0.m4545k0(objM4514P);
            }
            InterfaceC4412n0 interfaceC4412n0 = (InterfaceC4412n0) objM4514P;
            int iHashCode = Long.hashCode(c1836h0.f6095T);
            C3878h c3878hM4546l = c1836h0.m4546l();
            InterfaceC5853o interfaceC5853oM10543c = AbstractC5839a.m10543c(c1836h0, interfaceC5853o);
            InterfaceC5605g.f22815f.getClass();
            C5660y c5660y = C5601f.f22758b;
            int i11 = (((((i10 << 3) & 112) | (((i10 >> 3) & 14) | 384)) << 6) & 896) | 6;
            c1836h0.m4531d0();
            if (c1836h0.f6094S) {
                c1836h0.m4544k(c5660y);
            } else {
                c1836h0.m4551n0();
            }
            AbstractC1874r.m4615A(C5601f.f22761e, c1836h0, interfaceC4412n0);
            AbstractC1874r.m4615A(C5601f.f22760d, c1836h0, c3878hM4546l);
            AbstractC1874r.m4615A(C5601f.f22762f, c1836h0, Integer.valueOf(iHashCode));
            AbstractC1874r.m4641w(C5601f.f22763g, c1836h0);
            AbstractC1874r.m4615A(C5601f.f22759c, c1836h0, interfaceC5853oM10543c);
            interfaceC1235p.invoke(c1836h0, Integer.valueOf((i11 >> 6) & 14));
            c1836h0.m4553p(true);
        } else {
            c1836h0.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C5971f(interfaceC5853o, interfaceC1235p, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f0 */
    public static Object m10277f0(Object obj, String str, String str2, String str3) {
        Object objInvokeMethod = KavaReflector.invokeMethod(obj, str, new Object[0]);
        if (objInvokeMethod != null) {
            return objInvokeMethod;
        }
        Object field = KavaReflector.readField(obj, str2);
        return field != null ? field : KavaReflector.readField(obj, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g0 */
    public static void m10278g0(int[] iArr, int i9) {
        int i10 = i9 >> 5;
        iArr[i10] = (1 << (i9 & 31)) | iArr[i10];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h0 */
    public static void m10279h0(C4322r c4322r, InterfaceC2396e interfaceC2396e, InterfaceC4314j interfaceC4314j) {
        if (interfaceC4314j instanceof InterfaceC4312h) {
            interfaceC2396e.mo2617d(c4322r, (InterfaceC4312h) interfaceC4314j);
        } else if (interfaceC4314j instanceof InterfaceC4318n) {
            InterfaceC4318n interfaceC4318n = (InterfaceC4318n) interfaceC4314j;
            if (interfaceC2396e.mo2614a(c4322r, interfaceC4318n)) {
                interfaceC4318n.mo8675u().forEach(new C0305w(c4322r, 10, interfaceC2396e));
            }
            interfaceC2396e.mo2615b(c4322r, interfaceC4318n);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static final C1554v m10280i(C1545q0 c1545q0, C1556w c1556w) {
        EnumC1521h enumC1521hM4043d = c1545q0.m4043d();
        C1548s c1548s = (C1548s) c1545q0.f5154d;
        boolean z9 = enumC1521hM4043d == EnumC1521h.f5080g;
        return new C1554v(m10285l(c1548s, z9, true, c1556w), m10285l(c1548s, z9, false, c1556w), z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i0 */
    public static void m10281i0(C4322r c4322r, InterfaceC2395d interfaceC2395d) {
        int size = c4322r.f14425z.size() * 5;
        int i9 = 0;
        while (true) {
            boolean zM10283j0 = m10283j0(c4322r, interfaceC2395d, c4322r.f14407G);
            int i10 = i9 + 1;
            if (i9 > size) {
                throw new C0084g("Iterative traversal limit reached: limit: " + size + ", visitor: " + interfaceC2395d.getClass().getName() + ", blocks count: " + c4322r.f14425z.size());
            }
            if (!zM10283j0) {
                return;
            } else {
                i9 = i10;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static final boolean m10282j(Method method) {
        return !KavaReflector.isStatic(method) && AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE) && method.getParameterCount() == 3 && AbstractC1416l.m3825a(method.getParameterTypes()[1], JSONObject.class) && AbstractC1416l.m3825a(method.getParameterTypes()[2], Integer.TYPE) && AbstractC0921a.m2236A(method, false, "com.tencent.mm.plugin.appbrand.jsapi.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j0 */
    public static boolean m10283j0(C4322r c4322r, InterfaceC2395d interfaceC2395d, InterfaceC4314j interfaceC4314j) {
        if (!(interfaceC4314j instanceof InterfaceC4318n)) {
            return false;
        }
        InterfaceC4318n interfaceC4318n = (InterfaceC4318n) interfaceC4314j;
        if (interfaceC2395d.mo193c(c4322r, interfaceC4318n)) {
            return true;
        }
        Iterator it = interfaceC4318n.mo8675u().iterator();
        while (it.hasNext()) {
            try {
                if (m10283j0(c4322r, interfaceC2395d, (InterfaceC4314j) it.next())) {
                    return true;
                }
            } catch (StackOverflowError unused) {
                throw new C0083f("Region traversal failed: Recursive call in traverseIterativeStepInternal method");
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static final C1552u m10284k(final C1545q0 c1545q0, final C1548s c1548s, C1552u c1552u) {
        int i9 = c1548s.f5162c;
        int i10 = c1548s.f5161b;
        boolean z9 = c1545q0.f5152b;
        final int i11 = z9 ? i10 : i9;
        C1935k0 c1935k0 = (C1935k0) c1548s.f5164e;
        int i12 = c1548s.f5163d;
        C4054v c4054v = new C4054v(i11, 5, c1548s);
        EnumC3957d enumC3957d = EnumC3957d.f12959h;
        final InterfaceC3956c interfaceC3956cM1127G = AbstractC0283h.m1127G(enumC3957d, c4054v);
        final int i13 = z9 ? i9 : i10;
        InterfaceC3956c interfaceC3956cM1127G2 = AbstractC0283h.m1127G(enumC3957d, new InterfaceC1220a() { // from class: h0.x
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, sf.c] */
            @Override // p085fg.InterfaceC1220a
            public final Object invoke() {
                C1548s c1548s2 = c1548s;
                C1935k0 c1935k02 = (C1935k0) c1548s2.f5164e;
                int iIntValue = ((Number) interfaceC3956cM1127G.getValue()).intValue();
                C1545q0 c1545q02 = c1545q0;
                boolean z10 = c1545q02.f5152b;
                boolean z11 = c1545q02.m4043d() == EnumC1521h.f5080g;
                int i14 = i11;
                long jM4810j = c1935k02.m4810j(i14);
                C1942o c1942o = c1935k02.f6562b;
                int i15 = C1939m0.f6574c;
                int iM4807g = (int) (jM4810j >> 32);
                int iM4827d = c1942o.m4827d(iM4807g);
                int i16 = c1942o.f6588f;
                if (iM4827d != iIntValue) {
                    iM4807g = iIntValue >= i16 ? c1935k02.m4807g(i16 - 1) : c1935k02.m4807g(iIntValue);
                }
                int iM4826c = (int) (jM4810j & 4294967295L);
                if (c1942o.m4827d(iM4826c) != iIntValue) {
                    iM4826c = iIntValue >= i16 ? c1942o.m4826c(i16 - 1, false) : c1942o.m4826c(iIntValue, false);
                }
                int i17 = i13;
                if (iM4807g == i17) {
                    return c1548s2.m4046a(iM4826c);
                }
                if (iM4826c == i17) {
                    return c1548s2.m4046a(iM4807g);
                }
                if (!(z10 ^ z11) ? i14 >= iM4807g : i14 > iM4826c) {
                    iM4807g = iM4826c;
                }
                return c1548s2.m4046a(iM4807g);
            }
        });
        if (1 != c1552u.f5180c) {
            return (C1552u) interfaceC3956cM1127G2.getValue();
        }
        if (i11 == i12) {
            return c1552u;
        }
        if (((Number) interfaceC3956cM1127G.getValue()).intValue() != c1935k0.f6562b.m4827d(i12)) {
            return (C1552u) interfaceC3956cM1127G2.getValue();
        }
        int i14 = c1552u.f5179b;
        long jM4810j = c1935k0.m4810j(i14);
        if (i12 != -1) {
            if (i11 != i12) {
                EnumC1521h enumC1521h = EnumC1521h.f5080g;
                if (!(((i10 < i9 ? EnumC1521h.f5081h : i10 > i9 ? enumC1521h : EnumC1521h.f5082i) == enumC1521h) ^ z9)) {
                }
            }
            return c1548s.m4046a(i11);
        }
        int i15 = C1939m0.f6574c;
        return (i14 == ((int) (jM4810j >> 32)) || i14 == ((int) (4294967295L & jM4810j))) ? (C1552u) interfaceC3956cM1127G2.getValue() : c1548s.m4046a(i11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static final C1552u m10285l(C1548s c1548s, boolean z9, boolean z10, C1556w c1556w) {
        long jM4784b;
        long j3;
        int i9 = z10 ? c1548s.f5161b : c1548s.f5162c;
        switch (c1556w.f5195a) {
            case 0:
                String str = ((C1935k0) c1548s.f5164e).f6561a.f6549a.f6529h;
                jM4784b = AbstractC1923e0.m4784b(AbstractC4634s.m9076s(str, i9), AbstractC4634s.m9075r(str, i9));
                break;
            default:
                jM4784b = ((C1935k0) c1548s.f5164e).m4810j(i9);
                break;
        }
        if (z9 ^ z10) {
            int i10 = C1939m0.f6574c;
            j3 = jM4784b >> 32;
        } else {
            int i11 = C1939m0.f6574c;
            j3 = 4294967295L & jM4784b;
        }
        return c1548s.m4046a((int) j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static final void m10286m(C0089b c0089b, String str, C4355d c4355d, boolean z9) {
        c4355d.getClass();
        long j3 = c4355d.f14549b;
        C4354c c4354c = c4355d.f14548a;
        float f3 = c4354c.f14545a - 0.5f;
        float f10 = c4354c.f14546b - 0.7f;
        float f11 = c4354c.f14547c;
        float fSqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10) + (f3 * f3));
        if (fSqrt < 1.0E-6f) {
            fSqrt = 1.0E-6f;
        }
        float f12 = f3 / fSqrt;
        float f13 = f10 / fSqrt;
        c0089b.f255a.setFloatUniform("lightDir".concat(str), f12, f13, f11 / fSqrt);
        c0089b.f255a.setColorUniform("lightColor".concat(str), AbstractC0996c0.m2526w(C1034w.m2634b(j3, 1.0f)));
        c0089b.f255a.setFloatUniform("lightIntensity".concat(str), C1034w.m2636d(j3) * c4355d.f14550c);
        if (z9) {
            float fSqrt2 = (float) Math.sqrt((f13 * f13) + (f12 * f12));
            if (fSqrt2 > 0.001f) {
                c0089b.f255a.setFloatUniform("axis".concat(str), f12 / fSqrt2, f13 / fSqrt2);
            } else {
                c0089b.f255a.setFloatUniform("axis".concat(str), 0.0f, str.equals("1") ? -1.0f : 1.0f);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static final Bundle m10287n(C3958e... c3958eArr) {
        Bundle bundle = new Bundle(c3958eArr.length);
        for (C3958e c3958e : c3958eArr) {
            String str = (String) c3958e.f12961g;
            Object obj = c3958e.f12962h;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                componentType.getClass();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        C0086a.m451j(componentType.getCanonicalName(), "Illegal value array type ", " for key \"", str, 34);
                        return null;
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    C0086a.m451j(obj.getClass().getCanonicalName(), "Illegal value type ", " for key \"", str, 34);
                    return null;
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static final C1552u m10288o(C1552u c1552u, C1548s c1548s, int i9) {
        return new C1552u(((C1935k0) c1548s.f5164e).m4801a(i9), i9, c1552u.f5180c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static void m10289p(View view) {
        view.getClass();
        view.setTag(R.id.view_tree_lifecycle_owner, null);
        view.setTag(R.id.view_tree_saved_state_registry_owner, null);
        view.setTag(R.id.view_tree_view_model_store_owner, null);
        view.setTag(R.id.view_tree_navigation_event_dispatcher_owner, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static void m10290q(int[] iArr, int i9) {
        int i10 = i9 >> 5;
        iArr[i10] = (~(1 << (i9 & 31))) & iArr[i10];
    }

    /* JADX DEBUG: Class process forced to load method for inline: okio.a.i(java.lang.String):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static final void m10291r(int i9, int i10) {
        if (i9 <= i10) {
            return;
        }
        C3193a.m6820i(AbstractC0921a.m2248k(i9, i10, "toIndex (", ") is greater than size (", ")."));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f4  */
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1697t m10292s(String str) {
        Object c3959f;
        C2356t c2356t;
        str.getClass();
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("retransmit");
            boolean z9 = true;
            if (jSONObjectOptJSONObject != null) {
                long jOptLong = jSONObjectOptJSONObject.optLong("msgId", jSONObject.optLong("msgId"));
                String strOptString = jSONObjectOptJSONObject.optString("sourceTalker", jSONObject.optString("sourceTalker"));
                strOptString.getClass();
                String strOptString2 = jSONObjectOptJSONObject.optString("content", jSONObject.optString("content"));
                strOptString2.getClass();
                int iOptInt = jSONObjectOptJSONObject.optInt("retrType", -1);
                int iOptInt2 = jSONObjectOptJSONObject.optInt("msgFromScene", 2);
                String strOptString3 = jSONObjectOptJSONObject.optString("fileName", jSONObject.optString("imagePath"));
                strOptString3.getClass();
                C2356t c2356t2 = new C2356t(iOptInt, iOptInt2, strOptString, strOptString2, strOptString3, jOptLong, jSONObjectOptJSONObject.optInt("length", 0));
                if (!(iOptInt >= 0)) {
                    c2356t2 = null;
                }
                c2356t = c2356t2;
            } else {
                c2356t = null;
            }
            long jOptLong2 = jSONObject.optLong("msgId");
            int iOptInt3 = jSONObject.optInt("type");
            String strOptString4 = jSONObject.optString("sourceTalker");
            strOptString4.getClass();
            String strOptString5 = jSONObject.optString("content");
            strOptString5.getClass();
            String strOptString6 = jSONObject.optString("imagePath");
            strOptString6.getClass();
            long jOptLong3 = jSONObject.optLong("createTime");
            String strOptString7 = jSONObject.optString("voicePath");
            strOptString7.getClass();
            int iOptInt4 = jSONObject.optInt("voiceDurationMillis", 1000);
            String strOptString8 = jSONObject.optString("voiceFileName");
            if (AbstractC3149m.m6721t0(strOptString8)) {
                strOptString8 = jSONObject.optString("imagePath");
                if (!((jSONObject.optInt("type") & Settings.DEFAULT_INITIAL_WINDOW_SIZE) == 34)) {
                    strOptString8 = null;
                }
                if (strOptString8 == null) {
                    strOptString8 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
            }
            Object c1697t = new C1697t(jOptLong2, iOptInt3, strOptString4, strOptString5, strOptString6, jOptLong3, c2356t, strOptString7, iOptInt4, strOptString8, null, 1024);
            if (jOptLong2 <= 0) {
                z9 = false;
                if (!z9) {
                    c1697t = null;
                }
                c3959f = c1697t;
            } else {
                if (c2356t == null) {
                    if (!new File(strOptString7).isFile()) {
                    }
                }
                if (!z9) {
                }
                c3959f = c1697t;
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        return (C1697t) c3959f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static String m10293t(List list) throws JSONException {
        list.getClass();
        JSONArray jSONArray = new JSONArray();
        HashSet hashSet = new HashSet();
        ArrayList<C3472h> arrayList = new ArrayList();
        for (Object obj : list) {
            if (hashSet.add(((C3472h) obj).f11264a)) {
                arrayList.add(obj);
            }
        }
        for (C3472h c3472h : arrayList) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("groupId", AbstractC3149m.m6703R0(c3472h.f11264a).toString());
            jSONObject.put("label", AbstractC3149m.m6703R0(c3472h.f11265b).toString());
            jSONObject.put("templateId", AbstractC3149m.m6703R0(c3472h.f11266c).toString());
            jSONArray.put(jSONObject);
        }
        String string = jSONArray.toString();
        string.getClass();
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static String m10294u(Set set) {
        JSONArray jSONArray = new JSONArray();
        Set set2 = set;
        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(set2));
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            AbstractC2091b.m5171r((String) it.next(), arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        Iterator it2 = AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList2)).iterator();
        while (it2.hasNext()) {
            jSONArray.put((String) it2.next());
        }
        String string = jSONArray.toString();
        string.getClass();
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static String m10295v(List list) throws JSONException {
        list.getClass();
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3471g c3471g = (C3471g) it.next();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", c3471g.f11255a);
            jSONObject.put("name", c3471g.f11256b);
            jSONObject.put("enabled", c3471g.f11257c);
            jSONObject.put("delaySeconds", AbstractC3754e0.m7909r(c3471g.f11258d, 0, 600));
            jSONObject.put("promptType", m10259Q(c3471g.f11259e));
            String str = "card_first";
            if (!c3471g.f11260f.equals("card_first")) {
                str = "text_first";
            }
            jSONObject.put("bothOrder", str);
            jSONObject.put(WeChatSnsPost.TYPE_TEXT, c3471g.f11261g);
            jSONObject.put("cardTitle", c3471g.f11262h);
            jSONObject.put("cardDesc", c3471g.f11263i);
            jSONArray.put(jSONObject);
        }
        String string = jSONArray.toString();
        string.getClass();
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static String m10296w(int i9, Object obj) {
        if (obj == null) {
            return null;
        }
        int iM10267Z = m10267Z(obj, "retcode", 0);
        int iM10267Z2 = m10267Z(obj, "isSender", -1);
        int iM10267Z3 = m10267Z(obj, "receiveStatus", -1);
        if (i9 == 0 && iM10267Z == 0 && iM10267Z2 != 1) {
            Long lM10265X = m10265X(obj, "amount");
            if (lM10265X == null) {
                lM10265X = m10265X(obj, "receiveAmount");
            }
            if (lM10265X == null) {
                lM10265X = m10265X(obj, "recAmount");
            }
            if (lM10265X != null && lM10265X.longValue() > 0) {
                if (iM10267Z3 >= 0 && iM10267Z3 != 1 && iM10267Z3 != 2) {
                    return null;
                }
                double dLongValue = lM10265X.longValue() / 100.0d;
                try {
                    DecimalFormat decimalFormat = new DecimalFormat("0.00");
                    decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
                    return decimalFormat.format(dLongValue);
                } catch (Throwable unused) {
                    return String.valueOf(dLongValue);
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static int m10297x(int[] iArr, int i9) {
        int length = iArr.length;
        int i10 = i9 & 31;
        int i11 = i9 >> 5;
        while (true) {
            if (i11 >= length) {
                return -1;
            }
            int i12 = iArr[i11];
            if (i12 != 0) {
                int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros((~((1 << i10) - 1)) & i12);
                int i13 = iNumberOfTrailingZeros != 32 ? iNumberOfTrailingZeros : -1;
                if (i13 >= 0) {
                    return (i11 << 5) + i13;
                }
            }
            i11++;
            i10 = 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00de A[PHI: r0
  0x00de: PHI (r0v10 h.Hchat.hooks.api.model.WeChatMessage) = (r0v9 h.Hchat.hooks.api.model.WeChatMessage), (r0v27 h.Hchat.hooks.api.model.WeChatMessage) binds: [B:24:0x0050, B:37:0x00dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1697t m10298y(Object obj) {
        Object c3959f;
        C2114y c2114y;
        int iM5940f;
        obj.getClass();
        long jM10270b0 = m10270b0(obj, "getMsgId", "field_msgId", "msgId");
        Long lValueOf = Long.valueOf(jM10270b0);
        if (jM10270b0 <= 0) {
            lValueOf = null;
        }
        long jLongValue = lValueOf != null ? lValueOf.longValue() : m10270b0(obj, "getMsgID", "msgID", "id");
        if (jLongValue > 0) {
            try {
                C2355s c2355sMessageStore = WeChatApis.messageStore();
                c3959f = c2355sMessageStore != null ? c2355sMessageStore.m5661c(jLongValue) : null;
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            if (c3959f instanceof C3959f) {
                c3959f = null;
            }
            WeChatMessage weChatMessage = (WeChatMessage) c3959f;
            if (weChatMessage == null) {
                String strM10273d0 = m10273d0(obj, "getContent", "field_content", "content");
                int iM10266Y = m10266Y(obj, "getType", "field_type", "type");
                Integer numValueOf = Integer.valueOf(iM10266Y);
                if (iM10266Y <= 0) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    iM5940f = numValueOf.intValue();
                } else {
                    WeChatMessage.Companion.getClass();
                    iM5940f = C2529d.m5940f(strM10273d0);
                }
                int i9 = iM5940f;
                weChatMessage = i9 <= 0 ? null : new WeChatMessage(jLongValue, m10270b0(obj, "getMsgSvrId", "field_msgSvrId", "msgSvrId"), i9, m10266Y(obj, "getStatus", "field_status", "status"), m10266Y(obj, "getIsSend", "field_isSend", "isSend"), m10270b0(obj, "getCreateTime", "field_createTime", "createTime"), m10273d0(obj, "getTalker", "field_talker", "talker"), strM10273d0, m10273d0(obj, "getImgPath", "field_imgPath", "imgPath"), HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, 0, m10273d0(obj, "getMsgSource", "field_msgSource", "msgSource"), HttpUrl.FRAGMENT_ENCODE_SET);
                if (weChatMessage != null) {
                }
            } else if (!weChatMessage.isSystem() && !weChatMessage.isRecalled() && !weChatMessage.isVoip() && !weChatMessage.isRedPacket() && !weChatMessage.isTransfer()) {
                if (weChatMessage.isVoice()) {
                    String strM5949o = weChatMessage.imagePath;
                    if (AbstractC3149m.m6721t0(strM5949o)) {
                        strM5949o = null;
                    }
                    if (strM5949o == null) {
                        String strBodyContent = weChatMessage.bodyContent();
                        List listM6691F0 = AbstractC3149m.m6691F0(AbstractC3149m.m6706U0(strBodyContent, '\n', '\r'), new char[]{':'}, 6);
                        if (listM6691F0.size() < 3 || AbstractC3149m.m6710i0(strBodyContent, '<')) {
                            WeChatMessage.Companion.getClass();
                            String strM5947m = C2529d.m5947m(strBodyContent, "filename");
                            if (AbstractC3149m.m6721t0(strM5947m)) {
                                strM5947m = C2529d.m5947m(strBodyContent, "voiceurl");
                            }
                            strM5949o = AbstractC3149m.m6721t0(strM5947m) ? C2529d.m5949o(strBodyContent, "filename") : strM5947m;
                        } else {
                            strM5949o = AbstractC3149m.m6703R0((String) (listM6691F0.size() == 4 ? listM6691F0.get(1) : listM6691F0.get(0))).toString();
                        }
                    }
                    if (!AbstractC3149m.m6721t0(strM5949o)) {
                        C2105p c2105pMedia = WeChatApis.media();
                        String strM5321q = (c2105pMedia == null || (c2114y = c2105pMedia.f7036b) == null) ? null : c2114y.m5321q(strM5949o);
                        if (strM5321q == null) {
                            strM5321q = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        String str = strM5321q;
                        if (AbstractC0921a.m2262y(str)) {
                            ConcurrentHashMap concurrentHashMap = AbstractC2094e.f6999a;
                            return new C1697t(weChatMessage.msgId, weChatMessage.type, weChatMessage.talker, weChatMessage.content, weChatMessage.imagePath, weChatMessage.createTime, null, str, AbstractC2094e.m5193d(obj, strM5949o, weChatMessage.msgId, AbstractC0000a.m101y0(weChatMessage.content, weChatMessage.bodyContent()), 1000), strM5949o, obj);
                        }
                    }
                } else {
                    C2356t c2356tM3195e = AbstractC1184v0.m3195e(weChatMessage, obj);
                    if (c2356tM3195e != null) {
                        return new C1697t(weChatMessage.msgId, weChatMessage.type, weChatMessage.talker, weChatMessage.content, weChatMessage.imagePath, weChatMessage.createTime, c2356tM3195e, HttpUrl.FRAGMENT_ENCODE_SET, 0, null, obj, Opcodes.ACC_INTERFACE);
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static boolean m10299z(int[] iArr, int i9) {
        return (iArr[i9 >> 5] & (1 << (i9 & 31))) != 0;
    }

    /* JADX INFO: renamed from: G */
    public abstract int mo1577G(C1354b c1354b);

    /* JADX INFO: renamed from: P */
    public abstract int mo5472P(int i9);

    /* JADX INFO: renamed from: V */
    public abstract int mo5473V(int i9);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p147k2.InterfaceC2237d
    /* JADX INFO: renamed from: b */
    public int mo625b(int i9) {
        int iMo5472P = mo5472P(i9);
        if (iMo5472P == -1 || mo5472P(iMo5472P) == -1) {
            return -1;
        }
        return iMo5472P;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p147k2.InterfaceC2237d
    /* JADX INFO: renamed from: c */
    public int mo626c(int i9) {
        int iMo5473V = mo5473V(i9);
        if (iMo5473V == -1 || mo5473V(iMo5473V) == -1) {
            return -1;
        }
        return iMo5473V;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p147k2.InterfaceC2237d
    /* JADX INFO: renamed from: g */
    public int mo629g(int i9) {
        return mo5473V(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p147k2.InterfaceC2237d
    /* JADX INFO: renamed from: h */
    public int mo630h(int i9) {
        return mo5472P(i9);
    }
}
