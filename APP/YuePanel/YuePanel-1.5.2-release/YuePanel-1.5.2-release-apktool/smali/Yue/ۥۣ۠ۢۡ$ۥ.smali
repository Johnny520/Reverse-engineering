.class public LYue/ۥۣ۠ۢۡ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣ۠ۢۡ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5"
.end annotation


# instance fields
.field public ۥ:I

.field public ۥ۟:I

.field public ۥ۟۟:I

.field public ۥ۟۟۟:I


# direct methods
.method public constructor <init>(IIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LYue/ۥۣ۠ۢۡ$ۥ;->ۥ:I

    iput p2, p0, LYue/ۥۣ۠ۢۡ$ۥ;->ۥ۟:I

    iput p3, p0, LYue/ۥۣ۠ۢۡ$ۥ;->ۥ۟۟:I

    iput p4, p0, LYue/ۥۣ۠ۢۡ$ۥ;->ۥ۟۟۟:I

    return-void
.end method


# virtual methods
.method public ۥ(Ljava/lang/String;)Z
    .locals 2

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    iget v0, p0, LYue/ۥۣ۠ۢۡ$ۥ;->ۥ:I

    if-gt v0, p1, :cond_0

    iget v0, p0, LYue/ۥۣ۠ۢۡ$ۥ;->ۥ۟:I

    if-le p1, v0, :cond_1

    :cond_0
    iget v0, p0, LYue/ۥۣ۠ۢۡ$ۥ;->ۥ۟۟:I

    if-eq p1, v0, :cond_1

    iget v0, p0, LYue/ۥۣ۠ۢۡ$ۥ;->ۥ۟۟۟:I

    if-ne p1, v0, :cond_2

    :cond_1
    const/4 v1, 0x1

    :cond_2
    return v1
.end method
