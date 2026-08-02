.class public final synthetic Let0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Luh1;

.field public final synthetic k:J

.field public final synthetic l:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Luh1;JII)V
    .locals 0

    .line 16
    iput p6, p0, Let0;->h:I

    iput-object p1, p0, Let0;->i:Ljava/lang/Object;

    iput-object p2, p0, Let0;->j:Luh1;

    iput-wide p3, p0, Let0;->k:J

    iput p5, p0, Let0;->l:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lsx0;Luh1;JII)V
    .locals 0

    .line 1
    const/4 p5, 0x0

    .line 2
    iput p5, p0, Let0;->h:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Let0;->i:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Let0;->j:Luh1;

    .line 10
    .line 11
    iput-wide p3, p0, Let0;->k:J

    .line 12
    .line 13
    iput p6, p0, Let0;->l:I

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Let0;->h:I

    .line 4
    .line 5
    iget v2, v0, Let0;->l:I

    .line 6
    .line 7
    sget-object v3, La83;->a:La83;

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    iget-object v5, v0, Let0;->i:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    move-object v6, v5

    .line 16
    check-cast v6, Llw1;

    .line 17
    .line 18
    move-object/from16 v10, p1

    .line 19
    .line 20
    check-cast v10, Lpx;

    .line 21
    .line 22
    move-object/from16 v1, p2

    .line 23
    .line 24
    check-cast v1, Ljava/lang/Integer;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    or-int/lit8 v1, v2, 0x1

    .line 30
    .line 31
    invoke-static {v1}, Lpp0;->N(I)I

    .line 32
    .line 33
    .line 34
    move-result v11

    .line 35
    iget-object v7, v0, Let0;->j:Luh1;

    .line 36
    .line 37
    iget-wide v8, v0, Let0;->k:J

    .line 38
    .line 39
    invoke-static/range {v6 .. v11}, Lfx0;->b(Llw1;Luh1;JLpx;I)V

    .line 40
    .line 41
    .line 42
    return-object v3

    .line 43
    :pswitch_0
    move-object v12, v5

    .line 44
    check-cast v12, Lsx0;

    .line 45
    .line 46
    move-object/from16 v16, p1

    .line 47
    .line 48
    check-cast v16, Lpx;

    .line 49
    .line 50
    move-object/from16 v1, p2

    .line 51
    .line 52
    check-cast v1, Ljava/lang/Integer;

    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    or-int/lit8 v1, v2, 0x1

    .line 58
    .line 59
    invoke-static {v1}, Lpp0;->N(I)I

    .line 60
    .line 61
    .line 62
    move-result v17

    .line 63
    iget-object v13, v0, Let0;->j:Luh1;

    .line 64
    .line 65
    iget-wide v14, v0, Let0;->k:J

    .line 66
    .line 67
    invoke-static/range {v12 .. v17}, Lfx0;->a(Lsx0;Luh1;JLpx;I)V

    .line 68
    .line 69
    .line 70
    return-object v3

    .line 71
    :pswitch_1
    check-cast v5, Lsx0;

    .line 72
    .line 73
    move-object/from16 v8, p1

    .line 74
    .line 75
    check-cast v8, Lpx;

    .line 76
    .line 77
    move-object/from16 v1, p2

    .line 78
    .line 79
    check-cast v1, Ljava/lang/Integer;

    .line 80
    .line 81
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    invoke-static {v4}, Lpp0;->N(I)I

    .line 85
    .line 86
    .line 87
    move-result v9

    .line 88
    move-object v4, v5

    .line 89
    iget-object v5, v0, Let0;->j:Luh1;

    .line 90
    .line 91
    iget-wide v6, v0, Let0;->k:J

    .line 92
    .line 93
    iget v10, v0, Let0;->l:I

    .line 94
    .line 95
    invoke-static/range {v4 .. v10}, Lci0;->l(Lsx0;Luh1;JLpx;II)V

    .line 96
    .line 97
    .line 98
    return-object v3

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
