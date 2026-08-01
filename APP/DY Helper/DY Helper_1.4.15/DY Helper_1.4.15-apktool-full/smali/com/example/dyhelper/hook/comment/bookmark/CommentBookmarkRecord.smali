.class public final Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord$Companion;
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord$Companion;


# instance fields
.field private final authorName:Ljava/lang/String;

.field private aweType:I

.field private awemeAuthorId:Ljava/lang/String;

.field private awemeAuthorSecUid:Ljava/lang/String;

.field private final awemeId:Ljava/lang/String;

.field private awemeTitle:Ljava/lang/String;

.field private final commentCreateTime:J

.field private final commentId:Ljava/lang/String;

.field private commentSecUid:Ljava/lang/String;

.field private final content:Ljava/lang/String;

.field private coverUrl:Ljava/lang/String;

.field private final createTimestamp:J

.field private hasNewReplies:Z

.field private knownReplyIds:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private lastCheckTimestamp:J

.field private lastKnownReplyCount:I

.field private newReplyCount:I

.field private newReplyItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;",
            ">;"
        }
    .end annotation
.end field

.field private final notificationEnabled:Z

.field private final remark:Ljava/lang/String;

.field private final userTag:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord$Companion;-><init>(Lzq;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->Companion:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord$Companion;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->$stable:I

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZLjava/lang/String;Ljava/lang/String;JIZILjava/util/Set;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "JJZ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "JIZI",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I)V"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p17 .. p17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p18 .. p18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->commentId:Ljava/lang/String;

    .line 8
    iput-object p2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->awemeId:Ljava/lang/String;

    .line 9
    iput-object p3, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->content:Ljava/lang/String;

    .line 10
    iput-object p4, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->authorName:Ljava/lang/String;

    .line 11
    iput-wide p5, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->commentCreateTime:J

    .line 12
    iput-wide p7, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->createTimestamp:J

    .line 13
    iput-boolean p9, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->notificationEnabled:Z

    .line 14
    iput-object p10, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->userTag:Ljava/lang/String;

    .line 15
    iput-object p11, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->remark:Ljava/lang/String;

    .line 16
    iput-wide p12, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->lastCheckTimestamp:J

    .line 17
    iput p14, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->lastKnownReplyCount:I

    .line 18
    iput-boolean p15, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->hasNewReplies:Z

    move/from16 p1, p16

    .line 19
    iput p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->newReplyCount:I

    move-object/from16 p1, p17

    .line 20
    iput-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->knownReplyIds:Ljava/util/Set;

    move-object/from16 p1, p18

    .line 21
    iput-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->newReplyItems:Ljava/util/List;

    move-object/from16 p1, p19

    .line 22
    iput-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->awemeAuthorId:Ljava/lang/String;

    move-object/from16 p1, p20

    .line 23
    iput-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->awemeAuthorSecUid:Ljava/lang/String;

    move-object/from16 p1, p21

    .line 24
    iput-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->awemeTitle:Ljava/lang/String;

    move-object/from16 p1, p22

    .line 25
    iput-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->commentSecUid:Ljava/lang/String;

    move-object/from16 p1, p23

    .line 26
    iput-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->coverUrl:Ljava/lang/String;

    move/from16 p1, p24

    .line 27
    iput p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->aweType:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZLjava/lang/String;Ljava/lang/String;JIZILjava/util/Set;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILzq;)V
    .locals 22

    move/from16 v0, p25

    and-int/lit8 v1, v0, 0x2

    .line 1
    const-string v2, ""

    if-eqz v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    move-object/from16 v1, p2

    :goto_0
    and-int/lit8 v3, v0, 0x4

    if-eqz v3, :cond_1

    move-object v3, v2

    goto :goto_1

    :cond_1
    move-object/from16 v3, p3

    :goto_1
    and-int/lit8 v4, v0, 0x8

    if-eqz v4, :cond_2

    move-object v4, v2

    goto :goto_2

    :cond_2
    move-object/from16 v4, p4

    :goto_2
    and-int/lit8 v5, v0, 0x10

    const-wide/16 v6, 0x0

    if-eqz v5, :cond_3

    move-wide v8, v6

    goto :goto_3

    :cond_3
    move-wide/from16 v8, p5

    :goto_3
    and-int/lit8 v5, v0, 0x20

    if-eqz v5, :cond_4

    .line 2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    goto :goto_4

    :cond_4
    move-wide/from16 v10, p7

    :goto_4
    and-int/lit8 v5, v0, 0x40

    if-eqz v5, :cond_5

    const/4 v5, 0x1

    goto :goto_5

    :cond_5
    move/from16 v5, p9

    :goto_5
    and-int/lit16 v12, v0, 0x80

    if-eqz v12, :cond_6

    move-object v12, v2

    goto :goto_6

    :cond_6
    move-object/from16 v12, p10

    :goto_6
    and-int/lit16 v13, v0, 0x100

    if-eqz v13, :cond_7

    goto :goto_7

    :cond_7
    move-object/from16 v2, p11

    :goto_7
    and-int/lit16 v13, v0, 0x200

    if-eqz v13, :cond_8

    goto :goto_8

    :cond_8
    move-wide/from16 v6, p12

    :goto_8
    and-int/lit16 v13, v0, 0x400

    if-eqz v13, :cond_9

    const/4 v13, 0x0

    goto :goto_9

    :cond_9
    move/from16 v13, p14

    :goto_9
    and-int/lit16 v15, v0, 0x800

    if-eqz v15, :cond_a

    const/4 v15, 0x0

    goto :goto_a

    :cond_a
    move/from16 v15, p15

    :goto_a
    and-int/lit16 v14, v0, 0x1000

    if-eqz v14, :cond_b

    const/4 v14, 0x0

    goto :goto_b

    :cond_b
    move/from16 v14, p16

    :goto_b
    move-object/from16 p2, v1

    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_c

    .line 3
    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    goto :goto_c

    :cond_c
    move-object/from16 v1, p17

    :goto_c
    move-object/from16 p3, v1

    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_d

    .line 4
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    goto :goto_d

    :cond_d
    move-object/from16 v1, p18

    :goto_d
    const v16, 0x8000

    and-int v16, v0, v16

    const/16 v17, 0x0

    if-eqz v16, :cond_e

    move-object/from16 v16, v17

    goto :goto_e

    :cond_e
    move-object/from16 v16, p19

    :goto_e
    const/high16 v18, 0x10000

    and-int v18, v0, v18

    if-eqz v18, :cond_f

    move-object/from16 v18, v17

    goto :goto_f

    :cond_f
    move-object/from16 v18, p20

    :goto_f
    const/high16 v19, 0x20000

    and-int v19, v0, v19

    if-eqz v19, :cond_10

    move-object/from16 v19, v17

    goto :goto_10

    :cond_10
    move-object/from16 v19, p21

    :goto_10
    const/high16 v20, 0x40000

    and-int v20, v0, v20

    if-eqz v20, :cond_11

    move-object/from16 v20, v17

    goto :goto_11

    :cond_11
    move-object/from16 v20, p22

    :goto_11
    const/high16 v21, 0x80000

    and-int v21, v0, v21

    if-eqz v21, :cond_12

    goto :goto_12

    :cond_12
    move-object/from16 v17, p23

    :goto_12
    const/high16 v21, 0x100000

    and-int v0, v0, v21

    if-eqz v0, :cond_13

    const/16 v0, 0x2904

    move/from16 p26, v0

    :goto_13
    move-object/from16 p4, p2

    move-object/from16 p19, p3

    move-object/from16 p20, v1

    move-object/from16 p13, v2

    move-object/from16 p5, v3

    move-object/from16 p6, v4

    move/from16 p11, v5

    move-wide/from16 p14, v6

    move-wide/from16 p7, v8

    move-wide/from16 p9, v10

    move-object/from16 p12, v12

    move/from16 p16, v13

    move/from16 p18, v14

    move/from16 p17, v15

    move-object/from16 p21, v16

    move-object/from16 p25, v17

    move-object/from16 p22, v18

    move-object/from16 p23, v19

    move-object/from16 p24, v20

    move-object/from16 p2, p0

    move-object/from16 p3, p1

    goto :goto_14

    :cond_13
    move/from16 p26, p24

    goto :goto_13

    .line 5
    :goto_14
    invoke-direct/range {p2 .. p26}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZLjava/lang/String;Ljava/lang/String;JIZILjava/util/Set;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZLjava/lang/String;Ljava/lang/String;JIZILjava/util/Set;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Object;)Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    move/from16 v1, p25

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->commentId:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->awemeId:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->content:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->authorName:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-wide v6, v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->commentCreateTime:J

    goto :goto_4

    :cond_4
    move-wide/from16 v6, p5

    :goto_4
    and-int/lit8 v8, v1, 0x20

    if-eqz v8, :cond_5

    iget-wide v8, v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->createTimestamp:J

    goto :goto_5

    :cond_5
    move-wide/from16 v8, p7

    :goto_5
    and-int/lit8 v10, v1, 0x40

    if-eqz v10, :cond_6

    iget-boolean v10, v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->notificationEnabled:Z

    goto :goto_6

    :cond_6
    move/from16 v10, p9

    :goto_6
    and-int/lit16 v11, v1, 0x80

    if-eqz v11, :cond_7

    iget-object v11, v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->userTag:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v11, p10

    :goto_7
    and-int/lit16 v12, v1, 0x100

    if-eqz v12, :cond_8

    iget-object v12, v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->remark:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v12, p11

    :goto_8
    and-int/lit16 v13, v1, 0x200

    if-eqz v13, :cond_9

    iget-wide v13, v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->lastCheckTimestamp:J

    goto :goto_9

    :cond_9
    move-wide/from16 v13, p12

    :goto_9
    and-int/lit16 v15, v1, 0x400

    if-eqz v15, :cond_a

    iget v15, v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->lastKnownReplyCount:I

    goto :goto_a

    :cond_a
    move/from16 v15, p14

    :goto_a
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x800

    if-eqz v2, :cond_b

    iget-boolean v2, v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->hasNewReplies:Z

    goto :goto_b

    :cond_b
    move/from16 v2, p15

    :goto_b
    move/from16 p2, v2

    and-int/lit16 v2, v1, 0x1000

    if-eqz v2, :cond_c

    iget v2, v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->newReplyCount:I

    goto :goto_c

    :cond_c
    move/from16 v2, p16

    :goto_c
    move/from16 p3, v2

    and-int/lit16 v2, v1, 0x2000

    if-eqz v2, :cond_d

    iget-object v2, v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->knownReplyIds:Ljava/util/Set;

    goto :goto_d

    :cond_d
    move-object/from16 v2, p17

    :goto_d
    move-object/from16 p4, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->newReplyItems:Ljava/util/List;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p18

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->awemeAuthorId:Ljava/lang/String;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p19

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p25, v16

    move-object/from16 p5, v1

    if-eqz v16, :cond_10

    iget-object v1, v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->awemeAuthorSecUid:Ljava/lang/String;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p20

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p25, v16

    move-object/from16 p6, v1

    if-eqz v16, :cond_11

    iget-object v1, v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->awemeTitle:Ljava/lang/String;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p21

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p25, v16

    move-object/from16 p7, v1

    if-eqz v16, :cond_12

    iget-object v1, v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->commentSecUid:Ljava/lang/String;

    goto :goto_12

    :cond_12
    move-object/from16 v1, p22

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, p25, v16

    move-object/from16 p8, v1

    if-eqz v16, :cond_13

    iget-object v1, v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->coverUrl:Ljava/lang/String;

    goto :goto_13

    :cond_13
    move-object/from16 v1, p23

    :goto_13
    const/high16 v16, 0x100000

    and-int v16, p25, v16

    if-eqz v16, :cond_14

    move-object/from16 p9, v1

    iget v1, v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->aweType:I

    move-object/from16 p24, p9

    move/from16 p25, v1

    :goto_14
    move/from16 p16, p2

    move/from16 p17, p3

    move-object/from16 p18, p4

    move-object/from16 p20, p5

    move-object/from16 p21, p6

    move-object/from16 p22, p7

    move-object/from16 p23, p8

    move-object/from16 p19, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-wide/from16 p6, v6

    move-wide/from16 p8, v8

    move/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-wide/from16 p13, v13

    move/from16 p15, v15

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_15

    :cond_14
    move/from16 p25, p24

    move-object/from16 p24, v1

    goto :goto_14

    :goto_15
    invoke-virtual/range {p1 .. p25}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZLjava/lang/String;Ljava/lang/String;JIZILjava/util/Set;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->commentId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component10()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->lastCheckTimestamp:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final component11()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->lastKnownReplyCount:I

    .line 2
    .line 3
    return p0
