.class public final Ln;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LIE;


# instance fields
.field public a:Z

.field public b:I

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/ActionBarContextView;)V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln;->c:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 6
    iput-boolean p1, p0, Ln;->a:Z

    return-void
.end method

.method public constructor <init>(Lpm;Loz;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Ln;->c:Ljava/lang/Object;

    .line 3
    iget-boolean p1, p1, Lpm;->b:Z

    .line 4
    iput-boolean p1, p0, Ln;->a:Z

    return-void
.end method

.method public static final a(Ln;LMc;Lu5;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Ln;->c:Ljava/lang/Object;

    check-cast v0, Loz;

    instance-of v1, p2, LJm;

    if-eqz v1, :cond_0

    move-object v1, p2

    check-cast v1, LJm;

    iget v2, v1, LJm;->j:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, LJm;->j:I

    goto :goto_0

    :cond_0
    new-instance v1, LJm;

    invoke-direct {v1, p0, p2}, LJm;-><init>(Ln;Lu5;)V

    :goto_0
    iget-object p2, v1, LJm;->h:Ljava/lang/Object;

    iget v2, v1, LJm;->j:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x7

    const/4 v7, 0x4

    const/4 v8, 0x1

    if-eqz v2, :cond_4

    if-ne v2, v8, :cond_3

    iget-object p0, v1, LJm;->g:Ljava/lang/String;

    iget-object p1, v1, LJm;->f:Ljava/util/LinkedHashMap;

    iget-object v0, v1, LJm;->e:Ln;

    iget-object v2, v1, LJm;->d:LMc;

    invoke-static {p2}, LOj;->T(Ljava/lang/Object;)V

    check-cast p2, Lkotlinx/serialization/json/b;

    invoke-interface {p1, p0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p0, v0, Ln;->c:Ljava/lang/Object;

    check-cast p0, Loz;

    invoke-virtual {p0}, Loz;->e()B

    move-result p0

    if-eq p0, v7, :cond_2

    if-ne p0, v6, :cond_1

    goto :goto_3

    :cond_1
    iget-object p0, v0, Ln;->c:Ljava/lang/Object;

    check-cast p0, Loz;

    const-string p1, "Expected end of the object or comma"

    invoke-static {p0, p1, v3, v5}, Loz;->m(Loz;Ljava/lang/String;II)V

    throw v4

    :cond_2
    move p2, p0

    move-object p0, v0

    move-object v0, p1

    move-object p1, v2

    goto :goto_1

    :cond_3
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    invoke-static {p2}, LOj;->T(Ljava/lang/Object;)V

    invoke-virtual {v0, v5}, Loz;->f(B)B

    move-result p2

    invoke-virtual {v0}, Loz;->p()B

    move-result v2

    if-eq v2, v7, :cond_9

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    :goto_1
    iget-object v2, p0, Ln;->c:Ljava/lang/Object;

    check-cast v2, Loz;

    invoke-virtual {v2}, Loz;->b()Z

    move-result v3

    if-eqz v3, :cond_6

    iget-boolean p2, p0, Ln;->a:Z

    if-eqz p2, :cond_5

    invoke-virtual {v2}, Loz;->j()Ljava/lang/String;

    move-result-object p2

    goto :goto_2

    :cond_5
    invoke-virtual {v2}, Loz;->i()Ljava/lang/String;

    move-result-object p2

    :goto_2
    const/4 v3, 0x5

    invoke-virtual {v2, v3}, Loz;->f(B)B

    iput-object p1, v1, LJm;->d:LMc;

    iput-object p0, v1, LJm;->e:Ln;

    iput-object v0, v1, LJm;->f:Ljava/util/LinkedHashMap;

    iput-object p2, v1, LJm;->g:Ljava/lang/String;

    iput v8, v1, LJm;->j:I

    iput-object v1, p1, LMc;->b:LEb;

    sget-object p0, Lgc;->a:Lgc;

    return-object p0

    :cond_6
    move-object p1, v0

    move-object v0, p0

    move p0, p2

    :goto_3
    iget-object p2, v0, Ln;->c:Ljava/lang/Object;

    check-cast p2, Loz;

    if-ne p0, v5, :cond_7

    invoke-virtual {p2, v6}, Loz;->f(B)B

    goto :goto_4

    :cond_7
    if-eq p0, v7, :cond_8

    :goto_4
    new-instance p0, Lkotlinx/serialization/json/c;

    invoke-direct {p0, p1}, Lkotlinx/serialization/json/c;-><init>(Ljava/util/Map;)V

    return-object p0

    :cond_8
    invoke-static {p2}, Lcr;->F(Loz;)V

    throw v4

    :cond_9
    const-string p0, "Unexpected leading comma"

    invoke-static {v0, p0, v3, v5}, Loz;->m(Loz;Ljava/lang/String;II)V

    throw v4
.end method


# virtual methods
.method public C()V
    .locals 1

    iget-object v0, p0, Ln;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/appcompat/widget/ActionBarContextView;

    invoke-static {v0}, Landroidx/appcompat/widget/ActionBarContextView;->a(Landroidx/appcompat/widget/ActionBarContextView;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Ln;->a:Z

    return-void
.end method

.method public b()Lkotlinx/serialization/json/b;
    .locals 9

    iget-object v0, p0, Ln;->c:Ljava/lang/Object;

    check-cast v0, Loz;

    invoke-virtual {v0}, Loz;->p()B

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    invoke-virtual {p0, v2}, Ln;->f(Z)Lkotlinx/serialization/json/d;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v3, 0x0

    if-nez v1, :cond_1

    invoke-virtual {p0, v3}, Ln;->f(Z)Lkotlinx/serialization/json/d;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v4, 0x6

    const/4 v5, 0x0

    if-ne v1, v4, :cond_d

    iget v1, p0, Ln;->b:I

    add-int/2addr v1, v2

    iput v1, p0, Ln;->b:I

    const/16 v2, 0xc8

    if-ne v1, v2, :cond_5

    new-instance v0, LIm;

    invoke-direct {v0, p0, v5}, LIm;-><init>(Ln;LEb;)V

    new-instance v1, LMc;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v0, v1, LMc;->a:LIm;

    iput-object v1, v1, LMc;->b:LEb;

    sget-object v2, Lgc;->a:Lgc;

    iput-object v2, v1, LMc;->c:Ljava/lang/Object;

    :cond_2
    :goto_0
    iget-object v0, v1, LMc;->c:Ljava/lang/Object;

    iget-object v3, v1, LMc;->b:LEb;

    if-nez v3, :cond_3

    invoke-static {v0}, LOj;->T(Ljava/lang/Object;)V

    check-cast v0, Lkotlinx/serialization/json/b;

    goto/16 :goto_4

    :cond_3
    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    :try_start_0
    iget-object v0, v1, LMc;->a:LIm;

    const/4 v4, 0x3

    invoke-static {v4, v0}, LTB;->c(ILjava/lang/Object;)V

    new-instance v4, LIm;

    iget-object v0, v0, LIm;->e:Ln;

    invoke-direct {v4, v0, v3}, LIm;-><init>(Ln;LEb;)V

    iput-object v1, v4, LIm;->d:LMc;

    sget-object v0, LTC;->a:LTC;

    invoke-virtual {v4, v0}, LIm;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eq v0, v2, :cond_2

    invoke-interface {v3, v0}, LEb;->f(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    new-instance v4, LGw;

    invoke-direct {v4, v0}, LGw;-><init>(Ljava/lang/Throwable;)V

    invoke-interface {v3, v4}, LEb;->f(Ljava/lang/Object;)V

    goto :goto_0

    :cond_4
    iput-object v2, v1, LMc;->c:Ljava/lang/Object;

    invoke-interface {v3, v0}, LEb;->f(Ljava/lang/Object;)V

    goto :goto_0

    :cond_5
    invoke-virtual {v0, v4}, Loz;->f(B)B

    move-result v1

    invoke-virtual {v0}, Loz;->p()B

    move-result v2

    const/4 v6, 0x4

    if-eq v2, v6, :cond_c

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    :cond_6
    invoke-virtual {v0}, Loz;->b()Z

    move-result v7

    const/4 v8, 0x7

    if-eqz v7, :cond_9

    iget-boolean v1, p0, Ln;->a:Z

    if-eqz v1, :cond_7

    invoke-virtual {v0}, Loz;->j()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_7
    invoke-virtual {v0}, Loz;->i()Ljava/lang/String;

    move-result-object v1

    :goto_1
    const/4 v7, 0x5

    invoke-virtual {v0, v7}, Loz;->f(B)B

    invoke-virtual {p0}, Ln;->b()Lkotlinx/serialization/json/b;

    move-result-object v7

    invoke-interface {v2, v1, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Loz;->e()B

    move-result v1

    if-eq v1, v6, :cond_6

    if-ne v1, v8, :cond_8

    goto :goto_2

    :cond_8
    const-string v1, "Expected end of the object or comma"

    invoke-static {v0, v1, v3, v4}, Loz;->m(Loz;Ljava/lang/String;II)V

    throw v5

    :cond_9
    :goto_2
    if-ne v1, v4, :cond_a

    invoke-virtual {v0, v8}, Loz;->f(B)B

    goto :goto_3

    :cond_a
    if-eq v1, v6, :cond_b

    :goto_3
    new-instance v0, Lkotlinx/serialization/json/c;

    invoke-direct {v0, v2}, Lkotlinx/serialization/json/c;-><init>(Ljava/util/Map;)V

    :goto_4
    iget v1, p0, Ln;->b:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Ln;->b:I

    return-object v0

    :cond_b
    invoke-static {v0}, Lcr;->F(Loz;)V

    throw v5

    :cond_c
    const-string v1, "Unexpected leading comma"

    invoke-static {v0, v1, v3, v4}, Loz;->m(Loz;Ljava/lang/String;II)V

    throw v5

    :cond_d
    const/16 v2, 0x8

    if-ne v1, v2, :cond_e

    invoke-virtual {p0}, Ln;->e()Lkotlinx/serialization/json/a;

    move-result-object v0

    return-object v0

    :cond_e
    invoke-static {v1}, LDc;->v(B)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Cannot read Json element because of unexpected "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v3, v4}, Loz;->m(Loz;Ljava/lang/String;II)V

    throw v5
.end method

.method public c()V
    .locals 2

    iget-boolean v0, p0, Ln;->a:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Ln;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/appcompat/widget/ActionBarContextView;

    const/4 v1, 0x0

    iput-object v1, v0, Landroidx/appcompat/widget/ActionBarContextView;->f:LGE;

    iget v1, p0, Ln;->b:I

    invoke-static {v0, v1}, Landroidx/appcompat/widget/ActionBarContextView;->b(Landroidx/appcompat/widget/ActionBarContextView;I)V

    return-void
.end method

.method public d()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Ln;->a:Z

    return-void
.end method

.method public e()Lkotlinx/serialization/json/a;
    .locals 8

    iget-object v0, p0, Ln;->c:Ljava/lang/Object;

    check-cast v0, Loz;

    invoke-virtual {v0}, Loz;->e()B

    move-result v1

    invoke-virtual {v0}, Loz;->p()B

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x4

    if-eq v2, v5, :cond_6

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    :goto_0
    invoke-virtual {v0}, Loz;->b()Z

    move-result v6

    const/16 v7, 0x9

    if-eqz v6, :cond_3

    invoke-virtual {p0}, Ln;->b()Lkotlinx/serialization/json/b;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Loz;->e()B

    move-result v1

    if-eq v1, v5, :cond_0

    if-ne v1, v7, :cond_1

    const/4 v6, 0x1

    goto :goto_1

    :cond_1
    move v6, v3

    :goto_1
    iget v7, v0, Loz;->a:I

    if-eqz v6, :cond_2

    goto :goto_0

    :cond_2
    const-string v1, "Expected end of the array or comma"

    invoke-static {v0, v1, v7, v5}, Loz;->m(Loz;Ljava/lang/String;II)V

    throw v4

    :cond_3
    const/16 v3, 0x8

    if-ne v1, v3, :cond_4

    invoke-virtual {v0, v7}, Loz;->f(B)B

    goto :goto_2

    :cond_4
    if-eq v1, v5, :cond_5

    :goto_2
    new-instance v0, Lkotlinx/serialization/json/a;

    invoke-direct {v0, v2}, Lkotlinx/serialization/json/a;-><init>(Ljava/util/List;)V

    return-object v0

    :cond_5
    const-string v1, "array"

    invoke-static {v0, v1}, Lcr;->E(Loz;Ljava/lang/String;)V

    throw v4

    :cond_6
    const-string v1, "Unexpected leading comma"

    const/4 v2, 0x6

    invoke-static {v0, v1, v3, v2}, Loz;->m(Loz;Ljava/lang/String;II)V

    throw v4
.end method

.method public f(Z)Lkotlinx/serialization/json/d;
    .locals 2

    iget-object v0, p0, Ln;->c:Ljava/lang/Object;

    check-cast v0, Loz;

    iget-boolean v1, p0, Ln;->a:Z

    if-nez v1, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Loz;->i()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    :goto_0
    invoke-virtual {v0}, Loz;->j()Ljava/lang/String;

    move-result-object v0

    :goto_1
    if-nez p1, :cond_2

    const-string v1, "null"

    invoke-static {v0, v1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object p1, Lkotlinx/serialization/json/JsonNull;->INSTANCE:Lkotlinx/serialization/json/JsonNull;

    return-object p1

    :cond_2
    new-instance v1, LBm;

    invoke-direct {v1, v0, p1}, LBm;-><init>(Ljava/lang/Object;Z)V

    return-object v1
.end method
