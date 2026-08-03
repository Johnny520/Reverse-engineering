package p001;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: ۟.zb */
/* JADX INFO: loaded from: classes.dex */
public final class C0485zb implements InterfaceC0472yb {

    /* JADX INFO: renamed from: ۥ */
    public final AbstractC0144a9 f1240;

    /* JADX INFO: renamed from: ۥ۟ */
    public final a f1241;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final b f1923;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final c f1924;

    /* JADX INFO: renamed from: ۟.zb$a */
    public class a extends AbstractC0221g2 {
        public a(AbstractC0144a9 abstractC0144a9) {
            super(abstractC0144a9);
        }

        @Override // p001.AbstractC0159ba
        /* JADX INFO: renamed from: ۥ۟ */
        public final String mo826() {
            return "INSERT OR REPLACE INTO `huser` (`uid`,`red_id`,`nickname`,`images`,`desc`,`location`,`ipLocation`,`ext`,`add_time`) VALUES (?,?,?,?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
        public final void m1289(InterfaceC0202eb interfaceC0202eb, Object obj) {
            C0264j3 c0264j3 = (C0264j3) obj;
            String str = c0264j3.f871;
            if (str == null) {
                interfaceC0202eb.mo1043(1);
            } else {
                interfaceC0202eb.mo1042(1, str);
            }
            String str2 = c0264j3.f1522;
            if (str2 == null) {
                interfaceC0202eb.mo1043(2);
            } else {
                interfaceC0202eb.mo1042(2, str2);
            }
            String str3 = c0264j3.f1523;
            if (str3 == null) {
                interfaceC0202eb.mo1043(3);
            } else {
                interfaceC0202eb.mo1042(3, str3);
            }
            String str4 = c0264j3.f1524;
            if (str4 == null) {
                interfaceC0202eb.mo1043(4);
            } else {
                interfaceC0202eb.mo1042(4, str4);
            }
            String str5 = c0264j3.f1525;
            if (str5 == null) {
                interfaceC0202eb.mo1043(5);
            } else {
                interfaceC0202eb.mo1042(5, str5);
            }
            String str6 = c0264j3.f1526;
            if (str6 == null) {
                interfaceC0202eb.mo1043(6);
            } else {
                interfaceC0202eb.mo1042(6, str6);
            }
            String str7 = c0264j3.f1527;
            if (str7 == null) {
                interfaceC0202eb.mo1043(7);
            } else {
                interfaceC0202eb.mo1042(7, str7);
            }
            String str8 = c0264j3.f1528;
            if (str8 == null) {
                interfaceC0202eb.mo1043(8);
            } else {
                interfaceC0202eb.mo1042(8, str8);
            }
            interfaceC0202eb.mo838(9, c0264j3.f1529);
        }
    }

    /* JADX INFO: renamed from: ۟.zb$b */
    public class b extends AbstractC0221g2 {
        public b(AbstractC0144a9 abstractC0144a9) {
            super(abstractC0144a9);
        }

        @Override // p001.AbstractC0159ba
        /* JADX INFO: renamed from: ۥ۟ */
        public final String mo826() {
            return "DELETE FROM `huser` WHERE `uid` = ?";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
        public final void m1290(InterfaceC0202eb interfaceC0202eb, Object obj) {
            String str = ((C0264j3) obj).f871;
            if (str == null) {
                interfaceC0202eb.mo1043(1);
            } else {
                interfaceC0202eb.mo1042(1, str);
            }
        }
    }

    /* JADX INFO: renamed from: ۟.zb$c */
    public class c extends AbstractC0159ba {
        public c(AbstractC0144a9 abstractC0144a9) {
            super(abstractC0144a9);
        }

        @Override // p001.AbstractC0159ba
        /* JADX INFO: renamed from: ۥ۟ */
        public final String mo826() {
            "DELETE FROM huser WHERE add_time < ?";
            return "DELETE FROM huser WHERE add_time < ?";
        }
    }

