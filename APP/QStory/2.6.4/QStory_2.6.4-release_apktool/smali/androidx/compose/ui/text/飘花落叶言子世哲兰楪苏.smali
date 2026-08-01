.class public final Landroidx/compose/ui/text/飘花落叶言子世哲兰楪苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final 飘花落叶言子楪世哲兰苏:Landroidx/compose/ui/text/飘花落叶言子世哲兰楪苏;


# instance fields
.field public final 飘花落叶言子楪世哲苏兰:Landroidx/compose/ui/text/飘花落叶言子楪兰苏世哲;

.field public final 飘花落叶言子楪世苏兰哲:Landroidx/compose/ui/text/飘花落叶言子楪哲兰苏世;

.field public final 飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;


# direct methods
.method static constructor <clinit>()V
    .locals 14

    .line 1
    new-instance v0, Landroidx/compose/ui/text/飘花落叶言子世哲兰楪苏;

    .line 2
    .line 3
    const-wide/16 v11, 0x0

    .line 4
    .line 5
    const v13, 0xffffff

    .line 6
    .line 7
    .line 8
    const-wide/16 v1, 0x0

    .line 9
    .line 10
    const-wide/16 v3, 0x0

    .line 11
    .line 12
    const/4 v5, 0x0

    .line 13
    const-wide/16 v6, 0x0

    .line 14
    .line 15
    const-wide/16 v8, 0x0

    .line 16
    .line 17
    const/4 v10, 0x0

    .line 18
    invoke-direct/range {v0 .. v13}, Landroidx/compose/ui/text/飘花落叶言子世哲兰楪苏;-><init>(JJLandroidx/compose/ui/text/font/飘花落叶言子楪哲兰苏世;JJIJI)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Landroidx/compose/ui/text/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世哲兰苏:Landroidx/compose/ui/text/飘花落叶言子世哲兰楪苏;

    .line 22
    .line 23
    return-void
.end method

.method public constructor <init>(JJLandroidx/compose/ui/text/font/飘花落叶言子楪哲兰苏世;JJIJI)V
    .locals 24

    .line 1
    move/from16 v0, p13

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    sget-wide v1, Landroidx/compose/ui/graphics/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏世兰哲:J

    .line 8
    .line 9
    move-wide v4, v1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-wide/from16 v4, p1

    .line 12
    .line 13
    :goto_0
    and-int/lit8 v1, v0, 0x2

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    sget-wide v1, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲苏兰:J

    .line 18
    .line 19
    move-wide v6, v1

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    move-wide/from16 v6, p3

    .line 22
    .line 23
    :goto_1
    and-int/lit8 v1, v0, 0x4

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    if-eqz v1, :cond_2

    .line 27
    .line 28
    move-object v8, v2

    .line 29
    goto :goto_2

    .line 30
    :cond_2
    move-object/from16 v8, p5

    .line 31
    .line 32
    :goto_2
    and-int/lit16 v1, v0, 0x80

    .line 33
    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    sget-wide v9, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲苏兰:J

    .line 37
    .line 38
    move-wide v13, v9

    .line 39
    goto :goto_3

    .line 40
    :cond_3
    move-wide/from16 v13, p6

    .line 41
    .line 42
    :goto_3
    and-int/lit16 v1, v0, 0x800

    .line 43
    .line 44
    if-eqz v1, :cond_4

    .line 45
    .line 46
    sget-wide v9, Landroidx/compose/ui/graphics/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏世兰哲:J

    .line 47
    .line 48
    move-wide/from16 v18, v9

    .line 49
    .line 50
    goto :goto_4

    .line 51
    :cond_4
    move-wide/from16 v18, p8

    .line 52
    .line 53
    :goto_4
    const v1, 0x8000

    .line 54
    .line 55
    .line 56
    and-int/2addr v1, v0

    .line 57
    if-eqz v1, :cond_5

    .line 58
    .line 59
    const/4 v1, 0x0

    .line 60
    goto :goto_5

    .line 61
    :cond_5
    move/from16 v1, p10

    .line 62
    .line 63
    :goto_5
    const/high16 v3, 0x20000

    .line 64
    .line 65
    and-int/2addr v0, v3

    .line 66
    if-eqz v0, :cond_6

    .line 67
    .line 68
    sget-wide v9, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲苏兰:J

    .line 69
    .line 70
    move-wide/from16 v22, v9

    .line 71
    .line 72
    goto :goto_6

    .line 73
    :cond_6
    move-wide/from16 v22, p11

    .line 74
    .line 75
    :goto_6
    new-instance v3, Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;

    .line 76
    .line 77
    const/4 v9, 0x0

    .line 78
    const/4 v10, 0x0

    .line 79
    const/4 v11, 0x0

    .line 80
    const/4 v12, 0x0

    .line 81
    const/4 v15, 0x0

    .line 82
    const/16 v16, 0x0

    .line 83
    .line 84
    const/16 v17, 0x0

    .line 85
    .line 86
    const/16 v20, 0x0

    .line 87
    .line 88
    const/16 v21, 0x0

    .line 89
    .line 90
    invoke-direct/range {v3 .. v21}, Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;-><init>(JJLandroidx/compose/ui/text/font/飘花落叶言子楪哲兰苏世;Landroidx/compose/ui/text/font/飘花落叶言子楪哲苏兰世;Landroidx/compose/ui/text/font/飘花落叶言子楪哲兰世苏;Landroidx/compose/ui/text/font/飘花落叶言子楪苏兰世哲;Ljava/lang/String;JL飘花落叶言子苏哲楪兰世/飘花落叶言子楪世苏哲兰;L飘花落叶言子苏哲楪兰世/飘花落叶言子楪哲苏世兰;L飘花落叶言子苏世哲兰楪/飘花落叶言子楪世苏兰哲;JL飘花落叶言子苏哲楪兰世/飘花落叶言子楪苏兰世哲;Landroidx/compose/ui/graphics/飘花落叶言子世兰楪苏哲;)V

    .line 91
    .line 92
    .line 93
    new-instance v0, Landroidx/compose/ui/text/飘花落叶言子楪哲兰苏世;

    .line 94
    .line 95
    const/4 v4, 0x0

    .line 96
    const/4 v5, 0x0

    .line 97
    const/4 v6, 0x0

    .line 98
    const/4 v7, 0x0

    .line 99
    const/4 v8, 0x0

    .line 100
    move-object/from16 p1, v0

    .line 101
    .line 102
    move/from16 p2, v1

    .line 103
    .line 104
    move-object/from16 p7, v2

    .line 105
    .line 106
    move/from16 p3, v4

    .line 107
    .line 108
    move-object/from16 p6, v5

    .line 109
    .line 110
    move-object/from16 p8, v6

    .line 111
    .line 112
    move/from16 p9, v7

    .line 113
    .line 114
    move/from16 p10, v8

    .line 115
    .line 116
    move-object/from16 p11, v9

    .line 117
    .line 118
    move-wide/from16 p4, v22

    .line 119
    .line 120
    invoke-direct/range {p1 .. p11}, Landroidx/compose/ui/text/飘花落叶言子楪哲兰苏世;-><init>(IIJL飘花落叶言子苏哲楪兰世/飘花落叶言子楪哲苏兰世;Landroidx/compose/ui/text/飘花落叶言子楪兰世哲苏;L飘花落叶言子苏哲楪兰世/飘花落叶言子楪苏哲世兰;IIL飘花落叶言子苏哲楪兰世/飘花落叶言子楪哲兰苏世;)V

    .line 121
    .line 122
    .line 123
    const/4 v1, 0x0

    .line 124
    move-object/from16 v2, p0

    .line 125
    .line 126
    invoke-direct {v2, v3, v0, v1}, Landroidx/compose/ui/text/飘花落叶言子世哲兰楪苏;-><init>(Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;Landroidx/compose/ui/text/飘花落叶言子楪哲兰苏世;Landroidx/compose/ui/text/飘花落叶言子楪兰苏世哲;)V

    .line 127
    .line 128
    .line 129
    return-void
