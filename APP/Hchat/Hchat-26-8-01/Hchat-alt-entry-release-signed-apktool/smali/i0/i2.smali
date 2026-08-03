.class public final Li0/i2;
.super Lw0/w;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public c:J


# direct methods
.method public constructor <init>(JJ)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lw0/w;-><init>(J)V

    .line 2
    .line 3
    .line 4
    iput-wide p3, p0, Li0/i2;->c:J

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Lw0/w;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p1, Li0/i2;

    .line 5
    .line 6
    iget-wide v0, p1, Li0/i2;->c:J

    .line 7
    .line 8
    iput-wide v0, p0, Li0/i2;->c:J

    .line 9
    .line 10
    return-void
.end method

.method public final b(J)Lw0/w;
    .locals 3

    .line 1
    new-instance v0, Li0/i2;

    .line 2
    .line 3
    iget-wide v1, p0, Li0/i2;->c:J

    .line 4
    .line 5
    invoke-direct {v0, p1, p2, v1, v2}, Li0/i2;-><init>(JJ)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
