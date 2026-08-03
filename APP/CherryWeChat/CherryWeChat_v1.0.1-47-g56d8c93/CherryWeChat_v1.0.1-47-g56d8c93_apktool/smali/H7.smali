.class public final synthetic LH7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, LH7;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, LH7;->a:I

    const/4 v1, 0x0

    const/4 v2, 0x5

    const/4 v3, 0x0

    const/4 v4, 0x1

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lorg/luckypray/dexkit/DexKitBridge;

    check-cast p2, Ljava/lang/ClassLoader;

    const-wide v0, -0x20503fffff835L

    const-wide v2, -0x2050afffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->h(JJ)Lkh;

    move-result-object v0

    new-instance v1, LTr;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-wide v2, -0x20511fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LTr;->P([Ljava/lang/String;)V

    invoke-virtual {v1, v4}, LTr;->N(I)V

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
    check-cast p1, Lorg/luckypray/dexkit/DexKitBridge;

    check-cast p2, Ljava/lang/ClassLoader;

    const-wide v0, -0x21d1dfffff835L

    const-wide v2, -0x21d24fffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->h(JJ)Lkh;

    move-result-object v0

    new-instance v1, LTr;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-wide v2, -0x21d2bfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x21dcdfffff835L

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

    :pswitch_1
    check-cast p1, Lorg/luckypray/dexkit/DexKitBridge;

    check-cast p2, Ljava/lang/ClassLoader;

    const-wide v0, -0x20696fffff835L

    const-wide v2, -0x2069dfffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->h(JJ)Lkh;

    move-result-object v0

    new-instance v1, LTr;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-wide v2, -0x206a4fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x2054ffffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LTr;->P([Ljava/lang/String;)V

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
    check-cast p1, Lorg/luckypray/dexkit/DexKitBridge;

    check-cast p2, Ljava/lang/ClassLoader;

    const-wide v0, -0x206ccfffff835L

    const-wide v2, -0x206d3fffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->h(JJ)Lkh;

    move-result-object v0

    new-instance v1, LTr;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-wide v2, -0x206dafffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x206fbfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LTr;->P([Ljava/lang/String;)V

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
    check-cast p1, Lorg/luckypray/dexkit/DexKitBridge;

    check-cast p2, Ljava/lang/ClassLoader;

    const-wide v0, -0x20667fffff835L

    const-wide v2, -0x2066efffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->h(JJ)Lkh;

    move-result-object v0

    new-instance v1, LTr;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-wide v2, -0x20675fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LTr;->P([Ljava/lang/String;)V

    const-wide v2, -0x20612fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, LTr;->O(Ljava/util/List;)V

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
    check-cast p1, Lorg/luckypray/dexkit/DexKitBridge;

    check-cast p2, Ljava/lang/ClassLoader;

    const-wide v0, -0x20791fffff835L

    const-wide v2, -0x20798fffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->h(JJ)Lkh;

    move-result-object v0

    new-instance v1, LTr;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-wide v2, -0x2079ffffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x20642fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LTr;->P([Ljava/lang/String;)V

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
    check-cast p1, Lorg/luckypray/dexkit/DexKitBridge;

    check-cast p2, Ljava/lang/ClassLoader;

    const-wide v0, -0x20735fffff835L

    const-wide v2, -0x2073cfffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->h(JJ)Lkh;

    move-result-object v0

    new-instance v1, LTr;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-wide v2, -0x207c3fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x207e6fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LTr;->P([Ljava/lang/String;)V

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

    :pswitch_6
    check-cast p1, Lorg/luckypray/dexkit/DexKitBridge;

    check-cast p2, Ljava/lang/ClassLoader;

    const-wide v5, -0x20757fffff835L

    const-wide v7, -0x2075efffff835L

    invoke-static {v5, v6, v7, v8}, Lph;->h(JJ)Lkh;

    move-result-object v0

    new-instance v2, LTr;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    const-wide v5, -0x20765fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const-wide v6, -0x20777fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, LTr;->P([Ljava/lang/String;)V

    iput-object v2, v0, Lkh;->m:LTB;

    invoke-virtual {p1, v0}, Lorg/luckypray/dexkit/DexKitBridge;->l(Lkh;)LSr;

    move-result-object p1

    invoke-virtual {p1}, Lw5;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LRr;

    invoke-virtual {p1}, LRr;->g()LDd;

    move-result-object p1

    invoke-virtual {p1, p2}, LDd;->a(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object p2

    const-wide v5, -0x20725fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    array-length v0, p2

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v5, p2, v2

    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterCount()I

    move-result v6

    const/4 v7, 0x2

    if-ne v6, v7, :cond_0

    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v6

    aget-object v6, v6, v1

    const-class v7, Ljava/lang/String;

    invoke-static {v6, v7}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v6

    aget-object v6, v6, v4

    invoke-static {v6, v7}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v6

    sget-object v7, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    invoke-static {v6, v7}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_0

    move-object v3, v5

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-object v3

    :pswitch_7
    check-cast p1, Lorg/luckypray/dexkit/DexKitBridge;

    check-cast p2, Ljava/lang/ClassLoader;

    const-wide v0, -0x21889fffff835L

    const-wide v2, -0x21890fffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->h(JJ)Lkh;

    move-result-object v0

    new-instance v1, LTr;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-wide v2, -0x21897fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x218b4fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LTr;->P([Ljava/lang/String;)V

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
    check-cast p1, Lorg/luckypray/dexkit/DexKitBridge;

    check-cast p2, Ljava/lang/ClassLoader;

    const-wide v0, -0x21828fffff835L

    const-wide v3, -0x2182ffffff835L

    invoke-static {v0, v1, v3, v4}, Lph;->h(JJ)Lkh;

    move-result-object v0

    new-instance v1, LTr;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-wide v3, -0x21836fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, LTr;->P([Ljava/lang/String;)V

    const-wide v3, -0x218cdfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, LTr;->P([Ljava/lang/String;)V

    const-wide v3, -0x218e3fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, LTr;->P([Ljava/lang/String;)V

    const-wide v3, -0x218f4fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, LTr;->P([Ljava/lang/String;)V

    new-instance v3, LE9;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    const-class v4, Ljava/util/Map;

    invoke-static {v4}, LFd;->a(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lqz;

    invoke-direct {v5, v4, v2}, Lqz;-><init>(Ljava/lang/String;I)V

    iput-object v5, v3, LE9;->l:Lqz;

    iput-object v3, v1, LTr;->n:LE9;

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
    check-cast p1, Lorg/luckypray/dexkit/DexKitBridge;

    check-cast p2, Ljava/lang/ClassLoader;

    const-wide v3, -0x21875fffff835L

    const-wide v5, -0x2187cfffff835L

    invoke-static {v3, v4, v5, v6}, Lph;->h(JJ)Lkh;

    move-result-object v0

    new-instance v3, LTr;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    const-wide v4, -0x21803fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, LTr;->P([Ljava/lang/String;)V

    invoke-static {}, LcG;->e()Ljava/lang/reflect/Method;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    const-wide v5, -0x2180efffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    new-instance v5, LE9;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    new-instance v6, Lqz;

    invoke-direct {v6, v4, v2}, Lqz;-><init>(Ljava/lang/String;I)V

    iput-object v6, v5, LE9;->l:Lqz;

    iput-object v5, v3, LTr;->m:LE9;

    invoke-static {}, LcG;->e()Ljava/lang/reflect/Method;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v4

    aget-object v1, v4, v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const-wide v4, -0x2181bfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    new-instance v4, LE9;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    new-instance v5, Lqz;

    invoke-direct {v5, v1, v2}, Lqz;-><init>(Ljava/lang/String;I)V

    iput-object v5, v4, LE9;->l:Lqz;

    iput-object v4, v3, LTr;->n:LE9;

    iput-object v3, v0, Lkh;->m:LTB;

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
    check-cast p1, Lorg/luckypray/dexkit/DexKitBridge;

    check-cast p2, Ljava/lang/ClassLoader;

    const-wide v0, -0x21841fffff835L

    const-wide v2, -0x21848fffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->h(JJ)Lkh;

    move-result-object v0

    new-instance v1, LTr;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-wide v2, -0x2184ffffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LTr;->P([Ljava/lang/String;)V

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
    check-cast p1, Lorg/luckypray/dexkit/DexKitBridge;

    check-cast p2, Ljava/lang/ClassLoader;

    const-wide v0, -0x21d6bfffff835L

    const-wide v3, -0x21d72fffff835L

    invoke-static {v0, v1, v3, v4}, Lph;->h(JJ)Lkh;

    move-result-object v0

    new-instance v1, LTr;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-wide v3, -0x21d79fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    const-wide v4, -0x21d0afffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    const-wide v5, -0x21d0ffffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    filled-new-array {v3, v4, v5}, [Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, LTr;->Q([Ljava/lang/String;)V

    const-wide v3, -0x21d15fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lqz;

    invoke-direct {v4, v3, v2}, Lqz;-><init>(Ljava/lang/String;I)V

    iput-object v4, v1, LTr;->l:Lqz;

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
    check-cast p1, Lorg/luckypray/dexkit/DexKitBridge;

    check-cast p2, Ljava/lang/ClassLoader;

    const-wide v0, -0x21988fffff835L

    const-wide v2, -0x2198ffffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->h(JJ)Lkh;

    move-result-object v0

    new-instance v1, LTr;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-wide v2, -0x21996fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x219affffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LTr;->P([Ljava/lang/String;)V

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
    check-cast p1, Lorg/luckypray/dexkit/DexKitBridge;

    check-cast p2, Ljava/lang/ClassLoader;

    const-wide v0, -0x219ccfffff835L

    const-wide v2, -0x219d3fffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->h(JJ)Lkh;

    move-result-object v0

    new-instance v1, LTr;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-wide v2, -0x219dafffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x219f5fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LTr;->P([Ljava/lang/String;)V

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
    check-cast p1, Lorg/luckypray/dexkit/DexKitBridge;

    check-cast p2, Ljava/lang/ClassLoader;

    const-wide v0, -0x2190bfffff835L

    const-wide v2, -0x21912fffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->h(JJ)Lkh;

    move-result-object v0

    new-instance v1, LTr;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-wide v2, -0x21919fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x2192ffffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LTr;->P([Ljava/lang/String;)V

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

    :pswitch_f
    check-cast p1, LcB;

    check-cast p2, LYb;

    return-object p1

    :pswitch_10
    check-cast p1, LZA;

    check-cast p2, LYb;

    if-eqz p1, :cond_2

    move-object v3, p1

    goto :goto_2

    :cond_2
    instance-of p1, p2, LZA;

    if-eqz p1, :cond_3

    move-object v3, p2

    check-cast v3, LZA;

    :cond_3
    :goto_2
    return-object v3

    :pswitch_11
    check-cast p2, LYb;

    instance-of v0, p2, LZA;

    if-eqz v0, :cond_7

    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_4

    move-object v3, p1

    check-cast v3, Ljava/lang/Integer;

    :cond_4
    if-eqz v3, :cond_5

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_3

    :cond_5
    move p1, v4

    :goto_3
    if-nez p1, :cond_6

    move-object p1, p2

    goto :goto_4

    :cond_6
    add-int/2addr p1, v4

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    :cond_7
    :goto_4
    return-object p1

    :pswitch_12
    check-cast p1, Ljava/io/File;

    check-cast p2, Ljava/io/IOException;

    throw p2

    :pswitch_13
    check-cast p1, Lac;

    check-cast p2, LYb;

    invoke-interface {p1, p2}, Lac;->l(Lac;)Lac;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Lac;

    check-cast p2, LYb;

    invoke-interface {p1, p2}, Lac;->l(Lac;)Lac;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    check-cast p2, LYb;

    return-object p1

    :pswitch_16
    check-cast p1, Lac;

    check-cast p2, LYb;

    invoke-interface {p2}, LYb;->getKey()LZb;

    move-result-object v0

    invoke-interface {p1, v0}, Lac;->s(LZb;)Lac;

    move-result-object p1

    sget-object v0, LIf;->a:LIf;

    if-ne p1, v0, :cond_8

    goto :goto_6

    :cond_8
    sget-object v1, Lgf;->b:Lgf;

    invoke-interface {p1, v1}, Lac;->m(LZb;)LYb;

    move-result-object v2

    check-cast v2, Lbc;

    if-nez v2, :cond_9

    new-instance v0, LAa;

    invoke-direct {v0, p1, p2}, LAa;-><init>(Lac;LYb;)V

    :goto_5
    move-object p2, v0

    goto :goto_6

    :cond_9
    invoke-interface {p1, v1}, Lac;->s(LZb;)Lac;

    move-result-object p1

    if-ne p1, v0, :cond_a

    new-instance p1, LAa;

    invoke-direct {p1, p2, v2}, LAa;-><init>(Lac;LYb;)V

    move-object p2, p1

    goto :goto_6

    :cond_a
    new-instance v0, LAa;

    new-instance v1, LAa;

    invoke-direct {v1, p1, p2}, LAa;-><init>(Lac;LYb;)V

    invoke-direct {v0, v1, v2}, LAa;-><init>(Lac;LYb;)V

    goto :goto_5

    :goto_6
    return-object p2

    :pswitch_17
    check-cast p1, Ljava/lang/String;

    check-cast p2, LYb;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_b

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_7

    :cond_b
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_7
    return-object p1

    :pswitch_18
    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    invoke-static {p1, p2}, Lio/github/cherrywechat/lua/api/CherryAPI;->H(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    invoke-static {p1, p2}, Lio/github/cherrywechat/lua/api/CherryAPI;->x(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    invoke-static {p1, p2}, Lio/github/cherrywechat/lua/api/CherryAPI;->c0(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    invoke-static {p1, p2}, Lio/github/cherrywechat/lua/api/CherryAPI;->l(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p1, Landroid/widget/ImageView;

    check-cast p2, Ljava/lang/String;

    const-wide v0, -0xa603fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0xa60dfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_a

    :sswitch_0
    const-wide v1, -0xa684fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    goto/16 :goto_a

    :sswitch_1
    const-wide v1, -0xa615fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    goto/16 :goto_a

    :sswitch_2
    const-wide v1, -0xa6a1fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    goto :goto_8

    :sswitch_3
    const-wide v1, -0xa6c8fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    goto :goto_a

    :cond_c
    :goto_8
    invoke-static {}, LNj;->x()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_d
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    sget-object v2, LXA;->a:Ljava/util/HashMap;

    invoke-static {}, LNj;->x()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_d

    const-wide v2, -0xa547fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    const-wide v5, -0x20dfbfffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v3

    invoke-static {p1, v2, v3}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v2, Landroid/widget/ImageView$ScaleType;->CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_9

    :cond_e
    :goto_a
    sget-object p1, LTC;->a:LTC;

    return-object p1

    nop

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

    :sswitch_data_0
    .sparse-switch
        -0x5bc1d702 -> :sswitch_3
        0x318ff340 -> :sswitch_2
        0x544d5b6d -> :sswitch_1
        0x606a0576 -> :sswitch_0
    .end sparse-switch
.end method
