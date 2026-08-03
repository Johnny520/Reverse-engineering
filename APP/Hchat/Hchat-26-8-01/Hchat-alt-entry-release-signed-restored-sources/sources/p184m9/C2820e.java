package p184m9;

import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p068eh.AbstractC0921a;
import p099h.Hchat.utils.KavaReflector;
import p126ia.C2026t;
import p258r8.C3742g;
import p276sf.C3958e;
import tf.AbstractC4165l;
import tf.AbstractC4178y;
import tf.C4174u;

/* JADX INFO: renamed from: m9.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2820e {

    /* JADX INFO: renamed from: h */
    public static final List f9100h = AbstractC0000a.m101y0("field_md5", "field_svrid", "field_catalog", "field_size", "field_name", "field_content", "field_reserved3", "field_reserved4", "field_groupId", "field_source", "field_designerID", "field_thumbUrl");

    /* JADX INFO: renamed from: i */
    public static final List f9101i;

    /* JADX INFO: renamed from: j */
    public static final List f9102j;

    /* JADX INFO: renamed from: k */
    public static final HashSet f9103k;

    /* JADX INFO: renamed from: l */
    public static final HashSet f9104l;

    /* JADX INFO: renamed from: a */
    public final C3742g f9105a;

    /* JADX INFO: renamed from: b */
    public final C2026t f9106b;

    /* JADX INFO: renamed from: c */
    public final Handler f9107c;

    /* JADX INFO: renamed from: d */
    public final ThreadLocal f9108d;

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f9109e;

    /* JADX INFO: renamed from: f */
    public Object f9110f;

    /* JADX INFO: renamed from: g */
    public volatile boolean f9111g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        List listM101y0 = AbstractC0000a.m101y0(new C2817b(1, 2782, "剪刀", "514914788fc461e7205bf0b6ba496c49", "jsb_j.png"), new C2817b(2, 2278, "石头", "f790e342a02e0f99d34b316547f9aeab", "jsb_s.png"), new C2817b(3, 3612, "布", "091577322c40c05aa3dd701da29d6423", "jsb_b.png"));
        f9101i = listM101y0;
        f9102j = AbstractC0000a.m101y0(new C2817b(1, 2342, "1 点", "da1c289d4e363f3ce1ff36538903b92f", "dice_1.png"), new C2817b(2, 2278, "2 点", "9e3f303561566dc9342a3ea41e6552a6", "dice_2.png"), new C2817b(3, 2404, "3 点", "dbcc51db2765c1d0106290bae6326fc4", "dice_3.png"), new C2817b(4, 2422, "4 点", "9a21c57defc4974ab5b7c842e3232671", "dice_4.png"), new C2817b(5, 2538, "5 点", "3a8e16d650f7e66ba5516b2780512830", "dice_5.png"), new C2817b(6, 2536, "6 点", "5ba8e9694b853df10b9f2a77b312cc09", "dice_6.png"));
        HashSet hashSet = new HashSet();
        Iterator it = listM101y0.iterator();
        while (it.hasNext()) {
            hashSet.add(((C2817b) it.next()).f9089c);
        }
        f9103k = hashSet;
        List list = f9102j;
        HashSet hashSet2 = new HashSet();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            hashSet2.add(((C2817b) it2.next()).f9089c);
        }
        f9104l = hashSet2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2820e(C3742g c3742g, C2026t c2026t) {
        c3742g.getClass();
        this.f9105a = c3742g;
        this.f9106b = c2026t;
        this.f9107c = new Handler(Looper.getMainLooper());
        this.f9108d = new ThreadLocal();
        this.f9109e = new AtomicBoolean(false);
        this.f9110f = C4174u.f13711g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: a */
    public final boolean m6220a(Object obj, EnumC2818c enumC2818c, int i9) {
        Object next;
        boolean z9;
        int i10 = i9;
        EnumC2818c enumC2818c2 = EnumC2818c.DICE;
        Iterator it = (enumC2818c == enumC2818c2 ? f9102j : f9101i).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((C2817b) next).f9087a == i10) {
                break;
            }
        }
        C2817b c2817b = (C2817b) next;
        if (c2817b == null) {
            return false;
        }
        if (enumC2818c == enumC2818c2) {
            i10 += 3;
        }
        while (true) {
            for (Map.Entry entry : AbstractC4178y.m8439b0(new C3958e("field_md5", c2817b.f9089c), new C3958e("field_size", Integer.valueOf(c2817b.f9090d)), new C3958e("field_content", AbstractC0921a.m2248k(enumC2818c.f9095g, i10, "<gameext type=\"", "\" content=\"", "\" ></gameext>")), new C3958e("field_name", c2817b.f9091e), new C3958e("field_svrid", HttpUrl.FRAGMENT_ENCODE_SET), new C3958e("field_catalog", 50), new C3958e("field_reserved3", 0), new C3958e("field_reserved4", 0), new C3958e("field_groupId", "50"), new C3958e("field_source", 0), new C3958e("field_designerID", null), new C3958e("field_thumbUrl", null)).entrySet()) {
                z9 = KavaReflector.writeField((Field) this.f9110f.get((String) entry.getKey()), obj, entry.getValue()) && z9;
            }
            return z9;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: b */
    public final String m6221b(Object obj, String str) {
        Object field = KavaReflector.readField((Field) this.f9110f.get(str), obj);
        String str2 = field instanceof String ? (String) field : null;
        return str2 != null ? str2 : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m6222c(C2819d c2819d, C2817b c2817b) {
        Object[] objArr = c2819d.f9098c;
        Object objM8366C0 = AbstractC4165l.m8366C0(1, objArr);
        if (objM8366C0 != null) {
            C2026t c2026t = this.f9106b;
            if (c2817b != null && !m6220a(objM8366C0, c2819d.f9099d, c2817b.f9087a)) {
                c2026t.invoke("应用所选游戏表情结果失败", null);
                return;
            }
            Boolean bool = Boolean.TRUE;
            ThreadLocal threadLocal = this.f9108d;
            threadLocal.set(bool);
            try {
                KavaReflector.invokeOrThrow(c2819d.f9096a, c2819d.f9097b, Arrays.copyOf(objArr, objArr.length));
            } catch (Throwable th2) {
                try {
                    c2026t.invoke("重新发送游戏表情失败", th2);
                } finally {
                    threadLocal.remove();
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final LinkedHashMap m6223d(Class cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : f9100h) {
            Field fieldFindFieldRecursive = KavaReflector.findFieldRecursive(cls, str);
            if (fieldFindFieldRecursive == null) {
                this.f9106b.invoke("EmojiInfo 缺少字段: " + str, null);
                return null;
            }
            linkedHashMap.put(str, fieldFindFieldRecursive);
        }
        return linkedHashMap;
    }
}
