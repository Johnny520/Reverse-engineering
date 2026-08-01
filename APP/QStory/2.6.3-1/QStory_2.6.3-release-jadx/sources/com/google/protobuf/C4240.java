package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lin.xposed.hook.javaplugin.C6385;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世楪兰哲苏子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4240 extends AbstractC4279 implements InterfaceC4202 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC4246 f11409;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public ArrayList f11410;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public volatile MapField$StorageMode f11411;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C4239 f11412;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public volatile boolean f11413;

    public C4240(InterfaceC4246 interfaceC4246, MapField$StorageMode mapField$StorageMode, Map map) {
        this.f11409 = interfaceC4246;
        this.f11413 = true;
        this.f11411 = mapField$StorageMode;
        this.f11412 = new C4239(this, map);
        this.f11410 = null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4240) {
            return MapFieldLite.equals(m8071(), ((C4240) obj).m8071());
        }
        return false;
    }

    public final int hashCode() {
        return MapFieldLite.calculateHashCodeForMap(m8071());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final ArrayList m8065(C4239 c4239) {
        ArrayList arrayList = new ArrayList(c4239.f11407.size());
        Iterator it = ((C4243) c4239.entrySet()).iterator();
        while (true) {
            Iterator it2 = (Iterator) ((C4244) it).f11420;
            if (!it2.hasNext()) {
                return arrayList;
            }
            Map.Entry entry = (Map.Entry) it2.next();
            Object key = entry.getKey();
            arrayList.add(((C4242) this.f11409).f11416.newBuilderForType().setKey(key).setValue(entry.getValue()).buildPartial());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C4239 m8066(ArrayList arrayList) {
        LinkedHashMap linkedHashMap = new LinkedHashMap((int) Math.ceil(((double) arrayList.size()) / 0.75d));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC4285 interfaceC4285 = (InterfaceC4285) it.next();
            ((C4242) this.f11409).getClass();
            C4248 c4248 = (C4248) interfaceC4285;
            linkedHashMap.put(c4248.getKey(), c4248.getValue());
        }
        return new C4239(this, linkedHashMap);
    }

    @Override // com.google.protobuf.AbstractC4279
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final List mo8067() {
        MapField$StorageMode mapField$StorageMode = this.f11411;
        MapField$StorageMode mapField$StorageMode2 = MapField$StorageMode.LIST;
        if (mapField$StorageMode != mapField$StorageMode2) {
            if (this.f11411 == MapField$StorageMode.MAP) {
                this.f11410 = m8065(this.f11412);
            }
            this.f11412 = null;
            this.f11411 = mapField$StorageMode2;
        }
        return this.f11410;
    }

    @Override // com.google.protobuf.InterfaceC4202
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo8038() {
        if (this.f11413) {
            return;
        }
        C6385.m11441();
    }

    @Override // com.google.protobuf.AbstractC4279
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4248 mo8068() {
        return ((C4242) this.f11409).f11416;
    }

    @Override // com.google.protobuf.AbstractC4279
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List mo8069() {
        MapField$StorageMode mapField$StorageMode = this.f11411;
        MapField$StorageMode mapField$StorageMode2 = MapField$StorageMode.MAP;
        if (mapField$StorageMode == mapField$StorageMode2) {
            synchronized (this) {
                try {
                    if (this.f11411 == mapField$StorageMode2) {
                        this.f11410 = m8065(this.f11412);
                        this.f11411 = MapField$StorageMode.BOTH;
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableList(this.f11410);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C4239 m8070() {
        MapField$StorageMode mapField$StorageMode = this.f11411;
        MapField$StorageMode mapField$StorageMode2 = MapField$StorageMode.MAP;
        if (mapField$StorageMode != mapField$StorageMode2) {
            if (this.f11411 == MapField$StorageMode.LIST) {
                this.f11412 = m8066(this.f11410);
            }
            this.f11410 = null;
            this.f11411 = mapField$StorageMode2;
        }
        return this.f11412;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Map m8071() {
        MapField$StorageMode mapField$StorageMode = this.f11411;
        MapField$StorageMode mapField$StorageMode2 = MapField$StorageMode.LIST;
        if (mapField$StorageMode == mapField$StorageMode2) {
            synchronized (this) {
                try {
                    if (this.f11411 == mapField$StorageMode2) {
                        this.f11412 = m8066(this.f11410);
                        this.f11411 = MapField$StorageMode.BOTH;
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableMap(this.f11412);
    }

    public C4240(C4248 c4248, MapField$StorageMode mapField$StorageMode, Map map) {
        this(new C4242(c4248), mapField$StorageMode, map);
    }
}
