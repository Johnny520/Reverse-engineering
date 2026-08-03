.class public final synthetic La/oa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/widget/TextView;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Landroid/view/View;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Landroid/view/View;Landroid/widget/TextView;Ljava/lang/Object;I)V
    .locals 0

    iput p5, p0, La/oa;->a:I

    iput-object p1, p0, La/oa;->c:Ljava/lang/Object;

    iput-object p2, p0, La/oa;->d:Landroid/view/View;

    iput-object p3, p0, La/oa;->b:Landroid/widget/TextView;

    iput-object p4, p0, La/oa;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    iget p1, p0, La/oa;->a:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, La/oa;->c:Ljava/lang/Object;

    check-cast p1, La/Qc;

    iget-boolean v0, p1, La/Qc;->a:Z

    xor-int/lit8 v1, v0, 0x1

    iput-boolean v1, p1, La/Qc;->a:Z

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/16 v0, 0x8

    :goto_0
    iget-object v1, p0, La/oa;->d:Landroid/view/View;

    check-cast v1, Landroid/widget/ScrollView;

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-boolean p1, p1, La/Qc;->a:Z

    iget-object v0, p0, La/oa;->e:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    if-eqz p1, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    const-string v0, "\u25be \u6700\u8fd1\u4e8b\u4ef6\uff08"

    const-string v1, " \u6761\uff09\u70b9\u51fb\u6536\u8d77"

    :goto_1
    invoke-static {p1, v0, v1}, La/z;->c(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    const-string v0, "\u25b8 \u6700\u8fd1\u4e8b\u4ef6\uff08"

    const-string v1, " \u6761\uff09\u70b9\u51fb\u5c55\u5f00"

    goto :goto_1

    :goto_2
    iget-object v0, p0, La/oa;->b:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :pswitch_0
    iget-object p1, p0, La/oa;->d:Landroid/view/View;

    check-cast p1, Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, La/oa;->c:Ljava/lang/Object;

    check-cast v0, La/D7;

    invoke-interface {v0, p1}, La/D7;->f(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, La/oa;->b:Landroid/widget/TextView;

    const-string v0, "\u5df2\u4fdd\u5b58"

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    new-instance v0, La/M2;

    const/16 v1, 0xc

    invoke-direct {v0, v1, p1}, La/M2;-><init>(ILjava/lang/Object;)V

    const-wide/16 v1, 0x5dc

    invoke-virtual {p1, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    iget-object p1, p0, La/oa;->e:Ljava/lang/Object;

    check-cast p1, La/ra;

    iget-object p1, p1, La/ra;->a:Landroid/app/Activity;

    const-string v0, "\u4fdd\u5b58\u6210\u529f"

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
