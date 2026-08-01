.class public final Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord$Companion;
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord$Companion;


# instance fields
.field private final avatarUrl:Ljava/lang/String;

.field private final createTimestamp:J

.field private final group:Ljava/lang/String;

.field private hasNewAweme:Z

.field private knownAwemeIds:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private lastAwemeCount:I

.field private lastCheckTimestamp:J

.field private lastNewestAwemeId:Ljava/lang/String;

.field private newAwemeCount:I

.field private newAwemeItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;",
            ">;"
        }
    .end annotation
.end field

.field private final nickname:Ljava/lang/String;

.field private notificationEnabled:Z

.field private final remark:Ljava/lang/String;

.field private final secUid:Ljava/lang/String;

.field private final signature:Ljava/lang/String;

.field private final uid:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord$Companion;-><init>(Lzq;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->Companion:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord$Companion;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->$stable:I

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>()V
    .locals 21

    .line 207
    const v19, 0xffff

    const/16 v20, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v20}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJILjava/lang/String;ZILjava/util/Set;Ljava/util/List;ZILzq;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJILjava/lang/String;ZILjava/util/Set;Ljava/util/List;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "JJI",
            "Ljava/lang/String;",
            "ZI",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;",
            ">;Z)V"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p16 .. p16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p17 .. p17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 191
    iput-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->uid:Ljava/lang/String;

    .line 192
    iput-object p2, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->secUid:Ljava/lang/String;

    .line 193
    iput-object p3, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->nickname:Ljava/lang/String;

    .line 194
    iput-object p4, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->signature:Ljava/lang/String;

    .line 195
    iput-object p5, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->avatarUrl:Ljava/lang/String;

    .line 196
    iput-object p6, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->group:Ljava/lang/String;

    .line 197
    iput-object p7, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->remark:Ljava/lang/String;

    .line 198
    iput-wide p8, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->createTimestamp:J

    .line 199
    iput-wide p10, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->lastCheckTimestamp:J

    .line 200
    iput p12, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->lastAwemeCount:I

    .line 201
    iput-object p13, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->lastNewestAwemeId:Ljava/lang/String;

    .line 202
    iput-boolean p14, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->hasNewAweme:Z

    .line 203
    iput p15, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->newAwemeCount:I

    move-object/from16 p1, p16

    .line 204
    iput-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->knownAwemeIds:Ljava/util/Set;

    move-object/from16 p1, p17

    .line 205
    iput-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->newAwemeItems:Ljava/util/List;

    move/from16 p1, p18

    .line 206
    iput-boolean p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->notificationEnabled:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJILjava/lang/String;ZILjava/util/Set;Ljava/util/List;ZILzq;)V
    .locals 17

    .line 1
    move/from16 v0, p19

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move-object v1, v2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object/from16 v1, p1

    .line 12
    .line 13
    :goto_0
    and-int/lit8 v3, v0, 0x2

    .line 14
    .line 15
    if-eqz v3, :cond_1

    .line 16
    .line 17
    move-object v3, v2

    .line 18
    goto :goto_1

    .line 19
    :cond_1
    move-object/from16 v3, p2

    .line 20
    .line 21
    :goto_1
    and-int/lit8 v4, v0, 0x4

    .line 22
    .line 23
    if-eqz v4, :cond_2

    .line 24
    .line 25
    move-object v4, v2

    .line 26
    goto :goto_2

    .line 27
    :cond_2
    move-object/from16 v4, p3

    .line 28
    .line 29
    :goto_2
    and-int/lit8 v5, v0, 0x8

    .line 30
    .line 31
    if-eqz v5, :cond_3

    .line 32
    .line 33
    move-object v5, v2

    .line 34
    goto :goto_3

    .line 35
    :cond_3
    move-object/from16 v5, p4

    .line 36
    .line 37
    :goto_3
    and-int/lit8 v6, v0, 0x10

    .line 38
    .line 39
    if-eqz v6, :cond_4

    .line 40
    .line 41
    move-object v6, v2

    .line 42
    goto :goto_4

    .line 43
    :cond_4
    move-object/from16 v6, p5

    .line 44
    .line 45
    :goto_4
    and-int/lit8 v7, v0, 0x20

    .line 46
    .line 47
    if-eqz v7, :cond_5

    .line 48
    .line 49
    move-object v7, v2

    .line 50
    goto :goto_5

    .line 51
    :cond_5
    move-object/from16 v7, p6

    .line 52
    .line 53
    :goto_5
    and-int/lit8 v8, v0, 0x40

    .line 54
    .line 55
    if-eqz v8, :cond_6

    .line 56
    .line 57
    move-object v8, v2

    .line 58
    goto :goto_6

    .line 59
    :cond_6
    move-object/from16 v8, p7

    .line 60
    .line 61
    :goto_6
    and-int/lit16 v9, v0, 0x80

    .line 62
    .line 63
    if-eqz v9, :cond_7

    .line 64
    .line 65
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 66
    .line 67
    .line 68
    move-result-wide v9

    .line 69
    goto :goto_7

    .line 70
    :cond_7
    move-wide/from16 v9, p8

    .line 71
    .line 72
    :goto_7
    and-int/lit16 v11, v0, 0x100

    .line 73
    .line 74
    if-eqz v11, :cond_8

    .line 75
    .line 76
    const-wide/16 v11, 0x0

    .line 77
    .line 78
    goto :goto_8

    .line 79
    :cond_8
    move-wide/from16 v11, p10

    .line 80
    .line 81
    :goto_8
    and-int/lit16 v13, v0, 0x200

    .line 82
    .line 83
    if-eqz v13, :cond_9

    .line 84
    .line 85
    const/4 v13, 0x0

    .line 86
    goto :goto_9

    .line 87
    :cond_9
    move/from16 v13, p12

    .line 88
    .line 89
    :goto_9
    and-int/lit16 v15, v0, 0x400

    .line 90
    .line 91
    if-eqz v15, :cond_a

    .line 92
    .line 93
    goto :goto_a

    .line 94
    :cond_a
    move-object/from16 v2, p13

    .line 95
    .line 96
    :goto_a
    and-int/lit16 v15, v0, 0x800

    .line 97
    .line 98
    if-eqz v15, :cond_b

    .line 99
    .line 100
    const/4 v15, 0x0

    .line 101
    goto :goto_b

    .line 102
    :cond_b
    move/from16 v15, p14

    .line 103
    .line 104
    :goto_b
    and-int/lit16 v14, v0, 0x1000

    .line 105
    .line 106
    if-eqz v14, :cond_c

    .line 107
    .line 108
    const/4 v14, 0x0

    .line 109
    goto :goto_c

    .line 110
    :cond_c
    move/from16 v14, p15

    .line 111
    .line 112
    :goto_c
    move-object/from16 p1, v1

    .line 113
    .line 114
    and-int/lit16 v1, v0, 0x2000

    .line 115
    .line 116
    if-eqz v1, :cond_d

    .line 117
    .line 118
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 119
    .line 120
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 121
    .line 122
    .line 123
    goto :goto_d

    .line 124
    :cond_d
    move-object/from16 v1, p16

    .line 125
    .line 126
    :goto_d
    move-object/from16 p2, v1

    .line 127
    .line 128
    and-int/lit16 v1, v0, 0x4000

    .line 129
    .line 130
    if-eqz v1, :cond_e

    .line 131
    .line 132
    new-instance v1, Ljava/util/ArrayList;

    .line 133
    .line 134
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 135
    .line 136
    .line 137
    goto :goto_e

    .line 138
    :cond_e
    move-object/from16 v1, p17

    .line 139
    .line 140
    :goto_e
    const v16, 0x8000

    .line 141
    .line 142
    .line 143
    and-int v0, v0, v16

    .line 144
    .line 145
    if-eqz v0, :cond_f

    .line 146
    .line 147
    const/4 v0, 0x1

    .line 148
    move/from16 p19, v0

    .line 149
    .line 150
    :goto_f
    move-object/from16 p17, p2

    .line 151
    .line 152
    move-object/from16 p18, v1

    .line 153
    .line 154
    move-object/from16 p14, v2

    .line 155
    .line 156
    move-object/from16 p3, v3

    .line 157
    .line 158
    move-object/from16 p4, v4

    .line 159
    .line 160
    move-object/from16 p5, v5

    .line 161
    .line 162
    move-object/from16 p6, v6

    .line 163
    .line 164
    move-object/from16 p7, v7

    .line 165
    .line 166
    move-object/from16 p8, v8

    .line 167
    .line 168
    move-wide/from16 p9, v9

    .line 169
    .line 170
    move-wide/from16 p11, v11

    .line 171
    .line 172
    move/from16 p13, v13

    .line 173
    .line 174
    move/from16 p16, v14

    .line 175
    .line 176
    move/from16 p15, v15

    .line 177
    .line 178
    move-object/from16 p2, p1

    .line 179
    .line 180
    move-object/from16 p1, p0

    .line 181
    .line 182
    goto :goto_10

    .line 183
    :cond_f
    move/from16 p19, p18

    .line 184
    .line 185
    goto :goto_f

    .line 186
    :goto_10
    invoke-direct/range {p1 .. p19}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJILjava/lang/String;ZILjava/util/Set;Ljava/util/List;Z)V

    .line 187
    .line 188
    .line 189
    return-void
