.class public final synthetic Lb0/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lfg/a;


# direct methods
.method public synthetic constructor <init>(Lfg/a;I)V
    .locals 0

    .line 1
    iput p2, p0, Lb0/c;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lb0/c;->h:Lfg/a;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Lb0/c;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb0/c;->h:Lfg/a;

    .line 7
    .line 8
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    iget-object v0, p0, Lb0/c;->h:Lfg/a;

    .line 13
    .line 14
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_1
    iget-object v0, p0, Lb0/c;->h:Lfg/a;

    .line 19
    .line 20
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_2
    iget-object v0, p0, Lb0/c;->h:Lfg/a;

    .line 25
    .line 26
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_3
    iget-object v0, p0, Lb0/c;->h:Lfg/a;

    .line 31
    .line 32
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_4
    iget-object v0, p0, Lb0/c;->h:Lfg/a;

    .line 37
    .line 38
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :pswitch_5
    iget-object v0, p0, Lb0/c;->h:Lfg/a;

    .line 43
    .line 44
    :try_start_0
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception v0

    .line 50
    new-instance v1, Lsf/f;

    .line 51
    .line 52
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 53
    .line 54
    .line 55
    move-object v0, v1

    .line 56
    :goto_0
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    if-eqz v0, :cond_0

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    const-string v2, "[Hchat:FloatingShortcut] \u4e3b\u7ebf\u7a0b\u60ac\u6d6e\u5c42\u64cd\u4f5c\u5931\u8d25: "

    .line 67
    .line 68
    invoke-static {v2, v1, v0}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 69
    .line 70
    .line 71
    :cond_0
    return-void

    .line 72
    :pswitch_6
    iget-object v0, p0, Lb0/c;->h:Lfg/a;

    .line 73
    .line 74
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :pswitch_7
    iget-object v0, p0, Lb0/c;->h:Lfg/a;

    .line 79
    .line 80
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    nop

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
