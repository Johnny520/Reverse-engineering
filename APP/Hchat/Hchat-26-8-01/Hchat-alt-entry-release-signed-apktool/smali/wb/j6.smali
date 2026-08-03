.class public final synthetic Lwb/j6;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Li0/j1;

.field public final synthetic i:Lwb/x2;


# direct methods
.method public synthetic constructor <init>(Li0/j1;Lwb/x2;I)V
    .locals 0

    .line 1
    iput p3, p0, Lwb/j6;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/j6;->h:Li0/j1;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/j6;->i:Lwb/x2;

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
    .locals 2

    .line 1
    iget v0, p0, Lwb/j6;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/j6;->i:Lwb/x2;

    .line 7
    .line 8
    invoke-static {v0}, Lwb/ho;->C4(Lwb/x2;)Lwb/x2;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, Lwb/j6;->h:Li0/j1;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    :goto_0
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 18
    .line 19
    return-object v0

    .line 20
    :pswitch_0
    new-instance v0, Lwb/v2;

    .line 21
    .line 22
    iget-object v1, p0, Lwb/j6;->i:Lwb/x2;

    .line 23
    .line 24
    check-cast v1, Lwb/s2;

    .line 25
    .line 26
    invoke-direct {v0, v1}, Lwb/v2;-><init>(Lwb/s2;)V

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Lwb/j6;->h:Li0/j1;

    .line 30
    .line 31
    invoke-virtual {v1, v0}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :pswitch_1
    new-instance v0, Lwb/u2;

    .line 36
    .line 37
    iget-object v1, p0, Lwb/j6;->i:Lwb/x2;

    .line 38
    .line 39
    check-cast v1, Lwb/s2;

    .line 40
    .line 41
    invoke-direct {v0, v1}, Lwb/u2;-><init>(Lwb/s2;)V

    .line 42
    .line 43
    .line 44
    iget-object v1, p0, Lwb/j6;->h:Li0/j1;

    .line 45
    .line 46
    invoke-virtual {v1, v0}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :pswitch_2
    iget-object v0, p0, Lwb/j6;->i:Lwb/x2;

    .line 51
    .line 52
    invoke-static {v0}, Lwb/ho;->C4(Lwb/x2;)Lwb/x2;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iget-object v1, p0, Lwb/j6;->h:Li0/j1;

    .line 57
    .line 58
    invoke-virtual {v1, v0}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
