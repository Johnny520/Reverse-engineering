.class public final synthetic Ld0/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/widget/TextView;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/TextView;I)V
    .locals 0

    iput p2, p0, Ld0/k;->a:I

    iput-object p1, p0, Ld0/k;->b:Landroid/widget/TextView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget v0, p0, Ld0/k;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ld0/k;->b:Landroid/widget/TextView;

    invoke-static {v0}, LU/S;->f(Landroid/widget/TextView;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Ld0/k;->b:Landroid/widget/TextView;

    invoke-static {v0}, LU/S;->f(Landroid/widget/TextView;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Ld0/k;->b:Landroid/widget/TextView;

    invoke-static {v0}, LU/S;->f(Landroid/widget/TextView;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
