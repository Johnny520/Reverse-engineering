.class public final Lio/github/cherrywechat/network/model/AboutData;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/github/cherrywechat/network/model/AboutData$$serializer;,
        Lio/github/cherrywechat/network/model/AboutData$Companion;
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

.field public static final Companion:Lio/github/cherrywechat/network/model/AboutData$Companion;


# instance fields
.field private final appInfo:Lio/github/cherrywechat/network/model/AppInfo;

.field private final developers:Lio/github/cherrywechat/network/model/DeveloperGroups;

.field private final features:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/github/cherrywechat/network/model/Feature;",
            ">;"
        }
    .end annotation
.end field

.field private final links:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/github/cherrywechat/network/model/Link;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lio/github/cherrywechat/network/model/AboutData$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/github/cherrywechat/network/model/AboutData$Companion;-><init>(LOc;)V

    sput-object v0, Lio/github/cherrywechat/network/model/AboutData;->Companion:Lio/github/cherrywechat/network/model/AboutData$Companion;

    new-instance v0, Ld;

    const/4 v2, 0x0

    invoke-direct {v0, v2}, Ld;-><init>(I)V

    const/4 v3, 0x2

    invoke-static {v3, v0}, LDc;->n(ILUi;)LDn;

    move-result-object v0

    new-instance v4, Ld;

    const/4 v5, 0x1

    invoke-direct {v4, v5}, Ld;-><init>(I)V

    invoke-static {v3, v4}, LDc;->n(ILUi;)LDn;

    move-result-object v4

    const/4 v6, 0x4

    new-array v6, v6, [LDn;

    aput-object v1, v6, v2

    aput-object v0, v6, v5

    aput-object v1, v6, v3

    const/4 v0, 0x3

    aput-object v4, v6, v0

    sput-object v6, Lio/github/cherrywechat/network/model/AboutData;->$childSerializers:[LDn;

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lio/github/cherrywechat/network/model/AboutData;-><init>(Lio/github/cherrywechat/network/model/AppInfo;Ljava/util/List;Lio/github/cherrywechat/network/model/DeveloperGroups;Ljava/util/List;ILOc;)V

    return-void
.end method

.method public synthetic constructor <init>(ILio/github/cherrywechat/network/model/AppInfo;Ljava/util/List;Lio/github/cherrywechat/network/model/DeveloperGroups;Ljava/util/List;LGx;)V
    .locals 6

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p6, p1, 0x1

    if-nez p6, :cond_0

    .line 3
    new-instance v0, Lio/github/cherrywechat/network/model/AppInfo;

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lio/github/cherrywechat/network/model/AppInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILOc;)V

    .line 4
    iput-object v0, p0, Lio/github/cherrywechat/network/model/AboutData;->appInfo:Lio/github/cherrywechat/network/model/AppInfo;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lio/github/cherrywechat/network/model/AboutData;->appInfo:Lio/github/cherrywechat/network/model/AppInfo;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    sget-object p6, LKf;->a:LKf;

    if-nez p2, :cond_1

    iput-object p6, p0, Lio/github/cherrywechat/network/model/AboutData;->features:Ljava/util/List;

    goto :goto_1

    :cond_1
    iput-object p3, p0, Lio/github/cherrywechat/network/model/AboutData;->features:Ljava/util/List;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    .line 5
    new-instance p2, Lio/github/cherrywechat/network/model/DeveloperGroups;

    const/4 p3, 0x3

    const/4 p4, 0x0

    invoke-direct {p2, p4, p4, p3, p4}, Lio/github/cherrywechat/network/model/DeveloperGroups;-><init>(Ljava/util/List;Ljava/util/List;ILOc;)V

    .line 6
    iput-object p2, p0, Lio/github/cherrywechat/network/model/AboutData;->developers:Lio/github/cherrywechat/network/model/DeveloperGroups;

    goto :goto_2

    :cond_2
    iput-object p4, p0, Lio/github/cherrywechat/network/model/AboutData;->developers:Lio/github/cherrywechat/network/model/DeveloperGroups;

    :goto_2
    and-int/lit8 p1, p1, 0x8

    if-nez p1, :cond_3

    iput-object p6, p0, Lio/github/cherrywechat/network/model/AboutData;->links:Ljava/util/List;

    return-void

    :cond_3
    iput-object p5, p0, Lio/github/cherrywechat/network/model/AboutData;->links:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lio/github/cherrywechat/network/model/AppInfo;Ljava/util/List;Lio/github/cherrywechat/network/model/DeveloperGroups;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/github/cherrywechat/network/model/AppInfo;",
            "Ljava/util/List<",
            "Lio/github/cherrywechat/network/model/Feature;",
            ">;",
            "Lio/github/cherrywechat/network/model/DeveloperGroups;",
            "Ljava/util/List<",
            "Lio/github/cherrywechat/network/model/Link;",
            ">;)V"
        }
    .end annotation

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, Lio/github/cherrywechat/network/model/AboutData;->appInfo:Lio/github/cherrywechat/network/model/AppInfo;

    .line 9
    iput-object p2, p0, Lio/github/cherrywechat/network/model/AboutData;->features:Ljava/util/List;

    .line 10
    iput-object p3, p0, Lio/github/cherrywechat/network/model/AboutData;->developers:Lio/github/cherrywechat/network/model/DeveloperGroups;

    .line 11
    iput-object p4, p0, Lio/github/cherrywechat/network/model/AboutData;->links:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Lio/github/cherrywechat/network/model/AppInfo;Ljava/util/List;Lio/github/cherrywechat/network/model/DeveloperGroups;Ljava/util/List;ILOc;)V
    .locals 6

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    .line 12
    new-instance v0, Lio/github/cherrywechat/network/model/AppInfo;

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lio/github/cherrywechat/network/model/AppInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILOc;)V

    move-object p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    .line 13
    sget-object v0, LKf;->a:LKf;

    if-eqz p6, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    .line 14
    new-instance p3, Lio/github/cherrywechat/network/model/DeveloperGroups;

    const/4 p6, 0x3

    const/4 v1, 0x0

    invoke-direct {p3, v1, v1, p6, v1}, Lio/github/cherrywechat/network/model/DeveloperGroups;-><init>(Ljava/util/List;Ljava/util/List;ILOc;)V

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    move-object p4, v0

    .line 15
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lio/github/cherrywechat/network/model/AboutData;-><init>(Lio/github/cherrywechat/network/model/AppInfo;Ljava/util/List;Lio/github/cherrywechat/network/model/DeveloperGroups;Ljava/util/List;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()LQm;
    .locals 2

    new-instance v0, LG4;

    sget-object v1, Lio/github/cherrywechat/network/model/Feature$$serializer;->INSTANCE:Lio/github/cherrywechat/network/model/Feature$$serializer;

    invoke-direct {v0, v1}, LG4;-><init>(LQm;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()LQm;
    .locals 2

    new-instance v0, LG4;

    sget-object v1, Lio/github/cherrywechat/network/model/Link$$serializer;->INSTANCE:Lio/github/cherrywechat/network/model/Link$$serializer;

    invoke-direct {v0, v1}, LG4;-><init>(LQm;)V

    return-object v0
.end method

.method public static synthetic a()LQm;
    .locals 1

    invoke-static {}, Lio/github/cherrywechat/network/model/AboutData;->_childSerializers$_anonymous_$0()LQm;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[LDn;
    .locals 1

    sget-object v0, Lio/github/cherrywechat/network/model/AboutData;->$childSerializers:[LDn;

    return-object v0
.end method

.method public static synthetic b()LQm;
    .locals 1

    invoke-static {}, Lio/github/cherrywechat/network/model/AboutData;->_childSerializers$_anonymous_()LQm;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lio/github/cherrywechat/network/model/AboutData;Lio/github/cherrywechat/network/model/AppInfo;Ljava/util/List;Lio/github/cherrywechat/network/model/DeveloperGroups;Ljava/util/List;ILjava/lang/Object;)Lio/github/cherrywechat/network/model/AboutData;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lio/github/cherrywechat/network/model/AboutData;->appInfo:Lio/github/cherrywechat/network/model/AppInfo;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lio/github/cherrywechat/network/model/AboutData;->features:Ljava/util/List;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lio/github/cherrywechat/network/model/AboutData;->developers:Lio/github/cherrywechat/network/model/DeveloperGroups;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lio/github/cherrywechat/network/model/AboutData;->links:Ljava/util/List;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lio/github/cherrywechat/network/model/AboutData;->copy(Lio/github/cherrywechat/network/model/AppInfo;Ljava/util/List;Lio/github/cherrywechat/network/model/DeveloperGroups;Ljava/util/List;)Lio/github/cherrywechat/network/model/AboutData;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$app_release(Lio/github/cherrywechat/network/model/AboutData;LWa;LCx;)V
    .locals 7

    sget-object p2, Lio/github/cherrywechat/network/model/AboutData;->$childSerializers:[LDn;

    invoke-interface {p1}, LWa;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/github/cherrywechat/network/model/AboutData;->appInfo:Lio/github/cherrywechat/network/model/AppInfo;

    new-instance v1, Lio/github/cherrywechat/network/model/AppInfo;

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lio/github/cherrywechat/network/model/AppInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILOc;)V

    invoke-static {v0, v1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    :goto_0
    sget-object v0, Lio/github/cherrywechat/network/model/AppInfo$$serializer;->INSTANCE:Lio/github/cherrywechat/network/model/AppInfo$$serializer;

    iget-object v0, p0, Lio/github/cherrywechat/network/model/AboutData;->appInfo:Lio/github/cherrywechat/network/model/AppInfo;

    invoke-interface {p1}, LWa;->a()V

    :cond_1
    invoke-interface {p1}, LWa;->g()Z

    move-result v0

    sget-object v1, LKf;->a:LKf;

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lio/github/cherrywechat/network/model/AboutData;->features:Ljava/util/List;

    invoke-static {v0, v1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    :goto_1
    const/4 v0, 0x1

    aget-object v0, p2, v0

    invoke-interface {v0}, LDn;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LQm;

    iget-object v0, p0, Lio/github/cherrywechat/network/model/AboutData;->features:Ljava/util/List;

    invoke-interface {p1}, LWa;->a()V

    :cond_3
    invoke-interface {p1}, LWa;->g()Z

    move-result v0

    const/4 v2, 0x3

    if-eqz v0, :cond_4

    goto :goto_2

    :cond_4
    iget-object v0, p0, Lio/github/cherrywechat/network/model/AboutData;->developers:Lio/github/cherrywechat/network/model/DeveloperGroups;

    new-instance v3, Lio/github/cherrywechat/network/model/DeveloperGroups;

    const/4 v4, 0x0

    invoke-direct {v3, v4, v4, v2, v4}, Lio/github/cherrywechat/network/model/DeveloperGroups;-><init>(Ljava/util/List;Ljava/util/List;ILOc;)V

    invoke-static {v0, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    :goto_2
    sget-object v0, Lio/github/cherrywechat/network/model/DeveloperGroups$$serializer;->INSTANCE:Lio/github/cherrywechat/network/model/DeveloperGroups$$serializer;

    iget-object v0, p0, Lio/github/cherrywechat/network/model/AboutData;->developers:Lio/github/cherrywechat/network/model/DeveloperGroups;

    invoke-interface {p1}, LWa;->a()V

    :cond_5
    invoke-interface {p1}, LWa;->g()Z

    move-result v0

    if-eqz v0, :cond_6

    goto :goto_3

    :cond_6
    iget-object v0, p0, Lio/github/cherrywechat/network/model/AboutData;->links:Ljava/util/List;

    invoke-static {v0, v1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    :goto_3
    aget-object p2, p2, v2

    invoke-interface {p2}, LDn;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LQm;

    iget-object p0, p0, Lio/github/cherrywechat/network/model/AboutData;->links:Ljava/util/List;

    invoke-interface {p1}, LWa;->a()V

    :cond_7
    return-void
.end method


# virtual methods
.method public final component1()Lio/github/cherrywechat/network/model/AppInfo;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/AboutData;->appInfo:Lio/github/cherrywechat/network/model/AppInfo;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/github/cherrywechat/network/model/Feature;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/github/cherrywechat/network/model/AboutData;->features:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Lio/github/cherrywechat/network/model/DeveloperGroups;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/AboutData;->developers:Lio/github/cherrywechat/network/model/DeveloperGroups;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/github/cherrywechat/network/model/Link;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/github/cherrywechat/network/model/AboutData;->links:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Lio/github/cherrywechat/network/model/AppInfo;Ljava/util/List;Lio/github/cherrywechat/network/model/DeveloperGroups;Ljava/util/List;)Lio/github/cherrywechat/network/model/AboutData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/github/cherrywechat/network/model/AppInfo;",
            "Ljava/util/List<",
            "Lio/github/cherrywechat/network/model/Feature;",
            ">;",
            "Lio/github/cherrywechat/network/model/DeveloperGroups;",
            "Ljava/util/List<",
            "Lio/github/cherrywechat/network/model/Link;",
            ">;)",
            "Lio/github/cherrywechat/network/model/AboutData;"
        }
    .end annotation

    new-instance v0, Lio/github/cherrywechat/network/model/AboutData;

    invoke-direct {v0, p1, p2, p3, p4}, Lio/github/cherrywechat/network/model/AboutData;-><init>(Lio/github/cherrywechat/network/model/AppInfo;Ljava/util/List;Lio/github/cherrywechat/network/model/DeveloperGroups;Ljava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/github/cherrywechat/network/model/AboutData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/github/cherrywechat/network/model/AboutData;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/AboutData;->appInfo:Lio/github/cherrywechat/network/model/AppInfo;

    iget-object v3, p1, Lio/github/cherrywechat/network/model/AboutData;->appInfo:Lio/github/cherrywechat/network/model/AppInfo;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/github/cherrywechat/network/model/AboutData;->features:Ljava/util/List;

    iget-object v3, p1, Lio/github/cherrywechat/network/model/AboutData;->features:Ljava/util/List;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/github/cherrywechat/network/model/AboutData;->developers:Lio/github/cherrywechat/network/model/DeveloperGroups;

    iget-object v3, p1, Lio/github/cherrywechat/network/model/AboutData;->developers:Lio/github/cherrywechat/network/model/DeveloperGroups;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/github/cherrywechat/network/model/AboutData;->links:Ljava/util/List;

    iget-object p1, p1, Lio/github/cherrywechat/network/model/AboutData;->links:Ljava/util/List;

    invoke-static {v1, p1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getAppInfo()Lio/github/cherrywechat/network/model/AppInfo;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/AboutData;->appInfo:Lio/github/cherrywechat/network/model/AppInfo;

    return-object v0
.end method

.method public final getDevelopers()Lio/github/cherrywechat/network/model/DeveloperGroups;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/AboutData;->developers:Lio/github/cherrywechat/network/model/DeveloperGroups;

    return-object v0
.end method

.method public final getFeatures()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/github/cherrywechat/network/model/Feature;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/github/cherrywechat/network/model/AboutData;->features:Ljava/util/List;

    return-object v0
.end method

.method public final getLinks()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/github/cherrywechat/network/model/Link;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/github/cherrywechat/network/model/AboutData;->links:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lio/github/cherrywechat/network/model/AboutData;->appInfo:Lio/github/cherrywechat/network/model/AppInfo;

    invoke-virtual {v0}, Lio/github/cherrywechat/network/model/AppInfo;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/github/cherrywechat/network/model/AboutData;->features:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lio/github/cherrywechat/network/model/AboutData;->developers:Lio/github/cherrywechat/network/model/DeveloperGroups;

    invoke-virtual {v0}, Lio/github/cherrywechat/network/model/DeveloperGroups;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/github/cherrywechat/network/model/AboutData;->links:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AboutData(appInfo="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lio/github/cherrywechat/network/model/AboutData;->appInfo:Lio/github/cherrywechat/network/model/AppInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", features="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/AboutData;->features:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", developers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/AboutData;->developers:Lio/github/cherrywechat/network/model/DeveloperGroups;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", links="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/AboutData;->links:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
