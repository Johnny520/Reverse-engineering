package p000a;

import android.app.AlertDialog;
import java.util.ArrayList;
import java.util.Arrays;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: a.n5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0722n5 implements InterfaceC0819s7 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2801a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f2802b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f2803c;

    public /* synthetic */ C0722n5(Object obj, int i, Object obj2) {
        this.f2801a = i;
        this.f2802b = obj;
        this.f2803c = obj2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000a.InterfaceC0819s7
    /* JADX INFO: renamed from: a */
    public final Object mo31a() {
        switch (this.f2801a) {
            case 0:
                C0932y6 c0932y6 = new C0932y6();
                C0549e3 c0549e3 = new C0549e3();
                String[] strArr = (String[]) this.f2803c;
                String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
                C0631i9.m1482e(strArr2, "usingStrings");
                ArrayList arrayList = new ArrayList(strArr2.length);
                for (String str : strArr2) {
                    arrayList.add(new C0883ve(str, 1, false));
                }
                c0549e3.f2037c = C0834t3.m1961y0(arrayList);
                c0932y6.f3543b = c0549e3;
                return ((DexKitBridge) this.f2802b).m3324p(c0932y6);
            default:
                AlertDialog alertDialog = (AlertDialog) ((C0338Sc) this.f2802b).f1200a;
                if (alertDialog != null) {
                    alertDialog.dismiss();
                }
                ((C0803ra) this.f2803c).m1869f();
                return C0413Wf.f1577a;
        }
    }
}
