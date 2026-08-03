.class public final synthetic Lw0/k;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lfg/l;

.field public final synthetic i:Lfg/l;


# direct methods
.method public synthetic constructor <init>(Lfg/l;Lfg/l;I)V
    .locals 0

    .line 1
    iput p3, p0, Lw0/k;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lw0/k;->h:Lfg/l;

    .line 4
    .line 5
    iput-object p2, p0, Lw0/k;->i:Lfg/l;

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
    iget v0, p0, Lw0/k;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lw0/k;->h:Lfg/l;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lw0/k;->i:Lfg/l;

    .line 12
    .line 13
    invoke-interface {v0, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 17
    .line 18
    return-object p1

    .line 19
    :pswitch_0
    iget-object v0, p0, Lw0/k;->h:Lfg/l;

    .line 20
    .line 21
    invoke-interface {v0, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lw0/k;->i:Lfg/l;

    .line 25
    .line 26
    invoke-interface {v0, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

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
