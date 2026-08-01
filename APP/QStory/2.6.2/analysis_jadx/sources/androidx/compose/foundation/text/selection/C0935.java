package androidx.compose.foundation.text.selection;

import android.content.Context;
import android.content.res.Resources;
import androidx.collection.C0244;
import androidx.collection.C0276;
import androidx.compose.foundation.text.TextContextMenuItems;
import androidx.compose.ui.input.pointer.C1643;
import androidx.compose.ui.text.C2035;
import kotlin.C5175;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6557;
import p121.C7384;
import p121.C7386;
import p179.C7752;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0935 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f2645;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2646;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f2647;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2648;

    public /* synthetic */ C0935(Object obj, Object obj2, Object obj3, int i) {
        this.f2648 = i;
        this.f2646 = obj;
        this.f2647 = obj2;
        this.f2645 = obj3;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        int i = this.f2648;
        C5175 c5175 = C5175.f14739;
        Object obj2 = this.f2645;
        Object obj3 = this.f2647;
        Object obj4 = this.f2646;
        switch (i) {
            case 0:
                C0882 c0882 = (C0882) obj4;
                InterfaceC5400 interfaceC5400 = (InterfaceC5400) obj3;
                Context context = (Context) obj2;
                C7752 c7752 = (C7752) obj;
                C0244 c0244 = c7752.f21045;
                C0244 c02442 = c7752.f21045;
                C7384 c7384 = C7384.f20029;
                c0244.m774(c7384);
                TextContextMenuItems textContextMenuItems = TextContextMenuItems.Cut;
                boolean zM1747 = c0882.m1747();
                Object obj5 = null;
                int i2 = 0;
                C0937 c0937 = new C0937(interfaceC5400, i2, new TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$1(c0882, null));
                Resources resources = context.getResources();
                int i3 = 2;
                C0936 c0936 = new C0936(c0937, i3, obj5);
                if (zM1747) {
                    c02442.m774(new C7386(textContextMenuItems.getKey(), resources.getString(textContextMenuItems.getStringId()), textContextMenuItems.getDrawableId(), c0936));
                }
                TextContextMenuItems textContextMenuItems2 = TextContextMenuItems.Copy;
                boolean z = (C2035.m3742(c0882.m1749().f5945) || c0882.f2503 == null) ? false : true;
                C0937 c09372 = new C0937(interfaceC5400, i2, new TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$2(c0882, null));
                Resources resources2 = context.getResources();
                C0936 c09362 = new C0936(c09372, i3, obj5);
                if (z) {
                    c02442.m774(new C7386(textContextMenuItems2.getKey(), resources2.getString(textContextMenuItems2.getStringId()), textContextMenuItems2.getDrawableId(), c09362));
                }
                TextContextMenuItems textContextMenuItems3 = TextContextMenuItems.Paste;
                boolean zM1746 = c0882.m1746();
                C0937 c09373 = new C0937(interfaceC5400, i2, new TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$3(c0882, null));
                Resources resources3 = context.getResources();
                C0936 c09363 = new C0936(c09373, i3, obj5);
                if (zM1746) {
                    c02442.m774(new C7386(textContextMenuItems3.getKey(), resources3.getString(textContextMenuItems3.getStringId()), textContextMenuItems3.getDrawableId(), c09363));
                }
                TextContextMenuItems textContextMenuItems4 = TextContextMenuItems.SelectAll;
                boolean zM1762 = c0882.m1762();
                C0885 c0885 = new C0885(c0882, 5);
                C0885 c08852 = new C0885(c0882, 6);
                Resources resources4 = context.getResources();
                C0936 c09364 = new C0936(c08852, i3, c0885);
                if (zM1762) {
                    c02442.m774(new C7386(textContextMenuItems4.getKey(), resources4.getString(textContextMenuItems4.getStringId()), textContextMenuItems4.getDrawableId(), c09364));
                }
                TextContextMenuItems textContextMenuItems5 = TextContextMenuItems.Autofill;
                boolean zM1748 = c0882.m1748();
                C0885 c08853 = new C0885(c0882, 7);
                Resources resources5 = context.getResources();
                C0936 c09365 = new C0936(c08853, i3, obj5);
                if (zM1748) {
                    c02442.m774(new C7386(textContextMenuItems5.getKey(), resources5.getString(textContextMenuItems5.getStringId()), textContextMenuItems5.getDrawableId(), c09365));
                }
                c02442.m774(c7384);
                break;
            default:
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj2;
                C1643 c1643 = (C1643) obj;
                if (((InterfaceC0926) obj4).mo1768(c1643.f4806, (C0276) obj3)) {
                    c1643.m3014();
                    ref$BooleanRef.element = true;
                }
                break;
        }
        return c5175;
    }
}
