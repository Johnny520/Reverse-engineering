.class public final LO0;
.super Lx5;
.source ""


# static fields
.field public static final a:LO0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LO0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LO0;->a:LO0;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    new-instance v0, LiG;

    const-class v1, Landroid/app/Activity;

    invoke-direct {v0, v1}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v2, -0x1a459fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, LiG;->f(Ljava/lang/String;)V

    const-class v2, Landroid/os/Bundle;

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v3}, LiG;->g([Ljava/lang/Object;)V

    new-instance v3, Lb;

    const/4 v4, 0x4

    invoke-direct {v3, v4}, Lb;-><init>(I)V

    invoke-virtual {v0, v3}, LiG;->b(Lfj;)V

    const-wide v3, -0x1a462fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LDc;->f(Ljava/lang/String;)LiG;

    move-result-object v0

    const-wide v3, -0x1a404fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, LiG;->f(Ljava/lang/String;)V

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, LiG;->g([Ljava/lang/Object;)V

    new-instance v2, Lb;

    const/4 v3, 0x5

    invoke-direct {v2, v3}, Lb;-><init>(I)V

    invoke-virtual {v0, v2}, LiG;->b(Lfj;)V

    new-instance v0, LiG;

    invoke-direct {v0, v1}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v2, -0x1a40dfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, LiG;->f(Ljava/lang/String;)V

    new-instance v2, Lb;

    const/4 v3, 0x6

    invoke-direct {v2, v3}, Lb;-><init>(I)V

    invoke-virtual {v0, v2}, LiG;->b(Lfj;)V

    const-wide v2, -0x1a416fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LDc;->f(Ljava/lang/String;)LiG;

    move-result-object v0

    const-wide v2, -0x1a438fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, LiG;->f(Ljava/lang/String;)V

    new-instance v2, Lb;

    const/4 v3, 0x7

    invoke-direct {v2, v3}, Lb;-><init>(I)V

    invoke-virtual {v0, v2}, LiG;->b(Lfj;)V

    new-instance v0, LiG;

    invoke-direct {v0, v1}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v2, -0x1a4c1fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, LiG;->f(Ljava/lang/String;)V

    new-instance v2, Lb;

    const/16 v3, 0x8

    invoke-direct {v2, v3}, Lb;-><init>(I)V

    invoke-virtual {v0, v2}, LiG;->b(Lfj;)V

    const-wide v2, -0x1a4c9fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LDc;->f(Ljava/lang/String;)LiG;

    move-result-object v0

    const-wide v2, -0x1a4ebfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, LiG;->f(Ljava/lang/String;)V

    new-instance v2, Lb;

    const/16 v3, 0x9

    invoke-direct {v2, v3}, Lb;-><init>(I)V

    invoke-virtual {v0, v2}, LiG;->b(Lfj;)V

    new-instance v0, LiG;

    invoke-direct {v0, v1}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v1, -0x1a4f3fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LiG;->f(Ljava/lang/String;)V

    new-instance v1, Lb;

    const/16 v2, 0xa

    invoke-direct {v1, v2}, Lb;-><init>(I)V

    invoke-virtual {v0, v1}, LiG;->b(Lfj;)V

    const-wide v0, -0x1a4fdfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LDc;->f(Ljava/lang/String;)LiG;

    move-result-object v0

    const-wide v1, -0x1a49ffffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LiG;->f(Ljava/lang/String;)V

    new-instance v1, Lb;

    const/16 v2, 0xb

    invoke-direct {v1, v2}, Lb;-><init>(I)V

    invoke-virtual {v0, v1}, LiG;->b(Lfj;)V

    return-void
.end method

.method public final b()Ljava/lang/String;
    .locals 2

    const-wide v0, -0x1a44cfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
