package com.bumptech.glide;

import Yue.InterfaceC3809;
import Yue.InterfaceC4525;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7009;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.File;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
interface ModelTypes<T> {
    @InterfaceC3809
    @InterfaceC6391
    T load(@InterfaceC6490 Bitmap bitmap);

    @InterfaceC3809
    @InterfaceC6391
    T load(@InterfaceC6490 Drawable drawable);

    @InterfaceC3809
    @InterfaceC6391
    T load(@InterfaceC6490 Uri uri);

    @InterfaceC3809
    @InterfaceC6391
    T load(@InterfaceC6490 File file);

    @InterfaceC3809
    @InterfaceC6391
    T load(@InterfaceC7009 @InterfaceC4525 @InterfaceC6490 Integer num);

    @InterfaceC3809
    @InterfaceC6391
    T load(@InterfaceC6490 Object obj);

    @InterfaceC3809
    @InterfaceC6391
    T load(@InterfaceC6490 String str);

    @InterfaceC3809
    @Deprecated
    T load(@InterfaceC6490 URL url);

    @InterfaceC3809
    @InterfaceC6391
    T load(@InterfaceC6490 byte[] bArr);
}
