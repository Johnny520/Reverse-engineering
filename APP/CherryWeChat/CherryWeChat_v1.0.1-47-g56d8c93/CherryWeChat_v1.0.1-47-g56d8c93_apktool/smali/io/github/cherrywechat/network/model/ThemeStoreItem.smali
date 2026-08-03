.class public final Lio/github/cherrywechat/network/model/ThemeStoreItem;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/github/cherrywechat/network/model/ThemeStoreItem$$serializer;,
        Lio/github/cherrywechat/network/model/ThemeStoreItem$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lio/github/cherrywechat/network/model/ThemeStoreItem$Companion;


# instance fields
.field private final author:Ljava/lang/String;

.field private final coverImage:Ljava/lang/String;

.field private final demoUrl:Ljava/lang/String;

.field private final description:Ljava/lang/String;

.field private final downloadCount:I

.field private final featured:Z

.field private final id:Ljava/lang/String;

.field private final name:Ljava/lang/String;

.field private final price:D

.field private final screenshots:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/github/cherrywechat/network/model/ThemeStoreItem$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/github/cherrywechat/network/model/ThemeStoreItem$Companion;-><init>(LOc;)V

    sput-object v0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->Companion:Lio/github/cherrywechat/network/model/ThemeStoreItem$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 14

    .line 1
    const/16 v12, 0x3ff

    const/4 v13, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v13}, Lio/github/cherrywechat/network/model/ThemeStoreItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZIILOc;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZILGx;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p13, p1, 0x1

    const-string v0, ""

    if-nez p13, :cond_0

    iput-object v0, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->id:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    iput-object v0, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->name:Ljava/lang/String;

    goto :goto_1

    :cond_1
    iput-object p3, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->name:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object v0, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->author:Ljava/lang/String;

    goto :goto_2

    :cond_2
    iput-object p4, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->author:Ljava/lang/String;

    :goto_2
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    const-wide/16 p2, 0x0

    iput-wide p2, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->price:D

    goto :goto_3

    :cond_3
    iput-wide p5, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->price:D

    :goto_3
    and-int/lit8 p2, p1, 0x10

    const/4 p3, 0x0

    if-nez p2, :cond_4

    iput-object p3, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->demoUrl:Ljava/lang/String;

    goto :goto_4

    :cond_4
    iput-object p7, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->demoUrl:Ljava/lang/String;

    :goto_4
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    iput-object p3, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->coverImage:Ljava/lang/String;

    goto :goto_5

    :cond_5
    iput-object p8, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->coverImage:Ljava/lang/String;

    :goto_5
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_6

    .line 3
    sget-object p2, LKf;->a:LKf;

    .line 4
    iput-object p2, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->screenshots:Ljava/util/List;

    goto :goto_6

    :cond_6
    iput-object p9, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->screenshots:Ljava/util/List;

    :goto_6
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_7

    iput-object v0, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->description:Ljava/lang/String;

    goto :goto_7

    :cond_7
    iput-object p10, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->description:Ljava/lang/String;

    :goto_7
    and-int/lit16 p2, p1, 0x100

    const/4 p3, 0x0

    if-nez p2, :cond_8

    iput-boolean p3, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->featured:Z

    goto :goto_8

    :cond_8
    iput-boolean p11, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->featured:Z

    :goto_8
    and-int/lit16 p1, p1, 0x200

    if-nez p1, :cond_9

    iput p3, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->downloadCount:I

    return-void

    :cond_9
    iput p12, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->downloadCount:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZI)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "D",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "ZI)V"
        }
    .end annotation

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->id:Ljava/lang/String;

    .line 7
    iput-object p2, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->name:Ljava/lang/String;

    .line 8
    iput-object p3, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->author:Ljava/lang/String;

    .line 9
    iput-wide p4, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->price:D

    .line 10
    iput-object p6, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->demoUrl:Ljava/lang/String;

    .line 11
    iput-object p7, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->coverImage:Ljava/lang/String;

    .line 12
    iput-object p8, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->screenshots:Ljava/util/List;

    .line 13
    iput-object p9, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->description:Ljava/lang/String;

    .line 14
    iput-boolean p10, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->featured:Z

    .line 15
    iput p11, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->downloadCount:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZIILOc;)V
    .locals 2

    and-int/lit8 p13, p12, 0x1

    .line 16
    const-string v0, ""

    if-eqz p13, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    const-wide/16 p4, 0x0

    :cond_3
    and-int/lit8 p13, p12, 0x10

    const/4 v1, 0x0

    if-eqz p13, :cond_4

    move-object p6, v1

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    move-object p7, v1

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    .line 17
    sget-object p8, LKf;->a:LKf;

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    move-object p9, v0

    :cond_7
    and-int/lit16 p13, p12, 0x100

    const/4 v0, 0x0

    if-eqz p13, :cond_8

    move p10, v0

    :cond_8
    and-int/lit16 p12, p12, 0x200

    if-eqz p12, :cond_9

    move p12, v0

    :goto_0
    move p11, p10

    move-object p10, p9

    move-object p9, p8

    move-object p8, p7

    move-object p7, p6

    move-wide p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_9
    move p12, p11

    goto :goto_0

    .line 18
    :goto_1
    invoke-direct/range {p1 .. p12}, Lio/github/cherrywechat/network/model/ThemeStoreItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZI)V

    return-void
