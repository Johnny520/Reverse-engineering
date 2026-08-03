.class public final Lio/github/cherrywechat/network/model/ThemeDetailData;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/github/cherrywechat/network/model/ThemeDetailData$$serializer;,
        Lio/github/cherrywechat/network/model/ThemeDetailData$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lio/github/cherrywechat/network/model/ThemeDetailData$Companion;


# instance fields
.field private final author:Ljava/lang/String;

.field private final description:Ljava/lang/String;

.field private final details:Ljava/lang/String;

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

    new-instance v0, Lio/github/cherrywechat/network/model/ThemeDetailData$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/github/cherrywechat/network/model/ThemeDetailData$Companion;-><init>(LOc;)V

    sput-object v0, Lio/github/cherrywechat/network/model/ThemeDetailData;->Companion:Lio/github/cherrywechat/network/model/ThemeDetailData$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 10

    .line 1
    const/16 v8, 0x3f

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v9}, Lio/github/cherrywechat/network/model/ThemeDetailData;-><init>(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/util/List;ILOc;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/util/List;LGx;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p9, p1, 0x1

    const-string v0, ""

    if-nez p9, :cond_0

    iput-object v0, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->name:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->name:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    iput-object v0, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->author:Ljava/lang/String;

    goto :goto_1

    :cond_1
    iput-object p3, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->author:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    const-wide/16 p2, 0x0

    iput-wide p2, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->price:D

    goto :goto_2

    :cond_2
    iput-wide p4, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->price:D

    :goto_2
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object v0, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->details:Ljava/lang/String;

    goto :goto_3

    :cond_3
    iput-object p6, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->details:Ljava/lang/String;

    :goto_3
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    iput-object v0, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->description:Ljava/lang/String;

    goto :goto_4

    :cond_4
    iput-object p7, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->description:Ljava/lang/String;

    :goto_4
    and-int/lit8 p1, p1, 0x20

    if-nez p1, :cond_5

    .line 3
    sget-object p1, LKf;->a:LKf;

    .line 4
    iput-object p1, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->screenshots:Ljava/util/List;

    return-void

    :cond_5
    iput-object p8, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->screenshots:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "D",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->name:Ljava/lang/String;

    .line 7
    iput-object p2, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->author:Ljava/lang/String;

    .line 8
    iput-wide p3, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->price:D

    .line 9
    iput-object p5, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->details:Ljava/lang/String;

    .line 10
    iput-object p6, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->description:Ljava/lang/String;

    .line 11
    iput-object p7, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->screenshots:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/util/List;ILOc;)V
    .locals 1

    and-int/lit8 p9, p8, 0x1

    .line 12
    const-string v0, ""

    if-eqz p9, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    const-wide/16 p3, 0x0

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    move-object p5, v0

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    move-object p6, v0

    :cond_4
    and-int/lit8 p8, p8, 0x20

    if-eqz p8, :cond_5

    .line 13
    sget-object p7, LKf;->a:LKf;

    :cond_5
    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move-wide p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    .line 14
    invoke-direct/range {p1 .. p8}, Lio/github/cherrywechat/network/model/ThemeDetailData;-><init>(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/github/cherrywechat/network/model/ThemeDetailData;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lio/github/cherrywechat/network/model/ThemeDetailData;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->name:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->author:Ljava/lang/String;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-wide p3, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->price:D

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p5, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->details:Ljava/lang/String;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p6, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->description:Ljava/lang/String;

    :cond_4
    and-int/lit8 p8, p8, 0x20

    if-eqz p8, :cond_5

    iget-object p7, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->screenshots:Ljava/util/List;

    :cond_5
    move-object p8, p6

    move-object p9, p7

    move-object p7, p5

    move-wide p5, p3

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p9}, Lio/github/cherrywechat/network/model/ThemeDetailData;->copy(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/util/List;)Lio/github/cherrywechat/network/model/ThemeDetailData;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getPrice$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getScreenshots$annotations()V
    .locals 0

    return-void
.end method

