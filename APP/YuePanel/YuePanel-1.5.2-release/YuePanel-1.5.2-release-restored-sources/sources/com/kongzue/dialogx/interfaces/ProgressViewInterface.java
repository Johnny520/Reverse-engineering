package com.kongzue.dialogx.interfaces;

/* JADX INFO: loaded from: classes2.dex */
public interface ProgressViewInterface {
    void error();

    void loading();

    void noLoading();

    void progress(float f);

    ProgressViewInterface setColor(int i);

    void success();

    void warning();

    ProgressViewInterface whenShowTick(Runnable runnable);
}
