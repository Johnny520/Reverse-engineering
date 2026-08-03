.class public final Lio/github/cherrywechat/network/model/ThemeSimpleItem;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/github/cherrywechat/network/model/ThemeSimpleItem$$serializer;,
        Lio/github/cherrywechat/network/model/ThemeSimpleItem$Companion;
    }
.end annotation


# static fields
.field private static final $childSerializers:[LDn;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "LDn;"
        }
    .end annotation
.end field

.field public static final Companion:Lio/github/cherrywechat/network/model/ThemeSimpleItem$Companion;


# instance fields
.field private final owner:Ljava/lang/String;

.field private final ownerId:Ljava/lang/String;

.field private final themeId:Ljava/lang/String;

.field private final themeName:Ljava/lang/String;

.field private final versions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/github/cherrywechat/network/model/ThemeSimpleVersion;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lio/github/cherrywechat/network/model/ThemeSimpleItem$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/github/cherrywechat/network/model/ThemeSimpleItem$Companion;-><init>(LOc;)V

    sput-object v0, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->Companion:Lio/github/cherrywechat/network/model/ThemeSimpleItem$Companion;

    new-instance v0, Ld;

    const/16 v2, 0x17

    invoke-direct {v0, v2}, Ld;-><init>(I)V

    const/4 v2, 0x2

    invoke-static {v2, v0}, LDc;->n(ILUi;)LDn;

    move-result-object v0

    const/4 v3, 0x5

    new-array v3, v3, [LDn;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v4, 0x1

    aput-object v1, v3, v4

    aput-object v1, v3, v2

    const/4 v2, 0x3

    aput-object v1, v3, v2

    const/4 v1, 0x4

    aput-object v0, v3, v1

    sput-object v3, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->$childSerializers:[LDn;

    return-void
.end method

.method public constructor <init>()V
    .locals 8

    .line 1
    const/16 v6, 0x1f

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Lio/github/cherrywechat/network/model/ThemeSimpleItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILOc;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;LGx;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p7, p1, 0x1

    const-string v0, ""

    if-nez p7, :cond_0

    iput-object v0, p0, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->themeId:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->themeId:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    iput-object v0, p0, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->themeName:Ljava/lang/String;

    goto :goto_1

    :cond_1
    iput-object p3, p0, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->themeName:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object v0, p0, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->ownerId:Ljava/lang/String;

    goto :goto_2

    :cond_2
    iput-object p4, p0, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->ownerId:Ljava/lang/String;

    :goto_2
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object v0, p0, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->owner:Ljava/lang/String;

    goto :goto_3

    :cond_3
    iput-object p5, p0, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->owner:Ljava/lang/String;

    :goto_3
    and-int/lit8 p1, p1, 0x10

    if-nez p1, :cond_4

    .line 3
    sget-object p1, LKf;->a:LKf;

    .line 4
    iput-object p1, p0, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->versions:Ljava/util/List;

    return-void

    :cond_4
    iput-object p6, p0, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->versions:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/github/cherrywechat/network/model/ThemeSimpleVersion;",
            ">;)V"
        }
    .end annotation

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->themeId:Ljava/lang/String;

    .line 7
    iput-object p2, p0, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->themeName:Ljava/lang/String;

    .line 8
    iput-object p3, p0, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->ownerId:Ljava/lang/String;

    .line 9
    iput-object p4, p0, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->owner:Ljava/lang/String;

    .line 10
    iput-object p5, p0, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->versions:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILOc;)V
    .locals 1

    and-int/lit8 p7, p6, 0x1

    .line 11
    const-string v0, ""

    if-eqz p7, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    move-object p4, v0

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    .line 12
    sget-object p5, LKf;->a:LKf;

    :cond_4
    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    .line 13
    invoke-direct/range {p1 .. p6}, Lio/github/cherrywechat/network/model/ThemeSimpleItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()LQm;
    .locals 2

    new-instance v0, LG4;

    sget-object v1, Lio/github/cherrywechat/network/model/ThemeSimpleVersion$$serializer;->INSTANCE:Lio/github/cherrywechat/network/model/ThemeSimpleVersion$$serializer;

    invoke-direct {v0, v1}, LG4;-><init>(LQm;)V

    return-object v0
.end method

