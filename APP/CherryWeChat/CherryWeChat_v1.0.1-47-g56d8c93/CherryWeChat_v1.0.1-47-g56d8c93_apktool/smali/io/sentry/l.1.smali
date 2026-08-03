.class public final Lio/sentry/l;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/X;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    iput v0, p0, Lio/sentry/l;->a:I

    .line 9
    new-instance v0, Lio/sentry/protocol/t;

    invoke-direct {v0}, Lio/sentry/protocol/t;-><init>()V

    new-instance v1, Lio/sentry/K2;

    invoke-direct {v1}, Lio/sentry/K2;-><init>()V

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lio/sentry/l;-><init>(Lio/sentry/protocol/t;Lio/sentry/K2;Lio/sentry/c;)V

    return-void
.end method

.method public constructor <init>(Lio/sentry/P2;Ljava/lang/Double;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lio/sentry/l;->a:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lio/sentry/l;->b:Ljava/lang/Object;

    .line 7
    iput-object p2, p0, Lio/sentry/l;->c:Ljava/lang/Object;

    .line 8
    sget-object p1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    iput-object p1, p0, Lio/sentry/l;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lio/sentry/X;Lio/sentry/X;Lio/sentry/X;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lio/sentry/l;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/sentry/l;->b:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, Lio/sentry/l;->c:Ljava/lang/Object;

    .line 4
    iput-object p3, p0, Lio/sentry/l;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lio/sentry/l;)V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, Lio/sentry/l;->a:I

    .line 14
    iget-object v0, p1, Lio/sentry/l;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/protocol/t;

    .line 15
    iget-object v1, p1, Lio/sentry/l;->c:Ljava/lang/Object;

    check-cast v1, Lio/sentry/K2;

    .line 16
    iget-object p1, p1, Lio/sentry/l;->d:Ljava/lang/Object;

    check-cast p1, Lio/sentry/c;

    .line 17
    invoke-direct {p0, v0, v1, p1}, Lio/sentry/l;-><init>(Lio/sentry/protocol/t;Lio/sentry/K2;Lio/sentry/c;)V

    return-void
.end method

