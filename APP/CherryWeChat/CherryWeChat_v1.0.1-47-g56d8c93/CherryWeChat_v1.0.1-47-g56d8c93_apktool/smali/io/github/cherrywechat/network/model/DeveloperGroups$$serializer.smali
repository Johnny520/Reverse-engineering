.class public final synthetic Lio/github/cherrywechat/network/model/DeveloperGroups$$serializer;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lwj;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/github/cherrywechat/network/model/DeveloperGroups;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwj;"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lio/github/cherrywechat/network/model/DeveloperGroups$$serializer;

.field private static final descriptor:LCx;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lio/github/cherrywechat/network/model/DeveloperGroups$$serializer;

    invoke-direct {v0}, Lio/github/cherrywechat/network/model/DeveloperGroups$$serializer;-><init>()V

    sput-object v0, Lio/github/cherrywechat/network/model/DeveloperGroups$$serializer;->INSTANCE:Lio/github/cherrywechat/network/model/DeveloperGroups$$serializer;

    new-instance v1, LSt;

    const-string v2, "io.github.cherrywechat.network.model.DeveloperGroups"

    const/4 v3, 0x2

    invoke-direct {v1, v2, v0, v3}, LSt;-><init>(Ljava/lang/String;Lwj;I)V

    const-string v0, "core"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    const-string v0, "special"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    sput-object v1, Lio/github/cherrywechat/network/model/DeveloperGroups$$serializer;->descriptor:LCx;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final childSerializers()[LQm;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "LQm;"
        }
    .end annotation

    invoke-static {}, Lio/github/cherrywechat/network/model/DeveloperGroups;->access$get$childSerializers$cp()[LDn;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [LQm;

    const/4 v2, 0x0

    aget-object v3, v0, v2

    invoke-interface {v3}, LDn;->getValue()Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    aget-object v0, v0, v2

    invoke-interface {v0}, LDn;->getValue()Ljava/lang/Object;

    move-result-object v0

    aput-object v0, v1, v2

    return-object v1
.end method

.method public final deserialize(LJc;)Lio/github/cherrywechat/network/model/DeveloperGroups;
    .locals 11

    .line 1
    sget-object v0, Lio/github/cherrywechat/network/model/DeveloperGroups$$serializer;->descriptor:LCx;

    invoke-interface {p1, v0}, LJc;->B(LCx;)LVa;

    move-result-object p1

    invoke-static {}, Lio/github/cherrywechat/network/model/DeveloperGroups;->access$get$childSerializers$cp()[LDn;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    move v5, v2

    move v6, v3

    move-object v7, v4

    move-object v8, v7

    :goto_0
    if-eqz v5, :cond_3

    invoke-interface {p1, v0}, LVa;->j(LCx;)I

    move-result v9

    const/4 v10, -0x1

    if-eq v9, v10, :cond_2

    if-eqz v9, :cond_1

    if-ne v9, v2, :cond_0

    aget-object v9, v1, v2

    invoke-interface {v9}, LDn;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LQm;

    invoke-interface {p1, v0, v2, v9, v8}, LVa;->v(LCx;ILQm;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    or-int/lit8 v6, v6, 0x2

    goto :goto_0

    :cond_0
    new-instance p1, Lym;

    invoke-direct {p1, v9}, Lym;-><init>(I)V

    throw p1

    :cond_1
    aget-object v9, v1, v3

    invoke-interface {v9}, LDn;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LQm;

    invoke-interface {p1, v0, v3, v9, v7}, LVa;->v(LCx;ILQm;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    or-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_2
    move v5, v3

    goto :goto_0

    :cond_3
    invoke-interface {p1, v0}, LVa;->r(LCx;)V

    new-instance p1, Lio/github/cherrywechat/network/model/DeveloperGroups;

    invoke-direct {p1, v6, v7, v8, v4}, Lio/github/cherrywechat/network/model/DeveloperGroups;-><init>(ILjava/util/List;Ljava/util/List;LGx;)V

    return-object p1
.end method

.method public bridge synthetic deserialize(LJc;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lio/github/cherrywechat/network/model/DeveloperGroups$$serializer;->deserialize(LJc;)Lio/github/cherrywechat/network/model/DeveloperGroups;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()LCx;
    .locals 1

    sget-object v0, Lio/github/cherrywechat/network/model/DeveloperGroups$$serializer;->descriptor:LCx;

    return-object v0
.end method

.method public final serialize(LOf;Lio/github/cherrywechat/network/model/DeveloperGroups;)V
    .locals 1

    .line 1
    sget-object v0, Lio/github/cherrywechat/network/model/DeveloperGroups$$serializer;->descriptor:LCx;

    invoke-interface {p1}, LOf;->c()LWa;

    const/4 p1, 0x0

    invoke-static {p2, p1, v0}, Lio/github/cherrywechat/network/model/DeveloperGroups;->write$Self$app_release(Lio/github/cherrywechat/network/model/DeveloperGroups;LWa;LCx;)V

    throw p1
.end method

.method public bridge synthetic serialize(LOf;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lio/github/cherrywechat/network/model/DeveloperGroups;

    invoke-virtual {p0, p1, p2}, Lio/github/cherrywechat/network/model/DeveloperGroups$$serializer;->serialize(LOf;Lio/github/cherrywechat/network/model/DeveloperGroups;)V

    return-void
.end method

.method public typeParametersSerializers()[LQm;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "LQm;"
        }
    .end annotation

    sget-object v0, LGu;->i:[LQm;

    return-object v0
.end method
