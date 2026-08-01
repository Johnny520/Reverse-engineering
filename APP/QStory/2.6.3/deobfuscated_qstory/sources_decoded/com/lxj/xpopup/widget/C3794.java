package com.lxj.xpopup.widget;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.profileinstaller.AbstractC2442;
import com.bumptech.glide.AbstractC3055;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.lxj.xpopup.enums.LayoutStatus;
import com.lxj.xpopup.enums.PopupPosition;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p034.AbstractC6344;
import p150.AbstractC7583;

/* JADX INFO: renamed from: com.lxj.xpopup.widget.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3794 extends AbstractC3055 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Object f11954;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f11955;

    public /* synthetic */ C3794(Object obj, int i) {
        this.f11955 = i;
        this.f11954 = obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public void m8117(int i) {
        PopupDrawerLayout popupDrawerLayout = (PopupDrawerLayout) this.f11954;
        PopupPosition popupPosition = popupDrawerLayout.f11930;
        if (popupPosition == PopupPosition.Left) {
            popupDrawerLayout.f11926.getMeasuredWidth();
            popupDrawerLayout.f11926.getMeasuredWidth();
            popupDrawerLayout.f11926.getMeasuredWidth();
        } else if (popupPosition == PopupPosition.Right) {
            popupDrawerLayout.getMeasuredWidth();
            popupDrawerLayout.f11926.getMeasuredWidth();
            popupDrawerLayout.getMeasuredWidth();
        }
    }

    @Override // com.bumptech.glide.AbstractC3055
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final boolean mo6665(View view, int i) {
        WeakReference weakReference;
        int i2 = this.f11955;
        Object obj = this.f11954;
        switch (i2) {
            case 0:
                break;
            case 1:
                PopupDrawerLayout popupDrawerLayout = (PopupDrawerLayout) obj;
                if (popupDrawerLayout.f11928 && !popupDrawerLayout.f11923.m13018(true) && LayoutStatus.Close != null) {
                    break;
                }
                break;
            case 2:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj;
                int i3 = bottomSheetBehavior.f10027;
                if (i3 != 1 && !bottomSheetBehavior.f10070) {
                    if (i3 == 3 && bottomSheetBehavior.f10073 == i) {
                        View view2 = null;
                        if (bottomSheetBehavior.f10045) {
                            WeakReference weakReference2 = bottomSheetBehavior.f10071;
                            if (weakReference2 != null) {
                                view2 = (View) weakReference2.get();
                            }
                        } else {
                            ArrayList arrayList = bottomSheetBehavior.f10083;
                            if (!arrayList.isEmpty()) {
                                view2 = (View) ((WeakReference) arrayList.get(0)).get();
                            }
                        }
                        if (view2 != null && view2.canScrollVertically(-1)) {
                        }
                    }
                    SystemClock.uptimeMillis();
                    WeakReference weakReference3 = bottomSheetBehavior.f10082;
                    if (weakReference3 != null && weakReference3.get() == view) {
                        break;
                    }
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                if (sideSheetBehavior.f10565 != 1 && (weakReference = sideSheetBehavior.f10564) != null && weakReference.get() == view) {
                }
                break;
        }
        return true;
    }

    @Override // com.bumptech.glide.AbstractC3055
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public void mo6666(int i) {
        int i2 = this.f11955;
        Object obj = this.f11954;
        switch (i2) {
            case 2:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj;
                    if (bottomSheetBehavior.f10028) {
                        bottomSheetBehavior.m7024(1);
                    }
                }
                break;
            case 3:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                    if (sideSheetBehavior.f10566) {
                        sideSheetBehavior.m7191(1);
                    }
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a9 A[PHI: r4
  0x00a9: PHI (r4v2 int) = (r4v1 int), (r4v1 int), (r4v1 int), (r4v1 int), (r4v0 int), (r4v0 int) binds: [B:73:0x0133, B:65:0x0114, B:57:0x00e4, B:60:0x00fa, B:42:0x00a7, B:40:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ce  */
    @Override // com.bumptech.glide.AbstractC3055
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo6668(android.view.View r7, float r8, float r9) {
        /*
            Method dump skipped, instruction units count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lxj.xpopup.widget.C3794.mo6668(android.view.View, float, float):void");
    }

    @Override // com.bumptech.glide.AbstractC3055
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo6669(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i5 = this.f11955;
        Object obj = this.f11954;
        switch (i5) {
            case 0:
                PhotoViewContainer photoViewContainer = (PhotoViewContainer) obj;
                AbstractC7583 abstractC7583 = photoViewContainer.f11916;
                if (view != abstractC7583) {
                    abstractC7583.offsetTopAndBottom(i4);
                }
                float fAbs = 1.0f - (((Math.abs(i2) * 1.0f) / photoViewContainer.f11910) * 0.2f);
                photoViewContainer.f11916.setScaleX(fAbs);
                photoViewContainer.f11916.setScaleY(fAbs);
                view.setScaleX(fAbs);
                view.setScaleY(fAbs);
                return;
            case 1:
                PopupDrawerLayout popupDrawerLayout = (PopupDrawerLayout) obj;
                View view2 = popupDrawerLayout.f11922;
                if (view != view2) {
                    m8117(i);
                    return;
                }
                view2.layout(0, 0, view2.getMeasuredWidth(), popupDrawerLayout.f11922.getMeasuredHeight());
                int iM8115 = PopupDrawerLayout.m8115(popupDrawerLayout, popupDrawerLayout.f11926.getLeft() + i3);
                View view3 = popupDrawerLayout.f11926;
                view3.layout(iM8115, view3.getTop(), popupDrawerLayout.f11926.getMeasuredWidth() + iM8115, popupDrawerLayout.f11926.getBottom());
                m8117(iM8115);
                return;
            case 2:
                ((BottomSheetBehavior) obj).m7031(i2);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                WeakReference weakReference = sideSheetBehavior.f10561;
                View view4 = weakReference != null ? (View) weakReference.get() : null;
                if (view4 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view4.getLayoutParams()) != null) {
                    sideSheetBehavior.f10554.mo9892(marginLayoutParams, view.getLeft(), view.getRight());
                    view4.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f10557;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f10554.mo9911(i);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw AbstractC2442.m4578(it);
                }
                return;
        }
    }

    @Override // com.bumptech.glide.AbstractC3055
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public int mo6670(View view, int i, int i2) {
        int i3 = this.f11955;
        Object obj = this.f11954;
        switch (i3) {
            case 0:
                PhotoViewContainer photoViewContainer = (PhotoViewContainer) obj;
                int top2 = (i2 / 2) + photoViewContainer.f11916.getTop();
                int i4 = photoViewContainer.f11910;
                return top2 >= 0 ? Math.min(top2, i4) : -Math.min(-top2, i4);
            case 1:
            default:
                return super.mo6670(view, i, i2);
            case 2:
                return AbstractC6344.m11887(i, ((BottomSheetBehavior) obj).m7019(), mo6673());
            case 3:
                return view.getTop();
        }
    }

    @Override // com.bumptech.glide.AbstractC3055
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public int mo6671(View view, int i) {
        int i2 = this.f11955;
        Object obj = this.f11954;
        switch (i2) {
            case 1:
                PopupDrawerLayout popupDrawerLayout = (PopupDrawerLayout) obj;
                return view == popupDrawerLayout.f11922 ? i : PopupDrawerLayout.m8115(popupDrawerLayout, i);
            case 2:
                return view.getLeft();
            case 3:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                return AbstractC6344.m11887(i, sideSheetBehavior.f10554.mo9907(), sideSheetBehavior.f10554.mo9904());
            default:
                return super.mo6671(view, i);
        }
    }

    @Override // com.bumptech.glide.AbstractC3055
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public int mo6672(View view) {
        switch (this.f11955) {
            case 1:
                return 1;
            case 2:
            default:
                return super.mo6672(view);
            case 3:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f11954;
                return sideSheetBehavior.f10568 + sideSheetBehavior.f10563;
        }
    }

    @Override // com.bumptech.glide.AbstractC3055
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public int mo6673() {
        switch (this.f11955) {
            case 0:
                return 1;
            case 1:
            default:
                return super.mo6673();
            case 2:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f11954;
                return bottomSheetBehavior.f10038 ? bottomSheetBehavior.f10078 : bottomSheetBehavior.f10040;
        }
    }
}
