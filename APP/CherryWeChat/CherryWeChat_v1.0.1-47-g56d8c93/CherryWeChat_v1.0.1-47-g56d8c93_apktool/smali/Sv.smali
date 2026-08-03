.class public final LSv;
.super LZk;
.source ""


# static fields
.field public static final b:LSv;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, LSv;

    new-instance v1, LZz;

    const-wide v2, -0x214fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x219fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    const-wide v4, -0x229fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const/4 v7, 0x0

    const/16 v8, 0x74

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, LZz;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lvx;I)V

    invoke-direct {v0, v1}, LZk;-><init>(LZz;)V

    sput-object v0, LSv;->b:LSv;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 7

    sget-object v0, LcG;->a:Ljava/util/LinkedHashMap;

    const-wide v1, -0x21716fffff835L

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
    const-wide v3, -0x21730fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LbG;

    if-eqz v3, :cond_2

    iget-object v3, v3, LbG;->a:Ljava/lang/Object;

    goto :goto_2

    :cond_2
    move-object v3, v2

    :goto_2
    instance-of v4, v3, Ljava/lang/reflect/Method;

    if-eqz v4, :cond_3

    check-cast v3, Ljava/lang/reflect/Method;

    goto :goto_3

    :cond_3
    move-object v3, v2

    :goto_3
    const-wide v4, -0x217ebfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LbG;

    if-eqz v4, :cond_4

    iget-object v4, v4, LbG;->a:Ljava/lang/Object;

    goto :goto_4

    :cond_4
    move-object v4, v2

    :goto_4
    instance-of v5, v4, Ljava/lang/reflect/Method;

    if-eqz v5, :cond_5

    check-cast v4, Ljava/lang/reflect/Method;

    goto :goto_5

    :cond_5
    move-object v4, v2

    :goto_5
    const-wide v5, -0x217ccfffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LbG;

    if-eqz v0, :cond_6

    iget-object v0, v0, LbG;->a:Ljava/lang/Object;

    goto :goto_6

    :cond_6
    move-object v0, v2

    :goto_6
    instance-of v5, v0, Ljava/lang/reflect/Method;

    if-eqz v5, :cond_7

    move-object v2, v0

    check-cast v2, Ljava/lang/reflect/Method;

    :cond_7
    filled-new-array {v1, v3, v4, v2}, [Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-static {v0}, Lsa;->b0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/reflect/Method;

    new-instance v2, LTp;

    const/16 v3, 0x13

    invoke-direct {v2, v3}, LTp;-><init>(I)V

    const-wide v3, -0x20d85fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    const-wide v3, -0x20d8cfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    new-instance v3, LiG;

    invoke-direct {v3, v1}, LiG;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v3, v2}, LiG;->b(Lfj;)V

    goto :goto_7

    :cond_8
    return-void
.end method

.method public final b()Ljava/lang/String;
    .locals 2

    const-wide v0, -0x230fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
