package p001;

import android.database.Cursor;
import android.util.Log;
import com.skyhand.redbookhelper.utils.sqllite.AppDatabase_Impl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import p001.AbstractC0144a9;
import p001.InterfaceC0160bb;

/* JADX INFO: renamed from: ۟.b9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0158b9 extends InterfaceC0160bb.a {

    /* JADX INFO: renamed from: ۥ۟ */
    public C0206f1 f706;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final a f1336;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final String f1337;

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public final String f1338;

    /* JADX INFO: renamed from: ۟.b9$a */
    public static abstract class a {

        /* JADX INFO: renamed from: ۥ */
        public final int f707 = 3;

        /* JADX INFO: renamed from: ۥ */
        public abstract void mo10(C0152b3 c0152b3);

        /* JADX INFO: renamed from: ۥ۟ */
        public abstract b mo11(C0152b3 c0152b3);
    }

    /* JADX INFO: renamed from: ۟.b9$b */
    public static class b {

        /* JADX INFO: renamed from: ۥ */
        public final boolean f708;

        /* JADX INFO: renamed from: ۥ۟ */
        public final String f709;

        public b(String str, boolean z) {
            this.f708 = z;
            this.f709 = str;
        }
    }

    public C0158b9(C0206f1 c0206f1, AppDatabase_Impl.C0017a c0017a, String str, String str2) {
        super(c0017a.f707);
        this.f706 = c0206f1;
        this.f1336 = c0017a;
        this.f1337 = str;
        this.f1338 = str2;
    }

    @Override // p001.InterfaceC0160bb.a
    /* JADX INFO: renamed from: ۥ۟ */
    public final void mo824() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    @Override // p001.InterfaceC0160bb.a
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1018(C0152b3 c0152b3) {
        boolean z;
        Cursor cursorM1010 = c0152b3.m1010("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            if (cursorM1010.moveToFirst()) {
                z = cursorM1010.getInt(0) == 0;
            }
            cursorM1010.close();
            this.f1336.mo10(c0152b3);
            if (!z) {
                b bVarMo11 = this.f1336.mo11(c0152b3);
                if (!bVarMo11.f708) {
                    StringBuilder sbM1039 = C0167c4.m1039("Pre-packaged database has an invalid schema: ");
                    sbM1039.append(bVarMo11.f709);
                    throw new IllegalStateException(sbM1039.toString());
                }
            }
            m1022(c0152b3);
            AppDatabase_Impl.C0017a c0017a = (AppDatabase_Impl.C0017a) this.f1336;
            List<AbstractC0144a9.a> list = AppDatabase_Impl.this.f1308;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    AppDatabase_Impl.this.f1308.get(i).getClass();
                }
            }
        } catch (Throwable th) {
            cursorM1010.close();
            throw th;
        }
    }

    @Override // p001.InterfaceC0160bb.a
    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final void mo1019(C0152b3 c0152b3, int i, int i2) {
        mo1021(c0152b3, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    @Override // p001.InterfaceC0160bb.a
    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1020(C0152b3 c0152b3) {
        boolean z;
        Cursor cursorM1010 = c0152b3.m1010("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            if (cursorM1010.moveToFirst()) {
                z = cursorM1010.getInt(0) != 0;
            }
            cursorM1010.close();
            if (z) {
                Cursor cursorMo997 = c0152b3.mo997(new C0251i4("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
                try {
                    String string = cursorMo997.moveToFirst() ? cursorMo997.getString(0) : null;
                    cursorMo997.close();
                    if (!this.f1337.equals(string) && !this.f1338.equals(string)) {
                        throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                    }
                } catch (Throwable th) {
                    cursorMo997.close();
                    throw th;
                }
            } else {
                b bVarMo11 = this.f1336.mo11(c0152b3);
                if (!bVarMo11.f708) {
                    StringBuilder sbM1039 = C0167c4.m1039("Pre-packaged database has an invalid schema: ");
                    sbM1039.append(bVarMo11.f709);
                    throw new IllegalStateException(sbM1039.toString());
                }
                this.f1336.getClass();
                m1022(c0152b3);
            }
            AppDatabase_Impl.C0017a c0017a = (AppDatabase_Impl.C0017a) this.f1336;
            AppDatabase_Impl.this.f681 = c0152b3;
            C0279k4 c0279k4 = AppDatabase_Impl.this.f1306;
            synchronized (c0279k4) {
                if (c0279k4.f1624) {
                    Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                } else {
                    c0152b3.mo996("PRAGMA temp_store = MEMORY;");
                    c0152b3.mo996("PRAGMA recursive_triggers='ON';");
                    c0152b3.mo996("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                    c0279k4.m1114(c0152b3);
                    c0279k4.f1625 = c0152b3.mo998("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
                    c0279k4.f1624 = true;
                }
            }
            List<AbstractC0144a9.a> list = AppDatabase_Impl.this.f1308;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    AppDatabase_Impl.this.f1308.get(i).getClass();
                }
            }
            this.f706 = null;
        } catch (Throwable th2) {
            cursorM1010.close();
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0077 A[EDGE_INSN: B:80:0x0077->B:37:0x0077 BREAK  A[LOOP:3: B:11:0x001e->B:83:?], SYNTHETIC] */
    @Override // p001.InterfaceC0160bb.a
    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1021(C0152b3 c0152b3, int i, int i2) {
        List listEmptyList;
        TreeMap<Integer, AbstractC0401t5> treeMap;
        boolean z;
        C0206f1 c0206f1 = this.f706;
        boolean z2 = true;
        if (c0206f1 != null) {
            AbstractC0144a9.b bVar = c0206f1.f1437;
            bVar.getClass();
            if (i == i2) {
                listEmptyList = Collections.emptyList();
            } else {
                boolean z3 = i2 > i;
                ArrayList arrayList = new ArrayList();
                int i3 = i;
                do {
                    if (z3) {
                        if (i3 >= i2) {
                            listEmptyList = arrayList;
                            break;
                        }
                        treeMap = bVar.f683.get(Integer.valueOf(i3));
                        if (treeMap == null) {
                            break;
                        }
                        Iterator<Integer> it = (z3 ? treeMap.descendingKeySet() : treeMap.keySet()).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z = false;
                                break;
                            }
                            int iIntValue = it.next().intValue();
                            if (!z3 ? iIntValue < i2 || iIntValue >= i3 : iIntValue > i2 || iIntValue <= i3) {
                                arrayList.add(treeMap.get(Integer.valueOf(iIntValue)));
                                z = true;
                                i3 = iIntValue;
                                break;
                            }
                        }
                    } else {
                        if (i3 <= i2) {
                            listEmptyList = arrayList;
                            break;
                        }
                        treeMap = bVar.f683.get(Integer.valueOf(i3));
                        if (treeMap == null) {
                        }
                    }
                } while (z);
                listEmptyList = null;
            }
            if (listEmptyList != null) {
                ((AppDatabase_Impl.C0017a) this.f1336).getClass();
                ArrayList<String> arrayList2 = new ArrayList();
                Cursor cursorM1010 = c0152b3.m1010("SELECT name FROM sqlite_master WHERE type = 'trigger'");
                while (cursorM1010.moveToNext()) {
                    try {
                        arrayList2.add(cursorM1010.getString(0));
                    } catch (Throwable th) {
                        cursorM1010.close();
                        throw th;
                    }
                }
                cursorM1010.close();
                for (String str : arrayList2) {
                    if (str.startsWith("room_fts_content_sync_")) {
                        c0152b3.mo996("DROP TRIGGER IF EXISTS " + str);
                    }
                }
                Iterator it2 = listEmptyList.iterator();
                while (it2.hasNext()) {
                    ((AbstractC0401t5) it2.next()).mo8(c0152b3);
                }
                b bVarMo11 = this.f1336.mo11(c0152b3);
                if (!bVarMo11.f708) {
                    StringBuilder sbM1039 = C0167c4.m1039("Migration didn't properly handle: ");
                    sbM1039.append(bVarMo11.f709);
                    throw new IllegalStateException(sbM1039.toString());
                }
                this.f1336.getClass();
                m1022(c0152b3);
            } else {
                z2 = false;
            }
        }
        if (z2) {
            return;
        }
        throw new IllegalStateException("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public final void m1022(C0152b3 c0152b3) {
        c0152b3.mo996("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        c0152b3.mo996("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + this.f1337 + "')");
    }
}
