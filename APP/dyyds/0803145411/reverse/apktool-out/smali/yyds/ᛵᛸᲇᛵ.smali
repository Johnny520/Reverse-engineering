.class public final Lyyds/ᛵᛸᲇᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛸᛶᲀᲈ;


# instance fields
.field public final ᛲᲈᲁ:Ljava/util/LinkedHashSet;


# direct methods
.method public constructor <init>(Lyyds/ᛲᛴᛴᛱ;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lyyds/ᛵᛸᲇᛵ;->ᛲᲈᲁ:Ljava/util/LinkedHashSet;

    .line 10
    .line 11
    iget-object p1, p1, Lyyds/ᛲᛴᛴᛱ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Lyyds/ᛲᛸᛸᛶ;

    .line 14
    .line 15
    const-string v0, "androidx.savedstate.Restarter"

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Lyyds/ᛲᛸᛸᛶ;->ᛲᲈᲁ(Ljava/lang/Object;)Lyyds/ᲈᛱᲇᲇ;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const/4 v2, 0x0

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    iget-object p0, v1, Lyyds/ᲈᛱᲇᲇ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    new-instance v1, Lyyds/ᲈᛱᲇᲇ;

    .line 28
    .line 29
    invoke-direct {v1, v0, p0}, Lyyds/ᲈᛱᲇᲇ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget p0, p1, Lyyds/ᛲᛸᛸᛶ;->ᲇᲇᲇᛱ:I

    .line 33
    .line 34
    add-int/lit8 p0, p0, 0x1

    .line 35
    .line 36
    iput p0, p1, Lyyds/ᛲᛸᛸᛶ;->ᲇᲇᲇᛱ:I

    .line 37
    .line 38
    iget-object p0, p1, Lyyds/ᛲᛸᛸᛶ;->ᲇᲈᛵᛷ:Lyyds/ᲈᛱᲇᲇ;

    .line 39
    .line 40
    if-nez p0, :cond_1

    .line 41
    .line 42
    iput-object v1, p1, Lyyds/ᛲᛸᛸᛶ;->ᲀᛲᛳᲀ:Lyyds/ᲈᛱᲇᲇ;

    .line 43
    .line 44
    iput-object v1, p1, Lyyds/ᛲᛸᛸᛶ;->ᲇᲈᛵᛷ:Lyyds/ᲈᛱᲇᲇ;

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    iput-object v1, p0, Lyyds/ᲈᛱᲇᲇ;->ᛲᛴᛳᛲ:Lyyds/ᲈᛱᲇᲇ;

    .line 48
    .line 49
    iput-object p0, v1, Lyyds/ᲈᛱᲇᲇ;->ᲇᲇᲇᛱ:Lyyds/ᲈᛱᲇᲇ;

    .line 50
    .line 51
    iput-object v1, p1, Lyyds/ᛲᛸᛸᛶ;->ᲇᲈᛵᛷ:Lyyds/ᲈᛱᲇᲇ;

    .line 52
    .line 53
    :goto_0
    move-object p0, v2

    .line 54
    :goto_1
    check-cast p0, Lyyds/ᛸᛶᲀᲈ;

    .line 55
    .line 56
    if-nez p0, :cond_2

    .line 57
    .line 58
    return-void

    .line 59
    :cond_2
    const-string p0, "SavedStateProvider with the given key is already registered"

    .line 60
    .line 61
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw v2
.end method


# virtual methods
.method public final ᛲᲈᲁ()Landroid/os/Bundle;
    .locals 2

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/ArrayList;

    .line 7
    .line 8
    iget-object p0, p0, Lyyds/ᛵᛸᲇᛵ;->ᛲᲈᲁ:Ljava/util/LinkedHashSet;

    .line 9
    .line 10
    invoke-direct {v1, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 11
    .line 12
    .line 13
    const-string p0, "classes_to_restore"

    .line 14
    .line 15
    invoke-virtual {v0, p0, v1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method
