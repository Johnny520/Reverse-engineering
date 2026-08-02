.class public final Lhs2;
.super Lru2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public c:J


# direct methods
.method public constructor <init>(JJ)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lru2;-><init>(J)V

    .line 2
    .line 3
    .line 4
    iput-wide p3, p0, Lhs2;->c:J

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Lru2;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p1, Lhs2;

    .line 5
    .line 6
    iget-wide v0, p1, Lhs2;->c:J

    .line 7
    .line 8
    iput-wide v0, p0, Lhs2;->c:J

    .line 9
    .line 10
    return-void
.end method

.method public final b(J)Lru2;
    .locals 3

    .line 1
    new-instance v0, Lhs2;

    .line 2
    .line 3
    iget-wide v1, p0, Lhs2;->c:J

    .line 4
    .line 5
    invoke-direct {v0, p1, p2, v1, v2}, Lhs2;-><init>(JJ)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
