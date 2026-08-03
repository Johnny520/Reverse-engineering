.class public final Lio/github/cherrywechat/network/model/ScreenshotsSerializer;
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
.field public static final INSTANCE:Lio/github/cherrywechat/network/model/ScreenshotsSerializer;

.field private static final descriptor:LCx;

.field private static final listSerializer:LQm;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LQm;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/github/cherrywechat/network/model/ScreenshotsSerializer;

    invoke-direct {v0}, Lio/github/cherrywechat/network/model/ScreenshotsSerializer;-><init>()V

    sput-object v0, Lio/github/cherrywechat/network/model/ScreenshotsSerializer;->INSTANCE:Lio/github/cherrywechat/network/model/ScreenshotsSerializer;

    sget-object v0, Lsz;->a:Lsz;

    new-instance v1, LG4;

    invoke-direct {v1, v0}, LG4;-><init>(LQm;)V

    sput-object v1, Lio/github/cherrywechat/network/model/ScreenshotsSerializer;->listSerializer:LQm;

    iget-object v0, v1, LG4;->b:LF4;

    sput-object v0, Lio/github/cherrywechat/network/model/ScreenshotsSerializer;->descriptor:LCx;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic deserialize(LJc;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lio/github/cherrywechat/network/model/ScreenshotsSerializer;->deserialize(LJc;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public deserialize(LJc;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LJc;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 2
    instance-of v0, p1, Lkz;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lkz;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    .line 3
    sget-object v0, Lio/github/cherrywechat/network/model/ScreenshotsSerializer;->listSerializer:LQm;

    invoke-interface {v0, p1}, LQm;->deserialize(LJc;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1

    .line 4
    :cond_1
    invoke-virtual {v0}, Lkz;->A0()Lkotlinx/serialization/json/b;

    move-result-object p1

    .line 5
    instance-of v0, p1, Lkotlinx/serialization/json/a;

    sget-object v1, LKf;->a:LKf;

    if-eqz v0, :cond_3

    .line 6
    :try_start_0
    sget v0, Lsm;->a:I

    .line 7
    check-cast p1, Lkotlinx/serialization/json/a;

    .line 8
    new-instance v0, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p1, v2}, Lta;->d0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 9
    iget-object p1, p1, Lkotlinx/serialization/json/a;->a:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 10
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 11
    check-cast v2, Lkotlinx/serialization/json/b;

    .line 12
    invoke-static {v2}, Lsm;->d(Lkotlinx/serialization/json/b;)Lkotlinx/serialization/json/d;

    move-result-object v2

    invoke-virtual {v2}, Lkotlinx/serialization/json/d;->a()Ljava/lang/String;

    move-result-object v2

    .line 13
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_2
    move-object v1, v0

    goto :goto_2

    .line 14
    :cond_3
    instance-of v0, p1, Lkotlinx/serialization/json/d;

    if-eqz v0, :cond_5

    .line 15
    check-cast p1, Lkotlinx/serialization/json/d;

    invoke-static {p1}, Lsm;->c(Lkotlinx/serialization/json/d;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_4

    goto :goto_2

    .line 16
    :cond_4
    invoke-static {p1}, Ltz;->e0(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    .line 17
    const-string v0, "["

    .line 18
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 19
    :try_start_1
    sget-object v0, Lzm;->a:LAm;

    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, LG4;

    sget-object v3, Lsz;->a:Lsz;

    invoke-direct {v2, v3}, LG4;-><init>(LQm;)V

    invoke-virtual {v0, v2, p1}, Lmm;->a(LQm;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-object v1, p1

    :catch_0
    :cond_5
    :goto_2
    return-object v1
.end method

.method public getDescriptor()LCx;
    .locals 1

    sget-object v0, Lio/github/cherrywechat/network/model/ScreenshotsSerializer;->descriptor:LCx;

    return-object v0
.end method

.method public bridge synthetic serialize(LOf;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Ljava/util/List;

    invoke-virtual {p0, p1, p2}, Lio/github/cherrywechat/network/model/ScreenshotsSerializer;->serialize(LOf;Ljava/util/List;)V

    return-void
.end method

.method public serialize(LOf;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LOf;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 2
    sget-object v0, Lio/github/cherrywechat/network/model/ScreenshotsSerializer;->listSerializer:LQm;

    invoke-interface {v0, p1, p2}, LQm;->serialize(LOf;Ljava/lang/Object;)V

    return-void
.end method
