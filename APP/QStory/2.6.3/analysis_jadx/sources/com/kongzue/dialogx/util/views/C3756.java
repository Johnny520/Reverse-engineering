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
import p151.AbstractC7589;
import p151.C7585;
import p151.C7587;
import p164.C7665;

/* JADX INFO: renamed from: com.kongzue.dialogx.util.views.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3756 extends AbstractC2279 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f11674;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Object f11675;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ int f11676 = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3756(C7585 c7585) {
        super(0);
        this.f11674 = c7585;
        this.f11675 = new HashMap();
    }

    @Override // androidx.core.view.AbstractC2279
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪 */
    public final C2225 mo1465(C2225 c2225, List list) {
        int i = this.f11676;
        Object obj = this.f11675;
        Object obj2 = this.f11674;
        switch (i) {
            case 0:
                Objects.toString(c2225);
                int i2 = DialogXBaseRelativeLayout.f11623;
                ((C3753) obj2).m8081(c2225, new C3754((C3754) obj));
                return c2225;
            default:
                ArrayList arrayList = ((C7585) obj2).f20552;
                RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
                int i3 = 0;
                for (int size = list.size() - 1; size >= 0; size--) {
                    C2274 c2274 = (C2274) list.get(size);
                    Integer num = (Integer) ((HashMap) obj).get(c2274);
                    if (num != null) {
                        int iIntValue = num.intValue();
                        float fMo4257 = c2274.f6604.mo4257();
                        if ((iIntValue & 1) != 0) {
                            rectF.left = fMo4257;
                        }
                        if ((iIntValue & 2) != 0) {
                            rectF.top = fMo4257;
                        }
                        if ((iIntValue & 4) != 0) {
                            rectF.right = fMo4257;
                        }
                        if ((iIntValue & 8) != 0) {
                            rectF.bottom = fMo4257;
                        }
                        i3 |= iIntValue;
                    }
                }
                C7665.m12940(c2225.f6521.mo4052(519), c2225.f6521.mo4052(64));
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    C7587 c7587 = (C7587) arrayList.get(size2);
                    C7665 c7665 = c7587.f20558;
                    ArrayList arrayList2 = c7587.f20561;
                    for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
                        ((AbstractC7589) arrayList2.get(size3)).getClass();
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
    public final void mo1466(C2274 c2274) {
        int i = this.f11676;
        Object obj = this.f11674;
        switch (i) {
            case 0:
                ((C3753) obj).f11664 = true;
                break;
            default:
                ArrayList arrayList = ((C7585) obj).f20552;
                if ((c2274.f6604.mo4254() & 519) != 0) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ((C7587) arrayList.get(size)).f20557++;
                    }
                }
                break;
        }
    }

    @Override // androidx.core.view.AbstractC2279
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
    public C0076 mo1467(C2274 c2274, C0076 c0076) {
        switch (this.f11676) {
            case 1:
                if ((c2274.f6604.mo4254() & 519) != 0) {
                    C7665 c7665 = (C7665) c0076.f228;
                    C7665 c76652 = (C7665) c0076.f227;
                    int i = c7665.f20810 != c76652.f20810 ? 1 : 0;
                    if (c7665.f20809 != c76652.f20809) {
                        i |= 2;
                    }
                    if (c7665.f20808 != c76652.f20808) {
                        i |= 4;
                    }
                    if (c7665.f20807 != c76652.f20807) {
                        i |= 8;
                    }
                    ((HashMap) this.f11675).put(c2274, Integer.valueOf(i));
                }
                break;
        }
        return c0076;
    }

    @Override // androidx.core.view.AbstractC2279
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰 */
    public final void mo1468(C2274 c2274) {
        int i = this.f11676;
        Object obj = this.f11674;
        switch (i) {
            case 0:
                int i2 = DialogXBaseRelativeLayout.f11623;
                ((C3753) obj).f11664 = false;
                break;
            default:
                ArrayList arrayList = ((C7585) obj).f20552;
                if ((c2274.f6604.mo4254() & 519) != 0) {
                    ((HashMap) this.f11675).remove(c2274);
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        C7587 c7587 = (C7587) arrayList.get(size);
                        int i3 = c7587.f20557;
                        boolean z = i3 > 0;
                        int i4 = i3 - 1;
                        c7587.f20557 = i4;
                        if (z && i4 == 0) {
                            c7587.m12816();
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3756(C3753 c3753, C3754 c3754) {
        super(1);
        this.f11674 = c3753;
        this.f11675 = c3754;
    }
}
