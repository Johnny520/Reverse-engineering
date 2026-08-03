.class public final Lk5/h;
.super Lo5/t;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public j:I

.field public k:Lz5/a;

.field public l:I

.field public final synthetic m:Lo5/c;

.field public final synthetic n:Lk5/i;


# direct methods
.method public constructor <init>(Lk5/i;Landroidx/lifecycle/x;ILo5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk5/h;->n:Lk5/i;

    .line 2
    .line 3
    iput-object p4, p0, Lk5/h;->m:Lo5/c;

    .line 4
    .line 5
    invoke-direct {p0, p2, p3}, Lo5/t;-><init>(Landroidx/lifecycle/x;I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(La5/a;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lk5/h;->n:Lk5/i;

    .line 2
    .line 3
    iget-object v4, v0, Lk5/i;->l:Lk5/o;

    .line 4
    .line 5
    :goto_0
    iget v1, p0, Lk5/h;->j:I

    .line 6
    .line 7
    add-int/lit8 v1, v1, 0x1

    .line 8
    .line 9
    iput v1, p0, Lk5/h;->j:I

    .line 10
    .line 11
    iget v2, v4, Lk5/o;->r:I

    .line 12
    .line 13
    if-le v1, v2, :cond_0

    .line 14
    .line 15
    iget p1, p1, La5/a;->h:I

    .line 16
    .line 17
    iput p1, v4, Lk5/o;->o:I

    .line 18
    .line 19
    const/4 p1, 0x3

    .line 20
    iput p1, p0, Lo5/t;->g:I

    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    return-object p1

    .line 24
    :cond_0
    iget-object v1, v0, Lk5/i;->j:Ljava/util/Iterator;

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Ljava/lang/Integer;

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    :goto_1
    move v7, v1

    .line 39
    goto :goto_2

    .line 40
    :cond_1
    const/4 v1, 0x7

    .line 41
    goto :goto_1

    .line 42
    :goto_2
    new-instance v1, Lk5/w;

    .line 43
    .line 44
    iget-object v2, v4, Lk5/o;->j:Lk5/u;

    .line 45
    .line 46
    iget v5, p0, Lk5/h;->l:I

    .line 47
    .line 48
    iget-object v6, p0, Lk5/h;->m:Lo5/c;

    .line 49
    .line 50
    move-object v3, p1

    .line 51
    invoke-direct/range {v1 .. v7}, Lk5/w;-><init>(Lk5/u;La5/a;Lk5/o;ILo5/c;I)V

    .line 52
    .line 53
    .line 54
    iget-object p1, p0, Lk5/h;->k:Lz5/a;

    .line 55
    .line 56
    invoke-static {v1}, Lz5/a;->g1(Li5/a;)Lz5/a;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    iput-object v2, p0, Lk5/h;->k:Lz5/a;

    .line 61
    .line 62
    iget v5, v1, Lk5/w;->o:I

    .line 63
    .line 64
    iput v5, p0, Lk5/h;->l:I

    .line 65
    .line 66
    iget-boolean v5, v0, Lk5/i;->k:Z

    .line 67
    .line 68
    if-eqz v5, :cond_2

    .line 69
    .line 70
    if-eqz p1, :cond_2

    .line 71
    .line 72
    invoke-virtual {p1, v2}, Li5/a;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-eqz p1, :cond_2

    .line 77
    .line 78
    move-object p1, v3

    .line 79
    goto :goto_0

    .line 80
    :cond_2
    return-object v1
.end method
