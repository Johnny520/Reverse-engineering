.class public final La/X9$b;
.super Landroidx/recyclerview/widget/RecyclerView$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/X9;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/X9$b$a;,
        La/X9$b$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$d<",
        "Landroidx/recyclerview/widget/RecyclerView$A;",
        ">;"
    }
.end annotation


# instance fields
.field public final d:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 0

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$d;-><init>()V

    iput-object p1, p0, La/X9$b;->d:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget-object v0, p0, La/X9$b;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final c(I)I
    .locals 1

    iget-object v0, p0, La/X9$b;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La/X9$a;

    instance-of v0, p1, La/X9$a$b;

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of p1, p1, La/X9$a$a;

    if-eqz p1, :cond_1

    const/4 p1, 0x2

    return p1

    :cond_1
    new-instance p1, La/Ob;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1
.end method

.method public final d(Landroidx/recyclerview/widget/RecyclerView$A;I)V
    .locals 2

    iget-object v0, p0, La/X9$b;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, La/X9$a;

    instance-of v0, p2, La/X9$a$b;

    const-string v1, "item"

    if-eqz v0, :cond_0

    check-cast p1, La/X9$b$b;

    check-cast p2, La/X9$a$b;

    invoke-static {p2, v1}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, La/X9$b$b;->u:Landroid/widget/TextView;

    iget-object v1, p2, La/X9$a$b;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p1, La/X9$b$b;->v:Landroid/widget/TextView;

    iget-object v1, p2, La/X9$a$b;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p1, La/X9$b$b;->w:Landroidx/appcompat/widget/SwitchCompat;

    iget-boolean v1, p2, La/X9$a$b;->c:Z

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    new-instance v0, La/Y9;

    const/4 v1, 0x0

    invoke-direct {v0, p2, v1, p1}, La/Y9;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$A;->a:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    :cond_0
    instance-of v0, p2, La/X9$a$a;

    if-eqz v0, :cond_1

    check-cast p1, La/X9$b$a;

    check-cast p2, La/X9$a$a;

    invoke-static {p2, v1}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, La/X9$b$a;->u:Landroid/widget/TextView;

    iget-object v1, p2, La/X9$a$a;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p1, La/X9$b$a;->v:Landroid/widget/TextView;

    iget-object v1, p2, La/X9$a$a;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    new-instance v0, La/h3;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p2}, La/h3;-><init>(ILjava/lang/Object;)V

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$A;->a:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    :cond_1
    new-instance p1, La/Ob;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1
.end method

.method public final e(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$A;
    .locals 3

    const-string v0, "parent"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne p2, v1, :cond_0

    sget p2, Ltop/mmjz/floatingclouds/R$layout;->item_setting_switch:I

    invoke-virtual {v0, p2, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    new-instance p2, La/X9$b$b;

    invoke-static {p1}, La/i9;->b(Ljava/lang/Object;)V

    invoke-direct {p2, p1}, La/X9$b$b;-><init>(Landroid/view/View;)V

    return-object p2

    :cond_0
    sget p2, Ltop/mmjz/floatingclouds/R$layout;->item_setting_button:I

    invoke-virtual {v0, p2, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    new-instance p2, La/X9$b$a;

    invoke-static {p1}, La/i9;->b(Ljava/lang/Object;)V

    invoke-direct {p2, p1}, La/X9$b$a;-><init>(Landroid/view/View;)V

    return-object p2
.end method