.end method

.method public final component12()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->hasNewReplies:Z

    .line 2
    .line 3
    return p0
.end method

.method public final component13()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->newReplyCount:I

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
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->knownReplyIds:Ljava/util/Set;

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
            "Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->newReplyItems:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component16()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->awemeAuthorId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component17()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->awemeAuthorSecUid:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component18()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->awemeTitle:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component19()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->commentSecUid:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component2()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->awemeId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component20()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->coverUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component21()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->aweType:I

    .line 2
    .line 3
    return p0
.end method

.method public final component3()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->content:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component4()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->authorName:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component5()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->commentCreateTime:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final component6()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->createTimestamp:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final component7()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->notificationEnabled:Z

    .line 2
    .line 3
    return p0
.end method

.method public final component8()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->userTag:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component9()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->remark:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZLjava/lang/String;Ljava/lang/String;JIZILjava/util/Set;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "JJZ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "JIZI",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I)",
            "Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;"
        }
    .end annotation

    .line 1
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p4 .. p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p10 .. p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p11 .. p11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p17 .. p17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p18 .. p18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-wide/from16 v5, p5

    move-wide/from16 v7, p7

    move/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-wide/from16 v12, p12

    move/from16 v14, p14

    move/from16 v15, p15

    move/from16 v16, p16

    move-object/from16 v17, p17

    move-object/from16 v18, p18

    move-object/from16 v19, p19

    move-object/from16 v20, p20

    move-object/from16 v21, p21

    move-object/from16 v22, p22

    move-object/from16 v23, p23

    move/from16 v24, p24

    invoke-direct/range {v0 .. v24}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZLjava/lang/String;Ljava/lang/String;JIZILjava/util/Set;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

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
    instance-of v1, p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;

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
    check-cast p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->commentId:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->commentId:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->awemeId:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->awemeId:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->content:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->content:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->authorName:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->authorName:Ljava/lang/String;

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
    iget-wide v3, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->commentCreateTime:J

    .line 58
    .line 59
    iget-wide v5, p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->commentCreateTime:J

    .line 60
    .line 61
    cmp-long v1, v3, v5

    .line 62
    .line 63
    if-eqz v1, :cond_6

    .line 64
    .line 65
    return v2

    .line 66
    :cond_6
    iget-wide v3, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->createTimestamp:J

    .line 67
    .line 68
    iget-wide v5, p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->createTimestamp:J

    .line 69
    .line 70
    cmp-long v1, v3, v5

    .line 71
    .line 72
    if-eqz v1, :cond_7

    .line 73
    .line 74
    return v2

    .line 75
    :cond_7
    iget-boolean v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->notificationEnabled:Z

    .line 76
    .line 77
    iget-boolean v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->notificationEnabled:Z

    .line 78
    .line 79
    if-eq v1, v3, :cond_8

    .line 80
    .line 81
    return v2

    .line 82
    :cond_8
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->userTag:Ljava/lang/String;

    .line 83
    .line 84
    iget-object v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->userTag:Ljava/lang/String;

    .line 85
    .line 86
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-nez v1, :cond_9

    .line 91
    .line 92
    return v2

    .line 93
    :cond_9
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->remark:Ljava/lang/String;

    .line 94
    .line 95
    iget-object v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->remark:Ljava/lang/String;

    .line 96
    .line 97
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-nez v1, :cond_a

    .line 102
    .line 103
    return v2

    .line 104
    :cond_a
    iget-wide v3, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->lastCheckTimestamp:J

    .line 105
    .line 106
    iget-wide v5, p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->lastCheckTimestamp:J

    .line 107
    .line 108
    cmp-long v1, v3, v5

    .line 109
    .line 110
    if-eqz v1, :cond_b

    .line 111
    .line 112
    return v2

    .line 113
    :cond_b
    iget v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->lastKnownReplyCount:I

    .line 114
    .line 115
    iget v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->lastKnownReplyCount:I

    .line 116
    .line 117
    if-eq v1, v3, :cond_c

    .line 118
    .line 119
    return v2

    .line 120
    :cond_c
    iget-boolean v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->hasNewReplies:Z

    .line 121
    .line 122
    iget-boolean v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->hasNewReplies:Z

    .line 123
    .line 124
    if-eq v1, v3, :cond_d

    .line 125
    .line 126
    return v2

    .line 127
    :cond_d
    iget v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->newReplyCount:I

    .line 128
    .line 129
    iget v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->newReplyCount:I

    .line 130
    .line 131
    if-eq v1, v3, :cond_e

    .line 132
    .line 133
    return v2

    .line 134
    :cond_e
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->knownReplyIds:Ljava/util/Set;

    .line 135
    .line 136
    iget-object v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->knownReplyIds:Ljava/util/Set;

    .line 137
    .line 138
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    if-nez v1, :cond_f

    .line 143
    .line 144
    return v2

    .line 145
    :cond_f
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->newReplyItems:Ljava/util/List;

    .line 146
    .line 147
    iget-object v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->newReplyItems:Ljava/util/List;

    .line 148
    .line 149
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    if-nez v1, :cond_10

    .line 154
    .line 155
    return v2

    .line 156
    :cond_10
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->awemeAuthorId:Ljava/lang/String;

    .line 157
    .line 158
    iget-object v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->awemeAuthorId:Ljava/lang/String;

    .line 159
    .line 160
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    if-nez v1, :cond_11

    .line 165
    .line 166
    return v2

    .line 167
    :cond_11
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->awemeAuthorSecUid:Ljava/lang/String;

    .line 168
    .line 169
    iget-object v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->awemeAuthorSecUid:Ljava/lang/String;

    .line 170
    .line 171
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    if-nez v1, :cond_12

    .line 176
    .line 177
    return v2

    .line 178
    :cond_12
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->awemeTitle:Ljava/lang/String;

    .line 179
    .line 180
    iget-object v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->awemeTitle:Ljava/lang/String;

    .line 181
    .line 182
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v1

    .line 186
    if-nez v1, :cond_13

    .line 187
    .line 188
    return v2

    .line 189
    :cond_13
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->commentSecUid:Ljava/lang/String;

    .line 190
    .line 191
    iget-object v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->commentSecUid:Ljava/lang/String;

    .line 192
    .line 193
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v1

    .line 197
    if-nez v1, :cond_14

    .line 198
    .line 199
    return v2

    .line 200
    :cond_14
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->coverUrl:Ljava/lang/String;

    .line 201
    .line 202
    iget-object v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->coverUrl:Ljava/lang/String;

    .line 203
    .line 204
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result v1

    .line 208
    if-nez v1, :cond_15

    .line 209
    .line 210
    return v2

    .line 211
    :cond_15
    iget p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->aweType:I

    .line 212
    .line 213
    iget p1, p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->aweType:I

    .line 214
    .line 215
    if-eq p0, p1, :cond_16

    .line 216
    .line 217
    return v2

    .line 218
    :cond_16
    return v0
