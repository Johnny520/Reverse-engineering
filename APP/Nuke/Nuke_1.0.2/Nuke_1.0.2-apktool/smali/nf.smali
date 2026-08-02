.class public final synthetic Lnf;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Z

.field public final synthetic j:Lin0;

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lc73;ZLin0;Lin0;I)V
    .locals 0

    .line 1
    const/4 p5, 0x0

    .line 2
    iput p5, p0, Lnf;->h:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lnf;->k:Ljava/lang/Object;

    .line 8
    .line 9
    iput-boolean p2, p0, Lnf;->i:Z

    .line 10
    .line 11
    iput-object p3, p0, Lnf;->j:Lin0;

    .line 12
    .line 13
    iput-object p4, p0, Lnf;->l:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;ZLin0;I)V
    .locals 0

    .line 16
    const/4 p5, 0x1

    iput p5, p0, Lnf;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnf;->k:Ljava/lang/Object;

    iput-object p2, p0, Lnf;->l:Ljava/lang/Object;

    iput-boolean p3, p0, Lnf;->i:Z

    iput-object p4, p0, Lnf;->j:Lin0;

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lnf;->h:I

    .line 4
    .line 5
    sget-object v2, La83;->a:La83;

    .line 6
    .line 7
    iget-object v3, v0, Lnf;->l:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, v0, Lnf;->k:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object v5, v4

    .line 15
    check-cast v5, Ljava/lang/String;

    .line 16
    .line 17
    move-object v6, v3

    .line 18
    check-cast v6, Ljava/lang/String;

    .line 19
    .line 20
    move-object/from16 v9, p1

    .line 21
    .line 22
    check-cast v9, Lpx;

    .line 23
    .line 24
    move-object/from16 v1, p2

    .line 25
    .line 26
    check-cast v1, Ljava/lang/Integer;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x1

    .line 32
    invoke-static {v1}, Lpp0;->N(I)I

    .line 33
    .line 34
    .line 35
    move-result v10

    .line 36
    iget-boolean v7, v0, Lnf;->i:Z

    .line 37
    .line 38
    iget-object v8, v0, Lnf;->j:Lin0;

    .line 39
    .line 40
    invoke-static/range {v5 .. v10}, Lyr;->b(Ljava/lang/String;Ljava/lang/String;ZLin0;Lpx;I)V

    .line 41
    .line 42
    .line 43
    return-object v2

    .line 44
    :pswitch_0
    move-object v11, v4

    .line 45
    check-cast v11, Lc73;

    .line 46
    .line 47
    move-object v14, v3

    .line 48
    check-cast v14, Lin0;

    .line 49
    .line 50
    move-object/from16 v15, p1

    .line 51
    .line 52
    check-cast v15, Lpx;

    .line 53
    .line 54
    move-object/from16 v1, p2

    .line 55
    .line 56
    check-cast v1, Ljava/lang/Integer;

    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    const/16 v1, 0x9

    .line 62
    .line 63
    invoke-static {v1}, Lpp0;->N(I)I

    .line 64
    .line 65
    .line 66
    move-result v16

    .line 67
    iget-boolean v12, v0, Lnf;->i:Z

    .line 68
    .line 69
    iget-object v13, v0, Lnf;->j:Lin0;

    .line 70
    .line 71
    invoke-static/range {v11 .. v16}, Lte;->d(Lc73;ZLin0;Lin0;Lpx;I)V

    .line 72
    .line 73
    .line 74
    return-object v2

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
