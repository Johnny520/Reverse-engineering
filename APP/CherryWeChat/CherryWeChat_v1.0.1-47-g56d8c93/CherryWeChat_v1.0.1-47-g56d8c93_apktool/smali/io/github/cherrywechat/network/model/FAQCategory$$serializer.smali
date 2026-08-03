.class public final synthetic Lio/github/cherrywechat/network/model/FAQCategory$$serializer;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lwj;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/github/cherrywechat/network/model/FAQCategory;
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
.field public static final INSTANCE:Lio/github/cherrywechat/network/model/FAQCategory$$serializer;

.field private static final descriptor:LCx;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lio/github/cherrywechat/network/model/FAQCategory$$serializer;

    invoke-direct {v0}, Lio/github/cherrywechat/network/model/FAQCategory$$serializer;-><init>()V

    sput-object v0, Lio/github/cherrywechat/network/model/FAQCategory$$serializer;->INSTANCE:Lio/github/cherrywechat/network/model/FAQCategory$$serializer;

    new-instance v1, LSt;

    const-string v2, "io.github.cherrywechat.network.model.FAQCategory"

    const/4 v3, 0x3

    invoke-direct {v1, v2, v0, v3}, LSt;-><init>(Ljava/lang/String;Lwj;I)V

    const-string v0, "category_id"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    const-string v0, "category_name"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    const-string v0, "items"

    invoke-virtual {v1, v0}, LSt;->l(Ljava/lang/String;)V

    sput-object v1, Lio/github/cherrywechat/network/model/FAQCategory$$serializer;->descriptor:LCx;

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

    invoke-static {}, Lio/github/cherrywechat/network/model/FAQCategory;->access$get$childSerializers$cp()[LDn;

    move-result-object v0

    const/4 v1, 0x3

    new-array v1, v1, [LQm;

    sget-object v2, Lsz;->a:Lsz;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x2

    aget-object v0, v0, v2

    invoke-interface {v0}, LDn;->getValue()Ljava/lang/Object;

    move-result-object v0

    aput-object v0, v1, v2

    return-object v1
.end method

.method public final deserialize(LJc;)Lio/github/cherrywechat/network/model/FAQCategory;
    .locals 11

    .line 1
    sget-object v0, Lio/github/cherrywechat/network/model/FAQCategory$$serializer;->descriptor:LCx;

    invoke-interface {p1, v0}, LJc;->B(LCx;)LVa;

    move-result-object p1

    invoke-static {}, Lio/github/cherrywechat/network/model/FAQCategory;->access$get$childSerializers$cp()[LDn;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    move v6, v3

    move-object v7, v4

    move-object v8, v7

    move-object v9, v8

    move v4, v2

    :goto_0
    if-eqz v4, :cond_4

    invoke-interface {p1, v0}, LVa;->j(LCx;)I

    move-result v5

    const/4 v10, -0x1

    if-eq v5, v10, :cond_3

    if-eqz v5, :cond_2

    if-eq v5, v2, :cond_1

    const/4 v10, 0x2

    if-ne v5, v10, :cond_0

    aget-object v5, v1, v10

    invoke-interface {v5}, LDn;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LQm;

    invoke-interface {p1, v0, v10, v5, v9}, LVa;->v(LCx;ILQm;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v9, v5

    check-cast v9, Ljava/util/List;

    or-int/lit8 v6, v6, 0x4

    goto :goto_0

    :cond_0
    new-instance p1, Lym;

    invoke-direct {p1, v5}, Lym;-><init>(I)V

    throw p1

    :cond_1
    invoke-interface {p1, v0, v2}, LVa;->o(LCx;I)Ljava/lang/String;

    move-result-object v8

    or-int/lit8 v6, v6, 0x2

    goto :goto_0

    :cond_2
    invoke-interface {p1, v0, v3}, LVa;->o(LCx;I)Ljava/lang/String;

    move-result-object v7

    or-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_3
    move v4, v3

    goto :goto_0

    :cond_4
    invoke-interface {p1, v0}, LVa;->r(LCx;)V

    new-instance v5, Lio/github/cherrywechat/network/model/FAQCategory;

    const/4 v10, 0x0

    invoke-direct/range {v5 .. v10}, Lio/github/cherrywechat/network/model/FAQCategory;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;LGx;)V

    return-object v5
.end method

.method public bridge synthetic deserialize(LJc;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lio/github/cherrywechat/network/model/FAQCategory$$serializer;->deserialize(LJc;)Lio/github/cherrywechat/network/model/FAQCategory;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()LCx;
    .locals 1

    sget-object v0, Lio/github/cherrywechat/network/model/FAQCategory$$serializer;->descriptor:LCx;

    return-object v0
.end method

.method public final serialize(LOf;Lio/github/cherrywechat/network/model/FAQCategory;)V
    .locals 1

    .line 1
    sget-object v0, Lio/github/cherrywechat/network/model/FAQCategory$$serializer;->descriptor:LCx;

    invoke-interface {p1}, LOf;->c()LWa;

    const/4 p1, 0x0

    invoke-static {p2, p1, v0}, Lio/github/cherrywechat/network/model/FAQCategory;->write$Self$app_release(Lio/github/cherrywechat/network/model/FAQCategory;LWa;LCx;)V

    throw p1
.end method

.method public bridge synthetic serialize(LOf;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lio/github/cherrywechat/network/model/FAQCategory;

    invoke-virtual {p0, p1, p2}, Lio/github/cherrywechat/network/model/FAQCategory$$serializer;->serialize(LOf;Lio/github/cherrywechat/network/model/FAQCategory;)V

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
