.class public final synthetic Lc0/H0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lc0/I0;

.field public final synthetic c:Landroid/widget/EditText;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/EditText;I)V
    .locals 0

    iput p2, p0, Lc0/H0;->a:I

    packed-switch p2, :pswitch_data_0

    sget-object p2, Lc0/I0;->a:Lc0/I0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lc0/H0;->b:Lc0/I0;

    iput-object p1, p0, Lc0/H0;->c:Landroid/widget/EditText;

    return-void

    :pswitch_0
    sget-object p2, Lc0/I0;->a:Lc0/I0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lc0/H0;->b:Lc0/I0;

    iput-object p1, p0, Lc0/H0;->c:Landroid/widget/EditText;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget v0, p0, Lc0/H0;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "$this_runCatching"

    iget-object v1, p0, Lc0/H0;->b:Lc0/I0;

    invoke-static {v1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lc0/H0;->c:Landroid/widget/EditText;

    const-string v1, "$input"

    invoke-static {v0, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lc0/I0;->a(Landroid/view/View;)V

    return-void

    :pswitch_0
    const-string v0, "$this_runCatching"

    iget-object v1, p0, Lc0/H0;->b:Lc0/I0;

    invoke-static {v1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lc0/H0;->c:Landroid/widget/EditText;

    const-string v1, "$input"

    invoke-static {v0, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lc0/I0;->a(Landroid/view/View;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
