package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lin.xposed.hook.javaplugin.C5553;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世楪兰哲苏子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3407 extends AbstractC3446 implements InterfaceC3369 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC3413 f11059;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public ArrayList f11060;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public volatile MapField$StorageMode f11061;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C3406 f11062;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public volatile boolean f11063;

    public C3407(InterfaceC3413 interfaceC3413, MapField$StorageMode mapField$StorageMode, Map map) {
        this.f11059 = interfaceC3413;
        this.f11063 = true;
        this.f11061 = mapField$StorageMode;
        this.f11062 = new C3406(this, map);
        this.f11060 = null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3407) {
            return MapFieldLite.equals(m7525(), ((C3407) obj).m7525());
        }
        return false;
    }

    public final int hashCode() {
        return MapFieldLite.calculateHashCodeForMap(m7525());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final ArrayList m7519(C3406 c3406) {
        ArrayList arrayList = new ArrayList(c3406.f11057.size());
        Iterator it = ((C3410) c3406.entrySet()).iterator();
        while (true) {
            Iterator it2 = (Iterator) ((C3411) it).f11070;
            if (!it2.hasNext()) {
                return arrayList;
            }
            Map.Entry entry = (Map.Entry) it2.next();
            Object key = entry.getKey();
            arrayList.add(((C3409) this.f11059).f11066.newBuilderForType().setKey(key).setValue(entry.getValue()).buildPartial());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C3406 m7520(ArrayList arrayList) {
        LinkedHashMap linkedHashMap = new LinkedHashMap((int) Math.ceil(((double) arrayList.size()) / 0.75d));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC3452 interfaceC3452 = (InterfaceC3452) it.next();
            ((C3409) this.f11059).getClass();
            C3415 c3415 = (C3415) interfaceC3452;
            linkedHashMap.put(c3415.getKey(), c3415.getValue());
        }
        return new C3406(this, linkedHashMap);
    }

    @Override // com.google.protobuf.AbstractC3446
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final List mo7521() {
        MapField$StorageMode mapField$StorageMode = this.f11061;
        MapField$StorageMode mapField$StorageMode2 = MapField$StorageMode.LIST;
        if (mapField$StorageMode != mapField$StorageMode2) {
            if (this.f11061 == MapField$StorageMode.MAP) {
                this.f11060 = m7519(this.f11062);
            }
            this.f11062 = null;
            this.f11061 = mapField$StorageMode2;
        }
        return this.f11060;
    }

    @Override // com.google.protobuf.AbstractC3446
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C3415 mo7522() {
        return ((C3409) this.f11059).f11066;
    }

    @Override // com.google.protobuf.InterfaceC3369
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo7492() {
        if (this.f11063) {
            return;
        }
        C5553.m10825();
    }

    @Override // com.google.protobuf.AbstractC3446
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List mo7523() {
        MapField$StorageMode mapField$StorageMode = this.f11061;
        MapField$StorageMode mapField$StorageMode2 = MapField$StorageMode.MAP;
        if (mapField$StorageMode == mapField$StorageMode2) {
            synchronized (this) {
                try {
                    if (this.f11061 == mapField$StorageMode2) {
                        this.f11060 = m7519(this.f11062);
                        this.f11061 = MapField$StorageMode.BOTH;
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableList(this.f11060);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C3406 m7524() {
        MapField$StorageMode mapField$StorageMode = this.f11061;
        MapField$StorageMode mapField$StorageMode2 = MapField$StorageMode.MAP;
        if (mapField$StorageMode != mapField$StorageMode2) {
            if (this.f11061 == MapField$StorageMode.LIST) {
                this.f11062 = m7520(this.f11060);
            }
            this.f11060 = null;
            this.f11061 = mapField$StorageMode2;
        }
        return this.f11062;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Map m7525() {
        MapField$StorageMode mapField$StorageMode = this.f11061;
        MapField$StorageMode mapField$StorageMode2 = MapField$StorageMode.LIST;
        if (mapField$StorageMode == mapField$StorageMode2) {
            synchronized (this) {
                try {
                    if (this.f11061 == mapField$StorageMode2) {
                        this.f11062 = m7520(this.f11060);
                        this.f11061 = MapField$StorageMode.BOTH;
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableMap(this.f11062);
    }

    public C3407(C3415 c3415, MapField$StorageMode mapField$StorageMode, Map map) {
        this(new C3409(c3415), mapField$StorageMode, map);
    }
}
