package p171;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import p170.AbstractC7721;

/* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7729 extends AbstractC7726 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ AbstractC7721 f20992;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ String f20993;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ AbstractC7728 f20994;

    public C7729(AbstractC7728 abstractC7728, String str, AbstractC7721 abstractC7721) {
        this.f20994 = abstractC7728;
        this.f20993 = str;
        this.f20992 = abstractC7721;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13018(Object obj) {
        AbstractC7728 abstractC7728 = this.f20994;
        ArrayList arrayList = abstractC7728.f20987;
        LinkedHashMap linkedHashMap = abstractC7728.f20989;
        String str = this.f20993;
        Object obj2 = linkedHashMap.get(str);
        AbstractC7721 abstractC7721 = this.f20992;
        if (obj2 == null) {
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC7721 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }
        int iIntValue = ((Number) obj2).intValue();
        arrayList.add(str);
        try {
            abstractC7728.mo135(iIntValue, abstractC7721, obj);
        } catch (Exception e) {
            arrayList.remove(str);
            throw e;
        }
    }
}
