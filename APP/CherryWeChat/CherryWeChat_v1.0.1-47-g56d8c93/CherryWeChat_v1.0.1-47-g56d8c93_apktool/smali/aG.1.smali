.class public final synthetic LaG;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, LaG;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, LaG;->a:I

    check-cast p1, Lorg/luckypray/dexkit/DexKitBridge;

    check-cast p2, Ljava/lang/ClassLoader;

    packed-switch v0, :pswitch_data_0

    const-wide v0, -0x21aaffffff835L

    const-wide v2, -0x21ab6fffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->h(JJ)Lkh;

    move-result-object v0

    new-instance v1, LTr;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-wide v2, -0x21abdfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x21955fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    filled-new-array {v2, v4, v3}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lsa;->b0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, LTr;->O(Ljava/util/List;)V

    const-wide v2, -0x21967fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x2197dfffff835L

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

    :pswitch_0
    const-wide v0, -0x21a2dfffff835L

    const-wide v2, -0x21a34fffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->h(JJ)Lkh;

    move-result-object v0

    new-instance v1, LTr;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-wide v2, -0x21a3bfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, LTr;->O(Ljava/util/List;)V

    const-wide v2, -0x21ad3fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x21ae9fffff835L

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

    :pswitch_1
    const-wide v0, -0x21a62fffff835L

    const-wide v2, -0x21a69fffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->h(JJ)Lkh;

    move-result-object v0

    new-instance v1, LTr;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-wide v2, -0x21a70fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, LTr;->O(Ljava/util/List;)V

    const-wide v2, -0x21a08fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x21a1efffff835L

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
    const-wide v0, -0x21b99fffff835L

    const-wide v2, -0x21ba0fffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->h(JJ)Lkh;

    move-result-object v0

    new-instance v1, LTr;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-wide v2, -0x21ba7fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, LTr;->O(Ljava/util/List;)V

    const-wide v2, -0x21bbffffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x21a55fffff835L

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
    const-wide v0, -0x21bdefffff835L

    const-wide v2, -0x21be5fffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->h(JJ)Lkh;

    move-result-object v0

    new-instance v1, LTr;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const/4 v2, 0x6

    invoke-virtual {v1, v2}, LTr;->N(I)V

    const-wide v2, -0x21becfffff835L

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

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
