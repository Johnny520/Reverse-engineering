package androidx.appcompat.app;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC4339;
import kotlin.collections.AbstractC4344;
import kotlin.reflect.jvm.internal.types.AbstractC4922;
import p142.C7539;
import p142.InterfaceC7540;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0105 implements InterfaceC7540 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f289;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f290;

    public C0105(C7539 c7539) {
        this.f290 = 1;
        this.f289 = new LinkedHashSet();
        c7539.m12761("androidx.savedstate.Restarter", this);
    }

    @Override // p142.InterfaceC7540
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Bundle mo165() {
        Pair[] pairArr;
        int i = this.f290;
        Object obj = this.f289;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                ((AppCompatActivity) obj).getDelegate().getClass();
                return bundle;
            default:
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
                List listM8797 = AbstractC4344.m8797((LinkedHashSet) obj);
                listM8797.getClass();
                bundleM9878.putStringArrayList("classes_to_restore", listM8797 instanceof ArrayList ? (ArrayList) listM8797 : new ArrayList<>(listM8797));
                return bundleM9878;
        }
    }

    public C0105(AppCompatActivity appCompatActivity) {
        this.f290 = 0;
        this.f289 = appCompatActivity;
    }
}
