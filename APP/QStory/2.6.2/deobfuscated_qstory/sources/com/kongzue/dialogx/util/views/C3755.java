package com.kongzue.dialogx.util.views;

import android.graphics.RectF;
import androidx.appcompat.app.C0076;
import androidx.core.view.AbstractC2279;
import androidx.core.view.C2225;
import androidx.core.view.C2274;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import p151.AbstractC7588;
import p151.C7584;
import p151.C7586;
import p164.C7664;

/* JADX INFO: renamed from: com.kongzue.dialogx.util.views.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3755 extends AbstractC2279 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f11669;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Object f11670;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ int f11671 = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3755(C7584 c7584) {
        super(0);
        this.f11669 = c7584;
        this.f11670 = new HashMap();
    }

    @Override // androidx.core.view.AbstractC2279
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪 */
    public final C2225 mo1455(C2225 c2225, List list) {
        int i = this.f11671;
        Object obj = this.f11670;
        Object obj2 = this.f11669;
        switch (i) {
            case 0:
                Objects.toString(c2225);
                int i2 = DialogXBaseRelativeLayout.f11618;
                ((C3752) obj2).m8094(c2225, new C3753((C3753) obj));
                return c2225;
            default:
                ArrayList arrayList = ((C7584) obj2).f20557;
                RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
                int i3 = 0;
                for (int size = list.size() - 1; size >= 0; size--) {
                    C2274 c2274 = (C2274) list.get(size);
                    Integer num = (Integer) ((HashMap) obj).get(c2274);
                    if (num != null) {
                        int iIntValue = num.intValue();
                        float fMo4247 = c2274.f6603.mo4247();
                        if ((iIntValue & 1) != 0) {
                            rectF.left = fMo4247;
                        }
                        if ((iIntValue & 2) != 0) {
                            rectF.top = fMo4247;
                        }
                        if ((iIntValue & 4) != 0) {
                            rectF.right = fMo4247;
                        }
                        if ((iIntValue & 8) != 0) {
                            rectF.bottom = fMo4247;
                        }
                        i3 |= iIntValue;
                    }
                }
                C7664.m12911(c2225.f6520.mo4042(519), c2225.f6520.mo4042(64));
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    C7586 c7586 = (C7586) arrayList.get(size2);
                    C7664 c7664 = c7586.f20563;
                    ArrayList arrayList2 = c7586.f20566;
                    for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
                        ((AbstractC7588) arrayList2.get(size3)).getClass();
                        if ((0 & i3) != 0) {
                            throw null;
                        }
                    }
                }
                return c2225;
        }
    }

    @Override // androidx.core.view.AbstractC2279
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰 */
    public final void mo1456(C2274 c2274) {
        int i = this.f11671;
        Object obj = this.f11669;
        switch (i) {
            case 0:
                ((C3752) obj).f11659 = true;
                break;
            default:
                ArrayList arrayList = ((C7584) obj).f20557;
                if ((c2274.f6603.mo4244() & 519) != 0) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ((C7586) arrayList.get(size)).f20562++;
                    }
                }
                break;
        }
    }

    @Override // androidx.core.view.AbstractC2279
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
    public C0076 mo1457(C2274 c2274, C0076 c0076) {
        switch (this.f11671) {
            case 1:
                if ((c2274.f6603.mo4244() & 519) != 0) {
                    C7664 c7664 = (C7664) c0076.f228;
                    C7664 c76642 = (C7664) c0076.f227;
                    int i = c7664.f20815 != c76642.f20815 ? 1 : 0;
                    if (c7664.f20814 != c76642.f20814) {
                        i |= 2;
                    }
                    if (c7664.f20813 != c76642.f20813) {
                        i |= 4;
                    }
                    if (c7664.f20812 != c76642.f20812) {
                        i |= 8;
                    }
                    ((HashMap) this.f11670).put(c2274, Integer.valueOf(i));
                }
                break;
        }
        return c0076;
    }

    @Override // androidx.core.view.AbstractC2279
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰 */
    public final void mo1458(C2274 c2274) {
        int i = this.f11671;
        Object obj = this.f11669;
        switch (i) {
            case 0:
                int i2 = DialogXBaseRelativeLayout.f11618;
                ((C3752) obj).f11659 = false;
                break;
            default:
                ArrayList arrayList = ((C7584) obj).f20557;
                if ((c2274.f6603.mo4244() & 519) != 0) {
                    ((HashMap) this.f11670).remove(c2274);
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        C7586 c7586 = (C7586) arrayList.get(size);
                        int i3 = c7586.f20562;
                        boolean z = i3 > 0;
                        int i4 = i3 - 1;
                        c7586.f20562 = i4;
                        if (z && i4 == 0) {
                            c7586.m12787();
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3755(C3752 c3752, C3753 c3753) {
        super(1);
        this.f11669 = c3752;
        this.f11670 = c3753;
    }
}