    public C0485zb(AbstractC0144a9 abstractC0144a9) {
        this.f1240 = abstractC0144a9;
        this.f1241 = new a(abstractC0144a9);
        this.f1923 = new b(abstractC0144a9);
        this.f1924 = new c(abstractC0144a9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p001.InterfaceC0472yb
    public final ArrayList getAll() {
        C0172c9 c0172c9;
        "SELECT * FROM huser ORDER BY add_time DESC";
        String strM915 = "SELECT * FROM huser ORDER BY add_time DESC";
        TreeMap<Integer, C0172c9> treeMap = C0172c9.f1410;
        synchronized (treeMap) {
            Map.Entry<Integer, C0172c9> entryCeilingEntry = treeMap.ceilingEntry(0);
            if (entryCeilingEntry != null) {
                treeMap.remove(entryCeilingEntry.getKey());
                c0172c9 = entryCeilingEntry.getValue();
                c0172c9.f741 = strM915;
                c0172c9.f1416 = 0;
            } else {
                c0172c9 = new C0172c9();
                c0172c9.f741 = strM915;
                c0172c9.f1416 = 0;
            }
        }
        this.f1240.m809();
        Cursor cursorM995 = this.f1240.m995(c0172c9);
        try {
            int iM801 = C0136a1.m801(cursorM995, "uid");
            int iM8012 = C0136a1.m801(cursorM995, "red_id");
            int iM8013 = C0136a1.m801(cursorM995, "nickname");
            int iM8014 = C0136a1.m801(cursorM995, "images");
            int iM8015 = C0136a1.m801(cursorM995, "desc");
            int iM8016 = C0136a1.m801(cursorM995, "location");
            int iM8017 = C0136a1.m801(cursorM995, "ipLocation");
            int iM8018 = C0136a1.m801(cursorM995, "ext");
            int iM8019 = C0136a1.m801(cursorM995, "add_time");
            ArrayList arrayList = new ArrayList(cursorM995.getCount());
            while (cursorM995.moveToNext()) {
                arrayList.add(new C0264j3(cursorM995.isNull(iM801) ? null : cursorM995.getString(iM801), cursorM995.isNull(iM8012) ? null : cursorM995.getString(iM8012), cursorM995.isNull(iM8013) ? null : cursorM995.getString(iM8013), cursorM995.isNull(iM8014) ? null : cursorM995.getString(iM8014), cursorM995.isNull(iM8015) ? null : cursorM995.getString(iM8015), cursorM995.isNull(iM8016) ? null : cursorM995.getString(iM8016), cursorM995.isNull(iM8017) ? null : cursorM995.getString(iM8017), cursorM995.isNull(iM8018) ? null : cursorM995.getString(iM8018), cursorM995.getLong(iM8019)));
            }
            return arrayList;
        } finally {
            cursorM995.close();
            c0172c9.m1045();
        }
    }

    @Override // p001.InterfaceC0472yb
    /* JADX INFO: renamed from: ۥ */
    public final void mo971(int i) {
        try {
            m1288(System.currentTimeMillis() - (((long) i) * 86400000));
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p001.InterfaceC0472yb
    /* JADX INFO: renamed from: ۥ۟ */
    public final long mo972(C0264j3 c0264j3) {
        this.f1240.m809();
        AbstractC0144a9 abstractC0144a9 = this.f1240;
        abstractC0144a9.m808();
        abstractC0144a9.m808();
        InterfaceC0146ab interfaceC0146abMo1024 = abstractC0144a9.f1305.mo1024();
        abstractC0144a9.f1306.m1114(interfaceC0146abMo1024);
        if (interfaceC0146abMo1024.mo1000()) {
            interfaceC0146abMo1024.mo1002();
        } else {
            interfaceC0146abMo1024.mo812();
        }
        try {
            a aVar = this.f1241;
            InterfaceC0202eb interfaceC0202ebM825 = aVar.m825();
            try {
                aVar.m1289(interfaceC0202ebM825, c0264j3);
                long jMo1056 = interfaceC0202ebM825.mo1056();
                aVar.m1023(interfaceC0202ebM825);
                this.f1240.f1305.mo1024().mo1001();
                return jMo1056;
            } catch (Throwable th) {
                aVar.m1023(interfaceC0202ebM825);
                throw th;
            }
        } finally {
            this.f1240.m994();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p001.InterfaceC0472yb
    /* JADX INFO: renamed from: ۥ۟۟ */
    public final int mo1282(C0264j3 c0264j3) {
        this.f1240.m809();
        AbstractC0144a9 abstractC0144a9 = this.f1240;
        abstractC0144a9.m808();
        abstractC0144a9.m808();
        InterfaceC0146ab interfaceC0146abMo1024 = abstractC0144a9.f1305.mo1024();
        abstractC0144a9.f1306.m1114(interfaceC0146abMo1024);
        if (interfaceC0146abMo1024.mo1000()) {
            interfaceC0146abMo1024.mo1002();
        } else {
            interfaceC0146abMo1024.mo812();
        }
        try {
            b bVar = this.f1923;
            InterfaceC0202eb interfaceC0202ebM825 = bVar.m825();
            try {
                bVar.m1290(interfaceC0202ebM825, c0264j3);
                int iMo1055 = interfaceC0202ebM825.mo1055();
                bVar.m1023(interfaceC0202ebM825);
                int i = iMo1055 + 0;
                this.f1240.f1305.mo1024().mo1001();
                return i;
            } catch (Throwable th) {
                bVar.m1023(interfaceC0202ebM825);
                throw th;
            }
        } finally {
            this.f1240.m994();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final void m1288(long j) {
        this.f1240.m809();
        InterfaceC0202eb interfaceC0202ebM825 = this.f1924.m825();
        interfaceC0202ebM825.mo838(1, j);
        AbstractC0144a9 abstractC0144a9 = this.f1240;
        abstractC0144a9.m808();
        abstractC0144a9.m808();
        InterfaceC0146ab interfaceC0146abMo1024 = abstractC0144a9.f1305.mo1024();
        abstractC0144a9.f1306.m1114(interfaceC0146abMo1024);
        if (interfaceC0146abMo1024.mo1000()) {
            interfaceC0146abMo1024.mo1002();
        } else {
            interfaceC0146abMo1024.mo812();
        }
        try {
            interfaceC0202ebM825.mo1055();
            this.f1240.f1305.mo1024().mo1001();
        } finally {
            this.f1240.m994();
            this.f1924.m1023(interfaceC0202ebM825);
        }
    }
}
