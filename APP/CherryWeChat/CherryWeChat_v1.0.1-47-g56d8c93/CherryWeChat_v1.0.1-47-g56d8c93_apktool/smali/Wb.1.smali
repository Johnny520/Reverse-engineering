.class public final LWb;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, LWb;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 6

    iget v0, p0, LWb;->a:I

    const/4 v1, -0x1

    const/4 v2, 0x0

    const/4 v3, 0x1

    packed-switch v0, :pswitch_data_0

    check-cast p1, LBE;

    check-cast p2, LBE;

    iget p1, p1, LBE;->b:I

    iget p2, p2, LBE;->b:I

    sub-int/2addr p1, p2

    return p1

    :pswitch_0
    check-cast p2, LEC;

    iget p2, p2, LEC;->m:I

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    check-cast p1, LEC;

    iget p1, p1, LEC;->m:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2, p1}, LPj;->d(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1

    :pswitch_1
    check-cast p2, LEC;

    iget-object p2, p2, LEC;->c:Ljava/lang/String;

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p2, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p2

    const-wide v1, -0x1bbbdfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    check-cast p1, LEC;

    iget-object p1, p1, LEC;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-wide v0, -0x1ba4efffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-static {p2, p1}, LPj;->d(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1

    :pswitch_2
    check-cast p1, LEC;

    iget-object p1, p1, LEC;->c:Ljava/lang/String;

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-wide v1, -0x1bb9bfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    check-cast p2, LEC;

    iget-object p2, p2, LEC;->c:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p2

    const-wide v0, -0x1bbacfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-static {p1, p2}, LPj;->d(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1

    :pswitch_3
    check-cast p2, LEC;

    iget-object p2, p2, LEC;->a:Ljava/lang/String;

    const-wide v0, -0x2df1cfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    check-cast p1, LEC;

    iget-object p1, p1, LEC;->a:Ljava/lang/String;

    const-wide v0, -0x2df1efffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p2, p1}, LPj;->d(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1

    :pswitch_4
    check-cast p2, LEC;

    iget-object v0, p2, LEC;->a:Ljava/lang/String;

    const-wide v4, -0x2d0adfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object p2, p2, LEC;->s:LCC;

    sget-object v0, LCC;->d:LCC;

    if-eq p2, v0, :cond_1

    sget-object v0, LCC;->e:LCC;

    if-ne p2, v0, :cond_0

    goto :goto_0

    :cond_0
    move p2, v2

    goto :goto_1

    :cond_1
    :goto_0
    move p2, v3

    :goto_1
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    check-cast p1, LEC;

    iget-object v0, p1, LEC;->a:Ljava/lang/String;

    const-wide v4, -0x2d0affffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object p1, p1, LEC;->s:LCC;

    sget-object v0, LCC;->d:LCC;

    if-eq p1, v0, :cond_2

    sget-object v0, LCC;->e:LCC;

    if-ne p1, v0, :cond_3

    :cond_2
    move v2, v3

    :cond_3
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p2, p1}, LPj;->d(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1

    :pswitch_5
    check-cast p1, LEC;

    iget p1, p1, LEC;->v:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    check-cast p2, LEC;

    iget p2, p2, LEC;->v:I

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p1, p2}, LPj;->d(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1

    :pswitch_6
    check-cast p1, Landroid/view/View;

    check-cast p2, Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result p1

    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result p2

    sub-int/2addr p1, p2

    return p1

    :pswitch_7
    check-cast p1, LFy;

    check-cast p2, LFy;

    iget p1, p1, LFy;->b:I

    iget p2, p2, LFy;->b:I

    sub-int/2addr p1, p2

    return p1

    :pswitch_8
    check-cast p1, Ld1;

    iget p1, p1, Ld1;->d:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    check-cast p2, Ld1;

    iget p2, p2, Ld1;->d:I

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p1, p2}, LPj;->d(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1

    :pswitch_9
    check-cast p1, Lqj;

    check-cast p2, Lqj;

    iget-object v0, p1, Lqj;->d:Landroidx/recyclerview/widget/RecyclerView;

    if-nez v0, :cond_4

    move v4, v3

    goto :goto_2

    :cond_4
    move v4, v2

    :goto_2
    iget-object v5, p2, Lqj;->d:Landroidx/recyclerview/widget/RecyclerView;

    if-nez v5, :cond_5

    move v5, v3

    goto :goto_3

    :cond_5
    move v5, v2

    :goto_3
    if-eq v4, v5, :cond_6

    if-nez v0, :cond_b

    goto :goto_4

    :cond_6
    iget-boolean v0, p1, Lqj;->a:Z

    iget-boolean v4, p2, Lqj;->a:Z

    if-eq v0, v4, :cond_8

    if-eqz v0, :cond_7

    goto :goto_5

    :cond_7
    :goto_4
    move v1, v3

    goto :goto_5

    :cond_8
    iget v0, p2, Lqj;->b:I

    iget v1, p1, Lqj;->b:I

    sub-int v1, v0, v1

    if-eqz v1, :cond_9

    goto :goto_5

    :cond_9
    iget p1, p1, Lqj;->c:I

    iget p2, p2, Lqj;->c:I

    sub-int v1, p1, p2

    if-eqz v1, :cond_a

    goto :goto_5

    :cond_a
    move v1, v2

    :cond_b
    :goto_5
    return v1

    :pswitch_a
    check-cast p1, Lio/github/cherrywechat/network/model/FAQItem;

    invoke-virtual {p1}, Lio/github/cherrywechat/network/model/FAQItem;->getItemOrder()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    check-cast p2, Lio/github/cherrywechat/network/model/FAQItem;

    invoke-virtual {p2}, Lio/github/cherrywechat/network/model/FAQItem;->getItemOrder()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p1, p2}, LPj;->d(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1

    :pswitch_b
    check-cast p1, LRr;

    iget-object p1, p1, LRr;->c:Ljava/lang/String;

    check-cast p2, LRr;

    iget-object p2, p2, LRr;->c:Ljava/lang/String;

    invoke-static {p1, p2}, LPj;->d(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1

    :pswitch_c
    check-cast p1, LC9;

    iget-object p1, p1, LC9;->c:Ljava/lang/String;

    check-cast p2, LC9;

    iget-object p2, p2, LC9;->c:Ljava/lang/String;

    invoke-static {p1, p2}, LPj;->d(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1

    :pswitch_d
    check-cast p1, Landroid/view/View;

    check-cast p2, Landroid/view/View;

    sget-object v0, LlE;->a:Ljava/util/WeakHashMap;

    invoke-static {p1}, LeE;->g(Landroid/view/View;)F

    move-result p1

    invoke-static {p2}, LeE;->g(Landroid/view/View;)F

    move-result p2

    cmpl-float v0, p1, p2

    if-lez v0, :cond_c

    goto :goto_6

    :cond_c
    cmpg-float p1, p1, p2

    if-gez p1, :cond_d

    move v1, v3

    goto :goto_6

    :cond_d
    move v1, v2

    :goto_6
    return v1

    :pswitch_data_0
    .packed-switch 0x0
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
