package androidx.compose.p001ui.platform;

import android.content.Context;
import android.view.GestureDetector;
import android.view.View;
import androidx.appcompat.app.RunnableC0909;
import androidx.compose.material.ripple.RunnableC1945;
import com.alibaba.fastjson2.reader.AbstractC3595;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import p068.InterfaceC7387;
import p313.C9416;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2743 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Object f5968;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object f5969;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f5970;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f5971;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f5972;

    public C2743(Context context, InterfaceC7387 interfaceC7387) {
        this.f5972 = 0;
        this.f5969 = interfaceC7387;
        this.f5970 = 0;
        this.f5968 = new GestureDetector(context, new GestureDetectorOnGestureListenerC2747(this));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int m4163(String str) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f5968;
        Integer numValueOf = (Integer) linkedHashMap.get(str);
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(this.f5970);
            linkedHashMap.put(str, numValueOf);
            this.f5970 += 2;
        }
        return numValueOf.intValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int m4164(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f5968;
        Integer numValueOf = (Integer) linkedHashMap.get(obj);
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(this.f5970);
            linkedHashMap.put(obj, numValueOf);
            if (obj == Long.TYPE || obj == Double.TYPE) {
                this.f5970 += 2;
            } else {
                this.f5970++;
            }
        }
        return numValueOf.intValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int m4165(AbstractC3595 abstractC3595) {
        String str = "_param_" + abstractC3595.f8773;
        Class cls = abstractC3595.f8774;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f5968;
        Integer numValueOf = (Integer) linkedHashMap.get(str);
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(this.f5970);
            linkedHashMap.put(str, numValueOf);
            if (cls == Long.TYPE || cls == Double.TYPE) {
                this.f5970 += 2;
            } else {
                this.f5970++;
            }
        }
        return numValueOf.intValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m4166(int i) {
        int i2 = this.f5972;
        Object obj = this.f5969;
        Object obj2 = this.f5968;
        switch (i2) {
            case 2:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj2;
                WeakReference weakReference = bottomSheetBehavior.f10427;
                if (weakReference != null && weakReference.get() != null) {
                    this.f5970 = i;
                    if (!this.f5971) {
                        ((View) bottomSheetBehavior.f10427.get()).postOnAnimation((RunnableC0909) obj);
                        this.f5971 = true;
                    }
                    break;
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj2;
                WeakReference weakReference2 = sideSheetBehavior.f10909;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f5970 = i;
                    if (!this.f5971) {
                        ((View) sideSheetBehavior.f10909.get()).postOnAnimation((RunnableC1945) obj);
                        this.f5971 = true;
                    }
                    break;
                }
                break;
        }
    }

    public C2743(BottomSheetBehavior bottomSheetBehavior) {
        this.f5972 = 2;
        this.f5968 = bottomSheetBehavior;
        this.f5969 = new RunnableC0909(this, 28);
    }

    public C2743(SideSheetBehavior sideSheetBehavior) {
        this.f5972 = 3;
        this.f5968 = sideSheetBehavior;
        this.f5969 = new RunnableC1945(this, 25);
    }

    public C2743(C9416 c9416, boolean z) {
        this.f5972 = 1;
        this.f5968 = new LinkedHashMap();
        this.f5969 = c9416;
        this.f5970 = 6;
        this.f5971 = z;
    }
}
