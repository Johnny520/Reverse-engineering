package Yue;

import Yue.InterfaceC7144;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: Yue.ۥۣ۠۟ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
@SuppressLint({"UnknownNullness"})
public abstract class AbstractC5104 {

    /* JADX INFO: renamed from: Yue.ۥۣ۠۟ۦ$ۥ */
    public class RunnableC0643 implements Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ int f12087;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ ArrayList f12088;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ ArrayList f12089;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ ArrayList f12090;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public final /* synthetic */ ArrayList f12091;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public RunnableC0643(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f12087 = i;
            this.f12088 = arrayList;
            this.f12089 = arrayList2;
            this.f12090 = arrayList3;
            this.f12091 = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i = 0; i < this.f12087; i++) {
                C8273.m27487((View) this.f12088.get(i), (String) this.f12089.get(i));
                C8273.m27487((View) this.f12090.get(i), (String) this.f12091.get(i));
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m15756(List<View> list, View view) {
        int size = list.size();
        if (m15757(list, view, size)) {
            return;
        }
        if (C8273.m27380(view) != null) {
            list.add(view);
        }
        for (int i = size; i < list.size(); i++) {
            View view2 = list.get(i);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (!m15757(list, childAt, size) && C8273.m27380(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static boolean m15757(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static boolean m15758(List list) {
        return list == null || list.isEmpty();
    }

    /* JADX INFO: renamed from: ۥ */
    public abstract void mo1920(@InterfaceC6391 Object obj, @InterfaceC6391 View view);

    /* JADX INFO: renamed from: ۥ۟ */
    public abstract void mo1921(@InterfaceC6391 Object obj, @InterfaceC6391 ArrayList<View> arrayList);

    /* JADX INFO: renamed from: ۥ۟۟ */
    public abstract void mo15741(@InterfaceC6391 ViewGroup viewGroup, @InterfaceC6490 Object obj);

    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public abstract boolean mo15742(@InterfaceC6391 Object obj);

    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public abstract Object mo15743(@InterfaceC6490 Object obj);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m15759(View view, Rect rect) {
        if (C8273.m27397(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            view.getRootView().getLocationOnScreen(new int[2]);
            rectF.offset(r1[0], r1[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public abstract Object mo15744(@InterfaceC6490 Object obj, @InterfaceC6490 Object obj2, @InterfaceC6490 Object obj3);

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public abstract Object mo15745(@InterfaceC6490 Object obj, @InterfaceC6490 Object obj2, @InterfaceC6490 Object obj3);

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public ArrayList<String> m15760(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            arrayList2.add(C8273.m27380(view));
            C8273.m27487(view, null);
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public abstract void mo15746(@InterfaceC6391 Object obj, @InterfaceC6391 View view);

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public abstract void mo15747(@InterfaceC6391 Object obj, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList2);

    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public abstract void mo15748(@InterfaceC6391 Object obj, @InterfaceC6391 View view, @InterfaceC6391 ArrayList<View> arrayList);

    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public abstract void mo15749(@InterfaceC6391 Object obj, @InterfaceC6490 Object obj2, @InterfaceC6490 ArrayList<View> arrayList, @InterfaceC6490 Object obj3, @InterfaceC6490 ArrayList<View> arrayList2, @InterfaceC6490 Object obj4, @InterfaceC6490 ArrayList<View> arrayList3);

    /* JADX INFO: renamed from: ۥ۟۟۠۠ */
    public abstract void mo15750(@InterfaceC6391 Object obj, @InterfaceC6391 Rect rect);

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public abstract void mo15751(@InterfaceC6391 Object obj, @InterfaceC6490 View view);

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
    public void mo15752(@InterfaceC6391 Fragment fragment, @InterfaceC6391 Object obj, @InterfaceC6391 C3674 c3674, @InterfaceC6391 Runnable runnable) {
        runnable.run();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m15761(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            String strM27380 = C8273.m27380(view2);
            arrayList4.add(strM27380);
            if (strM27380 != null) {
                C8273.m27487(view2, null);
                String str = map.get(strM27380);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    if (str.equals(arrayList3.get(i2))) {
                        C8273.m27487(arrayList2.get(i2), strM27380);
                        break;
                    }
                    i2++;
                }
            }
        }
        ViewTreeObserverOnPreDrawListenerC6565.m3026(view, new RunnableC0643(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ */
    public abstract void mo15753(@InterfaceC6391 Object obj, @InterfaceC6391 View view, @InterfaceC6391 ArrayList<View> arrayList);

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ */
    public abstract void mo15754(@InterfaceC6490 Object obj, @InterfaceC6490 ArrayList<View> arrayList, @InterfaceC6490 ArrayList<View> arrayList2);

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ */
    public abstract Object mo15755(@InterfaceC6490 Object obj);
}
