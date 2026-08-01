.class public final Lcom/android/dx/dex/file/MixedItemSection;
.super Lcom/android/dx/dex/file/Section;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/dx/dex/file/MixedItemSection$SortType;
    }
.end annotation


# static fields
.field private static final TYPE_SORTER:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lcom/android/dx/dex/file/OffsettedItem;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final interns:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lcom/android/dx/dex/file/OffsettedItem;",
            "Lcom/android/dx/dex/file/OffsettedItem;",
            ">;"
        }
    .end annotation
.end field

.field private final items:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/dex/file/OffsettedItem;",
            ">;"
        }
    .end annotation
.end field

.field private final sort:Lcom/android/dx/dex/file/MixedItemSection$SortType;

.field private writeSize:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/android/dx/dex/file/MixedItemSection$1;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/android/dx/dex/file/MixedItemSection$1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/android/dx/dex/file/MixedItemSection;->TYPE_SORTER:Ljava/util/Comparator;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/android/dx/dex/file/DexFile;ILcom/android/dx/dex/file/MixedItemSection$SortType;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/android/dx/dex/file/Section;-><init>(Ljava/lang/String;Lcom/android/dx/dex/file/DexFile;I)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/util/ArrayList;

    .line 5
    .line 6
    const/16 p2, 0x64

    .line 7
    .line 8
    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lcom/android/dx/dex/file/MixedItemSection;->items:Ljava/util/ArrayList;

    .line 12
    .line 13
    new-instance p1, Ljava/util/HashMap;

    .line 14
    .line 15
    invoke-direct {p1, p2}, Ljava/util/HashMap;-><init>(I)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lcom/android/dx/dex/file/MixedItemSection;->interns:Ljava/util/HashMap;

    .line 19
    .line 20
    iput-object p4, p0, Lcom/android/dx/dex/file/MixedItemSection;->sort:Lcom/android/dx/dex/file/MixedItemSection$SortType;

    .line 21
    .line 22
    const/4 p1, -0x1

    .line 23
    iput p1, p0, Lcom/android/dx/dex/file/MixedItemSection;->writeSize:I

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public add(Lcom/android/dx/dex/file/OffsettedItem;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/dex/file/Section;->throwIfPrepared()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-virtual {p1}, Lcom/android/dx/dex/file/OffsettedItem;->getAlignment()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-virtual {p0}, Lcom/android/dx/dex/file/Section;->getAlignment()I

    .line 9
    .line 10
    .line 11
    move-result v1
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    if-gt v0, v1, :cond_0

    .line 13
    .line 14
    iget-object p0, p0, Lcom/android/dx/dex/file/MixedItemSection;->items:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    :try_start_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 21
    .line 22
    const-string p1, "incompatible item alignment"

    .line 23
    .line 24
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p0
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    .line 28
    :catch_0
    const-string p0, "item == null"

    .line 29
    .line 30
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public get(Lcom/android/dx/dex/file/OffsettedItem;)Lcom/android/dx/dex/file/OffsettedItem;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/android/dx/dex/file/OffsettedItem;",
            ">(TT;)TT;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/dex/file/Section;->throwIfNotPrepared()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/android/dx/dex/file/MixedItemSection;->interns:Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Lcom/android/dx/dex/file/OffsettedItem;

    .line 11
    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-direct {p0, p1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw p0
.end method

.method public getAbsoluteItemOffset(Lcom/android/dx/dex/file/Item;)I
    .locals 0

    .line 1
    check-cast p1, Lcom/android/dx/dex/file/OffsettedItem;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/android/dx/dex/file/OffsettedItem;->getAbsoluteOffset()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public declared-synchronized intern(Lcom/android/dx/dex/file/OffsettedItem;)Lcom/android/dx/dex/file/OffsettedItem;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/android/dx/dex/file/OffsettedItem;",
            ">(TT;)TT;"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lcom/android/dx/dex/file/Section;->throwIfPrepared()V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lcom/android/dx/dex/file/MixedItemSection;->interns:Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lcom/android/dx/dex/file/OffsettedItem;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    monitor-exit p0

    .line 16
    return-object v0

    .line 17
    :cond_0
    :try_start_1
    invoke-virtual {p0, p1}, Lcom/android/dx/dex/file/MixedItemSection;->add(Lcom/android/dx/dex/file/OffsettedItem;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lcom/android/dx/dex/file/MixedItemSection;->interns:Ljava/util/HashMap;

    .line 21
    .line 22
    invoke-virtual {v0, p1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    .line 24
    .line 25
    monitor-exit p0

    .line 26
    return-object p1

    .line 27
    :catchall_0
    move-exception p1

    .line 28
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 29
    throw p1
.end method

.method public items()Ljava/util/Collection;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "+",
            "Lcom/android/dx/dex/file/Item;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/MixedItemSection;->items:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object p0
.end method

.method public placeItems()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/dex/file/Section;->throwIfNotPrepared()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/android/dx/dex/file/MixedItemSection;->sort:Lcom/android/dx/dex/file/MixedItemSection$SortType;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x1

    .line 11
    if-eq v0, v1, :cond_1

    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    if-eq v0, v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-object v0, p0, Lcom/android/dx/dex/file/MixedItemSection;->items:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    iget-object v0, p0, Lcom/android/dx/dex/file/MixedItemSection;->items:Ljava/util/ArrayList;

    .line 24
    .line 25
    sget-object v1, Lcom/android/dx/dex/file/MixedItemSection;->TYPE_SORTER:Ljava/util/Comparator;

    .line 26
    .line 27
    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    iget-object v0, p0, Lcom/android/dx/dex/file/MixedItemSection;->items:Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    const/4 v1, 0x0

    .line 37
    move v2, v1

    .line 38
    :goto_1
    if-ge v1, v0, :cond_3

    .line 39
    .line 40
    iget-object v3, p0, Lcom/android/dx/dex/file/MixedItemSection;->items:Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    check-cast v3, Lcom/android/dx/dex/file/OffsettedItem;

    .line 47
    .line 48
    :try_start_0
    invoke-virtual {v3, p0, v2}, Lcom/android/dx/dex/file/OffsettedItem;->place(Lcom/android/dx/dex/file/Section;I)I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-lt v4, v2, :cond_2

    .line 53
    .line 54
    invoke-virtual {v3}, Lcom/android/dx/dex/file/OffsettedItem;->writeSize()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    add-int/2addr v2, v4

    .line 59
    add-int/lit8 v1, v1, 0x1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :catch_0
    move-exception p0

    .line 63
    goto :goto_2

    .line 64
    :cond_2
    new-instance p0, Ljava/lang/RuntimeException;

    .line 65
    .line 66
    new-instance v0, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 69
    .line 70
    .line 71
    const-string v1, "bogus place() result for "

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw p0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 87
    :goto_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    const-string v1, "...while placing "

    .line 90
    .line 91
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-static {p0, v0}, Lcom/android/dex/util/ExceptionWithContext;->withContext(Ljava/lang/Throwable;Ljava/lang/String;)Lcom/android/dex/util/ExceptionWithContext;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    throw p0

    .line 106
    :cond_3
    iput v2, p0, Lcom/android/dx/dex/file/MixedItemSection;->writeSize:I

    .line 107
    .line 108
    return-void
.end method

.method public prepare0()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/dex/file/Section;->getFile()Lcom/android/dx/dex/file/DexFile;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :cond_0
    iget-object v2, p0, Lcom/android/dx/dex/file/MixedItemSection;->items:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-lt v1, v2, :cond_1

    .line 13
    .line 14
    return-void

    .line 15
    :cond_1
    :goto_0
    if-ge v1, v2, :cond_0

    .line 16
    .line 17
    iget-object v3, p0, Lcom/android/dx/dex/file/MixedItemSection;->items:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    check-cast v3, Lcom/android/dx/dex/file/OffsettedItem;

    .line 24
    .line 25
    invoke-virtual {v3, v0}, Lcom/android/dx/dex/file/Item;->addContents(Lcom/android/dx/dex/file/DexFile;)V

    .line 26
    .line 27
    .line 28
    add-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    goto :goto_0
.end method

.method public size()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/MixedItemSection;->items:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public writeHeaderPart(Lcom/android/dx/util/AnnotatedOutput;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/dex/file/Section;->throwIfNotPrepared()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/android/dx/dex/file/MixedItemSection;->writeSize:I

    .line 5
    .line 6
    const/4 v1, -0x1

    .line 7
    if-eq v0, v1, :cond_3

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {p0}, Lcom/android/dx/dex/file/Section;->getFileOffset()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    :goto_0
    invoke-virtual {p0}, Lcom/android/dx/dex/file/Section;->getName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    if-nez p0, :cond_1

    .line 22
    .line 23
    const-string p0, "<unnamed>"

    .line 24
    .line 25
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    rsub-int/lit8 v2, v2, 0xf

    .line 30
    .line 31
    new-array v2, v2, [C

    .line 32
    .line 33
    const/16 v3, 0x20

    .line 34
    .line 35
    invoke-static {v2, v3}, Ljava/util/Arrays;->fill([CC)V

    .line 36
    .line 37
    .line 38
    new-instance v3, Ljava/lang/String;

    .line 39
    .line 40
    invoke-direct {v3, v2}, Ljava/lang/String;-><init>([C)V

    .line 41
    .line 42
    .line 43
    invoke-interface {p1}, Lcom/android/dx/util/AnnotatedOutput;->annotates()Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_2

    .line 48
    .line 49
    new-instance v2, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string v4, "_size:"

    .line 58
    .line 59
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-static {v0}, Lcom/android/dx/util/Hex;->u4(I)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    const/4 v4, 0x4

    .line 77
    invoke-interface {p1, v4, v2}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 78
    .line 79
    .line 80
    new-instance v2, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const-string p0, "_off: "

    .line 89
    .line 90
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-static {v1}, Lcom/android/dx/util/Hex;->u4(I)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    invoke-interface {p1, v4, p0}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 108
    .line 109
    .line 110
    :cond_2
    invoke-interface {p1, v0}, Lcom/android/dx/util/Output;->writeInt(I)V

    .line 111
    .line 112
    .line 113
    invoke-interface {p1, v1}, Lcom/android/dx/util/Output;->writeInt(I)V

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :cond_3
    const-string p0, "write size not yet set"

    .line 118
    .line 119
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    return-void
.end method

.method public writeIndexAnnotation(Lcom/android/dx/util/AnnotatedOutput;Lcom/android/dx/dex/file/ItemType;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/dex/file/Section;->throwIfNotPrepared()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/TreeMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lcom/android/dx/dex/file/MixedItemSection;->items:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Lcom/android/dx/dex/file/OffsettedItem;

    .line 26
    .line 27
    invoke-virtual {v1}, Lcom/android/dx/dex/file/Item;->itemType()Lcom/android/dx/dex/file/ItemType;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    if-ne v2, p2, :cond_0

    .line 32
    .line 33
    invoke-virtual {v1}, Lcom/android/dx/dex/file/OffsettedItem;->toHuman()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v0, v2, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    invoke-virtual {v0}, Ljava/util/TreeMap;->size()I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    if-nez p0, :cond_2

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_2
    const/4 p0, 0x0

    .line 49
    invoke-interface {p1, p0, p3}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result p3

    .line 64
    if-eqz p3, :cond_3

    .line 65
    .line 66
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p3

    .line 70
    check-cast p3, Ljava/util/Map$Entry;

    .line 71
    .line 72
    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    check-cast v0, Ljava/lang/String;

    .line 77
    .line 78
    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p3

    .line 82
    check-cast p3, Lcom/android/dx/dex/file/OffsettedItem;

    .line 83
    .line 84
    new-instance v1, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p3}, Lcom/android/dx/dex/file/OffsettedItem;->offsetString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p3

    .line 93
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const/16 p3, 0x20

    .line 97
    .line 98
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const/16 p3, 0xa

    .line 105
    .line 106
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p3

    .line 113
    invoke-interface {p1, p0, p3}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 114
    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_3
    :goto_2
    return-void
.end method

.method public writeSize()I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/dex/file/Section;->throwIfNotPrepared()V

    .line 2
    .line 3
    .line 4
    iget p0, p0, Lcom/android/dx/dex/file/MixedItemSection;->writeSize:I

    .line 5
    .line 6
    return p0
.end method

.method public writeTo0(Lcom/android/dx/util/AnnotatedOutput;)V
    .locals 10

    .line 1
    invoke-interface {p1}, Lcom/android/dx/util/AnnotatedOutput;->annotates()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Lcom/android/dx/dex/file/Section;->getFile()Lcom/android/dx/dex/file/DexFile;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Lcom/android/dx/dex/file/MixedItemSection;->items:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const/4 v3, 0x1

    .line 16
    const/4 v4, 0x0

    .line 17
    move v6, v3

    .line 18
    move v5, v4

    .line 19
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v7

    .line 23
    if-eqz v7, :cond_3

    .line 24
    .line 25
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v7

    .line 29
    check-cast v7, Lcom/android/dx/dex/file/OffsettedItem;

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    if-eqz v6, :cond_0

    .line 34
    .line 35
    move v6, v4

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    const-string v8, "\n"

    .line 38
    .line 39
    invoke-interface {p1, v4, v8}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    :goto_1
    invoke-virtual {v7}, Lcom/android/dx/dex/file/OffsettedItem;->getAlignment()I

    .line 43
    .line 44
    .line 45
    move-result v8

    .line 46
    sub-int/2addr v8, v3

    .line 47
    add-int v9, v5, v8

    .line 48
    .line 49
    not-int v8, v8

    .line 50
    and-int/2addr v8, v9

    .line 51
    if-eq v5, v8, :cond_2

    .line 52
    .line 53
    sub-int v5, v8, v5

    .line 54
    .line 55
    invoke-interface {p1, v5}, Lcom/android/dx/util/Output;->writeZeroes(I)V

    .line 56
    .line 57
    .line 58
    move v5, v8

    .line 59
    :cond_2
    invoke-virtual {v7, v1, p1}, Lcom/android/dx/dex/file/OffsettedItem;->writeTo(Lcom/android/dx/dex/file/DexFile;Lcom/android/dx/util/AnnotatedOutput;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v7}, Lcom/android/dx/dex/file/OffsettedItem;->writeSize()I

    .line 63
    .line 64
    .line 65
    move-result v7

    .line 66
    add-int/2addr v5, v7

    .line 67
    goto :goto_0

    .line 68
    :cond_3
    iget p0, p0, Lcom/android/dx/dex/file/MixedItemSection;->writeSize:I

    .line 69
    .line 70
    if-ne v5, p0, :cond_4

    .line 71
    .line 72
    return-void

    .line 73
    :cond_4
    const-string p0, "output size mismatch"

    .line 74
    .line 75
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    return-void
.end method
