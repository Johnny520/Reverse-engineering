.class public final Ls/r;
.super Ly0/n;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lx1/v;


# static fields
.field public static final x:Ls/p;


# instance fields
.field public u:Lr/g;

.field public v:Lm/c;

.field public w:Lm/p1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ls/p;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ls/r;->x:Ls/p;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final j(Lv1/p0;Lv1/m0;J)Lv1/o0;
    .locals 2

    .line 1
    invoke-interface {p2, p3, p4}, Lv1/m0;->Q(J)Lv1/b1;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    iget p3, p2, Lv1/b1;->g:I

    .line 6
    .line 7
    iget p4, p2, Lv1/b1;->h:I

    .line 8
    .line 9
    new-instance v0, Lg0/g;

    .line 10
    .line 11
    const/4 v1, 0x6

    .line 12
    invoke-direct {v0, p2, v1}, Lg0/g;-><init>(Lv1/b1;I)V

    .line 13
    .line 14
    .line 15
    sget-object p2, Ltf/u;->g:Ltf/u;

    .line 16
    .line 17
    invoke-interface {p1, p3, p4, p2, v0}, Lv1/p0;->z(IILjava/util/Map;Lfg/l;)Lv1/o0;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1
.end method

.method public final k1(Ls/m;I)Z
    .locals 3

    .line 1
    const/4 v0, 0x5

    .line 2
    const/4 v1, 0x1

    .line 3
    if-ne p2, v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 v0, 0x6

    .line 7
    if-ne p2, v0, :cond_1

    .line 8
    .line 9
    :goto_0
    iget-object v0, p0, Ls/r;->w:Lm/p1;

    .line 10
    .line 11
    sget-object v2, Lm/p1;->h:Lm/p1;

    .line 12
    .line 13
    if-ne v0, v2, :cond_5

    .line 14
    .line 15
    goto :goto_4

    .line 16
    :cond_1
    const/4 v0, 0x3

    .line 17
    if-ne p2, v0, :cond_2

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_2
    const/4 v0, 0x4

    .line 21
    if-ne p2, v0, :cond_3

    .line 22
    .line 23
    :goto_1
    iget-object v0, p0, Ls/r;->w:Lm/p1;

    .line 24
    .line 25
    sget-object v2, Lm/p1;->g:Lm/p1;

    .line 26
    .line 27
    if-ne v0, v2, :cond_5

    .line 28
    .line 29
    goto :goto_4

    .line 30
    :cond_3
    if-ne p2, v1, :cond_4

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_4
    const/4 v0, 0x2

    .line 34
    if-ne p2, v0, :cond_8

    .line 35
    .line 36
    :cond_5
    :goto_2
    invoke-virtual {p0, p2}, Ls/r;->l1(I)Z

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    if-eqz p2, :cond_6

    .line 41
    .line 42
    iget p1, p1, Ls/m;->b:I

    .line 43
    .line 44
    iget-object p2, p0, Ls/r;->u:Lr/g;

    .line 45
    .line 46
    iget-object p2, p2, Lr/g;->a:Lr/z;

    .line 47
    .line 48
    invoke-virtual {p2}, Lr/z;->j()Lr/p;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    iget p2, p2, Lr/p;->n:I

    .line 53
    .line 54
    sub-int/2addr p2, v1

    .line 55
    if-ge p1, p2, :cond_7

    .line 56
    .line 57
    goto :goto_3

    .line 58
    :cond_6
    iget p1, p1, Ls/m;->a:I

    .line 59
    .line 60
    if-lez p1, :cond_7

    .line 61
    .line 62
    :goto_3
    return v1

    .line 63
    :cond_7
    :goto_4
    const/4 p1, 0x0

    .line 64
    return p1

    .line 65
    :cond_8
    const-string p1, "Lazy list does not support beyond bounds layout for the specified direction"

    .line 66
    .line 67
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    const/4 p1, 0x0

    .line 71
    return p1
.end method

.method public final l1(I)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-ne p1, v1, :cond_0

    .line 4
    .line 5
    return v0

    .line 6
    :cond_0
    const/4 v2, 0x2

    .line 7
    if-ne p1, v2, :cond_1

    .line 8
    .line 9
    return v1

    .line 10
    :cond_1
    const/4 v2, 0x5

    .line 11
    if-ne p1, v2, :cond_2

    .line 12
    .line 13
    return v0

    .line 14
    :cond_2
    const/4 v2, 0x6

    .line 15
    if-ne p1, v2, :cond_3

    .line 16
    .line 17
    return v1

    .line 18
    :cond_3
    const/4 v2, 0x3

    .line 19
    if-ne p1, v2, :cond_6

    .line 20
    .line 21
    invoke-static {p0}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-object p1, p1, Lx1/f0;->F:Lu2/m;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_5

    .line 32
    .line 33
    if-ne p1, v1, :cond_4

    .line 34
    .line 35
    return v1

    .line 36
    :cond_4
    invoke-static {}, Lokio/a;->k()V

    .line 37
    .line 38
    .line 39
    :goto_0
    const/4 p1, 0x0

    .line 40
    return p1

    .line 41
    :cond_5
    return v0

    .line 42
    :cond_6
    const/4 v2, 0x4

    .line 43
    if-ne p1, v2, :cond_9

    .line 44
    .line 45
    invoke-static {p0}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iget-object p1, p1, Lx1/f0;->F:Lu2/m;

    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-eqz p1, :cond_8

    .line 56
    .line 57
    if-ne p1, v1, :cond_7

    .line 58
    .line 59
    return v0

    .line 60
    :cond_7
    invoke-static {}, Lokio/a;->k()V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_8
    return v1

    .line 65
    :cond_9
    const-string p1, "Lazy list does not support beyond bounds layout for the specified direction"

    .line 66
    .line 67
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    goto :goto_0
.end method
