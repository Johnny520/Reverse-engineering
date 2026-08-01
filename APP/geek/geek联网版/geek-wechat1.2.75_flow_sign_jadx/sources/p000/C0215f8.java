package p000;

import android.window.C0988;
import androidx.activity.C0996;
import androidx.activity.result.C0994;
import androidx.legacy.content.C1012;
import com.github.megatronking.stringfog.xor.C1018;
import com.google.android.material.bottomappbar.C1024;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.coroutines.C1055;

/* JADX INFO: renamed from: f8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0215f8 extends LinkedHashMap {

    /* JADX INFO: renamed from: a */
    public final int f1753a;

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0012. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0027 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x001b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0215f8(int r5) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0215f8.<init>(int):void");
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        int iM2961 = C1012.m2961("۟ۧ۟");
        while (true) {
            switch (iM2961) {
                case 1746757:
                    break;
                case 1746818:
                    return true;
                case 1746935:
                    if (super.size() > this.f1753a) {
                        iM2961 = (C1055.f5702 * C0996.f5643) + 1735114;
                    }
                    break;
                case 1749640:
                    iM2961 = (C1018.f5665 / C0988.f5635) ^ 1746935;
                    continue;
                case 1754562:
                    return false;
            }
            iM2961 = (C0994.f5641 / C1024.f5671) ^ 1754566;
        }
    }
}
