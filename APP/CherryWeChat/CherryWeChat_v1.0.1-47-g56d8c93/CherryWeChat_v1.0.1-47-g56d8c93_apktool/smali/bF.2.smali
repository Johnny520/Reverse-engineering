.class public final LbF;
.super LVk;
.source ""


# static fields
.field public static final a:LbF;

.field public static final b:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LbF;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LbF;->a:LbF;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, LbF;->b:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 8

    const-wide v0, -0x1aae0fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v1, -0x20df5fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    new-instance v3, LiG;

    sget v4, LgG;->a:I

    invoke-static {v0}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-direct {v3, v0}, LiG;-><init>(Ljava/lang/Object;)V

    const-class v0, Landroid/content/Context;

    const-class v4, Landroid/util/AttributeSet;

    filled-new-array {v0, v4}, [Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v3, v5}, LiG;->g([Ljava/lang/Object;)V

    new-instance v5, LMx;

    const/16 v6, 0x10

    invoke-direct {v5, v6}, LMx;-><init>(I)V

    invoke-virtual {v3, v5}, LiG;->a(Lfj;)V

    const-wide v5, -0x1aa8ffffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    new-instance v5, LiG;

    invoke-static {v3}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    invoke-direct {v5, v3}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v6, -0x1aabefffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, LiG;->f(Ljava/lang/String;)V

    new-instance v3, LMx;

    const/16 v6, 0x11

    invoke-direct {v3, v6}, LMx;-><init>(I)V

    invoke-virtual {v5, v3}, LiG;->a(Lfj;)V

    const-wide v5, -0x1a94ffffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    new-instance v5, LiG;

    invoke-static {v3}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    invoke-direct {v5, v3}, LiG;-><init>(Ljava/lang/Object;)V

    filled-new-array {v0, v4}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v5, v0}, LiG;->g([Ljava/lang/Object;)V

    new-instance v0, LMx;

    const/16 v3, 0x12

    invoke-direct {v0, v3}, LMx;-><init>(I)V

    invoke-virtual {v5, v0}, LiG;->a(Lfj;)V

    const-wide v3, -0x1a900fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    new-instance v1, LiG;

    invoke-static {v0}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-direct {v1, v0}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v2, -0x1a931fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, LiG;->f(Ljava/lang/String;)V

    new-instance v0, LMx;

    const/16 v2, 0x13

    invoke-direct {v0, v2}, LMx;-><init>(I)V

    invoke-virtual {v1, v0}, LiG;->a(Lfj;)V

    return-void
.end method

.method public final b()Ljava/lang/String;
    .locals 2

    const-wide v0, -0x1aad0fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
