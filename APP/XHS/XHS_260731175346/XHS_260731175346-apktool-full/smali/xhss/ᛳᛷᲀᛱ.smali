.class public final Lxhss/ᛳᛷᲀᛱ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛸᛲᛶᛱ;


# instance fields
.field public final ᛷᛵᛵᲈ:Ljava/util/LinkedHashSet;


# direct methods
.method public constructor <init>(Lxhss/ᲇᛸᛲᲁ;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lxhss/ᛳᛷᲀᛱ;->ᛷᛵᛵᲈ:Ljava/util/LinkedHashSet;

    .line 10
    .line 11
    iget-object p1, p1, Lxhss/ᲇᛸᛲᲁ;->ᛷᛵᛵᲈ:Lxhss/ᲈᲀᲀᛵ;

    .line 12
    .line 13
    const-string v0, "androidx.savedstate.Restarter"

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Lxhss/ᲈᲀᲀᛵ;->ᛷᛵᛵᲈ(Ljava/lang/Object;)Lxhss/ᛴᛴᲁᲈ;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const/4 v2, 0x0

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    iget-object p0, v1, Lxhss/ᛴᛴᲁᲈ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v1, Lxhss/ᛴᛴᲁᲈ;

    .line 26
    .line 27
    invoke-direct {v1, v0, p0}, Lxhss/ᛴᛴᲁᲈ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iget p0, p1, Lxhss/ᲈᲀᲀᛵ;->ᛷᛴᛷᛱ:I

    .line 31
    .line 32
    add-int/lit8 p0, p0, 0x1

    .line 33
    .line 34
    iput p0, p1, Lxhss/ᲈᲀᲀᛵ;->ᛷᛴᛷᛱ:I

    .line 35
    .line 36
    iget-object p0, p1, Lxhss/ᲈᲀᲀᛵ;->ᛳᲁᲇᛸ:Lxhss/ᛴᛴᲁᲈ;

    .line 37
    .line 38
    if-nez p0, :cond_1

    .line 39
    .line 40
    iput-object v1, p1, Lxhss/ᲈᲀᲀᛵ;->ᛱᛱᛲᲇ:Lxhss/ᛴᛴᲁᲈ;

    .line 41
    .line 42
    iput-object v1, p1, Lxhss/ᲈᲀᲀᛵ;->ᛳᲁᲇᛸ:Lxhss/ᛴᛴᲁᲈ;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    iput-object v1, p0, Lxhss/ᛴᛴᲁᲈ;->ᲇᛴᲇᛵ:Lxhss/ᛴᛴᲁᲈ;

    .line 46
    .line 47
    iput-object p0, v1, Lxhss/ᛴᛴᲁᲈ;->ᛷᛴᛷᛱ:Lxhss/ᛴᛴᲁᲈ;

    .line 48
    .line 49
    iput-object v1, p1, Lxhss/ᲈᲀᲀᛵ;->ᛳᲁᲇᛸ:Lxhss/ᛴᛴᲁᲈ;

    .line 50
    .line 51
    :goto_0
    move-object p0, v2

    .line 52
    :goto_1
    check-cast p0, Lxhss/ᛸᛲᛶᛱ;

    .line 53
    .line 54
    if-nez p0, :cond_2

    .line 55
    .line 56
    return-void

    .line 57
    :cond_2
    const-string p0, "SavedStateProvider with the given key is already registered"

    .line 58
    .line 59
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᲀᲇᛳᲁ(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw v2
.end method
