.class public final synthetic Lw/j0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lw/k0;


# direct methods
.method public synthetic constructor <init>(Lw/k0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lw/j0;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lw/j0;->h:Lw/k0;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lw/j0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lw/j0;->h:Lw/k0;

    .line 7
    .line 8
    iget-object v0, v0, Lw/k0;->B:Lm2/r;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string v0, "Font resolution state is not set."

    .line 16
    .line 17
    invoke-static {v0}, Lo/b;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 18
    .line 19
    .line 20
    invoke-static {}, Lokio/a;->c()V

    .line 21
    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    :goto_0
    return-object v0

    .line 25
    :pswitch_0
    iget-object v0, p0, Lw/j0;->h:Lw/k0;

    .line 26
    .line 27
    iget-object v0, v0, Lw/k0;->B:Lm2/r;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    const-string v0, "Font resolution state is not set."

    .line 35
    .line 36
    invoke-static {v0}, Lo/b;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 37
    .line 38
    .line 39
    invoke-static {}, Lokio/a;->c()V

    .line 40
    .line 41
    .line 42
    const/4 v0, 0x0

    .line 43
    :goto_1
    return-object v0

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
