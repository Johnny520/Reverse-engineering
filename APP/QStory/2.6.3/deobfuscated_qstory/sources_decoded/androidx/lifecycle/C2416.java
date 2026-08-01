package androidx.lifecycle;

import android.os.Bundle;
import androidx.fragment.app.C2335;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.Pair;
import kotlin.collections.AbstractC4339;
import kotlin.reflect.jvm.internal.types.AbstractC4922;
import p052.InterfaceC6543;
import p142.C7539;
import p142.InterfaceC7540;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2416 implements InterfaceC7540 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC5184 f7056;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Bundle f7057;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f7058;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7539 f7059;

    public C2416(C7539 c7539, final InterfaceC2421 interfaceC2421) {
        c7539.getClass();
        this.f7059 = c7539;
        this.f7056 = AbstractC5187.m10214(new InterfaceC6543() { // from class: androidx.lifecycle.飘花落叶言子苏世哲兰楪
            @Override // p052.InterfaceC6543
            public final Object invoke() {
                return AbstractC2435.m4535(interfaceC2421);
            }
        });
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m4516() {
        Pair[] pairArr;
        if (this.f7058) {
            return;
        }
        Bundle bundleM12763 = this.f7059.m12763("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Map mapM8776 = AbstractC4339.m8776();
        if (mapM8776.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapM8776.size());
            for (Map.Entry entry : mapM8776.entrySet()) {
                arrayList.add(new Pair((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleM9878 = AbstractC4922.m9878((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        Bundle bundle = this.f7057;
        if (bundle != null) {
            bundleM9878.putAll(bundle);
        }
        if (bundleM12763 != null) {
            bundleM9878.putAll(bundleM12763);
        }
        this.f7057 = bundleM9878;
        this.f7058 = true;
    }

    @Override // p142.InterfaceC7540
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Bundle mo165() {
        Pair[] pairArr;
        Map mapM8776 = AbstractC4339.m8776();
        if (mapM8776.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapM8776.size());
            for (Map.Entry entry : mapM8776.entrySet()) {
                arrayList.add(new Pair((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleM9878 = AbstractC4922.m9878((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        Bundle bundle = this.f7057;
        if (bundle != null) {
            bundleM9878.putAll(bundle);
        }
        for (Map.Entry entry2 : ((C2415) this.f7056.getValue()).f7055.entrySet()) {
            String str = (String) entry2.getKey();
            Bundle bundleMo165 = ((C2335) ((C2420) entry2.getValue()).f7064.f3619).mo165();
            if (!bundleMo165.isEmpty()) {
                str.getClass();
                bundleM9878.putBundle(str, bundleMo165);
            }
        }
        this.f7058 = false;
        return bundleM9878;
    }
}
