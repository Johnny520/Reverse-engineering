.class public final synthetic Lwb/pu;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lfg/a;

.field public final synthetic i:Landroid/app/Activity;

.field public final synthetic j:Lfg/l;

.field public final synthetic k:I


# direct methods
.method public synthetic constructor <init>(Lfg/a;Landroid/app/Activity;Lfg/l;II)V
    .locals 0

    .line 1
    iput p5, p0, Lwb/pu;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/pu;->h:Lfg/a;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/pu;->i:Landroid/app/Activity;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/pu;->j:Lfg/l;

    .line 8
    .line 9
    iput p4, p0, Lwb/pu;->k:I

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lwb/pu;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/pu;->h:Lfg/a;

    .line 7
    .line 8
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    new-instance v0, Lwb/wg;

    .line 12
    .line 13
    const/16 v1, 0x9

    .line 14
    .line 15
    iget v2, p0, Lwb/pu;->k:I

    .line 16
    .line 17
    iget-object v3, p0, Lwb/pu;->j:Lfg/l;

    .line 18
    .line 19
    invoke-direct {v0, v2, v1, v3}, Lwb/wg;-><init>(IILfg/l;)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lwb/pu;->i:Landroid/app/Activity;

    .line 23
    .line 24
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    new-instance v3, Lwb/vu;

    .line 37
    .line 38
    invoke-direct {v3, v1, v0}, Lwb/vu;-><init>(Landroid/app/Activity;Lfg/a;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2, v3}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 42
    .line 43
    .line 44
    :cond_0
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 45
    .line 46
    return-object v0

    .line 47
    :pswitch_0
    iget-object v0, p0, Lwb/pu;->h:Lfg/a;

    .line 48
    .line 49
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    new-instance v0, Lwb/wg;

    .line 53
    .line 54
    const/16 v1, 0x8

    .line 55
    .line 56
    iget v2, p0, Lwb/pu;->k:I

    .line 57
    .line 58
    iget-object v3, p0, Lwb/pu;->j:Lfg/l;

    .line 59
    .line 60
    invoke-direct {v0, v2, v1, v3}, Lwb/wg;-><init>(IILfg/l;)V

    .line 61
    .line 62
    .line 63
    iget-object v1, p0, Lwb/pu;->i:Landroid/app/Activity;

    .line 64
    .line 65
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    if-eqz v2, :cond_1

    .line 70
    .line 71
    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    if-eqz v2, :cond_1

    .line 76
    .line 77
    new-instance v3, Lwb/vu;

    .line 78
    .line 79
    invoke-direct {v3, v1, v0}, Lwb/vu;-><init>(Landroid/app/Activity;Lfg/a;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v3}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 83
    .line 84
    .line 85
    :cond_1
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 86
    .line 87
    return-object v0

    .line 88
    nop

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
