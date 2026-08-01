package p142;

import android.os.Bundle;
import androidx.lifecycle.C2386;
import androidx.lifecycle.Lifecycle$State;
import io.ktor.util.C4210;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC4338;
import p000.AbstractC6087;
import p130.C7501;
import p253.AbstractC8189;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7537 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7538 f20423;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7501 f20424;

    public C7537(C7501 c7501) {
        this.f20424 = c7501;
        this.f20423 = new C7538(c7501);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m12728(Bundle bundle) {
        Pair[] pairArr;
        C7501 c7501 = this.f20424;
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
        Bundle bundle2 = c7501.f20365;
        if (bundle2 != null) {
            bundleM11400.putAll(bundle2);
        }
        synchronized (c7501.f20368) {
            for (Map.Entry entry2 : c7501.f20367.entrySet()) {
                String str = (String) entry2.getKey();
                Bundle bundleMo164 = ((InterfaceC7539) entry2.getValue()).mo164();
                str.getClass();
                bundleMo164.getClass();
                bundleM11400.putBundle(str, bundleMo164);
            }
        }
        if (bundleM11400.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundleM11400);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m12729(Bundle bundle) {
        C7501 c7501 = this.f20424;
        InterfaceC7536 interfaceC7536 = c7501.f20370;
        if (!c7501.f20366) {
            c7501.m12694();
        }
        if (((C2386) interfaceC7536.getLifecycle()).f7018.isAtLeast(Lifecycle$State.STARTED)) {
            C4210.m8625(((C2386) interfaceC7536.getLifecycle()).f7018, "performRestore cannot be called when owner is ");
            return;
        }
        if (c7501.f20372) {
            C5919.m11250("SavedStateRegistry was already restored.");
            return;
        }
        Bundle bundleM13676 = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundleM13676 = AbstractC8189.m13676("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
        }
        c7501.f20365 = bundleM13676;
        c7501.f20372 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m12730() {
        this.f20424.m12694();
    }
}
