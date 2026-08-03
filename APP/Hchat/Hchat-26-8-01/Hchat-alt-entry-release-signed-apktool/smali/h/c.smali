.class public final Lh/c;
.super Lgg/m;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# static fields
.field public static final h:Lh/c;

.field public static final i:Lh/c;

.field public static final j:Lh/c;

.field public static final k:Lh/c;

.field public static final l:Lh/c;

.field public static final m:Lh/c;

.field public static final n:Lh/c;


# instance fields
.field public final synthetic g:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lh/c;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2}, Lh/c;-><init>(II)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lh/c;->h:Lh/c;

    .line 9
    .line 10
    new-instance v0, Lh/c;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-direct {v0, v1, v2}, Lh/c;-><init>(II)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lh/c;->i:Lh/c;

    .line 17
    .line 18
    new-instance v0, Lh/c;

    .line 19
    .line 20
    const/4 v2, 0x2

    .line 21
    invoke-direct {v0, v1, v2}, Lh/c;-><init>(II)V

    .line 22
    .line 23
    .line 24
    sput-object v0, Lh/c;->j:Lh/c;

    .line 25
    .line 26
    new-instance v0, Lh/c;

    .line 27
    .line 28
    const/4 v2, 0x3

    .line 29
    invoke-direct {v0, v1, v2}, Lh/c;-><init>(II)V

    .line 30
    .line 31
    .line 32
    sput-object v0, Lh/c;->k:Lh/c;

    .line 33
    .line 34
    new-instance v0, Lh/c;

    .line 35
    .line 36
    const/4 v2, 0x4

    .line 37
    invoke-direct {v0, v1, v2}, Lh/c;-><init>(II)V

    .line 38
    .line 39
    .line 40
    sput-object v0, Lh/c;->l:Lh/c;

    .line 41
    .line 42
    new-instance v0, Lh/c;

    .line 43
    .line 44
    const/4 v2, 0x5

    .line 45
    invoke-direct {v0, v1, v2}, Lh/c;-><init>(II)V

    .line 46
    .line 47
    .line 48
    sput-object v0, Lh/c;->m:Lh/c;

    .line 49
    .line 50
    new-instance v0, Lh/c;

    .line 51
    .line 52
    const/4 v2, 0x6

    .line 53
    invoke-direct {v0, v1, v2}, Lh/c;-><init>(II)V

    .line 54
    .line 55
    .line 56
    sput-object v0, Lh/c;->n:Lh/c;

    .line 57
    .line 58
    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    .line 1
    iput p2, p0, Lh/c;->g:I

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lgg/m;-><init>(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lh/c;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Li/e1;

    .line 7
    .line 8
    sget-object p1, Lh/m0;->c:Li/r0;

    .line 9
    .line 10
    return-object p1

    .line 11
    :pswitch_0
    check-cast p1, Li/e1;

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    const/4 v0, 0x7

    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-static {v1, v1, p1, v0}, Li/d;->o(FFLjava/lang/Object;I)Li/r0;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1

    .line 21
    :pswitch_1
    check-cast p1, Li/n;

    .line 22
    .line 23
    iget v0, p1, Li/n;->a:F

    .line 24
    .line 25
    iget p1, p1, Li/n;->b:F

    .line 26
    .line 27
    invoke-static {v0, p1}, Lf1/c0;->g(FF)J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    new-instance p1, Lf1/u0;

    .line 32
    .line 33
    invoke-direct {p1, v0, v1}, Lf1/u0;-><init>(J)V

    .line 34
    .line 35
    .line 36
    return-object p1

    .line 37
    :pswitch_2
    check-cast p1, Lf1/u0;

    .line 38
    .line 39
    iget-wide v0, p1, Lf1/u0;->a:J

    .line 40
    .line 41
    new-instance p1, Li/n;

    .line 42
    .line 43
    const/16 v2, 0x20

    .line 44
    .line 45
    shr-long v2, v0, v2

    .line 46
    .line 47
    long-to-int v2, v2

    .line 48
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    const-wide v3, 0xffffffffL

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    and-long/2addr v0, v3

    .line 58
    long-to-int v0, v0

    .line 59
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    invoke-direct {p1, v2, v0}, Li/n;-><init>(FF)V

    .line 64
    .line 65
    .line 66
    return-object p1

    .line 67
    :pswitch_3
    check-cast p1, Lf1/w;

    .line 68
    .line 69
    iget-wide v0, p1, Lf1/w;->a:J

    .line 70
    .line 71
    sget-object p1, Lg1/e;->x:Lg1/m;

    .line 72
    .line 73
    invoke-static {v0, v1, p1}, Lf1/w;->a(JLg1/c;)J

    .line 74
    .line 75
    .line 76
    move-result-wide v0

    .line 77
    invoke-static {v0, v1}, Lf1/w;->h(J)F

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    invoke-static {v0, v1}, Lf1/w;->g(J)F

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    invoke-static {v0, v1}, Lf1/w;->e(J)F

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    invoke-static {v0, v1}, Lf1/w;->d(J)F

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    new-instance v1, Li/p;

    .line 94
    .line 95
    invoke-direct {v1, v0, p1, v2, v3}, Li/p;-><init>(FFFF)V

    .line 96
    .line 97
    .line 98
    return-object v1

    .line 99
    :pswitch_4
    check-cast p1, Ljava/lang/Boolean;

    .line 100
    .line 101
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 102
    .line 103
    .line 104
    :pswitch_5
    return-object p1

    .line 105
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
