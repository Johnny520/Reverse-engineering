package p158;

import android.os.Bundle;
import androidx.lifecycle.C3219;
import androidx.lifecycle.Lifecycle$State;
import com.alibaba.fastjson2.AbstractC3738;
import io.ktor.util.C5043;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC5171;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import p146.C8331;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8367 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8368 f20763;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8331 f20764;

    public C8367(C8331 c8331) {
        this.f20764 = c8331;
        this.f20763 = new C8368(c8331);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m13316(Bundle bundle) {
        Pair[] pairArr;
        C8331 c8331 = this.f20764;
        Map mapM9335 = AbstractC5171.m9335();
        if (mapM9335.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapM9335.size());
            for (Map.Entry entry : mapM9335.entrySet()) {
                arrayList.add(new Pair((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleM10437 = AbstractC5754.m10437((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        Bundle bundle2 = c8331.f20705;
        if (bundle2 != null) {
            bundleM10437.putAll(bundle2);
        }
        synchronized (c8331.f20708) {
            for (Map.Entry entry2 : c8331.f20707.entrySet()) {
                String str = (String) entry2.getKey();
                Bundle bundleMo725 = ((InterfaceC8369) entry2.getValue()).mo725();
                str.getClass();
                bundleMo725.getClass();
                bundleM10437.putBundle(str, bundleMo725);
            }
        }
        if (bundleM10437.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundleM10437);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m13317(Bundle bundle) {
        C8331 c8331 = this.f20764;
        InterfaceC8366 interfaceC8366 = c8331.f20710;
        if (!c8331.f20706) {
            c8331.m13282();
        }
        if (((C3219) interfaceC8366.getLifecycle()).f7364.isAtLeast(Lifecycle$State.STARTED)) {
            C5043.m9174(((C3219) interfaceC8366.getLifecycle()).f7364, "performRestore cannot be called when owner is ");
            return;
        }
        if (c8331.f20712) {
            C6755.m11870("SavedStateRegistry was already restored.");
            return;
        }
        Bundle bundleM6858 = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundleM6858 = AbstractC3738.m6858("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
        }
        c8331.f20705 = bundleM6858;
        c8331.f20712 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13318() {
        this.f20764.m13282();
    }
}
