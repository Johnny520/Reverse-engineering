.class public final Lxhss/ᛱᲇᛲ;
.super Lxhss/ᲇᛴᲀᛴ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final synthetic ᛷᛴᛷᛱ:Lxhss/ᛵᛸᛲᛲ;

.field public final ᲇᛴᲇᛵ:Lxhss/ᛲᛶᛳᲁ;


# direct methods
.method public constructor <init>(Lxhss/ᛵᛸᛲᛲ;JLxhss/ᛲᛶᛳᲁ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᛱᲇᛲ;->ᛷᛴᛷᛱ:Lxhss/ᛵᛸᛲᛲ;

    .line 5
    .line 6
    iput-wide p2, p0, Lxhss/ᲇᛴᲀᛴ;->ᛱᛱᛲᲇ:J

    .line 7
    .line 8
    const/4 p1, -0x1

    .line 9
    iput p1, p0, Lxhss/ᲇᛴᲀᛴ;->ᛳᲁᲇᛸ:I

    .line 10
    .line 11
    iput-object p4, p0, Lxhss/ᛱᲇᛲ;->ᲇᛴᲇᛵ:Lxhss/ᛲᛶᛳᲁ;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lxhss/ᛱᲇᛲ;->ᲇᛴᲇᛵ:Lxhss/ᛲᛶᛳᲁ;

    .line 2
    .line 3
    iget-object p0, p0, Lxhss/ᛱᲇᛲ;->ᛷᛴᛷᛱ:Lxhss/ᛵᛸᛲᛲ;

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Lxhss/ᛲᛶᛳᲁ;->ᛳᛶᛷᲀ(Lxhss/ᛲᛶᲇᲇ;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-super {p0}, Lxhss/ᲇᛴᲀᛴ;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lxhss/ᛱᲇᛲ;->ᲇᛴᲇᛵ:Lxhss/ᛲᛶᛳᲁ;

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method
