package com.p055lu.wxmask.p057ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import p064f0.AbstractActivityC0555a;

/* JADX INFO: loaded from: classes.dex */
public final class DeepLinkActivity extends AbstractActivityC0555a {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    @Override // p061e.AbstractActivityC0533i, androidx.activity.AbstractActivityC0376g, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Uri data = getIntent().getData();
        if (data == null) {
            data = null;
        } else {
            if (!("maskwechat".equals(data.getScheme()) && "com.lu.wxmask".equals(data.getHost()))) {
            }
        }
        Intent intent = new Intent(this, (Class<?>) MainActivity.class);
        intent.putExtra("from", DeepLinkActivity.class.getName());
        intent.addFlags(603979776);
        intent.setData(data);
        startActivity(intent);
        finish();
    }
}
