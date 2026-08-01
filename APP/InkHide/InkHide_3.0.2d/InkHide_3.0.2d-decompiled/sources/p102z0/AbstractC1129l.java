package p102z0;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.LruCache;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p006D.AbstractC0079h;
import p009E0.AbstractC0105e;
import p009E0.C0104d;
import p011F0.AbstractC0123k;
import p011F0.C0131s;
import p011F0.C0132t;
import p027N0.AbstractC0223g;
import p034R0.C0243b;
import p034R0.C0244c;
import p040U0.AbstractC0299i;
import p040U0.AbstractC0307q;
import p070i0.AbstractC0731a;

/* JADX INFO: renamed from: z0.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1129l {

    /* JADX INFO: renamed from: a */
    public static final LruCache f3803a = new LruCache(32);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:118:0x01ff */
    /* JADX WARN: Removed duplicated region for block: B:84:0x012b A[PHI: r0
  0x012b: PHI (r0v11 java.lang.Integer) = (r0v4 java.lang.Integer), (r0v6 java.lang.Integer) binds: [B:83:0x0129, B:91:0x0140] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x013f  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m2451a(View view, String str) {
        String strM2454d;
        Object next;
        int iIntValue;
        int iIntValue2;
        ImageView imageView;
        int iIntValue3;
        Object c0104d;
        Rect rect;
        Bitmap bitmap;
        boolean z2 = AbstractC1126i.f3786a;
        if (C1124g.m2445u() && (strM2454d = m2454d(str)) != null) {
            ArrayList arrayList = new ArrayList();
            m2452b(0, view, arrayList);
            Bitmap bitmap2 = null;
            if (arrayList.isEmpty()) {
                imageView = null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    ImageView imageView2 = (ImageView) obj;
                    String name = imageView2.getClass().getName();
                    if (!AbstractC0299i.m511i0(name, "Avatar", true) && !AbstractC0299i.m511i0(name, "Head", true)) {
                        int width = imageView2.getWidth();
                        Integer numValueOf = Integer.valueOf(width);
                        if (width <= 0) {
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                            iIntValue = numValueOf.intValue();
                        } else {
                            ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
                            Integer numValueOf2 = layoutParams != null ? Integer.valueOf(layoutParams.width) : null;
                            iIntValue = numValueOf2 != null ? numValueOf2.intValue() : 0;
                        }
                        int height = imageView2.getHeight();
                        Integer numValueOf3 = Integer.valueOf(height);
                        if (height <= 0) {
                            numValueOf3 = null;
                        }
                        if (numValueOf3 != null) {
                            iIntValue2 = numValueOf3.intValue();
                        } else {
                            ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
                            Integer numValueOf4 = layoutParams2 != null ? Integer.valueOf(layoutParams2.height) : null;
                            iIntValue2 = numValueOf4 != null ? numValueOf4.intValue() : 0;
                        }
                        if (iIntValue > 0 && iIntValue2 > 0) {
                            float f = iIntValue / iIntValue2;
                            if (0.75f > f || f > 1.35f || 32 > iIntValue || iIntValue >= 221 || 32 > iIntValue2 || iIntValue2 >= 221) {
                            }
                        }
                    }
                    arrayList2.add(obj);
                }
                Iterator it = arrayList2.iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        int left = ((ImageView) next).getLeft();
                        do {
                            Object next2 = it.next();
                            int left2 = ((ImageView) next2).getLeft();
                            if (left > left2) {
                                next = next2;
                                left = left2;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next = null;
                }
                ImageView imageView3 = (ImageView) next;
                imageView = imageView3;
                if (imageView3 == null) {
                    imageView = (ImageView) AbstractC0123k.m268j0(arrayList);
                }
            }
            if (imageView == null || AbstractC0307q.m534d0(str)) {
                return;
            }
            File file = new File(strM2454d);
            int width2 = imageView.getWidth();
            Integer numValueOf5 = Integer.valueOf(width2);
            if (width2 <= 0) {
                numValueOf5 = null;
            }
            if (numValueOf5 == null) {
                ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
                if (layoutParams3 != null) {
                    int i2 = layoutParams3.width;
                    numValueOf5 = Integer.valueOf(i2);
                    if (i2 <= 0) {
                        numValueOf5 = null;
                    }
                    iIntValue3 = numValueOf5 != null ? numValueOf5.intValue() : 156;
                }
            }
            String str2 = file.getAbsolutePath() + ":" + file.lastModified() + ":" + file.length() + ":" + iIntValue3;
            LruCache lruCache = f3803a;
            Bitmap bitmap3 = (Bitmap) lruCache.get(str2);
            Bitmap bitmap4 = bitmap3;
            if (bitmap3 == null) {
                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file.getAbsolutePath());
                if (bitmapDecodeFile == null) {
                    bitmap = null;
                } else {
                    int width3 = bitmapDecodeFile.getWidth();
                    bitmap = bitmapDecodeFile;
                    if (width3 > 0) {
                        int height2 = bitmapDecodeFile.getHeight();
                        bitmap = bitmapDecodeFile;
                        if (height2 > 0) {
                            try {
                                if (bitmapDecodeFile.getWidth() / bitmapDecodeFile.getHeight() > 1.0f) {
                                    int height3 = bitmapDecodeFile.getHeight();
                                    int width4 = (bitmapDecodeFile.getWidth() - height3) / 2;
                                    rect = new Rect(width4, 0, height3 + width4, bitmapDecodeFile.getHeight());
                                } else {
                                    int width5 = bitmapDecodeFile.getWidth();
                                    int height4 = (bitmapDecodeFile.getHeight() - width5) / 2;
                                    rect = new Rect(0, height4, bitmapDecodeFile.getWidth(), width5 + height4);
                                }
                                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iIntValue3, iIntValue3, Bitmap.Config.ARGB_8888);
                                Canvas canvas = new Canvas(bitmapCreateBitmap);
                                Rect rect2 = new Rect(0, 0, iIntValue3, iIntValue3);
                                Paint paint = new Paint(1);
                                paint.setFilterBitmap(true);
                                paint.setDither(true);
                                canvas.drawBitmap(bitmapDecodeFile, rect, rect2, paint);
                                c0104d = bitmapCreateBitmap;
                            } catch (Throwable th) {
                                c0104d = new C0104d(th);
                            }
                            Object obj2 = bitmapDecodeFile;
                            if (!(c0104d instanceof C0104d)) {
                                obj2 = c0104d;
                            }
                            bitmap = (Bitmap) obj2;
                        }
                    }
                }
                if (bitmap != null) {
                    lruCache.put(str2, bitmap);
                    bitmap2 = bitmap;
                }
                if (bitmap2 == null) {
                    return;
                } else {
                    bitmap4 = bitmap2;
                }
            }
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageBitmap(bitmap4);
            imageView.invalidate();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m2452b(int i2, View view, ArrayList arrayList) {
        if (view == null || i2 > 8) {
            return;
        }
        if (view instanceof ImageView) {
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null) {
            return;
        }
        int iMin = Math.min(viewGroup.getChildCount(), 32);
        for (int i3 = 0; i3 < iMin; i3++) {
            m2452b(i2 + 1, viewGroup.getChildAt(i3), arrayList);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:33:0x007f */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [E0.d] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX INFO: renamed from: c */
    public static Map m2453c() {
        Object c0104d;
        boolean z2 = AbstractC1126i.f3786a;
        SharedPreferences sharedPreferencesM2438n = C1124g.m2438n();
        AbstractC0223g.m418e(sharedPreferencesM2438n, "sp");
        try {
            Method declaredMethod = sharedPreferencesM2438n.getClass().getDeclaredMethod("startReloadIfChangedUnexpectedly", null);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(sharedPreferencesM2438n, null);
        } catch (Throwable unused) {
        }
        String str = "{}";
        String string = C1124g.m2438n().getString("custom_local_avatars", "{}");
        if (string == null) {
            string = "";
        }
        try {
            if (!AbstractC0307q.m534d0(string)) {
                str = string;
            }
            JSONObject jSONObject = new JSONObject(str);
            c0104d = new LinkedHashMap();
            Iterator<String> itKeys = jSONObject.keys();
            AbstractC0223g.m417d(itKeys, "keys(...)");
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String strOptString = jSONObject.optString(next, "");
                AbstractC0223g.m417d(strOptString, "optString(...)");
                String string2 = AbstractC0299i.m507C0(strOptString).toString();
                AbstractC0223g.m415b(next);
                if (!AbstractC0307q.m534d0(next) && !AbstractC0307q.m534d0(string2)) {
                    c0104d.put(next, string2);
                }
            }
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        Throwable thM246a = AbstractC0105e.m246a(c0104d);
        Object obj = c0104d;
        if (thM246a != null) {
            AbstractC0731a.m1387d("custom avatar map parse fail", thM246a);
            obj = C0132t.f427a;
        }
        return (Map) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static String m2454d(String str) {
        String str2;
        String string = str != null ? AbstractC0299i.m507C0(str).toString() : null;
        if (string == null) {
            string = "";
        }
        if (AbstractC0307q.m534d0(string) || (str2 = (String) m2453c().get(string)) == null || AbstractC0307q.m534d0(str2) || !new File(str2).exists()) {
            return null;
        }
        return str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static C1128k m2455e() {
        Object c0104d;
        boolean z2 = AbstractC1126i.f3786a;
        SharedPreferences sharedPreferencesM2438n = C1124g.m2438n();
        AbstractC0223g.m418e(sharedPreferencesM2438n, "sp");
        try {
            Method declaredMethod = sharedPreferencesM2438n.getClass().getDeclaredMethod("startReloadIfChangedUnexpectedly", null);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(sharedPreferencesM2438n, null);
        } catch (Throwable unused) {
        }
        String string = C1124g.m2438n().getString("custom_local_avatar_methods", "[]");
        if (string == null) {
            string = "";
        }
        try {
            if (AbstractC0307q.m534d0(string)) {
                string = "{}";
            }
            JSONObject jSONObject = new JSONObject(string);
            int iOptInt = jSONObject.optInt("versionCode", -1);
            String strOptString = jSONObject.optString("versionName");
            c0104d = (iOptInt == AbstractC1135r.m2494p() && AbstractC0223g.m414a(strOptString, AbstractC1135r.m2495q())) ? new C1128k(m2459i(jSONObject.optJSONArray("loadMethods")), m2459i(jSONObject.optJSONArray("hdGalleryMethods")), iOptInt, strOptString) : null;
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        if (c0104d instanceof C0104d) {
            c0104d = null;
        }
        C1128k c1128k = (C1128k) c0104d;
        if (c1128k == null) {
            return null;
        }
        if (c1128k.f3799a.isEmpty() && c1128k.f3800b.isEmpty()) {
            return null;
        }
        return c1128k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static boolean m2456f(LinkedHashMap linkedHashMap) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (!AbstractC0307q.m534d0(str) && !AbstractC0307q.m534d0(str2)) {
                jSONObject.put(str, str2);
            }
        }
        boolean z2 = AbstractC1126i.f3786a;
        boolean zCommit = C1124g.m2438n().edit().putString("custom_local_avatars", jSONObject.toString()).commit();
        if (zCommit) {
            C1124g.m2418I();
        }
        return zCommit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static void m2457g(String str) {
        boolean z2 = AbstractC1126i.f3786a;
        C1124g.m2438n().edit().putString("custom_local_avatar_pending_wxid", str).commit();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static JSONArray m2458h(List list) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (C1127j c1127j : AbstractC0123k.m281w0(AbstractC0123k.m264A0(list))) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("className", c1127j.f3796a);
            jSONObject.put("methodName", c1127j.f3797b);
            jSONObject.put("methodSign", c1127j.f3798c);
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static List m2459i(JSONArray jSONArray) {
        if (jSONArray == null) {
            return C0131s.f426a;
        }
        C0244c c0244cM176U = AbstractC0079h.m176U(0, jSONArray.length());
        ArrayList arrayList = new ArrayList();
        Iterator it = c0244cM176U.iterator();
        while (((C0243b) it).f588c) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(((C0243b) it).m458a());
            C1127j c1127j = null;
            if (jSONObjectOptJSONObject != null) {
                String strOptString = jSONObjectOptJSONObject.optString("className");
                AbstractC0223g.m417d(strOptString, "optString(...)");
                String strOptString2 = jSONObjectOptJSONObject.optString("methodName");
                AbstractC0223g.m417d(strOptString2, "optString(...)");
                String strOptString3 = jSONObjectOptJSONObject.optString("methodSign");
                AbstractC0223g.m417d(strOptString3, "optString(...)");
                C1127j c1127j2 = new C1127j(strOptString, strOptString2, strOptString3);
                if (!AbstractC0307q.m534d0(strOptString) && !AbstractC0307q.m534d0(strOptString2)) {
                    c1127j = c1127j2;
                }
            }
            if (c1127j != null) {
                arrayList.add(c1127j);
            }
        }
        return arrayList;
    }
}
