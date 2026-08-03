.class public final synthetic Lwb/qf;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:Lna/h;

.field public final synthetic h:Lfg/l;

.field public final synthetic i:Landroid/content/Context;

.field public final synthetic j:Lfg/l;

.field public final synthetic k:Ljava/util/List;

.field public final synthetic l:Z

.field public final synthetic m:Z

.field public final synthetic n:Lfg/a;

.field public final synthetic o:Lfg/a;

.field public final synthetic p:Lfg/a;


# direct methods
.method public synthetic constructor <init>(Lna/h;Lfg/l;Landroid/content/Context;Lfg/l;Ljava/util/List;ZZLfg/a;Lfg/a;Lfg/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/qf;->g:Lna/h;

    .line 5
    .line 6
    iput-object p2, p0, Lwb/qf;->h:Lfg/l;

    .line 7
    .line 8
    iput-object p3, p0, Lwb/qf;->i:Landroid/content/Context;

    .line 9
    .line 10
    iput-object p4, p0, Lwb/qf;->j:Lfg/l;

    .line 11
    .line 12
    iput-object p5, p0, Lwb/qf;->k:Ljava/util/List;

    .line 13
    .line 14
    iput-boolean p6, p0, Lwb/qf;->l:Z

    .line 15
    .line 16
    iput-boolean p7, p0, Lwb/qf;->m:Z

    .line 17
    .line 18
    iput-object p8, p0, Lwb/qf;->n:Lfg/a;

    .line 19
    .line 20
    iput-object p9, p0, Lwb/qf;->o:Lfg/a;

    .line 21
    .line 22
    iput-object p10, p0, Lwb/qf;->p:Lfg/a;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    check-cast p1, Lr/h;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Lwb/p0;->r6:Ls0/d;

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
    new-instance v3, Lwb/xc;

    .line 14
    .line 15
    iget-object v4, p0, Lwb/qf;->g:Lna/h;

    .line 16
    .line 17
    iget-object v5, p0, Lwb/qf;->h:Lfg/l;

    .line 18
    .line 19
    iget-object v6, p0, Lwb/qf;->i:Landroid/content/Context;

    .line 20
    .line 21
    iget-object v7, p0, Lwb/qf;->j:Lfg/l;

    .line 22
    .line 23
    iget-object v8, p0, Lwb/qf;->k:Ljava/util/List;

    .line 24
    .line 25
    invoke-direct/range {v3 .. v8}, Lwb/xc;-><init>(Lna/h;Lfg/l;Landroid/content/Context;Lfg/l;Ljava/util/List;)V

    .line 26
    .line 27
    .line 28
    new-instance v0, Ls0/d;

    .line 29
    .line 30
    const v4, 0x216da903

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
    sget-object v0, Lwb/p0;->s6:Ls0/d;

    .line 41
    .line 42
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 43
    .line 44
    .line 45
    new-instance v6, Lwb/ph;

    .line 46
    .line 47
    iget-boolean v7, p0, Lwb/qf;->l:Z

    .line 48
    .line 49
    iget-boolean v8, p0, Lwb/qf;->m:Z

    .line 50
    .line 51
    iget-object v9, p0, Lwb/qf;->n:Lfg/a;

    .line 52
    .line 53
    iget-object v10, p0, Lwb/qf;->o:Lfg/a;

    .line 54
    .line 55
    iget-object v11, p0, Lwb/qf;->p:Lfg/a;

    .line 56
    .line 57
    invoke-direct/range {v6 .. v11}, Lwb/ph;-><init>(ZZLfg/a;Lfg/a;Lfg/a;)V

    .line 58
    .line 59
    .line 60
    new-instance v0, Ls0/d;

    .line 61
    .line 62
    const v3, -0x417937bf

    .line 63
    .line 64
    .line 65
    invoke-direct {v0, v3, v6, v5}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 66
    .line 67
    .line 68
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 69
    .line 70
    .line 71
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 72
    .line 73
    return-object p1
.end method
