package io.ktor.http;

import androidx.activity.AbstractC0900;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m151d2 = {"Lio/ktor/http/InvalidCookieDateException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "", "data", "reason", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/String;)V", "ktor-http"}, m152k = 1, m153mv = {2, 0, 0}, m155xi = 48)
public final class InvalidCookieDateException extends IllegalStateException {
    public InvalidCookieDateException(String str, String str2) {
        str.getClass();
        str2.getClass();
        StringBuilder sb = new StringBuilder("Failed to parse date string: \"");
        sb.append(str);
        sb.append("\". Reason: \"");
        super(AbstractC0900.m708(sb, str2, '\"'));
    }
}