.method public constructor <init>(Lio/sentry/protocol/t;Lio/sentry/K2;Lio/sentry/c;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lio/sentry/l;->a:I

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, Lio/sentry/l;->b:Ljava/lang/Object;

    .line 12
    iput-object p2, p0, Lio/sentry/l;->c:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 13
    invoke-static {p3, p1, p1, p1}, Lio/sentry/config/a;->h(Lio/sentry/c;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;)Lio/sentry/c;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/l;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public A()Lio/sentry/protocol/E;
    .locals 1

    iget-object v0, p0, Lio/sentry/l;->d:Ljava/lang/Object;

    check-cast v0, Lio/sentry/X;

    invoke-interface {v0}, Lio/sentry/X;->A()Lio/sentry/protocol/E;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lio/sentry/l;->c:Ljava/lang/Object;

    check-cast v0, Lio/sentry/X;

    invoke-interface {v0}, Lio/sentry/X;->A()Lio/sentry/protocol/E;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    iget-object v0, p0, Lio/sentry/l;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/X;

    invoke-interface {v0}, Lio/sentry/X;->A()Lio/sentry/protocol/E;

    move-result-object v0

    return-object v0
.end method

.method public B(Lio/sentry/l;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lio/sentry/l;->b(Lio/sentry/u1;)Lio/sentry/X;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/sentry/X;->B(Lio/sentry/l;)V

    return-void
.end method

.method public C()Lio/sentry/a2;
    .locals 1

    iget-object v0, p0, Lio/sentry/l;->d:Ljava/lang/Object;

    check-cast v0, Lio/sentry/X;

    invoke-interface {v0}, Lio/sentry/X;->C()Lio/sentry/a2;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lio/sentry/l;->c:Ljava/lang/Object;

    check-cast v0, Lio/sentry/X;

    invoke-interface {v0}, Lio/sentry/X;->C()Lio/sentry/a2;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    iget-object v0, p0, Lio/sentry/l;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/X;

    invoke-interface {v0}, Lio/sentry/X;->C()Lio/sentry/a2;

    move-result-object v0

    return-object v0
.end method

.method public D()Lio/sentry/protocol/t;
    .locals 3

    iget-object v0, p0, Lio/sentry/l;->d:Ljava/lang/Object;

    check-cast v0, Lio/sentry/X;

    invoke-interface {v0}, Lio/sentry/X;->D()Lio/sentry/protocol/t;

    move-result-object v0

    sget-object v1, Lio/sentry/protocol/t;->b:Lio/sentry/protocol/t;

    invoke-virtual {v1, v0}, Lio/sentry/protocol/t;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lio/sentry/l;->c:Ljava/lang/Object;

    check-cast v0, Lio/sentry/X;

    invoke-interface {v0}, Lio/sentry/X;->D()Lio/sentry/protocol/t;

    move-result-object v0

    invoke-virtual {v1, v0}, Lio/sentry/protocol/t;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    return-object v0

    :cond_1
    iget-object v0, p0, Lio/sentry/l;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/X;

    invoke-interface {v0}, Lio/sentry/X;->D()Lio/sentry/protocol/t;

    move-result-object v0

    return-object v0
.end method

.method public E()Lio/sentry/l;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lio/sentry/l;->b(Lio/sentry/u1;)Lio/sentry/X;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/X;->E()Lio/sentry/l;

    move-result-object v0

    return-object v0
.end method

.method public F(Lio/sentry/o1;)Lio/sentry/F2;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lio/sentry/l;->b(Lio/sentry/u1;)Lio/sentry/X;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/sentry/X;->F(Lio/sentry/o1;)Lio/sentry/F2;

    move-result-object p1

    return-object p1
.end method

.method public G()Ljava/util/List;
    .locals 1

    invoke-virtual {p0}, Lio/sentry/l;->m()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-static {v0}, Lio/sentry/config/a;->J(Ljava/util/concurrent/CopyOnWriteArrayList;)Ljava/util/concurrent/CopyOnWriteArrayList;

    move-result-object v0

    return-object v0
.end method

.method public H(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lio/sentry/l;->b(Lio/sentry/u1;)Lio/sentry/X;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/sentry/X;->H(Ljava/lang/String;)V

    return-void
.end method

.method public I()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/l;->d:Ljava/lang/Object;

    check-cast v0, Lio/sentry/X;

    invoke-interface {v0}, Lio/sentry/X;->I()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lio/sentry/l;->c:Ljava/lang/Object;

    check-cast v0, Lio/sentry/X;

    invoke-interface {v0}, Lio/sentry/X;->I()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    iget-object v0, p0, Lio/sentry/l;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/X;

    invoke-interface {v0}, Lio/sentry/X;->I()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public J()Lio/sentry/b0;
    .locals 2

    iget-object v0, p0, Lio/sentry/l;->d:Ljava/lang/Object;

    check-cast v0, Lio/sentry/X;

    invoke-interface {v0}, Lio/sentry/X;->J()Lio/sentry/b0;

    move-result-object v0

    instance-of v1, v0, Lio/sentry/R0;

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lio/sentry/l;->c:Ljava/lang/Object;

    check-cast v0, Lio/sentry/X;

    invoke-interface {v0}, Lio/sentry/X;->J()Lio/sentry/b0;

    move-result-object v0

    instance-of v1, v0, Lio/sentry/R0;

    if-nez v1, :cond_1

    return-object v0

    :cond_1
    iget-object v0, p0, Lio/sentry/l;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/X;

    invoke-interface {v0}, Lio/sentry/X;->J()Lio/sentry/b0;

    move-result-object v0

    return-object v0
.end method

.method public K()Ljava/util/Map;
    .locals 2

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iget-object v1, p0, Lio/sentry/l;->b:Ljava/lang/Object;

    check-cast v1, Lio/sentry/X;

    invoke-interface {v1}, Lio/sentry/X;->K()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->putAll(Ljava/util/Map;)V

    iget-object v1, p0, Lio/sentry/l;->c:Ljava/lang/Object;

    check-cast v1, Lio/sentry/X;

    invoke-interface {v1}, Lio/sentry/X;->K()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->putAll(Ljava/util/Map;)V

    iget-object v1, p0, Lio/sentry/l;->d:Ljava/lang/Object;

    check-cast v1, Lio/sentry/X;

    invoke-interface {v1}, Lio/sentry/X;->K()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->putAll(Ljava/util/Map;)V

    return-object v0
.end method

.method public a()Lio/sentry/protocol/n;
    .locals 1

    iget-object v0, p0, Lio/sentry/l;->d:Ljava/lang/Object;

    check-cast v0, Lio/sentry/X;

    invoke-interface {v0}, Lio/sentry/X;->a()Lio/sentry/protocol/n;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lio/sentry/l;->c:Ljava/lang/Object;

    check-cast v0, Lio/sentry/X;

    invoke-interface {v0}, Lio/sentry/X;->a()Lio/sentry/protocol/n;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    iget-object v0, p0, Lio/sentry/l;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/X;

    invoke-interface {v0}, Lio/sentry/X;->a()Lio/sentry/protocol/n;

    move-result-object v0

    return-object v0
.end method

.method public b(Lio/sentry/u1;)Lio/sentry/X;
    .locals 7

    iget-object v0, p0, Lio/sentry/l;->c:Ljava/lang/Object;

    check-cast v0, Lio/sentry/X;

    iget-object v1, p0, Lio/sentry/l;->d:Ljava/lang/Object;

    check-cast v1, Lio/sentry/X;

    iget-object v2, p0, Lio/sentry/l;->b:Ljava/lang/Object;

    check-cast v2, Lio/sentry/X;

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz p1, :cond_4

    sget-object v6, Lio/sentry/k;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v6, p1

    if-eq p1, v5, :cond_3

    if-eq p1, v4, :cond_2

    if-eq p1, v3, :cond_1

    const/4 v6, 0x4

    if-eq p1, v6, :cond_0

    goto :goto_0

    :cond_0
    return-object p0

    :cond_1
    return-object v2

    :cond_2
    return-object v0

    :cond_3
    return-object v1

    :cond_4
    :goto_0
    sget-object p1, Lio/sentry/k;->a:[I

    invoke-interface {v2}, Lio/sentry/X;->l()Lio/sentry/v2;

    move-result-object v6

    invoke-virtual {v6}, Lio/sentry/v2;->getDefaultScopeType()Lio/sentry/u1;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget p1, p1, v6

    if-eq p1, v5, :cond_7

    if-eq p1, v4, :cond_6

    if-eq p1, v3, :cond_5

    return-object v1

    :cond_5
    return-object v2

    :cond_6
    return-object v0

    :cond_7
    return-object v1
.end method

.method public clear()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lio/sentry/l;->b(Lio/sentry/u1;)Lio/sentry/X;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/X;->clear()V

    return-void
.end method

.method public clone()Lio/sentry/X;
    .locals 4

    .line 2
    new-instance v0, Lio/sentry/l;

    iget-object v1, p0, Lio/sentry/l;->b:Ljava/lang/Object;

    check-cast v1, Lio/sentry/X;

    iget-object v2, p0, Lio/sentry/l;->c:Ljava/lang/Object;

    check-cast v2, Lio/sentry/X;

    invoke-interface {v2}, Lio/sentry/X;->clone()Lio/sentry/X;

    move-result-object v2

    iget-object v3, p0, Lio/sentry/l;->d:Ljava/lang/Object;

    check-cast v3, Lio/sentry/X;

    invoke-interface {v3}, Lio/sentry/X;->clone()Lio/sentry/X;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lio/sentry/l;-><init>(Lio/sentry/X;Lio/sentry/X;Lio/sentry/X;)V

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lio/sentry/l;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 1
    :pswitch_0
    invoke-virtual {p0}, Lio/sentry/l;->clone()Lio/sentry/X;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public d()Lio/sentry/i0;
    .locals 1

    iget-object v0, p0, Lio/sentry/l;->d:Ljava/lang/Object;

    check-cast v0, Lio/sentry/X;

    invoke-interface {v0}, Lio/sentry/X;->d()Lio/sentry/i0;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lio/sentry/l;->c:Ljava/lang/Object;

    check-cast v0, Lio/sentry/X;

    invoke-interface {v0}, Lio/sentry/X;->d()Lio/sentry/i0;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    iget-object v0, p0, Lio/sentry/l;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/X;

    invoke-interface {v0}, Lio/sentry/X;->d()Lio/sentry/i0;

    move-result-object v0

    return-object v0
.end method

.method public f(Lio/sentry/f;Lio/sentry/H;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lio/sentry/l;->b(Lio/sentry/u1;)Lio/sentry/X;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lio/sentry/X;->f(Lio/sentry/f;Lio/sentry/H;)V

    return-void
.end method

.method public getExtras()Ljava/util/Map;
    .locals 2

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iget-object v1, p0, Lio/sentry/l;->b:Ljava/lang/Object;

    check-cast v1, Lio/sentry/X;

    invoke-interface {v1}, Lio/sentry/X;->getExtras()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->putAll(Ljava/util/Map;)V

    iget-object v1, p0, Lio/sentry/l;->c:Ljava/lang/Object;

    check-cast v1, Lio/sentry/X;

    invoke-interface {v1}, Lio/sentry/X;->getExtras()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->putAll(Ljava/util/Map;)V

    iget-object v1, p0, Lio/sentry/l;->d:Ljava/lang/Object;

    check-cast v1, Lio/sentry/X;

    invoke-interface {v1}, Lio/sentry/X;->getExtras()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->putAll(Ljava/util/Map;)V

    return-object v0
.end method

.method public i()Lio/sentry/F2;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lio/sentry/l;->b(Lio/sentry/u1;)Lio/sentry/X;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/X;->i()Lio/sentry/F2;

    move-result-object v0

    return-object v0
.end method

.method public j()Lio/sentry/internal/debugmeta/c;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lio/sentry/l;->b(Lio/sentry/u1;)Lio/sentry/X;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/X;->j()Lio/sentry/internal/debugmeta/c;

    move-result-object v0

    return-object v0
.end method

.method public k(Lio/sentry/protocol/t;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lio/sentry/l;->b(Lio/sentry/u1;)Lio/sentry/X;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/sentry/X;->k(Lio/sentry/protocol/t;)V

    return-void
.end method

.method public l()Lio/sentry/v2;
    .locals 1

    iget-object v0, p0, Lio/sentry/l;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/X;

    invoke-interface {v0}, Lio/sentry/X;->l()Lio/sentry/v2;

    move-result-object v0

    return-object v0
.end method

.method public m()Ljava/util/List;
    .locals 2

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iget-object v1, p0, Lio/sentry/l;->b:Ljava/lang/Object;

    check-cast v1, Lio/sentry/X;

    invoke-interface {v1}, Lio/sentry/X;->m()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v1, p0, Lio/sentry/l;->c:Ljava/lang/Object;

    check-cast v1, Lio/sentry/X;

    invoke-interface {v1}, Lio/sentry/X;->m()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v1, p0, Lio/sentry/l;->d:Ljava/lang/Object;

    check-cast v1, Lio/sentry/X;

    invoke-interface {v1}, Lio/sentry/X;->m()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    return-object v0
.end method

.method public n()Ljava/util/List;
    .locals 2

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iget-object v1, p0, Lio/sentry/l;->b:Ljava/lang/Object;

    check-cast v1, Lio/sentry/X;

    invoke-interface {v1}, Lio/sentry/X;->n()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v1, p0, Lio/sentry/l;->c:Ljava/lang/Object;

    check-cast v1, Lio/sentry/X;

    invoke-interface {v1}, Lio/sentry/X;->n()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v1, p0, Lio/sentry/l;->d:Ljava/lang/Object;

    check-cast v1, Lio/sentry/X;

    invoke-interface {v1}, Lio/sentry/X;->n()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->addAll(Ljava/util/Collection;)Z

    return-object v0
.end method

.method public o()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lio/sentry/l;->b(Lio/sentry/u1;)Lio/sentry/X;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/X;->o()V

    return-void
.end method

.method public p(Lio/sentry/R1;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/l;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/X;

    invoke-interface {v0, p1}, Lio/sentry/X;->p(Lio/sentry/R1;)V

    return-void
.end method

.method public q()Lio/sentry/protocol/c;
    .locals 5

    new-instance v0, Lio/sentry/j;

    iget-object v1, p0, Lio/sentry/l;->b:Ljava/lang/Object;

    check-cast v1, Lio/sentry/X;

    invoke-interface {v1}, Lio/sentry/X;->q()Lio/sentry/protocol/c;

    move-result-object v2

    iget-object v3, p0, Lio/sentry/l;->c:Ljava/lang/Object;

    check-cast v3, Lio/sentry/X;

    invoke-interface {v3}, Lio/sentry/X;->q()Lio/sentry/protocol/c;

    move-result-object v3

    iget-object v4, p0, Lio/sentry/l;->d:Ljava/lang/Object;

    check-cast v4, Lio/sentry/X;

    invoke-interface {v4}, Lio/sentry/X;->q()Lio/sentry/protocol/c;

    move-result-object v4

    invoke-interface {v1}, Lio/sentry/X;->l()Lio/sentry/v2;

    move-result-object v1

    invoke-virtual {v1}, Lio/sentry/v2;->getDefaultScopeType()Lio/sentry/u1;

    move-result-object v1

    invoke-direct {v0, v2, v3, v4, v1}, Lio/sentry/j;-><init>(Lio/sentry/protocol/c;Lio/sentry/protocol/c;Lio/sentry/protocol/c;Lio/sentry/u1;)V

    return-object v0
.end method

.method public r(Lio/sentry/n1;)Lio/sentry/l;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lio/sentry/l;->b(Lio/sentry/u1;)Lio/sentry/X;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/sentry/X;->r(Lio/sentry/n1;)Lio/sentry/l;

    move-result-object p1

    return-object p1
.end method

.method public s()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/l;->d:Ljava/lang/Object;

    check-cast v0, Lio/sentry/X;

    invoke-interface {v0}, Lio/sentry/X;->s()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lio/sentry/l;->c:Ljava/lang/Object;

    check-cast v0, Lio/sentry/X;

    invoke-interface {v0}, Lio/sentry/X;->s()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    iget-object v0, p0, Lio/sentry/l;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/X;

    invoke-interface {v0}, Lio/sentry/X;->s()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public t()Lio/sentry/g0;
    .locals 1

    iget-object v0, p0, Lio/sentry/l;->d:Ljava/lang/Object;

    check-cast v0, Lio/sentry/X;

    invoke-interface {v0}, Lio/sentry/X;->t()Lio/sentry/g0;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lio/sentry/l;->c:Ljava/lang/Object;

    check-cast v0, Lio/sentry/X;

    invoke-interface {v0}, Lio/sentry/X;->t()Lio/sentry/g0;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    iget-object v0, p0, Lio/sentry/l;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/X;

    invoke-interface {v0}, Lio/sentry/X;->t()Lio/sentry/g0;

    move-result-object v0

    return-object v0
.end method

.method public u(Lio/sentry/p1;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lio/sentry/l;->b(Lio/sentry/u1;)Lio/sentry/X;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/sentry/X;->u(Lio/sentry/p1;)V

    return-void
.end method

.method public v(Lio/sentry/protocol/t;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/l;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/X;

    invoke-interface {v0, p1}, Lio/sentry/X;->v(Lio/sentry/protocol/t;)V

    iget-object v0, p0, Lio/sentry/l;->c:Ljava/lang/Object;

    check-cast v0, Lio/sentry/X;

    invoke-interface {v0, p1}, Lio/sentry/X;->v(Lio/sentry/protocol/t;)V

    iget-object v0, p0, Lio/sentry/l;->d:Ljava/lang/Object;

    check-cast v0, Lio/sentry/X;

    invoke-interface {v0, p1}, Lio/sentry/X;->v(Lio/sentry/protocol/t;)V

    return-void
.end method

.method public w(Lio/sentry/i0;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lio/sentry/l;->b(Lio/sentry/u1;)Lio/sentry/X;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/sentry/X;->w(Lio/sentry/i0;)V

    return-void
.end method

.method public x()Ljava/util/List;
    .locals 2

    iget-object v0, p0, Lio/sentry/l;->d:Ljava/lang/Object;

    check-cast v0, Lio/sentry/X;

    invoke-interface {v0}, Lio/sentry/X;->x()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lio/sentry/l;->c:Ljava/lang/Object;

    check-cast v0, Lio/sentry/X;

    invoke-interface {v0}, Lio/sentry/X;->x()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    return-object v0

    :cond_1
    iget-object v0, p0, Lio/sentry/l;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/X;

    invoke-interface {v0}, Lio/sentry/X;->x()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public y()Lio/sentry/F2;
    .locals 1

    iget-object v0, p0, Lio/sentry/l;->d:Ljava/lang/Object;

    check-cast v0, Lio/sentry/X;

    invoke-interface {v0}, Lio/sentry/X;->y()Lio/sentry/F2;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lio/sentry/l;->c:Ljava/lang/Object;

    check-cast v0, Lio/sentry/X;

    invoke-interface {v0}, Lio/sentry/X;->y()Lio/sentry/F2;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    iget-object v0, p0, Lio/sentry/l;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/X;

    invoke-interface {v0}, Lio/sentry/X;->y()Lio/sentry/F2;

    move-result-object v0

    return-object v0
.end method

.method public z()Ljava/util/Queue;
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lio/sentry/l;->b:Ljava/lang/Object;

    check-cast v1, Lio/sentry/X;

    invoke-interface {v1}, Lio/sentry/X;->z()Ljava/util/Queue;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v1, p0, Lio/sentry/l;->c:Ljava/lang/Object;

    check-cast v1, Lio/sentry/X;

    invoke-interface {v1}, Lio/sentry/X;->z()Ljava/util/Queue;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v1, p0, Lio/sentry/l;->d:Ljava/lang/Object;

    check-cast v1, Lio/sentry/X;

    invoke-interface {v1}, Lio/sentry/X;->z()Ljava/util/Queue;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    invoke-interface {v1}, Lio/sentry/X;->l()Lio/sentry/v2;

    move-result-object v1

    invoke-virtual {v1}, Lio/sentry/v2;->getMaxBreadcrumbs()I

    move-result v1

    invoke-static {v1}, Lio/sentry/q1;->b(I)Ljava/util/Queue;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    return-object v1
.end method
