.class public final Lxhss/ᲇᛳᛸᛱ;
.super Lxhss/ᛷᛵᲁᲁ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# static fields
.field public static final ᲇᛴᲇᛵ:Lxhss/ᲀᛶᛶᲀ;


# instance fields
.field public final ᛱᛱᛲᲇ:Lxhss/ᲈᲈᛳᛳ;

.field public final ᛳᲁᲇᛸ:Lxhss/ᛱᛶᛶᛱ;

.field public final ᛷᛵᛵᲈ:Lxhss/ᛱᛶᛶᛱ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lxhss/ᲇᛳᛸᛱ;

    .line 2
    .line 3
    invoke-static {v0}, Lxhss/ᲁᲇᛴᲀ;->ᛱᛱᛲᲇ(Ljava/lang/Class;)Lxhss/ᲀᛶᛶᲀ;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lxhss/ᲇᛳᛸᛱ;->ᲇᛴᲇᛵ:Lxhss/ᲀᛶᛶᲀ;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lxhss/ᛱᛶᛶᛱ;Lxhss/ᲈᲈᛳᛳ;Lxhss/ᛱᛶᛶᛱ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᲇᛳᛸᛱ;->ᛷᛵᛵᲈ:Lxhss/ᛱᛶᛶᛱ;

    .line 5
    .line 6
    iput-object p2, p0, Lxhss/ᲇᛳᛸᛱ;->ᛱᛱᛲᲇ:Lxhss/ᲈᲈᛳᛳ;

    .line 7
    .line 8
    iput-object p3, p0, Lxhss/ᲇᛳᛸᛱ;->ᛳᲁᲇᛸ:Lxhss/ᛱᛶᛶᛱ;

    .line 9
    .line 10
    sget-object p1, Lxhss/ᲇᛳᛸᛱ;->ᲇᛴᲇᛵ:Lxhss/ᲀᛶᛶᲀ;

    .line 11
    .line 12
    invoke-virtual {p0}, Lxhss/ᲇᛳᛸᛱ;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-interface {p1, p0}, Lxhss/ᲀᛶᛶᲀ;->ᲇᛸᛳᲁ(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lxhss/ᲇᛳᛸᛱ;->ᛱᛱᛲᲇ:Lxhss/ᲈᲈᛳᛳ;

    .line 2
    .line 3
    sget-object v1, Lxhss/ᲈᲈᛳᛳ;->ᛸᛶᛴᲈ:Lxhss/ᲈᲈᛳᛳ;

    .line 4
    .line 5
    iget-object v2, p0, Lxhss/ᲇᛳᛸᛱ;->ᛷᛵᛵᲈ:Lxhss/ᛱᛶᛶᛱ;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iget-object v0, v0, Lxhss/ᲈᲈᛳᛳ;->ᛱᛱᛲᲇ:Ljava/lang/String;

    .line 19
    .line 20
    iget-object p0, p0, Lxhss/ᲇᛳᛸᛱ;->ᛳᲁᲇᛸ:Lxhss/ᛱᛶᛶᛱ;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    new-instance v2, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v1, " "

    .line 35
    .line 36
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0
.end method

.method public final ᛷᛵᛵᲈ(Lxhss/ᲈᲀᲇᛵ;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lxhss/ᲇᛳᛸᛱ;->ᛷᛵᛵᲈ:Lxhss/ᛱᛶᛶᛱ;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    instance-of v1, v0, Lxhss/ᲀᛴᲇ;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Lxhss/ᛱᛶᛶᛱ;->ᲇᛶᛴᲀ()Lxhss/ᲀᛴᲇ;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0, p1}, Lxhss/ᲀᛴᲇ;->ᲈᛳᲀ(Lxhss/ᲈᲀᲇᛵ;)Lxhss/ᛱᛶᛶᛱ;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :cond_0
    iget-object v1, p0, Lxhss/ᲇᛳᛸᛱ;->ᛳᲁᲇᛸ:Lxhss/ᛱᛶᛶᛱ;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    instance-of v2, v1, Lxhss/ᲀᛴᲇ;

    .line 24
    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    invoke-virtual {v1}, Lxhss/ᛱᛶᛶᛱ;->ᲇᛶᛴᲀ()Lxhss/ᲀᛴᲇ;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1, p1}, Lxhss/ᲀᛴᲇ;->ᲈᛳᲀ(Lxhss/ᲈᲀᲇᛵ;)Lxhss/ᛱᛶᛶᛱ;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    :cond_1
    iget-object p0, p0, Lxhss/ᲇᛳᛸᛱ;->ᛱᛱᛲᲇ:Lxhss/ᲈᲈᛳᛳ;

    .line 36
    .line 37
    sget-object v2, Lxhss/ᲇᛵᛸᛱ;->ᛷᛵᛵᲈ:Ljava/util/HashMap;

    .line 38
    .line 39
    invoke-virtual {v2, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    check-cast p0, Lxhss/ᛲᛲᛴᛲ;

    .line 44
    .line 45
    if-eqz p0, :cond_2

    .line 46
    .line 47
    invoke-virtual {p0, v0, v1, p1}, Lxhss/ᛲᛲᛴᛲ;->ᛷᛵᛵᲈ(Lxhss/ᛱᛶᛶᛱ;Lxhss/ᛱᛶᛶᛱ;Lxhss/ᲈᲀᲇᛵ;)Z

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    return p0

    .line 52
    :cond_2
    const/4 p0, 0x0

    .line 53
    return p0
.end method
