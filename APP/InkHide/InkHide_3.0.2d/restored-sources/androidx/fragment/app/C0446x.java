package androidx.fragment.app;

import android.content.Intent;
import androidx.activity.result.C0379a;
import java.util.ArrayList;
import java.util.Iterator;
import p006D.AbstractC0079h;
import p009E0.C0103c;
import p011F0.AbstractC0120h;
import p011F0.AbstractC0125m;
import p011F0.AbstractC0134v;
import p011F0.C0132t;

/* JADX INFO: renamed from: androidx.fragment.app.x */
/* JADX INFO: loaded from: classes.dex */
public final class C0446x extends AbstractC0079h {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1420d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [androidx.fragment.app.z.b(androidx.fragment.app.o, D.h, androidx.fragment.app.l):void] */
    public /* synthetic */ C0446x(int i2) {
        this.f1420d = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p006D.AbstractC0079h
    /* JADX INFO: renamed from: K */
    public final Object mo204K(int i2, Intent intent) {
        switch (this.f1420d) {
            case 0:
                return new C0379a(i2, intent);
            case 1:
                C0132t c0132t = C0132t.f427a;
                if (i2 != -1 || intent == null) {
                    return c0132t;
                }
                String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra == null || stringArrayExtra == null) {
                    return c0132t;
                }
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i3 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i3 == 0));
                }
                ArrayList arrayListM255c0 = AbstractC0120h.m255c0(stringArrayExtra);
                Iterator it = arrayListM255c0.iterator();
                Iterator it2 = arrayList.iterator();
                ArrayList arrayList2 = new ArrayList(Math.min(AbstractC0125m.m289c0(arrayListM255c0), AbstractC0125m.m289c0(arrayList)));
                while (it.hasNext() && it2.hasNext()) {
                    arrayList2.add(new C0103c(it.next(), it2.next()));
                }
                return AbstractC0134v.m298c0(arrayList2);
            default:
                return new C0379a(i2, intent);
        }
    }
}
