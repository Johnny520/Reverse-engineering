.class public final Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord$Companion;
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord$Companion;


# instance fields
.field private final authorName:Ljava/lang/String;

.field private final authorSecUid:Ljava/lang/String;

.field private final authorUid:Ljava/lang/String;

.field private final awemeId:Ljava/lang/String;

.field private final collectCount:J

.field private final commentCount:J

.field private final coverUrl:Ljava/lang/String;

.field private final createTime:J

.field private final createTimestamp:J

.field private final diggCount:J

.field private final shareUrl:Ljava/lang/String;

.field private final title:Ljava/lang/String;

.field private final typeLabel:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord$Companion;-><init>(Lzq;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->Companion:Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord$Companion;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJJJ)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 139
    iput-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->awemeId:Ljava/lang/String;

    .line 140
    iput-object p2, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->typeLabel:Ljava/lang/String;

    .line 141
    iput-object p3, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->title:Ljava/lang/String;

    .line 142
    iput-object p4, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->authorName:Ljava/lang/String;

    .line 143
    iput-object p5, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->authorUid:Ljava/lang/String;

    .line 144
    iput-object p6, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->authorSecUid:Ljava/lang/String;

    .line 145
    iput-object p7, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->coverUrl:Ljava/lang/String;

    .line 146
    iput-object p8, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->shareUrl:Ljava/lang/String;

    .line 147
    iput-wide p9, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->diggCount:J

    .line 148
    iput-wide p11, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->commentCount:J

    .line 149
    iput-wide p13, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->collectCount:J

    move-wide p1, p15

    .line 150
    iput-wide p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->createTime:J

    move-wide/from16 p1, p17

    .line 151
    iput-wide p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->createTimestamp:J

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJJJILzq;)V
    .locals 19

    .line 1
    move/from16 v0, p19

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x2

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    const-string v1, "\u4f5c\u54c1"

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move-object/from16 v1, p2

    .line 11
    .line 12
    :goto_0
    and-int/lit8 v2, v0, 0x4

    .line 13
    .line 14
    const-string v3, ""

    .line 15
    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    move-object v2, v3

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    move-object/from16 v2, p3

    .line 21
    .line 22
    :goto_1
    and-int/lit8 v4, v0, 0x8

    .line 23
    .line 24
    if-eqz v4, :cond_2

    .line 25
    .line 26
    move-object v4, v3

    .line 27
    goto :goto_2

    .line 28
    :cond_2
    move-object/from16 v4, p4

    .line 29
    .line 30
    :goto_2
    and-int/lit8 v5, v0, 0x10

    .line 31
    .line 32
    if-eqz v5, :cond_3

    .line 33
    .line 34
    move-object v5, v3

    .line 35
    goto :goto_3

    .line 36
    :cond_3
    move-object/from16 v5, p5

    .line 37
    .line 38
    :goto_3
    and-int/lit8 v6, v0, 0x20

    .line 39
    .line 40
    if-eqz v6, :cond_4

    .line 41
    .line 42
    move-object v6, v3

    .line 43
    goto :goto_4

    .line 44
    :cond_4
    move-object/from16 v6, p6

    .line 45
    .line 46
    :goto_4
    and-int/lit8 v7, v0, 0x40

    .line 47
    .line 48
    if-eqz v7, :cond_5

    .line 49
    .line 50
    move-object v7, v3

    .line 51
    goto :goto_5

    .line 52
    :cond_5
    move-object/from16 v7, p7

    .line 53
    .line 54
    :goto_5
    and-int/lit16 v8, v0, 0x80

    .line 55
    .line 56
    if-eqz v8, :cond_6

    .line 57
    .line 58
    goto :goto_6

    .line 59
    :cond_6
    move-object/from16 v3, p8

    .line 60
    .line 61
    :goto_6
    and-int/lit16 v8, v0, 0x100

    .line 62
    .line 63
    const-wide/16 v9, 0x0

    .line 64
    .line 65
    if-eqz v8, :cond_7

    .line 66
    .line 67
    move-wide v11, v9

    .line 68
    goto :goto_7

    .line 69
    :cond_7
    move-wide/from16 v11, p9

    .line 70
    .line 71
    :goto_7
    and-int/lit16 v8, v0, 0x200

    .line 72
    .line 73
    if-eqz v8, :cond_8

    .line 74
    .line 75
    move-wide v13, v9

    .line 76
    goto :goto_8

    .line 77
    :cond_8
    move-wide/from16 v13, p11

    .line 78
    .line 79
    :goto_8
    and-int/lit16 v8, v0, 0x400

    .line 80
    .line 81
    if-eqz v8, :cond_9

    .line 82
    .line 83
    move-wide v15, v9

    .line 84
    goto :goto_9

    .line 85
    :cond_9
    move-wide/from16 v15, p13

    .line 86
    .line 87
    :goto_9
    and-int/lit16 v8, v0, 0x800

    .line 88
    .line 89
    if-eqz v8, :cond_a

    .line 90
    .line 91
    goto :goto_a

    .line 92
    :cond_a
    move-wide/from16 v9, p15

    .line 93
    .line 94
    :goto_a
    and-int/lit16 v0, v0, 0x1000

    .line 95
    .line 96
    if-eqz v0, :cond_b

    .line 97
    .line 98
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 99
    .line 100
    .line 101
    move-result-wide v17

    .line 102
    move-wide/from16 p19, v17

    .line 103
    .line 104
    :goto_b
    move-object/from16 p2, p0

    .line 105
    .line 106
    move-object/from16 p3, p1

    .line 107
    .line 108
    move-object/from16 p4, v1

    .line 109
    .line 110
    move-object/from16 p5, v2

    .line 111
    .line 112
    move-object/from16 p10, v3

    .line 113
    .line 114
    move-object/from16 p6, v4

    .line 115
    .line 116
    move-object/from16 p7, v5

    .line 117
    .line 118
    move-object/from16 p8, v6

    .line 119
    .line 120
    move-object/from16 p9, v7

    .line 121
    .line 122
    move-wide/from16 p17, v9

    .line 123
    .line 124
    move-wide/from16 p11, v11

    .line 125
    .line 126
    move-wide/from16 p13, v13

    .line 127
    .line 128
    move-wide/from16 p15, v15

    .line 129
    .line 130
    goto :goto_c

    .line 131
    :cond_b
    move-wide/from16 p19, p17

    .line 132
    .line 133
    goto :goto_b

    .line 134
    :goto_c
    invoke-direct/range {p2 .. p20}, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJJJ)V

    .line 135
    .line 136
    .line 137
    return-void
