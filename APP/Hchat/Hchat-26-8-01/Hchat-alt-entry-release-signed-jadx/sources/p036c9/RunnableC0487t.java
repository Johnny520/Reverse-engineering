package p036c9;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import gg.AbstractC1416l;
import java.lang.reflect.Method;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import p080fb.AbstractC1184v0;
import p099h.Hchat.utils.KavaReflector;
import p198nb.C2924a;
import p218og.AbstractC3149m;
import p259r9.AbstractC3754e0;
import p304uf.C4330d;
import tf.AbstractC4171r;
import va.C4543c;

/* JADX INFO: renamed from: c9.t */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0487t implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1461g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Activity f1462h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f1463i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0487t(Activity activity, String str) {
        this.f1461g = 11;
        this.f1462h = activity;
        this.f1463i = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() throws NoSuchAlgorithmException {
        Object next;
        String str;
        Method method;
        Object objNewInstance;
        String[] strArr;
        Object objM8765o;
        String strM8748J;
        Object next2;
        switch (this.f1461g) {
            case 0:
                Activity activity = this.f1462h;
                if (!activity.isFinishing() && !activity.isDestroyed()) {
                    Toast.makeText(activity.getApplicationContext(), this.f1463i, 0).show();
                    break;
                }
                break;
            case 1:
                Activity activity2 = this.f1462h;
                Iterator it = AbstractC0473o2.m1485i(activity2).iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (C0429d2.m1421F(((C0414a) next).f1179a).equals(this.f1463i)) {
                        }
                    } else {
                        next = null;
                    }
                }
                C0414a c0414a = (C0414a) next;
                if (c0414a != null && (str = c0414a.f1179a) != null) {
                    C0429d2.m1429h(activity2, str);
                    break;
                }
                break;
            case 2:
                Toast.makeText(this.f1462h, this.f1463i, 0).show();
                break;
            case 3:
                Toast.makeText(this.f1462h, this.f1463i, 0).show();
                break;
            case 4:
                Toast.makeText(this.f1462h, this.f1463i, 0).show();
                break;
            case 5:
                Activity activity3 = this.f1462h;
                if (activity3 != null && !activity3.isFinishing() && !activity3.isDestroyed()) {
                    Toast.makeText(activity3, this.f1463i, 1).show();
                    break;
                }
                break;
            case 6:
                Toast.makeText(this.f1462h, this.f1463i, 0).show();
                break;
            case 7:
                Toast.makeText(this.f1462h.getApplicationContext(), this.f1463i, 0).show();
                break;
            case 8:
                Toast.makeText(this.f1462h, this.f1463i, 0).show();
                break;
            case 9:
                Toast.makeText(this.f1462h, this.f1463i, 0).show();
                break;
            case 10:
                Activity activity4 = this.f1462h;
                Object objInvokeMethod = KavaReflector.invokeMethod(activity4, "getPreferenceScreen", new Object[0]);
                if (objInvokeMethod != null) {
                    Object objM8765o2 = C4330d.m8765o(objInvokeMethod, "room_name");
                    Integer num = null;
                    if (objM8765o2 != null) {
                        ArrayList arrayList = new ArrayList();
                        for (Class<?> superclass = objM8765o2.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                            AbstractC4171r.m8432h1(arrayList, KavaReflector.declaredMethods(superclass));
                        }
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next2 = it2.next();
                                Method method2 = (Method) next2;
                                Class<?>[] parameterTypes = method2.getParameterTypes();
                                parameterTypes.getClass();
                                if (parameterTypes.length == 0 && CharSequence.class.isAssignableFrom(method2.getReturnType())) {
                                    Object objInvoke = KavaReflector.invoke(method2, objM8765o2, new Object[0]);
                                    if (AbstractC1416l.m3825a(objInvoke != null ? objInvoke.toString() : null, "群聊名称")) {
                                    }
                                }
                            } else {
                                next2 = null;
                            }
                        }
                        method = (Method) next2;
                    } else {
                        method = null;
                    }
                    Object objM8765o3 = C4330d.m8765o(objInvokeMethod, "hchat_profile_id");
                    String str2 = this.f1463i;
                    if (objM8765o3 != null) {
                        C4330d.m8756f(objM8765o3, str2, method);
                        C4330d.m8757g(objM8765o3, activity4, str2);
                        C4330d.m8746H(objInvokeMethod);
                        C4330d.m8758h(activity4, str2, 0);
                        break;
                    } else {
                        Class<?> clsLoadClass = KavaReflector.loadClass("com.tencent.mm.ui.base.preference.Preference", activity4.getClassLoader());
                        if (clsLoadClass != null && (objNewInstance = KavaReflector.newInstance(KavaReflector.findConstructor(clsLoadClass, Context.class), activity4)) != null) {
                            KavaReflector.writeField(objNewInstance, "q", "hchat_profile_id");
                            Method methodFindMethod = KavaReflector.findMethod(objNewInstance.getClass(), "C", String.class);
                            if (methodFindMethod != null) {
                                KavaReflector.invoke(methodFindMethod, objNewInstance, "hchat_profile_id");
                            }
                            C4330d.m8756f(objNewInstance, str2, method);
                            C4330d.m8757g(objNewInstance, activity4, str2);
                            int i9 = 0;
                            while (true) {
                                strArr = C4543c.f14995f;
                                if (i9 >= 3) {
                                    objM8765o = null;
                                } else {
                                    objM8765o = C4330d.m8765o(objInvokeMethod, strArr[i9]);
                                    if (objM8765o == null) {
                                        i9++;
                                    }
                                }
                            }
                            Integer numM8747I = (objM8765o == null || (strM8748J = C4330d.m8748J(objM8765o)) == null) ? null : C4330d.m8747I(objInvokeMethod, strM8748J);
                            if (numM8747I == null) {
                                int i10 = 0;
                                while (true) {
                                    if (i10 < 3) {
                                        Integer numM8747I2 = C4330d.m8747I(objInvokeMethod, strArr[i10]);
                                        if (numM8747I2 != null) {
                                            num = numM8747I2;
                                        } else {
                                            i10++;
                                        }
                                    }
                                }
                                numM8747I = num;
                            }
                            if ((numM8747I == null || !C4330d.m8740B(objInvokeMethod, numM8747I.intValue(), objNewInstance)) && !C4330d.m8740B(objInvokeMethod, 0, objNewInstance)) {
                                AbstractC1184v0.m3203m("[Hchat:ProfileId] 群聊 ID Preference 插入失败");
                            } else {
                                C4330d.m8746H(objInvokeMethod);
                                C4330d.m8758h(activity4, str2, 0);
                            }
                            break;
                        }
                    }
                }
                break;
            default:
                Activity activity5 = this.f1462h;
                Window window = activity5.getWindow();
                Object next3 = null;
                View decorView = window != null ? window.getDecorView() : null;
                ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
                if (viewGroup != null) {
                    View viewM8764n = C4330d.m8764n(viewGroup);
                    String str3 = this.f1463i;
                    if (viewM8764n != null) {
                        C4330d.m8759i(viewM8764n, activity5, str3);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        C4330d.m8761k(viewGroup, arrayList2);
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : arrayList2) {
                            if (((ViewGroup) obj).getChildCount() >= 2) {
                                arrayList3.add(obj);
                            }
                        }
                        Iterator it3 = arrayList3.iterator();
                        if (it3.hasNext()) {
                            next3 = it3.next();
                            if (it3.hasNext()) {
                                Integer numValueOf = Integer.valueOf(C4330d.m8750L((ViewGroup) next3));
                                do {
                                    Object next4 = it3.next();
                                    Integer numValueOf2 = Integer.valueOf(C4330d.m8750L((ViewGroup) next4));
                                    if (numValueOf.compareTo(numValueOf2) < 0) {
                                        next3 = next4;
                                        numValueOf = numValueOf2;
                                    }
                                } while (it3.hasNext());
                            }
                        }
                        ViewGroup viewGroup2 = (ViewGroup) next3;
                        if (viewGroup2 != null) {
                            LinearLayout linearLayout = new LinearLayout(activity5);
                            linearLayout.setOrientation(0);
                            linearLayout.setGravity(16);
                            linearLayout.setMinimumHeight(C4330d.m8763m(activity5, 56.0f));
                            linearLayout.setPadding(C4330d.m8763m(activity5, 16.0f), C4330d.m8763m(activity5, 12.0f), C4330d.m8763m(activity5, 16.0f), C4330d.m8763m(activity5, 12.0f));
                            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                            TextView textView = new TextView(activity5);
                            textView.setTextSize(16.0f);
                            int i11 = 1;
                            textView.setIncludeFontPadding(true);
                            textView.setMaxLines(2);
                            textView.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
                            TextView textView2 = new TextView(activity5);
                            textView2.setText("›");
                            textView2.setTextSize(24.0f);
                            textView2.setGravity(17);
                            textView2.setLayoutParams(new LinearLayout.LayoutParams(C4330d.m8763m(activity5, 24.0f), -2));
                            linearLayout.addView(textView);
                            linearLayout.addView(textView2);
                            C4330d.m8759i(linearLayout, activity5, str3);
                            int childCount = viewGroup2.getChildCount();
                            for (int i12 = 0; i12 < childCount; i12++) {
                                View childAt = viewGroup2.getChildAt(i12);
                                childAt.getClass();
                                StringBuilder sb2 = new StringBuilder();
                                C4330d.m8762l(childAt, 0, new C2924a(sb2, 19));
                                String string = sb2.toString();
                                if ((childAt instanceof AbsListView) || (childAt instanceof ScrollView) || AbstractC3149m.m6709h0(childAt.getClass().getName(), "RecyclerView", false) || AbstractC3149m.m6709h0(string, "备注", false) || AbstractC3149m.m6709h0(string, "标签", false) || AbstractC3149m.m6709h0(string, "群聊名称", false) || AbstractC3149m.m6709h0(string, "查找聊天记录", false)) {
                                    i11 = i12;
                                    viewGroup2.addView(linearLayout, AbstractC3754e0.m7909r(i11, 0, viewGroup2.getChildCount()), linearLayout.getLayoutParams());
                                }
                                break;
                            }
                            if (viewGroup2.getChildCount() <= 0) {
                                i11 = 0;
                            }
                            viewGroup2.addView(linearLayout, AbstractC3754e0.m7909r(i11, 0, viewGroup2.getChildCount()), linearLayout.getLayoutParams());
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ RunnableC0487t(Activity activity, String str, int i9) {
        this.f1461g = i9;
        this.f1462h = activity;
        this.f1463i = str;
    }
}
