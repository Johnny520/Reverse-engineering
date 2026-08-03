.class final Lorg/luckypray/dexkit/util/AdaptiveLoaderCache$StrongRef;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/luckypray/dexkit/util/AdaptiveLoaderCache$Ref;


# annotations
.annotation runtime LYue/ۥۡۡ۠ۤ;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0002\u0018\u0000*\u0008\u0008\u0002\u0010\u0001*\u00020\u00022\u0008\u0012\u0004\u0012\u0002H\u00010\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0002\u00a2\u0006\u0002\u0010\u0005J\r\u0010\u0007\u001a\u00028\u0002H\u0016\u00a2\u0006\u0002\u0010\u0008R\u0010\u0010\u0004\u001a\u00028\u0002X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0006\u00a8\u0006\t"
    }
    d2 = {
        "Lorg/luckypray/dexkit/util/AdaptiveLoaderCache$StrongRef;",
        "V",
        "",
        "Lorg/luckypray/dexkit/util/AdaptiveLoaderCache$Ref;",
        "v",
        "(Ljava/lang/Object;)V",
        "Ljava/lang/Object;",
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
    name = "StrongRef"
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
.field private final v:Ljava/lang/Object;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TV;"
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

    iput-object p1, p0, Lorg/luckypray/dexkit/util/AdaptiveLoaderCache$StrongRef;->v:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    iget-object v0, p0, Lorg/luckypray/dexkit/util/AdaptiveLoaderCache$StrongRef;->v:Ljava/lang/Object;

    return-object v0
.end method
