.class public final Lh/p0;
.super Lgg/m;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lh/q0;


# direct methods
.method public synthetic constructor <init>(Lh/q0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lh/p0;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lh/p0;->h:Lh/q0;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lgg/m;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lh/p0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Li/e1;

    .line 7
    .line 8
    sget-object v0, Lh/f0;->g:Lh/f0;

    .line 9
    .line 10
    sget-object v1, Lh/f0;->h:Lh/f0;

    .line 11
    .line 12
    invoke-interface {p1, v0, v1}, Li/e1;->a(Lh/f0;Lh/f0;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lh/p0;->h:Lh/q0;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    iget-object p1, v2, Lh/q0;->z:Lh/r0;

    .line 21
    .line 22
    iget-object p1, p1, Lh/r0;->a:Lh/h1;

    .line 23
    .line 24
    iget-object p1, p1, Lh/h1;->b:Lh/f1;

    .line 25
    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    iget-object p1, p1, Lh/f1;->b:Li/y;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    sget-object p1, Lh/m0;->c:Li/r0;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    sget-object v0, Lh/f0;->i:Lh/f0;

    .line 35
    .line 36
    invoke-interface {p1, v1, v0}, Li/e1;->a(Lh/f0;Lh/f0;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_3

    .line 41
    .line 42
    iget-object p1, v2, Lh/q0;->A:Lh/s0;

    .line 43
    .line 44
    iget-object p1, p1, Lh/s0;->a:Lh/h1;

    .line 45
    .line 46
    iget-object p1, p1, Lh/h1;->b:Lh/f1;

    .line 47
    .line 48
    if-eqz p1, :cond_2

    .line 49
    .line 50
    iget-object p1, p1, Lh/f1;->b:Li/y;

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    sget-object p1, Lh/m0;->c:Li/r0;

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_3
    sget-object p1, Lh/m0;->c:Li/r0;

    .line 57
    .line 58
    :goto_0
    return-object p1

    .line 59
    :pswitch_0
    check-cast p1, Li/e1;

    .line 60
    .line 61
    sget-object v0, Lh/f0;->g:Lh/f0;

    .line 62
    .line 63
    sget-object v1, Lh/f0;->h:Lh/f0;

    .line 64
    .line 65
    invoke-interface {p1, v0, v1}, Li/e1;->a(Lh/f0;Lh/f0;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    const/4 v2, 0x0

    .line 70
    if-eqz v0, :cond_4

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_4
    sget-object v0, Lh/f0;->i:Lh/f0;

    .line 74
    .line 75
    invoke-interface {p1, v1, v0}, Li/e1;->a(Lh/f0;Lh/f0;)Z

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    if-eqz p1, :cond_5

    .line 80
    .line 81
    iget-object p1, p0, Lh/p0;->h:Lh/q0;

    .line 82
    .line 83
    iget-object p1, p1, Lh/q0;->A:Lh/s0;

    .line 84
    .line 85
    iget-object p1, p1, Lh/s0;->a:Lh/h1;

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_5
    sget-object v2, Lh/m0;->d:Li/r0;

    .line 89
    .line 90
    :goto_1
    if-nez v2, :cond_6

    .line 91
    .line 92
    sget-object v2, Lh/m0;->d:Li/r0;

    .line 93
    .line 94
    :cond_6
    return-object v2

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
