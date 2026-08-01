.class public final Lxhss/ᛱᲁᲈᛲ;
.super Lxhss/ᛶᛵᛵ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final ᛱᛱᛲᲇ:Lxhss/ᲁᲀᛶᛲ;


# direct methods
.method public constructor <init>(Lxhss/ᲁᲀᛶᛲ;Lxhss/ᛲᛸᲈᲇ;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Lxhss/ᛶᛵᛵ;-><init>(Lxhss/ᛲᛸᲈᲇ;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᛱᲁᲈᛲ;->ᛱᛱᛲᲇ:Lxhss/ᲁᲀᛶᛲ;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final ᛷᛴᛷᛱ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    return-object p1
.end method

.method public final ᲇᛴᲇᛵ()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛱᲁᲈᛲ;->ᛱᛱᛲᲇ:Lxhss/ᲁᲀᛶᛲ;

    .line 2
    .line 3
    invoke-interface {p0}, Lxhss/ᲁᲀᛶᛲ;->ᛳᲁᲇᛸ()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final ᲇᛶᛴᲀ(Ljava/lang/Object;Lxhss/ᛴᛷᛸᛷ;Lxhss/ᲁᲀᛸᛲ;)V
    .locals 1

    .line 1
    iget-object p0, p3, Lxhss/ᲁᲀᛸᛲ;->ᛱᛱᛲᲇ:Ljava/lang/reflect/Field;

    .line 2
    .line 3
    iget-object v0, p3, Lxhss/ᲁᲀᛸᛲ;->ᲇᛶᛴᲀ:Lxhss/ᛲᛱᛶᛴ;

    .line 4
    .line 5
    invoke-virtual {v0, p2}, Lxhss/ᛲᛱᛶᛴ;->ᛱᛱᛲᲇ(Lxhss/ᛴᛷᛸᛷ;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    if-nez p2, :cond_1

    .line 10
    .line 11
    iget-boolean v0, p3, Lxhss/ᲁᲀᛸᛲ;->ᲀᲇᛳᲁ:Z

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    return-void

    .line 17
    :cond_1
    :goto_0
    iget-boolean p3, p3, Lxhss/ᲁᲀᛸᛲ;->ᛸᛴᛶᛳ:Z

    .line 18
    .line 19
    if-nez p3, :cond_2

    .line 20
    .line 21
    invoke-virtual {p0, p1, p2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_2
    const/4 p1, 0x0

    .line 26
    invoke-static {p0, p1}, Lxhss/ᲇᛴᛷᲇ;->ᲇᛴᲇᛵ(Ljava/lang/reflect/AccessibleObject;Z)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    new-instance p1, Lxhss/ᛱᲈᛲᛷ;

    .line 31
    .line 32
    const-string p2, "Cannot set value of \'static final\' "

    .line 33
    .line 34
    invoke-virtual {p2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw p1
.end method
