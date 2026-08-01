.class public final Lfm;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;I)V
    .locals 0

    .line 1
    iput p2, p0, Lfm;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lfm;->b:Landroid/view/View;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private final a(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 2

    .line 1
    iget v0, p0, Lfm;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "mQ==\n"

    .line 7
    .line 8
    const-string v1, "7xCjbHIijUA=\n"

    .line 9
    .line 10
    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0, p1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    iget-object p1, p0, Lfm;->b:Landroid/view/View;

    .line 19
    .line 20
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 21
    .line 22
    .line 23
    sget-object v0, Loa0;->a:Ljava/util/WeakHashMap;

    .line 24
    .line 25
    invoke-static {p1}, Lba0;->c(Landroid/view/View;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 3

    .line 1
    iget v0, p0, Lfm;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "wg==\n"

    .line 7
    .line 8
    const-string v1, "tDWJv2m5r94=\n"

    .line 9
    .line 10
    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0, p1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    const v0, 0x7e110001

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    instance-of v1, v0, Lo40;

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    check-cast v0, Lo40;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move-object v0, v2

    .line 33
    :goto_0
    if-eqz v0, :cond_1

    .line 34
    .line 35
    invoke-virtual {v0}, Lo40;->c()V

    .line 36
    .line 37
    .line 38
    :cond_1
    const v0, 0x7e110002

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    instance-of v0, p1, Lo40;

    .line 46
    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    check-cast p1, Lo40;

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    move-object p1, v2

    .line 53
    :goto_1
    if-eqz p1, :cond_3

    .line 54
    .line 55
    invoke-virtual {p1}, Lo40;->c()V

    .line 56
    .line 57
    .line 58
    :cond_3
    iget-object p1, p0, Lfm;->b:Landroid/view/View;

    .line 59
    .line 60
    if-eqz p1, :cond_7

    .line 61
    .line 62
    const v0, 0x7e110003

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    instance-of v1, v0, Lo40;

    .line 70
    .line 71
    if-eqz v1, :cond_4

    .line 72
    .line 73
    check-cast v0, Lo40;

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_4
    move-object v0, v2

    .line 77
    :goto_2
    if-eqz v0, :cond_5

    .line 78
    .line 79
    invoke-virtual {v0}, Lo40;->c()V

    .line 80
    .line 81
    .line 82
    :cond_5
    const v0, 0x7e110004

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    instance-of v0, p1, Lo40;

    .line 90
    .line 91
    if-eqz v0, :cond_6

    .line 92
    .line 93
    move-object v2, p1

    .line 94
    check-cast v2, Lo40;

    .line 95
    .line 96
    :cond_6
    if-eqz v2, :cond_7

    .line 97
    .line 98
    invoke-virtual {v2}, Lo40;->c()V

    .line 99
    .line 100
    .line 101
    :cond_7
    :pswitch_0
    return-void

    .line 102
    nop

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
