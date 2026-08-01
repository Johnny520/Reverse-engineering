package p264s0;

import android.content.res.Configuration;
import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.InterfaceC0572r;
import java.util.Locale;
import p024b9.AbstractC1043k;
import p179m2.AbstractC4854i0;

/* JADX INFO: renamed from: s0.u5 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6962u5 {

    /* JADX INFO: renamed from: a */
    public static final a f22943a = new a(null);

    /* JADX INFO: renamed from: s0.u5$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final Locale m27552a(InterfaceC0572r interfaceC0572r, int i10) {
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1559m(317587697, i10, -1, "androidx.compose.material3.Locale24.Companion.defaultLocale (CalendarLocale.android.kt:43)");
            }
            Locale locale = ((Configuration) interfaceC0572r.mo2142A(AbstractC4854i0.m19378c())).getLocales().get(0);
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1558l();
            }
            return locale;
        }

        public a() {
        }
    }
}
