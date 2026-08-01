package com.google.protobuf;

import com.google.protobuf.C3416;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世苏子楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3448 extends AbstractC3447 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC3449 f11123;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public LinkedHashMap f11126 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Map f11124 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public ArrayList f11125 = null;

    public C3448(C3354 c3354) {
        this.f11123 = c3354;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3448) {
            return MapFieldLite.equals(m7621(), ((C3448) obj).m7621());
        }
        return false;
    }

    public final int hashCode() {
        return MapFieldLite.calculateHashCodeForMap(m7621());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final List m7620() {
        ArrayList arrayList = this.f11125;
        if (arrayList != null) {
            return arrayList;
        }
        LinkedHashMap linkedHashMap = this.f11126;
        InterfaceC3449 interfaceC3449 = this.f11123;
        if (linkedHashMap == null) {
            this.f11125 = new ArrayList(this.f11124.size());
            for (Map.Entry entry : this.f11124.entrySet()) {
                ArrayList arrayList2 = this.f11125;
                ((C3354) interfaceC3449).getClass();
                arrayList2.add(AbstractC3335.f10954.toBuilder().setKey(entry.getKey()).setValue((InterfaceC3442) entry.getValue()).build());
            }
            this.f11124 = null;
            return this.f11125;
        }
        this.f11125 = new ArrayList(this.f11126.size());
        for (Map.Entry entry2 : this.f11126.entrySet()) {
            ArrayList arrayList3 = this.f11125;
            C3354 c3354 = (C3354) interfaceC3449;
            c3354.getClass();
            C3416.C3417 key = AbstractC3335.f10954.toBuilder().setKey(entry2.getKey());
            InterfaceC3442 interfaceC3442 = (InterfaceC3442) entry2.getValue();
            c3354.getClass();
            arrayList3.add(key.setValue(C3354.m7412((InterfaceC3722) interfaceC3442)).build());
        }
        this.f11126 = null;
        return this.f11125;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Map m7621() {
        LinkedHashMap linkedHashMap = this.f11126;
        if (linkedHashMap != null) {
            return linkedHashMap;
        }
        if (this.f11124 != null) {
            this.f11126 = new LinkedHashMap(this.f11124.size());
            for (Map.Entry entry : this.f11124.entrySet()) {
                this.f11126.put(entry.getKey(), (InterfaceC3442) entry.getValue());
            }
            this.f11124 = null;
            return this.f11126;
        }
        this.f11126 = new LinkedHashMap(this.f11125.size());
        for (C3416 c3416 : m7623()) {
            this.f11126.put(c3416.getKey(), (InterfaceC3442) c3416.getValue());
        }
        this.f11125 = null;
        return this.f11126;
    }

    @Override // com.google.protobuf.AbstractC3447
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final List mo7508() {
        return m7620();
    }

    @Override // com.google.protobuf.AbstractC3447
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C3416 mo7509() {
        ((C3354) this.f11123).getClass();
        return AbstractC3335.f10954;
    }

    @Override // com.google.protobuf.AbstractC3447
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final List mo7510() {
        return m7620();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Map m7622() {
        Map map = this.f11124;
        if (map != null) {
            return map;
        }
        if (this.f11126 == null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(this.f11125.size());
            for (C3416 c3416 : m7623()) {
                linkedHashMap.put(c3416.getKey(), (InterfaceC3442) c3416.getValue());
            }
            return linkedHashMap;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(this.f11126.size());
        for (Map.Entry entry : this.f11126.entrySet()) {
            Object key = entry.getKey();
            InterfaceC3442 interfaceC3442 = (InterfaceC3442) entry.getValue();
            ((C3354) this.f11123).getClass();
            linkedHashMap2.put(key, C3354.m7412((InterfaceC3722) interfaceC3442));
        }
        return linkedHashMap2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ArrayList m7623() {
        ArrayList arrayList = new ArrayList(this.f11125.size());
        C3354 c3354 = (C3354) this.f11123;
        c3354.getClass();
        Class<?> cls = ((InterfaceC3442) AbstractC3335.f10954.getValue()).getClass();
        for (InterfaceC3453 interfaceC3453 : this.f11125) {
            C3416 c3416 = (C3416) interfaceC3453;
            if (cls.isInstance(c3416.getValue())) {
                arrayList.add(c3416);
            } else {
                c3354.getClass();
                arrayList.add(((C3416.C3417) AbstractC3335.f10954.toBuilder().mergeFrom(interfaceC3453)).build());
            }
        }
        return arrayList;
    }
}
