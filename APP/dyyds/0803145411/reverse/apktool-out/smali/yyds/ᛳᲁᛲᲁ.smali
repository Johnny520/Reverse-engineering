.class public final Lyyds/ᛳᲁᛲᲁ;
.super Lyyds/ᛶᛲᛶᛲ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final synthetic ᛱᲈᲁ:Lyyds/ᲁᛲᲁᛷ;


# direct methods
.method public constructor <init>(Lyyds/ᲁᛲᲁᛷ;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyyds/ᛳᲁᛲᲁ;->ᛱᲈᲁ:Lyyds/ᲁᛲᲁᛷ;

    .line 2
    .line 3
    const/16 p1, 0x19

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lyyds/ᛶᛲᛶᛲ;-><init>(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final ᲀᛲᛳᲀ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᛳᲁᛲᲁ;->ᛱᲈᲁ:Lyyds/ᲁᛲᲁᛷ;

    .line 4
    .line 5
    iget-object p0, p0, Lyyds/ᲁᛲᲁᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛱᛵᛷ;

    .line 6
    .line 7
    invoke-interface {p0, p1}, Lyyds/ᛱᛵᛷ;->ᲀᛲᛱᛱ(Ljava/lang/String;)Lyyds/ᛵᲇᛱᛸ;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public final ᲇᲈᛵᛷ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    .line 2
    .line 3
    check-cast p2, Lyyds/ᛵᲇᛱᛸ;

    .line 4
    .line 5
    check-cast p3, Lyyds/ᛵᲇᛱᛸ;

    .line 6
    .line 7
    invoke-interface {p2}, Ljava/lang/AutoCloseable;->close()V

    .line 8
    .line 9
    .line 10
    return-void
.end method
