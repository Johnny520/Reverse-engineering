.class public final synthetic Lk9/p;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;I)V
    .locals 0

    .line 1
    iput p2, p0, Lk9/p;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lk9/p;->h:Landroid/app/Activity;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lk9/p;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lk9/p;->h:Landroid/app/Activity;

    .line 7
    .line 8
    sget-object v1, Lk9/r;->g:Ljava/lang/ref/WeakReference;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    if-ne v1, v0, :cond_0

    .line 15
    .line 16
    invoke-static {v0}, La7/a;->l(Landroid/content/Context;)V

    .line 17
    .line 18
    .line 19
    sget-object v1, Lk9/r;->a:Lk9/r;

    .line 20
    .line 21
    invoke-static {v0}, Lk9/r;->e(Landroid/app/Activity;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 25
    .line 26
    return-object v0

    .line 27
    :pswitch_0
    iget-object v0, p0, Lk9/p;->h:Landroid/app/Activity;

    .line 28
    .line 29
    sget-object v1, Lk9/r;->a:Lk9/r;

    .line 30
    .line 31
    sget-boolean v1, Lk9/r;->e:Z

    .line 32
    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    sget-boolean v1, Lk9/r;->d:Z

    .line 36
    .line 37
    if-eqz v1, :cond_3

    .line 38
    .line 39
    invoke-static {v0}, Lk9/r;->q(Landroid/app/Activity;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    sget-object v1, Lk9/r;->g:Ljava/lang/ref/WeakReference;

    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    check-cast v1, Landroid/app/Activity;

    .line 53
    .line 54
    if-eqz v1, :cond_2

    .line 55
    .line 56
    if-eq v1, v0, :cond_2

    .line 57
    .line 58
    invoke-static {v1}, La7/a;->l(Landroid/content/Context;)V

    .line 59
    .line 60
    .line 61
    invoke-static {v1}, Lk9/r;->e(Landroid/app/Activity;)V

    .line 62
    .line 63
    .line 64
    :cond_2
    invoke-static {v0}, Lk9/r;->c(Landroid/app/Activity;)V

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_3
    :goto_0
    sget-object v1, Lk9/r;->g:Ljava/lang/ref/WeakReference;

    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    if-ne v1, v0, :cond_4

    .line 75
    .line 76
    invoke-static {v0}, Lk9/r;->q(Landroid/app/Activity;)Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-nez v0, :cond_6

    .line 81
    .line 82
    :cond_4
    sget-object v0, Lk9/r;->g:Ljava/lang/ref/WeakReference;

    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    check-cast v0, Landroid/app/Activity;

    .line 89
    .line 90
    if-eqz v0, :cond_5

    .line 91
    .line 92
    invoke-static {v0}, La7/a;->l(Landroid/content/Context;)V

    .line 93
    .line 94
    .line 95
    :cond_5
    const/4 v0, 0x0

    .line 96
    invoke-static {v0}, Lk9/r;->e(Landroid/app/Activity;)V

    .line 97
    .line 98
    .line 99
    :cond_6
    :goto_1
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 100
    .line 101
    return-object v0

    .line 102
    nop

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
