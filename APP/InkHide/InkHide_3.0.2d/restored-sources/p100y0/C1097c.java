package p100y0;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import java.util.Arrays;
import p027N0.AbstractC0223g;
import p070i0.AbstractC0731a;

/* JADX INFO: renamed from: y0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1097c extends WebChromeClient {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1098d f3736a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1097c(C1098d c1098d) {
        this.f3736a = c1098d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        AbstractC0223g.m418e(consoleMessage, "consoleMessage");
        ConsoleMessage.MessageLevel messageLevel = consoleMessage.messageLevel();
        Object[] objArr = {"d", "console: ", messageLevel, Integer.valueOf(consoleMessage.lineNumber()), consoleMessage.sourceId(), consoleMessage.message()};
        int i2 = messageLevel == null ? -1 : AbstractC1096b.f3735a[messageLevel.ordinal()];
        if (i2 == 1) {
            AbstractC0731a.m1384a(Arrays.copyOf(objArr, 6));
        } else if (i2 == 2) {
            AbstractC0731a.m1387d(Arrays.copyOf(objArr, 6));
        } else if (i2 != 3) {
            AbstractC0731a.m1386c(Arrays.copyOf(objArr, 6));
        } else {
            AbstractC0731a.m1385b(Arrays.copyOf(objArr, 6));
        }
        return super.onConsoleMessage(consoleMessage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        InterfaceC1099e interfaceC1099e = this.f3736a.f3738a;
        if (interfaceC1099e != null) {
            interfaceC1099e.mo139j(str);
        }
    }
}
