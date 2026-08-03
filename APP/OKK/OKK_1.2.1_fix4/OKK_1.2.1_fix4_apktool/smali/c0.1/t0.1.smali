.class public final synthetic Lc0/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;I)V
    .locals 0

    iput p2, p0, Lc0/t0;->a:I

    iput-object p1, p0, Lc0/t0;->b:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    const-string p1, "$activity"

    iget-object v0, p0, Lc0/t0;->b:Landroid/app/Activity;

    iget v1, p0, Lc0/t0;->a:I

    packed-switch v1, :pswitch_data_0

    invoke-static {v0, p1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lc0/D0;->a:Lc0/D0;

    invoke-static {v0}, Lc0/D0;->l(Landroid/app/Activity;)V

    return-void

    :pswitch_0
    invoke-static {v0, p1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lc0/D0;->a:Lc0/D0;

    invoke-static {v0}, Lc0/D0;->l(Landroid/app/Activity;)V

    return-void

    :pswitch_1
    invoke-static {v0, p1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, LU/S;->u0(Landroid/app/Activity;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
