.class public final synthetic Lw/t0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lw/y0;


# direct methods
.method public synthetic constructor <init>(Lw/y0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lw/t0;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lw/t0;->h:Lw/y0;

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
    iget v0, p0, Lw/t0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lw/t0;->h:Lw/y0;

    .line 7
    .line 8
    invoke-interface {v0}, Lw/y0;->onCancel()V

    .line 9
    .line 10
    .line 11
    :goto_0
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 12
    .line 13
    return-object v0

    .line 14
    :pswitch_0
    iget-object v0, p0, Lw/t0;->h:Lw/y0;

    .line 15
    .line 16
    invoke-interface {v0}, Lw/y0;->b()V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
