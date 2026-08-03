.class public final Lio/github/cherrywechat/network/model/TolerantDoubleSerializer;
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
.field public static final INSTANCE:Lio/github/cherrywechat/network/model/TolerantDoubleSerializer;

.field private static final descriptor:LCx;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/github/cherrywechat/network/model/TolerantDoubleSerializer;

    invoke-direct {v0}, Lio/github/cherrywechat/network/model/TolerantDoubleSerializer;-><init>()V

    sput-object v0, Lio/github/cherrywechat/network/model/TolerantDoubleSerializer;->INSTANCE:Lio/github/cherrywechat/network/model/TolerantDoubleSerializer;

    const-string v0, "TolerantDouble"

    sget-object v1, Lmu;->j:Lmu;

    invoke-static {v0, v1}, LTB;->b(Ljava/lang/String;Lnu;)Lru;

    move-result-object v0

    sput-object v0, Lio/github/cherrywechat/network/model/TolerantDoubleSerializer;->descriptor:LCx;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public deserialize(LJc;)Ljava/lang/Double;
    .locals 2

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
    invoke-interface {p1}, LJc;->D()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    return-object p1

    .line 4
    :cond_1
    invoke-virtual {v0}, Lkz;->A0()Lkotlinx/serialization/json/b;

    move-result-object p1

    invoke-static {p1}, Lsm;->d(Lkotlinx/serialization/json/b;)Lkotlinx/serialization/json/d;

    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lkotlinx/serialization/json/d;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lzz;->F(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 6
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    goto :goto_1

    .line 7
    :cond_2
    invoke-static {p1}, Lsm;->c(Lkotlinx/serialization/json/d;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-static {p1}, Lzz;->F(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v1

    :cond_3
    if-eqz v1, :cond_4

    .line 8
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    goto :goto_1

    :cond_4
    const-wide/16 v0, 0x0

    .line 9
    :goto_1
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic deserialize(LJc;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lio/github/cherrywechat/network/model/TolerantDoubleSerializer;->deserialize(LJc;)Ljava/lang/Double;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()LCx;
    .locals 1

    sget-object v0, Lio/github/cherrywechat/network/model/TolerantDoubleSerializer;->descriptor:LCx;

    return-object v0
.end method

.method public serialize(LOf;D)V
    .locals 0

    .line 2
    invoke-interface {p1}, LOf;->a()V

    return-void
.end method

.method public bridge synthetic serialize(LOf;Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, Lio/github/cherrywechat/network/model/TolerantDoubleSerializer;->serialize(LOf;D)V

    return-void
.end method
