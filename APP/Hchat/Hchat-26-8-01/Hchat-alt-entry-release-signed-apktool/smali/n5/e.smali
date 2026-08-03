.class public final Ln5/e;
.super Li5/b;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final j:Lk5/u;

.field public final k:I

.field public l:I


# direct methods
.method public constructor <init>(Lk5/u;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ln5/e;->j:Lk5/u;

    .line 5
    .line 6
    iput p2, p0, Ln5/e;->k:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget v0, p0, Ln5/e;->k:I

    .line 2
    .line 3
    if-ltz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Ln5/e;->j:Lk5/u;

    .line 6
    .line 7
    iget-object v1, v1, Lk5/u;->u:Lk5/p;

    .line 8
    .line 9
    iget-object v1, v1, Lk5/p;->h:Lk5/u;

    .line 10
    .line 11
    iget v1, v1, Lk5/u;->l:I

    .line 12
    .line 13
    if-ge v0, v1, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    new-instance v1, Lv5/a;

    .line 17
    .line 18
    const-string v2, "method@"

    .line 19
    .line 20
    invoke-static {v0, v2}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-direct {v1, v0}, Lv5/a;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw v1
.end method

.method public final f1()Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Ln5/e;->j:Lk5/u;

    .line 2
    .line 3
    iget-object v1, v0, Lk5/u;->s:Lk5/s;

    .line 4
    .line 5
    iget-object v2, v0, Lk5/u;->a:Landroidx/lifecycle/x;

    .line 6
    .line 7
    iget-object v0, v0, Lk5/u;->u:Lk5/p;

    .line 8
    .line 9
    iget v3, p0, Ln5/e;->k:I

    .line 10
    .line 11
    invoke-virtual {v0, v3}, Lk5/p;->b(I)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-virtual {v2, v0}, Landroidx/lifecycle/x;->P(I)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-virtual {v1, v0}, Lk5/s;->b(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    return-object v0
.end method

.method public final g1()Ljava/util/List;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ln5/e;->i1()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Ln5/e;->j:Lk5/u;

    .line 6
    .line 7
    iget-object v2, v1, Lk5/u;->a:Landroidx/lifecycle/x;

    .line 8
    .line 9
    add-int/lit8 v0, v0, 0x8

    .line 10
    .line 11
    invoke-virtual {v2, v0}, Landroidx/lifecycle/x;->N(I)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-lez v0, :cond_0

    .line 16
    .line 17
    iget-object v1, v1, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 18
    .line 19
    invoke-virtual {v1, v0}, Landroidx/lifecycle/x;->N(I)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    add-int/lit8 v0, v0, 0x4

    .line 24
    .line 25
    new-instance v2, Lk5/y;

    .line 26
    .line 27
    const/4 v3, 0x2

    .line 28
    invoke-direct {v2, p0, v0, v1, v3}, Lk5/y;-><init>(Ljava/lang/Object;III)V

    .line 29
    .line 30
    .line 31
    return-object v2

    .line 32
    :cond_0
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 33
    .line 34
    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Ln5/e;->j:Lk5/u;

    .line 2
    .line 3
    iget-object v1, v0, Lk5/u;->r:Lk5/s;

    .line 4
    .line 5
    iget-object v2, v0, Lk5/u;->a:Landroidx/lifecycle/x;

    .line 6
    .line 7
    iget-object v0, v0, Lk5/u;->u:Lk5/p;

    .line 8
    .line 9
    iget v3, p0, Ln5/e;->k:I

    .line 10
    .line 11
    invoke-virtual {v0, v3}, Lk5/p;->b(I)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    add-int/lit8 v0, v0, 0x4

    .line 16
    .line 17
    invoke-virtual {v2, v0}, Landroidx/lifecycle/x;->N(I)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-virtual {v1, v0}, Lk5/s;->b(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0
.end method

.method public final h1()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ln5/e;->i1()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Ln5/e;->j:Lk5/u;

    .line 6
    .line 7
    iget-object v2, v1, Lk5/u;->s:Lk5/s;

    .line 8
    .line 9
    iget-object v1, v1, Lk5/u;->a:Landroidx/lifecycle/x;

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x4

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Landroidx/lifecycle/x;->N(I)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-virtual {v2, v0}, Lk5/s;->b(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0
.end method

.method public final i1()I
    .locals 4

    .line 1
    iget v0, p0, Ln5/e;->l:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Ln5/e;->j:Lk5/u;

    .line 6
    .line 7
    iget-object v1, v0, Lk5/u;->v:Lk5/p;

    .line 8
    .line 9
    iget-object v2, v0, Lk5/u;->a:Landroidx/lifecycle/x;

    .line 10
    .line 11
    iget-object v0, v0, Lk5/u;->u:Lk5/p;

    .line 12
    .line 13
    iget v3, p0, Ln5/e;->k:I

    .line 14
    .line 15
    invoke-virtual {v0, v3}, Lk5/p;->b(I)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    add-int/lit8 v0, v0, 0x2

    .line 20
    .line 21
    invoke-virtual {v2, v0}, Landroidx/lifecycle/x;->P(I)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-virtual {v1, v0}, Lk5/p;->b(I)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iput v0, p0, Ln5/e;->l:I

    .line 30
    .line 31
    :cond_0
    iget v0, p0, Ln5/e;->l:I

    .line 32
    .line 33
    return v0
.end method
