package yyds;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: yyds.ᛵᛸᲇᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1173 implements InterfaceC1801 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final LinkedHashSet f5381 = new LinkedHashSet();

    public C1173(C0328 c0328) {
        Object obj;
        C0422 c0422 = (C0422) c0328.f1721;
        C2598 c2598Mo1181 = c0422.mo1181("androidx.savedstate.Restarter");
        if (c2598Mo1181 != null) {
            obj = c2598Mo1181.f12796;
        } else {
            C2598 c2598 = new C2598("androidx.savedstate.Restarter", this);
            c0422.f2167++;
            C2598 c25982 = c0422.f2168;
            if (c25982 == null) {
                c0422.f2166 = c2598;
                c0422.f2168 = c2598;
            } else {
                c25982.f12793 = c2598;
                c2598.f12795 = c25982;
                c0422.f2168 = c2598;
            }
            obj = null;
        }
        if (((InterfaceC1801) obj) == null) {
            return;
        }
        C0188.m798("SavedStateProvider with the given key is already registered");
        throw null;
    }

    @Override // yyds.InterfaceC1801
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final Bundle mo1228() {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f5381));
        return bundle;
    }
}
