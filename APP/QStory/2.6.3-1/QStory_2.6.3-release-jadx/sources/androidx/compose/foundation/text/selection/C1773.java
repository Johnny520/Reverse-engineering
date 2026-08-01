package androidx.compose.foundation.text.selection;

import android.content.Context;
import android.content.res.Resources;
import androidx.collection.C1091;
import androidx.collection.C1123;
import androidx.compose.foundation.text.TextContextMenuItems;
import androidx.compose.p001ui.input.pointer.C2478;
import androidx.compose.p001ui.text.C2869;
import kotlin.C6008;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7387;
import p137.C8214;
import p137.C8216;
import p195.C8582;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1773 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f2991;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2992;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f2993;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2994;

    public /* synthetic */ C1773(Object obj, Object obj2, Object obj3, int i) {
        this.f2994 = i;
        this.f2992 = obj;
        this.f2993 = obj2;
        this.f2991 = obj3;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        int i = this.f2994;
        C6008 c6008 = C6008.f15084;
        Object obj2 = this.f2991;
        Object obj3 = this.f2993;
        Object obj4 = this.f2992;
        switch (i) {
            case 0:
                C1720 c1720 = (C1720) obj4;
                InterfaceC6233 interfaceC6233 = (InterfaceC6233) obj3;
                Context context = (Context) obj2;
                C8582 c8582 = (C8582) obj;
                C1091 c1091 = c8582.f21387;
                C1091 c10912 = c8582.f21387;
                C8214 c8214 = C8214.f20369;
                c1091.m1335(c8214);
                TextContextMenuItems textContextMenuItems = TextContextMenuItems.Cut;
                boolean zM2317 = c1720.m2317();
                Object obj5 = null;
                int i2 = 0;
                C1775 c1775 = new C1775(interfaceC6233, i2, new C0127xdce13b49(c1720, null));
                Resources resources = context.getResources();
                int i3 = 2;
                C1774 c1774 = new C1774(c1775, i3, obj5);
                if (zM2317) {
                    c10912.m1335(new C8216(textContextMenuItems.getKey(), resources.getString(textContextMenuItems.getStringId()), textContextMenuItems.getDrawableId(), c1774));
                }
                TextContextMenuItems textContextMenuItems2 = TextContextMenuItems.Copy;
                boolean z = (C2869.m4312(c1720.m2319().f6291) || c1720.f2849 == null) ? false : true;
                C1775 c17752 = new C1775(interfaceC6233, i2, new C0128xdce13b4a(c1720, null));
                Resources resources2 = context.getResources();
                C1774 c17742 = new C1774(c17752, i3, obj5);
                if (z) {
                    c10912.m1335(new C8216(textContextMenuItems2.getKey(), resources2.getString(textContextMenuItems2.getStringId()), textContextMenuItems2.getDrawableId(), c17742));
                }
                TextContextMenuItems textContextMenuItems3 = TextContextMenuItems.Paste;
                boolean zM2316 = c1720.m2316();
                C1775 c17753 = new C1775(interfaceC6233, i2, new C0129xdce13b4b(c1720, null));
                Resources resources3 = context.getResources();
                C1774 c17743 = new C1774(c17753, i3, obj5);
                if (zM2316) {
                    c10912.m1335(new C8216(textContextMenuItems3.getKey(), resources3.getString(textContextMenuItems3.getStringId()), textContextMenuItems3.getDrawableId(), c17743));
                }
                TextContextMenuItems textContextMenuItems4 = TextContextMenuItems.SelectAll;
                boolean zM2332 = c1720.m2332();
                C1723 c1723 = new C1723(c1720, 5);
                C1723 c17232 = new C1723(c1720, 6);
                Resources resources4 = context.getResources();
                C1774 c17744 = new C1774(c17232, i3, c1723);
                if (zM2332) {
                    c10912.m1335(new C8216(textContextMenuItems4.getKey(), resources4.getString(textContextMenuItems4.getStringId()), textContextMenuItems4.getDrawableId(), c17744));
                }
                TextContextMenuItems textContextMenuItems5 = TextContextMenuItems.Autofill;
                boolean zM2318 = c1720.m2318();
                C1723 c17233 = new C1723(c1720, 7);
                Resources resources5 = context.getResources();
                C1774 c17745 = new C1774(c17233, i3, obj5);
                if (zM2318) {
                    c10912.m1335(new C8216(textContextMenuItems5.getKey(), resources5.getString(textContextMenuItems5.getStringId()), textContextMenuItems5.getDrawableId(), c17745));
                }
                c10912.m1335(c8214);
                break;
            default:
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj2;
                C2478 c2478 = (C2478) obj;
                if (((InterfaceC1764) obj4).mo2338(c2478.f5152, (C1123) obj3)) {
                    c2478.m3584();
                    ref$BooleanRef.element = true;
                }
                break;
        }
        return c6008;
    }
}
