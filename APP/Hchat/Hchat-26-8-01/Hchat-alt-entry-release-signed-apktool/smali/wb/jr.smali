.class public final synthetic Lwb/jr;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lfg/p;

.field public final synthetic i:Lfb/d1;

.field public final synthetic j:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Lfg/p;Lfb/d1;Li0/a1;I)V
    .locals 0

    .line 1
    iput p4, p0, Lwb/jr;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/jr;->h:Lfg/p;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/jr;->i:Lfb/d1;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/jr;->j:Li0/a1;

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
    iget v0, p0, Lwb/jr;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/jr;->i:Lfb/d1;

    .line 7
    .line 8
    iget-boolean v1, v0, Lfb/d1;->m:Z

    .line 9
    .line 10
    xor-int/lit8 v1, v1, 0x1

    .line 11
    .line 12
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iget-object v2, p0, Lwb/jr;->h:Lfg/p;

    .line 17
    .line 18
    invoke-interface {v2, v0, v1}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    iget-object v1, p0, Lwb/jr;->j:Li0/a1;

    .line 23
    .line 24
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_0
    iget-object v0, p0, Lwb/jr;->i:Lfb/d1;

    .line 31
    .line 32
    iget-boolean v1, v0, Lfb/d1;->l:Z

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
    iget-object v2, p0, Lwb/jr;->h:Lfg/p;

    .line 41
    .line 42
    invoke-interface {v2, v0, v1}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    const/4 v0, 0x0

    .line 46
    iget-object v1, p0, Lwb/jr;->j:Li0/a1;

    .line 47
    .line 48
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    nop

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