.method public static final synthetic write$Self$app_release(Lio/github/cherrywechat/network/model/ThemeDetailData;LWa;LCx;)V
    .locals 5

    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    const-string v0, ""

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->name:Ljava/lang/String;

    invoke-static {p2, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    :goto_0
    iget-object p2, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->name:Ljava/lang/String;

    invoke-interface {p1}, LWa;->d()V

    :cond_1
    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_2

    goto :goto_1

    :cond_2
    iget-object p2, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->author:Ljava/lang/String;

    invoke-static {p2, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    :goto_1
    iget-object p2, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->author:Ljava/lang/String;

    invoke-interface {p1}, LWa;->d()V

    :cond_3
    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_4

    goto :goto_2

    :cond_4
    iget-wide v1, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->price:D

    const-wide/16 v3, 0x0

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Double;->compare(DD)I

    move-result p2

    if-eqz p2, :cond_5

    :goto_2
    sget-object p2, Lio/github/cherrywechat/network/model/TolerantDoubleSerializer;->INSTANCE:Lio/github/cherrywechat/network/model/TolerantDoubleSerializer;

    iget-wide v1, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->price:D

    invoke-interface {p1}, LWa;->a()V

    :cond_5
    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_6

    goto :goto_3

    :cond_6
    iget-object p2, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->details:Ljava/lang/String;

    invoke-static {p2, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_7

    :goto_3
    iget-object p2, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->details:Ljava/lang/String;

    invoke-interface {p1}, LWa;->d()V

    :cond_7
    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_8

    goto :goto_4

    :cond_8
    iget-object p2, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->description:Ljava/lang/String;

    invoke-static {p2, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_9

    :goto_4
    iget-object p2, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->description:Ljava/lang/String;

    invoke-interface {p1}, LWa;->d()V

    :cond_9
    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_a

    goto :goto_5

    :cond_a
    iget-object p2, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->screenshots:Ljava/util/List;

    sget-object v0, LKf;->a:LKf;

    invoke-static {p2, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_b

    :goto_5
    sget-object p2, Lio/github/cherrywechat/network/model/ScreenshotsSerializer;->INSTANCE:Lio/github/cherrywechat/network/model/ScreenshotsSerializer;

    iget-object p0, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->screenshots:Ljava/util/List;

    invoke-interface {p1}, LWa;->a()V

    :cond_b
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->author:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()D
    .locals 2

    iget-wide v0, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->price:D

    return-wide v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->details:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->screenshots:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/util/List;)Lio/github/cherrywechat/network/model/ThemeDetailData;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "D",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lio/github/cherrywechat/network/model/ThemeDetailData;"
        }
    .end annotation

    new-instance v0, Lio/github/cherrywechat/network/model/ThemeDetailData;

    move-object v1, p1

    move-object v2, p2

    move-wide v3, p3

    move-object v5, p5

    move-object v6, p6

    move-object v7, p7

    invoke-direct/range {v0 .. v7}, Lio/github/cherrywechat/network/model/ThemeDetailData;-><init>(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/github/cherrywechat/network/model/ThemeDetailData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/github/cherrywechat/network/model/ThemeDetailData;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->name:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/network/model/ThemeDetailData;->name:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->author:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/network/model/ThemeDetailData;->author:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->price:D

    iget-wide v5, p1, Lio/github/cherrywechat/network/model/ThemeDetailData;->price:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->details:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/network/model/ThemeDetailData;->details:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->description:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/network/model/ThemeDetailData;->description:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->screenshots:Ljava/util/List;

    iget-object p1, p1, Lio/github/cherrywechat/network/model/ThemeDetailData;->screenshots:Ljava/util/List;

    invoke-static {v1, p1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getAuthor()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->author:Ljava/lang/String;

    return-object v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final getDetails()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->details:Ljava/lang/String;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getPrice()D
    .locals 2

    iget-wide v0, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->price:D

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

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->screenshots:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->name:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->author:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lph;->g(Ljava/lang/String;II)I

    move-result v0

    iget-wide v2, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->price:D

    invoke-static {v2, v3}, Ljava/lang/Double;->hashCode(D)I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->details:Ljava/lang/String;

    invoke-static {v0, v2, v1}, Lph;->g(Ljava/lang/String;II)I

    move-result v0

    iget-object v2, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->description:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lph;->g(Ljava/lang/String;II)I

    move-result v0

    iget-object v1, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->screenshots:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ThemeDetailData(name="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", author="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->author:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", price="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->price:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", details="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->details:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", description="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->description:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", screenshots="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/ThemeDetailData;->screenshots:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
