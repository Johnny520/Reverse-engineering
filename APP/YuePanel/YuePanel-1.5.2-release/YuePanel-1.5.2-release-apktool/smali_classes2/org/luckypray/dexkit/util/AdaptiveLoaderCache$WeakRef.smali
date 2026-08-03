.class final Lorg/luckypray/dexkit/util/AdaptiveLoaderCache$WeakRef;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/luckypray/dexkit/util/AdaptiveLoaderCache$Ref;


# annotations
.annotation runtime LYue/ۥۡۡ۠ۤ;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0002\u0018\u0000*\u0008\u0008\u0002\u0010\u0001*\u00020\u00022\u0008\u0012\u0004\u0012\u0002H\u00010\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0002\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\t\u001a\u0004\u0018\u00018\u0002H\u0016\u00a2\u0006\u0002\u0010\nR\u001c\u0010\u0006\u001a\u0010\u0012\u000c\u0012\n \u0008*\u0004\u0018\u00018\u00028\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"
    }
    d2 = {
        "Lorg/luckypray/dexkit/util/AdaptiveLoaderCache$WeakRef;",
        "V",
        "",
        "Lorg/luckypray/dexkit/util/AdaptiveLoaderCache$Ref;",
        "v",
        "(Ljava/lang/Object;)V",
        "ref",
        "Ljava/lang/ref/WeakReference;",
        "kotlin.jvm.PlatformType",
        "get",
        "()Ljava/lang/Object;",
        "dexkit-android_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/luckypray/dexkit/util/AdaptiveLoaderCache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "WeakRef"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lorg/luckypray/dexkit/util/AdaptiveLoaderCache$Ref<",
        "TV;>;"
    }
.end annotation


# instance fields
.field private final ref:Ljava/lang/ref/WeakReference;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "TV;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)V"
        }
    .end annotation

    const-string v0, "v"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lorg/luckypray/dexkit/util/AdaptiveLoaderCache$WeakRef;->ref:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    iget-object v0, p0, Lorg/luckypray/dexkit/util/AdaptiveLoaderCache$WeakRef;->ref:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
