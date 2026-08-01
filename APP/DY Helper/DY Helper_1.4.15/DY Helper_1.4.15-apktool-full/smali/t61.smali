.class public final synthetic Lt61;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lt61;->ε:I

    .line 2
    .line 3
    iput-object p2, p0, Lt61;->ζ:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 2

    .line 1
    iget p1, p0, Lt61;->ε:I

    .line 2
    .line 3
    iget-object p0, p0, Lt61;->ζ:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Landroid/content/Context;

    .line 9
    .line 10
    const-string p1, "clipboard"

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    instance-of v0, p1, Landroid/content/ClipboardManager;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    check-cast p1, Landroid/content/ClipboardManager;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 p1, 0x0

    .line 24
    :goto_0
    if-eqz p1, :cond_1

    .line 25
    .line 26
    const-string v0, "DYHelper\u7fa4\u7ec4"

    .line 27
    .line 28
    const-string v1, "DYHelper\u7fa4\u7ec4https://t.me/MFDYHelper"

    .line 29
    .line 30
    invoke-static {v0, v1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {p1, v0}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    const-string p1, "\u7fa4\u7ec4\u94fe\u63a5\u5df2\u590d\u5236"

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 45
    .line 46
    .line 47
    :goto_1
    const/4 p0, 0x1

    .line 48
    return p0

    .line 49
    :pswitch_0
    check-cast p0, Lp70;

    .line 50
    .line 51
    invoke-interface {p0}, Lp70;->invoke()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :pswitch_1
    check-cast p0, Lp70;

    .line 56
    .line 57
    invoke-interface {p0}, Lp70;->invoke()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
