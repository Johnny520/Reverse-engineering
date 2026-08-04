package yyds;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: yyds.ᛳᲇᛵᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0721 extends AbstractC1183 {

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ int f3382;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0721(C0644 c0644, int i) {
        super(c0644);
        this.f3382 = i;
    }

    @Override // yyds.AbstractC1183
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public void mo1659(Object obj, String str, Object obj2) {
        switch (this.f3382) {
            case 0:
                ((C2481) obj).put(str, obj2);
                break;
            case 1:
                ((Map) obj).put(str, obj2);
                break;
            default:
                super.mo1659(obj, str, obj2);
                break;
        }
    }

    @Override // yyds.AbstractC1183
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public void mo1660(Object obj, Object obj2) {
        switch (this.f3382) {
            case 0:
                ((C2288) obj).add(obj2);
                break;
            case 1:
                ((C2288) obj).add(obj2);
                break;
            default:
                super.mo1660(obj, obj2);
                break;
        }
    }

    @Override // yyds.AbstractC1183
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public Object mo1661(Object obj) {
        switch (this.f3382) {
            case 2:
                if (obj == null) {
                    return null;
                }
                return new BigDecimal(obj.toString());
            case 3:
                if (obj == null) {
                    return null;
                }
                return new BigInteger(obj.toString());
            case 4:
                if (obj == null) {
                    return null;
                }
                if (Boolean.class.isAssignableFrom(obj.getClass())) {
                    return (Boolean) obj;
                }
                C0188.m793(obj.getClass(), Boolean.class.getName());
                return null;
            case 5:
                if (obj == null) {
                    return null;
                }
                if (Date.class.isAssignableFrom(obj.getClass())) {
                    return (Date) obj;
                }
                if (Long.class.isAssignableFrom(obj.getClass())) {
                    return new Date(((Long) obj).longValue());
                }
                if (!String.class.isAssignableFrom(obj.getClass())) {
                    C0188.m793(obj.getClass(), Date.class.getName());
                    return null;
                }
                try {
                    return DateFormat.getInstance().parse(obj.toString());
                } catch (ParseException e) {
                    throw new C1292(e);
                }
            case 6:
                if (obj == null) {
                    return null;
                }
                if (Double.class.isAssignableFrom(obj.getClass())) {
                    return (Double) obj;
                }
                if (Integer.class.isAssignableFrom(obj.getClass())) {
                    return Double.valueOf(((Integer) obj).doubleValue());
                }
                if (Long.class.isAssignableFrom(obj.getClass())) {
                    return Double.valueOf(((Long) obj).doubleValue());
                }
                if (BigDecimal.class.isAssignableFrom(obj.getClass())) {
                    return Double.valueOf(((BigDecimal) obj).doubleValue());
                }
                if (Float.class.isAssignableFrom(obj.getClass())) {
                    return Double.valueOf(((Float) obj).doubleValue());
                }
                if (String.class.isAssignableFrom(obj.getClass())) {
                    return Double.valueOf(obj.toString());
                }
                C0188.m793(obj.getClass(), Double.class.getName());
                return null;
            case 7:
                if (obj == null) {
                    return null;
                }
                if (Float.class.isAssignableFrom(obj.getClass())) {
                    return (Float) obj;
                }
                if (Integer.class.isAssignableFrom(obj.getClass())) {
                    return Float.valueOf(((Integer) obj).floatValue());
                }
                if (Long.class.isAssignableFrom(obj.getClass())) {
                    return Float.valueOf(((Long) obj).floatValue());
                }
                if (BigDecimal.class.isAssignableFrom(obj.getClass())) {
                    return Float.valueOf(((BigDecimal) obj).floatValue());
                }
                if (Double.class.isAssignableFrom(obj.getClass())) {
                    return Float.valueOf(((Double) obj).floatValue());
                }
                if (String.class.isAssignableFrom(obj.getClass())) {
                    return Float.valueOf(obj.toString());
                }
                C0188.m793(obj.getClass(), Float.class.getName());
                return null;
            case 8:
                if (obj == null) {
                    return null;
                }
                if (Integer.class.isAssignableFrom(obj.getClass())) {
                    return (Integer) obj;
                }
                if (Long.class.isAssignableFrom(obj.getClass())) {
                    return Integer.valueOf(((Long) obj).intValue());
                }
                if (Double.class.isAssignableFrom(obj.getClass())) {
                    return Integer.valueOf(((Double) obj).intValue());
                }
                if (BigDecimal.class.isAssignableFrom(obj.getClass())) {
                    return Integer.valueOf(((BigDecimal) obj).intValue());
                }
                if (Float.class.isAssignableFrom(obj.getClass())) {
                    return Integer.valueOf(((Float) obj).intValue());
                }
                if (String.class.isAssignableFrom(obj.getClass())) {
                    return Integer.valueOf(obj.toString());
                }
                C0188.m793(obj.getClass(), Integer.class.getName());
                return null;
            case 9:
                if (obj == null) {
                    return null;
                }
                if (Long.class.isAssignableFrom(obj.getClass())) {
                    return (Long) obj;
                }
                if (Integer.class.isAssignableFrom(obj.getClass())) {
                    return Long.valueOf(((Integer) obj).longValue());
                }
                if (Double.class.isAssignableFrom(obj.getClass())) {
                    return Long.valueOf(((Double) obj).longValue());
                }
                if (BigDecimal.class.isAssignableFrom(obj.getClass())) {
                    return Long.valueOf(((BigDecimal) obj).longValue());
                }
                if (Float.class.isAssignableFrom(obj.getClass())) {
                    return Long.valueOf(((Float) obj).longValue());
                }
                if (String.class.isAssignableFrom(obj.getClass())) {
                    return Long.valueOf(obj.toString());
                }
                C0188.m793(obj.getClass(), Long.class.getName());
                return null;
            case 10:
                if (obj == null) {
                    return null;
                }
                return obj.toString();
            default:
                return obj;
        }
    }

    @Override // yyds.AbstractC1183
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public AbstractC1183 mo1662(String str) {
        switch (this.f3382) {
            case 0:
                return (C0721) this.f5420.f3102;
            case 1:
                return (C0721) this.f5420.f3101;
            default:
                return super.mo1662(str);
        }
    }

    @Override // yyds.AbstractC1183
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public Object mo1663() {
        switch (this.f3382) {
            case 0:
                return new C2288();
            case 1:
                return new C2288();
            default:
                return super.mo1663();
        }
    }

    @Override // yyds.AbstractC1183
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public AbstractC1183 mo1664(String str) {
        switch (this.f3382) {
            case 0:
                return (C0721) this.f5420.f3102;
            case 1:
                return (C0721) this.f5420.f3101;
            default:
                return super.mo1664(str);
        }
    }

    @Override // yyds.AbstractC1183
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public Object mo1665() {
        switch (this.f3382) {
            case 0:
                return new C2481();
            case 1:
                return new LinkedHashMap();
            default:
                return super.mo1665();
        }
    }
}
