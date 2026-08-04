.class public abstract Lyyds/ᛱᲁᲈᛶ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᲇᛳᛴᛱ;
.implements Ljava/io/Serializable;


# instance fields
.field public final ᛱᲈᲁ:Z

.field public final ᛲᛴᛳᛲ:Ljava/lang/Class;

.field public final ᛶᛷᛲᲁ:Ljava/lang/String;

.field public transient ᲀᛲᛳᲀ:Lyyds/ᲇᛳᛴᛱ;

.field public final ᲇᲇᲇᛱ:Ljava/lang/String;

.field public final ᲇᲈᛵᛷ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛱᲁᲈᛶ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᛱᲁᲈᛶ;->ᛲᛴᛳᛲ:Ljava/lang/Class;

    .line 7
    .line 8
    iput-object p3, p0, Lyyds/ᛱᲁᲈᛶ;->ᲇᲇᲇᛱ:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lyyds/ᛱᲁᲈᛶ;->ᛶᛷᛲᲁ:Ljava/lang/String;

    .line 11
    .line 12
    iput-boolean p5, p0, Lyyds/ᛱᲁᲈᛶ;->ᛱᲈᲁ:Z

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public abstract ᛵᛸᛸᛷ()Lyyds/ᲇᛳᛴᛱ;
.end method

.method public final ᲇᲈᛵᛷ()Lyyds/ᲈᲇᛶᛷ;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lyyds/ᛱᲁᲈᛶ;->ᛱᲈᲁ:Z

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᛱᲁᲈᛶ;->ᛲᛴᛳᛲ:Ljava/lang/Class;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lyyds/ᛸᛱᛳᲈ;->ᛲᲈᲁ:Lyyds/ᛷᛱᛴᲈ;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    new-instance v0, Lyyds/ᲀᲁᲀᛵ;

    .line 13
    .line 14
    invoke-direct {v0, p0}, Lyyds/ᲀᲁᲀᛵ;-><init>(Ljava/lang/Class;)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    invoke-static {p0}, Lyyds/ᛸᛱᛳᲈ;->ᛲᲈᲁ(Ljava/lang/Class;)Lyyds/ᲁᛵᛴᲀ;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method
