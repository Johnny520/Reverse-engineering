package androidx.activity;

import android.os.Bundle;
import androidx.lifecycle.C0454F;
import java.util.ArrayList;
import java.util.HashMap;
import p024M.InterfaceC0189c;
import p061e.AbstractActivityC0533i;

/* JADX INFO: renamed from: androidx.activity.c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0372c implements InterfaceC0189c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f879a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f880b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0372c(int i2, Object obj) {
        this.f879a = i2;
        this.f880b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p024M.InterfaceC0189c
    /* JADX INFO: renamed from: a */
    public final Bundle mo392a() {
        switch (this.f879a) {
            case 0:
                AbstractActivityC0533i abstractActivityC0533i = (AbstractActivityC0533i) this.f880b;
                Bundle bundle = new Bundle();
                C0374e c0374e = abstractActivityC0533i.f899j;
                c0374e.getClass();
                HashMap map = c0374e.f884c;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(map.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(map.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(c0374e.f886e));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) c0374e.f889h.clone());
                bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", c0374e.f882a);
                return bundle;
            default:
                return C0454F.m908a((C0454F) this.f880b);
        }
    }
}
