.class public final Lio/github/cherrywechat/network/model/FriendLinkData;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/github/cherrywechat/network/model/FriendLinkData$$serializer;,
        Lio/github/cherrywechat/network/model/FriendLinkData$Companion;
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

.field public static final Companion:Lio/github/cherrywechat/network/model/FriendLinkData$Companion;


# instance fields
.field private final items:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/github/cherrywechat/network/model/FriendLinkItem;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lio/github/cherrywechat/network/model/FriendLinkData$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/github/cherrywechat/network/model/FriendLinkData$Companion;-><init>(LOc;)V

    sput-object v0, Lio/github/cherrywechat/network/model/FriendLinkData;->Companion:Lio/github/cherrywechat/network/model/FriendLinkData$Companion;

    new-instance v0, Ld;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Ld;-><init>(I)V

    const/4 v1, 0x2

    invoke-static {v1, v0}, LDc;->n(ILUi;)LDn;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [LDn;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    sput-object v1, Lio/github/cherrywechat/network/model/FriendLinkData;->$childSerializers:[LDn;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lio/github/cherrywechat/network/model/FriendLinkData;-><init>(Ljava/util/List;ILOc;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/List;LGx;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p1, p1, 0x1

    if-nez p1, :cond_0

    .line 3
    sget-object p1, LKf;->a:LKf;

    .line 4
    iput-object p1, p0, Lio/github/cherrywechat/network/model/FriendLinkData;->items:Ljava/util/List;

    return-void

    :cond_0
    iput-object p2, p0, Lio/github/cherrywechat/network/model/FriendLinkData;->items:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/github/cherrywechat/network/model/FriendLinkItem;",
            ">;)V"
        }
    .end annotation

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lio/github/cherrywechat/network/model/FriendLinkData;->items:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;ILOc;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 7
    sget-object p1, LKf;->a:LKf;

    .line 8
    :cond_0
    invoke-direct {p0, p1}, Lio/github/cherrywechat/network/model/FriendLinkData;-><init>(Ljava/util/List;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()LQm;
    .locals 2

    new-instance v0, LG4;

    sget-object v1, Lio/github/cherrywechat/network/model/FriendLinkItem$$serializer;->INSTANCE:Lio/github/cherrywechat/network/model/FriendLinkItem$$serializer;

    invoke-direct {v0, v1}, LG4;-><init>(LQm;)V

    return-object v0
.end method

.method public static synthetic a()LQm;
    .locals 1

    invoke-static {}, Lio/github/cherrywechat/network/model/FriendLinkData;->_childSerializers$_anonymous_()LQm;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[LDn;
    .locals 1

    sget-object v0, Lio/github/cherrywechat/network/model/FriendLinkData;->$childSerializers:[LDn;

    return-object v0
.end method

.method public static synthetic copy$default(Lio/github/cherrywechat/network/model/FriendLinkData;Ljava/util/List;ILjava/lang/Object;)Lio/github/cherrywechat/network/model/FriendLinkData;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lio/github/cherrywechat/network/model/FriendLinkData;->items:Ljava/util/List;

    :cond_0
    invoke-virtual {p0, p1}, Lio/github/cherrywechat/network/model/FriendLinkData;->copy(Ljava/util/List;)Lio/github/cherrywechat/network/model/FriendLinkData;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$app_release(Lio/github/cherrywechat/network/model/FriendLinkData;LWa;LCx;)V
    .locals 2

    sget-object p2, Lio/github/cherrywechat/network/model/FriendLinkData;->$childSerializers:[LDn;

    invoke-interface {p1}, LWa;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/github/cherrywechat/network/model/FriendLinkData;->items:Ljava/util/List;

    sget-object v1, LKf;->a:LKf;

    invoke-static {v0, v1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    :goto_0
    const/4 v0, 0x0

    aget-object p2, p2, v0

    invoke-interface {p2}, LDn;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LQm;

    iget-object p0, p0, Lio/github/cherrywechat/network/model/FriendLinkData;->items:Ljava/util/List;

    invoke-interface {p1}, LWa;->a()V

    :cond_1
    return-void
.end method


# virtual methods
.method public final component1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/github/cherrywechat/network/model/FriendLinkItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/github/cherrywechat/network/model/FriendLinkData;->items:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/util/List;)Lio/github/cherrywechat/network/model/FriendLinkData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/github/cherrywechat/network/model/FriendLinkItem;",
            ">;)",
            "Lio/github/cherrywechat/network/model/FriendLinkData;"
        }
    .end annotation

    new-instance v0, Lio/github/cherrywechat/network/model/FriendLinkData;

    invoke-direct {v0, p1}, Lio/github/cherrywechat/network/model/FriendLinkData;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/github/cherrywechat/network/model/FriendLinkData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/github/cherrywechat/network/model/FriendLinkData;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/FriendLinkData;->items:Ljava/util/List;

    iget-object p1, p1, Lio/github/cherrywechat/network/model/FriendLinkData;->items:Ljava/util/List;

    invoke-static {v1, p1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/github/cherrywechat/network/model/FriendLinkItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/github/cherrywechat/network/model/FriendLinkData;->items:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/FriendLinkData;->items:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "FriendLinkData(items="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lio/github/cherrywechat/network/model/FriendLinkData;->items:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
