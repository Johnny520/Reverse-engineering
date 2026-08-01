.class public final Lxhss/ᲁᲀᛸᛲ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final ᛱᛱᛲᲇ:Ljava/lang/reflect/Field;

.field public final ᛳᲁᲇᛸ:Ljava/lang/String;

.field public final synthetic ᛷᛴᛷᛱ:Lxhss/ᛲᛱᛶᛴ;

.field public final ᛷᛵᛵᲈ:Ljava/lang/String;

.field public final synthetic ᛸᛴᛶᛳ:Z

.field public final synthetic ᲀᲇᛳᲁ:Z

.field public final synthetic ᲇᛴᲇᛵ:Ljava/lang/reflect/Method;

.field public final synthetic ᲇᛶᛴᲀ:Lxhss/ᛲᛱᛶᛴ;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Lxhss/ᛲᛱᛶᛴ;Lxhss/ᛲᛱᛶᛴ;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lxhss/ᲁᲀᛸᛲ;->ᲇᛴᲇᛵ:Ljava/lang/reflect/Method;

    .line 5
    .line 6
    iput-object p4, p0, Lxhss/ᲁᲀᛸᛲ;->ᛷᛴᛷᛱ:Lxhss/ᛲᛱᛶᛴ;

    .line 7
    .line 8
    iput-object p5, p0, Lxhss/ᲁᲀᛸᛲ;->ᲇᛶᛴᲀ:Lxhss/ᛲᛱᛶᛴ;

    .line 9
    .line 10
    iput-boolean p6, p0, Lxhss/ᲁᲀᛸᛲ;->ᲀᲇᛳᲁ:Z

    .line 11
    .line 12
    iput-boolean p7, p0, Lxhss/ᲁᲀᛸᛲ;->ᛸᛴᛶᛳ:Z

    .line 13
    .line 14
    iput-object p1, p0, Lxhss/ᲁᲀᛸᛲ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p2, p0, Lxhss/ᲁᲀᛸᛲ;->ᛱᛱᛲᲇ:Ljava/lang/reflect/Field;

    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Lxhss/ᲁᲀᛸᛲ;->ᛳᲁᲇᛸ:Ljava/lang/String;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final ᛷᛵᛵᲈ(Lxhss/ᛸᲈᲈᛶ;Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lxhss/ᲁᲀᛸᛲ;->ᲇᛴᲇᛵ:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    :try_start_0
    invoke-virtual {v0, p2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    goto :goto_0

    .line 11
    :catch_0
    move-exception p0

    .line 12
    const/4 p1, 0x0

    .line 13
    invoke-static {v0, p1}, Lxhss/ᲇᛴᛷᲇ;->ᲇᛴᲇᛵ(Ljava/lang/reflect/AccessibleObject;Z)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    new-instance p2, Lxhss/ᛱᲈᛲᛷ;

    .line 18
    .line 19
    const-string v0, "Accessor "

    .line 20
    .line 21
    const-string v1, " threw exception"

    .line 22
    .line 23
    invoke-static {v0, p1, v1}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛶᛴᲈ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-direct {p2, p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    throw p2

    .line 35
    :cond_0
    iget-object v0, p0, Lxhss/ᲁᲀᛸᛲ;->ᛱᛱᛲᲇ:Ljava/lang/reflect/Field;

    .line 36
    .line 37
    invoke-virtual {v0, p2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    :goto_0
    if-ne v0, p2, :cond_1

    .line 42
    .line 43
    return-void

    .line 44
    :cond_1
    iget-object p2, p0, Lxhss/ᲁᲀᛸᛲ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {p1, p2}, Lxhss/ᛸᲈᲈᛶ;->ᛸᛶᲈᛶ(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    iget-object p0, p0, Lxhss/ᲁᲀᛸᛲ;->ᛷᛴᛷᛱ:Lxhss/ᛲᛱᛶᛴ;

    .line 50
    .line 51
    invoke-virtual {p0, p1, v0}, Lxhss/ᛲᛱᛶᛴ;->ᛳᲁᲇᛸ(Lxhss/ᛸᲈᲈᛶ;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method
