.class public final synthetic Lwb/sg;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lfg/a;

.field public final synthetic i:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lfg/a;Landroid/content/Context;I)V
    .locals 0

    .line 1
    iput p3, p0, Lwb/sg;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/sg;->h:Lfg/a;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/sg;->i:Landroid/content/Context;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lwb/sg;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/sg;->h:Lfg/a;

    .line 7
    .line 8
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    const-string v0, "\u540d\u5355\u5df2\u5220\u9664"

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    iget-object v2, p0, Lwb/sg;->i:Landroid/content/Context;

    .line 15
    .line 16
    invoke-static {v2, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 21
    .line 22
    .line 23
    :goto_0
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_0
    iget-object v0, p0, Lwb/sg;->h:Lfg/a;

    .line 27
    .line 28
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    const-string v0, "\u6a21\u677f\u5df2\u5220\u9664"

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    iget-object v2, p0, Lwb/sg;->i:Landroid/content/Context;

    .line 35
    .line 36
    invoke-static {v2, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :pswitch_1
    iget-object v0, p0, Lwb/sg;->h:Lfg/a;

    .line 45
    .line 46
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    const-string v0, "\u9002\u7528\u804a\u5929\u5df2\u79fb\u9664"

    .line 50
    .line 51
    const/4 v1, 0x0

    .line 52
    iget-object v2, p0, Lwb/sg;->i:Landroid/content/Context;

    .line 53
    .line 54
    invoke-static {v2, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :pswitch_2
    iget-object v0, p0, Lwb/sg;->h:Lfg/a;

    .line 63
    .line 64
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    const-string v0, "\u6a21\u677f\u5df2\u5220\u9664"

    .line 68
    .line 69
    const/4 v1, 0x0

    .line 70
    iget-object v2, p0, Lwb/sg;->i:Landroid/content/Context;

    .line 71
    .line 72
    invoke-static {v2, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    nop

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
