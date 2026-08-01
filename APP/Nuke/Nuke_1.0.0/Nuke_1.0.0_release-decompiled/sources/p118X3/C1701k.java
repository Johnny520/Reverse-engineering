package p118X3;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import p011B4.AbstractC0231b;
import p117X2.AbstractC1665j;
import p144c4.AbstractC1913c;

/* JADX INFO: renamed from: X3.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1701k {

    /* JADX INFO: renamed from: k */
    public static final Pattern f5835k = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: l */
    public static final Pattern f5836l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: m */
    public static final Pattern f5837m = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: n */
    public static final Pattern f5838n = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a */
    public final String f5839a;

    /* JADX INFO: renamed from: b */
    public final String f5840b;

    /* JADX INFO: renamed from: c */
    public final long f5841c;

    /* JADX INFO: renamed from: d */
    public final String f5842d;

    /* JADX INFO: renamed from: e */
    public final String f5843e;

    /* JADX INFO: renamed from: f */
    public final boolean f5844f;

    /* JADX INFO: renamed from: g */
    public final boolean f5845g;

    /* JADX INFO: renamed from: h */
    public final boolean f5846h;

    /* JADX INFO: renamed from: i */
    public final boolean f5847i;

    /* JADX INFO: renamed from: j */
    public final String f5848j;

    public C1701k(String str, String str2, long j5, String str3, String str4, boolean z5, boolean z6, boolean z7, boolean z8, String str5) {
        this.f5839a = str;
        this.f5840b = str2;
        this.f5841c = j5;
        this.f5842d = str3;
        this.f5843e = str4;
        this.f5844f = z5;
        this.f5845g = z6;
        this.f5846h = z7;
        this.f5847i = z8;
        this.f5848j = str5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1701k)) {
            return false;
        }
        C1701k c1701k = (C1701k) obj;
        return AbstractC1665j.m2981a(c1701k.f5839a, this.f5839a) && AbstractC1665j.m2981a(c1701k.f5840b, this.f5840b) && c1701k.f5841c == this.f5841c && AbstractC1665j.m2981a(c1701k.f5842d, this.f5842d) && AbstractC1665j.m2981a(c1701k.f5843e, this.f5843e) && c1701k.f5844f == this.f5844f && c1701k.f5845g == this.f5845g && c1701k.f5846h == this.f5846h && c1701k.f5847i == this.f5847i && AbstractC1665j.m2981a(c1701k.f5848j, this.f5848j);
    }

    public final int hashCode() {
        int iM395f = AbstractC0231b.m395f(AbstractC0231b.m395f(AbstractC0231b.m395f(AbstractC0231b.m395f(AbstractC0231b.m394e(AbstractC0231b.m394e(AbstractC0231b.m392c(AbstractC0231b.m394e(AbstractC0231b.m394e(527, 31, this.f5839a), 31, this.f5840b), 31, this.f5841c), 31, this.f5842d), 31, this.f5843e), 31, this.f5844f), 31, this.f5845g), 31, this.f5846h), 31, this.f5847i);
        String str = this.f5848j;
        return iM395f + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5839a);
        sb.append('=');
        sb.append(this.f5840b);
        if (this.f5846h) {
            long j5 = this.f5841c;
            if (j5 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String str = ((DateFormat) AbstractC1913c.f6484a.get()).format(new Date(j5));
                AbstractC1665j.m2984d(str, "format(...)");
                sb.append(str);
            }
        }
        if (!this.f5847i) {
            sb.append("; domain=");
            sb.append(this.f5842d);
        }
        sb.append("; path=");
        sb.append(this.f5843e);
        if (this.f5844f) {
            sb.append("; secure");
        }
        if (this.f5845g) {
            sb.append("; httponly");
        }
        String str2 = this.f5848j;
        if (str2 != null) {
            sb.append("; samesite=");
            sb.append(str2);
        }
        String string = sb.toString();
        AbstractC1665j.m2984d(string, "toString(...)");
        return string;
    }
}
