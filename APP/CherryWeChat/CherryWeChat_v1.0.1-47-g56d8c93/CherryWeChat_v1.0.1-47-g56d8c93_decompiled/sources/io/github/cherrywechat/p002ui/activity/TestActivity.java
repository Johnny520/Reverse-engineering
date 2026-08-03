package io.github.cherrywechat.p002ui.activity;

import android.widget.Button;
import io.github.cherrywechat.R;
import p000.AbstractActivityC2528t5;
import p000.ViewOnClickListenerC1079Z4;

/* JADX INFO: loaded from: classes.dex */
public final class TestActivity extends AbstractActivityC2528t5 {

    /* JADX INFO: renamed from: A */
    public static final /* synthetic */ int f5577A = 0;

    @Override // p000.AbstractActivityC2528t5
    public final void onCreate() {
        setContentView(R.layout.activity_text);
        ((Button) findViewById(R.id.test_text)).setOnClickListener(new ViewOnClickListenerC1079Z4(10));
    }
}
