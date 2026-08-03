.class public Lf6/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:I

.field public b:Z

.field public c:I

.field public d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 10
    const/4 v0, 0x0

    iput v0, p0, Lf6/b;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lk7/a;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lf6/b;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lf6/b;->d:Ljava/lang/Object;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lf6/b;->d:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, [Ljava/lang/Object;

    .line 7
    .line 8
    array-length v1, v0

    .line 9
    iget v2, p0, Lf6/b;->c:I

    .line 10
    .line 11
    add-int/lit8 v3, v2, 0x1

    .line 12
    .line 13
    if-ltz v3, :cond_5

    .line 14
    .line 15
    if-gt v3, v1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    shr-int/lit8 v4, v1, 0x1

    .line 19
    .line 20
    add-int/2addr v1, v4

    .line 21
    add-int/lit8 v1, v1, 0x1

    .line 22
    .line 23
    if-ge v1, v3, :cond_1

    .line 24
    .line 25
    invoke-static {v2}, Ljava/lang/Integer;->highestOneBit(I)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    shl-int/lit8 v1, v1, 0x1

    .line 30
    .line 31
    :cond_1
    if-gez v1, :cond_2

    .line 32
    .line 33
    const v1, 0x7fffffff

    .line 34
    .line 35
    .line 36
    :cond_2
    :goto_0
    array-length v0, v0

    .line 37
    if-gt v1, v0, :cond_3

    .line 38
    .line 39
    iget-boolean v0, p0, Lf6/b;->b:Z

    .line 40
    .line 41
    if-eqz v0, :cond_4

    .line 42
    .line 43
    :cond_3
    iget-object v0, p0, Lf6/b;->d:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, [Ljava/lang/Object;

    .line 46
    .line 47
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iput-object v0, p0, Lf6/b;->d:Ljava/lang/Object;

    .line 52
    .line 53
    const/4 v0, 0x0

    .line 54
    iput-boolean v0, p0, Lf6/b;->b:Z

    .line 55
    .line 56
    :cond_4
    iget-object v0, p0, Lf6/b;->d:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, [Ljava/lang/Object;

    .line 59
    .line 60
    iget v1, p0, Lf6/b;->c:I

    .line 61
    .line 62
    add-int/lit8 v2, v1, 0x1

    .line 63
    .line 64
    iput v2, p0, Lf6/b;->c:I

    .line 65
    .line 66
    aput-object p1, v0, v1

    .line 67
    .line 68
    return-void

    .line 69
    :cond_5
    const-string p1, "cannot store more than Integer.MAX_VALUE elements"

    .line 70
    .line 71
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Lf6/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    iget-boolean v0, p0, Lf6/b;->b:Z

    .line 12
    .line 13
    iget v1, p0, Lf6/b;->c:I

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const-string v0, "FOUND="

    .line 18
    .line 19
    invoke-static {v1, v0}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :goto_0
    return-object v0

    .line 29
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
