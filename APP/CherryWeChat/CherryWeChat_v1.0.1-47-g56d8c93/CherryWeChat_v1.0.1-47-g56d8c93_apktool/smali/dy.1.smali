.class public final Ldy;
.super LZk;
.source ""


# static fields
.field public static final b:Ldy;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Ldy;

    new-instance v1, LZz;

    const-wide v2, -0xfe4fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0xfe9fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    const-wide v4, -0xff9fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const-wide v6, -0xf80fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    const/16 v8, 0x60

    const/4 v4, 0x1

    invoke-direct/range {v1 .. v8}, LZz;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lvx;I)V

    invoke-direct {v0, v1}, LZk;-><init>(LZz;)V

    sput-object v0, Ldy;->b:Ldy;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    sget-object v0, LcG;->a:Ljava/util/LinkedHashMap;

    const-wide v1, -0x2177ffffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LbG;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, v0, LbG;->a:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    instance-of v2, v0, Ljava/lang/reflect/Method;

    if-eqz v2, :cond_1

    move-object v1, v0

    check-cast v1, Ljava/lang/reflect/Method;

    :cond_1
    new-instance v0, LMx;

    const/4 v2, 0x4

    invoke-direct {v0, v2}, LMx;-><init>(I)V

    const-wide v2, -0x20d85fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    const-wide v2, -0x20d8cfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    new-instance v2, LiG;

    invoke-direct {v2, v1}, LiG;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v2, v0}, LiG;->b(Lfj;)V

    return-void
.end method

.method public final b()Ljava/lang/String;
    .locals 2

    const-wide v0, -0xf92fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
