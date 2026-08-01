.class public final synthetic Lxhss/ᛴᲇᲁᲀ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛷᛴᛲᛲ;


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:I

.field public final synthetic ᛳᲁᲇᛸ:I


# direct methods
.method public synthetic constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lxhss/ᛴᲇᲁᲀ;->ᛱᛱᛲᲇ:I

    .line 5
    .line 6
    iput p2, p0, Lxhss/ᛴᲇᲁᲀ;->ᛳᲁᲇᛸ:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final ᲇᛴᲇᛵ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Lxhss/ᲀᛴᛳᛸ;

    .line 2
    .line 3
    iget-object v0, p1, Lxhss/ᲀᛴᛳᛸ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ljava/lang/String;

    .line 6
    .line 7
    iget-object p1, p1, Lxhss/ᲀᛴᛳᛸ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, Ljava/lang/String;

    .line 10
    .line 11
    iget v1, p0, Lxhss/ᛴᲇᲁᲀ;->ᛱᛱᛲᲇ:I

    .line 12
    .line 13
    invoke-static {v0, v1}, Lxhss/ᛱᛷᛵᛸ;->ᛳᲁᲇᛸ(Ljava/lang/String;I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget p0, p0, Lxhss/ᛴᲇᲁᲀ;->ᛳᲁᲇᛸ:I

    .line 18
    .line 19
    invoke-static {p1, p0}, Lxhss/ᛱᛷᛵᛸ;->ᛳᲁᲇᛸ(Ljava/lang/String;I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    new-instance p1, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const-string v1, "| "

    .line 26
    .line 27
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v0, " | "

    .line 34
    .line 35
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string p0, " |"

    .line 42
    .line 43
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0
.end method
