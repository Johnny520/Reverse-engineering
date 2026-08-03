.class public final LaF;
.super LZk;
.source ""


# static fields
.field public static final b:LaF;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, LaF;

    new-instance v1, Lvx;

    const-wide v2, -0xd33fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0xdc8fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    const-wide v4, -0xdcafffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    new-instance v6, LL7;

    const/4 v5, 0x1

    invoke-direct {v6, v5}, LL7;-><init>(I)V

    const/16 v7, 0x8

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lvx;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;I)V

    new-instance v2, LZz;

    const-wide v3, -0xdd2fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    const-wide v4, -0xdd7fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    const-wide v5, -0xde8fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const-wide v6, -0xdedfffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    const/16 v8, 0x44

    move-object v7, v1

    move-object v1, v2

    move-object v2, v3

    move-object v3, v4

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v8}, LZz;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lvx;I)V

    invoke-direct {v0, v1}, LZk;-><init>(LZz;)V

    sput-object v0, LaF;->b:LaF;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    invoke-static {}, LcG;->g()Ljava/lang/reflect/Method;

    move-result-object v0

    new-instance v1, LMx;

    const/16 v2, 0xf

    invoke-direct {v1, v2}, LMx;-><init>(I)V

    const-wide v2, -0x20d85fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    const-wide v2, -0x20d8cfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    new-instance v2, LiG;

    invoke-direct {v2, v0}, LiG;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v2, v1}, LiG;->b(Lfj;)V

    return-void
.end method

.method public final b()Ljava/lang/String;
    .locals 2

    const-wide v0, -0xd87fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
