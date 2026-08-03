.class public final synthetic Lu/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Z


# direct methods
.method public synthetic constructor <init>(ILfg/l;Z)V
    .locals 0

    .line 12
    iput p1, p0, Lu/c;->g:I

    iput-object p2, p0, Lu/c;->h:Ljava/lang/Object;

    iput-boolean p3, p0, Lu/c;->i:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ZLf0/c;)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    iput v0, p0, Lu/c;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-boolean p1, p0, Lu/c;->i:Z

    .line 8
    .line 9
    iput-object p2, p0, Lu/c;->h:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lu/c;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lu/c;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lf0/c;

    .line 9
    .line 10
    iget-boolean v1, p0, Lu/c;->i:Z

    .line 11
    .line 12
    sget-object v2, Lsf/n;->a:Lsf/n;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0}, Lf0/c;->i()Ltg/n;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    check-cast v0, Ltg/r;

    .line 23
    .line 24
    invoke-virtual {v0, v2}, Ltg/r;->p(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    :cond_0
    return-object v2

    .line 28
    :pswitch_0
    iget-object v0, p0, Lu/c;->h:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Lfg/l;

    .line 31
    .line 32
    iget-boolean v1, p0, Lu/c;->i:Z

    .line 33
    .line 34
    xor-int/lit8 v1, v1, 0x1

    .line 35
    .line 36
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-interface {v0, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    :goto_0
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 44
    .line 45
    return-object v0

    .line 46
    :pswitch_1
    iget-object v0, p0, Lu/c;->h:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, Lfg/l;

    .line 49
    .line 50
    iget-boolean v1, p0, Lu/c;->i:Z

    .line 51
    .line 52
    xor-int/lit8 v1, v1, 0x1

    .line 53
    .line 54
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-interface {v0, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :pswitch_2
    iget-object v0, p0, Lu/c;->h:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, Lfg/l;

    .line 65
    .line 66
    iget-boolean v1, p0, Lu/c;->i:Z

    .line 67
    .line 68
    xor-int/lit8 v1, v1, 0x1

    .line 69
    .line 70
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-interface {v0, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :pswitch_3
    iget-object v0, p0, Lu/c;->h:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v0, Lfg/l;

    .line 81
    .line 82
    iget-boolean v1, p0, Lu/c;->i:Z

    .line 83
    .line 84
    xor-int/lit8 v1, v1, 0x1

    .line 85
    .line 86
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-interface {v0, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    nop

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
