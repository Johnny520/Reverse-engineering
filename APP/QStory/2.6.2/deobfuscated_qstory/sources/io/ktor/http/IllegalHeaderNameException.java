package io.ktor.http;

import androidx.activity.AbstractC0053;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/ktor/http/IllegalHeaderNameException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "", "headerName", "", "position", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "Ljava/lang/String;", "getHeaderName", "()Ljava/lang/String;", "I", "getPosition", "()I", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IllegalHeaderNameException extends IllegalArgumentException {
    private final String headerName;
    private final int position;

    public IllegalHeaderNameException(String str, int i) {
        str.getClass();
        StringBuilder sb = new StringBuilder("Header name '");
        sb.append(str);
        sb.append("' contains illegal character '");
        sb.append(str.charAt(i));
        sb.append("' (code ");
        super(AbstractC0053.m154(sb, str.charAt(i) & 255, ')'));
        this.headerName = str;
        this.position = i;
    }

    public final String getHeaderName() {
        return this.headerName;
    }

    public final int getPosition() {
        return this.position;
    }
}
