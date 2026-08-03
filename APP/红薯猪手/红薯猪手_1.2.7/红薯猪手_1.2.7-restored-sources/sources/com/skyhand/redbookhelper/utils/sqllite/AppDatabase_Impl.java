package com.skyhand.redbookhelper.utils.sqllite;

import android.content.Context;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p001.AbstractC0401t5;
import p001.C0152b3;
import p001.C0158b9;
import p001.C0166c3;
import p001.C0180d3;
import p001.C0206f1;
import p001.C0279k4;
import p001.C0314mb;
import p001.C0485zb;
import p001.InterfaceC0160bb;
import p001.InterfaceC0472yb;
import p001.InterfaceC0473z;

/* JADX INFO: loaded from: classes.dex */
public final class AppDatabase_Impl extends AppDatabase {

    /* JADX INFO: renamed from: ۥ۠۠, reason: contains not printable characters */
    public volatile C0485zb f1297;

    /* JADX INFO: renamed from: com.skyhand.redbookhelper.utils.sqllite.AppDatabase_Impl$a */
    public class C0017a extends C0158b9.a {
        public C0017a() {
        }

        @Override // p001.C0158b9.a
        /* JADX INFO: renamed from: ۥ */
        public final void mo10(C0152b3 c0152b3) {
            c0152b3.mo996("CREATE TABLE IF NOT EXISTS `huser` (`uid` TEXT NOT NULL, `red_id` TEXT NOT NULL, `nickname` TEXT NOT NULL, `images` TEXT NOT NULL, `desc` TEXT NOT NULL, `location` TEXT NOT NULL, `ipLocation` TEXT NOT NULL, `ext` TEXT NOT NULL, `add_time` INTEGER NOT NULL, PRIMARY KEY(`uid`))");
            c0152b3.mo996("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            c0152b3.mo996("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'd0a1726b107f82f904fadd82284c95d7')");
        }

        @Override // p001.C0158b9.a
        /* JADX INFO: renamed from: ۥ۟ */
        public final C0158b9.b mo11(C0152b3 c0152b3) {
            HashMap map = new HashMap(9);
            map.put("uid", new C0314mb.a("uid", "TEXT", true, 1, null, 1));
            map.put("red_id", new C0314mb.a("red_id", "TEXT", true, 0, null, 1));
            map.put("nickname", new C0314mb.a("nickname", "TEXT", true, 0, null, 1));
            map.put("images", new C0314mb.a("images", "TEXT", true, 0, null, 1));
            map.put("desc", new C0314mb.a("desc", "TEXT", true, 0, null, 1));
            map.put("location", new C0314mb.a("location", "TEXT", true, 0, null, 1));
            map.put("ipLocation", new C0314mb.a("ipLocation", "TEXT", true, 0, null, 1));
            map.put("ext", new C0314mb.a("ext", "TEXT", true, 0, null, 1));
            map.put("add_time", new C0314mb.a("add_time", "INTEGER", true, 0, null, 1));
            C0314mb c0314mb = new C0314mb("huser", map, new HashSet(0), new HashSet(0));
            C0314mb c0314mbM897 = C0314mb.m897(c0152b3, "huser");
            if (c0314mb.equals(c0314mbM897)) {
                return new C0158b9.b(null, true);
            }
            return new C0158b9.b("huser(com.skyhand.redbookhelper.utils.sqllite.HUser).\n\u000a Expected:\n\u000a" + c0314mb + "\n\u000a Found:\n\u000a" + c0314mbM897, false);
        }
    }

    @Override // p001.AbstractC0144a9
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final C0279k4 mo986() {
        return new C0279k4(this, new HashMap(0), new HashMap(0), "huser");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p001.AbstractC0144a9
    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final InterfaceC0160bb mo987(C0206f1 c0206f1) {
        C0158b9 c0158b9 = new C0158b9(c0206f1, new C0017a(), "d0a1726b107f82f904fadd82284c95d7", "751c01bcb7f9651df8ed3a0d44097b73");
        Context context = c0206f1.f777;
        String str = c0206f1.f1436;
        if (context == null) {
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        ((C0180d3) c0206f1.f776).getClass();
        return new C0166c3(context, str, c0158b9, false);
    }

    @Override // p001.AbstractC0144a9
    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public final List mo988() {
        return Arrays.asList(new AbstractC0401t5[0]);
    }

    @Override // p001.AbstractC0144a9
    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public final Set<Class<? extends InterfaceC0473z>> mo989() {
        return new HashSet();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p001.AbstractC0144a9
    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public final Map<Class<?>, List<Class<?>>> mo990() {
        HashMap map = new HashMap();
        map.put(InterfaceC0472yb.class, Collections.emptyList());
        return map;
    }

    @Override // com.skyhand.redbookhelper.utils.sqllite.AppDatabase
    /* JADX INFO: renamed from: ۥ۟ۧ */
    public final InterfaceC0472yb mo985() {
        C0485zb c0485zb;
        if (this.f1297 != null) {
            return this.f1297;
        }
        synchronized (this) {
            if (this.f1297 == null) {
                this.f1297 = new C0485zb(this);
            }
            c0485zb = this.f1297;
        }
        return c0485zb;
    }
}
