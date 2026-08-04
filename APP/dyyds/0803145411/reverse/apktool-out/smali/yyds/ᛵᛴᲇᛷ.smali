.class public final Lyyds/ᛵᛴᲇᛷ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛲᛴᛳᛲ:Lyyds/ᛵᛴᲇᛷ;

.field public static final ᲇᲇᲇᛱ:Lyyds/ᛵᛴᲇᛷ;


# instance fields
.field public final ᛲᲈᲁ:Z

.field public final ᛵᛸᛸᛷ:Lyyds/ᛲᲈᲈᲈ;

.field public final ᲀᛲᛳᲀ:Lyyds/ᛲᲈᲈᲈ;

.field public final ᲇᲈᛵᛷ:Lyyds/ᛴᲁᲇ;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lyyds/ᛵᛴᲇᛷ;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lyyds/ᛵᛴᲇᛷ;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lyyds/ᛵᛴᲇᛷ;->ᛲᛴᛳᛲ:Lyyds/ᛵᛴᲇᛷ;

    .line 8
    .line 9
    new-instance v0, Lyyds/ᛵᛴᲇᛷ;

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    invoke-direct {v0, v1}, Lyyds/ᛵᛴᲇᛷ;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lyyds/ᛵᛴᲇᛷ;->ᲇᲇᲇᛱ:Lyyds/ᛵᛴᲇᛷ;

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
    iput-boolean v0, p0, Lyyds/ᛵᛴᲇᛷ;->ᛲᲈᲁ:Z

    .line 13
    .line 14
    sget-object v0, Lyyds/ᲀᛳᛳᛱ;->ᲇᲇᲇᛱ:Lyyds/ᛱᛵᲈᲁ;

    .line 15
    .line 16
    iput-object v0, p0, Lyyds/ᛵᛴᲇᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛲᲈᲈᲈ;

    .line 17
    .line 18
    iput-object v0, p0, Lyyds/ᛵᛴᲇᛷ;->ᛵᛸᛸᛷ:Lyyds/ᛲᲈᲈᲈ;

    .line 19
    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    sget-object p1, Lyyds/ᲀᛳᛳᛱ;->ᛱᲈᲁ:Lyyds/ᲀᛴᛱᛷ;

    .line 23
    .line 24
    iput-object p1, p0, Lyyds/ᛵᛴᲇᛷ;->ᲇᲈᛵᛷ:Lyyds/ᛴᲁᲇ;

    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    sget-object p1, Lyyds/ᲀᛳᛳᛱ;->ᛶᛷᛲᲁ:Lyyds/ᛲᲁᲈ;

    .line 28
    .line 29
    iput-object p1, p0, Lyyds/ᛵᛴᲇᛷ;->ᲇᲈᛵᛷ:Lyyds/ᛴᲁᲇ;

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ(Ljava/lang/String;Ljava/lang/StringBuilder;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᛵᛴᲇᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛲᲈᲈᲈ;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lyyds/ᛲᲈᲈᲈ;->ᛷᲈᲈᲁ(Ljava/lang/String;)Z

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
    sget-object v1, Lyyds/ᲀᲁᛲᲈ;->ᛲᲈᲁ:Lyyds/ᛵᛴᲇᛷ;

    .line 19
    .line 20
    if-nez p1, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    iget-object p0, p0, Lyyds/ᛵᛴᲇᛷ;->ᲇᲈᛵᛷ:Lyyds/ᛴᲁᲇ;

    .line 24
    .line 25
    invoke-interface {p0, p1, p2}, Lyyds/ᛴᲁᲇ;->ᛶᛷᛲᲁ(Ljava/lang/String;Ljava/lang/StringBuilder;)V

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
