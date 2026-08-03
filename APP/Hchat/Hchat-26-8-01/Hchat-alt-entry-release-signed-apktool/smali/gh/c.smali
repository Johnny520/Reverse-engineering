.class public final Lgh/c;
.super Lx6/d;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final g:Ljava/lang/String;

.field public h:I


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
    iput-object p1, p0, Lgh/c;->g:Ljava/lang/String;

    .line 10
    .line 11
    iput p2, p0, Lgh/c;->h:I

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    throw p1
.end method


# virtual methods
.method public final G(Lg6/b;)I
    .locals 4

    .line 1
    iget-object v0, p0, Lgh/c;->g:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_6

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    iget v1, p0, Lgh/c;->h:I

    .line 12
    .line 13
    const/4 v2, 0x5

    .line 14
    if-eq v1, v2, :cond_0

    .line 15
    .line 16
    iput v2, p0, Lgh/c;->h:I

    .line 17
    .line 18
    :cond_0
    invoke-virtual {p1, v0}, Lg6/b;->e(Ljava/lang/CharSequence;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v1, p0, Lgh/c;->h:I

    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    if-eq v1, v2, :cond_3

    .line 26
    .line 27
    const/4 v3, 0x2

    .line 28
    if-eq v1, v3, :cond_4

    .line 29
    .line 30
    const/4 v2, 0x3

    .line 31
    if-eq v1, v2, :cond_1

    .line 32
    .line 33
    const/4 v3, 0x4

    .line 34
    if-eq v1, v3, :cond_4

    .line 35
    .line 36
    const/4 v2, 0x5

    .line 37
    if-ne v1, v2, :cond_2

    .line 38
    .line 39
    :cond_1
    move v2, v3

    .line 40
    goto :goto_0

    .line 41
    :cond_2
    const/4 p1, 0x0

    .line 42
    throw p1

    .line 43
    :cond_3
    const/4 v2, 0x0

    .line 44
    :cond_4
    :goto_0
    const/4 v1, 0x3

    .line 45
    invoke-virtual {p1, v1}, Lg6/b;->n(I)V

    .line 46
    .line 47
    .line 48
    const/4 v1, 0x0

    .line 49
    invoke-virtual {p1, v1, v0}, Lg6/b;->c(II)V

    .line 50
    .line 51
    .line 52
    if-eqz v2, :cond_5

    .line 53
    .line 54
    invoke-virtual {p1, v2}, Lg6/b;->a(B)V

    .line 55
    .line 56
    .line 57
    const/4 v0, 0x1

    .line 58
    invoke-virtual {p1, v0}, Lg6/b;->m(I)V

    .line 59
    .line 60
    .line 61
    :cond_5
    invoke-virtual {p1}, Lg6/b;->g()I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    invoke-virtual {p1, v0}, Lg6/b;->i(I)V

    .line 66
    .line 67
    .line 68
    return v0

    .line 69
    :cond_6
    const-string p1, "value must not be null"

    .line 70
    .line 71
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    const/4 p1, 0x0

    .line 75
    return p1
.end method
