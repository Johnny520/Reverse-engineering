.class public final synthetic Lwb/wu;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Ljava/util/List;

.field public final synthetic i:Ljava/util/Set;

.field public final synthetic j:Z

.field public final synthetic k:Z

.field public final synthetic l:Z

.field public final synthetic m:Ljava/lang/String;

.field public final synthetic n:Z

.field public final synthetic o:Lfg/a;

.field public final synthetic p:Landroid/app/Activity;

.field public final synthetic q:Lfg/l;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/List;Ljava/util/Set;ZZZLjava/lang/String;ZLfg/a;Landroid/app/Activity;Lfg/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/wu;->g:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lwb/wu;->h:Ljava/util/List;

    .line 7
    .line 8
    iput-object p3, p0, Lwb/wu;->i:Ljava/util/Set;

    .line 9
    .line 10
    iput-boolean p4, p0, Lwb/wu;->j:Z

    .line 11
    .line 12
    iput-boolean p5, p0, Lwb/wu;->k:Z

    .line 13
    .line 14
    iput-boolean p6, p0, Lwb/wu;->l:Z

    .line 15
    .line 16
    iput-object p7, p0, Lwb/wu;->m:Ljava/lang/String;

    .line 17
    .line 18
    iput-boolean p8, p0, Lwb/wu;->n:Z

    .line 19
    .line 20
    iput-object p9, p0, Lwb/wu;->o:Lfg/a;

    .line 21
    .line 22
    iput-object p10, p0, Lwb/wu;->p:Landroid/app/Activity;

    .line 23
    .line 24
    iput-object p11, p0, Lwb/wu;->q:Lfg/l;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v6, p1

    .line 4
    .line 5
    check-cast v6, Lfg/a;

    .line 6
    .line 7
    move-object/from16 v13, p2

    .line 8
    .line 9
    check-cast v13, Li0/h0;

    .line 10
    .line 11
    move-object/from16 v1, p3

    .line 12
    .line 13
    check-cast v1, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    and-int/lit8 v2, v1, 0x6

    .line 23
    .line 24
    if-nez v2, :cond_1

    .line 25
    .line 26
    invoke-virtual {v13, v6}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    const/4 v2, 0x4

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 v2, 0x2

    .line 35
    :goto_0
    or-int/2addr v1, v2

    .line 36
    :cond_1
    move v14, v1

    .line 37
    and-int/lit8 v1, v14, 0x13

    .line 38
    .line 39
    const/16 v2, 0x12

    .line 40
    .line 41
    if-eq v1, v2, :cond_2

    .line 42
    .line 43
    const/4 v1, 0x1

    .line 44
    goto :goto_1

    .line 45
    :cond_2
    const/4 v1, 0x0

    .line 46
    :goto_1
    and-int/lit8 v2, v14, 0x1

    .line 47
    .line 48
    invoke-virtual {v13, v2, v1}, Li0/h0;->S(IZ)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_3

    .line 53
    .line 54
    new-instance v1, Lwb/yu;

    .line 55
    .line 56
    iget-object v2, v0, Lwb/wu;->h:Ljava/util/List;

    .line 57
    .line 58
    iget-object v3, v0, Lwb/wu;->i:Ljava/util/Set;

    .line 59
    .line 60
    iget-boolean v4, v0, Lwb/wu;->j:Z

    .line 61
    .line 62
    iget-boolean v5, v0, Lwb/wu;->k:Z

    .line 63
    .line 64
    iget-boolean v7, v0, Lwb/wu;->l:Z

    .line 65
    .line 66
    iget-object v8, v0, Lwb/wu;->m:Ljava/lang/String;

    .line 67
    .line 68
    iget-boolean v9, v0, Lwb/wu;->n:Z

    .line 69
    .line 70
    iget-object v10, v0, Lwb/wu;->o:Lfg/a;

    .line 71
    .line 72
    iget-object v11, v0, Lwb/wu;->p:Landroid/app/Activity;

    .line 73
    .line 74
    iget-object v12, v0, Lwb/wu;->q:Lfg/l;

    .line 75
    .line 76
    invoke-direct/range {v1 .. v12}, Lwb/yu;-><init>(Ljava/util/List;Ljava/util/Set;ZZLfg/a;ZLjava/lang/String;ZLfg/a;Landroid/app/Activity;Lfg/l;)V

    .line 77
    .line 78
    .line 79
    const v2, -0x2cd31213

    .line 80
    .line 81
    .line 82
    invoke-static {v2, v1, v13}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 83
    .line 84
    .line 85
    move-result-object v16

    .line 86
    shl-int/lit8 v1, v14, 0x18

    .line 87
    .line 88
    const/high16 v2, 0xe000000

    .line 89
    .line 90
    and-int/2addr v1, v2

    .line 91
    or-int/lit8 v18, v1, 0x6

    .line 92
    .line 93
    const/16 v19, 0xc00

    .line 94
    .line 95
    const/4 v1, 0x0

    .line 96
    iget-object v2, v0, Lwb/wu;->g:Ljava/lang/String;

    .line 97
    .line 98
    const-wide/16 v3, 0x0

    .line 99
    .line 100
    move-object v10, v6

    .line 101
    const-wide/16 v5, 0x0

    .line 102
    .line 103
    const-wide/16 v7, 0x0

    .line 104
    .line 105
    const/4 v9, 0x0

    .line 106
    const-wide/16 v11, 0x0

    .line 107
    .line 108
    move-object/from16 v17, v13

    .line 109
    .line 110
    const-wide/16 v13, 0x0

    .line 111
    .line 112
    const/4 v15, 0x0

    .line 113
    invoke-static/range {v1 .. v19}, Loh/h;->d(Ly0/o;Ljava/lang/String;JJJZLfg/a;JJZLs0/d;Li0/h0;II)V

    .line 114
    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_3
    move-object/from16 v17, v13

    .line 118
    .line 119
    invoke-virtual/range {v17 .. v17}, Li0/h0;->V()V

    .line 120
    .line 121
    .line 122
    :goto_2
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 123
    .line 124
    return-object v1
.end method
