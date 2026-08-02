.class public final synthetic Lkr;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Lzq;

.field public final synthetic j:Z

.field public final synthetic k:Lxm0;

.field public final synthetic l:Lxm0;

.field public final synthetic m:Lin0;


# direct methods
.method public synthetic constructor <init>(Lzq;ZLxm0;Lxm0;Lin0;II)V
    .locals 0

    .line 1
    iput p7, p0, Lkr;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lkr;->i:Lzq;

    .line 4
    .line 5
    iput-boolean p2, p0, Lkr;->j:Z

    .line 6
    .line 7
    iput-object p3, p0, Lkr;->k:Lxm0;

    .line 8
    .line 9
    iput-object p4, p0, Lkr;->l:Lxm0;

    .line 10
    .line 11
    iput-object p5, p0, Lkr;->m:Lin0;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lkr;->h:I

    .line 4
    .line 5
    sget-object v2, La83;->a:La83;

    .line 6
    .line 7
    const/16 v3, 0x181

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object/from16 v9, p1

    .line 13
    .line 14
    check-cast v9, Lpx;

    .line 15
    .line 16
    move-object/from16 v1, p2

    .line 17
    .line 18
    check-cast v1, Ljava/lang/Integer;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-static {v3}, Lpp0;->N(I)I

    .line 24
    .line 25
    .line 26
    move-result v10

    .line 27
    iget-object v4, v0, Lkr;->i:Lzq;

    .line 28
    .line 29
    iget-boolean v5, v0, Lkr;->j:Z

    .line 30
    .line 31
    iget-object v6, v0, Lkr;->k:Lxm0;

    .line 32
    .line 33
    iget-object v7, v0, Lkr;->l:Lxm0;

    .line 34
    .line 35
    iget-object v8, v0, Lkr;->m:Lin0;

    .line 36
    .line 37
    invoke-static/range {v4 .. v10}, Lyr;->e(Lzq;ZLxm0;Lxm0;Lin0;Lpx;I)V

    .line 38
    .line 39
    .line 40
    return-object v2

    .line 41
    :pswitch_0
    move-object/from16 v16, p1

    .line 42
    .line 43
    check-cast v16, Lpx;

    .line 44
    .line 45
    move-object/from16 v1, p2

    .line 46
    .line 47
    check-cast v1, Ljava/lang/Integer;

    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    invoke-static {v3}, Lpp0;->N(I)I

    .line 53
    .line 54
    .line 55
    move-result v17

    .line 56
    iget-object v11, v0, Lkr;->i:Lzq;

    .line 57
    .line 58
    iget-boolean v12, v0, Lkr;->j:Z

    .line 59
    .line 60
    iget-object v13, v0, Lkr;->k:Lxm0;

    .line 61
    .line 62
    iget-object v14, v0, Lkr;->l:Lxm0;

    .line 63
    .line 64
    iget-object v15, v0, Lkr;->m:Lin0;

    .line 65
    .line 66
    invoke-static/range {v11 .. v17}, Lyr;->e(Lzq;ZLxm0;Lxm0;Lin0;Lpx;I)V

    .line 67
    .line 68
    .line 69
    return-object v2

    .line 70
    :pswitch_1
    move-object/from16 v8, p1

    .line 71
    .line 72
    check-cast v8, Lpx;

    .line 73
    .line 74
    move-object/from16 v1, p2

    .line 75
    .line 76
    check-cast v1, Ljava/lang/Integer;

    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    invoke-static {v3}, Lpp0;->N(I)I

    .line 82
    .line 83
    .line 84
    move-result v9

    .line 85
    iget-object v3, v0, Lkr;->i:Lzq;

    .line 86
    .line 87
    iget-boolean v4, v0, Lkr;->j:Z

    .line 88
    .line 89
    iget-object v5, v0, Lkr;->k:Lxm0;

    .line 90
    .line 91
    iget-object v6, v0, Lkr;->l:Lxm0;

    .line 92
    .line 93
    iget-object v7, v0, Lkr;->m:Lin0;

    .line 94
    .line 95
    invoke-static/range {v3 .. v9}, Lyr;->e(Lzq;ZLxm0;Lxm0;Lin0;Lpx;I)V

    .line 96
    .line 97
    .line 98
    return-object v2

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
