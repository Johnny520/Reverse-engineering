.class public final synthetic La/ma;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:La/ra;


# direct methods
.method public synthetic constructor <init>(La/ra;I)V
    .locals 0

    iput p2, p0, La/ma;->a:I

    iput-object p1, p0, La/ma;->b:La/ra;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget v0, p0, La/ma;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La/ma;->b:La/ra;

    iget-object v0, v0, La/ra;->a:Landroid/app/Activity;

    const-string v1, "\u7b26\u53f7\u5b9a\u4f4d\u5931\u8d25\u6216 mp0 \u7c7b\u4e0d\u5b58\u5728"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    return-void

    :pswitch_0
    iget-object v0, p0, La/ma;->b:La/ra;

    iget-object v1, v0, La/ra;->h:Landroid/widget/Switch;

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    sget-object v2, La/K3;->a:La/K3$a;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v2

    iget-boolean v2, v2, La/jc;->t:Z

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    invoke-static {}, La/x8;->a()Z

    move-result v2

    if-nez v2, :cond_1

    move v2, v4

    goto :goto_0

    :cond_1
    move v2, v3

    :goto_0
    invoke-virtual {v1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v5

    if-eq v5, v2, :cond_2

    iput-boolean v4, v0, La/ra;->i:Z

    invoke-virtual {v1, v2}, Landroid/widget/Switch;->setChecked(Z)V

    iput-boolean v3, v0, La/ra;->i:Z

    :cond_2
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