.end method

.method public constructor <init>(Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;Landroidx/compose/ui/text/飘花落叶言子楪哲兰苏世;)V
    .locals 2

    .line 130
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    iget-object v0, p2, Landroidx/compose/ui/text/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰苏哲:Landroidx/compose/ui/text/飘花落叶言子楪兰世哲苏;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 132
    :cond_0
    new-instance v1, Landroidx/compose/ui/text/飘花落叶言子楪兰苏世哲;

    invoke-direct {v1, v0}, Landroidx/compose/ui/text/飘花落叶言子楪兰苏世哲;-><init>(Landroidx/compose/ui/text/飘花落叶言子楪兰世哲苏;)V

    move-object v0, v1

    .line 133
    :goto_0
    invoke-direct {p0, p1, p2, v0}, Landroidx/compose/ui/text/飘花落叶言子世哲兰楪苏;-><init>(Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;Landroidx/compose/ui/text/飘花落叶言子楪哲兰苏世;Landroidx/compose/ui/text/飘花落叶言子楪兰苏世哲;)V

    return-void
.end method

.method public constructor <init>(Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;Landroidx/compose/ui/text/飘花落叶言子楪哲兰苏世;Landroidx/compose/ui/text/飘花落叶言子楪兰苏世哲;)V
    .locals 0

    .line 134
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 135
    iput-object p1, p0, Landroidx/compose/ui/text/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;

    .line 136
    iput-object p2, p0, Landroidx/compose/ui/text/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世苏兰哲:Landroidx/compose/ui/text/飘花落叶言子楪哲兰苏世;

    .line 137
    iput-object p3, p0, Landroidx/compose/ui/text/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世哲苏兰:Landroidx/compose/ui/text/飘花落叶言子楪兰苏世哲;

    return-void
.end method

