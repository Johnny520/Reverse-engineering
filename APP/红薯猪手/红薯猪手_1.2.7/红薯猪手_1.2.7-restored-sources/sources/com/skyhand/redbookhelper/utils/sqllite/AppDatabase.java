package com.skyhand.redbookhelper.utils.sqllite;

import android.app.ActivityManager;
import android.content.Context;
import java.util.ArrayDeque;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p001.AbstractC0144a9;
import p001.AbstractC0401t5;
import p001.C0152b3;
import p001.C0167c4;
import p001.C0180d3;
import p001.C0186d9;
import p001.C0206f1;
import p001.C0237h4;
import p001.C0382s;
import p001.C0447x;
import p001.InterfaceC0472yb;
import p001.InterfaceC0473z;

/* JADX INFO: loaded from: classes.dex */
public abstract class AppDatabase extends AbstractC0144a9 {

    /* JADX INFO: renamed from: ۥ۟ۨ, reason: contains not printable characters */
    public static volatile AppDatabase f1295;

    /* JADX INFO: renamed from: ۥ۟ۧ, reason: contains not printable characters */
    public static final C0016c f1294 = new C0016c();

    /* JADX INFO: renamed from: ۥ۠ */
    public static final C0014a f26 = new C0014a();

    /* JADX INFO: renamed from: ۥ۠۟, reason: contains not printable characters */
    public static final C0015b f1296 = new C0015b();

    /* JADX INFO: renamed from: com.skyhand.redbookhelper.utils.sqllite.AppDatabase$a */
    public static final class C0014a extends AbstractC0401t5 {
        public C0014a() {
            super(1, 2);
        }

        @Override // p001.AbstractC0401t5
        /* JADX INFO: renamed from: ۥ */
        public final void mo8(C0152b3 c0152b3) {
            C0237h4.m1090("database", c0152b3);
            c0152b3.mo996("ALTER TABLE huser ADD COLUMN ipLocation TEXT NOT NULL DEFAULT ''");
        }
    }

    /* JADX INFO: renamed from: com.skyhand.redbookhelper.utils.sqllite.AppDatabase$b */
    public static final class C0015b extends AbstractC0401t5 {
        public C0015b() {
            super(2, 3);
        }

        @Override // p001.AbstractC0401t5
        /* JADX INFO: renamed from: ۥ */
        public final void mo8(C0152b3 c0152b3) {
            C0237h4.m1090("database", c0152b3);
        }
    }

