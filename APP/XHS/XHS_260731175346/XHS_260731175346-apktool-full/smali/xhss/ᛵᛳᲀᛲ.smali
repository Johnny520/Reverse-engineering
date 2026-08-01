.class public abstract Lxhss/ᛵᛳᲀᛲ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final ᛱᛱᛲᲇ:Z

.field public ᛳᲁᲇᛸ:Lxhss/ᲇᲀᲀᛷ;

.field public final ᛷᛵᛵᲈ:Ljava/lang/String;

.field public ᲇᛴᲇᛵ:J


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᛵᛳᲀᛲ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    iput-boolean p1, p0, Lxhss/ᛵᛳᲀᛲ;->ᛱᛱᛲᲇ:Z

    .line 8
    .line 9
    const-wide/16 v0, -0x1

    .line 10
    .line 11
    iput-wide v0, p0, Lxhss/ᛵᛳᲀᛲ;->ᲇᛴᲇᛵ:J

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛵᛳᲀᛲ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public abstract ᛷᛵᛵᲈ()J
.end method