.method public static 飘花落叶言子楪世哲兰苏(Landroidx/compose/ui/text/飘花落叶言子世哲兰楪苏;JJLandroidx/compose/ui/text/font/飘花落叶言子楪哲兰苏世;JIJI)Landroidx/compose/ui/text/飘花落叶言子世哲兰楪苏;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p11

    .line 4
    .line 5
    and-int/lit8 v2, v1, 0x2

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    sget-wide v2, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲苏兰:J

    .line 10
    .line 11
    move-wide v9, v2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-wide/from16 v9, p3

    .line 14
    .line 15
    :goto_0
    and-int/lit8 v2, v1, 0x4

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    move-object v11, v3

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move-object/from16 v11, p5

    .line 23
    .line 24
    :goto_1
    and-int/lit16 v2, v1, 0x80

    .line 25
    .line 26
    if-eqz v2, :cond_2

    .line 27
    .line 28
    sget-wide v4, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲苏兰:J

    .line 29
    .line 30
    move-wide/from16 v16, v4

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_2
    move-wide/from16 v16, p6

    .line 34
    .line 35
    :goto_2
    sget-wide v21, Landroidx/compose/ui/graphics/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏世兰哲:J

    .line 36
    .line 37
    const v2, 0x8000

    .line 38
    .line 39
    .line 40
    and-int/2addr v2, v1

    .line 41
    if-eqz v2, :cond_3

    .line 42
    .line 43
    const/4 v2, 0x0

    .line 44
    goto :goto_3

    .line 45
    :cond_3
    move/from16 v2, p8

    .line 46
    .line 47
    :goto_3
    const/high16 v4, 0x20000

    .line 48
    .line 49
    and-int/2addr v1, v4

    .line 50
    if-eqz v1, :cond_4

    .line 51
    .line 52
    sget-wide v4, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲苏兰:J

    .line 53
    .line 54
    move-wide/from16 v26, v4

    .line 55
    .line 56
    goto :goto_4

    .line 57
    :cond_4
    move-wide/from16 v26, p9

    .line 58
    .line 59
    :goto_4
    iget-object v4, v0, Landroidx/compose/ui/text/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;

    .line 60
    .line 61
    const/4 v7, 0x0

    .line 62
    const/high16 v8, 0x7fc00000    # Float.NaN

    .line 63
    .line 64
    const/4 v12, 0x0

    .line 65
    const/4 v13, 0x0

    .line 66
    const/4 v14, 0x0

    .line 67
    const/4 v15, 0x0

    .line 68
    const/16 v18, 0x0

    .line 69
    .line 70
    const/16 v19, 0x0

    .line 71
    .line 72
    const/16 v20, 0x0

    .line 73
    .line 74
    const/16 v23, 0x0

    .line 75
    .line 76
    const/16 v24, 0x0

    .line 77
    .line 78
    const/16 v25, 0x0

    .line 79
    .line 80
    move-wide/from16 v5, p1

    .line 81
    .line 82
    invoke-static/range {v4 .. v25}, Landroidx/compose/ui/text/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;JLandroidx/compose/ui/graphics/飘花落叶言子楪兰世苏哲;FJLandroidx/compose/ui/text/font/飘花落叶言子楪哲兰苏世;Landroidx/compose/ui/text/font/飘花落叶言子楪哲苏兰世;Landroidx/compose/ui/text/font/飘花落叶言子楪哲兰世苏;Landroidx/compose/ui/text/font/飘花落叶言子楪苏兰世哲;Ljava/lang/String;JL飘花落叶言子苏哲楪兰世/飘花落叶言子楪世苏哲兰;L飘花落叶言子苏哲楪兰世/飘花落叶言子楪哲苏世兰;L飘花落叶言子苏世哲兰楪/飘花落叶言子楪世苏兰哲;JL飘花落叶言子苏哲楪兰世/飘花落叶言子楪苏兰世哲;Landroidx/compose/ui/graphics/飘花落叶言子世兰楪苏哲;Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世哲兰苏;)Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    iget-object v4, v0, Landroidx/compose/ui/text/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世苏兰哲:Landroidx/compose/ui/text/飘花落叶言子楪哲兰苏世;

    .line 87
    .line 88
    const/4 v5, 0x0

    .line 89
    const/4 v6, 0x0

    .line 90
    const/4 v8, 0x0

    .line 91
    const/4 v9, 0x0

    .line 92
    const/4 v10, 0x0

    .line 93
    move/from16 p2, v2

    .line 94
    .line 95
    move-object/from16 p7, v3

    .line 96
    .line 97
    move-object/from16 p1, v4

    .line 98
    .line 99
    move/from16 p3, v5

    .line 100
    .line 101
    move-object/from16 p6, v6

    .line 102
    .line 103
    move-object/from16 p8, v7

    .line 104
    .line 105
    move/from16 p9, v8

    .line 106
    .line 107
    move/from16 p10, v9

    .line 108
    .line 109
    move-object/from16 p11, v10

    .line 110
    .line 111
    move-wide/from16 p4, v26

    .line 112
    .line 113
    invoke-static/range {p1 .. p11}, Landroidx/compose/ui/text/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/text/飘花落叶言子楪哲兰苏世;IIJL飘花落叶言子苏哲楪兰世/飘花落叶言子楪哲苏兰世;Landroidx/compose/ui/text/飘花落叶言子楪兰世哲苏;L飘花落叶言子苏哲楪兰世/飘花落叶言子楪苏哲世兰;IIL飘花落叶言子苏哲楪兰世/飘花落叶言子楪哲兰苏世;)Landroidx/compose/ui/text/飘花落叶言子楪哲兰苏世;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    iget-object v3, v0, Landroidx/compose/ui/text/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;

    .line 118
    .line 119
    if-ne v3, v1, :cond_5

    .line 120
    .line 121
    iget-object v3, v0, Landroidx/compose/ui/text/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世苏兰哲:Landroidx/compose/ui/text/飘花落叶言子楪哲兰苏世;

    .line 122
    .line 123
    if-ne v3, v2, :cond_5

    .line 124
    .line 125
    return-object v0

    .line 126
    :cond_5
    new-instance v0, Landroidx/compose/ui/text/飘花落叶言子世哲兰楪苏;

    .line 127
    .line 128
    invoke-direct {v0, v1, v2}, Landroidx/compose/ui/text/飘花落叶言子世哲兰楪苏;-><init>(Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;Landroidx/compose/ui/text/飘花落叶言子楪哲兰苏世;)V

    .line 129
    .line 130
    .line 131
    return-object v0
