.class public final synthetic Ltb;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic a:[Lum;


# direct methods
.method public synthetic constructor <init>([Lum;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ltb;->a:[Lum;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 6

    .line 1
    iget-object v0, p0, Ltb;->a:[Lum;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    move v3, v2

    .line 6
    :goto_0
    if-ge v3, v1, :cond_4

    .line 7
    .line 8
    aget-object v4, v0, v3

    .line 9
    .line 10
    invoke-interface {v4, p1}, Lum;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v5

    .line 14
    check-cast v5, Ljava/lang/Comparable;

    .line 15
    .line 16
    invoke-interface {v4, p2}, Lum;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    check-cast v4, Ljava/lang/Comparable;

    .line 21
    .line 22
    if-ne v5, v4, :cond_0

    .line 23
    .line 24
    move v4, v2

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    if-nez v5, :cond_1

    .line 27
    .line 28
    const/4 v4, -0x1

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    if-nez v4, :cond_2

    .line 31
    .line 32
    const/4 v4, 0x1

    .line 33
    goto :goto_1

    .line 34
    :cond_2
    invoke-interface {v5, v4}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    :goto_1
    if-eqz v4, :cond_3

    .line 39
    .line 40
    return v4

    .line 41
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_4
    return v2
.end method
