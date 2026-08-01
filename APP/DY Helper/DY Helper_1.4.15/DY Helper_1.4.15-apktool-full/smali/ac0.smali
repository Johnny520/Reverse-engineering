.class public final synthetic Lac0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ldc0;


# direct methods
.method public synthetic constructor <init>(Ldc0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lac0;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lac0;->ζ:Ldc0;

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
    iget p1, p0, Lac0;->ε:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lac0;->ζ:Ldc0;

    .line 7
    .line 8
    iget-boolean p1, p0, Ldc0;->υ:Z

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    iget-boolean p1, p0, Ldc0;->φ:Z

    .line 13
    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    iget-object p1, p0, Ldc0;->σ:Ljava/util/List;

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-nez p1, :cond_0

    .line 23
    .line 24
    iget-object p1, p0, Ldc0;->σ:Ljava/util/List;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Ldc0;->α(Ljava/util/List;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void

    .line 30
    :pswitch_0
    iget-object p0, p0, Lac0;->ζ:Ldc0;

    .line 31
    .line 32
    iget-boolean p1, p0, Ldc0;->υ:Z

    .line 33
    .line 34
    if-nez p1, :cond_1

    .line 35
    .line 36
    iget-boolean p1, p0, Ldc0;->φ:Z

    .line 37
    .line 38
    if-nez p1, :cond_1

    .line 39
    .line 40
    invoke-virtual {p0}, Ldc0;->ζ()V

    .line 41
    .line 42
    .line 43
    :cond_1
    return-void

    .line 44
    :pswitch_1
    iget-object p0, p0, Lac0;->ζ:Ldc0;

    .line 45
    .line 46
    iget-boolean p1, p0, Ldc0;->φ:Z

    .line 47
    .line 48
    if-eqz p1, :cond_2

    .line 49
    .line 50
    iget-object p0, p0, Ldc0;->α:Landroid/app/Activity;

    .line 51
    .line 52
    const-string p1, "\u5ba1\u6279\u5b8c\u6210\u5e76\u5237\u65b0\u540e\u5373\u53ef\u5173\u95ed"

    .line 53
    .line 54
    const/4 v0, 0x0

    .line 55
    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    iget-object p0, p0, Ldc0;->ξ:Landroid/app/AlertDialog;

    .line 64
    .line 65
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 66
    .line 67
    .line 68
    :goto_0
    return-void

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
