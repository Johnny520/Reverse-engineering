.class public final synthetic Lc9/m0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lfg/l;

.field public final synthetic i:Lc9/c1;


# direct methods
.method public synthetic constructor <init>(Lfg/l;Lc9/c1;I)V
    .locals 0

    .line 1
    iput p3, p0, Lc9/m0;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lc9/m0;->h:Lfg/l;

    .line 4
    .line 5
    iput-object p2, p0, Lc9/m0;->i:Lc9/c1;

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
    iget v0, p0, Lc9/m0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lc9/m0;->i:Lc9/c1;

    .line 7
    .line 8
    iget-object v0, v0, Lc9/c1;->a:Ljava/lang/String;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string v0, ""

    .line 13
    .line 14
    :cond_0
    iget-object v1, p0, Lc9/m0;->h:Lfg/l;

    .line 15
    .line 16
    invoke-interface {v1, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    :goto_0
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_0
    iget-object v0, p0, Lc9/m0;->i:Lc9/c1;

    .line 23
    .line 24
    iget-object v0, v0, Lc9/c1;->a:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v1, p0, Lc9/m0;->h:Lfg/l;

    .line 27
    .line 28
    invoke-interface {v1, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
