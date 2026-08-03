package com.kongzue.dialogx.interfaces;

/* JADX INFO: loaded from: classes2.dex */
public interface ProgressViewInterface {
    void error();

    void loading();

    void noLoading();

    void progress(float r1);

    com.kongzue.dialogx.interfaces.ProgressViewInterface setColor(int r1);

    void success();

    void warning();

    com.kongzue.dialogx.interfaces.ProgressViewInterface whenShowTick(java.lang.Runnable r1);
}
