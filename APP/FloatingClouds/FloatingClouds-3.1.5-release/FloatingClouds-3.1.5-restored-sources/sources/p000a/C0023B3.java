package p000a;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.C1128m;
import androidx.savedstate.C1224a;

/* JADX INFO: renamed from: a.B3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0023B3 implements C1224a.b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f68a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f69b;

    public /* synthetic */ C0023B3(int i, Object obj) {
        this.f68a = i;
        this.f69b = obj;
    }

    @Override // androidx.savedstate.C1224a.b
    /* JADX INFO: renamed from: a */
    public final Bundle mo57a() {
        switch (this.f68a) {
            case 0:
                return ((ComponentActivity) this.f69b).lambda$new$1();
            case 1:
                return ((ActivityC0422X6) this.f69b).lambda$init$0();
            case 2:
                return ((AbstractC0553e7) this.f69b).m1352W();
            default:
                return C1128m.m2608a((C1128m) this.f69b);
        }
    }
}
