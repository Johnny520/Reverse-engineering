.class public final synthetic Lwb/n9;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:Landroid/content/SharedPreferences;

.field public final synthetic h:I

.field public final synthetic i:Lfg/a;

.field public final synthetic j:Li0/a1;

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Li0/a1;

.field public final synthetic m:Li0/a1;

.field public final synthetic n:Li0/a1;

.field public final synthetic o:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Landroid/content/SharedPreferences;ILfg/a;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/n9;->g:Landroid/content/SharedPreferences;

    .line 5
    .line 6
    iput p2, p0, Lwb/n9;->h:I

    .line 7
    .line 8
    iput-object p3, p0, Lwb/n9;->i:Lfg/a;

    .line 9
    .line 10
    iput-object p4, p0, Lwb/n9;->j:Li0/a1;

    .line 11
    .line 12
    iput-object p5, p0, Lwb/n9;->k:Li0/a1;

    .line 13
    .line 14
    iput-object p6, p0, Lwb/n9;->l:Li0/a1;

    .line 15
    .line 16
    iput-object p7, p0, Lwb/n9;->m:Li0/a1;

    .line 17
    .line 18
    iput-object p8, p0, Lwb/n9;->n:Li0/a1;

    .line 19
    .line 20
    iput-object p9, p0, Lwb/n9;->o:Li0/a1;

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
    sget-object v0, Lwb/p0;->d0:Ls0/d;

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
    new-instance v3, Lwb/mc;

    .line 14
    .line 15
    iget-object v4, p0, Lwb/n9;->g:Landroid/content/SharedPreferences;

    .line 16
    .line 17
    iget v5, p0, Lwb/n9;->h:I

    .line 18
    .line 19
    iget-object v6, p0, Lwb/n9;->i:Lfg/a;

    .line 20
    .line 21
    iget-object v7, p0, Lwb/n9;->j:Li0/a1;

    .line 22
    .line 23
    iget-object v8, p0, Lwb/n9;->k:Li0/a1;

    .line 24
    .line 25
    iget-object v9, p0, Lwb/n9;->l:Li0/a1;

    .line 26
    .line 27
    invoke-direct/range {v3 .. v9}, Lwb/mc;-><init>(Landroid/content/SharedPreferences;ILfg/a;Li0/a1;Li0/a1;Li0/a1;)V

    .line 28
    .line 29
    .line 30
    move-object v6, v8

    .line 31
    new-instance v0, Ls0/d;

    .line 32
    .line 33
    const v5, 0x4132870f

    .line 34
    .line 35
    .line 36
    const/4 v12, 0x1

    .line 37
    invoke-direct {v0, v5, v3, v12}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 38
    .line 39
    .line 40
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 41
    .line 42
    .line 43
    invoke-interface {v7}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, Ljava/lang/Boolean;

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_1

    .line 54
    .line 55
    invoke-interface {v6}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    check-cast v0, Ljava/lang/Boolean;

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_0

    .line 66
    .line 67
    invoke-interface {v9}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    check-cast v0, Ljava/lang/Boolean;

    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-eqz v0, :cond_1

    .line 78
    .line 79
    :cond_0
    sget-object v0, Lwb/p0;->e0:Ls0/d;

    .line 80
    .line 81
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 82
    .line 83
    .line 84
    move-object v5, v4

    .line 85
    new-instance v4, Lwb/s7;

    .line 86
    .line 87
    const/4 v11, 0x1

    .line 88
    iget-object v7, p0, Lwb/n9;->m:Li0/a1;

    .line 89
    .line 90
    iget-object v8, p0, Lwb/n9;->n:Li0/a1;

    .line 91
    .line 92
    iget-object v10, p0, Lwb/n9;->o:Li0/a1;

    .line 93
    .line 94
    invoke-direct/range {v4 .. v11}, Lwb/s7;-><init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V

    .line 95
    .line 96
    .line 97
    new-instance v0, Ls0/d;

    .line 98
    .line 99
    const v3, -0x34a2aeec    # -1.4504212E7f

    .line 100
    .line 101
    .line 102
    invoke-direct {v0, v3, v4, v12}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 103
    .line 104
    .line 105
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 106
    .line 107
    .line 108
    :cond_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 109
    .line 110
    return-object p1
.end method
