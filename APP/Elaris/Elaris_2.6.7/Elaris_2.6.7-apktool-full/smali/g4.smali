.class public final Lg4;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Li4;

.field public final c:J


# direct methods
.method public constructor <init>(Ljava/lang/String;Li4;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lg4;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lg4;->b:Li4;

    .line 7
    .line 8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 9
    .line 10
    .line 11
    move-result-wide p1

    .line 12
    iput-wide p1, p0, Lg4;->c:J

    .line 13
    .line 14
    return-void
.end method
