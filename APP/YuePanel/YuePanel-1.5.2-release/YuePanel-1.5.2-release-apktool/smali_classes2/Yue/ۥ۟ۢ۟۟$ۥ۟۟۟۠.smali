.class public final LYue/ۥ۟ۢ۟۟$ۥ۟۟۟۠;
.super LYue/ۥ۟۟ۡۢ;
.source "SourceFile"

# interfaces
.implements Ljava/util/RandomAccess;


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\n_ArraysJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$6\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,3042:1\n12534#2,2:3043\n1699#2,6:3045\n1807#2,6:3051\n*S KotlinDebug\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$6\n*L\n213#1:3043,2\n215#1:3045,6\n216#1:3051,6\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۟ۢ۟۟;->ۥ۟۟۠۟([D)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06df\u06df\u06e1\u06e2<",
        "Ljava/lang/Double;",
        ">;",
        "Ljava/util/RandomAccess;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\n_ArraysJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$6\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,3042:1\n12534#2,2:3043\n1699#2,6:3045\n1807#2,6:3051\n*S KotlinDebug\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$6\n*L\n213#1:3043,2\n215#1:3045,6\n216#1:3051,6\n*E\n"
.end annotation


# instance fields
.field public final synthetic ۥ۟۟۠ۤ:[D


# direct methods
.method public constructor <init>([D)V
    .locals 0

    iput-object p1, p0, LYue/ۥ۟ۢ۟۟$ۥ۟۟۟۠;->ۥ۟۟۠ۤ:[D

    invoke-direct {p0}, LYue/ۥ۟۟ۡۢ;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge contains(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Ljava/lang/Double;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LYue/ۥ۟ۢ۟۟$ۥ۟۟۟۠;->ۥ۟(D)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥ۟ۢ۟۟$ۥ۟۟۟۠;->ۥ۟۟(I)Ljava/lang/Double;

    move-result-object p1

    return-object p1
.end method

.method public final bridge indexOf(Ljava/lang/Object;)I
    .locals 2

    instance-of v0, p1, Ljava/lang/Double;

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LYue/ۥ۟ۢ۟۟$ۥ۟۟۟۠;->ۥ۟۟۟(D)I

    move-result p1

    return p1
.end method

.method public isEmpty()Z
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۢ۟۟$ۥ۟۟۟۠;->ۥ۟۟۠ۤ:[D

    array-length v0, v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final bridge lastIndexOf(Ljava/lang/Object;)I
    .locals 2

    instance-of v0, p1, Ljava/lang/Double;

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LYue/ۥ۟ۢ۟۟$ۥ۟۟۟۠;->ۥ۟۟۟۟(D)I

    move-result p1

    return p1
.end method

.method public ۥ()I
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۢ۟۟$ۥ۟۟۟۠;->ۥ۟۟۠ۤ:[D

    array-length v0, v0

    return v0
.end method

.method public ۥ۟(D)Z
    .locals 8

    iget-object v0, p0, LYue/ۥ۟ۢ۟۟$ۥ۟۟۟۠;->ۥ۟۟۠ۤ:[D

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    aget-wide v4, v0, v3

    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v4

    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v6

    cmp-long v4, v4, v6

    if-nez v4, :cond_0

    const/4 v2, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return v2
.end method

.method public ۥ۟۟(I)Ljava/lang/Double;
    .locals 3
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۢ۟۟$ۥ۟۟۟۠;->ۥ۟۟۠ۤ:[D

    aget-wide v1, v0, p1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟(D)I
    .locals 7

    iget-object v0, p0, LYue/ۥ۟ۢ۟۟$ۥ۟۟۟۠;->ۥ۟۟۠ۤ:[D

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-wide v3, v0, v2

    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v3

    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v5

    cmp-long v3, v3, v5

    if-nez v3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, -0x1

    :goto_1
    return v2
.end method

.method public ۥ۟۟۟۟(D)I
    .locals 8

    iget-object v0, p0, LYue/ۥ۟ۢ۟۟$ۥ۟۟۟۠;->ۥ۟۟۠ۤ:[D

    array-length v1, v0

    const/4 v2, -0x1

    add-int/2addr v1, v2

    if-ltz v1, :cond_2

    :goto_0
    add-int/lit8 v3, v1, -0x1

    aget-wide v4, v0, v1

    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v4

    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v6

    cmp-long v4, v4, v6

    if-nez v4, :cond_0

    move v2, v1

    goto :goto_1

    :cond_0
    if-gez v3, :cond_1

    goto :goto_1

    :cond_1
    move v1, v3

    goto :goto_0

    :cond_2
    :goto_1
    return v2
.end method
