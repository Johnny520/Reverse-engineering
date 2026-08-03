.class public final synthetic Lwb/jb;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lfg/l;

.field public final synthetic i:Li0/a1;

.field public final synthetic j:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Lfg/l;Li0/a1;Li0/a1;I)V
    .locals 0

    .line 1
    iput p4, p0, Lwb/jb;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/jb;->h:Lfg/l;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/jb;->i:Li0/a1;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/jb;->j:Li0/a1;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lwb/jb;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/jb;->i:Li0/a1;

    .line 7
    .line 8
    invoke-static {v0}, Lwb/y2;->H(Li0/a1;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lwb/jb;->j:Li0/a1;

    .line 15
    .line 16
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Ljava/lang/Boolean;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lwb/jb;->h:Lfg/l;

    .line 26
    .line 27
    invoke-interface {v1, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    :cond_0
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 31
    .line 32
    return-object v0

    .line 33
    :pswitch_0
    new-instance v0, Lx9/f;

    .line 34
    .line 35
    iget-object v1, p0, Lwb/jb;->i:Li0/a1;

    .line 36
    .line 37
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {v1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    iget-object v2, p0, Lwb/jb;->j:Li0/a1;

    .line 52
    .line 53
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    check-cast v2, Ljava/lang/Boolean;

    .line 58
    .line 59
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    invoke-direct {v0, v1, v2}, Lx9/f;-><init>(Ljava/lang/String;Z)V

    .line 64
    .line 65
    .line 66
    iget-object v1, p0, Lwb/jb;->h:Lfg/l;

    .line 67
    .line 68
    invoke-interface {v1, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 72
    .line 73
    return-object v0

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
