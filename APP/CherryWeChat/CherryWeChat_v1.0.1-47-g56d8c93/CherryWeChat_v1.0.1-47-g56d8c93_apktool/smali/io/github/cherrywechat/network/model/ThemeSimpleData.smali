.class public final Lio/github/cherrywechat/network/model/ThemeSimpleData;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/github/cherrywechat/network/model/ThemeSimpleData$$serializer;,
        Lio/github/cherrywechat/network/model/ThemeSimpleData$Companion;
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

.field public static final Companion:Lio/github/cherrywechat/network/model/ThemeSimpleData$Companion;


# instance fields
.field private final themeCount:I

.field private final themes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/github/cherrywechat/network/model/ThemeSimpleItem;",
            ">;"
        }
    .end annotation
.end field

.field private final wechat:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lio/github/cherrywechat/network/model/ThemeSimpleData$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/github/cherrywechat/network/model/ThemeSimpleData$Companion;-><init>(LOc;)V

    sput-object v0, Lio/github/cherrywechat/network/model/ThemeSimpleData;->Companion:Lio/github/cherrywechat/network/model/ThemeSimpleData$Companion;

    new-instance v0, Ld;

    const/16 v2, 0x16

    invoke-direct {v0, v2}, Ld;-><init>(I)V

    const/4 v2, 0x2

    invoke-static {v2, v0}, LDc;->n(ILUi;)LDn;

    move-result-object v0

    const/4 v3, 0x3

    new-array v3, v3, [LDn;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v4, 0x1

    aput-object v1, v3, v4

    aput-object v0, v3, v2

    sput-object v3, Lio/github/cherrywechat/network/model/ThemeSimpleData;->$childSerializers:[LDn;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lio/github/cherrywechat/network/model/ThemeSimpleData;-><init>(Ljava/lang/String;ILjava/util/List;ILOc;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;ILjava/util/List;LGx;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p5, p1, 0x1

    if-nez p5, :cond_0

    .line 3
    const-string p2, ""

    .line 4
    :cond_0
    iput-object p2, p0, Lio/github/cherrywechat/network/model/ThemeSimpleData;->wechat:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    const/4 p2, 0x0

    iput p2, p0, Lio/github/cherrywechat/network/model/ThemeSimpleData;->themeCount:I

    goto :goto_0

    :cond_1
    iput p3, p0, Lio/github/cherrywechat/network/model/ThemeSimpleData;->themeCount:I

    :goto_0
    and-int/lit8 p1, p1, 0x4

    if-nez p1, :cond_2

    .line 5
    sget-object p1, LKf;->a:LKf;

    .line 6
    iput-object p1, p0, Lio/github/cherrywechat/network/model/ThemeSimpleData;->themes:Ljava/util/List;

    return-void

    :cond_2
    iput-object p4, p0, Lio/github/cherrywechat/network/model/ThemeSimpleData;->themes:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/List<",
            "Lio/github/cherrywechat/network/model/ThemeSimpleItem;",
            ">;)V"
        }
    .end annotation

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, Lio/github/cherrywechat/network/model/ThemeSimpleData;->wechat:Ljava/lang/String;

    .line 9
    iput p2, p0, Lio/github/cherrywechat/network/model/ThemeSimpleData;->themeCount:I

    .line 10
    iput-object p3, p0, Lio/github/cherrywechat/network/model/ThemeSimpleData;->themes:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILjava/util/List;ILOc;)V
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    .line 11
    const-string p1, ""

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    const/4 p2, 0x0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    .line 12
    sget-object p3, LKf;->a:LKf;

    .line 13
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lio/github/cherrywechat/network/model/ThemeSimpleData;-><init>(Ljava/lang/String;ILjava/util/List;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()LQm;
    .locals 2

    new-instance v0, LG4;

    sget-object v1, Lio/github/cherrywechat/network/model/ThemeSimpleItem$$serializer;->INSTANCE:Lio/github/cherrywechat/network/model/ThemeSimpleItem$$serializer;

    invoke-direct {v0, v1}, LG4;-><init>(LQm;)V

    return-object v0
.end method

.method public static synthetic a()LQm;
    .locals 1

    invoke-static {}, Lio/github/cherrywechat/network/model/ThemeSimpleData;->_childSerializers$_anonymous_()LQm;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[LDn;
    .locals 1

    sget-object v0, Lio/github/cherrywechat/network/model/ThemeSimpleData;->$childSerializers:[LDn;

    return-object v0
.end method

.method public static synthetic copy$default(Lio/github/cherrywechat/network/model/ThemeSimpleData;Ljava/lang/String;ILjava/util/List;ILjava/lang/Object;)Lio/github/cherrywechat/network/model/ThemeSimpleData;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lio/github/cherrywechat/network/model/ThemeSimpleData;->wechat:Ljava/lang/String;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget p2, p0, Lio/github/cherrywechat/network/model/ThemeSimpleData;->themeCount:I

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lio/github/cherrywechat/network/model/ThemeSimpleData;->themes:Ljava/util/List;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lio/github/cherrywechat/network/model/ThemeSimpleData;->copy(Ljava/lang/String;ILjava/util/List;)Lio/github/cherrywechat/network/model/ThemeSimpleData;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$app_release(Lio/github/cherrywechat/network/model/ThemeSimpleData;LWa;LCx;)V
    .locals 2

    sget-object p2, Lio/github/cherrywechat/network/model/ThemeSimpleData;->$childSerializers:[LDn;

    invoke-interface {p1}, LWa;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeSimpleData;->wechat:Ljava/lang/String;

    const-string v1, ""

    invoke-static {v0, v1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    :goto_0
    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeSimpleData;->wechat:Ljava/lang/String;

    invoke-interface {p1}, LWa;->d()V

    :cond_1
    invoke-interface {p1}, LWa;->g()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    iget v0, p0, Lio/github/cherrywechat/network/model/ThemeSimpleData;->themeCount:I

    if-eqz v0, :cond_3

    :goto_1
    iget v0, p0, Lio/github/cherrywechat/network/model/ThemeSimpleData;->themeCount:I

    invoke-interface {p1}, LWa;->e()V

    :cond_3
    invoke-interface {p1}, LWa;->g()Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_2

    :cond_4
    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeSimpleData;->themes:Ljava/util/List;

    sget-object v1, LKf;->a:LKf;

    invoke-static {v0, v1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    :goto_2
    const/4 v0, 0x2

    aget-object p2, p2, v0

    invoke-interface {p2}, LDn;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LQm;

    iget-object p0, p0, Lio/github/cherrywechat/network/model/ThemeSimpleData;->themes:Ljava/util/List;

    invoke-interface {p1}, LWa;->a()V

    :cond_5
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeSimpleData;->wechat:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lio/github/cherrywechat/network/model/ThemeSimpleData;->themeCount:I

    return v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/github/cherrywechat/network/model/ThemeSimpleItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeSimpleData;->themes:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;ILjava/util/List;)Lio/github/cherrywechat/network/model/ThemeSimpleData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/List<",
            "Lio/github/cherrywechat/network/model/ThemeSimpleItem;",
            ">;)",
            "Lio/github/cherrywechat/network/model/ThemeSimpleData;"
        }
    .end annotation

    new-instance v0, Lio/github/cherrywechat/network/model/ThemeSimpleData;

    invoke-direct {v0, p1, p2, p3}, Lio/github/cherrywechat/network/model/ThemeSimpleData;-><init>(Ljava/lang/String;ILjava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/github/cherrywechat/network/model/ThemeSimpleData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/github/cherrywechat/network/model/ThemeSimpleData;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/ThemeSimpleData;->wechat:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/network/model/ThemeSimpleData;->wechat:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lio/github/cherrywechat/network/model/ThemeSimpleData;->themeCount:I

    iget v3, p1, Lio/github/cherrywechat/network/model/ThemeSimpleData;->themeCount:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/github/cherrywechat/network/model/ThemeSimpleData;->themes:Ljava/util/List;

    iget-object p1, p1, Lio/github/cherrywechat/network/model/ThemeSimpleData;->themes:Ljava/util/List;

    invoke-static {v1, p1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getThemeCount()I
    .locals 1

    iget v0, p0, Lio/github/cherrywechat/network/model/ThemeSimpleData;->themeCount:I

    return v0
.end method

.method public final getThemes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/github/cherrywechat/network/model/ThemeSimpleItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeSimpleData;->themes:Ljava/util/List;

    return-object v0
.end method

.method public final getWechat()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeSimpleData;->wechat:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ThemeSimpleData;->wechat:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lio/github/cherrywechat/network/model/ThemeSimpleData;->themeCount:I

    invoke-static {v2, v0, v1}, LEy;->a(III)I

    move-result v0

    iget-object v1, p0, Lio/github/cherrywechat/network/model/ThemeSimpleData;->themes:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ThemeSimpleData(wechat="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lio/github/cherrywechat/network/model/ThemeSimpleData;->wechat:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", themeCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lio/github/cherrywechat/network/model/ThemeSimpleData;->themeCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", themes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/ThemeSimpleData;->themes:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
