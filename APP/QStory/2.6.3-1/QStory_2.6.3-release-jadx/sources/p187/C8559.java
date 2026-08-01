package p187;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import p186.AbstractC8551;

/* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8559 extends AbstractC8556 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ AbstractC8551 f21332;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ String f21333;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ AbstractC8558 f21334;

    public C8559(AbstractC8558 abstractC8558, String str, AbstractC8551 abstractC8551) {
        this.f21334 = abstractC8558;
        this.f21333 = str;
        this.f21332 = abstractC8551;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13607(Object obj) {
        AbstractC8558 abstractC8558 = this.f21334;
        ArrayList arrayList = abstractC8558.f21327;
        LinkedHashMap linkedHashMap = abstractC8558.f21329;
        String str = this.f21333;
        Object obj2 = linkedHashMap.get(str);
        AbstractC8551 abstractC8551 = this.f21332;
        if (obj2 == null) {
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC8551 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }
        int iIntValue = ((Number) obj2).intValue();
        arrayList.add(str);
        try {
            abstractC8558.mo695(iIntValue, abstractC8551, obj);
        } catch (Exception e) {
            arrayList.remove(str);
            throw e;
        }
    }
}
