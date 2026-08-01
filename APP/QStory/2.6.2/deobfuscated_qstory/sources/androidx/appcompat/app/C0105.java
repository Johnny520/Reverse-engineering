package androidx.appcompat.app;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC4338;
import kotlin.collections.AbstractC4343;
import p000.AbstractC6087;
import p142.C7538;
import p142.InterfaceC7539;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0105 implements InterfaceC7539 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f289;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f290;

    public C0105(C7538 c7538) {
        this.f290 = 1;
        this.f289 = new LinkedHashSet();
        c7538.m12732("androidx.savedstate.Restarter", this);
    }

    @Override // p142.InterfaceC7539
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Bundle mo164() {
        Pair[] pairArr;
        int i = this.f290;
        Object obj = this.f289;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                ((AppCompatActivity) obj).getDelegate().getClass();
                return bundle;
            default:
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
                List listM8804 = AbstractC4343.m8804((LinkedHashSet) obj);
                listM8804.getClass();
                bundleM11400.putStringArrayList("classes_to_restore", listM8804 instanceof ArrayList ? (ArrayList) listM8804 : new ArrayList<>(listM8804));
                return bundleM11400;
        }
    }

    public C0105(AppCompatActivity appCompatActivity) {
        this.f290 = 0;
        this.f289 = appCompatActivity;
    }
}
