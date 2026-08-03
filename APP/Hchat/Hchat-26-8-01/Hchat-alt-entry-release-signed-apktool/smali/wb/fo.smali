.class public final Lwb/fo;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Li0/z;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lm/a;


# direct methods
.method public synthetic constructor <init>(Lm/a;I)V
    .locals 0

    .line 1
    iput p2, p0, Lwb/fo;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/fo;->b:Lm/a;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    iget v0, p0, Lwb/fo;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/fo;->b:Lm/a;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, v0, Lm/a;->h:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lc9/n0;

    .line 13
    .line 14
    invoke-virtual {v0}, Lc9/n0;->invoke()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void

    .line 18
    :pswitch_0
    iget-object v0, p0, Lwb/fo;->b:Lm/a;

    .line 19
    .line 20
    iget-object v0, v0, Lm/a;->h:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lc9/n0;

    .line 23
    .line 24
    invoke-virtual {v0}, Lc9/n0;->invoke()Ljava/lang/Object;

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
