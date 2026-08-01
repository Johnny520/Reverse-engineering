package com.lxj.xpopup.widget;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.RunnableC0909;
import androidx.core.view.AbstractC3103;
import androidx.profileinstaller.AbstractC3275;
import com.bumptech.glide.AbstractC3887;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.lxj.xpopup.enums.LayoutStatus;
import com.lxj.xpopup.enums.PopupPosition;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p050.AbstractC7173;
import p166.AbstractC8412;

/* JADX INFO: renamed from: com.lxj.xpopup.widget.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4626 extends AbstractC3887 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Object f12299;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f12300;

    public /* synthetic */ C4626(Object obj, int i) {
        this.f12300 = i;
        this.f12299 = obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public void m8676(int i) {
        PopupDrawerLayout popupDrawerLayout = (PopupDrawerLayout) this.f12299;
        PopupPosition popupPosition = popupDrawerLayout.f12275;
        if (popupPosition == PopupPosition.Left) {
            popupDrawerLayout.f12271.getMeasuredWidth();
            popupDrawerLayout.f12271.getMeasuredWidth();
            popupDrawerLayout.f12271.getMeasuredWidth();
        } else if (popupPosition == PopupPosition.Right) {
            popupDrawerLayout.getMeasuredWidth();
            popupDrawerLayout.f12271.getMeasuredWidth();
            popupDrawerLayout.getMeasuredWidth();
        }
    }

    @Override // com.bumptech.glide.AbstractC3887
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final boolean mo7225(View view, int i) {
        WeakReference weakReference;
        int i2 = this.f12300;
        Object obj = this.f12299;
        switch (i2) {
            case 0:
                break;
            case 1:
                PopupDrawerLayout popupDrawerLayout = (PopupDrawerLayout) obj;
                if (popupDrawerLayout.f12273 && !popupDrawerLayout.f12268.m13577(true) && LayoutStatus.Close != null) {
                    break;
                }
                break;
            case 2:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj;
                int i3 = bottomSheetBehavior.f10372;
                if (i3 != 1 && !bottomSheetBehavior.f10415) {
                    if (i3 == 3 && bottomSheetBehavior.f10418 == i) {
                        View view2 = null;
                        if (bottomSheetBehavior.f10390) {
                            WeakReference weakReference2 = bottomSheetBehavior.f10416;
                            if (weakReference2 != null) {
                                view2 = (View) weakReference2.get();
                            }
                        } else {
                            ArrayList arrayList = bottomSheetBehavior.f10428;
                            if (!arrayList.isEmpty()) {
                                view2 = (View) ((WeakReference) arrayList.get(0)).get();
                            }
                        }
                        if (view2 != null && view2.canScrollVertically(-1)) {
                        }
                    }
                    SystemClock.uptimeMillis();
                    WeakReference weakReference3 = bottomSheetBehavior.f10427;
                    if (weakReference3 != null && weakReference3.get() == view) {
                        break;
                    }
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                if (sideSheetBehavior.f10910 != 1 && (weakReference = sideSheetBehavior.f10909) != null && weakReference.get() == view) {
                }
                break;
        }
        return true;
    }

    @Override // com.bumptech.glide.AbstractC3887
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public void mo7226(int i) {
        int i2 = this.f12300;
        Object obj = this.f12299;
        switch (i2) {
            case 2:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj;
                    if (bottomSheetBehavior.f10373) {
                        bottomSheetBehavior.m7583(1);
                    }
                }
                break;
            case 3:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                    if (sideSheetBehavior.f10911) {
                        sideSheetBehavior.m7750(1);
                    }
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a9 A[PHI: r4
  0x00a9: PHI (r4v2 int) = (r4v1 int), (r4v1 int), (r4v1 int), (r4v1 int), (r4v0 int), (r4v0 int) binds: [B:73:0x0133, B:65:0x0114, B:57:0x00e4, B:60:0x00fa, B:42:0x00a7, B:40:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ce  */
    @Override // com.bumptech.glide.AbstractC3887
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo7228(View view, float f, float f2) {
        int measuredWidth;
        int i = this.f12300;
        int i2 = 3;
        int i3 = 5;
        Object obj = this.f12299;
        switch (i) {
            case 0:
                PhotoViewContainer photoViewContainer = (PhotoViewContainer) obj;
                if (Math.abs(view.getTop()) <= photoViewContainer.f12256) {
                    photoViewContainer.f12260.m13587(photoViewContainer.f12261, 0, 0);
                    photoViewContainer.f12260.m13587(view, 0, 0);
                    WeakHashMap weakHashMap = AbstractC3103.f6939;
                    photoViewContainer.postInvalidateOnAnimation();
                    break;
                }
                break;
            case 1:
                PopupDrawerLayout popupDrawerLayout = (PopupDrawerLayout) obj;
                int i4 = 13;
                if (view != popupDrawerLayout.f12267 || f != 0.0f) {
                    View view2 = popupDrawerLayout.f12271;
                    if (view == view2 && popupDrawerLayout.f12263 && !popupDrawerLayout.f12262 && f < -500.0f) {
                        popupDrawerLayout.post(new RunnableC0909(popupDrawerLayout, i4));
                    } else {
                        if (popupDrawerLayout.f12275 == PopupPosition.Left) {
                            measuredWidth = f < -1000.0f ? -view2.getMeasuredWidth() : popupDrawerLayout.f12271.getLeft() < (-view2.getMeasuredWidth()) / 2 ? -popupDrawerLayout.f12271.getMeasuredWidth() : 0;
                        } else if (f > 1000.0f) {
                            measuredWidth = popupDrawerLayout.getMeasuredWidth();
                        } else {
                            measuredWidth = view.getLeft() < popupDrawerLayout.getMeasuredWidth() - (popupDrawerLayout.f12271.getMeasuredWidth() / 2) ? popupDrawerLayout.getMeasuredWidth() - popupDrawerLayout.f12271.getMeasuredWidth() : popupDrawerLayout.getMeasuredWidth();
                        }
                        popupDrawerLayout.f12268.m13587(popupDrawerLayout.f12271, measuredWidth, view.getTop());
                        WeakHashMap weakHashMap2 = AbstractC3103.f6939;
                        popupDrawerLayout.postInvalidateOnAnimation();
                    }
                } else if (popupDrawerLayout.f12274) {
                    popupDrawerLayout.post(new RunnableC0909(popupDrawerLayout, i4));
                }
                break;
            case 2:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj;
                if (f2 < 0.0f) {
                    if (!bottomSheetBehavior.f10393) {
                        int top2 = view.getTop();
                        SystemClock.uptimeMillis();
                        if (top2 > bottomSheetBehavior.f10387) {
                            i2 = 6;
                        }
                    }
                } else if (!bottomSheetBehavior.f10383 || !bottomSheetBehavior.m7582(view, f2)) {
                    i3 = 4;
                    if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                        int top3 = view.getTop();
                        if (!bottomSheetBehavior.f10393) {
                            int i5 = bottomSheetBehavior.f10387;
                            if (top3 < i5) {
                                if (top3 >= Math.abs(top3 - bottomSheetBehavior.f10385)) {
                                }
                            } else if (Math.abs(top3 - i5) < Math.abs(top3 - bottomSheetBehavior.f10385)) {
                            }
                            i2 = 6;
                        } else if (Math.abs(top3 - bottomSheetBehavior.f10388) >= Math.abs(top3 - bottomSheetBehavior.f10385)) {
                            i2 = i3;
                        }
                    } else {
                        if (!bottomSheetBehavior.f10393) {
                            int top4 = view.getTop();
                            if (Math.abs(top4 - bottomSheetBehavior.f10387) < Math.abs(top4 - bottomSheetBehavior.f10385)) {
                            }
                        }
                        i2 = i3;
                    }
                } else if (Math.abs(f) >= Math.abs(f2) || f2 <= bottomSheetBehavior.f10391) {
                    if (view.getTop() <= (bottomSheetBehavior.m7578() + bottomSheetBehavior.f10423) / 2) {
                        if (!bottomSheetBehavior.f10393 && Math.abs(view.getTop() - bottomSheetBehavior.m7578()) >= Math.abs(view.getTop() - bottomSheetBehavior.f10387)) {
                        }
                    }
                }
                bottomSheetBehavior.m7581(view, i2, true);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                if (!sideSheetBehavior.f10899.mo10457(f)) {
                    if (sideSheetBehavior.f10899.mo10452(view, f)) {
                        if (sideSheetBehavior.f10899.mo10455(f, f2) || sideSheetBehavior.f10899.mo10456(view)) {
                            i2 = 5;
                        }
                    } else if (f == 0.0f || Math.abs(f) <= Math.abs(f2)) {
                        int left = view.getLeft();
                        if (Math.abs(left - sideSheetBehavior.f10899.mo10468()) >= Math.abs(left - sideSheetBehavior.f10899.mo10469())) {
                        }
                    }
                }
                sideSheetBehavior.m7747(view, i2, true);
                break;
        }
    }

    @Override // com.bumptech.glide.AbstractC3887
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo7229(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i5 = this.f12300;
        Object obj = this.f12299;
        switch (i5) {
            case 0:
                PhotoViewContainer photoViewContainer = (PhotoViewContainer) obj;
                AbstractC8412 abstractC8412 = photoViewContainer.f12261;
                if (view != abstractC8412) {
                    abstractC8412.offsetTopAndBottom(i4);
                }
                float fAbs = 1.0f - (((Math.abs(i2) * 1.0f) / photoViewContainer.f12255) * 0.2f);
                photoViewContainer.f12261.setScaleX(fAbs);
                photoViewContainer.f12261.setScaleY(fAbs);
                view.setScaleX(fAbs);
                view.setScaleY(fAbs);
                return;
            case 1:
                PopupDrawerLayout popupDrawerLayout = (PopupDrawerLayout) obj;
                View view2 = popupDrawerLayout.f12267;
                if (view != view2) {
                    m8676(i);
                    return;
                }
                view2.layout(0, 0, view2.getMeasuredWidth(), popupDrawerLayout.f12267.getMeasuredHeight());
                int iM8674 = PopupDrawerLayout.m8674(popupDrawerLayout, popupDrawerLayout.f12271.getLeft() + i3);
                View view3 = popupDrawerLayout.f12271;
                view3.layout(iM8674, view3.getTop(), popupDrawerLayout.f12271.getMeasuredWidth() + iM8674, popupDrawerLayout.f12271.getBottom());
                m8676(iM8674);
                return;
            case 2:
                ((BottomSheetBehavior) obj).m7590(i2);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                WeakReference weakReference = sideSheetBehavior.f10906;
                View view4 = weakReference != null ? (View) weakReference.get() : null;
                if (view4 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view4.getLayoutParams()) != null) {
                    sideSheetBehavior.f10899.mo10451(marginLayoutParams, view.getLeft(), view.getRight());
                    view4.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f10902;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f10899.mo10470(i);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw AbstractC3275.m5138(it);
                }
                return;
        }
    }

    @Override // com.bumptech.glide.AbstractC3887
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public int mo7230(View view, int i, int i2) {
        int i3 = this.f12300;
        Object obj = this.f12299;
        switch (i3) {
            case 0:
                PhotoViewContainer photoViewContainer = (PhotoViewContainer) obj;
                int top2 = (i2 / 2) + photoViewContainer.f12261.getTop();
                int i4 = photoViewContainer.f12255;
                return top2 >= 0 ? Math.min(top2, i4) : -Math.min(-top2, i4);
            case 1:
            default:
                return super.mo7230(view, i, i2);
            case 2:
                return AbstractC7173.m12446(i, ((BottomSheetBehavior) obj).m7578(), mo7233());
            case 3:
                return view.getTop();
        }
    }

    @Override // com.bumptech.glide.AbstractC3887
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public int mo7231(View view, int i) {
        int i2 = this.f12300;
        Object obj = this.f12299;
        switch (i2) {
            case 1:
                PopupDrawerLayout popupDrawerLayout = (PopupDrawerLayout) obj;
                return view == popupDrawerLayout.f12267 ? i : PopupDrawerLayout.m8674(popupDrawerLayout, i);
            case 2:
                return view.getLeft();
            case 3:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                return AbstractC7173.m12446(i, sideSheetBehavior.f10899.mo10466(), sideSheetBehavior.f10899.mo10463());
            default:
                return super.mo7231(view, i);
        }
    }

    @Override // com.bumptech.glide.AbstractC3887
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public int mo7232(View view) {
        switch (this.f12300) {
            case 1:
                return 1;
            case 2:
            default:
                return super.mo7232(view);
            case 3:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f12299;
                return sideSheetBehavior.f10913 + sideSheetBehavior.f10908;
        }
    }

    @Override // com.bumptech.glide.AbstractC3887
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public int mo7233() {
        switch (this.f12300) {
            case 0:
                return 1;
            case 1:
            default:
                return super.mo7233();
            case 2:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f12299;
                return bottomSheetBehavior.f10383 ? bottomSheetBehavior.f10423 : bottomSheetBehavior.f10385;
        }
    }
}
