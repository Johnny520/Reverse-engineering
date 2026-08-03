.class public abstract Lf1/n0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lke/e;


# instance fields
.field public g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    packed-switch p1, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance p1, Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lf1/n0;->g:Ljava/lang/Object;

    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    new-instance p1, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lf1/n0;->g:Ljava/lang/Object;

    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    new-instance p1, Ljava/util/ArrayDeque;

    .line 30
    .line 31
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lf1/n0;->g:Ljava/lang/Object;

    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;II)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Lf1/n0;->g:Ljava/lang/Object;

    return-void
.end method

.method public static k(II)J
    .locals 2

    .line 1
    int-to-long v0, p0

    .line 2
    const/16 p0, 0x20

    .line 3
    .line 4
    shl-long/2addr v0, p0

    .line 5
    int-to-long p0, p1

    .line 6
    or-long/2addr p0, v0

    .line 7
    return-wide p0
.end method


# virtual methods
.method public a(Lud/r;Lud/n;)Z
    .locals 0

    .line 1
    iget-object p1, p0, Lf1/n0;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Ljava/util/ArrayDeque;

    .line 4
    .line 5
    invoke-virtual {p1, p2}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    return p1
.end method

.method public b(Lud/r;Lud/n;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lf1/n0;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Ljava/util/ArrayDeque;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public c(ILl0/c;Ljava/lang/Object;)Z
    .locals 7

    .line 1
    iget-object v0, p2, Ll0/c;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const/4 p3, 0x0

    .line 7
    invoke-virtual {p0, p1, p2, p3}, Lf1/n0;->e(ILl0/c;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x0

    .line 16
    move v4, v3

    .line 17
    :goto_0
    if-ge v4, v2, :cond_4

    .line 18
    .line 19
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    instance-of v6, v5, Ll0/b;

    .line 24
    .line 25
    if-eqz v6, :cond_1

    .line 26
    .line 27
    invoke-virtual {v5, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    if-eqz v6, :cond_2

    .line 32
    .line 33
    invoke-virtual {p0, v3, p2, v5}, Lf1/n0;->e(ILl0/c;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    return v1

    .line 37
    :cond_1
    instance-of v6, v5, Ll0/c;

    .line 38
    .line 39
    if-eqz v6, :cond_3

    .line 40
    .line 41
    move-object v6, v5

    .line 42
    check-cast v6, Ll0/c;

    .line 43
    .line 44
    invoke-virtual {p0, p1, v6, p3}, Lf1/n0;->c(ILl0/c;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    if-eqz v6, :cond_2

    .line 49
    .line 50
    invoke-virtual {p0, v3, p2, v5}, Lf1/n0;->e(ILl0/c;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    return v1

    .line 54
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_3
    const-string p1, "Unexpected child source info "

    .line 58
    .line 59
    invoke-static {v5, p1}, Lokio/a;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const/4 p1, 0x0

    .line 63
    return p1

    .line 64
    :cond_4
    return v3
.end method

.method public d(Lud/r;Lud/h;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lf1/n0;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayDeque;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lud/n;

    .line 10
    .line 11
    invoke-virtual {p0, p1, p2, v0}, Lf1/n0;->l(Lud/r;Lud/h;Lud/n;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public e(ILl0/c;Ljava/lang/Object;)V
    .locals 0

    .line 1
    new-instance p2, Lx0/b;

    .line 2
    .line 3
    const/4 p3, 0x0

    .line 4
    invoke-direct {p2, p1, p3, p3}, Lx0/b;-><init>(ILoh/h;Ljava/lang/Integer;)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lf1/n0;->g:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public f()Landroid/graphics/RenderEffect;
    .locals 1

    .line 1
    iget-object v0, p0, Lf1/n0;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/graphics/RenderEffect;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lf1/n0;->i()Landroid/graphics/RenderEffect;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lf1/n0;->g:Ljava/lang/Object;

    .line 12
    .line 13
    :cond_0
    return-object v0
.end method

.method public abstract g(Lsg/p;)V
.end method

.method public abstract h()V
.end method

.method public abstract i()Landroid/graphics/RenderEffect;
.end method

.method public abstract j()V
.end method

.method public abstract l(Lud/r;Lud/h;Lud/n;)V
.end method

.method public m(ILjava/lang/Object;Ll0/c;Ljava/lang/Object;)V
    .locals 0

    .line 1
    sget-object p4, Li0/l;->a:Li0/e;

    .line 2
    .line 3
    invoke-static {p2, p4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const/4 p2, 0x0

    .line 11
    invoke-virtual {p0, p1, p3, p2}, Lf1/n0;->e(ILl0/c;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public abstract n(Lsg/p;)Lfg/l;
.end method

.method public abstract o(Lsg/g;)V
.end method
