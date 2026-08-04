.class public final synthetic Lyyds/ᛱᲇᛱᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic ᛲᲈᲁ:Lyyds/ᛶᛳᛶᛵ;

.field public final synthetic ᛵᛸᛸᛷ:Ljava/util/Comparator;


# direct methods
.method public synthetic constructor <init>(Lyyds/ᛶᛳᛶᛵ;Ljava/util/Comparator;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛱᲇᛱᛵ;->ᛲᲈᲁ:Lyyds/ᛶᛳᛶᛵ;

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᛱᲇᛱᛵ;->ᛵᛸᛸᛷ:Ljava/util/Comparator;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᛱᲇᛱᛵ;->ᛲᲈᲁ:Lyyds/ᛶᛳᛶᛵ;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lyyds/ᛶᛳᛶᛵ;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return v0

    .line 10
    :cond_0
    iget-object p0, p0, Lyyds/ᛱᲇᛱᛵ;->ᛵᛸᛸᛷ:Ljava/util/Comparator;

    .line 11
    .line 12
    invoke-interface {p0, p1, p2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method
