.class public final Lcom/lu/wxmask/bean/QuickTemporaryBean;
.super Lcom/lu/wxmask/bean/BaseTemporary;
.source "SourceFile"


# annotations
.annotation build Lc/a;
.end annotation


# instance fields
.field private clickCount:I

.field private duration:I


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    const/4 v0, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v2, v2, v0, v1}, Lcom/lu/wxmask/bean/QuickTemporaryBean;-><init>(IIILN0/e;)V

    return-void
.end method

.method public constructor <init>(II)V
    .locals 1

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, v0}, Lcom/lu/wxmask/bean/BaseTemporary;-><init>(I)V

    .line 4
    iput p1, p0, Lcom/lu/wxmask/bean/QuickTemporaryBean;->duration:I

    iput p2, p0, Lcom/lu/wxmask/bean/QuickTemporaryBean;->clickCount:I

    return-void
.end method

.method public synthetic constructor <init>(IIILN0/e;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/16 p1, 0x5dc

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const/4 p2, 0x3

    .line 2
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/lu/wxmask/bean/QuickTemporaryBean;-><init>(II)V

    return-void
.end method

.method public constructor <init>(LT/r;)V
    .locals 3

    const-string v0, "json"

    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    const-string v0, "duration"

    const/16 v1, 0x5dc

    invoke-static {p1, v0, v1}, Lb1/h;->I(LT/r;Ljava/lang/String;I)I

    move-result v0

    const-string v1, "clickCount"

    const/4 v2, 0x3

    invoke-static {p1, v1, v2}, Lb1/h;->I(LT/r;Ljava/lang/String;I)I

    move-result p1

    .line 6
    invoke-direct {p0, v0, p1}, Lcom/lu/wxmask/bean/QuickTemporaryBean;-><init>(II)V

    return-void
.end method


# virtual methods
.method public final getClickCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/lu/wxmask/bean/QuickTemporaryBean;->clickCount:I

    .line 2
    .line 3
    return v0
.end method

.method public final getDuration()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/lu/wxmask/bean/QuickTemporaryBean;->duration:I

    .line 2
    .line 3
    return v0
.end method

.method public final setClickCount(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/lu/wxmask/bean/QuickTemporaryBean;->clickCount:I

    .line 2
    .line 3
    return-void
.end method

.method public final setDuration(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/lu/wxmask/bean/QuickTemporaryBean;->duration:I

    .line 2
    .line 3
    return-void
.end method
