.class public final synthetic Lc1;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;

.field public final synthetic b:J


# direct methods
.method public synthetic constructor <init>(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc1;->a:Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;

    .line 5
    .line 6
    iput-wide p2, p0, Lc1;->b:J

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lc1;->a:Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;

    .line 2
    .line 3
    iget-wide v1, p0, Lc1;->b:J

    .line 4
    .line 5
    invoke-static {v0, v1, v2}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->a(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;J)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
