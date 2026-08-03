.class public final Lo5/d;
.super Lo5/e;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final b:Lk5/u;

.field public final c:I


# direct methods
.method public constructor <init>(Lk5/u;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lo5/d;->b:Lk5/u;

    .line 5
    .line 6
    iput p2, p0, Lo5/d;->c:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b()Ljava/util/Set;
    .locals 3

    .line 1
    iget-object v0, p0, Lo5/d;->b:Lk5/u;

    .line 2
    .line 3
    iget-object v1, v0, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 4
    .line 5
    iget v2, p0, Lo5/d;->c:I

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Landroidx/lifecycle/x;->N(I)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-static {v0, v1}, Lo5/e;->a(Lk5/u;I)Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method public final c()Lo5/c;
    .locals 3

    .line 1
    iget-object v0, p0, Lo5/d;->b:Lk5/u;

    .line 2
    .line 3
    iget-object v0, v0, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 4
    .line 5
    iget v1, p0, Lo5/d;->c:I

    .line 6
    .line 7
    add-int/lit8 v2, v1, 0x4

    .line 8
    .line 9
    invoke-virtual {v0, v2}, Landroidx/lifecycle/x;->N(I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    sget-object v0, Lo5/c;->c:Ll3/w;

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    new-instance v2, Lk5/n;

    .line 19
    .line 20
    add-int/lit8 v1, v1, 0x10

    .line 21
    .line 22
    invoke-direct {v2, p0, v1, v0}, Lk5/n;-><init>(Lo5/d;II)V

    .line 23
    .line 24
    .line 25
    return-object v2
.end method

.method public final d()Lo5/c;
    .locals 4

    .line 1
    iget-object v0, p0, Lo5/d;->b:Lk5/u;

    .line 2
    .line 3
    iget-object v1, v0, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 4
    .line 5
    iget v2, p0, Lo5/d;->c:I

    .line 6
    .line 7
    add-int/lit8 v3, v2, 0x8

    .line 8
    .line 9
    invoke-virtual {v1, v3}, Landroidx/lifecycle/x;->N(I)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    sget-object v0, Lo5/c;->c:Ll3/w;

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    iget-object v0, v0, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 19
    .line 20
    add-int/lit8 v3, v2, 0x4

    .line 21
    .line 22
    invoke-virtual {v0, v3}, Landroidx/lifecycle/x;->N(I)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    add-int/lit8 v2, v2, 0x10

    .line 27
    .line 28
    mul-int/lit8 v0, v0, 0x8

    .line 29
    .line 30
    add-int/2addr v0, v2

    .line 31
    new-instance v2, Lk5/n;

    .line 32
    .line 33
    invoke-direct {v2, p0, v0, v1}, Lk5/n;-><init>(Lo5/d;II)V

    .line 34
    .line 35
    .line 36
    return-object v2
.end method

.method public final e()Lo5/c;
    .locals 5

    .line 1
    iget-object v0, p0, Lo5/d;->b:Lk5/u;

    .line 2
    .line 3
    iget-object v1, v0, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 4
    .line 5
    iget v2, p0, Lo5/d;->c:I

    .line 6
    .line 7
    add-int/lit8 v3, v2, 0xc

    .line 8
    .line 9
    invoke-virtual {v1, v3}, Landroidx/lifecycle/x;->N(I)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    sget-object v0, Lo5/c;->c:Ll3/w;

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    iget-object v3, v0, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 19
    .line 20
    add-int/lit8 v4, v2, 0x4

    .line 21
    .line 22
    invoke-virtual {v3, v4}, Landroidx/lifecycle/x;->N(I)I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    iget-object v0, v0, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 27
    .line 28
    add-int/lit8 v4, v2, 0x8

    .line 29
    .line 30
    invoke-virtual {v0, v4}, Landroidx/lifecycle/x;->N(I)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    add-int/lit8 v2, v2, 0x10

    .line 35
    .line 36
    mul-int/lit8 v3, v3, 0x8

    .line 37
    .line 38
    add-int/2addr v3, v2

    .line 39
    mul-int/lit8 v0, v0, 0x8

    .line 40
    .line 41
    add-int/2addr v0, v3

    .line 42
    new-instance v2, Lk5/n;

    .line 43
    .line 44
    invoke-direct {v2, p0, v0, v1}, Lk5/n;-><init>(Lo5/d;II)V

    .line 45
    .line 46
    .line 47
    return-object v2
.end method