.end method

.method public static 飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/text/飘花落叶言子世哲兰楪苏;JLandroidx/compose/ui/text/font/飘花落叶言子楪哲兰苏世;Landroidx/compose/ui/text/font/飘花落叶言子楪苏兰世哲;JJL飘花落叶言子苏哲楪兰世/飘花落叶言子楪苏哲世兰;I)Landroidx/compose/ui/text/飘花落叶言子世哲兰楪苏;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p10

    .line 4
    .line 5
    sget-object v2, Landroidx/compose/material3/internal/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/text/飘花落叶言子楪兰苏世哲;

    .line 6
    .line 7
    iget-object v3, v0, Landroidx/compose/ui/text/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;

    .line 8
    .line 9
    iget-object v3, v3, Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言子苏哲楪兰世/飘花落叶言子楪哲世兰苏;

    .line 10
    .line 11
    invoke-interface {v3}, L飘花落叶言子苏哲楪兰世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲()J

    .line 12
    .line 13
    .line 14
    move-result-wide v3

    .line 15
    and-int/lit8 v5, v1, 0x2

    .line 16
    .line 17
    if-eqz v5, :cond_0

    .line 18
    .line 19
    iget-object v5, v0, Landroidx/compose/ui/text/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;

    .line 20
    .line 21
    iget-wide v5, v5, Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世苏兰哲:J

    .line 22
    .line 23
    move-wide v9, v5

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-wide/from16 v9, p1

    .line 26
    .line 27
    :goto_0
    and-int/lit8 v5, v1, 0x4

    .line 28
    .line 29
    if-eqz v5, :cond_1

    .line 30
    .line 31
    iget-object v5, v0, Landroidx/compose/ui/text/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;

    .line 32
    .line 33
    iget-object v5, v5, Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世哲苏兰:Landroidx/compose/ui/text/font/飘花落叶言子楪哲兰苏世;

    .line 34
    .line 35
    move-object v11, v5

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    move-object/from16 v11, p3

    .line 38
    .line 39
    :goto_1
    iget-object v5, v0, Landroidx/compose/ui/text/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;

    .line 40
    .line 41
    iget-object v12, v5, Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世哲兰苏:Landroidx/compose/ui/text/font/飘花落叶言子楪哲苏兰世;

    .line 42
    .line 43
    iget-object v13, v5, Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世兰苏哲:Landroidx/compose/ui/text/font/飘花落叶言子楪哲兰世苏;

    .line 44
    .line 45
    and-int/lit8 v6, v1, 0x20

    .line 46
    .line 47
    if-eqz v6, :cond_2

    .line 48
    .line 49
    iget-object v6, v5, Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世兰哲苏:Landroidx/compose/ui/text/font/飘花落叶言子楪苏兰世哲;

    .line 50
    .line 51
    move-object v14, v6

    .line 52
    goto :goto_2

    .line 53
    :cond_2
    move-object/from16 v14, p4

    .line 54
    .line 55
    :goto_2
    iget-object v15, v5, Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪苏世哲兰:Ljava/lang/String;

    .line 56
    .line 57
    and-int/lit16 v6, v1, 0x80

    .line 58
    .line 59
    if-eqz v6, :cond_3

    .line 60
    .line 61
    iget-wide v6, v5, Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪苏世兰哲:J

    .line 62
    .line 63
    move-wide/from16 v16, v6

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_3
    move-wide/from16 v16, p5

    .line 67
    .line 68
    :goto_3
    iget-object v6, v5, Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪苏哲世兰:L飘花落叶言子苏哲楪兰世/飘花落叶言子楪世苏哲兰;

    .line 69
    .line 70
    iget-object v7, v5, Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪苏哲兰世:L飘花落叶言子苏哲楪兰世/飘花落叶言子楪哲苏世兰;

    .line 71
    .line 72
    iget-object v8, v5, Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪苏兰世哲:L飘花落叶言子苏世哲兰楪/飘花落叶言子楪世苏兰哲;

    .line 73
    .line 74
    move-object/from16 v18, v2

    .line 75
    .line 76
    iget-wide v1, v5, Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪苏兰哲世:J

    .line 77
    .line 78
    move-wide/from16 v21, v1

    .line 79
    .line 80
    iget-object v1, v5, Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪哲世苏兰:L飘花落叶言子苏哲楪兰世/飘花落叶言子楪苏兰世哲;

    .line 81
    .line 82
    iget-object v2, v5, Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪哲世兰苏:Landroidx/compose/ui/graphics/飘花落叶言子世兰楪苏哲;

    .line 83
    .line 84
    move-object/from16 v23, v1

    .line 85
    .line 86
    iget-object v1, v5, Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪哲苏世兰:Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世哲兰苏;

    .line 87
    .line 88
    move-object/from16 v25, v1

    .line 89
    .line 90
    iget-object v1, v0, Landroidx/compose/ui/text/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世苏兰哲:Landroidx/compose/ui/text/飘花落叶言子楪哲兰苏世;

    .line 91
    .line 92
    move-object/from16 v24, v2

    .line 93
    .line 94
    iget v2, v1, Landroidx/compose/ui/text/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:I

    .line 95
    .line 96
    move/from16 p1, v2

    .line 97
    .line 98
    iget v2, v1, Landroidx/compose/ui/text/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲:I

    .line 99
    .line 100
    const/high16 v19, 0x20000

    .line 101
    .line 102
    and-int v19, p10, v19

    .line 103
    .line 104
    if-eqz v19, :cond_4

    .line 105
    .line 106
    move-object/from16 v19, v6

    .line 107
    .line 108
    move-object/from16 v20, v7

    .line 109
    .line 110
    iget-wide v6, v1, Landroidx/compose/ui/text/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰:J

    .line 111
    .line 112
    move-wide/from16 v26, v6

    .line 113
    .line 114
    goto :goto_4

    .line 115
    :cond_4
    move-object/from16 v19, v6

    .line 116
    .line 117
    move-object/from16 v20, v7

    .line 118
    .line 119
    move-wide/from16 v26, p7

    .line 120
    .line 121
    :goto_4
    iget-object v6, v1, Landroidx/compose/ui/text/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲兰苏:L飘花落叶言子苏哲楪兰世/飘花落叶言子楪哲苏兰世;

    .line 122
    .line 123
    const/high16 v7, 0x80000

    .line 124
    .line 125
    and-int v7, p10, v7

    .line 126
    .line 127
    if-eqz v7, :cond_5

    .line 128
    .line 129
    iget-object v0, v0, Landroidx/compose/ui/text/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世哲苏兰:Landroidx/compose/ui/text/飘花落叶言子楪兰苏世哲;

    .line 130
    .line 131
    goto :goto_5

    .line 132
    :cond_5
    move-object/from16 v0, v18

    .line 133
    .line 134
    :goto_5
    const/high16 v7, 0x100000

    .line 135
    .line 136
    and-int v7, p10, v7

    .line 137
    .line 138
    if-eqz v7, :cond_6

    .line 139
    .line 140
    iget-object v7, v1, Landroidx/compose/ui/text/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏:L飘花落叶言子苏哲楪兰世/飘花落叶言子楪苏哲世兰;

    .line 141
    .line 142
    move-object/from16 v28, v7

    .line 143
    .line 144
    goto :goto_6

    .line 145
    :cond_6
    move-object/from16 v28, p9

    .line 146
    .line 147
    :goto_6
    iget v7, v1, Landroidx/compose/ui/text/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰:I

    .line 148
    .line 149
    move/from16 p2, v2

    .line 150
    .line 151
    iget v2, v1, Landroidx/compose/ui/text/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世兰哲:I

    .line 152
    .line 153
    iget-object v1, v1, Landroidx/compose/ui/text/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲世兰:L飘花落叶言子苏哲楪兰世/飘花落叶言子楪哲兰苏世;

    .line 154
    .line 155
    move-object/from16 p10, v1

    .line 156
    .line 157
    new-instance v1, Landroidx/compose/ui/text/飘花落叶言子世哲兰楪苏;

    .line 158
    .line 159
    move/from16 v18, v7

    .line 160
    .line 161
    new-instance v7, Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;

    .line 162
    .line 163
    move/from16 p9, v2

    .line 164
    .line 165
    iget-object v2, v5, Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言子苏哲楪兰世/飘花落叶言子楪哲世兰苏;

    .line 166
    .line 167
    move-object/from16 p5, v6

    .line 168
    .line 169
    move-object/from16 p0, v7

    .line 170
    .line 171
    invoke-interface {v2}, L飘花落叶言子苏哲楪兰世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲()J

    .line 172
    .line 173
    .line 174
    move-result-wide v6

    .line 175
    invoke-static {v3, v4, v6, v7}, Landroidx/compose/ui/graphics/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世哲苏兰(JJ)Z

    .line 176
    .line 177
    .line 178
    move-result v2

    .line 179
    if-eqz v2, :cond_7

    .line 180
    .line 181
    iget-object v2, v5, Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言子苏哲楪兰世/飘花落叶言子楪哲世兰苏;

    .line 182
    .line 183
    :goto_7
    move-object v7, v8

    .line 184
    move-object v8, v2

    .line 185
    move/from16 v2, v18

    .line 186
    .line 187
    move-object/from16 v18, v19

    .line 188
    .line 189
    move-object/from16 v19, v20

    .line 190
    .line 191
    move-object/from16 v20, v7

    .line 192
    .line 193
    move-object/from16 v7, p0

    .line 194
    .line 195
    goto :goto_8

    .line 196
    :cond_7
    const-wide/16 v5, 0x10

    .line 197
    .line 198
    cmp-long v2, v3, v5

    .line 199
    .line 200
    if-eqz v2, :cond_8

    .line 201
    .line 202
    new-instance v2, L飘花落叶言子苏哲楪兰世/飘花落叶言子楪世哲苏兰;

    .line 203
    .line 204
    invoke-direct {v2, v3, v4}, L飘花落叶言子苏哲楪兰世/飘花落叶言子楪世哲苏兰;-><init>(J)V

    .line 205
    .line 206
    .line 207
    goto :goto_7

    .line 208
    :cond_8
    sget-object v2, L飘花落叶言子苏哲楪兰世/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言子苏哲楪兰世/飘花落叶言子楪哲世苏兰;

    .line 209
    .line 210
    goto :goto_7

    .line 211
    :goto_8
    invoke-direct/range {v7 .. v25}, Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;-><init>(L飘花落叶言子苏哲楪兰世/飘花落叶言子楪哲世兰苏;JLandroidx/compose/ui/text/font/飘花落叶言子楪哲兰苏世;Landroidx/compose/ui/text/font/飘花落叶言子楪哲苏兰世;Landroidx/compose/ui/text/font/飘花落叶言子楪哲兰世苏;Landroidx/compose/ui/text/font/飘花落叶言子楪苏兰世哲;Ljava/lang/String;JL飘花落叶言子苏哲楪兰世/飘花落叶言子楪世苏哲兰;L飘花落叶言子苏哲楪兰世/飘花落叶言子楪哲苏世兰;L飘花落叶言子苏世哲兰楪/飘花落叶言子楪世苏兰哲;JL飘花落叶言子苏哲楪兰世/飘花落叶言子楪苏兰世哲;Landroidx/compose/ui/graphics/飘花落叶言子世兰楪苏哲;Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世哲兰苏;)V

    .line 212
    .line 213
    .line 214
    new-instance v3, Landroidx/compose/ui/text/飘花落叶言子楪哲兰苏世;

    .line 215
    .line 216
    if-eqz v0, :cond_9

    .line 217
    .line 218
    iget-object v4, v0, Landroidx/compose/ui/text/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/text/飘花落叶言子楪兰世哲苏;

    .line 219
    .line 220
    :goto_9
    move/from16 p8, v2

    .line 221
    .line 222
    move-object/from16 p0, v3

    .line 223
    .line 224
    move-object/from16 p6, v4

    .line 225
    .line 226
    move-wide/from16 p3, v26

    .line 227
    .line 228
    move-object/from16 p7, v28

    .line 229
    .line 230
    goto :goto_a

    .line 231
    :cond_9
    const/4 v4, 0x0

    .line 232
    goto :goto_9

    .line 233
    :goto_a
    invoke-direct/range {p0 .. p10}, Landroidx/compose/ui/text/飘花落叶言子楪哲兰苏世;-><init>(IIJL飘花落叶言子苏哲楪兰世/飘花落叶言子楪哲苏兰世;Landroidx/compose/ui/text/飘花落叶言子楪兰世哲苏;L飘花落叶言子苏哲楪兰世/飘花落叶言子楪苏哲世兰;IIL飘花落叶言子苏哲楪兰世/飘花落叶言子楪哲兰苏世;)V

    .line 234
    .line 235
    .line 236
    move-object/from16 v2, p0

    .line 237
    .line 238
    invoke-direct {v1, v7, v2, v0}, Landroidx/compose/ui/text/飘花落叶言子世哲兰楪苏;-><init>(Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;Landroidx/compose/ui/text/飘花落叶言子楪哲兰苏世;Landroidx/compose/ui/text/飘花落叶言子楪兰苏世哲;)V

    .line 239
    .line 240
    .line 241
    return-object v1
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Landroidx/compose/ui/text/飘花落叶言子世哲兰楪苏;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Landroidx/compose/ui/text/飘花落叶言子世哲兰楪苏;

    .line 12
    .line 13
    iget-object v1, p1, Landroidx/compose/ui/text/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;

    .line 14
    .line 15
    iget-object v3, p0, Landroidx/compose/ui/text/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;

    .line 16
    .line 17
    invoke-static {v3, v1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, Landroidx/compose/ui/text/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世苏兰哲:Landroidx/compose/ui/text/飘花落叶言子楪哲兰苏世;

    .line 25
    .line 26
    iget-object v3, p1, Landroidx/compose/ui/text/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世苏兰哲:Landroidx/compose/ui/text/飘花落叶言子楪哲兰苏世;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget-object p0, p0, Landroidx/compose/ui/text/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世哲苏兰:Landroidx/compose/ui/text/飘花落叶言子楪兰苏世哲;

    .line 36
    .line 37
    iget-object p1, p1, Landroidx/compose/ui/text/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世哲苏兰:Landroidx/compose/ui/text/飘花落叶言子楪兰苏世哲;

    .line 38
    .line 39
    invoke-static {p0, p1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-nez p0, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    return v0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Landroidx/compose/ui/text/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世苏兰哲:Landroidx/compose/ui/text/飘花落叶言子楪哲兰苏世;

    .line 10
    .line 11
    invoke-virtual {v1}, Landroidx/compose/ui/text/飘花落叶言子楪哲兰苏世;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v0

    .line 16
    mul-int/lit8 v1, v1, 0x1f

    .line 17
    .line 18
    iget-object p0, p0, Landroidx/compose/ui/text/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世哲苏兰:Landroidx/compose/ui/text/飘花落叶言子楪兰苏世哲;

    .line 19
    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0}, Landroidx/compose/ui/text/飘花落叶言子楪兰苏世哲;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p0, 0x0

    .line 28
    :goto_0
    add-int/2addr v1, p0

    .line 29
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "TextStyle(color="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/compose/ui/text/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世苏兰哲()J

    .line 9
    .line 10
    .line 11
    move-result-wide v1

    .line 12
    invoke-static {v1, v2}, Landroidx/compose/ui/graphics/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏哲世兰(J)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v1, ", brush="

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Landroidx/compose/ui/text/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;

    .line 25
    .line 26
    iget-object v2, v1, Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言子苏哲楪兰世/飘花落叶言子楪哲世兰苏;

    .line 27
    .line 28
    invoke-interface {v2}, L飘花落叶言子苏哲楪兰世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲苏兰()Landroidx/compose/ui/graphics/飘花落叶言子楪兰世苏哲;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v2, ", alpha="

    .line 36
    .line 37
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    iget-object v2, v1, Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言子苏哲楪兰世/飘花落叶言子楪哲世兰苏;

    .line 41
    .line 42
    invoke-interface {v2}, L飘花落叶言子苏哲楪兰世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰()F

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v2, ", fontSize="

    .line 50
    .line 51
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    iget-wide v2, v1, Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世苏兰哲:J

    .line 55
    .line 56
    invoke-static {v2, v3}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲兰苏(J)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v2, ", fontWeight="

    .line 64
    .line 65
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget-object v2, v1, Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世哲苏兰:Landroidx/compose/ui/text/font/飘花落叶言子楪哲兰苏世;

    .line 69
    .line 70
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v2, ", fontStyle="

    .line 74
    .line 75
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget-object v2, v1, Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世哲兰苏:Landroidx/compose/ui/text/font/飘花落叶言子楪哲苏兰世;

    .line 79
    .line 80
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v2, ", fontSynthesis="

    .line 84
    .line 85
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    iget-object v2, v1, Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世兰苏哲:Landroidx/compose/ui/text/font/飘花落叶言子楪哲兰世苏;

    .line 89
    .line 90
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string v2, ", fontFamily="

    .line 94
    .line 95
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    iget-object v2, v1, Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世兰哲苏:Landroidx/compose/ui/text/font/飘花落叶言子楪苏兰世哲;

    .line 99
    .line 100
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string v2, ", fontFeatureSettings="

    .line 104
    .line 105
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    iget-object v2, v1, Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪苏世哲兰:Ljava/lang/String;

    .line 109
    .line 110
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    const-string v2, ", letterSpacing="

    .line 114
    .line 115
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    iget-wide v2, v1, Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪苏世兰哲:J

    .line 119
    .line 120
    invoke-static {v2, v3}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲兰苏(J)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    const-string v2, ", baselineShift="

    .line 128
    .line 129
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    iget-object v2, v1, Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪苏哲世兰:L飘花落叶言子苏哲楪兰世/飘花落叶言子楪世苏哲兰;

    .line 133
    .line 134
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    const-string v2, ", textGeometricTransform="

    .line 138
    .line 139
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    iget-object v2, v1, Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪苏哲兰世:L飘花落叶言子苏哲楪兰世/飘花落叶言子楪哲苏世兰;

    .line 143
    .line 144
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    const-string v2, ", localeList="

    .line 148
    .line 149
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    iget-object v2, v1, Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪苏兰世哲:L飘花落叶言子苏世哲兰楪/飘花落叶言子楪世苏兰哲;

    .line 153
    .line 154
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    const-string v2, ", background="

    .line 158
    .line 159
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    iget-wide v2, v1, Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪苏兰哲世:J

    .line 163
    .line 164
    const-string v4, ", textDecoration="

    .line 165
    .line 166
    invoke-static {v2, v3, v0, v4}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪哲苏兰(JLjava/lang/StringBuilder;Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    iget-object v2, v1, Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪哲世苏兰:L飘花落叶言子苏哲楪兰世/飘花落叶言子楪苏兰世哲;

    .line 170
    .line 171
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    const-string v2, ", shadow="

    .line 175
    .line 176
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    iget-object v2, v1, Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪哲世兰苏:Landroidx/compose/ui/graphics/飘花落叶言子世兰楪苏哲;

    .line 180
    .line 181
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    const-string v2, ", drawStyle="

    .line 185
    .line 186
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    iget-object v1, v1, Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪哲苏世兰:Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世哲兰苏;

    .line 190
    .line 191
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    const-string v1, ", textAlign="

    .line 195
    .line 196
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    iget-object v1, p0, Landroidx/compose/ui/text/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世苏兰哲:Landroidx/compose/ui/text/飘花落叶言子楪哲兰苏世;

    .line 200
    .line 201
    iget v2, v1, Landroidx/compose/ui/text/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:I

    .line 202
    .line 203
    invoke-static {v2}, L飘花落叶言子苏哲楪兰世/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰(I)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    const-string v2, ", textDirection="

    .line 211
    .line 212
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    iget v2, v1, Landroidx/compose/ui/text/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲:I

    .line 216
    .line 217
    invoke-static {v2}, L飘花落叶言子苏哲楪兰世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰(I)Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    const-string v2, ", lineHeight="

    .line 225
    .line 226
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    iget-wide v2, v1, Landroidx/compose/ui/text/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰:J

    .line 230
    .line 231
    invoke-static {v2, v3}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲兰苏(J)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    const-string v2, ", textIndent="

    .line 239
    .line 240
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    iget-object v2, v1, Landroidx/compose/ui/text/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲兰苏:L飘花落叶言子苏哲楪兰世/飘花落叶言子楪哲苏兰世;

    .line 244
    .line 245
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    const-string v2, ", platformStyle="

    .line 249
    .line 250
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    iget-object p0, p0, Landroidx/compose/ui/text/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世哲苏兰:Landroidx/compose/ui/text/飘花落叶言子楪兰苏世哲;

    .line 254
    .line 255
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    const-string p0, ", lineHeightStyle="

    .line 259
    .line 260
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    iget-object p0, v1, Landroidx/compose/ui/text/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏:L飘花落叶言子苏哲楪兰世/飘花落叶言子楪苏哲世兰;

    .line 264
    .line 265
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    const-string p0, ", lineBreak="

    .line 269
    .line 270
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    iget p0, v1, Landroidx/compose/ui/text/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰:I

    .line 274
    .line 275
    invoke-static {p0}, L飘花落叶言子苏哲楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰(I)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object p0

    .line 279
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    const-string p0, ", hyphens="

    .line 283
    .line 284
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 285
    .line 286
    .line 287
    iget p0, v1, Landroidx/compose/ui/text/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世兰哲:I

    .line 288
    .line 289
    invoke-static {p0}, L飘花落叶言子苏哲楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(I)Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object p0

    .line 293
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    const-string p0, ", textMotion="

    .line 297
    .line 298
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 299
    .line 300
    .line 301
    iget-object p0, v1, Landroidx/compose/ui/text/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲世兰:L飘花落叶言子苏哲楪兰世/飘花落叶言子楪哲兰苏世;

    .line 302
    .line 303
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 304
    .line 305
    .line 306
    const/16 p0, 0x29

    .line 307
    .line 308
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 309
    .line 310
    .line 311
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object p0

    .line 315
    return-object p0
.end method

.method public final 飘花落叶言子楪世哲苏兰(Landroidx/compose/ui/text/飘花落叶言子世哲兰楪苏;)Z
    .locals 2

    .line 1
    if-eq p0, p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/compose/ui/text/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世苏兰哲:Landroidx/compose/ui/text/飘花落叶言子楪哲兰苏世;

    .line 4
    .line 5
    iget-object v1, p1, Landroidx/compose/ui/text/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世苏兰哲:Landroidx/compose/ui/text/飘花落叶言子楪哲兰苏世;

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, Landroidx/compose/ui/text/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;

    .line 14
    .line 15
    iget-object p1, p1, Landroidx/compose/ui/text/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 p0, 0x0

    .line 25
    return p0

    .line 26
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 27
    return p0
.end method

.method public final 飘花落叶言子楪世苏兰哲()J
    .locals 2

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/text/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/compose/ui/text/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言子苏哲楪兰世/飘花落叶言子楪哲世兰苏;

    .line 4
    .line 5
    invoke-interface {p0}, L飘花落叶言子苏哲楪兰世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method
