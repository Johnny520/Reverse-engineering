.class public abstract Lxhss/ᲁᛴᛱᛱ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# static fields
.field public static final ᛱᛱᛲᲇ:Lxhss/ᛴᛷᛱ;

.field public static final ᛳᲁᲇᛸ:Lxhss/ᛶᛵᲇᛸ;

.field public static final ᛷᛵᛵᲈ:Lxhss/ᛴᛷᛱ;

.field public static final ᲇᛴᲇᛵ:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lxhss/ᛴᛶᛲᛶ;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lxhss/ᛴᛶᛲᛶ;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lxhss/ᛴᛷᛱ;

    .line 9
    .line 10
    invoke-direct {v1, v0}, Lxhss/ᛴᛷᛱ;-><init>(Lxhss/ᛱᛳᲇᛶ;)V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lxhss/ᲁᛴᛱᛱ;->ᛷᛵᛵᲈ:Lxhss/ᛴᛷᛱ;

    .line 14
    .line 15
    new-instance v0, Lxhss/ᛴᛶᛲᛶ;

    .line 16
    .line 17
    const/16 v1, 0x9

    .line 18
    .line 19
    invoke-direct {v0, v1}, Lxhss/ᛴᛶᛲᛶ;-><init>(I)V

    .line 20
    .line 21
    .line 22
    new-instance v1, Lxhss/ᛴᛷᛱ;

    .line 23
    .line 24
    invoke-direct {v1, v0}, Lxhss/ᛴᛷᛱ;-><init>(Lxhss/ᛱᛳᲇᛶ;)V

    .line 25
    .line 26
    .line 27
    sput-object v1, Lxhss/ᲁᛴᛱᛱ;->ᛱᛱᛲᲇ:Lxhss/ᛴᛷᛱ;

    .line 28
    .line 29
    new-instance v0, Lxhss/ᛶᛵᲇᛸ;

    .line 30
    .line 31
    const/4 v2, 0x6

    .line 32
    invoke-direct {v0, v2}, Lxhss/ᛶᛵᲇᛸ;-><init>(I)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lxhss/ᲁᛴᛱᛱ;->ᛳᲁᲇᛸ:Lxhss/ᛶᛵᲇᛸ;

    .line 36
    .line 37
    const/4 v0, 0x3

    .line 38
    sput v0, Lxhss/ᲁᛴᛱᛱ;->ᲇᛴᲇᛵ:I

    .line 39
    .line 40
    invoke-virtual {v1}, Lxhss/ᛴᛷᛱ;->ᛷᛵᛵᲈ()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, Ljava/lang/Boolean;

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-nez v1, :cond_0

    .line 51
    .line 52
    const-string v1, "org.slf4j.simpleLogger.defaultLogLevel"

    .line 53
    .line 54
    const-string v2, "warn"

    .line 55
    .line 56
    invoke-static {v1, v2}, Ljava/lang/System;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    :cond_0
    sput v0, Lxhss/ᲁᛴᛱᛱ;->ᲇᛴᲇᛵ:I

    .line 60
    .line 61
    return-void
.end method

.method public static ᛷᛵᛵᲈ(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    sget v0, Lxhss/ᲁᛴᛱᛱ;->ᲇᛴᲇᛵ:I

    .line 2
    .line 3
    invoke-static {v0}, Lxhss/ᛴᛸᛲᛳ;->ᲀᛷᲁᲀ(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x3

    .line 8
    invoke-static {v1}, Lxhss/ᛴᛸᛲᛳ;->ᲀᛷᲁᲀ(I)I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-gt v0, v1, :cond_1

    .line 13
    .line 14
    sget-object v0, Lxhss/ᲁᛴᛱᛱ;->ᛳᲁᲇᛸ:Lxhss/ᛶᛵᲇᛸ;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    sget-object v0, Lxhss/ᲁᛴᛱᛱ;->ᛱᛱᛲᲇ:Lxhss/ᛴᛷᛱ;

    .line 20
    .line 21
    invoke-virtual {v0}, Lxhss/ᛴᛷᛱ;->ᛷᛵᛵᲈ()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Ljava/lang/Boolean;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    sget-object v0, Lxhss/ᲁᛴᛱᛱ;->ᛷᛵᛵᲈ:Lxhss/ᛴᛷᛱ;

    .line 34
    .line 35
    invoke-virtual {v0}, Lxhss/ᛴᛷᛱ;->ᛷᛵᛵᲈ()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Lxhss/ᲀᛶᛶᲀ;

    .line 40
    .line 41
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-interface {v0, p0, p1}, Lxhss/ᲀᛶᛶᲀ;->ᛷᛴᛷᛱ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_0
    const-string v0, "KavaRef"

    .line 50
    .line 51
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-static {v0, p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 56
    .line 57
    .line 58
    :cond_1
    return-void
.end method