.end method

.method public static synthetic copy$default(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJILjava/lang/String;ZILjava/util/Set;Ljava/util/List;ZILjava/lang/Object;)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    move/from16 v1, p19

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->uid:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->secUid:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->nickname:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->signature:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->avatarUrl:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->group:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->remark:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-wide v9, v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->createTimestamp:J

    goto :goto_7

    :cond_7
    move-wide/from16 v9, p8

    :goto_7
    and-int/lit16 v11, v1, 0x100

    if-eqz v11, :cond_8

    iget-wide v11, v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->lastCheckTimestamp:J

    goto :goto_8

    :cond_8
    move-wide/from16 v11, p10

    :goto_8
    and-int/lit16 v13, v1, 0x200

    if-eqz v13, :cond_9

    iget v13, v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->lastAwemeCount:I

    goto :goto_9

    :cond_9
    move/from16 v13, p12

    :goto_9
    and-int/lit16 v14, v1, 0x400

    if-eqz v14, :cond_a

    iget-object v14, v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->lastNewestAwemeId:Ljava/lang/String;

    goto :goto_a

    :cond_a
    move-object/from16 v14, p13

    :goto_a
    and-int/lit16 v15, v1, 0x800

    if-eqz v15, :cond_b

    iget-boolean v15, v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->hasNewAweme:Z

    goto :goto_b

    :cond_b
    move/from16 v15, p14

    :goto_b
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x1000

    if-eqz v2, :cond_c

    iget v2, v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->newAwemeCount:I

    goto :goto_c

    :cond_c
    move/from16 v2, p15

    :goto_c
    move/from16 p2, v2

    and-int/lit16 v2, v1, 0x2000

    if-eqz v2, :cond_d

    iget-object v2, v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->knownAwemeIds:Ljava/util/Set;

    goto :goto_d

    :cond_d
    move-object/from16 v2, p16

    :goto_d
    move-object/from16 p3, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->newAwemeItems:Ljava/util/List;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p17

    :goto_e
    const v16, 0x8000

    and-int v1, v1, v16

    if-eqz v1, :cond_f

    iget-boolean v1, v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->notificationEnabled:Z

    move/from16 p19, v1

    :goto_f
    move/from16 p16, p2

    move-object/from16 p17, p3

    move-object/from16 p18, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-wide/from16 p9, v9

    move-wide/from16 p11, v11

    move/from16 p13, v13

    move-object/from16 p14, v14

    move/from16 p15, v15

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_10

    :cond_f
    move/from16 p19, p18

    goto :goto_f

    :goto_10
    invoke-virtual/range {p1 .. p19}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJILjava/lang/String;ZILjava/util/Set;Ljava/util/List;Z)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->uid:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component10()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->lastAwemeCount:I

    .line 2
    .line 3
    return p0
