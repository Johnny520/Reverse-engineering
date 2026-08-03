.class public final synthetic LA0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    iput p1, p0, LA0/a;->a:I

    iput-object p2, p0, LA0/a;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    iget p1, p0, LA0/a;->a:I

    packed-switch p1, :pswitch_data_0

    const-string p1, "$dialog"

    iget-object v0, p0, LA0/a;->b:Ljava/lang/Object;

    check-cast v0, Landroid/app/Dialog;

    invoke-static {v0, p1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    return-void

    :pswitch_0
    const-string p1, "$item"

    iget-object v0, p0, LA0/a;->b:Ljava/lang/Object;

    check-cast v0, Ld0/m;

    invoke-static {v0, p1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, v0, Ld0/m;->d:LP0/a;

    invoke-interface {p1}, LP0/a;->invoke()Ljava/lang/Object;

    return-void

    :pswitch_1
    const-string p1, "$host"

    iget-object v0, p0, LA0/a;->b:Ljava/lang/Object;

    check-cast v0, Landroid/view/View;

    invoke-static {v0, p1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    instance-of v1, p1, Landroid/view/ViewGroup;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast p1, Landroid/view/ViewGroup;

    goto :goto_0

    :cond_0
    move-object p1, v2

    :goto_0
    if-nez p1, :cond_3

    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object p1

    instance-of v0, p1, Landroid/view/ViewGroup;

    if-eqz v0, :cond_1

    move-object v2, p1

    check-cast v2, Landroid/view/ViewGroup;

    :cond_1
    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    move-object p1, v2

    :cond_3
    invoke-static {p1}, Lc0/a0;->m0(Landroid/view/View;)V

    :goto_1
    return-void

    :pswitch_2
    iget-object p1, p0, LA0/a;->b:Ljava/lang/Object;

    check-cast p1, LA0/z;

    iget-object v0, p1, LA0/z;->f:Landroid/widget/EditText;

    if-nez v0, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {v0}, Landroid/widget/TextView;->getSelectionEnd()I

    move-result v0

    iget-object v1, p1, LA0/z;->f:Landroid/widget/EditText;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    move-result-object v1

    instance-of v1, v1, Landroid/text/method/PasswordTransformationMethod;

    if-eqz v1, :cond_5

    iget-object v1, p1, LA0/z;->f:Landroid/widget/EditText;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    goto :goto_2

    :cond_5
    iget-object v1, p1, LA0/z;->f:Landroid/widget/EditText;

    invoke-static {}, Landroid/text/method/PasswordTransformationMethod;->getInstance()Landroid/text/method/PasswordTransformationMethod;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    :goto_2
    if-ltz v0, :cond_6

    iget-object v1, p1, LA0/z;->f:Landroid/widget/EditText;

    invoke-virtual {v1, v0}, Landroid/widget/EditText;->setSelection(I)V

    :cond_6
    invoke-virtual {p1}, LA0/v;->q()V

    :goto_3
    return-void

    :pswitch_3
    iget-object p1, p0, LA0/a;->b:Ljava/lang/Object;

    check-cast p1, LA0/o;

    invoke-virtual {p1}, LA0/o;->u()V

    return-void

    :pswitch_4
    iget-object p1, p0, LA0/a;->b:Ljava/lang/Object;

    check-cast p1, LA0/f;

    iget-object v0, p1, LA0/f;->i:Landroid/widget/EditText;

    if-nez v0, :cond_7

    goto :goto_4

    :cond_7
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-interface {v0}, Landroid/text/Editable;->clear()V

    :cond_8
    invoke-virtual {p1}, LA0/v;->q()V

    :goto_4
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
