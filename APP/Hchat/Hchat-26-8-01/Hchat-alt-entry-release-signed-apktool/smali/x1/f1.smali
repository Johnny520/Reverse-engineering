.class public final Lx1/f1;
.super Lgg/m;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lx1/i1;


# direct methods
.method public synthetic constructor <init>(Lx1/i1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lx1/f1;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lx1/f1;->h:Lx1/i1;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lgg/m;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lx1/f1;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lx1/f1;->h:Lx1/i1;

    .line 7
    .line 8
    iget-object v0, v0, Lx1/i1;->w:Lx1/i1;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Lx1/i1;->y1()V

    .line 13
    .line 14
    .line 15
    :cond_0
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 16
    .line 17
    return-object v0

    .line 18
    :pswitch_0
    iget-object v0, p0, Lx1/f1;->h:Lx1/i1;

    .line 19
    .line 20
    iget-object v1, v0, Lx1/i1;->N:Lf1/u;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    iget-object v2, v0, Lx1/i1;->M:Li1/b;

    .line 26
    .line 27
    invoke-virtual {v0, v1, v2}, Lx1/i1;->l1(Lf1/u;Li1/b;)V

    .line 28
    .line 29
    .line 30
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 31
    .line 32
    return-object v0

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
