.class public final synthetic LMd;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    iput p1, p0, LMd;->a:I

    iput-object p2, p0, LMd;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 5

    iget v0, p0, LMd;->a:I

    const/4 v1, 0x1

    iget-object v2, p0, LMd;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v2, LQC;

    iget-object v0, v2, LQC;->k:LDC;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_5

    if-ne v0, v1, :cond_4

    if-eqz p2, :cond_3

    if-eq p2, v1, :cond_2

    const/4 v0, 0x2

    if-eq p2, v0, :cond_1

    const/4 v0, 0x3

    if-eq p2, v0, :cond_0

    sget-object p2, LLC;->b:LLC;

    goto :goto_0

    :cond_0
    sget-object p2, LLC;->a:LLC;

    goto :goto_0

    :cond_1
    sget-object p2, LLC;->d:LLC;

    goto :goto_0

    :cond_2
    sget-object p2, LLC;->e:LLC;

    goto :goto_0

    :cond_3
    sget-object p2, LLC;->c:LLC;

    goto :goto_0

    :cond_4
    new-instance p1, LFa;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :cond_5
    if-eqz p2, :cond_7

    if-eq p2, v1, :cond_6

    sget-object p2, LLC;->b:LLC;

    goto :goto_0

    :cond_6
    sget-object p2, LLC;->a:LLC;

    goto :goto_0

    :cond_7
    sget-object p2, LLC;->c:LLC;

    :goto_0
    iput-object p2, v2, LQC;->o:LLC;

    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    iget-object p1, v2, LQC;->e:Landroid/widget/EditText;

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_9

    :cond_8
    const-wide p1, -0x1b8bbfffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    :cond_9
    invoke-virtual {v2, p1}, LQC;->e(Ljava/lang/String;)V

    return-void

    :pswitch_0
    check-cast v2, Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/app/Activity;->finish()V

    return-void

    :pswitch_1
    check-cast v2, Ldq;

    sget-object p1, LNx;->a:Landroid/content/SharedPreferences;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v3, -0x2ebe9fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, v2, Ldq;->a:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide v2, -0x2ebf7fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, LNx;->c(Ljava/lang/String;Z)V

    return-void

    :pswitch_2
    check-cast v2, LF7;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v2, p2}, LF7;->g(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
