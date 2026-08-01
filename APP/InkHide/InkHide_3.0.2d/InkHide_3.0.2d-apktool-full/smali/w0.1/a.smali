.class public final Lw0/a;
.super Ln0/b;
.source "SourceFile"


# virtual methods
.method public final a(Ln0/a;ILandroid/view/ViewGroup;)V
    .locals 0

    .line 1
    iget-object p1, p1, Ln0/a;->a:Landroid/view/View;

    .line 2
    .line 3
    instance-of p3, p1, Landroid/widget/TextView;

    .line 4
    .line 5
    if-eqz p3, :cond_1

    .line 6
    .line 7
    check-cast p1, Landroid/widget/TextView;

    .line 8
    .line 9
    iget-object p3, p0, Ln0/b;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 10
    .line 11
    invoke-virtual {p3, p2}, Ljava/util/concurrent/CopyOnWriteArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    check-cast p2, LE0/c;

    .line 16
    .line 17
    if-eqz p2, :cond_0

    .line 18
    .line 19
    iget-object p2, p2, LE0/c;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p2, Ljava/lang/String;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 p2, 0x0

    .line 25
    :goto_0
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 26
    .line 27
    .line 28
    :cond_1
    return-void
.end method

.method public final b(Landroid/view/ViewGroup;)Ln0/a;
    .locals 1

    .line 1
    new-instance v0, Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x4

    .line 11
    invoke-static {p1}, LB0/a;->b(I)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-virtual {v0, p1, p1, p1, p1}, Landroid/view/View;->setPadding(IIII)V

    .line 16
    .line 17
    .line 18
    new-instance p1, Ln0/a;

    .line 19
    .line 20
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p1, Ln0/a;->a:Landroid/view/View;

    .line 24
    .line 25
    return-object p1
.end method
