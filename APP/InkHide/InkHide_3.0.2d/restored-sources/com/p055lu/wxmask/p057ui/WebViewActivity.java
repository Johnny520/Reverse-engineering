package com.p055lu.wxmask.p057ui;

import android.os.Bundle;
import android.webkit.WebView;
import android.widget.FrameLayout;
import p004C.C0060d;
import p009E0.C0106f;
import p014H.C0142a;
import p040U0.AbstractC0307q;
import p064f0.AbstractActivityC0555a;
import p070i0.AbstractC0731a;
import p100y0.C1098d;

/* JADX INFO: loaded from: classes.dex */
public final class WebViewActivity extends AbstractActivityC0555a {

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ int f1631x = 0;

    /* JADX INFO: renamed from: v */
    public final C0106f f1632v = new C0106f(new C0060d(13, this));

    /* JADX INFO: renamed from: w */
    public boolean f1633w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p061e.AbstractActivityC0533i, androidx.activity.AbstractActivityC0376g, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FrameLayout frameLayout = new FrameLayout(this);
        setContentView(frameLayout);
        String stringExtra = getIntent().getStringExtra("url");
        getIntent().getBooleanExtra("forceHtml", false);
        String stringExtra2 = getIntent().getStringExtra("title");
        if (stringExtra2 != null && !AbstractC0307q.m534d0(stringExtra2)) {
            setTitle(stringExtra2);
        }
        if (stringExtra == null || AbstractC0307q.m534d0(stringExtra)) {
            finish();
            return;
        }
        AbstractC0731a.m1386c("onCreate");
        C0106f c0106f = this.f1632v;
        ((C1098d) c0106f.m247a()).getClass();
        WebView webView = ((C1098d) c0106f.m247a()).f3739b;
        if (frameLayout.indexOfChild(webView) == -1) {
            frameLayout.addView(webView, -1, -1);
        }
        ((C1098d) c0106f.m247a()).m2367a(stringExtra, new C0142a(stringExtra2, this, false));
        this.f1633w = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p061e.AbstractActivityC0533i, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (this.f1633w) {
            WebView webView = ((C1098d) this.f1632v.m247a()).f3739b;
            webView.loadUrl("about:blank");
            webView.clearMatches();
            webView.clearHistory();
            webView.destroy();
        }
    }
}
