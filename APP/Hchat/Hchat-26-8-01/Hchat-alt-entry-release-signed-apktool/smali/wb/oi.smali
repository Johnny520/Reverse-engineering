.class public final synthetic Lwb/oi;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/Context;

.field public final synthetic i:Landroid/content/SharedPreferences;

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Li0/a1;I)V
    .locals 0

    .line 1
    iput p5, p0, Lwb/oi;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/oi;->h:Landroid/content/Context;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/oi;->i:Landroid/content/SharedPreferences;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/oi;->j:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p4, p0, Lwb/oi;->k:Li0/a1;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lwb/oi;->g:I

    .line 2
    .line 3
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "\u94c3\u58f0\u5df2\u4fdd\u5b58"

    .line 7
    .line 8
    iget-object v4, p0, Lwb/oi;->k:Li0/a1;

    .line 9
    .line 10
    iget-object v5, p0, Lwb/oi;->j:Ljava/lang/String;

    .line 11
    .line 12
    iget-object v6, p0, Lwb/oi;->i:Landroid/content/SharedPreferences;

    .line 13
    .line 14
    iget-object v7, p0, Lwb/oi;->h:Landroid/content/Context;

    .line 15
    .line 16
    check-cast p1, Ljava/lang/String;

    .line 17
    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    sget-object v0, Le9/q;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 25
    .line 26
    invoke-static {v7, p1}, Le9/q;->h(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-interface {v4, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-interface {v6}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, Ljava/lang/String;

    .line 42
    .line 43
    invoke-interface {p1, v5, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 48
    .line 49
    .line 50
    invoke-static {v7, v3, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 55
    .line 56
    .line 57
    return-object v1

    .line 58
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    sget-object v0, Le9/q;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 62
    .line 63
    invoke-static {v7, p1}, Le9/q;->h(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-interface {v4, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    invoke-interface {v6}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    check-cast v0, Ljava/lang/String;

    .line 79
    .line 80
    invoke-interface {p1, v5, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 85
    .line 86
    .line 87
    invoke-static {v7, v3, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 92
    .line 93
    .line 94
    return-object v1

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
