.class public Ld7/r;
.super Ld7/q;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic n:I

.field public final o:Lr7/c;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Ld7/r;->n:I

    .line 3
    .line 4
    sget-object v0, Ld7/o;->o:Ld7/o;

    .line 5
    .line 6
    invoke-direct {p0, v0}, Ld7/q;-><init>(Ld7/o;)V

    .line 7
    .line 8
    .line 9
    new-instance v0, Lr7/c;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v0, v1, v2}, Lr7/c;-><init>(II)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Ld7/r;->o:Lr7/c;

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lo7/d;->P(Lk7/a;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public constructor <init>(Ld7/o;)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Ld7/r;->n:I

    .line 22
    invoke-direct {p0, p1}, Ld7/q;-><init>(Ld7/o;)V

    .line 23
    new-instance p1, Lr7/c;

    const/4 v1, 0x0

    .line 24
    invoke-direct {p1, v0, v1}, Lr7/c;-><init>(II)V

    .line 25
    iput-object p1, p0, Ld7/r;->o:Lr7/c;

    .line 26
    invoke-virtual {p0, p1}, Lo7/d;->P(Lk7/a;)V

    return-void
.end method


# virtual methods
.method public final B(Lq7/b;)V
    .locals 2

    .line 1
    iget v0, p0, Ld7/r;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-class v0, Ld7/p;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lk7/a;->u(Ljava/lang/Class;)Lk7/a;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ld7/p;

    .line 13
    .line 14
    invoke-virtual {v0}, Ld7/j;->Q()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    long-to-int v0, v0

    .line 19
    add-int/lit8 v0, v0, -0x4

    .line 20
    .line 21
    iget-object v1, p0, Ld7/r;->o:Lr7/c;

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Lr7/c;->Q(I)V

    .line 24
    .line 25
    .line 26
    invoke-super {p0, p1}, Lk7/c;->B(Lq7/b;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_0
    const-class v0, Ld7/p;

    .line 31
    .line 32
    invoke-virtual {p0, v0}, Lk7/a;->u(Ljava/lang/Class;)Lk7/a;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Ld7/p;

    .line 37
    .line 38
    invoke-virtual {v0}, Ld7/j;->Q()J

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    long-to-int v0, v0

    .line 43
    add-int/lit8 v0, v0, -0x4

    .line 44
    .line 45
    iget-object v1, p0, Ld7/r;->o:Lr7/c;

    .line 46
    .line 47
    invoke-virtual {v1, v0}, Lr7/c;->Q(I)V

    .line 48
    .line 49
    .line 50
    invoke-super {p0, p1}, Lk7/c;->B(Lq7/b;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Ld7/r;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ld7/q;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v1, "padding = "

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Ld7/r;->o:Lr7/c;

    .line 19
    .line 20
    iget-object v1, v1, Lr7/b;->k:[B

    .line 21
    .line 22
    array-length v1, v1

    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    return-object v0

    .line 31
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
