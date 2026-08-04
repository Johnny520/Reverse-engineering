package yyds;

import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Map;

/* JADX INFO: renamed from: yyds.ᛷᲀᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1627 extends AbstractC2720 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f8307;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Object f8308;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final AbstractC2720 f8309;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Object f8310;

    public C1627(C1005 c1005, C1627 c1627, C1627 c16272, InterfaceC2050 interfaceC2050) {
        this.f8307 = 1;
        this.f8308 = c1627;
        this.f8309 = c16272;
        this.f8310 = interfaceC2050;
    }

    @Override // yyds.AbstractC2720
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final Object mo484(C1942 c1942) throws IOException {
        LocalDateTime localDateTime = null;
        Map map = null;
        switch (this.f8307) {
            case 0:
                c1942.m3769();
                ZoneOffset zoneOffset = null;
                ZoneId zoneId = null;
                while (c1942.m3744() != 4) {
                    switch (c1942.m3741()) {
                        case "offset":
                            zoneOffset = (ZoneOffset) this.f8309.mo484(c1942);
                            break;
                        case "zone":
                            zoneId = (ZoneId) ((AbstractC2720) this.f8310).mo484(c1942);
                            break;
                        case "dateTime":
                            localDateTime = (LocalDateTime) ((C0727) this.f8308).mo484(c1942);
                            break;
                        default:
                            c1942.m3754();
                            break;
                    }
                }
                c1942.m3768();
                C1787.m3573(localDateTime, "dateTime", c1942);
                C1787.m3573(zoneOffset, "offset", c1942);
                C1787.m3573(zoneId, "zone", c1942);
                return ZonedDateTime.ofInstant(localDateTime, zoneOffset, zoneId);
            case 1:
                int iM3744 = c1942.m3744();
                if (iM3744 == 9) {
                    c1942.m3767();
                } else {
                    map = (Map) ((InterfaceC2050) this.f8310).mo807();
                    if (iM3744 == 1) {
                        c1942.m3746();
                        while (c1942.m3753()) {
                            c1942.m3746();
                            Object objMo484 = ((C1627) this.f8308).f8309.mo484(c1942);
                            Object objMo4842 = ((C1627) this.f8309).f8309.mo484(c1942);
                            if (map.containsKey(objMo484)) {
                                throw new C1600("duplicate key: " + objMo484);
                            }
                            map.put(objMo484, objMo4842);
                            c1942.m3750();
                        }
                        c1942.m3750();
                    } else {
                        c1942.m3769();
                        while (c1942.m3753()) {
                            C0469.f2327.getClass();
                            int iM3763 = c1942.f9766;
                            if (iM3763 == 0) {
                                iM3763 = c1942.m3763();
                            }
                            if (iM3763 == 13) {
                                c1942.f9766 = 9;
                            } else if (iM3763 == 12) {
                                c1942.f9766 = 8;
                            } else {
                                if (iM3763 != 14) {
                                    throw c1942.m3747("a name");
                                }
                                c1942.f9766 = 10;
                            }
                            Object objMo4843 = ((C1627) this.f8308).f8309.mo484(c1942);
                            Object objMo4844 = ((C1627) this.f8309).f8309.mo484(c1942);
                            if (map.containsKey(objMo4843)) {
                                throw new C1600("duplicate key: " + objMo4843);
                            }
                            map.put(objMo4843, objMo4844);
                        }
                        c1942.m3768();
                    }
                }
                return map;
            default:
                return this.f8309.mo484(c1942);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    @Override // yyds.AbstractC2720
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo485(C1405 c1405, Object obj) {
        AbstractC2720 abstractC2720Mo3217;
        int i = this.f8307;
        Object obj2 = this.f8308;
        Object obj3 = this.f8310;
        AbstractC2720 abstractC2720 = this.f8309;
        switch (i) {
            case 0:
                ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
                if (zonedDateTime == null) {
                    c1405.m2857();
                } else {
                    c1405.m2858();
                    c1405.m2856("dateTime");
                    ((C0727) obj2).mo485(c1405, zonedDateTime.toLocalDateTime());
                    c1405.m2856("offset");
                    abstractC2720.mo485(c1405, zonedDateTime.getOffset());
                    c1405.m2856("zone");
                    ((AbstractC2720) obj3).mo485(c1405, zonedDateTime.getZone());
                    c1405.m2865();
                }
                break;
            case 1:
                Map map = (Map) obj;
                if (map == null) {
                    c1405.m2857();
                } else {
                    c1405.m2858();
                    for (Map.Entry entry : map.entrySet()) {
                        c1405.m2856(String.valueOf(entry.getKey()));
                        ((C1627) abstractC2720).mo485(c1405, entry.getValue());
                    }
                    c1405.m2865();
                }
                break;
            default:
                Type type = (Type) obj3;
                Type type2 = (obj == null || !((type instanceof Class) || (type instanceof TypeVariable))) ? type : obj.getClass();
                if (type2 != type) {
                    AbstractC2720 abstractC2720M521 = ((C0114) obj2).m521(new C2805(type2));
                    if (abstractC2720M521 instanceof AbstractC1229) {
                        AbstractC2720 abstractC27202 = abstractC2720;
                        while ((abstractC27202 instanceof AbstractC1955) && (abstractC2720Mo3217 = ((AbstractC1955) abstractC27202).mo3217()) != abstractC27202) {
                            abstractC27202 = abstractC2720Mo3217;
                        }
                        if (abstractC27202 instanceof AbstractC1229) {
                        }
                    } else {
                        abstractC2720 = abstractC2720M521;
                    }
                }
                abstractC2720.mo485(c1405, obj);
                break;
        }
    }

    public /* synthetic */ C1627(Object obj, AbstractC2720 abstractC2720, Object obj2, int i) {
        this.f8307 = i;
        this.f8308 = obj;
        this.f8309 = abstractC2720;
        this.f8310 = obj2;
    }
}
