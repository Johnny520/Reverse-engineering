.class public final Lk5/f0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lk5/u;

.field public final b:I

.field public final c:I


# direct methods
.method public constructor <init>(Lk5/u;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk5/f0;->a:Lk5/u;

    .line 5
    .line 6
    iput p2, p0, Lk5/f0;->b:I

    .line 7
    .line 8
    iput p3, p0, Lk5/f0;->c:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 2

    .line 1
    iget-object v0, p0, Lk5/f0;->a:Lk5/u;

    .line 2
    .line 3
    iget-object v0, v0, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 4
    .line 5
    iget v1, p0, Lk5/f0;->b:I

    .line 6
    .line 7
    add-int/lit8 v1, v1, 0x4

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroidx/lifecycle/x;->P(I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public final b()Ljava/util/List;
    .locals 13

    .line 1
    iget-object v0, p0, Lk5/f0;->a:Lk5/u;

    .line 2
    .line 3
    iget-object v3, v0, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 4
    .line 5
    iget v1, p0, Lk5/f0;->b:I

    .line 6
    .line 7
    add-int/lit8 v1, v1, 0x6

    .line 8
    .line 9
    invoke-virtual {v3, v1}, Landroidx/lifecycle/x;->P(I)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget v2, p0, Lk5/f0;->c:I

    .line 14
    .line 15
    add-int/2addr v1, v2

    .line 16
    new-instance v2, La5/a;

    .line 17
    .line 18
    const/4 v4, 0x5

    .line 19
    invoke-direct {v2, v1, v4, v3}, La5/a;-><init>(IILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2}, La5/a;->m()I

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    if-lez v5, :cond_0

    .line 27
    .line 28
    new-instance v1, Lk5/d0;

    .line 29
    .line 30
    iget v4, v2, La5/a;->h:I

    .line 31
    .line 32
    const/4 v6, 0x0

    .line 33
    move-object v2, p0

    .line 34
    invoke-direct/range {v1 .. v6}, Lk5/d0;-><init>(Ljava/lang/Object;Landroidx/lifecycle/x;III)V

    .line 35
    .line 36
    .line 37
    return-object v1

    .line 38
    :cond_0
    mul-int/lit8 v5, v5, -0x1

    .line 39
    .line 40
    add-int/lit8 v11, v5, 0x1

    .line 41
    .line 42
    new-instance v7, Lk5/e0;

    .line 43
    .line 44
    iget-object v9, v0, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 45
    .line 46
    iget v10, v2, La5/a;->h:I

    .line 47
    .line 48
    move v12, v11

    .line 49
    move-object v8, p0

    .line 50
    invoke-direct/range {v7 .. v12}, Lk5/e0;-><init>(Lk5/f0;Landroidx/lifecycle/x;III)V

    .line 51
    .line 52
    .line 53
    return-object v7
.end method

.method public final c()I
    .locals 2

    .line 1
    iget-object v0, p0, Lk5/f0;->a:Lk5/u;

    .line 2
    .line 3
    iget-object v0, v0, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 4
    .line 5
    iget v1, p0, Lk5/f0;->b:I

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroidx/lifecycle/x;->N(I)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lk5/f0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lk5/f0;

    .line 6
    .line 7
    invoke-virtual {p0}, Lk5/f0;->c()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p1}, Lk5/f0;->c()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Lk5/f0;->a()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-virtual {p1}, Lk5/f0;->a()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-ne v0, v1, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0}, Lk5/f0;->b()Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {p1}, Lk5/f0;->b()Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-interface {v0, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_0

    .line 40
    .line 41
    const/4 p1, 0x1

    .line 42
    return p1

    .line 43
    :cond_0
    const/4 p1, 0x0

    .line 44
    return p1
.end method
