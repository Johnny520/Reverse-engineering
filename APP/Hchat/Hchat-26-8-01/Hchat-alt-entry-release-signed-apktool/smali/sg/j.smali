.class public abstract Lsg/j;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Lsg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lsg/i;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lsg/j;->a:Lsg/i;

    .line 7
    .line 8
    return-void
.end method

.method public static a(IILsg/a;)Lsg/c;
    .locals 3

    .line 1
    and-int/lit8 v0, p1, 0x1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move p0, v1

    .line 7
    :cond_0
    and-int/lit8 p1, p1, 0x2

    .line 8
    .line 9
    sget-object v0, Lsg/a;->g:Lsg/a;

    .line 10
    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    move-object p2, v0

    .line 14
    :cond_1
    const/4 p1, -0x2

    .line 15
    const/4 v2, 0x1

    .line 16
    if-eq p0, p1, :cond_8

    .line 17
    .line 18
    const/4 p1, -0x1

    .line 19
    if-eq p0, p1, :cond_6

    .line 20
    .line 21
    if-eqz p0, :cond_4

    .line 22
    .line 23
    const p1, 0x7fffffff

    .line 24
    .line 25
    .line 26
    if-eq p0, p1, :cond_3

    .line 27
    .line 28
    if-ne p2, v0, :cond_2

    .line 29
    .line 30
    new-instance p1, Lsg/c;

    .line 31
    .line 32
    invoke-direct {p1, p0}, Lsg/c;-><init>(I)V

    .line 33
    .line 34
    .line 35
    return-object p1

    .line 36
    :cond_2
    new-instance p1, Lsg/n;

    .line 37
    .line 38
    invoke-direct {p1, p0, p2}, Lsg/n;-><init>(ILsg/a;)V

    .line 39
    .line 40
    .line 41
    return-object p1

    .line 42
    :cond_3
    new-instance p0, Lsg/c;

    .line 43
    .line 44
    invoke-direct {p0, p1}, Lsg/c;-><init>(I)V

    .line 45
    .line 46
    .line 47
    return-object p0

    .line 48
    :cond_4
    if-ne p2, v0, :cond_5

    .line 49
    .line 50
    new-instance p0, Lsg/c;

    .line 51
    .line 52
    invoke-direct {p0, v1}, Lsg/c;-><init>(I)V

    .line 53
    .line 54
    .line 55
    return-object p0

    .line 56
    :cond_5
    new-instance p0, Lsg/n;

    .line 57
    .line 58
    invoke-direct {p0, v2, p2}, Lsg/n;-><init>(ILsg/a;)V

    .line 59
    .line 60
    .line 61
    return-object p0

    .line 62
    :cond_6
    if-ne p2, v0, :cond_7

    .line 63
    .line 64
    new-instance p0, Lsg/n;

    .line 65
    .line 66
    sget-object p1, Lsg/a;->h:Lsg/a;

    .line 67
    .line 68
    invoke-direct {p0, v2, p1}, Lsg/n;-><init>(ILsg/a;)V

    .line 69
    .line 70
    .line 71
    return-object p0

    .line 72
    :cond_7
    const-string p0, "CONFLATED capacity cannot be used with non-default onBufferOverflow"

    .line 73
    .line 74
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    const/4 p0, 0x0

    .line 78
    return-object p0

    .line 79
    :cond_8
    if-ne p2, v0, :cond_9

    .line 80
    .line 81
    new-instance p0, Lsg/c;

    .line 82
    .line 83
    sget-object p1, Lsg/g;->e:Lsg/f;

    .line 84
    .line 85
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    sget p1, Lsg/f;->b:I

    .line 89
    .line 90
    invoke-direct {p0, p1}, Lsg/c;-><init>(I)V

    .line 91
    .line 92
    .line 93
    return-object p0

    .line 94
    :cond_9
    new-instance p0, Lsg/n;

    .line 95
    .line 96
    invoke-direct {p0, v2, p2}, Lsg/n;-><init>(ILsg/a;)V

    .line 97
    .line 98
    .line 99
    return-object p0
.end method
