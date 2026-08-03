.class public final synthetic Lwb/kr;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lfb/d1;

.field public final synthetic i:Li0/a1;

.field public final synthetic j:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Lfb/d1;Li0/a1;Li0/a1;I)V
    .locals 0

    .line 1
    iput p4, p0, Lwb/kr;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/kr;->h:Lfb/d1;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/kr;->i:Li0/a1;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/kr;->j:Li0/a1;

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
    iget v0, p0, Lwb/kr;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/kr;->h:Lfb/d1;

    .line 7
    .line 8
    iget-object v1, v0, Lfb/d1;->b:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v2, p0, Lwb/kr;->i:Li0/a1;

    .line 11
    .line 12
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, v0, Lfb/d1;->a:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v1, p0, Lwb/kr;->j:Li0/a1;

    .line 18
    .line 19
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    :goto_0
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 23
    .line 24
    return-object v0

    .line 25
    :pswitch_0
    iget-object v0, p0, Lwb/kr;->h:Lfb/d1;

    .line 26
    .line 27
    iget-object v0, v0, Lfb/d1;->a:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v1, p0, Lwb/kr;->i:Li0/a1;

    .line 30
    .line 31
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    iget-object v1, p0, Lwb/kr;->j:Li0/a1;

    .line 36
    .line 37
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
