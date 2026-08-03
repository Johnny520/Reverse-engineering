.class public final synthetic Lio/github/cherrywechat/network/model/UpdateItem$$serializer;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lwj;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/github/cherrywechat/network/model/UpdateItem;
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
.field public static final INSTANCE:Lio/github/cherrywechat/network/model/UpdateItem$$serializer;

.field private static final descriptor:LCx;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lio/github/cherrywechat/network/model/UpdateItem$$serializer;

    invoke-direct {v0}, Lio/github/cherrywechat/network/model/UpdateItem$$serializer;-><init>()V

    sput-object v0, Lio/github/cherrywechat/network/model/UpdateItem$$serializer;->INSTANCE:Lio/github/cherrywechat/network/model/UpdateItem$$serializer;

    new-instance v1, LSt;

    const-string v2, "io.github.cherrywechat.network.model.UpdateItem"

    const/4 v3, 0x5

    invoke-direct {v1, v2, v0, v3}, LSt;-><init>(Ljava/lang/String;Lwj;I)V

    const-string v0, "id"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    const-string v0, "version"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    const-string v0, "date"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    const-string v0, "type"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    const-string v0, "changes"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    sput-object v1, Lio/github/cherrywechat/network/model/UpdateItem$$serializer;->descriptor:LCx;

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

    invoke-static {}, Lio/github/cherrywechat/network/model/UpdateItem;->access$get$childSerializers$cp()[LDn;

    move-result-object v0

    const/4 v1, 0x5

    new-array v1, v1, [LQm;

    const/4 v2, 0x0

    sget-object v3, LHl;->a:LHl;

    aput-object v3, v1, v2

    sget-object v2, Lsz;->a:Lsz;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    sget-object v3, Lio/github/cherrywechat/network/model/UpdateType$$serializer;->INSTANCE:Lio/github/cherrywechat/network/model/UpdateType$$serializer;

    aput-object v3, v1, v2

    const/4 v2, 0x4

    aget-object v0, v0, v2

    invoke-interface {v0}, LDn;->getValue()Ljava/lang/Object;

    move-result-object v0

    aput-object v0, v1, v2

    return-object v1
.end method

.method public final deserialize(LJc;)Lio/github/cherrywechat/network/model/UpdateItem;
    .locals 13

    .line 1
    sget-object v0, Lio/github/cherrywechat/network/model/UpdateItem$$serializer;->descriptor:LCx;

    invoke-interface {p1, v0}, LJc;->B(LCx;)LVa;

    move-result-object p1

    invoke-static {}, Lio/github/cherrywechat/network/model/UpdateItem;->access$get$childSerializers$cp()[LDn;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    move v6, v3

    move v7, v6

    move-object v8, v4

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    move v4, v2

    :goto_0
    if-eqz v4, :cond_6

    invoke-interface {p1, v0}, LVa;->j(LCx;)I

    move-result v5

    const/4 v12, -0x1

    if-eq v5, v12, :cond_5

    if-eqz v5, :cond_4

    if-eq v5, v2, :cond_3

    const/4 v12, 0x2

    if-eq v5, v12, :cond_2

    const/4 v12, 0x3

    if-eq v5, v12, :cond_1

    const/4 v12, 0x4

    if-ne v5, v12, :cond_0

    aget-object v5, v1, v12

    invoke-interface {v5}, LDn;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LQm;

    invoke-interface {p1, v0, v12, v5, v11}, LVa;->v(LCx;ILQm;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v11, v5

    check-cast v11, Ljava/util/List;

    or-int/lit8 v6, v6, 0x10

    goto :goto_0

    :cond_0
    new-instance p1, Lym;

    invoke-direct {p1, v5}, Lym;-><init>(I)V

    throw p1

    :cond_1
    sget-object v5, Lio/github/cherrywechat/network/model/UpdateType$$serializer;->INSTANCE:Lio/github/cherrywechat/network/model/UpdateType$$serializer;

    invoke-interface {p1, v0, v12, v5, v10}, LVa;->v(LCx;ILQm;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v10, v5

    check-cast v10, Lio/github/cherrywechat/network/model/UpdateType;

    or-int/lit8 v6, v6, 0x8

    goto :goto_0

    :cond_2
    invoke-interface {p1, v0, v12}, LVa;->o(LCx;I)Ljava/lang/String;

    move-result-object v9

    or-int/lit8 v6, v6, 0x4

    goto :goto_0

    :cond_3
    invoke-interface {p1, v0, v2}, LVa;->o(LCx;I)Ljava/lang/String;

    move-result-object v8

    or-int/lit8 v6, v6, 0x2

    goto :goto_0

    :cond_4
    invoke-interface {p1, v0, v3}, LVa;->w(LCx;I)I

    move-result v7

    or-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_5
    move v4, v3

    goto :goto_0

    :cond_6
    invoke-interface {p1, v0}, LVa;->r(LCx;)V

    new-instance v5, Lio/github/cherrywechat/network/model/UpdateItem;

    const/4 v12, 0x0

    invoke-direct/range {v5 .. v12}, Lio/github/cherrywechat/network/model/UpdateItem;-><init>(IILjava/lang/String;Ljava/lang/String;Lio/github/cherrywechat/network/model/UpdateType;Ljava/util/List;LGx;)V

    return-object v5
.end method

.method public bridge synthetic deserialize(LJc;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lio/github/cherrywechat/network/model/UpdateItem$$serializer;->deserialize(LJc;)Lio/github/cherrywechat/network/model/UpdateItem;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()LCx;
    .locals 1

    sget-object v0, Lio/github/cherrywechat/network/model/UpdateItem$$serializer;->descriptor:LCx;

    return-object v0
.end method

.method public final serialize(LOf;Lio/github/cherrywechat/network/model/UpdateItem;)V
    .locals 1

    .line 1
    sget-object v0, Lio/github/cherrywechat/network/model/UpdateItem$$serializer;->descriptor:LCx;

    invoke-interface {p1}, LOf;->c()LWa;

    const/4 p1, 0x0

    invoke-static {p2, p1, v0}, Lio/github/cherrywechat/network/model/UpdateItem;->write$Self$app_release(Lio/github/cherrywechat/network/model/UpdateItem;LWa;LCx;)V

    throw p1
.end method

.method public bridge synthetic serialize(LOf;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lio/github/cherrywechat/network/model/UpdateItem;

    invoke-virtual {p0, p1, p2}, Lio/github/cherrywechat/network/model/UpdateItem$$serializer;->serialize(LOf;Lio/github/cherrywechat/network/model/UpdateItem;)V

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