.end method

.method public final getAuthorName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->authorName:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getAweType()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->aweType:I

    .line 2
    .line 3
    return p0
.end method

.method public final getAwemeAuthorId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->awemeAuthorId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getAwemeAuthorSecUid()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->awemeAuthorSecUid:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getAwemeId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->awemeId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getAwemeTitle()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->awemeTitle:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getCommentCreateTime()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->commentCreateTime:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getCommentId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->commentId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getCommentSecUid()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->commentSecUid:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getContent()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->content:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getCoverUrl()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->coverUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getCreateTimestamp()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->createTimestamp:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getHasNewReplies()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->hasNewReplies:Z

    .line 2
    .line 3
    return p0
.end method

.method public final getKnownReplyIds()Ljava/util/Set;
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
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->knownReplyIds:Ljava/util/Set;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getLastCheckTimestamp()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->lastCheckTimestamp:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getLastKnownReplyCount()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->lastKnownReplyCount:I

    .line 2
    .line 3
    return p0
.end method

.method public final getNewReplyCount()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->newReplyCount:I

    .line 2
    .line 3
    return p0
.end method

.method public final getNewReplyItems()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->newReplyItems:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getNotificationEnabled()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->notificationEnabled:Z

    .line 2
    .line 3
    return p0
.end method

