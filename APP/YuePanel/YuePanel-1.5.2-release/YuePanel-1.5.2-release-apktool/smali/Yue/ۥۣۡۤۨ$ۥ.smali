.class public LYue/ۥۣۡۤۨ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x18
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣۡۤۨ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(Landroid/graphics/Bitmap;FF)Landroid/view/PointerIcon;
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-static {p0, p1, p2}, Landroid/view/PointerIcon;->create(Landroid/graphics/Bitmap;FF)Landroid/view/PointerIcon;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟(Landroid/content/Context;I)Landroid/view/PointerIcon;
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-static {p0, p1}, Landroid/view/PointerIcon;->getSystemIcon(Landroid/content/Context;I)Landroid/view/PointerIcon;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟(Landroid/content/res/Resources;I)Landroid/view/PointerIcon;
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-static {p0, p1}, Landroid/view/PointerIcon;->load(Landroid/content/res/Resources;I)Landroid/view/PointerIcon;

    move-result-object p0

    return-object p0
.end method
