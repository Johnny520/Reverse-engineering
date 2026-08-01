package p263s;

import android.content.ClipData;
import p179m2.C4845g1;
import p319w2.C9058e;

/* JADX INFO: renamed from: s.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6631a {

    /* JADX INFO: renamed from: a */
    public static final C6631a f20766a = new C6631a();

    /* JADX INFO: renamed from: a */
    public static final boolean m26278a(C4845g1 c4845g1) {
        if (c4845g1 == null) {
            return false;
        }
        return c4845g1.m19353a().getDescription().hasMimeType("text/*");
    }

    /* JADX INFO: renamed from: b */
    public static final C9058e m26279b(C4845g1 c4845g1) {
        CharSequence text;
        ClipData.Item itemAt = c4845g1.m19353a().getItemAt(0);
        if (itemAt == null || (text = itemAt.getText()) == null) {
            return null;
        }
        return AbstractC6632b.m26281a(text);
    }

    /* JADX INFO: renamed from: c */
    public static final C4845g1 m26280c(C9058e c9058e) {
        if (c9058e == null) {
            return null;
        }
        return new C4845g1(ClipData.newPlainText("plain text", AbstractC6632b.m26282b(c9058e)));
    }
}
