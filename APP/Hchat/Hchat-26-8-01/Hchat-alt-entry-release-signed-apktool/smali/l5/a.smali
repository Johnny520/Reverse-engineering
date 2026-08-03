.class public final Ll5/a;
.super Lk5/t;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic g:Ll5/b;

.field public final synthetic h:I

.field public final synthetic i:I

.field public final synthetic j:Ll5/b;


# direct methods
.method public constructor <init>(Ll5/b;II)V
    .locals 0

    .line 1
    iput p3, p0, Ll5/a;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Ll5/a;->j:Ll5/b;

    .line 4
    .line 5
    iput p2, p0, Ll5/a;->i:I

    .line 6
    .line 7
    iput-object p1, p0, Ll5/a;->g:Ll5/b;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(I)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Ll5/a;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ll5/a;->j:Ll5/b;

    .line 7
    .line 8
    iget-object v0, v0, Ll5/a0;->a:Lk5/u;

    .line 9
    .line 10
    iget-object v0, v0, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 11
    .line 12
    mul-int/lit8 p1, p1, 0x8

    .line 13
    .line 14
    iget v1, p0, Ll5/a;->i:I

    .line 15
    .line 16
    add-int/2addr p1, v1

    .line 17
    invoke-virtual {v0, p1}, Landroidx/lifecycle/x;->K(I)J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1

    .line 26
    :pswitch_0
    iget-object v0, p0, Ll5/a;->j:Ll5/b;

    .line 27
    .line 28
    iget-object v0, v0, Ll5/a0;->a:Lk5/u;

    .line 29
    .line 30
    iget-object v0, v0, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 31
    .line 32
    mul-int/lit8 p1, p1, 0x4

    .line 33
    .line 34
    iget v1, p0, Ll5/a;->i:I

    .line 35
    .line 36
    add-int/2addr p1, v1

    .line 37
    invoke-virtual {v0, p1}, Landroidx/lifecycle/x;->J(I)I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    return-object p1

    .line 46
    :pswitch_1
    iget-object v0, p0, Ll5/a;->j:Ll5/b;

    .line 47
    .line 48
    iget-object v0, v0, Ll5/a0;->a:Lk5/u;

    .line 49
    .line 50
    iget-object v0, v0, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 51
    .line 52
    mul-int/lit8 p1, p1, 0x2

    .line 53
    .line 54
    iget v1, p0, Ll5/a;->i:I

    .line 55
    .line 56
    add-int/2addr p1, v1

    .line 57
    invoke-virtual {v0, p1}, Landroidx/lifecycle/x;->M(I)I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    return-object p1

    .line 66
    :pswitch_2
    iget-object v0, p0, Ll5/a;->j:Ll5/b;

    .line 67
    .line 68
    iget-object v0, v0, Ll5/a0;->a:Lk5/u;

    .line 69
    .line 70
    iget-object v0, v0, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 71
    .line 72
    iget v1, p0, Ll5/a;->i:I

    .line 73
    .line 74
    add-int/2addr v1, p1

    .line 75
    iget-object p1, v0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast p1, [B

    .line 78
    .line 79
    aget-byte p1, p1, v1

    .line 80
    .line 81
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    return-object p1

    .line 86
    nop

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final size()I
    .locals 1

    .line 1
    iget-object v0, p0, Ll5/a;->g:Ll5/b;

    .line 2
    .line 3
    iget v0, v0, Ll5/b;->e:I

    .line 4
    .line 5
    return v0
.end method
