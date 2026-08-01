package androidx.lifecycle;

import android.os.Bundle;
import androidx.fragment.app.C2335;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.Pair;
import kotlin.collections.AbstractC4338;
import p000.AbstractC6087;
import p052.InterfaceC6542;
import p142.C7538;
import p142.InterfaceC7539;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2416 implements InterfaceC7539 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC5183 f7055;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Bundle f7056;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f7057;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7538 f7058;

    public C2416(C7538 c7538, final InterfaceC2421 interfaceC2421) {
        c7538.getClass();
        this.f7058 = c7538;
        this.f7055 = AbstractC5186.m10210(new InterfaceC6542() { // from class: androidx.lifecycle.飘花落叶言子苏世哲兰楪
            @Override // p052.InterfaceC6542
            public final Object invoke() {
                return AbstractC2435.m4525(interfaceC2421);
            }
        });
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m4506() {
        Pair[] pairArr;
        if (this.f7057) {
            return;
        }
        Bundle bundleM12734 = this.f7058.m12734("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Map mapM8781 = AbstractC4338.m8781();
        if (mapM8781.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapM8781.size());
            for (Map.Entry entry : mapM8781.entrySet()) {
                arrayList.add(new Pair((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleM11400 = AbstractC6087.m11400((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        Bundle bundle = this.f7056;
        if (bundle != null) {
            bundleM11400.putAll(bundle);
        }
        if (bundleM12734 != null) {
            bundleM11400.putAll(bundleM12734);
        }
        this.f7056 = bundleM11400;
        this.f7057 = true;
    }

    @Override // p142.InterfaceC7539
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Bundle mo164() {
        Pair[] pairArr;
        Map mapM8781 = AbstractC4338.m8781();
        if (mapM8781.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapM8781.size());
            for (Map.Entry entry : mapM8781.entrySet()) {
                arrayList.add(new Pair((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleM11400 = AbstractC6087.m11400((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        Bundle bundle = this.f7056;
        if (bundle != null) {
            bundleM11400.putAll(bundle);
        }
        for (Map.Entry entry2 : ((C2415) this.f7055.getValue()).f7054.entrySet()) {
            String str = (String) entry2.getKey();
            Bundle bundleMo164 = ((C2335) ((C2420) entry2.getValue()).f7063.f3618).mo164();
            if (!bundleMo164.isEmpty()) {
                str.getClass();
                bundleM11400.putBundle(str, bundleMo164);
            }
        }
        this.f7057 = false;
        return bundleM11400;
    }
}
