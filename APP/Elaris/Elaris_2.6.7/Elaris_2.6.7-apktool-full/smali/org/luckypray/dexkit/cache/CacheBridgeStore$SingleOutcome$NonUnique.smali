.class public final Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NonUnique;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "NonUnique"
.end annotation


# instance fields
.field private final exception:Lorg/luckypray/dexkit/exceptions/NonUniqueResultException;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 18
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NonUnique;-><init>(Lorg/luckypray/dexkit/exceptions/NonUniqueResultException;ILr2;)V

    return-void
.end method

.method public constructor <init>(Lorg/luckypray/dexkit/exceptions/NonUniqueResultException;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NonUnique;->exception:Lorg/luckypray/dexkit/exceptions/NonUniqueResultException;

    return-void
.end method

.method public synthetic constructor <init>(Lorg/luckypray/dexkit/exceptions/NonUniqueResultException;ILr2;)V
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    new-instance p1, Lorg/luckypray/dexkit/exceptions/NonUniqueResultException;

    .line 6
    .line 7
    const-string p2, "query did not return a unique result"

    .line 8
    .line 9
    invoke-direct {p1, p2}, Lorg/luckypray/dexkit/exceptions/NonUniqueResultException;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-direct {p0, p1}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NonUnique;-><init>(Lorg/luckypray/dexkit/exceptions/NonUniqueResultException;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static synthetic copy$default(Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NonUnique;Lorg/luckypray/dexkit/exceptions/NonUniqueResultException;ILjava/lang/Object;)Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NonUnique;
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NonUnique;->exception:Lorg/luckypray/dexkit/exceptions/NonUniqueResultException;

    .line 6
    .line 7
    :cond_0
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NonUnique;->copy(Lorg/luckypray/dexkit/exceptions/NonUniqueResultException;)Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NonUnique;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method


# virtual methods
.method public final component1()Lorg/luckypray/dexkit/exceptions/NonUniqueResultException;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NonUnique;->exception:Lorg/luckypray/dexkit/exceptions/NonUniqueResultException;

    .line 2
    .line 3
    return-object p0
.end method

.method public final copy(Lorg/luckypray/dexkit/exceptions/NonUniqueResultException;)Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NonUnique;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p0, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NonUnique;

    .line 5
    .line 6
    invoke-direct {p0, p1}, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NonUnique;-><init>(Lorg/luckypray/dexkit/exceptions/NonUniqueResultException;)V

    .line 7
    .line 8
    .line 9
    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NonUnique;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NonUnique;

    .line 12
    .line 13
    iget-object p0, p0, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NonUnique;->exception:Lorg/luckypray/dexkit/exceptions/NonUniqueResultException;

    .line 14
    .line 15
    iget-object p1, p1, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NonUnique;->exception:Lorg/luckypray/dexkit/exceptions/NonUniqueResultException;

    .line 16
    .line 17
    invoke-static {p0, p1}, Li5;->p(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-nez p0, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    return v0
.end method

.method public final getException()Lorg/luckypray/dexkit/exceptions/NonUniqueResultException;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NonUnique;->exception:Lorg/luckypray/dexkit/exceptions/NonUniqueResultException;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NonUnique;->exception:Lorg/luckypray/dexkit/exceptions/NonUniqueResultException;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome$NonUnique;->exception:Lorg/luckypray/dexkit/exceptions/NonUniqueResultException;

    .line 2
    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v1, "NonUnique(exception="

    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string p0, ")"

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method
