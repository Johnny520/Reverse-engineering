.class public final Lxhss/ᲇᛳᛶ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# static fields
.field public static final ᛷᛴᛷᛱ:Lxhss/ᲇᛳᛶ;

.field public static final ᲇᛶᛴᲀ:Lxhss/ᲇᛳᛶ;


# instance fields
.field public final ᛱᛱᛲᲇ:Lxhss/ᛶᛵᲇᛸ;

.field public final ᛳᲁᲇᛸ:Lxhss/ᛶᛵᲇᛸ;

.field public final ᛷᛵᛵᲈ:Z

.field public final ᲇᛴᲇᛵ:Lxhss/ᛸᲁᛵᲀ;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lxhss/ᲇᛳᛶ;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lxhss/ᲇᛳᛶ;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lxhss/ᲇᛳᛶ;->ᛷᛴᛷᛱ:Lxhss/ᲇᛳᛶ;

    .line 8
    .line 9
    new-instance v0, Lxhss/ᲇᛳᛶ;

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    invoke-direct {v0, v1}, Lxhss/ᲇᛳᛶ;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lxhss/ᲇᛳᛶ;->ᲇᛶᛴᲀ:Lxhss/ᲇᛳᛶ;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    and-int/lit8 p1, p1, 0x2

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move p1, v0

    .line 12
    :goto_0
    iput-boolean v0, p0, Lxhss/ᲇᛳᛶ;->ᛷᛵᛵᲈ:Z

    .line 13
    .line 14
    sget-object v0, Lxhss/ᛱᛷᛵᛷ;->ᛷᛵᛵᲈ:Lxhss/ᛶᛵᲇᛸ;

    .line 15
    .line 16
    iput-object v0, p0, Lxhss/ᲇᛳᛶ;->ᛳᲁᲇᛸ:Lxhss/ᛶᛵᲇᛸ;

    .line 17
    .line 18
    iput-object v0, p0, Lxhss/ᲇᛳᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛶᛵᲇᛸ;

    .line 19
    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    sget-object p1, Lxhss/ᛱᛷᛵᛷ;->ᛳᲁᲇᛸ:Lxhss/ᛳᛴᲀᲁ;

    .line 23
    .line 24
    iput-object p1, p0, Lxhss/ᲇᛳᛶ;->ᲇᛴᲇᛵ:Lxhss/ᛸᲁᛵᲀ;

    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    sget-object p1, Lxhss/ᛱᛷᛵᛷ;->ᛱᛱᛲᲇ:Lxhss/ᛶᛵᲇᛸ;

    .line 28
    .line 29
    iput-object p1, p0, Lxhss/ᲇᛳᛶ;->ᲇᛴᲇᛵ:Lxhss/ᛸᲁᛵᲀ;

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final ᛷᛵᛵᲈ(Ljava/lang/String;Ljava/lang/StringBuilder;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lxhss/ᲇᛳᛶ;->ᛳᲁᲇᛸ:Lxhss/ᛶᛵᲇᛸ;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lxhss/ᛶᛵᲇᛸ;->ᛸᛶᲈᛶ(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const/16 v0, 0x22

    .line 14
    .line 15
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 16
    .line 17
    .line 18
    sget-object v1, Lxhss/ᛵᲇᛶ;->ᛷᛵᛵᲈ:Lxhss/ᲇᛳᛶ;

    .line 19
    .line 20
    if-nez p1, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    iget-object p0, p0, Lxhss/ᲇᛳᛶ;->ᲇᛴᲇᛵ:Lxhss/ᛸᲁᛵᲀ;

    .line 24
    .line 25
    invoke-interface {p0, p1, p2}, Lxhss/ᛸᲁᛵᲀ;->ᛳᲁᲇᛸ(Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 29
    .line 30
    .line 31
    return-void
.end method
