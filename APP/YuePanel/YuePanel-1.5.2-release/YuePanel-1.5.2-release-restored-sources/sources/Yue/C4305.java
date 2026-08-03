package Yue;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۨ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4305 {

    /* JADX INFO: renamed from: ۥ */
    public static final long f805 = 253402300799999L;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public static final C0377 f806 = new C0377();

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final String[] f8823;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final DateFormat[] f8824;

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۨ۠$ۥ */
    public static final class C0377 extends ThreadLocal<DateFormat> {
        /* JADX DEBUG: Method merged with bridge method: initialValue()Ljava/lang/Object; */
        @Override // java.lang.ThreadLocal
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(C8158.f24180);
            return simpleDateFormat;
        }
    }

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f8823 = strArr;
        f8824 = new DateFormat[strArr.length];
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ */
    public static final Date m1259(@InterfaceC6399 String str) {
        C5499.m17103(str, "<this>");
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date date = f806.get().parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return date;
        }
        String[] strArr = f8823;
        synchronized (strArr) {
            try {
                int length = strArr.length;
                for (int i = 0; i < length; i++) {
                    DateFormat[] dateFormatArr = f8824;
                    DateFormat simpleDateFormat = dateFormatArr[i];
                    if (simpleDateFormat == null) {
                        simpleDateFormat = new SimpleDateFormat(f8823[i], Locale.US);
                        simpleDateFormat.setTimeZone(C8158.f24180);
                        dateFormatArr[i] = simpleDateFormat;
                    }
                    parsePosition.setIndex(0);
                    Date date2 = simpleDateFormat.parse(str, parsePosition);
                    if (parsePosition.getIndex() != 0) {
                        return date2;
                    }
                }
                C8107 c8107 = C8107.f3222;
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public static final String m1260(@InterfaceC6399 Date date) {
        C5499.m17103(date, "<this>");
        String str = f806.get().format(date);
        C5499.m17102(str, "STANDARD_DATE_FORMAT.get().format(this)");
        return str;
    }
}
