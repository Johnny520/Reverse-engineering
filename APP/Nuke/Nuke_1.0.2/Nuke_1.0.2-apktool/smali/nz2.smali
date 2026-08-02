.class public final synthetic Lnz2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lnn0;


# instance fields
.field public final synthetic h:Lt91;

.field public final synthetic i:Lb03;

.field public final synthetic j:Lk03;

.field public final synthetic k:Z

.field public final synthetic l:Z

.field public final synthetic m:Lus1;

.field public final synthetic n:Lw73;

.field public final synthetic o:Lin0;

.field public final synthetic p:I


# direct methods
.method public synthetic constructor <init>(Lt91;Lb03;Lk03;ZZLus1;Lw73;Lin0;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnz2;->h:Lt91;

    .line 5
    .line 6
    iput-object p2, p0, Lnz2;->i:Lb03;

    .line 7
    .line 8
    iput-object p3, p0, Lnz2;->j:Lk03;

    .line 9
    .line 10
    iput-boolean p4, p0, Lnz2;->k:Z

    .line 11
    .line 12
    iput-boolean p5, p0, Lnz2;->l:Z

    .line 13
    .line 14
    iput-object p6, p0, Lnz2;->m:Lus1;

    .line 15
    .line 16
    iput-object p7, p0, Lnz2;->n:Lw73;

    .line 17
    .line 18
    iput-object p8, p0, Lnz2;->o:Lin0;

    .line 19
    .line 20
    iput p9, p0, Lnz2;->p:I

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Luh1;

    .line 6
    .line 7
    move-object/from16 v1, p2

    .line 8
    .line 9
    check-cast v1, Lpx;

    .line 10
    .line 11
    move-object/from16 v2, p3

    .line 12
    .line 13
    check-cast v2, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    check-cast v1, Lgo0;

    .line 19
    .line 20
    const v2, 0x32c59664

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v2}, Lgo0;->W(I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Lgo0;->L()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    sget-object v3, Lnx;->a:Leb;

    .line 31
    .line 32
    if-ne v2, v3, :cond_0

    .line 33
    .line 34
    new-instance v2, Le13;

    .line 35
    .line 36
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v2}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    :cond_0
    move-object v10, v2

    .line 43
    check-cast v10, Le13;

    .line 44
    .line 45
    invoke-virtual {v1}, Lgo0;->L()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    if-ne v2, v3, :cond_1

    .line 50
    .line 51
    new-instance v2, Ln40;

    .line 52
    .line 53
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1, v2}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    :cond_1
    move-object v13, v2

    .line 60
    check-cast v13, Ln40;

    .line 61
    .line 62
    new-instance v16, Lmz2;

    .line 63
    .line 64
    iget-object v5, v0, Lnz2;->h:Lt91;

    .line 65
    .line 66
    iget-object v6, v0, Lnz2;->i:Lb03;

    .line 67
    .line 68
    iget-object v7, v0, Lnz2;->j:Lk03;

    .line 69
    .line 70
    iget-boolean v8, v0, Lnz2;->k:Z

    .line 71
    .line 72
    iget-boolean v9, v0, Lnz2;->l:Z

    .line 73
    .line 74
    iget-object v11, v0, Lnz2;->m:Lus1;

    .line 75
    .line 76
    iget-object v12, v0, Lnz2;->n:Lw73;

    .line 77
    .line 78
    iget-object v14, v0, Lnz2;->o:Lin0;

    .line 79
    .line 80
    iget v15, v0, Lnz2;->p:I

    .line 81
    .line 82
    move-object/from16 v4, v16

    .line 83
    .line 84
    invoke-direct/range {v4 .. v15}, Lmz2;-><init>(Lt91;Lb03;Lk03;ZZLe13;Lus1;Lw73;Ln40;Lin0;I)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1, v4}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    invoke-virtual {v1}, Lgo0;->L()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    if-nez v0, :cond_2

    .line 96
    .line 97
    if-ne v2, v3, :cond_3

    .line 98
    .line 99
    :cond_2
    new-instance v14, Le2;

    .line 100
    .line 101
    const/16 v21, 0x0

    .line 102
    .line 103
    const/16 v22, 0x8

    .line 104
    .line 105
    const/4 v15, 0x1

    .line 106
    const-class v17, Lmz2;

    .line 107
    .line 108
    const-string v18, "process"

    .line 109
    .line 110
    const-string v19, "process-ZmokQxo(Landroid/view/KeyEvent;)Z"

    .line 111
    .line 112
    const/16 v20, 0x0

    .line 113
    .line 114
    move-object/from16 v16, v4

    .line 115
    .line 116
    invoke-direct/range {v14 .. v22}, Le2;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1, v14}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    move-object v2, v14

    .line 123
    :cond_3
    check-cast v2, Lyn0;

    .line 124
    .line 125
    check-cast v2, Lin0;

    .line 126
    .line 127
    invoke-static {v2}, Lup0;->B(Lin0;)Luh1;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    const/4 v2, 0x0

    .line 132
    invoke-virtual {v1, v2}, Lgo0;->p(Z)V

    .line 133
    .line 134
    .line 135
    return-object v0
.end method
