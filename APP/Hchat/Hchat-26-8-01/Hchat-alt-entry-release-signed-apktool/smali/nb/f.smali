.class public final synthetic Lnb/f;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lnb/w;

.field public final synthetic i:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lnb/w;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p3, p0, Lnb/f;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lnb/f;->h:Lnb/w;

    .line 4
    .line 5
    iput-object p2, p0, Lnb/f;->i:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Lnb/f;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lnb/f;->i:Ljava/lang/String;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string v0, ""

    .line 11
    .line 12
    :cond_0
    iget-object v1, p0, Lnb/f;->h:Lnb/w;

    .line 13
    .line 14
    invoke-static {v1, v0}, Lnb/w;->a(Lnb/w;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    iget-object v0, p0, Lnb/f;->i:Ljava/lang/String;

    .line 19
    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    const-string v0, ""

    .line 23
    .line 24
    :cond_1
    iget-object v1, p0, Lnb/f;->h:Lnb/w;

    .line 25
    .line 26
    invoke-static {v1, v0}, Lnb/w;->a(Lnb/w;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_1
    iget-object v0, p0, Lnb/f;->i:Ljava/lang/String;

    .line 31
    .line 32
    if-nez v0, :cond_2

    .line 33
    .line 34
    const-string v0, ""

    .line 35
    .line 36
    :cond_2
    iget-object v1, p0, Lnb/f;->h:Lnb/w;

    .line 37
    .line 38
    invoke-static {v1, v0}, Lnb/w;->a(Lnb/w;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :pswitch_2
    new-instance v0, Lnb/n;

    .line 43
    .line 44
    iget-object v1, p0, Lnb/f;->i:Ljava/lang/String;

    .line 45
    .line 46
    invoke-direct {v0, v1}, Lnb/n;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    iget-object v1, p0, Lnb/f;->h:Lnb/w;

    .line 50
    .line 51
    invoke-virtual {v1}, Lnb/w;->y()Lnb/z;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    const-string v3, "text_speech_enable"

    .line 56
    .line 57
    invoke-virtual {v2, v3}, Lnb/z;->b(Ljava/lang/String;)Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-nez v2, :cond_3

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    iget-object v2, v1, Lnb/w;->c:Ljava/util/ArrayDeque;

    .line 65
    .line 66
    invoke-virtual {v2, v0}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1}, Lnb/w;->n()V

    .line 70
    .line 71
    .line 72
    :goto_0
    return-void

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
