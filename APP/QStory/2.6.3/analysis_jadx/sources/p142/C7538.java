package p142;

import android.os.Bundle;
import androidx.lifecycle.C2386;
import androidx.lifecycle.Lifecycle$State;
import com.alibaba.fastjson2.AbstractC2905;
import io.ktor.util.C4211;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC4339;
import kotlin.reflect.jvm.internal.types.AbstractC4922;
import p130.C7502;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7538 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7539 f20418;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7502 f20419;

    public C7538(C7502 c7502) {
        this.f20419 = c7502;
        this.f20418 = new C7539(c7502);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m12757(Bundle bundle) {
        Pair[] pairArr;
        C7502 c7502 = this.f20419;
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
        Bundle bundle2 = c7502.f20360;
        if (bundle2 != null) {
            bundleM9878.putAll(bundle2);
        }
        synchronized (c7502.f20363) {
            for (Map.Entry entry2 : c7502.f20362.entrySet()) {
                String str = (String) entry2.getKey();
                Bundle bundleMo165 = ((InterfaceC7540) entry2.getValue()).mo165();
                str.getClass();
                bundleMo165.getClass();
                bundleM9878.putBundle(str, bundleMo165);
            }
        }
        if (bundleM9878.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundleM9878);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m12758(Bundle bundle) {
        C7502 c7502 = this.f20419;
        InterfaceC7537 interfaceC7537 = c7502.f20365;
        if (!c7502.f20361) {
            c7502.m12723();
        }
        if (((C2386) interfaceC7537.getLifecycle()).f7019.isAtLeast(Lifecycle$State.STARTED)) {
            C4211.m8615(((C2386) interfaceC7537.getLifecycle()).f7019, "performRestore cannot be called when owner is ");
            return;
        }
        if (c7502.f20367) {
            C5925.m11311("SavedStateRegistry was already restored.");
            return;
        }
        Bundle bundleM6298 = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundleM6298 = AbstractC2905.m6298("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
        }
        c7502.f20360 = bundleM6298;
        c7502.f20367 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m12759() {
        this.f20419.m12723();
    }
}
