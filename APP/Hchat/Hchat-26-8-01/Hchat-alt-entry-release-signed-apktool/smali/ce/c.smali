.class public final synthetic Lce/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic g:Lae/h;

.field public final synthetic h:Ljava/util/Comparator;


# direct methods
.method public synthetic constructor <init>(Lae/h;Ljava/util/Comparator;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lce/c;->g:Lae/h;

    .line 5
    .line 6
    iput-object p2, p0, Lce/c;->h:Ljava/util/Comparator;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 3

    .line 1
    check-cast p1, Lae/f;

    .line 2
    .line 3
    check-cast p2, Lae/f;

    .line 4
    .line 5
    invoke-virtual {p1, p2}, Lae/f;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_3

    .line 10
    .line 11
    invoke-virtual {p1}, Lae/f;->c()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    return p1

    .line 19
    :cond_0
    invoke-virtual {p2}, Lae/f;->c()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    const/4 p1, -0x1

    .line 26
    return p1

    .line 27
    :cond_1
    iget-object p1, p1, Lae/f;->a:Ljava/util/ArrayList;

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, Lod/a;

    .line 35
    .line 36
    iget-object p2, p2, Lae/f;->a:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    check-cast p2, Lod/a;

    .line 43
    .line 44
    iget-object v0, p1, Lod/a;->g:Lqd/j;

    .line 45
    .line 46
    iget-object v1, p2, Lod/a;->g:Lqd/j;

    .line 47
    .line 48
    iget-object v2, p0, Lce/c;->h:Ljava/util/Comparator;

    .line 49
    .line 50
    invoke-interface {v2, v0, v1}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    const/4 v1, -0x2

    .line 55
    if-ne v0, v1, :cond_2

    .line 56
    .line 57
    invoke-virtual {p1, p2}, Lod/a;->b(Lod/a;)I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    return p1

    .line 62
    :cond_2
    return v0

    .line 63
    :cond_3
    iget-object p1, p0, Lce/c;->g:Lae/h;

    .line 64
    .line 65
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    const-string p2, "Same handlers in try block: "

    .line 70
    .line 71
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-static {p1}, Lah/a;->k(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    const/4 p1, 0x0

    .line 79
    return p1
.end method
