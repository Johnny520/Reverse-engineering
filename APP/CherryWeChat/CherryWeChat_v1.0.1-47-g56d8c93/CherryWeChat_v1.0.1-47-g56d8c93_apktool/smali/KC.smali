.class public final synthetic LKC;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LQC;


# direct methods
.method public synthetic constructor <init>(LQC;I)V
    .locals 0

    iput p2, p0, LKC;->a:I

    iput-object p1, p0, LKC;->b:LQC;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget v0, p0, LKC;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LKC;->b:LQC;

    const/4 v1, 0x0

    iput-boolean v1, v0, LQC;->j:Z

    return-void

    :pswitch_0
    iget-object v0, p0, LKC;->b:LQC;

    invoke-virtual {v0}, LQC;->i()V

    iget-object v1, v0, LQC;->e:Landroid/widget/EditText;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    const-wide v1, -0x1a6e8fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    :cond_1
    invoke-virtual {v0, v1}, LQC;->e(Ljava/lang/String;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
