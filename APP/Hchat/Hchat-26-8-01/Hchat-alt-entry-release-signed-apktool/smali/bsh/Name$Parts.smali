.class Lbsh/Name$Parts;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbsh/Name;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Parts"
.end annotation


# static fields
.field private static final PARTSCACHE:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lbsh/Name$Parts;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final count:I

.field private final list:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final prefix:[Ljava/lang/String;

.field private final suffix:[Ljava/lang/String;


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
    sput-object v0, Lbsh/Name$Parts;->PARTSCACHE:Ljava/util/Map;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
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
    iput-object p1, p0, Lbsh/Name$Parts;->list:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    iput p1, p0, Lbsh/Name$Parts;->count:I

    .line 21
    .line 22
    add-int/lit8 v0, p1, 0x1

    .line 23
    .line 24
    new-array v0, v0, [Ljava/lang/String;

    .line 25
    .line 26
    iput-object v0, p0, Lbsh/Name$Parts;->prefix:[Ljava/lang/String;

    .line 27
    .line 28
    add-int/lit8 p1, p1, 0x1

    .line 29
    .line 30
    new-array p1, p1, [Ljava/lang/String;

    .line 31
    .line 32
    iput-object p1, p0, Lbsh/Name$Parts;->suffix:[Ljava/lang/String;

    .line 33
    .line 34
    return-void
.end method

.method public static bridge synthetic a()Ljava/util/Map;
    .locals 1

    .line 1
    sget-object v0, Lbsh/Name$Parts;->PARTSCACHE:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public static get(Ljava/lang/String;)Lbsh/Name$Parts;
    .locals 4

    .line 1
    sget-object v0, Lbsh/Name$Parts;->PARTSCACHE:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Lbsh/Name$Parts;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    return-object v1

    .line 18
    :cond_0
    invoke-interface {v0, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    :cond_1
    new-instance v1, Lbsh/Name$Parts;

    .line 22
    .line 23
    invoke-direct {v1, p0}, Lbsh/Name$Parts;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {v0, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    iget-object v0, v1, Lbsh/Name$Parts;->prefix:[Ljava/lang/String;

    .line 30
    .line 31
    iget v2, v1, Lbsh/Name$Parts;->count:I

    .line 32
    .line 33
    aput-object p0, v0, v2

    .line 34
    .line 35
    iget-object v3, v1, Lbsh/Name$Parts;->suffix:[Ljava/lang/String;

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
    iget-object v2, v1, Lbsh/Name$Parts;->list:Ljava/util/List;

    .line 44
    .line 45
    const/4 v3, 0x0

    .line 46
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    check-cast v2, Ljava/lang/String;

    .line 51
    .line 52
    aput-object v2, v0, p0

    .line 53
    .line 54
    iget-object v0, v1, Lbsh/Name$Parts;->suffix:[Ljava/lang/String;

    .line 55
    .line 56
    iget-object v2, v1, Lbsh/Name$Parts;->list:Ljava/util/List;

    .line 57
    .line 58
    iget v3, v1, Lbsh/Name$Parts;->count:I

    .line 59
    .line 60
    sub-int/2addr v3, p0

    .line 61
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    check-cast v2, Ljava/lang/String;

    .line 66
    .line 67
    aput-object v2, v0, p0

    .line 68
    .line 69
    return-object v1
.end method


# virtual methods
.method public prefix(I)Ljava/lang/String;
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-gt v0, p1, :cond_2

    .line 3
    .line 4
    iget v0, p0, Lbsh/Name$Parts;->count:I

    .line 5
    .line 6
    if-ge v0, p1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    iget-object v0, p0, Lbsh/Name$Parts;->prefix:[Ljava/lang/String;

    .line 10
    .line 11
    aget-object v1, v0, p1

    .line 12
    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    iget-object v1, p0, Lbsh/Name$Parts;->list:Ljava/util/List;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-interface {v1, v2, p1}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const-string v2, "."

    .line 23
    .line 24
    invoke-static {v2, v1}, Ljava/lang/String;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    aput-object v1, v0, p1

    .line 29
    .line 30
    :cond_1
    iget-object v0, p0, Lbsh/Name$Parts;->prefix:[Ljava/lang/String;

    .line 31
    .line 32
    aget-object p1, v0, p1

    .line 33
    .line 34
    return-object p1

    .line 35
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 36
    return-object p1
.end method

.method public suffix(I)Ljava/lang/String;
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-gt v0, p1, :cond_2

    .line 3
    .line 4
    iget v0, p0, Lbsh/Name$Parts;->count:I

    .line 5
    .line 6
    if-ge v0, p1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    iget-object v1, p0, Lbsh/Name$Parts;->suffix:[Ljava/lang/String;

    .line 10
    .line 11
    aget-object v2, v1, p1

    .line 12
    .line 13
    if-nez v2, :cond_1

    .line 14
    .line 15
    iget-object v2, p0, Lbsh/Name$Parts;->list:Ljava/util/List;

    .line 16
    .line 17
    sub-int v3, v0, p1

    .line 18
    .line 19
    invoke-interface {v2, v3, v0}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v2, "."

    .line 24
    .line 25
    invoke-static {v2, v0}, Ljava/lang/String;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    aput-object v0, v1, p1

    .line 30
    .line 31
    :cond_1
    iget-object v0, p0, Lbsh/Name$Parts;->suffix:[Ljava/lang/String;

    .line 32
    .line 33
    aget-object p1, v0, p1

    .line 34
    .line 35
    return-object p1

    .line 36
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 37
    return-object p1
.end method