.method public final getRemark()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->remark:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getUserTag()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->userTag:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->commentId:Ljava/lang/String;

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
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->awemeId:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->content:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->authorName:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-wide v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->commentCreateTime:J

    .line 29
    .line 30
    invoke-static {v0, v1, v2, v3}, Llz1;->β(IIJ)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-wide v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->createTimestamp:J

    .line 35
    .line 36
    invoke-static {v0, v1, v2, v3}, Llz1;->β(IIJ)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-boolean v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->notificationEnabled:Z

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, Llz1;->γ(IIZ)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->userTag:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->remark:Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-wide v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->lastCheckTimestamp:J

    .line 59
    .line 60
    invoke-static {v0, v1, v2, v3}, Llz1;->β(IIJ)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->lastKnownReplyCount:I

    .line 65
    .line 66
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget-boolean v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->hasNewReplies:Z

    .line 71
    .line 72
    invoke-static {v0, v1, v2}, Llz1;->γ(IIZ)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    iget v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->newReplyCount:I

    .line 77
    .line 78
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->knownReplyIds:Ljava/util/Set;

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
    iget-object v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->newReplyItems:Ljava/util/List;

    .line 91
    .line 92
    invoke-static {v0, v2, v1}, La12;->γ(Ljava/util/List;II)I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->awemeAuthorId:Ljava/lang/String;

    .line 97
    .line 98
    const/4 v3, 0x0

    .line 99
    if-nez v2, :cond_0

    .line 100
    .line 101
    move v2, v3

    .line 102
    goto :goto_0

    .line 103
    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    :goto_0
    add-int/2addr v0, v2

    .line 108
    mul-int/2addr v0, v1

    .line 109
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->awemeAuthorSecUid:Ljava/lang/String;

    .line 110
    .line 111
    if-nez v2, :cond_1

    .line 112
    .line 113
    move v2, v3

    .line 114
    goto :goto_1

    .line 115
    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    :goto_1
    add-int/2addr v0, v2

    .line 120
    mul-int/2addr v0, v1

    .line 121
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->awemeTitle:Ljava/lang/String;

    .line 122
    .line 123
    if-nez v2, :cond_2

    .line 124
    .line 125
    move v2, v3

    .line 126
    goto :goto_2

    .line 127
    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 128
    .line 129
    .line 130
    move-result v2

    .line 131
    :goto_2
    add-int/2addr v0, v2

    .line 132
    mul-int/2addr v0, v1

    .line 133
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->commentSecUid:Ljava/lang/String;

    .line 134
    .line 135
    if-nez v2, :cond_3

    .line 136
    .line 137
    move v2, v3

    .line 138
    goto :goto_3

    .line 139
    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    :goto_3
    add-int/2addr v0, v2

    .line 144
    mul-int/2addr v0, v1

    .line 145
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->coverUrl:Ljava/lang/String;

    .line 146
    .line 147
    if-nez v2, :cond_4

    .line 148
    .line 149
    goto :goto_4

    .line 150
    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 151
    .line 152
    .line 153
    move-result v3

    .line 154
    :goto_4
    add-int/2addr v0, v3

    .line 155
    mul-int/2addr v0, v1

    .line 156
    iget p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->aweType:I

    .line 157
    .line 158
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    .line 159
    .line 160
    .line 161
    move-result p0

    .line 162
    add-int/2addr p0, v0

    .line 163
    return p0
