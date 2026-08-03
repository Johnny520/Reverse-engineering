.class public final synthetic La/h3;
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

    iput p1, p0, La/h3;->a:I

    iput-object p2, p0, La/h3;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    iget p1, p0, La/h3;->a:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, La/h3;->b:Ljava/lang/Object;

    check-cast p1, La/qc;

    iget-object v0, p1, La/qc;->f:Landroid/widget/EditText;

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Landroid/widget/TextView;->getSelectionEnd()I

    move-result v0

    iget-object v1, p1, La/qc;->f:Landroid/widget/EditText;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    move-result-object v1

    instance-of v1, v1, Landroid/text/method/PasswordTransformationMethod;

    if-eqz v1, :cond_1

    iget-object v1, p1, La/qc;->f:Landroid/widget/EditText;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    goto :goto_0

    :cond_1
    iget-object v1, p1, La/qc;->f:Landroid/widget/EditText;

    invoke-static {}, Landroid/text/method/PasswordTransformationMethod;->getInstance()Landroid/text/method/PasswordTransformationMethod;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    :goto_0
    if-ltz v0, :cond_2

    iget-object v1, p1, La/qc;->f:Landroid/widget/EditText;

    invoke-virtual {v1, v0}, Landroid/widget/EditText;->setSelection(I)V

    :cond_2
    invoke-virtual {p1}, La/c6;->q()V

    :goto_1
    return-void

    :pswitch_0
    iget-object p1, p0, La/h3;->b:Ljava/lang/Object;

    check-cast p1, Lcom/google/android/material/datepicker/d;

    iget-object v0, p1, Lcom/google/android/material/datepicker/d;->K0:Landroid/widget/Button;

    invoke-virtual {p1}, Lcom/google/android/material/datepicker/d;->H()La/I4;

    move-result-object v1

    invoke-interface {v1}, La/I4;->h()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    iget-object v0, p1, Lcom/google/android/material/datepicker/d;->I0:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0}, Lcom/google/android/material/internal/CheckableImageButton;->toggle()V

    iget v0, p1, Lcom/google/android/material/datepicker/d;->x0:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    const/4 v1, 0x0

    :cond_3
    iput v1, p1, Lcom/google/android/material/datepicker/d;->x0:I

    iget-object v0, p1, Lcom/google/android/material/datepicker/d;->I0:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {p1, v0}, Lcom/google/android/material/datepicker/d;->L(Lcom/google/android/material/internal/CheckableImageButton;)V

    invoke-virtual {p1}, Lcom/google/android/material/datepicker/d;->K()V

    return-void

    :pswitch_1
    iget-object p1, p0, La/h3;->b:Ljava/lang/Object;

    check-cast p1, La/A3;

    invoke-virtual {p1}, La/A3;->a()Ljava/lang/Object;

    return-void

    :pswitch_2
    iget-object p1, p0, La/h3;->b:Ljava/lang/Object;

    check-cast p1, La/da;

    invoke-virtual {p1}, La/da;->a()Ljava/lang/Object;

    return-void

    :pswitch_3
    iget-object p1, p0, La/h3;->b:Ljava/lang/Object;

    check-cast p1, La/s7;

    invoke-interface {p1}, La/s7;->a()Ljava/lang/Object;

    return-void

    :pswitch_4
    iget-object p1, p0, La/h3;->b:Ljava/lang/Object;

    check-cast p1, La/X9$a$a;

    iget-object p1, p1, La/X9$a$a;->c:La/A3;

    invoke-virtual {p1}, La/A3;->a()Ljava/lang/Object;

    return-void

    :pswitch_5
    iget-object p1, p0, La/h3;->b:Ljava/lang/Object;

    check-cast p1, La/F5;

    invoke-virtual {p1}, La/F5;->u()V

    return-void

    :pswitch_6
    iget-object p1, p0, La/h3;->b:Ljava/lang/Object;

    check-cast p1, La/l3;

    iget-object v0, p1, La/l3;->i:Landroid/widget/EditText;

    if-nez v0, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-interface {v0}, Landroid/text/Editable;->clear()V

    :cond_5
    invoke-virtual {p1}, La/c6;->q()V

    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
