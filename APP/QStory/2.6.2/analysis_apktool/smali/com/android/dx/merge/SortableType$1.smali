.class Lcom/android/dx/merge/SortableType$1;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/merge/SortableType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/android/dx/merge/SortableType;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public compare(Lcom/android/dx/merge/SortableType;Lcom/android/dx/merge/SortableType;)I
    .locals 1

    .line 1
    if-ne p1, p2, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_0
    if-nez p2, :cond_1

    .line 6
    .line 7
    const/4 p0, -0x1

    .line 8
    return p0

    .line 9
    :cond_1
    if-nez p1, :cond_2

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_2
    invoke-static {p1}, Lcom/android/dx/merge/SortableType;->access$000(Lcom/android/dx/merge/SortableType;)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    invoke-static {p2}, Lcom/android/dx/merge/SortableType;->access$000(Lcom/android/dx/merge/SortableType;)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eq p0, v0, :cond_3

    .line 22
    .line 23
    invoke-static {p1}, Lcom/android/dx/merge/SortableType;->access$000(Lcom/android/dx/merge/SortableType;)I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    invoke-static {p2}, Lcom/android/dx/merge/SortableType;->access$000(Lcom/android/dx/merge/SortableType;)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    :goto_0
    sub-int/2addr p0, p1

    .line 32
    return p0

    .line 33
    :cond_3
    invoke-virtual {p1}, Lcom/android/dx/merge/SortableType;->getTypeIndex()I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    invoke-virtual {p2}, Lcom/android/dx/merge/SortableType;->getTypeIndex()I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    goto :goto_0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 42
    check-cast p1, Lcom/android/dx/merge/SortableType;

    check-cast p2, Lcom/android/dx/merge/SortableType;

    invoke-virtual {p0, p1, p2}, Lcom/android/dx/merge/SortableType$1;->compare(Lcom/android/dx/merge/SortableType;Lcom/android/dx/merge/SortableType;)I

    move-result p0

    return p0
.end method
