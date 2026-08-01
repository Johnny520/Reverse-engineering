.class public final synthetic Lt1;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Landroid/app/Activity;

.field public final synthetic b:Le2;

.field public final synthetic c:Landroid/widget/EditText;

.field public final synthetic d:Landroid/widget/EditText;

.field public final synthetic e:Landroid/app/Dialog;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Ljava/lang/ClassLoader;Lpd;Le2;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/app/Dialog;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lt1;->a:Landroid/app/Activity;

    .line 5
    .line 6
    iput-object p4, p0, Lt1;->b:Le2;

    .line 7
    .line 8
    iput-object p5, p0, Lt1;->c:Landroid/widget/EditText;

    .line 9
    .line 10
    iput-object p6, p0, Lt1;->d:Landroid/widget/EditText;

    .line 11
    .line 12
    iput-object p7, p0, Lt1;->e:Landroid/app/Dialog;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 6

    .line 1
    iget-object p1, p0, Lt1;->a:Landroid/app/Activity;

    .line 2
    .line 3
    iget-object v0, p0, Lt1;->b:Le2;

    .line 4
    .line 5
    iget-object v1, p0, Lt1;->c:Landroid/widget/EditText;

    .line 6
    .line 7
    iget-object v2, p0, Lt1;->d:Landroid/widget/EditText;

    .line 8
    .line 9
    iget-object p0, p0, Lt1;->e:Landroid/app/Dialog;

    .line 10
    .line 11
    new-instance v3, Lf2;

    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    const-string v5, ""

    .line 18
    .line 19
    if-nez v4, :cond_0

    .line 20
    .line 21
    move-object v1, v5

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    :goto_0
    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    if-nez v4, :cond_1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    :goto_1
    invoke-direct {v3, p1, v0, v1, v5}, Lf2;-><init>(Landroid/app/Activity;Le2;Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    sput-object v3, Lg2;->h:Lf2;

    .line 50
    .line 51
    new-instance v1, Landroid/content/Intent;

    .line 52
    .line 53
    const-string v2, "android.intent.action.OPEN_DOCUMENT"

    .line 54
    .line 55
    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    const-string v2, "android.intent.category.OPENABLE"

    .line 59
    .line 60
    invoke-virtual {v1, v2}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 61
    .line 62
    .line 63
    const-string v2, "image/*"

    .line 64
    .line 65
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 66
    .line 67
    .line 68
    const-string v2, "image/gif"

    .line 69
    .line 70
    const-string v3, "image/webp"

    .line 71
    .line 72
    const-string v4, "image/jpeg"

    .line 73
    .line 74
    const-string v5, "image/png"

    .line 75
    .line 76
    filled-new-array {v4, v5, v2, v3}, [Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    const-string v3, "android.intent.extra.MIME_TYPES"

    .line 81
    .line 82
    invoke-virtual {v1, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    .line 83
    .line 84
    .line 85
    :try_start_0
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 86
    .line 87
    .line 88
    const/16 p0, 0x2057

    .line 89
    .line 90
    invoke-virtual {p1, v1, p0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :catchall_0
    const/4 p0, 0x0

    .line 95
    sput-object p0, Lg2;->h:Lf2;

    .line 96
    .line 97
    const-string p0, "\u65e0\u6cd5\u6253\u5f00\u56fe\u7247\u9009\u62e9\u5668"

    .line 98
    .line 99
    invoke-static {v0, p0}, Lg2;->m(Le2;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    return-void
.end method
