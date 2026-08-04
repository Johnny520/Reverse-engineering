package yyds;

/* JADX INFO: renamed from: yyds.ᲀᲇᛳᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2109 extends Error {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Exception f10439;

    public C2109(String str, Exception exc) {
        super(str);
        this.f10439 = exc;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        if (message != null) {
            return message;
        }
        Exception exc = this.f10439;
        return (exc == null || (message = exc.getMessage()) != null) ? message : exc.getClass().toString();
    }
}
