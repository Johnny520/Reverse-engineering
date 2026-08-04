package yyds;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: yyds.ᛷᛴᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1546 extends AbstractC2720 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f7851;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Object f7852;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Object f7853;

    public C1546(C1484 c1484, Class cls) {
        this.f7851 = 2;
        this.f7853 = c1484;
        this.f7852 = cls;
    }

    @Override // yyds.AbstractC2720
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final Object mo484(C1942 c1942) throws IOException {
        int i = this.f7851;
        Collection collection = null;
        LocalDateTime localDateTime = null;
        Object obj = this.f7853;
        Object obj2 = this.f7852;
        switch (i) {
            case 0:
                if (c1942.m3744() == 9) {
                    c1942.m3767();
                } else {
                    collection = (Collection) ((InterfaceC2050) obj).mo807();
                    c1942.m3746();
                    while (c1942.m3753()) {
                        collection.add(((C1627) obj2).f8309.mo484(c1942));
                    }
                    c1942.m3750();
                }
                return collection;
            case 1:
                c1942.m3769();
                ZoneOffset zoneOffset = null;
                while (c1942.m3744() != 4) {
                    String strM3741 = c1942.m3741();
                    if (strM3741.equals("offset")) {
                        zoneOffset = (ZoneOffset) ((AbstractC2720) obj).mo484(c1942);
                    } else if (strM3741.equals("dateTime")) {
                        localDateTime = (LocalDateTime) ((C0727) obj2).mo484(c1942);
                    } else {
                        c1942.m3754();
                    }
                }
                c1942.m3768();
                C1787.m3573(localDateTime, "dateTime", c1942);
                C1787.m3573(zoneOffset, "offset", c1942);
                return OffsetDateTime.of(localDateTime, zoneOffset);
            default:
                Class cls = (Class) obj2;
                Object objMo484 = ((C1484) obj).f7022.mo484(c1942);
                if (objMo484 == null || cls.isInstance(objMo484)) {
                    return objMo484;
                }
                throw new C1600("Expected a " + cls.getName() + " but was " + objMo484.getClass().getName() + "; at path " + c1942.m3749(true));
        }
    }

    @Override // yyds.AbstractC2720
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final void mo485(C1405 c1405, Object obj) {
        int i = this.f7851;
        Object obj2 = this.f7852;
        Object obj3 = this.f7853;
        switch (i) {
            case 0:
                Collection collection = (Collection) obj;
                if (collection != null) {
                    c1405.m2866();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        ((C1627) obj2).mo485(c1405, it.next());
                    }
                    c1405.m2855();
                } else {
                    c1405.m2857();
                }
                break;
            case 1:
                OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
                c1405.m2858();
                c1405.m2856("dateTime");
                ((C0727) obj2).mo485(c1405, offsetDateTime.toLocalDateTime());
                c1405.m2856("offset");
                ((AbstractC2720) obj3).mo485(c1405, offsetDateTime.getOffset());
                c1405.m2865();
                break;
            default:
                ((C1484) obj3).f7022.mo485(c1405, obj);
                break;
        }
    }

    public /* synthetic */ C1546(AbstractC2720 abstractC2720, Object obj, int i) {
        this.f7851 = i;
        this.f7852 = abstractC2720;
        this.f7853 = obj;
    }
}
