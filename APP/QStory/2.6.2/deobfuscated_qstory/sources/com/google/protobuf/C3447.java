package com.google.protobuf;

import com.google.protobuf.C3415;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世苏子楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3447 extends AbstractC3446 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC3448 f11118;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public LinkedHashMap f11121 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Map f11119 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public ArrayList f11120 = null;

    public C3447(C3353 c3353) {
        this.f11118 = c3353;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3447) {
            return MapFieldLite.equals(m7634(), ((C3447) obj).m7634());
        }
        return false;
    }

    public final int hashCode() {
        return MapFieldLite.calculateHashCodeForMap(m7634());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final List m7633() {
        ArrayList arrayList = this.f11120;
        if (arrayList != null) {
            return arrayList;
        }
        LinkedHashMap linkedHashMap = this.f11121;
        InterfaceC3448 interfaceC3448 = this.f11118;
        if (linkedHashMap == null) {
            this.f11120 = new ArrayList(this.f11119.size());
            for (Map.Entry entry : this.f11119.entrySet()) {
                ArrayList arrayList2 = this.f11120;
                ((C3353) interfaceC3448).getClass();
                arrayList2.add(AbstractC3334.f10949.toBuilder().setKey(entry.getKey()).setValue((InterfaceC3441) entry.getValue()).build());
            }
            this.f11119 = null;
            return this.f11120;
        }
        this.f11120 = new ArrayList(this.f11121.size());
        for (Map.Entry entry2 : this.f11121.entrySet()) {
            ArrayList arrayList3 = this.f11120;
            C3353 c3353 = (C3353) interfaceC3448;
            c3353.getClass();
            C3415.C3416 key = AbstractC3334.f10949.toBuilder().setKey(entry2.getKey());
            InterfaceC3441 interfaceC3441 = (InterfaceC3441) entry2.getValue();
            c3353.getClass();
            arrayList3.add(key.setValue(C3353.m7425((InterfaceC3721) interfaceC3441)).build());
        }
        this.f11121 = null;
        return this.f11120;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Map m7634() {
        LinkedHashMap linkedHashMap = this.f11121;
        if (linkedHashMap != null) {
            return linkedHashMap;
        }
        if (this.f11119 != null) {
            this.f11121 = new LinkedHashMap(this.f11119.size());
            for (Map.Entry entry : this.f11119.entrySet()) {
                this.f11121.put(entry.getKey(), (InterfaceC3441) entry.getValue());
            }
            this.f11119 = null;
            return this.f11121;
        }
        this.f11121 = new LinkedHashMap(this.f11120.size());
        for (C3415 c3415 : m7636()) {
            this.f11121.put(c3415.getKey(), (InterfaceC3441) c3415.getValue());
        }
        this.f11120 = null;
        return this.f11121;
    }

    @Override // com.google.protobuf.AbstractC3446
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final List mo7521() {
        return m7633();
    }

    @Override // com.google.protobuf.AbstractC3446
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final C3415 mo7522() {
        ((C3353) this.f11118).getClass();
        return AbstractC3334.f10949;
    }

    @Override // com.google.protobuf.AbstractC3446
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final List mo7523() {
        return m7633();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Map m7635() {
        Map map = this.f11119;
        if (map != null) {
            return map;
        }
        if (this.f11121 == null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(this.f11120.size());
            for (C3415 c3415 : m7636()) {
                linkedHashMap.put(c3415.getKey(), (InterfaceC3441) c3415.getValue());
            }
            return linkedHashMap;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(this.f11121.size());
        for (Map.Entry entry : this.f11121.entrySet()) {
            Object key = entry.getKey();
            InterfaceC3441 interfaceC3441 = (InterfaceC3441) entry.getValue();
            ((C3353) this.f11118).getClass();
            linkedHashMap2.put(key, C3353.m7425((InterfaceC3721) interfaceC3441));
        }
        return linkedHashMap2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ArrayList m7636() {
        ArrayList arrayList = new ArrayList(this.f11120.size());
        C3353 c3353 = (C3353) this.f11118;
        c3353.getClass();
        Class<?> cls = ((InterfaceC3441) AbstractC3334.f10949.getValue()).getClass();
        for (InterfaceC3452 interfaceC3452 : this.f11120) {
            C3415 c3415 = (C3415) interfaceC3452;
            if (cls.isInstance(c3415.getValue())) {
                arrayList.add(c3415);
            } else {
                c3353.getClass();
                arrayList.add(((C3415.C3416) AbstractC3334.f10949.toBuilder().mergeFrom(interfaceC3452)).build());
            }
        }
        return arrayList;
    }
}