.end method

.method public static synthetic copy$default(Lio/github/cherrywechat/network/model/ThemeStoreItem;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZIILjava/lang/Object;)Lio/github/cherrywechat/network/model/ThemeStoreItem;
    .locals 0

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    iget-object p1, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    iget-object p2, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->name:Ljava/lang/String;

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    iget-object p3, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->author:Ljava/lang/String;

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    iget-wide p4, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->price:D

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    iget-object p6, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->demoUrl:Ljava/lang/String;

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    iget-object p7, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->coverImage:Ljava/lang/String;

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    iget-object p8, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->screenshots:Ljava/util/List;

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    iget-object p9, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->description:Ljava/lang/String;

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    iget-boolean p10, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->featured:Z

    :cond_8
    and-int/lit16 p12, p12, 0x200

    if-eqz p12, :cond_9

    iget p11, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->downloadCount:I

    :cond_9
    move p12, p10

    move p13, p11

    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move-wide p6, p4

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p13}, Lio/github/cherrywechat/network/model/ThemeStoreItem;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZI)Lio/github/cherrywechat/network/model/ThemeStoreItem;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getDownloadCount$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getFeatured$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getPrice$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getScreenshots$annotations()V
    .locals 0

    return-void
.end method

.method public static final synthetic write$Self$app_release(Lio/github/cherrywechat/network/model/ThemeStoreItem;LWa;LCx;)V
    .locals 5

    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    const-string v0, ""

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->id:Ljava/lang/String;

    invoke-static {p2, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    :goto_0
    iget-object p2, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->id:Ljava/lang/String;

    invoke-interface {p1}, LWa;->d()V

    :cond_1
    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_2

    goto :goto_1

    :cond_2
    iget-object p2, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->name:Ljava/lang/String;

    invoke-static {p2, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    :goto_1
    iget-object p2, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->name:Ljava/lang/String;

    invoke-interface {p1}, LWa;->d()V

    :cond_3
    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_4

    goto :goto_2

    :cond_4
    iget-object p2, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->author:Ljava/lang/String;

    invoke-static {p2, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_5

    :goto_2
    iget-object p2, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->author:Ljava/lang/String;

    invoke-interface {p1}, LWa;->d()V

    :cond_5
    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_6

    goto :goto_3

    :cond_6
    iget-wide v1, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->price:D

    const-wide/16 v3, 0x0

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Double;->compare(DD)I

    move-result p2

    if-eqz p2, :cond_7

    :goto_3
    sget-object p2, Lio/github/cherrywechat/network/model/TolerantDoubleSerializer;->INSTANCE:Lio/github/cherrywechat/network/model/TolerantDoubleSerializer;

    iget-wide v1, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->price:D

    invoke-interface {p1}, LWa;->a()V

    :cond_7
    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_8

    goto :goto_4

    :cond_8
    iget-object p2, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->demoUrl:Ljava/lang/String;

    if-eqz p2, :cond_9

    :goto_4
    sget-object p2, Lsz;->a:Lsz;

    iget-object p2, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->demoUrl:Ljava/lang/String;

    invoke-interface {p1}, LWa;->f()V

    :cond_9
    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_a

    goto :goto_5

    :cond_a
    iget-object p2, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->coverImage:Ljava/lang/String;

    if-eqz p2, :cond_b

    :goto_5
    sget-object p2, Lsz;->a:Lsz;

    iget-object p2, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->coverImage:Ljava/lang/String;

    invoke-interface {p1}, LWa;->f()V

    :cond_b
    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_c

    goto :goto_6

    :cond_c
    iget-object p2, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->screenshots:Ljava/util/List;

    sget-object v1, LKf;->a:LKf;

    invoke-static {p2, v1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_d

    :goto_6
    sget-object p2, Lio/github/cherrywechat/network/model/ScreenshotsSerializer;->INSTANCE:Lio/github/cherrywechat/network/model/ScreenshotsSerializer;

    iget-object p2, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->screenshots:Ljava/util/List;

    invoke-interface {p1}, LWa;->a()V

    :cond_d
    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_e

    goto :goto_7

    :cond_e
    iget-object p2, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->description:Ljava/lang/String;

    invoke-static {p2, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_f

    :goto_7
    iget-object p2, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->description:Ljava/lang/String;

    invoke-interface {p1}, LWa;->d()V

    :cond_f
    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_10

    goto :goto_8

    :cond_10
    iget-boolean p2, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->featured:Z

    if-eqz p2, :cond_11

    :goto_8
    sget-object p2, Lio/github/cherrywechat/network/model/TolerantBooleanSerializer;->INSTANCE:Lio/github/cherrywechat/network/model/TolerantBooleanSerializer;

    iget-boolean p2, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->featured:Z

    invoke-interface {p1}, LWa;->a()V

    :cond_11
    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_12

    goto :goto_9

    :cond_12
    iget p2, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->downloadCount:I

    if-eqz p2, :cond_13

    :goto_9
    sget-object p2, Lio/github/cherrywechat/network/model/TolerantIntSerializer;->INSTANCE:Lio/github/cherrywechat/network/model/TolerantIntSerializer;

    iget p0, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->downloadCount:I

    invoke-interface {p1}, LWa;->a()V

    :cond_13
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->downloadCount:I

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->author:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()D
    .locals 2

    iget-wide v0, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->price:D

    return-wide v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->demoUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->coverImage:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->screenshots:Ljava/util/List;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->featured:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZI)Lio/github/cherrywechat/network/model/ThemeStoreItem;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "D",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "ZI)",
            "Lio/github/cherrywechat/network/model/ThemeStoreItem;"
        }
    .end annotation

    new-instance v0, Lio/github/cherrywechat/network/model/ThemeStoreItem;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-wide/from16 v4, p4

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move/from16 v10, p10

    move/from16 v11, p11

    invoke-direct/range {v0 .. v11}, Lio/github/cherrywechat/network/model/ThemeStoreItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZI)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/github/cherrywechat/network/model/ThemeStoreItem;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/github/cherrywechat/network/model/ThemeStoreItem;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->id:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/network/model/ThemeStoreItem;->id:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->name:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/network/model/ThemeStoreItem;->name:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->author:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/network/model/ThemeStoreItem;->author:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->price:D

    iget-wide v5, p1, Lio/github/cherrywechat/network/model/ThemeStoreItem;->price:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->demoUrl:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/network/model/ThemeStoreItem;->demoUrl:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->coverImage:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/network/model/ThemeStoreItem;->coverImage:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->screenshots:Ljava/util/List;

    iget-object v3, p1, Lio/github/cherrywechat/network/model/ThemeStoreItem;->screenshots:Ljava/util/List;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->description:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/network/model/ThemeStoreItem;->description:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->featured:Z

    iget-boolean v3, p1, Lio/github/cherrywechat/network/model/ThemeStoreItem;->featured:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->downloadCount:I

    iget p1, p1, Lio/github/cherrywechat/network/model/ThemeStoreItem;->downloadCount:I

    if-eq v1, p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getAuthor()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->author:Ljava/lang/String;

    return-object v0
.end method

.method public final getCoverImage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->coverImage:Ljava/lang/String;

    return-object v0
.end method

.method public final getDemoUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->demoUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final getDownloadCount()I
    .locals 1

    iget v0, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->downloadCount:I

    return v0
.end method

.method public final getFeatured()Z
    .locals 1

    iget-boolean v0, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->featured:Z

    return v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getPrice()D
    .locals 2

    iget-wide v0, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->price:D

    return-wide v0
.end method

.method public final getScreenshots()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->screenshots:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->name:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lph;->g(Ljava/lang/String;II)I

    move-result v0

    iget-object v2, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->author:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lph;->g(Ljava/lang/String;II)I

    move-result v0

    iget-wide v2, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->price:D

    invoke-static {v2, v3}, Ljava/lang/Double;->hashCode(D)I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->demoUrl:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->coverImage:Ljava/lang/String;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v2, v3

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->screenshots:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->description:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lph;->g(Ljava/lang/String;II)I

    move-result v0

    iget-boolean v2, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->featured:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget v0, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->downloadCount:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ThemeStoreItem(id="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->id:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", author="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->author:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", price="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->price:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", demoUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->demoUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", coverImage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->coverImage:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", screenshots="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->screenshots:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", description="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->description:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", featured="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->featured:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", downloadCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lio/github/cherrywechat/network/model/ThemeStoreItem;->downloadCount:I

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, LEy;->f(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
