.class public final synthetic Lhb/y;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lhb/i0;

.field public final synthetic i:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic j:Lwb/kv;

.field public final synthetic k:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Lhb/i0;Ljava/util/concurrent/atomic/AtomicBoolean;Lwb/kv;Landroid/app/Activity;I)V
    .locals 0

    .line 1
    iput p5, p0, Lhb/y;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lhb/y;->h:Lhb/i0;

    .line 4
    .line 5
    iput-object p2, p0, Lhb/y;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 6
    .line 7
    iput-object p3, p0, Lhb/y;->j:Lwb/kv;

    .line 8
    .line 9
    iput-object p4, p0, Lhb/y;->k:Landroid/app/Activity;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lhb/y;->g:I

    .line 2
    .line 3
    check-cast p1, Ljava/lang/Integer;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result v4

    .line 9
    check-cast p2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v5

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
    iget-object v6, p0, Lhb/y;->h:Lhb/i0;

    .line 25
    .line 26
    iget-object p1, v6, Lhb/i0;->c:Landroid/os/Handler;

    .line 27
    .line 28
    new-instance v0, Lhb/b0;

    .line 29
    .line 30
    const/4 v8, 0x0

    .line 31
    iget-object v1, p0, Lhb/y;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 32
    .line 33
    iget-object v2, p0, Lhb/y;->j:Lwb/kv;

    .line 34
    .line 35
    iget-object v7, p0, Lhb/y;->k:Landroid/app/Activity;

    .line 36
    .line 37
    invoke-direct/range {v0 .. v8}, Lhb/b0;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;Lwb/kv;ZIILhb/i0;Landroid/app/Activity;I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 41
    .line 42
    .line 43
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 44
    .line 45
    return-object p1

    .line 46
    :pswitch_0
    iget-object v6, p0, Lhb/y;->h:Lhb/i0;

    .line 47
    .line 48
    iget-object p1, v6, Lhb/i0;->c:Landroid/os/Handler;

    .line 49
    .line 50
    new-instance v0, Lhb/b0;

    .line 51
    .line 52
    const/4 v8, 0x1

    .line 53
    iget-object v1, p0, Lhb/y;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 54
    .line 55
    iget-object v2, p0, Lhb/y;->j:Lwb/kv;

    .line 56
    .line 57
    iget-object v7, p0, Lhb/y;->k:Landroid/app/Activity;

    .line 58
    .line 59
    invoke-direct/range {v0 .. v8}, Lhb/b0;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;Lwb/kv;ZIILhb/i0;Landroid/app/Activity;I)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    nop

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
