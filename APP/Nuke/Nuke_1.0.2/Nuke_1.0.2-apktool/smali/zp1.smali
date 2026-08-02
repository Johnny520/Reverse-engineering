.class public final synthetic Lzp1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Luh1;

.field public final synthetic k:Ljava/lang/String;

.field public final synthetic l:Lmn0;

.field public final synthetic m:Z

.field public final synthetic n:Lxm0;

.field public final synthetic o:Lin0;

.field public final synthetic p:I

.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/Object;

.field public final synthetic s:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Luh1;Ljava/lang/String;Lmn0;Lmn0;Lmn0;ZLxm0;Lin0;II)V
    .locals 1

    .line 30
    const/4 v0, 0x1

    iput v0, p0, Lzp1;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzp1;->i:Ljava/lang/String;

    iput-object p2, p0, Lzp1;->j:Luh1;

    iput-object p3, p0, Lzp1;->k:Ljava/lang/String;

    iput-object p4, p0, Lzp1;->l:Lmn0;

    iput-object p5, p0, Lzp1;->r:Ljava/lang/Object;

    iput-object p6, p0, Lzp1;->s:Ljava/lang/Object;

    iput-boolean p7, p0, Lzp1;->m:Z

    iput-object p8, p0, Lzp1;->n:Lxm0;

    iput-object p9, p0, Lzp1;->o:Lin0;

    iput p10, p0, Lzp1;->p:I

    iput p11, p0, Lzp1;->q:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lxm0;Luh1;Ljava/lang/String;Lmn0;Ljava/lang/String;Lju;ZLin0;II)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lzp1;->h:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lzp1;->i:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p2, p0, Lzp1;->n:Lxm0;

    .line 10
    .line 11
    iput-object p3, p0, Lzp1;->j:Luh1;

    .line 12
    .line 13
    iput-object p4, p0, Lzp1;->k:Ljava/lang/String;

    .line 14
    .line 15
    iput-object p5, p0, Lzp1;->l:Lmn0;

    .line 16
    .line 17
    iput-object p6, p0, Lzp1;->r:Ljava/lang/Object;

    .line 18
    .line 19
    iput-object p7, p0, Lzp1;->s:Ljava/lang/Object;

    .line 20
    .line 21
    iput-boolean p8, p0, Lzp1;->m:Z

    .line 22
    .line 23
    iput-object p9, p0, Lzp1;->o:Lin0;

    .line 24
    .line 25
    iput p10, p0, Lzp1;->p:I

    .line 26
    .line 27
    iput p11, p0, Lzp1;->q:I

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lzp1;->h:I

    .line 4
    .line 5
    sget-object v2, La83;->a:La83;

    .line 6
    .line 7
    iget v3, v0, Lzp1;->p:I

    .line 8
    .line 9
    iget-object v4, v0, Lzp1;->s:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, v0, Lzp1;->r:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    move-object v10, v5

    .line 17
    check-cast v10, Lmn0;

    .line 18
    .line 19
    move-object v11, v4

    .line 20
    check-cast v11, Lmn0;

    .line 21
    .line 22
    move-object/from16 v15, p1

    .line 23
    .line 24
    check-cast v15, Lpx;

    .line 25
    .line 26
    move-object/from16 v1, p2

    .line 27
    .line 28
    check-cast v1, Ljava/lang/Integer;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    or-int/lit8 v1, v3, 0x1

    .line 34
    .line 35
    invoke-static {v1}, Lpp0;->N(I)I

    .line 36
    .line 37
    .line 38
    move-result v16

    .line 39
    iget-object v6, v0, Lzp1;->i:Ljava/lang/String;

    .line 40
    .line 41
    iget-object v7, v0, Lzp1;->j:Luh1;

    .line 42
    .line 43
    iget-object v8, v0, Lzp1;->k:Ljava/lang/String;

    .line 44
    .line 45
    iget-object v9, v0, Lzp1;->l:Lmn0;

    .line 46
    .line 47
    iget-boolean v12, v0, Lzp1;->m:Z

    .line 48
    .line 49
    iget-object v13, v0, Lzp1;->n:Lxm0;

    .line 50
    .line 51
    iget-object v14, v0, Lzp1;->o:Lin0;

    .line 52
    .line 53
    iget v0, v0, Lzp1;->q:I

    .line 54
    .line 55
    move/from16 v17, v0

    .line 56
    .line 57
    invoke-static/range {v6 .. v17}, Lsp0;->g(Ljava/lang/String;Luh1;Ljava/lang/String;Lmn0;Lmn0;Lmn0;ZLxm0;Lin0;Lpx;II)V

    .line 58
    .line 59
    .line 60
    return-object v2

    .line 61
    :pswitch_0
    move-object/from16 v22, v5

    .line 62
    .line 63
    check-cast v22, Ljava/lang/String;

    .line 64
    .line 65
    move-object/from16 v23, v4

    .line 66
    .line 67
    check-cast v23, Lju;

    .line 68
    .line 69
    move-object/from16 v26, p1

    .line 70
    .line 71
    check-cast v26, Lpx;

    .line 72
    .line 73
    move-object/from16 v1, p2

    .line 74
    .line 75
    check-cast v1, Ljava/lang/Integer;

    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    or-int/lit8 v1, v3, 0x1

    .line 81
    .line 82
    invoke-static {v1}, Lpp0;->N(I)I

    .line 83
    .line 84
    .line 85
    move-result v27

    .line 86
    iget-object v1, v0, Lzp1;->i:Ljava/lang/String;

    .line 87
    .line 88
    iget-object v3, v0, Lzp1;->n:Lxm0;

    .line 89
    .line 90
    iget-object v4, v0, Lzp1;->j:Luh1;

    .line 91
    .line 92
    iget-object v5, v0, Lzp1;->k:Ljava/lang/String;

    .line 93
    .line 94
    iget-object v6, v0, Lzp1;->l:Lmn0;

    .line 95
    .line 96
    iget-boolean v7, v0, Lzp1;->m:Z

    .line 97
    .line 98
    iget-object v8, v0, Lzp1;->o:Lin0;

    .line 99
    .line 100
    iget v0, v0, Lzp1;->q:I

    .line 101
    .line 102
    move/from16 v28, v0

    .line 103
    .line 104
    move-object/from16 v17, v1

    .line 105
    .line 106
    move-object/from16 v18, v3

    .line 107
    .line 108
    move-object/from16 v19, v4

    .line 109
    .line 110
    move-object/from16 v20, v5

    .line 111
    .line 112
    move-object/from16 v21, v6

    .line 113
    .line 114
    move/from16 v24, v7

    .line 115
    .line 116
    move-object/from16 v25, v8

    .line 117
    .line 118
    invoke-static/range {v17 .. v28}, Lqp0;->h(Ljava/lang/String;Lxm0;Luh1;Ljava/lang/String;Lmn0;Ljava/lang/String;Lju;ZLin0;Lpx;II)V

    .line 119
    .line 120
    .line 121
    return-object v2

    .line 122
    nop

    .line 123
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
