.class public final synthetic LZF;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, LZF;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, LZF;->a:I

    check-cast p1, Lorg/luckypray/dexkit/DexKitBridge;

    check-cast p2, Ljava/lang/ClassLoader;

    packed-switch v0, :pswitch_data_0

    const-wide v0, -0x21b54fffff835L

    const-wide v2, -0x21b5bfffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->h(JJ)Lkh;

    move-result-object v0

    new-instance v1, LTr;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, LTr;->N(I)V

    const-wide v2, -0x21b62fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LTr;->Q([Ljava/lang/String;)V

    iput-object v1, v0, Lkh;->m:LTB;

    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->l(Lkh;)LSr;

    move-result-object p1

    invoke-virtual {p1}, Lw5;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LRr;

    invoke-virtual {p1}, LRr;->g()LDd;

    move-result-object p1

    invoke-virtual {p1, p2}, LDd;->a(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    move-result-object p1

    return-object p1

    :pswitch_0
    const-wide v0, -0x21cbefffff835L

    const-wide v2, -0x21b45fffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->h(JJ)Lkh;

    move-result-object v0

    new-instance v1, LTr;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, LTr;->N(I)V

    const-wide v2, -0x21b4cfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lta;->d0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    new-instance v5, Lqz;

    const/4 v6, 0x5

    invoke-direct {v5, v4, v6}, Lqz;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, v1, LTr;->p:Ljava/util/ArrayList;

    iput-object v1, v0, Lkh;->m:LTB;

    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->l(Lkh;)LSr;

    move-result-object p1

    invoke-virtual {p1}, Lw5;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LRr;

    invoke-virtual {p1}, LRr;->g()LDd;

    move-result-object p1

    invoke-virtual {p1, p2}, LDd;->a(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    move-result-object p1

    return-object p1

    :pswitch_1
    const-wide v0, -0x21c84fffff835L

    const-wide v2, -0x21c8bfffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->h(JJ)Lkh;

    move-result-object v0

    new-instance v1, LTr;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-wide v2, -0x21c92fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x21c9efffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    const-wide v4, -0x21caefffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    filled-new-array {v2, v3, v4}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LTr;->Q([Ljava/lang/String;)V

    iput-object v1, v0, Lkh;->m:LTB;

    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->l(Lkh;)LSr;

    move-result-object p1

    invoke-virtual {p1}, Lw5;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LRr;

    invoke-virtual {p1}, LRr;->g()LDd;

    move-result-object p1

    invoke-virtual {p1, p2}, LDd;->a(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    move-result-object p1

    return-object p1

    :pswitch_2
    const-wide v0, -0x21b1afffff835L

    const-wide v2, -0x21b21fffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->h(JJ)Lkh;

    move-result-object v0

    new-instance v1, LTr;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-wide v2, -0x21b28fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x21bc3fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LTr;->Q([Ljava/lang/String;)V

    iput-object v1, v0, Lkh;->m:LTB;

    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->l(Lkh;)LSr;

    move-result-object p1

    invoke-virtual {p1}, Lw5;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LRr;

    invoke-virtual {p1}, LRr;->g()LDd;

    move-result-object p1

    invoke-virtual {p1, p2}, LDd;->a(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    move-result-object p1

    return-object p1

    :pswitch_3
    const-wide v0, -0x21cc3fffff835L

    const-wide v2, -0x21ccafffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->h(JJ)Lkh;

    move-result-object v0

    new-instance v1, LTr;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-wide v2, -0x21cd1fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x21ce7fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LTr;->Q([Ljava/lang/String;)V

    const/4 v2, 0x5

    invoke-virtual {v1, v2}, LTr;->N(I)V

    iput-object v1, v0, Lkh;->m:LTB;

    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->l(Lkh;)LSr;

    move-result-object p1

    invoke-virtual {p1}, Lw5;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LRr;

    invoke-virtual {p1}, LRr;->g()LDd;

    move-result-object p1

    invoke-virtual {p1, p2}, LDd;->a(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    move-result-object p1

    return-object p1

    :pswitch_4
    const-wide v0, -0x21c78fffff835L

    const-wide v2, -0x21c7ffffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->h(JJ)Lkh;

    move-result-object v0

    new-instance v1, LTr;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-wide v2, -0x21c06fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x21c1afffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LTr;->Q([Ljava/lang/String;)V

    const/4 v2, 0x5

    invoke-virtual {v1, v2}, LTr;->N(I)V

    iput-object v1, v0, Lkh;->m:LTB;

    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->l(Lkh;)LSr;

    move-result-object p1

    invoke-virtual {p1}, Lw5;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LRr;

    invoke-virtual {p1}, LRr;->g()LDd;

    move-result-object p1

    invoke-virtual {p1, p2}, LDd;->a(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    move-result-object p1

    return-object p1

    :pswitch_5
    const-wide p1, -0x200f0fffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    const-wide p1, -0x200f7fffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    invoke-static {}, LcG;->g()Ljava/lang/reflect/Method;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object p1

    array-length p2, p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-ne p2, v1, :cond_2

    :cond_1
    move v1, v0

    goto :goto_1

    :cond_2
    array-length p2, p1

    const/4 v2, 0x2

    if-ne p2, v2, :cond_1

    aget-object p1, p1, v0

    const-class p2, Ljava/lang/String;

    invoke-static {p1, p2}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    :goto_1
    invoke-static {}, LcG;->g()Ljava/lang/reflect/Method;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object p1

    aget-object p1, p1, v1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Class;->getFields()[Ljava/lang/reflect/Field;

    move-result-object p1

    const-wide v3, -0x200fefffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    array-length v3, p1

    const/16 v4, 0x64

    :goto_2
    if-ge v0, v3, :cond_5

    aget-object v5, p1, v0

    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v6

    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v6, v7}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-virtual {v5, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    const/4 v7, -0x1

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x400

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v5, v1, v6}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v5, v1, v6}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v4, v4, 0x64

    :cond_4
    :goto_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_5
    new-instance p1, LiG;

    invoke-direct {p1, v1}, LiG;-><init>(Ljava/lang/Object;)V

    const-class v0, Landroid/content/ContentValues;

    invoke-virtual {p1, v0}, LiG;->i(Ljava/lang/Class;)V

    iget-object v0, p1, LiG;->a:Ljava/lang/Object;

    if-eqz v0, :cond_6

    invoke-virtual {p1}, LiG;->e()Ljava/lang/reflect/Method;

    move-result-object p1

    if-eqz p1, :cond_6

    :try_start_0
    invoke-virtual {p1, v0, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_5

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_4

    :catch_1
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_6
    :goto_4
    move-object p1, p2

    :goto_5
    check-cast p1, Landroid/content/ContentValues;

    if-eqz p1, :cond_7

    const-wide v0, -0x2008dfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p2

    :cond_7
    invoke-virtual {v2, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1

    :pswitch_6
    const-wide v0, -0x21dadfffff835L

    const-wide v2, -0x21db4fffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->h(JJ)Lkh;

    move-result-object v0

    new-instance v1, LTr;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-wide v2, -0x21dbbfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x21c4efffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LTr;->Q([Ljava/lang/String;)V

    iput-object v1, v0, Lkh;->m:LTB;

    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->l(Lkh;)LSr;

    move-result-object p1

    invoke-virtual {p1}, Lw5;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LRr;

    invoke-virtual {p1}, LRr;->g()LDd;

    move-result-object p1

    invoke-virtual {p1, p2}, LDd;->a(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    move-result-object p1

    return-object p1

    :pswitch_7
    const-wide v0, -0x20023fffff835L

    const-wide v2, -0x2002afffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->h(JJ)Lkh;

    move-result-object v0

    new-instance v1, LTr;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-wide v2, -0x20031fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x200c5fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LTr;->Q([Ljava/lang/String;)V

    iput-object v1, v0, Lkh;->m:LTB;

    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->l(Lkh;)LSr;

    move-result-object p1

    invoke-virtual {p1}, Lw5;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LRr;

    invoke-virtual {p1}, LRr;->g()LDd;

    move-result-object p1

    invoke-virtual {p1, p2}, LDd;->a(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    move-result-object p1

    return-object p1

    :pswitch_8
    const-wide v0, -0x20044fffff835L

    const-wide v2, -0x2004bfffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->h(JJ)Lkh;

    move-result-object v0

    new-instance v1, LTr;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-wide v2, -0x20052fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x20074fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LTr;->Q([Ljava/lang/String;)V

    iput-object v1, v0, Lkh;->m:LTB;

    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->l(Lkh;)LSr;

    move-result-object p1

    invoke-virtual {p1}, Lw5;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LRr;

    invoke-virtual {p1}, LRr;->g()LDd;

    move-result-object p1

    invoke-virtual {p1, p2}, LDd;->a(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    move-result-object p1

    return-object p1

    :pswitch_9
    const-wide v0, -0x20186fffff835L

    const-wide v2, -0x2018dfffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->h(JJ)Lkh;

    move-result-object v0

    new-instance v1, LTr;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-wide v2, -0x20194fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x201abfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LTr;->Q([Ljava/lang/String;)V

    iput-object v1, v0, Lkh;->m:LTB;

    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->l(Lkh;)LSr;

    move-result-object p1

    invoke-virtual {p1}, Lw5;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LRr;

    invoke-virtual {p1}, LRr;->g()LDd;

    move-result-object p1

    invoke-virtual {p1, p2}, LDd;->a(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    move-result-object p1

    return-object p1

    :pswitch_a
    const-wide v0, -0x20138fffff835L

    const-wide v2, -0x2013ffffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->h(JJ)Lkh;

    move-result-object v0

    new-instance v1, LTr;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-wide v2, -0x201c6fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x201f6fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LTr;->Q([Ljava/lang/String;)V

    iput-object v1, v0, Lkh;->m:LTB;

    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->l(Lkh;)LSr;

    move-result-object p1

    invoke-virtual {p1}, Lw5;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LRr;

    invoke-virtual {p1}, LRr;->g()LDd;

    move-result-object p1

    invoke-virtual {p1, p2}, LDd;->a(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    move-result-object p1

    return-object p1

    :pswitch_b
    const-wide v0, -0x20107fffff835L

    const-wide v2, -0x2010efffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->h(JJ)Lkh;

    move-result-object v0

    new-instance v1, LTr;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-wide v2, -0x20115fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LTr;->Q([Ljava/lang/String;)V

    iput-object v1, v0, Lkh;->m:LTB;

    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->l(Lkh;)LSr;

    move-result-object p1

    invoke-virtual {p1}, Lw5;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LRr;

    invoke-virtual {p1}, LRr;->g()LDd;

    move-result-object p1

    invoke-virtual {p1, p2}, LDd;->a(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    move-result-object p1

    return-object p1

    :pswitch_c
    const-wide v0, -0x202b9fffff835L

    const-wide v2, -0x20140fffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->h(JJ)Lkh;

    move-result-object v0

    new-instance v1, LTr;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-wide v2, -0x20147fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x20165fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LTr;->Q([Ljava/lang/String;)V

    iput-object v1, v0, Lkh;->m:LTB;

    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->l(Lkh;)LSr;

    move-result-object p1

    invoke-virtual {p1}, Lw5;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LRr;

    invoke-virtual {p1}, LRr;->g()LDd;

    move-result-object p1

    invoke-virtual {p1, p2}, LDd;->a(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    move-result-object p1

    return-object p1

    :pswitch_d
    const-wide v0, -0x21b72fffff835L

    const-wide v2, -0x21b79fffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->h(JJ)Lkh;

    move-result-object v0

    new-instance v1, LTr;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, LTr;->N(I)V

    const-wide v2, -0x21b00fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LTr;->Q([Ljava/lang/String;)V

    iput-object v1, v0, Lkh;->m:LTB;

    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->l(Lkh;)LSr;

    move-result-object p1

    invoke-virtual {p1}, Lw5;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LRr;

    invoke-virtual {p1}, LRr;->g()LDd;

    move-result-object p1

    invoke-virtual {p1, p2}, LDd;->a(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    move-result-object p1

    return-object p1

    :pswitch_e
    const-wide v0, -0x202d9fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x202e0fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    new-instance v0, Lkh;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lkh;-><init>(I)V

    new-instance v1, LE9;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-wide v2, -0x202e7fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x2029cfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LE9;->O([Ljava/lang/String;)V

    iput-object v1, v0, Lkh;->m:LTB;

    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->i(Lkh;)LD9;

    move-result-object p1

    invoke-virtual {p1}, Lw5;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LC9;

    invoke-virtual {p1}, LC9;->g()LCd;

    move-result-object p1

    invoke-virtual {p1, p2}, LCd;->a(Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object p1

    return-object p1

    :pswitch_f
    const-wide v0, -0x2021ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x20226fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    new-instance v0, Lkh;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lkh;-><init>(I)V

    new-instance v1, LE9;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-wide v2, -0x2022dfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x202c8fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LE9;->O([Ljava/lang/String;)V

    iput-object v1, v0, Lkh;->m:LTB;

    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->i(Lkh;)LD9;

    move-result-object p1

    invoke-virtual {p1}, Lw5;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LC9;

    invoke-virtual {p1}, LC9;->g()LCd;

    move-result-object p1

    invoke-virtual {p1, p2}, LCd;->a(Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object p1

    return-object p1

    :pswitch_10
    const-wide v0, -0x20255fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x2025cfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    new-instance v0, Lkh;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lkh;-><init>(I)V

    new-instance v1, LE9;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-wide v2, -0x20263fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x20278fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LE9;->O([Ljava/lang/String;)V

    iput-object v1, v0, Lkh;->m:LTB;

    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->i(Lkh;)LD9;

    move-result-object p1

    invoke-virtual {p1}, Lw5;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LC9;

    invoke-virtual {p1}, LC9;->g()LCd;

    move-result-object p1

    invoke-virtual {p1, p2}, LCd;->a(Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object p1

    return-object p1

    :pswitch_11
    const-wide v0, -0x203a6fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x203adfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    new-instance v0, Lkh;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lkh;-><init>(I)V

    new-instance v1, LE9;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-wide v2, -0x203b4fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x20247fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LE9;->O([Ljava/lang/String;)V

    iput-object v1, v0, Lkh;->m:LTB;

    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->i(Lkh;)LD9;

    move-result-object p1

    invoke-virtual {p1}, Lw5;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LC9;

    invoke-virtual {p1}, LC9;->g()LCd;

    move-result-object p1

    invoke-virtual {p1, p2}, LCd;->a(Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object p1

    return-object p1

    :pswitch_12
    const-wide v0, -0x21dfbfffff835L

    const-wide v2, -0x21d82fffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->h(JJ)Lkh;

    move-result-object v0

    new-instance v1, LTr;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-wide v2, -0x21d89fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x21d9cfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LTr;->Q([Ljava/lang/String;)V

    iput-object v1, v0, Lkh;->m:LTB;

    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->l(Lkh;)LSr;

    move-result-object p1

    invoke-virtual {p1}, Lw5;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LRr;

    invoke-virtual {p1}, LRr;->g()LDd;

    move-result-object p1

    invoke-virtual {p1, p2}, LDd;->a(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    move-result-object p1

    return-object p1

    :pswitch_13
    const-wide v0, -0x203dcfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x203e3fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    new-instance v0, Lkh;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lkh;-><init>(I)V

    new-instance v1, LE9;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-wide v2, -0x203eafffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x203fcfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LE9;->O([Ljava/lang/String;)V

    iput-object v1, v0, Lkh;->m:LTB;

    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->i(Lkh;)LD9;

    move-result-object p1

    invoke-virtual {p1}, Lw5;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LC9;

    invoke-virtual {p1}, LC9;->g()LCd;

    move-result-object p1

    invoke-virtual {p1, p2}, LCd;->a(Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object p1

    return-object p1

    :pswitch_14
    const-wide v0, -0x20313fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x2031afffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    new-instance v0, Lkh;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lkh;-><init>(I)V

    new-instance v1, LE9;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-wide v2, -0x20321fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x2033ffffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LE9;->O([Ljava/lang/String;)V

    iput-object v1, v0, Lkh;->m:LTB;

    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->i(Lkh;)LD9;

    move-result-object p1

    invoke-virtual {p1}, Lw5;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LC9;

    invoke-virtual {p1}, LC9;->g()LCd;

    move-result-object p1

    invoke-virtual {p1, p2}, LCd;->a(Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object p1

    return-object p1

    :pswitch_15
    const-wide v0, -0x20348fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x2034ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    new-instance v0, Lkh;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lkh;-><init>(I)V

    new-instance v1, LE9;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-wide v2, -0x20356fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x20302fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LE9;->O([Ljava/lang/String;)V

    iput-object v1, v0, Lkh;->m:LTB;

    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->i(Lkh;)LD9;

    move-result-object p1

    invoke-virtual {p1}, Lw5;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LC9;

    invoke-virtual {p1}, LC9;->g()LCd;

    move-result-object p1

    invoke-virtual {p1, p2}, LCd;->a(Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object p1

    return-object p1

    :pswitch_16
    const-wide v0, -0x2048bfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x20492fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    new-instance v0, Lkh;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lkh;-><init>(I)V

    new-instance v1, LE9;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-wide v2, -0x20499fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x204b0fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LE9;->O([Ljava/lang/String;)V

    iput-object v1, v0, Lkh;->m:LTB;

    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->i(Lkh;)LD9;

    move-result-object p1

    invoke-virtual {p1}, Lw5;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LC9;

    invoke-virtual {p1}, LC9;->g()LCd;

    move-result-object p1

    invoke-virtual {p1, p2}, LCd;->a(Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object p1

    return-object p1

    :pswitch_17
    const-wide v0, -0x2043dfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x204c4fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    new-instance v0, Lkh;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lkh;-><init>(I)V

    new-instance v1, LE9;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-wide v2, -0x204cbfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x204fcfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LE9;->O([Ljava/lang/String;)V

    iput-object v1, v0, Lkh;->m:LTB;

    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->i(Lkh;)LD9;

    move-result-object p1

    invoke-virtual {p1}, Lw5;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LC9;

    invoke-virtual {p1}, LC9;->g()LCd;

    move-result-object p1

    invoke-virtual {p1, p2}, LCd;->a(Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object p1

    return-object p1

    :pswitch_18
    const-wide v0, -0x21eabfffff835L

    const-wide v2, -0x21eb2fffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->h(JJ)Lkh;

    move-result-object v0

    new-instance v1, LTr;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-wide v2, -0x21eb9fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x21d58fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LTr;->Q([Ljava/lang/String;)V

    iput-object v1, v0, Lkh;->m:LTB;

    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->l(Lkh;)LSr;

    move-result-object p1

    invoke-virtual {p1}, Lw5;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LRr;

    invoke-virtual {p1}, LRr;->g()LDd;

    move-result-object p1

    invoke-virtual {p1, p2}, LDd;->a(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    move-result-object p1

    return-object p1

    :pswitch_19
    const-wide v0, -0x2046afffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x20471fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    new-instance v0, Lkh;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lkh;-><init>(I)V

    new-instance v1, LE9;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-wide v2, -0x20478fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x2040ffffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LE9;->O([Ljava/lang/String;)V

    iput-object v1, v0, Lkh;->m:LTB;

    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->i(Lkh;)LD9;

    move-result-object p1

    invoke-virtual {p1}, Lw5;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LC9;

    invoke-virtual {p1}, LC9;->g()LCd;

    move-result-object p1

    invoke-virtual {p1, p2}, LCd;->a(Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object p1

    return-object p1

    :pswitch_1a
    const-wide v0, -0x205a9fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x205b0fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    new-instance v0, Lkh;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lkh;-><init>(I)V

    new-instance v1, LE9;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-wide v2, -0x205b7fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x20458fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LE9;->O([Ljava/lang/String;)V

    iget-object v2, v1, LE9;->m:Lkh;

    if-nez v2, :cond_8

    new-instance v2, Lkh;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lkh;-><init>(I)V

    :cond_8
    iput-object v2, v1, LE9;->m:Lkh;

    new-instance v3, LFl;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, LFl;-><init>(I)V

    iput-object v3, v2, Lkh;->m:LTB;

    iput-object v1, v0, Lkh;->m:LTB;

    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->i(Lkh;)LD9;

    move-result-object p1

    invoke-virtual {p1}, Lw5;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LC9;

    invoke-virtual {p1}, LC9;->g()LCd;

    move-result-object p1

    invoke-virtual {p1, p2}, LCd;->a(Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object p1

    return-object p1

    :pswitch_1b
    const-wide v0, -0x205e6fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x205edfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    new-instance v0, Lkh;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lkh;-><init>(I)V

    new-instance v1, LE9;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-wide v2, -0x205f4fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x2058afffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    const-wide v4, -0x20592fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    filled-new-array {v2, v3, v4}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LE9;->O([Ljava/lang/String;)V

    iput-object v1, v0, Lkh;->m:LTB;

    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->i(Lkh;)LD9;

    move-result-object p1

    invoke-virtual {p1}, Lw5;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LC9;

    invoke-virtual {p1}, LC9;->g()LCd;

    move-result-object p1

    invoke-virtual {p1, p2}, LCd;->a(Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object p1

    return-object p1

    :pswitch_1c
    const-wide v0, -0x20525fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x2052cfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    new-instance v0, Lkh;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lkh;-><init>(I)V

    new-instance v1, LE9;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-wide v2, -0x20533fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x205d2fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LE9;->O([Ljava/lang/String;)V

    iput-object v1, v0, Lkh;->m:LTB;

    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->i(Lkh;)LD9;

    move-result-object p1

    invoke-virtual {p1}, Lw5;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LC9;

    invoke-virtual {p1}, LC9;->g()LCd;

    move-result-object p1

    invoke-virtual {p1, p2}, LCd;->a(Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
