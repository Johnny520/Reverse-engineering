.class public final La5;
.super LZk;
.source ""


# static fields
.field public static final b:La5;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, La5;

    new-instance v1, Lvx;

    const-wide v2, -0xabedfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0xabfffffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    new-instance v6, LZ4;

    const/4 v3, 0x0

    invoke-direct {v6, v3}, LZ4;-><init>(I)V

    const/16 v7, 0xa

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lvx;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;I)V

    new-instance v2, LZz;

    const-wide v3, -0xab84fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    const-wide v4, -0xab89fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    const-wide v5, -0xab98fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const-wide v6, -0xab9ffffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    const/4 v8, 0x4

    move-object v7, v1

    move-object v1, v2

    move-object v2, v3

    move-object v3, v4

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v8}, LZz;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lvx;I)V

    invoke-direct {v0, v1}, LZk;-><init>(LZz;)V

    sput-object v0, La5;->b:La5;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    const-wide v0, -0xaa41fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v1, -0x20df5fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    new-instance v3, LiG;

    sget v4, LgG;->a:I

    invoke-static {v0}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-direct {v3, v0}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v4, -0xaa73fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, LiG;->f(Ljava/lang/String;)V

    const-class v0, Landroid/os/Bundle;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v3, v0}, LiG;->g([Ljava/lang/Object;)V

    new-instance v0, Lb;

    const/16 v4, 0xd

    invoke-direct {v0, v4}, Lb;-><init>(I)V

    invoke-virtual {v3, v0}, LiG;->b(Lfj;)V

    const-wide v3, -0xaa7cfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    new-instance v1, LiG;

    invoke-static {v0}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-direct {v1, v0}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v2, -0xaa2efffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, LiG;->f(Ljava/lang/String;)V

    new-instance v0, Lb;

    const/16 v2, 0xe

    invoke-direct {v0, v2}, Lb;-><init>(I)V

    invoke-virtual {v1, v0}, LiG;->a(Lfj;)V

    return-void
.end method

.method public final b()Ljava/lang/String;
    .locals 2

    const-wide v0, -0xabb0fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
