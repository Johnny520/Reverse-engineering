.class public final synthetic Ll/g;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Z

.field public final synthetic i:Lfg/a;


# direct methods
.method public synthetic constructor <init>(ZLfg/a;I)V
    .locals 0

    .line 1
    iput p3, p0, Ll/g;->g:I

    .line 2
    .line 3
    iput-boolean p1, p0, Ll/g;->h:Z

    .line 4
    .line 5
    iput-object p2, p0, Ll/g;->i:Lfg/a;

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
    iget v0, p0, Ll/g;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Ll/g;->h:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Ll/g;->i:Lfg/a;

    .line 11
    .line 12
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    :cond_0
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 16
    .line 17
    return-object v0

    .line 18
    :pswitch_0
    iget-boolean v0, p0, Ll/g;->h:Z

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, Ll/g;->i:Lfg/a;

    .line 23
    .line 24
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    :cond_1
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_1
    iget-boolean v0, p0, Ll/g;->h:Z

    .line 31
    .line 32
    if-nez v0, :cond_2

    .line 33
    .line 34
    iget-object v0, p0, Ll/g;->i:Lfg/a;

    .line 35
    .line 36
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    :cond_2
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 40
    .line 41
    return-object v0

    .line 42
    :pswitch_2
    iget-boolean v0, p0, Ll/g;->h:Z

    .line 43
    .line 44
    if-nez v0, :cond_3

    .line 45
    .line 46
    iget-object v0, p0, Ll/g;->i:Lfg/a;

    .line 47
    .line 48
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    :cond_3
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 52
    .line 53
    return-object v0

    .line 54
    :pswitch_3
    iget-boolean v0, p0, Ll/g;->h:Z

    .line 55
    .line 56
    if-nez v0, :cond_4

    .line 57
    .line 58
    iget-object v0, p0, Ll/g;->i:Lfg/a;

    .line 59
    .line 60
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    :cond_4
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 64
    .line 65
    return-object v0

    .line 66
    :pswitch_4
    iget-boolean v0, p0, Ll/g;->h:Z

    .line 67
    .line 68
    if-eqz v0, :cond_5

    .line 69
    .line 70
    iget-object v0, p0, Ll/g;->i:Lfg/a;

    .line 71
    .line 72
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    :cond_5
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 76
    .line 77
    return-object v0

    .line 78
    nop

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