.method public static synthetic a()LQm;
    .locals 1

    invoke-static {}, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->_childSerializers$_anonymous_()LQm;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[LDn;
    .locals 1

    sget-object v0, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->$childSerializers:[LDn;

    return-object v0
.end method

.method public static synthetic copy$default(Lio/github/cherrywechat/network/model/ThemeSimpleItem;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lio/github/cherrywechat/network/model/ThemeSimpleItem;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->themeId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->themeName:Ljava/lang/String;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->ownerId:Ljava/lang/String;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->owner:Ljava/lang/String;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->versions:Ljava/util/List;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lio/github/cherrywechat/network/model/ThemeSimpleItem;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$app_release(Lio/github/cherrywechat/network/model/ThemeSimpleItem;LWa;LCx;)V
    .locals 2

    sget-object p2, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->$childSerializers:[LDn;

    invoke-interface {p1}, LWa;->g()Z

    move-result v0

    const-string v1, ""

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->themeId:Ljava/lang/String;

    invoke-static {v0, v1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    :goto_0
    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->themeId:Ljava/lang/String;

    invoke-interface {p1}, LWa;->d()V

    :cond_1
    invoke-interface {p1}, LWa;->g()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->themeName:Ljava/lang/String;

    invoke-static {v0, v1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    :goto_1
    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->themeName:Ljava/lang/String;

    invoke-interface {p1}, LWa;->d()V

    :cond_3
    invoke-interface {p1}, LWa;->g()Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_2

    :cond_4
    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->ownerId:Ljava/lang/String;

    invoke-static {v0, v1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    :goto_2
    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->ownerId:Ljava/lang/String;

    invoke-interface {p1}, LWa;->d()V

    :cond_5
    invoke-interface {p1}, LWa;->g()Z

    move-result v0

    if-eqz v0, :cond_6

    goto :goto_3

    :cond_6
    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->owner:Ljava/lang/String;

    invoke-static {v0, v1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    :goto_3
    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->owner:Ljava/lang/String;

    invoke-interface {p1}, LWa;->d()V

    :cond_7
    invoke-interface {p1}, LWa;->g()Z

    move-result v0

    if-eqz v0, :cond_8

    goto :goto_4

    :cond_8
    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->versions:Ljava/util/List;

    sget-object v1, LKf;->a:LKf;

    invoke-static {v0, v1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    :goto_4
    const/4 v0, 0x4

    aget-object p2, p2, v0

    invoke-interface {p2}, LDn;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LQm;

    iget-object p0, p0, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->versions:Ljava/util/List;

    invoke-interface {p1}, LWa;->a()V

    :cond_9
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->themeId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->themeName:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->ownerId:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->owner:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/github/cherrywechat/network/model/ThemeSimpleVersion;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->versions:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lio/github/cherrywechat/network/model/ThemeSimpleItem;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/github/cherrywechat/network/model/ThemeSimpleVersion;",
            ">;)",
            "Lio/github/cherrywechat/network/model/ThemeSimpleItem;"
        }
    .end annotation

    new-instance v0, Lio/github/cherrywechat/network/model/ThemeSimpleItem;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lio/github/cherrywechat/network/model/ThemeSimpleItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/github/cherrywechat/network/model/ThemeSimpleItem;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/github/cherrywechat/network/model/ThemeSimpleItem;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->themeId:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->themeId:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->themeName:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->themeName:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->ownerId:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->ownerId:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->owner:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->owner:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->versions:Ljava/util/List;

    iget-object p1, p1, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->versions:Ljava/util/List;

    invoke-static {v1, p1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getOwner()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->owner:Ljava/lang/String;

    return-object v0
.end method

.method public final getOwnerId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->ownerId:Ljava/lang/String;

    return-object v0
.end method

.method public final getThemeId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->themeId:Ljava/lang/String;

    return-object v0
.end method

.method public final getThemeName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->themeName:Ljava/lang/String;

    return-object v0
.end method

.method public final getVersions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/github/cherrywechat/network/model/ThemeSimpleVersion;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->versions:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->themeId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->themeName:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lph;->g(Ljava/lang/String;II)I

    move-result v0

    iget-object v2, p0, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->ownerId:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lph;->g(Ljava/lang/String;II)I

    move-result v0

    iget-object v2, p0, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->owner:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lph;->g(Ljava/lang/String;II)I

    move-result v0

    iget-object v1, p0, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->versions:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ThemeSimpleItem(themeId="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->themeId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", themeName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->themeName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", ownerId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->ownerId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", owner="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->owner:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", versions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/ThemeSimpleItem;->versions:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
