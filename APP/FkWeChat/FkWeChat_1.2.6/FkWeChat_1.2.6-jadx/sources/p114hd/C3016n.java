package p114hd;

import android.content.ContentValues;
import android.os.Handler;
import android.os.Looper;
import cd.C1517b;
import java.util.HashMap;
import md.AbstractC5161p;
import okhttp3.internal.url._UrlKt;
import p053dd.C1951c;
import p068ed.AbstractC2212a;
import p084fd.AbstractC2422b;
import p084fd.AbstractC2429i;

/* JADX INFO: renamed from: hd.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C3016n extends AbstractC2212a {

    /* JADX INFO: renamed from: e */
    public static Class f7988e;

    public C3016n() {
        this.f6040c = "TransferHook";
    }

    @Override // p068ed.AbstractC2212a
    /* JADX INFO: renamed from: h */
    public boolean mo7972h() {
        if (f7988e == null) {
            f7988e = C1517b.findClass().pkg("com.tencent.mm.plugin.remittance.model").usingStrings("/cgi-bin/mmpay-bin/transferoperation").get();
        }
        return f7988e != null;
    }

    /* JADX INFO: renamed from: n */
    public void m11119n(ContentValues contentValues) {
        if (m7973i()) {
            try {
                C1951c c1951c = new C1951c(contentValues);
                if (c1951c.isTransfer()) {
                    String transferId = c1951c.getTransferId();
                    int invalidTime = c1951c.getInvalidTime();
                    String transactionId = c1951c.getTransactionId();
                    String str = c1951c.talker;
                    if (str.equals(AbstractC2422b.m8720d())) {
                        return;
                    }
                    String strM7970f = m7970f("transfer_blacklist_objects", _UrlKt.FRAGMENT_ENCODE_SET);
                    if (!strM7970f.isEmpty()) {
                        for (String str2 : strM7970f.split(",")) {
                            if (str.equals(str2.trim())) {
                                return;
                            }
                        }
                    }
                    m11120o(AbstractC5161p.newInstance(f7988e, transactionId, transferId, 0, "confirm", str, Integer.valueOf(invalidTime), _UrlKt.FRAGMENT_ENCODE_SET, 1, _UrlKt.FRAGMENT_ENCODE_SET, new HashMap(), 0L, _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET));
                }
            } catch (Throwable th) {
                m7965a("handleDbInsert error", th);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m11120o(final Object obj) {
        int iM7969e = m7969e("transfer_delay", 0);
        if (iM7969e > 0) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: hd.m
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC2429i.m8778c(obj);
                }
            }, iM7969e);
        } else {
            AbstractC2429i.m8778c(obj);
        }
    }

    @Override // p068ed.AbstractC2212a
    /* JADX INFO: renamed from: j */
    public void mo7974j() {
    }
}
