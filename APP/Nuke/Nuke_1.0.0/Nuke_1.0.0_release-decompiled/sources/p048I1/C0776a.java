package p048I1;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import p056K2.C0882h;
import p061L2.AbstractC0973m;
import p127Z2.AbstractC1784a;

/* JADX INFO: renamed from: I1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0776a implements InterfaceC0779d {

    /* JADX INFO: renamed from: a */
    public final LinkedHashSet f2519a = new LinkedHashSet();

    public C0776a(C0780e c0780e) {
        c0780e.m1327c("androidx.savedstate.Restarter", this);
    }

    @Override // p048I1.InterfaceC0779d
    /* JADX INFO: renamed from: a */
    public final Bundle mo166a() {
        Bundle bundleM3224j = AbstractC1784a.m3224j((C0882h[]) Arrays.copyOf(new C0882h[0], 0));
        List listM2024e0 = AbstractC0973m.m2024e0(this.f2519a);
        bundleM3224j.putStringArrayList("classes_to_restore", listM2024e0 instanceof ArrayList ? (ArrayList) listM2024e0 : new ArrayList<>(listM2024e0));
        return bundleM3224j;
    }
}
