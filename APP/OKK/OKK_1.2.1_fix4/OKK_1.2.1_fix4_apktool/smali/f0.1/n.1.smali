.class public final synthetic Lf0/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/widget/Switch;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/Switch;I)V
    .locals 0

    iput p2, p0, Lf0/n;->a:I

    iput-object p1, p0, Lf0/n;->b:Landroid/widget/Switch;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget p1, p0, Lf0/n;->a:I

    packed-switch p1, :pswitch_data_0

    const-string p1, "$sw"

    iget-object v0, p0, Lf0/n;->b:Landroid/widget/Switch;

    invoke-static {v0, p1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/widget/Switch;->toggle()V

    return-void

    :pswitch_0
    const-string p1, "$sw"

    iget-object v0, p0, Lf0/n;->b:Landroid/widget/Switch;

    invoke-static {v0, p1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/widget/Switch;->toggle()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
