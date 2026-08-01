.class public final synthetic Llc;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic d:Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;

.field public final synthetic e:J


# direct methods
.method public synthetic constructor <init>(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Llc;->d:Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;

    .line 5
    .line 6
    iput-wide p2, p0, Llc;->e:J

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Llc;->d:Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;

    .line 2
    .line 3
    iget-wide v1, p0, Llc;->e:J

    .line 4
    .line 5
    invoke-static {v0, v1, v2}, Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;->a(Lorg/luckypray/dexkit/cache/CacheBridgeRuntime;J)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
