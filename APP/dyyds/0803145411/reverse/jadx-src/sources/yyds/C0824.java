package yyds;

import android.os.Handler;
import android.os.Looper;
import com.tencent.mmkv.MMKV;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.ListIterator;

/* JADX INFO: renamed from: yyds.ᛴᛳᲇᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0824 implements InterfaceC2266 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f3760;

    public /* synthetic */ C0824(int i) {
        this.f3760 = i;
    }

    @Override // yyds.InterfaceC2266
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final Object mo731() {
        Object c2658;
        int i = this.f3760;
        C2746 c2746 = C2746.f13459;
        switch (i) {
            case 0:
                ClassLoader classLoader = AbstractC2003.class.getClassLoader();
                int i2 = AbstractC1371.f6399;
                try {
                    c2658 = classLoader.loadClass("android.os.Build");
                    if (c2658 == null) {
                        c2658 = null;
                    }
                } catch (Throwable th) {
                    c2658 = new C2658(th);
                }
                return Boolean.valueOf(((Class) (c2658 instanceof C2658 ? null : c2658)) != null);
            case 1:
                C1329 c1329 = C1329.f6114;
                return (C0757) AbstractC2104.m4019(-665466100679534L, -665590654731118L);
            case 2:
                C1329 c13292 = C1329.f6114;
                return (C0757) AbstractC2104.m4019(-666329389106030L, -666432468321134L);
            case 3:
                C1329 c13293 = C1329.f6114;
                C2068 c2068 = (C2068) AbstractC2104.m4019(-666462533092206L, -666569907274606L);
                if (c2068 != null) {
                    return c2068.f10221;
                }
                return null;
            case 4:
                C1329 c13294 = C1329.f6114;
                return (C0757) AbstractC2104.m4019(-666617151914862L, -666724526097262L);
            case 5:
                C1329 c13295 = C1329.f6114;
                return (C0757) AbstractC2104.m4019(-666758885835630L, -666883439887214L);
            case 6:
                C1329 c13296 = C1329.f6114;
                return (C0757) AbstractC2104.m4019(-666926389560174L, -667055238579054L);
            case 7:
                C2578 c2578M3296 = AbstractC0024.m3296();
                C1329 c13297 = C1329.f6114;
                C0757 c0757 = (C0757) AbstractC2104.m4019(-665620719502190L, -665698028913518L);
                if (c0757 != null) {
                    c2578M3296.add(c0757);
                }
                String strM4341 = AbstractC2328.m4341(-665736683619182L);
                AbstractC2328.m4341(-665874122572654L);
                c2578M3296.addAll(C1586.m3252(strM4341));
                C2578 c2578M3305 = AbstractC0024.m3305(c2578M3296);
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                ListIterator listIterator = c2578M3305.listIterator(0);
                while (true) {
                    C0368 c0368 = (C0368) listIterator;
                    if (!c0368.hasNext()) {
                        return arrayList;
                    }
                    Object next = c0368.next();
                    if (hashSet.add(((C0757) next).toString())) {
                        arrayList.add(next);
                    }
                }
                break;
            case 8:
                C1329 c13298 = C1329.f6114;
                return (C0757) AbstractC2104.m4019(-665912777278318L, -666088870937454L);
            case 9:
                C1329 c13299 = C1329.f6114;
                return (C0757) AbstractC2104.m4019(-666127525643118L, -666290734400366L);
            case 10:
                return C0137.m613();
            case 11:
                return new Handler(Looper.getMainLooper());
            case 12:
                return new Handler(Looper.getMainLooper());
            case 13:
                return Boolean.TRUE;
            case 14:
                String strM43412 = AbstractC2328.m4341(-755724838404974L);
                EnumMap enumMap = MMKV.f530;
                C1760 c1760 = new C1760(5, (byte) 0);
                c1760.f8838 = 2;
                MMKV mmkvM365 = MMKV.m365(strM43412, c1760);
                AbstractC2328.m4341(-755776378012526L);
                return mmkvM365;
            case 15:
                return new Handler(Looper.getMainLooper());
            case 16:
            case 17:
            case 18:
                return c2746;
            default:
                C0526 c0526 = new C0526();
                c0526.f2527 = new C1284(new C2787());
                return c0526;
        }
    }
}
