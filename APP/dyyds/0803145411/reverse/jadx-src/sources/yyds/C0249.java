package yyds;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: yyds.ᛱᲈᛱᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0249 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f1386;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static String m898(AbstractC2019 abstractC2019) {
        abstractC2019.getClass();
        return ((abstractC2019 instanceof C2114) || (abstractC2019 instanceof C1704)) ? abstractC2019.mo3452().f10452 : abstractC2019 instanceof C1935 ? ((C1935) abstractC2019).f9737.toString() : "";
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static boolean m899(C0917 c0917, AbstractC2019 abstractC2019) {
        abstractC2019.getClass();
        if (!(abstractC2019 instanceof C0491)) {
            return false;
        }
        Pattern pattern = c0917.f4209;
        Iterator it = ((C0491) abstractC2019).f2414.iterator();
        while (it.hasNext()) {
            if (pattern.matcher(m898((AbstractC2019) it.next())).matches()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0340  */
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m900(AbstractC2019 abstractC2019, AbstractC2019 abstractC20192, C0864 c0864) {
        C0491 c0491Mo1344;
        C0491 c0491Mo13442;
        C0491 c0491Mo13443;
        C0491 c0491Mo13444;
        C0491 c0491Mo13445;
        boolean zM900;
        C0491 c0491Mo13446;
        C0491 c0491Mo13447;
        int i = this.f1386;
        EnumC1452 enumC1452 = EnumC1452.EQ;
        switch (i) {
            case 0:
                C0491 c0491Mo13448 = abstractC20192.mo1344();
                abstractC2019.getClass();
                if (abstractC2019 instanceof C1314) {
                    AbstractC2019 abstractC2019M2606 = ((C1314) abstractC2019).m2606();
                    abstractC2019M2606.getClass();
                    if (!(abstractC2019M2606 instanceof C0491)) {
                        return true;
                    }
                    C0491 c0491 = (C0491) abstractC2019M2606;
                    Iterator it = c0491Mo13448.f2414.iterator();
                    while (it.hasNext()) {
                        if (!c0491.f2414.contains((AbstractC2019) it.next())) {
                        }
                    }
                    return true;
                }
                return false;
            case 1:
                abstractC20192.getClass();
                if (abstractC20192 instanceof C1314) {
                    AbstractC2019 abstractC2019M26062 = ((C1314) abstractC20192).m2606();
                    abstractC2019M26062.getClass();
                    if (!(abstractC2019M26062 instanceof C1974)) {
                        c0491Mo1344 = abstractC2019M26062.mo1344();
                    }
                    return false;
                }
                c0491Mo1344 = abstractC20192.mo1344();
                abstractC2019.getClass();
                if (abstractC2019 instanceof C1314) {
                    AbstractC2019 abstractC2019M26063 = ((C1314) abstractC2019).m2606();
                    abstractC2019M26063.getClass();
                    if (!(abstractC2019M26063 instanceof C1974)) {
                        c0491Mo13442 = abstractC2019M26063.mo1344();
                    }
                    return false;
                }
                c0491Mo13442 = abstractC2019.mo1344();
                for (AbstractC2019 abstractC20193 : c0491Mo13442.f2414) {
                    Iterator it2 = c0491Mo1344.f2414.iterator();
                    while (it2.hasNext()) {
                        if (abstractC20193.equals((AbstractC2019) it2.next())) {
                            return true;
                        }
                    }
                }
                return false;
            case 2:
                abstractC2019.getClass();
                if (abstractC2019 instanceof C2114) {
                    abstractC20192.getClass();
                    if (abstractC20192 instanceof C2114) {
                        return ((C2114) abstractC2019).f10452.contains(((C2114) abstractC20192).f10452);
                    }
                }
                if (!(abstractC2019 instanceof C1314)) {
                    return false;
                }
                AbstractC2019 abstractC2019M26064 = ((C1314) abstractC2019).m2606();
                abstractC2019M26064.getClass();
                if (abstractC2019M26064 instanceof C1974) {
                    return false;
                }
                return abstractC2019M26064.mo1344().f2414.contains(abstractC20192);
            case 3:
                abstractC2019.getClass();
                if (abstractC2019 instanceof C2114) {
                    if (((C2114) abstractC2019).f10452.isEmpty() == abstractC20192.mo3728().f9737.booleanValue()) {
                        return true;
                    }
                } else if (abstractC2019 instanceof C1314) {
                    C1314 c1314 = (C1314) abstractC2019;
                    if (((c1314.m2607() instanceof List) || (c1314.m2607() instanceof Map) ? ((Collection) c1314.m2607()).size() == 0 : !((c1314.m2607() instanceof String) && ((String) c1314.m2607()).length() != 0)) == abstractC20192.mo3728().f9737.booleanValue()) {
                        return true;
                    }
                }
                return false;
            case 4:
                abstractC2019.getClass();
                if (abstractC2019 instanceof C1314) {
                    abstractC20192.getClass();
                    if (abstractC20192 instanceof C1314) {
                        C1314 c13142 = (C1314) abstractC2019;
                        C1314 c13143 = (C1314) abstractC20192;
                        if (c13142 == c13143) {
                            return true;
                        }
                        Object obj = c13142.f6023;
                        if (obj != null) {
                            if (obj.equals(c13143.m2607())) {
                                return true;
                            }
                        } else if (c13143.f6023 == null) {
                            return true;
                        }
                        return false;
                    }
                }
                return abstractC2019.equals(abstractC20192);
            case 5:
                abstractC2019.getClass();
                if (!(abstractC2019 instanceof C1935)) {
                    abstractC20192.getClass();
                    if (!(abstractC20192 instanceof C1935)) {
                        throw new C1738("Failed to evaluate exists expression");
                    }
                }
                return abstractC2019.mo3728().f9737.booleanValue() == abstractC20192.mo3728().f9737.booleanValue();
            case 6:
                abstractC2019.getClass();
                if (abstractC2019 instanceof C1704) {
                    abstractC20192.getClass();
                    if (abstractC20192 instanceof C1704) {
                        if (((C1704) abstractC2019).f8641.compareTo(((C1704) abstractC20192).f8641) >= 0) {
                            return true;
                        }
                    } else if (abstractC2019 instanceof C2114) {
                        abstractC20192.getClass();
                        if (abstractC20192 instanceof C2114) {
                            if (((C2114) abstractC2019).f10452.compareTo(((C2114) abstractC20192).f10452) >= 0) {
                                return true;
                            }
                        } else if (abstractC2019 instanceof C2602) {
                            abstractC20192.getClass();
                            if ((abstractC20192 instanceof C2602) && ((C2602) abstractC2019).f12803.compareTo(((C2602) abstractC20192).f12803) >= 0) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            case 7:
                abstractC2019.getClass();
                if (abstractC2019 instanceof C1704) {
                    abstractC20192.getClass();
                    if (abstractC20192 instanceof C1704) {
                        if (((C1704) abstractC2019).f8641.compareTo(((C1704) abstractC20192).f8641) > 0) {
                            return true;
                        }
                    } else if (abstractC2019 instanceof C2114) {
                        abstractC20192.getClass();
                        if (abstractC20192 instanceof C2114) {
                            if (((C2114) abstractC2019).f10452.compareTo(((C2114) abstractC20192).f10452) > 0) {
                                return true;
                            }
                        } else if (abstractC2019 instanceof C2602) {
                            abstractC20192.getClass();
                            if ((abstractC20192 instanceof C2602) && ((C2602) abstractC2019).f12803.compareTo(((C2602) abstractC20192).f12803) > 0) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            case 8:
                abstractC20192.getClass();
                if (abstractC20192 instanceof C1314) {
                    AbstractC2019 abstractC2019M26065 = ((C1314) abstractC20192).m2606();
                    abstractC2019M26065.getClass();
                    if (abstractC2019M26065 instanceof C1974) {
                        return false;
                    }
                    c0491Mo13443 = abstractC2019M26065.mo1344();
                } else {
                    c0491Mo13443 = abstractC20192.mo1344();
                }
                return c0491Mo13443.f2414.contains(abstractC2019);
            case 9:
                abstractC2019.getClass();
                if (abstractC2019 instanceof C1704) {
                    abstractC20192.getClass();
                    if (abstractC20192 instanceof C1704) {
                        if (((C1704) abstractC2019).f8641.compareTo(((C1704) abstractC20192).f8641) <= 0) {
                            return true;
                        }
                    } else if (abstractC2019 instanceof C2114) {
                        abstractC20192.getClass();
                        if (abstractC20192 instanceof C2114) {
                            if (((C2114) abstractC2019).f10452.compareTo(((C2114) abstractC20192).f10452) <= 0) {
                                return true;
                            }
                        } else if (abstractC2019 instanceof C2602) {
                            abstractC20192.getClass();
                            if ((abstractC20192 instanceof C2602) && ((C2602) abstractC2019).f12803.compareTo(((C2602) abstractC20192).f12803) <= 0) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            case 10:
                abstractC2019.getClass();
                if (abstractC2019 instanceof C1704) {
                    abstractC20192.getClass();
                    if (abstractC20192 instanceof C1704) {
                        if (((C1704) abstractC2019).f8641.compareTo(((C1704) abstractC20192).f8641) < 0) {
                            return true;
                        }
                    } else if (abstractC2019 instanceof C2114) {
                        abstractC20192.getClass();
                        if (abstractC20192 instanceof C2114) {
                            if (((C2114) abstractC2019).f10452.compareTo(((C2114) abstractC20192).f10452) < 0) {
                                return true;
                            }
                        } else if (abstractC2019 instanceof C2602) {
                            abstractC20192.getClass();
                            if ((abstractC20192 instanceof C2602) && ((C2602) abstractC2019).f12803.compareTo(((C2602) abstractC20192).f12803) < 0) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            case 11:
                abstractC20192.getClass();
                if (abstractC20192 instanceof C1314) {
                    AbstractC2019 abstractC2019M26066 = ((C1314) abstractC20192).m2606();
                    abstractC2019M26066.getClass();
                    if (!(abstractC2019M26066 instanceof C1974)) {
                        c0491Mo13444 = abstractC2019M26066.mo1344();
                    }
                    return false;
                }
                c0491Mo13444 = abstractC20192.mo1344();
                abstractC2019.getClass();
                if (abstractC2019 instanceof C1314) {
                    AbstractC2019 abstractC2019M26067 = ((C1314) abstractC2019).m2606();
                    abstractC2019M26067.getClass();
                    if (!(abstractC2019M26067 instanceof C1974)) {
                        c0491Mo13445 = abstractC2019M26067.mo1344();
                    }
                    return false;
                }
                c0491Mo13445 = abstractC2019.mo1344();
                for (AbstractC2019 abstractC20194 : c0491Mo13445.f2414) {
                    Iterator it3 = c0491Mo13444.f2414.iterator();
                    while (it3.hasNext()) {
                        if (abstractC20194.equals((AbstractC2019) it3.next())) {
                            return false;
                        }
                    }
                }
                return true;
            case 12:
                zM900 = ((C0249) AbstractC1933.f9733.get(enumC1452)).m900(abstractC2019, abstractC20192, c0864);
                break;
            case 13:
                zM900 = ((C0249) AbstractC1933.f9733.get(EnumC1452.IN)).m900(abstractC2019, abstractC20192, c0864);
                break;
            case 14:
                abstractC20192.getClass();
                throw new C2569("Expected predicate node");
            case 15:
                abstractC2019.getClass();
                boolean z = abstractC2019 instanceof C0917;
                abstractC20192.getClass();
                if (!((abstractC20192 instanceof C0917) ^ z)) {
                    return false;
                }
                if (z) {
                    if ((abstractC20192 instanceof C0491) || ((abstractC20192 instanceof C1314) && (((C1314) abstractC20192).m2607() instanceof List))) {
                        return m899((C0917) abstractC2019, abstractC20192.mo2608().m2606());
                    }
                    return ((C0917) abstractC2019).f4209.matcher(m898(abstractC20192)).matches();
                }
                if ((abstractC2019 instanceof C0491) || ((abstractC2019 instanceof C1314) && (((C1314) abstractC2019).m2607() instanceof List))) {
                    return m899(abstractC20192.mo2034(), abstractC2019.mo2608().m2606());
                }
                return abstractC20192.mo2034().f4209.matcher(m898(abstractC2019)).matches();
            case 16:
                abstractC20192.getClass();
                if (abstractC20192 instanceof C1704) {
                    int iIntValue = ((C1704) abstractC20192).f8641.intValue();
                    abstractC2019.getClass();
                    if (abstractC2019 instanceof C2114) {
                        if (((C2114) abstractC2019).f10452.length() == iIntValue) {
                            return true;
                        }
                    } else if (abstractC2019 instanceof C1314) {
                        C1314 c13144 = (C1314) abstractC2019;
                        if ((c13144.m2607() instanceof List ? ((List) c13144.m2607()).size() : -1) == iIntValue) {
                            return true;
                        }
                    }
                }
                return false;
            case 17:
                abstractC20192.getClass();
                if (abstractC20192 instanceof C1314) {
                    AbstractC2019 abstractC2019M26068 = ((C1314) abstractC20192).m2606();
                    abstractC2019M26068.getClass();
                    if (!(abstractC2019M26068 instanceof C1974)) {
                        c0491Mo13446 = abstractC2019M26068.mo1344();
                    }
                    return false;
                }
                c0491Mo13446 = abstractC20192.mo1344();
                abstractC2019.getClass();
                if (abstractC2019 instanceof C1314) {
                    AbstractC2019 abstractC2019M26069 = ((C1314) abstractC2019).m2606();
                    abstractC2019M26069.getClass();
                    if (!(abstractC2019M26069 instanceof C1974)) {
                        c0491Mo13447 = abstractC2019M26069.mo1344();
                    }
                    return false;
                }
                c0491Mo13447 = abstractC2019.mo1344();
                Iterator it4 = c0491Mo13447.f2414.iterator();
                while (it4.hasNext()) {
                    if (!c0491Mo13446.f2414.contains((AbstractC2019) it4.next())) {
                        return false;
                    }
                }
                return true;
            case 18:
                return abstractC20192.mo2194().f4602 == abstractC2019.mo1345(c0864);
            case 19:
                if (abstractC2019.getClass().equals(abstractC20192.getClass())) {
                    return ((C0249) AbstractC1933.f9733.get(enumC1452)).m900(abstractC2019, abstractC20192, c0864);
                }
                return false;
            default:
                zM900 = ((C0249) AbstractC1933.f9733.get(EnumC1452.TSEQ)).m900(abstractC2019, abstractC20192, c0864);
                break;
        }
        return !zM900;
    }
}
