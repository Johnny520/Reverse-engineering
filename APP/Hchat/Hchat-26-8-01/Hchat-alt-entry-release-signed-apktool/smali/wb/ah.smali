.class public final synthetic Lwb/ah;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lfg/p;

.field public final synthetic i:Lwb/s0;


# direct methods
.method public synthetic constructor <init>(Lfg/p;Lwb/s0;I)V
    .locals 0

    .line 1
    iput p3, p0, Lwb/ah;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/ah;->h:Lfg/p;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/ah;->i:Lwb/s0;

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
    .locals 3

    .line 1
    iget v0, p0, Lwb/ah;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/ah;->i:Lwb/s0;

    .line 7
    .line 8
    iget-object v1, v0, Lwb/s0;->a:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v0, v0, Lwb/s0;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    move-object v0, v1

    .line 19
    :cond_0
    iget-object v2, p0, Lwb/ah;->h:Lfg/p;

    .line 20
    .line 21
    invoke-interface {v2, v1, v0}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    :goto_0
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 25
    .line 26
    return-object v0

    .line 27
    :pswitch_0
    iget-object v0, p0, Lwb/ah;->i:Lwb/s0;

    .line 28
    .line 29
    iget-object v1, v0, Lwb/s0;->a:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v0, v0, Lwb/s0;->b:Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    move-object v0, v1

    .line 40
    :cond_1
    iget-object v2, p0, Lwb/ah;->h:Lfg/p;

    .line 41
    .line 42
    invoke-interface {v2, v1, v0}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
