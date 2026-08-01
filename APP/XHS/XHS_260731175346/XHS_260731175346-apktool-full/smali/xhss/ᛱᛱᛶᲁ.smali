.class public abstract Lxhss/ᛱᛱᛶᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᲁᛶᛳᲀ;
.implements Ljava/io/Serializable;


# instance fields
.field public transient ᛱᛱᛲᲇ:Lxhss/ᲁᛶᛳᲀ;

.field public final ᛳᲁᲇᛸ:Ljava/lang/Object;

.field public final ᛷᛴᛷᛱ:Ljava/lang/String;

.field public final ᲀᲇᛳᲁ:Z

.field public final ᲇᛴᲇᛵ:Ljava/lang/Class;

.field public final ᲇᛶᛴᲀ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᛱᛱᛶᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lxhss/ᛱᛱᛶᲁ;->ᲇᛴᲇᛵ:Ljava/lang/Class;

    .line 7
    .line 8
    iput-object p3, p0, Lxhss/ᛱᛱᛶᲁ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lxhss/ᛱᛱᛶᲁ;->ᲇᛶᛴᲀ:Ljava/lang/String;

    .line 11
    .line 12
    iput-boolean p5, p0, Lxhss/ᛱᛱᛶᲁ;->ᲀᲇᛳᲁ:Z

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public abstract ᛷᛴᛷᛱ()Lxhss/ᲁᛶᛳᲀ;
.end method

.method public final ᲇᛶᛴᲀ()Lxhss/ᛲᛵᲀᲈ;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lxhss/ᛱᛱᛶᲁ;->ᲀᲇᛳᲁ:Z

    .line 2
    .line 3
    iget-object p0, p0, Lxhss/ᛱᛱᛶᲁ;->ᲇᛴᲇᛵ:Ljava/lang/Class;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lxhss/ᛳᛳᲀᲀ;->ᛷᛵᛵᲈ:Lxhss/ᛷᛸᲈᛳ;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    new-instance v0, Lxhss/ᛳᲁ;

    .line 13
    .line 14
    invoke-direct {v0, p0}, Lxhss/ᛳᲁ;-><init>(Ljava/lang/Class;)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    invoke-static {p0}, Lxhss/ᛳᛳᲀᲀ;->ᛷᛵᛵᲈ(Ljava/lang/Class;)Lxhss/ᛱᛸᛷᛸ;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method
