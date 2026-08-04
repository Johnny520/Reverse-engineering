.class public final Lyyds/ᛲᛳᲈᛳ;
.super Lyyds/ᲈᛸᛷ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛵᛸᛸᛷ:Lyyds/ᛴᛶᛷᲈ;


# instance fields
.field public final ᛲᲈᲁ:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lyyds/ᛲᛳᲈᛳ;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1}, Lyyds/ᛲᛳᲈᛳ;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v1, Lyyds/ᛴᛶᛷᲈ;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v1, v0, v2}, Lyyds/ᛴᛶᛷᲈ;-><init>(Lyyds/ᲈᛸᛷ;I)V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lyyds/ᛲᛳᲈᛳ;->ᛵᛸᛸᛷ:Lyyds/ᛴᛶᛷᲈ;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lyyds/ᛲᛳᲈᛳ;->ᛲᲈᲁ:I

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final ᛵᛸᛸᛷ(Lyyds/ᲀᛲᛴᲇ;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p1}, Lyyds/ᲀᛲᛴᲇ;->ᛲᲀᛲᛲ()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lyyds/ᲀᲁᲈᲇ;->ᛶᛸᲀᲁ(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x5

    .line 10
    if-eq v1, v2, :cond_1

    .line 11
    .line 12
    const/4 v2, 0x6

    .line 13
    if-eq v1, v2, :cond_1

    .line 14
    .line 15
    const/16 p0, 0x8

    .line 16
    .line 17
    if-ne v1, p0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1}, Lyyds/ᲀᛲᛴᲇ;->ᲁᛶᛴᛸ()V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return-object p0

    .line 24
    :cond_0
    new-instance p0, Lyyds/ᛷᛷᲀᲈ;

    .line 25
    .line 26
    invoke-static {v0}, Lyyds/ᛴᛷᛷᲇ;->ᛳᛸᛴᛶ(I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const/4 v1, 0x0

    .line 31
    invoke-virtual {p1, v1}, Lyyds/ᲀᛲᛴᲇ;->ᛳᛸᛴᛶ(Z)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    new-instance v1, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v2, "Expecting number, got: "

    .line 38
    .line 39
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v0, "; at path "

    .line 46
    .line 47
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p0

    .line 61
    :cond_1
    iget p0, p0, Lyyds/ᛲᛳᲈᛳ;->ᛲᲈᲁ:I

    .line 62
    .line 63
    invoke-static {p0, p1}, Lyyds/ᛴᛷᛷᲇ;->ᛲᲈᲁ(ILyyds/ᲀᛲᛴᲇ;)Ljava/lang/Number;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    return-object p0
.end method

.method public final ᲀᛲᛳᲀ(Lyyds/ᛶᲀᛳᲁ;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Ljava/lang/Number;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lyyds/ᛶᲀᛳᲁ;->ᲈᛷᲈᛶ(Ljava/lang/Number;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
