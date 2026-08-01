.class public final synthetic Lε;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lcom/example/dyhelper/ui/AboutActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/example/dyhelper/ui/AboutActivity;I)V
    .locals 0

    .line 1
    iput p2, p0, Lε;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lε;->ζ:Lcom/example/dyhelper/ui/AboutActivity;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget p1, p0, Lε;->ε:I

    .line 2
    .line 3
    iget-object p0, p0, Lε;->ζ:Lcom/example/dyhelper/ui/AboutActivity;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget p1, Lcom/example/dyhelper/ui/AboutActivity;->ζ:I

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    sget p1, Lcom/example/dyhelper/ui/AboutActivity;->ζ:I

    .line 15
    .line 16
    :try_start_0
    new-instance p1, Landroid/content/Intent;

    .line 17
    .line 18
    const-string v0, "android.intent.action.VIEW"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const-string v0, "https://t.me/MFDYHelper"

    .line 24
    .line 25
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catch_0
    const-string p1, "\u65e0\u6cd5\u6253\u5f00\u94fe\u63a5"

    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 44
    .line 45
    .line 46
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
