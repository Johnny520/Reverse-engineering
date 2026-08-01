.class public final Lf3;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:J

.field public final c:J

.field public final d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;JJLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lf3;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-wide p2, p0, Lf3;->b:J

    .line 7
    .line 8
    iput-wide p4, p0, Lf3;->c:J

    .line 9
    .line 10
    if-nez p6, :cond_0

    .line 11
    .line 12
    const-string p6, ""

    .line 13
    .line 14
    :cond_0
    iput-object p6, p0, Lf3;->d:Ljava/lang/String;

    .line 15
    .line 16
    return-void
.end method
