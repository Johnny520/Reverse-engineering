package com.kongzue.dialogx.util.views;

import android.graphics.RectF;
import androidx.appcompat.app.C0923;
import androidx.core.view.AbstractC3112;
import androidx.core.view.C3058;
import androidx.core.view.C3107;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import p167.AbstractC8418;
import p167.C8414;
import p167.C8416;
import p180.C8494;

/* JADX INFO: renamed from: com.kongzue.dialogx.util.views.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4588 extends AbstractC3112 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f12019;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Object f12020;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ int f12021 = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4588(C8414 c8414) {
        super(0);
        this.f12019 = c8414;
        this.f12020 = new HashMap();
    }

    @Override // androidx.core.view.AbstractC3112
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪 */
    public final C3058 mo2025(C3058 c3058, List list) {
        int i = this.f12021;
        Object obj = this.f12020;
        Object obj2 = this.f12019;
        switch (i) {
            case 0:
                Objects.toString(c3058);
                int i2 = DialogXBaseRelativeLayout.f11968;
                ((C4585) obj2).m8640(c3058, new C4586((C4586) obj));
                return c3058;
            default:
                ArrayList arrayList = ((C8414) obj2).f20897;
                RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
                int i3 = 0;
                for (int size = list.size() - 1; size >= 0; size--) {
                    C3107 c3107 = (C3107) list.get(size);
                    Integer num = (Integer) ((HashMap) obj).get(c3107);
                    if (num != null) {
                        int iIntValue = num.intValue();
                        float fMo4817 = c3107.f6949.mo4817();
                        if ((iIntValue & 1) != 0) {
                            rectF.left = fMo4817;
                        }
                        if ((iIntValue & 2) != 0) {
                            rectF.top = fMo4817;
                        }
                        if ((iIntValue & 4) != 0) {
                            rectF.right = fMo4817;
                        }
                        if ((iIntValue & 8) != 0) {
                            rectF.bottom = fMo4817;
                        }
                        i3 |= iIntValue;
                    }
                }
                C8494.m13499(c3058.f6866.mo4612(519), c3058.f6866.mo4612(64));
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    C8416 c8416 = (C8416) arrayList.get(size2);
                    C8494 c8494 = c8416.f20903;
                    ArrayList arrayList2 = c8416.f20906;
                    for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
                        ((AbstractC8418) arrayList2.get(size3)).getClass();
                        if ((0 & i3) != 0) {
                            throw null;
                        }
                    }
                }
                return c3058;
        }
    }

    @Override // androidx.core.view.AbstractC3112
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰 */
    public final void mo2026(C3107 c3107) {
        int i = this.f12021;
        Object obj = this.f12019;
        switch (i) {
            case 0:
                ((C4585) obj).f12009 = true;
                break;
            default:
                ArrayList arrayList = ((C8414) obj).f20897;
                if ((c3107.f6949.mo4814() & 519) != 0) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ((C8416) arrayList.get(size)).f20902++;
                    }
                }
                break;
        }
    }

    @Override // androidx.core.view.AbstractC3112
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
    public C0923 mo2027(C3107 c3107, C0923 c0923) {
        switch (this.f12021) {
            case 1:
                if ((c3107.f6949.mo4814() & 519) != 0) {
                    C8494 c8494 = (C8494) c0923.f573;
                    C8494 c84942 = (C8494) c0923.f572;
                    int i = c8494.f21155 != c84942.f21155 ? 1 : 0;
                    if (c8494.f21154 != c84942.f21154) {
                        i |= 2;
                    }
                    if (c8494.f21153 != c84942.f21153) {
                        i |= 4;
                    }
                    if (c8494.f21152 != c84942.f21152) {
                        i |= 8;
                    }
                    ((HashMap) this.f12020).put(c3107, Integer.valueOf(i));
                }
                break;
        }
        return c0923;
    }

    @Override // androidx.core.view.AbstractC3112
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰 */
    public final void mo2028(C3107 c3107) {
        int i = this.f12021;
        Object obj = this.f12019;
        switch (i) {
            case 0:
                int i2 = DialogXBaseRelativeLayout.f11968;
                ((C4585) obj).f12009 = false;
                break;
            default:
                ArrayList arrayList = ((C8414) obj).f20897;
                if ((c3107.f6949.mo4814() & 519) != 0) {
                    ((HashMap) this.f12020).remove(c3107);
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        C8416 c8416 = (C8416) arrayList.get(size);
                        int i3 = c8416.f20902;
                        boolean z = i3 > 0;
                        int i4 = i3 - 1;
                        c8416.f20902 = i4;
                        if (z && i4 == 0) {
                            c8416.m13375();
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4588(C4585 c4585, C4586 c4586) {
        super(1);
        this.f12019 = c4585;
        this.f12020 = c4586;
    }
}
