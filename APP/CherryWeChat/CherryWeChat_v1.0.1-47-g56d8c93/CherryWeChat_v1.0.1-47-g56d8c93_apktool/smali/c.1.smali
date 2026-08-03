.class public final Lc;
.super LZk;
.source ""


# static fields
.field public static final b:Lc;

.field public static c:Ljava/lang/reflect/Field;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lc;

    new-instance v1, LZz;

    const-wide v2, -0xac27fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0xac2cfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    const-wide v4, -0xac3afffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const-wide v6, -0xac3efffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    const/16 v8, 0x60

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v8}, LZz;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lvx;I)V

    invoke-direct {v0, v1}, LZk;-><init>(LZz;)V

    sput-object v0, Lc;->b:Lc;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 11

    const-wide v0, -0xacd5fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v1, -0x20df5fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    new-instance v1, LiG;

    sget v2, LgG;->a:I

    invoke-static {v0}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-direct {v1, v0}, LiG;-><init>(Ljava/lang/Object;)V

    const-wide v2, -0xacfefffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, LiG;->f(Ljava/lang/String;)V

    new-instance v0, Lb;

    const/4 v2, 0x0

    invoke-direct {v0, v2}, Lb;-><init>(I)V

    invoke-virtual {v1, v0}, LiG;->b(Lfj;)V

    sget-object v0, LcG;->a:Ljava/util/LinkedHashMap;

    const-wide v1, -0x21551fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LbG;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-object v1, v1, LbG;->a:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    instance-of v3, v1, Ljava/lang/reflect/Method;

    if-eqz v3, :cond_1

    check-cast v1, Ljava/lang/reflect/Method;

    goto :goto_1

    :cond_1
    move-object v1, v2

    :goto_1
    new-instance v3, Lb;

    const/4 v4, 0x3

    invoke-direct {v3, v4}, Lb;-><init>(I)V

    const-wide v4, -0x20d85fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    const-wide v6, -0x20d8cfffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    new-instance v8, LiG;

    invoke-direct {v8, v1}, LiG;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v8, v3}, LiG;->b(Lfj;)V

    const-wide v8, -0x2156cfffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LbG;

    if-eqz v1, :cond_2

    iget-object v1, v1, LbG;->a:Ljava/lang/Object;

    goto :goto_2

    :cond_2
    move-object v1, v2

    :goto_2
    instance-of v3, v1, Ljava/lang/reflect/Method;

    if-eqz v3, :cond_3

    check-cast v1, Ljava/lang/reflect/Method;

    goto :goto_3

    :cond_3
    move-object v1, v2

    :goto_3
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v1

    const-wide v8, -0xac83fffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    new-instance v3, Lb;

    const/4 v8, 0x1

    invoke-direct {v3, v8}, Lb;-><init>(I)V

    const-wide v8, -0x20f3afffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    const-wide v8, -0x20fc1fffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    const-wide v8, -0x20f7efffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    new-instance v8, Lqs;

    const/16 v9, 0xb

    invoke-direct {v8, v9, v1}, Lqs;-><init>(ILjava/lang/Class;)V

    const-wide v9, -0x20e61fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    iput-object v3, v8, Lqs;->c:Ljava/lang/Object;

    invoke-virtual {v8}, Lqs;->E()V

    const-wide v8, -0x2150cfffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LbG;

    if-eqz v0, :cond_4

    iget-object v0, v0, LbG;->a:Ljava/lang/Object;

    goto :goto_4

    :cond_4
    move-object v0, v2

    :goto_4
    instance-of v1, v0, Ljava/lang/reflect/Method;

    if-eqz v1, :cond_5

    move-object v2, v0

    check-cast v2, Ljava/lang/reflect/Method;

    :cond_5
    new-instance v0, Lb;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lb;-><init>(I)V

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    new-instance v1, LiG;

    invoke-direct {v1, v2}, LiG;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v1, v0}, LiG;->b(Lfj;)V

    return-void
.end method

.method public final b()Ljava/lang/String;
    .locals 2

    const-wide v0, -0xaccefffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
