.class public final Lyyds/ᛸᛱᛷᲇ;
.super Lyyds/ᲀᛶᛵᲁ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᲇᲈᛵᛷ:Lyyds/ᛸᛱᛷᲇ;


# instance fields
.field public final ᲀᛲᛳᲀ:Ljava/math/BigDecimal;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lyyds/ᛸᛱᛷᲇ;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lyyds/ᛸᛱᛷᲇ;-><init>(Ljava/math/BigDecimal;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lyyds/ᛸᛱᛷᲇ;->ᲇᲈᛵᛷ:Lyyds/ᛸᛱᛷᲇ;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/math/BigDecimal;

    .line 5
    .line 6
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-direct {v0, p1}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lyyds/ᛸᛱᛷᲇ;->ᲀᛲᛳᲀ:Ljava/math/BigDecimal;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(Ljava/math/BigDecimal;)V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lyyds/ᛸᛱᛷᲇ;->ᲀᛲᛳᲀ:Ljava/math/BigDecimal;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lyyds/ᛸᛱᛷᲇ;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    instance-of v1, p1, Lyyds/ᲀᲇᛵᲁ;

    .line 11
    .line 12
    if-nez v1, :cond_1

    .line 13
    .line 14
    return v2

    .line 15
    :cond_1
    check-cast p1, Lyyds/ᲀᛶᛵᲁ;

    .line 16
    .line 17
    invoke-virtual {p1}, Lyyds/ᲀᛶᛵᲁ;->ᲇᲈᛵᛷ()Lyyds/ᛸᛱᛷᲇ;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    sget-object v1, Lyyds/ᛸᛱᛷᲇ;->ᲇᲈᛵᛷ:Lyyds/ᛸᛱᛷᲇ;

    .line 22
    .line 23
    if-ne p1, v1, :cond_2

    .line 24
    .line 25
    return v2

    .line 26
    :cond_2
    iget-object p0, p0, Lyyds/ᛸᛱᛷᲇ;->ᲀᛲᛳᲀ:Ljava/math/BigDecimal;

    .line 27
    .line 28
    iget-object p1, p1, Lyyds/ᛸᛱᛷᲇ;->ᲀᛲᛳᲀ:Ljava/math/BigDecimal;

    .line 29
    .line 30
    invoke-virtual {p0, p1}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-nez p0, :cond_3

    .line 35
    .line 36
    return v0

    .line 37
    :cond_3
    return v2
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛸᛱᛷᲇ;->ᲀᛲᛳᲀ:Ljava/math/BigDecimal;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/math/BigDecimal;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final ᛱᲈᲁ()Lyyds/ᲀᲇᛵᲁ;
    .locals 2

    .line 1
    new-instance v0, Lyyds/ᲀᲇᛵᲁ;

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᛸᛱᛷᲇ;->ᲀᛲᛳᲀ:Ljava/math/BigDecimal;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/math/BigDecimal;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, p0, v1}, Lyyds/ᲀᲇᛵᲁ;-><init>(Ljava/lang/CharSequence;Z)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public final ᛷᲈᲈᲁ(Lyyds/ᛴᛵᲀᛴ;)Ljava/lang/Class;
    .locals 0

    .line 1
    const-class p0, Ljava/lang/Number;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᲇᲈᛵᛷ()Lyyds/ᛸᛱᛷᲇ;
    .locals 0

    .line 1
    return-object p0
.end method
