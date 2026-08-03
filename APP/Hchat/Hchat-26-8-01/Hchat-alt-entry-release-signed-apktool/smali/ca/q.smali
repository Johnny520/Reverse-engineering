.class public final synthetic Lca/q;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lca/e0;

.field public final synthetic i:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic j:Lwb/kv;

.field public final synthetic k:Ljava/lang/String;

.field public final synthetic l:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Lca/e0;Ljava/util/concurrent/atomic/AtomicBoolean;Lwb/kv;Ljava/lang/String;Landroid/app/Activity;I)V
    .locals 0

    .line 1
    iput p6, p0, Lca/q;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lca/q;->h:Lca/e0;

    .line 4
    .line 5
    iput-object p2, p0, Lca/q;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 6
    .line 7
    iput-object p3, p0, Lca/q;->j:Lwb/kv;

    .line 8
    .line 9
    iput-object p4, p0, Lca/q;->k:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p5, p0, Lca/q;->l:Landroid/app/Activity;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lca/q;->g:I

    .line 2
    .line 3
    check-cast p1, Ljava/lang/Integer;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result v5

    .line 9
    check-cast p2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v6

    .line 15
    check-cast p3, Ljava/lang/Boolean;

    .line 16
    .line 17
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    packed-switch v0, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    iget-object v7, p0, Lca/q;->h:Lca/e0;

    .line 25
    .line 26
    iget-object p1, v7, Lca/e0;->d:Landroid/os/Handler;

    .line 27
    .line 28
    new-instance v0, Lca/v;

    .line 29
    .line 30
    const/4 v9, 0x1

    .line 31
    iget-object v1, p0, Lca/q;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 32
    .line 33
    iget-object v2, p0, Lca/q;->j:Lwb/kv;

    .line 34
    .line 35
    iget-object v4, p0, Lca/q;->k:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v8, p0, Lca/q;->l:Landroid/app/Activity;

    .line 38
    .line 39
    invoke-direct/range {v0 .. v9}, Lca/v;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;Lwb/kv;ZLjava/lang/String;IILca/e0;Landroid/app/Activity;I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 43
    .line 44
    .line 45
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 46
    .line 47
    return-object p1

    .line 48
    :pswitch_0
    iget-object v7, p0, Lca/q;->h:Lca/e0;

    .line 49
    .line 50
    iget-object p1, v7, Lca/e0;->d:Landroid/os/Handler;

    .line 51
    .line 52
    new-instance v0, Lca/v;

    .line 53
    .line 54
    const/4 v9, 0x0

    .line 55
    iget-object v1, p0, Lca/q;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 56
    .line 57
    iget-object v2, p0, Lca/q;->j:Lwb/kv;

    .line 58
    .line 59
    iget-object v4, p0, Lca/q;->k:Ljava/lang/String;

    .line 60
    .line 61
    iget-object v8, p0, Lca/q;->l:Landroid/app/Activity;

    .line 62
    .line 63
    invoke-direct/range {v0 .. v9}, Lca/v;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;Lwb/kv;ZLjava/lang/String;IILca/e0;Landroid/app/Activity;I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    nop

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
