.class public final synthetic Lwb/b2;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lfg/l;

.field public final synthetic i:Lwb/g2;


# direct methods
.method public synthetic constructor <init>(Lfg/l;Lwb/g2;I)V
    .locals 0

    .line 1
    iput p3, p0, Lwb/b2;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/b2;->h:Lfg/l;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/b2;->i:Lwb/g2;

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
    iget v0, p0, Lwb/b2;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/b2;->i:Lwb/g2;

    .line 7
    .line 8
    iget-object v0, v0, Lwb/g2;->a:Lc9/a;

    .line 9
    .line 10
    iget-object v0, v0, Lc9/a;->a:Ljava/lang/String;

    .line 11
    .line 12
    iget-object v1, p0, Lwb/b2;->h:Lfg/l;

    .line 13
    .line 14
    invoke-interface {v1, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-object v0, p0, Lwb/b2;->i:Lwb/g2;

    .line 21
    .line 22
    iget-object v0, v0, Lwb/g2;->a:Lc9/a;

    .line 23
    .line 24
    iget-object v1, p0, Lwb/b2;->h:Lfg/l;

    .line 25
    .line 26
    invoke-interface {v1, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
