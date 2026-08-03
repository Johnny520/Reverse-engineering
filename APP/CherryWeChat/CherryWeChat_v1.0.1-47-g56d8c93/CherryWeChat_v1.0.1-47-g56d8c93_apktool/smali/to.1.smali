.class public final Lto;
.super Lvo;
.source ""


# static fields
.field public static final c:Ljava/lang/Class;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lto;->c:Ljava/lang/Class;

    return-void
.end method

.method public static d(IJLjava/lang/Object;)Ljava/util/List;
    .locals 3

    sget-object v0, LjD;->c:LiD;

    invoke-virtual {v0, p1, p2, p3}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    instance-of v1, v0, LIn;

    if-eqz v1, :cond_0

    new-instance v0, LHn;

    invoke-direct {v0, p0}, LHn;-><init>(I)V

    goto :goto_0

    :cond_0
    instance-of v1, v0, Lou;

    if-eqz v1, :cond_1

    instance-of v1, v0, LKl;

    if-eqz v1, :cond_1

    check-cast v0, LKl;

    invoke-interface {v0, p0}, LKl;->f(I)LKl;

    move-result-object v0

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(I)V

    :goto_0
    invoke-static {p1, p2, p3, v0}, LjD;->p(JLjava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :cond_2
    sget-object v1, Lto;->c:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_3

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    add-int/2addr v2, p0

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-static {p1, p2, p3, v1}, LjD;->p(JLjava/lang/Object;Ljava/lang/Object;)V

    return-object v1

    :cond_3
    instance-of v1, v0, LcD;

    if-eqz v1, :cond_4

    new-instance v1, LHn;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    add-int/2addr v2, p0

    invoke-direct {v1, v2}, LHn;-><init>(I)V

    check-cast v0, LcD;

    invoke-virtual {v1, v0}, LHn;->addAll(Ljava/util/Collection;)Z

    invoke-static {p1, p2, p3, v1}, LjD;->p(JLjava/lang/Object;Ljava/lang/Object;)V

    return-object v1

    :cond_4
    instance-of v1, v0, Lou;

    if-eqz v1, :cond_5

    instance-of v1, v0, LKl;

    if-eqz v1, :cond_5

    move-object v1, v0

    check-cast v1, LKl;

    move-object v2, v1

    check-cast v2, LE;

    iget-boolean v2, v2, LE;->a:Z

    if-nez v2, :cond_5

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/2addr v0, p0

    invoke-interface {v1, v0}, LKl;->f(I)LKl;

    move-result-object p0

    invoke-static {p1, p2, p3, p0}, LjD;->p(JLjava/lang/Object;Ljava/lang/Object;)V

    return-object p0

    :cond_5
    return-object v0
.end method


# virtual methods
.method public final a(JLjava/lang/Object;)V
    .locals 3

    sget-object v0, LjD;->c:LiD;

    invoke-virtual {v0, p1, p2, p3}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    instance-of v1, v0, LIn;

    if-eqz v1, :cond_0

    check-cast v0, LIn;

    invoke-interface {v0}, LIn;->l()LIn;

    move-result-object v0

    goto :goto_1

    :cond_0
    sget-object v1, Lto;->c:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    instance-of v1, v0, Lou;

    if-eqz v1, :cond_3

    instance-of v1, v0, LKl;

    if-eqz v1, :cond_3

    check-cast v0, LKl;

    check-cast v0, LE;

    iget-boolean p1, v0, LE;->a:Z

    if-eqz p1, :cond_2

    const/4 p1, 0x0

    iput-boolean p1, v0, LE;->a:Z

    :cond_2
    :goto_0
    return-void

    :cond_3
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    :goto_1
    invoke-static {p1, p2, p3, v0}, LjD;->p(JLjava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final b(JLjava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    sget-object v0, LjD;->c:LiD;

    invoke-virtual {v0, p1, p2, p4}, LiD;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/util/List;

    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {v0, p1, p2, p3}, Lto;->d(IJLjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result v2

    if-lez v1, :cond_0

    if-lez v2, :cond_0

    invoke-interface {v0, p4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_0
    if-lez v1, :cond_1

    move-object p4, v0

    :cond_1
    invoke-static {p1, p2, p3, p4}, LjD;->p(JLjava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final c(JLjava/lang/Object;)Ljava/util/List;
    .locals 1

    const/16 v0, 0xa

    invoke-static {v0, p1, p2, p3}, Lto;->d(IJLjava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
