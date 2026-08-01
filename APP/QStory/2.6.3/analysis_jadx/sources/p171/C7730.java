package p171;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import p170.AbstractC7722;

/* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7730 extends AbstractC7727 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ AbstractC7722 f20987;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ String f20988;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ AbstractC7729 f20989;

    public C7730(AbstractC7729 abstractC7729, String str, AbstractC7722 abstractC7722) {
        this.f20989 = abstractC7729;
        this.f20988 = str;
        this.f20987 = abstractC7722;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13048(Object obj) {
        AbstractC7729 abstractC7729 = this.f20989;
        ArrayList arrayList = abstractC7729.f20982;
        LinkedHashMap linkedHashMap = abstractC7729.f20984;
        String str = this.f20988;
        Object obj2 = linkedHashMap.get(str);
        AbstractC7722 abstractC7722 = this.f20987;
        if (obj2 == null) {
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC7722 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }
        int iIntValue = ((Number) obj2).intValue();
        arrayList.add(str);
        try {
            abstractC7729.mo135(iIntValue, abstractC7722, obj);
        } catch (Exception e) {
            arrayList.remove(str);
            throw e;
        }
    }
}
