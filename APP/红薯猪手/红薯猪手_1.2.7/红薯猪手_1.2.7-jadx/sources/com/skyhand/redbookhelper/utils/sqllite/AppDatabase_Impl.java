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
import p001.C0341oa;
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
            c0152b3.mo996(C0341oa.m915(new byte[]{-25, 34, 42, 24, -70, -128, -124, 36, 46, 27, -94, -128, -124, 57, 41, 121, -96, -118, -16, 80, 42, 1, -89, -106, -16, 35, 79, 57, -122, -80, -41, 21, 29, 57, -50, -19, -60, 5, 6, 61, -114, -27, -16, 53, 55, 13, -50, -117, -21, 36, 79, 23, -69, -119, -24, 92, 79, 57, -100, -96, -64, 47, 6, 61, -114, -27, -16, 53, 55, 13, -50, -117, -21, 36, 79, 23, -69, -119, -24, 92, 79, 57, -128, -84, -57, 27, 1, 56, -125, -96, -60, 80, 59, 28, -74, -111, -124, 62, 32, 13, -50, -117, -15, 60, 35, 117, -50, -91, -51, 29, 14, 62, -117, -74, -60, 80, 59, 28, -74, -111, -124, 62, 32, 13, -50, -117, -15, 60, 35, 117, -50, -91, -64, 21, 28, 58, -114, -27, -16, 53, 55, 13, -50, -117, -21, 36, 79, 23, -69, -119, -24, 92, 79, 57, -126, -86, -57, 17, 27, 48, -127, -85, -60, 80, 59, 28, -74, -111, -124, 62, 32, 13, -50, -117, -15, 60, 35, 117, -50, -91, -51, 0, 35, 54, -115, -92, -48, 25, 0, 55, -114, -27, -16, 53, 55, 13, -50, -117, -21, 36, 79, 23, -69, -119, -24, 92, 79, 57, -117, -67, -48, 16, 79, 13, -85, -99, -16, 80, 33, 22, -70, -27, -22, 37, 35, 21, -62, -27, -60, 17, 11, 61, -79, -79, -51, 29, 10, 57, -50, -116, -22, 36, 42, 30, -85, -105, -124, 62, 32, 13, -50, -117, -15, 60, 35, 117, -50, -107, -10, 57, 34, 24, -68, -100, -124, 59, 42, 0, -58, -91, -47, 25, 11, 57, -57, -20}, new byte[]{-92, 112, 111, 89, -18, -59}));
            c0152b3.mo996(C0341oa.m915(new byte[]{19, -38, 5, -68, -120, -43, 112, -36, 1, -65, -112, -43, 112, -63, 6, -35, -110, -33, 4, -88, 5, -91, -107, -61, 4, -37, 96, -113, -77, -1, 61, -41, 45, -100, -81, -28, 53, -6, 31, -119, -67, -14, 60, -19, 96, -43, -75, -12, 112, -63, 14, -87, -103, -41, 21, -38, 96, -83, -114, -39, 29, -55, 18, -92, -4, -37, 21, -47, 108, -108, -72, -11, 62, -4, 41, -119, -91, -49, 56, -23, 51, -107, -4, -60, 21, -48, 20, -44}, new byte[]{80, -120, 64, -3, -36, -112}));
            c0152b3.mo996(C0341oa.m915(new byte[]{-94, -37, -106, -56, 56, 83, -53, -38, -105, -83, 56, 66, -69, -39, -124, -50, 47, 39, -94, -37, -111, -62, 74, 117, -124, -6, -88, -46, 7, 102, -104, -31, -96, -1, 53, 115, -118, -9, -87, -24, 74, 47, -126, -15, -23, -28, 14, 98, -123, -31, -84, -7, 19, 88, -125, -12, -74, -27, 67, 39, -67, -44, -119, -40, 47, 84, -61, -95, -9, -95, 74, 32, -113, -91, -92, -68, 93, 53, -35, -9, -12, -67, 93, 97, -45, -89, -93, -76, 90, 51, -115, -12, -95, -23, 82, 53, -39, -83, -15, -18, 83, 50, -113, -94, -30, -92}, new byte[]{-21, -107, -59, -115, 106, 7}));
        }

        @Override // p001.C0158b9.a
        /* JADX INFO: renamed from: ۥ۟ */
        public final C0158b9.b mo11(C0152b3 c0152b3) {
            HashMap map = new HashMap(9);
            map.put(C0341oa.m915(new byte[]{-23, -108, 122}, new byte[]{-100, -3, 30, -58, -29, -28}), new C0314mb.a(C0341oa.m915(new byte[]{47, 66, 75}, new byte[]{90, 43, 47, 30, -16, -93}), C0341oa.m915(new byte[]{-41, -57, -125, -33}, new byte[]{-125, -126, -37, -117, 115, 91}), true, 1, null, 1));
            map.put(C0341oa.m915(new byte[]{-59, -21, 4, -99, -52, 6}, new byte[]{-73, -114, 96, -62, -91, 98}), new C0314mb.a(C0341oa.m915(new byte[]{48, -84, -76, -50, 64, -25}, new byte[]{66, -55, -48, -111, 41, -125}), C0341oa.m915(new byte[]{123, 113, 23, 94}, new byte[]{47, 52, 79, 10, 53, -12}), true, 0, null, 1));
            map.put(C0341oa.m915(new byte[]{66, 52, 90, 51, -47, 70, 65, 56}, new byte[]{44, 93, 57, 88, -65, 39}), new C0314mb.a(C0341oa.m915(new byte[]{-20, -1, 116, 45, -106, -27, -17, -13}, new byte[]{-126, -106, 23, 70, -8, -124}), C0341oa.m915(new byte[]{-106, -113, 17, -34}, new byte[]{-62, -54, 73, -118, 125, 85}), true, 0, null, 1));
            map.put(C0341oa.m915(new byte[]{57, 8, 91, -19, 49, 24}, new byte[]{80, 101, 58, -118, 84, 107}), new C0314mb.a(C0341oa.m915(new byte[]{-30, -104, 62, -90, -122, -71}, new byte[]{-117, -11, 95, -63, -29, -54}), C0341oa.m915(new byte[]{90, 49, 22, 60}, new byte[]{14, 116, 78, 104, 3, 35}), true, 0, null, 1));
            map.put(C0341oa.m915(new byte[]{-73, -62, 79, -24}, new byte[]{-45, -89, 60, -117, 86, -86}), new C0314mb.a(C0341oa.m915(new byte[]{-54, 36, 56, -59}, new byte[]{-82, 65, 75, -90, 85, 8}), C0341oa.m915(new byte[]{-92, -53, 70, -82}, new byte[]{-16, -114, 30, -6, 82, 87}), true, 0, null, 1));
            map.put(C0341oa.m915(new byte[]{125, 63, -80, -123, -116, 2, 126, 62}, new byte[]{17, 80, -45, -28, -8, 107}), new C0314mb.a(C0341oa.m915(new byte[]{31, -27, 68, 5, -22, -29, 28, -28}, new byte[]{115, -118, 39, 100, -98, -118}), C0341oa.m915(new byte[]{23, 97, -16, -96}, new byte[]{67, 36, -88, -12, 121, -62}), true, 0, null, 1));
            map.put(C0341oa.m915(new byte[]{68, 38, -90, -43, -57, -100, 89, 63, -123, -44}, new byte[]{45, 86, -22, -70, -92, -3}), new C0314mb.a(C0341oa.m915(new byte[]{-7, 36, 111, 108, -29, 91, -28, 61, 76, 109}, new byte[]{-112, 84, 35, 3, -128, 58}), C0341oa.m915(new byte[]{-34, -79, -49, -2}, new byte[]{-118, -12, -105, -86, -61, 52}), true, 0, null, 1));
            map.put(C0341oa.m915(new byte[]{49, -45, -1}, new byte[]{84, -85, -117, 101, -56, -10}), new C0314mb.a(C0341oa.m915(new byte[]{89, -36, 76}, new byte[]{60, -92, 56, 110, 0, 33}), C0341oa.m915(new byte[]{-79, -30, 12, 91}, new byte[]{-27, -89, 84, 15, -91, 81}), true, 0, null, 1));
            map.put(C0341oa.m915(new byte[]{-19, -70, -95, 109, -29, 4, -31, -69}, new byte[]{-116, -34, -59, 50, -105, 109}), new C0314mb.a(C0341oa.m915(new byte[]{52, -45, 6, -95, -14, -109, 56, -46}, new byte[]{85, -73, 98, -2, -122, -6}), C0341oa.m915(new byte[]{6, -127, -79, -32, -76, -65, 29}, new byte[]{79, -49, -27, -91, -13, -6}), true, 0, null, 1));
            C0314mb c0314mb = new C0314mb(C0341oa.m915(new byte[]{18, -64, -7, -53, 61}, new byte[]{122, -75, -118, -82, 79, 11}), map, new HashSet(0), new HashSet(0));
            C0314mb c0314mbM897 = C0314mb.m897(c0152b3, C0341oa.m915(new byte[]{95, 86, -111, -15, 50}, new byte[]{55, 35, -30, -108, 64, -78}));
            if (c0314mb.equals(c0314mbM897)) {
                return new C0158b9.b(null, true);
            }
            return new C0158b9.b(C0341oa.m915(new byte[]{-6, 116, -110, 30, 45, 16, -15, 110, -116, 85, 44, 83, -21, 105, -128, 21, 59, 22, -32, 100, -123, 25, 48, 87, -7, 105, -124, 23, 47, 93, -32, 47, -108, 15, 54, 84, -31, 47, -110, 10, 51, 84, -5, 117, -124, 85, 23, 109, -31, 100, -109, 82, 113, 50, -78, 68, -103, 11, 58, 91, -26, 100, -123, 65, 85}, new byte[]{-110, 1, -31, 123, 95, 56}) + c0314mb + C0341oa.m915(new byte[]{-20, 101, -31, -94, 114, 65, -126, 127, -83}, new byte[]{-26, 69, -89, -51, 7, 47}) + c0314mbM897, false);
        }
    }

    @Override // p001.AbstractC0144a9
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final C0279k4 mo986() {
        return new C0279k4(this, new HashMap(0), new HashMap(0), C0341oa.m915(new byte[]{-107, 43, -75, 98, 97}, new byte[]{-3, 94, -58, 7, 19, -34}));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p001.AbstractC0144a9
    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final InterfaceC0160bb mo987(C0206f1 c0206f1) {
        C0158b9 c0158b9 = new C0158b9(c0206f1, new C0017a(), C0341oa.m915(new byte[]{-15, 70, -112, 34, -58, -106, -93, 20, -64, 35, -58, -62, -83, 68, -105, 42, -63, -112, -13, 23, -107, 119, -55, -106, -89, 78, -59, 112, -56, -111, -15, 65}, new byte[]{-107, 118, -15, 19, -15, -92}), C0341oa.m915(new byte[]{-83, -50, 90, -124, 65, 21, -8, -104, 9, -48, 23, 29, -84, -50, 90, -125, 23, 28, -1, -97, 88, -122, 65, 64, -82, -49, 91, -34, 70, 70, -83, -56}, new byte[]{-102, -5, 107, -25, 113, 36}));
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
