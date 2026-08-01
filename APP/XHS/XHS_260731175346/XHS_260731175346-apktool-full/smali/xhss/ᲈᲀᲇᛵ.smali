.class public final Lxhss/ᲈᲀᲇᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# static fields
.field public static final ᛷᛴᛷᛱ:Lxhss/ᲀᛶᛶᲀ;


# instance fields
.field public final ᛱᛱᛲᲇ:Ljava/lang/Object;

.field public final ᛳᲁᲇᛸ:Lxhss/ᲀᛲᲇ;

.field public final ᛷᛵᛵᲈ:Ljava/lang/Object;

.field public final ᲇᛴᲇᛵ:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lxhss/ᲈᲀᲇᛵ;

    .line 2
    .line 3
    invoke-static {v0}, Lxhss/ᲁᲇᛴᲀ;->ᛱᛱᛲᲇ(Ljava/lang/Class;)Lxhss/ᲀᛶᛶᲀ;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lxhss/ᲈᲀᲇᛵ;->ᛷᛴᛷᛱ:Lxhss/ᲀᛶᛶᲀ;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lxhss/ᲀᛲᲇ;Ljava/util/HashMap;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᲈᲀᲇᛵ;->ᛷᛵᛵᲈ:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lxhss/ᲈᲀᲇᛵ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Lxhss/ᲈᲀᲇᛵ;->ᛳᲁᲇᛸ:Lxhss/ᲀᛲᲇ;

    .line 9
    .line 10
    iput-object p4, p0, Lxhss/ᲈᲀᲇᛵ;->ᲇᛴᲇᛵ:Ljava/util/HashMap;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final ᛷᛵᛵᲈ(Lxhss/ᛴᲇᲀᛴ;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-boolean v0, p1, Lxhss/ᛴᲇᲀᛴ;->ᛱᛱᛲᲇ:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, Lxhss/ᲈᲀᲇᛵ;->ᛳᲁᲇᛸ:Lxhss/ᲀᛲᲇ;

    .line 5
    .line 6
    iget-object v3, p0, Lxhss/ᲈᲀᲇᛵ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object p0, p0, Lxhss/ᲈᲀᲇᛵ;->ᲇᛴᲇᛵ:Ljava/util/HashMap;

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget-object v0, p1, Lxhss/ᛴᲇᲀᛴ;->ᛷᛵᛵᲈ:Lxhss/ᲀᛷᲈᛳ;

    .line 19
    .line 20
    invoke-virtual {v0}, Lxhss/ᛳᛳᛵᛱ;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    new-instance v1, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string v2, "Using cached result for root path: "

    .line 27
    .line 28
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sget-object v1, Lxhss/ᲈᲀᲇᛵ;->ᛷᛴᛷᛱ:Lxhss/ᲀᛶᛶᲀ;

    .line 39
    .line 40
    invoke-interface {v1, v0}, Lxhss/ᲀᛶᛶᲀ;->ᛷᲁᲁ(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :cond_0
    invoke-virtual {p1, v3, v3, v2}, Lxhss/ᛴᲇᲀᛴ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;Lxhss/ᲀᛲᲇ;)Lxhss/ᛵᲈᛷ;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0, v1}, Lxhss/ᛵᲈᛷ;->ᛳᲁᲇᛸ(Z)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {p0, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    return-object v0

    .line 60
    :cond_1
    iget-object p0, p0, Lxhss/ᲈᲀᲇᛵ;->ᛷᛵᛵᲈ:Ljava/lang/Object;

    .line 61
    .line 62
    invoke-virtual {p1, p0, v3, v2}, Lxhss/ᛴᲇᲀᛴ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;Lxhss/ᲀᛲᲇ;)Lxhss/ᛵᲈᛷ;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-virtual {p0, v1}, Lxhss/ᛵᲈᛷ;->ᛳᲁᲇᛸ(Z)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    return-object p0
.end method
