.class public final synthetic Lw/z;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:Lw/q0;

.field public final synthetic h:Z

.field public final synthetic i:Ln2/t;

.field public final synthetic j:Ln2/s;

.field public final synthetic k:Ln2/j;

.field public final synthetic l:Lb5/k;

.field public final synthetic m:Lh0/d1;

.field public final synthetic n:Lqg/t;

.field public final synthetic o:Lt/c;


# direct methods
.method public synthetic constructor <init>(Lw/q0;ZLn2/t;Ln2/s;Ln2/j;Lb5/k;Lh0/d1;Lqg/t;Lt/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw/z;->g:Lw/q0;

    .line 5
    .line 6
    iput-boolean p2, p0, Lw/z;->h:Z

    .line 7
    .line 8
    iput-object p3, p0, Lw/z;->i:Ln2/t;

    .line 9
    .line 10
    iput-object p4, p0, Lw/z;->j:Ln2/s;

    .line 11
    .line 12
    iput-object p5, p0, Lw/z;->k:Ln2/j;

    .line 13
    .line 14
    iput-object p6, p0, Lw/z;->l:Lb5/k;

    .line 15
    .line 16
    iput-object p7, p0, Lw/z;->m:Lh0/d1;

    .line 17
    .line 18
    iput-object p8, p0, Lw/z;->n:Lqg/t;

    .line 19
    .line 20
    iput-object p9, p0, Lw/z;->o:Lt/c;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    check-cast p1, Ld1/z;

    .line 2
    .line 3
    iget-object v3, p0, Lw/z;->g:Lw/q0;

    .line 4
    .line 5
    invoke-virtual {v3}, Lw/q0;->b()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p1}, Ld1/z;->a()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    invoke-virtual {p1}, Ld1/z;->a()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iget-object v1, v3, Lw/q0;->f:Li0/j1;

    .line 21
    .line 22
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v1, v0}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v3}, Lw/q0;->b()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    iget-object v2, p0, Lw/z;->j:Ln2/s;

    .line 34
    .line 35
    iget-object v5, p0, Lw/z;->l:Lb5/k;

    .line 36
    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    iget-boolean v0, p0, Lw/z;->h:Z

    .line 40
    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    iget-object v0, p0, Lw/z;->i:Ln2/t;

    .line 44
    .line 45
    iget-object v1, p0, Lw/z;->k:Ln2/j;

    .line 46
    .line 47
    invoke-static {v0, v3, v2, v1, v5}, Lw/s;->y(Ln2/t;Lw/q0;Ln2/s;Ln2/j;Lb5/k;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    invoke-static {v3}, Lw/s;->o(Lw/q0;)V

    .line 52
    .line 53
    .line 54
    :goto_0
    invoke-virtual {p1}, Ld1/z;->a()Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    const/4 v8, 0x0

    .line 59
    if-eqz v0, :cond_2

    .line 60
    .line 61
    invoke-virtual {v3}, Lw/q0;->d()Lw/m1;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    if-eqz v4, :cond_2

    .line 66
    .line 67
    new-instance v0, Lf0/b;

    .line 68
    .line 69
    const/4 v6, 0x0

    .line 70
    const/4 v7, 0x6

    .line 71
    iget-object v1, p0, Lw/z;->o:Lt/c;

    .line 72
    .line 73
    invoke-direct/range {v0 .. v7}, Lf0/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 74
    .line 75
    .line 76
    const/4 v1, 0x3

    .line 77
    iget-object v2, p0, Lw/z;->n:Lqg/t;

    .line 78
    .line 79
    invoke-static {v2, v8, v0, v1}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 80
    .line 81
    .line 82
    :cond_2
    invoke-virtual {p1}, Ld1/z;->a()Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    if-nez p1, :cond_3

    .line 87
    .line 88
    iget-object p1, p0, Lw/z;->m:Lh0/d1;

    .line 89
    .line 90
    invoke-virtual {p1, v8}, Lh0/d1;->g(Le1/b;)V

    .line 91
    .line 92
    .line 93
    :cond_3
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 94
    .line 95
    return-object p1
.end method