.end method

.method public final component11()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->lastNewestAwemeId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component12()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->hasNewAweme:Z

    .line 2
    .line 3
    return p0
.end method

.method public final component13()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->newAwemeCount:I

    .line 2
    .line 3
    return p0
.end method

.method public final component14()Ljava/util/Set;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->knownAwemeIds:Ljava/util/Set;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component15()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->newAwemeItems:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component16()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->notificationEnabled:Z

    .line 2
    .line 3
    return p0
.end method

.method public final component2()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->secUid:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component3()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->nickname:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component4()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->signature:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component5()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->avatarUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component6()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->group:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component7()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->remark:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component8()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->createTimestamp:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final component9()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->lastCheckTimestamp:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJILjava/lang/String;ZILjava/util/Set;Ljava/util/List;Z)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "JJI",
            "Ljava/lang/String;",
            "ZI",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;",
            ">;Z)",
            "Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;"
        }
    .end annotation

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
    invoke-virtual/range {p13 .. p13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual/range {p16 .. p16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-virtual/range {p17 .. p17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 32
    .line 33
    move-object/from16 v1, p1

    .line 34
    .line 35
    move-object/from16 v2, p2

    .line 36
    .line 37
    move-object/from16 v3, p3

    .line 38
    .line 39
    move-object/from16 v4, p4

    .line 40
    .line 41
    move-object/from16 v5, p5

    .line 42
    .line 43
    move-object/from16 v6, p6

    .line 44
    .line 45
    move-object/from16 v7, p7

    .line 46
    .line 47
    move-wide/from16 v8, p8

    .line 48
    .line 49
    move-wide/from16 v10, p10

    .line 50
    .line 51
    move/from16 v12, p12

    .line 52
    .line 53
    move-object/from16 v13, p13

    .line 54
    .line 55
    move/from16 v14, p14

    .line 56
    .line 57
    move/from16 v15, p15

    .line 58
    .line 59
    move-object/from16 v16, p16

    .line 60
    .line 61
    move-object/from16 v17, p17

    .line 62
    .line 63
    move/from16 v18, p18

    .line 64
    .line 65
    invoke-direct/range {v0 .. v18}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJILjava/lang/String;ZILjava/util/Set;Ljava/util/List;Z)V

    .line 66
    .line 67
    .line 68
    return-object v0
.end method

.method public final displayName()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->nickname:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->secUid:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->uid:Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    const-string p0, "\u672a\u77e5\u7528\u6237"

    .line 26
    .line 27
    :cond_0
    return-object p0

    .line 28
    :cond_1
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
    instance-of v1, p1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

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
    check-cast p1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->uid:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->uid:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->secUid:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->secUid:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->nickname:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->nickname:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->signature:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->signature:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->avatarUrl:Ljava/lang/String;

    .line 58
    .line 59
    iget-object v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->avatarUrl:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->group:Ljava/lang/String;

    .line 69
    .line 70
    iget-object v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->group:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->remark:Ljava/lang/String;

    .line 80
    .line 81
    iget-object v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->remark:Ljava/lang/String;

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
    iget-wide v3, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->createTimestamp:J

    .line 91
    .line 92
    iget-wide v5, p1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->createTimestamp:J

    .line 93
    .line 94
    cmp-long v1, v3, v5

    .line 95
    .line 96
    if-eqz v1, :cond_9

    .line 97
    .line 98
    return v2

    .line 99
    :cond_9
    iget-wide v3, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->lastCheckTimestamp:J

    .line 100
    .line 101
    iget-wide v5, p1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->lastCheckTimestamp:J

    .line 102
    .line 103
    cmp-long v1, v3, v5

    .line 104
    .line 105
    if-eqz v1, :cond_a

    .line 106
    .line 107
    return v2

    .line 108
    :cond_a
    iget v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->lastAwemeCount:I

    .line 109
    .line 110
    iget v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->lastAwemeCount:I

    .line 111
    .line 112
    if-eq v1, v3, :cond_b

    .line 113
    .line 114
    return v2

    .line 115
    :cond_b
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->lastNewestAwemeId:Ljava/lang/String;

    .line 116
    .line 117
    iget-object v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->lastNewestAwemeId:Ljava/lang/String;

    .line 118
    .line 119
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    if-nez v1, :cond_c

    .line 124
    .line 125
    return v2

    .line 126
    :cond_c
    iget-boolean v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->hasNewAweme:Z

    .line 127
    .line 128
    iget-boolean v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->hasNewAweme:Z

    .line 129
    .line 130
    if-eq v1, v3, :cond_d

    .line 131
    .line 132
    return v2

    .line 133
    :cond_d
    iget v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->newAwemeCount:I

    .line 134
    .line 135
    iget v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->newAwemeCount:I

    .line 136
    .line 137
    if-eq v1, v3, :cond_e

    .line 138
    .line 139
    return v2

    .line 140
    :cond_e
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->knownAwemeIds:Ljava/util/Set;

    .line 141
    .line 142
    iget-object v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->knownAwemeIds:Ljava/util/Set;

    .line 143
    .line 144
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    if-nez v1, :cond_f

    .line 149
    .line 150
    return v2

    .line 151
    :cond_f
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->newAwemeItems:Ljava/util/List;

    .line 152
    .line 153
    iget-object v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->newAwemeItems:Ljava/util/List;

    .line 154
    .line 155
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    if-nez v1, :cond_10

    .line 160
    .line 161
    return v2

    .line 162
    :cond_10
    iget-boolean p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->notificationEnabled:Z

    .line 163
    .line 164
    iget-boolean p1, p1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->notificationEnabled:Z

    .line 165
    .line 166
    if-eq p0, p1, :cond_11

    .line 167
    .line 168
    return v2

    .line 169
    :cond_11
    return v0
.end method

.method public final getAvatarUrl()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->avatarUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getCreateTimestamp()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->createTimestamp:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getGroup()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->group:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getHasNewAweme()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->hasNewAweme:Z

    .line 2
    .line 3
    return p0
.end method

.method public final getKnownAwemeIds()Ljava/util/Set;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->knownAwemeIds:Ljava/util/Set;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getLastAwemeCount()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->lastAwemeCount:I

    .line 2
    .line 3
    return p0
.end method

.method public final getLastCheckTimestamp()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->lastCheckTimestamp:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getLastNewestAwemeId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->lastNewestAwemeId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getNewAwemeCount()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->newAwemeCount:I

    .line 2
    .line 3
    return p0
.end method

.method public final getNewAwemeItems()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->newAwemeItems:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getNickname()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->nickname:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getNotificationEnabled()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->notificationEnabled:Z

    .line 2
    .line 3
    return p0
.end method

.method public final getRemark()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->remark:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSecUid()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->secUid:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSignature()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->signature:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getUid()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->uid:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->uid:Ljava/lang/String;

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
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->secUid:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->nickname:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->signature:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->avatarUrl:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->group:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->remark:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-wide v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->createTimestamp:J

    .line 47
    .line 48
    invoke-static {v0, v1, v2, v3}, Llz1;->β(IIJ)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-wide v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->lastCheckTimestamp:J

    .line 53
    .line 54
    invoke-static {v0, v1, v2, v3}, Llz1;->β(IIJ)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->lastAwemeCount:I

    .line 59
    .line 60
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->lastNewestAwemeId:Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget-boolean v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->hasNewAweme:Z

    .line 71
    .line 72
    invoke-static {v0, v1, v2}, Llz1;->γ(IIZ)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    iget v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->newAwemeCount:I

    .line 77
    .line 78
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->knownAwemeIds:Ljava/util/Set;

    .line 83
    .line 84
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    add-int/2addr v2, v0

    .line 89
    mul-int/2addr v2, v1

    .line 90
    iget-object v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->newAwemeItems:Ljava/util/List;

    .line 91
    .line 92
    invoke-static {v0, v2, v1}, La12;->γ(Ljava/util/List;II)I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    iget-boolean p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->notificationEnabled:Z

    .line 97
    .line 98
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 99
    .line 100
    .line 101
    move-result p0

    .line 102
    add-int/2addr p0, v0

    .line 103
    return p0
.end method

.method public final setHasNewAweme(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->hasNewAweme:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setKnownAwemeIds(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->knownAwemeIds:Ljava/util/Set;

    .line 5
    .line 6
    return-void
.end method

.method public final setLastAwemeCount(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->lastAwemeCount:I

    .line 2
    .line 3
    return-void
.end method

.method public final setLastCheckTimestamp(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->lastCheckTimestamp:J

    .line 2
    .line 3
    return-void
.end method

.method public final setLastNewestAwemeId(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->lastNewestAwemeId:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public final setNewAwemeCount(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->newAwemeCount:I

    .line 2
    .line 3
    return-void
.end method

.method public final setNewAwemeItems(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->newAwemeItems:Ljava/util/List;

    .line 5
    .line 6
    return-void
.end method

.method public final setNotificationEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->notificationEnabled:Z

    .line 2
    .line 3
    return-void
.end method

.method public final toJson()Lorg/json/JSONObject;
    .locals 6

    .line 1
    new-instance v0, Lorg/json/JSONArray;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->knownAwemeIds:Ljava/util/Set;

    .line 7
    .line 8
    check-cast v1, Ljava/lang/Iterable;

    .line 9
    .line 10
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-nez v3, :cond_0

    .line 31
    .line 32
    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    new-instance v1, Lorg/json/JSONArray;

    .line 37
    .line 38
    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 39
    .line 40
    .line 41
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->newAwemeItems:Ljava/util/List;

    .line 42
    .line 43
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_2

    .line 52
    .line 53
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    check-cast v3, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;

    .line 58
    .line 59
    invoke-virtual {v3}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;->toJson()Lorg/json/JSONObject;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-virtual {v1, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_2
    new-instance v2, Lorg/json/JSONObject;

    .line 68
    .line 69
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 70
    .line 71
    .line 72
    const-string v3, "uid"

    .line 73
    .line 74
    iget-object v4, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->uid:Ljava/lang/String;

    .line 75
    .line 76
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    const-string v3, "secUid"

    .line 81
    .line 82
    iget-object v4, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->secUid:Ljava/lang/String;

    .line 83
    .line 84
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    const-string v3, "nickname"

    .line 89
    .line 90
    iget-object v4, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->nickname:Ljava/lang/String;

    .line 91
    .line 92
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    const-string v3, "signature"

    .line 97
    .line 98
    iget-object v4, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->signature:Ljava/lang/String;

    .line 99
    .line 100
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    const-string v3, "avatarUrl"

    .line 105
    .line 106
    iget-object v4, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->avatarUrl:Ljava/lang/String;

    .line 107
    .line 108
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    const-string v3, "group"

    .line 113
    .line 114
    iget-object v4, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->group:Ljava/lang/String;

    .line 115
    .line 116
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    const-string v3, "remark"

    .line 121
    .line 122
    iget-object v4, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->remark:Ljava/lang/String;

    .line 123
    .line 124
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    const-string v3, "createTimestamp"

    .line 129
    .line 130
    iget-wide v4, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->createTimestamp:J

    .line 131
    .line 132
    invoke-virtual {v2, v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    const-string v3, "lastCheckTimestamp"

    .line 137
    .line 138
    iget-wide v4, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->lastCheckTimestamp:J

    .line 139
    .line 140
    invoke-virtual {v2, v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    const-string v3, "lastAwemeCount"

    .line 145
    .line 146
    iget v4, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->lastAwemeCount:I

    .line 147
    .line 148
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    const-string v3, "lastNewestAwemeId"

    .line 153
    .line 154
    iget-object v4, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->lastNewestAwemeId:Ljava/lang/String;

    .line 155
    .line 156
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    const-string v3, "hasNewAweme"

    .line 161
    .line 162
    iget-boolean v4, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->hasNewAweme:Z

    .line 163
    .line 164
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    const-string v3, "newAwemeCount"

    .line 169
    .line 170
    iget v4, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->newAwemeCount:I

    .line 171
    .line 172
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    const-string v3, "knownAwemeIds"

    .line 177
    .line 178
    invoke-virtual {v2, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    const-string v2, "newAwemeItems"

    .line 183
    .line 184
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    const-string v1, "notificationEnabled"

    .line 189
    .line 190
    iget-boolean p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->notificationEnabled:Z

    .line 191
    .line 192
    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->uid:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->secUid:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->nickname:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->signature:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v5, v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->avatarUrl:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v6, v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->group:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v7, v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->remark:Ljava/lang/String;

    .line 16
    .line 17
    iget-wide v8, v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->createTimestamp:J

    .line 18
    .line 19
    iget-wide v10, v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->lastCheckTimestamp:J

    .line 20
    .line 21
    iget v12, v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->lastAwemeCount:I

    .line 22
    .line 23
    iget-object v13, v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->lastNewestAwemeId:Ljava/lang/String;

    .line 24
    .line 25
    iget-boolean v14, v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->hasNewAweme:Z

    .line 26
    .line 27
    iget v15, v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->newAwemeCount:I

    .line 28
    .line 29
    move/from16 v16, v15

    .line 30
    .line 31
    iget-object v15, v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->knownAwemeIds:Ljava/util/Set;

    .line 32
    .line 33
    move-object/from16 v17, v15

    .line 34
    .line 35
    iget-object v15, v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->newAwemeItems:Ljava/util/List;

    .line 36
    .line 37
    iget-boolean v0, v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->notificationEnabled:Z

    .line 38
    .line 39
    move/from16 p0, v0

    .line 40
    .line 41
    const-string v0, ", secUid="

    .line 42
    .line 43
    move-object/from16 v18, v15

    .line 44
    .line 45
    const-string v15, ", nickname="

    .line 46
    .line 47
    move/from16 v19, v14

    .line 48
    .line 49
    const-string v14, "ProfileBookmarkRecord(uid="

    .line 50
    .line 51
    invoke-static {v14, v1, v0, v2, v15}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    const-string v1, ", signature="

    .line 56
    .line 57
    const-string v2, ", avatarUrl="

    .line 58
    .line 59
    invoke-static {v0, v3, v1, v4, v2}, Lnx;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const-string v1, ", group="

    .line 63
    .line 64
    const-string v2, ", remark="

    .line 65
    .line 66
    invoke-static {v0, v5, v1, v6, v2}, Lnx;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string v1, ", createTimestamp="

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string v1, ", lastCheckTimestamp="

    .line 81
    .line 82
    const-string v2, ", lastAwemeCount="

    .line 83
    .line 84
    invoke-static {v0, v1, v10, v11, v2}, Lnx;->Β(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 85
    .line 86
    .line 87
    const-string v1, ", lastNewestAwemeId="

    .line 88
    .line 89
    const-string v2, ", hasNewAweme="

    .line 90
    .line 91
    invoke-static {v0, v12, v1, v13, v2}, Llz1;->Α(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    move/from16 v1, v19

    .line 95
    .line 96
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    const-string v1, ", newAwemeCount="

    .line 100
    .line 101
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    move/from16 v1, v16

    .line 105
    .line 106
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    const-string v1, ", knownAwemeIds="

    .line 110
    .line 111
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    move-object/from16 v1, v17

    .line 115
    .line 116
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    const-string v1, ", newAwemeItems="

    .line 120
    .line 121
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    move-object/from16 v1, v18

    .line 125
    .line 126
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    const-string v1, ", notificationEnabled="

    .line 130
    .line 131
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    const-string v1, ")"

    .line 135
    .line 136
    move/from16 v2, p0

    .line 137
    .line 138
    invoke-static {v0, v2, v1}, Llz1;->σ(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    return-object v0
.end method

.method public final uniqueKey()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->secUid:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->secUid:Ljava/lang/String;

    .line 10
    .line 11
    const-string v0, "secUid:"

    .line 12
    .line 13
    invoke-static {v0, p0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_0
    iget-object v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->uid:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->uid:Ljava/lang/String;

    .line 27
    .line 28
    const-string v0, "uid:"

    .line 29
    .line 30
    invoke-static {v0, p0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :cond_1
    iget-object v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->nickname:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_2

    .line 42
    .line 43
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->nickname:Ljava/lang/String;

    .line 44
    .line 45
    const-string v0, "nickname:"

    .line 46
    .line 47
    invoke-static {v0, p0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0

    .line 52
    :cond_2
    const-string p0, ""

    .line 53
    .line 54
    return-object p0
.end method
