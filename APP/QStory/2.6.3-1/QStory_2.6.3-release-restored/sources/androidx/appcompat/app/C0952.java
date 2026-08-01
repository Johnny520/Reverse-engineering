package androidx.appcompat.app;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5176;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import p158.C8368;
import p158.InterfaceC8369;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0952 implements InterfaceC8369 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f634;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f635;

    public C0952(C8368 c8368) {
        this.f635 = 1;
        this.f634 = new LinkedHashSet();
        c8368.m13320("androidx.savedstate.Restarter", this);
    }

    @Override // p158.InterfaceC8369
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Bundle mo725() {
        Pair[] pairArr;
        int i = this.f635;
        Object obj = this.f634;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                ((AppCompatActivity) obj).getDelegate().getClass();
                return bundle;
            default:
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
                List listM9356 = AbstractC5176.m9356((LinkedHashSet) obj);
                listM9356.getClass();
                bundleM10437.putStringArrayList("classes_to_restore", listM9356 instanceof ArrayList ? (ArrayList) listM9356 : new ArrayList<>(listM9356));
                return bundleM10437;
        }
    }

    public C0952(AppCompatActivity appCompatActivity) {
        this.f635 = 0;
        this.f634 = appCompatActivity;
    }
}
