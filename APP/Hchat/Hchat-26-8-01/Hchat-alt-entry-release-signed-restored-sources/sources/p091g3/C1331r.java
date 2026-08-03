package p091g3;

import android.view.ViewParent;
import gg.C1414j;
import p085fg.InterfaceC1231l;

/* JADX INFO: renamed from: g3.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1331r extends C1414j implements InterfaceC1231l {

    /* JADX INFO: renamed from: n */
    public static final C1331r f4396n = new C1331r(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        return ((ViewParent) obj).getParent();
    }
}
