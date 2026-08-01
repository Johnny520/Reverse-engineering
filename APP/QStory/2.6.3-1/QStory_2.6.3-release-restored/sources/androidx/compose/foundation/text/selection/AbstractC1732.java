package androidx.compose.foundation.text.selection;

import android.view.MotionEvent;
import androidx.collection.C1123;
import androidx.compose.p001ui.input.pointer.C2478;
import androidx.compose.p001ui.input.pointer.C2487;
import java.util.List;
import top.linl.dexparser.bean.DexMap;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1732 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1123 f2884 = C1753.f2944;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        return true;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m2360(C2487 c2487) {
        MotionEvent motionEventM3606;
        List list = c2487.f5197;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (((C2478) list.get(i)).f5164 == 2) {
                i++;
            } else {
                MotionEvent motionEventM36062 = c2487.m3606();
                if ((motionEventM36062 == null || !motionEventM36062.isFromSource(DexMap.TYPE_STRING_DATA_ITEM)) && ((motionEventM3606 = c2487.m3606()) == null || !motionEventM3606.isFromSource(1048584))) {
                    return false;
                }
            }
        }
    }
}
