package androidx.compose.ui.platform;

import android.content.Context;
import android.view.GestureDetector;
import android.view.View;
import androidx.appcompat.app.RunnableC0062;
import androidx.compose.material.ripple.RunnableC1107;
import com.alibaba.fastjson2.reader.AbstractC2761;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import p052.InterfaceC6557;
import p297.C8595;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1908 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Object f5622;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object f5623;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f5624;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f5625;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f5626;

    public C1908(Context context, InterfaceC6557 interfaceC6557) {
        this.f5626 = 0;
        this.f5623 = interfaceC6557;
        this.f5624 = 0;
        this.f5622 = new GestureDetector(context, new GestureDetectorOnGestureListenerC1912(this));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int m3593(String str) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f5622;
        Integer numValueOf = (Integer) linkedHashMap.get(str);
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(this.f5624);
            linkedHashMap.put(str, numValueOf);
            this.f5624 += 2;
        }
        return numValueOf.intValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int m3594(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f5622;
        Integer numValueOf = (Integer) linkedHashMap.get(obj);
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(this.f5624);
            linkedHashMap.put(obj, numValueOf);
            if (obj == Long.TYPE || obj == Double.TYPE) {
                this.f5624 += 2;
            } else {
                this.f5624++;
            }
        }
        return numValueOf.intValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int m3595(AbstractC2761 abstractC2761) {
        String str = "_param_" + abstractC2761.f8426;
        Class cls = abstractC2761.f8427;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f5622;
        Integer numValueOf = (Integer) linkedHashMap.get(str);
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(this.f5624);
            linkedHashMap.put(str, numValueOf);
            if (cls == Long.TYPE || cls == Double.TYPE) {
                this.f5624 += 2;
            } else {
                this.f5624++;
            }
        }
        return numValueOf.intValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m3596(int i) {
        int i2 = this.f5626;
        Object obj = this.f5623;
        Object obj2 = this.f5622;
        switch (i2) {
            case 2:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj2;
                WeakReference weakReference = bottomSheetBehavior.f10077;
                if (weakReference != null && weakReference.get() != null) {
                    this.f5624 = i;
                    if (!this.f5625) {
                        ((View) bottomSheetBehavior.f10077.get()).postOnAnimation((RunnableC0062) obj);
                        this.f5625 = true;
                    }
                    break;
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj2;
                WeakReference weakReference2 = sideSheetBehavior.f10559;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f5624 = i;
                    if (!this.f5625) {
                        ((View) sideSheetBehavior.f10559.get()).postOnAnimation((RunnableC1107) obj);
                        this.f5625 = true;
                    }
                    break;
                }
                break;
        }
    }

    public C1908(BottomSheetBehavior bottomSheetBehavior) {
        this.f5626 = 2;
        this.f5622 = bottomSheetBehavior;
        this.f5623 = new RunnableC0062(this, 28);
    }

    public C1908(SideSheetBehavior sideSheetBehavior) {
        this.f5626 = 3;
        this.f5622 = sideSheetBehavior;
        this.f5623 = new RunnableC1107(this, 25);
    }

    public C1908(C8595 c8595, boolean z) {
        this.f5626 = 1;
        this.f5622 = new LinkedHashMap();
        this.f5623 = c8595;
        this.f5624 = 6;
        this.f5625 = z;
    }
}