.end method

.method public static synthetic copy$default(Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJJJILjava/lang/Object;)Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p19

    .line 4
    .line 5
    and-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    iget-object v2, v0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->awemeId:Ljava/lang/String;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-object/from16 v2, p1

    .line 13
    .line 14
    :goto_0
    and-int/lit8 v3, v1, 0x2

    .line 15
    .line 16
    if-eqz v3, :cond_1

    .line 17
    .line 18
    iget-object v3, v0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->typeLabel:Ljava/lang/String;

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    move-object/from16 v3, p2

    .line 22
    .line 23
    :goto_1
    and-int/lit8 v4, v1, 0x4

    .line 24
    .line 25
    if-eqz v4, :cond_2

    .line 26
    .line 27
    iget-object v4, v0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->title:Ljava/lang/String;

    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_2
    move-object/from16 v4, p3

    .line 31
    .line 32
    :goto_2
    and-int/lit8 v5, v1, 0x8

    .line 33
    .line 34
    if-eqz v5, :cond_3

    .line 35
    .line 36
    iget-object v5, v0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->authorName:Ljava/lang/String;

    .line 37
    .line 38
    goto :goto_3

    .line 39
    :cond_3
    move-object/from16 v5, p4

    .line 40
    .line 41
    :goto_3
    and-int/lit8 v6, v1, 0x10

    .line 42
    .line 43
    if-eqz v6, :cond_4

    .line 44
    .line 45
    iget-object v6, v0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->authorUid:Ljava/lang/String;

    .line 46
    .line 47
    goto :goto_4

    .line 48
    :cond_4
    move-object/from16 v6, p5

    .line 49
    .line 50
    :goto_4
    and-int/lit8 v7, v1, 0x20

    .line 51
    .line 52
    if-eqz v7, :cond_5

    .line 53
    .line 54
    iget-object v7, v0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->authorSecUid:Ljava/lang/String;

    .line 55
    .line 56
    goto :goto_5

    .line 57
    :cond_5
    move-object/from16 v7, p6

    .line 58
    .line 59
    :goto_5
    and-int/lit8 v8, v1, 0x40

    .line 60
    .line 61
    if-eqz v8, :cond_6

    .line 62
    .line 63
    iget-object v8, v0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->coverUrl:Ljava/lang/String;

    .line 64
    .line 65
    goto :goto_6

    .line 66
    :cond_6
    move-object/from16 v8, p7

    .line 67
    .line 68
    :goto_6
    and-int/lit16 v9, v1, 0x80

    .line 69
    .line 70
    if-eqz v9, :cond_7

    .line 71
    .line 72
    iget-object v9, v0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->shareUrl:Ljava/lang/String;

    .line 73
    .line 74
    goto :goto_7

    .line 75
    :cond_7
    move-object/from16 v9, p8

    .line 76
    .line 77
    :goto_7
    and-int/lit16 v10, v1, 0x100

    .line 78
    .line 79
    if-eqz v10, :cond_8

    .line 80
    .line 81
    iget-wide v10, v0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->diggCount:J

    .line 82
    .line 83
    goto :goto_8

    .line 84
    :cond_8
    move-wide/from16 v10, p9

    .line 85
    .line 86
    :goto_8
    and-int/lit16 v12, v1, 0x200

    .line 87
    .line 88
    if-eqz v12, :cond_9

    .line 89
    .line 90
    iget-wide v12, v0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->commentCount:J

    .line 91
    .line 92
    goto :goto_9

    .line 93
    :cond_9
    move-wide/from16 v12, p11

    .line 94
    .line 95
    :goto_9
    and-int/lit16 v14, v1, 0x400

    .line 96
    .line 97
    if-eqz v14, :cond_a

    .line 98
    .line 99
    iget-wide v14, v0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->collectCount:J

    .line 100
    .line 101
    goto :goto_a

    .line 102
    :cond_a
    move-wide/from16 v14, p13

    .line 103
    .line 104
    :goto_a
    move-object/from16 p1, v2

    .line 105
    .line 106
    and-int/lit16 v2, v1, 0x800

    .line 107
    .line 108
    move-object/from16 p2, v3

    .line 109
    .line 110
    if-eqz v2, :cond_b

    .line 111
    .line 112
    iget-wide v2, v0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->createTime:J

    .line 113
    .line 114
    goto :goto_b

    .line 115
    :cond_b
    move-wide/from16 v2, p15

    .line 116
    .line 117
    :goto_b
    and-int/lit16 v1, v1, 0x1000

    .line 118
    .line 119
    if-eqz v1, :cond_c

    .line 120
    .line 121
    move-wide/from16 p3, v2

    .line 122
    .line 123
    iget-wide v1, v0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->createTimestamp:J

    .line 124
    .line 125
    move-wide/from16 p16, p3

    .line 126
    .line 127
    move-wide/from16 p18, v1

    .line 128
    .line 129
    move-object/from16 p4, v4

    .line 130
    .line 131
    move-object/from16 p5, v5

    .line 132
    .line 133
    move-object/from16 p6, v6

    .line 134
    .line 135
    move-object/from16 p7, v7

    .line 136
    .line 137
    move-object/from16 p8, v8

    .line 138
    .line 139
    move-object/from16 p9, v9

    .line 140
    .line 141
    move-wide/from16 p10, v10

    .line 142
    .line 143
    move-wide/from16 p12, v12

    .line 144
    .line 145
    move-wide/from16 p14, v14

    .line 146
    .line 147
    move-object/from16 p3, p2

    .line 148
    .line 149
    :goto_c
    move-object/from16 p2, p1

    .line 150
    .line 151
    move-object/from16 p1, v0

    .line 152
    .line 153
    goto :goto_d

    .line 154
    :cond_c
    move-wide/from16 p18, p17

    .line 155
    .line 156
    move-wide/from16 p16, v2

    .line 157
    .line 158
    move-object/from16 p3, p2

    .line 159
    .line 160
    move-object/from16 p4, v4

    .line 161
    .line 162
    move-object/from16 p5, v5

    .line 163
    .line 164
    move-object/from16 p6, v6

    .line 165
    .line 166
    move-object/from16 p7, v7

    .line 167
    .line 168
    move-object/from16 p8, v8

    .line 169
    .line 170
    move-object/from16 p9, v9

    .line 171
    .line 172
    move-wide/from16 p10, v10

    .line 173
    .line 174
    move-wide/from16 p12, v12

    .line 175
    .line 176
    move-wide/from16 p14, v14

    .line 177
    .line 178
    goto :goto_c

    .line 179
    :goto_d
    invoke-virtual/range {p1 .. p19}, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJJJ)Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->awemeId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component10()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->commentCount:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final component11()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->collectCount:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final component12()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->createTime:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final component13()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->createTimestamp:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->typeLabel:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component3()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->title:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component4()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->authorName:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component5()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->authorUid:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component6()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->authorSecUid:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component7()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->coverUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component8()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->shareUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component9()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->diggCount:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJJJ)Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;
    .locals 19

    .line 1
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual/range {p4 .. p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual/range {p5 .. p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual/range {p6 .. p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual/range {p7 .. p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual/range {p8 .. p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;

    .line 26
    .line 27
    move-object/from16 v1, p1

    .line 28
    .line 29
    move-object/from16 v2, p2

    .line 30
    .line 31
    move-object/from16 v3, p3

    .line 32
    .line 33
    move-object/from16 v4, p4

    .line 34
    .line 35
    move-object/from16 v5, p5

    .line 36
    .line 37
    move-object/from16 v6, p6

    .line 38
    .line 39
    move-object/from16 v7, p7

    .line 40
    .line 41
    move-object/from16 v8, p8

    .line 42
    .line 43
    move-wide/from16 v9, p9

    .line 44
    .line 45
    move-wide/from16 v11, p11

    .line 46
    .line 47
    move-wide/from16 v13, p13

    .line 48
    .line 49
    move-wide/from16 v15, p15

    .line 50
    .line 51
    move-wide/from16 v17, p17

    .line 52
    .line 53
    invoke-direct/range {v0 .. v18}, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJJJ)V

    .line 54
    .line 55
    .line 56
    return-object v0
.end method

.method public final displayAuthor()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->authorName:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string v0, "@"

    .line 12
    .line 13
    invoke-static {p0, v0}, Lq02;->н(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    const-string p0, "\u672a\u77e5\u4f5c\u8005"

    .line 24
    .line 25
    :cond_0
    return-object p0
.end method

.method public final displayTitle()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->title:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    const-string v1, "\u65e0\u63cf\u8ff0"

    .line 18
    .line 19
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    const-string v1, "\u672a\u77e5"

    .line 26
    .line 27
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-nez v1, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 v0, 0x0

    .line 35
    :goto_0
    if-nez v0, :cond_2

    .line 36
    .line 37
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->typeLabel:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    const-string p0, "\u4f5c\u54c1"

    .line 46
    .line 47
    :cond_1
    return-object p0

    .line 48
    :cond_2
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;

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
    check-cast p1, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->awemeId:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->awemeId:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->typeLabel:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->typeLabel:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->title:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->title:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->authorName:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->authorName:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_5

    .line 55
    .line 56
    return v2

    .line 57
    :cond_5
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->authorUid:Ljava/lang/String;

    .line 58
    .line 59
    iget-object v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->authorUid:Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-nez v1, :cond_6

    .line 66
    .line 67
    return v2

    .line 68
    :cond_6
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->authorSecUid:Ljava/lang/String;

    .line 69
    .line 70
    iget-object v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->authorSecUid:Ljava/lang/String;

    .line 71
    .line 72
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-nez v1, :cond_7

    .line 77
    .line 78
    return v2

    .line 79
    :cond_7
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->coverUrl:Ljava/lang/String;

    .line 80
    .line 81
    iget-object v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->coverUrl:Ljava/lang/String;

    .line 82
    .line 83
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-nez v1, :cond_8

    .line 88
    .line 89
    return v2

    .line 90
    :cond_8
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->shareUrl:Ljava/lang/String;

    .line 91
    .line 92
    iget-object v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->shareUrl:Ljava/lang/String;

    .line 93
    .line 94
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-nez v1, :cond_9

    .line 99
    .line 100
    return v2

    .line 101
    :cond_9
    iget-wide v3, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->diggCount:J

    .line 102
    .line 103
    iget-wide v5, p1, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->diggCount:J

    .line 104
    .line 105
    cmp-long v1, v3, v5

    .line 106
    .line 107
    if-eqz v1, :cond_a

    .line 108
    .line 109
    return v2

    .line 110
    :cond_a
    iget-wide v3, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->commentCount:J

    .line 111
    .line 112
    iget-wide v5, p1, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->commentCount:J

    .line 113
    .line 114
    cmp-long v1, v3, v5

    .line 115
    .line 116
    if-eqz v1, :cond_b

    .line 117
    .line 118
    return v2

    .line 119
    :cond_b
    iget-wide v3, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->collectCount:J

    .line 120
    .line 121
    iget-wide v5, p1, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->collectCount:J

    .line 122
    .line 123
    cmp-long v1, v3, v5

    .line 124
    .line 125
    if-eqz v1, :cond_c

    .line 126
    .line 127
    return v2

    .line 128
    :cond_c
    iget-wide v3, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->createTime:J

    .line 129
    .line 130
    iget-wide v5, p1, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->createTime:J

    .line 131
    .line 132
    cmp-long v1, v3, v5

    .line 133
    .line 134
    if-eqz v1, :cond_d

    .line 135
    .line 136
    return v2

    .line 137
    :cond_d
    iget-wide v3, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->createTimestamp:J

    .line 138
    .line 139
    iget-wide p0, p1, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->createTimestamp:J

    .line 140
    .line 141
    cmp-long p0, v3, p0

    .line 142
    .line 143
    if-eqz p0, :cond_e

    .line 144
    .line 145
    return v2

    .line 146
    :cond_e
    return v0
.end method

.method public final getAuthorName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->authorName:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getAuthorSecUid()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->authorSecUid:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getAuthorUid()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->authorUid:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getAwemeId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->awemeId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getCollectCount()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->collectCount:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getCommentCount()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->commentCount:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getCoverUrl()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->coverUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getCreateTime()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->createTime:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getCreateTimestamp()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->createTimestamp:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getDiggCount()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->diggCount:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getShareUrl()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->shareUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->title:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getTypeLabel()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->typeLabel:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->awemeId:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->typeLabel:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->title:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->authorName:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->authorUid:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->authorSecUid:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->coverUrl:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->shareUrl:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-wide v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->diggCount:J

    .line 53
    .line 54
    invoke-static {v0, v1, v2, v3}, Llz1;->β(IIJ)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-wide v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->commentCount:J

    .line 59
    .line 60
    invoke-static {v0, v1, v2, v3}, Llz1;->β(IIJ)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-wide v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->collectCount:J

    .line 65
    .line 66
    invoke-static {v0, v1, v2, v3}, Llz1;->β(IIJ)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget-wide v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->createTime:J

    .line 71
    .line 72
    invoke-static {v0, v1, v2, v3}, Llz1;->β(IIJ)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    iget-wide v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->createTimestamp:J

    .line 77
    .line 78
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    add-int/2addr p0, v0

    .line 83
    return p0
.end method

.method public final toJson()Lorg/json/JSONObject;
    .locals 4

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "awemeId"

    .line 7
    .line 8
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->awemeId:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "typeLabel"

    .line 15
    .line 16
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->typeLabel:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "title"

    .line 23
    .line 24
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->title:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const-string v1, "authorName"

    .line 31
    .line 32
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->authorName:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const-string v1, "authorUid"

    .line 39
    .line 40
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->authorUid:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    const-string v1, "authorSecUid"

    .line 47
    .line 48
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->authorSecUid:Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    const-string v1, "coverUrl"

    .line 55
    .line 56
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->coverUrl:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    const-string v1, "shareUrl"

    .line 63
    .line 64
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->shareUrl:Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    const-string v1, "diggCount"

    .line 71
    .line 72
    iget-wide v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->diggCount:J

    .line 73
    .line 74
    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    const-string v1, "commentCount"

    .line 79
    .line 80
    iget-wide v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->commentCount:J

    .line 81
    .line 82
    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    const-string v1, "collectCount"

    .line 87
    .line 88
    iget-wide v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->collectCount:J

    .line 89
    .line 90
    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    const-string v1, "createTime"

    .line 95
    .line 96
    iget-wide v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->createTime:J

    .line 97
    .line 98
    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    const-string v1, "createTimestamp"

    .line 103
    .line 104
    iget-wide v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->createTimestamp:J

    .line 105
    .line 106
    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->awemeId:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, v0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->typeLabel:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, v0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->title:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, v0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->authorName:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v5, v0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->authorUid:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v6, v0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->authorSecUid:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v7, v0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->coverUrl:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v8, v0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->shareUrl:Ljava/lang/String;

    .line 18
    .line 19
    iget-wide v9, v0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->diggCount:J

    .line 20
    .line 21
    iget-wide v11, v0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->commentCount:J

    .line 22
    .line 23
    iget-wide v13, v0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->collectCount:J

    .line 24
    .line 25
    move-wide v15, v13

    .line 26
    iget-wide v13, v0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->createTime:J

    .line 27
    .line 28
    move-wide/from16 v17, v13

    .line 29
    .line 30
    iget-wide v13, v0, Lcom/example/dyhelper/hook/comment/bookmark/VideoBookmarkRecord;->createTimestamp:J

    .line 31
    .line 32
    const-string v0, ", typeLabel="

    .line 33
    .line 34
    move-wide/from16 v19, v15

    .line 35
    .line 36
    const-string v15, ", title="

    .line 37
    .line 38
    move-wide/from16 v21, v13

    .line 39
    .line 40
    const-string v13, "VideoBookmarkRecord(awemeId="

    .line 41
    .line 42
    invoke-static {v13, v1, v0, v2, v15}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    const-string v1, ", authorName="

    .line 47
    .line 48
    const-string v2, ", authorUid="

    .line 49
    .line 50
    invoke-static {v0, v3, v1, v4, v2}, Lnx;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const-string v1, ", authorSecUid="

    .line 54
    .line 55
    const-string v2, ", coverUrl="

    .line 56
    .line 57
    invoke-static {v0, v5, v1, v6, v2}, Lnx;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    const-string v1, ", shareUrl="

    .line 61
    .line 62
    const-string v2, ", diggCount="

    .line 63
    .line 64
    invoke-static {v0, v7, v1, v8, v2}, Lnx;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v1, ", commentCount="

    .line 71
    .line 72
    const-string v2, ", collectCount="

    .line 73
    .line 74
    invoke-static {v0, v1, v11, v12, v2}, Lnx;->Β(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 75
    .line 76
    .line 77
    move-wide/from16 v1, v19

    .line 78
    .line 79
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string v1, ", createTime="

    .line 83
    .line 84
    const-string v2, ", createTimestamp="

    .line 85
    .line 86
    move-wide/from16 v3, v17

    .line 87
    .line 88
    invoke-static {v0, v1, v3, v4, v2}, Lnx;->Β(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 89
    .line 90
    .line 91
    move-wide/from16 v1, v21

    .line 92
    .line 93
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string v1, ")"

    .line 97
    .line 98
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    return-object v0
.end method
