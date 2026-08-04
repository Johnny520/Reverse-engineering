package yyds;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: yyds.ᲈᲇᲀᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2791 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public Object f13645;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f13646;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public Object f13647;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public int f13648;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public Object f13649;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public Object f13650;

    public C2791(int i) {
        this.f13646 = i;
        switch (i) {
            case 2:
                this.f13648 = -1;
                break;
            default:
                this.f13647 = new ArrayList();
                this.f13650 = new C2135(1);
                new C1563(this);
                this.f13649 = new AtomicInteger();
                Collections.synchronizedMap(new HashMap());
                Collections.synchronizedMap(new HashMap());
                Collections.synchronizedMap(new HashMap());
                new C0805(this);
                new CopyOnWriteArrayList();
                final int i2 = 0;
                new InterfaceC1886(this) { // from class: yyds.ᛵᲈᲀᲁ

                    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
                    public final /* synthetic */ C2791 f5734;

                    {
                        this.f5734 = this;
                    }

                    @Override // yyds.InterfaceC1886
                    public final void accept(Object obj) {
                        int i3 = i2;
                        C2791 c2791 = this.f5734;
                        switch (i3) {
                            case 0:
                                c2791.m4922(false);
                                break;
                            default:
                                if (((Integer) obj).intValue() == 80) {
                                    c2791.m4921(false);
                                }
                                break;
                        }
                    }
                };
                final int i3 = 1;
                new InterfaceC1886(this) { // from class: yyds.ᛵᲈᲀᲁ

                    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
                    public final /* synthetic */ C2791 f5734;

                    {
                        this.f5734 = this;
                    }

                    @Override // yyds.InterfaceC1886
                    public final void accept(Object obj) {
                        int i32 = i3;
                        C2791 c2791 = this.f5734;
                        switch (i32) {
                            case 0:
                                c2791.m4922(false);
                                break;
                            default:
                                if (((Integer) obj).intValue() == 80) {
                                    c2791.m4921(false);
                                }
                                break;
                        }
                    }
                };
                new C1196(this, 0);
                new C1196(this, 1);
                this.f13648 = -1;
                new ArrayDeque();
                new RunnableC0871(9, this);
                break;
        }
    }

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public static boolean m4905(AbstractComponentCallbacksC2473 abstractComponentCallbacksC2473) {
        return abstractComponentCallbacksC2473 == null || abstractComponentCallbacksC2473.f12227;
    }

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public static boolean m4906(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public String toString() {
        switch (this.f13646) {
            case 0:
                return ((C1641) this.f13645).toString() + ", hidden list:" + ((ArrayList) this.f13647).size();
            case 1:
                StringBuilder sb = new StringBuilder(128);
                sb.append("FragmentManager{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" in ");
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public int m4907() {
        return ((C2378) this.f13650).f11724.getChildCount();
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public boolean m4908() {
        boolean z = false;
        if (this.f13648 < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC2473 abstractComponentCallbacksC2473 : ((C2135) this.f13650).m4072()) {
            if (abstractComponentCallbacksC2473 != null && m4905(abstractComponentCallbacksC2473) && abstractComponentCallbacksC2473.f12221.m4908()) {
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public View m4909(int i) {
        return ((C2378) this.f13650).f11724.getChildAt(i);
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public void m4910() {
        throw new IllegalStateException("FragmentManager has not been attached to a host.");
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public boolean m4911() {
        if (this.f13648 < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (AbstractComponentCallbacksC2473 abstractComponentCallbacksC2473 : ((C2135) this.f13650).m4072()) {
            if (abstractComponentCallbacksC2473 != null && m4905(abstractComponentCallbacksC2473) && abstractComponentCallbacksC2473.f12221.m4911()) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(abstractComponentCallbacksC2473);
                z = true;
            }
        }
        if (((ArrayList) this.f13645) != null) {
            for (int i = 0; i < ((ArrayList) this.f13645).size(); i++) {
                AbstractComponentCallbacksC2473 abstractComponentCallbacksC24732 = (AbstractComponentCallbacksC2473) ((ArrayList) this.f13645).get(i);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC24732)) {
                    abstractComponentCallbacksC24732.getClass();
                }
            }
        }
        this.f13645 = arrayList;
        return z;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public void m4912(View view, int i, boolean z) {
        C1213 c1213 = ((C2378) this.f13650).f11724;
        int childCount = i < 0 ? c1213.getChildCount() : m4918(i);
        ((C1641) this.f13645).m3349(childCount, z);
        if (z) {
            m4913(view);
        }
        c1213.addView(view, childCount);
        C1213.m2412(view);
        ArrayList arrayList = c1213.f5571;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((C1877) c1213.f5571.get(size)).getClass();
            }
        }
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public void m4913(View view) {
        ((ArrayList) this.f13647).add(view);
        C2378 c2378 = (C2378) this.f13650;
        AbstractC0185 abstractC0185M2412 = C1213.m2412(view);
        if (abstractC0185M2412 != null) {
            View view2 = abstractC0185M2412.f1093;
            C1213 c1213 = c2378.f11724;
            int i = abstractC0185M2412.f1103;
            if (i != -1) {
                abstractC0185M2412.f1094 = i;
            } else {
                abstractC0185M2412.f1094 = view2.getImportantForAccessibility();
            }
            if (!c1213.m2452()) {
                view2.setImportantForAccessibility(4);
            } else {
                abstractC0185M2412.f1103 = 4;
                c1213.f5581.add(abstractC0185M2412);
            }
        }
    }

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public void m4914(View view) {
        if (((ArrayList) this.f13647).remove(view)) {
            C2378 c2378 = (C2378) this.f13650;
            AbstractC0185 abstractC0185M2412 = C1213.m2412(view);
            if (abstractC0185M2412 != null) {
                C1213 c1213 = c2378.f11724;
                int i = abstractC0185M2412.f1094;
                if (c1213.m2452()) {
                    abstractC0185M2412.f1103 = i;
                    c1213.f5581.add(abstractC0185M2412);
                } else {
                    abstractC0185M2412.f1093.setImportantForAccessibility(i);
                }
                abstractC0185M2412.f1094 = 0;
            }
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public void m4915(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        C1213 c1213 = ((C2378) this.f13650).f11724;
        int childCount = i < 0 ? c1213.getChildCount() : m4918(i);
        ((C1641) this.f13645).m3349(childCount, z);
        if (z) {
            m4913(view);
        }
        AbstractC0185 abstractC0185M2412 = C1213.m2412(view);
        if (abstractC0185M2412 != null) {
            if (!abstractC0185M2412.m781() && !abstractC0185M2412.m785()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(abstractC0185M2412);
                C1693.m3440(sb, c1213.m2454());
                return;
            } else {
                if (C1213.f5512) {
                    Log.d("RecyclerView", "reAttach " + abstractC0185M2412);
                }
                abstractC0185M2412.f1091 &= -257;
            }
        } else if (C1213.f5511) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            String strM2454 = c1213.m2454();
            sb2.append(", index: ");
            sb2.append(childCount);
            sb2.append(strM2454);
            throw new IllegalArgumentException(sb2.toString());
        }
        c1213.attachViewToParent(view, childCount, layoutParams);
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public boolean m4916() {
        if (this.f13648 < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC2473 abstractComponentCallbacksC2473 : ((C2135) this.f13650).m4072()) {
            if (abstractComponentCallbacksC2473 != null && abstractComponentCallbacksC2473.f12221.m4916()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public int m4917() {
        return ((C2378) this.f13650).f11724.getChildCount() - ((ArrayList) this.f13647).size();
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public int m4918(int i) {
        C1641 c1641 = (C1641) this.f13645;
        if (i < 0) {
            return -1;
        }
        int childCount = ((C2378) this.f13650).f11724.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            int iM3351 = i - (i2 - c1641.m3351(i2));
            if (iM3351 == 0) {
                while (c1641.m3355(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iM3351;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public View m4919(int i) {
        return ((C2378) this.f13650).f11724.getChildAt(m4918(i));
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public void m4920(int i) {
        int iM4918 = m4918(i);
        ((C1641) this.f13645).m3352(iM4918);
        C1213 c1213 = ((C2378) this.f13650).f11724;
        View childAt = c1213.getChildAt(iM4918);
        if (childAt != null) {
            AbstractC0185 abstractC0185M2412 = C1213.m2412(childAt);
            if (abstractC0185M2412 != null) {
                if (abstractC0185M2412.m781() && !abstractC0185M2412.m785()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(abstractC0185M2412);
                    C1693.m3440(sb, c1213.m2454());
                    return;
                } else {
                    if (C1213.f5512) {
                        Log.d("RecyclerView", "tmpDetach " + abstractC0185M2412);
                    }
                    abstractC0185M2412.m776(256);
                }
            }
        } else if (C1213.f5511) {
            throw new IllegalArgumentException("No view at offset " + iM4918 + c1213.m2454());
        }
        c1213.detachViewFromParent(iM4918);
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public void m4921(boolean z) {
        for (AbstractComponentCallbacksC2473 abstractComponentCallbacksC2473 : ((C2135) this.f13650).m4072()) {
            if (abstractComponentCallbacksC2473 != null && z) {
                abstractComponentCallbacksC2473.f12221.m4921(true);
            }
        }
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public void m4922(boolean z) {
        for (AbstractComponentCallbacksC2473 abstractComponentCallbacksC2473 : ((C2135) this.f13650).m4072()) {
            if (abstractComponentCallbacksC2473 != null && z) {
                abstractComponentCallbacksC2473.f12221.m4922(true);
            }
        }
    }

    public C2791(C2378 c2378) {
        this.f13646 = 0;
        this.f13648 = 0;
        this.f13650 = c2378;
        this.f13645 = new C1641();
        this.f13647 = new ArrayList();
    }
}
