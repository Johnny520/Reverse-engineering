.class public final Lds;
.super LVk;
.source ""


# static fields
.field public static final a:Lds;

.field public static final b:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide v0, -0x53d4fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    new-instance v0, Lds;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lds;->a:Lds;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lds;->b:Ljava/util/ArrayList;

    return-void
.end method

.method public static c(Landroid/content/Context;ILjava/lang/String;)V
    .locals 3

    const-wide v0, -0x57e1fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    new-instance v0, Landroid/content/Intent;

    sget v1, LgG;->a:I

    const-wide v1, -0x57e9fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-wide v1, -0x57a2fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    if-eqz p2, :cond_0

    const-wide v1, -0x57b0fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_0
    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public static synthetic d(Lds;Landroid/content/Context;I)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, 0x0

    invoke-static {p1, p2, p0}, Lds;->c(Landroid/content/Context;ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    const-wide v0, -0x28d9fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v1, -0x20df5fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    new-instance v3, LiG;

    sget v4, LgG;->a:I

    invoke-static {v0}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-direct {v3, v0}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v4, -0x2892fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, LiG;->f(Ljava/lang/String;)V

    new-instance v0, LTp;

    const/4 v4, 0x5

    invoke-direct {v0, v4}, LTp;-><init>(I)V

    invoke-virtual {v3, v0}, LiG;->a(Lfj;)V

    const-wide v3, -0x289bfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    new-instance v3, LiG;

    invoke-static {v0}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-direct {v3, v0}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v4, -0x5754fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, LiG;->f(Ljava/lang/String;)V

    new-instance v0, LTp;

    const/4 v4, 0x6

    invoke-direct {v0, v4}, LTp;-><init>(I)V

    invoke-virtual {v3, v0}, LiG;->a(Lfj;)V

    const-wide v3, -0x575efffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    new-instance v3, LiG;

    invoke-static {v0}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-direct {v3, v0}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v4, -0x5717fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, LiG;->f(Ljava/lang/String;)V

    new-instance v0, LTp;

    const/4 v4, 0x7

    invoke-direct {v0, v4}, LTp;-><init>(I)V

    invoke-virtual {v3, v0}, LiG;->a(Lfj;)V

    const-wide v3, -0x5728fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    new-instance v1, LiG;

    invoke-static {v0}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-direct {v1, v0}, LiG;-><init>(Ljava/lang/Object;)V

    new-instance v0, Lx8;

    const/4 v2, 0x2

    const/16 v3, 0x10

    invoke-direct {v0, v3, v2}, Lx8;-><init>(II)V

    const-wide v2, -0x20db1fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iput-object v0, v1, LiG;->d:Lfj;

    new-instance v0, LTp;

    const/16 v2, 0x8

    invoke-direct {v0, v2}, LTp;-><init>(I)V

    const-wide v2, -0x20c69fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iput-object v0, v1, LiG;->g:Lfj;

    new-instance v0, LTp;

    const/16 v2, 0x9

    invoke-direct {v0, v2}, LTp;-><init>(I)V

    invoke-virtual {v1, v0}, LiG;->b(Lfj;)V

    return-void
.end method

.method public final b()Ljava/lang/String;
    .locals 2

    const-wide v0, -0x283bfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
