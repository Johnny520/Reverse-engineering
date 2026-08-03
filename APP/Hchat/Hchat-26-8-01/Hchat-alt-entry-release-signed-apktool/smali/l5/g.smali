.class public final Ll5/g;
.super Ll5/a0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lt5/k;


# instance fields
.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Lk5/u;Lf5/f;II)V
    .locals 0

    .line 1
    iput p4, p0, Ll5/g;->d:I

    .line 2
    .line 3
    invoke-direct {p0, p1, p2, p3}, Ll5/a0;-><init>(Lk5/u;Lf5/f;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final e()I
    .locals 2

    .line 1
    iget v0, p0, Ll5/g;->d:I

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
    add-int/lit8 v1, v1, 0x4

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroidx/lifecycle/x;->P(I)I

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
    add-int/lit8 v1, v1, 0x2

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroidx/lifecycle/x;->P(I)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    return v0

    .line 32
    :pswitch_1
    iget-object v0, p0, Ll5/a0;->a:Lk5/u;

    .line 33
    .line 34
    iget-object v0, v0, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 35
    .line 36
    iget v1, p0, Ll5/a0;->c:I

    .line 37
    .line 38
    add-int/lit8 v1, v1, 0x1

    .line 39
    .line 40
    iget-object v0, v0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, [B

    .line 43
    .line 44
    aget-byte v0, v0, v1

    .line 45
    .line 46
    invoke-static {v0}, Ld6/d;->d(I)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    return v0

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final h()I
    .locals 2

    .line 1
    iget v0, p0, Ll5/g;->d:I

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
    invoke-virtual {v0, v1}, Landroidx/lifecycle/x;->P(I)I

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
    :pswitch_1
    iget-object v0, p0, Ll5/a0;->a:Lk5/u;

    .line 33
    .line 34
    iget-object v0, v0, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 35
    .line 36
    iget v1, p0, Ll5/a0;->c:I

    .line 37
    .line 38
    add-int/lit8 v1, v1, 0x1

    .line 39
    .line 40
    iget-object v0, v0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, [B

    .line 43
    .line 44
    aget-byte v0, v0, v1

    .line 45
    .line 46
    and-int/lit8 v0, v0, 0xf

    .line 47
    .line 48
    return v0

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
