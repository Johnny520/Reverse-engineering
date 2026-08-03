.class public final synthetic Lwb/m9;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:Z

.field public final synthetic h:I

.field public final synthetic i:Lfg/l;

.field public final synthetic j:Ldb/c;

.field public final synthetic k:Lfg/a;

.field public final synthetic l:Lfg/l;

.field public final synthetic m:Lfg/p;

.field public final synthetic n:Lfg/l;

.field public final synthetic o:Ljava/util/ArrayList;


# direct methods
.method public synthetic constructor <init>(ZILfg/l;Ldb/c;Lfg/a;Lfg/l;Lfg/p;Lfg/l;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lwb/m9;->g:Z

    .line 5
    .line 6
    iput p2, p0, Lwb/m9;->h:I

    .line 7
    .line 8
    iput-object p3, p0, Lwb/m9;->i:Lfg/l;

    .line 9
    .line 10
    iput-object p4, p0, Lwb/m9;->j:Ldb/c;

    .line 11
    .line 12
    iput-object p5, p0, Lwb/m9;->k:Lfg/a;

    .line 13
    .line 14
    iput-object p6, p0, Lwb/m9;->l:Lfg/l;

    .line 15
    .line 16
    iput-object p7, p0, Lwb/m9;->m:Lfg/p;

    .line 17
    .line 18
    iput-object p8, p0, Lwb/m9;->n:Lfg/l;

    .line 19
    .line 20
    iput-object p9, p0, Lwb/m9;->o:Ljava/util/ArrayList;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    check-cast p1, Lr/h;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Lwb/p0;->o:Ls0/d;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x3

    .line 10
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 11
    .line 12
    .line 13
    new-instance v3, Lwb/k3;

    .line 14
    .line 15
    iget v4, p0, Lwb/m9;->h:I

    .line 16
    .line 17
    iget-object v5, p0, Lwb/m9;->i:Lfg/l;

    .line 18
    .line 19
    iget-boolean v6, p0, Lwb/m9;->g:Z

    .line 20
    .line 21
    iget-object v7, p0, Lwb/m9;->j:Ldb/c;

    .line 22
    .line 23
    iget-object v8, p0, Lwb/m9;->k:Lfg/a;

    .line 24
    .line 25
    invoke-direct/range {v3 .. v8}, Lwb/k3;-><init>(ILfg/l;ZLdb/c;Lfg/a;)V

    .line 26
    .line 27
    .line 28
    new-instance v0, Ls0/d;

    .line 29
    .line 30
    const v4, -0x5b5bf1d    # -2.6254E35f

    .line 31
    .line 32
    .line 33
    const/4 v5, 0x1

    .line 34
    invoke-direct {v0, v4, v3, v5}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 35
    .line 36
    .line 37
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 38
    .line 39
    .line 40
    sget-object v0, Lwb/p0;->p:Ls0/d;

    .line 41
    .line 42
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 43
    .line 44
    .line 45
    move v11, v6

    .line 46
    new-instance v6, Lsh/m;

    .line 47
    .line 48
    const/4 v12, 0x2

    .line 49
    iget-object v8, p0, Lwb/m9;->l:Lfg/l;

    .line 50
    .line 51
    iget-object v9, p0, Lwb/m9;->m:Lfg/p;

    .line 52
    .line 53
    iget-object v10, p0, Lwb/m9;->n:Lfg/l;

    .line 54
    .line 55
    invoke-direct/range {v6 .. v12}, Lsh/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lsf/b;Ljava/lang/Object;ZI)V

    .line 56
    .line 57
    .line 58
    new-instance v0, Ls0/d;

    .line 59
    .line 60
    const v3, -0xfd1ed1b

    .line 61
    .line 62
    .line 63
    invoke-direct {v0, v3, v6, v5}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 64
    .line 65
    .line 66
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 67
    .line 68
    .line 69
    if-nez v11, :cond_0

    .line 70
    .line 71
    sget-object v0, Lwb/p0;->q:Ls0/d;

    .line 72
    .line 73
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 74
    .line 75
    .line 76
    move-object v9, v7

    .line 77
    new-instance v7, Lc9/h0;

    .line 78
    .line 79
    move-object v10, v8

    .line 80
    const/16 v8, 0x15

    .line 81
    .line 82
    const/4 v12, 0x0

    .line 83
    iget-object v11, p0, Lwb/m9;->o:Ljava/util/ArrayList;

    .line 84
    .line 85
    invoke-direct/range {v7 .. v12}, Lc9/h0;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 86
    .line 87
    .line 88
    new-instance v0, Ls0/d;

    .line 89
    .line 90
    const v3, 0x6844c07e

    .line 91
    .line 92
    .line 93
    invoke-direct {v0, v3, v7, v5}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 94
    .line 95
    .line 96
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 97
    .line 98
    .line 99
    :cond_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 100
    .line 101
    return-object p1
.end method
