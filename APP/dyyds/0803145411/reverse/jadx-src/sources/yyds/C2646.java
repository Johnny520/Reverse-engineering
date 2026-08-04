package yyds;

import com.thegrizzlylabs.sardineandroid.model.Response;
import java.io.IOException;
import java.net.URI;
import java.util.logging.Logger;

/* JADX INFO: renamed from: yyds.ᲈᛴᲁᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2646 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final Logger f13039 = Logger.getLogger(C2646.class.getName());

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final URI f13040;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final C2133 f13041;

    public C2646(Response response) {
        this.f13040 = new URI(response.getHref());
        String status = response.getStatus();
        if (status != null && !status.isEmpty()) {
            try {
                AbstractC0902.m2017(response.getStatus());
            } catch (IOException unused) {
                f13039.warning("Failed to parse status line: ".concat(status));
            }
        }
        this.f13041 = new C2133(this, response);
    }

    public final String toString() {
        return this.f13040.getPath();
    }
}
