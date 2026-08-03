.class public Li4/i;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Li4/k;
.implements Lu4/h;


# instance fields
.field public g:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Li4/i;->g:I

    .line 6
    .line 7
    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput p1, p0, Li4/i;->g:I

    return-void
.end method


# virtual methods
.method public a(IILw4/c;)V
    .locals 0

    .line 1
    return-void
.end method

.method public b(IIILv4/a;I)V
    .locals 0

    .line 1
    return-void
.end method

.method public c(IILv4/d0;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    return-void
.end method

.method public d(II)V
    .locals 0

    .line 1
    return-void
.end method

.method public e(Lu4/v;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Li4/i;->n(Lu4/i;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public f()I
    .locals 1

    .line 1
    iget v0, p0, Li4/i;->g:I

    .line 2
    .line 3
    return v0
.end method

.method public g(IILi4/n;I)V
    .locals 0

    .line 1
    return-void
.end method

.method public h(IIII)V
    .locals 0

    .line 1
    return-void
.end method

.method public i(IIIILw4/c;I)V
    .locals 0

    .line 1
    return-void
.end method

.method public j(Lu4/j;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Li4/i;->n(Lu4/i;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public k()I
    .locals 2

    .line 1
    iget v0, p0, Li4/i;->g:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    iput v1, p0, Li4/i;->g:I

    .line 6
    .line 7
    return v0
.end method

.method public l(Lu4/u;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Li4/i;->n(Lu4/i;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public m(Lu4/l;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Li4/i;->n(Lu4/i;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public n(Lu4/i;)V
    .locals 4

    .line 1
    iget-object v0, p1, Lu4/i;->i:Lu4/o;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v1, v0, Lu4/o;->g:I

    .line 6
    .line 7
    invoke-virtual {v0}, Lu4/o;->j()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    add-int/2addr v0, v1

    .line 12
    iget v1, p0, Li4/i;->g:I

    .line 13
    .line 14
    if-le v0, v1, :cond_0

    .line 15
    .line 16
    iput v0, p0, Li4/i;->g:I

    .line 17
    .line 18
    :cond_0
    iget-object p1, p1, Lu4/i;->j:Lu4/p;

    .line 19
    .line 20
    iget-object v0, p1, Lz4/e;->h:[Ljava/lang/Object;

    .line 21
    .line 22
    array-length v0, v0

    .line 23
    const/4 v1, 0x0

    .line 24
    :goto_0
    if-ge v1, v0, :cond_2

    .line 25
    .line 26
    invoke-virtual {p1, v1}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Lu4/o;

    .line 31
    .line 32
    iget v3, v2, Lu4/o;->g:I

    .line 33
    .line 34
    invoke-virtual {v2}, Lu4/o;->j()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    add-int/2addr v2, v3

    .line 39
    iget v3, p0, Li4/i;->g:I

    .line 40
    .line 41
    if-le v2, v3, :cond_1

    .line 42
    .line 43
    iput v2, p0, Li4/i;->g:I

    .line 44
    .line 45
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    return-void
.end method

.method public o(Lu4/m;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Li4/i;->n(Lu4/i;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public u(Lu4/g;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Li4/i;->n(Lu4/i;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public x(Lu4/u;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Li4/i;->n(Lu4/i;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
