.class public final Ll5/j;
.super Ll5/a0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lt5/g;
.implements Lt5/n;


# instance fields
.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Lk5/u;Lf5/f;II)V
    .locals 0

    .line 1
    iput p4, p0, Ll5/j;->d:I

    .line 2
    .line 3
    invoke-direct {p0, p1, p2, p3}, Ll5/a0;-><init>(Lk5/u;Lf5/f;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final g()J
    .locals 3

    .line 1
    iget v0, p0, Ll5/j;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ll5/a0;->a:Lk5/u;

    .line 7
    .line 8
    iget-object v0, v0, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 9
    .line 10
    iget v1, p0, Ll5/a0;->c:I

    .line 11
    .line 12
    add-int/lit8 v1, v1, 0x2

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroidx/lifecycle/x;->K(I)J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    return-wide v0

    .line 19
    :pswitch_0
    iget-object v0, p0, Ll5/a0;->a:Lk5/u;

    .line 20
    .line 21
    iget-object v0, v0, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 22
    .line 23
    iget v1, p0, Ll5/a0;->c:I

    .line 24
    .line 25
    add-int/lit8 v1, v1, 0x2

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroidx/lifecycle/x;->M(I)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    int-to-short v0, v0

    .line 32
    int-to-long v0, v0

    .line 33
    const/16 v2, 0x30

    .line 34
    .line 35
    shl-long/2addr v0, v2

    .line 36
    return-wide v0

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final h()I
    .locals 2

    .line 1
    iget v0, p0, Ll5/j;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ll5/a0;->a:Lk5/u;

    .line 7
    .line 8
    iget-object v0, v0, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 9
    .line 10
    iget v1, p0, Ll5/a0;->c:I

    .line 11
    .line 12
    add-int/lit8 v1, v1, 0x1

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroidx/lifecycle/x;->O(I)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0

    .line 19
    :pswitch_0
    iget-object v0, p0, Ll5/a0;->a:Lk5/u;

    .line 20
    .line 21
    iget-object v0, v0, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 22
    .line 23
    iget v1, p0, Ll5/a0;->c:I

    .line 24
    .line 25
    add-int/lit8 v1, v1, 0x1

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroidx/lifecycle/x;->O(I)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    return v0

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
