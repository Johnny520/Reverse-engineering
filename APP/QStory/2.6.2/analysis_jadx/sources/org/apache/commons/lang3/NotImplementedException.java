package org.apache.commons.lang3;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class NotImplementedException extends UnsupportedOperationException {
    private static final long serialVersionUID = 20131021;
    private final String code;

    public NotImplementedException() {
        this.code = null;
    }

    public String getCode() {
        return this.code;
    }

    public NotImplementedException(String str) {
        this(str, (String) null);
    }

    public NotImplementedException(String str, String str2) {
        super(str);
        this.code = str2;
    }

    public NotImplementedException(String str, Throwable th) {
        this(str, th, null);
    }

    public NotImplementedException(String str, Throwable th, String str2) {
        super(str, th);
        this.code = str2;
    }

    public NotImplementedException(Throwable th) {
        this(th, (String) null);
    }

    public NotImplementedException(Throwable th, String str) {
        super(th);
        this.code = str;
    }
}
