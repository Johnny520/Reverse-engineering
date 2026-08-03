.class public final Lk5/w;
.super Li5/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final j:Lk5/u;

.field public final k:Lk5/o;

.field public final l:I

.field public final m:Lw5/a;

.field public final n:I

.field public final o:I

.field public final p:I

.field public q:I


# direct methods
.method public constructor <init>(Lk5/u;La5/a;Lk5/o;ILo5/c;I)V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-object p1, p0, Lk5/w;->j:Lk5/u;

    .line 43
    iput-object p3, p0, Lk5/w;->k:Lk5/o;

    const/4 p1, 0x1

    .line 44
    invoke-virtual {p2, p1}, La5/a;->o(Z)I

    move-result p1

    add-int/2addr p1, p4

    .line 45
    iput p1, p0, Lk5/w;->o:I

    const/4 p3, 0x0

    .line 46
    invoke-virtual {p2, p3}, La5/a;->o(Z)I

    move-result p2

    .line 47
    iput p2, p0, Lk5/w;->l:I

    .line 48
    invoke-interface {p5, p1}, Lo5/c;->seekTo(I)I

    move-result p1

    iput p1, p0, Lk5/w;->n:I

    const/4 p1, 0x0

    .line 49
    iput-object p1, p0, Lk5/w;->m:Lw5/a;

    .line 50
    iput p6, p0, Lk5/w;->p:I

    return-void
.end method

.method public constructor <init>(Lk5/u;La5/a;Lk5/o;ILo5/m;Lo5/c;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk5/w;->j:Lk5/u;

    .line 5
    .line 6
    iput-object p3, p0, Lk5/w;->k:Lk5/o;

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    invoke-virtual {p2, p1}, La5/a;->o(Z)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    add-int/2addr p1, p4

    .line 14
    iput p1, p0, Lk5/w;->o:I

    .line 15
    .line 16
    const/4 p3, 0x0

    .line 17
    invoke-virtual {p2, p3}, La5/a;->o(Z)I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    iput p2, p0, Lk5/w;->l:I

    .line 22
    .line 23
    invoke-interface {p6, p1}, Lo5/c;->seekTo(I)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    iput p1, p0, Lk5/w;->n:I

    .line 28
    .line 29
    invoke-virtual {p5}, Lo5/m;->c()I

    .line 30
    .line 31
    .line 32
    invoke-virtual {p5}, Lo5/m;->b()Lw5/a;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iput-object p1, p0, Lk5/w;->m:Lw5/a;

    .line 37
    .line 38
    iput p7, p0, Lk5/w;->p:I

    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public final f1()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/w;->k:Lk5/o;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk5/o;->getType()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lk5/w;->j:Lk5/u;

    .line 2
    .line 3
    iget-object v1, v0, Lk5/u;->r:Lk5/s;

    .line 4
    .line 5
    iget-object v2, v0, Lk5/u;->a:Landroidx/lifecycle/x;

    .line 6
    .line 7
    iget v3, p0, Lk5/w;->q:I

    .line 8
    .line 9
    if-nez v3, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, Lk5/u;->t:Lk5/p;

    .line 12
    .line 13
    iget v3, p0, Lk5/w;->o:I

    .line 14
    .line 15
    invoke-virtual {v0, v3}, Lk5/p;->b(I)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iput v0, p0, Lk5/w;->q:I

    .line 20
    .line 21
    :cond_0
    iget v0, p0, Lk5/w;->q:I

    .line 22
    .line 23
    add-int/lit8 v0, v0, 0x4

    .line 24
    .line 25
    invoke-virtual {v2, v0}, Landroidx/lifecycle/x;->N(I)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-virtual {v1, v0}, Lk5/s;->b(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lk5/w;->j:Lk5/u;

    .line 2
    .line 3
    iget-object v1, v0, Lk5/u;->s:Lk5/s;

    .line 4
    .line 5
    iget-object v2, v0, Lk5/u;->a:Landroidx/lifecycle/x;

    .line 6
    .line 7
    iget v3, p0, Lk5/w;->q:I

    .line 8
    .line 9
    if-nez v3, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, Lk5/u;->t:Lk5/p;

    .line 12
    .line 13
    iget v3, p0, Lk5/w;->o:I

    .line 14
    .line 15
    invoke-virtual {v0, v3}, Lk5/p;->b(I)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iput v0, p0, Lk5/w;->q:I

    .line 20
    .line 21
    :cond_0
    iget v0, p0, Lk5/w;->q:I

    .line 22
    .line 23
    add-int/lit8 v0, v0, 0x2

    .line 24
    .line 25
    invoke-virtual {v2, v0}, Landroidx/lifecycle/x;->P(I)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-virtual {v1, v0}, Lk5/s;->b(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    return-object v0
.end method
