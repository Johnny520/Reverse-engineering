package com.google.protobuf;

import com.google.protobuf.C4248;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世苏子楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4280 extends AbstractC4279 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC4281 f11468;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public LinkedHashMap f11471 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Map f11469 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public ArrayList f11470 = null;

    public C4280(C4186 c4186) {
        this.f11468 = c4186;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4280) {
            return MapFieldLite.equals(m8180(), ((C4280) obj).m8180());
        }
        return false;
    }

    public final int hashCode() {
        return MapFieldLite.calculateHashCodeForMap(m8180());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final List m8179() {
        ArrayList arrayList = this.f11470;
        if (arrayList != null) {
            return arrayList;
        }
        LinkedHashMap linkedHashMap = this.f11471;
        InterfaceC4281 interfaceC4281 = this.f11468;
        if (linkedHashMap == null) {
            this.f11470 = new ArrayList(this.f11469.size());
            for (Map.Entry entry : this.f11469.entrySet()) {
                ArrayList arrayList2 = this.f11470;
                ((C4186) interfaceC4281).getClass();
                arrayList2.add(AbstractC4167.f11299.toBuilder().setKey(entry.getKey()).setValue((InterfaceC4274) entry.getValue()).build());
            }
            this.f11469 = null;
            return this.f11470;
        }
        this.f11470 = new ArrayList(this.f11471.size());
        for (Map.Entry entry2 : this.f11471.entrySet()) {
            ArrayList arrayList3 = this.f11470;
            C4186 c4186 = (C4186) interfaceC4281;
            c4186.getClass();
            C4248.C4249 key = AbstractC4167.f11299.toBuilder().setKey(entry2.getKey());
            InterfaceC4274 interfaceC4274 = (InterfaceC4274) entry2.getValue();
            c4186.getClass();
            arrayList3.add(key.setValue(C4186.m7971((InterfaceC4554) interfaceC4274)).build());
        }
        this.f11471 = null;
        return this.f11470;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Map m8180() {
        LinkedHashMap linkedHashMap = this.f11471;
        if (linkedHashMap != null) {
            return linkedHashMap;
        }
        if (this.f11469 != null) {
            this.f11471 = new LinkedHashMap(this.f11469.size());
            for (Map.Entry entry : this.f11469.entrySet()) {
                this.f11471.put(entry.getKey(), (InterfaceC4274) entry.getValue());
            }
            this.f11469 = null;
            return this.f11471;
        }
        this.f11471 = new LinkedHashMap(this.f11470.size());
        for (C4248 c4248 : m8182()) {
            this.f11471.put(c4248.getKey(), (InterfaceC4274) c4248.getValue());
        }
        this.f11470 = null;
        return this.f11471;
    }

    @Override // com.google.protobuf.AbstractC4279
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final List mo8067() {
        return m8179();
    }

    @Override // com.google.protobuf.AbstractC4279
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C4248 mo8068() {
        ((C4186) this.f11468).getClass();
        return AbstractC4167.f11299;
    }

    @Override // com.google.protobuf.AbstractC4279
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final List mo8069() {
        return m8179();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Map m8181() {
        Map map = this.f11469;
        if (map != null) {
            return map;
        }
        if (this.f11471 == null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(this.f11470.size());
            for (C4248 c4248 : m8182()) {
                linkedHashMap.put(c4248.getKey(), (InterfaceC4274) c4248.getValue());
            }
            return linkedHashMap;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(this.f11471.size());
        for (Map.Entry entry : this.f11471.entrySet()) {
            Object key = entry.getKey();
            InterfaceC4274 interfaceC4274 = (InterfaceC4274) entry.getValue();
            ((C4186) this.f11468).getClass();
            linkedHashMap2.put(key, C4186.m7971((InterfaceC4554) interfaceC4274));
        }
        return linkedHashMap2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ArrayList m8182() {
        ArrayList arrayList = new ArrayList(this.f11470.size());
        C4186 c4186 = (C4186) this.f11468;
        c4186.getClass();
        Class<?> cls = ((InterfaceC4274) AbstractC4167.f11299.getValue()).getClass();
        for (InterfaceC4285 interfaceC4285 : this.f11470) {
            C4248 c4248 = (C4248) interfaceC4285;
            if (cls.isInstance(c4248.getValue())) {
                arrayList.add(c4248);
            } else {
                c4186.getClass();
                arrayList.add(((C4248.C4249) AbstractC4167.f11299.toBuilder().mergeFrom(interfaceC4285)).build());
            }
        }
        return arrayList;
    }
}
