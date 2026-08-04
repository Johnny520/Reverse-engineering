package yyds;

import android.content.Intent;
import com.p000ss.android.ugc.awemes.WardDatabase_Impl;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: yyds.ᛲᲁᛷᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0462 extends AbstractC0353 {

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ WardDatabase_Impl f2312;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0462(WardDatabase_Impl wardDatabase_Impl) {
        super(AbstractC2328.m4341(-1282408087978862L), 4, AbstractC2328.m4341(-1282549821899630L));
        this.f2312 = wardDatabase_Impl;
    }

    @Override // yyds.AbstractC0353
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final void mo1041(InterfaceC0124 interfaceC0124) throws Exception {
        AbstractC2328.m4341(-1282691555820398L);
        AbstractC2328.m4335(interfaceC0124, AbstractC2328.m4341(-1282738800460654L));
        AbstractC2328.m4335(interfaceC0124, AbstractC2328.m4341(-1284151844701038L));
        AbstractC2328.m4335(interfaceC0124, AbstractC2328.m4341(-1284534096790382L));
    }

    @Override // yyds.AbstractC0353
    /* JADX INFO: renamed from: ᛳᛸᛴᛶ */
    public final void mo1042() {
        AbstractC2328.m4341(-1285328665740142L);
    }

    @Override // yyds.AbstractC0353
    /* JADX INFO: renamed from: ᛵᛶᛲᲀ */
    public final void mo1044() {
        AbstractC2328.m4341(-1285186931819374L);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0411  */
    @Override // yyds.AbstractC0353
    /* JADX INFO: renamed from: ᛶᛸᲀᲁ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1572 mo1047(InterfaceC0124 interfaceC0124) throws Exception {
        long j;
        Map map;
        C0658 c0658;
        C2029 c2029;
        AbstractC2328.m4341(-1285375910380398L);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(AbstractC2328.m4341(-1285423155020654L), new C2287(AbstractC2328.m4341(-1285436039922542L), AbstractC2328.m4341(-1285448924824430L), true, 1, null, 1));
        linkedHashMap.put(AbstractC2328.m4341(-1285470399660910L), new C2287(AbstractC2328.m4341(-1285509054366574L), AbstractC2328.m4341(-1285547709072238L), true, 0, null, 1));
        linkedHashMap.put(AbstractC2328.m4341(-1285569183908718L), new C2287(AbstractC2328.m4341(-1285599248679790L), AbstractC2328.m4341(-1285629313450862L), true, 0, null, 1));
        linkedHashMap.put(AbstractC2328.m4341(-1285650788287342L), new C2287(AbstractC2328.m4341(-1285685148025710L), AbstractC2328.m4341(-1285719507764078L), true, 0, null, 1));
        linkedHashMap.put(AbstractC2328.m4341(-1285740982600558L), new C2287(AbstractC2328.m4341(-1285758162469742L), AbstractC2328.m4341(-1285775342338926L), true, 0, null, 1));
        linkedHashMap.put(AbstractC2328.m4341(-1285796817175406L), new C2287(AbstractC2328.m4341(-1285818292011886L), AbstractC2328.m4341(-1285839766848366L), true, 0, null, 1));
        linkedHashMap.put(AbstractC2328.m4341(-1285861241684846L), new C2287(AbstractC2328.m4341(-1285908486325102L), AbstractC2328.m4341(-1285955730965358L), true, 0, null, 1));
        linkedHashMap.put(AbstractC2328.m4341(-1285990090703726L), new C2287(AbstractC2328.m4341(-1286028745409390L), AbstractC2328.m4341(-1286067400115054L), true, 0, null, 1));
        linkedHashMap.put(AbstractC2328.m4341(-1286101759853422L), new C2287(AbstractC2328.m4341(-1286149004493678L), AbstractC2328.m4341(-1286196249133934L), false, 0, null, 1));
        linkedHashMap.put(AbstractC2328.m4341(-1286217723970414L), new C2287(AbstractC2328.m4341(-1286273558545262L), AbstractC2328.m4341(-1286329393120110L), false, 0, null, 1));
        linkedHashMap.put(AbstractC2328.m4341(-1286350867956590L), new C2287(AbstractC2328.m4341(-1286393817629550L), AbstractC2328.m4341(-1286436767302510L), false, 0, null, 1));
        linkedHashMap.put(AbstractC2328.m4341(-1286458242138990L), new C2287(AbstractC2328.m4341(-1286479716975470L), AbstractC2328.m4341(-1286501191811950L), false, 0, null, 1));
        C2029 c20292 = new C2029(AbstractC2328.m4341(-1286522666648430L), linkedHashMap, new LinkedHashSet(), new LinkedHashSet());
        String strM4341 = AbstractC2328.m4341(-1286569911288686L);
        InterfaceC1212 interfaceC1212Mo575 = interfaceC0124.mo575("PRAGMA table_info(`" + strM4341 + "`)");
        try {
            if (interfaceC1212Mo575.mo433()) {
                int iM1197 = AbstractC0427.m1197(interfaceC1212Mo575, "name");
                int iM11972 = AbstractC0427.m1197(interfaceC1212Mo575, "type");
                int iM11973 = AbstractC0427.m1197(interfaceC1212Mo575, "notnull");
                int iM11974 = AbstractC0427.m1197(interfaceC1212Mo575, "pk");
                int iM11975 = AbstractC0427.m1197(interfaceC1212Mo575, "dflt_value");
                j = 0;
                C0728 c0728 = new C0728();
                while (true) {
                    String strMo430 = interfaceC1212Mo575.mo430(iM1197);
                    int i = iM11972;
                    c0728.put(strMo430, new C2287(strMo430, interfaceC1212Mo575.mo430(iM11972), interfaceC1212Mo575.getLong(iM11973) != 0, (int) interfaceC1212Mo575.getLong(iM11974), interfaceC1212Mo575.isNull(iM11975) ? null : interfaceC1212Mo575.mo430(iM11975), 2));
                    if (!interfaceC1212Mo575.mo433()) {
                        break;
                    }
                    iM11972 = i;
                }
                c0728.m1672();
                c0728.f3401 = true;
                map = c0728.f3403 > 0 ? c0728 : C0728.f3395;
                AbstractC0797.m1819(interfaceC1212Mo575, null);
            } else {
                map = C0704.f3312;
                AbstractC0797.m1819(interfaceC1212Mo575, null);
                j = 0;
            }
            interfaceC1212Mo575 = interfaceC0124.mo575("PRAGMA foreign_key_list(`" + strM4341 + "`)");
            try {
                int iM11976 = AbstractC0427.m1197(interfaceC1212Mo575, Name.MARK);
                int iM11977 = AbstractC0427.m1197(interfaceC1212Mo575, "seq");
                int iM11978 = AbstractC0427.m1197(interfaceC1212Mo575, "table");
                int iM11979 = AbstractC0427.m1197(interfaceC1212Mo575, "on_delete");
                int iM119710 = AbstractC0427.m1197(interfaceC1212Mo575, "on_update");
                List listM3233 = AbstractC1579.m3233(interfaceC1212Mo575);
                interfaceC1212Mo575.reset();
                C0658 c06582 = new C0658();
                while (interfaceC1212Mo575.mo433()) {
                    if (interfaceC1212Mo575.getLong(iM11977) == j) {
                        int i2 = (int) interfaceC1212Mo575.getLong(iM11976);
                        ArrayList arrayList = new ArrayList();
                        int i3 = iM11976;
                        ArrayList arrayList2 = new ArrayList();
                        int i4 = iM11977;
                        ArrayList<C2712> arrayList3 = new ArrayList();
                        for (Object obj : listM3233) {
                            List list = listM3233;
                            C2029 c20293 = c20292;
                            if (((C2712) obj).f13331 == i2) {
                                arrayList3.add(obj);
                            }
                            listM3233 = list;
                            c20292 = c20293;
                        }
                        C2029 c20294 = c20292;
                        List list2 = listM3233;
                        for (C2712 c2712 : arrayList3) {
                            arrayList.add(c2712.f13330);
                            arrayList2.add(c2712.f13332);
                        }
                        c06582.add(new C0735(interfaceC1212Mo575.mo430(iM11978), interfaceC1212Mo575.mo430(iM11979), interfaceC1212Mo575.mo430(iM119710), arrayList, arrayList2));
                        iM11976 = i3;
                        iM11977 = i4;
                        listM3233 = list2;
                        c20292 = c20294;
                    }
                }
                C2029 c20295 = c20292;
                C0658 c0658M3695 = AbstractC1917.m3695(c06582);
                AbstractC0797.m1819(interfaceC1212Mo575, null);
                interfaceC1212Mo575 = interfaceC0124.mo575("PRAGMA index_list(`" + strM4341 + "`)");
                try {
                    int iM119711 = AbstractC0427.m1197(interfaceC1212Mo575, "name");
                    int iM119712 = AbstractC0427.m1197(interfaceC1212Mo575, "origin");
                    int iM119713 = AbstractC0427.m1197(interfaceC1212Mo575, "unique");
                    if (iM119711 != -1 && iM119712 != -1 && iM119713 != -1) {
                        C0658 c06583 = new C0658();
                        while (interfaceC1212Mo575.mo433()) {
                            if ("c".equals(interfaceC1212Mo575.mo430(iM119712))) {
                                C0900 c0900M3238 = AbstractC1579.m3238(interfaceC0124, interfaceC1212Mo575.mo430(iM119711), interfaceC1212Mo575.getLong(iM119713) == 1);
                                if (c0900M3238 == null) {
                                    AbstractC0797.m1819(interfaceC1212Mo575, null);
                                } else {
                                    c06583.add(c0900M3238);
                                }
                            }
                        }
                        C0658 c0658M36952 = AbstractC1917.m3695(c06583);
                        AbstractC0797.m1819(interfaceC1212Mo575, null);
                        c0658 = c0658M36952;
                        c2029 = new C2029(strM4341, map, c0658M3695, c0658);
                        if (!c20295.equals(c2029)) {
                            return new C1572(null, true);
                        }
                        return new C1572(AbstractC2328.m4341(-1286617155928942L) + c20295 + AbstractC2328.m4341(-1286874853966702L) + c2029, false);
                    }
                    AbstractC0797.m1819(interfaceC1212Mo575, null);
                    c0658 = null;
                    c2029 = new C2029(strM4341, map, c0658M3695, c0658);
                    if (!c20295.equals(c2029)) {
                    }
                } finally {
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                }
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    @Override // yyds.AbstractC0353
    /* JADX INFO: renamed from: ᛶᲈᛴᲈ */
    public final void mo1048(InterfaceC0124 interfaceC0124) throws Exception {
        AbstractC2328.m4341(-1285281421099886L);
        C2578 c2578M3296 = AbstractC0024.m3296();
        InterfaceC1212 interfaceC1212Mo575 = interfaceC0124.mo575("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (interfaceC1212Mo575.mo433()) {
            try {
                c2578M3296.add(interfaceC1212Mo575.mo430(0));
            } finally {
            }
        }
        AbstractC0797.m1819(interfaceC1212Mo575, null);
        ListIterator listIterator = AbstractC0024.m3305(c2578M3296).listIterator(0);
        while (true) {
            C0368 c0368 = (C0368) listIterator;
            if (!c0368.hasNext()) {
                return;
            }
            String str = (String) c0368.next();
            if (str.startsWith("room_fts_content_sync_")) {
                AbstractC2328.m4335(interfaceC0124, "DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }

    @Override // yyds.AbstractC0353
    /* JADX INFO: renamed from: ᲀᛲᛲᲇ */
    public final void mo1052(InterfaceC0124 interfaceC0124) throws Exception {
        AbstractC2328.m4341(-1285234176459630L);
        WardDatabase_Impl wardDatabase_Impl = this.f2312;
        int i = WardDatabase_Impl.f505;
        C0522 c0522 = wardDatabase_Impl.f503;
        if (c0522 == null) {
            c0522 = null;
        }
        C0682 c0682 = c0522.f2516;
        c0682.getClass();
        InterfaceC1212 interfaceC1212Mo575 = interfaceC0124.mo575("PRAGMA query_only");
        try {
            interfaceC1212Mo575.mo433();
            boolean zMo2234 = interfaceC1212Mo575.mo2234();
            AbstractC0797.m1819(interfaceC1212Mo575, null);
            if (!zMo2234) {
                AbstractC2328.m4335(interfaceC0124, "PRAGMA temp_store = MEMORY");
                AbstractC2328.m4335(interfaceC0124, "PRAGMA recursive_triggers = 1");
                AbstractC2328.m4335(interfaceC0124, "DROP TABLE IF EXISTS room_table_modification_log");
                if (c0682.f3254) {
                    AbstractC2328.m4335(interfaceC0124, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    AbstractC2328.m4335(interfaceC0124, AbstractC0692.m1598("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
                }
                C1303 c1303 = c0682.f3244;
                ReentrantLock reentrantLock = c1303.f5962;
                reentrantLock.lock();
                try {
                    c1303.f5966 = true;
                } finally {
                    reentrantLock.unlock();
                }
            }
            synchronized (c0522.f2515) {
                try {
                    C1735 c1735 = c0522.f2510;
                    if (c1735 != null) {
                        Intent intent = c0522.f2509;
                        if (intent == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        c1735.m3461(intent);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
        }
    }

    @Override // yyds.AbstractC0353
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final void mo1053(InterfaceC0124 interfaceC0124) throws Exception {
        AbstractC2328.m4341(-1284993658291054L);
        AbstractC2328.m4335(interfaceC0124, AbstractC2328.m4341(-1285040902931310L));
    }
}
