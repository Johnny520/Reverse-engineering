.class public final Lxhss/ᛸᲁᲈᛳ;
.super Lxhss/ᛲᛱᛶᛴ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# static fields
.field public static final ᛱᛱᛲᲇ:Lxhss/ᲇᲈᛷᲁ;


# instance fields
.field public final ᛷᛵᛵᲈ:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lxhss/ᛸᲁᲈᛳ;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1}, Lxhss/ᛸᲁᲈᛳ;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v1, Lxhss/ᲇᲈᛷᲁ;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v1, v0, v2}, Lxhss/ᲇᲈᛷᲁ;-><init>(Lxhss/ᛲᛱᛶᛴ;I)V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lxhss/ᛸᲁᲈᛳ;->ᛱᛱᛲᲇ:Lxhss/ᲇᲈᛷᲁ;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lxhss/ᛸᲁᲈᛳ;->ᛷᛵᛵᲈ:I

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final ᛱᛱᛲᲇ(Lxhss/ᛴᛷᛸᛷ;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p1}, Lxhss/ᛴᛷᛸᛷ;->ᲁᲁᛴᲁ()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lxhss/ᛴᛸᛲᛳ;->ᲀᛷᲁᲀ(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x5

    .line 10
    if-eq v1, v2, :cond_1

    .line 11
    .line 12
    const/4 v2, 0x6

    .line 13
    if-eq v1, v2, :cond_1

    .line 14
    .line 15
    const/16 p0, 0x8

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    if-ne v1, p0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p1}, Lxhss/ᛴᛷᛸᛷ;->ᲀᛷᲁᲀ()V

    .line 21
    .line 22
    .line 23
    return-object v2

    .line 24
    :cond_0
    invoke-static {v0}, Lxhss/ᛴᛸᛲᛳ;->ᛱᛳᲁᲈ(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    const/4 v0, 0x0

    .line 29
    invoke-virtual {p1, v0}, Lxhss/ᛴᛷᛸᛷ;->ᲇᛸᛳᲁ(Z)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const-string v0, "Expecting number, got: "

    .line 34
    .line 35
    const-string v1, "; at path "

    .line 36
    .line 37
    invoke-static {v0, p0, v1, p1}, Lxhss/ᛵᲈᲁᲈ;->ᛸᛶᲈᛶ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    return-object v2

    .line 41
    :cond_1
    iget p0, p0, Lxhss/ᛸᲁᲈᛳ;->ᛷᛵᛵᲈ:I

    .line 42
    .line 43
    invoke-static {p0, p1}, Lxhss/ᛴᛸᛲᛳ;->ᛷᛵᛵᲈ(ILxhss/ᛴᛷᛸᛷ;)Ljava/lang/Number;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0
.end method

.method public final ᛳᲁᲇᛸ(Lxhss/ᛸᲈᲈᛶ;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Ljava/lang/Number;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lxhss/ᛸᲈᲈᛶ;->ᛳᛶᛷᲀ(Ljava/lang/Number;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
