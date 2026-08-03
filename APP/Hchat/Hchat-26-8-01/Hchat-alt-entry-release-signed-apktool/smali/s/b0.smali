.class public final Ls/b0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lv0/c;

.field public final b:Lb0/j;

.field public final c:Lf/k0;


# direct methods
.method public constructor <init>(Lv0/c;Lb0/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ls/b0;->a:Lv0/c;

    .line 5
    .line 6
    iput-object p2, p0, Ls/b0;->b:Lb0/j;

    .line 7
    .line 8
    sget-object p1, Lf/r0;->a:[J

    .line 9
    .line 10
    new-instance p1, Lf/k0;

    .line 11
    .line 12
    invoke-direct {p1}, Lf/k0;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Ls/b0;->c:Lf/k0;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;ILjava/lang/Object;)Lfg/p;
    .locals 5

    .line 1
    iget-object v0, p0, Ls/b0;->c:Lf/k0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ls/a0;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    const v3, 0x30c58c04

    .line 11
    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    iget v4, v1, Ls/a0;->c:I

    .line 16
    .line 17
    if-ne v4, p2, :cond_1

    .line 18
    .line 19
    iget-object v4, v1, Ls/a0;->b:Ljava/lang/Object;

    .line 20
    .line 21
    invoke-static {v4, p3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-eqz v4, :cond_1

    .line 26
    .line 27
    iget-object p1, v1, Ls/a0;->d:Ls0/d;

    .line 28
    .line 29
    if-nez p1, :cond_0

    .line 30
    .line 31
    iget-object p1, v1, Ls/a0;->e:Ls/b0;

    .line 32
    .line 33
    new-instance p2, Lb0/q;

    .line 34
    .line 35
    const/16 p3, 0xa

    .line 36
    .line 37
    invoke-direct {p2, p1, p3, v1}, Lb0/q;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    new-instance p1, Ls0/d;

    .line 41
    .line 42
    invoke-direct {p1, v3, p2, v2}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 43
    .line 44
    .line 45
    iput-object p1, v1, Ls/a0;->d:Ls0/d;

    .line 46
    .line 47
    :cond_0
    return-object p1

    .line 48
    :cond_1
    new-instance v1, Ls/a0;

    .line 49
    .line 50
    invoke-direct {v1, p0, p2, p1, p3}, Ls/a0;-><init>(Ls/b0;ILjava/lang/Object;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, p1, v1}, Lf/k0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object p1, v1, Ls/a0;->d:Ls0/d;

    .line 57
    .line 58
    if-nez p1, :cond_2

    .line 59
    .line 60
    new-instance p1, Lb0/q;

    .line 61
    .line 62
    const/16 p2, 0xa

    .line 63
    .line 64
    invoke-direct {p1, p0, p2, v1}, Lb0/q;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    new-instance p2, Ls0/d;

    .line 68
    .line 69
    invoke-direct {p2, v3, p1, v2}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 70
    .line 71
    .line 72
    iput-object p2, v1, Ls/a0;->d:Ls0/d;

    .line 73
    .line 74
    return-object p2

    .line 75
    :cond_2
    return-object p1
.end method

.method public final b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Ls/b0;->c:Lf/k0;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lf/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Ls/a0;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object p1, v0, Ls/a0;->b:Ljava/lang/Object;

    .line 15
    .line 16
    return-object p1

    .line 17
    :cond_1
    iget-object v0, p0, Ls/b0;->b:Lb0/j;

    .line 18
    .line 19
    invoke-virtual {v0}, Lb0/j;->invoke()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lr/k;

    .line 24
    .line 25
    iget-object v1, v0, Lr/k;->d:Lac/k;

    .line 26
    .line 27
    invoke-virtual {v1, p1}, Lac/k;->o(Ljava/lang/Object;)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    const/4 v1, -0x1

    .line 32
    if-eq p1, v1, :cond_2

    .line 33
    .line 34
    invoke-virtual {v0, p1}, Lr/k;->b(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1

    .line 39
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 40
    return-object p1
.end method
