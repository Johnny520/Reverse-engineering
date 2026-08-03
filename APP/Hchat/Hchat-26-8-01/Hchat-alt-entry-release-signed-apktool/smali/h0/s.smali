.class public final Lh0/s;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 17
    const/4 v0, 0x2

    iput v0, p0, Lh0/s;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(IIILi2/k0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lh0/s;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p1, p0, Lh0/s;->b:I

    .line 8
    .line 9
    iput p2, p0, Lh0/s;->c:I

    .line 10
    .line 11
    iput p3, p0, Lh0/s;->d:I

    .line 12
    .line 13
    iput-object p4, p0, Lh0/s;->e:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(Lm0/l0;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lh0/s;->a:I

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh0/s;->e:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(I)Lh0/u;
    .locals 4

    .line 1
    new-instance v0, Lh0/u;

    .line 2
    .line 3
    iget-object v1, p0, Lh0/s;->e:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Li2/k0;

    .line 6
    .line 7
    invoke-static {v1, p1}, La7/a;->y(Li2/k0;I)Lt2/j;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-wide/16 v2, 0x1

    .line 12
    .line 13
    invoke-direct {v0, v1, p1, v2, v3}, Lh0/u;-><init>(Lt2/j;IJ)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public b()I
    .locals 2

    .line 1
    iget v0, p0, Lh0/s;->d:I

    .line 2
    .line 3
    iget v1, p0, Lh0/s;->c:I

    .line 4
    .line 5
    sub-int/2addr v0, v1

    .line 6
    return v0
.end method

.method public c(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Lh0/s;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lm0/l0;

    .line 4
    .line 5
    iget-object v0, v0, Lm0/l0;->e:[I

    .line 6
    .line 7
    iget v1, p0, Lh0/s;->c:I

    .line 8
    .line 9
    add-int/2addr v1, p1

    .line 10
    aget p1, v0, v1

    .line 11
    .line 12
    return p1
.end method

.method public d(I)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lh0/s;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lm0/l0;

    .line 4
    .line 5
    iget-object v0, v0, Lm0/l0;->g:[Ljava/lang/Object;

    .line 6
    .line 7
    iget v1, p0, Lh0/s;->d:I

    .line 8
    .line 9
    add-int/2addr v1, p1

    .line 10
    aget-object p1, v0, v1

    .line 11
    .line 12
    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget v0, p0, Lh0/s;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_1
    const-string v0, ""

    .line 12
    .line 13
    return-object v0

    .line 14
    :pswitch_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v1, "SelectionInfo(id=1, range=("

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget v1, p0, Lh0/s;->b:I

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const/16 v2, 0x2d

    .line 27
    .line 28
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget-object v3, p0, Lh0/s;->e:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v3, Li2/k0;

    .line 34
    .line 35
    invoke-static {v3, v1}, La7/a;->y(Li2/k0;I)Lt2/j;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const/16 v1, 0x2c

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    iget v1, p0, Lh0/s;->c:I

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-static {v3, v1}, La7/a;->y(Li2/k0;I)Lt2/j;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v1, "), prevOffset="

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    iget v1, p0, Lh0/s;->d:I

    .line 68
    .line 69
    const/16 v2, 0x29

    .line 70
    .line 71
    invoke-static {v0, v1, v2}, Lp/a;->n(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    return-object v0

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
