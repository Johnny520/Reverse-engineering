.class public final LGs;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Landroid/view/ViewParent;

.field public b:Landroid/view/ViewParent;

.field public final c:Landroid/view/ViewGroup;

.field public d:Z

.field public e:[I


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LGs;->c:Landroid/view/ViewGroup;

    return-void
.end method


# virtual methods
.method public final a(FFZ)Z
    .locals 3

    iget-boolean v0, p0, LGs;->d:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v1}, LGs;->e(I)Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v2, p0, LGs;->c:Landroid/view/ViewGroup;

    :try_start_0
    invoke-interface {v0, v2, p1, p2, p3}, Landroid/view/ViewParent;->onNestedFling(Landroid/view/View;FFZ)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_0
    return v1
.end method

.method public final b(FF)Z
    .locals 3

    iget-boolean v0, p0, LGs;->d:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v1}, LGs;->e(I)Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v2, p0, LGs;->c:Landroid/view/ViewGroup;

    :try_start_0
    invoke-interface {v0, v2, p1, p2}, Landroid/view/ViewParent;->onNestedPreFling(Landroid/view/View;FF)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_0
    return v1
.end method

.method public final c(II[I[II)Z
    .locals 10

    iget-boolean v0, p0, LGs;->d:Z

    const/4 v6, 0x0

    if-eqz v0, :cond_a

    invoke-virtual {p0, p5}, LGs;->e(I)Landroid/view/ViewParent;

    move-result-object v0

    if-nez v0, :cond_0

    goto/16 :goto_3

    :cond_0
    const/4 v7, 0x1

    if-nez p1, :cond_2

    if-eqz p2, :cond_1

    goto :goto_0

    :cond_1
    if-eqz p4, :cond_a

    aput v6, p4, v6

    aput v6, p4, v7

    return v6

    :cond_2
    :goto_0
    iget-object v1, p0, LGs;->c:Landroid/view/ViewGroup;

    if-eqz p4, :cond_3

    invoke-virtual {v1, p4}, Landroid/view/View;->getLocationInWindow([I)V

    aget v2, p4, v6

    aget v3, p4, v7

    move v8, v2

    move v9, v3

    goto :goto_1

    :cond_3
    move v8, v6

    move v9, v8

    :goto_1
    if-nez p3, :cond_5

    iget-object p3, p0, LGs;->e:[I

    if-nez p3, :cond_4

    const/4 p3, 0x2

    new-array p3, p3, [I

    iput-object p3, p0, LGs;->e:[I

    :cond_4
    iget-object p3, p0, LGs;->e:[I

    :cond_5
    move-object v4, p3

    aput v6, v4, v6

    aput v6, v4, v7

    instance-of p3, v0, LHs;

    if-eqz p3, :cond_6

    check-cast v0, LHs;

    move v2, p1

    move v3, p2

    move v5, p5

    invoke-interface/range {v0 .. v5}, LHs;->c(Landroid/view/View;II[II)V

    goto :goto_2

    :cond_6
    if-nez p5, :cond_7

    :try_start_0
    invoke-interface {v0, v1, p1, p2, v4}, Landroid/view/ViewParent;->onNestedPreScroll(Landroid/view/View;II[I)V
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_7
    :goto_2
    if-eqz p4, :cond_8

    invoke-virtual {v1, p4}, Landroid/view/View;->getLocationInWindow([I)V

    aget p1, p4, v6

    sub-int/2addr p1, v8

    aput p1, p4, v6

    aget p1, p4, v7

    sub-int/2addr p1, v9

    aput p1, p4, v7

    :cond_8
    aget p1, v4, v6

    if-nez p1, :cond_9

    aget p1, v4, v7

    if-eqz p1, :cond_a

    :cond_9
    move v6, v7

    :cond_a
    :goto_3
    return v6
.end method

.method public final d(IIII[II[I)Z
    .locals 13

    move-object/from16 v0, p5

    move/from16 v7, p6

    iget-boolean v1, p0, LGs;->d:Z

    const/4 v9, 0x0

    if-eqz v1, :cond_a

    invoke-virtual {p0, v7}, LGs;->e(I)Landroid/view/ViewParent;

    move-result-object v2

    if-nez v2, :cond_0

    goto/16 :goto_5

    :cond_0
    const/4 v10, 0x1

    if-nez p1, :cond_2

    if-nez p2, :cond_2

    if-nez p3, :cond_2

    if-eqz p4, :cond_1

    goto :goto_0

    :cond_1
    if-eqz v0, :cond_a

    aput v9, v0, v9

    aput v9, v0, v10

    return v9

    :cond_2
    :goto_0
    iget-object v3, p0, LGs;->c:Landroid/view/ViewGroup;

    if-eqz v0, :cond_3

    invoke-virtual {v3, v0}, Landroid/view/View;->getLocationInWindow([I)V

    aget v1, v0, v9

    aget v4, v0, v10

    move v11, v1

    move v12, v4

    goto :goto_1

    :cond_3
    move v11, v9

    move v12, v11

    :goto_1
    if-nez p7, :cond_5

    iget-object v1, p0, LGs;->e:[I

    if-nez v1, :cond_4

    const/4 v1, 0x2

    new-array v1, v1, [I

    iput-object v1, p0, LGs;->e:[I

    :cond_4
    iget-object v1, p0, LGs;->e:[I

    aput v9, v1, v9

    aput v9, v1, v10

    move-object v8, v1

    goto :goto_2

    :cond_5
    move-object/from16 v8, p7

    :goto_2
    instance-of v1, v2, LIs;

    if-eqz v1, :cond_6

    move-object v1, v2

    check-cast v1, LIs;

    move v4, p2

    move/from16 v5, p3

    move/from16 v6, p4

    move-object v2, v3

    move v3, p1

    invoke-interface/range {v1 .. v8}, LIs;->d(Landroid/view/View;IIIII[I)V

    :goto_3
    move-object v3, v2

    goto :goto_4

    :cond_6
    aget v1, v8, v9

    add-int v1, v1, p3

    aput v1, v8, v9

    aget v1, v8, v10

    add-int v1, v1, p4

    aput v1, v8, v10

    instance-of v1, v2, LHs;

    if-eqz v1, :cond_7

    move-object v1, v2

    check-cast v1, LHs;

    move v4, p2

    move/from16 v5, p3

    move/from16 v6, p4

    move/from16 v7, p6

    move-object v2, v3

    move v3, p1

    invoke-interface/range {v1 .. v7}, LHs;->e(Landroid/view/View;IIIII)V

    goto :goto_3

    :cond_7
    if-nez p6, :cond_8

    move v4, p1

    move v5, p2

    move/from16 v6, p3

    move/from16 v7, p4

    :try_start_0
    invoke-interface/range {v2 .. v7}, Landroid/view/ViewParent;->onNestedScroll(Landroid/view/View;IIII)V
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_8
    :goto_4
    if-eqz v0, :cond_9

    invoke-virtual {v3, v0}, Landroid/view/View;->getLocationInWindow([I)V

    aget p1, v0, v9

    sub-int/2addr p1, v11

    aput p1, v0, v9

    aget p1, v0, v10

    sub-int/2addr p1, v12

    aput p1, v0, v10

    :cond_9
    return v10

    :cond_a
    :goto_5
    return v9
.end method

.method public final e(I)Landroid/view/ViewParent;
    .locals 1

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object p1, p0, LGs;->b:Landroid/view/ViewParent;

    return-object p1

    :cond_1
    iget-object p1, p0, LGs;->a:Landroid/view/ViewParent;

    return-object p1
.end method

.method public final f(I)Z
    .locals 0

    invoke-virtual {p0, p1}, LGs;->e(I)Landroid/view/ViewParent;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final g(II)Z
    .locals 7

    invoke-virtual {p0, p2}, LGs;->f(I)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    goto :goto_3

    :cond_0
    iget-boolean v0, p0, LGs;->d:Z

    const/4 v2, 0x0

    if-eqz v0, :cond_9

    iget-object v0, p0, LGs;->c:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    move-object v4, v0

    :goto_0
    if-eqz v3, :cond_9

    instance-of v5, v3, LHs;

    if-eqz v5, :cond_1

    move-object v6, v3

    check-cast v6, LHs;

    invoke-interface {v6, v4, v0, p1, p2}, LHs;->f(Landroid/view/View;Landroid/view/View;II)Z

    move-result v6

    goto :goto_1

    :cond_1
    if-nez p2, :cond_2

    :try_start_0
    invoke-interface {v3, v4, v0, p1}, Landroid/view/ViewParent;->onStartNestedScroll(Landroid/view/View;Landroid/view/View;I)Z

    move-result v6
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_2
    move v6, v2

    :goto_1
    if-eqz v6, :cond_7

    if-eqz p2, :cond_4

    if-eq p2, v1, :cond_3

    goto :goto_2

    :cond_3
    iput-object v3, p0, LGs;->b:Landroid/view/ViewParent;

    goto :goto_2

    :cond_4
    iput-object v3, p0, LGs;->a:Landroid/view/ViewParent;

    :goto_2
    if-eqz v5, :cond_5

    check-cast v3, LHs;

    invoke-interface {v3, v4, v0, p1, p2}, LHs;->a(Landroid/view/View;Landroid/view/View;II)V

    goto :goto_3

    :cond_5
    if-nez p2, :cond_6

    :try_start_1
    invoke-interface {v3, v4, v0, p1}, Landroid/view/ViewParent;->onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;I)V
    :try_end_1
    .catch Ljava/lang/AbstractMethodError; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :catch_1
    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_6
    :goto_3
    return v1

    :cond_7
    instance-of v5, v3, Landroid/view/View;

    if-eqz v5, :cond_8

    move-object v4, v3

    check-cast v4, Landroid/view/View;

    :cond_8
    invoke-interface {v3}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    goto :goto_0

    :cond_9
    return v2
.end method

.method public final h(I)V
    .locals 3

    invoke-virtual {p0, p1}, LGs;->e(I)Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_4

    instance-of v1, v0, LHs;

    iget-object v2, p0, LGs;->c:Landroid/view/ViewGroup;

    if-eqz v1, :cond_0

    check-cast v0, LHs;

    invoke-interface {v0, v2, p1}, LHs;->b(Landroid/view/View;I)V

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    :try_start_0
    invoke-interface {v0, v2}, Landroid/view/ViewParent;->onStopNestedScroll(Landroid/view/View;)V
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_1
    :goto_0
    const/4 v0, 0x0

    if-eqz p1, :cond_3

    const/4 v1, 0x1

    if-eq p1, v1, :cond_2

    goto :goto_1

    :cond_2
    iput-object v0, p0, LGs;->b:Landroid/view/ViewParent;

    goto :goto_1

    :cond_3
    iput-object v0, p0, LGs;->a:Landroid/view/ViewParent;

    :cond_4
    :goto_1
    return-void
.end method
