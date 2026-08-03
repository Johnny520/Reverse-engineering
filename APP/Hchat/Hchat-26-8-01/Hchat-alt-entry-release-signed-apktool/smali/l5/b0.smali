.class public final Ll5/b0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Lk5/t;


# direct methods
.method public synthetic constructor <init>(Lk5/t;II)V
    .locals 0

    .line 1
    iput p3, p0, Ll5/b0;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Ll5/b0;->c:Lk5/t;

    .line 4
    .line 5
    iput p2, p0, Ll5/b0;->b:I

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 3

    .line 1
    iget v0, p0, Ll5/b0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ll5/b0;->c:Lk5/t;

    .line 7
    .line 8
    check-cast v0, Ll5/d0;

    .line 9
    .line 10
    iget-object v0, v0, Ll5/d0;->g:Ll5/e0;

    .line 11
    .line 12
    iget-object v1, v0, Ll5/a0;->a:Lk5/u;

    .line 13
    .line 14
    iget-object v1, v1, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 15
    .line 16
    iget v0, v0, Ll5/a0;->c:I

    .line 17
    .line 18
    add-int/lit8 v0, v0, 0x4

    .line 19
    .line 20
    iget v2, p0, Ll5/b0;->b:I

    .line 21
    .line 22
    mul-int/lit8 v2, v2, 0x4

    .line 23
    .line 24
    add-int/2addr v2, v0

    .line 25
    invoke-virtual {v1, v2}, Landroidx/lifecycle/x;->J(I)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    return v0

    .line 30
    :pswitch_0
    iget-object v0, p0, Ll5/b0;->c:Lk5/t;

    .line 31
    .line 32
    check-cast v0, Lk5/r;

    .line 33
    .line 34
    iget v0, v0, Lk5/r;->h:I

    .line 35
    .line 36
    iget v1, p0, Ll5/b0;->b:I

    .line 37
    .line 38
    add-int/2addr v0, v1

    .line 39
    return v0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b()I
    .locals 3

    .line 1
    iget v0, p0, Ll5/b0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ll5/b0;->c:Lk5/t;

    .line 7
    .line 8
    check-cast v0, Ll5/d0;

    .line 9
    .line 10
    iget-object v0, v0, Ll5/d0;->g:Ll5/e0;

    .line 11
    .line 12
    iget-object v1, v0, Ll5/a0;->a:Lk5/u;

    .line 13
    .line 14
    iget-object v1, v1, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 15
    .line 16
    iget v2, v0, Ll5/a0;->c:I

    .line 17
    .line 18
    add-int/lit8 v2, v2, 0x4

    .line 19
    .line 20
    iget v0, v0, Ll5/e0;->d:I

    .line 21
    .line 22
    mul-int/lit8 v0, v0, 0x4

    .line 23
    .line 24
    add-int/2addr v0, v2

    .line 25
    iget v2, p0, Ll5/b0;->b:I

    .line 26
    .line 27
    mul-int/lit8 v2, v2, 0x4

    .line 28
    .line 29
    add-int/2addr v2, v0

    .line 30
    invoke-virtual {v1, v2}, Landroidx/lifecycle/x;->J(I)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    return v0

    .line 35
    :pswitch_0
    iget-object v0, p0, Ll5/b0;->c:Lk5/t;

    .line 36
    .line 37
    check-cast v0, Lk5/r;

    .line 38
    .line 39
    iget-object v0, v0, Lk5/r;->i:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, Ll5/c0;

    .line 42
    .line 43
    iget-object v1, v0, Ll5/a0;->a:Lk5/u;

    .line 44
    .line 45
    iget-object v1, v1, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 46
    .line 47
    iget v0, v0, Ll5/a0;->c:I

    .line 48
    .line 49
    add-int/lit8 v0, v0, 0x8

    .line 50
    .line 51
    iget v2, p0, Ll5/b0;->b:I

    .line 52
    .line 53
    mul-int/lit8 v2, v2, 0x4

    .line 54
    .line 55
    add-int/2addr v2, v0

    .line 56
    invoke-virtual {v1, v2}, Landroidx/lifecycle/x;->J(I)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    return v0

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