    /* JADX INFO: renamed from: com.skyhand.redbookhelper.utils.sqllite.AppDatabase$c */
    public static final class C0016c {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: ۥ */
        public static AppDatabase m9(Context context) {
            String strM915 = "red_helper";
            if (strM915.trim().length() == 0) {
                throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
            }
            AbstractC0144a9.b bVar = new AbstractC0144a9.b();
            AbstractC0401t5[] abstractC0401t5Arr = {AppDatabase.f26, AppDatabase.f1296};
            HashSet hashSet = new HashSet();
            for (int i = 0; i < 2; i++) {
                AbstractC0401t5 abstractC0401t5 = abstractC0401t5Arr[i];
                hashSet.add(Integer.valueOf(abstractC0401t5.f1107));
                hashSet.add(Integer.valueOf(abstractC0401t5.f1108));
            }
            bVar.m810(abstractC0401t5Arr);
            C0382s.a aVar = C0382s.f1767;
            C0180d3 c0180d3 = new C0180d3();
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            C0206f1 c0206f1 = new C0206f1(context, strM915, c0180d3, bVar, (activityManager == null || activityManager.isLowRamDevice()) ? 2 : 3, aVar, aVar);
            String name = AppDatabase.class.getPackage().getName();
            String canonicalName = AppDatabase.class.getCanonicalName();
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String str = canonicalName.replace('.', '_') + "_Impl";
            try {
                AbstractC0144a9 abstractC0144a9 = (AbstractC0144a9) Class.forName(name.isEmpty() ? str : name + "." + str, true, AppDatabase.class.getClassLoader()).newInstance();
                abstractC0144a9.f1305 = abstractC0144a9.mo987(c0206f1);
                Set<Class<? extends InterfaceC0473z>> setMo989 = abstractC0144a9.mo989();
                BitSet bitSet = new BitSet();
                Iterator<Class<? extends InterfaceC0473z>> it = setMo989.iterator();
                while (true) {
                    int i2 = -1;
                    if (!it.hasNext()) {
                        for (int size = c0206f1.f1439.size() - 1; size >= 0; size--) {
                            if (!bitSet.get(size)) {
                                throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                            }
                        }
                        for (AbstractC0401t5 abstractC0401t52 : abstractC0144a9.mo988()) {
                            if (!Collections.unmodifiableMap(c0206f1.f1437.f683).containsKey(Integer.valueOf(abstractC0401t52.f1107))) {
                                c0206f1.f1437.m810(abstractC0401t52);
                            }
                        }
                        C0186d9 c0186d9 = (C0186d9) AbstractC0144a9.m993(C0186d9.class, abstractC0144a9.f1305);
                        if (c0186d9 != null) {
                            c0186d9.f757 = c0206f1;
                        }
                        if (((C0447x) AbstractC0144a9.m993(C0447x.class, abstractC0144a9.f1305)) != null) {
                            abstractC0144a9.f1306.getClass();
                            throw null;
                        }
                        abstractC0144a9.f1305.setWriteAheadLoggingEnabled(c0206f1.f1440 == 3);
                        abstractC0144a9.f1308 = null;
                        abstractC0144a9.f682 = c0206f1.f1441;
                        new ArrayDeque();
                        abstractC0144a9.f1307 = false;
                        Map<Class<?>, List<Class<?>>> mapMo990 = abstractC0144a9.mo990();
                        BitSet bitSet2 = new BitSet();
                        for (Map.Entry<Class<?>, List<Class<?>>> entry : mapMo990.entrySet()) {
                            Class<?> key = entry.getKey();
                            for (Class<?> cls : entry.getValue()) {
                                int size2 = c0206f1.f1438.size() - 1;
                                while (true) {
                                    if (size2 < 0) {
                                        size2 = -1;
                                        break;
                                    }
                                    if (cls.isAssignableFrom(c0206f1.f1438.get(size2).getClass())) {
                                        bitSet2.set(size2);
                                        break;
                                    }
                                    size2--;
                                }
                                if (size2 < 0) {
                                    throw new IllegalArgumentException("A required type converter (" + cls + ") for " + key.getCanonicalName() + " is missing in the database configuration.");
                                }
                                abstractC0144a9.f1312.put(cls, c0206f1.f1438.get(size2));
                            }
                        }
                        for (int size3 = c0206f1.f1438.size() - 1; size3 >= 0; size3--) {
                            if (!bitSet2.get(size3)) {
                                throw new IllegalArgumentException("Unexpected type converter " + c0206f1.f1438.get(size3) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                            }
                        }
                        "build(...)";
                        return (AppDatabase) abstractC0144a9;
                    }
                    Class<? extends InterfaceC0473z> next = it.next();
                    int size4 = c0206f1.f1439.size() - 1;
                    while (true) {
                        if (size4 < 0) {
                            break;
                        }
                        if (next.isAssignableFrom(c0206f1.f1439.get(size4).getClass())) {
                            bitSet.set(size4);
                            i2 = size4;
                            break;
                        }
                        size4--;
                    }
                    if (i2 < 0) {
                        StringBuilder sbM1039 = C0167c4.m1039("A required auto migration spec (");
                        sbM1039.append(next.getCanonicalName());
                        sbM1039.append(") is missing in the database configuration.");
                        throw new IllegalArgumentException(sbM1039.toString());
                    }
                    abstractC0144a9.f1309.put(next, c0206f1.f1439.get(i2));
                }
            } catch (ClassNotFoundException unused) {
                StringBuilder sbM10392 = C0167c4.m1039("cannot find implementation for ");
                sbM10392.append(AppDatabase.class.getCanonicalName());
                sbM10392.append(". ");
                sbM10392.append(str);
                sbM10392.append(" does not exist");
                throw new RuntimeException(sbM10392.toString());
            } catch (IllegalAccessException unused2) {
                StringBuilder sbM10393 = C0167c4.m1039("Cannot access the constructor");
                sbM10393.append(AppDatabase.class.getCanonicalName());
                throw new RuntimeException(sbM10393.toString());
            } catch (InstantiationException unused3) {
                StringBuilder sbM10394 = C0167c4.m1039("Failed to create an instance of ");
                sbM10394.append(AppDatabase.class.getCanonicalName());
                throw new RuntimeException(sbM10394.toString());
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟ۧ, reason: contains not printable characters */
    public abstract InterfaceC0472yb mo985();
}
