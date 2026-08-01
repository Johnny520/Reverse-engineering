package p000;

import android.content.Intent;
import com.github.megatronking.stringfog.Base64;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: v1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0803v1 extends AbstractC0222ff {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ int f4785A;

    public /* synthetic */ C0803v1(int i) {
        this.f4785A = i;
    }

    @Override // p000.AbstractC0222ff
    /* JADX INFO: renamed from: D */
    public final Object mo1205D(int i, Intent intent) {
        switch (this.f4785A) {
            case Base64.DEFAULT /* 0 */:
                if (i == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i2 : intArrayExtra) {
                            arrayList.add(Boolean.valueOf(i2 == 0));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArrayExtra) {
                            if (str != null) {
                                arrayList2.add(str);
                            }
                        }
                        Iterator it = arrayList2.iterator();
                        Iterator it2 = arrayList.iterator();
                        ArrayList arrayList3 = new ArrayList(Math.min(AbstractC0098cb.m657h0(arrayList2), AbstractC0098cb.m657h0(arrayList)));
                        while (it.hasNext() && it2.hasNext()) {
                            arrayList3.add(new C0427kx(it.next(), it2.next()));
                        }
                    }
                }
                break;
        }
        return new C0766u1(i, intent);
    }
}
