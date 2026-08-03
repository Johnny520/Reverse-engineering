.class public final Landroidx/recyclerview/widget/ۥ۟۟۟ۡ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/ۥ۟۟۟ۡ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Landroidx/recyclerview/widget/\u06e5\u06df\u06df\u06df\u06e1$\u06e5\u06df\u06df\u06df\u06e1;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Landroidx/recyclerview/widget/ۥ۟۟۟ۡ$ۥ۟۟۟ۡ;

    check-cast p2, Landroidx/recyclerview/widget/ۥ۟۟۟ۡ$ۥ۟۟۟ۡ;

    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/ۥ۟۟۟ۡ$ۥ;->ۥ(Landroidx/recyclerview/widget/ۥ۟۟۟ۡ$ۥ۟۟۟ۡ;Landroidx/recyclerview/widget/ۥ۟۟۟ۡ$ۥ۟۟۟ۡ;)I

    move-result p1

    return p1
.end method

.method public ۥ(Landroidx/recyclerview/widget/ۥ۟۟۟ۡ$ۥ۟۟۟ۡ;Landroidx/recyclerview/widget/ۥ۟۟۟ۡ$ۥ۟۟۟ۡ;)I
    .locals 2

    iget v0, p1, Landroidx/recyclerview/widget/ۥ۟۟۟ۡ$ۥ۟۟۟ۡ;->ۥ:I

    iget v1, p2, Landroidx/recyclerview/widget/ۥ۟۟۟ۡ$ۥ۟۟۟ۡ;->ۥ:I

    sub-int/2addr v0, v1

    if-nez v0, :cond_0

    iget p1, p1, Landroidx/recyclerview/widget/ۥ۟۟۟ۡ$ۥ۟۟۟ۡ;->ۥ۟:I

    iget p2, p2, Landroidx/recyclerview/widget/ۥ۟۟۟ۡ$ۥ۟۟۟ۡ;->ۥ۟:I

    sub-int v0, p1, p2

    :cond_0
    return v0
.end method
