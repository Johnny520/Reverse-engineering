.class public final synthetic Lwb/m1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lfg/a;

.field public final synthetic i:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Lfg/a;Li0/a1;I)V
    .locals 0

    .line 1
    iput p3, p0, Lwb/m1;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/m1;->h:Lfg/a;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/m1;->i:Li0/a1;

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
    iget v0, p0, Lwb/m1;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/m1;->i:Li0/a1;

    .line 7
    .line 8
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lwb/m1;->h:Lfg/a;

    .line 14
    .line 15
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    :goto_0
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 19
    .line 20
    return-object v0

    .line 21
    :pswitch_0
    iget-object v0, p0, Lwb/m1;->i:Li0/a1;

    .line 22
    .line 23
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lwb/m1;->h:Lfg/a;

    .line 29
    .line 30
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :pswitch_1
    iget-object v0, p0, Lwb/m1;->i:Li0/a1;

    .line 35
    .line 36
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 37
    .line 38
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lwb/m1;->h:Lfg/a;

    .line 42
    .line 43
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
