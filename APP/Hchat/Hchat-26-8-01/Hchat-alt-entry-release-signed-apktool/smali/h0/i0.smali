.class public final synthetic Lh0/i0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Li0/l2;


# direct methods
.method public synthetic constructor <init>(Li0/l2;I)V
    .locals 0

    .line 1
    iput p2, p0, Lh0/i0;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lh0/i0;->h:Li0/l2;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lh0/i0;->g:I

    .line 2
    .line 3
    iget-object v1, p0, Lh0/i0;->h:Li0/l2;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Number;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    :goto_0
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0

    .line 23
    :pswitch_0
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Ljava/lang/Number;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    goto :goto_0

    .line 34
    :pswitch_1
    sget-object v0, Lh0/m0;->a:Li/n;

    .line 35
    .line 36
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Le1/b;

    .line 41
    .line 42
    iget-wide v0, v0, Le1/b;->a:J

    .line 43
    .line 44
    new-instance v2, Le1/b;

    .line 45
    .line 46
    invoke-direct {v2, v0, v1}, Le1/b;-><init>(J)V

    .line 47
    .line 48
    .line 49
    return-object v2

    .line 50
    :pswitch_2
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, Le1/b;

    .line 55
    .line 56
    iget-wide v0, v0, Le1/b;->a:J

    .line 57
    .line 58
    new-instance v2, Le1/b;

    .line 59
    .line 60
    invoke-direct {v2, v0, v1}, Le1/b;-><init>(J)V

    .line 61
    .line 62
    .line 63
    return-object v2

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
