.class public final synthetic Lic;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Z

.field public final synthetic f:Lhw;

.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Lex;


# direct methods
.method public synthetic constructor <init>(Lhw;Lpe0;ZLx01;Lcc;Ljn0;Lxw;I)V
    .locals 1

    .line 24
    const/4 v0, 0x0

    iput v0, p0, Lic;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lic;->f:Lhw;

    iput-object p2, p0, Lic;->h:Ljava/lang/Object;

    iput-boolean p3, p0, Lic;->e:Z

    iput-object p4, p0, Lic;->i:Ljava/lang/Object;

    iput-object p5, p0, Lic;->j:Ljava/lang/Object;

    iput-object p6, p0, Lic;->k:Ljava/lang/Object;

    iput-object p7, p0, Lic;->l:Lex;

    iput p8, p0, Lic;->g:I

    return-void
.end method

.method public synthetic constructor <init>(Lmh;Lmh;Lmh;Lww;ZLhw;Lhw;I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lic;->d:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lic;->h:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lic;->i:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lic;->j:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Lic;->k:Ljava/lang/Object;

    .line 14
    .line 15
    iput-boolean p5, p0, Lic;->e:Z

    .line 16
    .line 17
    iput-object p6, p0, Lic;->f:Lhw;

    .line 18
    .line 19
    iput-object p7, p0, Lic;->l:Lex;

    .line 20
    .line 21
    iput p8, p0, Lic;->g:I

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lic;->d:I

    .line 4
    .line 5
    sget-object v2, Lna1;->a:Lna1;

    .line 6
    .line 7
    iget v3, v0, Lic;->g:I

    .line 8
    .line 9
    iget-object v4, v0, Lic;->l:Lex;

    .line 10
    .line 11
    iget-object v5, v0, Lic;->k:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v6, v0, Lic;->j:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v7, v0, Lic;->i:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v8, v0, Lic;->h:Ljava/lang/Object;

    .line 18
    .line 19
    packed-switch v1, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    move-object v9, v8

    .line 23
    check-cast v9, Lmh;

    .line 24
    .line 25
    move-object v10, v7

    .line 26
    check-cast v10, Lmh;

    .line 27
    .line 28
    move-object v11, v6

    .line 29
    check-cast v11, Lmh;

    .line 30
    .line 31
    move-object v12, v5

    .line 32
    check-cast v12, Lww;

    .line 33
    .line 34
    move-object v15, v4

    .line 35
    check-cast v15, Lhw;

    .line 36
    .line 37
    move-object/from16 v16, p1

    .line 38
    .line 39
    check-cast v16, Lji;

    .line 40
    .line 41
    move-object/from16 v1, p2

    .line 42
    .line 43
    check-cast v1, Ljava/lang/Integer;

    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    or-int/lit8 v1, v3, 0x1

    .line 49
    .line 50
    invoke-static {v1}, Lj50;->A(I)I

    .line 51
    .line 52
    .line 53
    move-result v17

    .line 54
    iget-boolean v13, v0, Lic;->e:Z

    .line 55
    .line 56
    iget-object v14, v0, Lic;->f:Lhw;

    .line 57
    .line 58
    invoke-static/range {v9 .. v17}, Loi0;->c(Lmh;Lmh;Lmh;Lww;ZLhw;Lhw;Lji;I)V

    .line 59
    .line 60
    .line 61
    return-object v2

    .line 62
    :pswitch_0
    move-object/from16 v19, v8

    .line 63
    .line 64
    check-cast v19, Lpe0;

    .line 65
    .line 66
    move-object/from16 v21, v7

    .line 67
    .line 68
    check-cast v21, Lx01;

    .line 69
    .line 70
    move-object/from16 v22, v6

    .line 71
    .line 72
    check-cast v22, Lcc;

    .line 73
    .line 74
    move-object/from16 v23, v5

    .line 75
    .line 76
    check-cast v23, Ljn0;

    .line 77
    .line 78
    move-object/from16 v24, v4

    .line 79
    .line 80
    check-cast v24, Lxw;

    .line 81
    .line 82
    move-object/from16 v25, p1

    .line 83
    .line 84
    check-cast v25, Lji;

    .line 85
    .line 86
    move-object/from16 v1, p2

    .line 87
    .line 88
    check-cast v1, Ljava/lang/Integer;

    .line 89
    .line 90
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    or-int/lit8 v1, v3, 0x1

    .line 94
    .line 95
    invoke-static {v1}, Lj50;->A(I)I

    .line 96
    .line 97
    .line 98
    move-result v26

    .line 99
    iget-object v1, v0, Lic;->f:Lhw;

    .line 100
    .line 101
    iget-boolean v0, v0, Lic;->e:Z

    .line 102
    .line 103
    move/from16 v20, v0

    .line 104
    .line 105
    move-object/from16 v18, v1

    .line 106
    .line 107
    invoke-static/range {v18 .. v26}, Lo30;->h(Lhw;Lpe0;ZLx01;Lcc;Ljn0;Lxw;Lji;I)V

    .line 108
    .line 109
    .line 110
    return-object v2

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
