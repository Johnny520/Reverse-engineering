.class public final synthetic Lgr1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Z

.field public final synthetic j:I

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:Lun0;

.field public final synthetic n:Lun0;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lun0;Lun0;ZII)V
    .locals 0

    .line 1
    iput p7, p0, Lgr1;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lgr1;->k:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lgr1;->l:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lgr1;->m:Lun0;

    .line 8
    .line 9
    iput-object p4, p0, Lgr1;->n:Lun0;

    .line 10
    .line 11
    iput-boolean p5, p0, Lgr1;->i:Z

    .line 12
    .line 13
    iput p6, p0, Lgr1;->j:I

    .line 14
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lgr1;->h:I

    .line 4
    .line 5
    sget-object v2, La83;->a:La83;

    .line 6
    .line 7
    iget v3, v0, Lgr1;->j:I

    .line 8
    .line 9
    iget-object v4, v0, Lgr1;->n:Lun0;

    .line 10
    .line 11
    iget-object v5, v0, Lgr1;->m:Lun0;

    .line 12
    .line 13
    iget-object v6, v0, Lgr1;->k:Ljava/lang/Object;

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    move-object v7, v6

    .line 19
    check-cast v7, Ljava/lang/String;

    .line 20
    .line 21
    iget-object v1, v0, Lgr1;->l:Ljava/lang/Object;

    .line 22
    .line 23
    move-object v8, v1

    .line 24
    check-cast v8, Ljava/lang/String;

    .line 25
    .line 26
    move-object v9, v5

    .line 27
    check-cast v9, Lmn0;

    .line 28
    .line 29
    move-object v10, v4

    .line 30
    check-cast v10, Lmn0;

    .line 31
    .line 32
    move-object/from16 v12, p1

    .line 33
    .line 34
    check-cast v12, Lpx;

    .line 35
    .line 36
    move-object/from16 v1, p2

    .line 37
    .line 38
    check-cast v1, Ljava/lang/Integer;

    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    or-int/lit8 v1, v3, 0x1

    .line 44
    .line 45
    invoke-static {v1}, Lpp0;->N(I)I

    .line 46
    .line 47
    .line 48
    move-result v13

    .line 49
    iget-boolean v11, v0, Lgr1;->i:Z

    .line 50
    .line 51
    invoke-static/range {v7 .. v13}, Lsp0;->h(Ljava/lang/String;Ljava/lang/String;Lmn0;Lmn0;ZLpx;I)V

    .line 52
    .line 53
    .line 54
    return-object v2

    .line 55
    :pswitch_0
    move-object v14, v6

    .line 56
    check-cast v14, Ljava/util/List;

    .line 57
    .line 58
    move-object/from16 v16, v5

    .line 59
    .line 60
    check-cast v16, Lin0;

    .line 61
    .line 62
    move-object/from16 v17, v4

    .line 63
    .line 64
    check-cast v17, Lin0;

    .line 65
    .line 66
    move-object/from16 v19, p1

    .line 67
    .line 68
    check-cast v19, Lpx;

    .line 69
    .line 70
    move-object/from16 v1, p2

    .line 71
    .line 72
    check-cast v1, Ljava/lang/Integer;

    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 75
    .line 76
    .line 77
    or-int/lit8 v1, v3, 0x1

    .line 78
    .line 79
    invoke-static {v1}, Lpp0;->N(I)I

    .line 80
    .line 81
    .line 82
    move-result v20

    .line 83
    iget-object v15, v0, Lgr1;->l:Ljava/lang/Object;

    .line 84
    .line 85
    iget-boolean v0, v0, Lgr1;->i:Z

    .line 86
    .line 87
    move/from16 v18, v0

    .line 88
    .line 89
    invoke-static/range {v14 .. v20}, Leu;->j(Ljava/util/List;Ljava/lang/Object;Lin0;Lin0;ZLpx;I)V

    .line 90
    .line 91
    .line 92
    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
