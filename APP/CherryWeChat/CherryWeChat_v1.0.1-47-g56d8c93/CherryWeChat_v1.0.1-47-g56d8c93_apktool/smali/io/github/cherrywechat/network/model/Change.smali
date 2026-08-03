.class public final Lio/github/cherrywechat/network/model/Change;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/github/cherrywechat/network/model/Change$$serializer;,
        Lio/github/cherrywechat/network/model/Change$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lio/github/cherrywechat/network/model/Change$Companion;


# instance fields
.field private final description:Ljava/lang/String;

.field private final type:Lio/github/cherrywechat/network/model/ChangeType;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/github/cherrywechat/network/model/Change$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/github/cherrywechat/network/model/Change$Companion;-><init>(LOc;)V

    sput-object v0, Lio/github/cherrywechat/network/model/Change;->Companion:Lio/github/cherrywechat/network/model/Change$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-direct {p0, v0, v0, v1, v0}, Lio/github/cherrywechat/network/model/Change;-><init>(Lio/github/cherrywechat/network/model/ChangeType;Ljava/lang/String;ILOc;)V

    return-void
.end method

.method public synthetic constructor <init>(ILio/github/cherrywechat/network/model/ChangeType;Ljava/lang/String;LGx;)V
    .locals 6

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p4, p1, 0x1

    if-nez p4, :cond_0

    .line 3
    new-instance v0, Lio/github/cherrywechat/network/model/ChangeType;

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lio/github/cherrywechat/network/model/ChangeType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILOc;)V

    .line 4
    iput-object v0, p0, Lio/github/cherrywechat/network/model/Change;->type:Lio/github/cherrywechat/network/model/ChangeType;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lio/github/cherrywechat/network/model/Change;->type:Lio/github/cherrywechat/network/model/ChangeType;

    :goto_0
    and-int/lit8 p1, p1, 0x2

    if-nez p1, :cond_1

    .line 5
    const-string p1, ""

    .line 6
    iput-object p1, p0, Lio/github/cherrywechat/network/model/Change;->description:Ljava/lang/String;

    return-void

    :cond_1
    iput-object p3, p0, Lio/github/cherrywechat/network/model/Change;->description:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lio/github/cherrywechat/network/model/ChangeType;Ljava/lang/String;)V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, Lio/github/cherrywechat/network/model/Change;->type:Lio/github/cherrywechat/network/model/ChangeType;

    .line 9
    iput-object p2, p0, Lio/github/cherrywechat/network/model/Change;->description:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lio/github/cherrywechat/network/model/ChangeType;Ljava/lang/String;ILOc;)V
    .locals 6

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    .line 10
    new-instance v0, Lio/github/cherrywechat/network/model/ChangeType;

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lio/github/cherrywechat/network/model/ChangeType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILOc;)V

    move-object p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    .line 11
    const-string p2, ""

    .line 12
    :cond_1
    invoke-direct {p0, p1, p2}, Lio/github/cherrywechat/network/model/Change;-><init>(Lio/github/cherrywechat/network/model/ChangeType;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/github/cherrywechat/network/model/Change;Lio/github/cherrywechat/network/model/ChangeType;Ljava/lang/String;ILjava/lang/Object;)Lio/github/cherrywechat/network/model/Change;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lio/github/cherrywechat/network/model/Change;->type:Lio/github/cherrywechat/network/model/ChangeType;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lio/github/cherrywechat/network/model/Change;->description:Ljava/lang/String;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lio/github/cherrywechat/network/model/Change;->copy(Lio/github/cherrywechat/network/model/ChangeType;Ljava/lang/String;)Lio/github/cherrywechat/network/model/Change;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$app_release(Lio/github/cherrywechat/network/model/Change;LWa;LCx;)V
    .locals 6

    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lio/github/cherrywechat/network/model/Change;->type:Lio/github/cherrywechat/network/model/ChangeType;

    new-instance v0, Lio/github/cherrywechat/network/model/ChangeType;

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lio/github/cherrywechat/network/model/ChangeType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILOc;)V

    invoke-static {p2, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    :goto_0
    sget-object p2, Lio/github/cherrywechat/network/model/ChangeType$$serializer;->INSTANCE:Lio/github/cherrywechat/network/model/ChangeType$$serializer;

    iget-object p2, p0, Lio/github/cherrywechat/network/model/Change;->type:Lio/github/cherrywechat/network/model/ChangeType;

    invoke-interface {p1}, LWa;->a()V

    :cond_1
    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_2

    goto :goto_1

    :cond_2
    iget-object p2, p0, Lio/github/cherrywechat/network/model/Change;->description:Ljava/lang/String;

    const-string v0, ""

    invoke-static {p2, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    :goto_1
    iget-object p0, p0, Lio/github/cherrywechat/network/model/Change;->description:Ljava/lang/String;

    invoke-interface {p1}, LWa;->d()V

    :cond_3
    return-void
.end method


# virtual methods
.method public final component1()Lio/github/cherrywechat/network/model/ChangeType;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/Change;->type:Lio/github/cherrywechat/network/model/ChangeType;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/Change;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lio/github/cherrywechat/network/model/ChangeType;Ljava/lang/String;)Lio/github/cherrywechat/network/model/Change;
    .locals 1

    new-instance v0, Lio/github/cherrywechat/network/model/Change;

    invoke-direct {v0, p1, p2}, Lio/github/cherrywechat/network/model/Change;-><init>(Lio/github/cherrywechat/network/model/ChangeType;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/github/cherrywechat/network/model/Change;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/github/cherrywechat/network/model/Change;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/Change;->type:Lio/github/cherrywechat/network/model/ChangeType;

    iget-object v3, p1, Lio/github/cherrywechat/network/model/Change;->type:Lio/github/cherrywechat/network/model/ChangeType;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/github/cherrywechat/network/model/Change;->description:Ljava/lang/String;

    iget-object p1, p1, Lio/github/cherrywechat/network/model/Change;->description:Ljava/lang/String;

    invoke-static {v1, p1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/Change;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()Lio/github/cherrywechat/network/model/ChangeType;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/Change;->type:Lio/github/cherrywechat/network/model/ChangeType;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lio/github/cherrywechat/network/model/Change;->type:Lio/github/cherrywechat/network/model/ChangeType;

    invoke-virtual {v0}, Lio/github/cherrywechat/network/model/ChangeType;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/github/cherrywechat/network/model/Change;->description:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Change(type="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lio/github/cherrywechat/network/model/Change;->type:Lio/github/cherrywechat/network/model/ChangeType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", description="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/Change;->description:Ljava/lang/String;

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lph;->l(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
