.class public final synthetic Lwb/q9;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lfg/l;

.field public final synthetic i:Leb/c0;


# direct methods
.method public synthetic constructor <init>(Lfg/l;Leb/c0;I)V
    .locals 0

    .line 1
    iput p3, p0, Lwb/q9;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/q9;->h:Lfg/l;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/q9;->i:Leb/c0;

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
    iget v0, p0, Lwb/q9;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/q9;->h:Lfg/l;

    .line 7
    .line 8
    iget-object v1, p0, Lwb/q9;->i:Leb/c0;

    .line 9
    .line 10
    invoke-interface {v0, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    :goto_0
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 14
    .line 15
    return-object v0

    .line 16
    :pswitch_0
    iget-object v0, p0, Lwb/q9;->h:Lfg/l;

    .line 17
    .line 18
    iget-object v1, p0, Lwb/q9;->i:Leb/c0;

    .line 19
    .line 20
    invoke-interface {v0, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
