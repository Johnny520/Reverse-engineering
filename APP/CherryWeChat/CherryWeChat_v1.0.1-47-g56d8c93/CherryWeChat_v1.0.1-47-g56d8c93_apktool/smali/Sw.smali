.class public final LSw;
.super LZk;
.source ""


# static fields
.field public static final b:LSw;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, LSw;

    new-instance v1, LZz;

    const-wide v2, -0x1d667fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x1d66cfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    const/4 v7, 0x0

    const/16 v8, 0x7c

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, LZz;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lvx;I)V

    invoke-direct {v0, v1}, LZk;-><init>(LZz;)V

    sput-object v0, LSw;->b:LSw;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    const-wide v0, -0x1d620fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v1, -0x20df5fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    new-instance v3, LiG;

    sget v4, LgG;->a:I

    invoke-static {v0}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-direct {v3, v0}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v4, -0x1d6c9fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, LiG;->f(Ljava/lang/String;)V

    new-instance v0, LTp;

    const/16 v4, 0x19

    invoke-direct {v0, v4}, LTp;-><init>(I)V

    invoke-virtual {v3, v0}, LiG;->b(Lfj;)V

    const-wide v3, -0x1d6defffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    new-instance v1, LiG;

    invoke-static {v0}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-direct {v1, v0}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v2, -0x1d687fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, LiG;->f(Ljava/lang/String;)V

    new-instance v0, LTp;

    const/16 v2, 0x1a

    invoke-direct {v0, v2}, LTp;-><init>(I)V

    invoke-virtual {v1, v0}, LiG;->b(Lfj;)V

    return-void
.end method

.method public final b()Ljava/lang/String;
    .locals 2

    const-wide v0, -0x1d60dfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final d(Landroid/content/Context;)Ljava/util/ArrayList;
    .locals 2

    const-wide v0, -0x1d605fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    return-object p1
.end method
