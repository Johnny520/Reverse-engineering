.class public final synthetic La/ga;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:La/ra;


# direct methods
.method public synthetic constructor <init>(La/ra;I)V
    .locals 0

    iput p2, p0, La/ga;->a:I

    iput-object p1, p0, La/ga;->b:La/ra;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    iget p1, p0, La/ga;->a:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, La/ga;->b:La/ra;

    invoke-virtual {p1}, La/ra;->g()V

    return-void

    :pswitch_0
    iget-object p1, p0, La/ga;->b:La/ra;

    iget-object p1, p1, La/ra;->a:Landroid/app/Activity;

    new-instance v0, Landroid/content/Intent;

    const-string v1, "https://t.me/tkwx123"

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v0, v2, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
