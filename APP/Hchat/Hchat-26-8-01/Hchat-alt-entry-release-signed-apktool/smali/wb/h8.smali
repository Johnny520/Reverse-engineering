.class public final synthetic Lwb/h8;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lwb/cp;

.field public final synthetic i:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Lwb/cp;Li0/a1;I)V
    .locals 0

    .line 1
    iput p3, p0, Lwb/h8;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/h8;->h:Lwb/cp;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/h8;->i:Li0/a1;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lwb/h8;->g:I

    .line 2
    .line 3
    check-cast p1, Lwb/bp;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lwb/h8;->h:Lwb/cp;

    .line 12
    .line 13
    iget-object v0, v0, Lwb/cp;->d:Lfg/l;

    .line 14
    .line 15
    invoke-interface {v0, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    iget-object v0, p0, Lwb/h8;->i:Li0/a1;

    .line 20
    .line 21
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 25
    .line 26
    return-object p1

    .line 27
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lwb/h8;->h:Lwb/cp;

    .line 31
    .line 32
    iget-object v0, v0, Lwb/cp;->d:Lfg/l;

    .line 33
    .line 34
    invoke-interface {v0, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    const/4 p1, 0x0

    .line 38
    iget-object v0, p0, Lwb/h8;->i:Li0/a1;

    .line 39
    .line 40
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
