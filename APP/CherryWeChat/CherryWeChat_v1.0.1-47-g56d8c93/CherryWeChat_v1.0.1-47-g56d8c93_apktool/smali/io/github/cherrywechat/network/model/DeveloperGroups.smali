.class public final Lio/github/cherrywechat/network/model/DeveloperGroups;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/github/cherrywechat/network/model/DeveloperGroups$$serializer;,
        Lio/github/cherrywechat/network/model/DeveloperGroups$Companion;
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

.field public static final Companion:Lio/github/cherrywechat/network/model/DeveloperGroups$Companion;


# instance fields
.field private final core:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/github/cherrywechat/network/model/Developer;",
            ">;"
        }
    .end annotation
.end field

.field private final special:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/github/cherrywechat/network/model/Developer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lio/github/cherrywechat/network/model/DeveloperGroups$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/github/cherrywechat/network/model/DeveloperGroups$Companion;-><init>(LOc;)V

    sput-object v0, Lio/github/cherrywechat/network/model/DeveloperGroups;->Companion:Lio/github/cherrywechat/network/model/DeveloperGroups$Companion;

    new-instance v0, Ld;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Ld;-><init>(I)V

    const/4 v1, 0x2

    invoke-static {v1, v0}, LDc;->n(ILUi;)LDn;

    move-result-object v0

    new-instance v2, Ld;

    const/16 v3, 0xa

    invoke-direct {v2, v3}, Ld;-><init>(I)V

    invoke-static {v1, v2}, LDc;->n(ILUi;)LDn;

    move-result-object v2

    new-array v1, v1, [LDn;

    const/4 v3, 0x0

    aput-object v0, v1, v3

    const/4 v0, 0x1

    aput-object v2, v1, v0

    sput-object v1, Lio/github/cherrywechat/network/model/DeveloperGroups;->$childSerializers:[LDn;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-direct {p0, v0, v0, v1, v0}, Lio/github/cherrywechat/network/model/DeveloperGroups;-><init>(Ljava/util/List;Ljava/util/List;ILOc;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/List;Ljava/util/List;LGx;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p4, p1, 0x1

    sget-object v0, LKf;->a:LKf;

    if-nez p4, :cond_0

    iput-object v0, p0, Lio/github/cherrywechat/network/model/DeveloperGroups;->core:Ljava/util/List;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lio/github/cherrywechat/network/model/DeveloperGroups;->core:Ljava/util/List;

    :goto_0
    and-int/lit8 p1, p1, 0x2

    if-nez p1, :cond_1

    iput-object v0, p0, Lio/github/cherrywechat/network/model/DeveloperGroups;->special:Ljava/util/List;

    return-void

    :cond_1
    iput-object p3, p0, Lio/github/cherrywechat/network/model/DeveloperGroups;->special:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/github/cherrywechat/network/model/Developer;",
            ">;",
            "Ljava/util/List<",
            "Lio/github/cherrywechat/network/model/Developer;",
            ">;)V"
        }
    .end annotation

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lio/github/cherrywechat/network/model/DeveloperGroups;->core:Ljava/util/List;

    .line 5
    iput-object p2, p0, Lio/github/cherrywechat/network/model/DeveloperGroups;->special:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Ljava/util/List;ILOc;)V
    .locals 1

    and-int/lit8 p4, p3, 0x1

    .line 6
    sget-object v0, LKf;->a:LKf;

    if-eqz p4, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move-object p2, v0

    :cond_1
    invoke-direct {p0, p1, p2}, Lio/github/cherrywechat/network/model/DeveloperGroups;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()LQm;
    .locals 2

    new-instance v0, LG4;

    sget-object v1, Lio/github/cherrywechat/network/model/Developer$$serializer;->INSTANCE:Lio/github/cherrywechat/network/model/Developer$$serializer;

    invoke-direct {v0, v1}, LG4;-><init>(LQm;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()LQm;
    .locals 2

    new-instance v0, LG4;

    sget-object v1, Lio/github/cherrywechat/network/model/Developer$$serializer;->INSTANCE:Lio/github/cherrywechat/network/model/Developer$$serializer;

    invoke-direct {v0, v1}, LG4;-><init>(LQm;)V

    return-object v0
.end method

.method public static synthetic a()LQm;
    .locals 1

    invoke-static {}, Lio/github/cherrywechat/network/model/DeveloperGroups;->_childSerializers$_anonymous_$0()LQm;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[LDn;
    .locals 1

    sget-object v0, Lio/github/cherrywechat/network/model/DeveloperGroups;->$childSerializers:[LDn;

    return-object v0
.end method

.method public static synthetic b()LQm;
    .locals 1

    invoke-static {}, Lio/github/cherrywechat/network/model/DeveloperGroups;->_childSerializers$_anonymous_()LQm;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lio/github/cherrywechat/network/model/DeveloperGroups;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lio/github/cherrywechat/network/model/DeveloperGroups;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lio/github/cherrywechat/network/model/DeveloperGroups;->core:Ljava/util/List;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lio/github/cherrywechat/network/model/DeveloperGroups;->special:Ljava/util/List;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lio/github/cherrywechat/network/model/DeveloperGroups;->copy(Ljava/util/List;Ljava/util/List;)Lio/github/cherrywechat/network/model/DeveloperGroups;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$app_release(Lio/github/cherrywechat/network/model/DeveloperGroups;LWa;LCx;)V
    .locals 2

    sget-object p2, Lio/github/cherrywechat/network/model/DeveloperGroups;->$childSerializers:[LDn;

    invoke-interface {p1}, LWa;->g()Z

    move-result v0

    sget-object v1, LKf;->a:LKf;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/github/cherrywechat/network/model/DeveloperGroups;->core:Ljava/util/List;

    invoke-static {v0, v1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    :goto_0
    const/4 v0, 0x0

    aget-object v0, p2, v0

    invoke-interface {v0}, LDn;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LQm;

    iget-object v0, p0, Lio/github/cherrywechat/network/model/DeveloperGroups;->core:Ljava/util/List;

    invoke-interface {p1}, LWa;->a()V

    :cond_1
    invoke-interface {p1}, LWa;->g()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lio/github/cherrywechat/network/model/DeveloperGroups;->special:Ljava/util/List;

    invoke-static {v0, v1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    :goto_1
    const/4 v0, 0x1

    aget-object p2, p2, v0

    invoke-interface {p2}, LDn;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LQm;

    iget-object p0, p0, Lio/github/cherrywechat/network/model/DeveloperGroups;->special:Ljava/util/List;

    invoke-interface {p1}, LWa;->a()V

    :cond_3
    return-void
.end method


# virtual methods
.method public final component1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/github/cherrywechat/network/model/Developer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/github/cherrywechat/network/model/DeveloperGroups;->core:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/github/cherrywechat/network/model/Developer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/github/cherrywechat/network/model/DeveloperGroups;->special:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/util/List;Ljava/util/List;)Lio/github/cherrywechat/network/model/DeveloperGroups;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/github/cherrywechat/network/model/Developer;",
            ">;",
            "Ljava/util/List<",
            "Lio/github/cherrywechat/network/model/Developer;",
            ">;)",
            "Lio/github/cherrywechat/network/model/DeveloperGroups;"
        }
    .end annotation

    new-instance v0, Lio/github/cherrywechat/network/model/DeveloperGroups;

    invoke-direct {v0, p1, p2}, Lio/github/cherrywechat/network/model/DeveloperGroups;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/github/cherrywechat/network/model/DeveloperGroups;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/github/cherrywechat/network/model/DeveloperGroups;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/DeveloperGroups;->core:Ljava/util/List;

    iget-object v3, p1, Lio/github/cherrywechat/network/model/DeveloperGroups;->core:Ljava/util/List;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/github/cherrywechat/network/model/DeveloperGroups;->special:Ljava/util/List;

    iget-object p1, p1, Lio/github/cherrywechat/network/model/DeveloperGroups;->special:Ljava/util/List;

    invoke-static {v1, p1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getCore()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/github/cherrywechat/network/model/Developer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/github/cherrywechat/network/model/DeveloperGroups;->core:Ljava/util/List;

    return-object v0
.end method

.method public final getSpecial()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/github/cherrywechat/network/model/Developer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/github/cherrywechat/network/model/DeveloperGroups;->special:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lio/github/cherrywechat/network/model/DeveloperGroups;->core:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/github/cherrywechat/network/model/DeveloperGroups;->special:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "DeveloperGroups(core="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lio/github/cherrywechat/network/model/DeveloperGroups;->core:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", special="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/DeveloperGroups;->special:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
