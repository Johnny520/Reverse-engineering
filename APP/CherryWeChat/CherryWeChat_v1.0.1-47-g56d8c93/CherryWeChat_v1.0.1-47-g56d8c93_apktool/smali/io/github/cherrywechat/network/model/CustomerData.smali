.class public final Lio/github/cherrywechat/network/model/CustomerData;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/github/cherrywechat/network/model/CustomerData$$serializer;,
        Lio/github/cherrywechat/network/model/CustomerData$Companion;
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

.field public static final Companion:Lio/github/cherrywechat/network/model/CustomerData$Companion;


# instance fields
.field private final accessToken:Ljava/lang/String;

.field private final authorizedThemes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/github/cherrywechat/network/model/AuthorizedThemeData;",
            ">;"
        }
    .end annotation
.end field

.field private final customer:Lio/github/cherrywechat/network/model/CustomerInfo;

.field private final expires:J


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lio/github/cherrywechat/network/model/CustomerData$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/github/cherrywechat/network/model/CustomerData$Companion;-><init>(LOc;)V

    sput-object v0, Lio/github/cherrywechat/network/model/CustomerData;->Companion:Lio/github/cherrywechat/network/model/CustomerData$Companion;

    new-instance v0, Ld;

    const/16 v2, 0x8

    invoke-direct {v0, v2}, Ld;-><init>(I)V

    const/4 v2, 0x2

    invoke-static {v2, v0}, LDc;->n(ILUi;)LDn;

    move-result-object v0

    const/4 v3, 0x4

    new-array v3, v3, [LDn;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v4, 0x1

    aput-object v1, v3, v4

    aput-object v1, v3, v2

    const/4 v1, 0x3

    aput-object v0, v3, v1

    sput-object v3, Lio/github/cherrywechat/network/model/CustomerData;->$childSerializers:[LDn;

    return-void
.end method

.method public constructor <init>()V
    .locals 8

    .line 1
    const/16 v6, 0xf

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Lio/github/cherrywechat/network/model/CustomerData;-><init>(Lio/github/cherrywechat/network/model/CustomerInfo;Ljava/lang/String;JLjava/util/List;ILOc;)V

    return-void
.end method

.method public synthetic constructor <init>(ILio/github/cherrywechat/network/model/CustomerInfo;Ljava/lang/String;JLjava/util/List;LGx;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p7, p1, 0x1

    if-nez p7, :cond_0

    const/4 p2, 0x0

    :cond_0
    iput-object p2, p0, Lio/github/cherrywechat/network/model/CustomerData;->customer:Lio/github/cherrywechat/network/model/CustomerInfo;

    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    .line 3
    const-string p2, ""

    .line 4
    iput-object p2, p0, Lio/github/cherrywechat/network/model/CustomerData;->accessToken:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lio/github/cherrywechat/network/model/CustomerData;->accessToken:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    const-wide/16 p2, 0x0

    iput-wide p2, p0, Lio/github/cherrywechat/network/model/CustomerData;->expires:J

    goto :goto_1

    :cond_2
    iput-wide p4, p0, Lio/github/cherrywechat/network/model/CustomerData;->expires:J

    :goto_1
    and-int/lit8 p1, p1, 0x8

    if-nez p1, :cond_3

    .line 5
    sget-object p1, LKf;->a:LKf;

    .line 6
    iput-object p1, p0, Lio/github/cherrywechat/network/model/CustomerData;->authorizedThemes:Ljava/util/List;

    return-void

    :cond_3
    iput-object p6, p0, Lio/github/cherrywechat/network/model/CustomerData;->authorizedThemes:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lio/github/cherrywechat/network/model/CustomerInfo;Ljava/lang/String;JLjava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/github/cherrywechat/network/model/CustomerInfo;",
            "Ljava/lang/String;",
            "J",
            "Ljava/util/List<",
            "Lio/github/cherrywechat/network/model/AuthorizedThemeData;",
            ">;)V"
        }
    .end annotation

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, Lio/github/cherrywechat/network/model/CustomerData;->customer:Lio/github/cherrywechat/network/model/CustomerInfo;

    .line 9
    iput-object p2, p0, Lio/github/cherrywechat/network/model/CustomerData;->accessToken:Ljava/lang/String;

    .line 10
    iput-wide p3, p0, Lio/github/cherrywechat/network/model/CustomerData;->expires:J

    .line 11
    iput-object p5, p0, Lio/github/cherrywechat/network/model/CustomerData;->authorizedThemes:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Lio/github/cherrywechat/network/model/CustomerInfo;Ljava/lang/String;JLjava/util/List;ILOc;)V
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    .line 12
    const-string p2, ""

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    const-wide/16 p3, 0x0

    :cond_2
    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_3

    .line 13
    sget-object p5, LKf;->a:LKf;

    :cond_3
    move-object p7, p5

    move-wide p5, p3

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    .line 14
    invoke-direct/range {p2 .. p7}, Lio/github/cherrywechat/network/model/CustomerData;-><init>(Lio/github/cherrywechat/network/model/CustomerInfo;Ljava/lang/String;JLjava/util/List;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()LQm;
    .locals 2

    new-instance v0, LG4;

    sget-object v1, Lio/github/cherrywechat/network/model/AuthorizedThemeData$$serializer;->INSTANCE:Lio/github/cherrywechat/network/model/AuthorizedThemeData$$serializer;

    invoke-direct {v0, v1}, LG4;-><init>(LQm;)V

    return-object v0
.end method

.method public static synthetic a()LQm;
    .locals 1

    invoke-static {}, Lio/github/cherrywechat/network/model/CustomerData;->_childSerializers$_anonymous_()LQm;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[LDn;
    .locals 1

    sget-object v0, Lio/github/cherrywechat/network/model/CustomerData;->$childSerializers:[LDn;

    return-object v0
.end method

.method public static synthetic copy$default(Lio/github/cherrywechat/network/model/CustomerData;Lio/github/cherrywechat/network/model/CustomerInfo;Ljava/lang/String;JLjava/util/List;ILjava/lang/Object;)Lio/github/cherrywechat/network/model/CustomerData;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lio/github/cherrywechat/network/model/CustomerData;->customer:Lio/github/cherrywechat/network/model/CustomerInfo;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lio/github/cherrywechat/network/model/CustomerData;->accessToken:Ljava/lang/String;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-wide p3, p0, Lio/github/cherrywechat/network/model/CustomerData;->expires:J

    :cond_2
    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_3

    iget-object p5, p0, Lio/github/cherrywechat/network/model/CustomerData;->authorizedThemes:Ljava/util/List;

    :cond_3
    move-object p7, p5

    move-wide p5, p3

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p7}, Lio/github/cherrywechat/network/model/CustomerData;->copy(Lio/github/cherrywechat/network/model/CustomerInfo;Ljava/lang/String;JLjava/util/List;)Lio/github/cherrywechat/network/model/CustomerData;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$app_release(Lio/github/cherrywechat/network/model/CustomerData;LWa;LCx;)V
    .locals 4

    sget-object p2, Lio/github/cherrywechat/network/model/CustomerData;->$childSerializers:[LDn;

    invoke-interface {p1}, LWa;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/github/cherrywechat/network/model/CustomerData;->customer:Lio/github/cherrywechat/network/model/CustomerInfo;

    if-eqz v0, :cond_1

    :goto_0
    sget-object v0, Lio/github/cherrywechat/network/model/CustomerInfo$$serializer;->INSTANCE:Lio/github/cherrywechat/network/model/CustomerInfo$$serializer;

    iget-object v0, p0, Lio/github/cherrywechat/network/model/CustomerData;->customer:Lio/github/cherrywechat/network/model/CustomerInfo;

    invoke-interface {p1}, LWa;->f()V

    :cond_1
    invoke-interface {p1}, LWa;->g()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lio/github/cherrywechat/network/model/CustomerData;->accessToken:Ljava/lang/String;

    const-string v1, ""

    invoke-static {v0, v1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    :goto_1
    iget-object v0, p0, Lio/github/cherrywechat/network/model/CustomerData;->accessToken:Ljava/lang/String;

    invoke-interface {p1}, LWa;->d()V

    :cond_3
    invoke-interface {p1}, LWa;->g()Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_2

    :cond_4
    iget-wide v0, p0, Lio/github/cherrywechat/network/model/CustomerData;->expires:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_5

    :goto_2
    iget-wide v0, p0, Lio/github/cherrywechat/network/model/CustomerData;->expires:J

    invoke-interface {p1}, LWa;->c()V

    :cond_5
    invoke-interface {p1}, LWa;->g()Z

    move-result v0

    if-eqz v0, :cond_6

    goto :goto_3

    :cond_6
    iget-object v0, p0, Lio/github/cherrywechat/network/model/CustomerData;->authorizedThemes:Ljava/util/List;

    sget-object v1, LKf;->a:LKf;

    invoke-static {v0, v1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    :goto_3
    const/4 v0, 0x3

    aget-object p2, p2, v0

    invoke-interface {p2}, LDn;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LQm;

    iget-object p0, p0, Lio/github/cherrywechat/network/model/CustomerData;->authorizedThemes:Ljava/util/List;

    invoke-interface {p1}, LWa;->a()V

    :cond_7
    return-void
.end method


# virtual methods
.method public final component1()Lio/github/cherrywechat/network/model/CustomerInfo;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/CustomerData;->customer:Lio/github/cherrywechat/network/model/CustomerInfo;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/CustomerData;->accessToken:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()J
    .locals 2

    iget-wide v0, p0, Lio/github/cherrywechat/network/model/CustomerData;->expires:J

    return-wide v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/github/cherrywechat/network/model/AuthorizedThemeData;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/github/cherrywechat/network/model/CustomerData;->authorizedThemes:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Lio/github/cherrywechat/network/model/CustomerInfo;Ljava/lang/String;JLjava/util/List;)Lio/github/cherrywechat/network/model/CustomerData;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/github/cherrywechat/network/model/CustomerInfo;",
            "Ljava/lang/String;",
            "J",
            "Ljava/util/List<",
            "Lio/github/cherrywechat/network/model/AuthorizedThemeData;",
            ">;)",
            "Lio/github/cherrywechat/network/model/CustomerData;"
        }
    .end annotation

    new-instance v0, Lio/github/cherrywechat/network/model/CustomerData;

    move-object v1, p1

    move-object v2, p2

    move-wide v3, p3

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lio/github/cherrywechat/network/model/CustomerData;-><init>(Lio/github/cherrywechat/network/model/CustomerInfo;Ljava/lang/String;JLjava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/github/cherrywechat/network/model/CustomerData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/github/cherrywechat/network/model/CustomerData;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/CustomerData;->customer:Lio/github/cherrywechat/network/model/CustomerInfo;

    iget-object v3, p1, Lio/github/cherrywechat/network/model/CustomerData;->customer:Lio/github/cherrywechat/network/model/CustomerInfo;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/github/cherrywechat/network/model/CustomerData;->accessToken:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/network/model/CustomerData;->accessToken:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lio/github/cherrywechat/network/model/CustomerData;->expires:J

    iget-wide v5, p1, Lio/github/cherrywechat/network/model/CustomerData;->expires:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/github/cherrywechat/network/model/CustomerData;->authorizedThemes:Ljava/util/List;

    iget-object p1, p1, Lio/github/cherrywechat/network/model/CustomerData;->authorizedThemes:Ljava/util/List;

    invoke-static {v1, p1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getAccessToken()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/CustomerData;->accessToken:Ljava/lang/String;

    return-object v0
.end method

.method public final getAuthorizedThemes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/github/cherrywechat/network/model/AuthorizedThemeData;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/github/cherrywechat/network/model/CustomerData;->authorizedThemes:Ljava/util/List;

    return-object v0
.end method

.method public final getCustomer()Lio/github/cherrywechat/network/model/CustomerInfo;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/CustomerData;->customer:Lio/github/cherrywechat/network/model/CustomerInfo;

    return-object v0
.end method

.method public final getExpires()J
    .locals 2

    iget-wide v0, p0, Lio/github/cherrywechat/network/model/CustomerData;->expires:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lio/github/cherrywechat/network/model/CustomerData;->customer:Lio/github/cherrywechat/network/model/CustomerInfo;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lio/github/cherrywechat/network/model/CustomerInfo;->hashCode()I

    move-result v0

    :goto_0
    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/github/cherrywechat/network/model/CustomerData;->accessToken:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lph;->g(Ljava/lang/String;II)I

    move-result v0

    iget-wide v2, p0, Lio/github/cherrywechat/network/model/CustomerData;->expires:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/CustomerData;->authorizedThemes:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CustomerData(customer="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lio/github/cherrywechat/network/model/CustomerData;->customer:Lio/github/cherrywechat/network/model/CustomerInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", accessToken="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/CustomerData;->accessToken:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", expires="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lio/github/cherrywechat/network/model/CustomerData;->expires:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", authorizedThemes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/CustomerData;->authorizedThemes:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
