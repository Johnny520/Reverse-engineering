.class public abstract Lxhss/ᛴᛴᛴᛷ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Ljava/lang/Comparable;


# static fields
.field public static final ᛳᲁᲇᛸ:Lxhss/ᲀᛱᛸᛳ;


# instance fields
.field public final ᛱᛱᛲᲇ:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lxhss/ᲀᛱᛸᛳ;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lxhss/ᛴᛴᛴᛷ;-><init>(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lxhss/ᛴᛴᛴᛷ;->ᛳᲁᲇᛸ:Lxhss/ᲀᛱᛸᛳ;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᛴᛴᛴᛷ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lxhss/ᛴᛴᛴᛷ;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lxhss/ᛴᛴᛴᛷ;->ᛷᛵᛵᲈ(Lxhss/ᛴᛴᛴᛷ;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public abstract ᛱᛱᛲᲇ()Ljava/lang/Object;
.end method

.method public ᛷᛵᛵᲈ(Lxhss/ᛴᛴᛴᛷ;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lxhss/ᛴᛴᛴᛷ;->ᛱᛱᛲᲇ()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p1}, Lxhss/ᛴᛴᛴᛷ;->ᛱᛱᛲᲇ()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    mul-int/lit8 p0, p0, -0x1

    .line 22
    .line 23
    return p0
.end method
