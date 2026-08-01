package com.lxj.xpopup.widget;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.profileinstaller.AbstractC2442;
import com.alibaba.fastjson2.AbstractC2904;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.lxj.xpopup.enums.LayoutStatus;
import com.lxj.xpopup.enums.PopupPosition;
import io.ktor.client.plugins.AbstractC3932;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p150.AbstractC7582;

/* JADX INFO: renamed from: com.lxj.xpopup.widget.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3793 extends AbstractC2904 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f11949;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ int f11950;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3793(Object obj, int i) {
        super(17);
        this.f11950 = i;
        this.f11949 = obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public void m8130(int i) {
        PopupDrawerLayout popupDrawerLayout = (PopupDrawerLayout) this.f11949;
        PopupPosition popupPosition = popupDrawerLayout.f11925;
        if (popupPosition == PopupPosition.Left) {
            popupDrawerLayout.f11921.getMeasuredWidth();
            popupDrawerLayout.f11921.getMeasuredWidth();
            popupDrawerLayout.f11921.getMeasuredWidth();
        } else if (popupPosition == PopupPosition.Right) {
            popupDrawerLayout.getMeasuredWidth();
            popupDrawerLayout.f11921.getMeasuredWidth();
            popupDrawerLayout.getMeasuredWidth();
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC2904
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪 */
    public final boolean mo6272(View view, int i) {
        WeakReference weakReference;
        int i2 = this.f11950;
        Object obj = this.f11949;
        switch (i2) {
            case 0:
                break;
            case 1:
                PopupDrawerLayout popupDrawerLayout = (PopupDrawerLayout) obj;
                if (popupDrawerLayout.f11923 && !popupDrawerLayout.f11918.m12988(true) && LayoutStatus.Close != null) {
                    break;
                }
                break;
            case 2:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj;
                int i3 = bottomSheetBehavior.f10022;
                if (i3 != 1 && !bottomSheetBehavior.f10065) {
                    if (i3 == 3 && bottomSheetBehavior.f10068 == i) {
                        View view2 = null;
                        if (bottomSheetBehavior.f10040) {
                            WeakReference weakReference2 = bottomSheetBehavior.f10066;
                            if (weakReference2 != null) {
                                view2 = (View) weakReference2.get();
                            }
                        } else {
                            ArrayList arrayList = bottomSheetBehavior.f10078;
                            if (!arrayList.isEmpty()) {
                                view2 = (View) ((WeakReference) arrayList.get(0)).get();
                            }
                        }
                        if (view2 != null && view2.canScrollVertically(-1)) {
                        }
                    }
                    SystemClock.uptimeMillis();
                    WeakReference weakReference3 = bottomSheetBehavior.f10077;
                    if (weakReference3 != null && weakReference3.get() == view) {
                        break;
                    }
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                if (sideSheetBehavior.f10560 != 1 && (weakReference = sideSheetBehavior.f10559) != null && weakReference.get() == view) {
                }
                break;
        }
        return true;
    }

    @Override // com.alibaba.fastjson2.AbstractC2904
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏 */
    public final void mo6274(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i5 = this.f11950;
        Object obj = this.f11949;
        switch (i5) {
            case 0:
                PhotoViewContainer photoViewContainer = (PhotoViewContainer) obj;
                AbstractC7582 abstractC7582 = photoViewContainer.f11911;
                if (view != abstractC7582) {
                    abstractC7582.offsetTopAndBottom(i4);
                }
                float fAbs = 1.0f - (((Math.abs(i2) * 1.0f) / photoViewContainer.f11905) * 0.2f);
                photoViewContainer.f11911.setScaleX(fAbs);
                photoViewContainer.f11911.setScaleY(fAbs);
                view.setScaleX(fAbs);
                view.setScaleY(fAbs);
                return;
            case 1:
                PopupDrawerLayout popupDrawerLayout = (PopupDrawerLayout) obj;
                View view2 = popupDrawerLayout.f11917;
                if (view != view2) {
                    m8130(i);
                    return;
                }
                view2.layout(0, 0, view2.getMeasuredWidth(), popupDrawerLayout.f11917.getMeasuredHeight());
                int iM8128 = PopupDrawerLayout.m8128(popupDrawerLayout, popupDrawerLayout.f11921.getLeft() + i3);
                View view3 = popupDrawerLayout.f11921;
                view3.layout(iM8128, view3.getTop(), popupDrawerLayout.f11921.getMeasuredWidth() + iM8128, popupDrawerLayout.f11921.getBottom());
                m8130(iM8128);
                return;
            case 2:
                ((BottomSheetBehavior) obj).m7044(i2);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                WeakReference weakReference = sideSheetBehavior.f10556;
                View view4 = weakReference != null ? (View) weakReference.get() : null;
                if (view4 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view4.getLayoutParams()) != null) {
                    sideSheetBehavior.f10549.mo11443(marginLayoutParams, view.getLeft(), view.getRight());
                    view4.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f10552;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f10549.mo11441(i);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw AbstractC2442.m4568(it);
                }
                return;
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC2904
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰 */
    public void mo6275(int i) {
        int i2 = this.f11950;
        Object obj = this.f11949;
        switch (i2) {
            case 2:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj;
                    if (bottomSheetBehavior.f10023) {
                        bottomSheetBehavior.m7037(1);
                    }
                }
                break;
            case 3:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                    if (sideSheetBehavior.f10561) {
                        sideSheetBehavior.m7204(1);
                    }
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a9 A[PHI: r4
  0x00a9: PHI (r4v2 int) = (r4v1 int), (r4v1 int), (r4v1 int), (r4v1 int), (r4v0 int), (r4v0 int) binds: [B:73:0x0133, B:65:0x0114, B:57:0x00e4, B:60:0x00fa, B:42:0x00a7, B:40:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ce  */
    @Override // com.alibaba.fastjson2.AbstractC2904
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo6276(android.view.View r7, float r8, float r9) {
        /*
            Method dump skipped, instruction units count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lxj.xpopup.widget.C3793.mo6276(android.view.View, float, float):void");
    }

    @Override // com.alibaba.fastjson2.AbstractC2904
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public int mo6277() {
        switch (this.f11950) {
            case 0:
                return 1;
            case 1:
            default:
                return super.mo6277();
            case 2:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f11949;
                return bottomSheetBehavior.f10033 ? bottomSheetBehavior.f10073 : bottomSheetBehavior.f10035;
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC2904
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public int mo6278(View view) {
        switch (this.f11950) {
            case 1:
                return 1;
            case 2:
            default:
                return super.mo6278(view);
            case 3:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f11949;
                return sideSheetBehavior.f10563 + sideSheetBehavior.f10558;
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC2904
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public int mo6281(View view, int i, int i2) {
        int i3 = this.f11950;
        Object obj = this.f11949;
        switch (i3) {
            case 0:
                PhotoViewContainer photoViewContainer = (PhotoViewContainer) obj;
                int top2 = (i2 / 2) + photoViewContainer.f11911.getTop();
                int i4 = photoViewContainer.f11905;
                return top2 >= 0 ? Math.min(top2, i4) : -Math.min(-top2, i4);
            case 1:
            default:
                return super.mo6281(view, i, i2);
            case 2:
                return AbstractC3932.m8306(i, ((BottomSheetBehavior) obj).m7032(), mo6277());
            case 3:
                return view.getTop();
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC2904
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public int mo6282(View view, int i) {
        int i2 = this.f11950;
        Object obj = this.f11949;
        switch (i2) {
            case 1:
                PopupDrawerLayout popupDrawerLayout = (PopupDrawerLayout) obj;
                return view == popupDrawerLayout.f11917 ? i : PopupDrawerLayout.m8128(popupDrawerLayout, i);
            case 2:
                return view.getLeft();
            case 3:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                return AbstractC3932.m8306(i, sideSheetBehavior.f10549.mo11434(), sideSheetBehavior.f10549.mo11435());
            default:
                return super.mo6282(view, i);
        }
    }
}
