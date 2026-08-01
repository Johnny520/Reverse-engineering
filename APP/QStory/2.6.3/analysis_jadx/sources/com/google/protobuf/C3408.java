package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lin.xposed.hook.javaplugin.C5554;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世楪兰哲苏子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3408 extends AbstractC3447 implements InterfaceC3370 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC3414 f11064;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public ArrayList f11065;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public volatile MapField$StorageMode f11066;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C3407 f11067;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public volatile boolean f11068;

    public C3408(InterfaceC3414 interfaceC3414, MapField$StorageMode mapField$StorageMode, Map map) {
        this.f11064 = interfaceC3414;
        this.f11068 = true;
        this.f11066 = mapField$StorageMode;
        this.f11067 = new C3407(this, map);
        this.f11065 = null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3408) {
            return MapFieldLite.equals(m7512(), ((C3408) obj).m7512());
        }
        return false;
    }

    public final int hashCode() {
        return MapFieldLite.calculateHashCodeForMap(m7512());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final ArrayList m7506(C3407 c3407) {
        ArrayList arrayList = new ArrayList(c3407.f11062.size());
        Iterator it = ((C3411) c3407.entrySet()).iterator();
        while (true) {
            Iterator it2 = (Iterator) ((C3412) it).f11075;
            if (!it2.hasNext()) {
                return arrayList;
            }
            Map.Entry entry = (Map.Entry) it2.next();
            Object key = entry.getKey();
            arrayList.add(((C3410) this.f11064).f11071.newBuilderForType().setKey(key).setValue(entry.getValue()).buildPartial());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C3407 m7507(ArrayList arrayList) {
        LinkedHashMap linkedHashMap = new LinkedHashMap((int) Math.ceil(((double) arrayList.size()) / 0.75d));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC3453 interfaceC3453 = (InterfaceC3453) it.next();
            ((C3410) this.f11064).getClass();
            C3416 c3416 = (C3416) interfaceC3453;
            linkedHashMap.put(c3416.getKey(), c3416.getValue());
        }
        return new C3407(this, linkedHashMap);
    }

    @Override // com.google.protobuf.AbstractC3447
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final List mo7508() {
        MapField$StorageMode mapField$StorageMode = this.f11066;
        MapField$StorageMode mapField$StorageMode2 = MapField$StorageMode.LIST;
        if (mapField$StorageMode != mapField$StorageMode2) {
            if (this.f11066 == MapField$StorageMode.MAP) {
                this.f11065 = m7506(this.f11067);
            }
            this.f11067 = null;
            this.f11066 = mapField$StorageMode2;
        }
        return this.f11065;
    }

    @Override // com.google.protobuf.InterfaceC3370
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7479() {
        if (this.f11068) {
            return;
        }
        C5554.m10882();
    }

    @Override // com.google.protobuf.AbstractC3447
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3416 mo7509() {
        return ((C3410) this.f11064).f11071;
    }

    @Override // com.google.protobuf.AbstractC3447
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List mo7510() {
        MapField$StorageMode mapField$StorageMode = this.f11066;
        MapField$StorageMode mapField$StorageMode2 = MapField$StorageMode.MAP;
        if (mapField$StorageMode == mapField$StorageMode2) {
            synchronized (this) {
                try {
                    if (this.f11066 == mapField$StorageMode2) {
                        this.f11065 = m7506(this.f11067);
                        this.f11066 = MapField$StorageMode.BOTH;
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableList(this.f11065);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C3407 m7511() {
        MapField$StorageMode mapField$StorageMode = this.f11066;
        MapField$StorageMode mapField$StorageMode2 = MapField$StorageMode.MAP;
        if (mapField$StorageMode != mapField$StorageMode2) {
            if (this.f11066 == MapField$StorageMode.LIST) {
                this.f11067 = m7507(this.f11065);
            }
            this.f11065 = null;
            this.f11066 = mapField$StorageMode2;
        }
        return this.f11067;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Map m7512() {
        MapField$StorageMode mapField$StorageMode = this.f11066;
        MapField$StorageMode mapField$StorageMode2 = MapField$StorageMode.LIST;
        if (mapField$StorageMode == mapField$StorageMode2) {
            synchronized (this) {
                try {
                    if (this.f11066 == mapField$StorageMode2) {
                        this.f11067 = m7507(this.f11065);
                        this.f11066 = MapField$StorageMode.BOTH;
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableMap(this.f11067);
    }

    public C3408(C3416 c3416, MapField$StorageMode mapField$StorageMode, Map map) {
        this(new C3410(c3416), mapField$StorageMode, map);
    }
}
