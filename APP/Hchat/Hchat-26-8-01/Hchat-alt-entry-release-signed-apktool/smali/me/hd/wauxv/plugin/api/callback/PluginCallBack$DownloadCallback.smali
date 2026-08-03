.class public interface abstract Lme/hd/wauxv/plugin/api/callback/PluginCallBack$DownloadCallback;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lme/hd/wauxv/plugin/api/callback/PluginCallBack;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "DownloadCallback"
.end annotation


# virtual methods
.method public abstract onError(Ljava/lang/Exception;)V
.end method

.method public onProgress(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract onSuccess(Ljava/io/File;)V
.end method
