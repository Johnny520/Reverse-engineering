.class public final Lc5;
.super LZk;
.source ""


# static fields
.field public static final b:Lc5;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lc5;

    new-instance v1, LZz;

    const-wide v2, -0xa9c5fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0xa9cafffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    const-wide v4, -0xa9e0fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const-wide v6, -0xa9e7fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    const/16 v8, 0x64

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v8}, LZz;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lvx;I)V

    invoke-direct {v0, v1}, LZk;-><init>(LZz;)V

    sput-object v0, Lc5;->b:Lc5;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    const-wide v0, -0xa9fffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v1, -0xa9affffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lsa;->b0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-wide v2, -0x20df5fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    new-instance v2, LiG;

    sget v3, LgG;->a:I

    invoke-static {v1}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v2, v1}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v3, -0xa85ffffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, LiG;->f(Ljava/lang/String;)V

    const-class v1, Landroid/os/Bundle;

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v2, v1}, LiG;->g([Ljava/lang/Object;)V

    new-instance v1, Lb;

    const/16 v3, 0xf

    invoke-direct {v1, v3}, Lb;-><init>(I)V

    invoke-virtual {v2, v1}, LiG;->b(Lfj;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final b()Ljava/lang/String;
    .locals 2

    const-wide v0, -0xa9f3fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
