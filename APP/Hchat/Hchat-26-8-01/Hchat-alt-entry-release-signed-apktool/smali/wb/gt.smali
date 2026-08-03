.class public final synthetic Lwb/gt;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lfb/d1;

.field public final synthetic i:Li0/a1;

.field public final synthetic j:Lfg/l;

.field public final synthetic k:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Lfb/d1;Li0/a1;Lfg/l;Li0/a1;I)V
    .locals 0

    .line 1
    iput p5, p0, Lwb/gt;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/gt;->h:Lfb/d1;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/gt;->i:Li0/a1;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/gt;->j:Lfg/l;

    .line 8
    .line 9
    iput-object p4, p0, Lwb/gt;->k:Li0/a1;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lwb/gt;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iget-object v1, p0, Lwb/gt;->i:Li0/a1;

    .line 8
    .line 9
    iget-object v2, p0, Lwb/gt;->h:Lfb/d1;

    .line 10
    .line 11
    invoke-static {v1, v2, v0}, Lwb/y2;->Y(Li0/a1;Lfb/d1;I)Ljava/util/ArrayList;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lwb/gt;->j:Lfg/l;

    .line 21
    .line 22
    invoke-interface {v1, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    :cond_0
    const/4 v0, 0x0

    .line 26
    iget-object v1, p0, Lwb/gt;->k:Li0/a1;

    .line 27
    .line 28
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 32
    .line 33
    return-object v0

    .line 34
    :pswitch_0
    const/4 v0, -0x1

    .line 35
    iget-object v1, p0, Lwb/gt;->i:Li0/a1;

    .line 36
    .line 37
    iget-object v2, p0, Lwb/gt;->h:Lfb/d1;

    .line 38
    .line 39
    invoke-static {v1, v2, v0}, Lwb/y2;->Y(Li0/a1;Lfb/d1;I)Ljava/util/ArrayList;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Lwb/gt;->j:Lfg/l;

    .line 49
    .line 50
    invoke-interface {v1, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    :cond_1
    const/4 v0, 0x0

    .line 54
    iget-object v1, p0, Lwb/gt;->k:Li0/a1;

    .line 55
    .line 56
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
