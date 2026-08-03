.class public final Lio/github/cherrywechat/network/model/ThemeConfig;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/github/cherrywechat/network/model/ThemeConfig$$serializer;,
        Lio/github/cherrywechat/network/model/ThemeConfig$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lio/github/cherrywechat/network/model/ThemeConfig$Companion;


# instance fields
.field private final author:Ljava/lang/String;

.field private final autoDarkTheme:Z

.field private final description:Ljava/lang/String;

.field private final isFullBg:Z

.field private final name:Ljava/lang/String;

.field private final version:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/github/cherrywechat/network/model/ThemeConfig$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/github/cherrywechat/network/model/ThemeConfig$Companion;-><init>(LOc;)V

    sput-object v0, Lio/github/cherrywechat/network/model/ThemeConfig;->Companion:Lio/github/cherrywechat/network/model/ThemeConfig$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 9

    .line 1
    const/16 v7, 0x3f

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, Lio/github/cherrywechat/network/model/ThemeConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZILOc;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLGx;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p8, p1, 0x1

    if-nez p8, :cond_0

    .line 3
    const-string p2, "\u672a\u77e5\u4e3b\u9898"

    .line 4
    :cond_0
    iput-object p2, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->name:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    .line 5
    const-string p2, "\u672a\u77e5\u4f5c\u8005"

    .line 6
    iput-object p2, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->author:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->author:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    .line 7
    const-string p2, "1.0"

    .line 8
    iput-object p2, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->version:Ljava/lang/String;

    goto :goto_1

    :cond_2
    iput-object p4, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->version:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    .line 9
    const-string p2, ""

    .line 10
    iput-object p2, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->description:Ljava/lang/String;

    goto :goto_2

    :cond_3
    iput-object p5, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->description:Ljava/lang/String;

    :goto_2
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    const/4 p2, 0x0

    iput-boolean p2, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->isFullBg:Z

    goto :goto_3

    :cond_4
    iput-boolean p6, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->isFullBg:Z

    :goto_3
    and-int/lit8 p1, p1, 0x20

    if-nez p1, :cond_5

    const/4 p1, 0x1

    iput-boolean p1, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->autoDarkTheme:Z

    return-void

    :cond_5
    iput-boolean p7, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->autoDarkTheme:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->name:Ljava/lang/String;

    .line 13
    iput-object p2, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->author:Ljava/lang/String;

    .line 14
    iput-object p3, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->version:Ljava/lang/String;

    .line 15
    iput-object p4, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->description:Ljava/lang/String;

    .line 16
    iput-boolean p5, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->isFullBg:Z

    .line 17
    iput-boolean p6, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->autoDarkTheme:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZILOc;)V
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    .line 18
    const-string p1, "\u672a\u77e5\u4e3b\u9898"

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    .line 19
    const-string p2, "\u672a\u77e5\u4f5c\u8005"

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    .line 20
    const-string p3, "1.0"

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    .line 21
    const-string p4, ""

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    const/4 p5, 0x0

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    const/4 p6, 0x1

    :cond_5
    move p7, p5

    move p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    .line 22
    invoke-direct/range {p2 .. p8}, Lio/github/cherrywechat/network/model/ThemeConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V

    return-void
.end method

