package androidx.compose.foundation.text.selection;

import android.content.Context;
import android.content.res.Resources;
import androidx.collection.C0244;
import androidx.collection.C0276;
import androidx.compose.foundation.text.TextContextMenuItems;
import androidx.compose.ui.input.pointer.C1643;
import androidx.compose.ui.text.C2035;
import kotlin.C5176;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6558;
import p121.C7385;
import p121.C7387;
import p179.C7753;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0935 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f2646;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2647;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f2648;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2649;

    public /* synthetic */ C0935(Object obj, Object obj2, Object obj3, int i) {
        this.f2649 = i;
        this.f2647 = obj;
        this.f2648 = obj2;
        this.f2646 = obj3;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        int i = this.f2649;
        C5176 c5176 = C5176.f14739;
        Object obj2 = this.f2646;
        Object obj3 = this.f2648;
        Object obj4 = this.f2647;
        switch (i) {
            case 0:
                C0882 c0882 = (C0882) obj4;
                InterfaceC5401 interfaceC5401 = (InterfaceC5401) obj3;
                Context context = (Context) obj2;
                C7753 c7753 = (C7753) obj;
                C0244 c0244 = c7753.f21042;
                C0244 c02442 = c7753.f21042;
                C7385 c7385 = C7385.f20024;
                c0244.m775(c7385);
                TextContextMenuItems textContextMenuItems = TextContextMenuItems.Cut;
                boolean zM1757 = c0882.m1757();
                Object obj5 = null;
                int i2 = 0;
                C0937 c0937 = new C0937(interfaceC5401, i2, new TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$1(c0882, null));
                Resources resources = context.getResources();
                int i3 = 2;
                C0936 c0936 = new C0936(c0937, i3, obj5);
                if (zM1757) {
                    c02442.m775(new C7387(textContextMenuItems.getKey(), resources.getString(textContextMenuItems.getStringId()), textContextMenuItems.getDrawableId(), c0936));
                }
                TextContextMenuItems textContextMenuItems2 = TextContextMenuItems.Copy;
                boolean z = (C2035.m3752(c0882.m1759().f5946) || c0882.f2504 == null) ? false : true;
                C0937 c09372 = new C0937(interfaceC5401, i2, new TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$2(c0882, null));
                Resources resources2 = context.getResources();
                C0936 c09362 = new C0936(c09372, i3, obj5);
                if (z) {
                    c02442.m775(new C7387(textContextMenuItems2.getKey(), resources2.getString(textContextMenuItems2.getStringId()), textContextMenuItems2.getDrawableId(), c09362));
                }
                TextContextMenuItems textContextMenuItems3 = TextContextMenuItems.Paste;
                boolean zM1756 = c0882.m1756();
                C0937 c09373 = new C0937(interfaceC5401, i2, new TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$3(c0882, null));
                Resources resources3 = context.getResources();
                C0936 c09363 = new C0936(c09373, i3, obj5);
                if (zM1756) {
                    c02442.m775(new C7387(textContextMenuItems3.getKey(), resources3.getString(textContextMenuItems3.getStringId()), textContextMenuItems3.getDrawableId(), c09363));
                }
                TextContextMenuItems textContextMenuItems4 = TextContextMenuItems.SelectAll;
                boolean zM1772 = c0882.m1772();
                C0885 c0885 = new C0885(c0882, 5);
                C0885 c08852 = new C0885(c0882, 6);
                Resources resources4 = context.getResources();
                C0936 c09364 = new C0936(c08852, i3, c0885);
                if (zM1772) {
                    c02442.m775(new C7387(textContextMenuItems4.getKey(), resources4.getString(textContextMenuItems4.getStringId()), textContextMenuItems4.getDrawableId(), c09364));
                }
                TextContextMenuItems textContextMenuItems5 = TextContextMenuItems.Autofill;
                boolean zM1758 = c0882.m1758();
                C0885 c08853 = new C0885(c0882, 7);
                Resources resources5 = context.getResources();
                C0936 c09365 = new C0936(c08853, i3, obj5);
                if (zM1758) {
                    c02442.m775(new C7387(textContextMenuItems5.getKey(), resources5.getString(textContextMenuItems5.getStringId()), textContextMenuItems5.getDrawableId(), c09365));
                }
                c02442.m775(c7385);
                break;
            default:
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj2;
                C1643 c1643 = (C1643) obj;
                if (((InterfaceC0926) obj4).mo1778(c1643.f4807, (C0276) obj3)) {
                    c1643.m3024();
                    ref$BooleanRef.element = true;
                }
                break;
        }
        return c5176;
    }
}
