.class public final Lu8;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ll8;

.field public final synthetic b:Landroid/os/Handler;

.field public final synthetic c:Lx8;

.field public final synthetic d:Landroid/app/Dialog;

.field public final synthetic e:Lz8;

.field public final synthetic f:Landroid/widget/TextView;

.field public final synthetic g:Landroid/widget/ListView;

.field public final synthetic h:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Ll8;Landroid/os/Handler;Lx8;Landroid/app/Dialog;Lz8;Landroid/widget/TextView;Landroid/widget/ListView;Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu8;->a:Ll8;

    .line 5
    .line 6
    iput-object p2, p0, Lu8;->b:Landroid/os/Handler;

    .line 7
    .line 8
    iput-object p3, p0, Lu8;->c:Lx8;

    .line 9
    .line 10
    iput-object p4, p0, Lu8;->d:Landroid/app/Dialog;

    .line 11
    .line 12
    iput-object p5, p0, Lu8;->e:Lz8;

    .line 13
    .line 14
    iput-object p6, p0, Lu8;->f:Landroid/widget/TextView;

    .line 15
    .line 16
    iput-object p7, p0, Lu8;->g:Landroid/widget/ListView;

    .line 17
    .line 18
    iput-object p8, p0, Lu8;->h:Landroid/app/Activity;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    :try_start_0
    iget-object v0, p0, Lu8;->a:Ll8;

    .line 2
    .line 3
    invoke-static {v0}, Li5;->V0(Ll8;)Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lu8;->b:Landroid/os/Handler;

    .line 8
    .line 9
    new-instance v2, Lq;

    .line 10
    .line 11
    const/4 v3, 0x6

    .line 12
    const/4 v4, 0x0

    .line 13
    invoke-direct {v2, p0, v0, v3, v4}, Lq;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 17
    .line 18
    .line 19
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    iget-object v1, p0, Lu8;->a:Ll8;

    .line 21
    .line 22
    invoke-virtual {v1}, Ll8;->c()V

    .line 23
    .line 24
    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    :goto_0
    iget-object p0, p0, Lu8;->a:Ll8;

    .line 28
    .line 29
    invoke-static {p0}, La9;->a(Ll8;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :catchall_0
    move-exception v0

    .line 34
    :try_start_1
    iget-object v1, p0, Lu8;->a:Ll8;

    .line 35
    .line 36
    iget-boolean v1, v1, Ll8;->a:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 37
    .line 38
    if-eqz v1, :cond_0

    .line 39
    .line 40
    iget-object v0, p0, Lu8;->a:Ll8;

    .line 41
    .line 42
    invoke-virtual {v0}, Ll8;->c()V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    :try_start_2
    const-string v1, "kk-tts"

    .line 47
    .line 48
    const-string v2, "catalog"

    .line 49
    .line 50
    invoke-static {v1, v2, v0}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Lu8;->b:Landroid/os/Handler;

    .line 54
    .line 55
    new-instance v1, Lh0;

    .line 56
    .line 57
    const/4 v2, 0x4

    .line 58
    invoke-direct {v1, v2, p0}, Lh0;-><init>(ILjava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 62
    .line 63
    .line 64
    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 65
    iget-object v1, p0, Lu8;->a:Ll8;

    .line 66
    .line 67
    invoke-virtual {v1}, Ll8;->c()V

    .line 68
    .line 69
    .line 70
    if-nez v0, :cond_1

    .line 71
    .line 72
    iget-object p0, p0, Lu8;->a:Ll8;

    .line 73
    .line 74
    invoke-static {p0}, La9;->a(Ll8;)V

    .line 75
    .line 76
    .line 77
    :cond_1
    return-void

    .line 78
    :catchall_1
    move-exception v0

    .line 79
    iget-object v1, p0, Lu8;->a:Ll8;

    .line 80
    .line 81
    invoke-virtual {v1}, Ll8;->c()V

    .line 82
    .line 83
    .line 84
    iget-object p0, p0, Lu8;->a:Ll8;

    .line 85
    .line 86
    invoke-static {p0}, La9;->a(Ll8;)V

    .line 87
    .line 88
    .line 89
    throw v0
.end method