.method public static synthetic copy$default(Lio/github/cherrywechat/network/model/ThemeConfig;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZILjava/lang/Object;)Lio/github/cherrywechat/network/model/ThemeConfig;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->name:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->author:Ljava/lang/String;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->version:Ljava/lang/String;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->description:Ljava/lang/String;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-boolean p5, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->isFullBg:Z

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-boolean p6, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->autoDarkTheme:Z

    :cond_5
    move p7, p5

    move p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lio/github/cherrywechat/network/model/ThemeConfig;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Lio/github/cherrywechat/network/model/ThemeConfig;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$app_release(Lio/github/cherrywechat/network/model/ThemeConfig;LWa;LCx;)V
    .locals 1

    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->name:Ljava/lang/String;

    const-string v0, "\u672a\u77e5\u4e3b\u9898"

    invoke-static {p2, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    :goto_0
    iget-object p2, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->name:Ljava/lang/String;

    invoke-interface {p1}, LWa;->d()V

    :cond_1
    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_2

    goto :goto_1

    :cond_2
    iget-object p2, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->author:Ljava/lang/String;

    const-string v0, "\u672a\u77e5\u4f5c\u8005"

    invoke-static {p2, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    :goto_1
    iget-object p2, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->author:Ljava/lang/String;

    invoke-interface {p1}, LWa;->d()V

    :cond_3
    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_4

    goto :goto_2

    :cond_4
    iget-object p2, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->version:Ljava/lang/String;

    const-string v0, "1.0"

    invoke-static {p2, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_5

    :goto_2
    iget-object p2, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->version:Ljava/lang/String;

    invoke-interface {p1}, LWa;->d()V

    :cond_5
    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_6

    goto :goto_3

    :cond_6
    iget-object p2, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->description:Ljava/lang/String;

    const-string v0, ""

    invoke-static {p2, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_7

    :goto_3
    iget-object p2, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->description:Ljava/lang/String;

    invoke-interface {p1}, LWa;->d()V

    :cond_7
    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_8

    goto :goto_4

    :cond_8
    iget-boolean p2, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->isFullBg:Z

    if-eqz p2, :cond_9

    :goto_4
    iget-boolean p2, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->isFullBg:Z

    invoke-interface {p1}, LWa;->b()V

    :cond_9
    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_a

    goto :goto_5

    :cond_a
    iget-boolean p2, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->autoDarkTheme:Z

    const/4 v0, 0x1

    if-eq p2, v0, :cond_b

    :goto_5
    iget-boolean p0, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->autoDarkTheme:Z

    invoke-interface {p1}, LWa;->b()V

    :cond_b
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->author:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->version:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->isFullBg:Z

    return v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->autoDarkTheme:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Lio/github/cherrywechat/network/model/ThemeConfig;
    .locals 7

    new-instance v0, Lio/github/cherrywechat/network/model/ThemeConfig;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    move v6, p6

    invoke-direct/range {v0 .. v6}, Lio/github/cherrywechat/network/model/ThemeConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/github/cherrywechat/network/model/ThemeConfig;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/github/cherrywechat/network/model/ThemeConfig;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->name:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/network/model/ThemeConfig;->name:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->author:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/network/model/ThemeConfig;->author:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->version:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/network/model/ThemeConfig;->version:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->description:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/network/model/ThemeConfig;->description:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->isFullBg:Z

    iget-boolean v3, p1, Lio/github/cherrywechat/network/model/ThemeConfig;->isFullBg:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->autoDarkTheme:Z

    iget-boolean p1, p1, Lio/github/cherrywechat/network/model/ThemeConfig;->autoDarkTheme:Z

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getAuthor()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->author:Ljava/lang/String;

    return-object v0
.end method

.method public final getAutoDarkTheme()Z
    .locals 1

    iget-boolean v0, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->autoDarkTheme:Z

    return v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getVersion()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->version:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->name:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->author:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lph;->g(Ljava/lang/String;II)I

    move-result v0

    iget-object v2, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->version:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lph;->g(Ljava/lang/String;II)I

    move-result v0

    iget-object v2, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->description:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lph;->g(Ljava/lang/String;II)I

    move-result v0

    iget-boolean v2, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->isFullBg:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->autoDarkTheme:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public final isFullBg()Z
    .locals 1

    iget-boolean v0, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->isFullBg:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ThemeConfig(name="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", author="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->author:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", version="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->version:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", description="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->description:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", isFullBg="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->isFullBg:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", autoDarkTheme="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lio/github/cherrywechat/network/model/ThemeConfig;->autoDarkTheme:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
