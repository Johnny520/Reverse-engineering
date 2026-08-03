package Yue;

import Yue.C6934;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۥۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ViewConstructor"})
public class C5172 extends FrameLayout {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6391
    public ViewGroup f12213;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public boolean f12214;

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۥۣ$ۥ */
    @InterfaceC7113(21)
    public static class C0654 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static float m1946(View view) {
            return view.getZ();
        }
    }

    public C5172(ViewGroup viewGroup) {
        super(viewGroup.getContext());
        setClipChildren(false);
        this.f12213 = viewGroup;
        viewGroup.setTag(C6934.C1117.f2501, this);
        this.f12213.getOverlay().add(this);
        this.f12214 = true;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static C5172 m1944(@InterfaceC6391 ViewGroup viewGroup) {
        return (C5172) viewGroup.getTag(C6934.C1117.f2501);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m15847(View view, ArrayList<View> arrayList) {
        Object parent = view.getParent();
        if (parent instanceof ViewGroup) {
            m15847((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static boolean m15848(View view, View view2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int childCount = viewGroup.getChildCount();
        if (C0654.m1946(view) != C0654.m1946(view2)) {
            return C0654.m1946(view) > C0654.m1946(view2);
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(C8311.m4293(viewGroup, i));
            if (childAt == view) {
                return false;
            }
            if (childAt == view2) {
                break;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static boolean m15849(ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        if (arrayList.isEmpty() || arrayList2.isEmpty() || arrayList.get(0) != arrayList2.get(0)) {
            return true;
        }
        int iMin = Math.min(arrayList.size(), arrayList2.size());
        for (int i = 1; i < iMin; i++) {
            View view = arrayList.get(i);
            View view2 = arrayList2.get(i);
            if (view != view2) {
                return m15848(view, view2);
            }
        }
        return arrayList2.size() == iMin;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        if (!this.f12214) {
            throw new IllegalStateException("This GhostViewHolder is detached!");
        }
        super.onViewAdded(view);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            this.f12213.setTag(C6934.C1117.f2501, null);
            this.f12213.getOverlay().remove(this);
            this.f12214 = false;
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public void m1945(C5174 c5174) {
        ArrayList<View> arrayList = new ArrayList<>();
        m15847(c5174.f12225, arrayList);
        int iM15850 = m15850(arrayList);
        if (iM15850 < 0 || iM15850 >= getChildCount()) {
            addView(c5174);
        } else {
            addView(c5174, iM15850);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final int m15850(ArrayList<View> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int childCount = getChildCount() - 1;
        int i = 0;
        while (i <= childCount) {
            int i2 = (i + childCount) / 2;
            m15847(((C5174) getChildAt(i2)).f12225, arrayList2);
            if (m15849(arrayList, arrayList2)) {
                i = i2 + 1;
            } else {
                childCount = i2 - 1;
            }
            arrayList2.clear();
        }
        return i;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m15851() {
        if (!this.f12214) {
            throw new IllegalStateException("This GhostViewHolder is detached!");
        }
        this.f12213.getOverlay().remove(this);
        this.f12213.getOverlay().add(this);
    }
}
