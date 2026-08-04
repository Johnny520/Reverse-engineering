package yyds;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: yyds.ᛶᛴᛲᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1314 extends AbstractC2019 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Object f6023;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final boolean f6024 = false;

    public C1314(CharSequence charSequence) {
        this.f6023 = charSequence.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1314)) {
            return false;
        }
        Object obj2 = ((C1314) obj).f6023;
        Object obj3 = this.f6023;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final String toString() {
        return this.f6023.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e0  */
    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC2019 m2606() {
        AbstractC2019 c2602;
        AbstractC2019 abstractC2019;
        char cCharAt;
        if (!(m2607() instanceof List)) {
            return InterfaceC0540.f2597;
        }
        List listUnmodifiableList = Collections.unmodifiableList((List) m2607());
        C0491 c0491 = new C0491();
        c0491.f2414 = new ArrayList();
        for (Object obj : listUnmodifiableList) {
            ArrayList arrayList = c0491.f2414;
            if (obj == null) {
                abstractC2019 = InterfaceC0540.f2594;
            } else if (obj instanceof AbstractC2019) {
                abstractC2019 = (AbstractC2019) obj;
            } else {
                if (obj instanceof Class) {
                    c2602 = new C1012((Class) obj);
                } else {
                    boolean z = obj instanceof String;
                    if (z) {
                        String strTrim = obj.toString().trim();
                        if (strTrim.length() > 0 && ((cCharAt = strTrim.charAt(0)) == '@' || cCharAt == '$')) {
                            try {
                                C0119.m534(strTrim, new InterfaceC0845[0]);
                                c2602 = new C0696(obj.toString(), false);
                            } catch (Exception unused) {
                                if (!z) {
                                }
                                arrayList.add(abstractC2019);
                            }
                        }
                    } else if (!z) {
                        String strTrim2 = obj.toString().trim();
                        if (strTrim2.length() > 1) {
                            char cCharAt2 = strTrim2.charAt(0);
                            char cCharAt3 = strTrim2.charAt(strTrim2.length() - 1);
                            if ((cCharAt2 == '[' && cCharAt3 == ']') || (cCharAt2 == '{' && cCharAt3 == '}')) {
                                try {
                                    C1342 c1342 = new C1342(-8193);
                                    C2072 c2072 = c1342.f6223;
                                    if (c2072 == null) {
                                        c2072 = new C2072(-8193);
                                        c1342.f6223 = c2072;
                                    }
                                    c2072.m3979(strTrim2, (C0721) AbstractC2084.f10336.f3102);
                                    c2602 = new C1314((CharSequence) obj.toString());
                                } catch (Exception unused2) {
                                    if (!z) {
                                    }
                                }
                            }
                        }
                    } else if (!z) {
                        c2602 = new C2114(obj.toString(), true);
                    } else if (obj instanceof Character) {
                        c2602 = new C2114(obj.toString(), false);
                    } else if (obj instanceof Number) {
                        c2602 = new C1704(obj.toString());
                    } else if (obj instanceof Boolean) {
                        abstractC2019 = Boolean.parseBoolean(obj.toString().toString()) ? InterfaceC0540.f2595 : InterfaceC0540.f2596;
                    } else if (obj instanceof Pattern) {
                        c2602 = new C0917((Pattern) obj);
                    } else {
                        if (!(obj instanceof OffsetDateTime)) {
                            throw new C1738("Could not determine value type");
                        }
                        c2602 = new C2602(obj.toString());
                    }
                }
                abstractC2019 = c2602;
            }
            arrayList.add(abstractC2019);
        }
        return c0491;
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final Object m2607() {
        try {
            boolean z = this.f6024;
            Object obj = this.f6023;
            if (z) {
                return obj;
            }
            C1342 c1342 = new C1342(-8193);
            String string = obj.toString();
            C2072 c2072 = c1342.f6223;
            if (c2072 == null) {
                c2072 = new C2072(-8193);
                c1342.f6223 = c2072;
            }
            return c2072.m3979(string, (C0721) AbstractC2084.f10336.f3102);
        } catch (C2240 e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // yyds.AbstractC2019
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ */
    public final Class mo1345(C0864 c0864) {
        return m2607() instanceof List ? List.class : m2607() instanceof Map ? Map.class : m2607() instanceof Number ? Number.class : m2607() instanceof String ? String.class : m2607() instanceof Boolean ? Boolean.class : Void.class;
    }

    @Override // yyds.AbstractC2019
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C1314 mo2608() {
        return this;
    }

    public C1314(Object obj) {
        this.f6023 = obj;
    }
}
