.class public final LYh;
.super LZk;
.source ""


# static fields
.field public static final b:LYh;

.field public static c:F


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, LYh;

    new-instance v1, Lvx;

    const-wide v2, -0x1904fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x1918fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    const-wide v4, -0x191cfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    const-wide v5, -0x1923fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    new-instance v6, LZ4;

    const/16 v7, 0x8

    invoke-direct {v6, v7}, LZ4;-><init>(I)V

    invoke-direct/range {v1 .. v6}, Lvx;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    new-instance v2, LZz;

    const-wide v3, -0x192bfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    const-wide v4, -0x1930fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    const-wide v5, -0x193efffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const-wide v6, -0x19c5fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    const/16 v8, 0x40

    move-object v7, v1

    move-object v1, v2

    move-object v2, v3

    move-object v3, v4

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v8}, LZz;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lvx;I)V

    invoke-direct {v0, v1}, LZk;-><init>(LZz;)V

    sput-object v0, LYh;->b:LYh;

    const/high16 v0, 0x3f800000    # 1.0f

    sput v0, LYh;->c:F

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    invoke-virtual {p0}, LZk;->e()Z

    move-result v0

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    if-eqz v0, :cond_1

    sget-object v0, LNx;->a:Landroid/content/SharedPreferences;

    const-wide v3, -0x19ecfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v3, -0x1980fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, LNx;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :try_start_0
    invoke-static {v0}, Lzz;->E(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v2

    :cond_1
    sput v2, LYh;->c:F

    sget-object v0, LcG;->a:Ljava/util/LinkedHashMap;

    const-wide v2, -0x2152bfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LbG;

    if-eqz v0, :cond_2

    iget-object v0, v0, LbG;->a:Ljava/lang/Object;

    goto :goto_1

    :cond_2
    move-object v0, v1

    :goto_1
    instance-of v2, v0, Ljava/lang/reflect/Method;

    if-eqz v2, :cond_3

    move-object v1, v0

    check-cast v1, Ljava/lang/reflect/Method;

    :cond_3
    if-eqz v1, :cond_4

    new-instance v0, LOb;

    const/16 v2, 0xa

    invoke-direct {v0, v2}, LOb;-><init>(I)V

    const-wide v2, -0x20d95fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    const-wide v2, -0x20d9cfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    new-instance v2, LiG;

    invoke-direct {v2, v1}, LiG;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v2, v0}, LiG;->a(Lfj;)V

    :cond_4
    return-void
.end method

.method public final b()Ljava/lang/String;
    .locals 2

    const-wide v0, -0x19dffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
