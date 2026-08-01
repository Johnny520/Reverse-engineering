package p000;

import android.content.Intent;
import com.github.megatronking.stringfog.Base64;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: v1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0802v1 extends AbstractC0259gf {

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f4871y;

    public /* synthetic */ C0802v1(int i) {
        this.f4871y = i;
    }

    @Override // p000.AbstractC0259gf
    /* JADX INFO: renamed from: N */
    public final Object mo1266N(int i, Intent intent) {
        switch (this.f4871y) {
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
                        ArrayList arrayList3 = new ArrayList(Math.min(AbstractC0405kb.m1675c0(arrayList2), AbstractC0405kb.m1675c0(arrayList)));
                        while (it.hasNext() && it2.hasNext()) {
                            arrayList3.add(new C0723sx(it.next(), it2.next()));
                        }
                    }
                }
                break;
        }
        return new C0765u1(i, intent);
    }
}
