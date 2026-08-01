.class public final Lbsh/飘花落叶言子世哲兰苏楪;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final 飘花落叶言子楪世兰苏哲:Ljava/util/WeakHashMap;


# instance fields
.field public final 飘花落叶言子楪世哲兰苏:I

.field public final 飘花落叶言子楪世哲苏兰:Ljava/util/List;

.field public final 飘花落叶言子楪世苏兰哲:[Ljava/lang/String;

.field public final 飘花落叶言子楪世苏哲兰:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lbsh/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世兰苏哲:Ljava/util/WeakHashMap;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "\\."

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Lbsh/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世哲苏兰:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    iput p1, p0, Lbsh/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世哲兰苏:I

    .line 21
    .line 22
    add-int/lit8 v0, p1, 0x1

    .line 23
    .line 24
    new-array v0, v0, [Ljava/lang/String;

    .line 25
    .line 26
    iput-object v0, p0, Lbsh/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏哲兰:[Ljava/lang/String;

    .line 27
    .line 28
    add-int/lit8 p1, p1, 0x1

    .line 29
    .line 30
    new-array p1, p1, [Ljava/lang/String;

    .line 31
    .line 32
    iput-object p1, p0, Lbsh/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏兰哲:[Ljava/lang/String;

    .line 33
    .line 34
    return-void
.end method

.method public static 飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Lbsh/飘花落叶言子世哲兰苏楪;
    .locals 6

    .line 1
    sget-object v0, Lbsh/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世兰苏哲:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/WeakHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    invoke-virtual {v0, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Lbsh/飘花落叶言子世哲兰苏楪;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    return-object v1

    .line 18
    :cond_0
    invoke-virtual {v0, p0}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    :cond_1
    new-instance v1, Lbsh/飘花落叶言子世哲兰苏楪;

    .line 22
    .line 23
    invoke-direct {v1, p0}, Lbsh/飘花落叶言子世哲兰苏楪;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p0, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    iget-object v0, v1, Lbsh/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏哲兰:[Ljava/lang/String;

    .line 30
    .line 31
    iget v2, v1, Lbsh/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世哲兰苏:I

    .line 32
    .line 33
    aput-object p0, v0, v2

    .line 34
    .line 35
    iget-object v3, v1, Lbsh/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏兰哲:[Ljava/lang/String;

    .line 36
    .line 37
    aput-object p0, v3, v2

    .line 38
    .line 39
    const/4 p0, 0x1

    .line 40
    if-ne v2, p0, :cond_2

    .line 41
    .line 42
    return-object v1

    .line 43
    :cond_2
    const/4 v4, 0x0

    .line 44
    iget-object v5, v1, Lbsh/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世哲苏兰:Ljava/util/List;

    .line 45
    .line 46
    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    check-cast v4, Ljava/lang/String;

    .line 51
    .line 52
    aput-object v4, v0, p0

    .line 53
    .line 54
    sub-int/2addr v2, p0

    .line 55
    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    check-cast v0, Ljava/lang/String;

    .line 60
    .line 61
    aput-object v0, v3, p0

    .line 62
    .line 63
    return-object v1
.end method
