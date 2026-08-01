package org.luckypray.dexkit.query.matchers;

import androidx.compose.foundation.draganddrop.AbstractC0455;
import com.google.flatbuffers.C3219;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import org.luckypray.dexkit.query.enums.MatchType;
import p362.C8928;

/* JADX INFO: renamed from: org.luckypray.dexkit.query.matchers.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5717 extends AbstractC0455 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Object f15677;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public List f15678;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f15679;

    public C5717() {
        this.f15679 = 2;
        this.f15677 = MatchType.Contains;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public void m11123(C5714 c5714) {
        List arrayList = this.f15678;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        this.f15678 = arrayList;
        arrayList.add(c5714);
    }

    @Override // androidx.compose.foundation.draganddrop.AbstractC0455
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final int mo1181(C3219 c3219) {
        int iM7301;
        int iM73012;
        int iM73013;
        int iM73014;
        switch (this.f15679) {
            case 0:
                List<C5716> list = this.f15678;
                if (list != null) {
                    ArrayList arrayList = new ArrayList(AbstractC4345.m8822(list, 10));
                    for (C5716 c5716 : list) {
                        c5716.getClass();
                        arrayList.add(Integer.valueOf(c5716.mo1181(c3219)));
                    }
                    iM7301 = c3219.m7301(AbstractC4344.m8798(arrayList));
                } else {
                    iM7301 = 0;
                }
                byte value = ((MatchType) this.f15677).getValue();
                c3219.m7299(3);
                c3219.m7292(2, 0);
                c3219.m7292(0, iM7301);
                c3219.m7295(value, 1);
                int iM7305 = c3219.m7305();
                c3219.m7303(iM7305);
                return iM7305;
            case 1:
                List<C5709> list2 = this.f15678;
                if (list2 != null) {
                    ArrayList arrayList2 = new ArrayList(AbstractC4345.m8822(list2, 10));
                    for (C5709 c5709 : list2) {
                        c5709.getClass();
                        arrayList2.add(Integer.valueOf(c5709.mo1181(c3219)));
                    }
                    iM73012 = c3219.m7301(AbstractC4344.m8798(arrayList2));
                } else {
                    iM73012 = 0;
                }
                byte value2 = ((MatchType) this.f15677).getValue();
                c3219.m7299(3);
                c3219.m7292(2, 0);
                c3219.m7292(0, iM73012);
                c3219.m7295(value2, 1);
                int iM73052 = c3219.m7305();
                c3219.m7303(iM73052);
                return iM73052;
            case 2:
                List<C5714> list3 = this.f15678;
                if (list3 != null) {
                    ArrayList arrayList3 = new ArrayList(AbstractC4345.m8822(list3, 10));
                    for (C5714 c5714 : list3) {
                        c5714.getClass();
                        arrayList3.add(Integer.valueOf(c5714.mo1181(c3219)));
                    }
                    iM73013 = c3219.m7301(AbstractC4344.m8798(arrayList3));
                } else {
                    iM73013 = 0;
                }
                byte value3 = ((MatchType) this.f15677).getValue();
                c3219.m7299(3);
                c3219.m7292(2, 0);
                c3219.m7292(0, iM73013);
                c3219.m7295(value3, 1);
                int iM73053 = c3219.m7305();
                c3219.m7303(iM73053);
                return iM73053;
            default:
                List<C5715> list4 = this.f15678;
                if (list4 != null) {
                    ArrayList arrayList4 = new ArrayList(AbstractC4345.m8822(list4, 10));
                    for (C5715 c5715 : list4) {
                        if (c5715 == null) {
                            c5715 = new C5715();
                        }
                        arrayList4.add(Integer.valueOf(c5715.mo1181(c3219)));
                    }
                    iM73014 = c3219.m7301(AbstractC4344.m8798(arrayList4));
                } else {
                    iM73014 = 0;
                }
                C8928 c8928 = (C8928) this.f15677;
                int iMo1181 = c8928 != null ? c8928.mo1181(c3219) : 0;
                c3219.m7299(2);
                c3219.m7292(1, iMo1181);
                c3219.m7292(0, iM73014);
                int iM73054 = c3219.m7305();
                c3219.m7303(iM73054);
                return iM73054;
        }
    }

    public /* synthetic */ C5717(int i) {
        this.f15679 = i;
    }
}
