package org.luckypray.dexkit.query.matchers;

import androidx.compose.foundation.draganddrop.AbstractC1298;
import com.google.flatbuffers.C4051;
import java.util.ArrayList;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import p378.C9755;

/* JADX INFO: renamed from: org.luckypray.dexkit.query.matchers.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6541 extends AbstractC1298 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public ArrayList f16001;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f16002;

    public C6541(String str, ArrayList arrayList) {
        this.f16001 = new ArrayList();
        this.f16002 = str;
        this.f16001 = new ArrayList(arrayList);
    }

    @Override // androidx.compose.foundation.draganddrop.AbstractC1298
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final int mo1741(C4051 c4051) throws IllegalAccessException {
        ArrayList<C9755> arrayList = this.f16001;
        String str = this.f16002;
        if (str == null) {
            throw new IllegalAccessException("groupName not be null");
        }
        if (arrayList.isEmpty()) {
            throw new IllegalAccessException("matchers not be empty");
        }
        int iM7861 = c4051.m7861(str);
        ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(arrayList, 10));
        for (C9755 c9755 : arrayList) {
            c9755.getClass();
            arrayList2.add(Integer.valueOf(c9755.mo1741(c4051)));
        }
        int iM7860 = c4051.m7860(AbstractC5176.m9357(arrayList2));
        c4051.m7858(2);
        c4051.m7851(1, iM7860);
        c4051.m7851(0, iM7861);
        int iM7864 = c4051.m7864();
        c4051.m7862(iM7864);
        return iM7864;
    }
}
