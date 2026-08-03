.class public final Ly2/a;
.super Lgg/m;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ly2/v;


# direct methods
.method public synthetic constructor <init>(Ly2/v;I)V
    .locals 0

    .line 1
    iput p2, p0, Ly2/a;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Ly2/a;->h:Ly2/v;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lgg/m;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Ly2/a;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lb/g;

    .line 7
    .line 8
    iget-object p1, p0, Ly2/a;->h:Ly2/v;

    .line 9
    .line 10
    iget-object v0, p1, Ly2/v;->k:Ly2/u;

    .line 11
    .line 12
    iget-boolean v0, v0, Ly2/u;->a:Z

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object p1, p1, Ly2/v;->j:Lfg/a;

    .line 17
    .line 18
    invoke-interface {p1}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    :cond_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_0
    check-cast p1, Li0/a0;

    .line 25
    .line 26
    iget-object p1, p0, Ly2/a;->h:Ly2/v;

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    .line 29
    .line 30
    .line 31
    new-instance v0, Lb0/m;

    .line 32
    .line 33
    const/16 v1, 0x8

    .line 34
    .line 35
    invoke-direct {v0, p1, v1}, Lb0/m;-><init>(Ljava/lang/Object;I)V

    .line 36
    .line 37
    .line 38
    return-object v0

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
