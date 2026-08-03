.class public final La/S3$a;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/S3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Landroid/widget/BaseAdapter;

.field public final b:Ljava/lang/String;

.field public final c:Landroid/content/Context;

.field public final d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/widget/BaseAdapter;Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    const-string v0, "wxid"

    invoke-static {p2, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    iput-object p1, p0, La/S3$a;->a:Landroid/widget/BaseAdapter;

    iput-object p2, p0, La/S3$a;->b:Ljava/lang/String;

    iput-object p3, p0, La/S3$a;->c:Landroid/content/Context;

    iput-object p4, p0, La/S3$a;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final areAllItemsEnabled()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final getCount()I
    .locals 1

    iget-object v0, p0, La/S3$a;->a:Landroid/widget/BaseAdapter;

    invoke-interface {v0}, Landroid/widget/Adapter;->getCount()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, La/S3$a;->a:Landroid/widget/BaseAdapter;

    invoke-interface {v0}, Landroid/widget/Adapter;->getCount()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-interface {v0, p1}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    return-object p0
.end method

.method public final getItemId(I)J
    .locals 2

    iget-object v0, p0, La/S3$a;->a:Landroid/widget/BaseAdapter;

    invoke-interface {v0}, Landroid/widget/Adapter;->getCount()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-interface {v0, p1}, Landroid/widget/Adapter;->getItemId(I)J

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2

    iget-object v0, p0, La/S3$a;->a:Landroid/widget/BaseAdapter;

    invoke-interface {v0}, Landroid/widget/Adapter;->getCount()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-interface {v0, p1, p2, p3}, Landroid/widget/Adapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    const-string p2, "getView(...)"

    invoke-static {p1, p2}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_0
    iget-object p1, p0, La/S3$a;->c:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    invoke-virtual {p3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p3

    iget p3, p3, Landroid/util/DisplayMetrics;->density:F

    instance-of v0, p2, Landroid/widget/TextView;

    if-eqz v0, :cond_1

    check-cast p2, Landroid/widget/TextView;

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_0
    if-nez p2, :cond_2

    new-instance p2, Landroid/widget/TextView;

    invoke-direct {p2, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    :cond_2
    iget-object p1, p0, La/S3$a;->d:Ljava/lang/String;

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/16 p1, 0x10

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setGravity(I)V

    const/16 v0, 0x18

    int-to-float v0, v0

    mul-float/2addr v0, p3

    invoke-static {v0}, La/n9;->w(F)I

    move-result v1

    int-to-float p1, p1

    mul-float/2addr p1, p3

    invoke-static {p1}, La/n9;->w(F)I

    move-result p3

    invoke-static {v0}, La/n9;->w(F)I

    move-result v0

    invoke-static {p1}, La/n9;->w(F)I

    move-result p1

    invoke-virtual {p2, v1, p3, v0, p1}, Landroid/widget/TextView;->setPadding(IIII)V

    const/high16 p1, 0x41880000    # 17.0f

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setTextSize(F)V

    const p1, -0xeeeeef

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setTextColor(I)V

    return-object p2
.end method

.method public final isEnabled(I)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
