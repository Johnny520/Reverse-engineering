.class public final synthetic La/O9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    iput p1, p0, La/O9;->a:I

    iput-object p2, p0, La/O9;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    iget p1, p0, La/O9;->a:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, La/O9;->b:Ljava/lang/Object;

    check-cast p1, Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, La/Be;->V(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, La/Be;->P(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_2

    sget-object p2, La/K3;->a:La/K3$a;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->c()Ljava/util/LinkedHashSet;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {p2}, La/K3$a;->r(Ljava/util/Set;)V

    :cond_0
    invoke-static {}, La/m8$a;->b()V

    invoke-static {}, La/m8$a;->a()V

    sget-object p1, La/m8;->l:La/m8;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, La/m8;->s()V

    :cond_1
    sget-object p1, La/m8;->l:La/m8;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, La/m8;->r()V

    :cond_2
    return-void

    :pswitch_0
    sget-object p1, La/K3;->a:La/K3$a;

    sget-object p2, La/Y5;->a:La/Y5;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p2}, La/K3$a;->s(Ljava/util/List;)V

    iget-object p1, p0, La/O9;->b:Ljava/lang/Object;

    check-cast p1, La/n5;

    invoke-virtual {p1}, La/n5;->a()Ljava/lang/Object;

    return-void

    :pswitch_1
    iget-object p1, p0, La/O9;->b:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    sget-object p2, La/K3;->a:La/K3$a;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->c()Ljava/util/LinkedHashSet;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {p2}, La/K3$a;->r(Ljava/util/Set;)V

    :cond_3
    sget-object p1, La/w1;->p:Landroid/content/Context;

    if-nez p1, :cond_4

    goto :goto_0

    :cond_4
    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object p2

    iget-boolean v0, p2, La/jc;->R:Z

    if-eqz v0, :cond_6

    iget-object p2, p2, La/jc;->V:Ljava/lang/String;

    invoke-static {p2}, La/Be;->P(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string p2, "\u523b\u821f\u6c42\u5251"

    :cond_5
    const/4 v0, 0x0

    invoke-static {p1, p2, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    :cond_6
    :goto_0
    invoke-static {}, La/m8$a;->b()V

    invoke-static {}, La/m8$a;->a()V

    sget-object p1, La/m8;->l:La/m8;

    if-eqz p1, :cond_7

    invoke-virtual {p1}, La/m8;->s()V

    :cond_7
    sget-object p1, La/m8;->l:La/m8;

    if-eqz p1, :cond_8

    invoke-virtual {p1}, La/m8;->r()V

    :cond_8
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
