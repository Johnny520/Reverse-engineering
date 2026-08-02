.class public final Llv2;
.super Lqp0;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final t:Ljava/lang/String;

.field public u:I


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Llv2;->t:Ljava/lang/String;

    .line 10
    .line 11
    iput p2, p0, Llv2;->u:I

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    throw p0
.end method


# virtual methods
.method public final D(Lmj0;)I
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Llv2;->t:Ljava/lang/String;

    .line 3
    .line 4
    if-eqz v1, :cond_7

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    const/4 v3, 0x5

    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    iget v2, p0, Llv2;->u:I

    .line 14
    .line 15
    if-eq v2, v3, :cond_0

    .line 16
    .line 17
    iput v3, p0, Llv2;->u:I

    .line 18
    .line 19
    :cond_0
    invoke-virtual {p1, v1}, Lmj0;->e(Ljava/lang/CharSequence;)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    iget p0, p0, Llv2;->u:I

    .line 24
    .line 25
    const/4 v2, 0x1

    .line 26
    const/4 v4, 0x3

    .line 27
    if-eq p0, v2, :cond_4

    .line 28
    .line 29
    const/4 v5, 0x2

    .line 30
    if-eq p0, v5, :cond_3

    .line 31
    .line 32
    if-eq p0, v4, :cond_5

    .line 33
    .line 34
    const/4 v5, 0x4

    .line 35
    if-eq p0, v5, :cond_2

    .line 36
    .line 37
    if-ne p0, v3, :cond_1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const/4 p0, 0x0

    .line 41
    throw p0

    .line 42
    :cond_2
    move v5, v4

    .line 43
    goto :goto_0

    .line 44
    :cond_3
    move v5, v2

    .line 45
    goto :goto_0

    .line 46
    :cond_4
    move v5, v0

    .line 47
    :cond_5
    :goto_0
    invoke-virtual {p1, v4}, Lmj0;->m(I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, v0, v1}, Lmj0;->c(II)V

    .line 51
    .line 52
    .line 53
    if-eqz v5, :cond_6

    .line 54
    .line 55
    invoke-virtual {p1, v5}, Lmj0;->a(B)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, v2}, Lmj0;->l(I)V

    .line 59
    .line 60
    .line 61
    :cond_6
    invoke-virtual {p1}, Lmj0;->g()I

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    invoke-virtual {p1, p0}, Lmj0;->i(I)V

    .line 66
    .line 67
    .line 68
    return p0

    .line 69
    :cond_7
    const-string p0, "value must be specified"

    .line 70
    .line 71
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    return v0
.end method
