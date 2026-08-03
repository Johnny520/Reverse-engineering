.class public final synthetic Lsh/t1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:F

.field public final synthetic i:Li0/l2;


# direct methods
.method public synthetic constructor <init>(FLi0/l2;I)V
    .locals 0

    .line 1
    iput p3, p0, Lsh/t1;->g:I

    .line 2
    .line 3
    iput p1, p0, Lsh/t1;->h:F

    .line 4
    .line 5
    iput-object p2, p0, Lsh/t1;->i:Li0/l2;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lsh/t1;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lsh/t1;->i:Li0/l2;

    .line 7
    .line 8
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Number;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    int-to-float v0, v0

    .line 23
    iget v1, p0, Lsh/t1;->h:F

    .line 24
    .line 25
    div-float/2addr v0, v1

    .line 26
    const/4 v1, 0x3

    .line 27
    int-to-float v1, v1

    .line 28
    mul-float/2addr v0, v1

    .line 29
    const/4 v1, 0x0

    .line 30
    const/high16 v2, 0x3f800000    # 1.0f

    .line 31
    .line 32
    invoke-static {v0, v1, v2}, Lr9/e0;->q(FFF)F

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    sub-float/2addr v2, v0

    .line 37
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    return-object v0

    .line 42
    :pswitch_0
    iget-object v0, p0, Lsh/t1;->i:Li0/l2;

    .line 43
    .line 44
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, Ljava/lang/Number;

    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    int-to-float v0, v0

    .line 59
    iget v1, p0, Lsh/t1;->h:F

    .line 60
    .line 61
    div-float/2addr v0, v1

    .line 62
    const/4 v1, 0x3

    .line 63
    int-to-float v1, v1

    .line 64
    mul-float/2addr v0, v1

    .line 65
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    return-object v0

    .line 70
    nop

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
