.class public interface abstract Lcom/android/dx/cf/direct/ClassPathOpener$Consumer;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/cf/direct/ClassPathOpener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Consumer"
.end annotation


# virtual methods
.method public abstract onException(Ljava/lang/Exception;)V
.end method

.method public abstract onProcessArchiveStart(Ljava/io/File;)V
.end method

.method public abstract processFileBytes(Ljava/lang/String;J[B)Z
.end method
