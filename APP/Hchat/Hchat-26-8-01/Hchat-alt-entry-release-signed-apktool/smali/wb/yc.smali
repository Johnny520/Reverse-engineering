.class public final synthetic Lwb/yc;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:Landroid/content/SharedPreferences;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Z

.field public final synthetic j:Lwb/q;

.field public final synthetic k:Ljava/lang/String;

.field public final synthetic l:Lfg/a;

.field public final synthetic m:Ljava/lang/String;

.field public final synthetic n:Ljava/util/List;

.field public final synthetic o:Lfg/a;

.field public final synthetic p:Li0/a1;

.field public final synthetic q:Li0/a1;

.field public final synthetic r:Li0/a1;

.field public final synthetic s:Li0/a1;

.field public final synthetic t:Li0/a1;

.field public final synthetic u:Li0/a1;

.field public final synthetic v:Li0/a1;

.field public final synthetic w:Li0/a1;

.field public final synthetic x:Li0/a1;

.field public final synthetic y:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Landroid/content/SharedPreferences;Ljava/lang/String;ZLwb/q;Ljava/lang/String;Lfg/a;Ljava/lang/String;Ljava/util/List;Lfg/a;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/yc;->g:Landroid/content/SharedPreferences;

    .line 5
    .line 6
    iput-object p2, p0, Lwb/yc;->h:Ljava/lang/String;

    .line 7
    .line 8
    iput-boolean p3, p0, Lwb/yc;->i:Z

    .line 9
    .line 10
    iput-object p4, p0, Lwb/yc;->j:Lwb/q;

    .line 11
    .line 12
    iput-object p5, p0, Lwb/yc;->k:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p6, p0, Lwb/yc;->l:Lfg/a;

    .line 15
    .line 16
    iput-object p7, p0, Lwb/yc;->m:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p8, p0, Lwb/yc;->n:Ljava/util/List;

    .line 19
    .line 20
    iput-object p9, p0, Lwb/yc;->o:Lfg/a;

    .line 21
    .line 22
    iput-object p10, p0, Lwb/yc;->p:Li0/a1;

    .line 23
    .line 24
    iput-object p11, p0, Lwb/yc;->q:Li0/a1;

    .line 25
    .line 26
    iput-object p12, p0, Lwb/yc;->r:Li0/a1;

    .line 27
    .line 28
    iput-object p13, p0, Lwb/yc;->s:Li0/a1;

    .line 29
    .line 30
    iput-object p14, p0, Lwb/yc;->t:Li0/a1;

    .line 31
    .line 32
    iput-object p15, p0, Lwb/yc;->u:Li0/a1;

    .line 33
    .line 34
    move-object/from16 p1, p16

    .line 35
    .line 36
    iput-object p1, p0, Lwb/yc;->v:Li0/a1;

    .line 37
    .line 38
    move-object/from16 p1, p17

    .line 39
    .line 40
    iput-object p1, p0, Lwb/yc;->w:Li0/a1;

    .line 41
    .line 42
    move-object/from16 p1, p18

    .line 43
    .line 44
    iput-object p1, p0, Lwb/yc;->x:Li0/a1;

    .line 45
    .line 46
    move-object/from16 p1, p19

    .line 47
    .line 48
    iput-object p1, p0, Lwb/yc;->y:Li0/a1;

    .line 49
    .line 50
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Lr/d;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    check-cast v2, Li0/h0;

    .line 10
    .line 11
    move-object/from16 v3, p3

    .line 12
    .line 13
    check-cast v3, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    and-int/lit8 v1, v3, 0x11

    .line 23
    .line 24
    const/16 v4, 0x10

    .line 25
    .line 26
    const/4 v5, 0x1

    .line 27
    if-eq v1, v4, :cond_0

    .line 28
    .line 29
    move v1, v5

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v1, 0x0

    .line 32
    :goto_0
    and-int/2addr v3, v5

    .line 33
    invoke-virtual {v2, v3, v1}, Li0/h0;->S(IZ)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    new-instance v6, Lwb/re;

    .line 40
    .line 41
    iget-object v7, v0, Lwb/yc;->g:Landroid/content/SharedPreferences;

    .line 42
    .line 43
    iget-object v8, v0, Lwb/yc;->h:Ljava/lang/String;

    .line 44
    .line 45
    iget-boolean v9, v0, Lwb/yc;->i:Z

    .line 46
    .line 47
    iget-object v10, v0, Lwb/yc;->j:Lwb/q;

    .line 48
    .line 49
    iget-object v11, v0, Lwb/yc;->k:Ljava/lang/String;

    .line 50
    .line 51
    iget-object v12, v0, Lwb/yc;->l:Lfg/a;

    .line 52
    .line 53
    iget-object v13, v0, Lwb/yc;->m:Ljava/lang/String;

    .line 54
    .line 55
    iget-object v14, v0, Lwb/yc;->n:Ljava/util/List;

    .line 56
    .line 57
    iget-object v15, v0, Lwb/yc;->o:Lfg/a;

    .line 58
    .line 59
    iget-object v1, v0, Lwb/yc;->p:Li0/a1;

    .line 60
    .line 61
    iget-object v3, v0, Lwb/yc;->q:Li0/a1;

    .line 62
    .line 63
    iget-object v4, v0, Lwb/yc;->r:Li0/a1;

    .line 64
    .line 65
    iget-object v5, v0, Lwb/yc;->s:Li0/a1;

    .line 66
    .line 67
    move-object/from16 v16, v1

    .line 68
    .line 69
    iget-object v1, v0, Lwb/yc;->t:Li0/a1;

    .line 70
    .line 71
    move-object/from16 v20, v1

    .line 72
    .line 73
    iget-object v1, v0, Lwb/yc;->u:Li0/a1;

    .line 74
    .line 75
    move-object/from16 v21, v1

    .line 76
    .line 77
    iget-object v1, v0, Lwb/yc;->v:Li0/a1;

    .line 78
    .line 79
    move-object/from16 v22, v1

    .line 80
    .line 81
    iget-object v1, v0, Lwb/yc;->w:Li0/a1;

    .line 82
    .line 83
    move-object/from16 v23, v1

    .line 84
    .line 85
    iget-object v1, v0, Lwb/yc;->x:Li0/a1;

    .line 86
    .line 87
    move-object/from16 v24, v1

    .line 88
    .line 89
    iget-object v1, v0, Lwb/yc;->y:Li0/a1;

    .line 90
    .line 91
    move-object/from16 v25, v1

    .line 92
    .line 93
    move-object/from16 v17, v3

    .line 94
    .line 95
    move-object/from16 v18, v4

    .line 96
    .line 97
    move-object/from16 v19, v5

    .line 98
    .line 99
    invoke-direct/range {v6 .. v25}, Lwb/re;-><init>(Landroid/content/SharedPreferences;Ljava/lang/String;ZLwb/q;Ljava/lang/String;Lfg/a;Ljava/lang/String;Ljava/util/List;Lfg/a;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;)V

    .line 100
    .line 101
    .line 102
    const v1, 0x5969b03f

    .line 103
    .line 104
    .line 105
    invoke-static {v1, v6, v2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    const/16 v3, 0x30

    .line 110
    .line 111
    const/4 v4, 0x0

    .line 112
    const/4 v5, 0x1

    .line 113
    invoke-static {v4, v1, v2, v3, v5}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 114
    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_1
    invoke-virtual {v2}, Li0/h0;->V()V

    .line 118
    .line 119
    .line 120
    :goto_1
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 121
    .line 122
    return-object v1
.end method
