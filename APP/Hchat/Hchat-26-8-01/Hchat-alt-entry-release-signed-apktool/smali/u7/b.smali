.class public final Lu7/b;
.super Lu7/c;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic t:I


# direct methods
.method public synthetic constructor <init>(ZZLokio/a;I)V
    .locals 0

    .line 1
    iput p4, p0, Lu7/b;->t:I

    .line 2
    .line 3
    invoke-direct {p0, p1, p2, p3}, Lu7/c;-><init>(ZZLokio/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final W()V
    .locals 1

    .line 1
    iget v0, p0, Lu7/b;->t:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Lu7/c;->W()V

    .line 7
    .line 8
    .line 9
    const-class v0, Ll7/l;

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lk7/a;->v(Ljava/lang/Class;)Lk7/a;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ll7/l;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0, p0}, Ll7/l;->Y(Lu7/b;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void

    .line 23
    :pswitch_0
    invoke-super {p0}, Lu7/c;->W()V

    .line 24
    .line 25
    .line 26
    const-class v0, Ll7/f;

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Lk7/a;->u(Ljava/lang/Class;)Lk7/a;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Ll7/f;

    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    invoke-virtual {v0, p0}, Ll7/f;->Z(Lu7/b;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    return-void

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
