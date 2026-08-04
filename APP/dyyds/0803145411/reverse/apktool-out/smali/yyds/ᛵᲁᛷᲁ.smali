.class public final Lyyds/ᛵᲁᛷᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛴᛴᲇᛸ;


# instance fields
.field public final ᛲᲈᲁ:Lyyds/ᛴᛴᲇᛸ;


# direct methods
.method public constructor <init>(Lyyds/ᲈᛷᛶᛶ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛵᲁᛷᲁ;->ᛲᲈᲁ:Lyyds/ᛴᛴᲇᛸ;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object p0, p0, Lyyds/ᛵᲁᛷᲁ;->ᛲᲈᲁ:Lyyds/ᛴᛴᲇᛸ;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-string v0, "("

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const-string v0, "[?"

    .line 16
    .line 17
    const-string v1, "]"

    .line 18
    .line 19
    invoke-static {v0, p0, v1}, Lyyds/ᲀᲁᲈᲇ;->ᛷᛲᲈᛱ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :cond_0
    const-string v0, "[?("

    .line 25
    .line 26
    const-string v1, ")]"

    .line 27
    .line 28
    invoke-static {v0, p0, v1}, Lyyds/ᲀᲁᲈᲇ;->ᛷᛲᲈᛱ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method

.method public final ᛲᲈᲁ(Lyyds/ᛴᛵᲀᛴ;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛵᲁᛷᲁ;->ᛲᲈᲁ:Lyyds/ᛴᛴᲇᛸ;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lyyds/ᛴᛴᲇᛸ;->ᛲᲈᲁ(Lyyds/ᛴᛵᲀᛴ;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
