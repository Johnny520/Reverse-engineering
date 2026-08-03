.class public final LDo;
.super Landroid/database/DataSetObserver;
.source ""


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    iput p1, p0, LDo;->a:I

    iput-object p2, p0, LDo;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onChanged()V
    .locals 2

    iget v0, p0, LDo;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LDo;->b:Ljava/lang/Object;

    check-cast v0, LFE;

    invoke-virtual {v0}, LFE;->e()V

    return-void

    :pswitch_0
    iget-object v0, p0, LDo;->b:Ljava/lang/Object;

    check-cast v0, LGo;

    iget-object v1, v0, LGo;->z:LO3;

    invoke-virtual {v1}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, LGo;->c()V

    :cond_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onInvalidated()V
    .locals 1

    iget v0, p0, LDo;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LDo;->b:Ljava/lang/Object;

    check-cast v0, LFE;

    invoke-virtual {v0}, LFE;->e()V

    return-void

    :pswitch_0
    iget-object v0, p0, LDo;->b:Ljava/lang/Object;

    check-cast v0, LGo;

    invoke-virtual {v0}, LGo;->dismiss()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
