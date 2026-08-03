.class public final synthetic Lca/p;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic i:Lgg/u;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/atomic/AtomicBoolean;Lgg/u;I)V
    .locals 0

    .line 1
    iput p3, p0, Lca/p;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lca/p;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    iput-object p2, p0, Lca/p;->i:Lgg/u;

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
    .locals 1

    .line 1
    iget v0, p0, Lca/p;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lca/p;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lca/p;->i:Lgg/u;

    .line 15
    .line 16
    iget-object v0, v0, Lgg/u;->g:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lhb/s;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0}, Lhb/s;->a()V

    .line 23
    .line 24
    .line 25
    :cond_0
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 26
    .line 27
    return-object v0

    .line 28
    :pswitch_0
    iget-object v0, p0, Lca/p;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    iget-object v0, p0, Lca/p;->i:Lgg/u;

    .line 37
    .line 38
    iget-object v0, v0, Lgg/u;->g:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Lhb/s;

    .line 41
    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    invoke-virtual {v0}, Lhb/s;->a()V

    .line 45
    .line 46
    .line 47
    :cond_1
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 48
    .line 49
    return-object v0

    .line 50
    :pswitch_1
    iget-object v0, p0, Lca/p;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-nez v0, :cond_2

    .line 57
    .line 58
    iget-object v0, p0, Lca/p;->i:Lgg/u;

    .line 59
    .line 60
    iget-object v0, v0, Lgg/u;->g:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v0, Lhb/s;

    .line 63
    .line 64
    if-eqz v0, :cond_2

    .line 65
    .line 66
    invoke-virtual {v0}, Lhb/s;->a()V

    .line 67
    .line 68
    .line 69
    :cond_2
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 70
    .line 71
    return-object v0

    .line 72
    :pswitch_2
    iget-object v0, p0, Lca/p;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-nez v0, :cond_3

    .line 79
    .line 80
    iget-object v0, p0, Lca/p;->i:Lgg/u;

    .line 81
    .line 82
    iget-object v0, v0, Lgg/u;->g:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v0, Lhb/s;

    .line 85
    .line 86
    if-eqz v0, :cond_3

    .line 87
    .line 88
    invoke-virtual {v0}, Lhb/s;->a()V

    .line 89
    .line 90
    .line 91
    :cond_3
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 92
    .line 93
    return-object v0

    .line 94
    :pswitch_3
    iget-object v0, p0, Lca/p;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-nez v0, :cond_4

    .line 101
    .line 102
    iget-object v0, p0, Lca/p;->i:Lgg/u;

    .line 103
    .line 104
    iget-object v0, v0, Lgg/u;->g:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v0, Lhb/s;

    .line 107
    .line 108
    if-eqz v0, :cond_4

    .line 109
    .line 110
    invoke-virtual {v0}, Lhb/s;->a()V

    .line 111
    .line 112
    .line 113
    :cond_4
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 114
    .line 115
    return-object v0

    .line 116
    nop

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
