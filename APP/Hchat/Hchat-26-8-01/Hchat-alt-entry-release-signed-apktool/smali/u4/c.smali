.class public final Lu4/c;
.super Lz4/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public j:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lz4/i;-><init>(I)V

    .line 2
    .line 3
    .line 4
    const/4 p1, -0x1

    .line 5
    iput p1, p0, Lu4/c;->j:I

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final r()I
    .locals 8

    .line 1
    iget v0, p0, Lu4/c;->j:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_2

    .line 5
    .line 6
    new-instance v0, Li4/i;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    iput v1, v0, Li4/i;->g:I

    .line 13
    .line 14
    iget-object v2, p0, Lz4/e;->h:[Ljava/lang/Object;

    .line 15
    .line 16
    array-length v2, v2

    .line 17
    move v3, v1

    .line 18
    :goto_0
    if-ge v3, v2, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0, v3}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    check-cast v4, Lu4/b;

    .line 25
    .line 26
    iget-object v4, v4, Lu4/b;->b:Lh4/u;

    .line 27
    .line 28
    iget-object v5, v4, Lz4/e;->h:[Ljava/lang/Object;

    .line 29
    .line 30
    array-length v5, v5

    .line 31
    move v6, v1

    .line 32
    :goto_1
    if-ge v6, v5, :cond_0

    .line 33
    .line 34
    invoke-virtual {v4, v6}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v7

    .line 38
    check-cast v7, Lu4/i;

    .line 39
    .line 40
    invoke-virtual {v7, v0}, Lu4/i;->d(Lu4/h;)V

    .line 41
    .line 42
    .line 43
    add-int/lit8 v6, v6, 0x1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    iget v0, v0, Li4/i;->g:I

    .line 50
    .line 51
    iput v0, p0, Lu4/c;->j:I

    .line 52
    .line 53
    :cond_2
    iget v0, p0, Lu4/c;->j:I

    .line 54
    .line 55
    return v0
.end method

.method public final s(I)Lu4/b;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lz4/i;->p(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-ltz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lu4/b;

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    invoke-static {p1}, La/a;->X0(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const-string v0, "no such label: "

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 p1, 0x0

    .line 28
    return-object p1
.end method
