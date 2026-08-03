.class public final Li0/j2;
.super Lw0/w;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;J)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p3}, Lw0/w;-><init>(J)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li0/j2;->c:Ljava/lang/Object;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Lw0/w;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p1, Li0/j2;

    .line 5
    .line 6
    iget-object p1, p1, Li0/j2;->c:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p1, p0, Li0/j2;->c:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method

.method public final b(J)Lw0/w;
    .locals 2

    .line 1
    new-instance p1, Li0/j2;

    .line 2
    .line 3
    invoke-static {}, Lw0/m;->j()Lw0/f;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-virtual {p2}, Lw0/f;->g()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    iget-object p2, p0, Li0/j2;->c:Ljava/lang/Object;

    .line 12
    .line 13
    invoke-direct {p1, p2, v0, v1}, Li0/j2;-><init>(Ljava/lang/Object;J)V

    .line 14
    .line 15
    .line 16
    return-object p1
.end method
