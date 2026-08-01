package org.luckypray.dexkit.query.matchers;

import androidx.compose.foundation.draganddrop.AbstractC1298;
import com.google.flatbuffers.C4051;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import org.luckypray.dexkit.query.enums.MatchType;
import p378.C9757;

/* JADX INFO: renamed from: org.luckypray.dexkit.query.matchers.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6547 extends AbstractC1298 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Object f16022;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public List f16023;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f16024;

    public C6547() {
        this.f16024 = 2;
        this.f16022 = MatchType.Contains;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public void m11682(C6544 c6544) {
        List arrayList = this.f16023;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        this.f16023 = arrayList;
        arrayList.add(c6544);
    }

    @Override // androidx.compose.foundation.draganddrop.AbstractC1298
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final int mo1741(C4051 c4051) {
        int iM7860;
        int iM78602;
        int iM78603;
        int iM78604;
        switch (this.f16024) {
            case 0:
                List<C6546> list = this.f16023;
                if (list != null) {
                    ArrayList arrayList = new ArrayList(AbstractC5177.m9381(list, 10));
                    for (C6546 c6546 : list) {
                        c6546.getClass();
                        arrayList.add(Integer.valueOf(c6546.mo1741(c4051)));
                    }
                    iM7860 = c4051.m7860(AbstractC5176.m9357(arrayList));
                } else {
                    iM7860 = 0;
                }
                byte value = ((MatchType) this.f16022).getValue();
                c4051.m7858(3);
                c4051.m7851(2, 0);
                c4051.m7851(0, iM7860);
                c4051.m7854(value, 1);
                int iM7864 = c4051.m7864();
                c4051.m7862(iM7864);
                return iM7864;
            case 1:
                List<C6539> list2 = this.f16023;
                if (list2 != null) {
                    ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(list2, 10));
                    for (C6539 c6539 : list2) {
                        c6539.getClass();
                        arrayList2.add(Integer.valueOf(c6539.mo1741(c4051)));
                    }
                    iM78602 = c4051.m7860(AbstractC5176.m9357(arrayList2));
                } else {
                    iM78602 = 0;
                }
                byte value2 = ((MatchType) this.f16022).getValue();
                c4051.m7858(3);
                c4051.m7851(2, 0);
                c4051.m7851(0, iM78602);
                c4051.m7854(value2, 1);
                int iM78642 = c4051.m7864();
                c4051.m7862(iM78642);
                return iM78642;
            case 2:
                List<C6544> list3 = this.f16023;
                if (list3 != null) {
                    ArrayList arrayList3 = new ArrayList(AbstractC5177.m9381(list3, 10));
                    for (C6544 c6544 : list3) {
                        c6544.getClass();
                        arrayList3.add(Integer.valueOf(c6544.mo1741(c4051)));
                    }
                    iM78603 = c4051.m7860(AbstractC5176.m9357(arrayList3));
                } else {
                    iM78603 = 0;
                }
                byte value3 = ((MatchType) this.f16022).getValue();
                c4051.m7858(3);
                c4051.m7851(2, 0);
                c4051.m7851(0, iM78603);
                c4051.m7854(value3, 1);
                int iM78643 = c4051.m7864();
                c4051.m7862(iM78643);
                return iM78643;
            default:
                List<C6545> list4 = this.f16023;
                if (list4 != null) {
                    ArrayList arrayList4 = new ArrayList(AbstractC5177.m9381(list4, 10));
                    for (C6545 c6545 : list4) {
                        if (c6545 == null) {
                            c6545 = new C6545();
                        }
                        arrayList4.add(Integer.valueOf(c6545.mo1741(c4051)));
                    }
                    iM78604 = c4051.m7860(AbstractC5176.m9357(arrayList4));
                } else {
                    iM78604 = 0;
                }
                C9757 c9757 = (C9757) this.f16022;
                int iMo1741 = c9757 != null ? c9757.mo1741(c4051) : 0;
                c4051.m7858(2);
                c4051.m7851(1, iMo1741);
                c4051.m7851(0, iM78604);
                int iM78644 = c4051.m7864();
                c4051.m7862(iM78644);
                return iM78644;
        }
    }

    public /* synthetic */ C6547(int i) {
        this.f16024 = i;
    }
}
