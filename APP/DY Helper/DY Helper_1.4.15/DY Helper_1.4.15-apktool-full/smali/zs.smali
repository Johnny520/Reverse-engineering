.class public final synthetic Lzs;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/app/Activity;

.field public final synthetic η:Landroid/widget/LinearLayout;


# direct methods
.method public synthetic constructor <init>(ILandroid/app/Activity;Landroid/widget/LinearLayout;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lzs;->ε:I

    .line 5
    .line 6
    iput-object p2, p0, Lzs;->ζ:Landroid/app/Activity;

    .line 7
    .line 8
    iput-object p3, p0, Lzs;->η:Landroid/widget/LinearLayout;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    sget-object p1, Lct;->α:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    iget p1, p0, Lzs;->ε:I

    .line 4
    .line 5
    invoke-static {p1}, Lct;->β(I)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v1, "\u9ab0\u5b50\u5df2\u9501\u5b9a\u4e3a "

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string p1, " \u70b9"

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const/4 v0, 0x0

    .line 28
    iget-object v1, p0, Lzs;->ζ:Landroid/app/Activity;

    .line 29
    .line 30
    invoke-static {v1, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 35
    .line 36
    .line 37
    iget-object p0, p0, Lzs;->η:Landroid/widget/LinearLayout;

    .line 38
    .line 39
    :goto_0
    if-eqz p0, :cond_2

    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    instance-of p1, p1, Landroid/app/AlertDialog;

    .line 46
    .line 47
    if-eqz p1, :cond_0

    .line 48
    .line 49
    invoke-virtual {p0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    check-cast p0, Landroid/app/AlertDialog;

    .line 57
    .line 58
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    instance-of p1, p0, Landroid/view/View;

    .line 67
    .line 68
    if-eqz p1, :cond_1

    .line 69
    .line 70
    check-cast p0, Landroid/view/View;

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_1
    const/4 p0, 0x0

    .line 74
    goto :goto_0

    .line 75
    :cond_2
    :goto_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    new-instance p0, Ln9;

    .line 79
    .line 80
    const/4 p1, 0x4

    .line 81
    invoke-direct {p0, v1, p1}, Ln9;-><init>(Landroid/app/Activity;I)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, p0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 85
    .line 86
    .line 87
    return-void
.end method
