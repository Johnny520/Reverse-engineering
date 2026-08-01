.class public final Lxhss/ᛶᛳᲀᲇ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# static fields
.field public static final ᲇᛴᲇᛵ:Ljava/util/LinkedHashMap;


# instance fields
.field public final ᛱᛱᛲᲇ:Lxhss/ᛵᲇᛱᛴ;

.field public final ᛳᲁᲇᛸ:Lxhss/ᛵᲇᛱᛴ;

.field public final ᛷᛵᛵᲈ:Ljava/io/Serializable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lxhss/ᛶᛳᲀᲇ;->ᲇᛴᲇᛵ:Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Ljava/io/Serializable;Lxhss/ᛵᲇᛱᛴ;Lxhss/ᛵᲇᛱᛴ;)V
    .locals 2

    .line 1
    const-wide v0, -0xcba81b858845L

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    const-wide v0, -0xcbaf1b858845L

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lxhss/ᛶᛳᲀᲇ;->ᛷᛵᛵᲈ:Ljava/io/Serializable;

    .line 21
    .line 22
    iput-object p2, p0, Lxhss/ᛶᛳᲀᲇ;->ᛱᛱᛲᲇ:Lxhss/ᛵᲇᛱᛴ;

    .line 23
    .line 24
    iput-object p3, p0, Lxhss/ᛶᛳᲀᲇ;->ᛳᲁᲇᛸ:Lxhss/ᛵᲇᛱᛴ;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final ᛱᛱᛲᲇ(Lxhss/ᛴᛲᛱᲇ;)V
    .locals 5

    .line 1
    const-wide v0, -0xcbb61b858845L

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-object v0, p1

    .line 10
    check-cast v0, Lxhss/ᛱᛱᛶᲁ;

    .line 11
    .line 12
    iget-object v0, v0, Lxhss/ᛱᛱᛶᲁ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 13
    .line 14
    new-instance v1, Lxhss/ᛶᲁᛱᛴ;

    .line 15
    .line 16
    new-instance v2, Lxhss/ᛱᲀᲇᛸ;

    .line 17
    .line 18
    const/4 v3, 0x1

    .line 19
    invoke-direct {v2, v3, p0, p1}, Lxhss/ᛱᲀᲇᛸ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    new-instance v4, Lxhss/ᛶᲀᲀᛵ;

    .line 23
    .line 24
    invoke-direct {v4, v3, p0, p1}, Lxhss/ᛶᲀᲀᛵ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p0, p0, Lxhss/ᛶᛳᲀᲇ;->ᛷᛵᛵᲈ:Ljava/io/Serializable;

    .line 28
    .line 29
    invoke-direct {v1, v0, p0, v2, v4}, Lxhss/ᛶᲁᛱᛴ;-><init>(Ljava/lang/String;Ljava/io/Serializable;Lxhss/ᛱᲀᲇᛸ;Lxhss/ᛶᲀᲀᛵ;)V

    .line 30
    .line 31
    .line 32
    sget-object p0, Lxhss/ᛶᛳᲀᲇ;->ᲇᛴᲇᛵ:Ljava/util/LinkedHashMap;

    .line 33
    .line 34
    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final ᛳᲁᲇᛸ(Lxhss/ᛴᛲᛱᲇ;Ljava/lang/Object;)V
    .locals 2

    .line 1
    const-wide v0, -0xcbc81b858845L

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 10
    .line 11
    .line 12
    check-cast p1, Lxhss/ᛱᛱᛶᲁ;

    .line 13
    .line 14
    iget-object p1, p1, Lxhss/ᛱᛱᛶᲁ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 15
    .line 16
    iget-object p0, p0, Lxhss/ᛶᛳᲀᲇ;->ᛳᲁᲇᛸ:Lxhss/ᛵᲇᛱᛴ;

    .line 17
    .line 18
    invoke-interface {p0, p1, p2}, Lxhss/ᛵᲇᛱᛴ;->ᛳᲁᲇᛸ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final ᛷᛵᛵᲈ(Lxhss/ᛴᛲᛱᲇ;)Ljava/lang/Object;
    .locals 2

    .line 1
    const-wide v0, -0xcbbf1b858845L

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    check-cast p1, Lxhss/ᛱᛱᛶᲁ;

    .line 10
    .line 11
    iget-object p1, p1, Lxhss/ᛱᛱᛶᲁ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v0, p0, Lxhss/ᛶᛳᲀᲇ;->ᛷᛵᛵᲈ:Ljava/io/Serializable;

    .line 14
    .line 15
    iget-object p0, p0, Lxhss/ᛶᛳᲀᲇ;->ᛱᛱᛲᲇ:Lxhss/ᛵᲇᛱᛴ;

    .line 16
    .line 17
    invoke-interface {p0, p1, v0}, Lxhss/ᛵᲇᛱᛴ;->ᛳᲁᲇᛸ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method
