.class public final Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NoResult;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome;


# annotations
.annotation runtime LYue/ۥۡۡ۠ۤ;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\t\u0010\u0008\u001a\u00020\u0004H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0004H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0012"
    }
    d2 = {
        "Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NoResult;",
        "Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome;",
        "",
        "exception",
        "Lorg/luckypray/dexkit/exceptions/NoResultException;",
        "(Lorg/luckypray/dexkit/exceptions/NoResultException;)V",
        "getException",
        "()Lorg/luckypray/dexkit/exceptions/NoResultException;",
        "component1",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
        "toString",
        "",
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
    value = Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "NoResult"
.end annotation


# instance fields
.field private final exception:Lorg/luckypray/dexkit/exceptions/NoResultException;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NoResult;-><init>(Lorg/luckypray/dexkit/exceptions/NoResultException;ILYue/ۥ۟ۨۥۢ;)V

    return-void
.end method

.method public constructor <init>(Lorg/luckypray/dexkit/exceptions/NoResultException;)V
    .locals 1
    .param p1    # Lorg/luckypray/dexkit/exceptions/NoResultException;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "exception"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NoResult;->exception:Lorg/luckypray/dexkit/exceptions/NoResultException;

    return-void
.end method

.method public synthetic constructor <init>(Lorg/luckypray/dexkit/exceptions/NoResultException;ILYue/ۥ۟ۨۥۢ;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 4
    new-instance p1, Lorg/luckypray/dexkit/exceptions/NoResultException;

    const-string p2, "No result found for query"

    invoke-direct {p1, p2}, Lorg/luckypray/dexkit/exceptions/NoResultException;-><init>(Ljava/lang/String;)V

    .line 5
    :cond_0
    invoke-direct {p0, p1}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NoResult;-><init>(Lorg/luckypray/dexkit/exceptions/NoResultException;)V

    return-void
.end method

.method public static synthetic copy$default(Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NoResult;Lorg/luckypray/dexkit/exceptions/NoResultException;ILjava/lang/Object;)Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NoResult;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NoResult;->exception:Lorg/luckypray/dexkit/exceptions/NoResultException;

    :cond_0
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NoResult;->copy(Lorg/luckypray/dexkit/exceptions/NoResultException;)Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NoResult;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lorg/luckypray/dexkit/exceptions/NoResultException;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NoResult;->exception:Lorg/luckypray/dexkit/exceptions/NoResultException;

    return-object v0
.end method

.method public final copy(Lorg/luckypray/dexkit/exceptions/NoResultException;)Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NoResult;
    .locals 1
    .param p1    # Lorg/luckypray/dexkit/exceptions/NoResultException;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "exception"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NoResult;

    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NoResult;-><init>(Lorg/luckypray/dexkit/exceptions/NoResultException;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NoResult;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NoResult;

    iget-object v1, p0, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NoResult;->exception:Lorg/luckypray/dexkit/exceptions/NoResultException;

    iget-object p1, p1, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NoResult;->exception:Lorg/luckypray/dexkit/exceptions/NoResultException;

    invoke-static {v1, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getException()Lorg/luckypray/dexkit/exceptions/NoResultException;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NoResult;->exception:Lorg/luckypray/dexkit/exceptions/NoResultException;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NoResult;->exception:Lorg/luckypray/dexkit/exceptions/NoResultException;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NoResult;->exception:Lorg/luckypray/dexkit/exceptions/NoResultException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "NoResult(exception="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
