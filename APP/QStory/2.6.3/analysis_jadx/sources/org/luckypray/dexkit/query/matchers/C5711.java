package org.luckypray.dexkit.query.matchers;

import androidx.compose.foundation.draganddrop.AbstractC0455;
import com.google.flatbuffers.C3219;
import java.util.ArrayList;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import p362.C8926;

/* JADX INFO: renamed from: org.luckypray.dexkit.query.matchers.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5711 extends AbstractC0455 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public ArrayList f15656;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f15657;

    public C5711(String str, ArrayList arrayList) {
        this.f15656 = new ArrayList();
        this.f15657 = str;
        this.f15656 = new ArrayList(arrayList);
    }

    @Override // androidx.compose.foundation.draganddrop.AbstractC0455
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final int mo1181(C3219 c3219) throws IllegalAccessException {
        ArrayList<C8926> arrayList = this.f15656;
        String str = this.f15657;
        if (str == null) {
            throw new IllegalAccessException("groupName not be null");
        }
        if (arrayList.isEmpty()) {
            throw new IllegalAccessException("matchers not be empty");
        }
        int iM7302 = c3219.m7302(str);
        ArrayList arrayList2 = new ArrayList(AbstractC4345.m8822(arrayList, 10));
        for (C8926 c8926 : arrayList) {
            c8926.getClass();
            arrayList2.add(Integer.valueOf(c8926.mo1181(c3219)));
        }
        int iM7301 = c3219.m7301(AbstractC4344.m8798(arrayList2));
        c3219.m7299(2);
        c3219.m7292(1, iM7301);
        c3219.m7292(0, iM7302);
        int iM7305 = c3219.m7305();
        c3219.m7303(iM7305);
        return iM7305;
    }
}
