package androidx.compose.ui.platform;

import android.content.Context;
import android.view.GestureDetector;
import android.view.View;
import androidx.appcompat.app.RunnableC0062;
import androidx.compose.material.ripple.RunnableC1107;
import com.alibaba.fastjson2.reader.AbstractC2762;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import p052.InterfaceC6558;
import p297.C8587;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1908 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Object f5623;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object f5624;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f5625;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f5626;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f5627;

    public C1908(Context context, InterfaceC6558 interfaceC6558) {
        this.f5627 = 0;
        this.f5624 = interfaceC6558;
        this.f5625 = 0;
        this.f5623 = new GestureDetector(context, new GestureDetectorOnGestureListenerC1912(this));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int m3603(String str) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f5623;
        Integer numValueOf = (Integer) linkedHashMap.get(str);
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(this.f5625);
            linkedHashMap.put(str, numValueOf);
            this.f5625 += 2;
        }
        return numValueOf.intValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int m3604(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f5623;
        Integer numValueOf = (Integer) linkedHashMap.get(obj);
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(this.f5625);
            linkedHashMap.put(obj, numValueOf);
            if (obj == Long.TYPE || obj == Double.TYPE) {
                this.f5625 += 2;
            } else {
                this.f5625++;
            }
        }
        return numValueOf.intValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int m3605(AbstractC2762 abstractC2762) {
        String str = "_param_" + abstractC2762.f8428;
        Class cls = abstractC2762.f8429;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f5623;
        Integer numValueOf = (Integer) linkedHashMap.get(str);
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(this.f5625);
            linkedHashMap.put(str, numValueOf);
            if (cls == Long.TYPE || cls == Double.TYPE) {
                this.f5625 += 2;
            } else {
                this.f5625++;
            }
        }
        return numValueOf.intValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m3606(int i) {
        int i2 = this.f5627;
        Object obj = this.f5624;
        Object obj2 = this.f5623;
        switch (i2) {
            case 2:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj2;
                WeakReference weakReference = bottomSheetBehavior.f10082;
                if (weakReference != null && weakReference.get() != null) {
                    this.f5625 = i;
                    if (!this.f5626) {
                        ((View) bottomSheetBehavior.f10082.get()).postOnAnimation((RunnableC0062) obj);
                        this.f5626 = true;
                    }
                    break;
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj2;
                WeakReference weakReference2 = sideSheetBehavior.f10564;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f5625 = i;
                    if (!this.f5626) {
                        ((View) sideSheetBehavior.f10564.get()).postOnAnimation((RunnableC1107) obj);
                        this.f5626 = true;
                    }
                    break;
                }
                break;
        }
    }

    public C1908(BottomSheetBehavior bottomSheetBehavior) {
        this.f5627 = 2;
        this.f5623 = bottomSheetBehavior;
        this.f5624 = new RunnableC0062(this, 28);
    }

    public C1908(SideSheetBehavior sideSheetBehavior) {
        this.f5627 = 3;
        this.f5623 = sideSheetBehavior;
        this.f5624 = new RunnableC1107(this, 25);
    }

    public C1908(C8587 c8587, boolean z) {
        this.f5627 = 1;
        this.f5623 = new LinkedHashMap();
        this.f5624 = c8587;
        this.f5625 = 6;
        this.f5626 = z;
    }
}
