.class public Landroidx/recyclerview/widget/ۥ۟۟۟۠$ۥۣ۟۟۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/ۥ۟۟۟۠;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df\u06e3"
.end annotation


# instance fields
.field public ۥ:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;

.field public ۥ۟:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;

.field public ۥ۟۟:I

.field public ۥ۟۟۟:I

.field public ۥ۟۟۟۟:I

.field public ۥ۟۟۟۠:I


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۠$ۥۣ۟۟۟;->ۥ:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;

    .line 3
    iput-object p2, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۠$ۥۣ۟۟۟;->ۥ۟:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;

    return-void
.end method

.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;IIII)V
    .locals 0

    .line 4
    invoke-direct {p0, p1, p2}, Landroidx/recyclerview/widget/ۥ۟۟۟۠$ۥۣ۟۟۟;-><init>(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)V

    .line 5
    iput p3, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۠$ۥۣ۟۟۟;->ۥ۟۟:I

    .line 6
    iput p4, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۠$ۥۣ۟۟۟;->ۥ۟۟۟:I

    .line 7
    iput p5, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۠$ۥۣ۟۟۟;->ۥ۟۟۟۟:I

    .line 8
    iput p6, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۠$ۥۣ۟۟۟;->ۥ۟۟۟۠:I

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ChangeInfo{oldHolder="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۠$ۥۣ۟۟۟;->ۥ:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", newHolder="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۠$ۥۣ۟۟۟;->ۥ۟:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", fromX="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۠$ۥۣ۟۟۟;->ۥ۟۟:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", fromY="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۠$ۥۣ۟۟۟;->ۥ۟۟۟:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", toX="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۠$ۥۣ۟۟۟;->ۥ۟۟۟۟:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", toY="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/recyclerview/widget/ۥ۟۟۟۠$ۥۣ۟۟۟;->ۥ۟۟۟۠:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
