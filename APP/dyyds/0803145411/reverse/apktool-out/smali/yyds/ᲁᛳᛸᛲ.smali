.class public final Lyyds/ᲁᛳᛸᛲ;
.super Lyyds/ᛲᛸᛸᛶ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛶᛷᛲᲁ:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lyyds/ᛲᛸᛸᛶ;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lyyds/ᲁᛳᛸᛲ;->ᛶᛷᛲᲁ:Ljava/util/HashMap;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ(Ljava/lang/Object;)Lyyds/ᲈᛱᲇᲇ;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲁᛳᛸᛲ;->ᛶᛷᛲᲁ:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lyyds/ᲈᛱᲇᲇ;

    .line 8
    .line 9
    return-object p0
.end method

.method public final ᛵᛸᛸᛷ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lyyds/ᛲᛸᛸᛶ;->ᛵᛸᛸᛷ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object p0, p0, Lyyds/ᲁᛳᛸᛲ;->ᛶᛷᛲᲁ:Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    return-object v0
.end method
