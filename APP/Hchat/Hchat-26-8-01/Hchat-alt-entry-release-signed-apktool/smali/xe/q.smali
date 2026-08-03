.class public final Lxe/q;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final b:Lxe/q;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lxe/q;

    .line 2
    .line 3
    new-instance v1, Lbc/g;

    .line 4
    .line 5
    invoke-direct {v1}, Lbc/g;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Lxe/q;-><init>(Lbc/g;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lxe/q;->b:Lxe/q;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Lbc/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget p1, p1, Lbc/g;->V:I

    .line 8
    .line 9
    iput p1, p0, Lxe/q;->a:I

    .line 10
    .line 11
    return-void
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    :goto_0
    if-ge v2, v0, :cond_3

    .line 12
    .line 13
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    const/16 v4, 0x20

    .line 18
    .line 19
    if-eq v3, v4, :cond_1

    .line 20
    .line 21
    const/16 v4, 0x24

    .line 22
    .line 23
    if-eq v3, v4, :cond_1

    .line 24
    .line 25
    const/16 v4, 0x2a

    .line 26
    .line 27
    if-eq v3, v4, :cond_2

    .line 28
    .line 29
    const/16 v4, 0x2c

    .line 30
    .line 31
    if-eq v3, v4, :cond_1

    .line 32
    .line 33
    const/16 v4, 0x5b

    .line 34
    .line 35
    if-eq v3, v4, :cond_0

    .line 36
    .line 37
    const/16 v4, 0x5d

    .line 38
    .line 39
    if-eq v3, v4, :cond_2

    .line 40
    .line 41
    const/16 v4, 0x2e

    .line 42
    .line 43
    if-eq v3, v4, :cond_1

    .line 44
    .line 45
    const/16 v4, 0x2f

    .line 46
    .line 47
    if-eq v3, v4, :cond_1

    .line 48
    .line 49
    const/16 v4, 0x3b

    .line 50
    .line 51
    if-eq v3, v4, :cond_1

    .line 52
    .line 53
    const/16 v4, 0x3c

    .line 54
    .line 55
    if-eq v3, v4, :cond_1

    .line 56
    .line 57
    const/16 v4, 0x3e

    .line 58
    .line 59
    if-eq v3, v4, :cond_2

    .line 60
    .line 61
    const/16 v4, 0x3f

    .line 62
    .line 63
    if-eq v3, v4, :cond_2

    .line 64
    .line 65
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_0
    const/16 v3, 0x41

    .line 70
    .line 71
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    const/16 v3, 0x5f

    .line 76
    .line 77
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_3
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    return-object p0
.end method

.method public static b(D)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string p0, "Double.NaN"

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const-wide/high16 v0, -0x10000000000000L    # Double.NEGATIVE_INFINITY

    .line 11
    .line 12
    cmpl-double v0, p0, v0

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    const-string p0, "Double.NEGATIVE_INFINITY"

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_1
    const-wide/high16 v0, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    .line 20
    .line 21
    cmpl-double v0, p0, v0

    .line 22
    .line 23
    if-nez v0, :cond_2

    .line 24
    .line 25
    const-string p0, "Double.POSITIVE_INFINITY"

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_2
    const-wide/16 v0, 0x1

    .line 29
    .line 30
    cmpl-double v0, p0, v0

    .line 31
    .line 32
    if-nez v0, :cond_3

    .line 33
    .line 34
    const-string p0, "Double.MIN_VALUE"

    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_3
    const-wide v0, 0x7fefffffffffffffL    # Double.MAX_VALUE

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    cmpl-double v0, p0, v0

    .line 43
    .line 44
    if-nez v0, :cond_4

    .line 45
    .line 46
    const-string p0, "Double.MAX_VALUE"

    .line 47
    .line 48
    return-object p0

    .line 49
    :cond_4
    const-wide/high16 v0, 0x10000000000000L

    .line 50
    .line 51
    cmpl-double v0, p0, v0

    .line 52
    .line 53
    if-nez v0, :cond_5

    .line 54
    .line 55
    const-string p0, "Double.MIN_NORMAL"

    .line 56
    .line 57
    return-object p0

    .line 58
    :cond_5
    invoke-static {p0, p1}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    const-string p1, "d"

    .line 63
    .line 64
    invoke-static {p0, p1}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0
.end method

.method public static c(F)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string p0, "Float.NaN"

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const/high16 v0, -0x800000    # Float.NEGATIVE_INFINITY

    .line 11
    .line 12
    cmpl-float v0, p0, v0

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    const-string p0, "Float.NEGATIVE_INFINITY"

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_1
    const/high16 v0, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 20
    .line 21
    cmpl-float v0, p0, v0

    .line 22
    .line 23
    if-nez v0, :cond_2

    .line 24
    .line 25
    const-string p0, "Float.POSITIVE_INFINITY"

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_2
    const/4 v0, 0x1

    .line 29
    cmpl-float v0, p0, v0

    .line 30
    .line 31
    if-nez v0, :cond_3

    .line 32
    .line 33
    const-string p0, "Float.MIN_VALUE"

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_3
    const v0, 0x7f7fffff    # Float.MAX_VALUE

    .line 37
    .line 38
    .line 39
    cmpl-float v0, p0, v0

    .line 40
    .line 41
    if-nez v0, :cond_4

    .line 42
    .line 43
    const-string p0, "Float.MAX_VALUE"

    .line 44
    .line 45
    return-object p0

    .line 46
    :cond_4
    const/high16 v0, 0x800000

    .line 47
    .line 48
    cmpl-float v0, p0, v0

    .line 49
    .line 50
    if-nez v0, :cond_5

    .line 51
    .line 52
    const-string p0, "Float.MIN_NORMAL"

    .line 53
    .line 54
    return-object p0

    .line 55
    :cond_5
    invoke-static {p0}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    const-string v0, "f"

    .line 60
    .line 61
    invoke-static {p0, v0}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    return-object p0
.end method

.method public static f(I)Ljava/lang/String;
    .locals 1

    .line 1
    const/16 v0, 0xc

    .line 2
    .line 3
    if-eq p0, v0, :cond_4

    .line 4
    .line 5
    const/16 v0, 0xd

    .line 6
    .line 7
    if-eq p0, v0, :cond_3

    .line 8
    .line 9
    const/16 v0, 0x22

    .line 10
    .line 11
    if-eq p0, v0, :cond_2

    .line 12
    .line 13
    const/16 v0, 0x27

    .line 14
    .line 15
    if-eq p0, v0, :cond_1

    .line 16
    .line 17
    const/16 v0, 0x5c

    .line 18
    .line 19
    if-eq p0, v0, :cond_0

    .line 20
    .line 21
    packed-switch p0, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    return-object p0

    .line 26
    :pswitch_0
    const-string p0, "\\n"

    .line 27
    .line 28
    return-object p0

    .line 29
    :pswitch_1
    const-string p0, "\\t"

    .line 30
    .line 31
    return-object p0

    .line 32
    :pswitch_2
    const-string p0, "\\b"

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_0
    const-string p0, "\\\\"

    .line 36
    .line 37
    return-object p0

    .line 38
    :cond_1
    const-string p0, "\'"

    .line 39
    .line 40
    return-object p0

    .line 41
    :cond_2
    const-string p0, "\\\""

    .line 42
    .line 43
    return-object p0

    .line 44
    :cond_3
    const-string p0, "\\r"

    .line 45
    .line 46
    return-object p0

    .line 47
    :cond_4
    const-string p0, "\\f"

    .line 48
    .line 49
    return-object p0

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static g(Ljava/lang/String;)Z
    .locals 0

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0

    .line 12
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 13
    return p0
.end method

.method public static h(CZ)Ljava/lang/String;
    .locals 2

    .line 1
    const/16 v0, 0x27

    .line 2
    .line 3
    if-ne p0, v0, :cond_0

    .line 4
    .line 5
    const-string p0, "\'\\\'\'"

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    invoke-static {p0}, Lxe/q;->f(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "\'"

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-static {v1, v0, v1}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :cond_1
    sget-object v0, Lkd/d;->a:Ljava/util/regex/Pattern;

    .line 22
    .line 23
    const/16 v0, 0x20

    .line 24
    .line 25
    if-gt v0, p0, :cond_2

    .line 26
    .line 27
    const/16 v0, 0x7e

    .line 28
    .line 29
    if-gt p0, v0, :cond_2

    .line 30
    .line 31
    new-instance p1, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    if-eqz p1, :cond_3

    .line 52
    .line 53
    const-string p1, "(char) "

    .line 54
    .line 55
    invoke-static {p1, p0}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    :cond_3
    return-object p0
.end method

.method public static j(Ljava/lang/String;Ljava/util/function/IntConsumer;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Ljava/lang/String;->codePointAt(I)I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    invoke-interface {p1, v2}, Ljava/util/function/IntConsumer;->accept(I)V

    .line 13
    .line 14
    .line 15
    invoke-static {v2}, Ljava/lang/Character;->charCount(I)I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    add-int/2addr v1, v2

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    return-void
.end method


# virtual methods
.method public final d(JZ)Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Lxe/q;->a:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_1

    .line 5
    .line 6
    const-wide v0, 0x7fffffffffffffffL

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    cmp-long v0, p1, v0

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const-string p1, "Long.MAX_VALUE"

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_0
    const-wide/high16 v0, -0x8000000000000000L

    .line 19
    .line 20
    cmp-long v0, p1, v0

    .line 21
    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    const-string p1, "Long.MIN_VALUE"

    .line 25
    .line 26
    return-object p1

    .line 27
    :cond_1
    const/16 v0, 0x8

    .line 28
    .line 29
    invoke-virtual {p0, v0, p1, p2, p3}, Lxe/q;->e(IJZ)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1
.end method

.method public final e(IJZ)Ljava/lang/String;
    .locals 5

    .line 1
    iget v0, p0, Lxe/q;->a:I

    .line 2
    .line 3
    if-eqz v0, :cond_a

    .line 4
    .line 5
    const/4 v1, 0x3

    .line 6
    const/4 v2, 0x1

    .line 7
    if-ne v0, v1, :cond_1

    .line 8
    .line 9
    invoke-static {p2, p3}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-wide/16 v3, 0x0

    .line 14
    .line 15
    cmp-long v1, p2, v3

    .line 16
    .line 17
    const-string v3, "0x"

    .line 18
    .line 19
    if-gez v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 22
    .line 23
    .line 24
    move-result p4

    .line 25
    mul-int/lit8 v1, p1, 0x2

    .line 26
    .line 27
    sub-int v1, p4, v1

    .line 28
    .line 29
    invoke-virtual {v0, v1, p4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p4

    .line 33
    invoke-virtual {v3, p4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p4

    .line 37
    move-object v0, p4

    .line 38
    move p4, v2

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-static {v3, v0}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    goto :goto_0

    .line 45
    :cond_1
    invoke-static {p2, p3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    :goto_0
    const/16 v1, 0x8

    .line 50
    .line 51
    if-ne p1, v1, :cond_3

    .line 52
    .line 53
    const-wide/high16 v3, -0x8000000000000000L

    .line 54
    .line 55
    cmp-long v3, p2, v3

    .line 56
    .line 57
    if-eqz v3, :cond_2

    .line 58
    .line 59
    invoke-static {p2, p3}, Ljava/lang/Math;->abs(J)J

    .line 60
    .line 61
    .line 62
    move-result-wide p2

    .line 63
    const-wide/32 v3, 0x7fffffff

    .line 64
    .line 65
    .line 66
    cmp-long p2, p2, v3

    .line 67
    .line 68
    if-ltz p2, :cond_3

    .line 69
    .line 70
    :cond_2
    move p4, v2

    .line 71
    :cond_3
    if-eqz p4, :cond_9

    .line 72
    .line 73
    if-ne p1, v1, :cond_4

    .line 74
    .line 75
    const-string p1, "L"

    .line 76
    .line 77
    invoke-static {v0, p1}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    return-object p1

    .line 82
    :cond_4
    if-eq p1, v2, :cond_8

    .line 83
    .line 84
    const/4 p2, 0x2

    .line 85
    if-eq p1, p2, :cond_7

    .line 86
    .line 87
    const/4 p2, 0x4

    .line 88
    if-eq p1, p2, :cond_6

    .line 89
    .line 90
    if-ne p1, v1, :cond_5

    .line 91
    .line 92
    const-string p1, "(long) "

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_5
    const-string p2, "Unexpected number type length: "

    .line 96
    .line 97
    invoke-static {p1, p2}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-static {p1}, Lah/a;->k(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    const/4 p1, 0x0

    .line 105
    return-object p1

    .line 106
    :cond_6
    const-string p1, "(int) "

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_7
    const-string p1, "(short) "

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_8
    const-string p1, "(byte) "

    .line 113
    .line 114
    :goto_1
    invoke-static {p1, v0}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    return-object p1

    .line 119
    :cond_9
    return-object v0

    .line 120
    :cond_a
    const/4 p1, 0x0

    .line 121
    throw p1
.end method

.method public final i(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string p1, "\"\""

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    const/16 v1, 0x22

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    new-instance v2, Lkd/c;

    .line 21
    .line 22
    invoke-direct {v2, p0, v0}, Lkd/c;-><init>(Lxe/q;Ljava/lang/StringBuilder;)V

    .line 23
    .line 24
    .line 25
    invoke-static {p1, v2}, Lxe/q;->j(Ljava/lang/String;Ljava/util/function/IntConsumer;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1
.end method
