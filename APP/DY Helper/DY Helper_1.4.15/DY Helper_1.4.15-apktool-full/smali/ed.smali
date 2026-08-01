.class public final synthetic Led;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;

.field public final synthetic ζ:J


# direct methods
.method public synthetic constructor <init>(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Led;->ε:Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;

    .line 5
    .line 6
    iput-wide p2, p0, Led;->ζ:J

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Led;->ε:Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;

    .line 2
    .line 3
    iget-wide v1, p0, Led;->ζ:J

    .line 4
    .line 5
    invoke-static {v0, v1, v2}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->α(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;J)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
