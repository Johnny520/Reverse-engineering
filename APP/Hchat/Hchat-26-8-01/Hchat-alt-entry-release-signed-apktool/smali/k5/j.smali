.class public final Lk5/j;
.super Lo5/t;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public j:I

.field public k:Lz5/b;

.field public l:I

.field public final synthetic m:Lk5/k;


# direct methods
.method public constructor <init>(Lk5/k;Landroidx/lifecycle/x;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk5/j;->m:Lk5/k;

    .line 2
    .line 3
    invoke-direct {p0, p2, p3}, Lo5/t;-><init>(Landroidx/lifecycle/x;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La5/a;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, Lk5/j;->m:Lk5/k;

    .line 2
    .line 3
    iget-object v4, v0, Lk5/k;->l:Lk5/o;

    .line 4
    .line 5
    :goto_0
    iget v1, p0, Lk5/j;->j:I

    .line 6
    .line 7
    add-int/lit8 v1, v1, 0x1

    .line 8
    .line 9
    iput v1, p0, Lk5/j;->j:I

    .line 10
    .line 11
    iget v2, v4, Lk5/o;->t:I

    .line 12
    .line 13
    if-le v1, v2, :cond_0

    .line 14
    .line 15
    const/4 p1, 0x3

    .line 16
    iput p1, p0, Lo5/t;->g:I

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    return-object p1

    .line 20
    :cond_0
    iget-object v1, v0, Lk5/k;->j:Ljava/util/Iterator;

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Ljava/lang/Integer;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    :goto_1
    move v8, v1

    .line 35
    goto :goto_2

    .line 36
    :cond_1
    const/4 v1, 0x7

    .line 37
    goto :goto_1

    .line 38
    :goto_2
    new-instance v1, Lk5/z;

    .line 39
    .line 40
    iget-object v2, v4, Lk5/o;->j:Lk5/u;

    .line 41
    .line 42
    iget v5, p0, Lk5/j;->l:I

    .line 43
    .line 44
    iget-object v6, v0, Lk5/k;->g:Lo5/c;

    .line 45
    .line 46
    iget-object v7, v0, Lk5/k;->h:Lo5/c;

    .line 47
    .line 48
    move-object v3, p1

    .line 49
    invoke-direct/range {v1 .. v8}, Lk5/z;-><init>(Lk5/u;La5/a;Lk5/o;ILo5/c;Lo5/c;I)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, Lk5/j;->k:Lz5/b;

    .line 53
    .line 54
    invoke-static {v1}, Lz5/b;->i1(Li5/b;)Lz5/b;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    iput-object v2, p0, Lk5/j;->k:Lz5/b;

    .line 59
    .line 60
    iget v5, v1, Lk5/z;->q:I

    .line 61
    .line 62
    iput v5, p0, Lk5/j;->l:I

    .line 63
    .line 64
    iget-boolean v5, v0, Lk5/k;->k:Z

    .line 65
    .line 66
    if-eqz v5, :cond_2

    .line 67
    .line 68
    if-eqz p1, :cond_2

    .line 69
    .line 70
    invoke-virtual {p1, v2}, Li5/b;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-eqz p1, :cond_2

    .line 75
    .line 76
    move-object p1, v3

    .line 77
    goto :goto_0

    .line 78
    :cond_2
    return-object v1
.end method
