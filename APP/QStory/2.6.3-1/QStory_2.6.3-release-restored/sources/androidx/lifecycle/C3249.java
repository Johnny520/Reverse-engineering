package androidx.lifecycle;

import android.os.Bundle;
import androidx.fragment.app.C3168;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.Pair;
import kotlin.collections.AbstractC5171;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import p068.InterfaceC7372;
import p158.C8368;
import p158.InterfaceC8369;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3249 implements InterfaceC8369 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC6016 f7401;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Bundle f7402;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f7403;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8368 f7404;

    public C3249(C8368 c8368, final InterfaceC3254 interfaceC3254) {
        c8368.getClass();
        this.f7404 = c8368;
        this.f7401 = AbstractC6019.m10773(new InterfaceC7372() { // from class: androidx.lifecycle.飘花落叶言子苏世哲兰楪
            @Override // p068.InterfaceC7372
            public final Object invoke() {
                return AbstractC3268.m5095(interfaceC3254);
            }
        });
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m5076() {
        Pair[] pairArr;
        if (this.f7403) {
            return;
        }
        Bundle bundleM13322 = this.f7404.m13322("androidx.lifecycle.internal.SavedStateHandlesProvider");
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
        Bundle bundle = this.f7402;
        if (bundle != null) {
            bundleM10437.putAll(bundle);
        }
        if (bundleM13322 != null) {
            bundleM10437.putAll(bundleM13322);
        }
        this.f7402 = bundleM10437;
        this.f7403 = true;
    }

    @Override // p158.InterfaceC8369
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Bundle mo725() {
        Pair[] pairArr;
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
        Bundle bundle = this.f7402;
        if (bundle != null) {
            bundleM10437.putAll(bundle);
        }
        for (Map.Entry entry2 : ((C3248) this.f7401.getValue()).f7400.entrySet()) {
            String str = (String) entry2.getKey();
            Bundle bundleMo725 = ((C3168) ((C3253) entry2.getValue()).f7409.f3964).mo725();
            if (!bundleMo725.isEmpty()) {
                str.getClass();
                bundleM10437.putBundle(str, bundleMo725);
            }
        }
        this.f7403 = false;
        return bundleM10437;
    }
}
