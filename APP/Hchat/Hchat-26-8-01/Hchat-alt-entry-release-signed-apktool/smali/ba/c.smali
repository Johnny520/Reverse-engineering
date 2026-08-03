.class public final synthetic Lba/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/IntUnaryOperator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lba/c;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final applyAsInt(I)I
    .locals 2

    .line 1
    iget v0, p0, Lba/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const v0, 0xf423f

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-lt p1, v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    add-int/2addr v1, p1

    .line 14
    :goto_0
    return v1

    .line 15
    :pswitch_0
    const/16 v0, 0x74ff

    .line 16
    .line 17
    if-lt p1, v0, :cond_1

    .line 18
    .line 19
    const/16 p1, 0x7410

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    add-int/lit8 p1, p1, 0x1

    .line 23
    .line 24
    :goto_1
    return p1

    .line 25
    :pswitch_1
    const v0, 0xf423f

    .line 26
    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    if-lt p1, v0, :cond_2

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_2
    add-int/2addr v1, p1

    .line 33
    :goto_2
    return v1

    .line 34
    :pswitch_2
    const/16 v0, 0x6aff

    .line 35
    .line 36
    if-lt p1, v0, :cond_3

    .line 37
    .line 38
    const/16 p1, 0x6a10

    .line 39
    .line 40
    goto :goto_3

    .line 41
    :cond_3
    add-int/lit8 p1, p1, 0x1

    .line 42
    .line 43
    :goto_3
    return p1

    .line 44
    :pswitch_3
    const/16 v0, 0x75ff

    .line 45
    .line 46
    if-lt p1, v0, :cond_4

    .line 47
    .line 48
    const/16 p1, 0x7510

    .line 49
    .line 50
    goto :goto_4

    .line 51
    :cond_4
    add-int/lit8 p1, p1, 0x1

    .line 52
    .line 53
    :goto_4
    return p1

    .line 54
    :pswitch_4
    const/16 v0, 0x6bff

    .line 55
    .line 56
    if-lt p1, v0, :cond_5

    .line 57
    .line 58
    const/16 p1, 0x6b10

    .line 59
    .line 60
    goto :goto_5

    .line 61
    :cond_5
    add-int/lit8 p1, p1, 0x1

    .line 62
    .line 63
    :goto_5
    return p1

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
