.class public final Lio/github/cherrywechat/network/model/TolerantIntSerializer;
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
.field public static final INSTANCE:Lio/github/cherrywechat/network/model/TolerantIntSerializer;

.field private static final descriptor:LCx;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/github/cherrywechat/network/model/TolerantIntSerializer;

    invoke-direct {v0}, Lio/github/cherrywechat/network/model/TolerantIntSerializer;-><init>()V

    sput-object v0, Lio/github/cherrywechat/network/model/TolerantIntSerializer;->INSTANCE:Lio/github/cherrywechat/network/model/TolerantIntSerializer;

    const-string v0, "TolerantInt"

    sget-object v1, Lmu;->l:Lmu;

    invoke-static {v0, v1}, LTB;->b(Ljava/lang/String;Lnu;)Lru;

    move-result-object v0

    sput-object v0, Lio/github/cherrywechat/network/model/TolerantIntSerializer;->descriptor:LCx;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public deserialize(LJc;)Ljava/lang/Integer;
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
    invoke-interface {p1}, LJc;->p()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    .line 4
    :cond_1
    invoke-virtual {v0}, Lkz;->A0()Lkotlinx/serialization/json/b;

    move-result-object p1

    invoke-static {p1}, Lsm;->d(Lkotlinx/serialization/json/b;)Lkotlinx/serialization/json/d;

    move-result-object p1

    .line 5
    :try_start_0
    new-instance v0, Loz;

    invoke-virtual {p1}, Lkotlinx/serialization/json/d;->a()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Loz;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Loz;->h()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0
    :try_end_0
    .catch Lrm; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-object v0, v1

    :goto_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    const-wide/32 v4, -0x80000000

    cmp-long v0, v4, v2

    if-gtz v0, :cond_2

    const-wide/32 v4, 0x7fffffff

    cmp-long v0, v2, v4

    if-gtz v0, :cond_2

    long-to-int v0, v2

    .line 6
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_2

    :cond_2
    move-object v0, v1

    :goto_2
    if-eqz v0, :cond_3

    .line 7
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_3

    .line 8
    :cond_3
    invoke-static {p1}, Lsm;->c(Lkotlinx/serialization/json/d;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-static {p1}, LAz;->H(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    :cond_4
    if-eqz v1, :cond_5

    .line 9
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_3

    :cond_5
    const/4 p1, 0x0

    .line 10
    :goto_3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic deserialize(LJc;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lio/github/cherrywechat/network/model/TolerantIntSerializer;->deserialize(LJc;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()LCx;
    .locals 1

    sget-object v0, Lio/github/cherrywechat/network/model/TolerantIntSerializer;->descriptor:LCx;

    return-object v0
.end method

.method public serialize(LOf;I)V
    .locals 0

    .line 2
    invoke-interface {p1}, LOf;->d()V

    return-void
.end method

.method public bridge synthetic serialize(LOf;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lio/github/cherrywechat/network/model/TolerantIntSerializer;->serialize(LOf;I)V

    return-void
.end method
