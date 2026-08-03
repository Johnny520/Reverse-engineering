.class public final synthetic Lf0/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p4, p0, Lf0/m;->a:I

    iput-object p1, p0, Lf0/m;->c:Ljava/lang/Object;

    iput-object p2, p0, Lf0/m;->d:Ljava/lang/Object;

    iput-object p3, p0, Lf0/m;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 8

    iget p1, p0, Lf0/m;->a:I

    packed-switch p1, :pswitch_data_0

    const-string p1, "$currentTab"

    iget-object v0, p0, Lf0/m;->c:Ljava/lang/Object;

    check-cast v0, LQ0/m;

    invoke-static {v0, p1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "$tab"

    iget-object v1, p0, Lf0/m;->d:Ljava/lang/Object;

    check-cast v1, Lf0/Q;

    invoke-static {v1, p1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "$render"

    iget-object v2, p0, Lf0/m;->b:Ljava/lang/Object;

    check-cast v2, LQ0/m;

    invoke-static {v2, p1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, v0, LQ0/m;->a:Ljava/lang/Object;

    if-eq p1, v1, :cond_1

    iput-object v1, v0, LQ0/m;->a:Ljava/lang/Object;

    iget-object p1, v2, LQ0/m;->a:Ljava/lang/Object;

    if-eqz p1, :cond_0

    check-cast p1, LP0/a;

    invoke-interface {p1}, LP0/a;->invoke()Ljava/lang/Object;

    goto :goto_0

    :cond_0
    const-string p1, "render"

    invoke-static {p1}, LQ0/g;->g(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    :cond_1
    :goto_0
    return-void

    :pswitch_0
    const-string p1, "$target"

    iget-object v0, p0, Lf0/m;->c:Ljava/lang/Object;

    check-cast v0, Landroid/widget/EditText;

    invoke-static {v0, p1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "$tag"

    iget-object v1, p0, Lf0/m;->d:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Ljava/lang/String;

    invoke-static {v5, p1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/widget/TextView;->getSelectionStart()I

    move-result p1

    const/4 v1, 0x0

    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-virtual {v0}, Landroid/widget/TextView;->getSelectionEnd()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    move-result v3

    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    if-eqz v2, :cond_3

    const/4 v6, 0x0

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v7

    invoke-interface/range {v2 .. v7}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;II)Landroid/text/Editable;

    goto :goto_1

    :cond_2
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->append(Ljava/lang/CharSequence;)V

    :cond_3
    :goto_1
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    iget-object p1, p0, Lf0/m;->b:Ljava/lang/Object;

    check-cast p1, LP0/a;

    if-eqz p1, :cond_4

    invoke-interface {p1}, LP0/a;->invoke()Ljava/lang/Object;

    :cond_4
    return-void

    :pswitch_1
    const-string p1, "$item"

    iget-object v0, p0, Lf0/m;->c:Ljava/lang/Object;

    check-cast v0, Lf0/H;

    invoke-static {v0, p1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "$host"

    iget-object v1, p0, Lf0/m;->d:Ljava/lang/Object;

    check-cast v1, Landroid/app/Activity;

    invoke-static {v1, p1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "$onToggle"

    iget-object v2, p0, Lf0/m;->b:Ljava/lang/Object;

    check-cast v2, LP0/a;

    invoke-static {v2, p1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, v0, Lf0/H;->f:LP0/p;

    invoke-interface {p1, v1, v2}, LP0/p;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
