.class public final synthetic Lva/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/app/Activity;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p3, p0, Lva/a;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lva/a;->b:Landroid/app/Activity;

    .line 4
    .line 5
    iput-object p2, p0, Lva/a;->c:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget p1, p0, Lva/a;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string p1, "clipboard"

    .line 7
    .line 8
    iget-object v0, p0, Lva/a;->b:Landroid/app/Activity;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    instance-of v1, p1, Landroid/content/ClipboardManager;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    check-cast p1, Landroid/content/ClipboardManager;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    :goto_0
    if-eqz p1, :cond_1

    .line 23
    .line 24
    const-string v1, "ID"

    .line 25
    .line 26
    iget-object v2, p0, Lva/a;->c:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {v1, v2}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {p1, v1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    const-string p1, "\u5df2\u590d\u5236ID"

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    invoke-static {v0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :pswitch_0
    const-string p1, "clipboard"

    .line 47
    .line 48
    iget-object v0, p0, Lva/a;->b:Landroid/app/Activity;

    .line 49
    .line 50
    invoke-virtual {v0, p1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    instance-of v1, p1, Landroid/content/ClipboardManager;

    .line 55
    .line 56
    if-eqz v1, :cond_2

    .line 57
    .line 58
    check-cast p1, Landroid/content/ClipboardManager;

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    const/4 p1, 0x0

    .line 62
    :goto_1
    if-eqz p1, :cond_3

    .line 63
    .line 64
    const-string v1, "ID"

    .line 65
    .line 66
    iget-object v2, p0, Lva/a;->c:Ljava/lang/String;

    .line 67
    .line 68
    invoke-static {v1, v2}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {p1, v1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 73
    .line 74
    .line 75
    :cond_3
    const-string p1, "\u5df2\u590d\u5236ID"

    .line 76
    .line 77
    const/4 v1, 0x0

    .line 78
    invoke-static {v0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :pswitch_1
    const-string p1, "clipboard"

    .line 87
    .line 88
    iget-object v0, p0, Lva/a;->b:Landroid/app/Activity;

    .line 89
    .line 90
    invoke-virtual {v0, p1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    instance-of v1, p1, Landroid/content/ClipboardManager;

    .line 95
    .line 96
    if-eqz v1, :cond_4

    .line 97
    .line 98
    check-cast p1, Landroid/content/ClipboardManager;

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_4
    const/4 p1, 0x0

    .line 102
    :goto_2
    if-eqz p1, :cond_5

    .line 103
    .line 104
    const-string v1, "ID"

    .line 105
    .line 106
    iget-object v2, p0, Lva/a;->c:Ljava/lang/String;

    .line 107
    .line 108
    invoke-static {v1, v2}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-virtual {p1, v1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 113
    .line 114
    .line 115
    :cond_5
    const-string p1, "\u5df2\u590d\u5236ID"

    .line 116
    .line 117
    const/4 v1, 0x0

    .line 118
    invoke-static {v0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    nop

    .line 127
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
