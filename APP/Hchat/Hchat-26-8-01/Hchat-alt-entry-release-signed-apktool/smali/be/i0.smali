.class public final synthetic Lbe/i0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p2, p0, Lbe/i0;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lbe/i0;->b:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, Lbe/i0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lqd/l;

    .line 7
    .line 8
    instance-of v0, p1, Lqd/o;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    check-cast p1, Lqd/o;

    .line 13
    .line 14
    iget-object v0, p0, Lbe/i0;->b:Ljava/lang/String;

    .line 15
    .line 16
    invoke-interface {p1, v0}, Lqd/o;->p(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void

    .line 20
    :pswitch_0
    iget-object v0, p0, Lbe/i0;->b:Ljava/lang/String;

    .line 21
    .line 22
    check-cast p1, Lud/e;

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Lnd/b0;->L(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
