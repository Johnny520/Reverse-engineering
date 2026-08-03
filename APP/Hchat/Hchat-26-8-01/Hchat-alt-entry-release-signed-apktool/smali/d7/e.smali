.class public final Ld7/e;
.super Ld7/l;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic p:I


# direct methods
.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 1
    iput p1, p0, Ld7/e;->p:I

    .line 2
    .line 3
    invoke-direct {p0, p2}, Ld7/l;-><init>(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final n()Lk7/a;
    .locals 5

    .line 1
    iget v0, p0, Ld7/e;->p:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lg7/b;

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v0, v1, v2}, Ld7/j;-><init>(IZ)V

    .line 11
    .line 12
    .line 13
    new-instance v1, Lg7/c;

    .line 14
    .line 15
    invoke-direct {v1}, Lg7/c;-><init>()V

    .line 16
    .line 17
    .line 18
    new-instance v2, Ld7/b;

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v4, 0x0

    .line 22
    invoke-direct {v2, v3, v4}, Ld7/b;-><init>(Lk7/f;I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lo7/d;->P(Lk7/a;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v2}, Lo7/d;->P(Lk7/a;)V

    .line 29
    .line 30
    .line 31
    return-object v0

    .line 32
    :pswitch_0
    new-instance v0, Ld7/f;

    .line 33
    .line 34
    invoke-direct {v0}, Ld7/k;-><init>()V

    .line 35
    .line 36
    .line 37
    return-object v0

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