.end method

.method public final setAweType(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->aweType:I

    .line 2
    .line 3
    return-void
.end method

.method public final setAwemeAuthorId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->awemeAuthorId:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setAwemeAuthorSecUid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->awemeAuthorSecUid:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setAwemeTitle(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->awemeTitle:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setCommentSecUid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->commentSecUid:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setCoverUrl(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->coverUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setHasNewReplies(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->hasNewReplies:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setKnownReplyIds(Ljava/util/Set;)V
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
    iput-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->knownReplyIds:Ljava/util/Set;

    .line 5
    .line 6
    return-void
.end method

.method public final setLastCheckTimestamp(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->lastCheckTimestamp:J

    .line 2
    .line 3
    return-void
.end method

.method public final setLastKnownReplyCount(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->lastKnownReplyCount:I

    .line 2
    .line 3
    return-void
.end method

.method public final setNewReplyCount(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->newReplyCount:I

    .line 2
    .line 3
    return-void
.end method

.method public final setNewReplyItems(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->newReplyItems:Ljava/util/List;

    .line 5
    .line 6
    return-void
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
    const-string v1, "commentId"

    .line 7
    .line 8
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->commentId:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "awemeId"

    .line 15
    .line 16
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->awemeId:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "content"

    .line 23
    .line 24
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->content:Ljava/lang/String;

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
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->authorName:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const-string v1, "commentCreateTime"

    .line 39
    .line 40
    iget-wide v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->commentCreateTime:J

    .line 41
    .line 42
    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    const-string v1, "createTimestamp"

    .line 47
    .line 48
    iget-wide v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->createTimestamp:J

    .line 49
    .line 50
    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    const-string v1, "notificationEnabled"

    .line 55
    .line 56
    iget-boolean v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->notificationEnabled:Z

    .line 57
    .line 58
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    const-string v1, "userTag"

    .line 63
    .line 64
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->userTag:Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    const-string v1, "remark"

    .line 71
    .line 72
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->remark:Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    const-string v1, "lastCheckTimestamp"

    .line 79
    .line 80
    iget-wide v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->lastCheckTimestamp:J

    .line 81
    .line 82
    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    const-string v1, "lastKnownReplyCount"

    .line 87
    .line 88
    iget v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->lastKnownReplyCount:I

    .line 89
    .line 90
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    const-string v1, "hasNewReplies"

    .line 95
    .line 96
    iget-boolean v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->hasNewReplies:Z

    .line 97
    .line 98
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    const-string v1, "newReplyCount"

    .line 103
    .line 104
    iget v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->newReplyCount:I

    .line 105
    .line 106
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    new-instance v1, Lorg/json/JSONArray;

    .line 111
    .line 112
    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 113
    .line 114
    .line 115
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->knownReplyIds:Ljava/util/Set;

    .line 116
    .line 117
    check-cast v2, Ljava/lang/Iterable;

    .line 118
    .line 119
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    if-eqz v3, :cond_0

    .line 128
    .line 129
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    check-cast v3, Ljava/lang/String;

    .line 134
    .line 135
    invoke-virtual {v1, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 136
    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_0
    const-string v2, "knownReplyIds"

    .line 140
    .line 141
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 142
    .line 143
    .line 144
    new-instance v1, Lorg/json/JSONArray;

    .line 145
    .line 146
    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 147
    .line 148
    .line 149
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->newReplyItems:Ljava/util/List;

    .line 150
    .line 151
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    if-eqz v3, :cond_1

    .line 160
    .line 161
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    check-cast v3, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;

    .line 166
    .line 167
    invoke-virtual {v3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->toJson()Lorg/json/JSONObject;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    invoke-virtual {v1, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 172
    .line 173
    .line 174
    goto :goto_1

    .line 175
    :cond_1
    const-string v2, "newReplyItems"

    .line 176
    .line 177
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 178
    .line 179
    .line 180
    const-string v1, "awemeAuthorId"

    .line 181
    .line 182
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->awemeAuthorId:Ljava/lang/String;

    .line 183
    .line 184
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 185
    .line 186
    .line 187
    const-string v1, "awemeAuthorSecUid"

    .line 188
    .line 189
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->awemeAuthorSecUid:Ljava/lang/String;

    .line 190
    .line 191
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 192
    .line 193
    .line 194
    const-string v1, "awemeTitle"

    .line 195
    .line 196
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->awemeTitle:Ljava/lang/String;

    .line 197
    .line 198
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 199
    .line 200
    .line 201
    const-string v1, "commentSecUid"

    .line 202
    .line 203
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->commentSecUid:Ljava/lang/String;

    .line 204
    .line 205
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 206
    .line 207
    .line 208
    const-string v1, "coverUrl"

    .line 209
    .line 210
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->coverUrl:Ljava/lang/String;

    .line 211
    .line 212
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 213
    .line 214
    .line 215
    const-string v1, "aweType"

    .line 216
    .line 217
    iget p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->aweType:I

    .line 218
    .line 219
    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 220
    .line 221
    .line 222
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->commentId:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->awemeId:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->content:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->authorName:Ljava/lang/String;

    .line 10
    .line 11
    iget-wide v5, v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->commentCreateTime:J

    .line 12
    .line 13
    iget-wide v7, v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->createTimestamp:J

    .line 14
    .line 15
    iget-boolean v9, v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->notificationEnabled:Z

    .line 16
    .line 17
    iget-object v10, v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->userTag:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v11, v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->remark:Ljava/lang/String;

    .line 20
    .line 21
    iget-wide v12, v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->lastCheckTimestamp:J

    .line 22
    .line 23
    iget v14, v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->lastKnownReplyCount:I

    .line 24
    .line 25
    iget-boolean v15, v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->hasNewReplies:Z

    .line 26
    .line 27
    move/from16 v16, v15

    .line 28
    .line 29
    iget v15, v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->newReplyCount:I

    .line 30
    .line 31
    move/from16 v17, v15

    .line 32
    .line 33
    iget-object v15, v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->knownReplyIds:Ljava/util/Set;

    .line 34
    .line 35
    move-object/from16 v18, v15

    .line 36
    .line 37
    iget-object v15, v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->newReplyItems:Ljava/util/List;

    .line 38
    .line 39
    move-object/from16 v19, v15

    .line 40
    .line 41
    iget-object v15, v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->awemeAuthorId:Ljava/lang/String;

    .line 42
    .line 43
    move-object/from16 v20, v15

    .line 44
    .line 45
    iget-object v15, v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->awemeAuthorSecUid:Ljava/lang/String;

    .line 46
    .line 47
    move-object/from16 v21, v15

    .line 48
    .line 49
    iget-object v15, v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->awemeTitle:Ljava/lang/String;

    .line 50
    .line 51
    move-object/from16 v22, v15

    .line 52
    .line 53
    iget-object v15, v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->commentSecUid:Ljava/lang/String;

    .line 54
    .line 55
    move-object/from16 v23, v15

    .line 56
    .line 57
    iget-object v15, v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->coverUrl:Ljava/lang/String;

    .line 58
    .line 59
    iget v0, v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->aweType:I

    .line 60
    .line 61
    move/from16 p0, v0

    .line 62
    .line 63
    const-string v0, ", awemeId="

    .line 64
    .line 65
    move-object/from16 v24, v15

    .line 66
    .line 67
    const-string v15, ", content="

    .line 68
    .line 69
    move/from16 v25, v14

    .line 70
    .line 71
    const-string v14, "CommentBookmarkRecord(commentId="

    .line 72
    .line 73
    invoke-static {v14, v1, v0, v2, v15}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    const-string v1, ", authorName="

    .line 78
    .line 79
    const-string v2, ", commentCreateTime="

    .line 80
    .line 81
    invoke-static {v0, v3, v1, v4, v2}, Lnx;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const-string v1, ", createTimestamp="

    .line 88
    .line 89
    const-string v2, ", notificationEnabled="

    .line 90
    .line 91
    invoke-static {v0, v1, v7, v8, v2}, Lnx;->Β(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    const-string v1, ", userTag="

    .line 98
    .line 99
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    const-string v1, ", remark="

    .line 106
    .line 107
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    const-string v1, ", lastCheckTimestamp="

    .line 114
    .line 115
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    const-string v1, ", lastKnownReplyCount="

    .line 122
    .line 123
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    move/from16 v1, v25

    .line 127
    .line 128
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    const-string v1, ", hasNewReplies="

    .line 132
    .line 133
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    move/from16 v1, v16

    .line 137
    .line 138
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    const-string v1, ", newReplyCount="

    .line 142
    .line 143
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    move/from16 v1, v17

    .line 147
    .line 148
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    const-string v1, ", knownReplyIds="

    .line 152
    .line 153
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    move-object/from16 v1, v18

    .line 157
    .line 158
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    const-string v1, ", newReplyItems="

    .line 162
    .line 163
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    move-object/from16 v1, v19

    .line 167
    .line 168
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    const-string v1, ", awemeAuthorId="

    .line 172
    .line 173
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    move-object/from16 v1, v20

    .line 177
    .line 178
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    const-string v1, ", awemeAuthorSecUid="

    .line 182
    .line 183
    const-string v2, ", awemeTitle="

    .line 184
    .line 185
    move-object/from16 v3, v21

    .line 186
    .line 187
    move-object/from16 v4, v22

    .line 188
    .line 189
    invoke-static {v0, v1, v3, v2, v4}, Lnx;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    const-string v1, ", commentSecUid="

    .line 193
    .line 194
    const-string v2, ", coverUrl="

    .line 195
    .line 196
    move-object/from16 v3, v23

    .line 197
    .line 198
    move-object/from16 v4, v24

    .line 199
    .line 200
    invoke-static {v0, v1, v3, v2, v4}, Lnx;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    const-string v1, ", aweType="

    .line 204
    .line 205
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    move/from16 v1, p0

    .line 209
    .line 210
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    const-string v1, ")"

    .line 214
    .line 215
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    return-object v0
.end method
