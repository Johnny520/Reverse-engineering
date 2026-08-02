.class public final synthetic Lhw;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:I

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Boolean;Ljava/lang/Object;Lia1;Lin0;I)V
    .locals 1

    .line 18
    const/4 v0, 0x1

    iput v0, p0, Lhw;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhw;->k:Ljava/lang/Object;

    iput-object p2, p0, Lhw;->i:Ljava/lang/Object;

    iput-object p3, p0, Lhw;->l:Ljava/lang/Object;

    iput-object p4, p0, Lhw;->m:Ljava/lang/Object;

    iput p5, p0, Lhw;->j:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Luh1;Lnn0;Lin0;II)V
    .locals 0

    .line 19
    const/4 p5, 0x2

    iput p5, p0, Lhw;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhw;->k:Ljava/lang/Object;

    iput-object p2, p0, Lhw;->l:Ljava/lang/Object;

    iput-object p3, p0, Lhw;->i:Ljava/lang/Object;

    iput-object p4, p0, Lhw;->m:Ljava/lang/Object;

    iput p6, p0, Lhw;->j:I

    return-void
.end method

.method public synthetic constructor <init>(Lkw;Lfk;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lhw;->h:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lhw;->k:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lhw;->l:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lhw;->i:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Lhw;->m:Ljava/lang/Object;

    .line 14
    .line 15
    iput p5, p0, Lhw;->j:I

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lhw;->h:I

    .line 4
    .line 5
    iget v2, v0, Lhw;->j:I

    .line 6
    .line 7
    iget-object v3, v0, Lhw;->m:Ljava/lang/Object;

    .line 8
    .line 9
    sget-object v4, La83;->a:La83;

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    iget-object v6, v0, Lhw;->l:Ljava/lang/Object;

    .line 13
    .line 14
    iget-object v7, v0, Lhw;->k:Ljava/lang/Object;

    .line 15
    .line 16
    packed-switch v1, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    move-object v8, v7

    .line 20
    check-cast v8, Ljava/lang/String;

    .line 21
    .line 22
    move-object v9, v6

    .line 23
    check-cast v9, Luh1;

    .line 24
    .line 25
    iget-object v1, v0, Lhw;->i:Ljava/lang/Object;

    .line 26
    .line 27
    move-object v10, v1

    .line 28
    check-cast v10, Lnn0;

    .line 29
    .line 30
    move-object v11, v3

    .line 31
    check-cast v11, Lin0;

    .line 32
    .line 33
    move-object/from16 v12, p1

    .line 34
    .line 35
    check-cast v12, Lpx;

    .line 36
    .line 37
    move-object/from16 v1, p2

    .line 38
    .line 39
    check-cast v1, Ljava/lang/Integer;

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-static {v5}, Lpp0;->N(I)I

    .line 45
    .line 46
    .line 47
    move-result v13

    .line 48
    iget v14, v0, Lhw;->j:I

    .line 49
    .line 50
    invoke-static/range {v8 .. v14}, Ltp0;->c(Ljava/lang/String;Luh1;Lnn0;Lin0;Lpx;II)V

    .line 51
    .line 52
    .line 53
    return-object v4

    .line 54
    :pswitch_0
    move-object v15, v7

    .line 55
    check-cast v15, Ljava/lang/Boolean;

    .line 56
    .line 57
    move-object/from16 v17, v6

    .line 58
    .line 59
    check-cast v17, Lia1;

    .line 60
    .line 61
    move-object/from16 v18, v3

    .line 62
    .line 63
    check-cast v18, Lin0;

    .line 64
    .line 65
    move-object/from16 v19, p1

    .line 66
    .line 67
    check-cast v19, Lpx;

    .line 68
    .line 69
    move-object/from16 v1, p2

    .line 70
    .line 71
    check-cast v1, Ljava/lang/Integer;

    .line 72
    .line 73
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    or-int/lit8 v1, v2, 0x1

    .line 77
    .line 78
    invoke-static {v1}, Lpp0;->N(I)I

    .line 79
    .line 80
    .line 81
    move-result v20

    .line 82
    iget-object v0, v0, Lhw;->i:Ljava/lang/Object;

    .line 83
    .line 84
    move-object/from16 v16, v0

    .line 85
    .line 86
    invoke-static/range {v15 .. v20}, Leu;->h(Ljava/lang/Boolean;Ljava/lang/Object;Lia1;Lin0;Lpx;I)V

    .line 87
    .line 88
    .line 89
    return-object v4

    .line 90
    :pswitch_1
    check-cast v7, Lkw;

    .line 91
    .line 92
    check-cast v6, Lfk;

    .line 93
    .line 94
    move-object/from16 v9, p1

    .line 95
    .line 96
    check-cast v9, Lpx;

    .line 97
    .line 98
    move-object/from16 v1, p2

    .line 99
    .line 100
    check-cast v1, Ljava/lang/Integer;

    .line 101
    .line 102
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    invoke-static {v2}, Lpp0;->N(I)I

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    or-int/lit8 v10, v1, 0x1

    .line 110
    .line 111
    move-object v5, v7

    .line 112
    iget-object v7, v0, Lhw;->i:Ljava/lang/Object;

    .line 113
    .line 114
    iget-object v8, v0, Lhw;->m:Ljava/lang/Object;

    .line 115
    .line 116
    invoke-virtual/range {v5 .. v10}, Lkw;->f(Lfk;Ljava/lang/Object;Ljava/lang/Object;Lpx;I)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    return-object v4

    .line 120
    nop

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
