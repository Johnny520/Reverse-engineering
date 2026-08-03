.class public final Lu7/d;
.super Lu7/c;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final t:Lr7/f;


# direct methods
.method public constructor <init>(Lr7/f;)V
    .locals 2

    .line 1
    new-instance v0, Lokio/a;

    .line 2
    .line 3
    const/16 v1, 0x13

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lokio/a;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {p0, v1, v1, v0}, Lu7/c;-><init>(ZZLokio/a;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lu7/d;->t:Lr7/f;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final c0(I)Lr7/y;
    .locals 1

    .line 1
    add-int/lit8 p1, p1, -0x1

    .line 2
    .line 3
    iget-object v0, p0, Lu7/d;->t:Lr7/f;

    .line 4
    .line 5
    iget v0, v0, Lr7/f;->n:I

    .line 6
    .line 7
    sub-int/2addr p1, v0

    .line 8
    invoke-virtual {p0, p1}, Lu7/c;->V(I)Lr7/s;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Lr7/y;

    .line 13
    .line 14
    return-object p1
.end method
