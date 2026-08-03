.class public final Lv7/h0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lr7/m;


# instance fields
.field public final synthetic g:I

.field public final h:Lr7/b;


# direct methods
.method public synthetic constructor <init>(Lr7/b;I)V
    .locals 0

    .line 1
    iput p2, p0, Lv7/h0;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lv7/h0;->h:Lr7/b;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Class;)Lk7/a;
    .locals 2

    .line 1
    iget v0, p0, Lv7/h0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lv7/h0;->h:Lr7/b;

    .line 7
    .line 8
    check-cast v0, Lv7/j0;

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {v0, p1}, Lk7/a;->v(Ljava/lang/Class;)Lk7/a;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :goto_0
    return-object v0

    .line 22
    :pswitch_0
    iget-object v0, p0, Lv7/h0;->h:Lr7/b;

    .line 23
    .line 24
    check-cast v0, Lv7/i0;

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    invoke-virtual {v0, p1}, Lk7/a;->v(Ljava/lang/Class;)Lk7/a;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :goto_1
    return-object v0

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final get()I
    .locals 1

    .line 1
    iget v0, p0, Lv7/h0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lv7/h0;->h:Lr7/b;

    .line 7
    .line 8
    check-cast v0, Lv7/j0;

    .line 9
    .line 10
    invoke-virtual {v0}, Lv7/j0;->O()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    return v0

    .line 15
    :pswitch_0
    iget-object v0, p0, Lv7/h0;->h:Lr7/b;

    .line 16
    .line 17
    check-cast v0, Lv7/i0;

    .line 18
    .line 19
    invoke-virtual {v0}, Lv7/i0;->N()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    return v0

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final k(I)V
    .locals 4

    .line 1
    iget v0, p0, Lv7/h0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lv7/h0;->h:Lr7/b;

    .line 7
    .line 8
    check-cast v0, Lv7/j0;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lv7/j0;->X(I)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object v0, p0, Lv7/h0;->h:Lr7/b;

    .line 15
    .line 16
    check-cast v0, Lv7/i0;

    .line 17
    .line 18
    iget-object v1, v0, Lr7/b;->k:[B

    .line 19
    .line 20
    const/4 v2, 0x2

    .line 21
    const/4 v3, 0x3

    .line 22
    invoke-static {v1, v2, v3}, Lk7/a;->q([BII)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    iget-object v0, v0, Lr7/b;->k:[B

    .line 27
    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    invoke-static {v0, v1, p1}, Lk7/a;->E([BII)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/4 v1, 0x4

    .line 36
    invoke-static {v0, v1, p1}, Lk7/a;->D([BII)V

    .line 37
    .line 38
    .line 39
    :goto_0
    return-void

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
