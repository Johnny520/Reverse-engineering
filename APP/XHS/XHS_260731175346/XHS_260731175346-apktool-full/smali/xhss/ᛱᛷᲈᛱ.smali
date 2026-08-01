.class public final Lxhss/ᛱᛷᲈᛱ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛴᛲᲀᛵ;
.implements Ljava/lang/Cloneable;


# static fields
.field public static final ᲇᛴᲇᛵ:Lxhss/ᛱᛷᲈᛱ;


# instance fields
.field public final ᛱᛱᛲᲇ:Ljava/util/List;

.field public final ᛳᲁᲇᛸ:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lxhss/ᛱᛷᲈᛱ;

    .line 2
    .line 3
    invoke-direct {v0}, Lxhss/ᛱᛷᲈᛱ;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lxhss/ᛱᛷᲈᛱ;->ᲇᛴᲇᛵ:Lxhss/ᛱᛷᲈᛱ;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 5
    .line 6
    iput-object v0, p0, Lxhss/ᛱᛷᲈᛱ;->ᛱᛱᛲᲇ:Ljava/util/List;

    .line 7
    .line 8
    iput-object v0, p0, Lxhss/ᛱᛷᲈᛱ;->ᛳᲁᲇᛸ:Ljava/util/List;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 1

    .line 1
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lxhss/ᛱᛷᲈᛱ;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :catch_0
    move-exception p0

    .line 9
    new-instance v0, Ljava/lang/AssertionError;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    throw v0
.end method

.method public final ᛱᛱᛲᲇ(Ljava/lang/Class;Z)Z
    .locals 1

    .line 1
    if-nez p2, :cond_1

    .line 2
    .line 3
    const-class v0, Ljava/lang/Enum;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    sget-object v0, Lxhss/ᲇᛴᛷᲇ;->ᛷᛵᛵᲈ:Lxhss/ᲈᲀᲀᛱ;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Class;->getModifiers()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Class;->isAnonymousClass()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Class;->isLocalClass()Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    :cond_0
    const/4 p0, 0x1

    .line 36
    return p0

    .line 37
    :cond_1
    if-eqz p2, :cond_2

    .line 38
    .line 39
    iget-object p0, p0, Lxhss/ᛱᛷᲈᛱ;->ᛱᛱᛲᲇ:Ljava/util/List;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    iget-object p0, p0, Lxhss/ᛱᛷᲈᛱ;->ᛳᲁᲇᛸ:Ljava/util/List;

    .line 43
    .line 44
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-nez p1, :cond_3

    .line 53
    .line 54
    const/4 p0, 0x0

    .line 55
    return p0

    .line 56
    :cond_3
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    new-instance p0, Ljava/lang/ClassCastException;

    .line 64
    .line 65
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 66
    .line 67
    .line 68
    throw p0
.end method

.method public final ᛷᛵᛵᲈ(Lxhss/ᲈᛲᛶᛴ;Lxhss/ᛱᛳᲈᛷ;)Lxhss/ᛲᛱᛶᛴ;
    .locals 8

    .line 1
    iget-object v0, p2, Lxhss/ᛱᛳᲈᛷ;->ᛷᛵᛵᲈ:Ljava/lang/Class;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {p0, v0, v1}, Lxhss/ᛱᛷᲈᛱ;->ᛱᛱᛲᲇ(Ljava/lang/Class;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v5

    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {p0, v0, v1}, Lxhss/ᛱᛷᲈᛱ;->ᛱᛱᛲᲇ(Ljava/lang/Class;Z)Z

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    if-nez v5, :cond_0

    .line 14
    .line 15
    if-nez v4, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0

    .line 19
    :cond_0
    new-instance v2, Lxhss/ᛵᲈᛴᲁ;

    .line 20
    .line 21
    move-object v3, p0

    .line 22
    move-object v6, p1

    .line 23
    move-object v7, p2

    .line 24
    invoke-direct/range {v2 .. v7}, Lxhss/ᛵᲈᛴᲁ;-><init>(Lxhss/ᛱᛷᲈᛱ;ZZLxhss/ᲈᛲᛶᛴ;Lxhss/ᛱᛳᲈᛷ;)V

    .line 25
    .line 26
    .line 27
    return-object v2
.end method
