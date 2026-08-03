.class public final Lio/github/cherrywechat/network/model/TolerantBooleanSerializer;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LQm;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LQm;"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lio/github/cherrywechat/network/model/TolerantBooleanSerializer;

.field private static final descriptor:LCx;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/github/cherrywechat/network/model/TolerantBooleanSerializer;

    invoke-direct {v0}, Lio/github/cherrywechat/network/model/TolerantBooleanSerializer;-><init>()V

    sput-object v0, Lio/github/cherrywechat/network/model/TolerantBooleanSerializer;->INSTANCE:Lio/github/cherrywechat/network/model/TolerantBooleanSerializer;

    const-string v0, "TolerantBoolean"

    sget-object v1, Lmu;->g:Lmu;

    invoke-static {v0, v1}, LTB;->b(Ljava/lang/String;Lnu;)Lru;

    move-result-object v0

    sput-object v0, Lio/github/cherrywechat/network/model/TolerantBooleanSerializer;->descriptor:LCx;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public deserialize(LJc;)Ljava/lang/Boolean;
    .locals 6

    .line 2
    instance-of v0, p1, Lkz;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lkz;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_1

    .line 3
    invoke-interface {p1}, LJc;->e()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 4
    :cond_1
    invoke-virtual {v0}, Lkz;->A0()Lkotlinx/serialization/json/b;

    move-result-object p1

    invoke-static {p1}, Lsm;->d(Lkotlinx/serialization/json/b;)Lkotlinx/serialization/json/d;

    move-result-object p1

    .line 5
    invoke-static {p1}, Lsm;->c(Lkotlinx/serialization/json/d;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_2

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    .line 6
    :cond_2
    const-string v0, "true"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_3

    goto :goto_3

    .line 7
    :cond_3
    const-string v2, "false"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_5

    :cond_4
    :goto_1
    move v3, v5

    goto :goto_3

    .line 8
    :cond_5
    const-string v4, "1"

    .line 9
    invoke-virtual {p1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    goto :goto_3

    .line 10
    :cond_6
    const-string v3, "0"

    .line 11
    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    goto :goto_1

    .line 12
    :cond_7
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 13
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_2

    .line 14
    :cond_8
    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    .line 15
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :cond_9
    :goto_2
    if-eqz v1, :cond_4

    .line 16
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    :goto_3
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic deserialize(LJc;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lio/github/cherrywechat/network/model/TolerantBooleanSerializer;->deserialize(LJc;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()LCx;
    .locals 1

    sget-object v0, Lio/github/cherrywechat/network/model/TolerantBooleanSerializer;->descriptor:LCx;

    return-object v0
.end method

.method public bridge synthetic serialize(LOf;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-virtual {p0, p1, p2}, Lio/github/cherrywechat/network/model/TolerantBooleanSerializer;->serialize(LOf;Z)V

    return-void
.end method

.method public serialize(LOf;Z)V
    .locals 0

    .line 2
    invoke-interface {p1}, LOf;->b()V

    return-void
.end method
