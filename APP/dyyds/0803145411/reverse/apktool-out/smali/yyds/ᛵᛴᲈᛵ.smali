.class public final Lyyds/ᛵᛴᲈᛵ;
.super Landroid/content/BroadcastReceiver;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final synthetic ᛲᲈᲁ:I

.field public final synthetic ᛵᛸᛸᛷ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lyyds/ᛵᛴᲈᛵ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    iput-object p2, p0, Lyyds/ᛵᛴᲈᛵ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 1
    iget p1, p0, Lyyds/ᛵᛴᲈᛵ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    :goto_0
    const-wide v0, -0x2b121e68a836eL

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-static {p1, p2}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    sget-object p1, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 30
    .line 31
    const-wide v0, -0x2b152e68a836eL

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-virtual {p1, p2}, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    sget-object p1, Lyyds/ᛵᲇᛵᛱ;->ᛲᲈᲁ:Lyyds/ᛵᲇᛵᛱ;

    .line 44
    .line 45
    const/4 p1, 0x1

    .line 46
    sput-boolean p1, Lyyds/ᛵᲇᛵᛱ;->ᛵᛸᛸᛷ:Z

    .line 47
    .line 48
    iget-object p0, p0, Lyyds/ᛵᛴᲈᛵ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p0, Landroid/app/NotificationManager;

    .line 51
    .line 52
    const/16 p1, 0x3e9

    .line 53
    .line 54
    invoke-virtual {p0, p1}, Landroid/app/NotificationManager;->cancel(I)V

    .line 55
    .line 56
    .line 57
    const-wide p0, -0x2b15be68a836eL

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-static {p0}, Lyyds/ᲀᛳᛳᛱ;->ᲀᛲᛲᲇ(Ljava/lang/CharSequence;)V

    .line 67
    .line 68
    .line 69
    :cond_1
    return-void

    .line 70
    :pswitch_0
    iget-object p0, p0, Lyyds/ᛵᛴᲈᛵ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p0, Lyyds/ᲁᲀᛶᲈ;

    .line 73
    .line 74
    invoke-virtual {p0}, Lyyds/ᲁᲀᛶᲈ;->ᛶᛷᛲᲁ()V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    nop

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
