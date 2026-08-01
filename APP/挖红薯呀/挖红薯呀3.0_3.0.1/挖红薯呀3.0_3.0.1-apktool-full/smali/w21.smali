.class public final Lw21;
.super Lf41;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# instance fields
.field public c:J


# direct methods
.method public constructor <init>(JJ)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lf41;-><init>(J)V

    .line 2
    .line 3
    .line 4
    iput-wide p3, p0, Lw21;->c:J

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Lf41;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p1, Lw21;

    .line 5
    .line 6
    iget-wide v0, p1, Lw21;->c:J

    .line 7
    .line 8
    iput-wide v0, p0, Lw21;->c:J

    .line 9
    .line 10
    return-void
.end method

.method public final b(J)Lf41;
    .locals 3

    .line 1
    new-instance v0, Lw21;

    .line 2
    .line 3
    iget-wide v1, p0, Lw21;->c:J

    .line 4
    .line 5
    invoke-direct {v0, p1, p2, v1, v2}, Lw21;-><init>(JJ)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
