.class public final synthetic Lwb/xu;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:I

.field public final synthetic i:I

.field public final synthetic j:Ljava/lang/Integer;

.field public final synthetic k:Landroid/app/Activity;

.field public final synthetic l:Lfg/l;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;IILjava/lang/Integer;Landroid/app/Activity;Lfg/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/xu;->g:Ljava/lang/String;

    .line 5
    .line 6
    iput p2, p0, Lwb/xu;->h:I

    .line 7
    .line 8
    iput p3, p0, Lwb/xu;->i:I

    .line 9
    .line 10
    iput-object p4, p0, Lwb/xu;->j:Ljava/lang/Integer;

    .line 11
    .line 12
    iput-object p5, p0, Lwb/xu;->k:Landroid/app/Activity;

    .line 13
    .line 14
    iput-object p6, p0, Lwb/xu;->l:Lfg/l;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v5, p1

    .line 4
    .line 5
    check-cast v5, Lfg/a;

    .line 6
    .line 7
    move-object/from16 v8, p2

    .line 8
    .line 9
    check-cast v8, Li0/h0;

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
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    and-int/lit8 v2, v1, 0x6

    .line 23
    .line 24
    if-nez v2, :cond_1

    .line 25
    .line 26
    invoke-virtual {v8, v5}, Li0/h0;->h(Ljava/lang/Object;)Z

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
    move v9, v1

    .line 37
    and-int/lit8 v1, v9, 0x13

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
    and-int/lit8 v2, v9, 0x1

    .line 47
    .line 48
    invoke-virtual {v8, v2, v1}, Li0/h0;->S(IZ)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_3

    .line 53
    .line 54
    new-instance v1, Lwb/zu;

    .line 55
    .line 56
    iget v2, v0, Lwb/xu;->h:I

    .line 57
    .line 58
    iget v3, v0, Lwb/xu;->i:I

    .line 59
    .line 60
    iget-object v4, v0, Lwb/xu;->j:Ljava/lang/Integer;

    .line 61
    .line 62
    iget-object v6, v0, Lwb/xu;->k:Landroid/app/Activity;

    .line 63
    .line 64
    iget-object v7, v0, Lwb/xu;->l:Lfg/l;

    .line 65
    .line 66
    invoke-direct/range {v1 .. v7}, Lwb/zu;-><init>(IILjava/lang/Integer;Lfg/a;Landroid/app/Activity;Lfg/l;)V

    .line 67
    .line 68
    .line 69
    const v2, -0x709646bb

    .line 70
    .line 71
    .line 72
    invoke-static {v2, v1, v8}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 73
    .line 74
    .line 75
    move-result-object v16

    .line 76
    shl-int/lit8 v1, v9, 0x18

    .line 77
    .line 78
    const/high16 v2, 0xe000000

    .line 79
    .line 80
    and-int/2addr v1, v2

    .line 81
    or-int/lit8 v18, v1, 0x6

    .line 82
    .line 83
    const/16 v19, 0xc00

    .line 84
    .line 85
    const/4 v1, 0x0

    .line 86
    iget-object v2, v0, Lwb/xu;->g:Ljava/lang/String;

    .line 87
    .line 88
    const-wide/16 v3, 0x0

    .line 89
    .line 90
    move-object v10, v5

    .line 91
    const-wide/16 v5, 0x0

    .line 92
    .line 93
    move-object/from16 v17, v8

    .line 94
    .line 95
    const-wide/16 v7, 0x0

    .line 96
    .line 97
    const/4 v9, 0x0

    .line 98
    const-wide/16 v11, 0x0

    .line 99
    .line 100
    const-wide/16 v13, 0x0

    .line 101
    .line 102
    const/4 v15, 0x0

    .line 103
    invoke-static/range {v1 .. v19}, Loh/h;->d(Ly0/o;Ljava/lang/String;JJJZLfg/a;JJZLs0/d;Li0/h0;II)V

    .line 104
    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_3
    move-object/from16 v17, v8

    .line 108
    .line 109
    invoke-virtual/range {v17 .. v17}, Li0/h0;->V()V

    .line 110
    .line 111
    .line 112
    :goto_2
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 113
    .line 114
    return-object v1
.end method
